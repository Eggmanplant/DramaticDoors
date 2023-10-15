package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;


public class CobblemonCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_APRICORN, DDNames.SHORT_APRICORN, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("cobblemon", "apricorn_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_APRICORN, new ResourceLocation("cobblemon", "apricorn_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_APRICORN, new ResourceLocation("cobblemon", "apricorn_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_APRICORN, new ResourceLocation("cobblemon", "apricorn_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_APRICORN, new ResourceLocation("cobblemon", "apricorn_door"), "tall_wooden_door");
	}
}
