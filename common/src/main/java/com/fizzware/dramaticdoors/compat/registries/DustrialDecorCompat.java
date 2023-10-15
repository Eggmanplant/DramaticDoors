package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;


public class DustrialDecorCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CARDBOARD, DDNames.SHORT_CARDBOARD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("dustrial_decor", "cardboard_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CHAIN, DDNames.SHORT_CHAIN, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("dustrial_decor", "chain_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_IRON_BAR, DDNames.SHORT_IRON_BAR, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("dustrial_decor", "iron_bar_door"), Blocks.IRON_DOOR), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_PADDED, DDNames.SHORT_PADDED, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("dustrial_decor", "padded_door"), Blocks.IRON_DOOR), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RUSTY_IRON, DDNames.SHORT_RUSTY_IRON, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("dustrial_decor", "rusty_iron_door"), Blocks.IRON_DOOR), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_INDUSTRIAL_IRON, DDNames.SHORT_INDUSTRIAL_IRON, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("dustrial_decor", "industrial_iron_door"), Blocks.IRON_DOOR), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SHEET_METAL, DDNames.SHORT_SHEET_METAL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("dustrial_decor", "sheet_metal_door"), Blocks.IRON_DOOR), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RUSTY_SHEET_METAL, DDNames.SHORT_RUSTY_SHEET_METAL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("dustrial_decor", "rusty_sheet_metal_door"), Blocks.IRON_DOOR), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_CARDBOARD, new ResourceLocation("dustrial_decor", "cardboard_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_CHAIN, new ResourceLocation("dustrial_decor", "chain_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_IRON_BAR, new ResourceLocation("dustrial_decor", "iron_bar_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_PADDED, new ResourceLocation("dustrial_decor", "padded_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_RUSTY_IRON, new ResourceLocation("dustrial_decor", "rusty_iron_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_INDUSTRIAL_IRON, new ResourceLocation("dustrial_decor", "industrial_iron_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_SHEET_METAL, new ResourceLocation("dustrial_decor", "sheet_metal_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_RUSTY_SHEET_METAL, new ResourceLocation("dustrial_decor", "rusty_sheet_metal_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_CARDBOARD, new ResourceLocation("dustrial_decor", "cardboard_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_CHAIN, new ResourceLocation("dustrial_decor", "chain_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_IRON_BAR, new ResourceLocation("dustrial_decor", "iron_bar_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_PADDED, new ResourceLocation("dustrial_decor", "padded_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_RUSTY_IRON, new ResourceLocation("dustrial_decor", "rusty_iron_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_INDUSTRIAL_IRON, new ResourceLocation("dustrial_decor", "industrial_iron_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_SHEET_METAL, new ResourceLocation("dustrial_decor", "sheet_metal_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_RUSTY_SHEET_METAL, new ResourceLocation("dustrial_decor", "rusty_sheet_metal_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_CARDBOARD, new ResourceLocation("dustrial_decor", "cardboard_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_CHAIN, new ResourceLocation("dustrial_decor", "chain_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_IRON_BAR, new ResourceLocation("dustrial_decor", "iron_bar_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_PADDED, new ResourceLocation("dustrial_decor", "padded_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_RUSTY_IRON, new ResourceLocation("dustrial_decor", "rusty_iron_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_INDUSTRIAL_IRON, new ResourceLocation("dustrial_decor", "industrial_iron_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_SHEET_METAL, new ResourceLocation("dustrial_decor", "sheet_metal_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_RUSTY_SHEET_METAL, new ResourceLocation("dustrial_decor", "rusty_sheet_metal_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_CARDBOARD, new ResourceLocation("dustrial_decor", "cardboard_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_CHAIN, new ResourceLocation("dustrial_decor", "chain_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_IRON_BAR, new ResourceLocation("dustrial_decor", "iron_bar_door"), "tall_dustrial_metal_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_PADDED, new ResourceLocation("dustrial_decor", "padded_door"), "tall_dustrial_metal_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_RUSTY_IRON, new ResourceLocation("dustrial_decor", "rusty_iron_door"), "tall_dustrial_metal_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_INDUSTRIAL_IRON, new ResourceLocation("dustrial_decor", "industrial_iron_door"), "tall_dustrial_metal_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_SHEET_METAL, new ResourceLocation("dustrial_decor", "sheet_metal_door"), "tall_dustrial_metal_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_RUSTY_SHEET_METAL, new ResourceLocation("dustrial_decor", "rusty_sheet_metal_door"), "tall_dustrial_metal_door");
	}
}
