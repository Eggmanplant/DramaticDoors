package com.fizzware.dramaticdoors.mixin;

import net.minecraft.entity.ai.goal.LongDoorInteractGoal;
import net.minecraft.entity.ai.pathing.MobNavigation;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.WitchEntity;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.fizzware.dramaticdoors.entity.ai.goal.OpenTallDoorGoal;

@Mixin(WitchEntity.class)
public class WitchMixin 
{	
	@Inject(at = @At("TAIL"), method = "initGoals()V")
	private void addDoorGoals(CallbackInfo info) {
		((MobNavigation)((MobEntity)(Object)this).navigation).setCanPathThroughDoors(true);
		((MobEntity)(Object)this).goalSelector.add(1, new LongDoorInteractGoal((MobEntity)(Object)this, true));
		((MobEntity)(Object)this).goalSelector.add(1, new OpenTallDoorGoal((MobEntity)(Object)this, true));
	}
}
