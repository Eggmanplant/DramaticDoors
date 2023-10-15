package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;


public class BetterEndCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TERMINITE, DDNames.SHORT_TERMINITE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("betterend", "terminite_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_THALLASIUM, DDNames.SHORT_THALLASIUM, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("betterend", "thallasium_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_DRAGON_TREE, DDNames.SHORT_DRAGON_TREE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("betterend", "dragon_tree_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_END_LOTUS, DDNames.SHORT_END_LOTUS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("betterend", "end_lotus_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_HELIX_TREE, DDNames.SHORT_HELIX_TREE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("betterend", "helix_tree_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_JELLYSHROOM, DDNames.SHORT_JELLYSHROOM, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("betterend", "jellyshroom_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LACUGROVE, DDNames.SHORT_LACUGROVE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("betterend", "lacugrove_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LUCERNIA, DDNames.SHORT_LUCERNIA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("betterend", "lucernia_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MOSSY_GLOWSHROOM, DDNames.SHORT_MOSSY_GLOWSHROOM, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("betterend", "mossy_glowshroom_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_PYTHADENDRON, DDNames.SHORT_PYTHADENDRON, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("betterend", "pythadendron_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TENANEA, DDNames.SHORT_TENANEA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("betterend", "tenanea_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_UMBRELLA_TREE, DDNames.SHORT_UMBRELLA_TREE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("betterend", "umbrella_tree_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_TERMINITE, new ResourceLocation("betterend", "terminite_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_THALLASIUM, new ResourceLocation("betterend", "thallasium_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_DRAGON_TREE, new ResourceLocation("betterend", "dragon_tree_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_END_LOTUS, new ResourceLocation("betterend", "end_lotus_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_HELIX_TREE, new ResourceLocation("betterend", "helix_tree_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_JELLYSHROOM, new ResourceLocation("betterend", "jellyshroom_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_LACUGROVE, new ResourceLocation("betterend", "lacugrove_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_LUCERNIA, new ResourceLocation("betterend", "lucernia_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MOSSY_GLOWSHROOM, new ResourceLocation("betterend", "mossy_glowshroom_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_PYTHADENDRON, new ResourceLocation("betterend", "pythadendron_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_TENANEA, new ResourceLocation("betterend", "tenanea_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_UMBRELLA_TREE, new ResourceLocation("betterend", "umbrella_tree_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_TERMINITE, new ResourceLocation("betterend", "terminite_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_THALLASIUM, new ResourceLocation("betterend", "thallasium_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_DRAGON_TREE, new ResourceLocation("betterend", "dragon_tree_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_END_LOTUS, new ResourceLocation("betterend", "end_lotus_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_HELIX_TREE, new ResourceLocation("betterend", "helix_tree_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_JELLYSHROOM, new ResourceLocation("betterend", "jellyshroom_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_LACUGROVE, new ResourceLocation("betterend", "lacugrove_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_LUCERNIA, new ResourceLocation("betterend", "lucernia_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MOSSY_GLOWSHROOM, new ResourceLocation("betterend", "mossy_glowshroom_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_PYTHADENDRON, new ResourceLocation("betterend", "pythadendron_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_TENANEA, new ResourceLocation("betterend", "tenanea_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_UMBRELLA_TREE, new ResourceLocation("betterend", "umbrella_tree_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_TERMINITE, new ResourceLocation("betterend", "terminite_door"));
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_THALLASIUM, new ResourceLocation("betterend", "thallasium_door"));
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_DRAGON_TREE, new ResourceLocation("betterend", "dragon_tree_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_END_LOTUS, new ResourceLocation("betterend", "end_lotus_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_HELIX_TREE, new ResourceLocation("betterend", "helix_tree_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_JELLYSHROOM, new ResourceLocation("betterend", "jellyshroom_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_LACUGROVE, new ResourceLocation("betterend", "lacugrove_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_LUCERNIA, new ResourceLocation("betterend", "lucernia_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MOSSY_GLOWSHROOM, new ResourceLocation("betterend", "mossy_glowshroom_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_PYTHADENDRON, new ResourceLocation("betterend", "pythadendron_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_TENANEA, new ResourceLocation("betterend", "tenanea_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_UMBRELLA_TREE, new ResourceLocation("betterend", "umbrella_tree_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_TERMINITE, new ResourceLocation("betterend", "terminite_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_THALLASIUM, new ResourceLocation("betterend", "thallasium_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_DRAGON_TREE, new ResourceLocation("betterend", "dragon_tree_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_END_LOTUS, new ResourceLocation("betterend", "end_lotus_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_HELIX_TREE, new ResourceLocation("betterend", "helix_tree_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_JELLYSHROOM, new ResourceLocation("betterend", "jellyshroom_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_LACUGROVE, new ResourceLocation("betterend", "lacugrove_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_LUCERNIA, new ResourceLocation("betterend", "lucernia_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MOSSY_GLOWSHROOM, new ResourceLocation("betterend", "mossy_glowshroom_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_PYTHADENDRON, new ResourceLocation("betterend", "pythadendron_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_TENANEA, new ResourceLocation("betterend", "tenanea_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_UMBRELLA_TREE, new ResourceLocation("betterend", "umbrella_tree_door"), "tall_wooden_door");
	}
}
