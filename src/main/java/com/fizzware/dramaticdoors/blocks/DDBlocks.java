package com.fizzware.dramaticdoors.blocks;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DramaticDoors;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DDBlocks {

	// Vanilla
    public static final Block TALL_IRON_DOOR = new TallDoorBlock(Blocks.IRON_DOOR);
    public static final Block TALL_OAK_DOOR = new TallDoorBlock(Blocks.OAK_DOOR);
    public static final Block TALL_SPRUCE_DOOR = new TallDoorBlock(Blocks.SPRUCE_DOOR);
    public static final Block TALL_BIRCH_DOOR = new TallDoorBlock(Blocks.BIRCH_DOOR);
    public static final Block TALL_JUNGLE_DOOR = new TallDoorBlock(Blocks.JUNGLE_DOOR);
    public static final Block TALL_ACACIA_DOOR = new TallDoorBlock(Blocks.ACACIA_DOOR);
    public static final Block TALL_DARK_OAK_DOOR = new TallDoorBlock(Blocks.DARK_OAK_DOOR);
    public static final Block TALL_CRIMSON_DOOR = new TallDoorBlock(Blocks.CRIMSON_DOOR);
    public static final Block TALL_WARPED_DOOR = new TallDoorBlock(Blocks.WARPED_DOOR);

    // Bewitchment
    public static final Block TALL_CYPRESS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("bewitchment", "cypress_door")));
    public static final Block TALL_DRAGONS_BLOOD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("bewitchment", "dragons_blood_door")));
    public static final Block TALL_ELDER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("bewitchment", "elder_door")));
    public static final Block TALL_JUNIPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("bewitchment", "juniper_door")));
    
    // The Ceilands
    public static final Block TALL_CEILTRUNK_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("ceilands", "ceiltrunk_door")));
    public static final Block TALL_LUZAWOOD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("ceilands", "luzawood_door")));
    
    // Ecologics
    public static final Block TALL_ECO_AZALEA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("ecologics", "azalea_door")));
    public static final Block TALL_ECO_FLOWERING_AZALEA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("ecologics", "flowering_azalea_door")));
    public static final Block TALL_ECO_COCONUT_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("ecologics", "coconut_door")));
    public static final Block TALL_ECO_WALNUT_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("ecologics", "walnut_door")));
    
    // Twilight Forest
    public static final Block TALL_CANOPY_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("twilightforest", "canopy_door")));
    public static final Block TALL_DARKWOOD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("twilightforest", "dark_door")));
    public static final Block TALL_MINEWOOD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("twilightforest", "mining_door")));
    public static final Block TALL_SORTINGWOOD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("twilightforest", "sorting_door")));
    public static final Block TALL_TIMEWOOD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("twilightforest", "time_door")));
    public static final Block TALL_TRANSWOOD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("twilightforest", "tranformation_door")));
    public static final Block TALL_TWILIGHT_MANGROVE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("twilightforest", "mangrove_door")));
    public static final Block TALL_TWILIGHT_OAK_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("twilightforest", "twilight_oak_door")));
    
    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_IRON), TALL_IRON_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_OAK), TALL_OAK_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_SPRUCE), TALL_SPRUCE_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BIRCH), TALL_BIRCH_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_JUNGLE), TALL_JUNGLE_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_ACACIA), TALL_ACACIA_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_DARK_OAK), TALL_DARK_OAK_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CRIMSON), TALL_CRIMSON_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_WARPED), TALL_WARPED_DOOR);

        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CYPRESS), TALL_CYPRESS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_DRAGONS_BLOOD), TALL_DRAGONS_BLOOD_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_ELDER), TALL_ELDER_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_JUNIPER), TALL_JUNIPER_DOOR);

        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CEILTRUNK), TALL_CEILTRUNK_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_LUZAWOOD), TALL_LUZAWOOD_DOOR);

        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_ECO_AZALEA), TALL_ECO_AZALEA_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_ECO_FLOWERING_AZALEA), TALL_ECO_FLOWERING_AZALEA_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_ECO_COCONUT), TALL_ECO_COCONUT_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_ECO_WALNUT), TALL_ECO_WALNUT_DOOR);

        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CANOPY), TALL_CANOPY_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_DARKWOOD), TALL_DARKWOOD_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MINEWOOD), TALL_MINEWOOD_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_SORTINGWOOD), TALL_SORTINGWOOD_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_TIMEWOOD), TALL_TIMEWOOD_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_TRANSWOOD), TALL_TRANSWOOD_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_TWILIGHT_MANGROVE), TALL_TWILIGHT_MANGROVE_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_TWILIGHT_OAK), TALL_TWILIGHT_OAK_DOOR);
    }
    
    public static Block getBlockFromResourceLocation(Identifier resource) {
    	return Registry.BLOCK.getOrEmpty(resource).orElse(Blocks.OAK_DOOR);
    }
    
}
