package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class TwigsCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_STRIPPED_BAMBOO, DDNames.SHORT_STRIPPED_BAMBOO, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("twigs", "stripped_bamboo_door")), BlockSetType.BAMBOO, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_STRIPPED_BAMBOO, new ResourceLocation("twigs", "stripped_bamboo_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_STRIPPED_BAMBOO, new ResourceLocation("twigs", "stripped_bamboo_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_STRIPPED_BAMBOO, new ResourceLocation("twigs", "stripped_bamboo_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_STRIPPED_BAMBOO, new ResourceLocation("twigs", "stripped_bamboo_door"), "tall_wooden_door");
	}
}
