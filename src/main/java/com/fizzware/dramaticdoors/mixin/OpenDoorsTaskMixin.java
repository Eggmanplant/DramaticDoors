package com.fizzware.dramaticdoors.mixin;

import java.util.Iterator;
import javax.annotation.Nullable;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import com.fizzware.dramaticdoors.DDTags;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;

import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.brain.Brain;
import net.minecraft.entity.ai.brain.MemoryModuleType;
import net.minecraft.entity.ai.brain.task.OpenDoorsTask;
import net.minecraft.entity.ai.pathing.Path;
import net.minecraft.entity.ai.pathing.PathNode;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.GlobalPos;

@Mixin(OpenDoorsTask.class)
public class OpenDoorsTaskMixin
{
	@Inject(method = "run(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/entity/LivingEntity;J)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/ai/brain/task/OpenDoorsTask;pathToDoor(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/entity/ai/pathing/PathNode;Lnet/minecraft/entity/ai/pathing/PathNode;)V"))
	private void injectRun(ServerWorld world, LivingEntity entity, long time, CallbackInfo ci) {
		TallDoorBlock tallDoorBlock;
		Path path2 = entity.getBrain().getOptionalMemory(MemoryModuleType.PATH).get();
		PathNode pathNode2 = path2.getCurrentNode();
		BlockState blockStateDD;
		BlockPos blockPosDD;
		if ((blockStateDD = world.getBlockState(blockPosDD = pathNode2.getBlockPos())).isIn(DDTags.TALL_WOODEN_DOORS, state -> state.getBlock() instanceof TallDoorBlock) && !(tallDoorBlock = (TallDoorBlock)blockStateDD.getBlock()).isOpen(blockStateDD)) {
            tallDoorBlock.setOpen(entity, world, blockStateDD, blockPosDD, true);
            ((OpenDoorsTask)(Object)this).rememberToCloseDoor(world, entity, blockPosDD);
        }
	}
	//, BlockState blockState
	@Inject(method = "pathToDoor(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/entity/ai/pathing/PathNode;Lnet/minecraft/entity/ai/pathing/PathNode;)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/server/world/ServerWorld;getBlockState(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/BlockState;"), locals = LocalCapture.CAPTURE_FAILSOFT)
	private static void injectPathToDoor(ServerWorld world, LivingEntity entity, @Nullable PathNode lastNode, @Nullable PathNode currentNode, CallbackInfo ci, Brain<?> brain, Iterator<GlobalPos> iterator, GlobalPos globalPos, BlockPos blockPos) {
		BlockState blockStateDD = world.getBlockState(blockPos);
        if (blockStateDD.isIn(DDTags.TALL_WOODEN_DOORS, state -> state.getBlock() instanceof TallDoorBlock)) {
        	TallDoorBlock tallDoorBlock = (TallDoorBlock)blockStateDD.getBlock();
        	tallDoorBlock.setOpen(entity, world, blockStateDD, blockPos, false);
        }
	}
}
