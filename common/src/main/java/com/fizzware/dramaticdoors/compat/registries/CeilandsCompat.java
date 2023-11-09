package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;


public class CeilandsCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CEILTRUNK, DDNames.SHORT_CEILTRUNK, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ceilands", "ceiltrunk_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LUZAWOOD, DDNames.SHORT_LUZAWOOD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ceilands", "luzawood_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CEILTRUNK, new ResourceLocation("ceilands", "ceiltrunk_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_LUZAWOOD, new ResourceLocation("ceilands", "luzawood_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CEILTRUNK, new ResourceLocation("ceilands", "ceiltrunk_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_LUZAWOOD, new ResourceLocation("ceilands", "luzawood_door"));
				
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CEILTRUNK, new ResourceLocation("ceilands", "ceiltrunk_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_LUZAWOOD, new ResourceLocation("ceilands", "luzawood_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CEILTRUNK, new ResourceLocation("ceilands", "ceiltrunk_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_LUZAWOOD, new ResourceLocation("ceilands", "luzawood_door"), "tall_wooden_door");
	}
}
