package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class PyromancerCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_PYROWOOD, DDNames.SHORT_PYROWOOD, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("pyromancer", "pyrowood_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_ROTTEN_PLANKS, DDNames.SHORT_ROTTEN_PLANKS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("pyromancer", "rotten_planks_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_PYROWOOD, new ResourceLocation("pyromancer", "pyrowood_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_ROTTEN_PLANKS, new ResourceLocation("pyromancer", "rotten_planks_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_PYROWOOD, new ResourceLocation("pyromancer", "pyrowood_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_ROTTEN_PLANKS, new ResourceLocation("pyromancer", "rotten_planks_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_PYROWOOD, new ResourceLocation("pyromancer", "pyrowood_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_ROTTEN_PLANKS, new ResourceLocation("pyromancer", "rotten_planks_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_PYROWOOD, new ResourceLocation("pyromancer", "pyrowood_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_ROTTEN_PLANKS, new ResourceLocation("pyromancer", "rotten_planks_door"), "tall_wooden_door");
	}
}
