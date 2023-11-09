package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;


public class SilentGearCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_NETHERWOOD, DDNames.SHORT_NETHERWOOD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("silentgear", "netherwood_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_NETHERWOOD, new ResourceLocation("silentgear", "netherwood_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_NETHERWOOD, new ResourceLocation("silentgear", "netherwood_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MORECRAFT_NETHERWOOD, new ResourceLocation("morecraft", "netherwood_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MORECRAFT_NETHERWOOD, new ResourceLocation("morecraft", "netherwood_door"), "tall_wooden_door");
	}
}
