package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class MalumCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_RUNEWOOD, DDNames.SHORT_RUNEWOOD, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("malum", "runewood_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_SOULWOOD, DDNames.SHORT_SOULWOOD, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("malum", "soulwood_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_RUNEWOOD, new ResourceLocation("malum", "runewood_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_SOULWOOD, new ResourceLocation("malum", "soulwood_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_RUNEWOOD, new ResourceLocation("malum", "runewood_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_SOULWOOD, new ResourceLocation("malum", "soulwood_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_RUNEWOOD, new ResourceLocation("malum", "runewood_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_SOULWOOD, new ResourceLocation("malum", "soulwood_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_RUNEWOOD, new ResourceLocation("malum", "runewood_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_SOULWOOD, new ResourceLocation("malum", "soulwood_door"), "tall_wooden_door");	
	}
}
