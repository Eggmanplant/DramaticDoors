package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;


public class IntegratedDynamicsCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MENRIL, DDNames.SHORT_MENRIL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("integrateddynamics", "menril_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MENRIL, new ResourceLocation("integrateddynamics", "menril_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MENRIL, new ResourceLocation("integrateddynamics", "menril_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MENRIL, new ResourceLocation("integrateddynamics", "menril_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MENRIL, new ResourceLocation("integrateddynamics", "menril_door"), "tall_wooden_door");
	}
}
