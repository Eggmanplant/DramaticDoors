package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

//TODO: Work on Abnormals compat.
public class AbnormalsCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		// Atmospheric
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_ASPEN, DDNames.SHORT_ASPEN, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("atmospheric", "aspen_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_GRIMWOOD, DDNames.SHORT_GRIMWOOD, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("atmospheric", "grimwood_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_KOUSA, DDNames.SHORT_KOUSA, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("atmospheric", "kousa_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MORADO, DDNames.SHORT_MORADO, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("atmospheric", "morado_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_ROSEWOOD, DDNames.SHORT_ROSEWOOD, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("atmospheric", "rosewood_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_YUCCA, DDNames.SHORT_YUCCA, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("atmospheric", "yucca_door")), BlockSetType.OAK, true);

		// Autumnity
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MAPLE, DDNames.SHORT_MAPLE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("autumnity", "maple_door")), BlockSetType.OAK, true);
		
		// Buzzier Bees
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_HONEYCOMB, DDNames.SHORT_HONEYCOMB, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("buzzier_bees", "honeycomb_door")), BlockSetType.OAK, true);

		// Caverns & Chasms
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_AZALEA, DDNames.SHORT_AZALEA, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("caverns_and_chasms", "azalea_door")), BlockSetType.OAK, true);

		// Endergetic Expansion
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_POISE, DDNames.SHORT_POISE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("endergetic", "poise_door")), BlockSetType.WARPED, true);

		// Environmental
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_DARK_CHERRY, DDNames.SHORT_DARK_CHERRY, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("environmental", "cherry_door")), BlockSetType.CHERRY, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_WILLOW, DDNames.SHORT_WILLOW, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("environmental", "willow_door")), BlockSetType.MANGROVE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_WISTERIA, DDNames.SHORT_WISTERIA, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("environmental", "wisteria_door")), BlockSetType.CHERRY, true);
		
		// Upgrade Aquatic
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_DRIFTWOOD, DDNames.SHORT_DRIFTWOOD, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("upgrade_aquatic", "driftwood_door")), BlockSetType.SPRUCE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_RIVER, DDNames.SHORT_RIVER, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("upgrade_aquatic", "river_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_GLASS, DDNames.SHORT_GLASS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("upgrade_aquatic", "glass_door")), BlockSetType.STONE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_TOOTH, DDNames.SHORT_TOOTH, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("upgrade_aquatic", "tooth_door")), BlockSetType.STONE, true);
	}
	
	private static void registerRecipes() {
		if (FabricLoader.getInstance().isModLoaded("atmospheric")) {
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_ASPEN, new ResourceLocation("atmospheric", "aspen_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_GRIMWOOD, new ResourceLocation("atmospheric", "grimwood_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_KOUSA, new ResourceLocation("atmospheric", "kousa_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MORADO, new ResourceLocation("atmospheric", "morado_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_ROSEWOOD, new ResourceLocation("atmospheric", "rosewood_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_YUCCA, new ResourceLocation("atmospheric", "yucca_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_ASPEN, new ResourceLocation("atmospheric", "aspen_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_GRIMWOOD, new ResourceLocation("atmospheric", "grimwood_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_KOUSA, new ResourceLocation("atmospheric", "kousa_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MORADO, new ResourceLocation("atmospheric", "morado_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_ROSEWOOD, new ResourceLocation("atmospheric", "rosewood_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_YUCCA, new ResourceLocation("atmospheric", "yucca_door"));
			
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_ASPEN, new ResourceLocation("atmospheric", "aspen_door"), true);
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_GRIMWOOD, new ResourceLocation("atmospheric", "grimwood_door"), true);
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_KOUSA, new ResourceLocation("atmospheric", "kousa_door"), true);
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MORADO, new ResourceLocation("atmospheric", "morado_door"), true);
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_ROSEWOOD, new ResourceLocation("atmospheric", "rosewood_door"), true);
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_YUCCA, new ResourceLocation("atmospheric", "yucca_door"), true);
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_ASPEN, new ResourceLocation("atmospheric", "aspen_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_GRIMWOOD, new ResourceLocation("atmospheric", "grimwood_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_KOUSA, new ResourceLocation("atmospheric", "kousa_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MORADO, new ResourceLocation("atmospheric", "morado_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_ROSEWOOD, new ResourceLocation("atmospheric", "rosewood_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_YUCCA, new ResourceLocation("atmospheric", "yucca_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("autumnity")) {
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MAPLE, new ResourceLocation("autumnity", "maple_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MAPLE, new ResourceLocation("autumnity", "maple_door"));
	
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MAPLE, new ResourceLocation("autumnity", "maple_door"), true);
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MAPLE, new ResourceLocation("autumnity", "maple_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("buzzier_bees")) {
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_HONEYCOMB, new ResourceLocation("buzzier_Bees", "homeycomb_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_HONEYCOMB, new ResourceLocation("buzzier_Bees", "homeycomb_door"));
	
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_HONEYCOMB, new ResourceLocation("buzzier_Bees", "honeycomb_door"), false);
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_HONEYCOMB, new ResourceLocation("buzzier_Bees", "homeycomb_door"), "tall_misc_door");
		}
		if (FabricLoader.getInstance().isModLoaded("caverns_and_chasms")) {
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_AZALEA, new ResourceLocation("caverns_and_chasms", "azalea_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_AZALEA, new ResourceLocation("caverns_and_chasms", "azalea_door"));
	
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_AZALEA, new ResourceLocation("caverns_and_chasms", "azalea_door"), true);
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_AZALEA, new ResourceLocation("caverns_and_chasms", "azalea_door"), "tall_wooden_door");
	
		}
		if (FabricLoader.getInstance().isModLoaded("endergetic")) {
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_POISE, new ResourceLocation("endergetic", "poise_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_POISE, new ResourceLocation("endergetic", "poise_door"));
	
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_POISE, new ResourceLocation("endergetic", "poise_door"), true);
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_POISE, new ResourceLocation("endergetic", "poise_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("environmental")) {
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_DARK_CHERRY, new ResourceLocation("environmental", "cherry_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_WILLOW, new ResourceLocation("environmental", "willow_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_WISTERIA, new ResourceLocation("environmental", "wisteria_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_DARK_CHERRY, new ResourceLocation("environmental", "cherry_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_WILLOW, new ResourceLocation("environmental", "willow_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_WISTERIA, new ResourceLocation("environmental", "wisteria_door"));
	
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_DARK_CHERRY, new ResourceLocation("environmental", "cherry_door"), true);
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_WILLOW, new ResourceLocation("environmental", "willow_door"), true);
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_WISTERIA, new ResourceLocation("environmental", "wisteria_door"), true);
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_DARK_CHERRY, new ResourceLocation("environmental", "cherry_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_WILLOW, new ResourceLocation("environmental", "willow_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_WISTERIA, new ResourceLocation("environmental", "wisteria_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("upgrade_aquatic")) {
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_DRIFTWOOD, new ResourceLocation("upgrade_aquatic", "driftwood_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_RIVER, new ResourceLocation("upgrade_aquatic", "river_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_GLASS, new ResourceLocation("upgrade_aquatic", "glass_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_TOOTH, new ResourceLocation("upgrade_aquatic", "tooth_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_DRIFTWOOD, new ResourceLocation("upgrade_aquatic", "driftwood_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_RIVER, new ResourceLocation("upgrade_aquatic", "river_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_GLASS, new ResourceLocation("upgrade_aquatic", "glass_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_TOOTH, new ResourceLocation("upgrade_aquatic", "tooth_door"));
	
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_DRIFTWOOD, new ResourceLocation("upgrade_aquatic", "driftwood_door"), true);
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_RIVER, new ResourceLocation("upgrade_aquatic", "river_door"), true);
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_GLASS, new ResourceLocation("upgrade_aquatic", "glass_door"), false);
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_TOOTH, new ResourceLocation("upgrade_aquatic", "tooth_door"), false);
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_DRIFTWOOD, new ResourceLocation("upgrade_aquatic", "driftwood_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_RIVER, new ResourceLocation("upgrade_aquatic", "river_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_GLASS, new ResourceLocation("upgrade_aquatic", "glass_door"), "tall_misc_door");
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_TOOTH, new ResourceLocation("upgrade_aquatic", "tooth_door"), "tall_misc_door");
		}
	}
}
