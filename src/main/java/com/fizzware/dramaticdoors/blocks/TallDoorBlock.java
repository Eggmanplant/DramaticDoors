package com.fizzware.dramaticdoors.blocks;

import org.jetbrains.annotations.Nullable;
import com.fizzware.dramaticdoors.DDTags;
import com.fizzware.dramaticdoors.compat.Compats;
import com.fizzware.dramaticdoors.state.properties.DDProperties;
import com.fizzware.dramaticdoors.state.properties.TripleBlockPart;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.Material;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.enums.DoorHinge;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.resource.featuretoggle.FeatureFlag;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.*;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.minecraft.world.event.GameEvent;

public class TallDoorBlock extends Block {

    public static final EnumProperty<TripleBlockPart> THIRD = DDProperties.TRIPLE_BLOCK_THIRD;
    public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
    public static final BooleanProperty OPEN = Properties.OPEN;
    public static final EnumProperty<DoorHinge> HINGE = Properties.DOOR_HINGE;
    public static final BooleanProperty POWERED = Properties.POWERED;
    protected static final VoxelShape SOUTH_AABB = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 3.0D);
    protected static final VoxelShape NORTH_AABB = Block.createCuboidShape(0.0D, 0.0D, 13.0D, 16.0D, 16.0D, 16.0D);
    protected static final VoxelShape WEST_AABB = Block.createCuboidShape(13.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);
    protected static final VoxelShape EAST_AABB = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 3.0D, 16.0D, 16.0D);
    protected final SoundEvent closeSound;
    protected final SoundEvent openSound;

    public TallDoorBlock(Block from, SoundEvent closeSound, SoundEvent openSound) {
        super(Settings.copy(from));
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH).with(OPEN, Boolean.FALSE).with(HINGE, DoorHinge.LEFT).with(POWERED, Boolean.FALSE).with(THIRD, TripleBlockPart.LOWER));
	    this.closeSound = closeSound;
	    this.openSound = openSound;
    }
    
    public TallDoorBlock(Block from, SoundEvent closeSound, SoundEvent openSound, FeatureFlag flag) {
        super(Settings.copy(from).requires(flag));
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH).with(OPEN, Boolean.FALSE).with(HINGE, DoorHinge.LEFT).with(POWERED, Boolean.FALSE).with(THIRD, TripleBlockPart.LOWER));
        this.closeSound = closeSound;
        this.openSound = openSound;

    }

	@SuppressWarnings("deprecation")
	@Override
    public BlockState getStateForNeighborUpdate(BlockState stateIn, Direction facing, BlockState facingState, WorldAccess level, BlockPos currentPos, BlockPos facingPos) {
        TripleBlockPart tripleblockpart = stateIn.get(THIRD);
        if (facing.getAxis() == Direction.Axis.Y && ((tripleblockpart == TripleBlockPart.LOWER == (facing == Direction.UP)) || tripleblockpart == TripleBlockPart.MIDDLE)) {
            if (facingState.getBlock() == this && facingState.get(THIRD) != tripleblockpart) {
                return stateIn.with(FACING, facingState.get(FACING)).with(OPEN, facingState.get(OPEN)).with(HINGE, facingState.get(HINGE)).with(POWERED, facingState.get(POWERED));
            } else {
                return Blocks.AIR.getDefaultState();
            }
        } else {
            if (tripleblockpart == TripleBlockPart.LOWER && facing == Direction.DOWN && !stateIn.canPlaceAt(level, currentPos)) {
                return Blocks.AIR.getDefaultState();
            } else {
                return super.getStateForNeighborUpdate(stateIn, facing, facingState, level, currentPos, facingPos);
            }
        }
    }

    @Override
    public void onBreak(World level, BlockPos pos, BlockState state, PlayerEntity player) {
        if (!level.isClient && player.isCreative()) {
            BlockPos otherPos1 = pos;
            BlockPos otherPos2 = pos;
            TripleBlockPart tripleblockpart = state.get(THIRD);
            switch (tripleblockpart) {
                case LOWER:
                    otherPos1 = pos.up();
                    otherPos2 = pos.up(2);
                    break;
                case MIDDLE:
                    otherPos1 = pos.down();
                    otherPos2 = pos.up();
                    break;
                case UPPER:
                    otherPos1 = pos.down(2);
                    otherPos2 = pos.down();
                    break;
            }
            BlockState blockstate1 = level.getBlockState(otherPos1);
            BlockState blockstate2 = level.getBlockState(otherPos2);
            if (blockstate1.getBlock() == state.getBlock() && blockstate1.get(THIRD) == TripleBlockPart.LOWER) {
                level.setBlockState(otherPos1, Blocks.AIR.getDefaultState(), 35);
                level.syncWorldEvent(player, 2001, otherPos1, Block.getRawIdFromState(blockstate1));
            }
            if (blockstate2.getBlock() == state.getBlock() && blockstate2.get(THIRD) == TripleBlockPart.LOWER) {
                level.setBlockState(otherPos2, Blocks.AIR.getDefaultState(), 35);
                level.syncWorldEvent(player, 2001, otherPos1, Block.getRawIdFromState(blockstate1));
            }
        }
        super.onBreak(level, pos, state, player);
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext context) {
        BlockPos blockpos = context.getBlockPos();
        if (blockpos.getY() < context.getWorld().getTopY() - 2 && context.getWorld().getBlockState(blockpos.up()).canReplace(context) && context.getWorld().getBlockState(blockpos.up(2)).canReplace(context)) {
            World level = context.getWorld();
            boolean flag = level.isReceivingRedstonePower(blockpos) || level.isReceivingRedstonePower(blockpos.up());
            return this.getDefaultState().with(FACING, context.getPlayerFacing()).with(HINGE, this.getHinge(context)).with(POWERED, flag).with(OPEN, flag).with(THIRD, TripleBlockPart.LOWER);
        } else {
            return null;
        }
    }

    @Override
    public void onPlaced(World level, BlockPos pos, BlockState state, LivingEntity placer, ItemStack stack) {
        level.setBlockState(pos.up(), state.with(THIRD, TripleBlockPart.MIDDLE), 3);
        level.setBlockState(pos.up(2), state.with(THIRD, TripleBlockPart.UPPER), 3);
    }

    private DoorHinge getHinge(ItemPlacementContext context) {
        World blockView = context.getWorld();
        BlockPos placePos = context.getBlockPos();
        Direction behindDir = context.getPlayerFacing(); // Behind
        BlockPos placePosAbove = placePos.up();
        Direction leftDir = behindDir.rotateYCounterclockwise(); // Left
        BlockPos leftPos = placePos.offset(leftDir); // Left Pos
        BlockState leftBlockstate = blockView.getBlockState(leftPos); // Left BlockState
        BlockPos leftPosAbove = placePosAbove.offset(leftDir); // Left Up Pos
        BlockState leftAboveBlockstate = blockView.getBlockState(leftPosAbove); // Left Up BlockState
        Direction rightDir = behindDir.rotateYClockwise(); // Right
        BlockPos rightPos = placePos.offset(rightDir); // Right Pos
        BlockState rightBlockstate = blockView.getBlockState(rightPos); // Right Blockstate
        BlockPos rightPosAbove = placePosAbove.offset(rightDir); // Right Up Pos
        BlockState rightAboveBlockstate = blockView.getBlockState(rightPosAbove); // Right Up Blockstate
        int i = (leftBlockstate.isFullCube(blockView, leftPos) ? -1 : 0) + (leftAboveBlockstate.isFullCube(blockView, leftPosAbove) ? -1 : 0) + (rightBlockstate.isFullCube(blockView, rightPos) ? 1 : 0) + (rightAboveBlockstate.isFullCube(blockView, rightPosAbove) ? 1 : 0);
        boolean leftIsLowerOfSameType = leftBlockstate.getBlock() == this && leftBlockstate.get(THIRD) == TripleBlockPart.LOWER;
        boolean rightIsLowerOfSameType = rightBlockstate.getBlock() == this && rightBlockstate.get(THIRD) == TripleBlockPart.LOWER;
        if ((!leftIsLowerOfSameType || rightIsLowerOfSameType) && i <= 0) {
            if ((!rightIsLowerOfSameType || leftIsLowerOfSameType) && i >= 0) {
                int j = behindDir.getOffsetX();
                int k = behindDir.getOffsetZ();
                Vec3d vec3d = context.getHitPos();
                double d0 = vec3d.x - (double)placePos.getX();
                double d1 = vec3d.z - (double)placePos.getZ();
                return (j >= 0 || !(d1 < 0.5D)) && (j <= 0 || !(d1 > 0.5D)) && (k >= 0 || !(d0 > 0.5D)) && (k <= 0 || !(d0 < 0.5D)) ? DoorHinge.LEFT : DoorHinge.RIGHT;
            } else {
                return DoorHinge.LEFT;
            }
        } else {
            return DoorHinge.RIGHT;
        }
    }

    @Override
    public ActionResult onUse(BlockState state, World level, BlockPos pos, PlayerEntity player, Hand handIn, BlockHitResult hit) {
    	if (this.material == Material.METAL && !state.isIn(DDTags.HAND_OPENABLE_TALL_METAL_DOORS) || (this == DDBlocks.TALL_GOLD_DOOR && state.get(POWERED))) {
            return ActionResult.PASS;
        } 
    	else {
        	if (this == DDBlocks.TALL_GOLD_DOOR && state.get(POWERED)) {
        		return ActionResult.PASS;
        	}
        	tryOpenDoubleDoor(level, state, pos);
            state = state.cycle(OPEN);
            level.setBlockState(pos, state, 10);
            this.playOpenCloseSound(player, level, pos, state.get(OPEN));
            level.emitGameEvent(player, state.get(OPEN) ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pos);
            return ActionResult.success(level.isClient);
        }
    }

    public void toggleDoor(World level, BlockPos pos, boolean open) {
        BlockState blockstate = level.getBlockState(pos);
        if (blockstate.getBlock() == this && blockstate.get(OPEN) != open) {
            level.setBlockState(pos, blockstate.with(OPEN, open), 10);
            if (blockstate.get(THIRD) == TripleBlockPart.UPPER) {
                BlockState middle = level.getBlockState(pos.down());
                BlockState bottom = level.getBlockState(pos.down(2));
                if (middle.getBlock() == this) {
                    level.setBlockState(pos.down(), middle.with(OPEN, open), 10);
                }
                if (bottom.getBlock() == this) {
                    level.setBlockState(pos.down(2), middle.with(OPEN, open), 10);
                }
            }
            this.playOpenCloseSound(null, level, pos, open);
        }
    }

	public boolean isOpen(BlockState state) {
		return state.get(OPEN);
	}

	public void setOpen(@Nullable Entity entity, World level, BlockState state, BlockPos pos, boolean open) {
		if (state.isOf(this) && state.get(OPEN) != open) {
			level.setBlockState(pos, state.with(OPEN, Boolean.valueOf(open)), 10);
			this.playOpenCloseSound(entity, level, pos, open);
			level.emitGameEvent(entity, open ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pos);
		}
 	}
    
    @Override
    public void neighborUpdate(BlockState state, World level, BlockPos pos, Block blockIn, BlockPos fromPos, boolean isMoving) {
        boolean flag = level.isReceivingRedstonePower(pos);
        if (!flag) {
            switch(state.get(THIRD)) {
                case LOWER:
                    flag = level.isReceivingRedstonePower(pos.offset(Direction.UP)) || level.isReceivingRedstonePower(pos.offset(Direction.UP, 2));
                    break;
                case MIDDLE:
                    flag = level.isReceivingRedstonePower(pos.offset(Direction.DOWN)) || level.isReceivingRedstonePower(pos.offset(Direction.UP));
                    break;
                case UPPER:
                    flag = level.isReceivingRedstonePower(pos.offset(Direction.DOWN)) || level.isReceivingRedstonePower(pos.offset(Direction.DOWN, 2));
                    break;
            }
        }
        if (blockIn != this && flag != state.get(POWERED)) {
        	if (this == DDBlocks.TALL_GOLD_DOOR) {
        		level.setBlockState(pos, state.with(POWERED, flag), 2);
        	}
        	else {
	            if (flag != state.get(OPEN)) {
	                this.playOpenCloseSound(null, level, pos, flag);
	            }
	            tryOpenDoubleDoor(level, state, pos);
	            level.setBlockState(pos, state.with(POWERED, flag).with(OPEN, flag), 2);
        	}
        }
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView level, BlockPos pos) {
        boolean result;
        BlockPos below = pos.down();
        BlockPos below2 = below.down();
        BlockState belowState = level.getBlockState(below);
        BlockState below2State = level.getBlockState(below2);
        if (state.get(THIRD) == TripleBlockPart.LOWER) {
            result = belowState.isSideSolidFullSquare(level, below, Direction.UP);
            return result;
        } else if (state.get(THIRD) == TripleBlockPart.MIDDLE) {
            result = belowState.getBlock() == this;
            return result;
        } else {
            result = belowState.getBlock() == this && below2State.getBlock() == this;
            return result;
        }
    }

    protected void playOpenCloseSound(@Nullable Entity entity, World world, BlockPos pos, boolean open) {
        world.playSound(entity, pos, open ? this.openSound : this.closeSound, SoundCategory.BLOCKS, 1.0f, world.getRandom().nextFloat() * 0.1f + 0.9f);
    }

    @Override
    public long getRenderingSeed(BlockState state, BlockPos pos) {
        return  MathHelper.hashCode(pos.getX(), pos.down(state.get(THIRD) == TripleBlockPart.LOWER ? 0 : state.get(THIRD) == TripleBlockPart.MIDDLE ? 1 : 2).getY(), pos.getZ());
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(THIRD, FACING, OPEN, HINGE, POWERED);
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView level, BlockPos pos, ShapeContext context) {
        Direction direction = state.get(FACING);
        boolean flag = !state.get(OPEN);
        boolean flag1 = state.get(HINGE) == DoorHinge.RIGHT;
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

    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        switch(type) {
            case LAND:
                return state.get(OPEN);
            case WATER:
                return false;
            case AIR:
                return state.get(OPEN);
            default:
                return false;
        }
    }

    public PistonBehavior getPushReaction(BlockState state) {
        return PistonBehavior.DESTROY;
    }

    public BlockState rotate(BlockState state, BlockRotation rot) {
        return state.with(FACING, rot.rotate(state.get(FACING)));
    }

    public BlockState mirror(BlockState state, BlockMirror mirrorIn) {
        return mirrorIn == BlockMirror.NONE ? state : state.rotate(mirrorIn.getRotation(state.get(FACING))).cycle(HINGE);
    }

    // TODO: Figure out if Zombie breaking Tall Doors is feasible...
    public static boolean isWoodenDoor(World level, BlockPos pos) {
    	return isWoodenDoor(level.getBlockState(pos));
    }

	public static boolean isWoodenDoor(BlockState state) {
		return state.getBlock() instanceof TallDoorBlock && (state.isIn(DDTags.TALL_WOODEN_DOORS));
	}
    
    //Double Doors Compatibility.
	public static void tryOpenDoubleDoor(World world, BlockState state, BlockPos pos) {
        if (Compats.DOUBLE_DOORS_INSTALLED || Compats.COUPLINGS_INSTALLED) {
            Direction direction = state.get(TallDoorBlock.FACING);
            boolean isOpen = state.get(TallDoorBlock.OPEN);
            DoorHinge isMirrored = state.get(TallDoorBlock.HINGE);
            BlockPos mirrorPos = pos.offset(isMirrored == DoorHinge.RIGHT ? direction.rotateYCounterclockwise() : direction.rotateYClockwise());
            BlockPos doorPos = state.get(TallDoorBlock.THIRD) == TripleBlockPart.LOWER ? mirrorPos : mirrorPos.down();
            BlockState other = world.getBlockState(doorPos);
            if (other.getBlock() == state.getBlock() && other.get(TallDoorBlock.FACING) == direction && !other.get(TallDoorBlock.POWERED) &&  other.get(TallDoorBlock.OPEN) == isOpen && other.get(TallDoorBlock.HINGE) != isMirrored) {
                BlockState newState = other.cycle(TallDoorBlock.OPEN);
                world.setBlockState(doorPos, newState, 10);
            }
        }
    }
}