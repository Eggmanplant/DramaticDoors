package com.fizzware.dramaticdoors.forge.addons.framedblocks;

import org.jetbrains.annotations.Nullable;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;
import xfacthd.framedblocks.api.predicate.contex.ConnectionPredicate;
import xfacthd.framedblocks.api.util.Utils;

public class TallDoorConnectionPredicate implements ConnectionPredicate
{
    public static final TallDoorConnectionPredicate INSTANCE = new TallDoorConnectionPredicate();

    private TallDoorConnectionPredicate() { }

    @Override
    public boolean canConnectFullEdge(BlockState state, Direction side, @Nullable Direction edge)
    {
        Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
        boolean open = state.getValue(BlockStateProperties.OPEN);

        Direction fullFace = facing.getOpposite();
        if (open)
        {
            DoorHingeSide hinge = state.getValue(BlockStateProperties.DOOR_HINGE);
            fullFace = hinge == DoorHingeSide.LEFT ? facing.getCounterClockWise() : facing.getClockWise();
        }

        if (side == fullFace)
        {
            return true;
        }
        else if (side.getAxis() != fullFace.getAxis())
        {
            return edge == fullFace;
        }

        return false;
    }

    @Override
    public boolean canConnectDetailed(BlockState state, Direction side, Direction edge)
    {
        Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
        boolean open = state.getValue(BlockStateProperties.OPEN);

        Direction fullFace = facing;
        if (open)
        {
            DoorHingeSide hinge = state.getValue(BlockStateProperties.DOOR_HINGE);
            fullFace = hinge == DoorHingeSide.LEFT ? facing.getClockWise() : facing.getCounterClockWise();
        }

        if (side == fullFace)
        {
            return edge.getAxis() != fullFace.getAxis();
        }
        else if (side.getAxis() == fullFace.getClockWise().getAxis())
        {
            return Utils.isY(edge);
        }
        return false;
    }
}
