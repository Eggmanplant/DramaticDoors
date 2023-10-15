package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;


public class BetterNetherCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ANCHOR_TREE, DDNames.SHORT_ANCHOR_TREE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("betternether", "anchor_tree_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BONE_CIN, DDNames.SHORT_BONE_CIN, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("betternether", "bone_cin_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BONE_REED, DDNames.SHORT_BONE_REED, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("betternether", "bone_reed_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MUSHROOM_FIR, DDNames.SHORT_MUSHROOM_FIR, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("betternether", "mushroom_fir_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_NETHER_MUSHROOM, DDNames.SHORT_NETHER_MUSHROOM, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("betternether", "mushroom_fir_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_NETHER_REED, DDNames.SHORT_NETHER_REED, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("betternether", "mushroom_fir_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_NETHER_SAKURA, DDNames.SHORT_NETHER_SAKURA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("betternether", "mushroom_fir_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RUBEUS, DDNames.SHORT_RUBEUS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("betternether", "mushroom_fir_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_STALAGNATE, DDNames.SHORT_STALAGNATE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("betternether", "mushroom_fir_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_WART, DDNames.SHORT_WART, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("betternether", "mushroom_fir_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BN_WILLOW, DDNames.SHORT_BN_WILLOW, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("betternether", "mushroom_fir_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_ANCHOR_TREE, new ResourceLocation("betternether", "anchor_tree_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_BONE_CIN, new ResourceLocation("betternether", "bone_cincinnasite_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_BONE_REED, new ResourceLocation("betternether", "bone_reed_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MUSHROOM_FIR, new ResourceLocation("betternether", "mushroom_fir_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_NETHER_MUSHROOM, new ResourceLocation("betternether", "nether_mushroom_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_NETHER_REED, new ResourceLocation("betternether", "nether_reed_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_NETHER_SAKURA, new ResourceLocation("betternether", "nether_sakura_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_RUBEUS, new ResourceLocation("betternether", "rubeus_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_STALAGNATE, new ResourceLocation("betternether", "stalagnate_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_WART, new ResourceLocation("betternether", "wart_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_BN_WILLOW, new ResourceLocation("betternether", "willow_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_ANCHOR_TREE, new ResourceLocation("betternether", "anchor_tree_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_BONE_CIN, new ResourceLocation("betternether", "bone_cincinnasite_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_BONE_REED, new ResourceLocation("betternether", "bone_reed_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MUSHROOM_FIR, new ResourceLocation("betternether", "mushroom_fir_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_NETHER_MUSHROOM, new ResourceLocation("betternether", "nether_mushroom_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_NETHER_REED, new ResourceLocation("betternether", "nether_reed_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_NETHER_SAKURA, new ResourceLocation("betternether", "nether_sakura_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_RUBEUS, new ResourceLocation("betternether", "rubeus_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_STALAGNATE, new ResourceLocation("betternether", "stalagnate_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_WART, new ResourceLocation("betternether", "wart_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_BN_WILLOW, new ResourceLocation("betternether", "willow_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_ANCHOR_TREE, new ResourceLocation("betternether", "anchor_tree_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_BONE_CIN, new ResourceLocation("betternether", "bone_cincinnasite_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_BONE_REED, new ResourceLocation("betternether", "bone_reed_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MUSHROOM_FIR, new ResourceLocation("betternether", "mushroom_fir_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_NETHER_MUSHROOM, new ResourceLocation("betternether", "nether_mushroom_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_NETHER_REED, new ResourceLocation("betternether", "nether_reed_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_NETHER_SAKURA, new ResourceLocation("betternether", "nether_sakura_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_RUBEUS, new ResourceLocation("betternether", "rubeus_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_STALAGNATE, new ResourceLocation("betternether", "stalagnate_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_WART, new ResourceLocation("betternether", "wart_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_BN_WILLOW, new ResourceLocation("betternether", "willow_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_ANCHOR_TREE, new ResourceLocation("betternether", "anchor_tree_door"), "tall_bn_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_BONE_CIN, new ResourceLocation("betternether", "bone_cincinnasite_door"), "tall_bn_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_BONE_REED, new ResourceLocation("betternether", "bone_reed_door"), "tall_bn_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MUSHROOM_FIR, new ResourceLocation("betternether", "mushroom_fir_door"), "tall_bn_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_NETHER_MUSHROOM, new ResourceLocation("betternether", "nether_mushroom_door"), "tall_bn_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_NETHER_REED, new ResourceLocation("betternether", "nether_reed_door"), "tall_bn_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_NETHER_SAKURA, new ResourceLocation("betternether", "nether_sakura_door"), "tall_bn_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_RUBEUS, new ResourceLocation("betternether", "rubeus_door"), "tall_bn_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_STALAGNATE, new ResourceLocation("betternether", "stalagnate_door"), "tall_bn_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_WART, new ResourceLocation("betternether", "wart_door"), "tall_bn_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_BN_WILLOW, new ResourceLocation("betternether", "willow_door"), "tall_bn_wooden_door");
	}
}
