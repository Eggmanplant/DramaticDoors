package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class AbundantAtmosphereCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_ASH, DDNames.SHORT_ASH, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("abundant_atmosphere", "ash_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_GOURDROT, DDNames.SHORT_GOURDROT, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("abundant_atmosphere", "gourdrot_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_ASH, new ResourceLocation("abundant_atmosphere", "ash_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_GOURDROT, new ResourceLocation("abundant_atmosphere", "gourdrot_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_ASH, new ResourceLocation("abundant_atmosphere", "ash_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_GOURDROT, new ResourceLocation("abundant_atmosphere", "gourdrot_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_ASH, new ResourceLocation("abundant_atmosphere", "ash_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_GOURDROT, new ResourceLocation("abundant_atmosphere", "gourdrot_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_ASH, new ResourceLocation("abundant_atmosphere", "ash_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_GOURDROT, new ResourceLocation("abundant_atmosphere", "gourdrot_door"), "tall_wooden_door");
	}
}
