package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.blocks.TallSlidingDoorBlock;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;
import com.fizzware.dramaticdoors.items.DDItems;
import com.fizzware.dramaticdoors.items.TallDoorItem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import oshi.util.tuples.Pair;

public class FruitTreesCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_FT_CHERRY, DDNames.SHORT_FT_CHERRY, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("fruittrees", "cherry_door")), BlockSetType.CHERRY, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_FT_CITRUS, DDNames.SHORT_FT_CITRUS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("fruittrees", "citrus_door")), BlockSetType.OAK, true);
		Block sliding_cherry_door = new TallSlidingDoorBlock(DDBlocks.getBlockFromResourceLocation(new ResourceLocation("fruittrees", "cherry_sliding_door")), BlockSetType.CHERRY);
		DDCompatRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_FT_CHERRY_SLIDING, sliding_cherry_door));
		DDCompatRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_FT_CHERRY_SLIDING, new TallDoorItem(sliding_cherry_door, DDItems.PROPERTIES)));
	}
	
	private static void registerRecipes() {
		// Put any recipes and advancements needing to be registered here.
	}
}
