package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;


public class AdAstraCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_AERONOS, DDNames.SHORT_AERONOS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ad_astra", "aeronos_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_GLACIAN, DDNames.SHORT_GLACIAN, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ad_astra", "glacian_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_STROPHAR, DDNames.SHORT_STROPHAR, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ad_astra", "strophar_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_AA_STEEL, DDNames.SHORT_AA_STEEL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ad_astra", "steel_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_AERONOS, new ResourceLocation("ad_astra", "aeronos_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_GLACIAN, new ResourceLocation("ad_astra", "glacian_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_STROPHAR, new ResourceLocation("ad_astra", "strophar_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_AA_STEEL, new ResourceLocation("ad_astra", "steel_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_AERONOS, new ResourceLocation("ad_astra", "aeronos_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_GLACIAN, new ResourceLocation("ad_astra", "glacian_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_STROPHAR, new ResourceLocation("ad_astra", "strophar_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_AA_STEEL, new ResourceLocation("ad_astra", "steel_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_AERONOS, new ResourceLocation("ad_astra", "aeronos_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_GLACIAN, new ResourceLocation("ad_astra", "glacian_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_STROPHAR, new ResourceLocation("ad_astra", "strophar_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_AA_STEEL, new ResourceLocation("ad_astra", "steel_door"));
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_AERONOS, new ResourceLocation("ad_astra", "aeronos_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_GLACIAN, new ResourceLocation("ad_astra", "glacian_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_STROPHAR, new ResourceLocation("ad_astra", "strophar_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_AA_STEEL, new ResourceLocation("ad_astra", "steel_door"), "tall_metal_door");
	}
}
