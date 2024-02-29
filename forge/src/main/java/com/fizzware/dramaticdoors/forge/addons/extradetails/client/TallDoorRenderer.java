package com.fizzware.dramaticdoors.forge.addons.extradetails.client;

import org.joml.Math;
import org.joml.Vector3f;

import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.state.properties.TripleBlockPart;
import com.fizzware.dramaticdoors.tags.DDBlockTags;
import com.mojang.blaze3d.vertex.PoseStack;

import me.pandamods.extra_details.ExtraDetails;
import me.pandamods.pandalib.client.model.Armature;
import me.pandamods.pandalib.client.render.block.extensions.MeshClientBlockRenderer;
import me.pandamods.pandalib.utils.RenderUtils;
import me.pandamods.pandalib.utils.VectorUtils;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockState;

public class TallDoorRenderer extends MeshClientBlockRenderer<TallDoorClientBlock, TallDoorModel>
{
	public TallDoorRenderer() {
		super(new TallDoorModel());
	}
	
	@Override
	public RenderShape getRenderShape(BlockState state) {
		return RenderShape.INVISIBLE;
	}

	@Override
	public boolean enabled(BlockState state) {
		return ExtraDetails.getConfig().blockSettings.door.enabled && ExtraDetails.getConfig().isAllowed(state.getBlock()) && !state.is(DDBlockTags.EXTRA_DETAILS_BLACKLIST);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void render(TallDoorClientBlock block, PoseStack poseStack, MultiBufferSource buffer, int lightColor, int overlay, float partialTick) {
		if (block.getBlockState().getValue(TallDoorBlock.THIRD) == TripleBlockPart.LOWER) {
			this.renderRig(block, this.model, poseStack, buffer, lightColor, overlay, false);

			BlockState blockState = block.getBlockState().setValue(TallDoorBlock.FACING, Direction.NORTH).setValue(TallDoorBlock.OPEN, false).setValue(TallDoorBlock.THIRD, TripleBlockPart.LOWER);

			poseStack.pushPose();
			Armature armature = block.getCache().armature;
			if (armature != null) {
				VectorUtils.rotateByPivot(poseStack, new Vector3f(.5f, 0, .5f), new Vector3f(0, Math.toRadians(this.getYRotation(block.getBlockState()) + 180), 0));
				armature.getBone("door").ifPresent(bone -> bone.applyToPoseStack(poseStack));

				RenderUtils.renderBlock(poseStack, blockState, block.getBlockPos(), block.getLevel(), buffer.getBuffer(ItemBlockRenderTypes.getRenderType(blockState, false)), lightColor, overlay);

				poseStack.translate(0, 1, 0);

				RenderUtils.renderBlock(poseStack, blockState.setValue(TallDoorBlock.THIRD, TripleBlockPart.MIDDLE), block.getBlockPos(), block.getLevel(), buffer.getBuffer(ItemBlockRenderTypes.getRenderType(blockState, false)), lightColor, overlay);

				poseStack.translate(0, 1, 0);

				RenderUtils.renderBlock(poseStack, blockState.setValue(TallDoorBlock.THIRD, TripleBlockPart.UPPER), block.getBlockPos(), block.getLevel(), buffer.getBuffer(ItemBlockRenderTypes.getRenderType(blockState, false)), lightColor, overlay);
			}
			poseStack.popPose();
		}
	}
}
