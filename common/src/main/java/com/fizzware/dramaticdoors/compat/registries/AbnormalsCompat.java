package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.CompatChecker;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;

public class AbnormalsCompat
{
	public static void registerCompat(CompatChecker checker) {
		registerBlocksItems();
		registerRecipes(checker);
	}
	

	
	private static void registerBlocksItems() {
		// Atmospheric
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ASPEN, DDNames.SHORT_ASPEN, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("atmospheric", "aspen_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_GRIMWOOD, DDNames.SHORT_GRIMWOOD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("atmospheric", "grimwood_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_KOUSA, DDNames.SHORT_KOUSA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("atmospheric", "kousa_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MORADO, DDNames.SHORT_MORADO, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("atmospheric", "morado_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ROSEWOOD, DDNames.SHORT_ROSEWOOD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("atmospheric", "rosewood_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_YUCCA, DDNames.SHORT_YUCCA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("atmospheric", "yucca_door")), true, DDRegistry.MAIN_TAB);

		// Autumnity
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MAPLE, DDNames.SHORT_MAPLE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("autumnity", "maple_door")), true, DDRegistry.MAIN_TAB);
		
		// Buzzier Bees
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_HONEYCOMB, DDNames.SHORT_HONEYCOMB, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("buzzier_bees", "honeycomb_door")), true, DDRegistry.MAIN_TAB);

		// Caverns & Chasms
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_AZALEA, DDNames.SHORT_AZALEA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("caverns_and_chasms", "azalea_door")), true, DDRegistry.MAIN_TAB);

		// Endergetic Expansion
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_POISE, DDNames.SHORT_POISE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("endergetic", "poise_door")), true, DDRegistry.MAIN_TAB);

		// Environmental
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_DARK_CHERRY, DDNames.SHORT_DARK_CHERRY, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("environmental", "cherry_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_WILLOW, DDNames.SHORT_WILLOW, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("environmental", "willow_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_WISTERIA, DDNames.SHORT_WISTERIA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("environmental", "wisteria_door")), true, DDRegistry.MAIN_TAB);
		
		// Upgrade Aquatic
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_DRIFTWOOD, DDNames.SHORT_DRIFTWOOD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("upgrade_aquatic", "driftwood_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RIVER, DDNames.SHORT_RIVER, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("upgrade_aquatic", "river_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_GLASS, DDNames.SHORT_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("upgrade_aquatic", "glass_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TOOTH, DDNames.SHORT_TOOTH, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("upgrade_aquatic", "tooth_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes(CompatChecker checker) {
		if (checker.isModLoaded("atmospheric")) {
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_ASPEN, new ResourceLocation("atmospheric", "aspen_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_GRIMWOOD, new ResourceLocation("atmospheric", "grimwood_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_KOUSA, new ResourceLocation("atmospheric", "kousa_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MORADO, new ResourceLocation("atmospheric", "morado_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_ROSEWOOD, new ResourceLocation("atmospheric", "rosewood_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_YUCCA, new ResourceLocation("atmospheric", "yucca_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_ASPEN, new ResourceLocation("atmospheric", "aspen_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_GRIMWOOD, new ResourceLocation("atmospheric", "grimwood_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_KOUSA, new ResourceLocation("atmospheric", "kousa_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MORADO, new ResourceLocation("atmospheric", "morado_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_ROSEWOOD, new ResourceLocation("atmospheric", "rosewood_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_YUCCA, new ResourceLocation("atmospheric", "yucca_door"));
			
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_ASPEN, new ResourceLocation("atmospheric", "aspen_door"), true);
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_GRIMWOOD, new ResourceLocation("atmospheric", "grimwood_door"), true);
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_KOUSA, new ResourceLocation("atmospheric", "kousa_door"), true);
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MORADO, new ResourceLocation("atmospheric", "morado_door"), true);
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_ROSEWOOD, new ResourceLocation("atmospheric", "rosewood_door"), true);
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_YUCCA, new ResourceLocation("atmospheric", "yucca_door"), true);
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_ASPEN, new ResourceLocation("atmospheric", "aspen_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_GRIMWOOD, new ResourceLocation("atmospheric", "grimwood_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_KOUSA, new ResourceLocation("atmospheric", "kousa_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MORADO, new ResourceLocation("atmospheric", "morado_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_ROSEWOOD, new ResourceLocation("atmospheric", "rosewood_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_YUCCA, new ResourceLocation("atmospheric", "yucca_door"), "tall_wooden_door");
		}
		if (checker.isModLoaded("autumnity")) {
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MAPLE, new ResourceLocation("autumnity", "maple_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MAPLE, new ResourceLocation("autumnity", "maple_door"));
	
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MAPLE, new ResourceLocation("autumnity", "maple_door"), true);
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MAPLE, new ResourceLocation("autumnity", "maple_door"), "tall_wooden_door");
		}
		if (checker.isModLoaded("buzzier_bees")) {
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_HONEYCOMB, new ResourceLocation("buzzier_bees", "honeycomb_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_HONEYCOMB, new ResourceLocation("buzzier_bees", "honeycomb_door"));
	
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_HONEYCOMB, new ResourceLocation("buzzier_bees", "honeycomb_door"), false);
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_HONEYCOMB, new ResourceLocation("buzzier_bees", "honeycomb_door"), "tall_misc_door");
		}
		if (checker.isModLoaded("caverns_and_chasms")) {
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_AZALEA, new ResourceLocation("caverns_and_chasms", "azalea_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_AZALEA, new ResourceLocation("caverns_and_chasms", "azalea_door"));
	
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_AZALEA, new ResourceLocation("caverns_and_chasms", "azalea_door"), true);
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_AZALEA, new ResourceLocation("caverns_and_chasms", "azalea_door"), "tall_wooden_door");
	
		}
		if (checker.isModLoaded("endergetic")) {
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_POISE, new ResourceLocation("endergetic", "poise_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_POISE, new ResourceLocation("endergetic", "poise_door"));
	
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_POISE, new ResourceLocation("endergetic", "poise_door"), true);
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_POISE, new ResourceLocation("endergetic", "poise_door"), "tall_wooden_door");
		}
		if (checker.isModLoaded("environmental")) {
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_DARK_CHERRY, new ResourceLocation("environmental", "cherry_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_WILLOW, new ResourceLocation("environmental", "willow_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_WISTERIA, new ResourceLocation("environmental", "wisteria_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_DARK_CHERRY, new ResourceLocation("environmental", "cherry_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_WILLOW, new ResourceLocation("environmental", "willow_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_WISTERIA, new ResourceLocation("environmental", "wisteria_door"));
	
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_DARK_CHERRY, new ResourceLocation("environmental", "cherry_door"), true);
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_WILLOW, new ResourceLocation("environmental", "willow_door"), true);
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_WISTERIA, new ResourceLocation("environmental", "wisteria_door"), true);
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_DARK_CHERRY, new ResourceLocation("environmental", "cherry_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_WILLOW, new ResourceLocation("environmental", "willow_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_WISTERIA, new ResourceLocation("environmental", "wisteria_door"), "tall_wooden_door");
		}
		if (checker.isModLoaded("upgrade_aquatic")) {
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_DRIFTWOOD, new ResourceLocation("upgrade_aquatic", "driftwood_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_RIVER, new ResourceLocation("upgrade_aquatic", "river_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_GLASS, new ResourceLocation("upgrade_aquatic", "glass_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_TOOTH, new ResourceLocation("upgrade_aquatic", "tooth_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_DRIFTWOOD, new ResourceLocation("upgrade_aquatic", "driftwood_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_RIVER, new ResourceLocation("upgrade_aquatic", "river_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_GLASS, new ResourceLocation("upgrade_aquatic", "glass_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_TOOTH, new ResourceLocation("upgrade_aquatic", "tooth_door"));
	
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_DRIFTWOOD, new ResourceLocation("upgrade_aquatic", "driftwood_door"), true);
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_RIVER, new ResourceLocation("upgrade_aquatic", "river_door"), true);
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_GLASS, new ResourceLocation("upgrade_aquatic", "glass_door"), false);
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_TOOTH, new ResourceLocation("upgrade_aquatic", "tooth_door"), false);
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_DRIFTWOOD, new ResourceLocation("upgrade_aquatic", "driftwood_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_RIVER, new ResourceLocation("upgrade_aquatic", "river_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_GLASS, new ResourceLocation("upgrade_aquatic", "glass_door"), "tall_misc_door");
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_TOOTH, new ResourceLocation("upgrade_aquatic", "tooth_door"), "tall_misc_door");
		}
	}
}
