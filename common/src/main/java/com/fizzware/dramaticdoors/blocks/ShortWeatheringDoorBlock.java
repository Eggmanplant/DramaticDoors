package com.fizzware.dramaticdoors.blocks;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.compat.Compats;
import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ChangeOverTimeBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;

public class ShortWeatheringDoorBlock extends ShortDoorBlock implements WeatheringCopper
{
	// Set up database of oxidizable and waxable doors.
    public static final ResourceLocation COPPER_DOOR_RES = new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_COPPER);
    public static final ResourceLocation EXPOSED_COPPER_DOOR_RES = new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_EXPOSED_COPPER);
    public static final ResourceLocation WEATHERED_COPPER_DOOR_RES = new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_WEATHERED_COPPER);
    public static final ResourceLocation OXIDIZED_COPPER_DOOR_RES = new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_OXIDIZED_COPPER);
    public static final ResourceLocation WAXED_COPPER_DOOR_RES = new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_WAXED_COPPER);
    public static final ResourceLocation WAXED_EXPOSED_COPPER_DOOR_RES = new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_WAXED_EXPOSED_COPPER);
    public static final ResourceLocation WAXED_WEATHERED_COPPER_DOOR_RES = new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_WAXED_WEATHERED_COPPER);
    public static final ResourceLocation WAXED_OXIDIZED_COPPER_DOOR_RES = new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_WAXED_OXIDIZED_COPPER);
    
    public static final ResourceLocation IRON_DOOR_RES = new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_IRON);
    public static final ResourceLocation EXPOSED_IRON_DOOR_RES = new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EXPOSED_IRON);
    public static final ResourceLocation WEATHERED_IRON_DOOR_RES = new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WEATHERED_IRON);
    public static final ResourceLocation RUSTED_IRON_DOOR_RES = new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUSTED_IRON);
    public static final ResourceLocation WAXED_IRON_DOOR_RES = new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WAXED_IRON);
    public static final ResourceLocation WAXED_EXPOSED_IRON_DOOR_RES = new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WAXED_EXPOSED_IRON);
    public static final ResourceLocation WAXED_WEATHERED_IRON_DOOR_RES = new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WAXED_WEATHERED_IRON);
    public static final ResourceLocation WAXED_RUSTED_IRON_DOOR_RES = new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WAXED_RUSTED_IRON);
    
    private static final List<ResourceLocation> WAXED_BLOCKS = Arrays.asList(WAXED_COPPER_DOOR_RES, WAXED_EXPOSED_COPPER_DOOR_RES, WAXED_WEATHERED_COPPER_DOOR_RES, WAXED_OXIDIZED_COPPER_DOOR_RES, WAXED_IRON_DOOR_RES, WAXED_EXPOSED_IRON_DOOR_RES, WAXED_WEATHERED_IRON_DOOR_RES, WAXED_RUSTED_IRON_DOOR_RES);
    private static final List<ResourceLocation> DEOXIDIZABLE_BLOCKS = Arrays.asList(EXPOSED_COPPER_DOOR_RES, WEATHERED_COPPER_DOOR_RES, OXIDIZED_COPPER_DOOR_RES, EXPOSED_IRON_DOOR_RES, WEATHERED_IRON_DOOR_RES, RUSTED_IRON_DOOR_RES);

	private static Supplier<BiMap<Block, Block>> NEXT_BY_BLOCK = Suppliers.memoize(() -> { return buildList().build(); });
	private static Supplier<BiMap<Block, Block>> PREVIOUS_BY_BLOCK = Suppliers.memoize(() -> { return NEXT_BY_BLOCK.get().inverse(); });
	
	private static ImmutableBiMap.Builder<Block, Block> buildList() {
		ImmutableBiMap.Builder<Block, Block> builder = ImmutableBiMap.<Block, Block>builder();
		if (Compats.modChecker.isModLoaded("everythingcopper")) {
			builder.put(BuiltInRegistries.BLOCK.get(COPPER_DOOR_RES), BuiltInRegistries.BLOCK.get(EXPOSED_COPPER_DOOR_RES));
			builder.put(BuiltInRegistries.BLOCK.get(EXPOSED_COPPER_DOOR_RES), BuiltInRegistries.BLOCK.get(WEATHERED_COPPER_DOOR_RES));
			builder.put(BuiltInRegistries.BLOCK.get(WEATHERED_COPPER_DOOR_RES), BuiltInRegistries.BLOCK.get(OXIDIZED_COPPER_DOOR_RES));
		}
		if (Compats.modChecker.isModLoaded("immersive_weathering")) {
			builder.put(BuiltInRegistries.BLOCK.get(IRON_DOOR_RES), BuiltInRegistries.BLOCK.get(EXPOSED_IRON_DOOR_RES));
			builder.put(BuiltInRegistries.BLOCK.get(EXPOSED_IRON_DOOR_RES), BuiltInRegistries.BLOCK.get(WEATHERED_IRON_DOOR_RES));
			builder.put(BuiltInRegistries.BLOCK.get(WEATHERED_IRON_DOOR_RES), BuiltInRegistries.BLOCK.get(RUSTED_IRON_DOOR_RES));
		}
		return builder;
	}

	private final WeatheringCopper.WeatherState weatherState;
	
	// Onto the main course.
	public ShortWeatheringDoorBlock(Block from, BlockSetType blockset, WeatherState state) {
		super(from, blockset);
		this.weatherState = state;
	}

	@Override
	public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult hit) {
		ItemStack itemstack = player.getItemInHand(handIn);
		Block block = state.getBlock();
		// Wax on
		if (itemstack != null && itemstack.getItem() == Items.HONEYCOMB) {
			if (WAXED_BLOCKS.contains(BuiltInRegistries.BLOCK.getKey(block))) {
				return InteractionResult.PASS;
			}
			if (player instanceof ServerPlayer) {
				CriteriaTriggers.ITEM_USED_ON_BLOCK.trigger((ServerPlayer) player, pos, itemstack);
			}
			if (player != null && !player.isCreative()) {
				itemstack.shrink(1);
			}
			applyWaxOnDoor(state, level, pos);
			level.levelEvent(player, 3003, pos, 0);
			return InteractionResult.sidedSuccess(level.isClientSide);
		}
		// Wax off
		if (itemstack != null && itemstack.getItem() instanceof AxeItem) {
			if (WAXED_BLOCKS.contains(BuiltInRegistries.BLOCK.getKey(block))) {
				level.playSound(player, pos, SoundEvents.AXE_WAX_OFF, SoundSource.BLOCKS, 1.0F, 1.0F);
				level.levelEvent(player, 3004, pos, 0);
				removeWaxFromDoor(state, level, pos);
			}
			else if (DEOXIDIZABLE_BLOCKS.contains(BuiltInRegistries.BLOCK.getKey(block))) {
				level.playSound(player, pos, SoundEvents.AXE_SCRAPE, SoundSource.BLOCKS, 1.0F, 1.0F);
				level.levelEvent(player, 3005, pos, 0);
				deoxidizeDoor(state, level, pos);
			}
			else {
				return InteractionResult.PASS;
			}
			if (player != null && !player.isCreative()) {
				itemstack.hurtAndBreak(1, player, (entity) -> { entity.broadcastBreakEvent(handIn); });
			}
			return InteractionResult.sidedSuccess(level.isClientSide);
		}
		return InteractionResult.PASS;
	}

	private void applyWaxOnDoor(BlockState state, Level level, BlockPos pos) {
		BlockState newState = state;
		boolean waterfilled0 = level.getFluidState(pos).getType() == Fluids.WATER;
		if (state.getBlock() == BuiltInRegistries.BLOCK.get(COPPER_DOOR_RES)) {
			newState = copyProperties(BuiltInRegistries.BLOCK.get(WAXED_COPPER_DOOR_RES), state);
		} else if (state.getBlock() == BuiltInRegistries.BLOCK.get(EXPOSED_COPPER_DOOR_RES)) {
			newState = copyProperties(BuiltInRegistries.BLOCK.get(WAXED_EXPOSED_COPPER_DOOR_RES), state);
		} else if (state.getBlock() == BuiltInRegistries.BLOCK.get(WEATHERED_COPPER_DOOR_RES)) {
			newState = copyProperties(BuiltInRegistries.BLOCK.get(WAXED_WEATHERED_COPPER_DOOR_RES), state);
		} else if (state.getBlock() == BuiltInRegistries.BLOCK.get(OXIDIZED_COPPER_DOOR_RES)) {
			newState = copyProperties(BuiltInRegistries.BLOCK.get(WAXED_OXIDIZED_COPPER_DOOR_RES), state);
		}
		level.removeBlock(pos, false);
		level.setBlock(pos, newState.setValue(WATERLOGGED, waterfilled0), 35);
	}

	private void removeWaxFromDoor(BlockState state, Level level, BlockPos pos) {
		BlockState newState = state;
		boolean waterfilled0 = level.getFluidState(pos).getType() == Fluids.WATER;
		if (state.getBlock() == BuiltInRegistries.BLOCK.get(WAXED_COPPER_DOOR_RES)) {
			newState = copyProperties(BuiltInRegistries.BLOCK.get(COPPER_DOOR_RES), state);
		} else if (state.getBlock() == BuiltInRegistries.BLOCK.get(WAXED_EXPOSED_COPPER_DOOR_RES)) {
			newState = copyProperties(BuiltInRegistries.BLOCK.get(EXPOSED_COPPER_DOOR_RES), state);
		} else if (state.getBlock() == BuiltInRegistries.BLOCK.get(WAXED_WEATHERED_COPPER_DOOR_RES)) {
			newState = copyProperties(BuiltInRegistries.BLOCK.get(WEATHERED_COPPER_DOOR_RES), state);
		} else if (state.getBlock() == BuiltInRegistries.BLOCK.get(WAXED_OXIDIZED_COPPER_DOOR_RES)) {
			newState = copyProperties(BuiltInRegistries.BLOCK.get(OXIDIZED_COPPER_DOOR_RES), state);
		}
		level.removeBlock(pos, false);
		level.removeBlock(pos.above(1), false);
		level.removeBlock(pos.above(2), false);
		level.setBlock(pos, newState.setValue(WATERLOGGED, waterfilled0), 35);
	}
	
	private void deoxidizeDoor(BlockState state, Level level, BlockPos pos) {
		boolean waterfilled0 = level.getFluidState(pos).getType() == Fluids.WATER;
		getPrevious(state).ifPresent((newState) ->  {
            level.setBlock(pos, Blocks.AIR.defaultBlockState(), Block.UPDATE_ALL);
            level.setBlock(pos, newState.setValue(WATERLOGGED, waterfilled0), Block.UPDATE_CLIENTS);
		});
	}

	private BlockState copyProperties(Block newBlock, BlockState state) {
		BlockState newBlockState = newBlock.defaultBlockState().setValue(FACING, state.getValue(FACING)).setValue(HINGE, state.getValue(HINGE)).setValue(POWERED, state.getValue(POWERED))
				.setValue(OPEN, state.getValue(OPEN)).setValue(WATERLOGGED, state.getValue(WATERLOGGED));
		return newBlockState;
	}

	static Optional<Block> getPrevious(Block p_154891_) {
		return Optional.ofNullable(PREVIOUS_BY_BLOCK.get().get(p_154891_));
	}

	public static Optional<BlockState> getPrevious(BlockState p_154900_) {
		return getPrevious(p_154900_.getBlock()).map((p_154903_) -> { return p_154903_.withPropertiesOf(p_154900_); });
	}

	public static BlockState getFirst(BlockState p_154907_) {
		return getFirst(p_154907_.getBlock()).withPropertiesOf(p_154907_);
	}

	static Block getFirst(Block p_154898_) {
		Block block = p_154898_;

		for (Block block1 = PREVIOUS_BY_BLOCK.get().get(p_154898_); block1 != null; block1 = PREVIOUS_BY_BLOCK.get().get(block1)) {
			block = block1;
		}

		return block;
	}

	@Override
	public Optional<BlockState> getNext(BlockState state) {
		return getNext(state.getBlock()).map((block) -> {
			return block.withPropertiesOf(state);
		});
	}
	
	public static Optional<Block> getNext(Block state) {
		return Optional.ofNullable(NEXT_BY_BLOCK.get().get(state));
	}

	@Override
	public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
		this.onRandomTick(state, level, pos, random);
		float f = 0.05688889F;
		if (random.nextFloat() < f) {
			this.applyChangeOverTime(state, level, pos, random);
		}
	}

	@Override
	public boolean isRandomlyTicking(BlockState state) {
		return getNext(state.getBlock()).isPresent();
	}
	
	@Override
	public WeatherState getAge() {
		return this.weatherState;
	}

	@Override
	public void applyChangeOverTime(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
		int i = this.getAge().ordinal();
		int j = 0;
		int k = 0;

		for (BlockPos blockpos : BlockPos.withinManhattan(pos, 4, 4, 4)) {
			int l = blockpos.distManhattan(pos);
			if (l > 4) {
				break;
			}

			if (!blockpos.equals(pos)) {
				BlockState blockstate = level.getBlockState(blockpos);
				Block block = blockstate.getBlock();
				if (block instanceof ChangeOverTimeBlock) {
					Enum<?> oenum = ((ChangeOverTimeBlock<?>) block).getAge();
					if (this.getAge().getClass() == oenum.getClass()) {
						int i1 = oenum.ordinal();
						if (i1 < i) {
							return;
						}

						if (i1 > i) {
							++k;
						} else {
							++j;
						}
					}
				}
			}
		}

		float f = (float) (k + 1) / (float) (k + j + 1);
		float f1 = f * f * this.getChanceModifier();
		if (random.nextFloat() < f1) {
            this.getNext(state).ifPresent((newState) -> {
                BlockPos replacedPosition = pos;
				boolean waterfilled0 = level.getFluidState(replacedPosition).getType() == Fluids.WATER;

                level.setBlock(replacedPosition, Blocks.AIR.defaultBlockState(), Block.UPDATE_ALL);
                level.setBlock(replacedPosition, newState.setValue(WATERLOGGED, waterfilled0), Block.UPDATE_CLIENTS);

            });		
        }
	}
}
