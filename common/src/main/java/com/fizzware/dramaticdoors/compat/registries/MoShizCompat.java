package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;


public class MoShizCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_IRON_BAR, DDNames.SHORT_MS_IRON_BAR, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "iron_bar_door"), Blocks.IRON_DOOR), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_BAMBOO, DDNames.SHORT_MS_BAMBOO, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "bamboo_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_CHERRY, DDNames.SHORT_MS_CHERRY, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "cherry_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_GLOWOOD, DDNames.SHORT_MS_GLOWOOD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "glowood_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_HELLWOOD, DDNames.SHORT_MS_HELLWOOD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "hellwood_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_MAPLE, DDNames.SHORT_MS_MAPLE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "maple_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_SILVERBELL, DDNames.SHORT_MS_SILVERBELL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "silverebell_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_TIGERWOOD, DDNames.SHORT_MS_TIGERWOOD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "tigerwood_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_WILLOW, DDNames.SHORT_MS_WILLOW, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "willow_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_GLASS, DDNames.SHORT_MS_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "glass_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_SOUL_GLASS, DDNames.SHORT_MS_SOUL_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "soul_glass_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_TINTED_GLASS, DDNames.SHORT_MS_TINTED_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "tinted_glass_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_BLACK_GLASS, DDNames.SHORT_MS_BLACK_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "black_glass_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_GREY_GLASS, DDNames.SHORT_MS_GREY_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "grey_glass_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_LIGHT_GREY_GLASS, DDNames.SHORT_MS_LIGHT_GREY_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "light_grey_glass_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_WHITE_GLASS, DDNames.SHORT_MS_WHITE_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "white_glass_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_RED_GLASS, DDNames.SHORT_MS_RED_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "red_glass_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_ORANGE_GLASS, DDNames.SHORT_MS_ORANGE_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "orange_glass_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_YELLOW_GLASS, DDNames.SHORT_MS_YELLOW_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "yellow_glass_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_LIME_GLASS, DDNames.SHORT_MS_LIME_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "lime_glass_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_GREEN_GLASS, DDNames.SHORT_MS_GREEN_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "green_glass_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_CYAN_GLASS, DDNames.SHORT_MS_CYAN_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "cyan_glass_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_BLUE_GLASS, DDNames.SHORT_MS_BLUE_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "blue_glass_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_PURPLE_GLASS, DDNames.SHORT_MS_PURPLE_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "purple_glass_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_MAGENTA_GLASS, DDNames.SHORT_MS_MAGENTA_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "magenta_glass_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_PINK_GLASS, DDNames.SHORT_MS_PINK_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "pink_glass_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_LIGHT_BLUE_GLASS, DDNames.SHORT_MS_LIGHT_BLUE_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "light_blue_glass_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_BROWN_GLASS, DDNames.SHORT_MS_BROWN_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "brown_glass_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MS_IRON_BAR, new ResourceLocation("ms", "iron_bar_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MS_BAMBOO, new ResourceLocation("ms", "bamboo_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MS_CHERRY, new ResourceLocation("ms", "cherry_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MS_GLOWOOD, new ResourceLocation("ms", "glowood_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MS_HELLWOOD, new ResourceLocation("ms", "hellwood_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MS_MAPLE, new ResourceLocation("ms", "maple_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MS_SILVERBELL, new ResourceLocation("ms", "silverbell_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MS_TIGERWOOD, new ResourceLocation("ms", "tigerwood_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MS_WILLOW, new ResourceLocation("ms", "willow_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MS_GLASS, new ResourceLocation("ms", "glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MS_SOUL_GLASS, new ResourceLocation("ms", "soul_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MS_TINTED_GLASS, new ResourceLocation("ms", "tinted_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MS_BLACK_GLASS, new ResourceLocation("ms", "black_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MS_GREY_GLASS, new ResourceLocation("ms", "grey_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MS_LIGHT_GREY_GLASS, new ResourceLocation("ms", "light_grey_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MS_WHITE_GLASS, new ResourceLocation("ms", "white_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MS_RED_GLASS, new ResourceLocation("ms", "red_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MS_ORANGE_GLASS, new ResourceLocation("ms", "orange_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MS_YELLOW_GLASS, new ResourceLocation("ms", "yellow_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MS_LIME_GLASS, new ResourceLocation("ms", "lime_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MS_GREEN_GLASS, new ResourceLocation("ms", "green_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MS_CYAN_GLASS, new ResourceLocation("ms", "cyan_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MS_BLUE_GLASS, new ResourceLocation("ms", "blue_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MS_PURPLE_GLASS, new ResourceLocation("ms", "purple_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MS_MAGENTA_GLASS, new ResourceLocation("ms", "magenta_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MS_PINK_GLASS, new ResourceLocation("ms", "pink_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MS_LIGHT_BLUE_GLASS, new ResourceLocation("ms", "light_blue_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MS_BROWN_GLASS, new ResourceLocation("ms", "brown_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MS_IRON_BAR, new ResourceLocation("ms", "iron_bar_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MS_BAMBOO, new ResourceLocation("ms", "bamboo_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MS_CHERRY, new ResourceLocation("ms", "cherry_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MS_GLOWOOD, new ResourceLocation("ms", "glowood_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MS_HELLWOOD, new ResourceLocation("ms", "hellwood_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MS_MAPLE, new ResourceLocation("ms", "maple_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MS_SILVERBELL, new ResourceLocation("ms", "silverbell_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MS_TIGERWOOD, new ResourceLocation("ms", "tigerwood_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MS_WILLOW, new ResourceLocation("ms", "willow_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MS_GLASS, new ResourceLocation("ms", "glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MS_SOUL_GLASS, new ResourceLocation("ms", "soul_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MS_TINTED_GLASS, new ResourceLocation("ms", "tinted_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MS_BLACK_GLASS, new ResourceLocation("ms", "black_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MS_GREY_GLASS, new ResourceLocation("ms", "grey_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MS_LIGHT_GREY_GLASS, new ResourceLocation("ms", "light_grey_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MS_WHITE_GLASS, new ResourceLocation("ms", "white_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MS_RED_GLASS, new ResourceLocation("ms", "red_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MS_ORANGE_GLASS, new ResourceLocation("ms", "orange_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MS_YELLOW_GLASS, new ResourceLocation("ms", "yellow_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MS_LIME_GLASS, new ResourceLocation("ms", "lime_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MS_GREEN_GLASS, new ResourceLocation("ms", "green_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MS_CYAN_GLASS, new ResourceLocation("ms", "cyan_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MS_BLUE_GLASS, new ResourceLocation("ms", "blue_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MS_PURPLE_GLASS, new ResourceLocation("ms", "purple_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MS_MAGENTA_GLASS, new ResourceLocation("ms", "magenta_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MS_PINK_GLASS, new ResourceLocation("ms", "pink_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MS_LIGHT_BLUE_GLASS, new ResourceLocation("ms", "light_blue_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MS_BROWN_GLASS, new ResourceLocation("ms", "brown_glass_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MS_IRON_BAR, new ResourceLocation("ms", "iron_bar_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MS_BAMBOO, new ResourceLocation("ms", "bamboo_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MS_CHERRY, new ResourceLocation("ms", "cherry_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MS_GLOWOOD, new ResourceLocation("ms", "glowood_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MS_HELLWOOD, new ResourceLocation("ms", "hellwood_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MS_MAPLE, new ResourceLocation("ms", "maple_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MS_SILVERBELL, new ResourceLocation("ms", "silverbell_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MS_TIGERWOOD, new ResourceLocation("ms", "tigerwood_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MS_WILLOW, new ResourceLocation("ms", "willow_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MS_GLASS, new ResourceLocation("ms", "glass_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MS_SOUL_GLASS, new ResourceLocation("ms", "soul_glass_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MS_TINTED_GLASS, new ResourceLocation("ms", "tinted_glass_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MS_BLACK_GLASS, new ResourceLocation("ms", "black_glass_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MS_GREY_GLASS, new ResourceLocation("ms", "grey_glass_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MS_LIGHT_GREY_GLASS, new ResourceLocation("ms", "light_grey_glass_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MS_WHITE_GLASS, new ResourceLocation("ms", "white_glass_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MS_RED_GLASS, new ResourceLocation("ms", "red_glass_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MS_ORANGE_GLASS, new ResourceLocation("ms", "orange_glass_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MS_YELLOW_GLASS, new ResourceLocation("ms", "yellow_glass_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MS_LIME_GLASS, new ResourceLocation("ms", "lime_glass_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MS_GREEN_GLASS, new ResourceLocation("ms", "green_glass_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MS_CYAN_GLASS, new ResourceLocation("ms", "cyan_glass_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MS_BLUE_GLASS, new ResourceLocation("ms", "blue_glass_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MS_PURPLE_GLASS, new ResourceLocation("ms", "purple_glass_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MS_MAGENTA_GLASS, new ResourceLocation("ms", "magenta_glass_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MS_PINK_GLASS, new ResourceLocation("ms", "pink_glass_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MS_LIGHT_BLUE_GLASS, new ResourceLocation("ms", "light_blue_glass_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MS_BROWN_GLASS, new ResourceLocation("ms", "brown_glass_door"), false);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MS_IRON_BAR, new ResourceLocation("ms", "iron_bar_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MS_BAMBOO, new ResourceLocation("ms", "bamboo_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MS_CHERRY, new ResourceLocation("ms", "cherry_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MS_GLOWOOD, new ResourceLocation("ms", "glowood_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MS_HELLWOOD, new ResourceLocation("ms", "hellwood_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MS_MAPLE, new ResourceLocation("ms", "maple_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MS_SILVERBELL, new ResourceLocation("ms", "silverbell_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MS_TIGERWOOD, new ResourceLocation("ms", "tigerwood_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MS_WILLOW, new ResourceLocation("ms", "willow_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MS_GLASS, new ResourceLocation("ms", "glass_door"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MS_SOUL_GLASS, new ResourceLocation("ms", "soul_glass_door"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MS_TINTED_GLASS, new ResourceLocation("ms", "tinted_glass_door"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MS_BLACK_GLASS, new ResourceLocation("ms", "black_glass_door"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MS_GREY_GLASS, new ResourceLocation("ms", "grey_glass_door"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MS_LIGHT_GREY_GLASS, new ResourceLocation("ms", "light_grey_glass_door"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MS_WHITE_GLASS, new ResourceLocation("ms", "white_glass_door"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MS_RED_GLASS, new ResourceLocation("ms", "red_glass_door"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MS_ORANGE_GLASS, new ResourceLocation("ms", "orange_glass_door"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MS_YELLOW_GLASS, new ResourceLocation("ms", "yellow_glass_door"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MS_LIME_GLASS, new ResourceLocation("ms", "lime_glass_door"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MS_GREEN_GLASS, new ResourceLocation("ms", "green_glass_door"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MS_CYAN_GLASS, new ResourceLocation("ms", "cyan_glass_door"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MS_BLUE_GLASS, new ResourceLocation("ms", "blue_glass_door"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MS_PURPLE_GLASS, new ResourceLocation("ms", "purple_glass_door"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MS_MAGENTA_GLASS, new ResourceLocation("ms", "magenta_glass_door"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MS_PINK_GLASS, new ResourceLocation("ms", "pink_glass_door"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MS_LIGHT_BLUE_GLASS, new ResourceLocation("ms", "light_blue_glass_door"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MS_BROWN_GLASS, new ResourceLocation("ms", "brown_glass_door"), "tall_glass_door");
	}
}