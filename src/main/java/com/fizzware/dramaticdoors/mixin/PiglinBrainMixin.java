package com.fizzware.dramaticdoors.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import com.fizzware.dramaticdoors.entity.ai.goal.OpenTallDoorsTask;
import com.google.common.collect.ImmutableList;

import net.minecraft.entity.ai.brain.Activity;
import net.minecraft.entity.ai.brain.Brain;
import net.minecraft.entity.mob.PiglinBrain;
import net.minecraft.entity.mob.PiglinEntity;

@Mixin(PiglinBrain.class)
public class PiglinBrainMixin
{

	@Inject(method = "create(Lnet/minecraft/entity/mob/PiglinEntity;Lnet/minecraft/entity/ai/brain/Brain;)Lnet/minecraft/entity/ai/brain/Brain;", at = @At (value = "RETURN"))
	private static void injectCreate(PiglinEntity piglin, Brain<PiglinEntity> brain, CallbackInfoReturnable<Brain<?>> cir) {
		addTallDoorActivities(brain);
	}
	
    private static void addTallDoorActivities(Brain<PiglinEntity> piglin) {
        piglin.setTaskList(Activity.CORE, 1, ImmutableList.of(OpenTallDoorsTask.create()));
    }
}
