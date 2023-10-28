package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;


public class UndergardenCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_GRONGLE, DDNames.SHORT_GRONGLE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("undergarden", "grongle_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SMOGSTEM, DDNames.SHORT_SMOGSTEM, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("undergarden", "smogstem_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_WIGGLEWOOD, DDNames.SHORT_WIGGLEWOOD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("undergarden", "wigglewood_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_GRONGLE, new ResourceLocation("undergarden", "grongle_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_SMOGSTEM, new ResourceLocation("undergarden", "smogstem_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_WIGGLEWOOD, new ResourceLocation("undergarden", "wigglewood_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_GRONGLE, new ResourceLocation("undergarden", "grongle_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_SMOGSTEM, new ResourceLocation("undergarden", "smogstem_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_WIGGLEWOOD, new ResourceLocation("undergarden", "wigglewood_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_GRONGLE, new ResourceLocation("undergarden", "grongle_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_SMOGSTEM, new ResourceLocation("undergarden", "greenheart_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_WIGGLEWOOD, new ResourceLocation("undergarden", "wigglewood_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_GRONGLE, new ResourceLocation("undergarden", "grongle_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_SMOGSTEM, new ResourceLocation("undergarden", "smogstem_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_WIGGLEWOOD, new ResourceLocation("undergarden", "wigglewood_door"), "tall_wooden_door");
	}
}