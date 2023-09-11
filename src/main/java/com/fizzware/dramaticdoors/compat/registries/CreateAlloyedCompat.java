package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class CreateAlloyedCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_STEEL, DDNames.SHORT_STEEL, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("alloyed", "steel_door")), BlockSetType.IRON, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_LOCKED_STEEL, DDNames.SHORT_LOCKED_STEEL, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("alloyed", "locked_steel_door")), BlockSetType.IRON, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_STEEL, new ResourceLocation("alloyed", "steel_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_LOCKED_STEEL, new ResourceLocation("alloyed", "locked_steel_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_STEEL, new ResourceLocation("alloyed", "steel_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_LOCKED_STEEL, new ResourceLocation("alloyed", "locked_steel_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_STEEL, new ResourceLocation("alloyed", "steel_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_LOCKED_STEEL, new ResourceLocation("alloyed", "locked_steel_door"), false);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_STEEL, new ResourceLocation("alloyed", "steel_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_LOCKED_STEEL, new ResourceLocation("alloyed", "locked_steel_door"), "tall_metal_door");
	}
}
