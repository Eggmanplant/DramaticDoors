package com.fizzware.dramaticdoors.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import com.fizzware.dramaticdoors.blocks.TallDoorBlock;

import net.minecraft.block.BlockState;
import net.minecraft.entity.ai.goal.DoorInteractGoal;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.util.math.BlockPos;

@Mixin(DoorInteractGoal.class)
public class DoorInteractGoalMixin
{
	@Shadow
	protected boolean doorValid;
	@Shadow
	protected MobEntity mob;
	@Shadow
    protected BlockPos doorPos = BlockPos.ORIGIN;

	@Inject(method = "isDoorOpen()Z", at = @At("HEAD"))
	private void injectIsDoorOpen(CallbackInfoReturnable<Boolean> cir) {
        BlockState blockStateDD = this.mob.world.getBlockState(this.doorPos);
        if (this.doorValid && blockStateDD.getBlock() instanceof TallDoorBlock) {
            cir.setReturnValue(blockStateDD.get(TallDoorBlock.OPEN));
        }
	}
	
	@Inject(method = "setDoorOpen(Z)V", at = @At("TAIL"))
	private void injectSetDoorOpen(boolean open, CallbackInfo ci) {
		BlockState tallDoorBlockState;
        if (this.doorValid && (tallDoorBlockState = this.mob.world.getBlockState(this.doorPos)).getBlock() instanceof TallDoorBlock) {
            ((TallDoorBlock)tallDoorBlockState.getBlock()).setOpen(this.mob, this.mob.world, tallDoorBlockState, this.doorPos, open);
        }
	}

	@Inject(method = "canStart()Z", at = @At(value = "INVOKE", target = "Lnet/minecraft/block/DoorBlock;isWoodenDoor(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Z", shift = At.Shift.AFTER), cancellable = true)
	private void injectCanStart(CallbackInfoReturnable<Boolean> ci) {
		this.doorValid = TallDoorBlock.isWoodenDoor(this.mob.world, this.doorPos);
		if (this.doorValid) {
			ci.setReturnValue(true);
		}
	}

}
