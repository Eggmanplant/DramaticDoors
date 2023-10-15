package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;


public class AetherCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_AETHER_SKYROOT, DDNames.SHORT_AETHER_SKYROOT, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("aether", "skyroot_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_AETHER_SKYROOT, new ResourceLocation("aether", "skyroot_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_AETHER_SKYROOT, new ResourceLocation("aether", "skyroot_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_AETHER_SKYROOT, new ResourceLocation("aether", "skyroot_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_AETHER_SKYROOT, new ResourceLocation("aether", "skyroot_door"), "tall_wooden_door");
	}
}
