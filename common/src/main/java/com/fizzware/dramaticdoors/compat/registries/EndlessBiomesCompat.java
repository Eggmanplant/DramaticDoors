package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;


public class EndlessBiomesCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_EB_PENUMBRA, DDNames.SHORT_EB_PENUMBRA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("endlessbiomes", "penumbra_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_EB_TWISTED, DDNames.SHORT_EB_TWISTED, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("endlessbiomes", "twisted_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_CHESTNUT, new ResourceLocation("endlessbiomes", "penumbra_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_HOLLY, new ResourceLocation("endlessbiomes", "twisted_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_CHESTNUT, new ResourceLocation("endlessbiomes", "penumbra_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_HOLLY, new ResourceLocation("endlessbiomes", "twisted_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_CHESTNUT, new ResourceLocation("windswept", "penumbra_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_HOLLY, new ResourceLocation("endlessbiomes", "twisted_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_CHESTNUT, new ResourceLocation("endlessbiomes", "penumbra_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_HOLLY, new ResourceLocation("endlessbiomes", "twisted_door"), "tall_wooden_door");
	}
}
