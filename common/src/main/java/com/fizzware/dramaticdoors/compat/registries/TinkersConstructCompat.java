package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;


public class TinkersConstructCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BLOODSHROOM, DDNames.SHORT_BLOODSHROOM, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("tconstruct", "bloodshroom_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_GREENHEART, DDNames.SHORT_GREENHEART, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("tconstruct", "greenheart_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SKYROOT, DDNames.SHORT_SKYROOT, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("tconstruct", "skyroot_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_BLOODSHROOM, new ResourceLocation("tconstruct", "bloodshroom_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_GREENHEART, new ResourceLocation("tconstruct", "greenheart_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_SKYROOT, new ResourceLocation("tconstruct", "skyroot_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_BLOODSHROOM, new ResourceLocation("tconstruct", "bloodshroom_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_GREENHEART, new ResourceLocation("tconstruct", "greenheart_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_SKYROOT, new ResourceLocation("tconstruct", "skyroot_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_BLOODSHROOM, new ResourceLocation("tconstruct", "bloodshroom_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_GREENHEART, new ResourceLocation("tconstruct", "greenheart_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_SKYROOT, new ResourceLocation("tconstruct", "skyroot_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_BLOODSHROOM, new ResourceLocation("tconstruct", "bloodshroom_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_GREENHEART, new ResourceLocation("tconstruct", "greenheart_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_SKYROOT, new ResourceLocation("tconstruct", "skyroot_door"), "tall_wooden_door");
	}
}