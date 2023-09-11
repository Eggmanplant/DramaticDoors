package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class IntegratedDynamicsCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MENRIL, DDNames.SHORT_MENRIL, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("integrateddynamics", "menril_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MENRIL, new ResourceLocation("integrateddynamics", "menril_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MENRIL, new ResourceLocation("integrateddynamics", "menril_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MENRIL, new ResourceLocation("integrateddynamics", "menril_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MENRIL, new ResourceLocation("integrateddynamics", "menril_door"), "tall_wooden_door");
	}
}
