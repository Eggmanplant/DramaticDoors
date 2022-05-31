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

public class TallDoorInteractGoal extends Goal
{
	protected MobEntity mob;
	protected BlockPos doorPos = BlockPos.ORIGIN;
	protected boolean doorValid;
	private boolean shouldStop;
	private float offsetX;
	private float offsetZ;

	public TallDoorInteractGoal(MobEntity entity) {
		this.mob = entity;
		if (!NavigationConditions.hasMobNavigation(entity)) {
			throw new IllegalArgumentException("Unsupported mob type for TallDoorInteractGoal");
		}
	}

	protected boolean isDoorOpen() {
		if (!this.doorValid) {
			return false;
		} else {
			BlockState blockstate = this.mob.world.getBlockState(this.doorPos);
			if (!(blockstate.getBlock() instanceof TallDoorBlock)) {
				this.doorValid = false;
				return false;
			} else {
				return blockstate.get(TallDoorBlock.OPEN);
			}
		}
	}

	protected void setDoorOpen(boolean open) {
		if (this.doorValid) {
			BlockState blockstate = this.mob.world.getBlockState(this.doorPos);
			if (blockstate.getBlock() instanceof TallDoorBlock) {
				((TallDoorBlock) blockstate.getBlock()).setOpen(this.mob, this.mob.world, blockstate, this.doorPos, open);
			}
		}

	}

	@Override
	public boolean canStart() {
        if (!NavigationConditions.hasMobNavigation(this.mob)) {
            return false;
        }
        if (!this.mob.horizontalCollision) {
            return false;
        }
		MobNavigation mobNavigation = (MobNavigation) this.mob.getNavigation();
		Path path = mobNavigation.getCurrentPath();
		if (path == null || path.isFinished() || !mobNavigation.canEnterOpenDoors()) {
			return false;
		}
		for (int i = 0; i < Math.min(path.getCurrentNodeIndex() + 2, path.getLength()); ++i) {
			PathNode node = path.getNode(i);
			this.doorPos = new BlockPos(node.x, node.y + 1, node.z);
			if (!(this.mob.squaredDistanceTo((double) this.doorPos.getX(), this.mob.getY(), (double) this.doorPos.getZ()) > 2.25D)) {
				this.doorValid = TallDoorBlock.isWoodenDoor(this.mob.world, this.doorPos);
				if (this.doorValid) {
					return true;
				}
			}
		}
		this.doorPos = this.mob.getBlockPos().up();
		this.doorValid = TallDoorBlock.isWoodenDoor(this.mob.world, this.doorPos);
		return this.doorValid;
	}

	@Override
	public boolean shouldContinue() {
		return !this.shouldStop;
	}

	@Override
	public void start() {
		this.shouldStop = false;
		this.offsetX = (float) ((double) this.doorPos.getX() + 0.5D - this.mob.getX());
		this.offsetZ = (float) ((double) this.doorPos.getZ() + 0.5D - this.mob.getZ());
	}

	@Override
	public boolean shouldRunEveryTick() {
		return true;
	}

	@Override
	public void tick() {
		float f = (float) ((double) this.doorPos.getX() + 0.5D - this.mob.getX());
		float f1 = (float) ((double) this.doorPos.getZ() + 0.5D - this.mob.getZ());
		float f2 = this.offsetX * f + this.offsetZ * f1;
		if (f2 < 0.0F) {
			this.shouldStop = true;
		}

	}
}
