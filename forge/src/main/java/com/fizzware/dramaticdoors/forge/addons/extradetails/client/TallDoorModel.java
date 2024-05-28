package com.fizzware.dramaticdoors.forge.addons.extradetails.client;

import java.util.List;
import java.util.Map;

import org.jetbrains.annotations.Nullable;

import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;

import me.pandamods.extra_details.pandalib.client.animation_controller.AnimationControllerProvider;
import me.pandamods.extra_details.pandalib.client.model.Armature;
import me.pandamods.extra_details.pandalib.client.model.MeshModel;
import me.pandamods.extra_details.pandalib.utils.RenderUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;

public class TallDoorModel implements MeshModel<TallDoorClientBlock>
{
	@Override
	public ResourceLocation getMeshLocation(TallDoorClientBlock base) {
		return new ResourceLocation(DramaticDoors.MOD_ID, "pandalib/meshes/block/door/tall_door.json");
	}

	@Override
	public @Nullable ResourceLocation getArmatureLocation(TallDoorClientBlock base) {
		return new ResourceLocation(DramaticDoors.MOD_ID, "pandalib/meshes/block/door/tall_door.json");
	}

	@Override
	public Map<String, ResourceLocation> getTextureLocations(TallDoorClientBlock base) {
		List<ResourceLocation> textures = RenderUtils.getBlockTextures(base.getBlockState());
		ResourceLocation resourceLocation = textures.get(0);
		if (resourceLocation.getPath().endsWith(".png")) {
			resourceLocation = new ResourceLocation(resourceLocation.getNamespace(), "textures/" + resourceLocation.getPath());
		}
		else {
			resourceLocation = new ResourceLocation(resourceLocation.getNamespace(), "textures/" + resourceLocation.getPath() + ".png");
		}
		return Map.of("", resourceLocation);
	}

	@Override
	public AnimationControllerProvider<TallDoorClientBlock> createAnimationController(TallDoorClientBlock base) {
		return TallDoorAnimationController::new;
	}

	@Override
	public void setPropertiesOnCreation(TallDoorClientBlock base, Armature armature) {
		boolean mirror = base.getBlockState().getValue(TallDoorBlock.HINGE) == DoorHingeSide.RIGHT;
		armature.mirrorX(mirror, false, false);
		armature.mirrorY(false, mirror, false);
	}
}
