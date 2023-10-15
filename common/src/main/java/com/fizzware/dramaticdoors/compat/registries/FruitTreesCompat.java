package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.blocks.TallSlidingDoorBlock;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.items.TallDoorItem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import oshi.util.tuples.Pair;

public class FruitTreesCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_FT_CHERRY, DDNames.SHORT_FT_CHERRY, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("fruittrees", "cherry_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_FT_CITRUS, DDNames.SHORT_FT_CITRUS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("fruittrees", "citrus_door")), true, DDRegistry.MAIN_TAB);
		Block sliding_cherry_door = new TallSlidingDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("fruittrees", "cherry_sliding_door")));
		DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_FT_CHERRY_SLIDING, sliding_cherry_door));
		DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_FT_CHERRY_SLIDING, new TallDoorItem(sliding_cherry_door, DDRegistry.PROPERTIES.tab(DDRegistry.MAIN_TAB))));
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_FLESH, new ResourceLocation("fruittrees", "cherry_door"));
		//DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_FULL_FLESH, new ResourceLocation("fruittrees", "cherry_sliding_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_FLESHKIN, new ResourceLocation("fruittrees", "citrus_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_FLESH, new ResourceLocation("fruittrees", "cherry_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_FULL_FLESH, new ResourceLocation("fruittrees", "cherry_sliding_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_FLESHKIN, new ResourceLocation("fruittrees", "citrus_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_FLESH, new ResourceLocation("fruittrees", "cherry_door"));
		//DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_FULL_FLESH, new ResourceLocation("fruittrees", "cherry_sliding_door"));
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_FLESHKIN, new ResourceLocation("fruittrees", "citrus_door"));
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_FLESH, new ResourceLocation("fruittrees", "cherry_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_FULL_FLESH, new ResourceLocation("fruittrees", "cherry_sliding_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_FLESHKIN, new ResourceLocation("fruittrees", "citrus_door"), "tall_wooden_door");	}
}
