package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;


public class CharmCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CHARM_AZALEA, DDNames.SHORT_CHARM_AZALEA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("charm", "azalea_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CHARM_EBONY, DDNames.SHORT_CHARM_EBONY, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("charm", "ebony_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CHARM_AZALEA, new ResourceLocation("charm", "azalea_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CHARM_EBONY, new ResourceLocation("charm", "ebony_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CHARM_AZALEA, new ResourceLocation("charm", "azalea_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CHARM_EBONY, new ResourceLocation("charm", "ebony_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CHARM_AZALEA, new ResourceLocation("charm", "azalea_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CHARM_EBONY, new ResourceLocation("charm", "ebony_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CHARM_AZALEA, new ResourceLocation("charm", "azalea_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CHARM_EBONY, new ResourceLocation("charm", "ebony_door"), "tall_wooden_door");
	}
}
