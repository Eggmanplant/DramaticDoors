package com.fizzware.dramaticdoors.items;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DDItems {
	
	// Vanilla
    public static final Item TALL_IRON_DOOR = new TallDoorItem(DDBlocks.TALL_IRON_DOOR, new FabricItemSettings().group(DramaticDoors.DD_MAIN_TAB));
    public static final Item TALL_OAK_DOOR = new TallDoorItem(DDBlocks.TALL_OAK_DOOR, new FabricItemSettings().group(DramaticDoors.DD_MAIN_TAB));
    public static final Item TALL_SPRUCE_DOOR = new TallDoorItem(DDBlocks.TALL_SPRUCE_DOOR, new FabricItemSettings().group(DramaticDoors.DD_MAIN_TAB));
    public static final Item TALL_BIRCH_DOOR = new TallDoorItem(DDBlocks.TALL_BIRCH_DOOR, new FabricItemSettings().group(DramaticDoors.DD_MAIN_TAB));
    public static final Item TALL_JUNGLE_DOOR = new TallDoorItem(DDBlocks.TALL_JUNGLE_DOOR, new FabricItemSettings().group(DramaticDoors.DD_MAIN_TAB));
    public static final Item TALL_ACACIA_DOOR = new TallDoorItem(DDBlocks.TALL_ACACIA_DOOR, new FabricItemSettings().group(DramaticDoors.DD_MAIN_TAB));
    public static final Item TALL_DARK_OAK_DOOR = new TallDoorItem(DDBlocks.TALL_DARK_OAK_DOOR, new FabricItemSettings().group(DramaticDoors.DD_MAIN_TAB));
    public static final Item TALL_MANGROVE_DOOR = new TallDoorItem(DDBlocks.TALL_MANGROVE_DOOR, new FabricItemSettings().group(conditionalTabProperties("wildbackport", DramaticDoors.DD_MAIN_TAB))); // Only with Wild Backport or in 1.19+
    public static final Item TALL_CRIMSON_DOOR = new TallDoorItem(DDBlocks.TALL_CRIMSON_DOOR, new FabricItemSettings().group(DramaticDoors.DD_MAIN_TAB));
    public static final Item TALL_WARPED_DOOR = new TallDoorItem(DDBlocks.TALL_WARPED_DOOR, new FabricItemSettings().group(DramaticDoors.DD_MAIN_TAB));

    // Ad Astra
    public static final Item TALL_AERONOS_DOOR = new TallDoorItem(DDBlocks.TALL_AERONOS_DOOR, new FabricItemSettings().group(conditionalTabProperties("ad_astra", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_GLACIAN_DOOR = new TallDoorItem(DDBlocks.TALL_GLACIAN_DOOR, new FabricItemSettings().group(conditionalTabProperties("ad_astra", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_STROPHAR_DOOR = new TallDoorItem(DDBlocks.TALL_STROPHAR_DOOR, new FabricItemSettings().group(conditionalTabProperties("ad_astra", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_STEEL_DOOR = new TallDoorItem(DDBlocks.TALL_STEEL_DOOR, new FabricItemSettings().group(conditionalTabProperties("ad_astra", DramaticDoors.DD_MAIN_TAB)));    
    
    // Architects Palette
    public static final Item TALL_TWISTED_DOOR = new TallDoorItem(DDBlocks.TALL_TWISTED_DOOR, new FabricItemSettings().group(conditionalTabProperties("architects_palette", DramaticDoors.DD_MAIN_TAB)));
    
    // Bewitchment
    public static final Item TALL_CYPRESS_DOOR = new TallDoorItem(DDBlocks.TALL_CYPRESS_DOOR, new FabricItemSettings().group(conditionalTabProperties("bewitchment", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_DRAGONS_BLOOD_DOOR = new TallDoorItem(DDBlocks.TALL_DRAGONS_BLOOD_DOOR, new FabricItemSettings().group(conditionalTabProperties("bewitchment", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_ELDER_DOOR = new TallDoorItem(DDBlocks.TALL_ELDER_DOOR, new FabricItemSettings().group(conditionalTabProperties("bewitchment", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_JUNIPER_DOOR = new TallDoorItem(DDBlocks.TALL_JUNIPER_DOOR, new FabricItemSettings().group(conditionalTabProperties("bewitchment", DramaticDoors.DD_MAIN_TAB)));
    
    // Biome Makeover
    public static final Item TALL_ANCIENT_OAK_DOOR = new TallDoorItem(DDBlocks.TALL_ANCIENT_OAK_DOOR, new FabricItemSettings().group(conditionalTabProperties("biomemakeover", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BLIGHTED_BALSA_DOOR = new TallDoorItem(DDBlocks.TALL_BLIGHTED_BALSA_DOOR, new FabricItemSettings().group(conditionalTabProperties("biomemakeover", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_SWAMP_CYPRESS_DOOR = new TallDoorItem(DDBlocks.TALL_SWAMP_CYPRESS_DOOR, new FabricItemSettings().group(conditionalTabProperties("biomemakeover", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_WILLOW_DOOR = new TallDoorItem(DDBlocks.TALL_WILLOW_DOOR, new FabricItemSettings().group(conditionalTabProperties("biomemakeover", DramaticDoors.DD_MAIN_TAB)));
    
    // Blockus
    public static final Item TALL_BLOCKUS_BAMBOO_DOOR = new TallDoorItem(DDBlocks.TALL_BLOCKUS_BAMBOO_DOOR, new FabricItemSettings().group(conditionalTabProperties("blockus", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BLOCKUS_CHARRED_DOOR = new TallDoorItem(DDBlocks.TALL_BLOCKUS_CHARRED_DOOR, new FabricItemSettings().group(conditionalTabProperties("blockus", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BLOCKUS_PAPER_DOOR = new TallDoorItem(DDBlocks.TALL_BLOCKUS_PAPER_DOOR, new FabricItemSettings().group(conditionalTabProperties("blockus", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BLOCKUS_WHITE_OAK_DOOR = new TallDoorItem(DDBlocks.TALL_BLOCKUS_WHITE_OAK_DOOR, new FabricItemSettings().group(conditionalTabProperties("blockus", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BLOCKUS_STONE_DOOR = new TallDoorItem(DDBlocks.TALL_BLOCKUS_STONE_DOOR, new FabricItemSettings().group(conditionalTabProperties("blockus", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BLOCKUS_BLACKSTONE_DOOR = new TallDoorItem(DDBlocks.TALL_BLOCKUS_BLACKSTONE_DOOR, new FabricItemSettings().group(conditionalTabProperties("blockus", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BLOCKUS_OBSIDIAN_REINFORCED_DOOR = new TallDoorItem(DDBlocks.TALL_BLOCKUS_OBSIDIAN_REINFORCED_DOOR, new FabricItemSettings().group(conditionalTabProperties("blockus", DramaticDoors.DD_MAIN_TAB)));
    
    // The Ceilands
    public static final Item TALL_CEILTRUNK_DOOR = new TallDoorItem(DDBlocks.TALL_CEILTRUNK_DOOR, new FabricItemSettings().group(conditionalTabProperties("ceilands", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_LUZAWOOD_DOOR = new TallDoorItem(DDBlocks.TALL_LUZAWOOD_DOOR, new FabricItemSettings().group(conditionalTabProperties("ceilands", DramaticDoors.DD_MAIN_TAB)));
    
    // Charm
    public static final Item TALL_CHARM_AZALEA_DOOR = new TallDoorItem(DDBlocks.TALL_CHARM_AZALEA_DOOR, new FabricItemSettings().group(conditionalTabProperties("charm", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_CHARM_EBONY_DOOR = new TallDoorItem(DDBlocks.TALL_CHARM_EBONY_DOOR, new FabricItemSettings().group(conditionalTabProperties("charm", DramaticDoors.DD_MAIN_TAB)));    
    
    // Ecologics
    public static final Item TALL_ECO_AZALEA_DOOR = new TallDoorItem(DDBlocks.TALL_ECO_AZALEA_DOOR, new FabricItemSettings().group(conditionalTabProperties("ecologics", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_ECO_FLOWERING_AZALEA_DOOR = new TallDoorItem(DDBlocks.TALL_ECO_FLOWERING_AZALEA_DOOR, new FabricItemSettings().group(conditionalTabProperties("ecologics", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_ECO_COCONUT_DOOR = new TallDoorItem(DDBlocks.TALL_ECO_COCONUT_DOOR, new FabricItemSettings().group(conditionalTabProperties("ecologics", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_ECO_WALNUT_DOOR = new TallDoorItem(DDBlocks.TALL_ECO_WALNUT_DOOR, new FabricItemSettings().group(conditionalTabProperties("ecologics", DramaticDoors.DD_MAIN_TAB)));
    
    // Glass Doors
    public static final Item TALL_IRON_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_IRON_GLASS_DOOR, new FabricItemSettings().group(conditionalTabProperties("glassdoor", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_OAK_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_OAK_GLASS_DOOR, new FabricItemSettings().group(conditionalTabProperties("glassdoor", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_SPRUCE_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_SPRUCE_GLASS_DOOR, new FabricItemSettings().group(conditionalTabProperties("glassdoor", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BIRCH_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_BIRCH_GLASS_DOOR, new FabricItemSettings().group(conditionalTabProperties("glassdoor", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_JUNGLE_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_JUNGLE_GLASS_DOOR, new FabricItemSettings().group(conditionalTabProperties("glassdoor", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_ACACIA_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_ACACIA_GLASS_DOOR, new FabricItemSettings().group(conditionalTabProperties("glassdoor", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_DARK_OAK_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_DARK_OAK_GLASS_DOOR, new FabricItemSettings().group(conditionalTabProperties("glassdoor", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_CRIMSON_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_CRIMSON_GLASS_DOOR, new FabricItemSettings().group(conditionalTabProperties("glassdoor", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_WARPED_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_WARPED_GLASS_DOOR, new FabricItemSettings().group(conditionalTabProperties("glassdoor", DramaticDoors.DD_MAIN_TAB)));
    
    // Hephaestus
    public static final Item TALL_BLOODSHROOM_DOOR = new TallDoorItem(DDBlocks.TALL_BLOODSHROOM_DOOR, new FabricItemSettings().group(conditionalTabProperties("tconstruct", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_GREENHEART_DOOR = new TallDoorItem(DDBlocks.TALL_GREENHEART_DOOR, new FabricItemSettings().group(conditionalTabProperties("tconstruct", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_SKYROOT_DOOR = new TallDoorItem(DDBlocks.TALL_SKYROOT_DOOR, new FabricItemSettings().group(conditionalTabProperties("tconstruct", DramaticDoors.DD_MAIN_TAB)));    
    
    // Oh the Biomes You'll Go
    public static final Item TALL_BYG_ASPEN_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_ASPEN_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_BAOBAB_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_BAOBAB_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_BLUE_ENCHANTED_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_BLUE_ENCHANTED_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_BULBIS_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_BULBIS_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_CHERRY_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_CHERRY_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_CIKA_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_CIKA_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_CYPRESS_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_CYPRESS_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_EBONY_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_EBONY_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_EMBUR_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_EMBUR_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_ETHER_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_ETHER_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_FIR_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_FIR_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_FLORUS_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_FLORUS_DOOR, new FabricItemSettings().group(/*conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)*/null));
    public static final Item TALL_BYG_GREEN_ENCHANTED_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_GREEN_ENCHANTED_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_HOLLY_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_HOLLY_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_IMPARIUS_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_IMPARIUS_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_IRONWOOD_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_IRONWOOD_DOOR, new FabricItemSettings().group(/*conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)*/null));
    public static final Item TALL_BYG_JACARANDA_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_JACARANDA_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_LAMENT_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_LAMENT_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_MAHOGANY_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_MAHOGANY_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_MAPLE_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_MAPLE_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_NIGHTSHADE_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_NIGHTSHADE_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_PALM_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_PALM_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_PINE_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_PINE_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_RAINBOW_EUCALYPTUS_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_RAINBOW_EUCALYPTUS_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_REDWOOD_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_REDWOOD_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_SKYRIS_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_SKYRIS_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_SOUL_SHROOM_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_SOUL_SHROOM_DOOR, new FabricItemSettings().group(/*conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)*/null));
    public static final Item TALL_BYG_SYTHIAN_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_SYTHIAN_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_WHITE_MANGROVE_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_WHITE_MANGROVE_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_WILLOW_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_WILLOW_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_WITCH_HAZEL_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_WITCH_HAZEL_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_ZELKOVA_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_ZELKOVA_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    
    // Promenade
    public static final Item TALL_PROMENADE_CHERRY_OAK_DOOR = new TallDoorItem(DDBlocks.TALL_PROMENADE_CHERRY_OAK_DOOR, new FabricItemSettings().group(conditionalTabProperties("promenade", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_PROMENADE_DARK_AMARANTH_DOOR = new TallDoorItem(DDBlocks.TALL_PROMENADE_DARK_AMARANTH_DOOR, new FabricItemSettings().group(conditionalTabProperties("promenade", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_PROMENADE_PALM_DOOR = new TallDoorItem(DDBlocks.TALL_PROMENADE_PALM_DOOR, new FabricItemSettings().group(conditionalTabProperties("promenade", DramaticDoors.DD_MAIN_TAB)));    
    
    // Snowy Spirit
    public static final Item TALL_GINGERBREAD_DOOR = new TallDoorItem(DDBlocks.TALL_GINGERBREAD_DOOR, new FabricItemSettings().group(conditionalTabProperties("snowyspirit", DramaticDoors.DD_MAIN_TAB)));
    
    // Supplementaries
    public static final Item TALL_GOLD_DOOR = new TallDoorItem(DDBlocks.TALL_GOLD_DOOR, new FabricItemSettings().group(conditionalTabProperties("supplementaries", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_NETHERITE_DOOR = new TallDoorItem(DDBlocks.TALL_NETHERITE_DOOR, new FabricItemSettings().group(conditionalTabProperties("supplementaries", DramaticDoors.DD_MAIN_TAB)));
    
    // Tech Reborn
    public static final Item TALL_RUBBER_DOOR = new TallDoorItem(DDBlocks.TALL_RUBBER_DOOR, new FabricItemSettings().group(conditionalTabProperties("techreborn", DramaticDoors.DD_MAIN_TAB)));
    
    // Traverse
    public static final Item TALL_TRAVERSE_FIR_DOOR = new TallDoorItem(DDBlocks.TALL_TRAVERSE_FIR_DOOR, new FabricItemSettings().group(conditionalTabProperties("traverse", DramaticDoors.DD_MAIN_TAB)));
    
    // Twigs
    public static final Item TALL_STRIPPED_BAMBOO_DOOR = new TallDoorItem(DDBlocks.TALL_STRIPPED_BAMBOO_DOOR, new FabricItemSettings().group(conditionalTabProperties("twigs", DramaticDoors.DD_MAIN_TAB)));
    
    // Twilight Forest
    public static final Item TALL_CANOPY_DOOR = new TallDoorItem(DDBlocks.TALL_CANOPY_DOOR, new FabricItemSettings().group(conditionalTabProperties("twilightforest", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_DARKWOOD_DOOR = new TallDoorItem(DDBlocks.TALL_DARKWOOD_DOOR, new FabricItemSettings().group(conditionalTabProperties("twilightforest", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_MINEWOOD_DOOR = new TallDoorItem(DDBlocks.TALL_MINEWOOD_DOOR, new FabricItemSettings().group(conditionalTabProperties("twilightforest", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_SORTINGWOOD_DOOR = new TallDoorItem(DDBlocks.TALL_SORTINGWOOD_DOOR, new FabricItemSettings().group(conditionalTabProperties("twilightforest", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_TIMEWOOD_DOOR = new TallDoorItem(DDBlocks.TALL_TIMEWOOD_DOOR, new FabricItemSettings().group(conditionalTabProperties("twilightforest", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_TRANSWOOD_DOOR = new TallDoorItem(DDBlocks.TALL_TRANSWOOD_DOOR, new FabricItemSettings().group(conditionalTabProperties("twilightforest", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_TWILIGHT_MANGROVE_DOOR = new TallDoorItem(DDBlocks.TALL_TWILIGHT_MANGROVE_DOOR, new FabricItemSettings().group(conditionalTabProperties("twilightforest", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_TWILIGHT_OAK_DOOR = new TallDoorItem(DDBlocks.TALL_TWILIGHT_OAK_DOOR, new FabricItemSettings().group(conditionalTabProperties("twilightforest", DramaticDoors.DD_MAIN_TAB)));
    
    // XP Obelisk
    public static final Item TALL_SOUL_COPPER_DOOR = new TallDoorItem(DDBlocks.TALL_SOUL_COPPER_DOOR, new FabricItemSettings().group(conditionalTabProperties("xps_additions", DramaticDoors.DD_MAIN_TAB)));
    
    // Chipped (The biggest compat)
    public static final Item TALL_CHIPPED_OAK_DOOR_01 = new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_DOOR_01, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_OAK_DOOR_02 = new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_DOOR_02, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_OAK_DOOR_03 = new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_DOOR_03, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_OAK_DOOR_04 = new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_DOOR_04, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_OAK_DOOR_05 = new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_DOOR_05, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_OAK_DOOR_06 = new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_DOOR_06, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_OAK_DOOR_07 = new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_DOOR_07, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_OAK_DOOR_08 = new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_DOOR_08, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_OAK_DOOR_09 = new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_DOOR_09, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_OAK_DOOR_10 = new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_DOOR_10, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_OAK_DOOR_11 = new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_DOOR_11, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_OAK_DOOR_12 = new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_DOOR_12, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_OAK_DOOR_13 = new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_DOOR_13, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_OAK_DOOR_14 = new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_DOOR_14, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_OAK_DOOR_15 = new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_DOOR_15, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_OAK_DOOR_16 = new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_DOOR_16, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_OAK_DOOR_17 = new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_DOOR_17, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_OAK_DOOR_18 = new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_DOOR_18, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_OAK_DOOR_19 = new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_DOOR_19, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_OAK_DOOR_20 = new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_DOOR_20, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    
    public static final Item TALL_CHIPPED_SPRUCE_DOOR_01 = new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_01, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_SPRUCE_DOOR_02 = new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_02, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_SPRUCE_DOOR_03 = new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_03, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_SPRUCE_DOOR_04 = new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_04, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_SPRUCE_DOOR_05 = new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_05, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_SPRUCE_DOOR_06 = new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_06, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_SPRUCE_DOOR_07 = new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_07, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_SPRUCE_DOOR_08 = new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_08, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_SPRUCE_DOOR_09 = new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_09, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_SPRUCE_DOOR_10 = new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_10, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_SPRUCE_DOOR_11 = new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_11, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_SPRUCE_DOOR_12 = new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_12, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_SPRUCE_DOOR_13 = new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_13, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_SPRUCE_DOOR_14 = new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_14, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_SPRUCE_DOOR_15 = new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_15, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_SPRUCE_DOOR_16 = new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_16, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_SPRUCE_DOOR_17 = new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_17, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_SPRUCE_DOOR_18 = new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_18, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_SPRUCE_DOOR_19 = new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_19, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_SPRUCE_DOOR_20 = new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_20, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));

    public static final Item TALL_CHIPPED_BIRCH_DOOR_01 = new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_01, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_BIRCH_DOOR_02 = new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_02, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_BIRCH_DOOR_03 = new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_03, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_BIRCH_DOOR_04 = new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_04, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_BIRCH_DOOR_05 = new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_05, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_BIRCH_DOOR_06 = new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_06, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_BIRCH_DOOR_07 = new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_07, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_BIRCH_DOOR_08 = new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_08, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_BIRCH_DOOR_09 = new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_09, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_BIRCH_DOOR_10 = new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_10, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_BIRCH_DOOR_11 = new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_11, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_BIRCH_DOOR_12 = new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_12, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_BIRCH_DOOR_13 = new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_13, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_BIRCH_DOOR_14 = new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_14, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_BIRCH_DOOR_15 = new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_15, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_BIRCH_DOOR_16 = new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_16, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_BIRCH_DOOR_17 = new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_17, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_BIRCH_DOOR_18 = new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_18, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_BIRCH_DOOR_19 = new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_19, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_BIRCH_DOOR_20 = new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_20, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));

    public static final Item TALL_CHIPPED_JUNGLE_DOOR_01 = new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_01, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_JUNGLE_DOOR_02 = new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_02, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_JUNGLE_DOOR_03 = new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_03, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_JUNGLE_DOOR_04 = new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_04, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_JUNGLE_DOOR_05 = new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_05, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_JUNGLE_DOOR_06 = new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_06, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_JUNGLE_DOOR_07 = new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_07, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_JUNGLE_DOOR_08 = new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_08, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_JUNGLE_DOOR_09 = new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_09, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_JUNGLE_DOOR_10 = new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_10, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_JUNGLE_DOOR_11 = new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_11, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_JUNGLE_DOOR_12 = new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_12, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_JUNGLE_DOOR_13 = new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_13, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_JUNGLE_DOOR_14 = new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_14, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_JUNGLE_DOOR_15 = new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_15, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_JUNGLE_DOOR_16 = new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_16, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_JUNGLE_DOOR_17 = new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_17, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_JUNGLE_DOOR_18 = new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_18, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_JUNGLE_DOOR_19 = new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_19, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_JUNGLE_DOOR_20 = new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_20, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));

    public static final Item TALL_CHIPPED_ACACIA_DOOR_01 = new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_01, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_ACACIA_DOOR_02 = new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_02, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_ACACIA_DOOR_03 = new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_03, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_ACACIA_DOOR_04 = new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_04, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_ACACIA_DOOR_05 = new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_05, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_ACACIA_DOOR_06 = new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_06, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_ACACIA_DOOR_07 = new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_07, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_ACACIA_DOOR_08 = new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_08, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_ACACIA_DOOR_09 = new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_09, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_ACACIA_DOOR_10 = new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_10, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_ACACIA_DOOR_11 = new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_11, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_ACACIA_DOOR_12 = new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_12, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_ACACIA_DOOR_13 = new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_13, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_ACACIA_DOOR_14 = new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_14, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_ACACIA_DOOR_15 = new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_15, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_ACACIA_DOOR_16 = new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_16, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_ACACIA_DOOR_17 = new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_17, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_ACACIA_DOOR_18 = new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_18, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_ACACIA_DOOR_19 = new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_19, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_ACACIA_DOOR_20 = new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_20, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));

    public static final Item TALL_CHIPPED_DARK_OAK_DOOR_01 = new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_01, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_DARK_OAK_DOOR_02 = new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_02, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_DARK_OAK_DOOR_03 = new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_03, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_DARK_OAK_DOOR_04 = new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_04, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_DARK_OAK_DOOR_05 = new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_05, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_DARK_OAK_DOOR_06 = new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_06, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_DARK_OAK_DOOR_07 = new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_07, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_DARK_OAK_DOOR_08 = new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_08, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_DARK_OAK_DOOR_09 = new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_09, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_DARK_OAK_DOOR_10 = new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_10, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_DARK_OAK_DOOR_11 = new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_11, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_DARK_OAK_DOOR_12 = new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_12, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_DARK_OAK_DOOR_13 = new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_13, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_DARK_OAK_DOOR_14 = new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_14, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_DARK_OAK_DOOR_15 = new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_15, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_DARK_OAK_DOOR_16 = new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_16, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_DARK_OAK_DOOR_17 = new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_17, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_DARK_OAK_DOOR_18 = new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_18, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_DARK_OAK_DOOR_19 = new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_19, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_DARK_OAK_DOOR_20 = new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_20, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));

    public static final Item TALL_CHIPPED_CRIMSON_DOOR_01 = new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_01, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_CRIMSON_DOOR_02 = new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_02, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_CRIMSON_DOOR_03 = new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_03, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_CRIMSON_DOOR_04 = new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_04, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_CRIMSON_DOOR_05 = new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_05, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_CRIMSON_DOOR_06 = new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_06, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_CRIMSON_DOOR_07 = new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_07, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_CRIMSON_DOOR_08 = new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_08, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_CRIMSON_DOOR_09 = new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_09, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_CRIMSON_DOOR_10 = new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_10, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_CRIMSON_DOOR_11 = new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_11, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_CRIMSON_DOOR_12 = new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_12, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_CRIMSON_DOOR_13 = new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_13, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_CRIMSON_DOOR_14 = new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_14, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_CRIMSON_DOOR_15 = new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_15, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_CRIMSON_DOOR_16 = new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_16, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_CRIMSON_DOOR_17 = new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_17, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_CRIMSON_DOOR_18 = new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_18, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_CRIMSON_DOOR_19 = new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_19, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_CRIMSON_DOOR_20 = new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_20, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));

    public static final Item TALL_CHIPPED_WARPED_DOOR_01 = new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_DOOR_01, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_WARPED_DOOR_02 = new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_DOOR_02, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_WARPED_DOOR_03 = new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_DOOR_03, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_WARPED_DOOR_04 = new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_DOOR_04, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_WARPED_DOOR_05 = new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_DOOR_05, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_WARPED_DOOR_06 = new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_DOOR_06, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_WARPED_DOOR_07 = new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_DOOR_07, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_WARPED_DOOR_08 = new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_DOOR_08, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_WARPED_DOOR_09 = new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_DOOR_09, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_WARPED_DOOR_10 = new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_DOOR_10, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_WARPED_DOOR_11 = new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_DOOR_11, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_WARPED_DOOR_12 = new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_DOOR_12, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_WARPED_DOOR_13 = new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_DOOR_13, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_WARPED_DOOR_14 = new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_DOOR_14, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_WARPED_DOOR_15 = new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_DOOR_15, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_WARPED_DOOR_16 = new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_DOOR_16, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_WARPED_DOOR_17 = new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_DOOR_17, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_WARPED_DOOR_18 = new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_DOOR_18, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_WARPED_DOOR_19 = new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_DOOR_19, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_WARPED_DOOR_20 = new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_DOOR_20, new FabricItemSettings().group(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    
    // Macaw's Doors (Also the biggest compat)
    public static final Item TALL_MACAW_JAIL_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_JAIL_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_METAL_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_METAL_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_METAL_HOSPITAL_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_METAL_HOSPITAL_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_METAL_REINFORCED_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_METAL_REINFORCED_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_METAL_WARNING_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_METAL_WARNING_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_METAL_WINDOWED_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_METAL_WINDOWED_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));

	public static final Item TALL_MACAW_OAK_BARN_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_OAK_BARN_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_SPRUCE_BARN_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_BARN_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BIRCH_BARN_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_BARN_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_JUNGLE_BARN_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_BARN_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_ACACIA_BARN_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_BARN_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_DARK_OAK_BARN_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_BARN_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_CRIMSON_BARN_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_BARN_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_WARPED_BARN_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_BARN_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));

	public static final Item TALL_MACAW_OAK_BARN_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_OAK_BARN_GLASS_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_SPRUCE_BARN_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_BARN_GLASS_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BIRCH_BARN_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_BARN_GLASS_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_JUNGLE_BARN_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_BARN_GLASS_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_ACACIA_BARN_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_BARN_GLASS_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_DARK_OAK_BARN_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_BARN_GLASS_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_CRIMSON_BARN_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_BARN_GLASS_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_WARPED_BARN_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_BARN_GLASS_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));

	public static final Item TALL_MACAW_OAK_STABLE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_OAK_STABLE_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_SPRUCE_STABLE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_STABLE_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BIRCH_STABLE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_STABLE_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_JUNGLE_STABLE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_STABLE_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_ACACIA_STABLE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_STABLE_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_DARK_OAK_STABLE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_STABLE_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_CRIMSON_STABLE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_STABLE_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_WARPED_STABLE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_STABLE_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));

	public static final Item TALL_MACAW_OAK_STABLE_HEAD_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_OAK_STABLE_HEAD_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_SPRUCE_STABLE_HEAD_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_STABLE_HEAD_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BIRCH_STABLE_HEAD_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_STABLE_HEAD_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_JUNGLE_STABLE_HEAD_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_STABLE_HEAD_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_ACACIA_STABLE_HEAD_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_STABLE_HEAD_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_DARK_OAK_STABLE_HEAD_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_STABLE_HEAD_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_CRIMSON_STABLE_HEAD_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_STABLE_HEAD_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_WARPED_STABLE_HEAD_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_STABLE_HEAD_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));

	public static final Item TALL_MACAW_OAK_BARK_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_OAK_BARK_GLASS_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_SPRUCE_BARK_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_BARK_GLASS_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BIRCH_BARK_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_BARK_GLASS_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_JUNGLE_BARK_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_BARK_GLASS_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_ACACIA_BARK_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_BARK_GLASS_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_DARK_OAK_BARK_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_BARK_GLASS_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_CRIMSON_STEM_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_STEM_GLASS_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_WARPED_STEM_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_STEM_GLASS_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	
	public static final Item TALL_MACAW_OAK_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_OAK_GLASS_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_SPRUCE_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_GLASS_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BIRCH_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_GLASS_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_JUNGLE_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_GLASS_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_ACACIA_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_GLASS_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_DARK_OAK_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_GLASS_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_CRIMSON_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_GLASS_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_WARPED_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_GLASS_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));

	public static final Item TALL_MACAW_OAK_MODERN_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_OAK_MODERN_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_SPRUCE_MODERN_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_MODERN_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BIRCH_MODERN_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_MODERN_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_JUNGLE_MODERN_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_MODERN_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_ACACIA_MODERN_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_MODERN_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_DARK_OAK_MODERN_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_MODERN_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_CRIMSON_MODERN_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_MODERN_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_WARPED_MODERN_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_MODERN_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));

	public static final Item TALL_MACAW_OAK_JAPANESE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_OAK_JAPANESE_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_SPRUCE_JAPANESE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_JAPANESE_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BIRCH_JAPANESE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_JAPANESE_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_JUNGLE_JAPANESE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_JAPANESE_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_ACACIA_JAPANESE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_JAPANESE_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_DARK_OAK_JAPANESE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_JAPANESE_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_CRIMSON_JAPANESE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_JAPANESE_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_WARPED_JAPANESE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_JAPANESE_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));

	public static final Item TALL_MACAW_OAK_JAPANESE2_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_OAK_JAPANESE2_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_SPRUCE_JAPANESE2_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_JAPANESE2_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BIRCH_JAPANESE2_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_JAPANESE2_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_JUNGLE_JAPANESE2_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_JAPANESE2_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_ACACIA_JAPANESE2_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_JAPANESE2_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_DARK_OAK_JAPANESE2_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_JAPANESE2_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_CRIMSON_JAPANESE2_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_JAPANESE2_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_WARPED_JAPANESE2_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_JAPANESE2_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));

	public static final Item TALL_MACAW_SPRUCE_CLASSIC_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_CLASSIC_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BIRCH_CLASSIC_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_CLASSIC_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_JUNGLE_CLASSIC_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_CLASSIC_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_ACACIA_CLASSIC_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_CLASSIC_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_DARK_OAK_CLASSIC_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_CLASSIC_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_CRIMSON_CLASSIC_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_CLASSIC_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_WARPED_CLASSIC_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_CLASSIC_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));

	public static final Item TALL_MACAW_OAK_COTTAGE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_OAK_COTTAGE_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BIRCH_COTTAGE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_COTTAGE_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_JUNGLE_COTTAGE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_COTTAGE_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_ACACIA_COTTAGE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_COTTAGE_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_DARK_OAK_COTTAGE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_COTTAGE_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_CRIMSON_COTTAGE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_COTTAGE_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_WARPED_COTTAGE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_COTTAGE_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));

	public static final Item TALL_MACAW_OAK_PAPER_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_OAK_PAPER_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_SPRUCE_PAPER_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_PAPER_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_JUNGLE_PAPER_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_PAPER_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_ACACIA_PAPER_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_PAPER_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_DARK_OAK_PAPER_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_PAPER_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_CRIMSON_PAPER_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_PAPER_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_WARPED_PAPER_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_PAPER_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));

	public static final Item TALL_MACAW_OAK_BEACH_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_OAK_BEACH_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_SPRUCE_BEACH_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_BEACH_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BIRCH_BEACH_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_BEACH_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_ACACIA_BEACH_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_BEACH_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_DARK_OAK_BEACH_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_BEACH_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_CRIMSON_BEACH_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_BEACH_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_WARPED_BEACH_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_BEACH_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));

	public static final Item TALL_MACAW_OAK_TROPICAL_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_OAK_TROPICAL_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_SPRUCE_TROPICAL_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_TROPICAL_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BIRCH_TROPICAL_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_TROPICAL_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_JUNGLE_TROPICAL_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_TROPICAL_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_DARK_OAK_TROPICAL_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_TROPICAL_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_CRIMSON_TROPICAL_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_TROPICAL_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_WARPED_TROPICAL_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_TROPICAL_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));

	public static final Item TALL_MACAW_OAK_FOUR_PANEL_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_OAK_FOUR_PANEL_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_SPRUCE_FOUR_PANEL_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_FOUR_PANEL_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BIRCH_FOUR_PANEL_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_FOUR_PANEL_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_JUNGLE_FOUR_PANEL_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_FOUR_PANEL_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_ACACIA_FOUR_PANEL_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_FOUR_PANEL_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_CRIMSON_FOUR_PANEL_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_FOUR_PANEL_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_WARPED_FOUR_PANEL_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_FOUR_PANEL_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));

	public static final Item TALL_MACAW_OAK_SWAMP_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_OAK_SWAMP_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_SPRUCE_SWAMP_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_SWAMP_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BIRCH_SWAMP_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_SWAMP_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_JUNGLE_SWAMP_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_SWAMP_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_ACACIA_SWAMP_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_SWAMP_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_DARK_OAK_SWAMP_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_SWAMP_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_CRIMSON_SWAMP_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_SWAMP_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_WARPED_SWAMP_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_SWAMP_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));

	public static final Item TALL_MACAW_OAK_NETHER_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_OAK_NETHER_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_SPRUCE_NETHER_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_NETHER_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BIRCH_NETHER_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_NETHER_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_JUNGLE_NETHER_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_NETHER_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_ACACIA_NETHER_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_NETHER_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_DARK_OAK_NETHER_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_NETHER_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_WARPED_NETHER_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_NETHER_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));

	public static final Item TALL_MACAW_OAK_MYSTIC_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_OAK_MYSTIC_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_SPRUCE_MYSTIC_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_MYSTIC_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BIRCH_MYSTIC_DOOR =  new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_MYSTIC_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_JUNGLE_MYSTIC_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_MYSTIC_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_ACACIA_MYSTIC_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_MYSTIC_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_DARK_OAK_MYSTIC_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_MYSTIC_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_CRIMSON_MYSTIC_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_MYSTIC_DOOR, new FabricItemSettings().group(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
    
	public static void registerItems() {
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_IRON), TALL_IRON_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_OAK), TALL_OAK_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_SPRUCE), TALL_SPRUCE_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BIRCH), TALL_BIRCH_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_JUNGLE), TALL_JUNGLE_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_ACACIA), TALL_ACACIA_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_DARK_OAK), TALL_DARK_OAK_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MANGROVE), TALL_MANGROVE_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CRIMSON), TALL_CRIMSON_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_WARPED), TALL_WARPED_DOOR);

        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_ASPEN), TALL_BYG_ASPEN_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_BAOBAB), TALL_BYG_BAOBAB_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_BLUE_ENCHANTED), TALL_BYG_BLUE_ENCHANTED_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_BULBIS), TALL_BYG_BULBIS_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_CHERRY), TALL_BYG_CHERRY_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_CIKA), TALL_BYG_CIKA_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_CYPRESS), TALL_BYG_CYPRESS_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_EBONY), TALL_BYG_EBONY_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_EMBUR), TALL_BYG_EMBUR_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_ETHER), TALL_BYG_ETHER_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_FIR), TALL_BYG_FIR_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_FLORUS), TALL_BYG_FLORUS_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_GREEN_ENCHANTED), TALL_BYG_GREEN_ENCHANTED_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_HOLLY), TALL_BYG_HOLLY_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_IMPARIUS), TALL_BYG_IMPARIUS_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_IRONWOOD), TALL_BYG_IRONWOOD_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_JACARANDA), TALL_BYG_JACARANDA_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_LAMENT), TALL_BYG_LAMENT_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_MAHOGANY), TALL_BYG_MAHOGANY_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_MAPLE), TALL_BYG_MAPLE_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_NIGHTSHADE), TALL_BYG_NIGHTSHADE_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_PALM), TALL_BYG_PALM_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_PINE), TALL_BYG_PINE_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_RAINBOW_EUCALYPTUS), TALL_BYG_RAINBOW_EUCALYPTUS_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_REDWOOD), TALL_BYG_REDWOOD_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_SKYRIS), TALL_BYG_SKYRIS_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_SOUL_SHROOM), TALL_BYG_SOUL_SHROOM_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_SYTHIAN), TALL_BYG_SYTHIAN_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_WHITE_MANGROVE), TALL_BYG_WHITE_MANGROVE_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_WILLOW), TALL_BYG_WILLOW_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_WITCH_HAZEL), TALL_BYG_WITCH_HAZEL_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BYG_ZELKOVA), TALL_BYG_ZELKOVA_DOOR);
        
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_AERONOS), TALL_AERONOS_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_GLACIAN), TALL_GLACIAN_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_STROPHAR), TALL_STROPHAR_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_STEEL), TALL_STEEL_DOOR);
        
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_TWISTED), TALL_TWISTED_DOOR);
		
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CYPRESS), TALL_CYPRESS_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_DRAGONS_BLOOD), TALL_DRAGONS_BLOOD_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_ELDER), TALL_ELDER_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_JUNIPER), TALL_JUNIPER_DOOR);
		
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_ANCIENT_OAK), TALL_ANCIENT_OAK_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BLIGHTED_BALSA), TALL_BLIGHTED_BALSA_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_SWAMP_CYPRESS), TALL_SWAMP_CYPRESS_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_WILLOW), TALL_WILLOW_DOOR);
        
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BLOCKUS_BAMBOO), TALL_BLOCKUS_BAMBOO_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BLOCKUS_BLACKSTONE), TALL_BLOCKUS_BLACKSTONE_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BLOCKUS_CHARRED), TALL_BLOCKUS_CHARRED_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BLOCKUS_OBSIDIAN_REINFORCED), TALL_BLOCKUS_OBSIDIAN_REINFORCED_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BLOCKUS_PAPER), TALL_BLOCKUS_PAPER_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BLOCKUS_STONE), TALL_BLOCKUS_STONE_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BLOCKUS_WHITE_OAK), TALL_BLOCKUS_WHITE_OAK_DOOR);

		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CEILTRUNK), TALL_CEILTRUNK_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_LUZAWOOD), TALL_LUZAWOOD_DOOR);

        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHARM_AZALEA), TALL_CHARM_AZALEA_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHARM_EBONY), TALL_CHARM_EBONY_DOOR);
		
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_ECO_AZALEA), TALL_ECO_AZALEA_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_ECO_FLOWERING_AZALEA), TALL_ECO_FLOWERING_AZALEA_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_ECO_COCONUT), TALL_ECO_COCONUT_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_ECO_WALNUT), TALL_ECO_WALNUT_DOOR);
		
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BLOODSHROOM), TALL_BLOODSHROOM_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_GREENHEART), TALL_GREENHEART_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_SKYROOT), TALL_SKYROOT_DOOR);
		
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_IRON_GLASS), TALL_IRON_GLASS_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_OAK_GLASS), TALL_OAK_GLASS_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_SPRUCE_GLASS), TALL_SPRUCE_GLASS_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BIRCH_GLASS), TALL_BIRCH_GLASS_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_JUNGLE_GLASS), TALL_JUNGLE_GLASS_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_ACACIA_GLASS), TALL_ACACIA_GLASS_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_DARK_OAK_GLASS), TALL_DARK_OAK_GLASS_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CRIMSON_GLASS), TALL_CRIMSON_GLASS_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_WARPED_GLASS), TALL_WARPED_GLASS_DOOR);

        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_PROMENADE_CHERRY_OAK), TALL_PROMENADE_CHERRY_OAK_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_PROMENADE_DARK_AMARANTH), TALL_PROMENADE_DARK_AMARANTH_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_PROMENADE_PALM), TALL_PROMENADE_PALM_DOOR);

		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_GINGERBREAD), TALL_GINGERBREAD_DOOR);

		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_GOLD), TALL_GOLD_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_NETHERITE), TALL_NETHERITE_DOOR);

		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_RUBBER), TALL_RUBBER_DOOR);

		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_TRAVERSE_FIR), TALL_TRAVERSE_FIR_DOOR);

		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_STRIPPED_BAMBOO), TALL_STRIPPED_BAMBOO_DOOR);

		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CANOPY), TALL_CANOPY_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_DARKWOOD), TALL_DARKWOOD_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MINEWOOD), TALL_MINEWOOD_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_SORTINGWOOD), TALL_SORTINGWOOD_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_TIMEWOOD), TALL_TIMEWOOD_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_TRANSWOOD), TALL_TRANSWOOD_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_TWILIGHT_MANGROVE), TALL_TWILIGHT_MANGROVE_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_TWILIGHT_OAK), TALL_TWILIGHT_OAK_DOOR);

		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_SOUL_COPPER), TALL_SOUL_COPPER_DOOR);

        //Register all those Chipped doors.
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_01), TALL_CHIPPED_OAK_DOOR_01);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_02), TALL_CHIPPED_OAK_DOOR_02);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_03), TALL_CHIPPED_OAK_DOOR_03);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_04), TALL_CHIPPED_OAK_DOOR_04);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_05), TALL_CHIPPED_OAK_DOOR_05);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_06), TALL_CHIPPED_OAK_DOOR_06);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_07), TALL_CHIPPED_OAK_DOOR_07);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_08), TALL_CHIPPED_OAK_DOOR_08);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_09), TALL_CHIPPED_OAK_DOOR_09);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_10), TALL_CHIPPED_OAK_DOOR_10);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_11), TALL_CHIPPED_OAK_DOOR_11);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_12), TALL_CHIPPED_OAK_DOOR_12);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_13), TALL_CHIPPED_OAK_DOOR_13);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_14), TALL_CHIPPED_OAK_DOOR_14);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_15), TALL_CHIPPED_OAK_DOOR_15);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_16), TALL_CHIPPED_OAK_DOOR_16);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_17), TALL_CHIPPED_OAK_DOOR_17);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_18), TALL_CHIPPED_OAK_DOOR_18);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_19), TALL_CHIPPED_OAK_DOOR_19);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_20), TALL_CHIPPED_OAK_DOOR_20);
        
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_01), TALL_CHIPPED_SPRUCE_DOOR_01);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_02), TALL_CHIPPED_SPRUCE_DOOR_02);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_03), TALL_CHIPPED_SPRUCE_DOOR_03);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_04), TALL_CHIPPED_SPRUCE_DOOR_04);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_05), TALL_CHIPPED_SPRUCE_DOOR_05);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_06), TALL_CHIPPED_SPRUCE_DOOR_06);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_07), TALL_CHIPPED_SPRUCE_DOOR_07);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_08), TALL_CHIPPED_SPRUCE_DOOR_08);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_09), TALL_CHIPPED_SPRUCE_DOOR_09);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_10), TALL_CHIPPED_SPRUCE_DOOR_10);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_11), TALL_CHIPPED_SPRUCE_DOOR_11);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_12), TALL_CHIPPED_SPRUCE_DOOR_12);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_13), TALL_CHIPPED_SPRUCE_DOOR_13);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_14), TALL_CHIPPED_SPRUCE_DOOR_14);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_15), TALL_CHIPPED_SPRUCE_DOOR_15);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_16), TALL_CHIPPED_SPRUCE_DOOR_16);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_17), TALL_CHIPPED_SPRUCE_DOOR_17);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_18), TALL_CHIPPED_SPRUCE_DOOR_18);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_19), TALL_CHIPPED_SPRUCE_DOOR_19);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_20), TALL_CHIPPED_SPRUCE_DOOR_20);
        
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_01), TALL_CHIPPED_BIRCH_DOOR_01);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_02), TALL_CHIPPED_BIRCH_DOOR_02);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_03), TALL_CHIPPED_BIRCH_DOOR_03);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_04), TALL_CHIPPED_BIRCH_DOOR_04);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_05), TALL_CHIPPED_BIRCH_DOOR_05);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_06), TALL_CHIPPED_BIRCH_DOOR_06);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_07), TALL_CHIPPED_BIRCH_DOOR_07);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_08), TALL_CHIPPED_BIRCH_DOOR_08);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_09), TALL_CHIPPED_BIRCH_DOOR_09);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_10), TALL_CHIPPED_BIRCH_DOOR_10);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_11), TALL_CHIPPED_BIRCH_DOOR_11);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_12), TALL_CHIPPED_BIRCH_DOOR_12);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_13), TALL_CHIPPED_BIRCH_DOOR_13);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_14), TALL_CHIPPED_BIRCH_DOOR_14);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_15), TALL_CHIPPED_BIRCH_DOOR_15);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_16), TALL_CHIPPED_BIRCH_DOOR_16);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_17), TALL_CHIPPED_BIRCH_DOOR_17);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_18), TALL_CHIPPED_BIRCH_DOOR_18);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_19), TALL_CHIPPED_BIRCH_DOOR_19);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_20), TALL_CHIPPED_BIRCH_DOOR_20);
        
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_01), TALL_CHIPPED_JUNGLE_DOOR_01);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_02), TALL_CHIPPED_JUNGLE_DOOR_02);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_03), TALL_CHIPPED_JUNGLE_DOOR_03);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_04), TALL_CHIPPED_JUNGLE_DOOR_04);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_05), TALL_CHIPPED_JUNGLE_DOOR_05);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_06), TALL_CHIPPED_JUNGLE_DOOR_06);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_07), TALL_CHIPPED_JUNGLE_DOOR_07);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_08), TALL_CHIPPED_JUNGLE_DOOR_08);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_09), TALL_CHIPPED_JUNGLE_DOOR_09);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_10), TALL_CHIPPED_JUNGLE_DOOR_10);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_11), TALL_CHIPPED_JUNGLE_DOOR_11);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_12), TALL_CHIPPED_JUNGLE_DOOR_12);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_13), TALL_CHIPPED_JUNGLE_DOOR_13);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_14), TALL_CHIPPED_JUNGLE_DOOR_14);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_15), TALL_CHIPPED_JUNGLE_DOOR_15);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_16), TALL_CHIPPED_JUNGLE_DOOR_16);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_17), TALL_CHIPPED_JUNGLE_DOOR_17);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_18), TALL_CHIPPED_JUNGLE_DOOR_18);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_19), TALL_CHIPPED_JUNGLE_DOOR_19);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_20), TALL_CHIPPED_JUNGLE_DOOR_20);
        
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_01), TALL_CHIPPED_ACACIA_DOOR_01);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_02), TALL_CHIPPED_ACACIA_DOOR_02);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_03), TALL_CHIPPED_ACACIA_DOOR_03);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_04), TALL_CHIPPED_ACACIA_DOOR_04);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_05), TALL_CHIPPED_ACACIA_DOOR_05);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_06), TALL_CHIPPED_ACACIA_DOOR_06);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_07), TALL_CHIPPED_ACACIA_DOOR_07);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_08), TALL_CHIPPED_ACACIA_DOOR_08);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_09), TALL_CHIPPED_ACACIA_DOOR_09);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_10), TALL_CHIPPED_ACACIA_DOOR_10);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_11), TALL_CHIPPED_ACACIA_DOOR_11);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_12), TALL_CHIPPED_ACACIA_DOOR_12);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_13), TALL_CHIPPED_ACACIA_DOOR_13);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_14), TALL_CHIPPED_ACACIA_DOOR_14);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_15), TALL_CHIPPED_ACACIA_DOOR_15);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_16), TALL_CHIPPED_ACACIA_DOOR_16);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_17), TALL_CHIPPED_ACACIA_DOOR_17);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_18), TALL_CHIPPED_ACACIA_DOOR_18);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_19), TALL_CHIPPED_ACACIA_DOOR_19);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_20), TALL_CHIPPED_ACACIA_DOOR_20);
        
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_01), TALL_CHIPPED_DARK_OAK_DOOR_01);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_02), TALL_CHIPPED_DARK_OAK_DOOR_02);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_03), TALL_CHIPPED_DARK_OAK_DOOR_03);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_04), TALL_CHIPPED_DARK_OAK_DOOR_04);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_05), TALL_CHIPPED_DARK_OAK_DOOR_05);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_06), TALL_CHIPPED_DARK_OAK_DOOR_06);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_07), TALL_CHIPPED_DARK_OAK_DOOR_07);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_08), TALL_CHIPPED_DARK_OAK_DOOR_08);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_09), TALL_CHIPPED_DARK_OAK_DOOR_09);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_10), TALL_CHIPPED_DARK_OAK_DOOR_10);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_11), TALL_CHIPPED_DARK_OAK_DOOR_11);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_12), TALL_CHIPPED_DARK_OAK_DOOR_12);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_13), TALL_CHIPPED_DARK_OAK_DOOR_13);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_14), TALL_CHIPPED_DARK_OAK_DOOR_14);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_15), TALL_CHIPPED_DARK_OAK_DOOR_15);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_16), TALL_CHIPPED_DARK_OAK_DOOR_16);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_17), TALL_CHIPPED_DARK_OAK_DOOR_17);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_18), TALL_CHIPPED_DARK_OAK_DOOR_18);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_19), TALL_CHIPPED_DARK_OAK_DOOR_19);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_20), TALL_CHIPPED_DARK_OAK_DOOR_20);
        
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_01), TALL_CHIPPED_CRIMSON_DOOR_01);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_02), TALL_CHIPPED_CRIMSON_DOOR_02);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_03), TALL_CHIPPED_CRIMSON_DOOR_03);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_04), TALL_CHIPPED_CRIMSON_DOOR_04);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_05), TALL_CHIPPED_CRIMSON_DOOR_05);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_06), TALL_CHIPPED_CRIMSON_DOOR_06);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_07), TALL_CHIPPED_CRIMSON_DOOR_07);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_08), TALL_CHIPPED_CRIMSON_DOOR_08);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_09), TALL_CHIPPED_CRIMSON_DOOR_09);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_10), TALL_CHIPPED_CRIMSON_DOOR_10);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_11), TALL_CHIPPED_CRIMSON_DOOR_11);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_12), TALL_CHIPPED_CRIMSON_DOOR_12);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_13), TALL_CHIPPED_CRIMSON_DOOR_13);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_14), TALL_CHIPPED_CRIMSON_DOOR_14);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_15), TALL_CHIPPED_CRIMSON_DOOR_15);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_16), TALL_CHIPPED_CRIMSON_DOOR_16);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_17), TALL_CHIPPED_CRIMSON_DOOR_17);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_18), TALL_CHIPPED_CRIMSON_DOOR_18);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_19), TALL_CHIPPED_CRIMSON_DOOR_19);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_20), TALL_CHIPPED_CRIMSON_DOOR_20);
        
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_01), TALL_CHIPPED_WARPED_DOOR_01);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_02), TALL_CHIPPED_WARPED_DOOR_02);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_03), TALL_CHIPPED_WARPED_DOOR_03);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_04), TALL_CHIPPED_WARPED_DOOR_04);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_05), TALL_CHIPPED_WARPED_DOOR_05);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_06), TALL_CHIPPED_WARPED_DOOR_06);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_07), TALL_CHIPPED_WARPED_DOOR_07);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_08), TALL_CHIPPED_WARPED_DOOR_08);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_09), TALL_CHIPPED_WARPED_DOOR_09);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_10), TALL_CHIPPED_WARPED_DOOR_10);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_11), TALL_CHIPPED_WARPED_DOOR_11);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_12), TALL_CHIPPED_WARPED_DOOR_12);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_13), TALL_CHIPPED_WARPED_DOOR_13);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_14), TALL_CHIPPED_WARPED_DOOR_14);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_15), TALL_CHIPPED_WARPED_DOOR_15);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_16), TALL_CHIPPED_WARPED_DOOR_16);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_17), TALL_CHIPPED_WARPED_DOOR_17);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_18), TALL_CHIPPED_WARPED_DOOR_18);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_19), TALL_CHIPPED_WARPED_DOOR_19);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_20), TALL_CHIPPED_WARPED_DOOR_20);
		
        //Register all those Macaw doors.
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JAIL), TALL_MACAW_JAIL_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL), TALL_MACAW_METAL_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_HOSPITAL), TALL_MACAW_METAL_HOSPITAL_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_REINFORCED), TALL_MACAW_METAL_REINFORCED_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_WARNING), TALL_MACAW_METAL_WARNING_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_WINDOWED), TALL_MACAW_METAL_WINDOWED_DOOR);

        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BARN), TALL_MACAW_OAK_BARN_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BARN), TALL_MACAW_SPRUCE_BARN_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BARN), TALL_MACAW_BIRCH_BARN_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_BARN), TALL_MACAW_JUNGLE_BARN_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BARN), TALL_MACAW_ACACIA_BARN_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BARN), TALL_MACAW_DARK_OAK_BARN_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_BARN), TALL_MACAW_CRIMSON_BARN_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_BARN), TALL_MACAW_WARPED_BARN_DOOR);

        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BARN_GLASS), TALL_MACAW_OAK_BARN_GLASS_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BARN_GLASS), TALL_MACAW_SPRUCE_BARN_GLASS_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BARN_GLASS), TALL_MACAW_BIRCH_BARN_GLASS_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_BARN_GLASS), TALL_MACAW_JUNGLE_BARN_GLASS_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BARN_GLASS), TALL_MACAW_ACACIA_BARN_GLASS_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BARN_GLASS), TALL_MACAW_DARK_OAK_BARN_GLASS_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_BARN_GLASS), TALL_MACAW_CRIMSON_BARN_GLASS_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_BARN_GLASS), TALL_MACAW_WARPED_BARN_GLASS_DOOR);

        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_STABLE), TALL_MACAW_OAK_STABLE_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_STABLE), TALL_MACAW_SPRUCE_STABLE_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_STABLE), TALL_MACAW_BIRCH_STABLE_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_STABLE), TALL_MACAW_JUNGLE_STABLE_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_STABLE), TALL_MACAW_ACACIA_STABLE_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_STABLE), TALL_MACAW_DARK_OAK_STABLE_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_STABLE), TALL_MACAW_CRIMSON_STABLE_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_STABLE), TALL_MACAW_WARPED_STABLE_DOOR);

        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_STABLE_HEAD), TALL_MACAW_OAK_STABLE_HEAD_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_STABLE_HEAD), TALL_MACAW_SPRUCE_STABLE_HEAD_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_STABLE_HEAD), TALL_MACAW_BIRCH_STABLE_HEAD_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_STABLE_HEAD), TALL_MACAW_JUNGLE_STABLE_HEAD_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_STABLE_HEAD), TALL_MACAW_ACACIA_STABLE_HEAD_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_STABLE_HEAD), TALL_MACAW_DARK_OAK_STABLE_HEAD_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_STABLE_HEAD), TALL_MACAW_CRIMSON_STABLE_HEAD_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_STABLE_HEAD), TALL_MACAW_WARPED_STABLE_HEAD_DOOR);

        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BARK_GLASS), TALL_MACAW_OAK_BARK_GLASS_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BARK_GLASS), TALL_MACAW_SPRUCE_BARK_GLASS_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BARK_GLASS), TALL_MACAW_BIRCH_BARK_GLASS_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_BARK_GLASS), TALL_MACAW_JUNGLE_BARK_GLASS_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BARK_GLASS), TALL_MACAW_ACACIA_BARK_GLASS_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BARK_GLASS), TALL_MACAW_DARK_OAK_BARK_GLASS_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_STEM_GLASS), TALL_MACAW_CRIMSON_STEM_GLASS_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_STEM_GLASS), TALL_MACAW_WARPED_STEM_GLASS_DOOR);
        
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_GLASS), TALL_MACAW_OAK_GLASS_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_GLASS), TALL_MACAW_SPRUCE_GLASS_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_GLASS), TALL_MACAW_BIRCH_GLASS_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_GLASS), TALL_MACAW_JUNGLE_GLASS_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_GLASS), TALL_MACAW_ACACIA_GLASS_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_GLASS), TALL_MACAW_DARK_OAK_GLASS_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_GLASS), TALL_MACAW_CRIMSON_GLASS_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_GLASS), TALL_MACAW_WARPED_GLASS_DOOR);

        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_MODERN), TALL_MACAW_OAK_MODERN_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_MODERN), TALL_MACAW_SPRUCE_MODERN_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_MODERN), TALL_MACAW_BIRCH_MODERN_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_MODERN), TALL_MACAW_JUNGLE_MODERN_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_MODERN), TALL_MACAW_ACACIA_MODERN_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_MODERN), TALL_MACAW_DARK_OAK_MODERN_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_MODERN), TALL_MACAW_CRIMSON_MODERN_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_MODERN), TALL_MACAW_WARPED_MODERN_DOOR);

        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_JAPANESE), TALL_MACAW_OAK_JAPANESE_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_JAPANESE), TALL_MACAW_SPRUCE_JAPANESE_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_JAPANESE), TALL_MACAW_BIRCH_JAPANESE_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_JAPANESE), TALL_MACAW_JUNGLE_JAPANESE_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_JAPANESE), TALL_MACAW_ACACIA_JAPANESE_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_JAPANESE), TALL_MACAW_DARK_OAK_JAPANESE_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_JAPANESE), TALL_MACAW_CRIMSON_JAPANESE_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_JAPANESE), TALL_MACAW_WARPED_JAPANESE_DOOR);

        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_JAPANESE2), TALL_MACAW_OAK_JAPANESE2_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_JAPANESE2), TALL_MACAW_SPRUCE_JAPANESE2_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_JAPANESE2), TALL_MACAW_BIRCH_JAPANESE2_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_JAPANESE2), TALL_MACAW_JUNGLE_JAPANESE2_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_JAPANESE2), TALL_MACAW_ACACIA_JAPANESE2_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_JAPANESE2), TALL_MACAW_DARK_OAK_JAPANESE2_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_JAPANESE2), TALL_MACAW_CRIMSON_JAPANESE2_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_JAPANESE2), TALL_MACAW_WARPED_JAPANESE2_DOOR);

        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_CLASSIC), TALL_MACAW_SPRUCE_CLASSIC_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_CLASSIC), TALL_MACAW_BIRCH_CLASSIC_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_CLASSIC), TALL_MACAW_JUNGLE_CLASSIC_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_CLASSIC), TALL_MACAW_ACACIA_CLASSIC_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_CLASSIC), TALL_MACAW_DARK_OAK_CLASSIC_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_CLASSIC), TALL_MACAW_CRIMSON_CLASSIC_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_CLASSIC), TALL_MACAW_WARPED_CLASSIC_DOOR);

        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_COTTAGE), TALL_MACAW_OAK_COTTAGE_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_COTTAGE), TALL_MACAW_BIRCH_COTTAGE_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_COTTAGE), TALL_MACAW_JUNGLE_COTTAGE_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_COTTAGE), TALL_MACAW_ACACIA_COTTAGE_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_COTTAGE), TALL_MACAW_DARK_OAK_COTTAGE_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_COTTAGE), TALL_MACAW_CRIMSON_COTTAGE_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_COTTAGE), TALL_MACAW_WARPED_COTTAGE_DOOR);

        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_PAPER), TALL_MACAW_OAK_PAPER_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_PAPER), TALL_MACAW_SPRUCE_PAPER_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_PAPER), TALL_MACAW_JUNGLE_PAPER_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_PAPER), TALL_MACAW_ACACIA_PAPER_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_PAPER), TALL_MACAW_DARK_OAK_PAPER_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_PAPER), TALL_MACAW_CRIMSON_PAPER_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_PAPER), TALL_MACAW_WARPED_PAPER_DOOR);

        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BEACH), TALL_MACAW_OAK_BEACH_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BEACH), TALL_MACAW_SPRUCE_BEACH_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BEACH), TALL_MACAW_BIRCH_BEACH_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BEACH), TALL_MACAW_ACACIA_BEACH_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BEACH), TALL_MACAW_DARK_OAK_BEACH_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_BEACH), TALL_MACAW_CRIMSON_BEACH_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_BEACH), TALL_MACAW_WARPED_BEACH_DOOR);

        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_TROPICAL), TALL_MACAW_OAK_TROPICAL_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_TROPICAL), TALL_MACAW_SPRUCE_TROPICAL_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_TROPICAL), TALL_MACAW_BIRCH_TROPICAL_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_TROPICAL), TALL_MACAW_JUNGLE_TROPICAL_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_TROPICAL), TALL_MACAW_DARK_OAK_TROPICAL_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_TROPICAL), TALL_MACAW_CRIMSON_TROPICAL_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_TROPICAL), TALL_MACAW_WARPED_TROPICAL_DOOR);

        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_FOUR_PANEL), TALL_MACAW_OAK_FOUR_PANEL_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_FOUR_PANEL), TALL_MACAW_SPRUCE_FOUR_PANEL_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_FOUR_PANEL), TALL_MACAW_BIRCH_FOUR_PANEL_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_FOUR_PANEL), TALL_MACAW_JUNGLE_FOUR_PANEL_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_FOUR_PANEL), TALL_MACAW_ACACIA_FOUR_PANEL_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_FOUR_PANEL), TALL_MACAW_CRIMSON_FOUR_PANEL_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_FOUR_PANEL), TALL_MACAW_WARPED_FOUR_PANEL_DOOR);
        
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_SWAMP), TALL_MACAW_OAK_SWAMP_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_SWAMP), TALL_MACAW_SPRUCE_SWAMP_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_SWAMP), TALL_MACAW_BIRCH_SWAMP_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_SWAMP), TALL_MACAW_JUNGLE_SWAMP_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_SWAMP), TALL_MACAW_ACACIA_SWAMP_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_SWAMP), TALL_MACAW_DARK_OAK_SWAMP_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_SWAMP), TALL_MACAW_CRIMSON_SWAMP_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_SWAMP), TALL_MACAW_WARPED_SWAMP_DOOR);

        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_NETHER), TALL_MACAW_OAK_NETHER_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_NETHER), TALL_MACAW_SPRUCE_NETHER_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_NETHER), TALL_MACAW_BIRCH_NETHER_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_NETHER), TALL_MACAW_JUNGLE_NETHER_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_NETHER), TALL_MACAW_ACACIA_NETHER_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_NETHER), TALL_MACAW_DARK_OAK_NETHER_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_NETHER), TALL_MACAW_WARPED_NETHER_DOOR);

        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_MYSTIC), TALL_MACAW_OAK_MYSTIC_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_MYSTIC), TALL_MACAW_SPRUCE_MYSTIC_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_MYSTIC), TALL_MACAW_BIRCH_MYSTIC_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_MYSTIC), TALL_MACAW_JUNGLE_MYSTIC_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_MYSTIC), TALL_MACAW_ACACIA_MYSTIC_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_MYSTIC), TALL_MACAW_DARK_OAK_MYSTIC_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_MYSTIC), TALL_MACAW_CRIMSON_MYSTIC_DOOR);
    }
	
    private static ItemGroup conditionalTabProperties(String modid, ItemGroup tab) {
    	return FabricLoader.getInstance().isModLoaded(modid) ? tab : null;
    }
    
}
