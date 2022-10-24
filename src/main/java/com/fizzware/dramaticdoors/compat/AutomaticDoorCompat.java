package com.fizzware.dramaticdoors.compat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import com.fizzware.dramaticdoors.DDConfig;
import com.fizzware.dramaticdoors.DDTags;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.TickEvent.Phase;
import net.minecraftforge.event.TickEvent.PlayerTickEvent;
import net.minecraftforge.event.TickEvent.WorldTickEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.loading.FMLPaths;

// This class file provides compatibility for Serilum's Automatic Doors. Doesn't directly require Collective.
public class AutomaticDoorCompat
{
	protected static int doorOpenTime = DDConfig.getConfigIntValue(DDConfig.CONFIG, FMLPaths.CONFIGDIR.get().resolve("automaticdoors-common.toml"), "General.doorOpenTime");
	protected static boolean shouldOpenIronDoors = DDConfig.getConfigBooleanValue(DDConfig.CONFIG, FMLPaths.CONFIGDIR.get().resolve("automaticdoors-common.toml"), "General.shouldOpenIronDoors");
	protected static boolean preventOpeningOnSneak = DDConfig.getConfigBooleanValue(DDConfig.CONFIG, FMLPaths.CONFIGDIR.get().resolve("automaticdoors-common.toml"), "General.preventOpeningOnSneak");
	
	public static HashMap<World, List<BlockPos>> toclosedoors = new HashMap<World, List<BlockPos>>();
	public static HashMap<World, List<BlockPos>> newclosedoors = new HashMap<World, List<BlockPos>>();
	private static List<BlockPos> runnables = new ArrayList<BlockPos>();

	@SubscribeEvent
	public void onWorldLoad(WorldEvent.Load e) {
		if (!Compats.AUTOMATIC_DOORS_INSTALLED) {
			return;
		}
		World world = (World)e.getWorld();
		if (world == null || world.isClientSide) {
			return;
		}
		//Reload config.
		doorOpenTime = DDConfig.getConfigIntValue(DDConfig.CONFIG, FMLPaths.CONFIGDIR.get().resolve("automaticdoors-common.toml"), "General.doorOpenTime");
		shouldOpenIronDoors = DDConfig.getConfigBooleanValue(DDConfig.CONFIG, FMLPaths.CONFIGDIR.get().resolve("automaticdoors-common.toml"), "General.shouldOpenIronDoors");
		preventOpeningOnSneak = DDConfig.getConfigBooleanValue(DDConfig.CONFIG, FMLPaths.CONFIGDIR.get().resolve("automaticdoors-common.toml"), "General.preventOpeningOnSneak");
		
		toclosedoors.put(world, new ArrayList<BlockPos>());
		newclosedoors.put(world, new ArrayList<BlockPos>());

	}
	
	@SubscribeEvent
	public void onWorldTick(WorldTickEvent e) {
		if (!Compats.AUTOMATIC_DOORS_INSTALLED) {
			return;
		}
		World world = e.world;
		if (world.isClientSide || e.phase != Phase.START) {
			return;
		}
		if (newclosedoors.size() > 0) {
			toclosedoors.get(world).addAll(newclosedoors.get(world));
			newclosedoors.get(world).clear();
		}

		if (toclosedoors.size() > 0) {
			List<BlockPos> closetoremove = new ArrayList<BlockPos>();

			for (BlockPos bp : toclosedoors.get(world)) {
				if (bp == null) {
					closetoremove.add(bp);
					continue;
				}

				BlockState state = world.getBlockState(bp);
				Block block = state.getBlock();
				if (!(block instanceof TallDoorBlock && isDoorHandOpenable(state))) {
					closetoremove.add(bp);
					continue;
				}

				boolean canclose = true;
				for (PlayerEntity player : world.getEntitiesOfClass(PlayerEntity.class, new AxisAlignedBB(bp.getX() - 2, bp.getY(), bp.getZ() - 2, bp.getX() + 2, bp.getY(), bp.getZ() + 2))) {
					BlockPos ppos = player.blockPosition();

					if (ppos.closerThan(bp, 3)) {
						if (preventOpeningOnSneak && player.isCrouching()) {
							continue;
						}
						canclose = false;
						break;
					}
				}

				if (canclose) {
					for (BlockPos aroundpos : BlockPos.betweenClosed(bp.getX() - 1, bp.getY(), bp.getZ() - 1, bp.getX() + 1, bp.getY(), bp.getZ() + 1)) {
						BlockState aroundstate = world.getBlockState(aroundpos);
						Block aroundblock = aroundstate.getBlock();
						if (aroundblock instanceof TallDoorBlock && isDoorHandOpenable(state)) {
							((TallDoorBlock) block).setOpen(null, world, aroundstate, aroundpos, false); // toggleDoor
						}
					}

					closetoremove.add(bp);
				}
			}

			if (closetoremove.size() > 0) {
				for (BlockPos tr : closetoremove) {
					toclosedoors.get(world).remove(tr);
				}
			}
		}
	}
	
	@SubscribeEvent
	public void onPlayerTick(PlayerTickEvent e) {
		PlayerEntity player = e.player;
		World world = player.getCommandSenderWorld();
		if (world.isClientSide || !e.phase.equals(Phase.START)) {
			return;
		}
		
		if (player.isSpectator()) {
			return;
		}

		if (player.isShiftKeyDown()) {
			if (preventOpeningOnSneak) {
				return;
			}
		}

		BlockPos ppos = player.blockPosition().above().immutable();
		Iterator<BlockPos> it1 = BlockPos.betweenClosedStream(ppos.getX()-1, ppos.getY(), ppos.getZ()-1, ppos.getX()+1, ppos.getY(), ppos.getZ()+1).iterator();
		while (it1.hasNext()) {
			BlockPos np = it1.next();
			BlockState state = world.getBlockState(np);
			Block block = state.getBlock();
			if (block instanceof TallDoorBlock && isDoorHandOpenable(state)) {
				if (toclosedoors.get(world).contains(np) || newclosedoors.get(world).contains(np)) {
					continue;
				}
				
				((TallDoorBlock)block).setOpen(player, world, state, np, true); // toggleDoor
				delayDoorClose(world, np.immutable());
			}
		}
	}
	
	public static void delayDoorClose(World world, BlockPos pos) {
		if (pos == null) {
			return;
		}
		
		if (runnables.contains(pos)) {
			return;
		}
		runnables.add(pos);
		new Thread(() -> {
			try  { Thread.sleep( doorOpenTime ); }
			catch (InterruptedException ignored)  {}

			if (!toclosedoors.get(world).contains(pos) && !newclosedoors.get(world).contains(pos)) {
				newclosedoors.get(world).add(pos);
			}
			runnables.remove(pos);
		}).start();
	}
	
	private static boolean isDoorHandOpenable(BlockState state) {
		if (!(state.getMaterial() == Material.METAL || state.getMaterial() == Material.HEAVY_METAL)) {
			return true;
		}
		if ((state.getMaterial() == Material.METAL || state.getMaterial() == Material.HEAVY_METAL) && state.is(DDTags.HAND_OPENABLE_TALL_METAL_DOORS)) {
			return true;
		}
		return shouldOpenIronDoors;
	}
}
