package com.fizzware.dramaticdoors.entity.ai.goal;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

import org.apache.commons.lang3.mutable.MutableInt;
import org.apache.commons.lang3.mutable.MutableObject;

import com.fizzware.dramaticdoors.DDTags;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;

import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.brain.MemoryModuleType;
import net.minecraft.entity.ai.brain.task.OpenDoorsTask;
import net.minecraft.entity.ai.brain.task.Task;
import net.minecraft.entity.ai.brain.task.TaskTriggerer;
import net.minecraft.entity.ai.pathing.Path;
import net.minecraft.entity.ai.pathing.PathNode;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.GlobalPos;

public class OpenTallDoorsTask
{
    private static final int RUN_TIME = 20;
    
    public static Task<LivingEntity> create() {
        MutableObject<Object> mutableObject = new MutableObject<Object>(null);
        MutableInt mutableInt = new MutableInt(0);
        return TaskTriggerer.task(context -> context.group(context.queryMemoryValue(MemoryModuleType.PATH), context.queryMemoryOptional(MemoryModuleType.DOORS_TO_CLOSE), context.queryMemoryOptional(MemoryModuleType.MOBS)).apply(context, (pathRaw, doorsToClose, mobs) -> (world, entity, time) -> {
            TallDoorBlock doorBlock2;
            BlockPos blockPos2;
            BlockState blockState2;
            Path path = (Path)context.getValue(pathRaw);
            Optional<Set<GlobalPos>> optional = context.getOptionalValue(doorsToClose);
            if (path.isStart() || path.isFinished()) {
                return false;
            }
            if (Objects.equals(mutableObject.getValue(), path.getCurrentNode())) {
                mutableInt.setValue(RUN_TIME);
            } else if (mutableInt.decrementAndGet() > 0) {
                return false;
            }
            mutableObject.setValue(path.getCurrentNode());
            PathNode pathNode = path.getLastNode();
            PathNode pathNode2 = path.getCurrentNode();
            BlockPos blockPos = pathNode.getBlockPos();
            BlockState blockState = world.getBlockState(blockPos);
            if (blockState.isIn(DDTags.TALL_WOODEN_DOORS, state -> state.getBlock() instanceof TallDoorBlock)) {
                TallDoorBlock doorBlock = (TallDoorBlock)blockState.getBlock();
                if (!doorBlock.isOpen(blockState)) {
                    doorBlock.setOpen(entity, world, blockState, blockPos, true);
                }
                optional = OpenDoorsTask.storePos(doorsToClose, optional, world, blockPos);
            }
            if ((blockState2 = world.getBlockState(blockPos2 = pathNode2.getBlockPos())).isIn(DDTags.TALL_WOODEN_DOORS, state -> state.getBlock() instanceof TallDoorBlock) && !(doorBlock2 = (TallDoorBlock)blockState2.getBlock()).isOpen(blockState2)) {
                doorBlock2.setOpen(entity, world, blockState2, blockPos2, true);
                optional = OpenDoorsTask.storePos(doorsToClose, optional, world, blockPos2);
            }
            optional.ifPresent(doors -> OpenDoorsTask.pathToDoor(world, entity, pathNode, pathNode2, doors, context.getOptionalValue(mobs)));
            return true;
        }));
    }
}
