package com.fizzware.dramaticdoors.blocks;

import com.fizzware.dramaticdoors.blockentities.TallNetheriteDoorBlockEntity;
import com.fizzware.dramaticdoors.state.properties.TripleBlockPart;

import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

public class TallNetheriteDoorBlock extends TallDoorBlock implements BlockEntityProvider
{
	public TallNetheriteDoorBlock(Block from) {
		super(from);
	}

	@Override
	public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
		if (state.get(THIRD) == TripleBlockPart.LOWER) {
			return new TallNetheriteDoorBlockEntity(pos, state);
		}
		return null;
	}
	
	@Override
    public ActionResult onUse(BlockState state, World level, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
		BlockPos delegatedPos = state.get(THIRD) == TripleBlockPart.LOWER ? pos : (state.get(THIRD) == TripleBlockPart.UPPER ? pos.down(2) : pos.down(1));
		BlockEntity be = level.getBlockEntity(delegatedPos);
		//Execute action.
		if (be != null && be instanceof TallNetheriteDoorBlockEntity) {
			TallNetheriteDoorBlockEntity door = (TallNetheriteDoorBlockEntity) be;
			if (door.handleAction(player, hand, "door")) {
				tryOpenDoubleDoor(level, state, pos);
				BlockState newState = state.cycle(OPEN);
				level.setBlockState(pos, newState, 10);
	            level.syncWorldEvent(player, state.get(OPEN) ? this.getOpenSound() : this.getCloseSound(), pos, 0);
	            level.emitGameEvent(player, state.get(OPEN) ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pos);
			}
		}
	    return ActionResult.success(level.isClient);
	}
	
	@Override
    public void neighborUpdate(BlockState state, World level, BlockPos pos, Block blockIn, BlockPos fromPos, boolean isMoving) {
		//Tall Netherite door doesn't change with redstone.
	}
}
