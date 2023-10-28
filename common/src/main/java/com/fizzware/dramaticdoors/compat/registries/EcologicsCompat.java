package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;


public class EcologicsCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ECO_AZALEA, DDNames.SHORT_ECO_AZALEA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ecologics", "azalea_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ECO_FLOWERING_AZALEA, DDNames.SHORT_ECO_FLOWERING_AZALEA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ecologics", "flowering_azalea_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ECO_COCONUT, DDNames.SHORT_ECO_COCONUT, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ecologics", "coconut_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ECO_WALNUT, DDNames.SHORT_ECO_WALNUT, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ecologics", "walnut_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_ECO_AZALEA, new ResourceLocation("ecologics", "azalea_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_ECO_FLOWERING_AZALEA, new ResourceLocation("ecologics", "flowering_azalea_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_ECO_COCONUT, new ResourceLocation("ecologics", "coconut_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_ECO_WALNUT, new ResourceLocation("ecologics", "walnut_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_ECO_AZALEA, new ResourceLocation("ecologics", "azalea_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_ECO_FLOWERING_AZALEA, new ResourceLocation("ecologics", "flowering_azalea_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_ECO_COCONUT, new ResourceLocation("ecologics", "coconut_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_ECO_WALNUT, new ResourceLocation("ecologics", "walnut_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_ECO_AZALEA, new ResourceLocation("ecologics", "azalea_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_ECO_FLOWERING_AZALEA, new ResourceLocation("ecologics", "flowering_azalea_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_ECO_COCONUT, new ResourceLocation("ecologics", "coconut_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_ECO_WALNUT, new ResourceLocation("ecologics", "walnut_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_ECO_AZALEA, new ResourceLocation("ecologics", "azalea_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_ECO_FLOWERING_AZALEA, new ResourceLocation("ecologics", "flowering_azalea_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_ECO_COCONUT, new ResourceLocation("ecologics", "coconut_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_ECO_WALNUT, new ResourceLocation("ecologics", "walnut_door"), "tall_wooden_door");
	}
}