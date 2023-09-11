package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.blocks.ShortDoorBlock;
import com.fizzware.dramaticdoors.blocks.ShortFleshDoorBlock;
import com.fizzware.dramaticdoors.blocks.ShortFullFleshDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallFleshDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallFullFleshDoorBlock;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;
import com.fizzware.dramaticdoors.items.DDItems;
import com.fizzware.dramaticdoors.items.ShortDoorItem;
import com.fizzware.dramaticdoors.items.TallDoorItem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import oshi.util.tuples.Pair;

public class BiomancyCompat
{
    public static final Block SHORT_FLESH_DOOR = new ShortFleshDoorBlock(DDBlocks.getBlockFromResourceLocation(new ResourceLocation("biomancy", "flesh_door")), BlockSetType.STONE);
    public static final Block SHORT_FULL_FLESH_DOOR = new ShortFullFleshDoorBlock(DDBlocks.getBlockFromResourceLocation(new ResourceLocation("biomancy", "full_flesh_door")), BlockSetType.STONE);
    public static final Block SHORT_FLESHKIN_DOOR = new ShortDoorBlock(DDBlocks.getBlockFromResourceLocation(new ResourceLocation("biomancy", "fleshkin_door")), BlockSetType.STONE);

    public static final Block TALL_FLESH_DOOR = new TallFleshDoorBlock(DDBlocks.getBlockFromResourceLocation(new ResourceLocation("biomancy", "flesh_door")), BlockSetType.STONE);
    public static final Block TALL_FULL_FLESH_DOOR = new TallFullFleshDoorBlock(DDBlocks.getBlockFromResourceLocation(new ResourceLocation("biomancy", "full_flesh_door")), BlockSetType.STONE);
    public static final Block TALL_FLESHKIN_DOOR = new TallDoorBlock(DDBlocks.getBlockFromResourceLocation(new ResourceLocation("biomancy", "fleshkin_door")), BlockSetType.STONE);

	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_FLESH, SHORT_FLESH_DOOR));
		DDCompatRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_FULL_FLESH, SHORT_FULL_FLESH_DOOR));
		DDCompatRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_FLESHKIN, SHORT_FLESHKIN_DOOR));
		DDCompatRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_FLESH, TALL_FLESH_DOOR));
		DDCompatRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_FULL_FLESH, TALL_FULL_FLESH_DOOR));
		DDCompatRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_FLESHKIN, TALL_FLESHKIN_DOOR));

    	DDCompatRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_FLESH, new ShortDoorItem(SHORT_FLESH_DOOR, DDItems.PROPERTIES)));
    	DDCompatRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_FULL_FLESH, new ShortDoorItem(SHORT_FULL_FLESH_DOOR, DDItems.PROPERTIES)));
    	DDCompatRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_FLESHKIN, new ShortDoorItem(SHORT_FLESHKIN_DOOR, DDItems.PROPERTIES)));
    	DDCompatRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_FLESH, new TallDoorItem(TALL_FLESH_DOOR, DDItems.PROPERTIES)));
    	DDCompatRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_FULL_FLESH, new TallDoorItem(TALL_FULL_FLESH_DOOR, DDItems.PROPERTIES)));
    	DDCompatRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_FLESHKIN, new TallDoorItem(TALL_FLESHKIN_DOOR, DDItems.PROPERTIES)));
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_FLESH, new ResourceLocation("biomancy", "flesh_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_FULL_FLESH, new ResourceLocation("biomancy", "full_flesh_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_FLESHKIN, new ResourceLocation("biomancy", "fleshkin_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_FLESH, new ResourceLocation("biomancy", "flesh_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_FULL_FLESH, new ResourceLocation("biomancy", "full_flesh_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_FLESHKIN, new ResourceLocation("biomancy", "fleshkin_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_FLESH, new ResourceLocation("biomancy", "flesh_door"));
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_FULL_FLESH, new ResourceLocation("biomancy", "full_flesh_door"));
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_FLESHKIN, new ResourceLocation("biomancy", "fleshkin_door"));
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_FLESH, new ResourceLocation("biomancy", "flesh_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_FULL_FLESH, new ResourceLocation("biomancy", "full_flesh_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_FLESHKIN, new ResourceLocation("biomancy", "fleshkin_door"), "tall_misc_door");
	}
}
