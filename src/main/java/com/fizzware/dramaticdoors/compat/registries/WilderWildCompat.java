package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class WilderWildCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_WW_BAOBAB, DDNames.SHORT_WW_BAOBAB, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("wilderwild", "baobab_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_WW_CYPRESS, DDNames.SHORT_WW_CYPRESS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("wilderwild", "cypress_door")), BlockSetType.MANGROVE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_WW_PALM, DDNames.SHORT_WW_PALM, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("wilderwild", "palm_door")), BlockSetType.JUNGLE, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_WW_BAOBAB, new ResourceLocation("wilderwild", "baobab_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_WW_CYPRESS, new ResourceLocation("wilderwild", "cypress_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_WW_PALM, new ResourceLocation("wilderwild", "palm_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_WW_BAOBAB, new ResourceLocation("wilderwild", "baobab_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_WW_CYPRESS, new ResourceLocation("wilderwild", "cypress_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_WW_PALM, new ResourceLocation("wilderwild", "palm_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_WW_BAOBAB, new ResourceLocation("wilderwild", "baobab_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_WW_CYPRESS, new ResourceLocation("wilderwild", "cypress_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_WW_PALM, new ResourceLocation("wilderwild", "palm_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_WW_BAOBAB, new ResourceLocation("wilderwild", "baobab_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_WW_CYPRESS, new ResourceLocation("wilderwild", "cypress_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_WW_PALM, new ResourceLocation("wilderwild", "palm_door"), "tall_wooden_door");
	}
}
