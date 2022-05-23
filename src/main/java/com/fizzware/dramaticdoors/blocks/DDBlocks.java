package com.fizzware.dramaticdoors.blocks;

import com.fizzware.dramaticdoors.DramaticDoors;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DDBlocks {

    public static final Block TALL_IRON_DOOR = new TallDoorBlock(Blocks.IRON_DOOR);
    public static final Block TALL_OAK_DOOR = new TallDoorBlock(Blocks.OAK_DOOR);
    public static final Block TALL_SPRUCE_DOOR = new TallDoorBlock(Blocks.SPRUCE_DOOR);
    public static final Block TALL_BIRCH_DOOR = new TallDoorBlock(Blocks.BIRCH_DOOR);
    public static final Block TALL_JUNGLE_DOOR = new TallDoorBlock(Blocks.JUNGLE_DOOR);
    public static final Block TALL_ACACIA_DOOR = new TallDoorBlock(Blocks.ACACIA_DOOR);
    public static final Block TALL_DARK_OAK_DOOR = new TallDoorBlock(Blocks.DARK_OAK_DOOR);
    public static final Block TALL_CRIMSON_DOOR = new TallDoorBlock(Blocks.CRIMSON_DOOR);
    public static final Block TALL_WARPED_DOOR = new TallDoorBlock(Blocks.WARPED_DOOR);

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, "tall_iron_door"), TALL_IRON_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, "tall_oak_door"), TALL_OAK_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, "tall_spruce_door"), TALL_SPRUCE_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, "tall_birch_door"), TALL_BIRCH_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, "tall_jungle_door"), TALL_JUNGLE_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, "tall_acacia_door"), TALL_ACACIA_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, "tall_dark_oak_door"), TALL_DARK_OAK_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, "tall_crimson_door"), TALL_CRIMSON_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, "tall_warped_door"), TALL_WARPED_DOOR);
    }
    
}
