package com.fizzware.dramaticdoors.items;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.blocks.DDBlocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class DDItems {
	
	public static final Item.Properties PROPERTIES = new FabricItemSettings();

	// Vanilla
    public static final Item SHORT_IRON_DOOR = new ShortDoorItem(DDBlocks.SHORT_IRON_DOOR, PROPERTIES.tab(DramaticDoors.DD_MAIN_TAB));
    public static final Item SHORT_OAK_DOOR = new ShortDoorItem(DDBlocks.SHORT_OAK_DOOR, PROPERTIES.tab(DramaticDoors.DD_MAIN_TAB));
    public static final Item SHORT_SPRUCE_DOOR = new ShortDoorItem(DDBlocks.SHORT_SPRUCE_DOOR, PROPERTIES.tab(DramaticDoors.DD_MAIN_TAB));
    public static final Item SHORT_BIRCH_DOOR = new ShortDoorItem(DDBlocks.SHORT_BIRCH_DOOR, PROPERTIES.tab(DramaticDoors.DD_MAIN_TAB));
    public static final Item SHORT_JUNGLE_DOOR = new ShortDoorItem(DDBlocks.SHORT_JUNGLE_DOOR, PROPERTIES.tab(DramaticDoors.DD_MAIN_TAB));
    public static final Item SHORT_ACACIA_DOOR = new ShortDoorItem(DDBlocks.SHORT_ACACIA_DOOR, PROPERTIES.tab(DramaticDoors.DD_MAIN_TAB));
    public static final Item SHORT_DARK_OAK_DOOR = new ShortDoorItem(DDBlocks.SHORT_DARK_OAK_DOOR, PROPERTIES.tab(DramaticDoors.DD_MAIN_TAB));
    public static final Item SHORT_MANGROVE_DOOR = new ShortDoorItem(DDBlocks.SHORT_MANGROVE_DOOR, PROPERTIES.tab(DramaticDoors.DD_MAIN_TAB));
    public static final Item SHORT_BAMBOO_DOOR = new ShortDoorItem(DDBlocks.SHORT_BAMBOO_DOOR, PROPERTIES.tab(conditionalTabProperties("one_twenty_backport", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_CRIMSON_DOOR = new ShortDoorItem(DDBlocks.SHORT_CRIMSON_DOOR, PROPERTIES.tab(DramaticDoors.DD_MAIN_TAB));
    public static final Item SHORT_WARPED_DOOR = new ShortDoorItem(DDBlocks.SHORT_WARPED_DOOR, PROPERTIES.tab(DramaticDoors.DD_MAIN_TAB));

    public static final Item TALL_IRON_DOOR = new TallDoorItem(DDBlocks.TALL_IRON_DOOR, PROPERTIES.tab(DramaticDoors.DD_MAIN_TAB));
    public static final Item TALL_OAK_DOOR = new TallDoorItem(DDBlocks.TALL_OAK_DOOR, PROPERTIES.tab(DramaticDoors.DD_MAIN_TAB));
    public static final Item TALL_SPRUCE_DOOR = new TallDoorItem(DDBlocks.TALL_SPRUCE_DOOR, PROPERTIES.tab(DramaticDoors.DD_MAIN_TAB));
    public static final Item TALL_BIRCH_DOOR = new TallDoorItem(DDBlocks.TALL_BIRCH_DOOR, PROPERTIES.tab(DramaticDoors.DD_MAIN_TAB));
    public static final Item TALL_JUNGLE_DOOR = new TallDoorItem(DDBlocks.TALL_JUNGLE_DOOR, PROPERTIES.tab(DramaticDoors.DD_MAIN_TAB));
    public static final Item TALL_ACACIA_DOOR = new TallDoorItem(DDBlocks.TALL_ACACIA_DOOR, PROPERTIES.tab(DramaticDoors.DD_MAIN_TAB));
    public static final Item TALL_DARK_OAK_DOOR = new TallDoorItem(DDBlocks.TALL_DARK_OAK_DOOR, PROPERTIES.tab(DramaticDoors.DD_MAIN_TAB));
    public static final Item TALL_MANGROVE_DOOR = new TallDoorItem(DDBlocks.TALL_MANGROVE_DOOR, PROPERTIES.tab(DramaticDoors.DD_MAIN_TAB));
    public static final Item TALL_BAMBOO_DOOR = new TallDoorItem(DDBlocks.TALL_BAMBOO_DOOR, PROPERTIES.tab(conditionalTabProperties("one_twenty_backport", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_CRIMSON_DOOR = new TallDoorItem(DDBlocks.TALL_CRIMSON_DOOR, PROPERTIES.tab(DramaticDoors.DD_MAIN_TAB));
    public static final Item TALL_WARPED_DOOR = new TallDoorItem(DDBlocks.TALL_WARPED_DOOR, PROPERTIES.tab(DramaticDoors.DD_MAIN_TAB));
    
    // Team Aurora
    public static final Item SHORT_JACARANDA_DOOR = new ShortDoorItem(DDBlocks.SHORT_JACARANDA_DOOR, PROPERTIES.tab(conditionalTabProperties("abundance", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_REDBUD_DOOR = new ShortDoorItem(DDBlocks.SHORT_REDBUD_DOOR, PROPERTIES.tab(conditionalTabProperties("abundance", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_CYPRESS_DOOR = new ShortDoorItem(DDBlocks.SHORT_CYPRESS_DOOR, PROPERTIES.tab(conditionalTabProperties("bayou_blues", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BROWN_MUSHROOM_DOOR = new ShortDoorItem(DDBlocks.SHORT_BROWN_MUSHROOM_DOOR, PROPERTIES.tab(conditionalTabProperties("enhanced_mushrooms", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_RED_MUSHROOM_DOOR = new ShortDoorItem(DDBlocks.SHORT_RED_MUSHROOM_DOOR, PROPERTIES.tab(conditionalTabProperties("enhanced_mushrooms", DramaticDoors.DD_MAIN_TAB)));

    public static final Item TALL_JACARANDA_DOOR = new TallDoorItem(DDBlocks.TALL_JACARANDA_DOOR, PROPERTIES.tab(conditionalTabProperties("abundance", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_REDBUD_DOOR = new TallDoorItem(DDBlocks.TALL_REDBUD_DOOR, PROPERTIES.tab(conditionalTabProperties("abundance", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_CYPRESS_DOOR = new TallDoorItem(DDBlocks.TALL_CYPRESS_DOOR, PROPERTIES.tab(conditionalTabProperties("bayou_blues", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BROWN_MUSHROOM_DOOR = new TallDoorItem(DDBlocks.TALL_BROWN_MUSHROOM_DOOR, PROPERTIES.tab(conditionalTabProperties("enhanced_mushrooms", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_RED_MUSHROOM_DOOR = new TallDoorItem(DDBlocks.TALL_RED_MUSHROOM_DOOR, PROPERTIES.tab(conditionalTabProperties("enhanced_mushrooms", DramaticDoors.DD_MAIN_TAB)));
    
    // Ad Astra
    public static final Item SHORT_AERONOS_DOOR = new ShortDoorItem(DDBlocks.SHORT_AERONOS_DOOR, PROPERTIES.tab(conditionalTabProperties("ad_astra", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_GLACIAN_DOOR = new ShortDoorItem(DDBlocks.SHORT_GLACIAN_DOOR, PROPERTIES.tab(conditionalTabProperties("ad_astra", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_STROPHAR_DOOR = new ShortDoorItem(DDBlocks.SHORT_STROPHAR_DOOR, PROPERTIES.tab(conditionalTabProperties("ad_astra", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_STEEL_DOOR = new ShortDoorItem(DDBlocks.SHORT_STEEL_DOOR, PROPERTIES.tab(conditionalTabProperties("ad_astra", DramaticDoors.DD_MAIN_TAB)));    

    public static final Item TALL_AERONOS_DOOR = new TallDoorItem(DDBlocks.TALL_AERONOS_DOOR, PROPERTIES.tab(conditionalTabProperties("ad_astra", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_GLACIAN_DOOR = new TallDoorItem(DDBlocks.TALL_GLACIAN_DOOR, PROPERTIES.tab(conditionalTabProperties("ad_astra", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_STROPHAR_DOOR = new TallDoorItem(DDBlocks.TALL_STROPHAR_DOOR, PROPERTIES.tab(conditionalTabProperties("ad_astra", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_STEEL_DOOR = new TallDoorItem(DDBlocks.TALL_STEEL_DOOR, PROPERTIES.tab(conditionalTabProperties("ad_astra", DramaticDoors.DD_MAIN_TAB)));    
    
    // Aether
    public static final Item SHORT_AETHER_SKYROOT_DOOR = new ShortDoorItem(DDBlocks.SHORT_AETHER_SKYROOT_DOOR, PROPERTIES.tab(conditionalTabProperties("aether", DramaticDoors.DD_MAIN_TAB)));

    public static final Item TALL_AETHER_SKYROOT_DOOR = new TallDoorItem(DDBlocks.TALL_AETHER_SKYROOT_DOOR, PROPERTIES.tab(conditionalTabProperties("aether", DramaticDoors.DD_MAIN_TAB)));
    
    // Architects Palette
    public static final Item SHORT_TWISTED_DOOR = new ShortDoorItem(DDBlocks.SHORT_TWISTED_DOOR, PROPERTIES.tab(conditionalTabProperties("architects_palette", DramaticDoors.DD_MAIN_TAB)));

    public static final Item TALL_TWISTED_DOOR = new TallDoorItem(DDBlocks.TALL_TWISTED_DOOR, PROPERTIES.tab(conditionalTabProperties("architects_palette", DramaticDoors.DD_MAIN_TAB)));
    
    // Bamboo Everything
    public static final Item SHORT_BE_BAMBOO_DOOR = new ShortDoorItem(DDBlocks.SHORT_BE_BAMBOO_DOOR, PROPERTIES.tab(conditionalTabProperties("bambooeverything", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BE_DRY_BAMBOO_DOOR = new ShortDoorItem(DDBlocks.SHORT_BE_DRY_BAMBOO_DOOR, PROPERTIES.tab(conditionalTabProperties("bambooeverything", DramaticDoors.DD_MAIN_TAB)));

    public static final Item TALL_BE_BAMBOO_DOOR = new TallDoorItem(DDBlocks.TALL_BE_BAMBOO_DOOR, PROPERTIES.tab(conditionalTabProperties("bambooeverything", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BE_DRY_BAMBOO_DOOR = new TallDoorItem(DDBlocks.TALL_BE_DRY_BAMBOO_DOOR, PROPERTIES.tab(conditionalTabProperties("bambooeverything", DramaticDoors.DD_MAIN_TAB)));
    
    // Better End
    public static final Item SHORT_TERMINITE_DOOR = new ShortDoorItem(DDBlocks.SHORT_TERMINITE_DOOR, PROPERTIES.tab(conditionalTabProperties("betterend", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_THALLASIUM_DOOR = new ShortDoorItem(DDBlocks.SHORT_THALLASIUM_DOOR, PROPERTIES.tab(conditionalTabProperties("betterend", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_DRAGON_TREE_DOOR = new ShortDoorItem(DDBlocks.SHORT_DRAGON_TREE_DOOR, PROPERTIES.tab(conditionalTabProperties("betterend", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_END_LOTUS_DOOR = new ShortDoorItem(DDBlocks.SHORT_END_LOTUS_DOOR, PROPERTIES.tab(conditionalTabProperties("betterend", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_HELIX_TREE_DOOR = new ShortDoorItem(DDBlocks.SHORT_HELIX_TREE_DOOR, PROPERTIES.tab(conditionalTabProperties("betterend", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_JELLYSHROOM_DOOR = new ShortDoorItem(DDBlocks.SHORT_JELLYSHROOM_DOOR, PROPERTIES.tab(conditionalTabProperties("betterend", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_LACUGROVE_DOOR = new ShortDoorItem(DDBlocks.SHORT_LACUGROVE_DOOR, PROPERTIES.tab(conditionalTabProperties("betterend", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_LUCERNIA_DOOR = new ShortDoorItem(DDBlocks.SHORT_LUCERNIA_DOOR, PROPERTIES.tab(conditionalTabProperties("betterend", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_MOSSY_GLOWSHROOM_DOOR = new ShortDoorItem(DDBlocks.SHORT_MOSSY_GLOWSHROOM_DOOR, PROPERTIES.tab(conditionalTabProperties("betterend", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_PYTHADENDRON_DOOR = new ShortDoorItem(DDBlocks.SHORT_PYTHADENDRON_DOOR, PROPERTIES.tab(conditionalTabProperties("betterend", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_TENANEA_DOOR = new ShortDoorItem(DDBlocks.SHORT_TENANEA_DOOR, PROPERTIES.tab(conditionalTabProperties("betterend", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_UMBRELLA_TREE_DOOR = new ShortDoorItem(DDBlocks.SHORT_UMBRELLA_TREE_DOOR, PROPERTIES.tab(conditionalTabProperties("betterend", DramaticDoors.DD_MAIN_TAB)));

    public static final Item TALL_TERMINITE_DOOR = new TallDoorItem(DDBlocks.TALL_TERMINITE_DOOR, PROPERTIES.tab(conditionalTabProperties("betterend", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_THALLASIUM_DOOR = new TallDoorItem(DDBlocks.TALL_THALLASIUM_DOOR, PROPERTIES.tab(conditionalTabProperties("betterend", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_DRAGON_TREE_DOOR = new TallDoorItem(DDBlocks.TALL_DRAGON_TREE_DOOR, PROPERTIES.tab(conditionalTabProperties("betterend", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_END_LOTUS_DOOR = new TallDoorItem(DDBlocks.TALL_END_LOTUS_DOOR, PROPERTIES.tab(conditionalTabProperties("betterend", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_HELIX_TREE_DOOR = new TallDoorItem(DDBlocks.TALL_HELIX_TREE_DOOR, PROPERTIES.tab(conditionalTabProperties("betterend", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_JELLYSHROOM_DOOR = new TallDoorItem(DDBlocks.TALL_JELLYSHROOM_DOOR, PROPERTIES.tab(conditionalTabProperties("betterend", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_LACUGROVE_DOOR = new TallDoorItem(DDBlocks.TALL_LACUGROVE_DOOR, PROPERTIES.tab(conditionalTabProperties("betterend", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_LUCERNIA_DOOR = new TallDoorItem(DDBlocks.TALL_LUCERNIA_DOOR, PROPERTIES.tab(conditionalTabProperties("betterend", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_MOSSY_GLOWSHROOM_DOOR = new TallDoorItem(DDBlocks.TALL_MOSSY_GLOWSHROOM_DOOR, PROPERTIES.tab(conditionalTabProperties("betterend", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_PYTHADENDRON_DOOR = new TallDoorItem(DDBlocks.TALL_PYTHADENDRON_DOOR, PROPERTIES.tab(conditionalTabProperties("betterend", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_TENANEA_DOOR = new TallDoorItem(DDBlocks.TALL_TENANEA_DOOR, PROPERTIES.tab(conditionalTabProperties("betterend", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_UMBRELLA_TREE_DOOR = new TallDoorItem(DDBlocks.TALL_UMBRELLA_TREE_DOOR, PROPERTIES.tab(conditionalTabProperties("betterend", DramaticDoors.DD_MAIN_TAB)));
    
    // Better Nether
    public static final Item SHORT_ANCHOR_TREE_DOOR = new ShortDoorItem(DDBlocks.SHORT_ANCHOR_TREE_DOOR, PROPERTIES.tab(conditionalTabProperties("betternether", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BONE_CIN_DOOR = new ShortDoorItem(DDBlocks.SHORT_BONE_CIN_DOOR, PROPERTIES.tab(conditionalTabProperties("betternether", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BONE_REED_DOOR = new ShortDoorItem(DDBlocks.SHORT_BONE_REED_DOOR, PROPERTIES.tab(conditionalTabProperties("betternether", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_MUSHROOM_FIR_DOOR = new ShortDoorItem(DDBlocks.SHORT_MUSHROOM_FIR_DOOR, PROPERTIES.tab(conditionalTabProperties("betternether", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_NETHER_MUSHROOM_DOOR = new ShortDoorItem(DDBlocks.SHORT_NETHER_MUSHROOM_DOOR, PROPERTIES.tab(conditionalTabProperties("betternether", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_NETHER_REED_DOOR = new ShortDoorItem(DDBlocks.SHORT_NETHER_REED_DOOR, PROPERTIES.tab(conditionalTabProperties("betternether", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_NETHER_SAKURA_DOOR = new ShortDoorItem(DDBlocks.SHORT_NETHER_SAKURA_DOOR, PROPERTIES.tab(conditionalTabProperties("betternether", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_RUBEUS_DOOR = new ShortDoorItem(DDBlocks.SHORT_RUBEUS_DOOR, PROPERTIES.tab(conditionalTabProperties("betternether", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_STALAGNATE_DOOR = new ShortDoorItem(DDBlocks.SHORT_STALAGNATE_DOOR, PROPERTIES.tab(conditionalTabProperties("betternether", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_WART_DOOR = new ShortDoorItem(DDBlocks.SHORT_WART_DOOR, PROPERTIES.tab(conditionalTabProperties("betternether", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BN_WILLOW_DOOR = new ShortDoorItem(DDBlocks.SHORT_BN_WILLOW_DOOR, PROPERTIES.tab(conditionalTabProperties("betternether", DramaticDoors.DD_MAIN_TAB)));

    public static final Item TALL_ANCHOR_TREE_DOOR = new TallDoorItem(DDBlocks.TALL_ANCHOR_TREE_DOOR, PROPERTIES.tab(conditionalTabProperties("betternether", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BONE_CIN_DOOR = new TallDoorItem(DDBlocks.TALL_BONE_CIN_DOOR, PROPERTIES.tab(conditionalTabProperties("betternether", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BONE_REED_DOOR = new TallDoorItem(DDBlocks.TALL_BONE_REED_DOOR, PROPERTIES.tab(conditionalTabProperties("betternether", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_MUSHROOM_FIR_DOOR = new TallDoorItem(DDBlocks.TALL_MUSHROOM_FIR_DOOR, PROPERTIES.tab(conditionalTabProperties("betternether", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_NETHER_MUSHROOM_DOOR = new TallDoorItem(DDBlocks.TALL_NETHER_MUSHROOM_DOOR, PROPERTIES.tab(conditionalTabProperties("betternether", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_NETHER_REED_DOOR = new TallDoorItem(DDBlocks.TALL_NETHER_REED_DOOR, PROPERTIES.tab(conditionalTabProperties("betternether", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_NETHER_SAKURA_DOOR = new TallDoorItem(DDBlocks.TALL_NETHER_SAKURA_DOOR, PROPERTIES.tab(conditionalTabProperties("betternether", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_RUBEUS_DOOR = new TallDoorItem(DDBlocks.TALL_RUBEUS_DOOR, PROPERTIES.tab(conditionalTabProperties("betternether", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_STALAGNATE_DOOR = new TallDoorItem(DDBlocks.TALL_STALAGNATE_DOOR, PROPERTIES.tab(conditionalTabProperties("betternether", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_WART_DOOR = new TallDoorItem(DDBlocks.TALL_WART_DOOR, PROPERTIES.tab(conditionalTabProperties("betternether", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BN_WILLOW_DOOR = new TallDoorItem(DDBlocks.TALL_BN_WILLOW_DOOR, PROPERTIES.tab(conditionalTabProperties("betternether", DramaticDoors.DD_MAIN_TAB)));
    
    // Bewitchment
    public static final Item SHORT_BW_CYPRESS_DOOR = new ShortDoorItem(DDBlocks.SHORT_BW_CYPRESS_DOOR, PROPERTIES.tab(conditionalTabProperties("bewitchment", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_DRAGONS_BLOOD_DOOR = new ShortDoorItem(DDBlocks.SHORT_DRAGONS_BLOOD_DOOR, PROPERTIES.tab(conditionalTabProperties("bewitchment", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_ELDER_DOOR = new ShortDoorItem(DDBlocks.SHORT_ELDER_DOOR, PROPERTIES.tab(conditionalTabProperties("bewitchment", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_JUNIPER_DOOR = new ShortDoorItem(DDBlocks.SHORT_JUNIPER_DOOR, PROPERTIES.tab(conditionalTabProperties("bewitchment", DramaticDoors.DD_MAIN_TAB)));

    public static final Item TALL_BW_CYPRESS_DOOR = new TallDoorItem(DDBlocks.TALL_BW_CYPRESS_DOOR, PROPERTIES.tab(conditionalTabProperties("bewitchment", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_DRAGONS_BLOOD_DOOR = new TallDoorItem(DDBlocks.TALL_DRAGONS_BLOOD_DOOR, PROPERTIES.tab(conditionalTabProperties("bewitchment", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_ELDER_DOOR = new TallDoorItem(DDBlocks.TALL_ELDER_DOOR, PROPERTIES.tab(conditionalTabProperties("bewitchment", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_JUNIPER_DOOR = new TallDoorItem(DDBlocks.TALL_JUNIPER_DOOR, PROPERTIES.tab(conditionalTabProperties("bewitchment", DramaticDoors.DD_MAIN_TAB)));
    
    // Bewitchment Plus
    public static final Item SHORT_YEW_DOOR = new ShortDoorItem(DDBlocks.SHORT_YEW_DOOR, PROPERTIES.tab(conditionalTabProperties("bwplus", DramaticDoors.DD_MAIN_TAB)));

    public static final Item TALL_YEW_DOOR = new TallDoorItem(DDBlocks.TALL_YEW_DOOR, PROPERTIES.tab(conditionalTabProperties("bwplus", DramaticDoors.DD_MAIN_TAB)));
    
    // Biomancy
    public static final Item SHORT_FLESH_DOOR = new ShortDoorItem(DDBlocks.SHORT_FLESH_DOOR, PROPERTIES.tab(conditionalTabProperties("biomancy", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_FULL_FLESH_DOOR = new ShortDoorItem(DDBlocks.SHORT_FULL_FLESH_DOOR, PROPERTIES.tab(conditionalTabProperties("biomancy", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_FLESHKIN_DOOR = new ShortDoorItem(DDBlocks.SHORT_FLESHKIN_DOOR, PROPERTIES.tab(conditionalTabProperties("biomancy", DramaticDoors.DD_MAIN_TAB)));

    public static final Item TALL_FLESH_DOOR = new TallDoorItem(DDBlocks.TALL_FLESH_DOOR, PROPERTIES.tab(conditionalTabProperties("biomancy", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_FULL_FLESH_DOOR = new TallDoorItem(DDBlocks.TALL_FULL_FLESH_DOOR, PROPERTIES.tab(conditionalTabProperties("biomancy", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_FLESHKIN_DOOR = new TallDoorItem(DDBlocks.TALL_FLESHKIN_DOOR, PROPERTIES.tab(conditionalTabProperties("biomancy", DramaticDoors.DD_MAIN_TAB)));
    
    // Biome Makeover
    public static final Item SHORT_BM_ANCIENT_OAK_DOOR = new ShortDoorItem(DDBlocks.SHORT_BM_ANCIENT_OAK_DOOR, PROPERTIES.tab(conditionalTabProperties("biomemakeover", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BM_BLIGHTED_BALSA_DOOR = new ShortDoorItem(DDBlocks.SHORT_BM_BLIGHTED_BALSA_DOOR, PROPERTIES.tab(conditionalTabProperties("biomemakeover", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BM_SWAMP_CYPRESS_DOOR = new ShortDoorItem(DDBlocks.SHORT_BM_SWAMP_CYPRESS_DOOR, PROPERTIES.tab(conditionalTabProperties("biomemakeover", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BM_WILLOW_DOOR = new ShortDoorItem(DDBlocks.SHORT_BM_WILLOW_DOOR, PROPERTIES.tab(conditionalTabProperties("biomemakeover", DramaticDoors.DD_MAIN_TAB)));

    public static final Item TALL_BM_ANCIENT_OAK_DOOR = new TallDoorItem(DDBlocks.TALL_BM_ANCIENT_OAK_DOOR, PROPERTIES.tab(conditionalTabProperties("biomemakeover", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BM_BLIGHTED_BALSA_DOOR = new TallDoorItem(DDBlocks.TALL_BM_BLIGHTED_BALSA_DOOR, PROPERTIES.tab(conditionalTabProperties("biomemakeover", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BM_SWAMP_CYPRESS_DOOR = new TallDoorItem(DDBlocks.TALL_BM_SWAMP_CYPRESS_DOOR, PROPERTIES.tab(conditionalTabProperties("biomemakeover", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BM_WILLOW_DOOR = new TallDoorItem(DDBlocks.TALL_BM_WILLOW_DOOR, PROPERTIES.tab(conditionalTabProperties("biomemakeover", DramaticDoors.DD_MAIN_TAB)));

    // Blockus
    public static final Item SHORT_BLOCKUS_BAMBOO_DOOR = new ShortDoorItem(DDBlocks.SHORT_BLOCKUS_BAMBOO_DOOR, PROPERTIES.tab(conditionalTabProperties("blockus", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BLOCKUS_CHARRED_DOOR = new ShortDoorItem(DDBlocks.SHORT_BLOCKUS_CHARRED_DOOR, PROPERTIES.tab(conditionalTabProperties("blockus", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BLOCKUS_PAPER_DOOR = new ShortDoorItem(DDBlocks.SHORT_BLOCKUS_PAPER_DOOR, PROPERTIES.tab(conditionalTabProperties("blockus", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BLOCKUS_WHITE_OAK_DOOR = new ShortDoorItem(DDBlocks.SHORT_BLOCKUS_WHITE_OAK_DOOR, PROPERTIES.tab(conditionalTabProperties("blockus", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BLOCKUS_STONE_DOOR = new ShortDoorItem(DDBlocks.SHORT_BLOCKUS_STONE_DOOR, PROPERTIES.tab(conditionalTabProperties("blockus", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BLOCKUS_BLACKSTONE_DOOR = new ShortDoorItem(DDBlocks.SHORT_BLOCKUS_BLACKSTONE_DOOR, PROPERTIES.tab(conditionalTabProperties("blockus", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BLOCKUS_OBSIDIAN_REINFORCED_DOOR = new ShortDoorItem(DDBlocks.SHORT_BLOCKUS_OBSIDIAN_REINFORCED_DOOR, PROPERTIES.tab(conditionalTabProperties("blockus", DramaticDoors.DD_MAIN_TAB)));

    public static final Item TALL_BLOCKUS_BAMBOO_DOOR = new TallDoorItem(DDBlocks.TALL_BLOCKUS_BAMBOO_DOOR, PROPERTIES.tab(conditionalTabProperties("blockus", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BLOCKUS_CHARRED_DOOR = new TallDoorItem(DDBlocks.TALL_BLOCKUS_CHARRED_DOOR, PROPERTIES.tab(conditionalTabProperties("blockus", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BLOCKUS_PAPER_DOOR = new TallDoorItem(DDBlocks.TALL_BLOCKUS_PAPER_DOOR, PROPERTIES.tab(conditionalTabProperties("blockus", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BLOCKUS_WHITE_OAK_DOOR = new TallDoorItem(DDBlocks.TALL_BLOCKUS_WHITE_OAK_DOOR, PROPERTIES.tab(conditionalTabProperties("blockus", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BLOCKUS_STONE_DOOR = new TallDoorItem(DDBlocks.TALL_BLOCKUS_STONE_DOOR, PROPERTIES.tab(conditionalTabProperties("blockus", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BLOCKUS_BLACKSTONE_DOOR = new TallDoorItem(DDBlocks.TALL_BLOCKUS_BLACKSTONE_DOOR, PROPERTIES.tab(conditionalTabProperties("blockus", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BLOCKUS_OBSIDIAN_REINFORCED_DOOR = new TallDoorItem(DDBlocks.TALL_BLOCKUS_OBSIDIAN_REINFORCED_DOOR, PROPERTIES.tab(conditionalTabProperties("blockus", DramaticDoors.DD_MAIN_TAB)));

    // The Ceilands
    public static final Item SHORT_CEILTRUNK_DOOR = new ShortDoorItem(DDBlocks.SHORT_CEILTRUNK_DOOR, PROPERTIES.tab(conditionalTabProperties("ceilands", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_LUZAWOOD_DOOR = new ShortDoorItem(DDBlocks.SHORT_LUZAWOOD_DOOR, PROPERTIES.tab(conditionalTabProperties("ceilands", DramaticDoors.DD_MAIN_TAB)));

    public static final Item TALL_CEILTRUNK_DOOR = new TallDoorItem(DDBlocks.TALL_CEILTRUNK_DOOR, PROPERTIES.tab(conditionalTabProperties("ceilands", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_LUZAWOOD_DOOR = new TallDoorItem(DDBlocks.TALL_LUZAWOOD_DOOR, PROPERTIES.tab(conditionalTabProperties("ceilands", DramaticDoors.DD_MAIN_TAB)));
    
    // Charm
    public static final Item SHORT_CHARM_AZALEA_DOOR = new ShortDoorItem(DDBlocks.SHORT_CHARM_AZALEA_DOOR, PROPERTIES.tab(conditionalTabProperties("charm", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_CHARM_EBONY_DOOR = new ShortDoorItem(DDBlocks.SHORT_CHARM_EBONY_DOOR, PROPERTIES.tab(conditionalTabProperties("charm", DramaticDoors.DD_MAIN_TAB)));

    public static final Item TALL_CHARM_AZALEA_DOOR = new TallDoorItem(DDBlocks.TALL_CHARM_AZALEA_DOOR, PROPERTIES.tab(conditionalTabProperties("charm", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_CHARM_EBONY_DOOR = new TallDoorItem(DDBlocks.TALL_CHARM_EBONY_DOOR, PROPERTIES.tab(conditionalTabProperties("charm", DramaticDoors.DD_MAIN_TAB)));
    
    // Cinderscapes
    public static final Item SHORT_SCORCHED_DOOR = new ShortDoorItem(DDBlocks.SHORT_SCORCHED_DOOR, PROPERTIES.tab(conditionalTabProperties("cinderscapes", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_UMBRAL_DOOR = new ShortDoorItem(DDBlocks.SHORT_UMBRAL_DOOR, PROPERTIES.tab(conditionalTabProperties("cinderscapes", DramaticDoors.DD_MAIN_TAB)));    

    public static final Item TALL_SCORCHED_DOOR = new TallDoorItem(DDBlocks.TALL_SCORCHED_DOOR, PROPERTIES.tab(conditionalTabProperties("cinderscapes", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_UMBRAL_DOOR = new TallDoorItem(DDBlocks.TALL_UMBRAL_DOOR, PROPERTIES.tab(conditionalTabProperties("cinderscapes", DramaticDoors.DD_MAIN_TAB)));    
    
    // Cobblemon
    public static final Item SHORT_APRICORN_DOOR = new ShortDoorItem(DDBlocks.SHORT_APRICORN_DOOR, PROPERTIES.tab(conditionalTabProperties("cobblemon", DramaticDoors.DD_MAIN_TAB)));

    public static final Item TALL_APRICORN_DOOR = new TallDoorItem(DDBlocks.TALL_APRICORN_DOOR, PROPERTIES.tab(conditionalTabProperties("cobblemon", DramaticDoors.DD_MAIN_TAB)));
    
    // Colourful Azaleas
    public static final Item SHORT_AZULE_AZALEA_DOOR = new ShortDoorItem(DDBlocks.SHORT_AZULE_AZALEA_DOOR, PROPERTIES.tab(conditionalTabProperties("colorfulazaleas", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BRIGHT_AZALEA_DOOR = new ShortDoorItem(DDBlocks.SHORT_BRIGHT_AZALEA_DOOR, PROPERTIES.tab(conditionalTabProperties("colorfulazaleas", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_FISS_AZALEA_DOOR = new ShortDoorItem(DDBlocks.SHORT_FISS_AZALEA_DOOR, PROPERTIES.tab(conditionalTabProperties("colorfulazaleas", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_ROZE_AZALEA_DOOR = new ShortDoorItem(DDBlocks.SHORT_ROZE_AZALEA_DOOR, PROPERTIES.tab(conditionalTabProperties("colorfulazaleas", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_TECAL_AZALEA_DOOR = new ShortDoorItem(DDBlocks.SHORT_TECAL_AZALEA_DOOR, PROPERTIES.tab(conditionalTabProperties("colorfulazaleas", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_TITANIUM_AZALEA_DOOR = new ShortDoorItem(DDBlocks.SHORT_TITANIUM_AZALEA_DOOR, PROPERTIES.tab(conditionalTabProperties("colorfulazaleas", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_WALNUT_AZALEA_DOOR = new ShortDoorItem(DDBlocks.SHORT_WALNUT_AZALEA_DOOR, PROPERTIES.tab(conditionalTabProperties("colorfulazaleas", DramaticDoors.DD_MAIN_TAB)));

    public static final Item TALL_AZULE_AZALEA_DOOR = new TallDoorItem(DDBlocks.TALL_AZULE_AZALEA_DOOR, PROPERTIES.tab(conditionalTabProperties("colorfulazaleas", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BRIGHT_AZALEA_DOOR = new TallDoorItem(DDBlocks.TALL_BRIGHT_AZALEA_DOOR, PROPERTIES.tab(conditionalTabProperties("colorfulazaleas", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_FISS_AZALEA_DOOR = new TallDoorItem(DDBlocks.TALL_FISS_AZALEA_DOOR, PROPERTIES.tab(conditionalTabProperties("colorfulazaleas", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_ROZE_AZALEA_DOOR = new TallDoorItem(DDBlocks.TALL_ROZE_AZALEA_DOOR, PROPERTIES.tab(conditionalTabProperties("colorfulazaleas", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_TECAL_AZALEA_DOOR = new TallDoorItem(DDBlocks.TALL_TECAL_AZALEA_DOOR, PROPERTIES.tab(conditionalTabProperties("colorfulazaleas", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_TITANIUM_AZALEA_DOOR = new TallDoorItem(DDBlocks.TALL_TITANIUM_AZALEA_DOOR, PROPERTIES.tab(conditionalTabProperties("colorfulazaleas", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_WALNUT_AZALEA_DOOR = new TallDoorItem(DDBlocks.TALL_WALNUT_AZALEA_DOOR, PROPERTIES.tab(conditionalTabProperties("colorfulazaleas", DramaticDoors.DD_MAIN_TAB)));
    
    // Create: Deco
    public static final Item SHORT_ANDESITE_DOOR = new ShortDoorItem(DDBlocks.SHORT_ANDESITE_DOOR, PROPERTIES.tab(conditionalTabProperties("createdeco", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BRASS_DOOR = new ShortDoorItem(DDBlocks.SHORT_BRASS_DOOR, PROPERTIES.tab(conditionalTabProperties("createdeco", DramaticDoors.DD_MAIN_TAB)));    
    public static final Item SHORT_COPPER_DOOR = new ShortDoorItem(DDBlocks.SHORT_COPPER_DOOR, PROPERTIES.tab(conditionalTabProperties("createdeco", DramaticDoors.DD_MAIN_TAB)));    
    public static final Item SHORT_ZINC_DOOR = new ShortDoorItem(DDBlocks.SHORT_ZINC_DOOR, PROPERTIES.tab(conditionalTabProperties("createdeco", DramaticDoors.DD_MAIN_TAB)));    
    public static final Item SHORT_LOCKED_ANDESITE_DOOR = new ShortDoorItem(DDBlocks.SHORT_LOCKED_ANDESITE_DOOR, PROPERTIES.tab(conditionalTabProperties("createdeco", DramaticDoors.DD_MAIN_TAB)));    
    public static final Item SHORT_LOCKED_BRASS_DOOR = new ShortDoorItem(DDBlocks.SHORT_LOCKED_BRASS_DOOR, PROPERTIES.tab(conditionalTabProperties("createdeco", DramaticDoors.DD_MAIN_TAB)));    
    public static final Item SHORT_LOCKED_COPPER_DOOR = new ShortDoorItem(DDBlocks.SHORT_LOCKED_COPPER_DOOR, PROPERTIES.tab(conditionalTabProperties("createdeco", DramaticDoors.DD_MAIN_TAB)));    
    public static final Item SHORT_LOCKED_ZINC_DOOR = new ShortDoorItem(DDBlocks.SHORT_LOCKED_ZINC_DOOR, PROPERTIES.tab(conditionalTabProperties("createdeco", DramaticDoors.DD_MAIN_TAB)));    

    public static final Item TALL_ANDESITE_DOOR = new TallDoorItem(DDBlocks.TALL_ANDESITE_DOOR, PROPERTIES.tab(conditionalTabProperties("createdeco", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BRASS_DOOR = new TallDoorItem(DDBlocks.TALL_BRASS_DOOR, PROPERTIES.tab(conditionalTabProperties("createdeco", DramaticDoors.DD_MAIN_TAB)));    
    public static final Item TALL_COPPER_DOOR = new TallDoorItem(DDBlocks.TALL_COPPER_DOOR, PROPERTIES.tab(conditionalTabProperties("createdeco", DramaticDoors.DD_MAIN_TAB)));    
    public static final Item TALL_ZINC_DOOR = new TallDoorItem(DDBlocks.TALL_ZINC_DOOR, PROPERTIES.tab(conditionalTabProperties("createdeco", DramaticDoors.DD_MAIN_TAB)));    
    public static final Item TALL_LOCKED_ANDESITE_DOOR = new TallDoorItem(DDBlocks.TALL_LOCKED_ANDESITE_DOOR, PROPERTIES.tab(conditionalTabProperties("createdeco", DramaticDoors.DD_MAIN_TAB)));    
    public static final Item TALL_LOCKED_BRASS_DOOR = new TallDoorItem(DDBlocks.TALL_LOCKED_BRASS_DOOR, PROPERTIES.tab(conditionalTabProperties("createdeco", DramaticDoors.DD_MAIN_TAB)));    
    public static final Item TALL_LOCKED_COPPER_DOOR = new TallDoorItem(DDBlocks.TALL_LOCKED_COPPER_DOOR, PROPERTIES.tab(conditionalTabProperties("createdeco", DramaticDoors.DD_MAIN_TAB)));    
    public static final Item TALL_LOCKED_ZINC_DOOR = new TallDoorItem(DDBlocks.TALL_LOCKED_ZINC_DOOR, PROPERTIES.tab(conditionalTabProperties("createdeco", DramaticDoors.DD_MAIN_TAB)));    
    
    // Deeper Darker
    public static final Item SHORT_ECHO_DOOR = new ShortDoorItem(DDBlocks.SHORT_ECHO_DOOR, PROPERTIES.tab(conditionalTabProperties("deeperdarker", DramaticDoors.DD_MAIN_TAB)));

    public static final Item TALL_ECHO_DOOR = new TallDoorItem(DDBlocks.TALL_ECHO_DOOR, PROPERTIES.tab(conditionalTabProperties("deeperdarker", DramaticDoors.DD_MAIN_TAB)));
    
    // Ecologics
    public static final Item SHORT_ECO_AZALEA_DOOR = new ShortDoorItem(DDBlocks.SHORT_ECO_AZALEA_DOOR, PROPERTIES.tab(conditionalTabProperties("ecologics", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_ECO_FLOWERING_AZALEA_DOOR = new ShortDoorItem(DDBlocks.SHORT_ECO_FLOWERING_AZALEA_DOOR, PROPERTIES.tab(conditionalTabProperties("ecologics", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_ECO_COCONUT_DOOR = new ShortDoorItem(DDBlocks.SHORT_ECO_COCONUT_DOOR, PROPERTIES.tab(conditionalTabProperties("ecologics", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_ECO_WALNUT_DOOR = new ShortDoorItem(DDBlocks.SHORT_ECO_WALNUT_DOOR, PROPERTIES.tab(conditionalTabProperties("ecologics", DramaticDoors.DD_MAIN_TAB)));

    public static final Item TALL_ECO_AZALEA_DOOR = new TallDoorItem(DDBlocks.TALL_ECO_AZALEA_DOOR, PROPERTIES.tab(conditionalTabProperties("ecologics", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_ECO_FLOWERING_AZALEA_DOOR = new TallDoorItem(DDBlocks.TALL_ECO_FLOWERING_AZALEA_DOOR, PROPERTIES.tab(conditionalTabProperties("ecologics", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_ECO_COCONUT_DOOR = new TallDoorItem(DDBlocks.TALL_ECO_COCONUT_DOOR, PROPERTIES.tab(conditionalTabProperties("ecologics", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_ECO_WALNUT_DOOR = new TallDoorItem(DDBlocks.TALL_ECO_WALNUT_DOOR, PROPERTIES.tab(conditionalTabProperties("ecologics", DramaticDoors.DD_MAIN_TAB)));
    
    // Glass Doors
    public static final Item SHORT_IRON_GLASS_DOOR = new ShortDoorItem(DDBlocks.SHORT_IRON_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("glassdoor", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_OAK_GLASS_DOOR = new ShortDoorItem(DDBlocks.SHORT_OAK_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("glassdoor", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_SPRUCE_GLASS_DOOR = new ShortDoorItem(DDBlocks.SHORT_SPRUCE_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("glassdoor", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BIRCH_GLASS_DOOR = new ShortDoorItem(DDBlocks.SHORT_BIRCH_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("glassdoor", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_JUNGLE_GLASS_DOOR = new ShortDoorItem(DDBlocks.SHORT_JUNGLE_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("glassdoor", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_ACACIA_GLASS_DOOR = new ShortDoorItem(DDBlocks.SHORT_ACACIA_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("glassdoor", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_DARK_OAK_GLASS_DOOR = new ShortDoorItem(DDBlocks.SHORT_DARK_OAK_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("glassdoor", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_MANGROVE_GLASS_DOOR = new ShortDoorItem(DDBlocks.SHORT_MANGROVE_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("glassdoor", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_CRIMSON_GLASS_DOOR = new ShortDoorItem(DDBlocks.SHORT_CRIMSON_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("glassdoor", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_WARPED_GLASS_DOOR = new ShortDoorItem(DDBlocks.SHORT_WARPED_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("glassdoor", DramaticDoors.DD_MAIN_TAB)));

    public static final Item TALL_IRON_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_IRON_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("glassdoor", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_OAK_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_OAK_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("glassdoor", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_SPRUCE_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_SPRUCE_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("glassdoor", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BIRCH_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_BIRCH_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("glassdoor", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_JUNGLE_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_JUNGLE_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("glassdoor", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_ACACIA_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_ACACIA_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("glassdoor", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_DARK_OAK_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_DARK_OAK_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("glassdoor", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_MANGROVE_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MANGROVE_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("glassdoor", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_CRIMSON_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_CRIMSON_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("glassdoor", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_WARPED_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_WARPED_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("glassdoor", DramaticDoors.DD_MAIN_TAB)));

    // Gardens of the Dead
    public static final Item SHORT_SOULBLIGHT_DOOR = new ShortDoorItem(DDBlocks.SHORT_SOULBLIGHT_DOOR, PROPERTIES.tab(conditionalTabProperties("gardens_of_the_dead", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_WHISTLECANE_DOOR = new ShortDoorItem(DDBlocks.SHORT_WHISTLECANE_DOOR, PROPERTIES.tab(conditionalTabProperties("gardens_of_the_dead", DramaticDoors.DD_MAIN_TAB)));

    public static final Item TALL_SOULBLIGHT_DOOR = new TallDoorItem(DDBlocks.TALL_SOULBLIGHT_DOOR, PROPERTIES.tab(conditionalTabProperties("gardens_of_the_dead", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_WHISTLECANE_DOOR = new TallDoorItem(DDBlocks.TALL_WHISTLECANE_DOOR, PROPERTIES.tab(conditionalTabProperties("gardens_of_the_dead", DramaticDoors.DD_MAIN_TAB)));    
    
    // Good Ending
    public static final Item SHORT_GE_CYPRESS_DOOR = new ShortDoorItem(DDBlocks.SHORT_GE_CYPRESS_DOOR, PROPERTIES.tab(conditionalTabProperties("goodending", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_GE_MUDDY_OAK_DOOR = new ShortDoorItem(DDBlocks.SHORT_GE_MUDDY_OAK_DOOR, PROPERTIES.tab(conditionalTabProperties("goodending", DramaticDoors.DD_MAIN_TAB)));

    public static final Item TALL_GE_CYPRESS_DOOR = new TallDoorItem(DDBlocks.TALL_GE_CYPRESS_DOOR, PROPERTIES.tab(conditionalTabProperties("goodending", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_GE_MUDDY_OAK_DOOR = new TallDoorItem(DDBlocks.TALL_GE_MUDDY_OAK_DOOR, PROPERTIES.tab(conditionalTabProperties("goodending", DramaticDoors.DD_MAIN_TAB)));
    
    // Graveyard
    public static final Item SHORT_DARK_IRON_DOOR = new ShortDoorItem(DDBlocks.SHORT_DARK_IRON_DOOR, PROPERTIES.tab(conditionalTabProperties("graveyard", DramaticDoors.DD_MAIN_TAB)));

    public static final Item TALL_DARK_IRON_DOOR = new TallDoorItem(DDBlocks.TALL_DARK_IRON_DOOR, PROPERTIES.tab(conditionalTabProperties("graveyard", DramaticDoors.DD_MAIN_TAB)));
    
    // Hephaestus (Tinkers Construct)
    public static final Item SHORT_BLOODSHROOM_DOOR = new ShortDoorItem(DDBlocks.SHORT_BLOODSHROOM_DOOR, PROPERTIES.tab(conditionalTabProperties("tconstruct", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_GREENHEART_DOOR = new ShortDoorItem(DDBlocks.SHORT_GREENHEART_DOOR, PROPERTIES.tab(conditionalTabProperties("tconstruct", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_SKYROOT_DOOR = new ShortDoorItem(DDBlocks.SHORT_SKYROOT_DOOR, PROPERTIES.tab(conditionalTabProperties("tconstruct", DramaticDoors.DD_MAIN_TAB)));    

    public static final Item TALL_BLOODSHROOM_DOOR = new TallDoorItem(DDBlocks.TALL_BLOODSHROOM_DOOR, PROPERTIES.tab(conditionalTabProperties("tconstruct", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_GREENHEART_DOOR = new TallDoorItem(DDBlocks.TALL_GREENHEART_DOOR, PROPERTIES.tab(conditionalTabProperties("tconstruct", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_SKYROOT_DOOR = new TallDoorItem(DDBlocks.TALL_SKYROOT_DOOR, PROPERTIES.tab(conditionalTabProperties("tconstruct", DramaticDoors.DD_MAIN_TAB)));    

    // Hexcasting
    public static final Item SHORT_EDIFIED_DOOR = new ShortDoorItem(DDBlocks.SHORT_EDIFIED_DOOR, PROPERTIES.tab(conditionalTabProperties("hexcasting", DramaticDoors.DD_MAIN_TAB)));    

    public static final Item TALL_EDIFIED_DOOR = new TallDoorItem(DDBlocks.TALL_EDIFIED_DOOR, PROPERTIES.tab(conditionalTabProperties("hexcasting", DramaticDoors.DD_MAIN_TAB)));    
    
    // Oh the Biomes You'll Go
    public static final Item SHORT_BYG_ASPEN_DOOR = new ShortDoorItem(DDBlocks.SHORT_BYG_ASPEN_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BYG_BAOBAB_DOOR = new ShortDoorItem(DDBlocks.SHORT_BYG_BAOBAB_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BYG_BLUE_ENCHANTED_DOOR = new ShortDoorItem(DDBlocks.SHORT_BYG_BLUE_ENCHANTED_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BYG_BULBIS_DOOR = new ShortDoorItem(DDBlocks.SHORT_BYG_BULBIS_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BYG_CHERRY_DOOR = new ShortDoorItem(DDBlocks.SHORT_BYG_CHERRY_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BYG_CIKA_DOOR = new ShortDoorItem(DDBlocks.SHORT_BYG_CIKA_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BYG_CYPRESS_DOOR = new ShortDoorItem(DDBlocks.SHORT_BYG_CYPRESS_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BYG_EBONY_DOOR = new ShortDoorItem(DDBlocks.SHORT_BYG_EBONY_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BYG_EMBUR_DOOR = new ShortDoorItem(DDBlocks.SHORT_BYG_EMBUR_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BYG_ETHER_DOOR = new ShortDoorItem(DDBlocks.SHORT_BYG_ETHER_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BYG_FIR_DOOR = new ShortDoorItem(DDBlocks.SHORT_BYG_FIR_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BYG_FLORUS_DOOR = new ShortDoorItem(DDBlocks.SHORT_BYG_FLORUS_DOOR, PROPERTIES.tab(/*conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)*/null));
    public static final Item SHORT_BYG_GREEN_ENCHANTED_DOOR = new ShortDoorItem(DDBlocks.SHORT_BYG_GREEN_ENCHANTED_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BYG_HOLLY_DOOR = new ShortDoorItem(DDBlocks.SHORT_BYG_HOLLY_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BYG_IMPARIUS_DOOR = new ShortDoorItem(DDBlocks.SHORT_BYG_IMPARIUS_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BYG_IRONWOOD_DOOR = new ShortDoorItem(DDBlocks.SHORT_BYG_IRONWOOD_DOOR, PROPERTIES.tab(/*conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)*/null));
    public static final Item SHORT_BYG_JACARANDA_DOOR = new ShortDoorItem(DDBlocks.SHORT_BYG_JACARANDA_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BYG_LAMENT_DOOR = new ShortDoorItem(DDBlocks.SHORT_BYG_LAMENT_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BYG_MAHOGANY_DOOR = new ShortDoorItem(DDBlocks.SHORT_BYG_MAHOGANY_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BYG_MAPLE_DOOR = new ShortDoorItem(DDBlocks.SHORT_BYG_MAPLE_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BYG_NIGHTSHADE_DOOR = new ShortDoorItem(DDBlocks.SHORT_BYG_NIGHTSHADE_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BYG_PALM_DOOR = new ShortDoorItem(DDBlocks.SHORT_BYG_PALM_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BYG_PINE_DOOR = new ShortDoorItem(DDBlocks.SHORT_BYG_PINE_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BYG_RAINBOW_EUCALYPTUS_DOOR = new ShortDoorItem(DDBlocks.SHORT_BYG_RAINBOW_EUCALYPTUS_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BYG_REDWOOD_DOOR = new ShortDoorItem(DDBlocks.SHORT_BYG_REDWOOD_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BYG_SKYRIS_DOOR = new ShortDoorItem(DDBlocks.SHORT_BYG_SKYRIS_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BYG_SOUL_SHROOM_DOOR = new ShortDoorItem(DDBlocks.SHORT_BYG_SOUL_SHROOM_DOOR, PROPERTIES.tab(/*conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)*/null));
    public static final Item SHORT_BYG_SYTHIAN_DOOR = new ShortDoorItem(DDBlocks.SHORT_BYG_SYTHIAN_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BYG_WHITE_MANGROVE_DOOR = new ShortDoorItem(DDBlocks.SHORT_BYG_WHITE_MANGROVE_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BYG_WILLOW_DOOR = new ShortDoorItem(DDBlocks.SHORT_BYG_WILLOW_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BYG_WITCH_HAZEL_DOOR = new ShortDoorItem(DDBlocks.SHORT_BYG_WITCH_HAZEL_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_BYG_ZELKOVA_DOOR = new ShortDoorItem(DDBlocks.SHORT_BYG_ZELKOVA_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));

    public static final Item TALL_BYG_ASPEN_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_ASPEN_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_BAOBAB_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_BAOBAB_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_BLUE_ENCHANTED_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_BLUE_ENCHANTED_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_BULBIS_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_BULBIS_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_CHERRY_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_CHERRY_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_CIKA_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_CIKA_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_CYPRESS_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_CYPRESS_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_EBONY_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_EBONY_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_EMBUR_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_EMBUR_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_ETHER_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_ETHER_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_FIR_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_FIR_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_FLORUS_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_FLORUS_DOOR, PROPERTIES.tab(/*conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)*/null));
    public static final Item TALL_BYG_GREEN_ENCHANTED_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_GREEN_ENCHANTED_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_HOLLY_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_HOLLY_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_IMPARIUS_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_IMPARIUS_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_IRONWOOD_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_IRONWOOD_DOOR, PROPERTIES.tab(/*conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)*/null));
    public static final Item TALL_BYG_JACARANDA_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_JACARANDA_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_LAMENT_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_LAMENT_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_MAHOGANY_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_MAHOGANY_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_MAPLE_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_MAPLE_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_NIGHTSHADE_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_NIGHTSHADE_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_PALM_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_PALM_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_PINE_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_PINE_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_RAINBOW_EUCALYPTUS_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_RAINBOW_EUCALYPTUS_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_REDWOOD_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_REDWOOD_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_SKYRIS_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_SKYRIS_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_SOUL_SHROOM_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_SOUL_SHROOM_DOOR, PROPERTIES.tab(/*conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)*/null));
    public static final Item TALL_BYG_SYTHIAN_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_SYTHIAN_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_WHITE_MANGROVE_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_WHITE_MANGROVE_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_WILLOW_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_WILLOW_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_WITCH_HAZEL_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_WITCH_HAZEL_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_BYG_ZELKOVA_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_ZELKOVA_DOOR, PROPERTIES.tab(conditionalTabProperties("byg", DramaticDoors.DD_MAIN_TAB)));
    
    // Promenade
    public static final Item SHORT_PROMENADE_CHERRY_OAK_DOOR = new ShortDoorItem(DDBlocks.SHORT_PROMENADE_CHERRY_OAK_DOOR, PROPERTIES.tab(conditionalTabProperties("promenade", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_PROMENADE_DARK_AMARANTH_DOOR = new ShortDoorItem(DDBlocks.SHORT_PROMENADE_DARK_AMARANTH_DOOR, PROPERTIES.tab(conditionalTabProperties("promenade", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_PROMENADE_PALM_DOOR = new ShortDoorItem(DDBlocks.SHORT_PROMENADE_PALM_DOOR, PROPERTIES.tab(conditionalTabProperties("promenade", DramaticDoors.DD_MAIN_TAB)));    

    public static final Item TALL_PROMENADE_CHERRY_OAK_DOOR = new TallDoorItem(DDBlocks.TALL_PROMENADE_CHERRY_OAK_DOOR, PROPERTIES.tab(conditionalTabProperties("promenade", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_PROMENADE_DARK_AMARANTH_DOOR = new TallDoorItem(DDBlocks.TALL_PROMENADE_DARK_AMARANTH_DOOR, PROPERTIES.tab(conditionalTabProperties("promenade", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_PROMENADE_PALM_DOOR = new TallDoorItem(DDBlocks.TALL_PROMENADE_PALM_DOOR, PROPERTIES.tab(conditionalTabProperties("promenade", DramaticDoors.DD_MAIN_TAB)));    
    
    // Regions Unexplored
    public static final Item SHORT_RUE_BAOBAB_DOOR = new ShortDoorItem(DDBlocks.SHORT_RUE_BAOBAB_DOOR, PROPERTIES.tab(conditionalTabProperties("regions_unexplored", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_RUE_BLACKWOOD_DOOR = new ShortDoorItem(DDBlocks.SHORT_RUE_BLACKWOOD_DOOR, PROPERTIES.tab(conditionalTabProperties("regions_unexplored", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_RUE_BRIMWOOD_DOOR = new ShortDoorItem(DDBlocks.SHORT_RUE_BRIMWOOD_DOOR, PROPERTIES.tab(conditionalTabProperties("regions_unexplored", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_RUE_CHERRY_DOOR = new ShortDoorItem(DDBlocks.SHORT_RUE_CHERRY_DOOR, PROPERTIES.tab(conditionalTabProperties("regions_unexplored", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_RUE_CYPRESS_DOOR = new ShortDoorItem(DDBlocks.SHORT_RUE_CYPRESS_DOOR, PROPERTIES.tab(conditionalTabProperties("regions_unexplored", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_RUE_DEAD_DOOR = new ShortDoorItem(DDBlocks.SHORT_RUE_DEAD_DOOR, PROPERTIES.tab(conditionalTabProperties("regions_unexplored", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_RUE_EUCALYPTUS_DOOR = new ShortDoorItem(DDBlocks.SHORT_RUE_EUCALYPTUS_DOOR, PROPERTIES.tab(conditionalTabProperties("regions_unexplored", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_RUE_JOSHUA_DOOR = new ShortDoorItem(DDBlocks.SHORT_RUE_JOSHUA_DOOR, PROPERTIES.tab(conditionalTabProperties("regions_unexplored", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_RUE_LARCH_DOOR = new ShortDoorItem(DDBlocks.SHORT_RUE_LARCH_DOOR, PROPERTIES.tab(conditionalTabProperties("regions_unexplored", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_RUE_MAPLE_DOOR = new ShortDoorItem(DDBlocks.SHORT_RUE_MAPLE_DOOR, PROPERTIES.tab(conditionalTabProperties("regions_unexplored", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_RUE_MAUVE_DOOR = new ShortDoorItem(DDBlocks.SHORT_RUE_MAUVE_DOOR, PROPERTIES.tab(conditionalTabProperties("regions_unexplored", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_RUE_PALM_DOOR = new ShortDoorItem(DDBlocks.SHORT_RUE_PALM_DOOR, PROPERTIES.tab(conditionalTabProperties("regions_unexplored", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_RUE_PINE_DOOR = new ShortDoorItem(DDBlocks.SHORT_RUE_PINE_DOOR, PROPERTIES.tab(conditionalTabProperties("regions_unexplored", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_RUE_REDWOOD_DOOR = new ShortDoorItem(DDBlocks.SHORT_RUE_REDWOOD_DOOR, PROPERTIES.tab(conditionalTabProperties("regions_unexplored", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_RUE_WILLOW_DOOR = new ShortDoorItem(DDBlocks.SHORT_RUE_WILLOW_DOOR, PROPERTIES.tab(conditionalTabProperties("regions_unexplored", DramaticDoors.DD_MAIN_TAB)));

    public static final Item TALL_RUE_BAOBAB_DOOR = new TallDoorItem(DDBlocks.TALL_RUE_BAOBAB_DOOR, PROPERTIES.tab(conditionalTabProperties("regions_unexplored", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_RUE_BLACKWOOD_DOOR = new TallDoorItem(DDBlocks.TALL_RUE_BLACKWOOD_DOOR, PROPERTIES.tab(conditionalTabProperties("regions_unexplored", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_RUE_BRIMWOOD_DOOR = new TallDoorItem(DDBlocks.TALL_RUE_BRIMWOOD_DOOR, PROPERTIES.tab(conditionalTabProperties("regions_unexplored", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_RUE_CHERRY_DOOR = new TallDoorItem(DDBlocks.TALL_RUE_CHERRY_DOOR, PROPERTIES.tab(conditionalTabProperties("regions_unexplored", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_RUE_CYPRESS_DOOR = new TallDoorItem(DDBlocks.TALL_RUE_CYPRESS_DOOR, PROPERTIES.tab(conditionalTabProperties("regions_unexplored", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_RUE_DEAD_DOOR = new TallDoorItem(DDBlocks.TALL_RUE_DEAD_DOOR, PROPERTIES.tab(conditionalTabProperties("regions_unexplored", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_RUE_EUCALYPTUS_DOOR = new TallDoorItem(DDBlocks.TALL_RUE_EUCALYPTUS_DOOR, PROPERTIES.tab(conditionalTabProperties("regions_unexplored", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_RUE_JOSHUA_DOOR = new TallDoorItem(DDBlocks.TALL_RUE_JOSHUA_DOOR, PROPERTIES.tab(conditionalTabProperties("regions_unexplored", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_RUE_LARCH_DOOR = new TallDoorItem(DDBlocks.TALL_RUE_LARCH_DOOR, PROPERTIES.tab(conditionalTabProperties("regions_unexplored", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_RUE_MAPLE_DOOR = new TallDoorItem(DDBlocks.TALL_RUE_MAPLE_DOOR, PROPERTIES.tab(conditionalTabProperties("regions_unexplored", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_RUE_MAUVE_DOOR = new TallDoorItem(DDBlocks.TALL_RUE_MAUVE_DOOR, PROPERTIES.tab(conditionalTabProperties("regions_unexplored", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_RUE_PALM_DOOR = new TallDoorItem(DDBlocks.TALL_RUE_PALM_DOOR, PROPERTIES.tab(conditionalTabProperties("regions_unexplored", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_RUE_PINE_DOOR = new TallDoorItem(DDBlocks.TALL_RUE_PINE_DOOR, PROPERTIES.tab(conditionalTabProperties("regions_unexplored", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_RUE_REDWOOD_DOOR = new TallDoorItem(DDBlocks.TALL_RUE_REDWOOD_DOOR, PROPERTIES.tab(conditionalTabProperties("regions_unexplored", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_RUE_WILLOW_DOOR = new TallDoorItem(DDBlocks.TALL_RUE_WILLOW_DOOR, PROPERTIES.tab(conditionalTabProperties("regions_unexplored", DramaticDoors.DD_MAIN_TAB)));
    
    // Snowy Spirit
    public static final Item SHORT_GINGERBREAD_DOOR = new ShortDoorItem(DDBlocks.SHORT_GINGERBREAD_DOOR, PROPERTIES.tab(conditionalTabProperties("snowyspirit", DramaticDoors.DD_MAIN_TAB)));

    public static final Item TALL_GINGERBREAD_DOOR = new TallDoorItem(DDBlocks.TALL_GINGERBREAD_DOOR, PROPERTIES.tab(conditionalTabProperties("snowyspirit", DramaticDoors.DD_MAIN_TAB)));
    
    // Supplementaries
    public static final Item SHORT_GOLD_DOOR = new ShortDoorItem(DDBlocks.SHORT_GOLD_DOOR, PROPERTIES.tab(conditionalTabProperties("supplementaries", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_NETHERITE_DOOR = new ShortDoorItem(DDBlocks.SHORT_NETHERITE_DOOR, PROPERTIES.tab(conditionalTabProperties("supplementaries", DramaticDoors.DD_MAIN_TAB)));

    public static final Item TALL_GOLD_DOOR = new TallDoorItem(DDBlocks.TALL_GOLD_DOOR, PROPERTIES.tab(conditionalTabProperties("supplementaries", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_NETHERITE_DOOR = new TallDoorItem(DDBlocks.TALL_NETHERITE_DOOR, PROPERTIES.tab(conditionalTabProperties("supplementaries", DramaticDoors.DD_MAIN_TAB)));

    // Tech Reborn
    public static final Item SHORT_RUBBER_DOOR = new ShortDoorItem(DDBlocks.SHORT_RUBBER_DOOR, PROPERTIES.tab(conditionalTabProperties("techreborn", DramaticDoors.DD_MAIN_TAB)));

    public static final Item TALL_RUBBER_DOOR = new TallDoorItem(DDBlocks.TALL_RUBBER_DOOR, PROPERTIES.tab(conditionalTabProperties("techreborn", DramaticDoors.DD_MAIN_TAB)));
    
    // Terrestria
    public static final Item SHORT_TERRESTRIA_CYPRESS_DOOR = new ShortDoorItem(DDBlocks.SHORT_TERRESTRIA_CYPRESS_DOOR, PROPERTIES.tab(conditionalTabProperties("terrestria", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_TERRESTRIA_HEMLOCK_DOOR = new ShortDoorItem(DDBlocks.SHORT_TERRESTRIA_HEMLOCK_DOOR, PROPERTIES.tab(conditionalTabProperties("terrestria", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_TERRESTRIA_JAPANESE_MAPLE_DOOR = new ShortDoorItem(DDBlocks.SHORT_TERRESTRIA_JAPANESE_MAPLE_DOOR, PROPERTIES.tab(conditionalTabProperties("terrestria", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_TERRESTRIA_RAINBOW_EUCALYPTUS_DOOR = new ShortDoorItem(DDBlocks.SHORT_TERRESTRIA_RAINBOW_EUCALYPTUS_DOOR, PROPERTIES.tab(conditionalTabProperties("terrestria", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_TERRESTRIA_REDWOOD_DOOR = new ShortDoorItem(DDBlocks.SHORT_TERRESTRIA_REDWOOD_DOOR, PROPERTIES.tab(conditionalTabProperties("terrestria", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_TERRESTRIA_RUBBER_DOOR = new ShortDoorItem(DDBlocks.SHORT_TERRESTRIA_RUBBER_DOOR, PROPERTIES.tab(conditionalTabProperties("terrestria", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_TERRESTRIA_SAKURA_DOOR = new ShortDoorItem(DDBlocks.SHORT_TERRESTRIA_SAKURA_DOOR, PROPERTIES.tab(conditionalTabProperties("terrestria", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_TERRESTRIA_WILLOW_DOOR = new ShortDoorItem(DDBlocks.SHORT_TERRESTRIA_WILLOW_DOOR, PROPERTIES.tab(conditionalTabProperties("terrestria", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_TERRESTRIA_YUCCA_PALM_DOOR = new ShortDoorItem(DDBlocks.SHORT_TERRESTRIA_YUCCA_PALM_DOOR, PROPERTIES.tab(conditionalTabProperties("terrestria", DramaticDoors.DD_MAIN_TAB)));

    public static final Item TALL_TERRESTRIA_CYPRESS_DOOR = new TallDoorItem(DDBlocks.TALL_TERRESTRIA_CYPRESS_DOOR, PROPERTIES.tab(conditionalTabProperties("terrestria", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_TERRESTRIA_HEMLOCK_DOOR = new TallDoorItem(DDBlocks.TALL_TERRESTRIA_HEMLOCK_DOOR, PROPERTIES.tab(conditionalTabProperties("terrestria", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_TERRESTRIA_JAPANESE_MAPLE_DOOR = new TallDoorItem(DDBlocks.TALL_TERRESTRIA_JAPANESE_MAPLE_DOOR, PROPERTIES.tab(conditionalTabProperties("terrestria", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_TERRESTRIA_RAINBOW_EUCALYPTUS_DOOR = new TallDoorItem(DDBlocks.TALL_TERRESTRIA_RAINBOW_EUCALYPTUS_DOOR, PROPERTIES.tab(conditionalTabProperties("terrestria", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_TERRESTRIA_REDWOOD_DOOR = new TallDoorItem(DDBlocks.TALL_TERRESTRIA_REDWOOD_DOOR, PROPERTIES.tab(conditionalTabProperties("terrestria", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_TERRESTRIA_RUBBER_DOOR = new TallDoorItem(DDBlocks.TALL_TERRESTRIA_RUBBER_DOOR, PROPERTIES.tab(conditionalTabProperties("terrestria", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_TERRESTRIA_SAKURA_DOOR = new TallDoorItem(DDBlocks.TALL_TERRESTRIA_SAKURA_DOOR, PROPERTIES.tab(conditionalTabProperties("terrestria", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_TERRESTRIA_WILLOW_DOOR = new TallDoorItem(DDBlocks.TALL_TERRESTRIA_WILLOW_DOOR, PROPERTIES.tab(conditionalTabProperties("terrestria", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_TERRESTRIA_YUCCA_PALM_DOOR = new TallDoorItem(DDBlocks.TALL_TERRESTRIA_YUCCA_PALM_DOOR, PROPERTIES.tab(conditionalTabProperties("terrestria", DramaticDoors.DD_MAIN_TAB)));
    
    // Traverse
    public static final Item SHORT_TRAVERSE_FIR_DOOR = new ShortDoorItem(DDBlocks.SHORT_TRAVERSE_FIR_DOOR, PROPERTIES.tab(conditionalTabProperties("traverse", DramaticDoors.DD_MAIN_TAB)));

    public static final Item TALL_TRAVERSE_FIR_DOOR = new TallDoorItem(DDBlocks.TALL_TRAVERSE_FIR_DOOR, PROPERTIES.tab(conditionalTabProperties("traverse", DramaticDoors.DD_MAIN_TAB)));
    
    // Twigs
    public static final Item SHORT_STRIPPED_BAMBOO_DOOR = new ShortDoorItem(DDBlocks.SHORT_STRIPPED_BAMBOO_DOOR, PROPERTIES.tab(conditionalTabProperties("twigs", DramaticDoors.DD_MAIN_TAB)));

    public static final Item TALL_STRIPPED_BAMBOO_DOOR = new TallDoorItem(DDBlocks.TALL_STRIPPED_BAMBOO_DOOR, PROPERTIES.tab(conditionalTabProperties("twigs", DramaticDoors.DD_MAIN_TAB)));
    
    // Twilight Forest
    public static final Item SHORT_CANOPY_DOOR = new ShortDoorItem(DDBlocks.SHORT_CANOPY_DOOR, PROPERTIES.tab(conditionalTabProperties("twilightforest", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_DARKWOOD_DOOR = new ShortDoorItem(DDBlocks.SHORT_DARKWOOD_DOOR, PROPERTIES.tab(conditionalTabProperties("twilightforest", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_MINEWOOD_DOOR = new ShortDoorItem(DDBlocks.SHORT_MINEWOOD_DOOR, PROPERTIES.tab(conditionalTabProperties("twilightforest", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_SORTINGWOOD_DOOR = new ShortDoorItem(DDBlocks.SHORT_SORTINGWOOD_DOOR, PROPERTIES.tab(conditionalTabProperties("twilightforest", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_TIMEWOOD_DOOR = new ShortDoorItem(DDBlocks.SHORT_TIMEWOOD_DOOR, PROPERTIES.tab(conditionalTabProperties("twilightforest", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_TRANSWOOD_DOOR = new ShortDoorItem(DDBlocks.SHORT_TRANSWOOD_DOOR, PROPERTIES.tab(conditionalTabProperties("twilightforest", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_TWILIGHT_MANGROVE_DOOR = new ShortDoorItem(DDBlocks.SHORT_TWILIGHT_MANGROVE_DOOR, PROPERTIES.tab(conditionalTabProperties("twilightforest", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_TWILIGHT_OAK_DOOR = new ShortDoorItem(DDBlocks.SHORT_TWILIGHT_OAK_DOOR, PROPERTIES.tab(conditionalTabProperties("twilightforest", DramaticDoors.DD_MAIN_TAB)));

    public static final Item SHORT_TOWERWOOD_DOOR = new ShortDoorItem(DDBlocks.SHORT_TOWERWOOD_DOOR, PROPERTIES.tab(conditionalTabProperties("tflostblocks", DramaticDoors.DD_MAIN_TAB)));

    public static final Item TALL_CANOPY_DOOR = new TallDoorItem(DDBlocks.TALL_CANOPY_DOOR, PROPERTIES.tab(conditionalTabProperties("twilightforest", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_DARKWOOD_DOOR = new TallDoorItem(DDBlocks.TALL_DARKWOOD_DOOR, PROPERTIES.tab(conditionalTabProperties("twilightforest", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_MINEWOOD_DOOR = new TallDoorItem(DDBlocks.TALL_MINEWOOD_DOOR, PROPERTIES.tab(conditionalTabProperties("twilightforest", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_SORTINGWOOD_DOOR = new TallDoorItem(DDBlocks.TALL_SORTINGWOOD_DOOR, PROPERTIES.tab(conditionalTabProperties("twilightforest", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_TIMEWOOD_DOOR = new TallDoorItem(DDBlocks.TALL_TIMEWOOD_DOOR, PROPERTIES.tab(conditionalTabProperties("twilightforest", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_TRANSWOOD_DOOR = new TallDoorItem(DDBlocks.TALL_TRANSWOOD_DOOR, PROPERTIES.tab(conditionalTabProperties("twilightforest", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_TWILIGHT_MANGROVE_DOOR = new TallDoorItem(DDBlocks.TALL_TWILIGHT_MANGROVE_DOOR, PROPERTIES.tab(conditionalTabProperties("twilightforest", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_TWILIGHT_OAK_DOOR = new TallDoorItem(DDBlocks.TALL_TWILIGHT_OAK_DOOR, PROPERTIES.tab(conditionalTabProperties("twilightforest", DramaticDoors.DD_MAIN_TAB)));

    public static final Item TALL_TOWERWOOD_DOOR = new TallDoorItem(DDBlocks.TALL_TOWERWOOD_DOOR, PROPERTIES.tab(conditionalTabProperties("tflostblocks", DramaticDoors.DD_MAIN_TAB)));

    // Wilder Wild
    public static final Item SHORT_WW_BAOBAB_DOOR = new TallDoorItem(DDBlocks.SHORT_WW_BAOBAB_DOOR, PROPERTIES.tab(conditionalTabProperties("wilderwild", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_WW_CYPRESS_DOOR = new TallDoorItem(DDBlocks.SHORT_WW_CYPRESS_DOOR, PROPERTIES.tab(conditionalTabProperties("wilderwild", DramaticDoors.DD_MAIN_TAB)));
    public static final Item SHORT_WW_PALM_DOOR = new TallDoorItem(DDBlocks.SHORT_WW_PALM_DOOR, PROPERTIES.tab(conditionalTabProperties("wilderwild", DramaticDoors.DD_MAIN_TAB)));
    
    public static final Item TALL_WW_BAOBAB_DOOR = new TallDoorItem(DDBlocks.TALL_WW_BAOBAB_DOOR, PROPERTIES.tab(conditionalTabProperties("wilderwild", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_WW_CYPRESS_DOOR = new TallDoorItem(DDBlocks.TALL_WW_CYPRESS_DOOR, PROPERTIES.tab(conditionalTabProperties("wilderwild", DramaticDoors.DD_MAIN_TAB)));
    public static final Item TALL_WW_PALM_DOOR = new TallDoorItem(DDBlocks.TALL_WW_PALM_DOOR, PROPERTIES.tab(conditionalTabProperties("wilderwild", DramaticDoors.DD_MAIN_TAB)));
    
    // XP Obelisk
    public static final Item SHORT_SOUL_COPPER_DOOR = new ShortDoorItem(DDBlocks.SHORT_SOUL_COPPER_DOOR, PROPERTIES.tab(conditionalTabProperties("xps_additions", DramaticDoors.DD_MAIN_TAB)));

    public static final Item TALL_SOUL_COPPER_DOOR = new TallDoorItem(DDBlocks.TALL_SOUL_COPPER_DOOR, PROPERTIES.tab(conditionalTabProperties("xps_additions", DramaticDoors.DD_MAIN_TAB)));

    // Yippee
    public static final Item SHORT_MYSTICAL_OAK_DOOR = new ShortDoorItem(DDBlocks.SHORT_MYSTICAL_OAK_DOOR, PROPERTIES.tab(conditionalTabProperties("yippee", DramaticDoors.DD_MAIN_TAB)));

    public static final Item TALL_MYSTICAL_OAK_DOOR = new TallDoorItem(DDBlocks.TALL_MYSTICAL_OAK_DOOR, PROPERTIES.tab(conditionalTabProperties("yippee", DramaticDoors.DD_MAIN_TAB)));
    
    // Chipped (The biggest compat)
    public static final Item TALL_CHIPPED_OAK_HEAVY_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_HEAVY_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_OAK_DUAL_PANELED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_DUAL_PANELED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_OAK_PRESSED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_PRESSED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_OAK_SHACK_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_SHACK_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_OAK_FORTIFIED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_FORTIFIED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_OAK_SLIDING_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_SLIDING_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_OAK_SCREEN_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_SCREEN_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_OAK_GATED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_GATED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_OAK_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_OAK_WINDOWED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_WINDOWED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_OAK_TILED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_TILED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_OAK_TILE_WINDOWED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_TILE_WINDOWED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_OAK_SECRET_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_SECRET_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_OAK_BOARDED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_BOARDED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_OAK_PAPER_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_PAPER_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_OAK_BEACH_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_BEACH_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_OAK_BARRED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_BARRED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_OAK_PANELED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_PANELED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_OAK_SUPPORTED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_SUPPORTED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_OAK_OVERGROWN_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_OVERGROWN_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    
    public static final Item TALL_CHIPPED_SPRUCE_HEAVY_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_HEAVY_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_SPRUCE_DUAL_PANELED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_DUAL_PANELED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_SPRUCE_PRESSED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_PRESSED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_SPRUCE_SHACK_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_SHACK_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_SPRUCE_FORTIFIED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_FORTIFIED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_SPRUCE_SLIDING_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_SLIDING_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_SPRUCE_SCREEN_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_SCREEN_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_SPRUCE_GATED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_GATED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_SPRUCE_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_SPRUCE_WINDOWED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_WINDOWED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_SPRUCE_TILED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_TILED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_SPRUCE_TILE_WINDOWED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_TILE_WINDOWED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_SPRUCE_SECRET_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_SECRET_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_SPRUCE_MODERN_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_MODERN_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_SPRUCE_PAPER_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_PAPER_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_SPRUCE_BEACH_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_BEACH_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_SPRUCE_BARRED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_BARRED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_SPRUCE_PANELED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_PANELED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_SPRUCE_SUPPORTED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_SUPPORTED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_SPRUCE_OVERGROWN_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_OVERGROWN_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    
    public static final Item TALL_CHIPPED_BIRCH_HEAVY_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_HEAVY_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_BIRCH_DUAL_PANELED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_DUAL_PANELED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_BIRCH_PRESSED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_PRESSED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_BIRCH_SHACK_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_SHACK_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_BIRCH_FORTIFIED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_FORTIFIED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_BIRCH_SLIDING_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_SLIDING_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_BIRCH_SCREEN_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_SCREEN_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_BIRCH_GATED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_GATED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_BIRCH_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_BIRCH_WINDOWED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_WINDOWED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_BIRCH_TILED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_TILED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_BIRCH_TILE_WINDOWED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_TILE_WINDOWED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_BIRCH_SECRET_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_SECRET_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_BIRCH_MODERN_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_MODERN_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_BIRCH_BOARDED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_BOARDED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_BIRCH_BEACH_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_BEACH_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_BIRCH_BARRED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_BARRED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_BIRCH_PANELED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_PANELED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_BIRCH_SUPPORTED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_SUPPORTED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_BIRCH_OVERGROWN_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_OVERGROWN_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));

    public static final Item TALL_CHIPPED_JUNGLE_HEAVY_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_HEAVY_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_JUNGLE_DUAL_PANELED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_DUAL_PANELED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_JUNGLE_PRESSED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_PRESSED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_JUNGLE_SHACK_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_SHACK_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_JUNGLE_FORTIFIED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_FORTIFIED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_JUNGLE_SLIDING_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_SLIDING_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_JUNGLE_SCREEN_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_SCREEN_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_JUNGLE_GATED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_GATED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_JUNGLE_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_JUNGLE_WINDOWED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_WINDOWED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_JUNGLE_TILED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_TILED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_JUNGLE_TILE_WINDOWED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_TILE_WINDOWED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_JUNGLE_SECRET_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_SECRET_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_JUNGLE_MODERN_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_MODERN_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_JUNGLE_BOARDED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_BOARDED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_JUNGLE_PAPER_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_PAPER_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_JUNGLE_BARRED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_BARRED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_JUNGLE_PANELED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_PANELED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_JUNGLE_SUPPORTED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_SUPPORTED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_JUNGLE_OVERGROWN_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_OVERGROWN_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));

    public static final Item TALL_CHIPPED_ACACIA_HEAVY_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_HEAVY_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_ACACIA_DUAL_PANELED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_DUAL_PANELED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_ACACIA_PRESSED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_PRESSED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_ACACIA_SHACK_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_SHACK_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_ACACIA_FORTIFIED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_FORTIFIED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_ACACIA_SLIDING_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_SLIDING_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_ACACIA_SCREEN_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_SCREEN_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_ACACIA_GATED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_GATED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_ACACIA_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_ACACIA_WINDOWED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_WINDOWED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_ACACIA_TILED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_TILED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_ACACIA_TILE_WINDOWED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_TILE_WINDOWED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_ACACIA_SECRET_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_SECRET_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_ACACIA_MODERN_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_MODERN_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_ACACIA_BOARDED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_BOARDED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_ACACIA_PAPER_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_PAPER_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_ACACIA_BEACH_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_BEACH_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_ACACIA_PANELED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_PANELED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_ACACIA_SUPPORTED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_SUPPORTED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_ACACIA_OVERGROWN_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_OVERGROWN_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));

    public static final Item TALL_CHIPPED_DARK_OAK_HEAVY_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_HEAVY_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_DARK_OAK_DUAL_PANELED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_DUAL_PANELED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_DARK_OAK_PRESSED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_PRESSED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_DARK_OAK_SHACK_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_SHACK_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_DARK_OAK_FORTIFIED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_FORTIFIED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_DARK_OAK_SLIDING_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_SLIDING_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_DARK_OAK_SCREEN_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_SCREEN_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_DARK_OAK_GATED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_GATED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_DARK_OAK_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_DARK_OAK_WINDOWED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_WINDOWED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_DARK_OAK_TILED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_TILED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_DARK_OAK_TILE_WINDOWED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_TILE_WINDOWED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_DARK_OAK_SECRET_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_SECRET_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_DARK_OAK_MODERN_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_MODERN_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_DARK_OAK_BOARDED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_BOARDED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_DARK_OAK_PAPER_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_PAPER_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_DARK_OAK_BEACH_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_BEACH_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_DARK_OAK_BARRED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_BARRED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_DARK_OAK_SUPPORTED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_SUPPORTED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_DARK_OAK_OVERGROWN_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_OVERGROWN_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));

    public static final Item TALL_CHIPPED_MANGROVE_HEAVY_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_MANGROVE_HEAVY_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_MANGROVE_DUAL_PANELED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_MANGROVE_DUAL_PANELED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_MANGROVE_PRESSED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_MANGROVE_PRESSED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_MANGROVE_SHACK_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_MANGROVE_SHACK_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_MANGROVE_FORTIFIED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_MANGROVE_FORTIFIED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_MANGROVE_SLIDING_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_MANGROVE_SLIDING_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_MANGROVE_SCREEN_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_MANGROVE_SCREEN_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_MANGROVE_GATED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_MANGROVE_GATED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_MANGROVE_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_MANGROVE_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_MANGROVE_WINDOWED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_MANGROVE_WINDOWED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_MANGROVE_TILED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_MANGROVE_TILED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_MANGROVE_TILE_WINDOWED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_MANGROVE_TILE_WINDOWED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_MANGROVE_SECRET_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_MANGROVE_SECRET_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_MANGROVE_MODERN_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_MANGROVE_MODERN_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_MANGROVE_BOARDED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_MANGROVE_BOARDED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_MANGROVE_PAPER_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_MANGROVE_PAPER_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_MANGROVE_BEACH_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_MANGROVE_BEACH_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_MANGROVE_BARRED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_MANGROVE_BARRED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_MANGROVE_PANELED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_MANGROVE_PANELED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_MANGROVE_SUPPORTED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_MANGROVE_SUPPORTED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_MANGROVE_OVERGROWN_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_MANGROVE_OVERGROWN_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));

    public static final Item TALL_CHIPPED_CRIMSON_HEAVY_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_HEAVY_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_CRIMSON_DUAL_PANELED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_DUAL_PANELED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_CRIMSON_PRESSED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_PRESSED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_CRIMSON_SHACK_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_SHACK_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_CRIMSON_FORTIFIED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_FORTIFIED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_CRIMSON_SLIDING_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_SLIDING_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_CRIMSON_SCREEN_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_SCREEN_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_CRIMSON_GATED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_GATED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_CRIMSON_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_CRIMSON_WINDOWED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_WINDOWED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_CRIMSON_TILED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_TILED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_CRIMSON_TILE_WINDOWED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_TILE_WINDOWED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_CRIMSON_SECRET_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_SECRET_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_CRIMSON_MODERN_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_MODERN_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_CRIMSON_BOARDED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_BOARDED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_CRIMSON_PAPER_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_PAPER_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_CRIMSON_BEACH_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_BEACH_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_CRIMSON_BARRED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_BARRED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_CRIMSON_PANELED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_PANELED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_CRIMSON_OVERGROWN_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_OVERGROWN_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));

    public static final Item TALL_CHIPPED_WARPED_HEAVY_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_HEAVY_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_WARPED_DUAL_PANELED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_DUAL_PANELED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_WARPED_PRESSED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_PRESSED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_WARPED_SHACK_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_SHACK_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_WARPED_FORTIFIED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_FORTIFIED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_WARPED_SLIDING_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_SLIDING_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_WARPED_SCREEN_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_SCREEN_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_WARPED_GATED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_GATED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_WARPED_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_WARPED_WINDOWED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_WINDOWED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_WARPED_TILED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_TILED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_WARPED_TILE_WINDOWED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_TILE_WINDOWED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_WARPED_SECRET_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_SECRET_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_WARPED_MODERN_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_MODERN_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_WARPED_BOARDED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_BOARDED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_WARPED_PAPER_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_PAPER_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_WARPED_BEACH_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_BEACH_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_WARPED_BARRED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_BARRED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_WARPED_PANELED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_PANELED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    public static final Item TALL_CHIPPED_WARPED_SUPPORTED_DOOR = new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_SUPPORTED_DOOR, PROPERTIES.tab(conditionalTabProperties("chipped", DramaticDoors.DD_CHIPPED_TAB)));
    
    // Macaw's Doors (The biggest compat)
    public static final Item TALL_MACAW_STORE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_STORE_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
    public static final Item TALL_MACAW_SLIDING_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_SLIDING_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));

    public static final Item TALL_MACAW_JAIL_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_JAIL_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_METAL_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_METAL_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_METAL_HOSPITAL_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_METAL_HOSPITAL_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_METAL_REINFORCED_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_METAL_REINFORCED_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_METAL_WARNING_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_METAL_WARNING_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_METAL_WINDOWED_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_METAL_WINDOWED_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));

	public static final Item TALL_MACAW_OAK_BARN_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_OAK_BARN_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_SPRUCE_BARN_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_BARN_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BIRCH_BARN_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_BARN_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_JUNGLE_BARN_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_BARN_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_ACACIA_BARN_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_BARN_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_DARK_OAK_BARN_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_BARN_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_MANGROVE_BARN_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_MANGROVE_BARN_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BAMBOO_BARN_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BAMBOO_BARN_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_CRIMSON_BARN_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_BARN_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_WARPED_BARN_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_BARN_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));

	public static final Item TALL_MACAW_OAK_BARN_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_OAK_BARN_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_SPRUCE_BARN_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_BARN_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BIRCH_BARN_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_BARN_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_JUNGLE_BARN_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_BARN_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_ACACIA_BARN_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_BARN_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_DARK_OAK_BARN_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_BARN_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_MANGROVE_BARN_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_MANGROVE_BARN_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BAMBOO_BARN_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BAMBOO_BARN_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_CRIMSON_BARN_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_BARN_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_WARPED_BARN_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_BARN_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));

	public static final Item TALL_MACAW_OAK_STABLE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_OAK_STABLE_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_SPRUCE_STABLE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_STABLE_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BIRCH_STABLE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_STABLE_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_JUNGLE_STABLE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_STABLE_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_ACACIA_STABLE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_STABLE_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_DARK_OAK_STABLE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_STABLE_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_MANGROVE_STABLE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_MANGROVE_STABLE_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BAMBOO_STABLE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BAMBOO_STABLE_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_CRIMSON_STABLE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_STABLE_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_WARPED_STABLE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_STABLE_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));

	public static final Item TALL_MACAW_OAK_STABLE_HEAD_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_OAK_STABLE_HEAD_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_SPRUCE_STABLE_HEAD_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_STABLE_HEAD_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BIRCH_STABLE_HEAD_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_STABLE_HEAD_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_JUNGLE_STABLE_HEAD_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_STABLE_HEAD_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_ACACIA_STABLE_HEAD_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_STABLE_HEAD_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_DARK_OAK_STABLE_HEAD_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_STABLE_HEAD_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_MANGROVE_STABLE_HEAD_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_MANGROVE_STABLE_HEAD_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BAMBOO_STABLE_HEAD_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BAMBOO_STABLE_HEAD_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_CRIMSON_STABLE_HEAD_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_STABLE_HEAD_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_WARPED_STABLE_HEAD_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_STABLE_HEAD_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));

	public static final Item TALL_MACAW_OAK_BARK_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_OAK_BARK_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_SPRUCE_BARK_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_BARK_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BIRCH_BARK_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_BARK_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_JUNGLE_BARK_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_BARK_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_ACACIA_BARK_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_BARK_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_DARK_OAK_BARK_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_BARK_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_MANGROVE_BARK_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_MANGROVE_BARK_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BAMBOO_BARK_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BAMBOO_BARK_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_CRIMSON_STEM_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_STEM_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_WARPED_STEM_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_STEM_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	
	public static final Item TALL_MACAW_OAK_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_OAK_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_SPRUCE_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BIRCH_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_JUNGLE_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_ACACIA_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_DARK_OAK_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_MANGROVE_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_MANGROVE_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BAMBOO_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BAMBOO_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_CRIMSON_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_WARPED_GLASS_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_GLASS_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));

	public static final Item TALL_MACAW_OAK_MODERN_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_OAK_MODERN_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_SPRUCE_MODERN_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_MODERN_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BIRCH_MODERN_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_MODERN_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_JUNGLE_MODERN_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_MODERN_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_ACACIA_MODERN_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_MODERN_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_DARK_OAK_MODERN_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_MODERN_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_MANGROVE_MODERN_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_MANGROVE_MODERN_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BAMBOO_MODERN_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BAMBOO_MODERN_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_CRIMSON_MODERN_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_MODERN_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_WARPED_MODERN_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_MODERN_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));

	public static final Item TALL_MACAW_OAK_JAPANESE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_OAK_JAPANESE_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_SPRUCE_JAPANESE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_JAPANESE_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BIRCH_JAPANESE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_JAPANESE_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_JUNGLE_JAPANESE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_JAPANESE_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_ACACIA_JAPANESE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_JAPANESE_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_DARK_OAK_JAPANESE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_JAPANESE_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_MANGROVE_JAPANESE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_MANGROVE_JAPANESE_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BAMBOO_JAPANESE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BAMBOO_JAPANESE_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_CRIMSON_JAPANESE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_JAPANESE_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_WARPED_JAPANESE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_JAPANESE_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));

	public static final Item TALL_MACAW_OAK_JAPANESE2_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_OAK_JAPANESE2_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_SPRUCE_JAPANESE2_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_JAPANESE2_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BIRCH_JAPANESE2_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_JAPANESE2_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_JUNGLE_JAPANESE2_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_JAPANESE2_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_ACACIA_JAPANESE2_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_JAPANESE2_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_DARK_OAK_JAPANESE2_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_JAPANESE2_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_MANGROVE_JAPANESE2_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_MANGROVE_JAPANESE2_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BAMBOO_JAPANESE2_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BAMBOO_JAPANESE2_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_CRIMSON_JAPANESE2_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_JAPANESE2_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_WARPED_JAPANESE2_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_JAPANESE2_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));

	public static final Item TALL_MACAW_SPRUCE_CLASSIC_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_CLASSIC_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BIRCH_CLASSIC_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_CLASSIC_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_JUNGLE_CLASSIC_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_CLASSIC_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_ACACIA_CLASSIC_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_CLASSIC_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_DARK_OAK_CLASSIC_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_CLASSIC_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_MANGROVE_CLASSIC_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_MANGROVE_CLASSIC_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BAMBOO_CLASSIC_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BAMBOO_CLASSIC_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_CRIMSON_CLASSIC_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_CLASSIC_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_WARPED_CLASSIC_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_CLASSIC_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));

	public static final Item TALL_MACAW_OAK_COTTAGE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_OAK_COTTAGE_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BIRCH_COTTAGE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_COTTAGE_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_JUNGLE_COTTAGE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_COTTAGE_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_ACACIA_COTTAGE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_COTTAGE_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_DARK_OAK_COTTAGE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_COTTAGE_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_MANGROVE_COTTAGE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_MANGROVE_COTTAGE_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BAMBOO_COTTAGE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BAMBOO_COTTAGE_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_CRIMSON_COTTAGE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_COTTAGE_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_WARPED_COTTAGE_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_COTTAGE_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));

	public static final Item TALL_MACAW_OAK_PAPER_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_OAK_PAPER_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_SPRUCE_PAPER_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_PAPER_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_JUNGLE_PAPER_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_PAPER_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_ACACIA_PAPER_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_PAPER_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_DARK_OAK_PAPER_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_PAPER_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_MANGROVE_PAPER_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_MANGROVE_PAPER_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BAMBOO_PAPER_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BAMBOO_PAPER_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_CRIMSON_PAPER_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_PAPER_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_WARPED_PAPER_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_PAPER_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));

	public static final Item TALL_MACAW_OAK_BEACH_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_OAK_BEACH_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_SPRUCE_BEACH_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_BEACH_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BIRCH_BEACH_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_BEACH_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_ACACIA_BEACH_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_BEACH_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_DARK_OAK_BEACH_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_BEACH_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_MANGROVE_BEACH_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_MANGROVE_BEACH_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BAMBOO_BEACH_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BAMBOO_BEACH_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_CRIMSON_BEACH_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_BEACH_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_WARPED_BEACH_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_BEACH_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));

	public static final Item TALL_MACAW_OAK_TROPICAL_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_OAK_TROPICAL_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_SPRUCE_TROPICAL_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_TROPICAL_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BIRCH_TROPICAL_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_TROPICAL_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_JUNGLE_TROPICAL_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_TROPICAL_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_DARK_OAK_TROPICAL_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_TROPICAL_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_MANGROVE_TROPICAL_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_MANGROVE_TROPICAL_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BAMBOO_TROPICAL_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BAMBOO_TROPICAL_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_CRIMSON_TROPICAL_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_TROPICAL_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_WARPED_TROPICAL_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_TROPICAL_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));

	public static final Item TALL_MACAW_OAK_FOUR_PANEL_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_OAK_FOUR_PANEL_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_SPRUCE_FOUR_PANEL_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_FOUR_PANEL_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BIRCH_FOUR_PANEL_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_FOUR_PANEL_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_JUNGLE_FOUR_PANEL_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_FOUR_PANEL_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_ACACIA_FOUR_PANEL_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_FOUR_PANEL_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_MANGROVE_FOUR_PANEL_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_MANGROVE_FOUR_PANEL_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BAMBOO_FOUR_PANEL_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BAMBOO_FOUR_PANEL_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_CRIMSON_FOUR_PANEL_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_FOUR_PANEL_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_WARPED_FOUR_PANEL_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_FOUR_PANEL_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));

	public static final Item TALL_MACAW_OAK_SWAMP_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_OAK_SWAMP_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_SPRUCE_SWAMP_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_SWAMP_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BIRCH_SWAMP_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_SWAMP_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_JUNGLE_SWAMP_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_SWAMP_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_ACACIA_SWAMP_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_SWAMP_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_DARK_OAK_SWAMP_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_SWAMP_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BAMBOO_SWAMP_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BAMBOO_SWAMP_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_CRIMSON_SWAMP_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_SWAMP_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_WARPED_SWAMP_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_SWAMP_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));

	public static final Item TALL_MACAW_OAK_BAMBOO_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_OAK_BAMBOO_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_SPRUCE_BAMBOO_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_BAMBOO_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BIRCH_BAMBOO_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_BAMBOO_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_JUNGLE_BAMBOO_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_BAMBOO_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_ACACIA_BAMBOO_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_BAMBOO_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_DARK_OAK_BAMBOO_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_BAMBOO_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_MANGROVE_BAMBOO_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_MANGROVE_BAMBOO_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_CRIMSON_BAMBOO_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_BAMBOO_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_WARPED_BAMBOO_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_BAMBOO_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	
	public static final Item TALL_MACAW_OAK_NETHER_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_OAK_NETHER_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_SPRUCE_NETHER_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_NETHER_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BIRCH_NETHER_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_NETHER_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_JUNGLE_NETHER_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_NETHER_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_ACACIA_NETHER_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_NETHER_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_DARK_OAK_NETHER_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_NETHER_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_MANGROVE_NETHER_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_MANGROVE_NETHER_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BAMBOO_NETHER_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BAMBOO_NETHER_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_WARPED_NETHER_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_NETHER_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));

	public static final Item TALL_MACAW_OAK_MYSTIC_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_OAK_MYSTIC_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_SPRUCE_MYSTIC_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_MYSTIC_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BIRCH_MYSTIC_DOOR =  new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_MYSTIC_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_JUNGLE_MYSTIC_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_MYSTIC_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_ACACIA_MYSTIC_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_MYSTIC_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_DARK_OAK_MYSTIC_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_MYSTIC_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_MANGROVE_MYSTIC_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_MANGROVE_MYSTIC_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_BAMBOO_MYSTIC_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_BAMBOO_MYSTIC_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
	public static final Item TALL_MACAW_CRIMSON_MYSTIC_DOOR = new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_MYSTIC_DOOR, PROPERTIES.tab(conditionalTabProperties("mcwdoors", DramaticDoors.DD_MACAW_TAB)));
    
	public static void registerItems() {
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_IRON), SHORT_IRON_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_OAK), SHORT_OAK_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SPRUCE), SHORT_SPRUCE_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BIRCH), SHORT_BIRCH_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_JUNGLE), SHORT_JUNGLE_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ACACIA), SHORT_ACACIA_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_DARK_OAK), SHORT_DARK_OAK_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MANGROVE), SHORT_MANGROVE_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BAMBOO), SHORT_BAMBOO_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CRIMSON), SHORT_CRIMSON_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WARPED), SHORT_WARPED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_IRON), TALL_IRON_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_OAK), TALL_OAK_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SPRUCE), TALL_SPRUCE_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BIRCH), TALL_BIRCH_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_JUNGLE), TALL_JUNGLE_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ACACIA), TALL_ACACIA_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DARK_OAK), TALL_DARK_OAK_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANGROVE), TALL_MANGROVE_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BAMBOO), TALL_BAMBOO_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CRIMSON), TALL_CRIMSON_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WARPED), TALL_WARPED_DOOR);
		
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_JACARANDA), SHORT_JACARANDA_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_REDBUD), SHORT_REDBUD_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CYPRESS), SHORT_CYPRESS_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BROWN_MUSHROOM), SHORT_BROWN_MUSHROOM_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RED_MUSHROOM), SHORT_RED_MUSHROOM_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_JACARANDA), TALL_JACARANDA_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_REDBUD), TALL_REDBUD_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CYPRESS), TALL_CYPRESS_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BROWN_MUSHROOM), TALL_BROWN_MUSHROOM_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RED_MUSHROOM), TALL_RED_MUSHROOM_DOOR);

        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_ASPEN), SHORT_BYG_ASPEN_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_BAOBAB), SHORT_BYG_BAOBAB_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_BLUE_ENCHANTED), SHORT_BYG_BLUE_ENCHANTED_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_BULBIS), SHORT_BYG_BULBIS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_CHERRY), SHORT_BYG_CHERRY_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_CIKA), SHORT_BYG_CIKA_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_CYPRESS), SHORT_BYG_CYPRESS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_EBONY), SHORT_BYG_EBONY_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_EMBUR), SHORT_BYG_EMBUR_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_ETHER), SHORT_BYG_ETHER_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_FIR), SHORT_BYG_FIR_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_FLORUS), SHORT_BYG_FLORUS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_GREEN_ENCHANTED), SHORT_BYG_GREEN_ENCHANTED_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_HOLLY), SHORT_BYG_HOLLY_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_IMPARIUS), SHORT_BYG_IMPARIUS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_IRONWOOD), SHORT_BYG_IRONWOOD_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_JACARANDA), SHORT_BYG_JACARANDA_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_LAMENT), SHORT_BYG_LAMENT_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_MAHOGANY), SHORT_BYG_MAHOGANY_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_MAPLE), SHORT_BYG_MAPLE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_NIGHTSHADE), SHORT_BYG_NIGHTSHADE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_PALM), SHORT_BYG_PALM_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_PINE), SHORT_BYG_PINE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_RAINBOW_EUCALYPTUS), SHORT_BYG_RAINBOW_EUCALYPTUS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_REDWOOD), SHORT_BYG_REDWOOD_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_SKYRIS), SHORT_BYG_SKYRIS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_SOUL_SHROOM), SHORT_BYG_SOUL_SHROOM_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_SYTHIAN), SHORT_BYG_SYTHIAN_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_WHITE_MANGROVE), SHORT_BYG_WHITE_MANGROVE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_WILLOW), SHORT_BYG_WILLOW_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_WITCH_HAZEL), SHORT_BYG_WITCH_HAZEL_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_ZELKOVA), SHORT_BYG_ZELKOVA_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_ASPEN), TALL_BYG_ASPEN_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_BAOBAB), TALL_BYG_BAOBAB_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_BLUE_ENCHANTED), TALL_BYG_BLUE_ENCHANTED_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_BULBIS), TALL_BYG_BULBIS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_CHERRY), TALL_BYG_CHERRY_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_CIKA), TALL_BYG_CIKA_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_CYPRESS), TALL_BYG_CYPRESS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_EBONY), TALL_BYG_EBONY_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_EMBUR), TALL_BYG_EMBUR_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_ETHER), TALL_BYG_ETHER_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_FIR), TALL_BYG_FIR_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_FLORUS), TALL_BYG_FLORUS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_GREEN_ENCHANTED), TALL_BYG_GREEN_ENCHANTED_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_HOLLY), TALL_BYG_HOLLY_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_IMPARIUS), TALL_BYG_IMPARIUS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_IRONWOOD), TALL_BYG_IRONWOOD_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_JACARANDA), TALL_BYG_JACARANDA_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_LAMENT), TALL_BYG_LAMENT_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_MAHOGANY), TALL_BYG_MAHOGANY_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_MAPLE), TALL_BYG_MAPLE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_NIGHTSHADE), TALL_BYG_NIGHTSHADE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_PALM), TALL_BYG_PALM_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_PINE), TALL_BYG_PINE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_RAINBOW_EUCALYPTUS), TALL_BYG_RAINBOW_EUCALYPTUS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_REDWOOD), TALL_BYG_REDWOOD_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_SKYRIS), TALL_BYG_SKYRIS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_SOUL_SHROOM), TALL_BYG_SOUL_SHROOM_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_SYTHIAN), TALL_BYG_SYTHIAN_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_WHITE_MANGROVE), TALL_BYG_WHITE_MANGROVE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_WILLOW), TALL_BYG_WILLOW_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_WITCH_HAZEL), TALL_BYG_WITCH_HAZEL_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_ZELKOVA), TALL_BYG_ZELKOVA_DOOR);

        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_AERONOS), SHORT_AERONOS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GLACIAN), SHORT_GLACIAN_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_STROPHAR), SHORT_STROPHAR_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_STEEL), SHORT_STEEL_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AERONOS), TALL_AERONOS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GLACIAN), TALL_GLACIAN_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_STROPHAR), TALL_STROPHAR_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_STEEL), TALL_STEEL_DOOR);

        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_AETHER_SKYROOT), SHORT_AETHER_SKYROOT_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AETHER_SKYROOT), TALL_AETHER_SKYROOT_DOOR);

        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TWISTED), SHORT_TWISTED_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TWISTED), TALL_TWISTED_DOOR);
        
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BE_BAMBOO), SHORT_BE_BAMBOO_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BE_DRY_BAMBOO), SHORT_BE_DRY_BAMBOO_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BE_BAMBOO), TALL_BE_BAMBOO_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BE_DRY_BAMBOO), TALL_BE_DRY_BAMBOO_DOOR);
        
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TERMINITE), SHORT_TERMINITE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_THALLASIUM), SHORT_THALLASIUM_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_DRAGON_TREE), SHORT_DRAGON_TREE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_END_LOTUS), SHORT_END_LOTUS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_HELIX_TREE), SHORT_HELIX_TREE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_JELLYSHROOM), SHORT_JELLYSHROOM_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LACUGROVE), SHORT_LACUGROVE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LUCERNIA), SHORT_LUCERNIA_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MOSSY_GLOWSHROOM), SHORT_MOSSY_GLOWSHROOM_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PYTHADENDRON), SHORT_PYTHADENDRON_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TENANEA), SHORT_TENANEA_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_UMBRELLA_TREE), SHORT_UMBRELLA_TREE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TERMINITE), TALL_TERMINITE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_THALLASIUM), TALL_THALLASIUM_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DRAGON_TREE), TALL_DRAGON_TREE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_END_LOTUS), TALL_END_LOTUS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_HELIX_TREE), TALL_HELIX_TREE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_JELLYSHROOM), TALL_JELLYSHROOM_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LACUGROVE), TALL_LACUGROVE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LUCERNIA), TALL_LUCERNIA_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MOSSY_GLOWSHROOM), TALL_MOSSY_GLOWSHROOM_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PYTHADENDRON), TALL_PYTHADENDRON_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TENANEA), TALL_TENANEA_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_UMBRELLA_TREE), TALL_UMBRELLA_TREE_DOOR);

        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ANCHOR_TREE), SHORT_ANCHOR_TREE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BONE_CIN), SHORT_BONE_CIN_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BONE_REED), SHORT_BONE_REED_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MUSHROOM_FIR), SHORT_MUSHROOM_FIR_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_NETHER_MUSHROOM), SHORT_NETHER_MUSHROOM_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_NETHER_REED), SHORT_NETHER_REED_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_NETHER_SAKURA), SHORT_NETHER_SAKURA_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUBEUS), SHORT_RUBEUS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_STALAGNATE), SHORT_STALAGNATE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WART), SHORT_WART_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BN_WILLOW), SHORT_BN_WILLOW_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ANCHOR_TREE), TALL_ANCHOR_TREE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BONE_CIN), TALL_BONE_CIN_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BONE_REED), TALL_BONE_REED_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MUSHROOM_FIR), TALL_MUSHROOM_FIR_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_NETHER_MUSHROOM), TALL_NETHER_MUSHROOM_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_NETHER_REED), TALL_NETHER_REED_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_NETHER_SAKURA), TALL_NETHER_SAKURA_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUBEUS), TALL_RUBEUS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_STALAGNATE), TALL_STALAGNATE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WART), TALL_WART_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BN_WILLOW), TALL_BN_WILLOW_DOOR);

		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BW_CYPRESS), SHORT_BW_CYPRESS_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_DRAGONS_BLOOD), SHORT_DRAGONS_BLOOD_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ELDER), SHORT_ELDER_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_JUNIPER), SHORT_JUNIPER_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BW_CYPRESS), TALL_BW_CYPRESS_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DRAGONS_BLOOD), TALL_DRAGONS_BLOOD_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ELDER), TALL_ELDER_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_JUNIPER), TALL_JUNIPER_DOOR);

		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_YEW), SHORT_YEW_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_YEW), TALL_YEW_DOOR);

        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BM_ANCIENT_OAK), SHORT_BM_ANCIENT_OAK_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BM_BLIGHTED_BALSA), SHORT_BM_BLIGHTED_BALSA_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BM_SWAMP_CYPRESS), SHORT_BM_SWAMP_CYPRESS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BM_WILLOW), SHORT_BM_WILLOW_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BM_ANCIENT_OAK), TALL_BM_ANCIENT_OAK_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BM_BLIGHTED_BALSA), TALL_BM_BLIGHTED_BALSA_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BM_SWAMP_CYPRESS), TALL_BM_SWAMP_CYPRESS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BM_WILLOW), TALL_BM_WILLOW_DOOR);
        
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FLESH), SHORT_FLESH_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FULL_FLESH), SHORT_FULL_FLESH_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FLESHKIN), SHORT_FLESHKIN_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FLESH), TALL_FLESH_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FULL_FLESH), TALL_FULL_FLESH_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FLESHKIN), TALL_FLESHKIN_DOOR);
        
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BLOCKUS_BAMBOO), SHORT_BLOCKUS_BAMBOO_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BLOCKUS_BLACKSTONE), SHORT_BLOCKUS_BLACKSTONE_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BLOCKUS_CHARRED), SHORT_BLOCKUS_CHARRED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BLOCKUS_OBSIDIAN_REINFORCED), SHORT_BLOCKUS_OBSIDIAN_REINFORCED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BLOCKUS_PAPER), SHORT_BLOCKUS_PAPER_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BLOCKUS_STONE), SHORT_BLOCKUS_STONE_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BLOCKUS_WHITE_OAK), SHORT_BLOCKUS_WHITE_OAK_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BLOCKUS_BAMBOO), TALL_BLOCKUS_BAMBOO_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BLOCKUS_BLACKSTONE), TALL_BLOCKUS_BLACKSTONE_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BLOCKUS_CHARRED), TALL_BLOCKUS_CHARRED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BLOCKUS_OBSIDIAN_REINFORCED), TALL_BLOCKUS_OBSIDIAN_REINFORCED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BLOCKUS_PAPER), TALL_BLOCKUS_PAPER_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BLOCKUS_STONE), TALL_BLOCKUS_STONE_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BLOCKUS_WHITE_OAK), TALL_BLOCKUS_WHITE_OAK_DOOR);

		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CEILTRUNK), SHORT_CEILTRUNK_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LUZAWOOD), SHORT_LUZAWOOD_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CEILTRUNK), TALL_CEILTRUNK_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LUZAWOOD), TALL_LUZAWOOD_DOOR);

		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CHARM_AZALEA), SHORT_CHARM_AZALEA_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CHARM_EBONY), SHORT_CHARM_EBONY_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHARM_AZALEA), TALL_CHARM_AZALEA_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHARM_EBONY), TALL_CHARM_EBONY_DOOR);

		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SCORCHED), SHORT_SCORCHED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_UMBRAL), SHORT_UMBRAL_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SCORCHED), TALL_SCORCHED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_UMBRAL), TALL_UMBRAL_DOOR);

		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_APRICORN), SHORT_APRICORN_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_APRICORN), TALL_APRICORN_DOOR);

        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_AZULE_AZALEA), SHORT_AZULE_AZALEA_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BRIGHT_AZALEA), SHORT_BRIGHT_AZALEA_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FISS_AZALEA), SHORT_FISS_AZALEA_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ROZE_AZALEA), SHORT_ROZE_AZALEA_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TECAL_AZALEA), SHORT_TECAL_AZALEA_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TITANIUM_AZALEA), SHORT_TITANIUM_AZALEA_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WALNUT_AZALEA), SHORT_WALNUT_AZALEA_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AZULE_AZALEA), TALL_AZULE_AZALEA_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BRIGHT_AZALEA), TALL_BRIGHT_AZALEA_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FISS_AZALEA), TALL_FISS_AZALEA_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ROZE_AZALEA), TALL_ROZE_AZALEA_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TECAL_AZALEA), TALL_TECAL_AZALEA_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TITANIUM_AZALEA), TALL_TITANIUM_AZALEA_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WALNUT_AZALEA), TALL_WALNUT_AZALEA_DOOR);
		
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ANDESITE), SHORT_ANDESITE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BRASS), SHORT_BRASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_COPPER), SHORT_COPPER_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ZINC), SHORT_ZINC_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LOCKED_ANDESITE), SHORT_LOCKED_ANDESITE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LOCKED_BRASS), SHORT_LOCKED_BRASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LOCKED_COPPER), SHORT_LOCKED_COPPER_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LOCKED_ZINC), SHORT_LOCKED_ZINC_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ANDESITE), TALL_ANDESITE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BRASS), TALL_BRASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_COPPER), TALL_COPPER_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ZINC), TALL_ZINC_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LOCKED_ANDESITE), TALL_LOCKED_ANDESITE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LOCKED_BRASS), TALL_LOCKED_BRASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LOCKED_COPPER), TALL_LOCKED_COPPER_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LOCKED_ZINC), TALL_LOCKED_ZINC_DOOR);

        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ECHO), SHORT_ECHO_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ECHO), TALL_ECHO_DOOR);
        
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ECO_AZALEA), SHORT_ECO_AZALEA_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ECO_FLOWERING_AZALEA), SHORT_ECO_FLOWERING_AZALEA_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ECO_COCONUT), SHORT_ECO_COCONUT_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ECO_WALNUT), SHORT_ECO_WALNUT_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ECO_AZALEA), TALL_ECO_AZALEA_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ECO_FLOWERING_AZALEA), TALL_ECO_FLOWERING_AZALEA_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ECO_COCONUT), TALL_ECO_COCONUT_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ECO_WALNUT), TALL_ECO_WALNUT_DOOR);

        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SOULBLIGHT), SHORT_SOULBLIGHT_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WHISTLECANE), SHORT_WHISTLECANE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SOULBLIGHT), TALL_SOULBLIGHT_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WHISTLECANE), TALL_WHISTLECANE_DOOR);

        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GE_CYPRESS), SHORT_GE_CYPRESS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GE_MUDDY_OAK), SHORT_GE_MUDDY_OAK_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GE_CYPRESS), TALL_GE_CYPRESS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GE_MUDDY_OAK), TALL_GE_MUDDY_OAK_DOOR);

        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_DARK_IRON), SHORT_DARK_IRON_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DARK_IRON), TALL_DARK_IRON_DOOR);

        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EDIFIED), SHORT_EDIFIED_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EDIFIED), TALL_EDIFIED_DOOR);
		
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BLOODSHROOM), SHORT_BLOODSHROOM_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GREENHEART), SHORT_GREENHEART_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SKYROOT), SHORT_SKYROOT_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BLOODSHROOM), TALL_BLOODSHROOM_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GREENHEART), TALL_GREENHEART_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SKYROOT), TALL_SKYROOT_DOOR);

        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_IRON_GLASS), SHORT_IRON_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_OAK_GLASS), SHORT_OAK_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SPRUCE_GLASS), SHORT_SPRUCE_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BIRCH_GLASS), SHORT_BIRCH_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_JUNGLE_GLASS), SHORT_JUNGLE_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ACACIA_GLASS), SHORT_ACACIA_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_DARK_OAK_GLASS), SHORT_DARK_OAK_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MANGROVE_GLASS), SHORT_MANGROVE_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CRIMSON_GLASS), SHORT_CRIMSON_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WARPED_GLASS), SHORT_WARPED_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_IRON_GLASS), TALL_IRON_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_OAK_GLASS), TALL_OAK_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SPRUCE_GLASS), TALL_SPRUCE_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BIRCH_GLASS), TALL_BIRCH_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_JUNGLE_GLASS), TALL_JUNGLE_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ACACIA_GLASS), TALL_ACACIA_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DARK_OAK_GLASS), TALL_DARK_OAK_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANGROVE_GLASS), TALL_MANGROVE_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CRIMSON_GLASS), TALL_CRIMSON_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WARPED_GLASS), TALL_WARPED_GLASS_DOOR);
		
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PROMENADE_CHERRY_OAK), SHORT_PROMENADE_CHERRY_OAK_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PROMENADE_DARK_AMARANTH), SHORT_PROMENADE_DARK_AMARANTH_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PROMENADE_PALM), SHORT_PROMENADE_PALM_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PROMENADE_CHERRY_OAK), TALL_PROMENADE_CHERRY_OAK_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PROMENADE_DARK_AMARANTH), TALL_PROMENADE_DARK_AMARANTH_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PROMENADE_PALM), TALL_PROMENADE_PALM_DOOR);
        
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_BAOBAB), SHORT_RUE_BAOBAB_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_BLACKWOOD), SHORT_RUE_BLACKWOOD_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_BRIMWOOD), SHORT_RUE_BRIMWOOD_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_CHERRY), SHORT_RUE_CHERRY_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_CYPRESS), SHORT_RUE_CYPRESS_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_DEAD), SHORT_RUE_DEAD_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_EUCALYPTUS), SHORT_RUE_EUCALYPTUS_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_JOSHUA), SHORT_RUE_JOSHUA_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_LARCH), SHORT_RUE_LARCH_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_MAPLE), SHORT_RUE_MAPLE_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_MAUVE), SHORT_RUE_MAUVE_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_PALM), SHORT_RUE_PALM_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_PINE), SHORT_RUE_PINE_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_REDWOOD), SHORT_RUE_REDWOOD_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_WILLOW), SHORT_RUE_WILLOW_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_BAOBAB), TALL_RUE_BAOBAB_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_BLACKWOOD), TALL_RUE_BLACKWOOD_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_BRIMWOOD), TALL_RUE_BRIMWOOD_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_CHERRY), TALL_RUE_CHERRY_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_CYPRESS), TALL_RUE_CYPRESS_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_DEAD), TALL_RUE_DEAD_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_EUCALYPTUS), TALL_RUE_EUCALYPTUS_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_JOSHUA), TALL_RUE_JOSHUA_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_LARCH), TALL_RUE_LARCH_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_MAPLE), TALL_RUE_MAPLE_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_MAUVE), TALL_RUE_MAUVE_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_PALM), TALL_RUE_PALM_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_PINE), TALL_RUE_PINE_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_REDWOOD), TALL_RUE_REDWOOD_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_WILLOW), TALL_RUE_WILLOW_DOOR);
		
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GINGERBREAD), SHORT_GINGERBREAD_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GINGERBREAD), TALL_GINGERBREAD_DOOR);

		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GOLD), SHORT_GOLD_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_NETHERITE), SHORT_NETHERITE_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GOLD), TALL_GOLD_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_NETHERITE), TALL_NETHERITE_DOOR);
		
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUBBER), SHORT_RUBBER_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUBBER), TALL_RUBBER_DOOR);

		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TERRESTRIA_CYPRESS), SHORT_TERRESTRIA_CYPRESS_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TERRESTRIA_HEMLOCK), SHORT_TERRESTRIA_HEMLOCK_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TERRESTRIA_JAPANESE_MAPLE), SHORT_TERRESTRIA_JAPANESE_MAPLE_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TERRESTRIA_RAINBOW_EUCALYPTUS), SHORT_TERRESTRIA_RAINBOW_EUCALYPTUS_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TERRESTRIA_REDWOOD), SHORT_TERRESTRIA_REDWOOD_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TERRESTRIA_RUBBER), SHORT_TERRESTRIA_RUBBER_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TERRESTRIA_SAKURA), SHORT_TERRESTRIA_SAKURA_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TERRESTRIA_WILLOW), SHORT_TERRESTRIA_WILLOW_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TERRESTRIA_YUCCA_PALM), SHORT_TERRESTRIA_YUCCA_PALM_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TERRESTRIA_CYPRESS), TALL_TERRESTRIA_CYPRESS_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TERRESTRIA_HEMLOCK), TALL_TERRESTRIA_HEMLOCK_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TERRESTRIA_JAPANESE_MAPLE), TALL_TERRESTRIA_JAPANESE_MAPLE_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TERRESTRIA_RAINBOW_EUCALYPTUS), TALL_TERRESTRIA_RAINBOW_EUCALYPTUS_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TERRESTRIA_REDWOOD), TALL_TERRESTRIA_REDWOOD_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TERRESTRIA_RUBBER), TALL_TERRESTRIA_RUBBER_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TERRESTRIA_SAKURA), TALL_TERRESTRIA_SAKURA_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TERRESTRIA_WILLOW), TALL_TERRESTRIA_WILLOW_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TERRESTRIA_YUCCA_PALM), TALL_TERRESTRIA_YUCCA_PALM_DOOR);

		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TRAVERSE_FIR), SHORT_TRAVERSE_FIR_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TRAVERSE_FIR), TALL_TRAVERSE_FIR_DOOR);

		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_STRIPPED_BAMBOO), SHORT_STRIPPED_BAMBOO_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_STRIPPED_BAMBOO), TALL_STRIPPED_BAMBOO_DOOR);
		
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CANOPY), SHORT_CANOPY_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_DARKWOOD), SHORT_DARKWOOD_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MINEWOOD), SHORT_MINEWOOD_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SORTINGWOOD), SHORT_SORTINGWOOD_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TIMEWOOD), SHORT_TIMEWOOD_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TRANSWOOD), SHORT_TRANSWOOD_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TWILIGHT_MANGROVE), SHORT_TWILIGHT_MANGROVE_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TWILIGHT_OAK), SHORT_TWILIGHT_OAK_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CANOPY), TALL_CANOPY_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DARKWOOD), TALL_DARKWOOD_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MINEWOOD), TALL_MINEWOOD_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SORTINGWOOD), TALL_SORTINGWOOD_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TIMEWOOD), TALL_TIMEWOOD_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TRANSWOOD), TALL_TRANSWOOD_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TWILIGHT_MANGROVE), TALL_TWILIGHT_MANGROVE_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TWILIGHT_OAK), TALL_TWILIGHT_OAK_DOOR);

		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TOWERWOOD), SHORT_TOWERWOOD_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TOWERWOOD), TALL_TOWERWOOD_DOOR);
		
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WW_BAOBAB), SHORT_WW_BAOBAB_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WW_CYPRESS), SHORT_WW_CYPRESS_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WW_PALM), SHORT_WW_PALM_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WW_BAOBAB), TALL_WW_BAOBAB_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WW_CYPRESS), TALL_WW_CYPRESS_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WW_PALM), TALL_WW_PALM_DOOR);

		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SOUL_COPPER), SHORT_SOUL_COPPER_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SOUL_COPPER), TALL_SOUL_COPPER_DOOR);

		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MYSTICAL_OAK), SHORT_MYSTICAL_OAK_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MYSTICAL_OAK), TALL_MYSTICAL_OAK_DOOR);

        //Register all those Chipped doors.
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_HEAVY), TALL_CHIPPED_OAK_HEAVY_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_DUAL_PANELED), TALL_CHIPPED_OAK_DUAL_PANELED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_PRESSED), TALL_CHIPPED_OAK_PRESSED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_SHACK), TALL_CHIPPED_OAK_SHACK_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_FORTIFIED), TALL_CHIPPED_OAK_FORTIFIED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_SLIDING), TALL_CHIPPED_OAK_SLIDING_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_SCREEN), TALL_CHIPPED_OAK_SCREEN_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_GATED), TALL_CHIPPED_OAK_GATED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_GLASS), TALL_CHIPPED_OAK_GLASS_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_WINDOWED), TALL_CHIPPED_OAK_WINDOWED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_TILED), TALL_CHIPPED_OAK_TILED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_TILE_WINDOWED), TALL_CHIPPED_OAK_TILE_WINDOWED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_SECRET), TALL_CHIPPED_OAK_SECRET_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_BOARDED), TALL_CHIPPED_OAK_BOARDED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_PAPER), TALL_CHIPPED_OAK_PAPER_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_BEACH), TALL_CHIPPED_OAK_BEACH_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_BARRED), TALL_CHIPPED_OAK_BARRED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_PANELED), TALL_CHIPPED_OAK_PANELED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_SUPPORTED), TALL_CHIPPED_OAK_SUPPORTED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_OVERGROWN), TALL_CHIPPED_OAK_OVERGROWN_DOOR);
    
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_HEAVY), TALL_CHIPPED_SPRUCE_HEAVY_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_DUAL_PANELED), TALL_CHIPPED_SPRUCE_DUAL_PANELED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_PRESSED), TALL_CHIPPED_SPRUCE_PRESSED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_SHACK), TALL_CHIPPED_SPRUCE_SHACK_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_FORTIFIED), TALL_CHIPPED_SPRUCE_FORTIFIED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_SLIDING), TALL_CHIPPED_SPRUCE_SLIDING_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_SCREEN), TALL_CHIPPED_SPRUCE_SCREEN_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_GATED), TALL_CHIPPED_SPRUCE_GATED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_GLASS), TALL_CHIPPED_SPRUCE_GLASS_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_WINDOWED), TALL_CHIPPED_SPRUCE_WINDOWED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_TILED), TALL_CHIPPED_SPRUCE_TILED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_TILE_WINDOWED), TALL_CHIPPED_SPRUCE_TILE_WINDOWED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_SECRET), TALL_CHIPPED_SPRUCE_SECRET_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_MODERN), TALL_CHIPPED_SPRUCE_MODERN_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_PAPER), TALL_CHIPPED_SPRUCE_PAPER_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_BEACH), TALL_CHIPPED_SPRUCE_BEACH_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_BARRED), TALL_CHIPPED_SPRUCE_BARRED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_PANELED), TALL_CHIPPED_SPRUCE_PANELED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_SUPPORTED), TALL_CHIPPED_SPRUCE_SUPPORTED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_OVERGROWN), TALL_CHIPPED_SPRUCE_OVERGROWN_DOOR);

		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_HEAVY), TALL_CHIPPED_BIRCH_HEAVY_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_DUAL_PANELED), TALL_CHIPPED_BIRCH_DUAL_PANELED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_PRESSED), TALL_CHIPPED_BIRCH_PRESSED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_SHACK), TALL_CHIPPED_BIRCH_SHACK_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_FORTIFIED), TALL_CHIPPED_BIRCH_FORTIFIED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_SLIDING), TALL_CHIPPED_BIRCH_SLIDING_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_SCREEN), TALL_CHIPPED_BIRCH_SCREEN_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_GATED), TALL_CHIPPED_BIRCH_GATED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_GLASS), TALL_CHIPPED_BIRCH_GLASS_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_WINDOWED), TALL_CHIPPED_BIRCH_WINDOWED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_TILED), TALL_CHIPPED_BIRCH_TILED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_TILE_WINDOWED), TALL_CHIPPED_BIRCH_TILE_WINDOWED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_SECRET), TALL_CHIPPED_BIRCH_SECRET_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_MODERN), TALL_CHIPPED_BIRCH_MODERN_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_BOARDED), TALL_CHIPPED_BIRCH_BOARDED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_BEACH), TALL_CHIPPED_BIRCH_BEACH_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_BARRED), TALL_CHIPPED_BIRCH_BARRED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_PANELED), TALL_CHIPPED_BIRCH_PANELED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_SUPPORTED), TALL_CHIPPED_BIRCH_SUPPORTED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_OVERGROWN), TALL_CHIPPED_BIRCH_OVERGROWN_DOOR);

		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_HEAVY), TALL_CHIPPED_JUNGLE_HEAVY_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_DUAL_PANELED), TALL_CHIPPED_JUNGLE_DUAL_PANELED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_PRESSED), TALL_CHIPPED_JUNGLE_PRESSED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_SHACK), TALL_CHIPPED_JUNGLE_SHACK_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_FORTIFIED), TALL_CHIPPED_JUNGLE_FORTIFIED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_SLIDING), TALL_CHIPPED_JUNGLE_SLIDING_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_SCREEN), TALL_CHIPPED_JUNGLE_SCREEN_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_GATED), TALL_CHIPPED_JUNGLE_GATED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_GLASS), TALL_CHIPPED_JUNGLE_GLASS_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_WINDOWED), TALL_CHIPPED_JUNGLE_WINDOWED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_TILED), TALL_CHIPPED_JUNGLE_TILED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_TILE_WINDOWED), TALL_CHIPPED_JUNGLE_TILE_WINDOWED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_SECRET), TALL_CHIPPED_JUNGLE_SECRET_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_MODERN), TALL_CHIPPED_JUNGLE_MODERN_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_BOARDED), TALL_CHIPPED_JUNGLE_BOARDED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_PAPER), TALL_CHIPPED_JUNGLE_PAPER_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_BARRED), TALL_CHIPPED_JUNGLE_BARRED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_PANELED), TALL_CHIPPED_JUNGLE_PANELED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_SUPPORTED), TALL_CHIPPED_JUNGLE_SUPPORTED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_OVERGROWN), TALL_CHIPPED_JUNGLE_OVERGROWN_DOOR);

		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_HEAVY), TALL_CHIPPED_ACACIA_HEAVY_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_DUAL_PANELED), TALL_CHIPPED_ACACIA_DUAL_PANELED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_PRESSED), TALL_CHIPPED_ACACIA_PRESSED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_SHACK), TALL_CHIPPED_ACACIA_SHACK_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_FORTIFIED), TALL_CHIPPED_ACACIA_FORTIFIED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_SLIDING), TALL_CHIPPED_ACACIA_SLIDING_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_SCREEN), TALL_CHIPPED_ACACIA_SCREEN_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_GATED), TALL_CHIPPED_ACACIA_GATED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_GLASS), TALL_CHIPPED_ACACIA_GLASS_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_WINDOWED), TALL_CHIPPED_ACACIA_WINDOWED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_TILED), TALL_CHIPPED_ACACIA_TILED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_TILE_WINDOWED), TALL_CHIPPED_ACACIA_TILE_WINDOWED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_SECRET), TALL_CHIPPED_ACACIA_SECRET_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_MODERN), TALL_CHIPPED_ACACIA_MODERN_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_BOARDED), TALL_CHIPPED_ACACIA_BOARDED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_PAPER), TALL_CHIPPED_ACACIA_PAPER_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_BEACH), TALL_CHIPPED_ACACIA_BEACH_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_PANELED), TALL_CHIPPED_ACACIA_PANELED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_SUPPORTED), TALL_CHIPPED_ACACIA_SUPPORTED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_OVERGROWN), TALL_CHIPPED_ACACIA_OVERGROWN_DOOR);

		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_HEAVY), TALL_CHIPPED_DARK_OAK_HEAVY_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_DUAL_PANELED), TALL_CHIPPED_DARK_OAK_DUAL_PANELED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_PRESSED), TALL_CHIPPED_DARK_OAK_PRESSED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_SHACK), TALL_CHIPPED_DARK_OAK_SHACK_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_FORTIFIED), TALL_CHIPPED_DARK_OAK_FORTIFIED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_SLIDING), TALL_CHIPPED_DARK_OAK_SLIDING_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_SCREEN), TALL_CHIPPED_DARK_OAK_SCREEN_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_GATED), TALL_CHIPPED_DARK_OAK_GATED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_GLASS), TALL_CHIPPED_DARK_OAK_GLASS_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_WINDOWED), TALL_CHIPPED_DARK_OAK_WINDOWED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_TILED), TALL_CHIPPED_DARK_OAK_TILED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_TILE_WINDOWED), TALL_CHIPPED_DARK_OAK_TILE_WINDOWED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_SECRET), TALL_CHIPPED_DARK_OAK_SECRET_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_MODERN), TALL_CHIPPED_DARK_OAK_MODERN_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_BOARDED), TALL_CHIPPED_DARK_OAK_BOARDED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_PAPER), TALL_CHIPPED_DARK_OAK_PAPER_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_BEACH), TALL_CHIPPED_DARK_OAK_BEACH_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_BARRED), TALL_CHIPPED_DARK_OAK_BARRED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_SUPPORTED), TALL_CHIPPED_DARK_OAK_SUPPORTED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_OVERGROWN), TALL_CHIPPED_DARK_OAK_OVERGROWN_DOOR);

		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_HEAVY), TALL_CHIPPED_MANGROVE_HEAVY_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_DUAL_PANELED), TALL_CHIPPED_MANGROVE_DUAL_PANELED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_PRESSED), TALL_CHIPPED_MANGROVE_PRESSED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_SHACK), TALL_CHIPPED_MANGROVE_SHACK_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_FORTIFIED), TALL_CHIPPED_MANGROVE_FORTIFIED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_SLIDING), TALL_CHIPPED_MANGROVE_SLIDING_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_SCREEN), TALL_CHIPPED_MANGROVE_SCREEN_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_GATED), TALL_CHIPPED_MANGROVE_GATED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_GLASS), TALL_CHIPPED_MANGROVE_GLASS_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_WINDOWED), TALL_CHIPPED_MANGROVE_WINDOWED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_TILED), TALL_CHIPPED_MANGROVE_TILED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_TILE_WINDOWED), TALL_CHIPPED_MANGROVE_TILE_WINDOWED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_SECRET), TALL_CHIPPED_MANGROVE_SECRET_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_MODERN), TALL_CHIPPED_MANGROVE_MODERN_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_BOARDED), TALL_CHIPPED_MANGROVE_BOARDED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_PAPER), TALL_CHIPPED_MANGROVE_PAPER_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_BEACH), TALL_CHIPPED_MANGROVE_BEACH_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_BARRED), TALL_CHIPPED_MANGROVE_BARRED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_PANELED), TALL_CHIPPED_MANGROVE_PANELED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_SUPPORTED), TALL_CHIPPED_MANGROVE_SUPPORTED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_OVERGROWN), TALL_CHIPPED_MANGROVE_OVERGROWN_DOOR);

		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_HEAVY), TALL_CHIPPED_CRIMSON_HEAVY_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_DUAL_PANELED), TALL_CHIPPED_CRIMSON_DUAL_PANELED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_PRESSED), TALL_CHIPPED_CRIMSON_PRESSED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_SHACK), TALL_CHIPPED_CRIMSON_SHACK_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_FORTIFIED), TALL_CHIPPED_CRIMSON_FORTIFIED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_SLIDING), TALL_CHIPPED_CRIMSON_SLIDING_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_SCREEN), TALL_CHIPPED_CRIMSON_SCREEN_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_GATED), TALL_CHIPPED_CRIMSON_GATED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_GLASS), TALL_CHIPPED_CRIMSON_GLASS_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_WINDOWED), TALL_CHIPPED_CRIMSON_WINDOWED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_TILED), TALL_CHIPPED_CRIMSON_TILED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_TILE_WINDOWED), TALL_CHIPPED_CRIMSON_TILE_WINDOWED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_SECRET), TALL_CHIPPED_CRIMSON_SECRET_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_MODERN), TALL_CHIPPED_CRIMSON_MODERN_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_BOARDED), TALL_CHIPPED_CRIMSON_BOARDED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_PAPER), TALL_CHIPPED_CRIMSON_PAPER_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_BEACH), TALL_CHIPPED_CRIMSON_BEACH_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_BARRED), TALL_CHIPPED_CRIMSON_BARRED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_PANELED), TALL_CHIPPED_CRIMSON_PANELED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_OVERGROWN), TALL_CHIPPED_CRIMSON_OVERGROWN_DOOR);

		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_HEAVY), TALL_CHIPPED_WARPED_HEAVY_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_DUAL_PANELED), TALL_CHIPPED_WARPED_DUAL_PANELED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_PRESSED), TALL_CHIPPED_WARPED_PRESSED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_SHACK), TALL_CHIPPED_WARPED_SHACK_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_FORTIFIED), TALL_CHIPPED_WARPED_FORTIFIED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_SLIDING), TALL_CHIPPED_WARPED_SLIDING_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_SCREEN), TALL_CHIPPED_WARPED_SCREEN_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_GATED), TALL_CHIPPED_WARPED_GATED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_GLASS), TALL_CHIPPED_WARPED_GLASS_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_WINDOWED), TALL_CHIPPED_WARPED_WINDOWED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_TILED), TALL_CHIPPED_WARPED_TILED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_TILE_WINDOWED), TALL_CHIPPED_WARPED_TILE_WINDOWED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_SECRET), TALL_CHIPPED_WARPED_SECRET_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_MODERN), TALL_CHIPPED_WARPED_MODERN_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_BOARDED), TALL_CHIPPED_WARPED_BOARDED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_PAPER), TALL_CHIPPED_WARPED_PAPER_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_BEACH), TALL_CHIPPED_WARPED_BEACH_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_BARRED), TALL_CHIPPED_WARPED_BARRED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_PANELED), TALL_CHIPPED_WARPED_PANELED_DOOR);
		Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_SUPPORTED), TALL_CHIPPED_WARPED_SUPPORTED_DOOR);
		
        //Register all those Macaw doors.
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_STORE), TALL_MACAW_STORE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SLIDING_GLASS), TALL_MACAW_SLIDING_GLASS_DOOR);
        
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JAIL), TALL_MACAW_JAIL_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL), TALL_MACAW_METAL_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_HOSPITAL), TALL_MACAW_METAL_HOSPITAL_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_REINFORCED), TALL_MACAW_METAL_REINFORCED_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_WARNING), TALL_MACAW_METAL_WARNING_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_WINDOWED), TALL_MACAW_METAL_WINDOWED_DOOR);

        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BARN), TALL_MACAW_OAK_BARN_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BARN), TALL_MACAW_SPRUCE_BARN_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BARN), TALL_MACAW_BIRCH_BARN_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_BARN), TALL_MACAW_JUNGLE_BARN_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BARN), TALL_MACAW_ACACIA_BARN_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BARN), TALL_MACAW_DARK_OAK_BARN_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BARN), TALL_MACAW_MANGROVE_BARN_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_BARN), TALL_MACAW_BAMBOO_BARN_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_BARN), TALL_MACAW_CRIMSON_BARN_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_BARN), TALL_MACAW_WARPED_BARN_DOOR);

        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BARN_GLASS), TALL_MACAW_OAK_BARN_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BARN_GLASS), TALL_MACAW_SPRUCE_BARN_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BARN_GLASS), TALL_MACAW_BIRCH_BARN_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_BARN_GLASS), TALL_MACAW_JUNGLE_BARN_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BARN_GLASS), TALL_MACAW_ACACIA_BARN_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BARN_GLASS), TALL_MACAW_DARK_OAK_BARN_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BARN_GLASS), TALL_MACAW_MANGROVE_BARN_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_BARN_GLASS), TALL_MACAW_BAMBOO_BARN_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_BARN_GLASS), TALL_MACAW_CRIMSON_BARN_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_BARN_GLASS), TALL_MACAW_WARPED_BARN_GLASS_DOOR);

        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_STABLE), TALL_MACAW_OAK_STABLE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_STABLE), TALL_MACAW_SPRUCE_STABLE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_STABLE), TALL_MACAW_BIRCH_STABLE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_STABLE), TALL_MACAW_JUNGLE_STABLE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_STABLE), TALL_MACAW_ACACIA_STABLE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_STABLE), TALL_MACAW_DARK_OAK_STABLE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_STABLE), TALL_MACAW_MANGROVE_STABLE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_STABLE), TALL_MACAW_BAMBOO_STABLE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_STABLE), TALL_MACAW_CRIMSON_STABLE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_STABLE), TALL_MACAW_WARPED_STABLE_DOOR);

        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_STABLE_HEAD), TALL_MACAW_OAK_STABLE_HEAD_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_STABLE_HEAD), TALL_MACAW_SPRUCE_STABLE_HEAD_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_STABLE_HEAD), TALL_MACAW_BIRCH_STABLE_HEAD_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_STABLE_HEAD), TALL_MACAW_JUNGLE_STABLE_HEAD_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_STABLE_HEAD), TALL_MACAW_ACACIA_STABLE_HEAD_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_STABLE_HEAD), TALL_MACAW_DARK_OAK_STABLE_HEAD_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_STABLE_HEAD), TALL_MACAW_MANGROVE_STABLE_HEAD_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_STABLE_HEAD), TALL_MACAW_BAMBOO_STABLE_HEAD_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_STABLE_HEAD), TALL_MACAW_CRIMSON_STABLE_HEAD_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_STABLE_HEAD), TALL_MACAW_WARPED_STABLE_HEAD_DOOR);

        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BARK_GLASS), TALL_MACAW_OAK_BARK_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BARK_GLASS), TALL_MACAW_SPRUCE_BARK_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BARK_GLASS), TALL_MACAW_BIRCH_BARK_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_BARK_GLASS), TALL_MACAW_JUNGLE_BARK_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BARK_GLASS), TALL_MACAW_ACACIA_BARK_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BARK_GLASS), TALL_MACAW_DARK_OAK_BARK_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BARK_GLASS), TALL_MACAW_MANGROVE_BARK_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_BARK_GLASS), TALL_MACAW_BAMBOO_BARK_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_STEM_GLASS), TALL_MACAW_CRIMSON_STEM_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_STEM_GLASS), TALL_MACAW_WARPED_STEM_GLASS_DOOR);
        
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_GLASS), TALL_MACAW_OAK_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_GLASS), TALL_MACAW_SPRUCE_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_GLASS), TALL_MACAW_BIRCH_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_GLASS), TALL_MACAW_JUNGLE_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_GLASS), TALL_MACAW_ACACIA_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_GLASS), TALL_MACAW_DARK_OAK_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_GLASS), TALL_MACAW_MANGROVE_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_GLASS), TALL_MACAW_BAMBOO_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_GLASS), TALL_MACAW_CRIMSON_GLASS_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_GLASS), TALL_MACAW_WARPED_GLASS_DOOR);

        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_MODERN), TALL_MACAW_OAK_MODERN_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_MODERN), TALL_MACAW_SPRUCE_MODERN_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_MODERN), TALL_MACAW_BIRCH_MODERN_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_MODERN), TALL_MACAW_JUNGLE_MODERN_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_MODERN), TALL_MACAW_ACACIA_MODERN_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_MODERN), TALL_MACAW_DARK_OAK_MODERN_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_MODERN), TALL_MACAW_MANGROVE_MODERN_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_MODERN), TALL_MACAW_BAMBOO_MODERN_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_MODERN), TALL_MACAW_CRIMSON_MODERN_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_MODERN), TALL_MACAW_WARPED_MODERN_DOOR);

        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_JAPANESE), TALL_MACAW_OAK_JAPANESE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_JAPANESE), TALL_MACAW_SPRUCE_JAPANESE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_JAPANESE), TALL_MACAW_BIRCH_JAPANESE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_JAPANESE), TALL_MACAW_JUNGLE_JAPANESE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_JAPANESE), TALL_MACAW_ACACIA_JAPANESE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_JAPANESE), TALL_MACAW_DARK_OAK_JAPANESE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_JAPANESE), TALL_MACAW_MANGROVE_JAPANESE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_JAPANESE), TALL_MACAW_BAMBOO_JAPANESE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_JAPANESE), TALL_MACAW_CRIMSON_JAPANESE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_JAPANESE), TALL_MACAW_WARPED_JAPANESE_DOOR);

        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_JAPANESE2), TALL_MACAW_OAK_JAPANESE2_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_JAPANESE2), TALL_MACAW_SPRUCE_JAPANESE2_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_JAPANESE2), TALL_MACAW_BIRCH_JAPANESE2_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_JAPANESE2), TALL_MACAW_JUNGLE_JAPANESE2_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_JAPANESE2), TALL_MACAW_ACACIA_JAPANESE2_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_JAPANESE2), TALL_MACAW_DARK_OAK_JAPANESE2_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_JAPANESE2), TALL_MACAW_MANGROVE_JAPANESE2_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_JAPANESE2), TALL_MACAW_BAMBOO_JAPANESE2_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_JAPANESE2), TALL_MACAW_CRIMSON_JAPANESE2_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_JAPANESE2), TALL_MACAW_WARPED_JAPANESE2_DOOR);

        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_CLASSIC), TALL_MACAW_SPRUCE_CLASSIC_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_CLASSIC), TALL_MACAW_BIRCH_CLASSIC_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_CLASSIC), TALL_MACAW_JUNGLE_CLASSIC_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_CLASSIC), TALL_MACAW_ACACIA_CLASSIC_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_CLASSIC), TALL_MACAW_DARK_OAK_CLASSIC_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_CLASSIC), TALL_MACAW_MANGROVE_CLASSIC_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_CLASSIC), TALL_MACAW_BAMBOO_CLASSIC_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_CLASSIC), TALL_MACAW_CRIMSON_CLASSIC_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_CLASSIC), TALL_MACAW_WARPED_CLASSIC_DOOR);

        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_COTTAGE), TALL_MACAW_OAK_COTTAGE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_COTTAGE), TALL_MACAW_BIRCH_COTTAGE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_COTTAGE), TALL_MACAW_JUNGLE_COTTAGE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_COTTAGE), TALL_MACAW_ACACIA_COTTAGE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_COTTAGE), TALL_MACAW_DARK_OAK_COTTAGE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_COTTAGE), TALL_MACAW_MANGROVE_COTTAGE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_COTTAGE), TALL_MACAW_BAMBOO_COTTAGE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_COTTAGE), TALL_MACAW_CRIMSON_COTTAGE_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_COTTAGE), TALL_MACAW_WARPED_COTTAGE_DOOR);

        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_PAPER), TALL_MACAW_OAK_PAPER_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_PAPER), TALL_MACAW_SPRUCE_PAPER_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_PAPER), TALL_MACAW_JUNGLE_PAPER_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_PAPER), TALL_MACAW_ACACIA_PAPER_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_PAPER), TALL_MACAW_DARK_OAK_PAPER_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_PAPER), TALL_MACAW_MANGROVE_PAPER_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_PAPER), TALL_MACAW_BAMBOO_PAPER_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_PAPER), TALL_MACAW_CRIMSON_PAPER_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_PAPER), TALL_MACAW_WARPED_PAPER_DOOR);

        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BEACH), TALL_MACAW_OAK_BEACH_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BEACH), TALL_MACAW_SPRUCE_BEACH_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BEACH), TALL_MACAW_BIRCH_BEACH_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BEACH), TALL_MACAW_ACACIA_BEACH_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BEACH), TALL_MACAW_DARK_OAK_BEACH_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BEACH), TALL_MACAW_MANGROVE_BEACH_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_BEACH), TALL_MACAW_BAMBOO_BEACH_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_BEACH), TALL_MACAW_CRIMSON_BEACH_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_BEACH), TALL_MACAW_WARPED_BEACH_DOOR);

        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_TROPICAL), TALL_MACAW_OAK_TROPICAL_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_TROPICAL), TALL_MACAW_SPRUCE_TROPICAL_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_TROPICAL), TALL_MACAW_BIRCH_TROPICAL_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_TROPICAL), TALL_MACAW_JUNGLE_TROPICAL_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_TROPICAL), TALL_MACAW_DARK_OAK_TROPICAL_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_TROPICAL), TALL_MACAW_MANGROVE_TROPICAL_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_TROPICAL), TALL_MACAW_BAMBOO_TROPICAL_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_TROPICAL), TALL_MACAW_CRIMSON_TROPICAL_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_TROPICAL), TALL_MACAW_WARPED_TROPICAL_DOOR);

        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_FOUR_PANEL), TALL_MACAW_OAK_FOUR_PANEL_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_FOUR_PANEL), TALL_MACAW_SPRUCE_FOUR_PANEL_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_FOUR_PANEL), TALL_MACAW_BIRCH_FOUR_PANEL_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_FOUR_PANEL), TALL_MACAW_JUNGLE_FOUR_PANEL_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_FOUR_PANEL), TALL_MACAW_ACACIA_FOUR_PANEL_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_FOUR_PANEL), TALL_MACAW_MANGROVE_FOUR_PANEL_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_FOUR_PANEL), TALL_MACAW_BAMBOO_FOUR_PANEL_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_FOUR_PANEL), TALL_MACAW_CRIMSON_FOUR_PANEL_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_FOUR_PANEL), TALL_MACAW_WARPED_FOUR_PANEL_DOOR);

        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_SWAMP), TALL_MACAW_OAK_SWAMP_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_SWAMP), TALL_MACAW_SPRUCE_SWAMP_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_SWAMP), TALL_MACAW_BIRCH_SWAMP_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_SWAMP), TALL_MACAW_JUNGLE_SWAMP_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_SWAMP), TALL_MACAW_ACACIA_SWAMP_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_SWAMP), TALL_MACAW_DARK_OAK_SWAMP_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_SWAMP), TALL_MACAW_BAMBOO_SWAMP_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_SWAMP), TALL_MACAW_CRIMSON_SWAMP_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_SWAMP), TALL_MACAW_WARPED_SWAMP_DOOR);

        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BAMBOO), TALL_MACAW_OAK_BAMBOO_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BAMBOO), TALL_MACAW_SPRUCE_BAMBOO_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BAMBOO), TALL_MACAW_BIRCH_BAMBOO_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_BAMBOO), TALL_MACAW_JUNGLE_BAMBOO_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BAMBOO), TALL_MACAW_ACACIA_BAMBOO_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BAMBOO), TALL_MACAW_DARK_OAK_BAMBOO_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BAMBOO), TALL_MACAW_MANGROVE_BAMBOO_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_BAMBOO), TALL_MACAW_CRIMSON_BAMBOO_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_BAMBOO), TALL_MACAW_WARPED_BAMBOO_DOOR);
        
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_NETHER), TALL_MACAW_OAK_NETHER_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_NETHER), TALL_MACAW_SPRUCE_NETHER_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_NETHER), TALL_MACAW_BIRCH_NETHER_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_NETHER), TALL_MACAW_JUNGLE_NETHER_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_NETHER), TALL_MACAW_ACACIA_NETHER_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_NETHER), TALL_MACAW_DARK_OAK_NETHER_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_NETHER), TALL_MACAW_MANGROVE_NETHER_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_NETHER), TALL_MACAW_BAMBOO_NETHER_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_NETHER), TALL_MACAW_WARPED_NETHER_DOOR);

        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_MYSTIC), TALL_MACAW_OAK_MYSTIC_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_MYSTIC), TALL_MACAW_SPRUCE_MYSTIC_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_MYSTIC), TALL_MACAW_BIRCH_MYSTIC_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_MYSTIC), TALL_MACAW_JUNGLE_MYSTIC_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_MYSTIC), TALL_MACAW_ACACIA_MYSTIC_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_MYSTIC), TALL_MACAW_DARK_OAK_MYSTIC_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_MYSTIC), TALL_MACAW_MANGROVE_MYSTIC_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_MYSTIC), TALL_MACAW_BAMBOO_MYSTIC_DOOR);
        Registry.register(Registry.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_MYSTIC), TALL_MACAW_CRIMSON_MYSTIC_DOOR);
    }
	
    private static CreativeModeTab conditionalTabProperties(String modid, CreativeModeTab tab) {
    	return FabricLoader.getInstance().isModLoaded(modid) ? tab : null;
    }
}
