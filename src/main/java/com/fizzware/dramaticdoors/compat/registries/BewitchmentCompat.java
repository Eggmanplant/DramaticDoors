package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class BewitchmentCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_BW_CYPRESS, DDNames.SHORT_BW_CYPRESS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("bewitchment", "cypress_door")), BlockSetType.MANGROVE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_DRAGONS_BLOOD, DDNames.SHORT_DRAGONS_BLOOD, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("bewitchment", "dragons_blood_door")), BlockSetType.MANGROVE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_ELDER, DDNames.SHORT_ELDER, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("bewitchment", "elder_door")), BlockSetType.MANGROVE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_JUNIPER, DDNames.SHORT_JUNIPER, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("bewitchment", "juniper_door")), BlockSetType.MANGROVE, true);
		
		if (FabricLoader.getInstance().isModLoaded("bwplus")) {
			DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_YEW, DDNames.SHORT_YEW, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("bwplus", "yew_door")), BlockSetType.MANGROVE, true);
		}
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_BW_CYPRESS, new ResourceLocation("bewitchment", "cypress_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_DRAGONS_BLOOD, new ResourceLocation("bewitchment", "dragons_blood_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_ELDER, new ResourceLocation("bewitchment", "elder_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_JUNIPER, new ResourceLocation("bewitchment", "juniper_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_CYPRESS, new ResourceLocation("bewitchment", "cypress_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_DRAGONS_BLOOD, new ResourceLocation("bewitchment", "dragons_blood_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_ELDER, new ResourceLocation("bewitchment", "elder_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_JUNIPER, new ResourceLocation("bewitchment", "juniper_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_BW_CYPRESS, new ResourceLocation("bewitchment", "cypress_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_DRAGONS_BLOOD, new ResourceLocation("bewitchment", "dragons_blood_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_ELDER, new ResourceLocation("bewitchment", "elder_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_JUNIPER, new ResourceLocation("bewitchment", "juniper_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_BW_CYPRESS, new ResourceLocation("bewitchment", "cypress_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_DRAGONS_BLOOD, new ResourceLocation("bewitchment", "dragons_blood_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_ELDER, new ResourceLocation("bewitchment", "elder_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_JUNIPER, new ResourceLocation("bewitchment", "juniper_door"), "tall_wooden_door");
		
		if (FabricLoader.getInstance().isModLoaded("bwplus")) {
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_YEW, new ResourceLocation("bwplus", "yew_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_YEW, new ResourceLocation("bwplus", "yew_door"));
			
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_YEW, new ResourceLocation("bwplus", "yew_door"), true);
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_YEW, new ResourceLocation("bwplus", "yew_door"), "tall_wooden_door");
		}
	}
}
