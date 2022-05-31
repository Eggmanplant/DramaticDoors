package com.fizzware.dramaticdoors.entity.ai.goal;

import net.minecraft.entity.mob.MobEntity;

public class OpenTallDoorGoal extends TallDoorInteractGoal
{
   private final boolean delayedClose;
   private int ticksLeft;

   public OpenTallDoorGoal(MobEntity entity, boolean close) {
      super(entity);
      this.mob = entity;
      this.delayedClose = close;
   }

   @Override
   public boolean shouldContinue() {
      return this.delayedClose && this.ticksLeft > 0 && super.shouldContinue();
   }

   @Override
   public void start() {
      this.ticksLeft = 20;
      this.setDoorOpen(true);
   }

   @Override
   public void stop() {
      this.setDoorOpen(false);
   }

   @Override
   public void tick() {
      --this.ticksLeft;
      super.tick();
   }
}
