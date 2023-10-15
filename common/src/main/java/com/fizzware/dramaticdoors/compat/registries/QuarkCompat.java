package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;


public class QuarkCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_QUARK_ANCIENT, DDNames.SHORT_QUARK_ANCIENT, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("quark", "ancient_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_QUARK_AZALEA, DDNames.SHORT_QUARK_AZALEA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("quark", "azalea_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_QUARK_BLOSSOM, DDNames.SHORT_QUARK_BLOSSOM, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("quark", "blossom_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_QUARK_ANCIENT, new ResourceLocation("quark", "ancient_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_QUARK_AZALEA, new ResourceLocation("quark", "azalea_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_QUARK_BLOSSOM, new ResourceLocation("quark", "blossom_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_QUARK_ANCIENT, new ResourceLocation("quark", "ancient_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_QUARK_AZALEA, new ResourceLocation("quark", "azalea_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_QUARK_BLOSSOM, new ResourceLocation("quark", "blossom_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_QUARK_ANCIENT, new ResourceLocation("quark", "ancient_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_QUARK_AZALEA, new ResourceLocation("quark", "azalea_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_QUARK_BLOSSOM, new ResourceLocation("quark", "mystical_oak_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_QUARK_ANCIENT, new ResourceLocation("quark", "ancient_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_QUARK_AZALEA, new ResourceLocation("quark", "azalea_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_QUARK_BLOSSOM, new ResourceLocation("quark", "blossom_door"), "tall_wooden_door");
	}
}
