package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class BlockusCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_BLOCKUS_STONE, DDNames.SHORT_BLOCKUS_STONE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("blockus", "stone_door")), BlockSetType.STONE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_BLOCKUS_BLACKSTONE, DDNames.SHORT_BLOCKUS_BLACKSTONE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("blockus", "blackstone_door")), BlockSetType.POLISHED_BLACKSTONE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_BLOCKUS_OBSIDIAN_REINFORCED, DDNames.SHORT_BLOCKUS_OBSIDIAN_REINFORCED, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("blockus", "obsidian_reinforced_door")), BlockSetType.IRON, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_BLOCKUS_BAMBOO, DDNames.SHORT_BLOCKUS_BAMBOO, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("blockus", "bamboo_door")), BlockSetType.BAMBOO, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_BLOCKUS_CHARRED, DDNames.SHORT_BLOCKUS_CHARRED, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("blockus", "charred_door")), BlockSetType.BAMBOO, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_BLOCKUS_PAPER, DDNames.SHORT_BLOCKUS_PAPER, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("blockus", "paper_door")), BlockSetType.BIRCH, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_BLOCKUS_WHITE_OAK, DDNames.SHORT_BLOCKUS_WHITE_OAK, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("blockus", "white_oak_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_BLOCKUS_BAMBOO, new ResourceLocation("blockus", "bamboo_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_BLOCKUS_BLACKSTONE, new ResourceLocation("blockus", "blackstone_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_BLOCKUS_CHARRED, new ResourceLocation("blockus", "charred_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_BLOCKUS_OBSIDIAN_REINFORCED, new ResourceLocation("blockus", "obsidian_reinforced_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_BLOCKUS_PAPER, new ResourceLocation("blockus", "paper_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_BLOCKUS_STONE, new ResourceLocation("blockus", "stone_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_BLOCKUS_WHITE_OAK, new ResourceLocation("blockus", "white_oak_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_BLOCKUS_BAMBOO, new ResourceLocation("blockus", "bamboo_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_BLOCKUS_BLACKSTONE, new ResourceLocation("blockus", "blackstone_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_BLOCKUS_CHARRED, new ResourceLocation("blockus", "charred_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_BLOCKUS_OBSIDIAN_REINFORCED, new ResourceLocation("blockus", "obsidian_reinforced_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_BLOCKUS_PAPER, new ResourceLocation("blockus", "paper_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_BLOCKUS_STONE, new ResourceLocation("blockus", "stone_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_BLOCKUS_WHITE_OAK, new ResourceLocation("blockus", "white_oak_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_BLOCKUS_BAMBOO, new ResourceLocation("blockus", "bamboo_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_BLOCKUS_BLACKSTONE, new ResourceLocation("blockus", "blackstone_door"));
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_BLOCKUS_CHARRED, new ResourceLocation("blockus", "charred_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_BLOCKUS_OBSIDIAN_REINFORCED, new ResourceLocation("blockus", "obsidian_reinforced_door"));
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_BLOCKUS_PAPER, new ResourceLocation("blockus", "paper_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_BLOCKUS_STONE, new ResourceLocation("blockus", "stone_door"));
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_BLOCKUS_WHITE_OAK, new ResourceLocation("blockus", "white_oak_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_BLOCKUS_BAMBOO, new ResourceLocation("blockus", "bamboo_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_BLOCKUS_BLACKSTONE, new ResourceLocation("blockus", "blackstone_door"), "tall_stone_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_BLOCKUS_CHARRED, new ResourceLocation("blockus", "charred_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_BLOCKUS_OBSIDIAN_REINFORCED, new ResourceLocation("blockus", "obsidian_reinforced_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_BLOCKUS_PAPER, new ResourceLocation("blockus", "paper_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_BLOCKUS_STONE, new ResourceLocation("blockus", "stone_door"), "tall_stone_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_BLOCKUS_WHITE_OAK, new ResourceLocation("blockus", "white_oak_door"), "tall_wooden_door");
	}
}
