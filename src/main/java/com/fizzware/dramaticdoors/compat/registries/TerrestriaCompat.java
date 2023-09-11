package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class TerrestriaCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_TERRESTRIA_CYPRESS, DDNames.SHORT_TERRESTRIA_CYPRESS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("terrestria", "cypress_door")), BlockSetType.MANGROVE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_TERRESTRIA_HEMLOCK, DDNames.SHORT_TERRESTRIA_HEMLOCK, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("terrestria", "hemlock_door")), BlockSetType.JUNGLE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_TERRESTRIA_JAPANESE_MAPLE, DDNames.SHORT_TERRESTRIA_JAPANESE_MAPLE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("terrestria", "japanese_maple_door")), BlockSetType.CHERRY, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_TERRESTRIA_RAINBOW_EUCALYPTUS, DDNames.SHORT_TERRESTRIA_RAINBOW_EUCALYPTUS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("terrestria", "rainbow_eucalyptus_door")), BlockSetType.MANGROVE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_TERRESTRIA_REDWOOD, DDNames.SHORT_TERRESTRIA_REDWOOD, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("terrestria", "redwood_door")), BlockSetType.SPRUCE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_TERRESTRIA_RUBBER, DDNames.SHORT_TERRESTRIA_RUBBER, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("terrestria", "rubber_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_TERRESTRIA_SAKURA, DDNames.SHORT_TERRESTRIA_SAKURA, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("terrestria", "sakura_door")), BlockSetType.CHERRY, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_TERRESTRIA_WILLOW, DDNames.SHORT_TERRESTRIA_WILLOW, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("terrestria", "willow_door")), BlockSetType.MANGROVE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_TERRESTRIA_YUCCA_PALM, DDNames.SHORT_TERRESTRIA_YUCCA_PALM, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("terrestria", "yucca_palm_door")), BlockSetType.JUNGLE, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_TERRESTRIA_CYPRESS, new ResourceLocation("terrestria", "cypress_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_TERRESTRIA_HEMLOCK, new ResourceLocation("terrestria", "hemlock_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_TERRESTRIA_JAPANESE_MAPLE, new ResourceLocation("terrestria", "japanese_maple_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_TERRESTRIA_RAINBOW_EUCALYPTUS, new ResourceLocation("terrestria", "rainbow_eucalyptus_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_TERRESTRIA_REDWOOD, new ResourceLocation("terrestria", "redwood_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_TERRESTRIA_RUBBER, new ResourceLocation("terrestria", "rubber_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_TERRESTRIA_SAKURA, new ResourceLocation("terrestria", "sakura_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_TERRESTRIA_WILLOW, new ResourceLocation("terrestria", "willow_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_TERRESTRIA_YUCCA_PALM, new ResourceLocation("terrestria", "yucca_palm_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_TERRESTRIA_CYPRESS, new ResourceLocation("terrestria", "cypress_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_TERRESTRIA_HEMLOCK, new ResourceLocation("terrestria", "hemlock_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_TERRESTRIA_JAPANESE_MAPLE, new ResourceLocation("terrestria", "japanese_maple_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_TERRESTRIA_RAINBOW_EUCALYPTUS, new ResourceLocation("terrestria", "rainbow_eucalyptus_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_TERRESTRIA_REDWOOD, new ResourceLocation("terrestria", "redwood_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_TERRESTRIA_RUBBER, new ResourceLocation("terrestria", "rubber_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_TERRESTRIA_SAKURA, new ResourceLocation("terrestria", "sakura_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_TERRESTRIA_WILLOW, new ResourceLocation("terrestria", "willow_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_TERRESTRIA_YUCCA_PALM, new ResourceLocation("terrestria", "yucca_palm_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_TERRESTRIA_CYPRESS, new ResourceLocation("terrestria", "cypress_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_TERRESTRIA_HEMLOCK, new ResourceLocation("terrestria", "hemlock_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_TERRESTRIA_JAPANESE_MAPLE, new ResourceLocation("terrestria", "japanese_maple_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_TERRESTRIA_RAINBOW_EUCALYPTUS, new ResourceLocation("terrestria", "rainbow_eucalyptus_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_TERRESTRIA_REDWOOD, new ResourceLocation("terrestria", "redwood_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_TERRESTRIA_RUBBER, new ResourceLocation("terrestria", "rubber_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_TERRESTRIA_SAKURA, new ResourceLocation("terrestria", "sakura_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_TERRESTRIA_WILLOW, new ResourceLocation("terrestria", "willow_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_TERRESTRIA_YUCCA_PALM, new ResourceLocation("terrestria", "yucca_palm_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_TERRESTRIA_CYPRESS, new ResourceLocation("terrestria", "cypress_door"), "tall_terrestria_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_TERRESTRIA_HEMLOCK, new ResourceLocation("terrestria", "hemlock_door"), "tall_terrestria_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_TERRESTRIA_JAPANESE_MAPLE, new ResourceLocation("terrestria", "japanese_maple_door"), "tall_terrestria_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_TERRESTRIA_RAINBOW_EUCALYPTUS, new ResourceLocation("terrestria", "rainbow_eucalyptus_door"), "tall_terrestria_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_TERRESTRIA_REDWOOD, new ResourceLocation("terrestria", "redwood_door"), "tall_terrestria_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_TERRESTRIA_RUBBER, new ResourceLocation("terrestria", "rubber_door"), "tall_terrestria_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_TERRESTRIA_SAKURA, new ResourceLocation("terrestria", "sakura_door"), "tall_terrestria_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_TERRESTRIA_WILLOW, new ResourceLocation("terrestria", "willow_door"), "tall_terrestria_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_TERRESTRIA_YUCCA_PALM, new ResourceLocation("terrestria", "yucca_palm_door"), "tall_terrestria_wooden_door");
	}
}
