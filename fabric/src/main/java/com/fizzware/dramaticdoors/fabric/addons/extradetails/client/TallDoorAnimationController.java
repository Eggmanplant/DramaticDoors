package com.fizzware.dramaticdoors.fabric.addons.extradetails.client;

import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;

import me.pandamods.extra_details.ExtraDetails;
import me.pandamods.extra_details.pandalib.client.animation_controller.Animation;
import me.pandamods.extra_details.pandalib.client.animation_controller.AnimationController;
import me.pandamods.extra_details.pandalib.client.model.Armature;
import me.pandamods.extra_details.pandalib.entity.MeshAnimatable;
import net.minecraft.resources.ResourceLocation;

public class TallDoorAnimationController extends AnimationController<TallDoorClientBlock>
{
	public <T extends MeshAnimatable> TallDoorAnimationController(TallDoorClientBlock base) {
		super(base);
		this.skipAnimation();
		this.setTransitionLength(0.1f);
		this.setAnimationSpeed(ExtraDetails.getConfig().blockSettings.door.animationSpeed);
	}

	private final Animation open = Animation.of(new ResourceLocation(DramaticDoors.MOD_ID, "pandalib/animations/block/door/tall_door_open.json"));
	private final Animation close = Animation.of(new ResourceLocation(DramaticDoors.MOD_ID, "pandalib/animations/block/door/tall_door_close.json"));
	
	@Override
	public Animation controller(TallDoorClientBlock base, Armature armature, float deltaSeconds) {
		return base.getBlockState().getValue(TallDoorBlock.OPEN) ? this.open : this.close;
	}

}
