package com.fizzware.dramaticdoors.compat;

import java.util.ArrayList;
import java.util.List;

import org.jetbrains.annotations.Nullable;

import com.fizzware.dramaticdoors.blocks.ShortDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallSlidingDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallStableDoorBlock;
import com.fizzware.dramaticdoors.items.DDItems;
import com.fizzware.dramaticdoors.items.ShortDoorItem;
import com.fizzware.dramaticdoors.items.TallDoorItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import oshi.util.tuples.Pair;

public class DDCompatRegistry
{
	public static final List<Pair<String, Block>> DOOR_BLOCKS_TO_REGISTER = new ArrayList<Pair<String, Block>>();
	public static final List<Pair<String, Item>> DOOR_ITEMS_TO_REGISTER = new ArrayList<Pair<String, Item>>();
	
	public static void registerDoorBlockAndItem(String tallname, @Nullable String shortname, Block block, BlockSetType blocksettype, boolean includeShort) {
		Block tempBlock = createDoorBlock(block, blocksettype, true);
		Item tempItem = createDoorItem(tempBlock, true);
		DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(tallname, tempBlock));
		DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(tallname, tempItem));
		if (includeShort) {
			tempBlock = createDoorBlock(block, blocksettype, false);
			tempItem = createDoorItem(tempBlock, false);
			DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(shortname, tempBlock));
			DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(shortname, tempItem));
		}
	}
	
	public static void registerSlidingDoorBlockAndItem(String tallname, @Nullable String shortname, Block block, BlockSetType blocksettype, boolean includeShort) {
		Block tempBlock = createSlidingDoorBlock(block, blocksettype, true);
		Item tempItem = createDoorItem(tempBlock, true);
		DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(tallname, tempBlock));
		DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(tallname, tempItem));
		if (includeShort) {
			tempBlock = createSlidingDoorBlock(block, blocksettype, false);
			tempItem = createDoorItem(tempBlock, false);
			DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(shortname, tempBlock));
			DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(shortname, tempItem));
		}
	}
	
	public static void registerStableDoorBlockAndItem(String tallname, @Nullable String shortname, Block block, BlockSetType blocksettype, boolean includeShort) {
		Block tempBlock = createStableDoorBlock(block, blocksettype, true);
		Item tempItem = createDoorItem(tempBlock, true);
		DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(tallname, tempBlock));
		DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(tallname, tempItem));
		if (includeShort) {
			tempBlock = createStableDoorBlock(block, blocksettype, false);
			tempItem = createDoorItem(tempBlock, false);
			DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(shortname, tempBlock));
			DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(shortname, tempItem));
		}
	}
	
	protected static Block createSlidingDoorBlock(Block block, BlockSetType blocksettype, boolean isTall) {
		Block tempBlock;
		if (isTall) {
			tempBlock = new TallSlidingDoorBlock(block, blocksettype);
		}
		else {
			throw new IllegalArgumentException("Short version of Macaw sliding doors are currently not supported.");
			//tempBlock = new ShortSlidingDoorBlock(block, blocksettype);
		}
		return tempBlock;
	}
	
	protected static Block createStableDoorBlock(Block block, BlockSetType blocksettype, boolean isTall) {
		Block tempBlock;
		if (isTall) {
			tempBlock = new TallStableDoorBlock(block, blocksettype);
		}
		else {
			throw new IllegalArgumentException("Short version of Macaw stable doors are currently not supported.");
			//tempBlock = new ShortSlidingDoorBlock(block, blocksettype);
		}
		return tempBlock;
	}
	
	protected static Block createDoorBlock(Block block, BlockSetType blocksettype, boolean isTall) {
		Block tempBlock;
		if (isTall) {
			tempBlock = new TallDoorBlock(block, blocksettype);
		}
		else {
			tempBlock = new ShortDoorBlock(block, blocksettype);
		}
		return tempBlock;
	}
	
	protected static Item createDoorItem(Block block, boolean isTall) {
		Item tempItem;
		if (isTall) {
			tempItem = new TallDoorItem(block, DDItems.PROPERTIES);
		}
		else {
			tempItem = new ShortDoorItem(block, DDItems.PROPERTIES);
		}
		return tempItem;
	}
}
