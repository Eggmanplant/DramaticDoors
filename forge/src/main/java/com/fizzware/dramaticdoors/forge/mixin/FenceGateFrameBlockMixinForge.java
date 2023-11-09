package com.fizzware.dramaticdoors.forge.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import mod.pianomanu.blockcarpentry.block.FenceGateFrameBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraftforge.fml.loading.LoadingModList;

@Mixin(FenceGateFrameBlock.class)
public class FenceGateFrameBlockMixinForge
{
	@Inject(method = "createBlockStateDefinition(Lnet/minecraft/world/level/block/state/StateDefinition$Builder;)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/FenceGateBlock;createBlockStateDefinition(Lnet/minecraft/world/level/block/state/StateDefinition$Builder;)V", shift = Shift.AFTER), cancellable = true)
	protected void interceptBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder, CallbackInfo callback) {
		if (LoadingModList.get().getModFileById("statement") == null) {
			builder.add(FenceGateFrameBlock.CONTAINS_BLOCK, FenceGateFrameBlock.LIGHT_LEVEL);
			callback.cancel();
		}
	}
}
