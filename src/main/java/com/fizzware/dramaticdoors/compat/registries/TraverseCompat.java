package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class TraverseCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_TRAVERSE_FIR, DDNames.SHORT_TRAVERSE_FIR, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("traverse", "fir_door")), BlockSetType.SPRUCE, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_TRAVERSE_FIR, new ResourceLocation("traverse", "fir_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_TRAVERSE_FIR, new ResourceLocation("traverse", "fir_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_TRAVERSE_FIR, new ResourceLocation("traverse", "fir_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_TRAVERSE_FIR, new ResourceLocation("traverse", "fir_door"), "tall_wooden_door");
	}
}
