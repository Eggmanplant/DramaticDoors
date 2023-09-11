package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class CauponaCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_WALNUT, DDNames.SHORT_WALNUT, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("caupona", "walnut_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_WALNUT, new ResourceLocation("caupona", "walnut_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_WALNUT, new ResourceLocation("caupona", "walnut_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_WALNUT, new ResourceLocation("caupona", "walnut_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_WALNUT, new ResourceLocation("caupona", "walnut_door"), "tall_wooden_door");
	}
}
