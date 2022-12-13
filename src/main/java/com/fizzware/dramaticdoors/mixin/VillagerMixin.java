package com.fizzware.dramaticdoors.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import com.fizzware.dramaticdoors.entity.ai.goal.DDVillagerTasks;

import net.minecraft.entity.ai.brain.Activity;
import net.minecraft.entity.ai.brain.Brain;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.village.VillagerProfession;

@Mixin(VillagerEntity.class)
public class VillagerMixin
{
	@Inject(method = "initBrain(Lnet/minecraft/entity/ai/brain/Brain;)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/ai/brain/task/VillagerTaskListProvider;createCoreTasks(Lnet/minecraft/village/VillagerProfession;F)Lcom/google/common/collect/ImmutableList;"), locals = LocalCapture.CAPTURE_FAILSOFT)
	private void injectInitBrain(Brain<VillagerEntity> brain, CallbackInfo ci, VillagerProfession villagerProfession) {
		brain.setTaskList(Activity.CORE, DDVillagerTasks.createTallDoorTasks(villagerProfession, 0.5f));
	}
}
