package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class PremiumWoodCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_PW_MAGIC, DDNames.SHORT_PW_MAGIC, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("premium_wood", "magic_door")), BlockSetType.SPRUCE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_PW_MAPLE, DDNames.SHORT_PW_MAPLE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("premium_wood", "maple_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_PW_PURPLE_HEART, DDNames.SHORT_PW_PURPLE_HEART, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("premium_wood", "purple_heart_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_PW_SILVERBELL, DDNames.SHORT_PW_SILVERBELL, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("premium_wood", "silverbell_door")), BlockSetType.BIRCH, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_PW_TIGER, DDNames.SHORT_PW_TIGER, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("premium_wood", "tiger_door")), BlockSetType.JUNGLE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_PW_WILLOW, DDNames.SHORT_PW_WILLOW, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("premium_wood", "willow_door")), BlockSetType.MANGROVE, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_PW_MAGIC, new ResourceLocation("premium_wood", "magic_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_PW_MAPLE, new ResourceLocation("premium_wood", "maple_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_PW_PURPLE_HEART, new ResourceLocation("premium_wood", "purple_heart_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_PW_SILVERBELL, new ResourceLocation("premium_wood", "silverbell_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_PW_TIGER, new ResourceLocation("premium_wood", "tiger_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_PW_WILLOW, new ResourceLocation("premium_wood", "willow_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_PW_MAGIC, new ResourceLocation("premium_wood", "magic_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_PW_MAPLE, new ResourceLocation("premium_wood", "maple_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_PW_PURPLE_HEART, new ResourceLocation("premium_wood", "purple_heart_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_PW_SILVERBELL, new ResourceLocation("premium_wood", "silverbell_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_PW_TIGER, new ResourceLocation("yipremium_woodppee", "tiger_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_PW_WILLOW, new ResourceLocation("premium_wood", "willow_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_PW_MAGIC, new ResourceLocation("premium_wood", "magic_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_PW_MAPLE, new ResourceLocation("premium_wood", "maple_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_PW_PURPLE_HEART, new ResourceLocation("premium_wood", "purple_heart_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_PW_SILVERBELL, new ResourceLocation("premium_wood", "silverbell_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_PW_TIGER, new ResourceLocation("premium_wood", "tiger_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_PW_WILLOW, new ResourceLocation("premium_wood", "willow_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_PW_MAGIC, new ResourceLocation("premium_wood", "magic_door"), "tall_pw_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_PW_MAPLE, new ResourceLocation("premium_wood", "maple_door"), "tall_pw_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_PW_PURPLE_HEART, new ResourceLocation("premium_wood", "purple_heart_door"), "tall_pw_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_PW_SILVERBELL, new ResourceLocation("premium_wood", "silverbell_door"), "tall_pw_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_PW_TIGER, new ResourceLocation("premium_wood", "tiger_door"), "tall_pw_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_PW_WILLOW, new ResourceLocation("premium_wood", "willow_door"), "tall_pw_wooden_door");
	}
}
