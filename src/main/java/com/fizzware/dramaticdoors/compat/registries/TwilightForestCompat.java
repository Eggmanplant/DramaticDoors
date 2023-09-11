package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class TwilightForestCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_CANOPY, DDNames.SHORT_CANOPY, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("twilightforest", "canopy_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_DARKWOOD, DDNames.SHORT_DARKWOOD, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("twilightforest", "dark_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_TWILIGHT_MANGROVE, DDNames.SHORT_TWILIGHT_MANGROVE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("twilightforest", "mangrove_door")), BlockSetType.MANGROVE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MINEWOOD, DDNames.SHORT_MINEWOOD, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("twilightforest", "mining_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_SORTINGWOOD, DDNames.SHORT_SORTINGWOOD, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("twilightforest", "sorting_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_TIMEWOOD, DDNames.SHORT_TIMEWOOD, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("twilightforest", "time_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_TRANSWOOD, DDNames.SHORT_TRANSWOOD, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("twilightforest", "transformation_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_TWILIGHT_OAK, DDNames.SHORT_TWILIGHT_OAK, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("twilightforest", "twilight_oak_door")), BlockSetType.OAK, true);
		if (FabricLoader.getInstance().isModLoaded("tflostblocks")) {
			DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_TOWERWOOD, DDNames.SHORT_TOWERWOOD, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("tflostblocks", "towerwood_door")), BlockSetType.OAK, true);
		}
	}
	
	private static void registerRecipes() {
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
		
		if (FabricLoader.getInstance().isModLoaded("tflostblocks")) {
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_TOWERWOOD, new ResourceLocation("tflostblocks", "towerwood_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_TOWERWOOD, new ResourceLocation("tflostblocks", "towerwood_door"));
			
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_TOWERWOOD, new ResourceLocation("tflostblocks", "towerwood_door"), true);
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_TOWERWOOD, new ResourceLocation("tflostblocks", "towerwood_door"), "tall_tf_wooden_door");
		}
	}
}
