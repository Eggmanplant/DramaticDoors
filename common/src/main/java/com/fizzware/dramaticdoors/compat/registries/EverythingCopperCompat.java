package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.blocks.ShortCopperDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallCopperDoorBlock;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.items.ShortDoorItem;
import com.fizzware.dramaticdoors.items.TallDoorItem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.WeatheringCopper.WeatherState;
import oshi.util.tuples.Pair;

public class EverythingCopperCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		Block shortCopperDoor = new ShortCopperDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "copper_door"), Blocks.IRON_DOOR), WeatherState.UNAFFECTED);
		Block shortExposedCopperDoor = new ShortCopperDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "exposed_copper_door"), Blocks.IRON_DOOR), WeatherState.EXPOSED);
		Block shortWeatheredCopperDoor = new ShortCopperDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "weathered_copper_door"), Blocks.IRON_DOOR), WeatherState.WEATHERED);
		Block shortOxidizedCopperDoor = new ShortCopperDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "oxidized_copper_door"), Blocks.IRON_DOOR), WeatherState.OXIDIZED);
		Block shortWaxedCopperDoor = new ShortCopperDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "waxed_copper_door"), Blocks.IRON_DOOR), WeatherState.UNAFFECTED);
		Block shortWaxedExposedCopperDoor = new ShortCopperDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "waxed_exposed_copper_door"), Blocks.IRON_DOOR), WeatherState.EXPOSED);
		Block shortWaxedWeatheredCopperDoor = new ShortCopperDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "waxed_weathered_copper_door"), Blocks.IRON_DOOR), WeatherState.WEATHERED);
		Block shortWaxedOxidizedCopperDoor = new ShortCopperDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "waxed_oxidized_copper_door"), Blocks.IRON_DOOR), WeatherState.OXIDIZED);
		Block tallCopperDoor = new TallCopperDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "copper_door"), Blocks.IRON_DOOR), WeatherState.UNAFFECTED);
		Block tallExposedCopperDoor = new TallCopperDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "exposed_copper_door"), Blocks.IRON_DOOR), WeatherState.EXPOSED);
		Block tallWeatheredCopperDoor =  new TallCopperDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "weathered_copper_door"), Blocks.IRON_DOOR), WeatherState.WEATHERED);
		Block tallOxidizedCopperDoor = new TallCopperDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "oxidized_copper_door"), Blocks.IRON_DOOR), WeatherState.OXIDIZED);
		Block tallWaxedCopperDoor = new TallCopperDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "waxed_copper_door"), Blocks.IRON_DOOR), WeatherState.UNAFFECTED);
		Block tallWaxedExposedCopperDoor = new TallCopperDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "waxed_exposed_copper_door"), Blocks.IRON_DOOR), WeatherState.EXPOSED);
		Block tallWaxedWeatheredCopperDoor = new TallCopperDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "waxed_weathered_copper_door"), Blocks.IRON_DOOR), WeatherState.WEATHERED);
		Block tallWaxedOxidizedCopperDoor = new TallCopperDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "waxed_oxidized_copper_door"), Blocks.IRON_DOOR), WeatherState.OXIDIZED);
		
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_EC_COPPER, shortCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_EC_EXPOSED_COPPER, shortExposedCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_EC_WEATHERED_COPPER, shortWeatheredCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_EC_OXIDIZED_COPPER, shortOxidizedCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_EC_WAXED_COPPER, shortWaxedCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_EC_WAXED_EXPOSED_COPPER, shortWaxedExposedCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_EC_WAXED_WEATHERED_COPPER, shortWaxedWeatheredCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_EC_WAXED_OXIDIZED_COPPER, shortWaxedOxidizedCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_EC_COPPER, tallCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_EC_EXPOSED_COPPER, tallExposedCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_EC_WEATHERED_COPPER, tallWeatheredCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_EC_OXIDIZED_COPPER, tallOxidizedCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_EC_WAXED_COPPER, tallWaxedCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_EC_WAXED_EXPOSED_COPPER, tallWaxedExposedCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_EC_WAXED_WEATHERED_COPPER, tallWaxedWeatheredCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_EC_WAXED_OXIDIZED_COPPER, tallWaxedOxidizedCopperDoor));
    	
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_EC_COPPER, new ShortDoorItem(shortCopperDoor, DDRegistry.PROPERTIES.tab(DDRegistry.MAIN_TAB))));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_EC_EXPOSED_COPPER, new ShortDoorItem(shortExposedCopperDoor, DDRegistry.PROPERTIES.tab(DDRegistry.MAIN_TAB))));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_EC_WEATHERED_COPPER, new ShortDoorItem(shortWeatheredCopperDoor, DDRegistry.PROPERTIES.tab(DDRegistry.MAIN_TAB))));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_EC_OXIDIZED_COPPER, new ShortDoorItem(shortOxidizedCopperDoor, DDRegistry.PROPERTIES.tab(DDRegistry.MAIN_TAB))));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_EC_WAXED_COPPER, new ShortDoorItem(shortCopperDoor, DDRegistry.PROPERTIES.tab(DDRegistry.MAIN_TAB))));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_EC_WAXED_EXPOSED_COPPER, new ShortDoorItem(shortExposedCopperDoor, DDRegistry.PROPERTIES.tab(DDRegistry.MAIN_TAB))));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_EC_WAXED_WEATHERED_COPPER, new ShortDoorItem(shortWeatheredCopperDoor, DDRegistry.PROPERTIES.tab(DDRegistry.MAIN_TAB))));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_EC_WAXED_OXIDIZED_COPPER, new ShortDoorItem(shortOxidizedCopperDoor, DDRegistry.PROPERTIES.tab(DDRegistry.MAIN_TAB))));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_EC_COPPER, new TallDoorItem(tallCopperDoor, DDRegistry.PROPERTIES.tab(DDRegistry.MAIN_TAB))));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_EC_EXPOSED_COPPER, new TallDoorItem(tallExposedCopperDoor, DDRegistry.PROPERTIES.tab(DDRegistry.MAIN_TAB))));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_EC_WEATHERED_COPPER, new TallDoorItem(tallWeatheredCopperDoor, DDRegistry.PROPERTIES.tab(DDRegistry.MAIN_TAB))));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_EC_OXIDIZED_COPPER, new TallDoorItem(tallOxidizedCopperDoor, DDRegistry.PROPERTIES.tab(DDRegistry.MAIN_TAB))));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_EC_WAXED_COPPER, new TallDoorItem(tallCopperDoor, DDRegistry.PROPERTIES.tab(DDRegistry.MAIN_TAB))));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_EC_WAXED_EXPOSED_COPPER, new TallDoorItem(tallExposedCopperDoor, DDRegistry.PROPERTIES.tab(DDRegistry.MAIN_TAB))));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_EC_WAXED_WEATHERED_COPPER, new TallDoorItem(tallWeatheredCopperDoor, DDRegistry.PROPERTIES.tab(DDRegistry.MAIN_TAB))));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_EC_WAXED_OXIDIZED_COPPER, new TallDoorItem(tallOxidizedCopperDoor, DDRegistry.PROPERTIES.tab(DDRegistry.MAIN_TAB))));

	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_EC_COPPER, new ResourceLocation("everythingcopper", "copper_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_EC_EXPOSED_COPPER, new ResourceLocation("everythingcopper", "exposed_copper_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_EC_WEATHERED_COPPER, new ResourceLocation("everythingcopper", "weathered_copper_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_EC_OXIDIZED_COPPER, new ResourceLocation("everythingcopper", "oxidized_copper_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_EC_WAXED_COPPER, new ResourceLocation("everythingcopper", "waxed_copper_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_EC_WAXED_EXPOSED_COPPER, new ResourceLocation("everythingcopper", "waxed_exposed_copper_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_EC_WAXED_WEATHERED_COPPER, new ResourceLocation("everythingcopper", "waxed_weathered_copper_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_EC_WAXED_OXIDIZED_COPPER, new ResourceLocation("everythingcopper", "waxed_oxidized_copper_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_EC_COPPER, new ResourceLocation("everythingcopper", "copper_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_EC_EXPOSED_COPPER, new ResourceLocation("everythingcopper", "exposed_copper_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_EC_WEATHERED_COPPER, new ResourceLocation("everythingcopper", "weathered_copper_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_EC_OXIDIZED_COPPER, new ResourceLocation("everythingcopper", "oxidized_copper_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_EC_WAXED_COPPER, new ResourceLocation("everythingcopper", "waxed_copper_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_EC_WAXED_EXPOSED_COPPER, new ResourceLocation("everythingcopper", "waxed_exposed_copper_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_EC_WAXED_WEATHERED_COPPER, new ResourceLocation("everythingcopper", "waxed_weathered_copper_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_EC_WAXED_OXIDIZED_COPPER, new ResourceLocation("everythingcopper", "waxed_oxidized_copper_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_EC_COPPER, new ResourceLocation("everythingcopper", "copper_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_EC_EXPOSED_COPPER, new ResourceLocation("everythingcopper", "exposed_copper_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_EC_WEATHERED_COPPER, new ResourceLocation("everythingcopper", "weathered_copper_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_EC_OXIDIZED_COPPER, new ResourceLocation("everythingcopper", "oxidized_copper_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_EC_WAXED_COPPER, new ResourceLocation("everythingcopper", "waxed_copper_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_EC_WAXED_EXPOSED_COPPER, new ResourceLocation("everythingcopper", "waxed_exposed_copper_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_EC_WAXED_WEATHERED_COPPER, new ResourceLocation("everythingcopper", "waxed_weathered_copper_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_EC_WAXED_OXIDIZED_COPPER, new ResourceLocation("everythingcopper", "waxed_oxidized_copper_door"), false);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_EC_COPPER, new ResourceLocation("everythingcopper", "copper_door"), "tall_copper_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_EC_EXPOSED_COPPER, new ResourceLocation("everythingcopper", "exposed_copper_door"), "tall_copper_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_EC_WEATHERED_COPPER, new ResourceLocation("everythingcopper", "weathered_copper_door"), "tall_copper_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_EC_OXIDIZED_COPPER, new ResourceLocation("everythingcopper", "oxidized_copper_door"), "tall_copper_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_EC_WAXED_COPPER, new ResourceLocation("everythingcopper", "copper_door"), "tall_copper_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_EC_WAXED_EXPOSED_COPPER, new ResourceLocation("everythingcopper", "waxed_exposed_copper_door"), "tall_copper_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_EC_WAXED_WEATHERED_COPPER, new ResourceLocation("everythingcopper", "waxed_weathered_copper_door"), "tall_copper_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_EC_WAXED_OXIDIZED_COPPER, new ResourceLocation("everythingcopper", "waxed_oxidized_copper_door"), "tall_copper_door");
	}
}
