package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.blocks.ShortFrameDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallFrameDoorBlock;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.items.ShortDoorItem;
import com.fizzware.dramaticdoors.items.TallDoorItem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import oshi.util.tuples.Pair;

public class BlockCarpentryCompat
{
	public static boolean initialized = false;

	public static ShortFrameDoorBlock SHORT_FRAME_DOOR;
	public static ShortFrameDoorBlock SHORT_ILLUSION_DOOR;
	public static TallFrameDoorBlock TALL_FRAME_DOOR;
	public static TallFrameDoorBlock TALL_ILLUSION_DOOR;
	
	public static void registerCompat() {
		if (initialized) {
			return;
		}
		initialized = true;
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_FRAME, BlockCarpentryCompat.SHORT_FRAME_DOOR));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_FRAME, BlockCarpentryCompat.TALL_FRAME_DOOR));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_ILLUSION, BlockCarpentryCompat.SHORT_ILLUSION_DOOR));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_ILLUSION, BlockCarpentryCompat.TALL_ILLUSION_DOOR));
    	
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_FRAME, new ShortDoorItem(BlockCarpentryCompat.SHORT_FRAME_DOOR, DDRegistry.PROPERTIES.tab(DDRegistry.MAIN_TAB))));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_FRAME, new TallDoorItem(BlockCarpentryCompat.TALL_FRAME_DOOR, DDRegistry.PROPERTIES.tab(DDRegistry.MAIN_TAB))));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_ILLUSION, new ShortDoorItem(BlockCarpentryCompat.SHORT_ILLUSION_DOOR, DDRegistry.PROPERTIES.tab(DDRegistry.MAIN_TAB))));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_ILLUSION, new TallDoorItem(BlockCarpentryCompat.TALL_ILLUSION_DOOR, DDRegistry.PROPERTIES.tab(DDRegistry.MAIN_TAB))));
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_FRAME, new ResourceLocation("blockcarpentry", "frame_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ILLUSION, new ResourceLocation("blockcarpentry", "illusion_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_FRAME, new ResourceLocation("blockcarpentry", "frame_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ILLUSION, new ResourceLocation("blockcarpentry", "illusion_door"));

		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_FRAME, new ResourceLocation("blockcarpentry", "frame_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ILLUSION, new ResourceLocation("blockcarpentry", "illusion_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_FRAME, new ResourceLocation("blockcarpentry", "frame_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ILLUSION, new ResourceLocation("blockcarpentry", "illusion_door"), "tall_misc_door");
	}
}
