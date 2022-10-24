package com.fizzware.dramaticdoors;

import com.fizzware.dramaticdoors.entity.ai.goal.OpenTallDoorGoal;

import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.goal.OpenDoorGoal;
import net.minecraft.entity.merchant.villager.AbstractVillagerEntity;
import net.minecraft.entity.monster.WitchEntity;
import net.minecraft.entity.monster.piglin.AbstractPiglinEntity;
import net.minecraft.pathfinding.GroundPathNavigator;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class DDEvents
{
	
	@SubscribeEvent
	public void entityAdded(EntityJoinWorldEvent event) {
		if (event.getEntity() instanceof AbstractVillagerEntity || event.getEntity() instanceof AbstractPiglinEntity || event.getEntity() instanceof WitchEntity) {
			MobEntity mob = (MobEntity) event.getEntity();
			if (mob.getNavigation() instanceof GroundPathNavigator) {
				mob.goalSelector.addGoal(1, new OpenTallDoorGoal(mob, true));
			}
			if (mob instanceof WitchEntity) { // Because witches should be able to open regular doors too.
				GroundPathNavigator navigator = (GroundPathNavigator) mob.getNavigation();
				navigator.setCanOpenDoors(true);
				mob.goalSelector.addGoal(1, new OpenDoorGoal(mob, true));
			}
		}
	}
	
}
