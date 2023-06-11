package com.fizzware.dramaticdoors.blocks;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DramaticDoors;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class DDBlocks {

	// Vanilla
    public static final Block SHORT_IRON_DOOR = new ShortDoorBlock(Blocks.IRON_DOOR, BlockSetType.IRON);
    public static final Block SHORT_OAK_DOOR = new ShortDoorBlock(Blocks.OAK_DOOR, BlockSetType.OAK);
    public static final Block SHORT_SPRUCE_DOOR = new ShortDoorBlock(Blocks.SPRUCE_DOOR, BlockSetType.SPRUCE);
    public static final Block SHORT_BIRCH_DOOR = new ShortDoorBlock(Blocks.BIRCH_DOOR, BlockSetType.BIRCH);
    public static final Block SHORT_JUNGLE_DOOR = new ShortDoorBlock(Blocks.JUNGLE_DOOR, BlockSetType.JUNGLE);
    public static final Block SHORT_ACACIA_DOOR = new ShortDoorBlock(Blocks.ACACIA_DOOR, BlockSetType.ACACIA);
    public static final Block SHORT_DARK_OAK_DOOR = new ShortDoorBlock(Blocks.DARK_OAK_DOOR, BlockSetType.DARK_OAK);
    public static final Block SHORT_MANGROVE_DOOR = new ShortDoorBlock(Blocks.MANGROVE_DOOR, BlockSetType.MANGROVE);
    public static final Block SHORT_BAMBOO_DOOR = new ShortDoorBlock(Blocks.BAMBOO_DOOR, BlockSetType.BAMBOO, FeatureFlags.UPDATE_1_20);
    public static final Block SHORT_CHERRY_DOOR = new ShortDoorBlock(Blocks.CHERRY_DOOR, BlockSetType.CHERRY, FeatureFlags.UPDATE_1_20);
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
    public static final Block TALL_BAMBOO_DOOR = new TallDoorBlock(Blocks.BAMBOO_DOOR, BlockSetType.BAMBOO, FeatureFlags.UPDATE_1_20);
    public static final Block TALL_CHERRY_DOOR = new TallDoorBlock(Blocks.CHERRY_DOOR, BlockSetType.CHERRY, FeatureFlags.UPDATE_1_20);
    public static final Block TALL_CRIMSON_DOOR = new TallDoorBlock(Blocks.CRIMSON_DOOR, BlockSetType.CRIMSON);
    public static final Block TALL_WARPED_DOOR = new TallDoorBlock(Blocks.WARPED_DOOR, BlockSetType.WARPED);

    // Team Aurora Mods
    public static final Block SHORT_JACARANDA_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("abundance", "jacaranda_door")), BlockSetType.OAK);
    public static final Block SHORT_REDBUD_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("abundance", "redbud_door")), BlockSetType.OAK);
    public static final Block SHORT_CYPRESS_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("bayou_blues", "cypress_door")), BlockSetType.OAK);
    public static final Block SHORT_BROWN_MUSHROOM_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("enhanced_mushrooms", "brown_mushroom_door")), BlockSetType.OAK);
    public static final Block SHORT_RED_MUSHROOM_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("enhanced_mushrooms", "red_mushroom_door")), BlockSetType.OAK);

    public static final Block TALL_JACARANDA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("abundance", "jacaranda_door")), BlockSetType.OAK);
    public static final Block TALL_REDBUD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("abundance", "redbud_door")), BlockSetType.OAK);
    public static final Block TALL_CYPRESS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("bayou_blues", "cypress_door")), BlockSetType.OAK);
    public static final Block TALL_BROWN_MUSHROOM_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("enhanced_mushrooms", "brown_mushroom_door")), BlockSetType.OAK);
    public static final Block TALL_RED_MUSHROOM_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("enhanced_mushrooms", "red_mushroom_door")), BlockSetType.OAK);
    
    // Ad Astra
    public static final Block SHORT_AERONOS_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("ad_astra", "aeronos_door")), BlockSetType.WARPED);
    public static final Block SHORT_GLACIAN_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("ad_astra", "glacian_door")), BlockSetType.WARPED);
    public static final Block SHORT_STROPHAR_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("ad_astra", "strophar_door")), BlockSetType.WARPED);
    public static final Block SHORT_STEEL_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("ad_astra", "steel_door"), Blocks.IRON_DOOR), BlockSetType.IRON);

    public static final Block TALL_AERONOS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("ad_astra", "aeronos_door")), BlockSetType.OAK);
    public static final Block TALL_GLACIAN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("ad_astra", "glacian_door")), BlockSetType.OAK);
    public static final Block TALL_STROPHAR_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("ad_astra", "strophar_door")), BlockSetType.OAK);
    public static final Block TALL_STEEL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("ad_astra", "steel_door"), Blocks.IRON_DOOR), BlockSetType.IRON);

    // Aether
    public static final Block SHORT_AETHER_SKYROOT_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("aether", "skyroot_door")), BlockSetType.OAK);

    public static final Block TALL_AETHER_SKYROOT_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("aether", "skyroot_door")), BlockSetType.OAK);
    
    // Architects Palette
    public static final Block SHORT_TWISTED_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("architects_palette", "twisted_door")), BlockSetType.WARPED);

    public static final Block TALL_TWISTED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("architects_palette", "twisted_door")), BlockSetType.WARPED);

    // Bamboo Everything
    public static final Block SHORT_BE_BAMBOO_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("bambooeverything", "bamboo_door")), BlockSetType.BAMBOO);
    public static final Block SHORT_BE_DRY_BAMBOO_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("bambooeverything", "dry_bamboo_door")), BlockSetType.BAMBOO);

    public static final Block TALL_BE_BAMBOO_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("bambooeverything", "bamboo_door")), BlockSetType.BAMBOO);
    public static final Block TALL_BE_DRY_BAMBOO_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("bambooeverything", "dry_bamboo_door")), BlockSetType.BAMBOO);
    
    // Better End
    public static final Block SHORT_TERMINITE_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betterend", "terminite_door"), Blocks.IRON_DOOR), BlockSetType.IRON);
    public static final Block SHORT_THALLASIUM_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betterend", "thallasium_door"), Blocks.IRON_DOOR), BlockSetType.IRON);
    public static final Block SHORT_DRAGON_TREE_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betterend", "dragon_tree_door")), BlockSetType.OAK);
    public static final Block SHORT_END_LOTUS_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betterend", "end_lotus_door")), BlockSetType.OAK);
    public static final Block SHORT_HELIX_TREE_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betterend", "helix_tree_door")), BlockSetType.OAK);
    public static final Block SHORT_JELLYSHROOM_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betterend", "jellyshroom_door")), BlockSetType.OAK);
    public static final Block SHORT_LACUGROVE_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betterend", "lacugrove_door")), BlockSetType.OAK);
    public static final Block SHORT_LUCERNIA_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betterend", "lucernia_door")), BlockSetType.OAK);
    public static final Block SHORT_MOSSY_GLOWSHROOM_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betterend", "mossy_glowshroom_door")), BlockSetType.WARPED);
    public static final Block SHORT_PYTHADENDRON_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betterend", "pythadendron_door")), BlockSetType.OAK);
    public static final Block SHORT_TENANEA_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betterend", "tenanea_door")), BlockSetType.OAK);
    public static final Block SHORT_UMBRELLA_TREE_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betterend", "umbrella_tree_door")), BlockSetType.WARPED);

    public static final Block TALL_TERMINITE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betterend", "terminite_door"), Blocks.IRON_DOOR), BlockSetType.IRON);
    public static final Block TALL_THALLASIUM_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betterend", "thallasium_door"), Blocks.IRON_DOOR), BlockSetType.IRON);
    public static final Block TALL_DRAGON_TREE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betterend", "dragon_tree_door")), BlockSetType.OAK);
    public static final Block TALL_END_LOTUS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betterend", "end_lotus_door")), BlockSetType.OAK);
    public static final Block TALL_HELIX_TREE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betterend", "helix_tree_door")), BlockSetType.OAK);
    public static final Block TALL_JELLYSHROOM_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betterend", "jellyshroom_door")), BlockSetType.OAK);
    public static final Block TALL_LACUGROVE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betterend", "lacugrove_door")), BlockSetType.OAK);
    public static final Block TALL_LUCERNIA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betterend", "lucernia_door")), BlockSetType.OAK);
    public static final Block TALL_MOSSY_GLOWSHROOM_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betterend", "mossy_glowshroom_door")), BlockSetType.WARPED);
    public static final Block TALL_PYTHADENDRON_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betterend", "pythadendron_door")), BlockSetType.OAK);
    public static final Block TALL_TENANEA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betterend", "tenanea_door")), BlockSetType.OAK);
    public static final Block TALL_UMBRELLA_TREE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betterend", "umbrella_tree_door")), BlockSetType.WARPED);
    
    // Better Nether
    public static final Block SHORT_ANCHOR_TREE_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betternether", "anchor_tree_door")), BlockSetType.CRIMSON);
    public static final Block SHORT_BONE_CIN_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betternether", "bone_cincinnasite_door")), BlockSetType.CRIMSON);
    public static final Block SHORT_BONE_REED_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betternether", "bone_reed_door")), BlockSetType.CRIMSON);
    public static final Block SHORT_MUSHROOM_FIR_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betternether", "mushroom_fir_door")), BlockSetType.CRIMSON);
    public static final Block SHORT_NETHER_MUSHROOM_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betternether", "nether_mushroom_door")), BlockSetType.CRIMSON);
    public static final Block SHORT_NETHER_REED_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betternether", "nether_reed_door")), BlockSetType.CRIMSON);
    public static final Block SHORT_NETHER_SAKURA_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betternether", "nether_sakura_door")), BlockSetType.CRIMSON);
    public static final Block SHORT_RUBEUS_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betternether", "rubeus_door")), BlockSetType.CRIMSON);
    public static final Block SHORT_STALAGNATE_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betternether", "stalagnate_door")), BlockSetType.CRIMSON);
    public static final Block SHORT_WART_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betternether", "wart_door")), BlockSetType.CRIMSON);
    public static final Block SHORT_BN_WILLOW_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betternether", "willow_door")), BlockSetType.CRIMSON);

    public static final Block TALL_ANCHOR_TREE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betternether", "anchor_tree_door")), BlockSetType.CRIMSON);
    public static final Block TALL_BONE_CIN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betternether", "bone_cincinnasite_door")), BlockSetType.CRIMSON);
    public static final Block TALL_BONE_REED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betternether", "bone_reed_door")), BlockSetType.CRIMSON);
    public static final Block TALL_MUSHROOM_FIR_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betternether", "mushroom_fir_door")), BlockSetType.CRIMSON);
    public static final Block TALL_NETHER_MUSHROOM_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betternether", "nether_mushroom_door")), BlockSetType.CRIMSON);
    public static final Block TALL_NETHER_REED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betternether", "nether_reed_door")), BlockSetType.CRIMSON);
    public static final Block TALL_NETHER_SAKURA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betternether", "nether_sakura_door")), BlockSetType.CRIMSON);
    public static final Block TALL_RUBEUS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betternether", "rubeus_door")), BlockSetType.CRIMSON);
    public static final Block TALL_STALAGNATE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betternether", "stalagnate_door")), BlockSetType.CRIMSON);
    public static final Block TALL_WART_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betternether", "wart_door")), BlockSetType.CRIMSON);
    public static final Block TALL_BN_WILLOW_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betternether", "willow_door")), BlockSetType.CRIMSON);
    
    // Bewitchment
    public static final Block SHORT_BW_CYPRESS_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("bewitchment", "cypress_door")), BlockSetType.MANGROVE);
    public static final Block SHORT_DRAGONS_BLOOD_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("bewitchment", "dragons_blood_door")), BlockSetType.MANGROVE);
    public static final Block SHORT_ELDER_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("bewitchment", "elder_door")), BlockSetType.MANGROVE);
    public static final Block SHORT_JUNIPER_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("bewitchment", "juniper_door")), BlockSetType.MANGROVE);

    public static final Block TALL_BW_CYPRESS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("bewitchment", "cypress_door")), BlockSetType.MANGROVE);
    public static final Block TALL_DRAGONS_BLOOD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("bewitchment", "dragons_blood_door")), BlockSetType.MANGROVE);
    public static final Block TALL_ELDER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("bewitchment", "elder_door")), BlockSetType.MANGROVE);
    public static final Block TALL_JUNIPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("bewitchment", "juniper_door")), BlockSetType.MANGROVE);

    // Bewitchment Plus
    public static final Block SHORT_YEW_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("bwplus", "yew_door")), BlockSetType.MANGROVE);

    public static final Block TALL_YEW_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("bwplus", "yew_door")), BlockSetType.MANGROVE);
    
    // Biomancy
    public static final Block SHORT_FLESH_DOOR = new ShortFleshDoorBlock(getBlockFromResourceLocation(new ResourceLocation("biomancy", "flesh_door")), BlockSetType.STONE);
    public static final Block SHORT_FULL_FLESH_DOOR = new ShortFullFleshDoorBlock(getBlockFromResourceLocation(new ResourceLocation("biomancy", "full_flesh_door")), BlockSetType.STONE);
    public static final Block SHORT_FLESHKIN_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("biomancy", "fleshkin_door")), BlockSetType.STONE);

    public static final Block TALL_FLESH_DOOR = new TallFleshDoorBlock(getBlockFromResourceLocation(new ResourceLocation("biomancy", "flesh_door")), BlockSetType.STONE);
    public static final Block TALL_FULL_FLESH_DOOR = new TallFullFleshDoorBlock(getBlockFromResourceLocation(new ResourceLocation("biomancy", "full_flesh_door")), BlockSetType.STONE);
    public static final Block TALL_FLESHKIN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("biomancy", "fleshkin_door")), BlockSetType.STONE);
    
    // Biome Makeover
    public static final Block SHORT_BM_ANCIENT_OAK_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("biomemakeover", "ancient_oak_door")), BlockSetType.OAK);
    public static final Block SHORT_BM_BLIGHTED_BALSA_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("biomemakeover", "blighted_balsa_door")), BlockSetType.OAK);
    public static final Block SHORT_BM_SWAMP_CYPRESS_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("biomemakeover", "swamp_cypress_door")), BlockSetType.OAK);
    public static final Block SHORT_BM_WILLOW_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("biomemakeover", "willow_door")), BlockSetType.OAK);

    public static final Block TALL_BM_ANCIENT_OAK_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("biomemakeover", "ancient_oak_door")), BlockSetType.OAK);
    public static final Block TALL_BM_BLIGHTED_BALSA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("biomemakeover", "blighted_balsa_door")), BlockSetType.OAK);
    public static final Block TALL_BM_SWAMP_CYPRESS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("biomemakeover", "swamp_cypress_door")), BlockSetType.OAK);
    public static final Block TALL_BM_WILLOW_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("biomemakeover", "willow_door")), BlockSetType.OAK);
    
    // Blockus
    public static final Block SHORT_BLOCKUS_BAMBOO_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("blockus", "bamboo_door")), BlockSetType.BAMBOO);
    public static final Block SHORT_BLOCKUS_BLACKSTONE_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("blockus", "blackstone_door")), BlockSetType.POLISHED_BLACKSTONE);
    public static final Block SHORT_BLOCKUS_CHARRED_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("blockus", "charred_door")), BlockSetType.CRIMSON);
    public static final Block SHORT_BLOCKUS_OBSIDIAN_REINFORCED_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("blockus", "obsidian_reinforced_door")), BlockSetType.IRON);
    public static final Block SHORT_BLOCKUS_PAPER_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("blockus", "paper_door")), BlockSetType.BIRCH);
    public static final Block SHORT_BLOCKUS_STONE_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("blockus", "stone_door")), BlockSetType.STONE);
    public static final Block SHORT_BLOCKUS_WHITE_OAK_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("blockus", "white_oak_door")), BlockSetType.OAK);

    public static final Block TALL_BLOCKUS_BAMBOO_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("blockus", "bamboo_door")), BlockSetType.BAMBOO);
    public static final Block TALL_BLOCKUS_BLACKSTONE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("blockus", "blackstone_door")), BlockSetType.POLISHED_BLACKSTONE);
    public static final Block TALL_BLOCKUS_CHARRED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("blockus", "charred_door")), BlockSetType.CRIMSON);
    public static final Block TALL_BLOCKUS_OBSIDIAN_REINFORCED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("blockus", "obsidian_reinforced_door")), BlockSetType.IRON);
    public static final Block TALL_BLOCKUS_PAPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("blockus", "paper_door")), BlockSetType.BIRCH);
    public static final Block TALL_BLOCKUS_STONE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("blockus", "stone_door")), BlockSetType.STONE);
    public static final Block TALL_BLOCKUS_WHITE_OAK_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("blockus", "white_oak_door")), BlockSetType.OAK);
    
    // The Ceilands
    public static final Block SHORT_CEILTRUNK_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("ceilands", "ceiltrunk_door")), BlockSetType.JUNGLE);
    public static final Block SHORT_LUZAWOOD_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("ceilands", "luzawood_door")), BlockSetType.OAK);

    public static final Block TALL_CEILTRUNK_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("ceilands", "ceiltrunk_door")), BlockSetType.JUNGLE);
    public static final Block TALL_LUZAWOOD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("ceilands", "luzawood_door")), BlockSetType.OAK);

    // Charm
    public static final Block SHORT_CHARM_AZALEA_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("charm", "azalea_door")), BlockSetType.OAK);
    public static final Block SHORT_CHARM_EBONY_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("charm", "ebony_door")), BlockSetType.JUNGLE);

    public static final Block TALL_CHARM_AZALEA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("charm", "azalea_door")), BlockSetType.OAK);
    public static final Block TALL_CHARM_EBONY_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("charm", "ebony_door")), BlockSetType.JUNGLE);

    // Cinderscapes
    public static final Block SHORT_SCORCHED_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("cinderscapes", "scorched_door")), BlockSetType.CRIMSON);
    public static final Block SHORT_UMBRAL_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("cinderscapes", "umbral_door")), BlockSetType.CRIMSON);

    public static final Block TALL_SCORCHED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("cinderscapes", "scorched_door")), BlockSetType.CRIMSON);
    public static final Block TALL_UMBRAL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("cinderscapes", "umbral_door")), BlockSetType.CRIMSON);
    
    // Cobblemon
    public static final Block SHORT_APRICORN_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("cobblemon", "apricorn_door")), BlockSetType.OAK);

    public static final Block TALL_APRICORN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("cobblemon", "apricorn_door")), BlockSetType.OAK);
    
    // Colourful Azaleas
    public static final Block SHORT_AZULE_AZALEA_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("colorfulazaleas", "azule_azalea_door")), BlockSetType.OAK);
    public static final Block SHORT_BRIGHT_AZALEA_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("colorfulazaleas", "bright_azalea_door")), BlockSetType.OAK);
    public static final Block SHORT_FISS_AZALEA_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("colorfulazaleas", "fiss_azalea_door")), BlockSetType.OAK);
    public static final Block SHORT_ROZE_AZALEA_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("colorfulazaleas", "roze_azalea_door")), BlockSetType.OAK);
    public static final Block SHORT_TECAL_AZALEA_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("colorfulazaleas", "tecal_azalea_door")), BlockSetType.OAK);
    public static final Block SHORT_TITANIUM_AZALEA_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("colorfulazaleas", "titanium_azalea_door")), BlockSetType.OAK);
    public static final Block SHORT_WALNUT_AZALEA_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("colorfulazaleas", "walnut_azalea_door")), BlockSetType.OAK);

    public static final Block TALL_AZULE_AZALEA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("colorfulazaleas", "azule_azalea_door")), BlockSetType.OAK);
    public static final Block TALL_BRIGHT_AZALEA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("colorfulazaleas", "bright_azalea_door")), BlockSetType.OAK);
    public static final Block TALL_FISS_AZALEA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("colorfulazaleas", "fiss_azalea_door")), BlockSetType.OAK);
    public static final Block TALL_ROZE_AZALEA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("colorfulazaleas", "roze_azalea_door")), BlockSetType.OAK);
    public static final Block TALL_TECAL_AZALEA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("colorfulazaleas", "tecal_azalea_door")), BlockSetType.OAK);
    public static final Block TALL_TITANIUM_AZALEA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("colorfulazaleas", "titanium_azalea_door")), BlockSetType.OAK);
    public static final Block TALL_WALNUT_AZALEA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("colorfulazaleas", "walnut_azalea_door")), BlockSetType.OAK);
    
    // Create: Deco
    public static final Block SHORT_ANDESITE_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("createdeco", "andesite_door"), Blocks.IRON_DOOR), BlockSetType.IRON);
    public static final Block SHORT_BRASS_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("createdeco", "brass_door"), Blocks.IRON_DOOR), BlockSetType.IRON);
    public static final Block SHORT_COPPER_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("createdeco", "copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON);
    public static final Block SHORT_ZINC_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("createdeco", "zinc_door"), Blocks.IRON_DOOR), BlockSetType.IRON);
    public static final Block SHORT_LOCKED_ANDESITE_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("createdeco", "locked_andesite_door"), Blocks.IRON_DOOR), BlockSetType.IRON);
    public static final Block SHORT_LOCKED_BRASS_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("createdeco", "locked_brass_door"), Blocks.IRON_DOOR), BlockSetType.IRON);
    public static final Block SHORT_LOCKED_COPPER_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("createdeco", "locked_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON);
    public static final Block SHORT_LOCKED_ZINC_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("createdeco", "locked_zinc_door"), Blocks.IRON_DOOR), BlockSetType.IRON);

    public static final Block TALL_ANDESITE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("createdeco", "andesite_door"), Blocks.IRON_DOOR), BlockSetType.IRON);
    public static final Block TALL_BRASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("createdeco", "brass_door"), Blocks.IRON_DOOR), BlockSetType.IRON);
    public static final Block TALL_COPPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("createdeco", "copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON);
    public static final Block TALL_ZINC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("createdeco", "zinc_door"), Blocks.IRON_DOOR), BlockSetType.IRON);
    public static final Block TALL_LOCKED_ANDESITE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("createdeco", "locked_andesite_door"), Blocks.IRON_DOOR), BlockSetType.IRON);
    public static final Block TALL_LOCKED_BRASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("createdeco", "locked_brass_door"), Blocks.IRON_DOOR), BlockSetType.IRON);
    public static final Block TALL_LOCKED_COPPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("createdeco", "locked_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON);
    public static final Block TALL_LOCKED_ZINC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("createdeco", "locked_zinc_door"), Blocks.IRON_DOOR), BlockSetType.IRON);
    
    // Deeper and Darker
    public static final Block SHORT_ECHO_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("deeperdarker", "echo_door")), BlockSetType.OAK);

    public static final Block TALL_ECHO_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("deeperdarker", "echo_door")), BlockSetType.OAK);
    
    // Ecologics
    public static final Block SHORT_ECO_AZALEA_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("ecologics", "azalea_door")), BlockSetType.OAK);
    public static final Block SHORT_ECO_FLOWERING_AZALEA_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("ecologics", "flowering_azalea_door")), BlockSetType.OAK);
    public static final Block SHORT_ECO_COCONUT_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("ecologics", "coconut_door")), BlockSetType.BAMBOO);
    public static final Block SHORT_ECO_WALNUT_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("ecologics", "walnut_door")), BlockSetType.OAK);

    public static final Block TALL_ECO_AZALEA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("ecologics", "azalea_door")), BlockSetType.OAK);
    public static final Block TALL_ECO_FLOWERING_AZALEA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("ecologics", "flowering_azalea_door")), BlockSetType.OAK);
    public static final Block TALL_ECO_COCONUT_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("ecologics", "coconut_door")), BlockSetType.BAMBOO);
    public static final Block TALL_ECO_WALNUT_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("ecologics", "walnut_door")), BlockSetType.OAK);
    
    // Gardens of the Dead
    public static final Block SHORT_SOULBLIGHT_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("gardens_of_the_dead", "soulblight_door")), BlockSetType.CRIMSON);
    public static final Block SHORT_WHISTLECANE_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("gardens_of_the_dead", "whistlecane_door")), BlockSetType.WARPED);

    public static final Block TALL_SOULBLIGHT_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("gardens_of_the_dead", "soulblight_door")), BlockSetType.CRIMSON);
    public static final Block TALL_WHISTLECANE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("gardens_of_the_dead", "whistlecane_door")), BlockSetType.WARPED);
    
    // Good Ending
    public static final Block SHORT_GE_CYPRESS_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("goodending", "cypress_door")), BlockSetType.MANGROVE);
    public static final Block SHORT_GE_MUDDY_OAK_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("goodending", "muddy_oak_door")), BlockSetType.OAK);

    public static final Block TALL_GE_CYPRESS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("goodending", "cypress_door")), BlockSetType.MANGROVE);
    public static final Block TALL_GE_MUDDY_OAK_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("goodending", "muddy_oak_door")), BlockSetType.OAK);

    // Graveyard
    public static final Block SHORT_DARK_IRON_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("graveyard", "dark_iron_door"), Blocks.IRON_DOOR), BlockSetType.IRON);

    public static final Block TALL_DARK_IRON_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("graveyard", "dark_iron_door"), Blocks.IRON_DOOR), BlockSetType.IRON);
    
    // Hexcasting
    public static final Block SHORT_EDIFIED_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("hexcasting", "edified_door")), BlockSetType.CRIMSON);

    public static final Block TALL_EDIFIED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("hexcasting", "edified_door")), BlockSetType.CRIMSON);
    
    // Modern Glass
    public static final Block SHORT_IRON_GLASS_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("glassdoor", "iron_glassdoor"), Blocks.IRON_DOOR), BlockSetType.IRON);
    public static final Block SHORT_OAK_GLASS_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("glassdoor", "oak_glassdoor")), BlockSetType.OAK);
    public static final Block SHORT_SPRUCE_GLASS_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("glassdoor", "spruce_glassdoor")), BlockSetType.SPRUCE);
    public static final Block SHORT_BIRCH_GLASS_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("glassdoor", "birch_glassdoor")), BlockSetType.BIRCH);
    public static final Block SHORT_JUNGLE_GLASS_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("glassdoor", "jungle_glassdoor")), BlockSetType.JUNGLE);
    public static final Block SHORT_ACACIA_GLASS_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("glassdoor", "acacia_glassdoor")), BlockSetType.ACACIA);
    public static final Block SHORT_DARK_OAK_GLASS_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("glassdoor", "dark_oak_glassdoor")), BlockSetType.DARK_OAK);
    public static final Block SHORT_MANGROVE_GLASS_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("glassdoor", "mangrove_glassdoor")), BlockSetType.MANGROVE);
    public static final Block SHORT_BAMBOO_GLASS_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("glassdoor", "bamboo_glassdoor")), BlockSetType.BAMBOO, FeatureFlags.UPDATE_1_20);
    public static final Block SHORT_CHERRY_GLASS_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("glassdoor", "cherry_glassdoor")), BlockSetType.CHERRY, FeatureFlags.UPDATE_1_20);
    public static final Block SHORT_CRIMSON_GLASS_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("glassdoor", "crimson_glassdoor")), BlockSetType.CRIMSON);
    public static final Block SHORT_WARPED_GLASS_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("glassdoor", "warped_glassdoor")), BlockSetType.WARPED);

    public static final Block TALL_IRON_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("glassdoor", "iron_glassdoor"), Blocks.IRON_DOOR), BlockSetType.IRON);
    public static final Block TALL_OAK_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("glassdoor", "oak_glassdoor")), BlockSetType.OAK);
    public static final Block TALL_SPRUCE_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("glassdoor", "spruce_glassdoor")), BlockSetType.SPRUCE);
    public static final Block TALL_BIRCH_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("glassdoor", "birch_glassdoor")), BlockSetType.BIRCH);
    public static final Block TALL_JUNGLE_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("glassdoor", "jungle_glassdoor")), BlockSetType.JUNGLE);
    public static final Block TALL_ACACIA_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("glassdoor", "acacia_glassdoor")), BlockSetType.ACACIA);
    public static final Block TALL_DARK_OAK_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("glassdoor", "dark_oak_glassdoor")), BlockSetType.DARK_OAK);
    public static final Block TALL_MANGROVE_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("glassdoor", "mangrove_glassdoor")), BlockSetType.MANGROVE);
    public static final Block TALL_BAMBOO_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("glassdoor", "bamboo_glassdoor")), BlockSetType.BAMBOO, FeatureFlags.UPDATE_1_20);
    public static final Block TALL_CHERRY_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("glassdoor", "cherry_glassdoor")), BlockSetType.CHERRY, FeatureFlags.UPDATE_1_20);
    public static final Block TALL_CRIMSON_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("glassdoor", "crimson_glassdoor")), BlockSetType.CRIMSON);
    public static final Block TALL_WARPED_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("glassdoor", "warped_glassdoor")), BlockSetType.WARPED);

    // Hephaestus
    public static final Block SHORT_BLOODSHROOM_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("tconstruct", "bloodshroom_door")), BlockSetType.CRIMSON);
    public static final Block SHORT_GREENHEART_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("tconstruct", "greenheart_door")), BlockSetType.OAK);
    public static final Block SHORT_SKYROOT_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("tconstruct", "skyroot_door")), BlockSetType.OAK);

    public static final Block TALL_BLOODSHROOM_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("tconstruct", "bloodshroom_door")), BlockSetType.CRIMSON);
    public static final Block TALL_GREENHEART_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("tconstruct", "greenheart_door")), BlockSetType.OAK);
    public static final Block TALL_SKYROOT_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("tconstruct", "skyroot_door")), BlockSetType.OAK);
    
    // Oh the Biomes You'll Go
    public static final Block SHORT_BYG_ASPEN_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_aspen_door")), BlockSetType.OAK);
    public static final Block SHORT_BYG_BAOBAB_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_baobab_door")), BlockSetType.OAK);
    public static final Block SHORT_BYG_BLUE_ENCHANTED_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_blue_enchanted_door")), BlockSetType.OAK);
    public static final Block SHORT_BYG_BULBIS_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_bulbis_door")), BlockSetType.OAK);
    public static final Block SHORT_BYG_CHERRY_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_cherry_door")), BlockSetType.OAK);
    public static final Block SHORT_BYG_CIKA_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_cika_door")), BlockSetType.OAK);
    public static final Block SHORT_BYG_CYPRESS_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_cypress_door")), BlockSetType.OAK);
    public static final Block SHORT_BYG_EBONY_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_ebony_door")), BlockSetType.OAK);
    public static final Block SHORT_BYG_EMBUR_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_embur_door")), BlockSetType.OAK);
    public static final Block SHORT_BYG_ETHER_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_ether_door")), BlockSetType.OAK);
    public static final Block SHORT_BYG_FIR_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_fir_door")), BlockSetType.OAK);
    public static final Block SHORT_BYG_FLORUS_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_florus_door")), BlockSetType.OAK);
    public static final Block SHORT_BYG_GREEN_ENCHANTED_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_green_enchanted_door")), BlockSetType.OAK);
    public static final Block SHORT_BYG_HOLLY_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_holly_door")), BlockSetType.OAK);
    public static final Block SHORT_BYG_IMPARIUS_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_imparius_door")), BlockSetType.OAK);
    public static final Block SHORT_BYG_IRONWOOD_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_ironwood_door")), BlockSetType.OAK);
    public static final Block SHORT_BYG_JACARANDA_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_jacaranda_door")), BlockSetType.OAK);
    public static final Block SHORT_BYG_LAMENT_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_lament_door")), BlockSetType.OAK);
    public static final Block SHORT_BYG_MAHOGANY_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_mahogany_door")), BlockSetType.OAK);
    public static final Block SHORT_BYG_MAPLE_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_maple_door")), BlockSetType.OAK);
    public static final Block SHORT_BYG_NIGHTSHADE_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_nightshade_door")), BlockSetType.OAK);
    public static final Block SHORT_BYG_PALM_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_palm_door")), BlockSetType.OAK);
    public static final Block SHORT_BYG_PINE_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_pine_door")), BlockSetType.OAK);
    public static final Block SHORT_BYG_RAINBOW_EUCALYPTUS_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_rainbow_eucalyptus_door")), BlockSetType.OAK);
    public static final Block SHORT_BYG_REDWOOD_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_redwood_door")), BlockSetType.OAK);
    public static final Block SHORT_BYG_SKYRIS_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_skyris_door")), BlockSetType.OAK);
    public static final Block SHORT_BYG_SOUL_SHROOM_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_soul_shroom_door")), BlockSetType.OAK);
    public static final Block SHORT_BYG_SYTHIAN_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_sythian_door")), BlockSetType.OAK);
    public static final Block SHORT_BYG_WHITE_MANGROVE_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_mangrove_door")), BlockSetType.OAK);
    public static final Block SHORT_BYG_WILLOW_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_willow_door")), BlockSetType.OAK);
    public static final Block SHORT_BYG_WITCH_HAZEL_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_witch_hazel_door")), BlockSetType.OAK);
    public static final Block SHORT_BYG_ZELKOVA_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_zelkova_door")), BlockSetType.OAK);

    public static final Block TALL_BYG_ASPEN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_aspen_door")), BlockSetType.OAK);
    public static final Block TALL_BYG_BAOBAB_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_baobab_door")), BlockSetType.OAK);
    public static final Block TALL_BYG_BLUE_ENCHANTED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_blue_enchanted_door")), BlockSetType.OAK);
    public static final Block TALL_BYG_BULBIS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_bulbis_door")), BlockSetType.OAK);
    public static final Block TALL_BYG_CHERRY_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_cherry_door")), BlockSetType.OAK);
    public static final Block TALL_BYG_CIKA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_cika_door")), BlockSetType.OAK);
    public static final Block TALL_BYG_CYPRESS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_cypress_door")), BlockSetType.OAK);
    public static final Block TALL_BYG_EBONY_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_ebony_door")), BlockSetType.OAK);
    public static final Block TALL_BYG_EMBUR_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_embur_door")), BlockSetType.OAK);
    public static final Block TALL_BYG_ETHER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_ether_door")), BlockSetType.OAK);
    public static final Block TALL_BYG_FIR_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_fir_door")), BlockSetType.OAK);
    public static final Block TALL_BYG_FLORUS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_florus_door")), BlockSetType.OAK);
    public static final Block TALL_BYG_GREEN_ENCHANTED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_green_enchanted_door")), BlockSetType.OAK);
    public static final Block TALL_BYG_HOLLY_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_holly_door")), BlockSetType.OAK);
    public static final Block TALL_BYG_IMPARIUS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_imparius_door")), BlockSetType.OAK);
    public static final Block TALL_BYG_IRONWOOD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_ironwood_door")), BlockSetType.OAK);
    public static final Block TALL_BYG_JACARANDA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_jacaranda_door")), BlockSetType.OAK);
    public static final Block TALL_BYG_LAMENT_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_lament_door")), BlockSetType.OAK);
    public static final Block TALL_BYG_MAHOGANY_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_mahogany_door")), BlockSetType.OAK);
    public static final Block TALL_BYG_MAPLE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_maple_door")), BlockSetType.OAK);
    public static final Block TALL_BYG_NIGHTSHADE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_nightshade_door")), BlockSetType.OAK);
    public static final Block TALL_BYG_PALM_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_palm_door")), BlockSetType.OAK);
    public static final Block TALL_BYG_PINE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_pine_door")), BlockSetType.OAK);
    public static final Block TALL_BYG_RAINBOW_EUCALYPTUS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_rainbow_eucalyptus_door")), BlockSetType.OAK);
    public static final Block TALL_BYG_REDWOOD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_redwood_door")), BlockSetType.OAK);
    public static final Block TALL_BYG_SKYRIS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_skyris_door")), BlockSetType.OAK);
    public static final Block TALL_BYG_SOUL_SHROOM_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_soul_shroom_door")), BlockSetType.OAK);
    public static final Block TALL_BYG_SYTHIAN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_sythian_door")), BlockSetType.OAK);
    public static final Block TALL_BYG_WHITE_MANGROVE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_mangrove_door")), BlockSetType.OAK);
    public static final Block TALL_BYG_WILLOW_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_willow_door")), BlockSetType.OAK);
    public static final Block TALL_BYG_WITCH_HAZEL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_witch_hazel_door")), BlockSetType.OAK);
    public static final Block TALL_BYG_ZELKOVA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "byg_zelkova_door")), BlockSetType.OAK);
    
    // Promenade
    public static final Block SHORT_PROMENADE_CHERRY_OAK_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("promenade", "cherry_oak_door")), BlockSetType.OAK);
    public static final Block SHORT_PROMENADE_DARK_AMARANTH_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("promenade", "dark_amaranth_door")), BlockSetType.OAK);
    public static final Block SHORT_PROMENADE_PALM_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("promenade", "palm_door")), BlockSetType.OAK);

    public static final Block TALL_PROMENADE_CHERRY_OAK_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("promenade", "cherry_oak_door")), BlockSetType.OAK);
    public static final Block TALL_PROMENADE_DARK_AMARANTH_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("promenade", "dark_amaranth_door")), BlockSetType.OAK);
    public static final Block TALL_PROMENADE_PALM_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("promenade", "palm_door")), BlockSetType.OAK);
    
    // Regions Unexplored
    public static final Block SHORT_RUE_BAOBAB_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "baobab_door")), BlockSetType.OAK);
    public static final Block SHORT_RUE_BLACKWOOD_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "blackwood_door")), BlockSetType.OAK);
    public static final Block SHORT_RUE_BRIMWOOD_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "brimwood_door")), BlockSetType.CRIMSON);
    public static final Block SHORT_RUE_CHERRY_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "cherry_door")), BlockSetType.CHERRY);
    public static final Block SHORT_RUE_CYPRESS_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "cypress_door")), BlockSetType.OAK);
    public static final Block SHORT_RUE_DEAD_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "dead_door")), BlockSetType.OAK);
    public static final Block SHORT_RUE_EUCALYPTUS_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "eucalyptus_door")), BlockSetType.OAK);
    public static final Block SHORT_RUE_JOSHUA_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "joshua_door")), BlockSetType.OAK);
    public static final Block SHORT_RUE_LARCH_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "larch_door")), BlockSetType.OAK);
    public static final Block SHORT_RUE_MAPLE_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "maple_door")), BlockSetType.OAK);
    public static final Block SHORT_RUE_MAUVE_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "mauve_door")), BlockSetType.OAK);
    public static final Block SHORT_RUE_PALM_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "palm_door")), BlockSetType.OAK);
    public static final Block SHORT_RUE_PINE_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "pine_door")), BlockSetType.OAK);
    public static final Block SHORT_RUE_REDWOOD_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "redwood_door")), BlockSetType.OAK);
    public static final Block SHORT_RUE_WILLOW_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "willow_door")), BlockSetType.OAK);

    public static final Block TALL_RUE_BAOBAB_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "baobab_door")), BlockSetType.OAK);
    public static final Block TALL_RUE_BLACKWOOD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "blackwood_door")), BlockSetType.OAK);
    public static final Block TALL_RUE_BRIMWOOD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "brimwood_door")), BlockSetType.CRIMSON);
    public static final Block TALL_RUE_CHERRY_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "cherry_door")), BlockSetType.CHERRY);
    public static final Block TALL_RUE_CYPRESS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "cypress_door")), BlockSetType.OAK);
    public static final Block TALL_RUE_DEAD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "dead_door")), BlockSetType.OAK);
    public static final Block TALL_RUE_EUCALYPTUS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "eucalyptus_door")), BlockSetType.OAK);
    public static final Block TALL_RUE_JOSHUA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "joshua_door")), BlockSetType.OAK);
    public static final Block TALL_RUE_LARCH_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "larch_door")), BlockSetType.OAK);
    public static final Block TALL_RUE_MAPLE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "maple_door")), BlockSetType.OAK);
    public static final Block TALL_RUE_MAUVE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "mauve_door")), BlockSetType.OAK);
    public static final Block TALL_RUE_PALM_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "palm_door")), BlockSetType.OAK);
    public static final Block TALL_RUE_PINE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "pine_door")), BlockSetType.OAK);
    public static final Block TALL_RUE_REDWOOD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "redwood_door")), BlockSetType.OAK);
    public static final Block TALL_RUE_WILLOW_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "willow_door")), BlockSetType.OAK);
    
    // Snowy Spirit
    public static final Block SHORT_GINGERBREAD_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("snowyspirit", "gingerbread_door")), BlockSetType.OAK);

    public static final Block TALL_GINGERBREAD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("snowyspirit", "gingerbread_door")), BlockSetType.OAK);
    
    // Supplementaries
    public static final Block SHORT_GOLD_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("supplementaries", "gold_door")), BlockSetType.IRON);
    public static final Block SHORT_NETHERITE_DOOR = new ShortNetheriteDoorBlock(getBlockFromResourceLocation(new ResourceLocation("supplementaries", "netherite_door")), BlockSetType.IRON);

    public static final Block TALL_GOLD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("supplementaries", "gold_door")), BlockSetType.IRON);
    public static final Block TALL_NETHERITE_DOOR = new TallNetheriteDoorBlock(getBlockFromResourceLocation(new ResourceLocation("supplementaries", "netherite_door")), BlockSetType.IRON);
    
    // Tech Reborn
    public static final Block SHORT_RUBBER_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("tech_reborn", "rubber_door")), BlockSetType.OAK);

    public static final Block TALL_RUBBER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("tech_reborn", "rubber_door")), BlockSetType.OAK);
    
    // Terrestria
    public static final Block SHORT_TERRESTRIA_CYPRESS_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("terrestria", "cypress_door")), BlockSetType.OAK);
    public static final Block SHORT_TERRESTRIA_HEMLOCK_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("terrestria", "hemlock_door")), BlockSetType.OAK);
    public static final Block SHORT_TERRESTRIA_JAPANESE_MAPLE_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("terrestria", "japanese_maple_door")), BlockSetType.OAK);
    public static final Block SHORT_TERRESTRIA_RAINBOW_EUCALYPTUS_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("terrestria", "rainbow_eucalyptus_door")), BlockSetType.OAK);
    public static final Block SHORT_TERRESTRIA_REDWOOD_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("terrestria", "redwood_door")), BlockSetType.OAK);
    public static final Block SHORT_TERRESTRIA_RUBBER_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("terrestria", "rubber_door")), BlockSetType.OAK);
    public static final Block SHORT_TERRESTRIA_SAKURA_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("terrestria", "sakura_door")), BlockSetType.OAK);
    public static final Block SHORT_TERRESTRIA_WILLOW_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("terrestria", "willow_door")), BlockSetType.OAK);
    public static final Block SHORT_TERRESTRIA_YUCCA_PALM_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("terrestria", "yucca_palm_door")), BlockSetType.OAK);

    public static final Block TALL_TERRESTRIA_CYPRESS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("terrestria", "cypress_door")), BlockSetType.OAK);
    public static final Block TALL_TERRESTRIA_HEMLOCK_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("terrestria", "hemlock_door")), BlockSetType.OAK);
    public static final Block TALL_TERRESTRIA_JAPANESE_MAPLE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("terrestria", "japanese_maple_door")), BlockSetType.OAK);
    public static final Block TALL_TERRESTRIA_RAINBOW_EUCALYPTUS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("terrestria", "rainbow_eucalyptus_door")), BlockSetType.OAK);
    public static final Block TALL_TERRESTRIA_REDWOOD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("terrestria", "redwood_door")), BlockSetType.OAK);
    public static final Block TALL_TERRESTRIA_RUBBER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("terrestria", "rubber_door")), BlockSetType.OAK);
    public static final Block TALL_TERRESTRIA_SAKURA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("terrestria", "sakura_door")), BlockSetType.OAK);
    public static final Block TALL_TERRESTRIA_WILLOW_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("terrestria", "willow_door")), BlockSetType.OAK);
    public static final Block TALL_TERRESTRIA_YUCCA_PALM_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("terrestria", "yucca_palm_door")), BlockSetType.OAK);
    
    // Traverse
    public static final Block SHORT_TRAVERSE_FIR_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("traverse", "fir_door")), BlockSetType.OAK);

    public static final Block TALL_TRAVERSE_FIR_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("traverse", "fir_door")), BlockSetType.OAK);
    
    // Twigs
    public static final Block SHORT_STRIPPED_BAMBOO_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("twigs", "stripped_bamboo_door")), BlockSetType.BAMBOO);

    public static final Block TALL_STRIPPED_BAMBOO_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("twigs", "stripped_bamboo_door")), BlockSetType.BAMBOO);
    
    // Twilight Forest
    public static final Block SHORT_CANOPY_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("twilightforest", "canopy_door")), BlockSetType.OAK);
    public static final Block SHORT_DARKWOOD_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("twilightforest", "dark_door")), BlockSetType.OAK);
    public static final Block SHORT_MINEWOOD_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("twilightforest", "mining_door")), BlockSetType.OAK);
    public static final Block SHORT_SORTINGWOOD_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("twilightforest", "sorting_door")), BlockSetType.OAK);
    public static final Block SHORT_TIMEWOOD_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("twilightforest", "time_door")), BlockSetType.OAK);
    public static final Block SHORT_TRANSWOOD_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("twilightforest", "tranformation_door")), BlockSetType.OAK);
    public static final Block SHORT_TWILIGHT_MANGROVE_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("twilightforest", "mangrove_door")), BlockSetType.OAK);
    public static final Block SHORT_TWILIGHT_OAK_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("twilightforest", "twilight_oak_door")), BlockSetType.OAK);
    
    public static final Block SHORT_TOWERWOOD_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("tflostblocks", "towerwood_door")), BlockSetType.OAK);

    public static final Block TALL_CANOPY_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("twilightforest", "canopy_door")), BlockSetType.OAK);
    public static final Block TALL_DARKWOOD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("twilightforest", "dark_door")), BlockSetType.OAK);
    public static final Block TALL_MINEWOOD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("twilightforest", "mining_door")), BlockSetType.OAK);
    public static final Block TALL_SORTINGWOOD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("twilightforest", "sorting_door")), BlockSetType.OAK);
    public static final Block TALL_TIMEWOOD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("twilightforest", "time_door")), BlockSetType.OAK);
    public static final Block TALL_TRANSWOOD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("twilightforest", "tranformation_door")), BlockSetType.OAK);
    public static final Block TALL_TWILIGHT_MANGROVE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("twilightforest", "mangrove_door")), BlockSetType.OAK);
    public static final Block TALL_TWILIGHT_OAK_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("twilightforest", "twilight_oak_door")), BlockSetType.OAK);
    
    public static final Block TALL_TOWERWOOD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("tflostblocks", "towerwood_door")), BlockSetType.OAK);
    
    // XP Obelisk
    public static final Block SHORT_SOUL_COPPER_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("xps_additions", "soul_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON);

    public static final Block TALL_SOUL_COPPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("xps_additions", "soul_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON);
    
    // Yippee
    public static final Block SHORT_MYSTICAL_OAK_DOOR = new ShortDoorBlock(getBlockFromResourceLocation(new ResourceLocation("yippee", "mystical_oak_door")), BlockSetType.OAK);

    public static final Block TALL_MYSTICAL_OAK_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("yippee", "mystical_oak_door")), BlockSetType.OAK);
    
    // Chipped (The biggest compat)
    public static final Block TALL_CHIPPED_OAK_HEAVY_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "heavy_oak_door")), BlockSetType.OAK);    
    public static final Block TALL_CHIPPED_OAK_DUAL_PANELED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "dual_paneled_oak_door")), BlockSetType.OAK);
    public static final Block TALL_CHIPPED_OAK_PRESSED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "pressed_oak_door")), BlockSetType.OAK);
    public static final Block TALL_CHIPPED_OAK_SHACK_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "shack_oak_door")), BlockSetType.OAK);
    public static final Block TALL_CHIPPED_OAK_SLIDING_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "sliding_oak_door")), BlockSetType.OAK);
    public static final Block TALL_CHIPPED_OAK_SCREEN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "screen_oak_door")), BlockSetType.OAK);
    public static final Block TALL_CHIPPED_OAK_GATED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "gated_oak_door")), BlockSetType.OAK);
    public static final Block TALL_CHIPPED_OAK_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "glass_oak_door")), BlockSetType.OAK);
    public static final Block TALL_CHIPPED_OAK_WINDOWED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "windowed_oak_door")), BlockSetType.OAK);
    public static final Block TALL_CHIPPED_OAK_TILED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "tiled_oak_door")), BlockSetType.OAK);
    public static final Block TALL_CHIPPED_OAK_TILE_WINDOWED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "tile_windowed_oak_door")), BlockSetType.OAK);
    public static final Block TALL_CHIPPED_OAK_FORTIFIED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "fortified_oak_door")), BlockSetType.OAK);
    public static final Block TALL_CHIPPED_OAK_SECRET_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "secret_oak_door")), BlockSetType.OAK);
    public static final Block TALL_CHIPPED_OAK_BOARDED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "boarded_oak_door")), BlockSetType.OAK);
    public static final Block TALL_CHIPPED_OAK_PAPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "paper_oak_door")), BlockSetType.OAK);
    public static final Block TALL_CHIPPED_OAK_BEACH_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "beach_oak_door")), BlockSetType.OAK);
    public static final Block TALL_CHIPPED_OAK_BARRED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "barred_oak_door")), BlockSetType.OAK);
    public static final Block TALL_CHIPPED_OAK_PANELED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "paneled_oak_door")), BlockSetType.OAK);
    public static final Block TALL_CHIPPED_OAK_SUPPORTED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "supported_oak_door")), BlockSetType.OAK);
    public static final Block TALL_CHIPPED_OAK_OVERGROWN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "overgrown_oak_door")), BlockSetType.OAK);
    
    public static final Block TALL_CHIPPED_SPRUCE_HEAVY_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "heavy_spruce_door")), BlockSetType.SPRUCE);    
    public static final Block TALL_CHIPPED_SPRUCE_DUAL_PANELED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "dual_paneled_spruce_door")), BlockSetType.SPRUCE);
    public static final Block TALL_CHIPPED_SPRUCE_PRESSED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "pressed_spruce_door")), BlockSetType.SPRUCE);
    public static final Block TALL_CHIPPED_SPRUCE_SHACK_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "shack_spruce_door")), BlockSetType.SPRUCE);
    public static final Block TALL_CHIPPED_SPRUCE_SLIDING_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "sliding_spruce_door")), BlockSetType.SPRUCE);
    public static final Block TALL_CHIPPED_SPRUCE_SCREEN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "screen_spruce_door")), BlockSetType.SPRUCE);
    public static final Block TALL_CHIPPED_SPRUCE_GATED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "gated_spruce_door")), BlockSetType.SPRUCE);
    public static final Block TALL_CHIPPED_SPRUCE_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "glass_spruce_door")), BlockSetType.SPRUCE);
    public static final Block TALL_CHIPPED_SPRUCE_WINDOWED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "windowed_spruce_door")), BlockSetType.SPRUCE);
    public static final Block TALL_CHIPPED_SPRUCE_TILED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "tiled_spruce_door")), BlockSetType.SPRUCE);
    public static final Block TALL_CHIPPED_SPRUCE_TILE_WINDOWED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "tile_windowed_spruce_door")), BlockSetType.SPRUCE);
    public static final Block TALL_CHIPPED_SPRUCE_FORTIFIED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "fortified_spruce_door")), BlockSetType.SPRUCE);
    public static final Block TALL_CHIPPED_SPRUCE_SECRET_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "secret_spruce_door")), BlockSetType.SPRUCE);
    public static final Block TALL_CHIPPED_SPRUCE_MODERN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "modern_spruce_door")), BlockSetType.SPRUCE);
    public static final Block TALL_CHIPPED_SPRUCE_PAPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "paper_spruce_door")), BlockSetType.SPRUCE);
    public static final Block TALL_CHIPPED_SPRUCE_BEACH_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "beach_spruce_door")), BlockSetType.SPRUCE);
    public static final Block TALL_CHIPPED_SPRUCE_BARRED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "barred_spruce_door")), BlockSetType.SPRUCE);
    public static final Block TALL_CHIPPED_SPRUCE_PANELED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "paneled_spruce_door")), BlockSetType.SPRUCE);
    public static final Block TALL_CHIPPED_SPRUCE_SUPPORTED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "supported_spruce_door")), BlockSetType.SPRUCE);
    public static final Block TALL_CHIPPED_SPRUCE_OVERGROWN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "overgrown_spruce_door")), BlockSetType.SPRUCE);

    public static final Block TALL_CHIPPED_BIRCH_HEAVY_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "heavy_paper_door")), BlockSetType.BIRCH);    
    public static final Block TALL_CHIPPED_BIRCH_DUAL_PANELED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "dual_paneled_paper_door")), BlockSetType.BIRCH);
    public static final Block TALL_CHIPPED_BIRCH_PRESSED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "pressed_paper_door")), BlockSetType.BIRCH);
    public static final Block TALL_CHIPPED_BIRCH_SHACK_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "shack_paper_door")), BlockSetType.BIRCH);
    public static final Block TALL_CHIPPED_BIRCH_SLIDING_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "sliding_paper_door")), BlockSetType.BIRCH);
    public static final Block TALL_CHIPPED_BIRCH_SCREEN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "screen_paper_door")), BlockSetType.BIRCH);
    public static final Block TALL_CHIPPED_BIRCH_GATED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "gated_paper_door")), BlockSetType.BIRCH);
    public static final Block TALL_CHIPPED_BIRCH_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "glass_paper_door")), BlockSetType.BIRCH);
    public static final Block TALL_CHIPPED_BIRCH_WINDOWED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "windowed_paper_door")), BlockSetType.BIRCH);
    public static final Block TALL_CHIPPED_BIRCH_TILED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "tiled_paper_door")), BlockSetType.BIRCH);
    public static final Block TALL_CHIPPED_BIRCH_TILE_WINDOWED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "tile_windowed_paper_door")), BlockSetType.BIRCH);
    public static final Block TALL_CHIPPED_BIRCH_FORTIFIED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "fortified_paper_door")), BlockSetType.BIRCH);
    public static final Block TALL_CHIPPED_BIRCH_SECRET_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "secret_paper_door")), BlockSetType.BIRCH);
    public static final Block TALL_CHIPPED_BIRCH_MODERN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "modern_paper_door")), BlockSetType.BIRCH);
    public static final Block TALL_CHIPPED_BIRCH_BOARDED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "boarded_paper_door")), BlockSetType.BIRCH);
    public static final Block TALL_CHIPPED_BIRCH_BEACH_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "beach_paper_door")), BlockSetType.BIRCH);
    public static final Block TALL_CHIPPED_BIRCH_BARRED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "barred_paper_door")), BlockSetType.BIRCH);
    public static final Block TALL_CHIPPED_BIRCH_PANELED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "paneled_paper_door")), BlockSetType.BIRCH);
    public static final Block TALL_CHIPPED_BIRCH_SUPPORTED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "supported_paper_door")), BlockSetType.BIRCH);
    public static final Block TALL_CHIPPED_BIRCH_OVERGROWN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "overgrown_paper_door")), BlockSetType.BIRCH);

    public static final Block TALL_CHIPPED_JUNGLE_HEAVY_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "heavy_jungle_door")), BlockSetType.JUNGLE);    
    public static final Block TALL_CHIPPED_JUNGLE_DUAL_PANELED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "dual_paneled_jungle_door")), BlockSetType.JUNGLE);
    public static final Block TALL_CHIPPED_JUNGLE_PRESSED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "pressed_jungle_door")), BlockSetType.JUNGLE);
    public static final Block TALL_CHIPPED_JUNGLE_SHACK_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "shack_jungle_door")), BlockSetType.JUNGLE);
    public static final Block TALL_CHIPPED_JUNGLE_SLIDING_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "sliding_jungle_door")), BlockSetType.JUNGLE);
    public static final Block TALL_CHIPPED_JUNGLE_SCREEN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "screen_jungle_door")), BlockSetType.JUNGLE);
    public static final Block TALL_CHIPPED_JUNGLE_GATED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "gated_jungle_door")), BlockSetType.JUNGLE);
    public static final Block TALL_CHIPPED_JUNGLE_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "glass_jungle_door")), BlockSetType.JUNGLE);
    public static final Block TALL_CHIPPED_JUNGLE_WINDOWED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "windowed_jungle_door")), BlockSetType.JUNGLE);
    public static final Block TALL_CHIPPED_JUNGLE_TILED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "tiled_jungle_door")), BlockSetType.JUNGLE);
    public static final Block TALL_CHIPPED_JUNGLE_TILE_WINDOWED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "tile_windowed_jungle_door")), BlockSetType.JUNGLE);
    public static final Block TALL_CHIPPED_JUNGLE_FORTIFIED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "fortified_jungle_door")), BlockSetType.JUNGLE);
    public static final Block TALL_CHIPPED_JUNGLE_SECRET_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "secret_jungle_door")), BlockSetType.JUNGLE);
    public static final Block TALL_CHIPPED_JUNGLE_MODERN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "modern_jungle_door")), BlockSetType.JUNGLE);
    public static final Block TALL_CHIPPED_JUNGLE_BOARDED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "boarded_jungle_door")), BlockSetType.JUNGLE);
    public static final Block TALL_CHIPPED_JUNGLE_PAPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "paper_jungle_door")), BlockSetType.JUNGLE);
    public static final Block TALL_CHIPPED_JUNGLE_BARRED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "barred_jungle_door")), BlockSetType.JUNGLE);
    public static final Block TALL_CHIPPED_JUNGLE_PANELED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "paneled_jungle_door")), BlockSetType.JUNGLE);
    public static final Block TALL_CHIPPED_JUNGLE_SUPPORTED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "supported_jungle_door")), BlockSetType.JUNGLE);
    public static final Block TALL_CHIPPED_JUNGLE_OVERGROWN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "overgrown_jungle_door")), BlockSetType.JUNGLE);

    public static final Block TALL_CHIPPED_ACACIA_HEAVY_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "heavy_acacia_door")), BlockSetType.ACACIA);    
    public static final Block TALL_CHIPPED_ACACIA_DUAL_PANELED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "dual_paneled_acacia_door")), BlockSetType.ACACIA);
    public static final Block TALL_CHIPPED_ACACIA_PRESSED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "pressed_acacia_door")), BlockSetType.ACACIA);
    public static final Block TALL_CHIPPED_ACACIA_SHACK_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "shack_acacia_door")), BlockSetType.ACACIA);
    public static final Block TALL_CHIPPED_ACACIA_SLIDING_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "sliding_acacia_door")), BlockSetType.ACACIA);
    public static final Block TALL_CHIPPED_ACACIA_SCREEN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "screen_acacia_door")), BlockSetType.ACACIA);
    public static final Block TALL_CHIPPED_ACACIA_GATED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "gated_acacia_door")), BlockSetType.ACACIA);
    public static final Block TALL_CHIPPED_ACACIA_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "glass_acacia_door")), BlockSetType.ACACIA);
    public static final Block TALL_CHIPPED_ACACIA_WINDOWED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "windowed_acacia_door")), BlockSetType.ACACIA);
    public static final Block TALL_CHIPPED_ACACIA_TILED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "tiled_acacia_door")), BlockSetType.ACACIA);
    public static final Block TALL_CHIPPED_ACACIA_TILE_WINDOWED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "tile_windowed_acacia_door")), BlockSetType.ACACIA);
    public static final Block TALL_CHIPPED_ACACIA_FORTIFIED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "fortified_acacia_door")), BlockSetType.ACACIA);
    public static final Block TALL_CHIPPED_ACACIA_SECRET_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "secret_acacia_door")), BlockSetType.ACACIA);
    public static final Block TALL_CHIPPED_ACACIA_MODERN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "modern_acacia_door")), BlockSetType.ACACIA);
    public static final Block TALL_CHIPPED_ACACIA_BOARDED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "boarded_acacia_door")), BlockSetType.ACACIA);
    public static final Block TALL_CHIPPED_ACACIA_PAPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "paper_acacia_door")), BlockSetType.ACACIA);
    public static final Block TALL_CHIPPED_ACACIA_BEACH_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "beach_acacia_door")), BlockSetType.ACACIA);
    public static final Block TALL_CHIPPED_ACACIA_PANELED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "paneled_acacia_door")), BlockSetType.ACACIA);
    public static final Block TALL_CHIPPED_ACACIA_SUPPORTED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "supported_acacia_door")), BlockSetType.ACACIA);
    public static final Block TALL_CHIPPED_ACACIA_OVERGROWN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "overgrown_acacia_door")), BlockSetType.ACACIA);

    public static final Block TALL_CHIPPED_DARK_OAK_HEAVY_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "heavy_dark_oak_door")), BlockSetType.DARK_OAK);    
    public static final Block TALL_CHIPPED_DARK_OAK_DUAL_PANELED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "dual_paneled_dark_oak_door")), BlockSetType.DARK_OAK);
    public static final Block TALL_CHIPPED_DARK_OAK_PRESSED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "pressed_dark_oak_door")), BlockSetType.DARK_OAK);
    public static final Block TALL_CHIPPED_DARK_OAK_SHACK_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "shack_dark_oak_door")), BlockSetType.DARK_OAK);
    public static final Block TALL_CHIPPED_DARK_OAK_SLIDING_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "sliding_dark_oak_door")), BlockSetType.DARK_OAK);
    public static final Block TALL_CHIPPED_DARK_OAK_SCREEN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "screen_dark_oak_door")), BlockSetType.DARK_OAK);
    public static final Block TALL_CHIPPED_DARK_OAK_GATED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "gated_dark_oak_door")), BlockSetType.DARK_OAK);
    public static final Block TALL_CHIPPED_DARK_OAK_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "glass_dark_oak_door")), BlockSetType.DARK_OAK);
    public static final Block TALL_CHIPPED_DARK_OAK_WINDOWED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "windowed_dark_oak_door")), BlockSetType.DARK_OAK);
    public static final Block TALL_CHIPPED_DARK_OAK_TILED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "tiled_dark_oak_door")), BlockSetType.DARK_OAK);
    public static final Block TALL_CHIPPED_DARK_OAK_TILE_WINDOWED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "tile_windowed_dark_oak_door")), BlockSetType.DARK_OAK);
    public static final Block TALL_CHIPPED_DARK_OAK_FORTIFIED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "fortified_dark_oak_door")), BlockSetType.DARK_OAK);
    public static final Block TALL_CHIPPED_DARK_OAK_SECRET_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "secret_dark_oak_door")), BlockSetType.DARK_OAK);
    public static final Block TALL_CHIPPED_DARK_OAK_MODERN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "modern_dark_oak_door")), BlockSetType.DARK_OAK);
    public static final Block TALL_CHIPPED_DARK_OAK_BOARDED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "boarded_dark_oak_door")), BlockSetType.DARK_OAK);
    public static final Block TALL_CHIPPED_DARK_OAK_PAPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "paper_dark_oak_door")), BlockSetType.DARK_OAK);
    public static final Block TALL_CHIPPED_DARK_OAK_BEACH_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "beach_dark_oak_door")), BlockSetType.DARK_OAK);
    public static final Block TALL_CHIPPED_DARK_OAK_BARRED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "barred_dark_oak_door")), BlockSetType.DARK_OAK);
    public static final Block TALL_CHIPPED_DARK_OAK_SUPPORTED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "supported_dark_oak_door")), BlockSetType.DARK_OAK);
    public static final Block TALL_CHIPPED_DARK_OAK_OVERGROWN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "overgrown_dark_oak_door")), BlockSetType.DARK_OAK);

    public static final Block TALL_CHIPPED_MANGROVE_HEAVY_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "heavy_mangrove_door")), BlockSetType.MANGROVE);    
    public static final Block TALL_CHIPPED_MANGROVE_DUAL_PANELED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "dual_paneled_mangrove_door")), BlockSetType.MANGROVE);
    public static final Block TALL_CHIPPED_MANGROVE_PRESSED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "pressed_mangrove_door")), BlockSetType.MANGROVE);
    public static final Block TALL_CHIPPED_MANGROVE_SHACK_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "shack_mangrove_door")), BlockSetType.MANGROVE);
    public static final Block TALL_CHIPPED_MANGROVE_SLIDING_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "sliding_mangrove_door")), BlockSetType.MANGROVE);
    public static final Block TALL_CHIPPED_MANGROVE_SCREEN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "screen_mangrove_door")), BlockSetType.MANGROVE);
    public static final Block TALL_CHIPPED_MANGROVE_GATED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "gated_mangrove_door")), BlockSetType.MANGROVE);
    public static final Block TALL_CHIPPED_MANGROVE_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "glass_mangrove_door")), BlockSetType.MANGROVE);
    public static final Block TALL_CHIPPED_MANGROVE_WINDOWED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "windowed_mangrove_door")), BlockSetType.MANGROVE);
    public static final Block TALL_CHIPPED_MANGROVE_TILED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "tiled_mangrove_door")), BlockSetType.MANGROVE);
    public static final Block TALL_CHIPPED_MANGROVE_TILE_WINDOWED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "tile_windowed_mangrove_door")), BlockSetType.MANGROVE);
    public static final Block TALL_CHIPPED_MANGROVE_FORTIFIED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "fortified_mangrove_door")), BlockSetType.MANGROVE);
    public static final Block TALL_CHIPPED_MANGROVE_SECRET_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "secret_mangrove_door")), BlockSetType.MANGROVE);
    public static final Block TALL_CHIPPED_MANGROVE_MODERN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "modern_mangrove_door")), BlockSetType.MANGROVE);
    public static final Block TALL_CHIPPED_MANGROVE_BOARDED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "boarded_mangrove_door")), BlockSetType.MANGROVE);
    public static final Block TALL_CHIPPED_MANGROVE_PAPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "paper_mangrove_door")), BlockSetType.MANGROVE);
    public static final Block TALL_CHIPPED_MANGROVE_BEACH_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "beach_mangrove_door")), BlockSetType.MANGROVE);
    public static final Block TALL_CHIPPED_MANGROVE_BARRED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "barred_mangrove_door")), BlockSetType.MANGROVE);
    public static final Block TALL_CHIPPED_MANGROVE_PANELED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "paneled_mangrove_door")), BlockSetType.MANGROVE);
    public static final Block TALL_CHIPPED_MANGROVE_SUPPORTED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "supported_mangrove_door")), BlockSetType.MANGROVE);
    public static final Block TALL_CHIPPED_MANGROVE_OVERGROWN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "overgrown_mangrove_door")), BlockSetType.MANGROVE);

    public static final Block TALL_CHIPPED_CRIMSON_HEAVY_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "heavy_crimson_door")), BlockSetType.CRIMSON);    
    public static final Block TALL_CHIPPED_CRIMSON_DUAL_PANELED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "dual_paneled_crimson_door")), BlockSetType.CRIMSON);
    public static final Block TALL_CHIPPED_CRIMSON_PRESSED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "pressed_crimson_door")), BlockSetType.CRIMSON);
    public static final Block TALL_CHIPPED_CRIMSON_SHACK_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "shack_crimson_door")), BlockSetType.CRIMSON);
    public static final Block TALL_CHIPPED_CRIMSON_SLIDING_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "sliding_crimson_door")), BlockSetType.CRIMSON);
    public static final Block TALL_CHIPPED_CRIMSON_SCREEN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "screen_crimson_door")), BlockSetType.CRIMSON);
    public static final Block TALL_CHIPPED_CRIMSON_GATED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "gated_crimson_door")), BlockSetType.CRIMSON);
    public static final Block TALL_CHIPPED_CRIMSON_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "glass_crimson_door")), BlockSetType.CRIMSON);
    public static final Block TALL_CHIPPED_CRIMSON_WINDOWED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "windowed_crimson_door")), BlockSetType.CRIMSON);
    public static final Block TALL_CHIPPED_CRIMSON_TILED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "tiled_crimson_door")), BlockSetType.CRIMSON);
    public static final Block TALL_CHIPPED_CRIMSON_TILE_WINDOWED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "tile_windowed_crimson_door")), BlockSetType.CRIMSON);
    public static final Block TALL_CHIPPED_CRIMSON_FORTIFIED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "fortified_crimson_door")), BlockSetType.CRIMSON);
    public static final Block TALL_CHIPPED_CRIMSON_SECRET_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "secret_crimson_door")), BlockSetType.CRIMSON);
    public static final Block TALL_CHIPPED_CRIMSON_MODERN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "modern_crimson_door")), BlockSetType.CRIMSON);
    public static final Block TALL_CHIPPED_CRIMSON_BOARDED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "boarded_crimson_door")), BlockSetType.CRIMSON);
    public static final Block TALL_CHIPPED_CRIMSON_PAPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "paper_crimson_door")), BlockSetType.CRIMSON);
    public static final Block TALL_CHIPPED_CRIMSON_BEACH_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "beach_crimson_door")), BlockSetType.CRIMSON);
    public static final Block TALL_CHIPPED_CRIMSON_BARRED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "barred_crimson_door")), BlockSetType.CRIMSON);
    public static final Block TALL_CHIPPED_CRIMSON_PANELED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "paneled_crimson_door")), BlockSetType.CRIMSON);
    public static final Block TALL_CHIPPED_CRIMSON_OVERGROWN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "overgrown_crimson_door")), BlockSetType.CRIMSON);

    public static final Block TALL_CHIPPED_WARPED_HEAVY_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "heavy_warped_door")), BlockSetType.WARPED);    
    public static final Block TALL_CHIPPED_WARPED_DUAL_PANELED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "dual_paneled_warped_door")), BlockSetType.WARPED);
    public static final Block TALL_CHIPPED_WARPED_PRESSED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "pressed_warped_door")), BlockSetType.WARPED);
    public static final Block TALL_CHIPPED_WARPED_SHACK_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "shack_warped_door")), BlockSetType.WARPED);
    public static final Block TALL_CHIPPED_WARPED_SLIDING_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "sliding_warped_door")), BlockSetType.WARPED);
    public static final Block TALL_CHIPPED_WARPED_SCREEN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "screen_warped_door")), BlockSetType.WARPED);
    public static final Block TALL_CHIPPED_WARPED_GATED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "gated_warped_door")), BlockSetType.WARPED);
    public static final Block TALL_CHIPPED_WARPED_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "glass_warped_door")), BlockSetType.WARPED);
    public static final Block TALL_CHIPPED_WARPED_WINDOWED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "windowed_warped_door")), BlockSetType.WARPED);
    public static final Block TALL_CHIPPED_WARPED_TILED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "tiled_warped_door")), BlockSetType.WARPED);
    public static final Block TALL_CHIPPED_WARPED_TILE_WINDOWED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "tile_windowed_warped_door")), BlockSetType.WARPED);
    public static final Block TALL_CHIPPED_WARPED_FORTIFIED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "fortified_warped_door")), BlockSetType.WARPED);
    public static final Block TALL_CHIPPED_WARPED_SECRET_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "secret_warped_door")), BlockSetType.WARPED);
    public static final Block TALL_CHIPPED_WARPED_MODERN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "modern_warped_door")), BlockSetType.WARPED);
    public static final Block TALL_CHIPPED_WARPED_BOARDED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "boarded_warped_door")), BlockSetType.WARPED);
    public static final Block TALL_CHIPPED_WARPED_PAPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "paper_warped_door")), BlockSetType.WARPED);
    public static final Block TALL_CHIPPED_WARPED_BEACH_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "beach_warped_door")), BlockSetType.WARPED);
    public static final Block TALL_CHIPPED_WARPED_BARRED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "barred_warped_door")), BlockSetType.WARPED);
    public static final Block TALL_CHIPPED_WARPED_PANELED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "paneled_warped_door")), BlockSetType.WARPED);
    public static final Block TALL_CHIPPED_WARPED_SUPPORTED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "supported_warped_door")), BlockSetType.WARPED);

    // Macaw's Doors (The biggest compat)
	public static final Block TALL_MACAW_STORE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "store_door"), Blocks.IRON_DOOR), BlockSetType.IRON);    
    public static final Block TALL_MACAW_SLIDING_GLASS_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "sliding_glass_door"), Blocks.IRON_DOOR), BlockSetType.IRON);

    public static final Block TALL_MACAW_JAIL_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jail_door"), Blocks.IRON_DOOR), BlockSetType.IRON);
	public static final Block TALL_MACAW_METAL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "metal_door"), Blocks.IRON_DOOR), BlockSetType.IRON);
	public static final Block TALL_MACAW_METAL_HOSPITAL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "metal_hospital_door"), Blocks.IRON_DOOR), BlockSetType.IRON);
	public static final Block TALL_MACAW_METAL_REINFORCED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "metal_reinforced_door"), Blocks.IRON_DOOR), BlockSetType.IRON);
	public static final Block TALL_MACAW_METAL_WARNING_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "metal_warning_door"), Blocks.IRON_DOOR), BlockSetType.IRON);
	public static final Block TALL_MACAW_METAL_WINDOWED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "metal_windowed_door"), Blocks.IRON_DOOR), BlockSetType.IRON);

	public static final Block TALL_MACAW_OAK_BARN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_barn_door")), BlockSetType.OAK);
	public static final Block TALL_MACAW_SPRUCE_BARN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_barn_door")), BlockSetType.SPRUCE);
	public static final Block TALL_MACAW_BIRCH_BARN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_barn_door")), BlockSetType.BIRCH);
	public static final Block TALL_MACAW_JUNGLE_BARN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_barn_door")), BlockSetType.JUNGLE);
	public static final Block TALL_MACAW_ACACIA_BARN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_barn_door")), BlockSetType.ACACIA);
	public static final Block TALL_MACAW_DARK_OAK_BARN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_barn_door")), BlockSetType.DARK_OAK);
	public static final Block TALL_MACAW_MANGROVE_BARN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_barn_door")), BlockSetType.MANGROVE);
	public static final Block TALL_MACAW_BAMBOO_BARN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_barn_door")), BlockSetType.BAMBOO);
	public static final Block TALL_MACAW_CRIMSON_BARN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_barn_door")), BlockSetType.CRIMSON);
	public static final Block TALL_MACAW_WARPED_BARN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_barn_door")), BlockSetType.WARPED);

	public static final Block TALL_MACAW_OAK_BARN_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_barn_glass_door")), BlockSetType.OAK);
	public static final Block TALL_MACAW_SPRUCE_BARN_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_barn_glass_door")), BlockSetType.SPRUCE);
	public static final Block TALL_MACAW_BIRCH_BARN_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_barn_glass_door")), BlockSetType.BIRCH);
	public static final Block TALL_MACAW_JUNGLE_BARN_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_barn_glass_door")), BlockSetType.JUNGLE);
	public static final Block TALL_MACAW_ACACIA_BARN_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_barn_glass_door")), BlockSetType.ACACIA);
	public static final Block TALL_MACAW_DARK_OAK_BARN_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_barn_glass_door")), BlockSetType.DARK_OAK);
	public static final Block TALL_MACAW_MANGROVE_BARN_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_barn_glass_door")), BlockSetType.MANGROVE);
	public static final Block TALL_MACAW_BAMBOO_BARN_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_barn_glass_door")), BlockSetType.BAMBOO);
	public static final Block TALL_MACAW_CRIMSON_BARN_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_barn_glass_door")), BlockSetType.CRIMSON);
	public static final Block TALL_MACAW_WARPED_BARN_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_barn_glass_door")), BlockSetType.WARPED);

	public static final Block TALL_MACAW_OAK_STABLE_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_stable_door")), BlockSetType.OAK);
	public static final Block TALL_MACAW_SPRUCE_STABLE_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_stable_door")), BlockSetType.SPRUCE);
	public static final Block TALL_MACAW_BIRCH_STABLE_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_stable_door")), BlockSetType.BIRCH);
	public static final Block TALL_MACAW_JUNGLE_STABLE_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_stable_door")), BlockSetType.JUNGLE);
	public static final Block TALL_MACAW_ACACIA_STABLE_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_stable_door")), BlockSetType.ACACIA);
	public static final Block TALL_MACAW_DARK_OAK_STABLE_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_stable_door")), BlockSetType.DARK_OAK);
	public static final Block TALL_MACAW_MANGROVE_STABLE_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_stable_door")), BlockSetType.MANGROVE);
	public static final Block TALL_MACAW_BAMBOO_STABLE_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_stable_door")), BlockSetType.BAMBOO);
	public static final Block TALL_MACAW_CRIMSON_STABLE_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_stable_door")), BlockSetType.CRIMSON);
	public static final Block TALL_MACAW_WARPED_STABLE_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_stable_door")), BlockSetType.WARPED);

	public static final Block TALL_MACAW_OAK_STABLE_HEAD_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_stable_head_door")), BlockSetType.OAK);
	public static final Block TALL_MACAW_SPRUCE_STABLE_HEAD_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_stable_head_door")), BlockSetType.SPRUCE);
	public static final Block TALL_MACAW_BIRCH_STABLE_HEAD_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_stable_head_door")), BlockSetType.BIRCH);
	public static final Block TALL_MACAW_JUNGLE_STABLE_HEAD_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_stable_head_door")), BlockSetType.JUNGLE);
	public static final Block TALL_MACAW_ACACIA_STABLE_HEAD_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_stable_head_door")), BlockSetType.ACACIA);
	public static final Block TALL_MACAW_DARK_OAK_STABLE_HEAD_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_stable_head_door")), BlockSetType.DARK_OAK);
	public static final Block TALL_MACAW_MANGROVE_STABLE_HEAD_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_stable_head_door")), BlockSetType.MANGROVE);
	public static final Block TALL_MACAW_BAMBOO_STABLE_HEAD_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_stable_head_door")), BlockSetType.BAMBOO);
	public static final Block TALL_MACAW_CRIMSON_STABLE_HEAD_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_stable_head_door")), BlockSetType.CRIMSON);
	public static final Block TALL_MACAW_WARPED_STABLE_HEAD_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_stable_head_door")), BlockSetType.WARPED);

	public static final Block TALL_MACAW_OAK_BARK_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_bark_glass_door")), BlockSetType.OAK);
	public static final Block TALL_MACAW_SPRUCE_BARK_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_bark_glass_door")), BlockSetType.SPRUCE);
	public static final Block TALL_MACAW_BIRCH_BARK_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_bark_glass_door")), BlockSetType.BIRCH);
	public static final Block TALL_MACAW_JUNGLE_BARK_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_bark_glass_door")), BlockSetType.JUNGLE);
	public static final Block TALL_MACAW_ACACIA_BARK_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_bark_glass_door")), BlockSetType.ACACIA);
	public static final Block TALL_MACAW_DARK_OAK_BARK_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_bark_glass_door")), BlockSetType.DARK_OAK);
	public static final Block TALL_MACAW_MANGROVE_BARK_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_bark_glass_door")), BlockSetType.MANGROVE);
	public static final Block TALL_MACAW_BAMBOO_BARK_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_bark_glass_door")), BlockSetType.BAMBOO);
	public static final Block TALL_MACAW_CRIMSON_STEM_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_stem_glass_door")), BlockSetType.CRIMSON);
	public static final Block TALL_MACAW_WARPED_STEM_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_stem_glass_door")), BlockSetType.WARPED);
	
	public static final Block TALL_MACAW_OAK_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_glass_door")), BlockSetType.OAK);
	public static final Block TALL_MACAW_SPRUCE_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_glass_door")), BlockSetType.SPRUCE);
	public static final Block TALL_MACAW_BIRCH_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_glass_door")), BlockSetType.BIRCH);
	public static final Block TALL_MACAW_JUNGLE_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_glass_door")), BlockSetType.JUNGLE);
	public static final Block TALL_MACAW_ACACIA_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_glass_door")), BlockSetType.ACACIA);
	public static final Block TALL_MACAW_DARK_OAK_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_glass_door")), BlockSetType.DARK_OAK);
	public static final Block TALL_MACAW_MANGROVE_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_glass_door")), BlockSetType.MANGROVE);
	public static final Block TALL_MACAW_BAMBOO_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_glass_door")), BlockSetType.BAMBOO);
	public static final Block TALL_MACAW_CRIMSON_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_glass_door")), BlockSetType.CRIMSON);
	public static final Block TALL_MACAW_WARPED_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_glass_door")), BlockSetType.WARPED);

	public static final Block TALL_MACAW_OAK_MODERN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_modern_door")), BlockSetType.OAK);
	public static final Block TALL_MACAW_SPRUCE_MODERN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_modern_door")), BlockSetType.SPRUCE);
	public static final Block TALL_MACAW_BIRCH_MODERN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_modern_door")), BlockSetType.BIRCH);
	public static final Block TALL_MACAW_JUNGLE_MODERN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_modern_door")), BlockSetType.JUNGLE);
	public static final Block TALL_MACAW_ACACIA_MODERN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_modern_door")), BlockSetType.ACACIA);
	public static final Block TALL_MACAW_DARK_OAK_MODERN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_modern_door")), BlockSetType.DARK_OAK);
	public static final Block TALL_MACAW_MANGROVE_MODERN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_modern_door")), BlockSetType.MANGROVE);
	public static final Block TALL_MACAW_BAMBOO_MODERN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_modern_door")), BlockSetType.BAMBOO);
	public static final Block TALL_MACAW_CRIMSON_MODERN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_modern_door")), BlockSetType.CRIMSON);
	public static final Block TALL_MACAW_WARPED_MODERN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_modern_door")), BlockSetType.WARPED);

	public static final Block TALL_MACAW_OAK_JAPANESE_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_japanese_door")), BlockSetType.OAK);
	public static final Block TALL_MACAW_SPRUCE_JAPANESE_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_japanese_door")), BlockSetType.SPRUCE);
	public static final Block TALL_MACAW_BIRCH_JAPANESE_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_japanese_door")), BlockSetType.BIRCH);
	public static final Block TALL_MACAW_JUNGLE_JAPANESE_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_japanese_door")), BlockSetType.JUNGLE);
	public static final Block TALL_MACAW_ACACIA_JAPANESE_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_japanese_door")), BlockSetType.ACACIA);
	public static final Block TALL_MACAW_DARK_OAK_JAPANESE_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_japanese_door")), BlockSetType.DARK_OAK);
	public static final Block TALL_MACAW_MANGROVE_JAPANESE_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_japanese_door")), BlockSetType.MANGROVE);
	public static final Block TALL_MACAW_BAMBOO_JAPANESE_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_japanese_door")), BlockSetType.BAMBOO);
	public static final Block TALL_MACAW_CRIMSON_JAPANESE_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_japanese_door")), BlockSetType.CRIMSON);
	public static final Block TALL_MACAW_WARPED_JAPANESE_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_japanese_door")), BlockSetType.WARPED);

	public static final Block TALL_MACAW_OAK_JAPANESE2_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_japanese2_door")), BlockSetType.OAK);
	public static final Block TALL_MACAW_SPRUCE_JAPANESE2_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_japanese2_door")), BlockSetType.SPRUCE);
	public static final Block TALL_MACAW_BIRCH_JAPANESE2_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_japanese2_door")), BlockSetType.BIRCH);
	public static final Block TALL_MACAW_JUNGLE_JAPANESE2_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_japanese2_door")), BlockSetType.JUNGLE);
	public static final Block TALL_MACAW_ACACIA_JAPANESE2_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_japanese2_door")), BlockSetType.ACACIA);
	public static final Block TALL_MACAW_DARK_OAK_JAPANESE2_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_japanese2_door")), BlockSetType.DARK_OAK);
	public static final Block TALL_MACAW_MANGROVE_JAPANESE2_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_japanese2_door")), BlockSetType.MANGROVE);
	public static final Block TALL_MACAW_BAMBOO_JAPANESE2_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_japanese2_door")), BlockSetType.BAMBOO);
	public static final Block TALL_MACAW_CRIMSON_JAPANESE2_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_japanese2_door")), BlockSetType.CRIMSON);
	public static final Block TALL_MACAW_WARPED_JAPANESE2_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_japanese2_door")), BlockSetType.WARPED);

	public static final Block TALL_MACAW_SPRUCE_CLASSIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_classic_door")), BlockSetType.SPRUCE);
	public static final Block TALL_MACAW_BIRCH_CLASSIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_classic_door")), BlockSetType.BIRCH);
	public static final Block TALL_MACAW_JUNGLE_CLASSIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_classic_door")), BlockSetType.JUNGLE);
	public static final Block TALL_MACAW_ACACIA_CLASSIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_classic_door")), BlockSetType.ACACIA);
	public static final Block TALL_MACAW_DARK_OAK_CLASSIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_classic_door")), BlockSetType.DARK_OAK);
	public static final Block TALL_MACAW_MANGROVE_CLASSIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_classic_door")), BlockSetType.MANGROVE);
	public static final Block TALL_MACAW_BAMBOO_CLASSIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_classic_door")), BlockSetType.BAMBOO);
	public static final Block TALL_MACAW_CRIMSON_CLASSIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_classic_door")), BlockSetType.CRIMSON);
	public static final Block TALL_MACAW_WARPED_CLASSIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_classic_door")), BlockSetType.WARPED);

	public static final Block TALL_MACAW_OAK_COTTAGE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_cottage_door")), BlockSetType.OAK);
	public static final Block TALL_MACAW_BIRCH_COTTAGE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_cottage_door")), BlockSetType.BIRCH);
	public static final Block TALL_MACAW_JUNGLE_COTTAGE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_cottage_door")), BlockSetType.JUNGLE);
	public static final Block TALL_MACAW_ACACIA_COTTAGE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_cottage_door")), BlockSetType.OAK);
	public static final Block TALL_MACAW_DARK_OAK_COTTAGE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_cottage_door")), BlockSetType.DARK_OAK);
	public static final Block TALL_MACAW_MANGROVE_COTTAGE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_cottage_door")), BlockSetType.MANGROVE);
	public static final Block TALL_MACAW_BAMBOO_COTTAGE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_cottage_door")), BlockSetType.BAMBOO);
	public static final Block TALL_MACAW_CRIMSON_COTTAGE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_cottage_door")), BlockSetType.CRIMSON);
	public static final Block TALL_MACAW_WARPED_COTTAGE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_cottage_door")), BlockSetType.WARPED);

	public static final Block TALL_MACAW_OAK_PAPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_paper_door")), BlockSetType.OAK);
	public static final Block TALL_MACAW_SPRUCE_PAPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_paper_door")), BlockSetType.SPRUCE);
	public static final Block TALL_MACAW_JUNGLE_PAPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_paper_door")), BlockSetType.JUNGLE);
	public static final Block TALL_MACAW_ACACIA_PAPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_paper_door")), BlockSetType.ACACIA);
	public static final Block TALL_MACAW_DARK_OAK_PAPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_paper_door")), BlockSetType.DARK_OAK);
	public static final Block TALL_MACAW_MANGROVE_PAPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_paper_door")), BlockSetType.MANGROVE);
	public static final Block TALL_MACAW_BAMBOO_PAPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_paper_door")), BlockSetType.BAMBOO);
	public static final Block TALL_MACAW_CRIMSON_PAPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_paper_door")), BlockSetType.CRIMSON);
	public static final Block TALL_MACAW_WARPED_PAPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_paper_door")), BlockSetType.WARPED);

	public static final Block TALL_MACAW_OAK_BEACH_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_beach_door")), BlockSetType.OAK);
	public static final Block TALL_MACAW_SPRUCE_BEACH_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_beach_door")), BlockSetType.SPRUCE);
	public static final Block TALL_MACAW_BIRCH_BEACH_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_beach_door")), BlockSetType.BIRCH);
	public static final Block TALL_MACAW_ACACIA_BEACH_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_beach_door")), BlockSetType.ACACIA);
	public static final Block TALL_MACAW_DARK_OAK_BEACH_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_beach_door")), BlockSetType.DARK_OAK);
	public static final Block TALL_MACAW_MANGROVE_BEACH_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_beach_door")), BlockSetType.MANGROVE);
	public static final Block TALL_MACAW_BAMBOO_BEACH_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_beach_door")), BlockSetType.BAMBOO);
	public static final Block TALL_MACAW_CRIMSON_BEACH_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_beach_door")), BlockSetType.CRIMSON);
	public static final Block TALL_MACAW_WARPED_BEACH_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_beach_door")), BlockSetType.WARPED);

	public static final Block TALL_MACAW_OAK_TROPICAL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_tropical_door")), BlockSetType.OAK);
	public static final Block TALL_MACAW_SPRUCE_TROPICAL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_tropical_door")), BlockSetType.SPRUCE);
	public static final Block TALL_MACAW_BIRCH_TROPICAL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_tropical_door")), BlockSetType.BIRCH);
	public static final Block TALL_MACAW_JUNGLE_TROPICAL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_tropical_door")), BlockSetType.JUNGLE);
	public static final Block TALL_MACAW_DARK_OAK_TROPICAL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_tropical_door")), BlockSetType.DARK_OAK);
	public static final Block TALL_MACAW_MANGROVE_TROPICAL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_tropical_door")), BlockSetType.MANGROVE);
	public static final Block TALL_MACAW_BAMBOO_TROPICAL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_tropical_door")), BlockSetType.BAMBOO);
	public static final Block TALL_MACAW_CRIMSON_TROPICAL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_tropical_door")), BlockSetType.CRIMSON);
	public static final Block TALL_MACAW_WARPED_TROPICAL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_tropical_door")), BlockSetType.WARPED);

	public static final Block TALL_MACAW_OAK_FOUR_PANEL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_four_panel_door")), BlockSetType.OAK);
	public static final Block TALL_MACAW_SPRUCE_FOUR_PANEL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_four_panel_door")), BlockSetType.SPRUCE);
	public static final Block TALL_MACAW_BIRCH_FOUR_PANEL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_four_panel_door")), BlockSetType.BIRCH);
	public static final Block TALL_MACAW_JUNGLE_FOUR_PANEL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_four_panel_door")), BlockSetType.JUNGLE);
	public static final Block TALL_MACAW_ACACIA_FOUR_PANEL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_four_panel_door")), BlockSetType.ACACIA);
	public static final Block TALL_MACAW_MANGROVE_FOUR_PANEL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_four_panel_door")), BlockSetType.MANGROVE);
	public static final Block TALL_MACAW_BAMBOO_FOUR_PANEL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_four_panel_door")), BlockSetType.BAMBOO);
	public static final Block TALL_MACAW_CRIMSON_FOUR_PANEL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_four_panel_door")), BlockSetType.CRIMSON);
	public static final Block TALL_MACAW_WARPED_FOUR_PANEL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_four_panel_door")), BlockSetType.WARPED);

	public static final Block TALL_MACAW_OAK_SWAMP_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_swamp_door")), BlockSetType.OAK);
	public static final Block TALL_MACAW_SPRUCE_SWAMP_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_swamp_door")), BlockSetType.SPRUCE);
	public static final Block TALL_MACAW_BIRCH_SWAMP_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_swamp_door")), BlockSetType.BIRCH);
	public static final Block TALL_MACAW_JUNGLE_SWAMP_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_swamp_door")), BlockSetType.JUNGLE);
	public static final Block TALL_MACAW_ACACIA_SWAMP_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_swamp_door")), BlockSetType.ACACIA);
	public static final Block TALL_MACAW_DARK_OAK_SWAMP_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_swamp_door")), BlockSetType.DARK_OAK);
	public static final Block TALL_MACAW_BAMBOO_SWAMP_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_swamp_door")), BlockSetType.BAMBOO);
	public static final Block TALL_MACAW_CRIMSON_SWAMP_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_swamp_door")), BlockSetType.CRIMSON);
	public static final Block TALL_MACAW_WARPED_SWAMP_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_swamp_door")), BlockSetType.WARPED);

	public static final Block TALL_MACAW_OAK_BAMBOO_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_bamboo_door")), BlockSetType.OAK);
	public static final Block TALL_MACAW_SPRUCE_BAMBOO_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_bamboo_door")), BlockSetType.SPRUCE);
	public static final Block TALL_MACAW_BIRCH_BAMBOO_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_bamboo_door")), BlockSetType.BIRCH);
	public static final Block TALL_MACAW_JUNGLE_BAMBOO_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_bamboo_door")), BlockSetType.JUNGLE);
	public static final Block TALL_MACAW_ACACIA_BAMBOO_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_bamboo_door")), BlockSetType.ACACIA);
	public static final Block TALL_MACAW_DARK_OAK_BAMBOO_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_bamboo_door")), BlockSetType.DARK_OAK);
	public static final Block TALL_MACAW_MANGROVE_BAMBOO_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_bamboo_door")), BlockSetType.MANGROVE);
	public static final Block TALL_MACAW_CRIMSON_BAMBOO_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_bamboo_door")), BlockSetType.CRIMSON);
	public static final Block TALL_MACAW_WARPED_BAMBOO_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_bamboo_door")), BlockSetType.WARPED);
	
	public static final Block TALL_MACAW_OAK_NETHER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_nether_door")), BlockSetType.OAK);
	public static final Block TALL_MACAW_SPRUCE_NETHER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_nether_door")), BlockSetType.SPRUCE);
	public static final Block TALL_MACAW_BIRCH_NETHER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_nether_door")), BlockSetType.BIRCH);
	public static final Block TALL_MACAW_JUNGLE_NETHER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_nether_door")), BlockSetType.JUNGLE);
	public static final Block TALL_MACAW_ACACIA_NETHER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_nether_door")), BlockSetType.ACACIA);
	public static final Block TALL_MACAW_DARK_OAK_NETHER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_nether_door")), BlockSetType.DARK_OAK);
	public static final Block TALL_MACAW_MANGROVE_NETHER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_nether_door")), BlockSetType.MANGROVE);
	public static final Block TALL_MACAW_BAMBOO_NETHER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_nether_door")), BlockSetType.BAMBOO);
	public static final Block TALL_MACAW_WARPED_NETHER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_nether_door")), BlockSetType.WARPED);

	public static final Block TALL_MACAW_OAK_MYSTIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_mystic_door")), BlockSetType.OAK);
	public static final Block TALL_MACAW_SPRUCE_MYSTIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_mystic_door")), BlockSetType.SPRUCE);
	public static final Block TALL_MACAW_BIRCH_MYSTIC_DOOR =  new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_mystic_door")), BlockSetType.BIRCH);
	public static final Block TALL_MACAW_JUNGLE_MYSTIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_mystic_door")), BlockSetType.JUNGLE);
	public static final Block TALL_MACAW_ACACIA_MYSTIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_mystic_door")), BlockSetType.ACACIA);
	public static final Block TALL_MACAW_DARK_OAK_MYSTIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_mystic_door")), BlockSetType.DARK_OAK);
	public static final Block TALL_MACAW_MANGROVE_MYSTIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_mystic_door")), BlockSetType.MANGROVE);
	public static final Block TALL_MACAW_BAMBOO_MYSTIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_mystic_door")), BlockSetType.BAMBOO);
	public static final Block TALL_MACAW_CRIMSON_MYSTIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_mystic_door")), BlockSetType.CRIMSON);
    
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

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_ASPEN), SHORT_BYG_ASPEN_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_BAOBAB), SHORT_BYG_BAOBAB_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_BLUE_ENCHANTED), SHORT_BYG_BLUE_ENCHANTED_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_BULBIS), SHORT_BYG_BULBIS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_CHERRY), SHORT_BYG_CHERRY_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_CIKA), SHORT_BYG_CIKA_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_CYPRESS), SHORT_BYG_CYPRESS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_EBONY), SHORT_BYG_EBONY_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_EMBUR), SHORT_BYG_EMBUR_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_ETHER), SHORT_BYG_ETHER_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_FIR), SHORT_BYG_FIR_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_FLORUS), SHORT_BYG_FLORUS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_GREEN_ENCHANTED), SHORT_BYG_GREEN_ENCHANTED_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_HOLLY), SHORT_BYG_HOLLY_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_IMPARIUS), SHORT_BYG_IMPARIUS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_IRONWOOD), SHORT_BYG_IRONWOOD_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_JACARANDA), SHORT_BYG_JACARANDA_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_LAMENT), SHORT_BYG_LAMENT_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_MAHOGANY), SHORT_BYG_MAHOGANY_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_MAPLE), SHORT_BYG_MAPLE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_NIGHTSHADE), SHORT_BYG_NIGHTSHADE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_PALM), SHORT_BYG_PALM_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_PINE), SHORT_BYG_PINE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_RAINBOW_EUCALYPTUS), SHORT_BYG_RAINBOW_EUCALYPTUS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_REDWOOD), SHORT_BYG_REDWOOD_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_SKYRIS), SHORT_BYG_SKYRIS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_SOUL_SHROOM), SHORT_BYG_SOUL_SHROOM_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_SYTHIAN), SHORT_BYG_SYTHIAN_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_WHITE_MANGROVE), SHORT_BYG_WHITE_MANGROVE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_WILLOW), SHORT_BYG_WILLOW_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_WITCH_HAZEL), SHORT_BYG_WITCH_HAZEL_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_ZELKOVA), SHORT_BYG_ZELKOVA_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_ASPEN), TALL_BYG_ASPEN_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_BAOBAB), TALL_BYG_BAOBAB_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_BLUE_ENCHANTED), TALL_BYG_BLUE_ENCHANTED_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_BULBIS), TALL_BYG_BULBIS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_CHERRY), TALL_BYG_CHERRY_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_CIKA), TALL_BYG_CIKA_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_CYPRESS), TALL_BYG_CYPRESS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_EBONY), TALL_BYG_EBONY_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_EMBUR), TALL_BYG_EMBUR_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_ETHER), TALL_BYG_ETHER_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_FIR), TALL_BYG_FIR_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_FLORUS), TALL_BYG_FLORUS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_GREEN_ENCHANTED), TALL_BYG_GREEN_ENCHANTED_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_HOLLY), TALL_BYG_HOLLY_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_IMPARIUS), TALL_BYG_IMPARIUS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_IRONWOOD), TALL_BYG_IRONWOOD_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_JACARANDA), TALL_BYG_JACARANDA_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_LAMENT), TALL_BYG_LAMENT_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_MAHOGANY), TALL_BYG_MAHOGANY_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_MAPLE), TALL_BYG_MAPLE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_NIGHTSHADE), TALL_BYG_NIGHTSHADE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_PALM), TALL_BYG_PALM_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_PINE), TALL_BYG_PINE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_RAINBOW_EUCALYPTUS), TALL_BYG_RAINBOW_EUCALYPTUS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_REDWOOD), TALL_BYG_REDWOOD_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_SKYRIS), TALL_BYG_SKYRIS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_SOUL_SHROOM), TALL_BYG_SOUL_SHROOM_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_SYTHIAN), TALL_BYG_SYTHIAN_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_WHITE_MANGROVE), TALL_BYG_WHITE_MANGROVE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_WILLOW), TALL_BYG_WILLOW_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_WITCH_HAZEL), TALL_BYG_WITCH_HAZEL_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_ZELKOVA), TALL_BYG_ZELKOVA_DOOR);
        
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_JACARANDA), SHORT_JACARANDA_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_REDBUD), SHORT_REDBUD_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CYPRESS), SHORT_CYPRESS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BROWN_MUSHROOM), SHORT_BROWN_MUSHROOM_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RED_MUSHROOM), SHORT_RED_MUSHROOM_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_JACARANDA), TALL_JACARANDA_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_REDBUD), TALL_REDBUD_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CYPRESS), TALL_CYPRESS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BROWN_MUSHROOM), TALL_BROWN_MUSHROOM_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RED_MUSHROOM), TALL_RED_MUSHROOM_DOOR);
        
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_AERONOS), SHORT_AERONOS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GLACIAN), SHORT_GLACIAN_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_STROPHAR), SHORT_STROPHAR_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_STEEL), SHORT_STEEL_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AERONOS), TALL_AERONOS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GLACIAN), TALL_GLACIAN_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_STROPHAR), TALL_STROPHAR_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_STEEL), TALL_STEEL_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_AETHER_SKYROOT), SHORT_AETHER_SKYROOT_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AETHER_SKYROOT), TALL_AETHER_SKYROOT_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TWISTED), SHORT_TWISTED_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TWISTED), TALL_TWISTED_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BE_BAMBOO), SHORT_BE_BAMBOO_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BE_DRY_BAMBOO), SHORT_BE_DRY_BAMBOO_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BE_BAMBOO), TALL_BE_BAMBOO_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BE_DRY_BAMBOO), TALL_BE_DRY_BAMBOO_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TERMINITE), SHORT_TERMINITE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_THALLASIUM), SHORT_THALLASIUM_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_DRAGON_TREE), SHORT_DRAGON_TREE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_END_LOTUS), SHORT_END_LOTUS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_HELIX_TREE), SHORT_HELIX_TREE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_JELLYSHROOM), SHORT_JELLYSHROOM_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LACUGROVE), SHORT_LACUGROVE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LUCERNIA), SHORT_LUCERNIA_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MOSSY_GLOWSHROOM), SHORT_MOSSY_GLOWSHROOM_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PYTHADENDRON), SHORT_PYTHADENDRON_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TENANEA), SHORT_TENANEA_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_UMBRELLA_TREE), SHORT_UMBRELLA_TREE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TERMINITE), TALL_TERMINITE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_THALLASIUM), TALL_THALLASIUM_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DRAGON_TREE), TALL_DRAGON_TREE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_END_LOTUS), TALL_END_LOTUS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_HELIX_TREE), TALL_HELIX_TREE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_JELLYSHROOM), TALL_JELLYSHROOM_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LACUGROVE), TALL_LACUGROVE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LUCERNIA), TALL_LUCERNIA_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MOSSY_GLOWSHROOM), TALL_MOSSY_GLOWSHROOM_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PYTHADENDRON), TALL_PYTHADENDRON_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TENANEA), TALL_TENANEA_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_UMBRELLA_TREE), TALL_UMBRELLA_TREE_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ANCHOR_TREE), SHORT_ANCHOR_TREE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BONE_CIN), SHORT_BONE_CIN_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BONE_REED), SHORT_BONE_REED_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MUSHROOM_FIR), SHORT_MUSHROOM_FIR_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_NETHER_MUSHROOM), SHORT_NETHER_MUSHROOM_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_NETHER_REED), SHORT_NETHER_REED_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_NETHER_SAKURA), SHORT_NETHER_SAKURA_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUBEUS), SHORT_RUBEUS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_STALAGNATE), SHORT_STALAGNATE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WART), SHORT_WART_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BN_WILLOW), SHORT_BN_WILLOW_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ANCHOR_TREE), TALL_ANCHOR_TREE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BONE_CIN), TALL_BONE_CIN_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BONE_REED), TALL_BONE_REED_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MUSHROOM_FIR), TALL_MUSHROOM_FIR_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_NETHER_MUSHROOM), TALL_NETHER_MUSHROOM_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_NETHER_REED), TALL_NETHER_REED_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_NETHER_SAKURA), TALL_NETHER_SAKURA_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUBEUS), TALL_RUBEUS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_STALAGNATE), TALL_STALAGNATE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WART), TALL_WART_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BN_WILLOW), TALL_BN_WILLOW_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BW_CYPRESS), SHORT_BW_CYPRESS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_DRAGONS_BLOOD), SHORT_DRAGONS_BLOOD_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ELDER), SHORT_ELDER_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_JUNIPER), SHORT_JUNIPER_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BW_CYPRESS), TALL_BW_CYPRESS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DRAGONS_BLOOD), TALL_DRAGONS_BLOOD_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ELDER), TALL_ELDER_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_JUNIPER), TALL_JUNIPER_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_YEW), SHORT_YEW_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_YEW), TALL_YEW_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BM_ANCIENT_OAK), SHORT_BM_ANCIENT_OAK_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BM_BLIGHTED_BALSA), SHORT_BM_BLIGHTED_BALSA_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BM_SWAMP_CYPRESS), SHORT_BM_SWAMP_CYPRESS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BM_WILLOW), SHORT_BM_WILLOW_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BM_ANCIENT_OAK), TALL_BM_ANCIENT_OAK_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BM_BLIGHTED_BALSA), TALL_BM_BLIGHTED_BALSA_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BM_SWAMP_CYPRESS), TALL_BM_SWAMP_CYPRESS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BM_WILLOW), TALL_BM_WILLOW_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FLESH), SHORT_FLESH_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FULL_FLESH), SHORT_FULL_FLESH_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FLESHKIN), SHORT_FLESHKIN_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FLESH), TALL_FLESH_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FULL_FLESH), TALL_FULL_FLESH_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FLESHKIN), TALL_FLESHKIN_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BLOCKUS_BAMBOO), SHORT_BLOCKUS_BAMBOO_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BLOCKUS_BLACKSTONE), SHORT_BLOCKUS_BLACKSTONE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BLOCKUS_CHARRED), SHORT_BLOCKUS_CHARRED_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BLOCKUS_OBSIDIAN_REINFORCED), SHORT_BLOCKUS_OBSIDIAN_REINFORCED_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BLOCKUS_PAPER), SHORT_BLOCKUS_PAPER_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BLOCKUS_STONE), SHORT_BLOCKUS_STONE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BLOCKUS_WHITE_OAK), SHORT_BLOCKUS_WHITE_OAK_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BLOCKUS_BAMBOO), TALL_BLOCKUS_BAMBOO_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BLOCKUS_BLACKSTONE), TALL_BLOCKUS_BLACKSTONE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BLOCKUS_CHARRED), TALL_BLOCKUS_CHARRED_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BLOCKUS_OBSIDIAN_REINFORCED), TALL_BLOCKUS_OBSIDIAN_REINFORCED_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BLOCKUS_PAPER), TALL_BLOCKUS_PAPER_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BLOCKUS_STONE), TALL_BLOCKUS_STONE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BLOCKUS_WHITE_OAK), TALL_BLOCKUS_WHITE_OAK_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CEILTRUNK), SHORT_CEILTRUNK_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LUZAWOOD), SHORT_LUZAWOOD_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CEILTRUNK), TALL_CEILTRUNK_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LUZAWOOD), TALL_LUZAWOOD_DOOR);
        
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CHARM_AZALEA), SHORT_CHARM_AZALEA_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CHARM_EBONY), SHORT_CHARM_EBONY_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHARM_AZALEA), TALL_CHARM_AZALEA_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHARM_EBONY), TALL_CHARM_EBONY_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SCORCHED), SHORT_SCORCHED_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_UMBRAL), SHORT_UMBRAL_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SCORCHED), TALL_SCORCHED_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_UMBRAL), TALL_UMBRAL_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_APRICORN), SHORT_APRICORN_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_APRICORN), TALL_APRICORN_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_AZULE_AZALEA), SHORT_AZULE_AZALEA_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BRIGHT_AZALEA), SHORT_BRIGHT_AZALEA_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FISS_AZALEA), SHORT_FISS_AZALEA_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ROZE_AZALEA), SHORT_ROZE_AZALEA_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TECAL_AZALEA), SHORT_TECAL_AZALEA_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TITANIUM_AZALEA), SHORT_TITANIUM_AZALEA_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WALNUT_AZALEA), SHORT_WALNUT_AZALEA_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AZULE_AZALEA), TALL_AZULE_AZALEA_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BRIGHT_AZALEA), TALL_BRIGHT_AZALEA_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FISS_AZALEA), TALL_FISS_AZALEA_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ROZE_AZALEA), TALL_ROZE_AZALEA_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TECAL_AZALEA), TALL_TECAL_AZALEA_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TITANIUM_AZALEA), TALL_TITANIUM_AZALEA_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WALNUT_AZALEA), TALL_WALNUT_AZALEA_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ANDESITE), SHORT_ANDESITE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BRASS), SHORT_BRASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_COPPER), SHORT_COPPER_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ZINC), SHORT_ZINC_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LOCKED_ANDESITE), SHORT_LOCKED_ANDESITE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LOCKED_BRASS), SHORT_LOCKED_BRASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LOCKED_COPPER), SHORT_LOCKED_COPPER_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LOCKED_ZINC), SHORT_LOCKED_ZINC_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ANDESITE), TALL_ANDESITE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BRASS), TALL_BRASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_COPPER), TALL_COPPER_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ZINC), TALL_ZINC_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LOCKED_ANDESITE), TALL_LOCKED_ANDESITE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LOCKED_BRASS), TALL_LOCKED_BRASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LOCKED_COPPER), TALL_LOCKED_COPPER_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LOCKED_ZINC), TALL_LOCKED_ZINC_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ECHO), SHORT_ECHO_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ECHO), TALL_ECHO_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ECO_AZALEA), SHORT_ECO_AZALEA_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ECO_FLOWERING_AZALEA), SHORT_ECO_FLOWERING_AZALEA_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ECO_COCONUT), SHORT_ECO_COCONUT_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ECO_WALNUT), SHORT_ECO_WALNUT_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ECO_AZALEA), TALL_ECO_AZALEA_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ECO_FLOWERING_AZALEA), TALL_ECO_FLOWERING_AZALEA_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ECO_COCONUT), TALL_ECO_COCONUT_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ECO_WALNUT), TALL_ECO_WALNUT_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SOULBLIGHT), SHORT_SOULBLIGHT_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WHISTLECANE), SHORT_WHISTLECANE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SOULBLIGHT), TALL_SOULBLIGHT_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WHISTLECANE), TALL_WHISTLECANE_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GE_CYPRESS), SHORT_GE_CYPRESS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GE_MUDDY_OAK), SHORT_GE_MUDDY_OAK_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GE_CYPRESS), TALL_GE_CYPRESS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GE_MUDDY_OAK), TALL_GE_MUDDY_OAK_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_DARK_IRON), SHORT_DARK_IRON_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DARK_IRON), TALL_DARK_IRON_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EDIFIED), SHORT_EDIFIED_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EDIFIED), TALL_EDIFIED_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_IRON_GLASS), SHORT_IRON_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_OAK_GLASS), SHORT_OAK_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SPRUCE_GLASS), SHORT_SPRUCE_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BIRCH_GLASS), SHORT_BIRCH_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_JUNGLE_GLASS), SHORT_JUNGLE_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ACACIA_GLASS), SHORT_ACACIA_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_DARK_OAK_GLASS), SHORT_DARK_OAK_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MANGROVE_GLASS), SHORT_MANGROVE_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BAMBOO_GLASS), SHORT_BAMBOO_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CHERRY_GLASS), SHORT_CHERRY_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CRIMSON_GLASS), SHORT_CRIMSON_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WARPED_GLASS), SHORT_WARPED_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_IRON_GLASS), TALL_IRON_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_OAK_GLASS), TALL_OAK_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SPRUCE_GLASS), TALL_SPRUCE_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BIRCH_GLASS), TALL_BIRCH_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_JUNGLE_GLASS), TALL_JUNGLE_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ACACIA_GLASS), TALL_ACACIA_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DARK_OAK_GLASS), TALL_DARK_OAK_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANGROVE_GLASS), TALL_MANGROVE_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BAMBOO_GLASS), TALL_BAMBOO_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHERRY_GLASS), TALL_CHERRY_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CRIMSON_GLASS), TALL_CRIMSON_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WARPED_GLASS), TALL_WARPED_GLASS_DOOR);
        
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BLOODSHROOM), SHORT_BLOODSHROOM_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GREENHEART), SHORT_GREENHEART_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SKYROOT), SHORT_SKYROOT_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BLOODSHROOM), TALL_BLOODSHROOM_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GREENHEART), TALL_GREENHEART_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SKYROOT), TALL_SKYROOT_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PROMENADE_CHERRY_OAK), SHORT_PROMENADE_CHERRY_OAK_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PROMENADE_DARK_AMARANTH), SHORT_PROMENADE_DARK_AMARANTH_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PROMENADE_PALM), SHORT_PROMENADE_PALM_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PROMENADE_CHERRY_OAK), TALL_PROMENADE_CHERRY_OAK_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PROMENADE_DARK_AMARANTH), TALL_PROMENADE_DARK_AMARANTH_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PROMENADE_PALM), TALL_PROMENADE_PALM_DOOR);

		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_BAOBAB), SHORT_RUE_BAOBAB_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_BLACKWOOD), SHORT_RUE_BLACKWOOD_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_BRIMWOOD), SHORT_RUE_BRIMWOOD_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_CHERRY), SHORT_RUE_CHERRY_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_CYPRESS), SHORT_RUE_CYPRESS_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_DEAD), SHORT_RUE_DEAD_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_EUCALYPTUS), SHORT_RUE_EUCALYPTUS_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_JOSHUA), SHORT_RUE_JOSHUA_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_LARCH), SHORT_RUE_LARCH_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_MAPLE), SHORT_RUE_MAPLE_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_MAUVE), SHORT_RUE_MAUVE_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_PALM), SHORT_RUE_PALM_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_PINE), SHORT_RUE_PINE_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_REDWOOD), SHORT_RUE_REDWOOD_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_WILLOW), SHORT_RUE_WILLOW_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_BAOBAB), TALL_RUE_BAOBAB_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_BLACKWOOD), TALL_RUE_BLACKWOOD_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_BRIMWOOD), TALL_RUE_BRIMWOOD_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_CHERRY), TALL_RUE_CHERRY_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_CYPRESS), TALL_RUE_CYPRESS_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_DEAD), TALL_RUE_DEAD_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_EUCALYPTUS), TALL_RUE_EUCALYPTUS_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_JOSHUA), TALL_RUE_JOSHUA_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_LARCH), TALL_RUE_LARCH_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_MAPLE), TALL_RUE_MAPLE_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_MAUVE), TALL_RUE_MAUVE_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_PALM), TALL_RUE_PALM_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_PINE), TALL_RUE_PINE_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_REDWOOD), TALL_RUE_REDWOOD_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_WILLOW), TALL_RUE_WILLOW_DOOR);
		
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GINGERBREAD), SHORT_GINGERBREAD_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GINGERBREAD), TALL_GINGERBREAD_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GOLD), SHORT_GOLD_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_NETHERITE), SHORT_NETHERITE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GOLD), TALL_GOLD_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_NETHERITE), TALL_NETHERITE_DOOR);
        
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUBBER), SHORT_RUBBER_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUBBER), TALL_RUBBER_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TERRESTRIA_CYPRESS), SHORT_TERRESTRIA_CYPRESS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TERRESTRIA_HEMLOCK), SHORT_TERRESTRIA_HEMLOCK_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TERRESTRIA_JAPANESE_MAPLE), SHORT_TERRESTRIA_JAPANESE_MAPLE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TERRESTRIA_RAINBOW_EUCALYPTUS), SHORT_TERRESTRIA_RAINBOW_EUCALYPTUS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TERRESTRIA_REDWOOD), SHORT_TERRESTRIA_REDWOOD_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TERRESTRIA_RUBBER), SHORT_TERRESTRIA_RUBBER_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TERRESTRIA_SAKURA), SHORT_TERRESTRIA_SAKURA_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TERRESTRIA_WILLOW), SHORT_TERRESTRIA_WILLOW_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TERRESTRIA_YUCCA_PALM), SHORT_TERRESTRIA_YUCCA_PALM_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TERRESTRIA_CYPRESS), TALL_TERRESTRIA_CYPRESS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TERRESTRIA_HEMLOCK), TALL_TERRESTRIA_HEMLOCK_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TERRESTRIA_JAPANESE_MAPLE), TALL_TERRESTRIA_JAPANESE_MAPLE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TERRESTRIA_RAINBOW_EUCALYPTUS), TALL_TERRESTRIA_RAINBOW_EUCALYPTUS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TERRESTRIA_REDWOOD), TALL_TERRESTRIA_REDWOOD_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TERRESTRIA_RUBBER), TALL_TERRESTRIA_RUBBER_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TERRESTRIA_SAKURA), TALL_TERRESTRIA_SAKURA_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TERRESTRIA_WILLOW), TALL_TERRESTRIA_WILLOW_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TERRESTRIA_YUCCA_PALM), TALL_TERRESTRIA_YUCCA_PALM_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TRAVERSE_FIR), SHORT_TRAVERSE_FIR_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TRAVERSE_FIR), TALL_TRAVERSE_FIR_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_STRIPPED_BAMBOO), SHORT_STRIPPED_BAMBOO_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_STRIPPED_BAMBOO), TALL_STRIPPED_BAMBOO_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CANOPY), SHORT_CANOPY_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_DARKWOOD), SHORT_DARKWOOD_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MINEWOOD), SHORT_MINEWOOD_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SORTINGWOOD), SHORT_SORTINGWOOD_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TIMEWOOD), SHORT_TIMEWOOD_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TRANSWOOD), SHORT_TRANSWOOD_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TWILIGHT_MANGROVE), SHORT_TWILIGHT_MANGROVE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TWILIGHT_OAK), SHORT_TWILIGHT_OAK_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CANOPY), TALL_CANOPY_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DARKWOOD), TALL_DARKWOOD_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MINEWOOD), TALL_MINEWOOD_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SORTINGWOOD), TALL_SORTINGWOOD_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TIMEWOOD), TALL_TIMEWOOD_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TRANSWOOD), TALL_TRANSWOOD_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TWILIGHT_MANGROVE), TALL_TWILIGHT_MANGROVE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TWILIGHT_OAK), TALL_TWILIGHT_OAK_DOOR);
        
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TOWERWOOD), SHORT_TOWERWOOD_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TOWERWOOD), TALL_TOWERWOOD_DOOR);
        
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SOUL_COPPER), SHORT_SOUL_COPPER_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SOUL_COPPER), TALL_SOUL_COPPER_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MYSTICAL_OAK), SHORT_MYSTICAL_OAK_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MYSTICAL_OAK), TALL_MYSTICAL_OAK_DOOR);
        
        //Register all those Chipped doors.
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_HEAVY), TALL_CHIPPED_OAK_HEAVY_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_DUAL_PANELED), TALL_CHIPPED_OAK_DUAL_PANELED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_PRESSED), TALL_CHIPPED_OAK_PRESSED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_SHACK), TALL_CHIPPED_OAK_SHACK_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_FORTIFIED), TALL_CHIPPED_OAK_FORTIFIED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_SLIDING), TALL_CHIPPED_OAK_SLIDING_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_SCREEN), TALL_CHIPPED_OAK_SCREEN_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_GATED), TALL_CHIPPED_OAK_GATED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_GLASS), TALL_CHIPPED_OAK_GLASS_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_WINDOWED), TALL_CHIPPED_OAK_WINDOWED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_TILED), TALL_CHIPPED_OAK_TILED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_TILE_WINDOWED), TALL_CHIPPED_OAK_TILE_WINDOWED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_SECRET), TALL_CHIPPED_OAK_SECRET_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_BOARDED), TALL_CHIPPED_OAK_BOARDED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_PAPER), TALL_CHIPPED_OAK_PAPER_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_BEACH), TALL_CHIPPED_OAK_BEACH_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_BARRED), TALL_CHIPPED_OAK_BARRED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_PANELED), TALL_CHIPPED_OAK_PANELED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_SUPPORTED), TALL_CHIPPED_OAK_SUPPORTED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_OVERGROWN), TALL_CHIPPED_OAK_OVERGROWN_DOOR);
    
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_HEAVY), TALL_CHIPPED_SPRUCE_HEAVY_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_DUAL_PANELED), TALL_CHIPPED_SPRUCE_DUAL_PANELED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_PRESSED), TALL_CHIPPED_SPRUCE_PRESSED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_SHACK), TALL_CHIPPED_SPRUCE_SHACK_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_FORTIFIED), TALL_CHIPPED_SPRUCE_FORTIFIED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_SLIDING), TALL_CHIPPED_SPRUCE_SLIDING_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_SCREEN), TALL_CHIPPED_SPRUCE_SCREEN_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_GATED), TALL_CHIPPED_SPRUCE_GATED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_GLASS), TALL_CHIPPED_SPRUCE_GLASS_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_WINDOWED), TALL_CHIPPED_SPRUCE_WINDOWED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_TILED), TALL_CHIPPED_SPRUCE_TILED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_TILE_WINDOWED), TALL_CHIPPED_SPRUCE_TILE_WINDOWED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_SECRET), TALL_CHIPPED_SPRUCE_SECRET_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_MODERN), TALL_CHIPPED_SPRUCE_MODERN_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_PAPER), TALL_CHIPPED_SPRUCE_PAPER_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_BEACH), TALL_CHIPPED_SPRUCE_BEACH_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_BARRED), TALL_CHIPPED_SPRUCE_BARRED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_PANELED), TALL_CHIPPED_SPRUCE_PANELED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_SUPPORTED), TALL_CHIPPED_SPRUCE_SUPPORTED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_OVERGROWN), TALL_CHIPPED_SPRUCE_OVERGROWN_DOOR);

		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_HEAVY), TALL_CHIPPED_BIRCH_HEAVY_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_DUAL_PANELED), TALL_CHIPPED_BIRCH_DUAL_PANELED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_PRESSED), TALL_CHIPPED_BIRCH_PRESSED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_SHACK), TALL_CHIPPED_BIRCH_SHACK_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_FORTIFIED), TALL_CHIPPED_BIRCH_FORTIFIED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_SLIDING), TALL_CHIPPED_BIRCH_SLIDING_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_SCREEN), TALL_CHIPPED_BIRCH_SCREEN_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_GATED), TALL_CHIPPED_BIRCH_GATED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_GLASS), TALL_CHIPPED_BIRCH_GLASS_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_WINDOWED), TALL_CHIPPED_BIRCH_WINDOWED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_TILED), TALL_CHIPPED_BIRCH_TILED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_TILE_WINDOWED), TALL_CHIPPED_BIRCH_TILE_WINDOWED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_SECRET), TALL_CHIPPED_BIRCH_SECRET_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_MODERN), TALL_CHIPPED_BIRCH_MODERN_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_BOARDED), TALL_CHIPPED_BIRCH_BOARDED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_BEACH), TALL_CHIPPED_BIRCH_BEACH_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_BARRED), TALL_CHIPPED_BIRCH_BARRED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_PANELED), TALL_CHIPPED_BIRCH_PANELED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_SUPPORTED), TALL_CHIPPED_BIRCH_SUPPORTED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_OVERGROWN), TALL_CHIPPED_BIRCH_OVERGROWN_DOOR);

		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_HEAVY), TALL_CHIPPED_JUNGLE_HEAVY_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_DUAL_PANELED), TALL_CHIPPED_JUNGLE_DUAL_PANELED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_PRESSED), TALL_CHIPPED_JUNGLE_PRESSED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_SHACK), TALL_CHIPPED_JUNGLE_SHACK_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_FORTIFIED), TALL_CHIPPED_JUNGLE_FORTIFIED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_SLIDING), TALL_CHIPPED_JUNGLE_SLIDING_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_SCREEN), TALL_CHIPPED_JUNGLE_SCREEN_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_GATED), TALL_CHIPPED_JUNGLE_GATED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_GLASS), TALL_CHIPPED_JUNGLE_GLASS_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_WINDOWED), TALL_CHIPPED_JUNGLE_WINDOWED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_TILED), TALL_CHIPPED_JUNGLE_TILED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_TILE_WINDOWED), TALL_CHIPPED_JUNGLE_TILE_WINDOWED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_SECRET), TALL_CHIPPED_JUNGLE_SECRET_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_MODERN), TALL_CHIPPED_JUNGLE_MODERN_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_BOARDED), TALL_CHIPPED_JUNGLE_BOARDED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_PAPER), TALL_CHIPPED_JUNGLE_PAPER_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_BARRED), TALL_CHIPPED_JUNGLE_BARRED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_PANELED), TALL_CHIPPED_JUNGLE_PANELED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_SUPPORTED), TALL_CHIPPED_JUNGLE_SUPPORTED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_OVERGROWN), TALL_CHIPPED_JUNGLE_OVERGROWN_DOOR);

		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_HEAVY), TALL_CHIPPED_ACACIA_HEAVY_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_DUAL_PANELED), TALL_CHIPPED_ACACIA_DUAL_PANELED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_PRESSED), TALL_CHIPPED_ACACIA_PRESSED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_SHACK), TALL_CHIPPED_ACACIA_SHACK_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_FORTIFIED), TALL_CHIPPED_ACACIA_FORTIFIED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_SLIDING), TALL_CHIPPED_ACACIA_SLIDING_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_SCREEN), TALL_CHIPPED_ACACIA_SCREEN_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_GATED), TALL_CHIPPED_ACACIA_GATED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_GLASS), TALL_CHIPPED_ACACIA_GLASS_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_WINDOWED), TALL_CHIPPED_ACACIA_WINDOWED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_TILED), TALL_CHIPPED_ACACIA_TILED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_TILE_WINDOWED), TALL_CHIPPED_ACACIA_TILE_WINDOWED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_SECRET), TALL_CHIPPED_ACACIA_SECRET_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_MODERN), TALL_CHIPPED_ACACIA_MODERN_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_BOARDED), TALL_CHIPPED_ACACIA_BOARDED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_PAPER), TALL_CHIPPED_ACACIA_PAPER_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_BEACH), TALL_CHIPPED_ACACIA_BEACH_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_PANELED), TALL_CHIPPED_ACACIA_PANELED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_SUPPORTED), TALL_CHIPPED_ACACIA_SUPPORTED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_OVERGROWN), TALL_CHIPPED_ACACIA_OVERGROWN_DOOR);

		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_HEAVY), TALL_CHIPPED_DARK_OAK_HEAVY_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_DUAL_PANELED), TALL_CHIPPED_DARK_OAK_DUAL_PANELED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_PRESSED), TALL_CHIPPED_DARK_OAK_PRESSED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_SHACK), TALL_CHIPPED_DARK_OAK_SHACK_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_FORTIFIED), TALL_CHIPPED_DARK_OAK_FORTIFIED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_SLIDING), TALL_CHIPPED_DARK_OAK_SLIDING_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_SCREEN), TALL_CHIPPED_DARK_OAK_SCREEN_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_GATED), TALL_CHIPPED_DARK_OAK_GATED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_GLASS), TALL_CHIPPED_DARK_OAK_GLASS_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_WINDOWED), TALL_CHIPPED_DARK_OAK_WINDOWED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_TILED), TALL_CHIPPED_DARK_OAK_TILED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_TILE_WINDOWED), TALL_CHIPPED_DARK_OAK_TILE_WINDOWED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_SECRET), TALL_CHIPPED_DARK_OAK_SECRET_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_MODERN), TALL_CHIPPED_DARK_OAK_MODERN_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_BOARDED), TALL_CHIPPED_DARK_OAK_BOARDED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_PAPER), TALL_CHIPPED_DARK_OAK_PAPER_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_BEACH), TALL_CHIPPED_DARK_OAK_BEACH_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_BARRED), TALL_CHIPPED_DARK_OAK_BARRED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_SUPPORTED), TALL_CHIPPED_DARK_OAK_SUPPORTED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_OVERGROWN), TALL_CHIPPED_DARK_OAK_OVERGROWN_DOOR);

		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_HEAVY), TALL_CHIPPED_MANGROVE_HEAVY_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_DUAL_PANELED), TALL_CHIPPED_MANGROVE_DUAL_PANELED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_PRESSED), TALL_CHIPPED_MANGROVE_PRESSED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_SHACK), TALL_CHIPPED_MANGROVE_SHACK_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_FORTIFIED), TALL_CHIPPED_MANGROVE_FORTIFIED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_SLIDING), TALL_CHIPPED_MANGROVE_SLIDING_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_SCREEN), TALL_CHIPPED_MANGROVE_SCREEN_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_GATED), TALL_CHIPPED_MANGROVE_GATED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_GLASS), TALL_CHIPPED_MANGROVE_GLASS_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_WINDOWED), TALL_CHIPPED_MANGROVE_WINDOWED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_TILED), TALL_CHIPPED_MANGROVE_TILED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_TILE_WINDOWED), TALL_CHIPPED_MANGROVE_TILE_WINDOWED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_SECRET), TALL_CHIPPED_MANGROVE_SECRET_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_MODERN), TALL_CHIPPED_MANGROVE_MODERN_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_BOARDED), TALL_CHIPPED_MANGROVE_BOARDED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_PAPER), TALL_CHIPPED_MANGROVE_PAPER_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_BEACH), TALL_CHIPPED_MANGROVE_BEACH_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_BARRED), TALL_CHIPPED_MANGROVE_BARRED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_PANELED), TALL_CHIPPED_MANGROVE_PANELED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_SUPPORTED), TALL_CHIPPED_MANGROVE_SUPPORTED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_OVERGROWN), TALL_CHIPPED_MANGROVE_OVERGROWN_DOOR);

		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_HEAVY), TALL_CHIPPED_CRIMSON_HEAVY_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_DUAL_PANELED), TALL_CHIPPED_CRIMSON_DUAL_PANELED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_PRESSED), TALL_CHIPPED_CRIMSON_PRESSED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_SHACK), TALL_CHIPPED_CRIMSON_SHACK_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_FORTIFIED), TALL_CHIPPED_CRIMSON_FORTIFIED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_SLIDING), TALL_CHIPPED_CRIMSON_SLIDING_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_SCREEN), TALL_CHIPPED_CRIMSON_SCREEN_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_GATED), TALL_CHIPPED_CRIMSON_GATED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_GLASS), TALL_CHIPPED_CRIMSON_GLASS_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_WINDOWED), TALL_CHIPPED_CRIMSON_WINDOWED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_TILED), TALL_CHIPPED_CRIMSON_TILED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_TILE_WINDOWED), TALL_CHIPPED_CRIMSON_TILE_WINDOWED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_SECRET), TALL_CHIPPED_CRIMSON_SECRET_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_MODERN), TALL_CHIPPED_CRIMSON_MODERN_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_BOARDED), TALL_CHIPPED_CRIMSON_BOARDED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_PAPER), TALL_CHIPPED_CRIMSON_PAPER_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_BEACH), TALL_CHIPPED_CRIMSON_BEACH_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_BARRED), TALL_CHIPPED_CRIMSON_BARRED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_PANELED), TALL_CHIPPED_CRIMSON_PANELED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_OVERGROWN), TALL_CHIPPED_CRIMSON_OVERGROWN_DOOR);

		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_HEAVY), TALL_CHIPPED_WARPED_HEAVY_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_DUAL_PANELED), TALL_CHIPPED_WARPED_DUAL_PANELED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_PRESSED), TALL_CHIPPED_WARPED_PRESSED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_SHACK), TALL_CHIPPED_WARPED_SHACK_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_FORTIFIED), TALL_CHIPPED_WARPED_FORTIFIED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_SLIDING), TALL_CHIPPED_WARPED_SLIDING_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_SCREEN), TALL_CHIPPED_WARPED_SCREEN_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_GATED), TALL_CHIPPED_WARPED_GATED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_GLASS), TALL_CHIPPED_WARPED_GLASS_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_WINDOWED), TALL_CHIPPED_WARPED_WINDOWED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_TILED), TALL_CHIPPED_WARPED_TILED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_TILE_WINDOWED), TALL_CHIPPED_WARPED_TILE_WINDOWED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_SECRET), TALL_CHIPPED_WARPED_SECRET_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_MODERN), TALL_CHIPPED_WARPED_MODERN_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_BOARDED), TALL_CHIPPED_WARPED_BOARDED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_PAPER), TALL_CHIPPED_WARPED_PAPER_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_BEACH), TALL_CHIPPED_WARPED_BEACH_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_BARRED), TALL_CHIPPED_WARPED_BARRED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_PANELED), TALL_CHIPPED_WARPED_PANELED_DOOR);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_SUPPORTED), TALL_CHIPPED_WARPED_SUPPORTED_DOOR);

        //Register all those Macaw doors.
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_STORE), TALL_MACAW_STORE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SLIDING_GLASS), TALL_MACAW_SLIDING_GLASS_DOOR);
        
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JAIL), TALL_MACAW_JAIL_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL), TALL_MACAW_METAL_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_HOSPITAL), TALL_MACAW_METAL_HOSPITAL_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_REINFORCED), TALL_MACAW_METAL_REINFORCED_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_WARNING), TALL_MACAW_METAL_WARNING_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_WINDOWED), TALL_MACAW_METAL_WINDOWED_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BARN), TALL_MACAW_OAK_BARN_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BARN), TALL_MACAW_SPRUCE_BARN_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BARN), TALL_MACAW_BIRCH_BARN_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_BARN), TALL_MACAW_JUNGLE_BARN_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BARN), TALL_MACAW_ACACIA_BARN_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BARN), TALL_MACAW_DARK_OAK_BARN_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BARN), TALL_MACAW_MANGROVE_BARN_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_BARN), TALL_MACAW_BAMBOO_BARN_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_BARN), TALL_MACAW_CRIMSON_BARN_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_BARN), TALL_MACAW_WARPED_BARN_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BARN_GLASS), TALL_MACAW_OAK_BARN_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BARN_GLASS), TALL_MACAW_SPRUCE_BARN_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BARN_GLASS), TALL_MACAW_BIRCH_BARN_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_BARN_GLASS), TALL_MACAW_JUNGLE_BARN_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BARN_GLASS), TALL_MACAW_ACACIA_BARN_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BARN_GLASS), TALL_MACAW_DARK_OAK_BARN_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BARN_GLASS), TALL_MACAW_MANGROVE_BARN_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_BARN_GLASS), TALL_MACAW_BAMBOO_BARN_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_BARN_GLASS), TALL_MACAW_CRIMSON_BARN_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_BARN_GLASS), TALL_MACAW_WARPED_BARN_GLASS_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_STABLE), TALL_MACAW_OAK_STABLE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_STABLE), TALL_MACAW_SPRUCE_STABLE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_STABLE), TALL_MACAW_BIRCH_STABLE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_STABLE), TALL_MACAW_JUNGLE_STABLE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_STABLE), TALL_MACAW_ACACIA_STABLE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_STABLE), TALL_MACAW_DARK_OAK_STABLE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_STABLE), TALL_MACAW_MANGROVE_STABLE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_STABLE), TALL_MACAW_BAMBOO_STABLE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_STABLE), TALL_MACAW_CRIMSON_STABLE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_STABLE), TALL_MACAW_WARPED_STABLE_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_STABLE_HEAD), TALL_MACAW_OAK_STABLE_HEAD_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_STABLE_HEAD), TALL_MACAW_SPRUCE_STABLE_HEAD_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_STABLE_HEAD), TALL_MACAW_BIRCH_STABLE_HEAD_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_STABLE_HEAD), TALL_MACAW_JUNGLE_STABLE_HEAD_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_STABLE_HEAD), TALL_MACAW_ACACIA_STABLE_HEAD_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_STABLE_HEAD), TALL_MACAW_DARK_OAK_STABLE_HEAD_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_STABLE_HEAD), TALL_MACAW_MANGROVE_STABLE_HEAD_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_STABLE_HEAD), TALL_MACAW_BAMBOO_STABLE_HEAD_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_STABLE_HEAD), TALL_MACAW_CRIMSON_STABLE_HEAD_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_STABLE_HEAD), TALL_MACAW_WARPED_STABLE_HEAD_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BARK_GLASS), TALL_MACAW_OAK_BARK_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BARK_GLASS), TALL_MACAW_SPRUCE_BARK_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BARK_GLASS), TALL_MACAW_BIRCH_BARK_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_BARK_GLASS), TALL_MACAW_JUNGLE_BARK_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BARK_GLASS), TALL_MACAW_ACACIA_BARK_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BARK_GLASS), TALL_MACAW_DARK_OAK_BARK_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BARK_GLASS), TALL_MACAW_MANGROVE_BARK_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_BARK_GLASS), TALL_MACAW_BAMBOO_BARK_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_STEM_GLASS), TALL_MACAW_CRIMSON_STEM_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_STEM_GLASS), TALL_MACAW_WARPED_STEM_GLASS_DOOR);
        
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_GLASS), TALL_MACAW_OAK_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_GLASS), TALL_MACAW_SPRUCE_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_GLASS), TALL_MACAW_BIRCH_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_GLASS), TALL_MACAW_JUNGLE_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_GLASS), TALL_MACAW_ACACIA_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_GLASS), TALL_MACAW_DARK_OAK_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_GLASS), TALL_MACAW_MANGROVE_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_GLASS), TALL_MACAW_BAMBOO_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_GLASS), TALL_MACAW_CRIMSON_GLASS_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_GLASS), TALL_MACAW_WARPED_GLASS_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_MODERN), TALL_MACAW_OAK_MODERN_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_MODERN), TALL_MACAW_SPRUCE_MODERN_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_MODERN), TALL_MACAW_BIRCH_MODERN_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_MODERN), TALL_MACAW_JUNGLE_MODERN_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_MODERN), TALL_MACAW_ACACIA_MODERN_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_MODERN), TALL_MACAW_DARK_OAK_MODERN_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_MODERN), TALL_MACAW_MANGROVE_MODERN_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_MODERN), TALL_MACAW_BAMBOO_MODERN_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_MODERN), TALL_MACAW_CRIMSON_MODERN_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_MODERN), TALL_MACAW_WARPED_MODERN_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_JAPANESE), TALL_MACAW_OAK_JAPANESE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_JAPANESE), TALL_MACAW_SPRUCE_JAPANESE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_JAPANESE), TALL_MACAW_BIRCH_JAPANESE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_JAPANESE), TALL_MACAW_JUNGLE_JAPANESE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_JAPANESE), TALL_MACAW_ACACIA_JAPANESE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_JAPANESE), TALL_MACAW_DARK_OAK_JAPANESE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_JAPANESE), TALL_MACAW_MANGROVE_JAPANESE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_JAPANESE), TALL_MACAW_BAMBOO_JAPANESE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_JAPANESE), TALL_MACAW_CRIMSON_JAPANESE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_JAPANESE), TALL_MACAW_WARPED_JAPANESE_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_JAPANESE2), TALL_MACAW_OAK_JAPANESE2_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_JAPANESE2), TALL_MACAW_SPRUCE_JAPANESE2_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_JAPANESE2), TALL_MACAW_BIRCH_JAPANESE2_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_JAPANESE2), TALL_MACAW_JUNGLE_JAPANESE2_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_JAPANESE2), TALL_MACAW_ACACIA_JAPANESE2_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_JAPANESE2), TALL_MACAW_DARK_OAK_JAPANESE2_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_JAPANESE2), TALL_MACAW_MANGROVE_JAPANESE2_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_JAPANESE2), TALL_MACAW_BAMBOO_JAPANESE2_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_JAPANESE2), TALL_MACAW_CRIMSON_JAPANESE2_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_JAPANESE2), TALL_MACAW_WARPED_JAPANESE2_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_CLASSIC), TALL_MACAW_SPRUCE_CLASSIC_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_CLASSIC), TALL_MACAW_BIRCH_CLASSIC_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_CLASSIC), TALL_MACAW_JUNGLE_CLASSIC_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_CLASSIC), TALL_MACAW_ACACIA_CLASSIC_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_CLASSIC), TALL_MACAW_DARK_OAK_CLASSIC_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_CLASSIC), TALL_MACAW_MANGROVE_CLASSIC_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_CLASSIC), TALL_MACAW_BAMBOO_CLASSIC_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_CLASSIC), TALL_MACAW_CRIMSON_CLASSIC_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_CLASSIC), TALL_MACAW_WARPED_CLASSIC_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_COTTAGE), TALL_MACAW_OAK_COTTAGE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_COTTAGE), TALL_MACAW_BIRCH_COTTAGE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_COTTAGE), TALL_MACAW_JUNGLE_COTTAGE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_COTTAGE), TALL_MACAW_ACACIA_COTTAGE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_COTTAGE), TALL_MACAW_DARK_OAK_COTTAGE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_COTTAGE), TALL_MACAW_MANGROVE_COTTAGE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_COTTAGE), TALL_MACAW_BAMBOO_COTTAGE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_COTTAGE), TALL_MACAW_CRIMSON_COTTAGE_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_COTTAGE), TALL_MACAW_WARPED_COTTAGE_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_PAPER), TALL_MACAW_OAK_PAPER_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_PAPER), TALL_MACAW_SPRUCE_PAPER_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_PAPER), TALL_MACAW_JUNGLE_PAPER_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_PAPER), TALL_MACAW_ACACIA_PAPER_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_PAPER), TALL_MACAW_DARK_OAK_PAPER_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_PAPER), TALL_MACAW_MANGROVE_PAPER_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_PAPER), TALL_MACAW_BAMBOO_PAPER_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_PAPER), TALL_MACAW_CRIMSON_PAPER_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_PAPER), TALL_MACAW_WARPED_PAPER_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BEACH), TALL_MACAW_OAK_BEACH_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BEACH), TALL_MACAW_SPRUCE_BEACH_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BEACH), TALL_MACAW_BIRCH_BEACH_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BEACH), TALL_MACAW_ACACIA_BEACH_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BEACH), TALL_MACAW_DARK_OAK_BEACH_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BEACH), TALL_MACAW_MANGROVE_BEACH_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_BEACH), TALL_MACAW_BAMBOO_BEACH_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_BEACH), TALL_MACAW_CRIMSON_BEACH_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_BEACH), TALL_MACAW_WARPED_BEACH_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_TROPICAL), TALL_MACAW_OAK_TROPICAL_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_TROPICAL), TALL_MACAW_SPRUCE_TROPICAL_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_TROPICAL), TALL_MACAW_BIRCH_TROPICAL_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_TROPICAL), TALL_MACAW_JUNGLE_TROPICAL_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_TROPICAL), TALL_MACAW_DARK_OAK_TROPICAL_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_TROPICAL), TALL_MACAW_MANGROVE_TROPICAL_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_TROPICAL), TALL_MACAW_BAMBOO_TROPICAL_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_TROPICAL), TALL_MACAW_CRIMSON_TROPICAL_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_TROPICAL), TALL_MACAW_WARPED_TROPICAL_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_FOUR_PANEL), TALL_MACAW_OAK_FOUR_PANEL_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_FOUR_PANEL), TALL_MACAW_SPRUCE_FOUR_PANEL_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_FOUR_PANEL), TALL_MACAW_BIRCH_FOUR_PANEL_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_FOUR_PANEL), TALL_MACAW_JUNGLE_FOUR_PANEL_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_FOUR_PANEL), TALL_MACAW_ACACIA_FOUR_PANEL_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_FOUR_PANEL), TALL_MACAW_MANGROVE_FOUR_PANEL_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_FOUR_PANEL), TALL_MACAW_BAMBOO_FOUR_PANEL_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_FOUR_PANEL), TALL_MACAW_CRIMSON_FOUR_PANEL_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_FOUR_PANEL), TALL_MACAW_WARPED_FOUR_PANEL_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_SWAMP), TALL_MACAW_OAK_SWAMP_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_SWAMP), TALL_MACAW_SPRUCE_SWAMP_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_SWAMP), TALL_MACAW_BIRCH_SWAMP_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_SWAMP), TALL_MACAW_JUNGLE_SWAMP_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_SWAMP), TALL_MACAW_ACACIA_SWAMP_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_SWAMP), TALL_MACAW_DARK_OAK_SWAMP_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_SWAMP), TALL_MACAW_BAMBOO_SWAMP_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_SWAMP), TALL_MACAW_CRIMSON_SWAMP_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_SWAMP), TALL_MACAW_WARPED_SWAMP_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BAMBOO), TALL_MACAW_OAK_BAMBOO_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BAMBOO), TALL_MACAW_SPRUCE_BAMBOO_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BAMBOO), TALL_MACAW_BIRCH_BAMBOO_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_BAMBOO), TALL_MACAW_JUNGLE_BAMBOO_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BAMBOO), TALL_MACAW_ACACIA_BAMBOO_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BAMBOO), TALL_MACAW_DARK_OAK_BAMBOO_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BAMBOO), TALL_MACAW_MANGROVE_BAMBOO_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_BAMBOO), TALL_MACAW_CRIMSON_BAMBOO_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_BAMBOO), TALL_MACAW_WARPED_BAMBOO_DOOR);
        
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_NETHER), TALL_MACAW_OAK_NETHER_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_NETHER), TALL_MACAW_SPRUCE_NETHER_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_NETHER), TALL_MACAW_BIRCH_NETHER_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_NETHER), TALL_MACAW_JUNGLE_NETHER_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_NETHER), TALL_MACAW_ACACIA_NETHER_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_NETHER), TALL_MACAW_DARK_OAK_NETHER_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_NETHER), TALL_MACAW_MANGROVE_NETHER_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_NETHER), TALL_MACAW_BAMBOO_NETHER_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_NETHER), TALL_MACAW_WARPED_NETHER_DOOR);

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_MYSTIC), TALL_MACAW_OAK_MYSTIC_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_MYSTIC), TALL_MACAW_SPRUCE_MYSTIC_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_MYSTIC), TALL_MACAW_BIRCH_MYSTIC_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_MYSTIC), TALL_MACAW_JUNGLE_MYSTIC_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_MYSTIC), TALL_MACAW_ACACIA_MYSTIC_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_MYSTIC), TALL_MACAW_DARK_OAK_MYSTIC_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_MYSTIC), TALL_MACAW_MANGROVE_MYSTIC_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_MYSTIC), TALL_MACAW_BAMBOO_MYSTIC_DOOR);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_MYSTIC), TALL_MACAW_CRIMSON_MYSTIC_DOOR);
    }
    
    public static Block getBlockFromResourceLocation(ResourceLocation resource) {
    	return getBlockFromResourceLocation(resource, Blocks.OAK_DOOR);
    }
    
    public static Block getBlockFromResourceLocation(ResourceLocation resource, Block fallback) {
    	return BuiltInRegistries.BLOCK.getOptional(resource).orElse(fallback);
    }
}
