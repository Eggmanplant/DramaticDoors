package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class CharmCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_CHARM_AZALEA, DDNames.SHORT_CHARM_AZALEA, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("charm", "azalea_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_CHARM_EBONY, DDNames.SHORT_CHARM_EBONY, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("charm", "ebony_door")), BlockSetType.DARK_OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_CHARM_AZALEA, new ResourceLocation("charm", "azalea_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_CHARM_EBONY, new ResourceLocation("charm", "ebony_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_CHARM_AZALEA, new ResourceLocation("charm", "azalea_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_CHARM_EBONY, new ResourceLocation("charm", "ebony_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_CHARM_AZALEA, new ResourceLocation("charm", "azalea_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_CHARM_EBONY, new ResourceLocation("charm", "ebony_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_CHARM_AZALEA, new ResourceLocation("charm", "azalea_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_CHARM_EBONY, new ResourceLocation("charm", "ebony_door"), "tall_wooden_door");
	}
}
