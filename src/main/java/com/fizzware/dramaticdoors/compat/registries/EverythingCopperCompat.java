package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.blocks.ShortCopperDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallCopperDoorBlock;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;
import com.fizzware.dramaticdoors.items.DDItems;
import com.fizzware.dramaticdoors.items.ShortDoorItem;
import com.fizzware.dramaticdoors.items.TallDoorItem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.WeatheringCopper.WeatherState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import oshi.util.tuples.Pair;

public class EverythingCopperCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		Block shortCopperDoor = new ShortCopperDoorBlock(DDBlocks.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.UNAFFECTED);
		Block shortExposedCopperDoor = new ShortCopperDoorBlock(DDBlocks.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "exposed_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.EXPOSED);
		Block shortWeatheredCopperDoor = new ShortCopperDoorBlock(DDBlocks.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "weathered_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.WEATHERED);
		Block shortOxidizedCopperDoor = new ShortCopperDoorBlock(DDBlocks.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "oxidized_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.OXIDIZED);
		Block shortWaxedCopperDoor = new ShortCopperDoorBlock(DDBlocks.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "waxed_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.UNAFFECTED);
		Block shortWaxedExposedCopperDoor = new ShortCopperDoorBlock(DDBlocks.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "waxed_exposed_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.EXPOSED);
		Block shortWaxedWeatheredCopperDoor = new ShortCopperDoorBlock(DDBlocks.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "waxed_weathered_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.WEATHERED);
		Block shortWaxedOxidizedCopperDoor = new ShortCopperDoorBlock(DDBlocks.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "waxed_oxidized_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.OXIDIZED);
		Block tallCopperDoor = new TallCopperDoorBlock(DDBlocks.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.UNAFFECTED);
		Block tallExposedCopperDoor = new TallCopperDoorBlock(DDBlocks.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "exposed_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.EXPOSED);
		Block tallWeatheredCopperDoor =  new TallCopperDoorBlock(DDBlocks.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "weathered_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.WEATHERED);
		Block tallOxidizedCopperDoor = new TallCopperDoorBlock(DDBlocks.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "oxidized_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.OXIDIZED);
		Block tallWaxedCopperDoor = new TallCopperDoorBlock(DDBlocks.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "waxed_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.UNAFFECTED);
		Block tallWaxedExposedCopperDoor = new TallCopperDoorBlock(DDBlocks.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "waxed_exposed_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.EXPOSED);
		Block tallWaxedWeatheredCopperDoor = new TallCopperDoorBlock(DDBlocks.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "waxed_weathered_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.WEATHERED);
		Block tallWaxedOxidizedCopperDoor = new TallCopperDoorBlock(DDBlocks.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "waxed_oxidized_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.OXIDIZED);
		
    	DDCompatRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_EC_COPPER, shortCopperDoor));
    	DDCompatRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_EC_EXPOSED_COPPER, shortExposedCopperDoor));
    	DDCompatRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_EC_WEATHERED_COPPER, shortWeatheredCopperDoor));
    	DDCompatRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_EC_OXIDIZED_COPPER, shortOxidizedCopperDoor));
    	DDCompatRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_EC_WAXED_COPPER, shortWaxedCopperDoor));
    	DDCompatRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_EC_WAXED_EXPOSED_COPPER, shortWaxedExposedCopperDoor));
    	DDCompatRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_EC_WAXED_WEATHERED_COPPER, shortWaxedWeatheredCopperDoor));
    	DDCompatRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_EC_WAXED_OXIDIZED_COPPER, shortWaxedOxidizedCopperDoor));
    	DDCompatRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_EC_COPPER, tallCopperDoor));
    	DDCompatRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_EC_EXPOSED_COPPER, tallExposedCopperDoor));
    	DDCompatRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_EC_WEATHERED_COPPER, tallWeatheredCopperDoor));
    	DDCompatRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_EC_OXIDIZED_COPPER, tallOxidizedCopperDoor));
    	DDCompatRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_EC_WAXED_COPPER, tallWaxedCopperDoor));
    	DDCompatRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_EC_WAXED_EXPOSED_COPPER, tallWaxedExposedCopperDoor));
    	DDCompatRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_EC_WAXED_WEATHERED_COPPER, tallWaxedWeatheredCopperDoor));
    	DDCompatRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_EC_WAXED_OXIDIZED_COPPER, tallWaxedOxidizedCopperDoor));
    	
    	DDCompatRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_EC_COPPER, new ShortDoorItem(shortCopperDoor, DDItems.PROPERTIES)));
    	DDCompatRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_EC_EXPOSED_COPPER, new ShortDoorItem(shortExposedCopperDoor, DDItems.PROPERTIES)));
    	DDCompatRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_EC_WEATHERED_COPPER, new ShortDoorItem(shortWeatheredCopperDoor, DDItems.PROPERTIES)));
    	DDCompatRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_EC_OXIDIZED_COPPER, new ShortDoorItem(shortOxidizedCopperDoor, DDItems.PROPERTIES)));
    	DDCompatRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_EC_WAXED_COPPER, new ShortDoorItem(shortCopperDoor, DDItems.PROPERTIES)));
    	DDCompatRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_EC_WAXED_EXPOSED_COPPER, new ShortDoorItem(shortExposedCopperDoor, DDItems.PROPERTIES)));
    	DDCompatRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_EC_WAXED_WEATHERED_COPPER, new ShortDoorItem(shortWeatheredCopperDoor, DDItems.PROPERTIES)));
    	DDCompatRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_EC_WAXED_OXIDIZED_COPPER, new ShortDoorItem(shortOxidizedCopperDoor, DDItems.PROPERTIES)));
    	DDCompatRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_EC_COPPER, new TallDoorItem(tallCopperDoor, DDItems.PROPERTIES)));
    	DDCompatRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_EC_EXPOSED_COPPER, new TallDoorItem(tallExposedCopperDoor, DDItems.PROPERTIES)));
    	DDCompatRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_EC_WEATHERED_COPPER, new TallDoorItem(tallWeatheredCopperDoor, DDItems.PROPERTIES)));
    	DDCompatRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_EC_OXIDIZED_COPPER, new TallDoorItem(tallOxidizedCopperDoor, DDItems.PROPERTIES)));
    	DDCompatRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_EC_WAXED_COPPER, new TallDoorItem(tallCopperDoor, DDItems.PROPERTIES)));
    	DDCompatRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_EC_WAXED_EXPOSED_COPPER, new TallDoorItem(tallExposedCopperDoor, DDItems.PROPERTIES)));
    	DDCompatRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_EC_WAXED_WEATHERED_COPPER, new TallDoorItem(tallWeatheredCopperDoor, DDItems.PROPERTIES)));
    	DDCompatRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_EC_WAXED_OXIDIZED_COPPER, new TallDoorItem(tallOxidizedCopperDoor, DDItems.PROPERTIES)));

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
