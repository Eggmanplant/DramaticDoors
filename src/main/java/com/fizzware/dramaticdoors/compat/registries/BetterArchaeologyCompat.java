package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class BetterArchaeologyCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_ROTTEN, DDNames.SHORT_ROTTEN, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("betterarcheology", "rotten_door")), BlockSetType.SPRUCE, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_ROTTEN, new ResourceLocation("betterarcheology", "rotten_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_ROTTEN, new ResourceLocation("betterarcheology", "rotten_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_ROTTEN, new ResourceLocation("betterarcheology", "rotten_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_ROTTEN, new ResourceLocation("betterarcheology", "rotten_door"), "tall_wooden_door");
	}
}
