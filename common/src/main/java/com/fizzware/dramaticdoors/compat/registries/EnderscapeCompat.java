package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class EnderscapeCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CELESTIAL, DDNames.SHORT_CELESTIAL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("enderscape", "celestial_door")), BlockSetType.CRIMSON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MURUSHROOM, DDNames.SHORT_MURUSHROOM, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("enderscape", "murushroom_door")), BlockSetType.WARPED, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_CELESTIAL, new ResourceLocation("enderscape", "celestial_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MURUSHROOM, new ResourceLocation("enderscape", "murushroom_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_CELESTIAL, new ResourceLocation("enderscape", "celestial_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MURUSHROOM, new ResourceLocation("enderscape", "murushroom_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_CELESTIAL, new ResourceLocation("enderscape", "celestial_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MURUSHROOM, new ResourceLocation("enderscape", "murushroom_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_CELESTIAL, new ResourceLocation("enderscape", "celestial_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MURUSHROOM, new ResourceLocation("enderscape", "murushroom_door"), "tall_wooden_door");
	}
}
