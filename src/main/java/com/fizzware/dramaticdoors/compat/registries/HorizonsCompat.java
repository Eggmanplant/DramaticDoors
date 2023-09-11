package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class HorizonsCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_CYPRESS, DDNames.SHORT_CYPRESS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("horizons", "cypress_door")), BlockSetType.MANGROVE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_JACARANDA, DDNames.SHORT_JACARANDA, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("horizons", "jacaranda_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_REDBUD, DDNames.SHORT_REDBUD, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("horizons", "redbud_door")), BlockSetType.BIRCH, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_JACARANDA, new ResourceLocation("horizons", "jacaranda_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_REDBUD, new ResourceLocation("horizons", "redbud_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_CYPRESS, new ResourceLocation("horizons", "cypress_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_JACARANDA, new ResourceLocation("horizons", "jacaranda_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_REDBUD, new ResourceLocation("horizons", "redbud_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_CYPRESS, new ResourceLocation("horizons", "cypress_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_CYPRESS, new ResourceLocation("horizons", "cypress_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_JACARANDA, new ResourceLocation("horizons", "jacaranda_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_REDBUD, new ResourceLocation("horizons", "redbud_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_CYPRESS, new ResourceLocation("horizons", "cypress_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_JACARANDA, new ResourceLocation("horizons", "jacaranda_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_REDBUD, new ResourceLocation("horizons", "redbud_door"), "tall_wooden_door");
	}
}
