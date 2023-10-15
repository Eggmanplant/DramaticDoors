package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;


public class CreateMiscThingsCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ANDESITE_CASING, DDNames.SHORT_ANDESITE_CASING, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("create_things_and_misc", "andesite_casing_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BRASS_CASING, DDNames.SHORT_BRASS_CASING, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("create_things_and_misc", "brass_casing_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_COPPER_CASING, DDNames.SHORT_COPPER_CASING, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("create_things_and_misc", "copper_casing_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_ANDESITE_CASING, new ResourceLocation("create_things_and_misc", "andesite_casing_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_BRASS_CASING, new ResourceLocation("create_things_and_misc", "brass_casing_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_COPPER_CASING, new ResourceLocation("create_things_and_misc", "copper_casing_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_ANDESITE_CASING, new ResourceLocation("create_things_and_misc", "andesite_casing_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_BRASS_CASING, new ResourceLocation("create_things_and_misc", "brass_casing_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_COPPER_CASING, new ResourceLocation("create_things_and_misc", "copper_casing_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_ANDESITE_CASING, new ResourceLocation("create_things_and_misc", "andesite_casing_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_BRASS_CASING, new ResourceLocation("create_things_and_misc", "brass_casing_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_COPPER_CASING, new ResourceLocation("create_things_and_misc", "copper_casing_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_ANDESITE_CASING, new ResourceLocation("create_things_and_misc", "andesite_casing_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_BRASS_CASING, new ResourceLocation("create_things_and_misc", "brass_casing_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_COPPER_CASING, new ResourceLocation("create_things_and_misc", "copper_casing_door"), "tall_misc_door");
	}
}
