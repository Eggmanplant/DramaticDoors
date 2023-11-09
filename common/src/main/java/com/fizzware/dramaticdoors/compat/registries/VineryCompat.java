package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;

public class VineryCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_VINERY_CHERRY, DDNames.SHORT_VINERY_CHERRY, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("vinery", "cherry_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_VINERY_CHERRY, new ResourceLocation("vinery", "cherry_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_VINERY_CHERRY, new ResourceLocation("vinery", "cherry_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_VINERY_CHERRY, new ResourceLocation("vinery", "cherry_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_VINERY_CHERRY, new ResourceLocation("vinery", "cherry_door"), "tall_wooden_door");
	}
}
