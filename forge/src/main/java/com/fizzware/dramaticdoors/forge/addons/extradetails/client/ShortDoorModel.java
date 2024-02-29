package com.fizzware.dramaticdoors.forge.addons.extradetails.client;

import java.util.List;

import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.blocks.ShortDoorBlock;

import me.pandamods.pandalib.client.animation_controller.AnimationControllerProvider;
import me.pandamods.pandalib.client.model.Armature;
import me.pandamods.pandalib.client.model.MeshModel;
import me.pandamods.pandalib.utils.RenderUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;

public class ShortDoorModel implements MeshModel<ShortDoorClientBlock>
{
	@Override
	public ResourceLocation getMeshLocation(ShortDoorClientBlock base) {
		return new ResourceLocation(DramaticDoors.MOD_ID, "pandalib/meshes/block/door/short_door.json");
	}

	@Override
	public ResourceLocation getTextureLocation(String textureName, ShortDoorClientBlock base) {
		List<ResourceLocation> textures = RenderUtils.getBlockTextures(base.getBlockState());
		ResourceLocation resourceLocation = textures.get(0);
		if (resourceLocation.getPath().endsWith(".png")) {
			return new ResourceLocation(resourceLocation.getNamespace(), "textures/" + resourceLocation.getPath());
		}
		return new ResourceLocation(resourceLocation.getNamespace(), "textures/" + resourceLocation.getPath() + ".png");
	}

	@Override
	public AnimationControllerProvider<ShortDoorClientBlock> createAnimationController() {
		return ShortDoorAnimationController::new;
	}

	@Override
	public void setPropertiesOnCreation(ShortDoorClientBlock base, Armature armature) {
		boolean mirror = base.getBlockState().getValue(ShortDoorBlock.HINGE) == DoorHingeSide.RIGHT;
		armature.mirrorX(mirror, false, false);
		armature.mirrorY(false, mirror, false);
	}
}
