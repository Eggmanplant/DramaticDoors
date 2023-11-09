package com.fizzware.dramaticdoors;

import java.util.ArrayList;
import java.util.List;

import org.jetbrains.annotations.Nullable;

import com.fizzware.dramaticdoors.blocks.ShortDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallSlidingDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallStableDoorBlock;
import com.fizzware.dramaticdoors.items.ModdedTab;
import com.fizzware.dramaticdoors.items.ShortDoorItem;
import com.fizzware.dramaticdoors.items.TallDoorItem;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import oshi.util.tuples.Pair;

public class DDRegistry
{
	public static final List<Pair<String, Block>> DOOR_BLOCKS_TO_REGISTER = new ArrayList<Pair<String, Block>>();
	public static final List<Pair<String, Item>> DOOR_ITEMS_TO_REGISTER = new ArrayList<Pair<String, Item>>();
	
	public static final Item.Properties PROPERTIES = new Item.Properties();

	public static CreativeModeTab MAIN_TAB = null;
	public static CreativeModeTab CHIPPED_TAB = null;
	public static CreativeModeTab MACAW_TAB = null;
	public static CreativeModeTab MANYIDEAS_TAB = null;
	
	public static void registerTabs(ModdedTab tabSystem) {
		MAIN_TAB = tabSystem.createTab("dramaticdoors", () -> { return new ItemStack(Registry.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_OAK))); }, null);
		CHIPPED_TAB = tabSystem.createTab("dramaticdoors_chipped", () -> { return new ItemStack(Registry.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_GATED))); }, "chipped");
		MACAW_TAB = tabSystem.createTab("dramaticdoors_macaw", () -> { return new ItemStack(Registry.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BARN))); }, "mcwdoors");
		MANYIDEAS_TAB = tabSystem.createTab("dramaticdoors_manyideas", () -> { return new ItemStack(Registry.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_BLANK))); }, "manyideas_doors");
	}
	
	public static void registerVanilla() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_IRON, DDNames.SHORT_IRON, Blocks.IRON_DOOR, true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_OAK, DDNames.SHORT_OAK, Blocks.OAK_DOOR, true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SPRUCE, DDNames.SHORT_SPRUCE, Blocks.SPRUCE_DOOR, true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BIRCH, DDNames.SHORT_BIRCH, Blocks.BIRCH_DOOR, true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_JUNGLE, DDNames.SHORT_JUNGLE, Blocks.JUNGLE_DOOR, true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ACACIA, DDNames.SHORT_ACACIA, Blocks.ACACIA_DOOR, true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_DARK_OAK, DDNames.SHORT_DARK_OAK, Blocks.DARK_OAK_DOOR, true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MANGROVE, DDNames.SHORT_MANGROVE, Blocks.MANGROVE_DOOR, true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CRIMSON, DDNames.SHORT_CRIMSON, Blocks.CRIMSON_DOOR, true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_WARPED, DDNames.SHORT_WARPED, Blocks.WARPED_DOOR, true, DDRegistry.MAIN_TAB);
	}
	
	/* Utility functions for creating blocks and items. */
	public static void registerDoorBlockAndItem(String tallname, @Nullable String shortname, Block block, boolean includeShort, CreativeModeTab tab) {
		Block tempBlock = createDoorBlock(block, true);
		Item tempItem = createDoorItem(tempBlock, true, tab);
		DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(tallname, tempBlock));
		DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(tallname, tempItem));
		if (includeShort) {
			tempBlock = createDoorBlock(block, false);
			tempItem = createDoorItem(tempBlock, false, tab);
			DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(shortname, tempBlock));
			DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(shortname, tempItem));
		}
	}
	
	public static void registerDoorBlockAndItem(String tallname, @Nullable String shortname, Properties properties, boolean includeShort, CreativeModeTab tab) {
		Block tempBlock = createDoorBlock(properties, true);
		Item tempItem = createDoorItem(tempBlock, true, tab);
		DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(tallname, tempBlock));
		DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(tallname, tempItem));
		if (includeShort) {
			tempBlock = createDoorBlock(properties, false);
			tempItem = createDoorItem(tempBlock, false, tab);
			DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(shortname, tempBlock));
			DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(shortname, tempItem));
		}
	}
	
	public static void registerSlidingDoorBlockAndItem(String tallname, @Nullable String shortname, Block block, boolean includeShort, CreativeModeTab tab) {
		Block tempBlock = createSlidingDoorBlock(block, true);
		Item tempItem = createDoorItem(tempBlock, true, tab);
		DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(tallname, tempBlock));
		DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(tallname, tempItem));
		if (includeShort) {
			tempBlock = createSlidingDoorBlock(block, false);
			tempItem = createDoorItem(tempBlock, false, tab);
			DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(shortname, tempBlock));
			DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(shortname, tempItem));
		}
	}
	
	public static void registerStableDoorBlockAndItem(String tallname, @Nullable String shortname, Block block, boolean includeShort, CreativeModeTab tab) {
		Block tempBlock = createStableDoorBlock(block, true);
		Item tempItem = createDoorItem(tempBlock, true, tab);
		DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(tallname, tempBlock));
		DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(tallname, tempItem));
		if (includeShort) {
			tempBlock = createStableDoorBlock(block, false);
			tempItem = createDoorItem(tempBlock, false, tab);
			DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(shortname, tempBlock));
			DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(shortname, tempItem));
		}
	}
	
	protected static Block createSlidingDoorBlock(Block block, boolean isTall) {
		Block tempBlock;
		if (isTall) {
			tempBlock = new TallSlidingDoorBlock(block);
		}
		else {
			throw new IllegalArgumentException("Short version of Macaw sliding doors are currently not supported.");
			//tempBlock = new ShortSlidingDoorBlock(block, blocksettype);
		}
		return tempBlock;
	}
	
	protected static Block createStableDoorBlock(Block block, boolean isTall) {
		Block tempBlock;
		if (isTall) {
			tempBlock = new TallStableDoorBlock(block);
		}
		else {
			throw new IllegalArgumentException("Short version of Macaw stable doors are currently not supported.");
			//tempBlock = new ShortSlidingDoorBlock(block, blocksettype);
		}
		return tempBlock;
	}
	
	protected static Block createDoorBlock(Block block, boolean isTall) {
		Block tempBlock;
		if (isTall) {
			tempBlock = new TallDoorBlock(block);
		}
		else {
			tempBlock = new ShortDoorBlock(block);
		}
		return tempBlock;
	}
	
	protected static Block createDoorBlock(Properties properties, boolean isTall) {
		Block tempBlock;
		if (isTall) {
			tempBlock = new TallDoorBlock(properties);
		}
		else {
			tempBlock = new ShortDoorBlock(properties);
		}
		return tempBlock;
	}
	
	protected static Item createDoorItem(Block block, boolean isTall, CreativeModeTab tab) {
		Item tempItem;
		if (isTall) {
			tempItem = new TallDoorItem(block, DDRegistry.PROPERTIES.tab(tab));
		}
		else {
			tempItem = new ShortDoorItem(block, DDRegistry.PROPERTIES.tab(tab));
		}
		return tempItem;
	}
	
	/* Utility functions for getting blocks by key. */
    public static Block getBlockByKey(ResourceLocation loc) {
    	return getBlockByKey(loc, Blocks.OAK_DOOR);
    }
	
	public static Block getBlockByKey(ResourceLocation loc, Block fallback) {
    	if (Registry.BLOCK.containsKey(loc)) {
    		return Registry.BLOCK.get(loc);
    	}
    	else {
    		return fallback; // Fallback
    	}
    }
    
    public static Block getBlockFromResourceLocation(ResourceLocation resource) {
    	return getBlockFromResourceLocation(resource, Blocks.OAK_DOOR);
    }
    
    public static Block getBlockFromResourceLocation(ResourceLocation resource, Block fallback) {
    	return Registry.BLOCK.getOptional(resource).orElse(fallback);
    }

}
