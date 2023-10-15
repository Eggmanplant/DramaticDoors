package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;


public class TechRebornCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RUBBER, DDNames.SHORT_RUBBER, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("techreborn", "rubber_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_RUBBER, new ResourceLocation("techreborn", "rubber_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_RUBBER, new ResourceLocation("techreborn", "rubber_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_RUBBER, new ResourceLocation("techreborn", "rubber_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_RUBBER, new ResourceLocation("techreborn", "rubber_door"), "tall_wooden_door");
	}
}
