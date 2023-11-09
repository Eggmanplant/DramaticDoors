package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;


public class MalumCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RUNEWOOD, DDNames.SHORT_RUNEWOOD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("malum", "runewood_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SOULWOOD, DDNames.SHORT_SOULWOOD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("malum", "soulwood_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_RUNEWOOD, new ResourceLocation("malum", "runewood_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_SOULWOOD, new ResourceLocation("malum", "soulwood_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_RUNEWOOD, new ResourceLocation("malum", "runewood_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_SOULWOOD, new ResourceLocation("malum", "soulwood_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_RUNEWOOD, new ResourceLocation("malum", "runewood_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_SOULWOOD, new ResourceLocation("malum", "soulwood_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_RUNEWOOD, new ResourceLocation("malum", "runewood_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_SOULWOOD, new ResourceLocation("malum", "soulwood_door"), "tall_wooden_door");	
	}
}
