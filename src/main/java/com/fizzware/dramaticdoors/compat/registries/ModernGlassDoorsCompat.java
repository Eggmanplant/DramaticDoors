package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class ModernGlassDoorsCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_IRON_GLASS, DDNames.SHORT_IRON_GLASS, Blocks.IRON_DOOR, BlockSetType.IRON, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_OAK_GLASS, DDNames.SHORT_OAK_GLASS, Blocks.OAK_DOOR, BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_SPRUCE_GLASS, DDNames.SHORT_SPRUCE_GLASS, Blocks.SPRUCE_DOOR, BlockSetType.SPRUCE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_BIRCH_GLASS, DDNames.SHORT_BIRCH_GLASS, Blocks.BIRCH_DOOR, BlockSetType.BIRCH, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_JUNGLE_GLASS, DDNames.SHORT_JUNGLE_GLASS, Blocks.JUNGLE_DOOR, BlockSetType.JUNGLE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_ACACIA_GLASS, DDNames.SHORT_ACACIA_GLASS, Blocks.ACACIA_DOOR, BlockSetType.ACACIA, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_DARK_OAK_GLASS, DDNames.SHORT_DARK_OAK_GLASS, Blocks.DARK_OAK_DOOR, BlockSetType.DARK_OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MANGROVE_GLASS, DDNames.SHORT_MANGROVE_GLASS, Blocks.MANGROVE_DOOR, BlockSetType.MANGROVE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_CHERRY_GLASS, DDNames.SHORT_CHERRY_GLASS, Blocks.CHERRY_DOOR, BlockSetType.CHERRY, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_BAMBOO_GLASS, DDNames.SHORT_BAMBOO_GLASS, Blocks.BAMBOO_DOOR, BlockSetType.BAMBOO, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_CRIMSON_GLASS, DDNames.SHORT_CRIMSON_GLASS, Blocks.CRIMSON_DOOR, BlockSetType.CRIMSON, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_WARPED_GLASS, DDNames.SHORT_WARPED_GLASS, Blocks.WARPED_DOOR, BlockSetType.WARPED, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_IRON_GLASS, new ResourceLocation("modern_glass_doors", "iron_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_OAK_GLASS, new ResourceLocation("modern_glass_doors", "oak_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_SPRUCE_GLASS, new ResourceLocation("modern_glass_doors", "spruce_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_BIRCH_GLASS, new ResourceLocation("modern_glass_doors", "birch_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_JUNGLE_GLASS, new ResourceLocation("modern_glass_doors", "jungle_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_ACACIA_GLASS, new ResourceLocation("modern_glass_doors", "acacia_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_DARK_OAK_GLASS, new ResourceLocation("modern_glass_doors", "dark_oak_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MANGROVE_GLASS, new ResourceLocation("modern_glass_doors", "mangrove_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_BAMBOO_GLASS, new ResourceLocation("modern_glass_doors", "bamboo_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_CHERRY_GLASS, new ResourceLocation("modern_glass_doors", "cherry_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_CRIMSON_GLASS, new ResourceLocation("modern_glass_doors", "crimson_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_WARPED_GLASS, new ResourceLocation("modern_glass_doors", "warped_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_IRON_GLASS, new ResourceLocation("modern_glass_doors", "iron_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_OAK_GLASS, new ResourceLocation("modern_glass_doors", "oak_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_SPRUCE_GLASS, new ResourceLocation("modern_glass_doors", "spruce_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_BIRCH_GLASS, new ResourceLocation("modern_glass_doors", "birch_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_JUNGLE_GLASS, new ResourceLocation("modern_glass_doors", "jungle_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_ACACIA_GLASS, new ResourceLocation("modern_glass_doors", "acacia_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_DARK_OAK_GLASS, new ResourceLocation("modern_glass_doors", "dark_oak_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MANGROVE_GLASS, new ResourceLocation("modern_glass_doors", "mangrove_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_BAMBOO_GLASS, new ResourceLocation("modern_glass_doors", "bamboo_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_CHERRY_GLASS, new ResourceLocation("modern_glass_doors", "cherry_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_CRIMSON_GLASS, new ResourceLocation("modern_glass_doors", "crimson_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_WARPED_GLASS, new ResourceLocation("modern_glass_doors", "warped_glass_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_IRON_GLASS, new ResourceLocation("modern_glass_doors", "iron_glass_door"));
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_OAK_GLASS, new ResourceLocation("modern_glass_doors", "oak_glass_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_SPRUCE_GLASS, new ResourceLocation("modern_glass_doors", "spruce_glass_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_BIRCH_GLASS, new ResourceLocation("modern_glass_doors", "birch_glass_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_JUNGLE_GLASS, new ResourceLocation("modern_glass_doors", "jungle_glass_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_ACACIA_GLASS, new ResourceLocation("modern_glass_doors", "acacia_glass_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_DARK_OAK_GLASS, new ResourceLocation("modern_glass_doors", "dark_oak_glass_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MANGROVE_GLASS, new ResourceLocation("modern_glass_doors", "mangrove_glass_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_BAMBOO_GLASS, new ResourceLocation("modern_glass_doors", "bamboo_glass_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_CHERRY_GLASS, new ResourceLocation("modern_glass_doors", "cherry_glass_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_CRIMSON_GLASS, new ResourceLocation("modern_glass_doors", "crimson_glass_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_WARPED_GLASS, new ResourceLocation("modern_glass_doors", "warped_glass_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_IRON_GLASS, new ResourceLocation("modern_glass_doors", "iron_glass_door"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_OAK_GLASS, new ResourceLocation("modern_glass_doors", "oak_glass_door"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_SPRUCE_GLASS, new ResourceLocation("modern_glass_doors", "spruce_glass_door"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_BIRCH_GLASS, new ResourceLocation("modern_glass_doors", "birch_glass_door"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_JUNGLE_GLASS, new ResourceLocation("modern_glass_doors", "jungle_glass_door"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_ACACIA_GLASS, new ResourceLocation("modern_glass_doors", "acacia_glass_door"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_DARK_OAK_GLASS, new ResourceLocation("modern_glass_doors", "dark_oak_glass_door"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MANGROVE_GLASS, new ResourceLocation("modern_glass_doors", "mangrove_glass_door"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_BAMBOO_GLASS, new ResourceLocation("modern_glass_doors", "bamboo_glass_door"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_CHERRY_GLASS, new ResourceLocation("modern_glass_doors", "cherry_glass_door"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_CRIMSON_GLASS, new ResourceLocation("modern_glass_doors", "crimson_glass_door"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_WARPED_GLASS, new ResourceLocation("modern_glass_doors", "warped_glass_door"), "tall_glass_door");
	}
}
