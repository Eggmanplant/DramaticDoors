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
    public static final Block TALL_MANGROVE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("wildbackport", "mangrove_door"))); // Wild Backport. Part of vanilla in 1.19+.
    public static final Block TALL_CRIMSON_DOOR = new TallDoorBlock(Blocks.CRIMSON_DOOR);
    public static final Block TALL_WARPED_DOOR = new TallDoorBlock(Blocks.WARPED_DOOR);

    // Bewitchment
    public static final Block TALL_CYPRESS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("bewitchment", "cypress_door")));
    public static final Block TALL_DRAGONS_BLOOD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("bewitchment", "dragons_blood_door")));
    public static final Block TALL_ELDER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("bewitchment", "elder_door")));
    public static final Block TALL_JUNIPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("bewitchment", "juniper_door")));

    // Biome Makeover
    public static final Block TALL_ANCIENT_OAK_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("biomemakeover", "ancient_oak_door")));
    public static final Block TALL_BLIGHTED_BALSA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("biomemakeover", "blighted_balsa_door")));
    public static final Block TALL_SWAMP_CYPRESS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("biomemakeover", "swamp_cypress_door")));
    public static final Block TALL_WILLOW_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("biomemakeover", "willow_door")));
    
    // The Ceilands
    public static final Block TALL_CEILTRUNK_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("ceilands", "ceiltrunk_door")));
    public static final Block TALL_LUZAWOOD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("ceilands", "luzawood_door")));
    
    // Ecologics
    public static final Block TALL_ECO_AZALEA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("ecologics", "azalea_door")));
    public static final Block TALL_ECO_FLOWERING_AZALEA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("ecologics", "flowering_azalea_door")));
    public static final Block TALL_ECO_COCONUT_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("ecologics", "coconut_door")));
    public static final Block TALL_ECO_WALNUT_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("ecologics", "walnut_door")));
    
    // Oh the Biomes You'll Go
    public static final Block TALL_BYG_ASPEN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("byg", "tall_byg_aspen_door")));
    public static final Block TALL_BYG_BAOBAB_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("byg", "tall_byg_baobab_door")));
    public static final Block TALL_BYG_BLUE_ENCHANTED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("byg", "tall_byg_blue_enchanted_door")));
    public static final Block TALL_BYG_BULBIS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("byg", "tall_byg_bulbis_door")));
    public static final Block TALL_BYG_CHERRY_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("byg", "tall_byg_cherry_door")));
    public static final Block TALL_BYG_CIKA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("byg", "tall_byg_cika_door")));
    public static final Block TALL_BYG_CYPRESS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("byg", "tall_byg_cypress_door")));
    public static final Block TALL_BYG_EBONY_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("byg", "tall_byg_ebony_door")));
    public static final Block TALL_BYG_EMBUR_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("byg", "tall_byg_embur_door")));
    public static final Block TALL_BYG_ETHER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("byg", "tall_byg_ether_door")));
    public static final Block TALL_BYG_FIR_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("byg", "tall_byg_fir_door")));
    public static final Block TALL_BYG_FLORUS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("byg", "tall_byg_florus_door")));
    public static final Block TALL_BYG_GREEN_ENCHANTED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("byg", "tall_byg_green_enchanted_door")));
    public static final Block TALL_BYG_HOLLY_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("byg", "tall_byg_holly_door")));
    public static final Block TALL_BYG_IMPARIUS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("byg", "tall_byg_imparius_door")));
    public static final Block TALL_BYG_IRONWOOD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("byg", "tall_byg_ironwood_door")));
    public static final Block TALL_BYG_JACARANDA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("byg", "tall_byg_jacaranda_door")));
    public static final Block TALL_BYG_LAMENT_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("byg", "tall_byg_lament_door")));
    public static final Block TALL_BYG_MAHOGANY_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("byg", "tall_byg_mahogany_door")));
    public static final Block TALL_BYG_MAPLE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("byg", "tall_byg_maple_door")));
    public static final Block TALL_BYG_NIGHTSHADE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("byg", "tall_byg_nightshade_door")));
    public static final Block TALL_BYG_PALM_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("byg", "tall_byg_palm_door")));
    public static final Block TALL_BYG_PINE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("byg", "tall_byg_pine_door")));
    public static final Block TALL_BYG_RAINBOW_EUCALYPTUS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("byg", "tall_byg_rainbow_eucalyptus_door")));
    public static final Block TALL_BYG_REDWOOD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("byg", "tall_byg_redwood_door")));
    public static final Block TALL_BYG_SKYRIS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("byg", "tall_byg_skyris_door")));
    public static final Block TALL_BYG_SOUL_SHROOM_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("byg", "tall_byg_soul_shroom_door")));
    public static final Block TALL_BYG_SYTHIAN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("byg", "tall_byg_sythian_door")));
    public static final Block TALL_BYG_WHITE_MANGROVE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("byg", "tall_byg_mangrove_door")));
    public static final Block TALL_BYG_WILLOW_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("byg", "tall_byg_willow_door")));
    public static final Block TALL_BYG_WITCH_HAZEL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("byg", "tall_byg_witch_hazel_door")));
    public static final Block TALL_BYG_ZELKOVA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("byg", "tall_byg_zelkova_door")));
    
    // Snowy Spirit
    public static final Block TALL_GINGERBREAD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("snowyspirit", "gingerbread_door")));
    
    // Supplementaries
    public static final Block TALL_GOLD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("supplementaries", "gold_door")));
    public static final Block TALL_NETHERITE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("supplementaries", "netherite_door")));
    
    // Twigs
    public static final Block TALL_STRIPPED_BAMBOO_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("twigs", "stripped_bamboo_door")));
    
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
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MANGROVE), TALL_MANGROVE_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CRIMSON), TALL_CRIMSON_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_WARPED), TALL_WARPED_DOOR);

        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_ASPEN), TALL_BYG_ASPEN_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_BAOBAB), TALL_BYG_BAOBAB_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_BLUE_ENCHANTED), TALL_BYG_BLUE_ENCHANTED_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_BULBIS), TALL_BYG_BULBIS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_CHERRY), TALL_BYG_CHERRY_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_CIKA), TALL_BYG_CIKA_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_CYPRESS), TALL_BYG_CYPRESS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_EBONY), TALL_BYG_EBONY_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_EMBUR), TALL_BYG_EMBUR_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_ETHER), TALL_BYG_ETHER_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_FIR), TALL_BYG_FIR_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_FLORUS), TALL_BYG_FLORUS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_GREEN_ENCHANTED), TALL_BYG_GREEN_ENCHANTED_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_HOLLY), TALL_BYG_HOLLY_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_IMPARIUS), TALL_BYG_IMPARIUS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_IRONWOOD), TALL_BYG_IRONWOOD_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_JACARANDA), TALL_BYG_JACARANDA_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_LAMENT), TALL_BYG_LAMENT_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_MAHOGANY), TALL_BYG_MAHOGANY_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_MAPLE), TALL_BYG_MAPLE_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_NIGHTSHADE), TALL_BYG_NIGHTSHADE_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_PALM), TALL_BYG_PALM_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_PINE), TALL_BYG_PINE_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_RAINBOW_EUCALYPTUS), TALL_BYG_RAINBOW_EUCALYPTUS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_REDWOOD), TALL_BYG_REDWOOD_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_SKYRIS), TALL_BYG_SKYRIS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_SOUL_SHROOM), TALL_BYG_SOUL_SHROOM_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_SYTHIAN), TALL_BYG_SYTHIAN_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_WHITE_MANGROVE), TALL_BYG_WHITE_MANGROVE_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_WILLOW), TALL_BYG_WILLOW_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_WITCH_HAZEL), TALL_BYG_WITCH_HAZEL_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_ZELKOVA), TALL_BYG_ZELKOVA_DOOR);

        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CYPRESS), TALL_CYPRESS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_DRAGONS_BLOOD), TALL_DRAGONS_BLOOD_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_ELDER), TALL_ELDER_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_JUNIPER), TALL_JUNIPER_DOOR);

        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_ANCIENT_OAK), TALL_ANCIENT_OAK_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BLIGHTED_BALSA), TALL_BLIGHTED_BALSA_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_SWAMP_CYPRESS), TALL_SWAMP_CYPRESS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_WILLOW), TALL_WILLOW_DOOR);

        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CEILTRUNK), TALL_CEILTRUNK_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_LUZAWOOD), TALL_LUZAWOOD_DOOR);

        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_ECO_AZALEA), TALL_ECO_AZALEA_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_ECO_FLOWERING_AZALEA), TALL_ECO_FLOWERING_AZALEA_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_ECO_COCONUT), TALL_ECO_COCONUT_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_ECO_WALNUT), TALL_ECO_WALNUT_DOOR);

        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_GINGERBREAD), TALL_GINGERBREAD_DOOR);

        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_GOLD), TALL_GOLD_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_NETHERITE), TALL_NETHERITE_DOOR);

        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_STRIPPED_BAMBOO), TALL_STRIPPED_BAMBOO_DOOR);

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
