package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class ExtendedMushroomsCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MUSHROOM, DDNames.SHORT_MUSHROOM, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("extendedmushrooms", "mushroom_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_POISONOUS_MUSHROOM, DDNames.SHORT_POISONOUS_MUSHROOM, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("extendedmushrooms", "poisonous_mushroom_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_GLOWSHROOM, DDNames.SHORT_GLOWSHROOM, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("extendedmushrooms", "glowshroom_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_HONEY_FUNGUS, DDNames.SHORT_HONEY_FUNGUS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("extendedmushrooms", "honey_fungus_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MUSHROOM, new ResourceLocation("extendedmushrooms", "mushroom_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_POISONOUS_MUSHROOM, new ResourceLocation("extendedmushrooms", "poisonous_mushroom_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_GLOWSHROOM, new ResourceLocation("extendedmushrooms", "glowshroom_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_HONEY_FUNGUS, new ResourceLocation("extendedmushrooms", "honey_fungus_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MUSHROOM, new ResourceLocation("extendedmushrooms", "mushroom_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_POISONOUS_MUSHROOM, new ResourceLocation("extendedmushrooms", "poisonous_mushroom_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_GLOWSHROOM, new ResourceLocation("extendedmushrooms", "glowshroom_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_HONEY_FUNGUS, new ResourceLocation("extendedmushrooms", "honey_fungus_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MUSHROOM, new ResourceLocation("extendedmushrooms", "mushroom_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_POISONOUS_MUSHROOM, new ResourceLocation("extendedmushrooms", "poisonous_mushroom_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_GLOWSHROOM, new ResourceLocation("extendedmushrooms", "glowshroom_mushroom_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_HONEY_FUNGUS, new ResourceLocation("extendedmushrooms", "honey_fungus_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MUSHROOM, new ResourceLocation("extendedmushrooms", "mushroom_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_POISONOUS_MUSHROOM, new ResourceLocation("extendedmushrooms", "poisonous_mushroom_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_GLOWSHROOM, new ResourceLocation("extendedmushrooms", "glowshroom_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_HONEY_FUNGUS, new ResourceLocation("extendedmushrooms", "honey_fungus_door"), "tall_wooden_door");
	}
}
