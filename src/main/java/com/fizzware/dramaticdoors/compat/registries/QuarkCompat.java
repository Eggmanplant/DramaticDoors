package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class QuarkCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_QUARK_ANCIENT, DDNames.SHORT_QUARK_ANCIENT, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("quark", "ancient_door")), BlockSetType.BIRCH, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_QUARK_AZALEA, DDNames.SHORT_QUARK_AZALEA, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("quark", "azalea_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_QUARK_BLOSSOM, DDNames.SHORT_QUARK_BLOSSOM, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("quark", "blossom_door")), BlockSetType.CHERRY, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_QUARK_ANCIENT, new ResourceLocation("quark", "ancient_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_QUARK_AZALEA, new ResourceLocation("quark", "azalea_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_QUARK_BLOSSOM, new ResourceLocation("quark", "blossom_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_QUARK_ANCIENT, new ResourceLocation("quark", "ancient_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_QUARK_AZALEA, new ResourceLocation("quark", "azalea_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_QUARK_BLOSSOM, new ResourceLocation("quark", "blossom_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_QUARK_ANCIENT, new ResourceLocation("quark", "ancient_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_QUARK_AZALEA, new ResourceLocation("quark", "azalea_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_QUARK_BLOSSOM, new ResourceLocation("quark", "mystical_oak_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_QUARK_ANCIENT, new ResourceLocation("quark", "ancient_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_QUARK_AZALEA, new ResourceLocation("quark", "azalea_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_QUARK_BLOSSOM, new ResourceLocation("quark", "blossom_door"), "tall_wooden_door");
	}
}
