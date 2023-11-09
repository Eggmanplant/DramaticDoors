package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;


public class ModernGlassDoorsCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_IRON_GLASS, DDNames.SHORT_IRON_GLASS, Blocks.IRON_DOOR, true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_OAK_GLASS, DDNames.SHORT_OAK_GLASS, Blocks.OAK_DOOR, true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SPRUCE_GLASS, DDNames.SHORT_SPRUCE_GLASS, Blocks.SPRUCE_DOOR, true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BIRCH_GLASS, DDNames.SHORT_BIRCH_GLASS, Blocks.BIRCH_DOOR, true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_JUNGLE_GLASS, DDNames.SHORT_JUNGLE_GLASS, Blocks.JUNGLE_DOOR, true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ACACIA_GLASS, DDNames.SHORT_ACACIA_GLASS, Blocks.ACACIA_DOOR, true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_DARK_OAK_GLASS, DDNames.SHORT_DARK_OAK_GLASS, Blocks.DARK_OAK_DOOR, true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MANGROVE_GLASS, DDNames.SHORT_MANGROVE_GLASS, Blocks.MANGROVE_DOOR, true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CRIMSON_GLASS, DDNames.SHORT_CRIMSON_GLASS, Blocks.CRIMSON_DOOR, true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_WARPED_GLASS, DDNames.SHORT_WARPED_GLASS, Blocks.WARPED_DOOR, true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_IRON_GLASS, new ResourceLocation("glassdoor", "iron_glassdoor"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_OAK_GLASS, new ResourceLocation("glassdoor", "oak_glassdoor"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_SPRUCE_GLASS, new ResourceLocation("glassdoor", "spruce_glassdoor"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BIRCH_GLASS, new ResourceLocation("glassdoor", "birch_glassdoor"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_JUNGLE_GLASS, new ResourceLocation("glassdoor", "jungle_glassdoor"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ACACIA_GLASS, new ResourceLocation("glassdoor", "acacia_glassdoor"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_DARK_OAK_GLASS, new ResourceLocation("glassdoor", "dark_oak_glassdoor"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MANGROVE_GLASS, new ResourceLocation("glassdoor", "mangrove_glassdoor"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CRIMSON_GLASS, new ResourceLocation("glassdoor", "crimson_glassdoor"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WARPED_GLASS, new ResourceLocation("glassdoor", "warped_glassdoor"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_IRON_GLASS, new ResourceLocation("glassdoor", "iron_glassdoor"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_OAK_GLASS, new ResourceLocation("glassdoor", "oak_glassdoor"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_SPRUCE_GLASS, new ResourceLocation("glassdoor", "spruce_glassdoor"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BIRCH_GLASS, new ResourceLocation("glassdoor", "birch_glassdoor"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_JUNGLE_GLASS, new ResourceLocation("glassdoor", "jungle_glassdoor"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ACACIA_GLASS, new ResourceLocation("glassdoor", "acacia_glassdoor"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_DARK_OAK_GLASS, new ResourceLocation("glassdoor", "dark_oak_glassdoor"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MANGROVE_GLASS, new ResourceLocation("glassdoor", "mangrove_glassdoor"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BAMBOO_GLASS, new ResourceLocation("glassdoor", "bamboo_glassdoor"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CHERRY_GLASS, new ResourceLocation("glassdoor", "cherry_glassdoor"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CRIMSON_GLASS, new ResourceLocation("glassdoor", "crimson_glassdoor"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WARPED_GLASS, new ResourceLocation("glassdoor", "warped_glassdoor"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_IRON_GLASS, new ResourceLocation("glassdoor", "iron_glassdoor"));
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_OAK_GLASS, new ResourceLocation("glassdoor", "oak_glassdoor"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_SPRUCE_GLASS, new ResourceLocation("glassdoor", "spruce_glassdoor"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BIRCH_GLASS, new ResourceLocation("glassdoor", "birch_glassdoor"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_JUNGLE_GLASS, new ResourceLocation("glassdoor", "jungle_glassdoor"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ACACIA_GLASS, new ResourceLocation("glassdoor", "acacia_glassdoor"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_DARK_OAK_GLASS, new ResourceLocation("glassdoor", "dark_oak_glassdoor"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MANGROVE_GLASS, new ResourceLocation("glassdoor", "mangrove_glassdoor"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CRIMSON_GLASS, new ResourceLocation("glassdoor", "crimson_glassdoor"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WARPED_GLASS, new ResourceLocation("glassdoor", "warped_glassdoor"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_IRON_GLASS, new ResourceLocation("glassdoor", "iron_glassdoor"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_OAK_GLASS, new ResourceLocation("glassdoor", "oak_glassdoor"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_SPRUCE_GLASS, new ResourceLocation("glassdoor", "spruce_glassdoor"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BIRCH_GLASS, new ResourceLocation("glassdoor", "birch_glassdoor"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_JUNGLE_GLASS, new ResourceLocation("glassdoor", "jungle_glassdoor"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ACACIA_GLASS, new ResourceLocation("glassdoor", "acacia_glassdoor"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_DARK_OAK_GLASS, new ResourceLocation("glassdoor", "dark_oak_glassdoor"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MANGROVE_GLASS, new ResourceLocation("glassdoor", "mangrove_glassdoor"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CRIMSON_GLASS, new ResourceLocation("glassdoor", "crimson_glassdoor"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WARPED_GLASS, new ResourceLocation("glassdoor", "warped_glassdoor"), "tall_glass_door");
	}
}
