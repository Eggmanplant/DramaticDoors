package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;


public class TwigsCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_STRIPPED_BAMBOO, DDNames.SHORT_STRIPPED_BAMBOO, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("twigs", "stripped_bamboo_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_STRIPPED_BAMBOO, new ResourceLocation("twigs", "stripped_bamboo_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_STRIPPED_BAMBOO, new ResourceLocation("twigs", "stripped_bamboo_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_STRIPPED_BAMBOO, new ResourceLocation("twigs", "stripped_bamboo_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_STRIPPED_BAMBOO, new ResourceLocation("twigs", "stripped_bamboo_door"), "tall_wooden_door");
	}
}
