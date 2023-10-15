package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.CompatChecker;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;

public class BewitchmentCompat
{
	public static void registerCompat(CompatChecker checker) {
		registerBlocksItems(checker);
		registerRecipes(checker);
	}
	
	private static void registerBlocksItems(CompatChecker checker) {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BW_CYPRESS, DDNames.SHORT_BW_CYPRESS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("bewitchment", "cypress_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_DRAGONS_BLOOD, DDNames.SHORT_DRAGONS_BLOOD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("bewitchment", "dragons_blood_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ELDER, DDNames.SHORT_ELDER, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("bewitchment", "elder_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_JUNIPER, DDNames.SHORT_JUNIPER, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("bewitchment", "juniper_door")), true, DDRegistry.MAIN_TAB);
		
		if (checker.isModLoaded("bwplus")) {
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_YEW, DDNames.SHORT_YEW, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("bwplus", "yew_door")), true, DDRegistry.MAIN_TAB);
		}
	}
	
	private static void registerRecipes(CompatChecker checker) {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_BW_CYPRESS, new ResourceLocation("bewitchment", "cypress_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_DRAGONS_BLOOD, new ResourceLocation("bewitchment", "dragons_blood_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_ELDER, new ResourceLocation("bewitchment", "elder_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_JUNIPER, new ResourceLocation("bewitchment", "juniper_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_CYPRESS, new ResourceLocation("bewitchment", "cypress_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_DRAGONS_BLOOD, new ResourceLocation("bewitchment", "dragons_blood_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_ELDER, new ResourceLocation("bewitchment", "elder_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_JUNIPER, new ResourceLocation("bewitchment", "juniper_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_BW_CYPRESS, new ResourceLocation("bewitchment", "cypress_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_DRAGONS_BLOOD, new ResourceLocation("bewitchment", "dragons_blood_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_ELDER, new ResourceLocation("bewitchment", "elder_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_JUNIPER, new ResourceLocation("bewitchment", "juniper_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_BW_CYPRESS, new ResourceLocation("bewitchment", "cypress_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_DRAGONS_BLOOD, new ResourceLocation("bewitchment", "dragons_blood_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_ELDER, new ResourceLocation("bewitchment", "elder_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_JUNIPER, new ResourceLocation("bewitchment", "juniper_door"), "tall_wooden_door");
		
		if (checker.isModLoaded("bwplus")) {
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_YEW, new ResourceLocation("bwplus", "yew_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_YEW, new ResourceLocation("bwplus", "yew_door"));
			
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_YEW, new ResourceLocation("bwplus", "yew_door"), true);
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_YEW, new ResourceLocation("bwplus", "yew_door"), "tall_wooden_door");
		}
	}
}
