package com.fizzware.dramaticdoors.fabric.addons.extradetails.client;

import com.fizzware.dramaticdoors.blocks.TallDoorBlock;

import me.pandamods.extra_details.ExtraDetails;
import me.pandamods.pandalib.client.animation_controller.Animation;
import me.pandamods.pandalib.client.animation_controller.AnimationController;
import me.pandamods.pandalib.client.model.Armature;
import net.minecraft.resources.ResourceLocation;

public class TallDoorAnimationController extends AnimationController<TallDoorClientBlock>
{
	public TallDoorAnimationController(TallDoorClientBlock base) {
		super(base);
		this.skipAnimation();
		this.setTransitionLength(0.1f);
		this.setAnimationSpeed(ExtraDetails.getConfig().blockSettings.door.animationSpeed);
	}

	private final Animation open = Animation.of(new ResourceLocation("extra_details", "pandalib/animations/block/door/door_open.json"));
	private final Animation close = Animation.of(new ResourceLocation("extra_details", "pandalib/animations/block/door/door_close.json"));
	
	@Override
	public Animation controller(TallDoorClientBlock base, Armature armature, float deltaSeconds) {
		return base.getBlockState().getValue(TallDoorBlock.OPEN) ? this.open : this.close;
	}

}
