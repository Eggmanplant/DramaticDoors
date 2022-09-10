package com.fizzware.dramaticdoors.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.enums.DoorHinge;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class TallSlidingDoorBlock extends TallDoorBlock
{
    protected static final VoxelShape SOUTH_AABB = Block.createCuboidShape(0.0D, 0.0D, 7.0D, 16.0D, 16.0D, 9.0D);
    protected static final VoxelShape NORTH_AABB = Block.createCuboidShape(0.0D, 0.0D, 7.0D, 16.0D, 16.0D, 9.0D);
    protected static final VoxelShape WEST_AABB = Block.createCuboidShape(7.0D, 0.0D, 0.0D, 9.0D, 16.0D, 16.0D);
    protected static final VoxelShape EAST_AABB = Block.createCuboidShape(7.0D, 0.0D, 0.0D, 9.0D, 16.0D, 16.0D);
    protected static final VoxelShape SOUTH_OPEN_AABB = Block.createCuboidShape(0.0D, 0.0D, 7.0D, 16.0D, 16.0D, 8.0D).offset(-0.6875D, 0.0D, 0.0D);
    protected static final VoxelShape NORTH_OPEN_AABB = Block.createCuboidShape(0.0D, 0.0D, 7.0D, 16.0D, 16.0D, 8.0D).offset(0.6875D, 0.0D, 0.0D);
    protected static final VoxelShape WEST_OPEN_AABB = Block.createCuboidShape(7.0D, 0.0D, 0.0D, 9.0D, 16.0D, 16.0D).offset(0.0D, 0.0D, -0.6875D);
    protected static final VoxelShape EAST_OPEN_AABB = Block.createCuboidShape(7.0D, 0.0D, 0.0D, 9.0D, 16.0D, 16.0D).offset(0.0D, 0.0D, 0.6875D);
    protected static final VoxelShape SOUTH_OPEN_LEFT_AABB = Block.createCuboidShape(0.0D, 0.0D, 7.0D, 16.0D, 16.0D, 9.0D).offset(0.6875D, 0.0D, 0.0D);
    protected static final VoxelShape NORTH_OPEN_LEFT_AABB = Block.createCuboidShape(0.0D, 0.0D, 7.0D, 16.0D, 16.0D, 9.0D).offset(-0.6875D, 0.0D, 0.0D);
    protected static final VoxelShape WEST_OPEN_LEFT_AABB = Block.createCuboidShape(7.0D, 0.0D, 0.0D, 9.0D, 16.0D, 16.0D).offset(0.0D, 0.0D, 0.6875D);
    protected static final VoxelShape EAST_OPEN_LEFT_AABB = Block.createCuboidShape(7.0D, 0.0D, 0.0D, 9.0D, 16.0D, 16.0D).offset(0.0D, 0.0D, -0.6875D);
    
	public TallSlidingDoorBlock(Block from) {
		super(from);
	}

	@Override
	public VoxelShape getOutlineShape(BlockState state, BlockView level, BlockPos pos, ShapeContext context) {
        Direction direction = state.get(FACING);
        boolean flag = !state.get(OPEN);
        boolean flag1 = state.get(HINGE) == DoorHinge.LEFT;
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
