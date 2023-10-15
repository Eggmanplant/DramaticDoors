package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;


public class NethersExoticismCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_JABOTICABA, DDNames.SHORT_JABOTICABA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("nethers_exoticism", "jaboticaba_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RAMBOUTAN, DDNames.SHORT_RAMBOUTAN, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("nethers_exoticism", "ramboutan_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_JABOTICABA, new ResourceLocation("nethers_exoticism", "jaboticaba_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_RAMBOUTAN, new ResourceLocation("nethers_exoticism", "ramboutan_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_JABOTICABA, new ResourceLocation("nethers_exoticism", "jaboticaba_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_RAMBOUTAN, new ResourceLocation("nethers_exoticism", "ramboutan_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_JABOTICABA, new ResourceLocation("nethers_exoticism", "jaboticaba_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_RAMBOUTAN, new ResourceLocation("nethers_exoticism", "ramboutan_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_JABOTICABA, new ResourceLocation("nethers_exoticism", "jaboticaba_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_RAMBOUTAN, new ResourceLocation("nethers_exoticism", "ramboutan_door"), "tall_wooden_door");
	}
}
