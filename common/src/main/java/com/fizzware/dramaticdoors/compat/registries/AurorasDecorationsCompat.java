package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;

public class AurorasDecorationsCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}

	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_AD_AZALEA, DDNames.SHORT_AD_AZALEA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("aurorasdeco", "azalea_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_AD_JACARANDA, DDNames.SHORT_AD_JACARANDA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("aurorasdeco", "jacaranda_door")), true, DDRegistry.MAIN_TAB);
	}

	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_AD_AZALEA, new ResourceLocation("aurorasdeco", "azalea_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_AD_JACARANDA, new ResourceLocation("aurorasdeco", "jacaranda_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_AD_AZALEA, new ResourceLocation("aurorasdeco", "azalea_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_AD_JACARANDA, new ResourceLocation("aurorasdeco", "jacaranda_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_AD_AZALEA, new ResourceLocation("aurorasdeco", "azalea_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_AD_JACARANDA, new ResourceLocation("aurorasdeco", "jacaranda_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_AD_AZALEA, new ResourceLocation("aurorasdeco", "azalea_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_AD_JACARANDA, new ResourceLocation("aurorasdeco", "jacaranda_door"), "tall_wooden_door");
	}

}
