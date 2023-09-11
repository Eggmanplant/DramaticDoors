package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class UndergardenCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_GRONGLE, DDNames.SHORT_GRONGLE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("undergarden", "grongle_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_SMOGSTEM, DDNames.SHORT_SMOGSTEM, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("undergarden", "smogstem_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_WIGGLEWOOD, DDNames.SHORT_WIGGLEWOOD, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("undergarden", "wigglewood_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_GRONGLE, new ResourceLocation("undergarden", "grongle_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_SMOGSTEM, new ResourceLocation("undergarden", "smogstem_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_WIGGLEWOOD, new ResourceLocation("undergarden", "wigglewood_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_GRONGLE, new ResourceLocation("undergarden", "grongle_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_SMOGSTEM, new ResourceLocation("undergarden", "smogstem_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_WIGGLEWOOD, new ResourceLocation("undergarden", "wigglewood_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_GRONGLE, new ResourceLocation("undergarden", "grongle_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_SMOGSTEM, new ResourceLocation("undergarden", "greenheart_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_WIGGLEWOOD, new ResourceLocation("undergarden", "wigglewood_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_GRONGLE, new ResourceLocation("undergarden", "grongle_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_SMOGSTEM, new ResourceLocation("undergarden", "smogstem_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_WIGGLEWOOD, new ResourceLocation("undergarden", "wigglewood_door"), "tall_wooden_door");
	}
}
