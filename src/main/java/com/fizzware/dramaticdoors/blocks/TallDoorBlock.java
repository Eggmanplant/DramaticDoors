package com.fizzware.dramaticdoors.blocks;

import java.util.Random;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

import com.fizzware.dramaticdoors.DDTags;
import com.fizzware.dramaticdoors.compat.Compats;
import com.fizzware.dramaticdoors.compat.QuarkCompat;
import com.fizzware.dramaticdoors.state.properties.DoorBlockStateProperties;
import com.fizzware.dramaticdoors.state.properties.TripleBlockPart;

import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.HorizontalFaceBlock;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.PushReaction;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.DoorHingeSide;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
@SuppressWarnings("deprecation")
public class TallDoorBlock extends Block implements IWaterLoggable {

    public static final EnumProperty<TripleBlockPart> THIRD = DoorBlockStateProperties.TRIPLE_BLOCK_THIRD;
    public static final DirectionProperty FACING = HorizontalFaceBlock.FACING;
    public static final BooleanProperty OPEN = BlockStateProperties.OPEN;
    public static final EnumProperty<DoorHingeSide> HINGE = BlockStateProperties.DOOR_HINGE;
    public static final BooleanProperty POWERED = BlockStateProperties.POWERED;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    protected static final VoxelShape SOUTH_AABB = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 3.0D);
    protected static final VoxelShape NORTH_AABB = Block.box(0.0D, 0.0D, 13.0D, 16.0D, 16.0D, 16.0D);
    protected static final VoxelShape WEST_AABB = Block.box(13.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);
    protected static final VoxelShape EAST_AABB = Block.box(0.0D, 0.0D, 0.0D, 3.0D, 16.0D, 16.0D);


    public TallDoorBlock(Block from) {
        super(Properties.copy(from));
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(OPEN, Boolean.FALSE).setValue(HINGE, DoorHingeSide.LEFT).setValue(POWERED, Boolean.FALSE).setValue(WATERLOGGED, Boolean.FALSE).setValue(THIRD, TripleBlockPart.LOWER));
    }

    @Override
    public BlockState updateShape(BlockState stateIn, Direction facing, BlockState facingState, IWorld level, BlockPos currentPos, BlockPos facingPos) {
        TripleBlockPart tripleblockpart = stateIn.getValue(THIRD);
        if (facing.getAxis() == Direction.Axis.Y && ((tripleblockpart == TripleBlockPart.LOWER == (facing == Direction.UP)) || tripleblockpart == TripleBlockPart.MIDDLE)) {
            if (facingState.getBlock() == this && facingState.getValue(THIRD) != tripleblockpart) {
                return stateIn.setValue(FACING, facingState.getValue(FACING)).setValue(OPEN, facingState.getValue(OPEN)).setValue(HINGE, facingState.getValue(HINGE)).setValue(POWERED, facingState.getValue(POWERED));
            } else {
                return Blocks.AIR.defaultBlockState();
            }
        } else {
            if (tripleblockpart == TripleBlockPart.LOWER && facing == Direction.DOWN && !stateIn.canSurvive(level, currentPos)) {
                return level.getFluidState(currentPos).getType() == Fluids.WATER ? Blocks.WATER.defaultBlockState() : Blocks.AIR.defaultBlockState();
            } else {
                return super.updateShape(stateIn, facing, facingState, level, currentPos, facingPos);
            }
        }
    }

    @Override
    public void playerWillDestroy(World level, BlockPos pos, BlockState state, PlayerEntity player) {
        if (!level.isClientSide && player.isCreative()) {
            BlockPos otherPos1 = pos;
            BlockPos otherPos2 = pos;
            TripleBlockPart tripleblockpart = state.getValue(THIRD);
            switch (tripleblockpart) {
                case LOWER:
                    otherPos1 = pos.above();
                    otherPos2 = pos.above(2);
                    break;
                case MIDDLE:
                    otherPos1 = pos.below();
                    otherPos2 = pos.above();
                    break;
                case UPPER:
                    otherPos1 = pos.below(2);
                    otherPos2 = pos.below();
                    break;
            }
            BlockState blockstate1 = level.getBlockState(otherPos1);
            BlockState blockstate2 = level.getBlockState(otherPos2);
            if (blockstate1.getBlock() == state.getBlock() && blockstate1.getValue(THIRD) == TripleBlockPart.LOWER) {
                level.setBlock(otherPos1, blockstate1.getValue(WATERLOGGED) ? Blocks.WATER.defaultBlockState() : Blocks.AIR.defaultBlockState(), 35);
            	level.levelEvent(player, 2001, otherPos1, Block.getId(blockstate1));
            }
            if (blockstate2.getBlock() == state.getBlock() && blockstate2.getValue(THIRD) == TripleBlockPart.LOWER) {
                level.setBlock(otherPos2, blockstate2.getValue(WATERLOGGED) ? Blocks.WATER.defaultBlockState() : Blocks.AIR.defaultBlockState(), 35);
            	level.levelEvent(player, 2001, otherPos1, Block.getId(blockstate1));
            }
        }
        super.playerWillDestroy(level, pos, state, player);
    }

    protected int getCloseSound() {
        return this.material == Material.METAL ? 1011 : 1012;
    }

    protected int getOpenSound() {
        return this.material == Material.METAL ? 1005 : 1006;
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        BlockPos blockpos = context.getClickedPos();
        if (blockpos.getY() < 255 && context.getLevel().getBlockState(blockpos.above()).canBeReplaced(context) && context.getLevel().getBlockState(blockpos.above(2)).canBeReplaced(context)) {
            World level = context.getLevel();
            boolean flag = level.hasNeighborSignal(blockpos) || level.hasNeighborSignal(blockpos.above());
            boolean waterfilled = level.getFluidState(blockpos).getType() == Fluids.WATER; 
            return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection()).setValue(HINGE, this.getHinge(context)).setValue(POWERED, flag).setValue(OPEN, flag).setValue(THIRD, TripleBlockPart.LOWER).setValue(WATERLOGGED, waterfilled);
        } else {
            return null;
        }
    }

    @Override
    public void setPlacedBy(World level, BlockPos pos, BlockState state, LivingEntity placer, ItemStack stack) {
    	boolean waterfilled = level.getFluidState(pos.above(1)).getType() == Fluids.WATER; 
    	boolean waterfilled2 = level.getFluidState(pos.above(2)).getType() == Fluids.WATER; 
        level.setBlock(pos.above(), state.setValue(THIRD, TripleBlockPart.MIDDLE).setValue(WATERLOGGED, waterfilled), 3);
        level.setBlock(pos.above().above(), state.setValue(THIRD, TripleBlockPart.UPPER).setValue(WATERLOGGED, waterfilled2), 3);
    }

    private DoorHingeSide getHinge(BlockItemUseContext context) {
        IBlockReader IBlockReader = context.getLevel();
        BlockPos placePos = context.getClickedPos();
        Direction behindDir = context.getHorizontalDirection(); // Behind
        BlockPos placePosAbove = placePos.above();
        Direction leftDir = behindDir.getCounterClockWise(); // Left
        BlockPos leftPos = placePos.relative(leftDir); // Left Pos
        BlockState leftBlockstate = IBlockReader.getBlockState(leftPos); // Left BlockState
        BlockPos leftPosAbove = placePosAbove.relative(leftDir); // Left Up Pos
        BlockState leftAboveBlockstate = IBlockReader.getBlockState(leftPosAbove); // Left Up BlockState
        Direction rightDir = behindDir.getClockWise(); // Right
        BlockPos rightPos = placePos.relative(rightDir); // Right Pos
        BlockState rightBlockstate = IBlockReader.getBlockState(rightPos); // Right Blockstate
        BlockPos rightPosAbove = placePosAbove.relative(rightDir); // Right Up Pos
        BlockState rightAboveBlockstate = IBlockReader.getBlockState(rightPosAbove); // Right Up Blockstate
        int i = (leftBlockstate.isCollisionShapeFullBlock(IBlockReader, leftPos) ? -1 : 0) + (leftAboveBlockstate.isCollisionShapeFullBlock(IBlockReader, leftPosAbove) ? -1 : 0) + (rightBlockstate.isCollisionShapeFullBlock(IBlockReader, rightPos) ? 1 : 0) + (rightAboveBlockstate.isCollisionShapeFullBlock(IBlockReader, rightPosAbove) ? 1 : 0);
        boolean leftIsLowerOfSameType = leftBlockstate.getBlock() == this && leftBlockstate.getValue(THIRD) == TripleBlockPart.LOWER;
        boolean rightIsLowerOfSameType = rightBlockstate.getBlock() == this && rightBlockstate.getValue(THIRD) == TripleBlockPart.LOWER;
        if ((!leftIsLowerOfSameType || rightIsLowerOfSameType) && i <= 0) {
            if ((!rightIsLowerOfSameType || leftIsLowerOfSameType) && i >= 0) {
                int j = behindDir.getStepX();
                int k = behindDir.getStepZ();
                Vector3d vec3d = context.getClickLocation();
                double d0 = vec3d.x - (double)placePos.getX();
                double d1 = vec3d.z - (double)placePos.getZ();
                return (j >= 0 || !(d1 < 0.5D)) && (j <= 0 || !(d1 > 0.5D)) && (k >= 0 || !(d0 > 0.5D)) && (k <= 0 || !(d0 < 0.5D)) ? DoorHingeSide.LEFT : DoorHingeSide.RIGHT;
            } else {
                return DoorHingeSide.LEFT;
            }
        } else {
            return DoorHingeSide.RIGHT;
        }
    }

    @Override
    public ActionResultType use(BlockState state, World level, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
    	if (this.material == Material.METAL && !state.is(DDTags.HAND_OPENABLE_TALL_METAL_DOORS)) {
            return ActionResultType.PASS;
        } 
    	else {
        	if (this == DDBlocks.TALL_GOLD_DOOR.get() && state.getValue(POWERED)) {
        		return ActionResultType.PASS;
        	}
        	tryOpenDoubleDoor(level, state, pos);
            state = state.cycle(OPEN);
            level.setBlock(pos, state, 10);
            level.levelEvent(player, state.getValue(OPEN) ? this.getOpenSound() : this.getCloseSound(), pos, 0);
            if (this == DDBlocks.TALL_TOOTH_DOOR.get()) {
            	level.getBlockTicks().scheduleTick(pos, this, 20);
            }
            return ActionResultType.sidedSuccess(level.isClientSide);
        }
    }

	@Override
	public void tick(BlockState state, ServerWorld level, BlockPos pos, Random random) {
		if (!level.isClientSide) {
			state = state.cycle(OPEN);
			level.setBlock(pos, state, 10);
			level.levelEvent(null, state.getValue(OPEN) ? this.getOpenSound() : this.getCloseSound(), pos, 0);
		}
	}
    
    public void toggleDoor(World level, BlockPos pos, boolean open) {
        BlockState blockstate = level.getBlockState(pos);
        if (blockstate.getBlock() == this && blockstate.getValue(OPEN) != open) {
            level.setBlock(pos, blockstate.setValue(OPEN, open), 10);
            if (blockstate.getValue(THIRD) == TripleBlockPart.UPPER) {
                BlockState middle = level.getBlockState(pos.below());
                BlockState bottom = level.getBlockState(pos.below(2));
                if (middle.getBlock() == this) {
                    level.setBlock(pos.below(), middle.setValue(OPEN, open), 10);
                }
                if (bottom.getBlock() == this) {
                    level.setBlock(pos.below(2), middle.setValue(OPEN, open), 10);
                }
            }
            this.playSound(level, pos, open);
        }
    }
    
	public boolean isOpen(BlockState state) {
		return state.getValue(OPEN);
	}

	public void setOpen(@Nullable Entity entity, World level, BlockState state, BlockPos pos, boolean open) {
		if (state.is(this) && state.getValue(OPEN) != open) {
			level.setBlock(pos, state.setValue(OPEN, Boolean.valueOf(open)), 10);
			this.playSound(level, pos, open);
		}
 	}

    @Override
    public void neighborChanged(BlockState state, World level, BlockPos pos, Block blockIn, BlockPos fromPos, boolean isMoving) {
        boolean flag = level.hasNeighborSignal(pos);
        if (!flag) {
            switch(state.getValue(THIRD)) {
                case LOWER:
                    flag = level.hasNeighborSignal(pos.relative(Direction.UP)) || level.hasNeighborSignal(pos.relative(Direction.UP, 2));
                    break;
                case MIDDLE:
                    flag = level.hasNeighborSignal(pos.relative(Direction.DOWN)) || level.hasNeighborSignal(pos.relative(Direction.UP));
                    break;
                case UPPER:
                    flag = level.hasNeighborSignal(pos.relative(Direction.DOWN)) || level.hasNeighborSignal(pos.relative(Direction.DOWN, 2));
                    break;
            }
        }
        if (blockIn != this && flag != state.getValue(POWERED)) {
        	if (this == DDBlocks.TALL_GOLD_DOOR.get()) {
        		level.setBlock(pos, state.setValue(POWERED, flag), 2);
        	}
        	else {
	            if (flag != state.getValue(OPEN)) {
	                this.playSound(level, pos, flag);
	            }
	            tryOpenDoubleDoor(level, state, pos);
	            level.setBlock(pos, state.setValue(POWERED, flag).setValue(OPEN, flag), 2);
        	}
        }
    }

    @Override
    public boolean canSurvive(BlockState state, IWorldReader level, BlockPos pos) {
        boolean result;
        BlockPos below = pos.below();
        BlockPos below2 = below.below();
        BlockState belowState = level.getBlockState(below);
        BlockState below2State = level.getBlockState(below2);
        if (state.getValue(THIRD) == TripleBlockPart.LOWER) {
            result = belowState.isFaceSturdy(level, below, Direction.UP);
            return result;
        } else if (state.getValue(THIRD) == TripleBlockPart.MIDDLE) {
            result = belowState.getBlock() == this;
            return result;
        } else {
            result = belowState.getBlock() == this && below2State.getBlock() == this;
            return result;
        }
    }

    private void playSound(World level, BlockPos pos, boolean isOpen) {
        level.levelEvent(null, isOpen ? this.getOpenSound() : this.getCloseSound(), pos, 0);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public long getSeed(BlockState state, BlockPos pos) {
        return MathHelper.getSeed(pos.getX(), pos.below(state.getValue(THIRD) == TripleBlockPart.LOWER ? 0 : state.getValue(THIRD) == TripleBlockPart.MIDDLE ? 1 : 2).getY(), pos.getZ());
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(THIRD, FACING, OPEN, HINGE, POWERED, WATERLOGGED);
    }
    
    @Override
	public FluidState getFluidState(BlockState state) {
		return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : Fluids.EMPTY.defaultFluidState();
	}

    public VoxelShape getShape(BlockState state, IBlockReader level, BlockPos pos, ISelectionContext context) {
        Direction direction = state.getValue(FACING);
        boolean flag = !state.getValue(OPEN);
        boolean flag1 = state.getValue(HINGE) == DoorHingeSide.RIGHT;
        switch(direction) {
            case EAST:
            default:
                return flag ? EAST_AABB : (flag1 ? NORTH_AABB : SOUTH_AABB);
            case SOUTH:
                return flag ? SOUTH_AABB : (flag1 ? EAST_AABB : WEST_AABB);
            case WEST:
                return flag ? WEST_AABB : (flag1 ? SOUTH_AABB : NORTH_AABB);
            case NORTH:
                return flag ? NORTH_AABB : (flag1 ? WEST_AABB : EAST_AABB);
        }
    }

    public boolean allowsMovement(BlockState state, IBlockReader level, BlockPos pos, PathType type) {
        switch(type) {
            case LAND:
                return state.getValue(OPEN);
            case WATER:
                return false;
            case AIR:
                return state.getValue(OPEN);
            default:
                return false;
        }
    }

    public PushReaction getPushReaction(BlockState state) {
        return PushReaction.DESTROY;
    }

    public BlockState rotate(BlockState state, Rotation rot) {
        return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
    }

    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return mirrorIn == Mirror.NONE ? state : state.rotate(mirrorIn.getRotation(state.getValue(FACING))).cycle(HINGE);
    }
    
    // TODO: Figure out if Zombie breaking Tall Doors is feasible...
    public static boolean isWoodenDoor(World level, BlockPos pos) {
    	return isWoodenDoor(level.getBlockState(pos));
    }

	public static boolean isWoodenDoor(BlockState state) {
		return state.getBlock() instanceof TallDoorBlock && (state.getMaterial() == Material.WOOD || state.getMaterial() == Material.NETHER_WOOD);
	}
	
	//Double Doors Compatibility
	public static void tryOpenDoubleDoor(World world, BlockState state, BlockPos pos) {
        if (Compats.DOUBLE_DOORS_INSTALLED || QuarkCompat.hasQuarkDoubleDoorsModule()) {
            Direction direction = state.getValue(TallDoorBlock.FACING);
            boolean isOpen = state.getValue(TallDoorBlock.OPEN);
            DoorHingeSide isMirrored = state.getValue(TallDoorBlock.HINGE);
            BlockPos mirrorPos = pos.relative(isMirrored == DoorHingeSide.RIGHT ? direction.getCounterClockWise() : direction.getClockWise());
            BlockPos doorPos = state.getValue(TallDoorBlock.THIRD) == TripleBlockPart.LOWER ? mirrorPos : mirrorPos.below();
            BlockState other = world.getBlockState(doorPos);
            if (other.getBlock() == state.getBlock() && other.getValue(TallDoorBlock.FACING) == direction && !other.getValue(TallDoorBlock.POWERED) &&  other.getValue(TallDoorBlock.OPEN) == isOpen && other.getValue(TallDoorBlock.HINGE) != isMirrored) {
                BlockState newState = other.cycle(TallDoorBlock.OPEN);
                world.setBlock(doorPos, newState, 10);
            }
        }
    }
}