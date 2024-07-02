package com.fizzware.dramaticdoors.forge.compat;

import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.forge.addons.extradetails.client.ShortDoorClientBlock;
import com.fizzware.dramaticdoors.forge.addons.extradetails.client.ShortDoorRenderer;
import com.fizzware.dramaticdoors.forge.addons.extradetails.client.TallDoorClientBlock;
import com.fizzware.dramaticdoors.forge.addons.extradetails.client.TallDoorRenderer;
import com.fizzware.dramaticdoors.tags.DDBlockTags;

import me.pandamods.extra_details.api.client.render.block.BlockRendererRegistry;
import me.pandamods.extra_details.api.client.render.block.ClientBlockRegistry;
import me.pandamods.extra_details.api.client.render.block.ClientBlockType;
import net.minecraft.resources.ResourceLocation;

public class ExtraDetailsForgeCompat
{
	// Disabled
	public static void registerCompat() {
		/*ClientBlockType<ShortDoorClientBlock> short_door = ClientBlockRegistry.register(new ResourceLocation(DramaticDoors.MOD_ID, "short_door"), new ClientBlockType.Builder<ShortDoorClientBlock>(ShortDoorClientBlock::new).validBlockTags(DDBlockTags.SHORT_DOORS).build());
		ClientBlockType<TallDoorClientBlock> tall_door = ClientBlockRegistry.register(new ResourceLocation(DramaticDoors.MOD_ID, "tall_door"), new ClientBlockType.Builder<TallDoorClientBlock>(TallDoorClientBlock::new).validBlockTags(DDBlockTags.TALL_DOORS).build());
		BlockRendererRegistry.register(short_door, new ShortDoorRenderer());
		BlockRendererRegistry.register(tall_door, new TallDoorRenderer());*/
	}
}
