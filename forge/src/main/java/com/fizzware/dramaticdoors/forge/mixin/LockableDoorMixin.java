package com.fizzware.dramaticdoors.forge.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.rk.thingamajigs.xtrablock.LockableDoor;

@Mixin(LockableDoor.class)
public class LockableDoorMixin
{
	private static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
	
	@Inject(at = @At("TAIL"), method = "<init>(Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;)V")
	private void enhanceConstructor(BlockBehaviour.Properties properties, CallbackInfo callback) {
		((LockableDoor)(Object)this).registerDefaultState(((LockableDoor)(Object)this).defaultBlockState().setValue(WATERLOGGED, false));
	}
	
	@Inject(at = @At("TAIL"), method = "createBlockStateDefinition(Lnet/minecraft/world/level/block/state/StateDefinition$Builder;)V")
	protected void injectBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder, CallbackInfo callback) {
		builder.add(WATERLOGGED);
	}
}
