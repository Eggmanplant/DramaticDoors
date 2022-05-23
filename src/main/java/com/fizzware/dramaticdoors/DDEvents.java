package com.fizzware.dramaticdoors;
/*package com.fizzware.dramaticdoors;

import com.fizzware.dramaticdoors.entity.ai.goal.OpenTallDoorGoal;

import net.minecraft.entity.ai.pathing.MobNavigation;
import net.minecraft.entity.mob.AbstractPiglinEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.WitchEntity;
import net.minecraft.entity.passive.VillagerEntity;

public class DramaticDoorsEvents
{

	@SubscribeEvent
	public void entityAdded(EntityJoinWorldEvent event) {
		if (event.getEntity() instanceof VillagerEntity || event.getEntity() instanceof AbstractPiglinEntity || event.getEntity() instanceof WitchEntity) {
			MobEntity mob = (MobEntity) event.getEntity();
			mob.goalSelector.addGoal(1, new OpenTallDoorGoal(mob, true));
			if (mob instanceof WitchEntity) { // Because witches should be able to open regular doors too.
				MobNavigation navigator = (MobNavigation) mob.getNavigation();
				navigator.setCanEnterOpenDoors(true);
				mob.goalSelector.addGoal(1, new OpenDoorGoal(mob, true));
			}
		}
	}
}
*/