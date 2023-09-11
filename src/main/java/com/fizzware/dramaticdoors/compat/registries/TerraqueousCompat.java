package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class TerraqueousCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_TQ_LIGHT_CLOUD, DDNames.SHORT_TQ_LIGHT_CLOUD, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("terraqueous", "light_cloud_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_TQ_DENSE_CLOUD, DDNames.SHORT_TQ_DENSE_CLOUD, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("terraqueous", "dense_cloud_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_TQ_STORM_CLOUD, DDNames.SHORT_TQ_STORM_CLOUD, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("terraqueous", "storm_cloud_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_TQ_APPLE, DDNames.SHORT_TQ_APPLE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("terraqueous", "apple_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_TQ_BANANA, DDNames.SHORT_TQ_BANANA, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("terraqueous", "banana_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_TQ_CHERRY, DDNames.SHORT_TQ_CHERRY, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("terraqueous", "cherry_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_TQ_COCONUT, DDNames.SHORT_TQ_COCONUT, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("terraqueous", "coconut_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_TQ_LEMON, DDNames.SHORT_TQ_LEMON, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("terraqueous", "lemon_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_TQ_MANGO, DDNames.SHORT_TQ_MANGO, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("terraqueous", "mango_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_TQ_MULBERRY, DDNames.SHORT_TQ_MULBERRY, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("terraqueous", "mulberry_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_TQ_ORANGE, DDNames.SHORT_TQ_ORANGE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("terraqueous", "orange_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_TQ_PEACH, DDNames.SHORT_TQ_PEACH, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("terraqueous", "peach_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_TQ_PEAR, DDNames.SHORT_TQ_PEAR, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("terraqueous", "pear_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_TQ_PLUM, DDNames.SHORT_TQ_PLUM, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("terraqueous", "plum_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_TQ_LIGHT_CLOUD, new ResourceLocation("terraqueous", "light_cloud_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_TQ_DENSE_CLOUD, new ResourceLocation("terraqueous", "dense_cloud_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_TQ_STORM_CLOUD, new ResourceLocation("terraqueous", "storm_cloud_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_TQ_APPLE, new ResourceLocation("terraqueous", "apple_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_TQ_BANANA, new ResourceLocation("terraqueous", "banana_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_TQ_CHERRY, new ResourceLocation("terraqueous", "cherry_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_TQ_COCONUT, new ResourceLocation("terraqueous", "coconut_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_TQ_LEMON, new ResourceLocation("terraqueous", "lemon_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_TQ_MANGO, new ResourceLocation("terraqueous", "mango_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_TQ_MULBERRY, new ResourceLocation("terraqueous", "mulberry_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_TQ_ORANGE, new ResourceLocation("terraqueous", "orange_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_TQ_PEACH, new ResourceLocation("terraqueous", "peach_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_TQ_PEAR, new ResourceLocation("terraqueous", "pear_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_TQ_PLUM, new ResourceLocation("terraqueous", "plum_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_TQ_LIGHT_CLOUD, new ResourceLocation("terraqueous", "light_cloud_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_TQ_DENSE_CLOUD, new ResourceLocation("terraqueous", "dense_cloud_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_TQ_STORM_CLOUD, new ResourceLocation("terraqueous", "storm_cloud_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_TQ_APPLE, new ResourceLocation("terraqueous", "apple_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_TQ_BANANA, new ResourceLocation("terraqueous", "banana_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_TQ_CHERRY, new ResourceLocation("terraqueous", "cherry_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_TQ_COCONUT, new ResourceLocation("terraqueous", "coconut_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_TQ_LEMON, new ResourceLocation("terraqueous", "lemon_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_TQ_MANGO, new ResourceLocation("terraqueous", "mango_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_TQ_MULBERRY, new ResourceLocation("terraqueous", "mulberry_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_TQ_ORANGE, new ResourceLocation("terraqueous", "orange_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_TQ_PEACH, new ResourceLocation("terraqueous", "peach_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_TQ_PEAR, new ResourceLocation("terraqueous", "pear_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_TQ_PLUM, new ResourceLocation("terraqueous", "plum_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_TQ_LIGHT_CLOUD, new ResourceLocation("terraqueous", "azalea_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_TQ_DENSE_CLOUD, new ResourceLocation("terraqueous", "ebony_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_TQ_STORM_CLOUD, new ResourceLocation("terraqueous", "ebony_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_TQ_APPLE, new ResourceLocation("terraqueous", "apple_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_TQ_BANANA, new ResourceLocation("terraqueous", "banana_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_TQ_CHERRY, new ResourceLocation("terraqueous", "cherry_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_TQ_COCONUT, new ResourceLocation("terraqueous", "coconut_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_TQ_LEMON, new ResourceLocation("terraqueous", "lemon_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_TQ_MANGO, new ResourceLocation("terraqueous", "mango_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_TQ_MULBERRY, new ResourceLocation("terraqueous", "mulberry_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_TQ_ORANGE, new ResourceLocation("terraqueous", "orange_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_TQ_PEACH, new ResourceLocation("terraqueous", "peach_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_TQ_PEAR, new ResourceLocation("terraqueous", "pear_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_TQ_PLUM, new ResourceLocation("terraqueous", "plum_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_TQ_LIGHT_CLOUD, new ResourceLocation("terraqueous", "azalea_door"), "tall_tq_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_TQ_DENSE_CLOUD, new ResourceLocation("terraqueous", "ebony_door"), "tall_tq_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_TQ_STORM_CLOUD, new ResourceLocation("terraqueous", "ebony_door"), "tall_tq_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_TQ_APPLE, new ResourceLocation("terraqueous", "apple_door"), "tall_tq_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_TQ_BANANA, new ResourceLocation("terraqueous", "banana_door"), "tall_tq_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_TQ_CHERRY, new ResourceLocation("terraqueous", "cherry_door"), "tall_tq_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_TQ_COCONUT, new ResourceLocation("terraqueous", "coconut_door"), "tall_tq_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_TQ_LEMON, new ResourceLocation("terraqueous", "lemon_door"), "tall_tq_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_TQ_MANGO, new ResourceLocation("terraqueous", "mango_door"), "tall_tq_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_TQ_MULBERRY, new ResourceLocation("terraqueous", "mulberry_door"), "tall_tq_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_TQ_ORANGE, new ResourceLocation("terraqueous", "orange_door"), "tall_tq_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_TQ_PEACH, new ResourceLocation("terraqueous", "peach_door"), "tall_tq_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_TQ_PEAR, new ResourceLocation("terraqueous", "pear_door"), "tall_tq_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_TQ_PLUM, new ResourceLocation("terraqueous", "plum_door"), "tall_tq_wooden_door");

	}
}
