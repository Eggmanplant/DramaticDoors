package com.fizzware.dramaticdoors.fabric.addons.extradetails.client;

import org.joml.Math;
import org.joml.Vector3f;

import com.fizzware.dramaticdoors.blocks.ShortDoorBlock;
import com.fizzware.dramaticdoors.tags.DDBlockTags;
import com.mojang.blaze3d.vertex.PoseStack;

import me.pandamods.extra_details.ExtraDetails;
import me.pandamods.extra_details.api.client.render.block.extensions.MeshClientBlockRenderer;
import me.pandamods.extra_details.pandalib.client.model.Armature;
import me.pandamods.extra_details.pandalib.utils.RenderUtils;
import me.pandamods.extra_details.pandalib.utils.VectorUtils;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockState;

public class ShortDoorRenderer extends MeshClientBlockRenderer<ShortDoorClientBlock, ShortDoorModel>
{
	public ShortDoorRenderer() {
		super(new ShortDoorModel());
	}

	@Override
	public RenderShape getRenderShape(BlockState state) {
		return RenderShape.INVISIBLE;
	}

	@Override
	public boolean enabled(BlockState state) {
		return ExtraDetails.getConfig().blockSettings.door.enabled && ExtraDetails.getConfig().isAllowed(state.getBlock()) && !state.is(DDBlockTags.EXTRA_DETAILS_BLACKLIST);
	}

	@Override
	public void render(ShortDoorClientBlock block, PoseStack poseStack, MultiBufferSource buffer, int lightColor, int overlay, float partialTick) {
		this.renderRig(block, this.model, poseStack, buffer, lightColor, overlay);
		BlockState blockState = block.getBlockState().setValue(ShortDoorBlock.FACING, Direction.NORTH).setValue(ShortDoorBlock.OPEN, false);
		poseStack.pushPose();
		Armature armature = block.getCache().armature;
		if (armature != null) {
			VectorUtils.rotateByPivot(poseStack, new Vector3f(.5f, 0, .5f), new Vector3f(0, Math.toRadians(this.getYRotation(block.getBlockState()) + 180), 0));
			armature.getBone("short_door").ifPresent(bone -> bone.applyToPoseStack(poseStack));
			RenderUtils.renderBlock(poseStack, blockState, block.getBlockPos(), block.getLevel(), buffer.getBuffer(ItemBlockRenderTypes.getRenderType(blockState, false)), lightColor, overlay);
		}
		poseStack.popPose();
	}
}
