package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class ArchitectsPaletteCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_TWISTED, DDNames.SHORT_TWISTED, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("architects_palette", "twisted_door")), BlockSetType.WARPED, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_TWISTED, new ResourceLocation("architects_palette", "twisted_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_TWISTED, new ResourceLocation("architects_palette", "twisted_door"));
	
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_TWISTED, new ResourceLocation("architects_palette", "twisted_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_TWISTED, new ResourceLocation("architects_palette", "twisted_door"), "tall_wooden_door");
	}
}
