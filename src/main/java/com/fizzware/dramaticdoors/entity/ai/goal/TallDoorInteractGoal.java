package com.fizzware.dramaticdoors.entity.ai.goal;

import com.fizzware.dramaticdoors.blocks.TallDoorBlock;

import net.minecraft.block.BlockState;
import net.minecraft.entity.ai.NavigationConditions;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.ai.pathing.MobNavigation;
import net.minecraft.entity.ai.pathing.Path;
import net.minecraft.entity.ai.pathing.PathNode;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.util.math.BlockPos;

public class TallDoorInteractGoal extends Goal {
   protected MobEntity mob;
   protected BlockPos doorPos = BlockPos.ORIGIN;
   protected boolean hasDoor;
   private boolean passed;
   private float doorOpenDirX;
   private float doorOpenDirZ;

   public TallDoorInteractGoal(MobEntity entity) {
      this.mob = entity;
      if (!NavigationConditions.hasMobNavigation(entity)) {
         throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
      }
   }

   protected boolean isOpen() {
      if (!this.hasDoor) {
         return false;
      } else {
         BlockState blockstate = this.mob.world.getBlockState(this.doorPos);
         if (!(blockstate.getBlock() instanceof TallDoorBlock)) {
            this.hasDoor = false;
            return false;
         } else {
            return blockstate.get(TallDoorBlock.OPEN);
         }
      }
   }

   protected void setOpen(boolean open) {
      if (this.hasDoor) {
         BlockState blockstate = this.mob.world.getBlockState(this.doorPos);
         if (blockstate.getBlock() instanceof TallDoorBlock) {
            ((TallDoorBlock)blockstate.getBlock()).setOpen(this.mob, this.mob.world, blockstate, this.doorPos, open);
         }
      }

   }

   @Override
   public boolean canStart() {
      if (!NavigationConditions.hasMobNavigation(this.mob)) {
         return false;
      } else if (!this.mob.horizontalCollision) {
         return false;
      } else {
         MobNavigation groundpathnavigation = (MobNavigation)this.mob.getNavigation();
         Path path = groundpathnavigation.getCurrentPath();
         if (path != null && !path.isFinished() && groundpathnavigation.canEnterOpenDoors()) {
            for(int i = 0; i < Math.min(path.getCurrentNodeIndex() + 2, path.getLength()); ++i) {
               PathNode node = path.getNode(i);
               this.doorPos = new BlockPos(node.x, node.y + 1, node.z);
               if (!(this.mob.squaredDistanceTo((double)this.doorPos.getX(), this.mob.getY(), (double)this.doorPos.getZ()) > 2.25D)) {
                  this.hasDoor = TallDoorBlock.isWoodenDoor(this.mob.world, this.doorPos);
                  if (this.hasDoor) {
                     return true;
                  }
               }
            }

            this.doorPos = this.mob.getBlockPos().up();
            this.hasDoor = TallDoorBlock.isWoodenDoor(this.mob.world, this.doorPos);
            return this.hasDoor;
         } else {
            return false;
         }
      }
   }

   public boolean canContinueToUse() {
      return !this.passed;
   }

   public void start() {
      this.passed = false;
      this.doorOpenDirX = (float)((double)this.doorPos.getX() + 0.5D - this.mob.getX());
      this.doorOpenDirZ = (float)((double)this.doorPos.getZ() + 0.5D - this.mob.getZ());
   }

   public boolean requiresUpdateEveryTick() {
      return true;
   }

   public void tick() {
      float f = (float)((double)this.doorPos.getX() + 0.5D - this.mob.getX());
      float f1 = (float)((double)this.doorPos.getZ() + 0.5D - this.mob.getZ());
      float f2 = this.doorOpenDirX * f + this.doorOpenDirZ * f1;
      if (f2 < 0.0F) {
         this.passed = true;
      }

   }
}
