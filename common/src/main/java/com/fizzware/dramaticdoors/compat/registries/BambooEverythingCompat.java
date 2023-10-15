package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;


public class BambooEverythingCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BE_BAMBOO, DDNames.SHORT_BE_BAMBOO, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("bambooeverything", "bamboo_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BE_DRY_BAMBOO, DDNames.SHORT_BE_DRY_BAMBOO, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("bambooeverything", "dry_bamboo_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_BE_BAMBOO, new ResourceLocation("bambooeverything", "bamboo_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_BE_DRY_BAMBOO, new ResourceLocation("bambooeverything", "dry_bamboo_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_BE_BAMBOO, new ResourceLocation("bambooeverything", "bamboo_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_BE_DRY_BAMBOO, new ResourceLocation("bambooeverything", "dry_bamboo_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_BE_BAMBOO, new ResourceLocation("bambooeverything", "bamboo_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_BE_DRY_BAMBOO, new ResourceLocation("bambooeverything", "dry_bamboo_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_BE_BAMBOO, new ResourceLocation("bambooeverything", "bamboo_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_BE_DRY_BAMBOO, new ResourceLocation("bambooeverything", "dry_bamboo_door"), "tall_wooden_door");
	}
}
