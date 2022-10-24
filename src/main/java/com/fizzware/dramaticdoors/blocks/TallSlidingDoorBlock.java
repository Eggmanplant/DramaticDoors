package com.fizzware.dramaticdoors.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.properties.DoorHingeSide;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class TallSlidingDoorBlock extends TallDoorBlock
{
    protected static final VoxelShape SOUTH_AABB = Block.box(0.0D, 0.0D, 7.0D, 16.0D, 16.0D, 9.0D);
    protected static final VoxelShape NORTH_AABB = Block.box(0.0D, 0.0D, 7.0D, 16.0D, 16.0D, 9.0D);
    protected static final VoxelShape WEST_AABB = Block.box(7.0D, 0.0D, 0.0D, 9.0D, 16.0D, 16.0D);
    protected static final VoxelShape EAST_AABB = Block.box(7.0D, 0.0D, 0.0D, 9.0D, 16.0D, 16.0D);
    protected static final VoxelShape SOUTH_OPEN_AABB = Block.box(0.0D, 0.0D, 7.0D, 16.0D, 16.0D, 8.0D).move(-0.6875D, 0.0D, 0.0D);
    protected static final VoxelShape NORTH_OPEN_AABB = Block.box(0.0D, 0.0D, 7.0D, 16.0D, 16.0D, 8.0D).move(0.6875D, 0.0D, 0.0D);
    protected static final VoxelShape WEST_OPEN_AABB = Block.box(7.0D, 0.0D, 0.0D, 9.0D, 16.0D, 16.0D).move(0.0D, 0.0D, -0.6875D);
    protected static final VoxelShape EAST_OPEN_AABB = Block.box(7.0D, 0.0D, 0.0D, 9.0D, 16.0D, 16.0D).move(0.0D, 0.0D, 0.6875D);
    protected static final VoxelShape SOUTH_OPEN_LEFT_AABB = Block.box(0.0D, 0.0D, 7.0D, 16.0D, 16.0D, 9.0D).move(0.6875D, 0.0D, 0.0D);
    protected static final VoxelShape NORTH_OPEN_LEFT_AABB = Block.box(0.0D, 0.0D, 7.0D, 16.0D, 16.0D, 9.0D).move(-0.6875D, 0.0D, 0.0D);
    protected static final VoxelShape WEST_OPEN_LEFT_AABB = Block.box(7.0D, 0.0D, 0.0D, 9.0D, 16.0D, 16.0D).move(0.0D, 0.0D, 0.6875D);
    protected static final VoxelShape EAST_OPEN_LEFT_AABB = Block.box(7.0D, 0.0D, 0.0D, 9.0D, 16.0D, 16.0D).move(0.0D, 0.0D, -0.6875D);
    
	public TallSlidingDoorBlock(Block from) {
		super(from);
	}

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        Direction direction = state.getValue(FACING);
        boolean flag = !state.getValue(OPEN);
        boolean flag1 = state.getValue(HINGE) == DoorHingeSide.LEFT;
        switch(direction) {
            case EAST:
            default:
                return flag ? EAST_AABB : (flag1 ? EAST_OPEN_LEFT_AABB : EAST_OPEN_AABB);
            case SOUTH:
                return flag ? SOUTH_AABB : (flag1 ? SOUTH_OPEN_LEFT_AABB : SOUTH_OPEN_AABB);
            case WEST:
                return flag ? WEST_AABB : (flag1 ? WEST_OPEN_LEFT_AABB : WEST_OPEN_AABB);
            case NORTH:
                return flag ? NORTH_AABB : (flag1 ? NORTH_OPEN_LEFT_AABB : NORTH_OPEN_AABB);
        }
    }
}
