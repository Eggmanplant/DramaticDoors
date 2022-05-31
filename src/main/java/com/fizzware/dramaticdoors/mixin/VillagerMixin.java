package com.fizzware.dramaticdoors.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.fizzware.dramaticdoors.entity.ai.goal.OpenTallDoorGoal;

import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.VillagerEntity;

@Mixin(VillagerEntity.class)
public class VillagerMixin
{	
	@Inject(at = @At("TAIL"), method = "<init>(Lnet/minecraft/entity/EntityType;Lnet/minecraft/world/World;Lnet/minecraft/village/VillagerType;)V")
	private void addTallDoorGoal(CallbackInfo ci) {
		((MobEntity)(Object)this).goalSelector.add(1, new OpenTallDoorGoal((MobEntity)(Object)this, true));
	}
}
