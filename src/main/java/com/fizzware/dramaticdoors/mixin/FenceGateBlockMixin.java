package com.fizzware.dramaticdoors.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.registries.ForgeRegistries;

@Mixin(FenceGateBlock.class)
public class FenceGateBlockMixin
{
	private static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	@Inject(at = @At("TAIL"), method = "<init>(Lnet/minecraft/block/AbstractBlock$Properties;)V")
	private void enhanceConstructor(AbstractBlock.Properties properties, CallbackInfo callback) {
		((FenceGateBlock)(Object)this).registerDefaultState(((FenceGateBlock) (Object) this).defaultBlockState().setValue(WATERLOGGED, false));
	}

	@Inject(at = @At("TAIL"), method = "createBlockStateDefinition(Lnet/minecraft/state/StateContainer$Builder;)V", cancellable = true)
	protected void injectBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder, CallbackInfo callback) {
		if (((FenceGateBlock)(Object)this) != ForgeRegistries.BLOCKS.getValue(new ResourceLocation("supplementaries", "iron_gate")) && ((FenceGateBlock)(Object)this) != ForgeRegistries.BLOCKS.getValue(new ResourceLocation("supplementaries", "gold_gate"))) {
			builder.add(WATERLOGGED);
		}
	}

	@Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/item/BlockItemUseContext;)Lnet/minecraft/block/BlockState;", cancellable = true)
	private void injectPlacementState(BlockItemUseContext context, CallbackInfoReturnable<BlockState> callback) {
		BlockPos blockpos = context.getClickedPos();
		World level = context.getLevel();
		boolean flag = level.hasNeighborSignal(blockpos);
		boolean waterfilled = level.getFluidState(blockpos).getType() == Fluids.WATER;
		Direction direction = context.getHorizontalDirection();
		Direction.Axis direction$axis = direction.getAxis();
		boolean flag1 = direction$axis == Direction.Axis.Z && (((FenceGateBlock)(Object)this).isWall(level.getBlockState(blockpos.west())) || ((FenceGateBlock)(Object)this).isWall(level.getBlockState(blockpos.east()))) || direction$axis == Direction.Axis.X && (((FenceGateBlock)(Object)this).isWall(level.getBlockState(blockpos.north())) || ((FenceGateBlock)(Object)this).isWall(level.getBlockState(blockpos.south())));
		callback.setReturnValue(((FenceGateBlock)(Object)this).defaultBlockState().setValue(FenceGateBlock.FACING, direction).setValue(FenceGateBlock.OPEN, Boolean.valueOf(flag)).setValue(FenceGateBlock.POWERED, Boolean.valueOf(flag)).setValue(FenceGateBlock.IN_WALL, Boolean.valueOf(flag1)).setValue(WATERLOGGED, waterfilled));
		callback.cancel();
	}

	public FluidState func_204507_t(BlockState state) {
		return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : Fluids.EMPTY.defaultFluidState();
	}
}
