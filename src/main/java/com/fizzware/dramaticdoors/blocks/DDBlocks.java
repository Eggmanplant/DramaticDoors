package com.fizzware.dramaticdoors.blocks;

import java.util.ArrayList;
import java.util.List;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import oshi.util.tuples.Pair;

public class DDBlocks {

	public static final List<Pair<String, Block>> DOORS_TO_REGISTER = new ArrayList<Pair<String, Block>>();
	
	// Vanilla
    public static final Block SHORT_IRON_DOOR = new ShortDoorBlock(Blocks.IRON_DOOR, BlockSetType.IRON);
    public static final Block SHORT_OAK_DOOR = new ShortDoorBlock(Blocks.OAK_DOOR, BlockSetType.OAK);
    public static final Block SHORT_SPRUCE_DOOR = new ShortDoorBlock(Blocks.SPRUCE_DOOR, BlockSetType.SPRUCE);
    public static final Block SHORT_BIRCH_DOOR = new ShortDoorBlock(Blocks.BIRCH_DOOR, BlockSetType.BIRCH);
    public static final Block SHORT_JUNGLE_DOOR = new ShortDoorBlock(Blocks.JUNGLE_DOOR, BlockSetType.JUNGLE);
    public static final Block SHORT_ACACIA_DOOR = new ShortDoorBlock(Blocks.ACACIA_DOOR, BlockSetType.ACACIA);
    public static final Block SHORT_DARK_OAK_DOOR = new ShortDoorBlock(Blocks.DARK_OAK_DOOR, BlockSetType.DARK_OAK);
    public static final Block SHORT_MANGROVE_DOOR = new ShortDoorBlock(Blocks.MANGROVE_DOOR, BlockSetType.MANGROVE);
    public static final Block SHORT_BAMBOO_DOOR = new ShortDoorBlock(Blocks.BAMBOO_DOOR, BlockSetType.BAMBOO);
    public static final Block SHORT_CHERRY_DOOR = new ShortDoorBlock(Blocks.CHERRY_DOOR, BlockSetType.CHERRY);
    public static final Block SHORT_CRIMSON_DOOR = new ShortDoorBlock(Blocks.CRIMSON_DOOR, BlockSetType.CRIMSON);
    public static final Block SHORT_WARPED_DOOR = new ShortDoorBlock(Blocks.WARPED_DOOR, BlockSetType.WARPED);
    
    public static final Block TALL_IRON_DOOR = new TallDoorBlock(Blocks.IRON_DOOR, BlockSetType.IRON);
    public static final Block TALL_OAK_DOOR = new TallDoorBlock(Blocks.OAK_DOOR, BlockSetType.OAK);
    public static final Block TALL_SPRUCE_DOOR = new TallDoorBlock(Blocks.SPRUCE_DOOR, BlockSetType.SPRUCE);
    public static final Block TALL_BIRCH_DOOR = new TallDoorBlock(Blocks.BIRCH_DOOR, BlockSetType.BIRCH);
    public static final Block TALL_JUNGLE_DOOR = new TallDoorBlock(Blocks.JUNGLE_DOOR, BlockSetType.JUNGLE);
    public static final Block TALL_ACACIA_DOOR = new TallDoorBlock(Blocks.ACACIA_DOOR, BlockSetType.ACACIA);
    public static final Block TALL_DARK_OAK_DOOR = new TallDoorBlock(Blocks.DARK_OAK_DOOR, BlockSetType.DARK_OAK);
    public static final Block TALL_MANGROVE_DOOR = new TallDoorBlock(Blocks.MANGROVE_DOOR, BlockSetType.MANGROVE);
    public static final Block TALL_BAMBOO_DOOR = new TallDoorBlock(Blocks.BAMBOO_DOOR, BlockSetType.BAMBOO);
    public static final Block TALL_CHERRY_DOOR = new TallDoorBlock(Blocks.CHERRY_DOOR, BlockSetType.CHERRY);
    public static final Block TALL_CRIMSON_DOOR = new TallDoorBlock(Blocks.CRIMSON_DOOR, BlockSetType.CRIMSON);
    public static final Block TALL_WARPED_DOOR = new TallDoorBlock(Blocks.WARPED_DOOR, BlockSetType.WARPED);

    public static void registerBlocks() {
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_IRON), SHORT_IRON_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_OAK), SHORT_OAK_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SPRUCE), SHORT_SPRUCE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BIRCH), SHORT_BIRCH_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_JUNGLE), SHORT_JUNGLE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ACACIA), SHORT_ACACIA_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_DARK_OAK), SHORT_DARK_OAK_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MANGROVE), SHORT_MANGROVE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BAMBOO), SHORT_BAMBOO_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CHERRY), SHORT_CHERRY_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CRIMSON), SHORT_CRIMSON_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WARPED), SHORT_WARPED_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_IRON), TALL_IRON_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_OAK), TALL_OAK_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SPRUCE), TALL_SPRUCE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BIRCH), TALL_BIRCH_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_JUNGLE), TALL_JUNGLE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ACACIA), TALL_ACACIA_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DARK_OAK), TALL_DARK_OAK_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANGROVE), TALL_MANGROVE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BAMBOO), TALL_BAMBOO_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHERRY), TALL_CHERRY_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CRIMSON), TALL_CRIMSON_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WARPED), TALL_WARPED_DOOR);
        
        // Iterate through the blocks to register.
        for (Pair<String, Block> pair : DDCompatRegistry.DOOR_BLOCKS_TO_REGISTER) {
        	Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, pair.getA()), pair.getB());
        }

    }
    
    public static Block getBlockFromResourceLocation(ResourceLocation resource) {
    	return getBlockFromResourceLocation(resource, Blocks.OAK_DOOR);
    }
    
    public static Block getBlockFromResourceLocation(ResourceLocation resource, Block fallback) {
    	return BuiltInRegistries.BLOCK.getOptional(resource).orElse(fallback);
    }
}
