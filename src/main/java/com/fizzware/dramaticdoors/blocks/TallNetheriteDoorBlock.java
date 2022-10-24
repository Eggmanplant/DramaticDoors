package com.fizzware.dramaticdoors.blocks;

import com.fizzware.dramaticdoors.blockentities.TallNetheriteDoorBlockEntity;
import com.fizzware.dramaticdoors.state.properties.TripleBlockPart;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class TallNetheriteDoorBlock extends TallDoorBlock
{
	public TallNetheriteDoorBlock(Block from) {
		super(from);
	}

	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		if (state.getValue(THIRD) == TripleBlockPart.LOWER) {
			return new TallNetheriteDoorBlockEntity();
		}
		return null;
	}
	
	@Override
    public ActionResultType use(BlockState state, World level, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult hit) {
		BlockPos delegatedPos = state.getValue(THIRD) == TripleBlockPart.LOWER ? pos : (state.getValue(THIRD) == TripleBlockPart.UPPER ? pos.below(2) : pos.below(1));
		TileEntity be = level.getBlockEntity(delegatedPos);
		//Execute action.
		if (be != null && be instanceof TallNetheriteDoorBlockEntity) {
			TallNetheriteDoorBlockEntity door = (TallNetheriteDoorBlockEntity) be;
			if (door.handleAction(player, hand, "door")) {
				tryOpenDoubleDoor(level, state, pos);
				BlockState newState = state.cycle(OPEN);
				level.setBlock(pos, newState, 10);
	            level.levelEvent(player, state.getValue(OPEN) ? this.getOpenSound() : this.getCloseSound(), pos, 0);
			}
		}
	    return ActionResultType.sidedSuccess(level.isClientSide);
	}
	
}
