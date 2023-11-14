package com.fizzware.dramaticdoors.forge.addons.framedblocks.client;

import org.jetbrains.annotations.Nullable;

import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.state.properties.TripleBlockPart;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import xfacthd.framedblocks.api.ghost.CamoPair;
import xfacthd.framedblocks.api.ghost.GhostRenderBehaviour;

public class TallDoorGhostRenderBehaviour implements GhostRenderBehaviour
{
    @Override
    public boolean hasSecondBlock(ItemStack stack, ItemStack proxiedStack) { return true; }

    @Override
    @Nullable
    public BlockState getRenderState(ItemStack stack, ItemStack proxiedStack, BlockHitResult hit, BlockPlaceContext ctx, BlockState hitState, boolean secondPass)
    {
        BlockState state = GhostRenderBehaviour.super.getRenderState(stack, proxiedStack, hit, ctx, hitState, secondPass);
        BlockState state2 = GhostRenderBehaviour.super.getRenderState(stack, proxiedStack, hit, ctx, hitState, secondPass);
        if (state != null && secondPass)
        {
            state = state.setValue(TallDoorBlock.THIRD, TripleBlockPart.MIDDLE);
            state2 = state2.setValue(TallDoorBlock.THIRD, TripleBlockPart.UPPER);
        }
        return state;
    }

    @Override
    public BlockPos getRenderPos(ItemStack stack, ItemStack proxiedStack, BlockHitResult hit, BlockPlaceContext ctx, BlockState hitState, BlockPos defaultPos, boolean secondPass)
    {
        return secondPass ? defaultPos.above() : defaultPos;
    }

    @Override
    public boolean canRenderAt(ItemStack stack, ItemStack proxiedStack, BlockHitResult hit, BlockPlaceContext ctx, BlockState hitState, BlockState renderState, BlockPos renderPos)
    {
        return GhostRenderBehaviour.super.canRenderAt(stack, proxiedStack, hit, ctx, hitState, renderState, renderPos) && GhostRenderBehaviour.super.canRenderAt(stack, proxiedStack, hit, ctx, hitState, renderState, renderPos.above()) && GhostRenderBehaviour.super.canRenderAt(stack, proxiedStack, hit, ctx, hitState, renderState, renderPos.above(2));
    }

    @Override
    public CamoPair readCamo(ItemStack stack, @Nullable ItemStack proxiedStack, boolean secondPass)
    {
        if (secondPass)
        {
            return CamoPair.EMPTY;
        }
        return GhostRenderBehaviour.super.readCamo(stack, proxiedStack, false);
    }

    @Override
    public CamoPair postProcessCamo(ItemStack stack, ItemStack proxiedStack, BlockPlaceContext ctx, BlockState renderState, boolean secondPass, CamoPair camo)
    {
        return secondPass ? camo.swap() : camo;
    }
}
