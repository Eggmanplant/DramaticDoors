package com.fizzware.dramaticdoors.mixin;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import com.fizzware.dramaticdoors.blocks.ShortDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.tags.DDBlockTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.GlobalPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.behavior.InteractWithDoor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.Node;

// Ported from Fabric version of Dramatic Doors.
@Mixin(InteractWithDoor.class)
public class OpenDoorsTaskMixin
{
	
	// Part 1 of inject, upper checks.
	/*@Inject(method = "start(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;J)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/ai/behavior/InteractWithDoor;rememberDoorToClose(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/core/BlockPos;)V", ordinal = 0, shift = Shift.BY, by = 2))
	private void injectStartP1(ServerLevel level, LivingEntity entity, long time, CallbackInfo ci) {
		Path pathDD1 = entity.getBrain().getMemory(MemoryModuleType.PATH).get();
        Node nodeDD1 = pathDD1.getPreviousNode();
        BlockPos blockPosDD1 = nodeDD1.asBlockPos();
        BlockState blockStateDD1 = level.getBlockState(blockPosDD1);
		if (blockStateDD1.is(DDItemTags.TALL_WOODEN_DOORS, (localblockstate) -> {
			return localblockstate.getBlock() instanceof TallDoorBlock;
		})) {
			TallDoorBlock talldoorblock = (TallDoorBlock)blockStateDD1.getBlock();
			if (!talldoorblock.isOpen(blockStateDD1)) {
				talldoorblock.setOpen(entity, level, blockStateDD1, blockPosDD1, true);
			}
			((InteractWithDoor)(Object)this).rememberDoorToClose(level, entity, blockPosDD1);
		}
	}
	
	// Part 2 of inject, lower checks.
	@Inject(method = "start(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;J)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/ai/behavior/InteractWithDoor;closeDoorsThatIHaveOpenedOrPassedThrough(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/level/pathfinder/Node;Lnet/minecraft/world/level/pathfinder/Node;)V", shift = Shift.BEFORE))
	private void injectStartP2(ServerLevel level, LivingEntity entity, long time, CallbackInfo ci) {
		Path pathDD2 = entity.getBrain().getMemory(MemoryModuleType.PATH).get();
        Node nodeDD2 = pathDD2.getNextNode();
		BlockPos blockPosDD2 = nodeDD2.asBlockPos();
		BlockState blockstateDD2 = level.getBlockState(blockPosDD2);
		if (blockstateDD2.is(DDItemTags.TALL_WOODEN_DOORS, (localblockstate) -> {
			return localblockstate.getBlock() instanceof TallDoorBlock;
		})) {
			TallDoorBlock talldoorblock = (TallDoorBlock)blockstateDD2.getBlock();
			if (!talldoorblock.isOpen(blockstateDD2)) {
				talldoorblock.setOpen(entity, level, blockstateDD2, blockPosDD2, true);
			}
			((InteractWithDoor)(Object)this).rememberDoorToClose(level, entity, blockPosDD2);
		}
	}*/
	
	@Inject(method = "closeDoorsThatIHaveOpenedOrPassedThrough(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/level/pathfinder/Node;Lnet/minecraft/world/level/pathfinder/Node;Ljava/util/Set;Ljava/util/Optional;)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/server/level/ServerLevel;getBlockState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;"), locals = LocalCapture.CAPTURE_FAILSOFT)
	private static void injectPathToDoor(ServerLevel world, LivingEntity entity, @Nullable Node lastNode, @Nullable Node currentNode, Set<GlobalPos> doors, Optional<List<LivingEntity>> otherMobs, CallbackInfo ci, Iterator<GlobalPos> iterator, GlobalPos globalPos, BlockPos blockPos) {
		BlockState blockStateDD = world.getBlockState(blockPos);
        if (blockStateDD.is(DDBlockTags.TALL_WOODEN_DOORS, state -> state.getBlock() instanceof TallDoorBlock)) {
        	TallDoorBlock tallDoorBlock = (TallDoorBlock)blockStateDD.getBlock();
        	tallDoorBlock.setOpen(entity, world, blockStateDD, blockPos, false);
        }
        if (blockStateDD.is(DDBlockTags.SHORT_WOODEN_DOORS, state -> state.getBlock() instanceof ShortDoorBlock)) {
        	ShortDoorBlock shortDoorBlock = (ShortDoorBlock)blockStateDD.getBlock();
        	shortDoorBlock.setOpen(entity, world, blockStateDD, blockPos, false);
        }
	}
}
