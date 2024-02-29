package com.fizzware.dramaticdoors.forge.addons.framedblocks;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;
import xfacthd.framedblocks.api.predicate.fullface.FullFacePredicate;

public class TallDoorFullFacePredicate implements FullFacePredicate
{
    public static final TallDoorFullFacePredicate INSTANCE = new TallDoorFullFacePredicate();

    private TallDoorFullFacePredicate() { }

    @Override
    public boolean test(BlockState state, Direction side)
    {
        Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
        if (state.getValue(BlockStateProperties.OPEN))
        {
            if (state.getValue(BlockStateProperties.DOOR_HINGE) == DoorHingeSide.LEFT)
            {
                return facing.getCounterClockWise() == side;
            }
            else
            {
                return facing.getClockWise() == side;
            }
        }
        else
        {
            return facing.getOpposite() == side;
        }
    }
}
