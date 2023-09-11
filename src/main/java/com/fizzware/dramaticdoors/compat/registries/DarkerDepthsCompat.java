package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class DarkerDepthsCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_PETRIFIED, DDNames.SHORT_PETRIFIED, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("darkerdepths", "petrified_door")), BlockSetType.STONE, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_PETRIFIED, new ResourceLocation("darkerdepths", "petrified_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_PETRIFIED, new ResourceLocation("darkerdepths", "petrified_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_PETRIFIED, new ResourceLocation("darkerdepths", "petrified_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_PETRIFIED, new ResourceLocation("darkerdepths", "petrified_door"), "tall_wooden_door");
	}
}
