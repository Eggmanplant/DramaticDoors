package com.fizzware.dramaticdoors.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.fizzware.dramaticdoors.entity.ai.goal.OpenTallDoorGoal;

import net.minecraft.entity.mob.AbstractPiglinEntity;
import net.minecraft.entity.mob.MobEntity;

@Mixin(AbstractPiglinEntity.class)
public class PiglinMixin
{	
	@Inject(at = @At("TAIL"), method = "setCanPathThroughDoors()V")
	private void addTallDoorGoal(CallbackInfo info) {
		((MobEntity)(Object)this).goalSelector.add(1, new OpenTallDoorGoal((MobEntity)(Object)this, true));
	}
}
