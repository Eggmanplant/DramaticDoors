package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;


public class GardensOfTheDeadCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SOULBLIGHT, DDNames.SHORT_SOULBLIGHT, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("gardens_of_the_dead", "soulblight_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_WHISTLECANE, DDNames.SHORT_WHISTLECANE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("gardens_of_the_dead", "whistlecane_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_SOULBLIGHT, new ResourceLocation("gardens_of_the_dead", "soulblight_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_WHISTLECANE, new ResourceLocation("gardens_of_the_dead", "whistlecane_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_SOULBLIGHT, new ResourceLocation("gardens_of_the_dead", "soulblight_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_WHISTLECANE, new ResourceLocation("gardens_of_the_dead", "whistlecane_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_SOULBLIGHT, new ResourceLocation("gardens_of_the_dead", "soulblight_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_WHISTLECANE, new ResourceLocation("gardens_of_the_dead", "whistlecane_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_SOULBLIGHT, new ResourceLocation("gardens_of_the_dead", "soulblight_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_WHISTLECANE, new ResourceLocation("gardens_of_the_dead", "whistlecane_door"), "tall_wooden_door");
	}
}