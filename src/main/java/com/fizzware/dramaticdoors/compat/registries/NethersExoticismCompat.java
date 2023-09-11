package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class NethersExoticismCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_JABOTICABA, DDNames.SHORT_JABOTICABA, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("nethers_exoticism", "jaboticaba_door")), BlockSetType.CRIMSON, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_RAMBOUTAN, DDNames.SHORT_RAMBOUTAN, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("nethers_exoticism", "ramboutan_door")), BlockSetType.CRIMSON, true);
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
