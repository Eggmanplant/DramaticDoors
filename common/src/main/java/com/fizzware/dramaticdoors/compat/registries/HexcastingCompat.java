package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;


public class HexcastingCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_EDIFIED, DDNames.SHORT_EDIFIED, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("hexcasting", "edified_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_EDIFIED, new ResourceLocation("hexcasting", "edified_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_EDIFIED, new ResourceLocation("hexcasting", "edified_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_EDIFIED, new ResourceLocation("hexcasting", "edified_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_EDIFIED, new ResourceLocation("hexcasting", "edified_door"), "tall_wooden_door");
	}
}
