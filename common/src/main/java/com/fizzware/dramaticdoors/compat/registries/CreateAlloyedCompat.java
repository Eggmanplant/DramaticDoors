package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;


public class CreateAlloyedCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_STEEL, DDNames.SHORT_STEEL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("alloyed", "steel_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LOCKED_STEEL, DDNames.SHORT_LOCKED_STEEL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("alloyed", "locked_steel_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_STEEL, new ResourceLocation("alloyed", "steel_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_LOCKED_STEEL, new ResourceLocation("alloyed", "locked_steel_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_STEEL, new ResourceLocation("alloyed", "steel_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_LOCKED_STEEL, new ResourceLocation("alloyed", "locked_steel_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_STEEL, new ResourceLocation("alloyed", "steel_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_LOCKED_STEEL, new ResourceLocation("alloyed", "locked_steel_door"), false);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_STEEL, new ResourceLocation("alloyed", "steel_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_LOCKED_STEEL, new ResourceLocation("alloyed", "locked_steel_door"), "tall_metal_door");
	}
}
