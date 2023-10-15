package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;


public class EnlightenedEndCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CONGEALED, DDNames.SHORT_CONGEALED, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("enlightened_end", "ebony_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_EE_EBONY, DDNames.SHORT_EE_EBONY, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("enlightened_end", "congealed_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_CONGEALED, new ResourceLocation("enlightened_end", "ebony_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_EE_EBONY, new ResourceLocation("enlightened_end", "congealed_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_CONGEALED, new ResourceLocation("enlightened_end", "ebony_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_EE_EBONY, new ResourceLocation("enlightened_end", "congealed_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_CONGEALED, new ResourceLocation("enlightened_end", "ebony_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_EE_EBONY, new ResourceLocation("enlightened_end", "congealed_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_CONGEALED, new ResourceLocation("enlightened_end", "ebony_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_EE_EBONY, new ResourceLocation("enlightened_end", "congealed_door"), "tall_wooden_door");
	}
}
