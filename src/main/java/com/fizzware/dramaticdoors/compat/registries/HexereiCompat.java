package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class HexereiCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_HEXEREI_MAHOGANY, DDNames.SHORT_HEXEREI_MAHOGANY, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("hexerei", "mahogany_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_HEXEREI_WILLOW, DDNames.SHORT_HEXEREI_WILLOW, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("hexerei", "willow_door")), BlockSetType.MANGROVE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_HEXEREI_WITCH_HAZEL, DDNames.SHORT_HEXEREI_WITCH_HAZEL, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("hexerei", "witch_hazel_door")), BlockSetType.DARK_OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_HEXEREI_MAHOGANY, new ResourceLocation("hexerei", "mahogany_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_HEXEREI_WILLOW, new ResourceLocation("hexerei", "willow_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_HEXEREI_WITCH_HAZEL, new ResourceLocation("hexerei", "witch_hazel_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_HEXEREI_MAHOGANY, new ResourceLocation("hexerei", "mahogany_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_HEXEREI_WILLOW, new ResourceLocation("hexerei", "willow_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_HEXEREI_WITCH_HAZEL, new ResourceLocation("hexerei", "witch_hazel_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_HEXEREI_MAHOGANY, new ResourceLocation("hexerei", "mahogany_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_HEXEREI_WILLOW, new ResourceLocation("hexerei", "willow_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_HEXEREI_WITCH_HAZEL, new ResourceLocation("hexerei", "witch_hazel_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_HEXEREI_MAHOGANY, new ResourceLocation("hexerei", "mahogany_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_HEXEREI_WILLOW, new ResourceLocation("hexerei", "willow_door"), "tall_wooden_door");	
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_HEXEREI_WITCH_HAZEL, new ResourceLocation("hexerei", "witch_hazel_door"), "tall_wooden_door");	
	}
}
