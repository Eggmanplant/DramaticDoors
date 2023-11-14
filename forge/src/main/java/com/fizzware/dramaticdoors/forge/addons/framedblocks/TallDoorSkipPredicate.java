package com.fizzware.dramaticdoors.forge.addons.framedblocks;

import com.fizzware.dramaticdoors.state.properties.DDBlockStateProperties;
import com.fizzware.dramaticdoors.state.properties.TripleBlockPart;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;
import xfacthd.framedblocks.api.util.SideSkipPredicate;
import xfacthd.framedblocks.common.block.door.FramedDoorBlock;

public class TallDoorSkipPredicate implements SideSkipPredicate
{
    @Override
    public boolean test(BlockGetter level, BlockPos pos, BlockState state, BlockState adjState, Direction side)
    {
        Direction facing = getDoorFacing(state);

        if (side == facing.getOpposite())
        {
            return SideSkipPredicate.CTM.test(level, pos, state, adjState, side);
        }

        if (!(adjState.getBlock() instanceof FramedDoorBlock)) { return false; }

        boolean middle = state.getValue(DDBlockStateProperties.TRIPLE_BLOCK_THIRD) == TripleBlockPart.MIDDLE;
        if ((middle && side == Direction.DOWN) || (middle && side ==  Direction.UP))
        {
            return SideSkipPredicate.compareState(level, pos, side, state, adjState);
        }
        
        boolean top = state.getValue(DDBlockStateProperties.TRIPLE_BLOCK_THIRD) == TripleBlockPart.UPPER;
        if ((top && side == Direction.DOWN) || (!top && side ==  Direction.UP))
        {
            return SideSkipPredicate.compareState(level, pos, side, state, adjState);
        }

        Direction adjFacing = getDoorFacing(adjState);
        if (facing == adjFacing && (side == facing.getClockWise() || side == facing.getCounterClockWise()))
        {
            return SideSkipPredicate.compareState(level, pos, side, state, adjState);
        }

        return false;
    }

    private static Direction getDoorFacing(BlockState state)
    {
        Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
        DoorHingeSide hinge = state.getValue(BlockStateProperties.DOOR_HINGE);

        if (state.getValue(BlockStateProperties.OPEN))
        {
            return hinge == DoorHingeSide.LEFT ? facing.getClockWise() : facing.getCounterClockWise();
        }

        return facing;
    }
}
