package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.CompatChecker;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;


public class TwilightForestCompat
{
	public static void registerCompat(CompatChecker checker) {
		registerBlocksItems(checker);
		registerRecipes(checker);
	}
	
	private static void registerBlocksItems(CompatChecker checker) {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CANOPY, DDNames.SHORT_CANOPY, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("twilightforest", "canopy_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_DARKWOOD, DDNames.SHORT_DARKWOOD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("twilightforest", "dark_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TWILIGHT_MANGROVE, DDNames.SHORT_TWILIGHT_MANGROVE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("twilightforest", "mangrove_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MINEWOOD, DDNames.SHORT_MINEWOOD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("twilightforest", "mining_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SORTINGWOOD, DDNames.SHORT_SORTINGWOOD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("twilightforest", "sorting_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TIMEWOOD, DDNames.SHORT_TIMEWOOD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("twilightforest", "time_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TRANSWOOD, DDNames.SHORT_TRANSWOOD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("twilightforest", "transformation_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TWILIGHT_OAK, DDNames.SHORT_TWILIGHT_OAK, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("twilightforest", "twilight_oak_door")), true, DDRegistry.MAIN_TAB);
		if (checker.isModLoaded("tflostblocks")) {
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TOWERWOOD, DDNames.SHORT_TOWERWOOD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("tflostblocks", "towerwood_door")), true, DDRegistry.MAIN_TAB);
		}
	}
	
	private static void registerRecipes(CompatChecker checker) {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_CANOPY, new ResourceLocation("twilightforest", "canopy_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_DARKWOOD, new ResourceLocation("twilightforest", "dark_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_TWILIGHT_MANGROVE, new ResourceLocation("twilightforest", "mangrove_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MINEWOOD, new ResourceLocation("twilightforest", "mining_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_SORTINGWOOD, new ResourceLocation("twilightforest", "sorting_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_TIMEWOOD, new ResourceLocation("twilightforest", "time_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_TRANSWOOD, new ResourceLocation("twilightforest", "transformation_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_TWILIGHT_OAK, new ResourceLocation("twilightforest", "twilight_oak_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_CANOPY, new ResourceLocation("twilightforest", "canopy_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_DARKWOOD, new ResourceLocation("twilightforest", "dark_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_TWILIGHT_MANGROVE, new ResourceLocation("twilightforest", "mangrove_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MINEWOOD, new ResourceLocation("twilightforest", "mining_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_SORTINGWOOD, new ResourceLocation("twilightforest", "sorting_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_TIMEWOOD, new ResourceLocation("twilightforest", "time_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_TRANSWOOD, new ResourceLocation("twilightforest", "transformation_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_TWILIGHT_OAK, new ResourceLocation("twilightforest", "twilight_oak_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_CANOPY, new ResourceLocation("twilightforest", "canopy_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_DARKWOOD, new ResourceLocation("twilightforest", "dark_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_TWILIGHT_MANGROVE, new ResourceLocation("twilightforest", "mangrove_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MINEWOOD, new ResourceLocation("twilightforest", "mining_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_SORTINGWOOD, new ResourceLocation("twilightforest", "sorting_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_TIMEWOOD, new ResourceLocation("twilightforest", "time_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_TRANSWOOD, new ResourceLocation("twilightforest", "transformation_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_TWILIGHT_OAK, new ResourceLocation("twilightforest", "twilight_oak_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_CANOPY, new ResourceLocation("twilightforest", "canopy_door"), "tall_tf_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_DARKWOOD, new ResourceLocation("twilightforest", "dark_door"), "tall_tf_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_TWILIGHT_MANGROVE, new ResourceLocation("twilightforest", "mangrove_door"), "tall_tf_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MINEWOOD, new ResourceLocation("twilightforest", "mining_door"), "tall_tf_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_SORTINGWOOD, new ResourceLocation("twilightforest", "sorting_door"), "tall_tf_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_TIMEWOOD, new ResourceLocation("twilightforest", "time_door"), "tall_tf_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_TRANSWOOD, new ResourceLocation("twilightforest", "transformation_door"), "tall_tf_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_TWILIGHT_OAK, new ResourceLocation("twilightforest", "twilight_oak_door"), "tall_tf_wooden_door");
		
		if (checker.isModLoaded("tflostblocks")) {
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_TOWERWOOD, new ResourceLocation("tflostblocks", "towerwood_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_TOWERWOOD, new ResourceLocation("tflostblocks", "towerwood_door"));
			
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_TOWERWOOD, new ResourceLocation("tflostblocks", "towerwood_door"), true);
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_TOWERWOOD, new ResourceLocation("tflostblocks", "towerwood_door"), "tall_tf_wooden_door");
		}
	}
}
