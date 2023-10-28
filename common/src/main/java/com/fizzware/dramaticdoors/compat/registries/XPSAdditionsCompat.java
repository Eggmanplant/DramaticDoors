package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;


public class XPSAdditionsCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SOUL_COPPER, DDNames.SHORT_SOUL_COPPER, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("xps_additions", "soul_copper_door"), Blocks.IRON_DOOR), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_SOUL_COPPER, new ResourceLocation("xps_additions", "soul_copper_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_SOUL_COPPER, new ResourceLocation("xps_additions", "soul_copper_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_SOUL_COPPER, new ResourceLocation("xps_additions", "soul_copper_door"));
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_SOUL_COPPER, new ResourceLocation("xps_additions", "soul_copper_door"), "tall_metal_door");
	}
}