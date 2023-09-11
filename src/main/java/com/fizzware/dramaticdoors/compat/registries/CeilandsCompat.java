package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class CeilandsCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_CEILTRUNK, DDNames.SHORT_CEILTRUNK, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("ceilands", "ceiltrunk_door")), BlockSetType.JUNGLE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_LUZAWOOD, DDNames.SHORT_LUZAWOOD, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("ceilands", "luzawood_door")), BlockSetType.CHERRY, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_CEILTRUNK, new ResourceLocation("ceilands", "ceiltrunk_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_LUZAWOOD, new ResourceLocation("ceilands", "luzawood_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_CEILTRUNK, new ResourceLocation("ceilands", "ceiltrunk_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_LUZAWOOD, new ResourceLocation("ceilands", "luzawood_door"));
				
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_CEILTRUNK, new ResourceLocation("ceilands", "ceiltrunk_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_LUZAWOOD, new ResourceLocation("ceilands", "luzawood_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_CEILTRUNK, new ResourceLocation("ceilands", "ceiltrunk_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_LUZAWOOD, new ResourceLocation("ceilands", "luzawood_door"), "tall_wooden_door");
	}
}
