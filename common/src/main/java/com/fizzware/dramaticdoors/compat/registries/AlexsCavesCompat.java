package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.CompatChecker;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class AlexsCavesCompat
{
	public static void registerCompat(CompatChecker checker) {
		registerBlocksItems();
		registerRecipes(checker);
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_PEWEN, DDNames.SHORT_PEWEN, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("alexscaves", "pewen_door")), BlockSetType.JUNGLE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_THORNWOOD, DDNames.SHORT_THORNWOOD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("alexscaves", "thornwood_door")), BlockSetType.JUNGLE, true);
	}
	
	private static void registerRecipes(CompatChecker checker) {
		// The check is temporary. Futureproofing for Alex's Caves release.
		if (checker.isModLoaded("alexscaves")) {
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_PEWEN, new ResourceLocation("alexscaves", "pewen_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_THORNWOOD, new ResourceLocation("alexscaves", "thornwood_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_PEWEN, new ResourceLocation("alexscaves", "pewen_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_THORNWOOD, new ResourceLocation("alexscaves", "thornwood_door"));
			
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_PEWEN, new ResourceLocation("alexscaves", "pewen_door"), true);
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_THORNWOOD, new ResourceLocation("alexscaves", "thornwood_door"), true);
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_PEWEN, new ResourceLocation("alexscaves", "pewen_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_THORNWOOD, new ResourceLocation("alexscaves", "thornwood_door"), "tall_wooden_door");
		}
		if (checker.isModLoaded("alexs_caves")) {
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_PEWEN, new ResourceLocation("alexs_caves", "pewen_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_THORNWOOD, new ResourceLocation("alexs_caves", "thornwood_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_PEWEN, new ResourceLocation("alexs_caves", "pewen_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_THORNWOOD, new ResourceLocation("alexs_caves", "thornwood_door"));
			
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_PEWEN, new ResourceLocation("alexs_caves", "pewen_door"), true);
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_THORNWOOD, new ResourceLocation("alexs_caves", "thornwood_door"), true);
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_PEWEN, new ResourceLocation("alexs_caves", "pewen_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_THORNWOOD, new ResourceLocation("alexs_caves", "thornwood_door"), "tall_wooden_door");
		}
	}
}
