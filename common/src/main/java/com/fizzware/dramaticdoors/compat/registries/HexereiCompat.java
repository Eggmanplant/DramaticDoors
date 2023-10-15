package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;


public class HexereiCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_HEXEREI_MAHOGANY, DDNames.SHORT_HEXEREI_MAHOGANY, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("hexerei", "mahogany_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_HEXEREI_WILLOW, DDNames.SHORT_HEXEREI_WILLOW, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("hexerei", "willow_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_HEXEREI_WITCH_HAZEL, DDNames.SHORT_HEXEREI_WITCH_HAZEL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("hexerei", "witch_hazel_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_HEXEREI_MAHOGANY, new ResourceLocation("hexerei", "mahogany_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_HEXEREI_WILLOW, new ResourceLocation("hexerei", "willow_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_HEXEREI_WITCH_HAZEL, new ResourceLocation("hexerei", "witch_hazel_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_HEXEREI_MAHOGANY, new ResourceLocation("hexerei", "mahogany_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_HEXEREI_WILLOW, new ResourceLocation("hexerei", "willow_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_HEXEREI_WITCH_HAZEL, new ResourceLocation("hexerei", "witch_hazel_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_HEXEREI_MAHOGANY, new ResourceLocation("hexerei", "mahogany_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_HEXEREI_WILLOW, new ResourceLocation("hexerei", "willow_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_HEXEREI_WITCH_HAZEL, new ResourceLocation("hexerei", "witch_hazel_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_HEXEREI_MAHOGANY, new ResourceLocation("hexerei", "mahogany_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_HEXEREI_WILLOW, new ResourceLocation("hexerei", "willow_door"), "tall_wooden_door");	
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_HEXEREI_WITCH_HAZEL, new ResourceLocation("hexerei", "witch_hazel_door"), "tall_wooden_door");	
	}
}
