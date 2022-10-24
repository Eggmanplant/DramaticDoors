package com.fizzware.dramaticdoors.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.entity.LivingEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

@Mixin(DoorBlock.class)
public class DoorBlockMixin implements IWaterLoggable
{
	private static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	@Inject(at = @At("TAIL"), method = "<init>(Lnet/minecraft/block/AbstractBlock$Properties;)V")
	private void enhanceConstructor(AbstractBlock.Properties properties, CallbackInfo callback) {
		((DoorBlock)(Object)this).registerDefaultState(((DoorBlock)(Object)this).defaultBlockState().setValue(WATERLOGGED, false));
	}

	@Inject(at = @At("TAIL"), method = "createBlockStateDefinition(Lnet/minecraft/state/StateContainer$Builder;)V")
	protected void injectBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder, CallbackInfo callback) {
		builder.add(WATERLOGGED);
	}

	@Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/item/BlockItemUseContext;)Lnet/minecraft/block/BlockState;", cancellable = true)
	private void injectPlacementState(BlockItemUseContext context, CallbackInfoReturnable<BlockState> callback) {
		BlockPos blockpos = context.getClickedPos();
		World level = context.getLevel();
		if (blockpos.getY() < level.getMaxBuildHeight() - 1 && level.getBlockState(blockpos.above()).canBeReplaced(context)) {
			boolean flag = level.hasNeighborSignal(blockpos) || level.hasNeighborSignal(blockpos.above());
			boolean waterfilled = level.getFluidState(blockpos).getType() == Fluids.WATER;
			callback.setReturnValue(((DoorBlock)(Object)this).defaultBlockState().setValue(DoorBlock.FACING, context.getHorizontalDirection()).setValue(DoorBlock.HINGE, ((DoorBlock)(Object)this).getHinge(context)).setValue(DoorBlock.POWERED, Boolean.valueOf(flag)).setValue(DoorBlock.OPEN, Boolean.valueOf(flag)).setValue(DoorBlock.HALF, DoubleBlockHalf.LOWER).setValue(WATERLOGGED, waterfilled));
		} else {
			callback.setReturnValue(null);
		}
		callback.cancel();
	}

	@Inject(at = @At("RETURN"), method = "updateShape(Lnet/minecraft/block/BlockState;Lnet/minecraft/util/Direction;Lnet/minecraft/block/BlockState;Lnet/minecraft/world/IWorld;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/BlockState;")
	private void injectUpdateShape(BlockState stateIn, Direction direction, BlockState facingState, IWorld accessor, BlockPos pos1, BlockPos pos2, CallbackInfoReturnable<BlockState> callback) {
		stateIn = stateIn.setValue(WATERLOGGED, accessor.getFluidState(pos1).getType() == Fluids.WATER);
	}

	@Inject(at = @At("HEAD"), method = "setPlacedBy(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/BlockState;Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/item/ItemStack;)V", cancellable = true)
	private void injectPlacedBy(World level, BlockPos pos, BlockState state, LivingEntity entity, ItemStack stack, CallbackInfo callback) {
		boolean waterfilled = level.getFluidState(pos.above()).getType() == Fluids.WATER;
		level.setBlock(pos.above(), state.setValue(DoorBlock.HALF, DoubleBlockHalf.UPPER).setValue(WATERLOGGED, waterfilled), 3);
		callback.cancel();
	}
		
	public FluidState func_204507_t(BlockState state) {
		return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : Fluids.EMPTY.defaultFluidState();
	}
}
