package com.fizzware.dramaticdoors.items;

import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.blocks.DDBlocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DDItems {
	
    public static final Item TALL_IRON_DOOR = new TallDoorItem(DDBlocks.TALL_IRON_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE));
    public static final Item TALL_OAK_DOOR = new TallDoorItem(DDBlocks.TALL_OAK_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE));
    public static final Item TALL_SPRUCE_DOOR = new TallDoorItem(DDBlocks.TALL_SPRUCE_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE));
    public static final Item TALL_BIRCH_DOOR = new TallDoorItem(DDBlocks.TALL_BIRCH_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE));
    public static final Item TALL_JUNGLE_DOOR = new TallDoorItem(DDBlocks.TALL_JUNGLE_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE));
    public static final Item TALL_ACACIA_DOOR = new TallDoorItem(DDBlocks.TALL_ACACIA_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE));
    public static final Item TALL_DARK_OAK_DOOR = new TallDoorItem(DDBlocks.TALL_DARK_OAK_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE));
    public static final Item TALL_CRIMSON_DOOR = new TallDoorItem(DDBlocks.TALL_CRIMSON_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE));
    public static final Item TALL_WARPED_DOOR = new TallDoorItem(DDBlocks.TALL_WARPED_DOOR, new FabricItemSettings().group(ItemGroup.REDSTONE));
	
	public static void registerItems() {
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, "tall_iron_door"), TALL_IRON_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, "tall_oak_door"), TALL_OAK_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, "tall_spruce_door"), TALL_SPRUCE_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, "tall_birch_door"), TALL_BIRCH_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, "tall_jungle_door"), TALL_JUNGLE_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, "tall_acacia_door"), TALL_ACACIA_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, "tall_dark_oak_door"), TALL_DARK_OAK_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, "tall_crimson_door"), TALL_CRIMSON_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, "tall_warped_door"), TALL_WARPED_DOOR);
    }
}
