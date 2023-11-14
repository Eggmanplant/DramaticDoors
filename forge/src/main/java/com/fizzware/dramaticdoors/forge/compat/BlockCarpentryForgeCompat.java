package com.fizzware.dramaticdoors.forge.compat;

import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.compat.registries.BlockCarpentryCompat;
import com.fizzware.dramaticdoors.forge.addons.blockcarpentry.ShortForgeFrameDoorBlock;
import com.fizzware.dramaticdoors.forge.addons.blockcarpentry.TallForgeFrameDoorBlock;

import mod.pianomanu.blockcarpentry.tileentity.LockableFrameTile;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.RegisterEvent.RegisterHelper;

public class BlockCarpentryForgeCompat
{
	public static BlockEntityType<?> SHORT_FRAME_DOOR_BLOCKENTITY;
	public static BlockEntityType<?> TALL_FRAME_DOOR_BLOCKENTITY;
	public static BlockEntityType<?> SHORT_ILLUSION_DOOR_BLOCKENTITY;
	public static BlockEntityType<?> TALL_ILLUSION_DOOR_BLOCKENTITY;
	
	@SuppressWarnings("deprecation")
	public static void registerCompat() {
		if (!BlockCarpentryCompat.initialized) {
			BlockCarpentryCompat.SHORT_FRAME_DOOR = new ShortForgeFrameDoorBlock(Block.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(Blocks.OAK_PLANKS.defaultDestroyTime(), Blocks.OAK_PLANKS.getExplosionResistance()).friction(Blocks.OAK_PLANKS.getFriction()).noOcclusion());
			BlockCarpentryCompat.SHORT_ILLUSION_DOOR = new ShortForgeFrameDoorBlock(Block.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(Blocks.OAK_PLANKS.defaultDestroyTime(), Blocks.OAK_PLANKS.getExplosionResistance()).friction(Blocks.OAK_PLANKS.getFriction()).noOcclusion());
			BlockCarpentryCompat.TALL_FRAME_DOOR = new TallForgeFrameDoorBlock(Block.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(Blocks.OAK_PLANKS.defaultDestroyTime(), Blocks.OAK_PLANKS.getExplosionResistance()).friction(Blocks.OAK_PLANKS.getFriction()).noOcclusion());
			BlockCarpentryCompat.TALL_ILLUSION_DOOR = new TallForgeFrameDoorBlock(Block.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(Blocks.OAK_PLANKS.defaultDestroyTime(), Blocks.OAK_PLANKS.getExplosionResistance()).friction(Blocks.OAK_PLANKS.getFriction()).noOcclusion());
		}
		BlockCarpentryCompat.registerCompat();
	}

	public static void registerBlockEntities(RegisterHelper<BlockEntityType<?>> helper) {
		SHORT_FRAME_DOOR_BLOCKENTITY = BlockEntityType.Builder.of(LockableFrameTile::new, BlockCarpentryCompat.SHORT_FRAME_DOOR).build(null);
		TALL_FRAME_DOOR_BLOCKENTITY = BlockEntityType.Builder.of(LockableFrameTile::new, BlockCarpentryCompat.TALL_FRAME_DOOR).build(null);
		SHORT_ILLUSION_DOOR_BLOCKENTITY = BlockEntityType.Builder.of(LockableFrameTile::new, BlockCarpentryCompat.SHORT_ILLUSION_DOOR).build(null);
		TALL_ILLUSION_DOOR_BLOCKENTITY = BlockEntityType.Builder.of(LockableFrameTile::new, BlockCarpentryCompat.TALL_ILLUSION_DOOR).build(null);
		helper.register(new ResourceLocation(DramaticDoors.MOD_ID, "short_frame_door"), SHORT_FRAME_DOOR_BLOCKENTITY);
		helper.register(new ResourceLocation(DramaticDoors.MOD_ID, "tall_frame_door"), TALL_FRAME_DOOR_BLOCKENTITY);
		helper.register(new ResourceLocation(DramaticDoors.MOD_ID, "short_illusion_door"), SHORT_ILLUSION_DOOR_BLOCKENTITY);
		helper.register(new ResourceLocation(DramaticDoors.MOD_ID, "tall_illusion_door"), TALL_ILLUSION_DOOR_BLOCKENTITY);
	}
}
