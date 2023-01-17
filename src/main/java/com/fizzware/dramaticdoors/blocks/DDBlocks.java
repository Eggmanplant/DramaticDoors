package com.fizzware.dramaticdoors.blocks;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DramaticDoors;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class DDBlocks {

	// Vanilla
    public static final Block TALL_IRON_DOOR = new TallDoorBlock(Blocks.IRON_DOOR);
    public static final Block TALL_OAK_DOOR = new TallDoorBlock(Blocks.OAK_DOOR);
    public static final Block TALL_SPRUCE_DOOR = new TallDoorBlock(Blocks.SPRUCE_DOOR);
    public static final Block TALL_BIRCH_DOOR = new TallDoorBlock(Blocks.BIRCH_DOOR);
    public static final Block TALL_JUNGLE_DOOR = new TallDoorBlock(Blocks.JUNGLE_DOOR);
    public static final Block TALL_ACACIA_DOOR = new TallDoorBlock(Blocks.ACACIA_DOOR);
    public static final Block TALL_DARK_OAK_DOOR = new TallDoorBlock(Blocks.DARK_OAK_DOOR);
    public static final Block TALL_MANGROVE_DOOR = new TallDoorBlock(Blocks.MANGROVE_DOOR);
    public static final Block TALL_BAMBOO_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("one_twenty_backport", "bamboo_door")));
    public static final Block TALL_CRIMSON_DOOR = new TallDoorBlock(Blocks.CRIMSON_DOOR);
    public static final Block TALL_WARPED_DOOR = new TallDoorBlock(Blocks.WARPED_DOOR);

    // Team Aurora Mods
    public static final Block TALL_JACARANDA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("abundance", "jacaranda_door")));
    public static final Block TALL_REDBUD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("abundance", "redbud_door")));

    public static final Block TALL_CYPRESS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("bayou_blues", "cypress_door")));

    public static final Block TALL_BROWN_MUSHROOM_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("enhanced_mushrooms", "brown_mushroom_door")));
    public static final Block TALL_RED_MUSHROOM_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("enhanced_mushrooms", "red_mushroom_door")));
    
    // Ad Astra
    public static final Block TALL_AERONOS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("ad_astra", "aeronos_door")));
    public static final Block TALL_GLACIAN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("ad_astra", "glacian_door")));
    public static final Block TALL_STROPHAR_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("ad_astra", "strophar_door")));
    public static final Block TALL_STEEL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("ad_astra", "steel_door"), Blocks.IRON_DOOR));

    // Architects Palette
    public static final Block TALL_TWISTED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("architects_palette", "twisted_door")));

    // Bamboo Everything
    public static final Block TALL_BE_BAMBOO_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("bambooeverything", "bamboo_door")));
    public static final Block TALL_BE_DRY_BAMBOO_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("bambooeverything", "dry_bamboo_door")));    
    
    // Better End
    public static final Block TALL_TERMINITE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betterend", "terminite_door"), Blocks.IRON_DOOR));
    public static final Block TALL_THALLASIUM_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betterend", "thallasium_door"), Blocks.IRON_DOOR));
    public static final Block TALL_DRAGON_TREE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betterend", "dragon_tree_door")));
    public static final Block TALL_END_LOTUS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betterend", "end_lotus_door")));
    public static final Block TALL_HELIX_TREE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betterend", "helix_tree_door")));
    public static final Block TALL_JELLYSHROOM_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betterend", "jellyshroom_door")));
    public static final Block TALL_LACUGROVE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betterend", "lacugrove_door")));
    public static final Block TALL_LUCERNIA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betterend", "lucernia_door")));
    public static final Block TALL_MOSSY_GLOWSHROOM_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betterend", "mossy_glowshroom_door")));
    public static final Block TALL_PYTHADENDRON_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betterend", "pythadendron_door")));
    public static final Block TALL_TENANEA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betterend", "tenanea_door")));
    public static final Block TALL_UMBRELLA_TREE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betterend", "umbrella_tree_door")));
    
    // Better Nether
    public static final Block TALL_ANCHOR_TREE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betternether", "anchor_tree_door")));
    public static final Block TALL_BONE_CIN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betternether", "bone_cincinnasite_door")));
    public static final Block TALL_BONE_REED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betternether", "bone_reed_door")));
    public static final Block TALL_MUSHROOM_FIR_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betternether", "mushroom_fir_door")));
    public static final Block TALL_NETHER_MUSHROOM_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betternether", "nether_mushroom_door")));
    public static final Block TALL_NETHER_REED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betternether", "nether_reed_door")));
    public static final Block TALL_NETHER_SAKURA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betternether", "nether_sakura_door")));
    public static final Block TALL_RUBEUS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betternether", "rubeus_door")));
    public static final Block TALL_STALAGNATE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betternether", "stalagnate_door")));
    public static final Block TALL_WART_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betternether", "wart_door")));
    public static final Block TALL_BN_WILLOW_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("betternether", "willow_door")));
    
    // Bewitchment
    public static final Block TALL_BW_CYPRESS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("bewitchment", "cypress_door")));
    public static final Block TALL_DRAGONS_BLOOD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("bewitchment", "dragons_blood_door")));
    public static final Block TALL_ELDER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("bewitchment", "elder_door")));
    public static final Block TALL_JUNIPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("bewitchment", "juniper_door")));

    // Biomancy
    public static final Block TALL_FLESH_DOOR = new TallFleshDoorBlock(getBlockFromResourceLocation(new ResourceLocation("biomancy", "flesh_door")));
    public static final Block TALL_FULL_FLESH_DOOR = new TallFullFleshDoorBlock(getBlockFromResourceLocation(new ResourceLocation("biomancy", "full_flesh_door")));
    public static final Block TALL_FLESHKIN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("biomancy", "fleshkin_door")));
    
    // Biome Makeover
    public static final Block TALL_ANCIENT_OAK_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("biomemakeover", "ancient_oak_door")));
    public static final Block TALL_BLIGHTED_BALSA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("biomemakeover", "blighted_balsa_door")));
    public static final Block TALL_SWAMP_CYPRESS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("biomemakeover", "swamp_cypress_door")));
    public static final Block TALL_WILLOW_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("biomemakeover", "willow_door")));
    
    // Blockus
    public static final Block TALL_BLOCKUS_BAMBOO_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("blockus", "bamboo_door")));
    public static final Block TALL_BLOCKUS_BLACKSTONE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("blockus", "blackstone_door")));
    public static final Block TALL_BLOCKUS_CHARRED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("blockus", "charred_door")));
    public static final Block TALL_BLOCKUS_OBSIDIAN_REINFORCED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("blockus", "obsidian_reinforced_door")));
    public static final Block TALL_BLOCKUS_PAPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("blockus", "paper_door")));
    public static final Block TALL_BLOCKUS_STONE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("blockus", "stone_door")));
    public static final Block TALL_BLOCKUS_WHITE_OAK_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("blockus", "white_oak_door")));
    
    // The Ceilands
    public static final Block TALL_CEILTRUNK_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("ceilands", "ceiltrunk_door")));
    public static final Block TALL_LUZAWOOD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("ceilands", "luzawood_door")));

    // Charm
    public static final Block TALL_CHARM_AZALEA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("charm", "azalea_door")));
    public static final Block TALL_CHARM_EBONY_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("charm", "ebony_door")));

    // Colourful Azaleas
    public static final Block TALL_AZULE_AZALEA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("colorfulazaleas", "azule_azalea_door")));
    public static final Block TALL_BRIGHT_AZALEA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("colorfulazaleas", "bright_azalea_door")));
    public static final Block TALL_FISS_AZALEA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("colorfulazaleas", "fiss_azalea_door")));
    public static final Block TALL_ROZE_AZALEA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("colorfulazaleas", "roze_azalea_door")));
    public static final Block TALL_TECAL_AZALEA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("colorfulazaleas", "tecal_azalea_door")));
    public static final Block TALL_TITANIUM_AZALEA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("colorfulazaleas", "titanium_azalea_door")));
    public static final Block TALL_WALNUT_AZALEA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("colorfulazaleas", "walnut_azalea_door")));
    
    // Create: Deco
    public static final Block TALL_ANDESITE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("createdeco", "andesite_door"), Blocks.IRON_DOOR));
    public static final Block TALL_BRASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("createdeco", "brass_door"), Blocks.IRON_DOOR));
    public static final Block TALL_COPPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("createdeco", "copper_door"), Blocks.IRON_DOOR));
    public static final Block TALL_ZINC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("createdeco", "zinc_door"), Blocks.IRON_DOOR));
    public static final Block TALL_LOCKED_ANDESITE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("createdeco", "locked_andesite_door"), Blocks.IRON_DOOR));
    public static final Block TALL_LOCKED_BRASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("createdeco", "locked_brass_door"), Blocks.IRON_DOOR));
    public static final Block TALL_LOCKED_COPPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("createdeco", "locked_copper_door"), Blocks.IRON_DOOR));
    public static final Block TALL_LOCKED_ZINC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("createdeco", "locked_zinc_door"), Blocks.IRON_DOOR));
    
    // Deeper and Darker
    public static final Block TALL_ECHO_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("deeperdarker", "echo_door")));
    
    // Ecologics
    public static final Block TALL_ECO_AZALEA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("ecologics", "azalea_door")));
    public static final Block TALL_ECO_FLOWERING_AZALEA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("ecologics", "flowering_azalea_door")));
    public static final Block TALL_ECO_COCONUT_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("ecologics", "coconut_door")));
    public static final Block TALL_ECO_WALNUT_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("ecologics", "walnut_door")));
    
    // Good Ending
    public static final Block TALL_GE_CYPRESS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("goodending", "cypress_door")));
    public static final Block TALL_GE_MUDDY_OAK_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("goodending", "muddy_oak_door")));

    // Graveyard
    public static final Block TALL_DARK_IRON_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("graveyard", "dark_iron_door"), Blocks.IRON_DOOR));
    
    // Hexcasting
    public static final Block TALL_AKASHIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("hexcasting", "akashic_door")));
    
    // Modern Glass
    public static final Block TALL_IRON_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("glassdoor", "iron_glassdoor"), Blocks.IRON_DOOR));
    public static final Block TALL_OAK_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("glassdoor", "oak_glassdoor")));
    public static final Block TALL_SPRUCE_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("glassdoor", "spruce_glassdoor")));
    public static final Block TALL_BIRCH_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("glassdoor", "birch_glassdoor")));
    public static final Block TALL_JUNGLE_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("glassdoor", "jungle_glassdoor")));
    public static final Block TALL_ACACIA_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("glassdoor", "acacia_glassdoor")));
    public static final Block TALL_DARK_OAK_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("glassdoor", "dark_oak_glassdoor")));
    public static final Block TALL_MANGROVE_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("glassdoor", "mangrove_glassdoor")));
    public static final Block TALL_CRIMSON_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("glassdoor", "crimson_glassdoor")));
    public static final Block TALL_WARPED_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("glassdoor", "warped_glassdoor")));    

    // Hephaestus
    public static final Block TALL_BLOODSHROOM_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("tconstruct", "bloodshroom_door")));
    public static final Block TALL_GREENHEART_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("tconstruct", "greenheart_door")));
    public static final Block TALL_SKYROOT_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("tconstruct", "skyroot_door")));
    
    // Oh the Biomes You'll Go
    public static final Block TALL_BYG_ASPEN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "tall_byg_aspen_door")));
    public static final Block TALL_BYG_BAOBAB_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "tall_byg_baobab_door")));
    public static final Block TALL_BYG_BLUE_ENCHANTED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "tall_byg_blue_enchanted_door")));
    public static final Block TALL_BYG_BULBIS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "tall_byg_bulbis_door")));
    public static final Block TALL_BYG_CHERRY_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "tall_byg_cherry_door")));
    public static final Block TALL_BYG_CIKA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "tall_byg_cika_door")));
    public static final Block TALL_BYG_CYPRESS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "tall_byg_cypress_door")));
    public static final Block TALL_BYG_EBONY_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "tall_byg_ebony_door")));
    public static final Block TALL_BYG_EMBUR_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "tall_byg_embur_door")));
    public static final Block TALL_BYG_ETHER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "tall_byg_ether_door")));
    public static final Block TALL_BYG_FIR_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "tall_byg_fir_door")));
    public static final Block TALL_BYG_FLORUS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "tall_byg_florus_door")));
    public static final Block TALL_BYG_GREEN_ENCHANTED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "tall_byg_green_enchanted_door")));
    public static final Block TALL_BYG_HOLLY_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "tall_byg_holly_door")));
    public static final Block TALL_BYG_IMPARIUS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "tall_byg_imparius_door")));
    public static final Block TALL_BYG_IRONWOOD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "tall_byg_ironwood_door")));
    public static final Block TALL_BYG_JACARANDA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "tall_byg_jacaranda_door")));
    public static final Block TALL_BYG_LAMENT_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "tall_byg_lament_door")));
    public static final Block TALL_BYG_MAHOGANY_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "tall_byg_mahogany_door")));
    public static final Block TALL_BYG_MAPLE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "tall_byg_maple_door")));
    public static final Block TALL_BYG_NIGHTSHADE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "tall_byg_nightshade_door")));
    public static final Block TALL_BYG_PALM_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "tall_byg_palm_door")));
    public static final Block TALL_BYG_PINE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "tall_byg_pine_door")));
    public static final Block TALL_BYG_RAINBOW_EUCALYPTUS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "tall_byg_rainbow_eucalyptus_door")));
    public static final Block TALL_BYG_REDWOOD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "tall_byg_redwood_door")));
    public static final Block TALL_BYG_SKYRIS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "tall_byg_skyris_door")));
    public static final Block TALL_BYG_SOUL_SHROOM_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "tall_byg_soul_shroom_door")));
    public static final Block TALL_BYG_SYTHIAN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "tall_byg_sythian_door")));
    public static final Block TALL_BYG_WHITE_MANGROVE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "tall_byg_mangrove_door")));
    public static final Block TALL_BYG_WILLOW_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "tall_byg_willow_door")));
    public static final Block TALL_BYG_WITCH_HAZEL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "tall_byg_witch_hazel_door")));
    public static final Block TALL_BYG_ZELKOVA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("byg", "tall_byg_zelkova_door")));
    
    // Promenade
    public static final Block TALL_PROMENADE_CHERRY_OAK_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("promenade", "cherry_oak_door")));
    public static final Block TALL_PROMENADE_DARK_AMARANTH_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("promenade", "dark_amaranth_door")));
    public static final Block TALL_PROMENADE_PALM_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("promenade", "palm_door")));
    
    // Snowy Spirit
    public static final Block TALL_GINGERBREAD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("snowyspirit", "gingerbread_door")));
    
    // Supplementaries
    public static final Block TALL_GOLD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("supplementaries", "gold_door")));
    public static final Block TALL_NETHERITE_DOOR = new TallNetheriteDoorBlock(getBlockFromResourceLocation(new ResourceLocation("supplementaries", "netherite_door")));
    
    // Tech Reborn
    public static final Block TALL_RUBBER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("tech_reborn", "rubber_door")));
    
    // Traverse
    public static final Block TALL_TRAVERSE_FIR_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("traverse", "fir_door")));
    
    // Twigs
    public static final Block TALL_STRIPPED_BAMBOO_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("twigs", "stripped_bamboo_door")));
    
    // Twilight Forest
    public static final Block TALL_CANOPY_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("twilightforest", "canopy_door")));
    public static final Block TALL_DARKWOOD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("twilightforest", "dark_door")));
    public static final Block TALL_MINEWOOD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("twilightforest", "mining_door")));
    public static final Block TALL_SORTINGWOOD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("twilightforest", "sorting_door")));
    public static final Block TALL_TIMEWOOD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("twilightforest", "time_door")));
    public static final Block TALL_TRANSWOOD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("twilightforest", "tranformation_door")));
    public static final Block TALL_TWILIGHT_MANGROVE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("twilightforest", "mangrove_door")));
    public static final Block TALL_TWILIGHT_OAK_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("twilightforest", "twilight_oak_door")));

    public static final Block TALL_TOWERWOOD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("tflostblocks", "towerwood_door")));

    // XP Obelisk
    public static final Block TALL_SOUL_COPPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("xps_additions", "soul_copper_door"), Blocks.IRON_DOOR));
    
    // Chipped (The biggest compat)
    public static final Block TALL_CHIPPED_OAK_DOOR_01 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "oak_door_1")));    
    public static final Block TALL_CHIPPED_OAK_DOOR_02 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "oak_door_2")));
    public static final Block TALL_CHIPPED_OAK_DOOR_03 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "oak_door_3")));
    public static final Block TALL_CHIPPED_OAK_DOOR_04 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "oak_door_4")));
    public static final Block TALL_CHIPPED_OAK_DOOR_05 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "oak_door_5")));
    public static final Block TALL_CHIPPED_OAK_DOOR_06 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "oak_door_6")));
    public static final Block TALL_CHIPPED_OAK_DOOR_07 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "oak_door_7")));
    public static final Block TALL_CHIPPED_OAK_DOOR_08 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "oak_door_8")));
    public static final Block TALL_CHIPPED_OAK_DOOR_09 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "oak_door_9")));
    public static final Block TALL_CHIPPED_OAK_DOOR_10 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "oak_door_10")));
    public static final Block TALL_CHIPPED_OAK_DOOR_11 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "oak_door_11")));
    public static final Block TALL_CHIPPED_OAK_DOOR_12 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "oak_door_12")));
    public static final Block TALL_CHIPPED_OAK_DOOR_13 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "oak_door_13")));
    public static final Block TALL_CHIPPED_OAK_DOOR_14 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "oak_door_14")));
    public static final Block TALL_CHIPPED_OAK_DOOR_15 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "oak_door_15")));
    public static final Block TALL_CHIPPED_OAK_DOOR_16 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "oak_door_16")));
    public static final Block TALL_CHIPPED_OAK_DOOR_17 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "oak_door_17")));
    public static final Block TALL_CHIPPED_OAK_DOOR_18 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "oak_door_18")));
    public static final Block TALL_CHIPPED_OAK_DOOR_19 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "oak_door_19")));
    public static final Block TALL_CHIPPED_OAK_DOOR_20 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "oak_door_20")));

    public static final Block TALL_CHIPPED_SPRUCE_DOOR_01 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "spruce_door_1")));    
    public static final Block TALL_CHIPPED_SPRUCE_DOOR_02 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "spruce_door_2")));
    public static final Block TALL_CHIPPED_SPRUCE_DOOR_03 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "spruce_door_3")));
    public static final Block TALL_CHIPPED_SPRUCE_DOOR_04 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "spruce_door_4")));
    public static final Block TALL_CHIPPED_SPRUCE_DOOR_05 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "spruce_door_5")));
    public static final Block TALL_CHIPPED_SPRUCE_DOOR_06 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "spruce_door_6")));
    public static final Block TALL_CHIPPED_SPRUCE_DOOR_07 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "spruce_door_7")));
    public static final Block TALL_CHIPPED_SPRUCE_DOOR_08 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "spruce_door_8")));
    public static final Block TALL_CHIPPED_SPRUCE_DOOR_09 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "spruce_door_9")));
    public static final Block TALL_CHIPPED_SPRUCE_DOOR_10 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "spruce_door_10")));
    public static final Block TALL_CHIPPED_SPRUCE_DOOR_11 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "spruce_door_11")));
    public static final Block TALL_CHIPPED_SPRUCE_DOOR_12 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "spruce_door_12")));
    public static final Block TALL_CHIPPED_SPRUCE_DOOR_13 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "spruce_door_13")));
    public static final Block TALL_CHIPPED_SPRUCE_DOOR_14 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "spruce_door_14")));
    public static final Block TALL_CHIPPED_SPRUCE_DOOR_15 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "spruce_door_15")));
    public static final Block TALL_CHIPPED_SPRUCE_DOOR_16 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "spruce_door_16")));
    public static final Block TALL_CHIPPED_SPRUCE_DOOR_17 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "spruce_door_17")));
    public static final Block TALL_CHIPPED_SPRUCE_DOOR_18 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "spruce_door_18")));
    public static final Block TALL_CHIPPED_SPRUCE_DOOR_19 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "spruce_door_19")));
    public static final Block TALL_CHIPPED_SPRUCE_DOOR_20 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "spruce_door_20")));
    
    public static final Block TALL_CHIPPED_BIRCH_DOOR_01 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "birch_door_1")));    
    public static final Block TALL_CHIPPED_BIRCH_DOOR_02 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "birch_door_2")));
    public static final Block TALL_CHIPPED_BIRCH_DOOR_03 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "birch_door_3")));
    public static final Block TALL_CHIPPED_BIRCH_DOOR_04 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "birch_door_4")));
    public static final Block TALL_CHIPPED_BIRCH_DOOR_05 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "birch_door_5")));
    public static final Block TALL_CHIPPED_BIRCH_DOOR_06 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "birch_door_6")));
    public static final Block TALL_CHIPPED_BIRCH_DOOR_07 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "birch_door_7")));
    public static final Block TALL_CHIPPED_BIRCH_DOOR_08 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "birch_door_8")));
    public static final Block TALL_CHIPPED_BIRCH_DOOR_09 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "birch_door_9")));
    public static final Block TALL_CHIPPED_BIRCH_DOOR_10 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "birch_door_10")));
    public static final Block TALL_CHIPPED_BIRCH_DOOR_11 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "birch_door_11")));
    public static final Block TALL_CHIPPED_BIRCH_DOOR_12 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "birch_door_12")));
    public static final Block TALL_CHIPPED_BIRCH_DOOR_13 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "birch_door_13")));
    public static final Block TALL_CHIPPED_BIRCH_DOOR_14 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "birch_door_14")));
    public static final Block TALL_CHIPPED_BIRCH_DOOR_15 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "birch_door_15")));
    public static final Block TALL_CHIPPED_BIRCH_DOOR_16 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "birch_door_16")));
    public static final Block TALL_CHIPPED_BIRCH_DOOR_17 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "birch_door_17")));
    public static final Block TALL_CHIPPED_BIRCH_DOOR_18 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "birch_door_18")));
    public static final Block TALL_CHIPPED_BIRCH_DOOR_19 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "birch_door_19")));
    public static final Block TALL_CHIPPED_BIRCH_DOOR_20 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "birch_door_20")));

    public static final Block TALL_CHIPPED_JUNGLE_DOOR_01 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "jungle_door_1")));    
    public static final Block TALL_CHIPPED_JUNGLE_DOOR_02 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "jungle_door_2")));
    public static final Block TALL_CHIPPED_JUNGLE_DOOR_03 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "jungle_door_3")));
    public static final Block TALL_CHIPPED_JUNGLE_DOOR_04 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "jungle_door_4")));
    public static final Block TALL_CHIPPED_JUNGLE_DOOR_05 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "jungle_door_5")));
    public static final Block TALL_CHIPPED_JUNGLE_DOOR_06 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "jungle_door_6")));
    public static final Block TALL_CHIPPED_JUNGLE_DOOR_07 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "jungle_door_7")));
    public static final Block TALL_CHIPPED_JUNGLE_DOOR_08 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "jungle_door_8")));
    public static final Block TALL_CHIPPED_JUNGLE_DOOR_09 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "jungle_door_9")));
    public static final Block TALL_CHIPPED_JUNGLE_DOOR_10 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "jungle_door_10")));
    public static final Block TALL_CHIPPED_JUNGLE_DOOR_11 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "jungle_door_11")));
    public static final Block TALL_CHIPPED_JUNGLE_DOOR_12 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "jungle_door_12")));
    public static final Block TALL_CHIPPED_JUNGLE_DOOR_13 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "jungle_door_13")));
    public static final Block TALL_CHIPPED_JUNGLE_DOOR_14 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "jungle_door_14")));
    public static final Block TALL_CHIPPED_JUNGLE_DOOR_15 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "jungle_door_15")));
    public static final Block TALL_CHIPPED_JUNGLE_DOOR_16 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "jungle_door_16")));
    public static final Block TALL_CHIPPED_JUNGLE_DOOR_17 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "jungle_door_17")));
    public static final Block TALL_CHIPPED_JUNGLE_DOOR_18 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "jungle_door_18")));
    public static final Block TALL_CHIPPED_JUNGLE_DOOR_19 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "jungle_door_19")));
    public static final Block TALL_CHIPPED_JUNGLE_DOOR_20 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "jungle_door_20")));

    public static final Block TALL_CHIPPED_ACACIA_DOOR_01 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "acacia_door_1")));    
    public static final Block TALL_CHIPPED_ACACIA_DOOR_02 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "acacia_door_2")));
    public static final Block TALL_CHIPPED_ACACIA_DOOR_03 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "acacia_door_3")));
    public static final Block TALL_CHIPPED_ACACIA_DOOR_04 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "acacia_door_4")));
    public static final Block TALL_CHIPPED_ACACIA_DOOR_05 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "acacia_door_5")));
    public static final Block TALL_CHIPPED_ACACIA_DOOR_06 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "acacia_door_6")));
    public static final Block TALL_CHIPPED_ACACIA_DOOR_07 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "acacia_door_7")));
    public static final Block TALL_CHIPPED_ACACIA_DOOR_08 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "acacia_door_8")));
    public static final Block TALL_CHIPPED_ACACIA_DOOR_09 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "acacia_door_9")));
    public static final Block TALL_CHIPPED_ACACIA_DOOR_10 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "acacia_door_10")));
    public static final Block TALL_CHIPPED_ACACIA_DOOR_11 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "acacia_door_11")));
    public static final Block TALL_CHIPPED_ACACIA_DOOR_12 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "acacia_door_12")));
    public static final Block TALL_CHIPPED_ACACIA_DOOR_13 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "acacia_door_13")));
    public static final Block TALL_CHIPPED_ACACIA_DOOR_14 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "acacia_door_14")));
    public static final Block TALL_CHIPPED_ACACIA_DOOR_15 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "acacia_door_15")));
    public static final Block TALL_CHIPPED_ACACIA_DOOR_16 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "acacia_door_16")));
    public static final Block TALL_CHIPPED_ACACIA_DOOR_17 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "acacia_door_17")));
    public static final Block TALL_CHIPPED_ACACIA_DOOR_18 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "acacia_door_18")));
    public static final Block TALL_CHIPPED_ACACIA_DOOR_19 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "acacia_door_19")));
    public static final Block TALL_CHIPPED_ACACIA_DOOR_20 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "acacia_door_20")));

    public static final Block TALL_CHIPPED_DARK_OAK_DOOR_01 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "dark_oak_door_1")));    
    public static final Block TALL_CHIPPED_DARK_OAK_DOOR_02 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "dark_oak_door_2")));
    public static final Block TALL_CHIPPED_DARK_OAK_DOOR_03 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "dark_oak_door_3")));
    public static final Block TALL_CHIPPED_DARK_OAK_DOOR_04 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "dark_oak_door_4")));
    public static final Block TALL_CHIPPED_DARK_OAK_DOOR_05 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "dark_oak_door_5")));
    public static final Block TALL_CHIPPED_DARK_OAK_DOOR_06 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "dark_oak_door_6")));
    public static final Block TALL_CHIPPED_DARK_OAK_DOOR_07 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "dark_oak_door_7")));
    public static final Block TALL_CHIPPED_DARK_OAK_DOOR_08 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "dark_oak_door_8")));
    public static final Block TALL_CHIPPED_DARK_OAK_DOOR_09 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "dark_oak_door_9")));
    public static final Block TALL_CHIPPED_DARK_OAK_DOOR_10 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "dark_oak_door_10")));
    public static final Block TALL_CHIPPED_DARK_OAK_DOOR_11 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "dark_oak_door_11")));
    public static final Block TALL_CHIPPED_DARK_OAK_DOOR_12 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "dark_oak_door_12")));
    public static final Block TALL_CHIPPED_DARK_OAK_DOOR_13 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "dark_oak_door_13")));
    public static final Block TALL_CHIPPED_DARK_OAK_DOOR_14 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "dark_oak_door_14")));
    public static final Block TALL_CHIPPED_DARK_OAK_DOOR_15 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "dark_oak_door_15")));
    public static final Block TALL_CHIPPED_DARK_OAK_DOOR_16 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "dark_oak_door_16")));
    public static final Block TALL_CHIPPED_DARK_OAK_DOOR_17 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "dark_oak_door_17")));
    public static final Block TALL_CHIPPED_DARK_OAK_DOOR_18 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "dark_oak_door_18")));
    public static final Block TALL_CHIPPED_DARK_OAK_DOOR_19 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "dark_oak_door_19")));
    public static final Block TALL_CHIPPED_DARK_OAK_DOOR_20 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "dark_oak_door_20")));

    public static final Block TALL_CHIPPED_CRIMSON_DOOR_01 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "crimson_door_1")));    
    public static final Block TALL_CHIPPED_CRIMSON_DOOR_02 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "crimson_door_2")));
    public static final Block TALL_CHIPPED_CRIMSON_DOOR_03 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "crimson_door_3")));
    public static final Block TALL_CHIPPED_CRIMSON_DOOR_04 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "crimson_door_4")));
    public static final Block TALL_CHIPPED_CRIMSON_DOOR_05 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "crimson_door_5")));
    public static final Block TALL_CHIPPED_CRIMSON_DOOR_06 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "crimson_door_6")));
    public static final Block TALL_CHIPPED_CRIMSON_DOOR_07 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "crimson_door_7")));
    public static final Block TALL_CHIPPED_CRIMSON_DOOR_08 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "crimson_door_8")));
    public static final Block TALL_CHIPPED_CRIMSON_DOOR_09 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "crimson_door_9")));
    public static final Block TALL_CHIPPED_CRIMSON_DOOR_10 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "crimson_door_10")));
    public static final Block TALL_CHIPPED_CRIMSON_DOOR_11 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "crimson_door_11")));
    public static final Block TALL_CHIPPED_CRIMSON_DOOR_12 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "crimson_door_12")));
    public static final Block TALL_CHIPPED_CRIMSON_DOOR_13 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "crimson_door_13")));
    public static final Block TALL_CHIPPED_CRIMSON_DOOR_14 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "crimson_door_14")));
    public static final Block TALL_CHIPPED_CRIMSON_DOOR_15 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "crimson_door_15")));
    public static final Block TALL_CHIPPED_CRIMSON_DOOR_16 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "crimson_door_16")));
    public static final Block TALL_CHIPPED_CRIMSON_DOOR_17 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "crimson_door_17")));
    public static final Block TALL_CHIPPED_CRIMSON_DOOR_18 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "crimson_door_18")));
    public static final Block TALL_CHIPPED_CRIMSON_DOOR_19 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "crimson_door_19")));
    public static final Block TALL_CHIPPED_CRIMSON_DOOR_20 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "crimson_door_20")));

    public static final Block TALL_CHIPPED_WARPED_DOOR_01 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "warped_door_1")));    
    public static final Block TALL_CHIPPED_WARPED_DOOR_02 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "warped_door_2")));
    public static final Block TALL_CHIPPED_WARPED_DOOR_03 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "warped_door_3")));
    public static final Block TALL_CHIPPED_WARPED_DOOR_04 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "warped_door_4")));
    public static final Block TALL_CHIPPED_WARPED_DOOR_05 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "warped_door_5")));
    public static final Block TALL_CHIPPED_WARPED_DOOR_06 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "warped_door_6")));
    public static final Block TALL_CHIPPED_WARPED_DOOR_07 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "warped_door_7")));
    public static final Block TALL_CHIPPED_WARPED_DOOR_08 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "warped_door_8")));
    public static final Block TALL_CHIPPED_WARPED_DOOR_09 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "warped_door_9")));
    public static final Block TALL_CHIPPED_WARPED_DOOR_10 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "warped_door_10")));
    public static final Block TALL_CHIPPED_WARPED_DOOR_11 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "warped_door_11")));
    public static final Block TALL_CHIPPED_WARPED_DOOR_12 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "warped_door_12")));
    public static final Block TALL_CHIPPED_WARPED_DOOR_13 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "warped_door_13")));
    public static final Block TALL_CHIPPED_WARPED_DOOR_14 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "warped_door_14")));
    public static final Block TALL_CHIPPED_WARPED_DOOR_15 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "warped_door_15")));
    public static final Block TALL_CHIPPED_WARPED_DOOR_16 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "warped_door_16")));
    public static final Block TALL_CHIPPED_WARPED_DOOR_17 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "warped_door_17")));
    public static final Block TALL_CHIPPED_WARPED_DOOR_18 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "warped_door_18")));
    public static final Block TALL_CHIPPED_WARPED_DOOR_19 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "warped_door_19")));
    public static final Block TALL_CHIPPED_WARPED_DOOR_20 = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("chipped", "warped_door_20")));
    
    // Macaw's Doors (The biggest compat)
    public static final Block TALL_MACAW_JAIL_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jail_door"), Blocks.IRON_DOOR));
	public static final Block TALL_MACAW_METAL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "metal_door"), Blocks.IRON_DOOR));
	public static final Block TALL_MACAW_METAL_HOSPITAL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "metal_hospital_door"), Blocks.IRON_DOOR));
	public static final Block TALL_MACAW_METAL_REINFORCED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "metal_reinforced_door"), Blocks.IRON_DOOR));
	public static final Block TALL_MACAW_METAL_WARNING_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "metal_warning_door"), Blocks.IRON_DOOR));
	public static final Block TALL_MACAW_METAL_WINDOWED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "metal_windowed_door"), Blocks.IRON_DOOR));

	public static final Block TALL_MACAW_OAK_BARN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_barn_door")));
	public static final Block TALL_MACAW_SPRUCE_BARN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_barn_door")));
	public static final Block TALL_MACAW_BIRCH_BARN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_barn_door")));
	public static final Block TALL_MACAW_JUNGLE_BARN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_barn_door")));
	public static final Block TALL_MACAW_ACACIA_BARN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_barn_door")));
	public static final Block TALL_MACAW_DARK_OAK_BARN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_barn_door")));
	public static final Block TALL_MACAW_MANGROVE_BARN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_barn_door")));
	public static final Block TALL_MACAW_CRIMSON_BARN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_barn_door")));
	public static final Block TALL_MACAW_WARPED_BARN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_barn_door")));

	public static final Block TALL_MACAW_OAK_BARN_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_barn_glass_door")));
	public static final Block TALL_MACAW_SPRUCE_BARN_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_barn_glass_door")));
	public static final Block TALL_MACAW_BIRCH_BARN_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_barn_glass_door")));
	public static final Block TALL_MACAW_JUNGLE_BARN_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_barn_glass_door")));
	public static final Block TALL_MACAW_ACACIA_BARN_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_barn_glass_door")));
	public static final Block TALL_MACAW_DARK_OAK_BARN_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_barn_glass_door")));
	public static final Block TALL_MACAW_MANGROVE_BARN_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_barn_glass_door")));
	public static final Block TALL_MACAW_CRIMSON_BARN_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_barn_glass_door")));
	public static final Block TALL_MACAW_WARPED_BARN_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_barn_glass_door")));

	public static final Block TALL_MACAW_OAK_STABLE_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_stable_door")));
	public static final Block TALL_MACAW_SPRUCE_STABLE_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_stable_door")));
	public static final Block TALL_MACAW_BIRCH_STABLE_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_stable_door")));
	public static final Block TALL_MACAW_JUNGLE_STABLE_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_stable_door")));
	public static final Block TALL_MACAW_ACACIA_STABLE_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_stable_door")));
	public static final Block TALL_MACAW_DARK_OAK_STABLE_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_stable_door")));
	public static final Block TALL_MACAW_MANGROVE_STABLE_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_stable_door")));
	public static final Block TALL_MACAW_CRIMSON_STABLE_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_stable_door")));
	public static final Block TALL_MACAW_WARPED_STABLE_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_stable_door")));

	public static final Block TALL_MACAW_OAK_STABLE_HEAD_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_stable_head_door")));
	public static final Block TALL_MACAW_SPRUCE_STABLE_HEAD_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_stable_head_door")));
	public static final Block TALL_MACAW_BIRCH_STABLE_HEAD_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_stable_head_door")));
	public static final Block TALL_MACAW_JUNGLE_STABLE_HEAD_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_stable_head_door")));
	public static final Block TALL_MACAW_ACACIA_STABLE_HEAD_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_stable_head_door")));
	public static final Block TALL_MACAW_DARK_OAK_STABLE_HEAD_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_stable_head_door")));
	public static final Block TALL_MACAW_MANGROVE_STABLE_HEAD_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_stable_head_door")));
	public static final Block TALL_MACAW_CRIMSON_STABLE_HEAD_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_stable_head_door")));
	public static final Block TALL_MACAW_WARPED_STABLE_HEAD_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_stable_head_door")));

	public static final Block TALL_MACAW_OAK_BARK_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_bark_glass_door")));
	public static final Block TALL_MACAW_SPRUCE_BARK_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_bark_glass_door")));
	public static final Block TALL_MACAW_BIRCH_BARK_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_bark_glass_door")));
	public static final Block TALL_MACAW_JUNGLE_BARK_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_bark_glass_door")));
	public static final Block TALL_MACAW_ACACIA_BARK_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_bark_glass_door")));
	public static final Block TALL_MACAW_DARK_OAK_BARK_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_bark_glass_door")));
	public static final Block TALL_MACAW_MANGROVE_BARK_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_bark_glass_door")));
	public static final Block TALL_MACAW_CRIMSON_STEM_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_stem_glass_door")));
	public static final Block TALL_MACAW_WARPED_STEM_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_stem_glass_door")));
	
	public static final Block TALL_MACAW_OAK_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_glass_door")));
	public static final Block TALL_MACAW_SPRUCE_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_glass_door")));
	public static final Block TALL_MACAW_BIRCH_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_glass_door")));
	public static final Block TALL_MACAW_JUNGLE_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_glass_door")));
	public static final Block TALL_MACAW_ACACIA_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_glass_door")));
	public static final Block TALL_MACAW_DARK_OAK_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_glass_door")));
	public static final Block TALL_MACAW_MANGROVE_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_glass_door")));
	public static final Block TALL_MACAW_CRIMSON_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_glass_door")));
	public static final Block TALL_MACAW_WARPED_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_glass_door")));

	public static final Block TALL_MACAW_OAK_MODERN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_modern_door")));
	public static final Block TALL_MACAW_SPRUCE_MODERN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_modern_door")));
	public static final Block TALL_MACAW_BIRCH_MODERN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_modern_door")));
	public static final Block TALL_MACAW_JUNGLE_MODERN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_modern_door")));
	public static final Block TALL_MACAW_ACACIA_MODERN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_modern_door")));
	public static final Block TALL_MACAW_DARK_OAK_MODERN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_modern_door")));
	public static final Block TALL_MACAW_MANGROVE_MODERN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_modern_door")));
	public static final Block TALL_MACAW_CRIMSON_MODERN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_modern_door")));
	public static final Block TALL_MACAW_WARPED_MODERN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_modern_door")));

	public static final Block TALL_MACAW_OAK_JAPANESE_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_japanese_door")));
	public static final Block TALL_MACAW_SPRUCE_JAPANESE_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_japanese_door")));
	public static final Block TALL_MACAW_BIRCH_JAPANESE_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_japanese_door")));
	public static final Block TALL_MACAW_JUNGLE_JAPANESE_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_japanese_door")));
	public static final Block TALL_MACAW_ACACIA_JAPANESE_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_japanese_door")));
	public static final Block TALL_MACAW_DARK_OAK_JAPANESE_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_japanese_door")));
	public static final Block TALL_MACAW_MANGROVE_JAPANESE_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_japanese_door")));
	public static final Block TALL_MACAW_CRIMSON_JAPANESE_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_japanese_door")));
	public static final Block TALL_MACAW_WARPED_JAPANESE_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_japanese_door")));

	public static final Block TALL_MACAW_OAK_JAPANESE2_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_japanese2_door")));
	public static final Block TALL_MACAW_SPRUCE_JAPANESE2_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_japanese2_door")));
	public static final Block TALL_MACAW_BIRCH_JAPANESE2_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_japanese2_door")));
	public static final Block TALL_MACAW_JUNGLE_JAPANESE2_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_japanese2_door")));
	public static final Block TALL_MACAW_ACACIA_JAPANESE2_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_japanese2_door")));
	public static final Block TALL_MACAW_DARK_OAK_JAPANESE2_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_japanese2_door")));
	public static final Block TALL_MACAW_MANGROVE_JAPANESE2_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_japanese2_door")));
	public static final Block TALL_MACAW_CRIMSON_JAPANESE2_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_japanese2_door")));
	public static final Block TALL_MACAW_WARPED_JAPANESE2_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_japanese2_door")));

	public static final Block TALL_MACAW_SPRUCE_CLASSIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_classic_door")));
	public static final Block TALL_MACAW_BIRCH_CLASSIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_classic_door")));
	public static final Block TALL_MACAW_JUNGLE_CLASSIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_classic_door")));
	public static final Block TALL_MACAW_ACACIA_CLASSIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_classic_door")));
	public static final Block TALL_MACAW_DARK_OAK_CLASSIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_classic_door")));
	public static final Block TALL_MACAW_MANGROVE_CLASSIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_classic_door")));
	public static final Block TALL_MACAW_CRIMSON_CLASSIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_classic_door")));
	public static final Block TALL_MACAW_WARPED_CLASSIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_classic_door")));

	public static final Block TALL_MACAW_OAK_COTTAGE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_cottage_door")));
	public static final Block TALL_MACAW_BIRCH_COTTAGE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_cottage_door")));
	public static final Block TALL_MACAW_JUNGLE_COTTAGE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_cottage_door")));
	public static final Block TALL_MACAW_ACACIA_COTTAGE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_cottage_door")));
	public static final Block TALL_MACAW_DARK_OAK_COTTAGE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_cottage_door")));
	public static final Block TALL_MACAW_MANGROVE_COTTAGE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_cottage_door")));
	public static final Block TALL_MACAW_CRIMSON_COTTAGE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_cottage_door")));
	public static final Block TALL_MACAW_WARPED_COTTAGE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_cottage_door")));

	public static final Block TALL_MACAW_OAK_PAPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_paper_door")));
	public static final Block TALL_MACAW_SPRUCE_PAPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_paper_door")));
	public static final Block TALL_MACAW_JUNGLE_PAPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_paper_door")));
	public static final Block TALL_MACAW_ACACIA_PAPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_paper_door")));
	public static final Block TALL_MACAW_DARK_OAK_PAPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_paper_door")));
	public static final Block TALL_MACAW_MANGROVE_PAPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_paper_door")));
	public static final Block TALL_MACAW_CRIMSON_PAPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_paper_door")));
	public static final Block TALL_MACAW_WARPED_PAPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_paper_door")));

	public static final Block TALL_MACAW_OAK_BEACH_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_beach_door")));
	public static final Block TALL_MACAW_SPRUCE_BEACH_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_beach_door")));
	public static final Block TALL_MACAW_BIRCH_BEACH_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_beach_door")));
	public static final Block TALL_MACAW_ACACIA_BEACH_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_beach_door")));
	public static final Block TALL_MACAW_DARK_OAK_BEACH_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_beach_door")));
	public static final Block TALL_MACAW_MANGROVE_BEACH_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_beach_door")));
	public static final Block TALL_MACAW_CRIMSON_BEACH_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_beach_door")));
	public static final Block TALL_MACAW_WARPED_BEACH_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_beach_door")));

	public static final Block TALL_MACAW_OAK_TROPICAL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_tropical_door")));
	public static final Block TALL_MACAW_SPRUCE_TROPICAL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_tropical_door")));
	public static final Block TALL_MACAW_BIRCH_TROPICAL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_tropical_door")));
	public static final Block TALL_MACAW_JUNGLE_TROPICAL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_tropical_door")));
	public static final Block TALL_MACAW_DARK_OAK_TROPICAL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_tropical_door")));
	public static final Block TALL_MACAW_MANGROVE_TROPICAL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_tropical_door")));
	public static final Block TALL_MACAW_CRIMSON_TROPICAL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_tropical_door")));
	public static final Block TALL_MACAW_WARPED_TROPICAL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_tropical_door")));

	public static final Block TALL_MACAW_OAK_FOUR_PANEL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_four_panel_door")));
	public static final Block TALL_MACAW_SPRUCE_FOUR_PANEL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_four_panel_door")));
	public static final Block TALL_MACAW_BIRCH_FOUR_PANEL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_four_panel_door")));
	public static final Block TALL_MACAW_JUNGLE_FOUR_PANEL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_four_panel_door")));
	public static final Block TALL_MACAW_ACACIA_FOUR_PANEL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_four_panel_door")));
	public static final Block TALL_MACAW_MANGROVE_FOUR_PANEL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_four_panel_door")));
	public static final Block TALL_MACAW_CRIMSON_FOUR_PANEL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_four_panel_door")));
	public static final Block TALL_MACAW_WARPED_FOUR_PANEL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_four_panel_door")));

	public static final Block TALL_MACAW_OAK_SWAMP_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_swamp_door")));
	public static final Block TALL_MACAW_SPRUCE_SWAMP_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_swamp_door")));
	public static final Block TALL_MACAW_BIRCH_SWAMP_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_swamp_door")));
	public static final Block TALL_MACAW_JUNGLE_SWAMP_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_swamp_door")));
	public static final Block TALL_MACAW_ACACIA_SWAMP_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_swamp_door")));
	public static final Block TALL_MACAW_DARK_OAK_SWAMP_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_swamp_door")));
	public static final Block TALL_MACAW_CRIMSON_SWAMP_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_swamp_door")));
	public static final Block TALL_MACAW_WARPED_SWAMP_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_swamp_door")));

	public static final Block TALL_MACAW_OAK_NETHER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_nether_door")));
	public static final Block TALL_MACAW_SPRUCE_NETHER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_nether_door")));
	public static final Block TALL_MACAW_BIRCH_NETHER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_nether_door")));
	public static final Block TALL_MACAW_JUNGLE_NETHER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_nether_door")));
	public static final Block TALL_MACAW_ACACIA_NETHER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_nether_door")));
	public static final Block TALL_MACAW_DARK_OAK_NETHER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_nether_door")));
	public static final Block TALL_MACAW_MANGROVE_NETHER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_nether_door")));
	public static final Block TALL_MACAW_WARPED_NETHER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_nether_door")));

	public static final Block TALL_MACAW_OAK_MYSTIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_mystic_door")));
	public static final Block TALL_MACAW_SPRUCE_MYSTIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_mystic_door")));
	public static final Block TALL_MACAW_BIRCH_MYSTIC_DOOR =  new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_mystic_door")));
	public static final Block TALL_MACAW_JUNGLE_MYSTIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_mystic_door")));
	public static final Block TALL_MACAW_ACACIA_MYSTIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_mystic_door")));
	public static final Block TALL_MACAW_DARK_OAK_MYSTIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_mystic_door")));
	public static final Block TALL_MACAW_MANGROVE_MYSTIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_mystic_door")));
	public static final Block TALL_MACAW_CRIMSON_MYSTIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_mystic_door")));
    
    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_IRON), TALL_IRON_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_OAK), TALL_OAK_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SPRUCE), TALL_SPRUCE_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BIRCH), TALL_BIRCH_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_JUNGLE), TALL_JUNGLE_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ACACIA), TALL_ACACIA_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DARK_OAK), TALL_DARK_OAK_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANGROVE), TALL_MANGROVE_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BAMBOO), TALL_BAMBOO_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CRIMSON), TALL_CRIMSON_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WARPED), TALL_WARPED_DOOR);

        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_ASPEN), TALL_BYG_ASPEN_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_BAOBAB), TALL_BYG_BAOBAB_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_BLUE_ENCHANTED), TALL_BYG_BLUE_ENCHANTED_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_BULBIS), TALL_BYG_BULBIS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_CHERRY), TALL_BYG_CHERRY_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_CIKA), TALL_BYG_CIKA_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_CYPRESS), TALL_BYG_CYPRESS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_EBONY), TALL_BYG_EBONY_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_EMBUR), TALL_BYG_EMBUR_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_ETHER), TALL_BYG_ETHER_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_FIR), TALL_BYG_FIR_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_FLORUS), TALL_BYG_FLORUS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_GREEN_ENCHANTED), TALL_BYG_GREEN_ENCHANTED_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_HOLLY), TALL_BYG_HOLLY_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_IMPARIUS), TALL_BYG_IMPARIUS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_IRONWOOD), TALL_BYG_IRONWOOD_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_JACARANDA), TALL_BYG_JACARANDA_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_LAMENT), TALL_BYG_LAMENT_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_MAHOGANY), TALL_BYG_MAHOGANY_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_MAPLE), TALL_BYG_MAPLE_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_NIGHTSHADE), TALL_BYG_NIGHTSHADE_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_PALM), TALL_BYG_PALM_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_PINE), TALL_BYG_PINE_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_RAINBOW_EUCALYPTUS), TALL_BYG_RAINBOW_EUCALYPTUS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_REDWOOD), TALL_BYG_REDWOOD_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_SKYRIS), TALL_BYG_SKYRIS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_SOUL_SHROOM), TALL_BYG_SOUL_SHROOM_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_SYTHIAN), TALL_BYG_SYTHIAN_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_WHITE_MANGROVE), TALL_BYG_WHITE_MANGROVE_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_WILLOW), TALL_BYG_WILLOW_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_WITCH_HAZEL), TALL_BYG_WITCH_HAZEL_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_ZELKOVA), TALL_BYG_ZELKOVA_DOOR);
        
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_JACARANDA), TALL_JACARANDA_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_REDBUD), TALL_REDBUD_DOOR);

        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CYPRESS), TALL_CYPRESS_DOOR);

        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BROWN_MUSHROOM), TALL_BROWN_MUSHROOM_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RED_MUSHROOM), TALL_RED_MUSHROOM_DOOR);
        
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AERONOS), TALL_AERONOS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GLACIAN), TALL_GLACIAN_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_STROPHAR), TALL_STROPHAR_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_STEEL), TALL_STEEL_DOOR);

        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TWISTED), TALL_TWISTED_DOOR);

        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BE_BAMBOO), TALL_BE_BAMBOO_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BE_DRY_BAMBOO), TALL_BE_DRY_BAMBOO_DOOR);

        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TERMINITE), TALL_TERMINITE_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_THALLASIUM), TALL_THALLASIUM_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DRAGON_TREE), TALL_DRAGON_TREE_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_END_LOTUS), TALL_END_LOTUS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_HELIX_TREE), TALL_HELIX_TREE_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_JELLYSHROOM), TALL_JELLYSHROOM_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LACUGROVE), TALL_LACUGROVE_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LUCERNIA), TALL_LUCERNIA_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MOSSY_GLOWSHROOM), TALL_MOSSY_GLOWSHROOM_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PYTHADENDRON), TALL_PYTHADENDRON_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TENANEA), TALL_TENANEA_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_UMBRELLA_TREE), TALL_UMBRELLA_TREE_DOOR);

        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ANCHOR_TREE), TALL_ANCHOR_TREE_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BONE_CIN), TALL_BONE_CIN_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BONE_REED), TALL_BONE_REED_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MUSHROOM_FIR), TALL_MUSHROOM_FIR_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_NETHER_MUSHROOM), TALL_NETHER_MUSHROOM_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_NETHER_REED), TALL_NETHER_REED_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_NETHER_SAKURA), TALL_NETHER_SAKURA_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUBEUS), TALL_RUBEUS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_STALAGNATE), TALL_STALAGNATE_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WART), TALL_WART_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BN_WILLOW), TALL_BN_WILLOW_DOOR);

        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BW_CYPRESS), TALL_BW_CYPRESS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DRAGONS_BLOOD), TALL_DRAGONS_BLOOD_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ELDER), TALL_ELDER_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_JUNIPER), TALL_JUNIPER_DOOR);

        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ANCIENT_OAK), TALL_ANCIENT_OAK_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BLIGHTED_BALSA), TALL_BLIGHTED_BALSA_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SWAMP_CYPRESS), TALL_SWAMP_CYPRESS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WILLOW), TALL_WILLOW_DOOR);

        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FLESH), TALL_FLESH_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FULL_FLESH), TALL_FULL_FLESH_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FLESHKIN), TALL_FLESHKIN_DOOR);

        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BLOCKUS_BAMBOO), TALL_BLOCKUS_BAMBOO_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BLOCKUS_BLACKSTONE), TALL_BLOCKUS_BLACKSTONE_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BLOCKUS_CHARRED), TALL_BLOCKUS_CHARRED_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BLOCKUS_OBSIDIAN_REINFORCED), TALL_BLOCKUS_OBSIDIAN_REINFORCED_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BLOCKUS_PAPER), TALL_BLOCKUS_PAPER_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BLOCKUS_STONE), TALL_BLOCKUS_STONE_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BLOCKUS_WHITE_OAK), TALL_BLOCKUS_WHITE_OAK_DOOR);

        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CEILTRUNK), TALL_CEILTRUNK_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LUZAWOOD), TALL_LUZAWOOD_DOOR);
        
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHARM_AZALEA), TALL_CHARM_AZALEA_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHARM_EBONY), TALL_CHARM_EBONY_DOOR);

        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AZULE_AZALEA), TALL_AZULE_AZALEA_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BRIGHT_AZALEA), TALL_BRIGHT_AZALEA_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FISS_AZALEA), TALL_FISS_AZALEA_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ROZE_AZALEA), TALL_ROZE_AZALEA_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TECAL_AZALEA), TALL_TECAL_AZALEA_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TITANIUM_AZALEA), TALL_TITANIUM_AZALEA_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WALNUT_AZALEA), TALL_WALNUT_AZALEA_DOOR);

        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ANDESITE), TALL_ANDESITE_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BRASS), TALL_BRASS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_COPPER), TALL_COPPER_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ZINC), TALL_ZINC_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LOCKED_ANDESITE), TALL_LOCKED_ANDESITE_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LOCKED_BRASS), TALL_LOCKED_BRASS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LOCKED_COPPER), TALL_LOCKED_COPPER_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LOCKED_ZINC), TALL_LOCKED_ZINC_DOOR);

        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ECHO), TALL_ECHO_DOOR);

        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ECO_AZALEA), TALL_ECO_AZALEA_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ECO_FLOWERING_AZALEA), TALL_ECO_FLOWERING_AZALEA_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ECO_COCONUT), TALL_ECO_COCONUT_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ECO_WALNUT), TALL_ECO_WALNUT_DOOR);

        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GE_CYPRESS), TALL_GE_CYPRESS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GE_MUDDY_OAK), TALL_GE_MUDDY_OAK_DOOR);

        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DARK_IRON), TALL_DARK_IRON_DOOR);

        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AKASHIC), TALL_AKASHIC_DOOR);

        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_IRON_GLASS), TALL_IRON_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_OAK_GLASS), TALL_OAK_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SPRUCE_GLASS), TALL_SPRUCE_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BIRCH_GLASS), TALL_BIRCH_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_JUNGLE_GLASS), TALL_JUNGLE_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ACACIA_GLASS), TALL_ACACIA_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DARK_OAK_GLASS), TALL_DARK_OAK_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANGROVE_GLASS), TALL_MANGROVE_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CRIMSON_GLASS), TALL_CRIMSON_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WARPED_GLASS), TALL_WARPED_GLASS_DOOR);
        
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BLOODSHROOM), TALL_BLOODSHROOM_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GREENHEART), TALL_GREENHEART_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SKYROOT), TALL_SKYROOT_DOOR);

        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PROMENADE_CHERRY_OAK), TALL_PROMENADE_CHERRY_OAK_DOOR);
		Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PROMENADE_DARK_AMARANTH), TALL_PROMENADE_DARK_AMARANTH_DOOR);
		Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PROMENADE_PALM), TALL_PROMENADE_PALM_DOOR);

        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GINGERBREAD), TALL_GINGERBREAD_DOOR);

        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GOLD), TALL_GOLD_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_NETHERITE), TALL_NETHERITE_DOOR);
        
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUBBER), TALL_RUBBER_DOOR);
        
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TRAVERSE_FIR), TALL_TRAVERSE_FIR_DOOR);

        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_STRIPPED_BAMBOO), TALL_STRIPPED_BAMBOO_DOOR);

        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CANOPY), TALL_CANOPY_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DARKWOOD), TALL_DARKWOOD_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MINEWOOD), TALL_MINEWOOD_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SORTINGWOOD), TALL_SORTINGWOOD_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TIMEWOOD), TALL_TIMEWOOD_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TRANSWOOD), TALL_TRANSWOOD_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TWILIGHT_MANGROVE), TALL_TWILIGHT_MANGROVE_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TWILIGHT_OAK), TALL_TWILIGHT_OAK_DOOR);
        
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TOWERWOOD), TALL_TOWERWOOD_DOOR);
        
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SOUL_COPPER), TALL_SOUL_COPPER_DOOR);
        
        //Register all those Chipped doors.
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_01), TALL_CHIPPED_OAK_DOOR_01);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_02), TALL_CHIPPED_OAK_DOOR_02);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_03), TALL_CHIPPED_OAK_DOOR_03);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_04), TALL_CHIPPED_OAK_DOOR_04);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_05), TALL_CHIPPED_OAK_DOOR_05);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_06), TALL_CHIPPED_OAK_DOOR_06);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_07), TALL_CHIPPED_OAK_DOOR_07);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_08), TALL_CHIPPED_OAK_DOOR_08);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_09), TALL_CHIPPED_OAK_DOOR_09);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_10), TALL_CHIPPED_OAK_DOOR_10);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_11), TALL_CHIPPED_OAK_DOOR_11);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_12), TALL_CHIPPED_OAK_DOOR_12);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_13), TALL_CHIPPED_OAK_DOOR_13);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_14), TALL_CHIPPED_OAK_DOOR_14);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_15), TALL_CHIPPED_OAK_DOOR_15);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_16), TALL_CHIPPED_OAK_DOOR_16);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_17), TALL_CHIPPED_OAK_DOOR_17);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_18), TALL_CHIPPED_OAK_DOOR_18);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_19), TALL_CHIPPED_OAK_DOOR_19);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_20), TALL_CHIPPED_OAK_DOOR_20);
        
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_01), TALL_CHIPPED_SPRUCE_DOOR_01);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_02), TALL_CHIPPED_SPRUCE_DOOR_02);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_03), TALL_CHIPPED_SPRUCE_DOOR_03);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_04), TALL_CHIPPED_SPRUCE_DOOR_04);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_05), TALL_CHIPPED_SPRUCE_DOOR_05);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_06), TALL_CHIPPED_SPRUCE_DOOR_06);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_07), TALL_CHIPPED_SPRUCE_DOOR_07);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_08), TALL_CHIPPED_SPRUCE_DOOR_08);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_09), TALL_CHIPPED_SPRUCE_DOOR_09);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_10), TALL_CHIPPED_SPRUCE_DOOR_10);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_11), TALL_CHIPPED_SPRUCE_DOOR_11);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_12), TALL_CHIPPED_SPRUCE_DOOR_12);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_13), TALL_CHIPPED_SPRUCE_DOOR_13);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_14), TALL_CHIPPED_SPRUCE_DOOR_14);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_15), TALL_CHIPPED_SPRUCE_DOOR_15);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_16), TALL_CHIPPED_SPRUCE_DOOR_16);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_17), TALL_CHIPPED_SPRUCE_DOOR_17);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_18), TALL_CHIPPED_SPRUCE_DOOR_18);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_19), TALL_CHIPPED_SPRUCE_DOOR_19);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_20), TALL_CHIPPED_SPRUCE_DOOR_20);
        
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_01), TALL_CHIPPED_BIRCH_DOOR_01);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_02), TALL_CHIPPED_BIRCH_DOOR_02);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_03), TALL_CHIPPED_BIRCH_DOOR_03);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_04), TALL_CHIPPED_BIRCH_DOOR_04);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_05), TALL_CHIPPED_BIRCH_DOOR_05);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_06), TALL_CHIPPED_BIRCH_DOOR_06);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_07), TALL_CHIPPED_BIRCH_DOOR_07);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_08), TALL_CHIPPED_BIRCH_DOOR_08);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_09), TALL_CHIPPED_BIRCH_DOOR_09);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_10), TALL_CHIPPED_BIRCH_DOOR_10);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_11), TALL_CHIPPED_BIRCH_DOOR_11);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_12), TALL_CHIPPED_BIRCH_DOOR_12);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_13), TALL_CHIPPED_BIRCH_DOOR_13);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_14), TALL_CHIPPED_BIRCH_DOOR_14);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_15), TALL_CHIPPED_BIRCH_DOOR_15);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_16), TALL_CHIPPED_BIRCH_DOOR_16);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_17), TALL_CHIPPED_BIRCH_DOOR_17);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_18), TALL_CHIPPED_BIRCH_DOOR_18);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_19), TALL_CHIPPED_BIRCH_DOOR_19);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_20), TALL_CHIPPED_BIRCH_DOOR_20);
        
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_01), TALL_CHIPPED_JUNGLE_DOOR_01);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_02), TALL_CHIPPED_JUNGLE_DOOR_02);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_03), TALL_CHIPPED_JUNGLE_DOOR_03);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_04), TALL_CHIPPED_JUNGLE_DOOR_04);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_05), TALL_CHIPPED_JUNGLE_DOOR_05);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_06), TALL_CHIPPED_JUNGLE_DOOR_06);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_07), TALL_CHIPPED_JUNGLE_DOOR_07);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_08), TALL_CHIPPED_JUNGLE_DOOR_08);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_09), TALL_CHIPPED_JUNGLE_DOOR_09);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_10), TALL_CHIPPED_JUNGLE_DOOR_10);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_11), TALL_CHIPPED_JUNGLE_DOOR_11);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_12), TALL_CHIPPED_JUNGLE_DOOR_12);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_13), TALL_CHIPPED_JUNGLE_DOOR_13);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_14), TALL_CHIPPED_JUNGLE_DOOR_14);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_15), TALL_CHIPPED_JUNGLE_DOOR_15);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_16), TALL_CHIPPED_JUNGLE_DOOR_16);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_17), TALL_CHIPPED_JUNGLE_DOOR_17);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_18), TALL_CHIPPED_JUNGLE_DOOR_18);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_19), TALL_CHIPPED_JUNGLE_DOOR_19);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_20), TALL_CHIPPED_JUNGLE_DOOR_20);
        
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_01), TALL_CHIPPED_ACACIA_DOOR_01);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_02), TALL_CHIPPED_ACACIA_DOOR_02);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_03), TALL_CHIPPED_ACACIA_DOOR_03);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_04), TALL_CHIPPED_ACACIA_DOOR_04);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_05), TALL_CHIPPED_ACACIA_DOOR_05);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_06), TALL_CHIPPED_ACACIA_DOOR_06);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_07), TALL_CHIPPED_ACACIA_DOOR_07);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_08), TALL_CHIPPED_ACACIA_DOOR_08);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_09), TALL_CHIPPED_ACACIA_DOOR_09);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_10), TALL_CHIPPED_ACACIA_DOOR_10);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_11), TALL_CHIPPED_ACACIA_DOOR_11);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_12), TALL_CHIPPED_ACACIA_DOOR_12);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_13), TALL_CHIPPED_ACACIA_DOOR_13);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_14), TALL_CHIPPED_ACACIA_DOOR_14);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_15), TALL_CHIPPED_ACACIA_DOOR_15);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_16), TALL_CHIPPED_ACACIA_DOOR_16);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_17), TALL_CHIPPED_ACACIA_DOOR_17);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_18), TALL_CHIPPED_ACACIA_DOOR_18);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_19), TALL_CHIPPED_ACACIA_DOOR_19);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_20), TALL_CHIPPED_ACACIA_DOOR_20);
        
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_01), TALL_CHIPPED_DARK_OAK_DOOR_01);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_02), TALL_CHIPPED_DARK_OAK_DOOR_02);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_03), TALL_CHIPPED_DARK_OAK_DOOR_03);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_04), TALL_CHIPPED_DARK_OAK_DOOR_04);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_05), TALL_CHIPPED_DARK_OAK_DOOR_05);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_06), TALL_CHIPPED_DARK_OAK_DOOR_06);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_07), TALL_CHIPPED_DARK_OAK_DOOR_07);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_08), TALL_CHIPPED_DARK_OAK_DOOR_08);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_09), TALL_CHIPPED_DARK_OAK_DOOR_09);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_10), TALL_CHIPPED_DARK_OAK_DOOR_10);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_11), TALL_CHIPPED_DARK_OAK_DOOR_11);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_12), TALL_CHIPPED_DARK_OAK_DOOR_12);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_13), TALL_CHIPPED_DARK_OAK_DOOR_13);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_14), TALL_CHIPPED_DARK_OAK_DOOR_14);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_15), TALL_CHIPPED_DARK_OAK_DOOR_15);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_16), TALL_CHIPPED_DARK_OAK_DOOR_16);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_17), TALL_CHIPPED_DARK_OAK_DOOR_17);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_18), TALL_CHIPPED_DARK_OAK_DOOR_18);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_19), TALL_CHIPPED_DARK_OAK_DOOR_19);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_20), TALL_CHIPPED_DARK_OAK_DOOR_20);
        
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_01), TALL_CHIPPED_CRIMSON_DOOR_01);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_02), TALL_CHIPPED_CRIMSON_DOOR_02);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_03), TALL_CHIPPED_CRIMSON_DOOR_03);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_04), TALL_CHIPPED_CRIMSON_DOOR_04);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_05), TALL_CHIPPED_CRIMSON_DOOR_05);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_06), TALL_CHIPPED_CRIMSON_DOOR_06);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_07), TALL_CHIPPED_CRIMSON_DOOR_07);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_08), TALL_CHIPPED_CRIMSON_DOOR_08);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_09), TALL_CHIPPED_CRIMSON_DOOR_09);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_10), TALL_CHIPPED_CRIMSON_DOOR_10);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_11), TALL_CHIPPED_CRIMSON_DOOR_11);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_12), TALL_CHIPPED_CRIMSON_DOOR_12);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_13), TALL_CHIPPED_CRIMSON_DOOR_13);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_14), TALL_CHIPPED_CRIMSON_DOOR_14);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_15), TALL_CHIPPED_CRIMSON_DOOR_15);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_16), TALL_CHIPPED_CRIMSON_DOOR_16);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_17), TALL_CHIPPED_CRIMSON_DOOR_17);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_18), TALL_CHIPPED_CRIMSON_DOOR_18);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_19), TALL_CHIPPED_CRIMSON_DOOR_19);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_20), TALL_CHIPPED_CRIMSON_DOOR_20);
        
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_01), TALL_CHIPPED_WARPED_DOOR_01);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_02), TALL_CHIPPED_WARPED_DOOR_02);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_03), TALL_CHIPPED_WARPED_DOOR_03);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_04), TALL_CHIPPED_WARPED_DOOR_04);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_05), TALL_CHIPPED_WARPED_DOOR_05);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_06), TALL_CHIPPED_WARPED_DOOR_06);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_07), TALL_CHIPPED_WARPED_DOOR_07);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_08), TALL_CHIPPED_WARPED_DOOR_08);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_09), TALL_CHIPPED_WARPED_DOOR_09);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_10), TALL_CHIPPED_WARPED_DOOR_10);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_11), TALL_CHIPPED_WARPED_DOOR_11);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_12), TALL_CHIPPED_WARPED_DOOR_12);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_13), TALL_CHIPPED_WARPED_DOOR_13);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_14), TALL_CHIPPED_WARPED_DOOR_14);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_15), TALL_CHIPPED_WARPED_DOOR_15);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_16), TALL_CHIPPED_WARPED_DOOR_16);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_17), TALL_CHIPPED_WARPED_DOOR_17);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_18), TALL_CHIPPED_WARPED_DOOR_18);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_19), TALL_CHIPPED_WARPED_DOOR_19);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_20), TALL_CHIPPED_WARPED_DOOR_20);
        
        //Register all those Macaw doors.
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JAIL), TALL_MACAW_JAIL_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL), TALL_MACAW_METAL_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_HOSPITAL), TALL_MACAW_METAL_HOSPITAL_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_REINFORCED), TALL_MACAW_METAL_REINFORCED_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_WARNING), TALL_MACAW_METAL_WARNING_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_WINDOWED), TALL_MACAW_METAL_WINDOWED_DOOR);

        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BARN), TALL_MACAW_OAK_BARN_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BARN), TALL_MACAW_SPRUCE_BARN_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BARN), TALL_MACAW_BIRCH_BARN_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_BARN), TALL_MACAW_JUNGLE_BARN_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BARN), TALL_MACAW_ACACIA_BARN_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BARN), TALL_MACAW_DARK_OAK_BARN_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BARN), TALL_MACAW_MANGROVE_BARN_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_BARN), TALL_MACAW_CRIMSON_BARN_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_BARN), TALL_MACAW_WARPED_BARN_DOOR);

        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BARN_GLASS), TALL_MACAW_OAK_BARN_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BARN_GLASS), TALL_MACAW_SPRUCE_BARN_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BARN_GLASS), TALL_MACAW_BIRCH_BARN_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_BARN_GLASS), TALL_MACAW_JUNGLE_BARN_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BARN_GLASS), TALL_MACAW_ACACIA_BARN_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BARN_GLASS), TALL_MACAW_DARK_OAK_BARN_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BARN_GLASS), TALL_MACAW_MANGROVE_BARN_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_BARN_GLASS), TALL_MACAW_CRIMSON_BARN_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_BARN_GLASS), TALL_MACAW_WARPED_BARN_GLASS_DOOR);

        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_STABLE), TALL_MACAW_OAK_STABLE_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_STABLE), TALL_MACAW_SPRUCE_STABLE_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_STABLE), TALL_MACAW_BIRCH_STABLE_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_STABLE), TALL_MACAW_JUNGLE_STABLE_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_STABLE), TALL_MACAW_ACACIA_STABLE_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_STABLE), TALL_MACAW_DARK_OAK_STABLE_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_STABLE), TALL_MACAW_MANGROVE_STABLE_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_STABLE), TALL_MACAW_CRIMSON_STABLE_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_STABLE), TALL_MACAW_WARPED_STABLE_DOOR);

        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_STABLE_HEAD), TALL_MACAW_OAK_STABLE_HEAD_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_STABLE_HEAD), TALL_MACAW_SPRUCE_STABLE_HEAD_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_STABLE_HEAD), TALL_MACAW_BIRCH_STABLE_HEAD_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_STABLE_HEAD), TALL_MACAW_JUNGLE_STABLE_HEAD_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_STABLE_HEAD), TALL_MACAW_ACACIA_STABLE_HEAD_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_STABLE_HEAD), TALL_MACAW_DARK_OAK_STABLE_HEAD_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_STABLE_HEAD), TALL_MACAW_MANGROVE_STABLE_HEAD_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_STABLE_HEAD), TALL_MACAW_CRIMSON_STABLE_HEAD_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_STABLE_HEAD), TALL_MACAW_WARPED_STABLE_HEAD_DOOR);

        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BARK_GLASS), TALL_MACAW_OAK_BARK_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BARK_GLASS), TALL_MACAW_SPRUCE_BARK_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BARK_GLASS), TALL_MACAW_BIRCH_BARK_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_BARK_GLASS), TALL_MACAW_JUNGLE_BARK_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BARK_GLASS), TALL_MACAW_ACACIA_BARK_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BARK_GLASS), TALL_MACAW_DARK_OAK_BARK_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BARK_GLASS), TALL_MACAW_MANGROVE_BARK_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_STEM_GLASS), TALL_MACAW_CRIMSON_STEM_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_STEM_GLASS), TALL_MACAW_WARPED_STEM_GLASS_DOOR);
        
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_GLASS), TALL_MACAW_OAK_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_GLASS), TALL_MACAW_SPRUCE_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_GLASS), TALL_MACAW_BIRCH_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_GLASS), TALL_MACAW_JUNGLE_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_GLASS), TALL_MACAW_ACACIA_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_GLASS), TALL_MACAW_DARK_OAK_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_GLASS), TALL_MACAW_MANGROVE_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_GLASS), TALL_MACAW_CRIMSON_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_GLASS), TALL_MACAW_WARPED_GLASS_DOOR);

        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_MODERN), TALL_MACAW_OAK_MODERN_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_MODERN), TALL_MACAW_SPRUCE_MODERN_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_MODERN), TALL_MACAW_BIRCH_MODERN_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_MODERN), TALL_MACAW_JUNGLE_MODERN_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_MODERN), TALL_MACAW_ACACIA_MODERN_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_MODERN), TALL_MACAW_DARK_OAK_MODERN_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_MODERN), TALL_MACAW_MANGROVE_MODERN_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_MODERN), TALL_MACAW_CRIMSON_MODERN_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_MODERN), TALL_MACAW_WARPED_MODERN_DOOR);

        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_JAPANESE), TALL_MACAW_OAK_JAPANESE_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_JAPANESE), TALL_MACAW_SPRUCE_JAPANESE_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_JAPANESE), TALL_MACAW_BIRCH_JAPANESE_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_JAPANESE), TALL_MACAW_JUNGLE_JAPANESE_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_JAPANESE), TALL_MACAW_ACACIA_JAPANESE_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_JAPANESE), TALL_MACAW_DARK_OAK_JAPANESE_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_JAPANESE), TALL_MACAW_MANGROVE_JAPANESE_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_JAPANESE), TALL_MACAW_CRIMSON_JAPANESE_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_JAPANESE), TALL_MACAW_WARPED_JAPANESE_DOOR);

        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_JAPANESE2), TALL_MACAW_OAK_JAPANESE2_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_JAPANESE2), TALL_MACAW_SPRUCE_JAPANESE2_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_JAPANESE2), TALL_MACAW_BIRCH_JAPANESE2_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_JAPANESE2), TALL_MACAW_JUNGLE_JAPANESE2_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_JAPANESE2), TALL_MACAW_ACACIA_JAPANESE2_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_JAPANESE2), TALL_MACAW_DARK_OAK_JAPANESE2_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_JAPANESE2), TALL_MACAW_MANGROVE_JAPANESE2_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_JAPANESE2), TALL_MACAW_CRIMSON_JAPANESE2_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_JAPANESE2), TALL_MACAW_WARPED_JAPANESE2_DOOR);

        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_CLASSIC), TALL_MACAW_SPRUCE_CLASSIC_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_CLASSIC), TALL_MACAW_BIRCH_CLASSIC_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_CLASSIC), TALL_MACAW_JUNGLE_CLASSIC_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_CLASSIC), TALL_MACAW_ACACIA_CLASSIC_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_CLASSIC), TALL_MACAW_DARK_OAK_CLASSIC_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_CLASSIC), TALL_MACAW_MANGROVE_CLASSIC_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_CLASSIC), TALL_MACAW_CRIMSON_CLASSIC_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_CLASSIC), TALL_MACAW_WARPED_CLASSIC_DOOR);

        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_COTTAGE), TALL_MACAW_OAK_COTTAGE_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_COTTAGE), TALL_MACAW_BIRCH_COTTAGE_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_COTTAGE), TALL_MACAW_JUNGLE_COTTAGE_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_COTTAGE), TALL_MACAW_ACACIA_COTTAGE_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_COTTAGE), TALL_MACAW_DARK_OAK_COTTAGE_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_COTTAGE), TALL_MACAW_MANGROVE_COTTAGE_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_COTTAGE), TALL_MACAW_CRIMSON_COTTAGE_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_COTTAGE), TALL_MACAW_WARPED_COTTAGE_DOOR);

        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_PAPER), TALL_MACAW_OAK_PAPER_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_PAPER), TALL_MACAW_SPRUCE_PAPER_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_PAPER), TALL_MACAW_JUNGLE_PAPER_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_PAPER), TALL_MACAW_ACACIA_PAPER_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_PAPER), TALL_MACAW_DARK_OAK_PAPER_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_PAPER), TALL_MACAW_MANGROVE_PAPER_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_PAPER), TALL_MACAW_CRIMSON_PAPER_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_PAPER), TALL_MACAW_WARPED_PAPER_DOOR);

        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BEACH), TALL_MACAW_OAK_BEACH_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BEACH), TALL_MACAW_SPRUCE_BEACH_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BEACH), TALL_MACAW_BIRCH_BEACH_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BEACH), TALL_MACAW_ACACIA_BEACH_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BEACH), TALL_MACAW_DARK_OAK_BEACH_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BEACH), TALL_MACAW_MANGROVE_BEACH_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_BEACH), TALL_MACAW_CRIMSON_BEACH_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_BEACH), TALL_MACAW_WARPED_BEACH_DOOR);

        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_TROPICAL), TALL_MACAW_OAK_TROPICAL_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_TROPICAL), TALL_MACAW_SPRUCE_TROPICAL_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_TROPICAL), TALL_MACAW_BIRCH_TROPICAL_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_TROPICAL), TALL_MACAW_JUNGLE_TROPICAL_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_TROPICAL), TALL_MACAW_DARK_OAK_TROPICAL_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_TROPICAL), TALL_MACAW_MANGROVE_TROPICAL_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_TROPICAL), TALL_MACAW_CRIMSON_TROPICAL_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_TROPICAL), TALL_MACAW_WARPED_TROPICAL_DOOR);

        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_FOUR_PANEL), TALL_MACAW_OAK_FOUR_PANEL_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_FOUR_PANEL), TALL_MACAW_SPRUCE_FOUR_PANEL_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_FOUR_PANEL), TALL_MACAW_BIRCH_FOUR_PANEL_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_FOUR_PANEL), TALL_MACAW_JUNGLE_FOUR_PANEL_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_FOUR_PANEL), TALL_MACAW_ACACIA_FOUR_PANEL_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_FOUR_PANEL), TALL_MACAW_MANGROVE_FOUR_PANEL_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_FOUR_PANEL), TALL_MACAW_CRIMSON_FOUR_PANEL_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_FOUR_PANEL), TALL_MACAW_WARPED_FOUR_PANEL_DOOR);

        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_SWAMP), TALL_MACAW_OAK_SWAMP_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_SWAMP), TALL_MACAW_SPRUCE_SWAMP_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_SWAMP), TALL_MACAW_BIRCH_SWAMP_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_SWAMP), TALL_MACAW_JUNGLE_SWAMP_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_SWAMP), TALL_MACAW_ACACIA_SWAMP_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_SWAMP), TALL_MACAW_DARK_OAK_SWAMP_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_SWAMP), TALL_MACAW_CRIMSON_SWAMP_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_SWAMP), TALL_MACAW_WARPED_SWAMP_DOOR);

        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_NETHER), TALL_MACAW_OAK_NETHER_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_NETHER), TALL_MACAW_SPRUCE_NETHER_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_NETHER), TALL_MACAW_BIRCH_NETHER_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_NETHER), TALL_MACAW_JUNGLE_NETHER_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_NETHER), TALL_MACAW_ACACIA_NETHER_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_NETHER), TALL_MACAW_DARK_OAK_NETHER_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_NETHER), TALL_MACAW_MANGROVE_NETHER_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_NETHER), TALL_MACAW_WARPED_NETHER_DOOR);

        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_MYSTIC), TALL_MACAW_OAK_MYSTIC_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_MYSTIC), TALL_MACAW_SPRUCE_MYSTIC_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_MYSTIC), TALL_MACAW_BIRCH_MYSTIC_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_MYSTIC), TALL_MACAW_JUNGLE_MYSTIC_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_MYSTIC), TALL_MACAW_ACACIA_MYSTIC_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_MYSTIC), TALL_MACAW_DARK_OAK_MYSTIC_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_MYSTIC), TALL_MACAW_MANGROVE_MYSTIC_DOOR);
        Registry.register(Registry.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_MYSTIC), TALL_MACAW_CRIMSON_MYSTIC_DOOR);
    }
    
    public static Block getBlockFromResourceLocation(ResourceLocation resource) {
    	return getBlockFromResourceLocation(resource, Blocks.OAK_DOOR);
    }
    
    public static Block getBlockFromResourceLocation(ResourceLocation resource, Block fallback) {
    	return Registry.BLOCK.getOptional(resource).orElse(fallback);
    }
}
