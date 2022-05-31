package com.fizzware.dramaticdoors.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.entity.ai.pathing.LandPathNodeMaker;
import net.minecraft.entity.ai.pathing.PathNodeType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

@Mixin(LandPathNodeMaker.class)
public class LandPathNodeMakerMixin
{
	@Inject(at = @At("RETURN"), locals = LocalCapture.CAPTURE_FAILSOFT, method = "getCommonNodeType(Lnet/minecraft/world/BlockView;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/entity/ai/pathing/PathNodeType;", cancellable = true)
	private static void injectDoorType(BlockView world, BlockPos pos, CallbackInfoReturnable<PathNodeType> callback, BlockState blockState, Block block, Material material) {
		if (TallDoorBlock.isWoodenDoor(blockState) && !world.getBlockState(pos).get(TallDoorBlock.OPEN).booleanValue()) {
            callback.setReturnValue(PathNodeType.DOOR_WOOD_CLOSED);
        }
	}
}
