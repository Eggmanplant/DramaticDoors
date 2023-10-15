package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;


public class EndPhantasmCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_EBONY, DDNames.SHORT_EBONY, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("phantasm", "ebony_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_PREAM, DDNames.SHORT_PREAM, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("phantasm", "pream_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_EBONY, new ResourceLocation("phantasm", "ebony_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_PREAM, new ResourceLocation("phantasm", "pream_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_EBONY, new ResourceLocation("phantasm", "ebony_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_PREAM, new ResourceLocation("phantasm", "pream_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_EBONY, new ResourceLocation("phantasm", "ebony_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_PREAM, new ResourceLocation("phantasm", "pream_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_EBONY, new ResourceLocation("phantasm", "ebony_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_PREAM, new ResourceLocation("phantasm", "pream_door"), "tall_wooden_door");	
	}
}
