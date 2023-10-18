package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class SnowySpiritCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_GINGERBREAD, DDNames.SHORT_GINGERBREAD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("snowyspirit", "gingerbread_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_GINGERBREAD, new ResourceLocation("snowyspirit", "gingerbread_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_GINGERBREAD, new ResourceLocation("snowyspirit", "gingerbread_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_GINGERBREAD, new ResourceLocation("snowyspirit", "gingerbread_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_GINGERBREAD, new ResourceLocation("snowyspirit", "gingerbread_door"), "tall_wooden_door");
	}
}
