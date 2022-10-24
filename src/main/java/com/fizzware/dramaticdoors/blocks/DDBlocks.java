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
    public static final Block TALL_MANGROVE_DOOR = new TallDoorBlock(Blocks.MANGROVE_DOOR);
    public static final Block TALL_CRIMSON_DOOR = new TallDoorBlock(Blocks.CRIMSON_DOOR);
    public static final Block TALL_WARPED_DOOR = new TallDoorBlock(Blocks.WARPED_DOOR);

    // Ad Astra
    public static final Block TALL_AERONOS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("ad_astra", "aeronos_door")));
    public static final Block TALL_GLACIAN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("ad_astra", "glacian_door")));
    public static final Block TALL_STROPHAR_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("ad_astra", "strophar_door")));
    public static final Block TALL_STEEL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("ad_astra", "steel_door"), Blocks.IRON_DOOR));

    // Architects Palette
    public static final Block TALL_TWISTED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("architects_palette", "twisted_door")));

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
    
    // Blockus
    public static final Block TALL_BLOCKUS_BAMBOO_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("blockus", "bamboo_door")));
    public static final Block TALL_BLOCKUS_BLACKSTONE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("blockus", "blackstone_door")));
    public static final Block TALL_BLOCKUS_CHARRED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("blockus", "charred_door")));
    public static final Block TALL_BLOCKUS_OBSIDIAN_REINFORCED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("blockus", "obsidian_reinforced_door")));
    public static final Block TALL_BLOCKUS_PAPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("blockus", "paper_door")));
    public static final Block TALL_BLOCKUS_STONE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("blockus", "stone_door")));
    public static final Block TALL_BLOCKUS_WHITE_OAK_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("blockus", "white_oak_door")));
    
    // The Ceilands
    public static final Block TALL_CEILTRUNK_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("ceilands", "ceiltrunk_door")));
    public static final Block TALL_LUZAWOOD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("ceilands", "luzawood_door")));

    // Charm
    public static final Block TALL_CHARM_AZALEA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("charm", "azalea_door")));
    public static final Block TALL_CHARM_EBONY_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("charm", "ebony_door")));

    // Ecologics
    public static final Block TALL_ECO_AZALEA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("ecologics", "azalea_door")));
    public static final Block TALL_ECO_FLOWERING_AZALEA_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("ecologics", "flowering_azalea_door")));
    public static final Block TALL_ECO_COCONUT_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("ecologics", "coconut_door")));
    public static final Block TALL_ECO_WALNUT_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("ecologics", "walnut_door")));

    // Modern Glass
    public static final Block TALL_IRON_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("glassdoor", "iron_glassdoor"), Blocks.IRON_DOOR));
    public static final Block TALL_OAK_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("glassdoor", "oak_glassdoor")));
    public static final Block TALL_SPRUCE_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("glassdoor", "spruce_glassdoor")));
    public static final Block TALL_BIRCH_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("glassdoor", "birch_glassdoor")));
    public static final Block TALL_JUNGLE_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("glassdoor", "jungle_glassdoor")));
    public static final Block TALL_ACACIA_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("glassdoor", "acacia_glassdoor")));
    public static final Block TALL_DARK_OAK_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("glassdoor", "dark_oak_glassdoor")));
    public static final Block TALL_MANGROVE_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("glassdoor", "mangrove_glassdoor")));
    public static final Block TALL_CRIMSON_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("glassdoor", "crimson_glassdoor")));
    public static final Block TALL_WARPED_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("glassdoor", "warped_glassdoor")));    

    // Hephaestus
    public static final Block TALL_BLOODSHROOM_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("tconstruct", "bloodshroom_door")));
    public static final Block TALL_GREENHEART_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("tconstruct", "greenheart_door")));
    public static final Block TALL_SKYROOT_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("tconstruct", "skyroot_door")));
    
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
    
    // Promenade
    public static final Block TALL_PROMENADE_CHERRY_OAK_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("promenade", "cherry_oak_door")));
    public static final Block TALL_PROMENADE_DARK_AMARANTH_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("promenade", "dark_amaranth_door")));
    public static final Block TALL_PROMENADE_PALM_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("promenade", "palm_door")));    
    
    // Snowy Spirit
    public static final Block TALL_GINGERBREAD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("snowyspirit", "gingerbread_door")));
    
    // Supplementaries
    public static final Block TALL_GOLD_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("supplementaries", "gold_door")));
    public static final Block TALL_NETHERITE_DOOR = new TallNetheriteDoorBlock(getBlockFromResourceLocation(new Identifier("supplementaries", "netherite_door")));
    
    // Tech Reborn
    public static final Block TALL_RUBBER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("tech_reborn", "rubber_door")));
    
    // Traverse
    public static final Block TALL_TRAVERSE_FIR_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("traverse", "fir_door")));
    
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
    
    // XP Obelisk
    public static final Block TALL_SOUL_COPPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("xps_additions", "soul_copper_door"), Blocks.IRON_DOOR));
    
    // Macaw's Doors (The biggest compat)
    public static final Block TALL_MACAW_JAIL_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "jail_door"), Blocks.IRON_DOOR));
	public static final Block TALL_MACAW_METAL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "metal_door"), Blocks.IRON_DOOR));
	public static final Block TALL_MACAW_METAL_HOSPITAL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "metal_hospital_door"), Blocks.IRON_DOOR));
	public static final Block TALL_MACAW_METAL_REINFORCED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "metal_reinforced_door"), Blocks.IRON_DOOR));
	public static final Block TALL_MACAW_METAL_WARNING_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "metal_warning_door"), Blocks.IRON_DOOR));
	public static final Block TALL_MACAW_METAL_WINDOWED_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "metal_windowed_door"), Blocks.IRON_DOOR));

	public static final Block TALL_MACAW_OAK_BARN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "oak_barn_door")));
	public static final Block TALL_MACAW_SPRUCE_BARN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "spruce_barn_door")));
	public static final Block TALL_MACAW_BIRCH_BARN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "birch_barn_door")));
	public static final Block TALL_MACAW_JUNGLE_BARN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "jungle_barn_door")));
	public static final Block TALL_MACAW_ACACIA_BARN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "acacia_barn_door")));
	public static final Block TALL_MACAW_DARK_OAK_BARN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "dark_oak_barn_door")));
	public static final Block TALL_MACAW_MANGROVE_BARN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "mangrove_barn_door")));
	public static final Block TALL_MACAW_CRIMSON_BARN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "crimson_barn_door")));
	public static final Block TALL_MACAW_WARPED_BARN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "warped_barn_door")));

	public static final Block TALL_MACAW_OAK_BARN_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "oak_barn_glass_door")));
	public static final Block TALL_MACAW_SPRUCE_BARN_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "spruce_barn_glass_door")));
	public static final Block TALL_MACAW_BIRCH_BARN_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "birch_barn_glass_door")));
	public static final Block TALL_MACAW_JUNGLE_BARN_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "jungle_barn_glass_door")));
	public static final Block TALL_MACAW_ACACIA_BARN_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "acacia_barn_glass_door")));
	public static final Block TALL_MACAW_DARK_OAK_BARN_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "dark_oak_barn_glass_door")));
	public static final Block TALL_MACAW_MANGROVE_BARN_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "mangrove_barn_glass_door")));
	public static final Block TALL_MACAW_CRIMSON_BARN_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "crimson_barn_glass_door")));
	public static final Block TALL_MACAW_WARPED_BARN_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "warped_barn_glass_door")));

	public static final Block TALL_MACAW_OAK_STABLE_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "oak_stable_door")));
	public static final Block TALL_MACAW_SPRUCE_STABLE_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "spruce_stable_door")));
	public static final Block TALL_MACAW_BIRCH_STABLE_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "birch_stable_door")));
	public static final Block TALL_MACAW_JUNGLE_STABLE_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "jungle_stable_door")));
	public static final Block TALL_MACAW_ACACIA_STABLE_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "acacia_stable_door")));
	public static final Block TALL_MACAW_DARK_OAK_STABLE_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "dark_oak_stable_door")));
	public static final Block TALL_MACAW_MANGROVE_STABLE_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "mangrove_stable_door")));
	public static final Block TALL_MACAW_CRIMSON_STABLE_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "crimson_stable_door")));
	public static final Block TALL_MACAW_WARPED_STABLE_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "warped_stable_door")));

	public static final Block TALL_MACAW_OAK_STABLE_HEAD_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "oak_stable_head_door")));
	public static final Block TALL_MACAW_SPRUCE_STABLE_HEAD_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "spruce_stable_head_door")));
	public static final Block TALL_MACAW_BIRCH_STABLE_HEAD_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "birch_stable_head_door")));
	public static final Block TALL_MACAW_JUNGLE_STABLE_HEAD_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "jungle_stable_head_door")));
	public static final Block TALL_MACAW_ACACIA_STABLE_HEAD_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "acacia_stable_head_door")));
	public static final Block TALL_MACAW_DARK_OAK_STABLE_HEAD_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "dark_oak_stable_head_door")));
	public static final Block TALL_MACAW_MANGROVE_STABLE_HEAD_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "mangrove_stable_head_door")));
	public static final Block TALL_MACAW_CRIMSON_STABLE_HEAD_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "crimson_stable_head_door")));
	public static final Block TALL_MACAW_WARPED_STABLE_HEAD_DOOR = new TallStableDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "warped_stable_head_door")));

	public static final Block TALL_MACAW_OAK_BARK_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "oak_bark_glass_door")));
	public static final Block TALL_MACAW_SPRUCE_BARK_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "spruce_bark_glass_door")));
	public static final Block TALL_MACAW_BIRCH_BARK_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "birch_bark_glass_door")));
	public static final Block TALL_MACAW_JUNGLE_BARK_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "jungle_bark_glass_door")));
	public static final Block TALL_MACAW_ACACIA_BARK_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "acacia_bark_glass_door")));
	public static final Block TALL_MACAW_DARK_OAK_BARK_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "dark_oak_bark_glass_door")));
	public static final Block TALL_MACAW_MANGROVE_BARK_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "mangrove_bark_glass_door")));
	public static final Block TALL_MACAW_CRIMSON_STEM_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "crimson_stem_glass_door")));
	public static final Block TALL_MACAW_WARPED_STEM_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "warped_stem_glass_door")));
	
	public static final Block TALL_MACAW_OAK_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "oak_glass_door")));
	public static final Block TALL_MACAW_SPRUCE_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "spruce_glass_door")));
	public static final Block TALL_MACAW_BIRCH_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "birch_glass_door")));
	public static final Block TALL_MACAW_JUNGLE_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "jungle_glass_door")));
	public static final Block TALL_MACAW_ACACIA_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "acacia_glass_door")));
	public static final Block TALL_MACAW_DARK_OAK_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "dark_oak_glass_door")));
	public static final Block TALL_MACAW_MANGROVE_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "mangrove_glass_door")));
	public static final Block TALL_MACAW_CRIMSON_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "crimson_glass_door")));
	public static final Block TALL_MACAW_WARPED_GLASS_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "warped_glass_door")));

	public static final Block TALL_MACAW_OAK_MODERN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "oak_modern_door")));
	public static final Block TALL_MACAW_SPRUCE_MODERN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "spruce_modern_door")));
	public static final Block TALL_MACAW_BIRCH_MODERN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "birch_modern_door")));
	public static final Block TALL_MACAW_JUNGLE_MODERN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "jungle_modern_door")));
	public static final Block TALL_MACAW_ACACIA_MODERN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "acacia_modern_door")));
	public static final Block TALL_MACAW_DARK_OAK_MODERN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "dark_oak_modern_door")));
	public static final Block TALL_MACAW_MANGROVE_MODERN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "mangrove_modern_door")));
	public static final Block TALL_MACAW_CRIMSON_MODERN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "crimson_modern_door")));
	public static final Block TALL_MACAW_WARPED_MODERN_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "warped_modern_door")));

	public static final Block TALL_MACAW_OAK_JAPANESE_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "oak_japanese_door")));
	public static final Block TALL_MACAW_SPRUCE_JAPANESE_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "spruce_japanese_door")));
	public static final Block TALL_MACAW_BIRCH_JAPANESE_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "birch_japanese_door")));
	public static final Block TALL_MACAW_JUNGLE_JAPANESE_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "jungle_japanese_door")));
	public static final Block TALL_MACAW_ACACIA_JAPANESE_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "acacia_japanese_door")));
	public static final Block TALL_MACAW_DARK_OAK_JAPANESE_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "dark_oak_japanese_door")));
	public static final Block TALL_MACAW_MANGROVE_JAPANESE_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "mangrove_japanese_door")));
	public static final Block TALL_MACAW_CRIMSON_JAPANESE_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "crimson_japanese_door")));
	public static final Block TALL_MACAW_WARPED_JAPANESE_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "warped_japanese_door")));

	public static final Block TALL_MACAW_OAK_JAPANESE2_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "oak_japanese2_door")));
	public static final Block TALL_MACAW_SPRUCE_JAPANESE2_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "spruce_japanese2_door")));
	public static final Block TALL_MACAW_BIRCH_JAPANESE2_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "birch_japanese2_door")));
	public static final Block TALL_MACAW_JUNGLE_JAPANESE2_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "jungle_japanese2_door")));
	public static final Block TALL_MACAW_ACACIA_JAPANESE2_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "acacia_japanese2_door")));
	public static final Block TALL_MACAW_DARK_OAK_JAPANESE2_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "dark_oak_japanese2_door")));
	public static final Block TALL_MACAW_MANGROVE_JAPANESE2_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "mangrove_japanese2_door")));
	public static final Block TALL_MACAW_CRIMSON_JAPANESE2_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "crimson_japanese2_door")));
	public static final Block TALL_MACAW_WARPED_JAPANESE2_DOOR = new TallSlidingDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "warped_japanese2_door")));

	public static final Block TALL_MACAW_SPRUCE_CLASSIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "spruce_classic_door")));
	public static final Block TALL_MACAW_BIRCH_CLASSIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "birch_classic_door")));
	public static final Block TALL_MACAW_JUNGLE_CLASSIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "jungle_classic_door")));
	public static final Block TALL_MACAW_ACACIA_CLASSIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "acacia_classic_door")));
	public static final Block TALL_MACAW_DARK_OAK_CLASSIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "dark_oak_classic_door")));
	public static final Block TALL_MACAW_MANGROVE_CLASSIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "mangrove_classic_door")));
	public static final Block TALL_MACAW_CRIMSON_CLASSIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "crimson_classic_door")));
	public static final Block TALL_MACAW_WARPED_CLASSIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "warped_classic_door")));

	public static final Block TALL_MACAW_OAK_COTTAGE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "oak_cottage_door")));
	public static final Block TALL_MACAW_BIRCH_COTTAGE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "birch_cottage_door")));
	public static final Block TALL_MACAW_JUNGLE_COTTAGE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "jungle_cottage_door")));
	public static final Block TALL_MACAW_ACACIA_COTTAGE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "acacia_cottage_door")));
	public static final Block TALL_MACAW_DARK_OAK_COTTAGE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "dark_oak_cottage_door")));
	public static final Block TALL_MACAW_MANGROVE_COTTAGE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "mangrove_cottage_door")));
	public static final Block TALL_MACAW_CRIMSON_COTTAGE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "crimson_cottage_door")));
	public static final Block TALL_MACAW_WARPED_COTTAGE_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "warped_cottage_door")));

	public static final Block TALL_MACAW_OAK_PAPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "oak_paper_door")));
	public static final Block TALL_MACAW_SPRUCE_PAPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "spruce_paper_door")));
	public static final Block TALL_MACAW_JUNGLE_PAPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "jungle_paper_door")));
	public static final Block TALL_MACAW_ACACIA_PAPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "acacia_paper_door")));
	public static final Block TALL_MACAW_DARK_OAK_PAPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "dark_oak_paper_door")));
	public static final Block TALL_MACAW_MANGROVE_PAPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "mangrove_paper_door")));
	public static final Block TALL_MACAW_CRIMSON_PAPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "crimson_paper_door")));
	public static final Block TALL_MACAW_WARPED_PAPER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "warped_paper_door")));

	public static final Block TALL_MACAW_OAK_BEACH_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "oak_beach_door")));
	public static final Block TALL_MACAW_SPRUCE_BEACH_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "spruce_beach_door")));
	public static final Block TALL_MACAW_BIRCH_BEACH_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "birch_beach_door")));
	public static final Block TALL_MACAW_ACACIA_BEACH_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "acacia_beach_door")));
	public static final Block TALL_MACAW_DARK_OAK_BEACH_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "dark_oak_beach_door")));
	public static final Block TALL_MACAW_MANGROVE_BEACH_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "mangrove_beach_door")));
	public static final Block TALL_MACAW_CRIMSON_BEACH_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "crimson_beach_door")));
	public static final Block TALL_MACAW_WARPED_BEACH_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "warped_beach_door")));

	public static final Block TALL_MACAW_OAK_TROPICAL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "oak_tropical_door")));
	public static final Block TALL_MACAW_SPRUCE_TROPICAL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "spruce_tropical_door")));
	public static final Block TALL_MACAW_BIRCH_TROPICAL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "birch_tropical_door")));
	public static final Block TALL_MACAW_JUNGLE_TROPICAL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "jungle_tropical_door")));
	public static final Block TALL_MACAW_DARK_OAK_TROPICAL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "dark_oak_tropical_door")));
	public static final Block TALL_MACAW_MANGROVE_TROPICAL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "mangrove_tropical_door")));
	public static final Block TALL_MACAW_CRIMSON_TROPICAL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "crimson_tropical_door")));
	public static final Block TALL_MACAW_WARPED_TROPICAL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "warped_tropical_door")));

	public static final Block TALL_MACAW_OAK_FOUR_PANEL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "oak_four_panel_door")));
	public static final Block TALL_MACAW_SPRUCE_FOUR_PANEL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "spruce_four_panel_door")));
	public static final Block TALL_MACAW_BIRCH_FOUR_PANEL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "birch_four_panel_door")));
	public static final Block TALL_MACAW_JUNGLE_FOUR_PANEL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "jungle_four_panel_door")));
	public static final Block TALL_MACAW_ACACIA_FOUR_PANEL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "acacia_four_panel_door")));
	public static final Block TALL_MACAW_MANGROVE_FOUR_PANEL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "mangrove_four_panel_door")));
	public static final Block TALL_MACAW_CRIMSON_FOUR_PANEL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "crimson_four_panel_door")));
	public static final Block TALL_MACAW_WARPED_FOUR_PANEL_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "warped_four_panel_door")));

	public static final Block TALL_MACAW_OAK_SWAMP_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "oak_swamp_door")));
	public static final Block TALL_MACAW_SPRUCE_SWAMP_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "spruce_swamp_door")));
	public static final Block TALL_MACAW_BIRCH_SWAMP_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "birch_swamp_door")));
	public static final Block TALL_MACAW_JUNGLE_SWAMP_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "jungle_swamp_door")));
	public static final Block TALL_MACAW_ACACIA_SWAMP_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "acacia_swamp_door")));
	public static final Block TALL_MACAW_DARK_OAK_SWAMP_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "dark_oak_swamp_door")));
	public static final Block TALL_MACAW_CRIMSON_SWAMP_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "crimson_swamp_door")));
	public static final Block TALL_MACAW_WARPED_SWAMP_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "warped_swamp_door")));

	public static final Block TALL_MACAW_OAK_NETHER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "oak_nether_door")));
	public static final Block TALL_MACAW_SPRUCE_NETHER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "spruce_nether_door")));
	public static final Block TALL_MACAW_BIRCH_NETHER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "birch_nether_door")));
	public static final Block TALL_MACAW_JUNGLE_NETHER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "jungle_nether_door")));
	public static final Block TALL_MACAW_ACACIA_NETHER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "acacia_nether_door")));
	public static final Block TALL_MACAW_DARK_OAK_NETHER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "dark_oak_nether_door")));
	public static final Block TALL_MACAW_MANGROVE_NETHER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "mangrove_nether_door")));
	public static final Block TALL_MACAW_WARPED_NETHER_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "warped_nether_door")));

	public static final Block TALL_MACAW_OAK_MYSTIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "oak_mystic_door")));
	public static final Block TALL_MACAW_SPRUCE_MYSTIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "spruce_mystic_door")));
	public static final Block TALL_MACAW_BIRCH_MYSTIC_DOOR =  new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "birch_mystic_door")));
	public static final Block TALL_MACAW_JUNGLE_MYSTIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "jungle_mystic_door")));
	public static final Block TALL_MACAW_ACACIA_MYSTIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "acacia_mystic_door")));
	public static final Block TALL_MACAW_DARK_OAK_MYSTIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "dark_oak_mystic_door")));
	public static final Block TALL_MACAW_MANGROVE_MYSTIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "mangrove_mystic_door")));
	public static final Block TALL_MACAW_CRIMSON_MYSTIC_DOOR = new TallDoorBlock(getBlockFromResourceLocation(new Identifier("mcwdoors", "crimson_mystic_door")));
    
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
        
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_AERONOS), TALL_AERONOS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_GLACIAN), TALL_GLACIAN_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_STROPHAR), TALL_STROPHAR_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_STEEL), TALL_STEEL_DOOR);

        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_TWISTED), TALL_TWISTED_DOOR);

        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CYPRESS), TALL_CYPRESS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_DRAGONS_BLOOD), TALL_DRAGONS_BLOOD_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_ELDER), TALL_ELDER_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_JUNIPER), TALL_JUNIPER_DOOR);

        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_ANCIENT_OAK), TALL_ANCIENT_OAK_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BLIGHTED_BALSA), TALL_BLIGHTED_BALSA_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_SWAMP_CYPRESS), TALL_SWAMP_CYPRESS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_WILLOW), TALL_WILLOW_DOOR);
        
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BLOCKUS_BAMBOO), TALL_BLOCKUS_BAMBOO_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BLOCKUS_BLACKSTONE), TALL_BLOCKUS_BLACKSTONE_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BLOCKUS_CHARRED), TALL_BLOCKUS_CHARRED_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BLOCKUS_OBSIDIAN_REINFORCED), TALL_BLOCKUS_OBSIDIAN_REINFORCED_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BLOCKUS_PAPER), TALL_BLOCKUS_PAPER_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BLOCKUS_STONE), TALL_BLOCKUS_STONE_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BLOCKUS_WHITE_OAK), TALL_BLOCKUS_WHITE_OAK_DOOR);

        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CEILTRUNK), TALL_CEILTRUNK_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_LUZAWOOD), TALL_LUZAWOOD_DOOR);
        
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHARM_AZALEA), TALL_CHARM_AZALEA_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CHARM_EBONY), TALL_CHARM_EBONY_DOOR);

        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_ECO_AZALEA), TALL_ECO_AZALEA_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_ECO_FLOWERING_AZALEA), TALL_ECO_FLOWERING_AZALEA_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_ECO_COCONUT), TALL_ECO_COCONUT_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_ECO_WALNUT), TALL_ECO_WALNUT_DOOR);
        
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_IRON_GLASS), TALL_IRON_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_OAK_GLASS), TALL_OAK_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_SPRUCE_GLASS), TALL_SPRUCE_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BIRCH_GLASS), TALL_BIRCH_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_JUNGLE_GLASS), TALL_JUNGLE_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_ACACIA_GLASS), TALL_ACACIA_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_DARK_OAK_GLASS), TALL_DARK_OAK_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MANGROVE_GLASS), TALL_MANGROVE_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CRIMSON_GLASS), TALL_CRIMSON_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_WARPED_GLASS), TALL_WARPED_GLASS_DOOR);
        
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BLOODSHROOM), TALL_BLOODSHROOM_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_GREENHEART), TALL_GREENHEART_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_SKYROOT), TALL_SKYROOT_DOOR);

        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_PROMENADE_CHERRY_OAK), TALL_PROMENADE_CHERRY_OAK_DOOR);
		Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_PROMENADE_DARK_AMARANTH), TALL_PROMENADE_DARK_AMARANTH_DOOR);
		Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_PROMENADE_PALM), TALL_PROMENADE_PALM_DOOR);

        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_GINGERBREAD), TALL_GINGERBREAD_DOOR);

        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_GOLD), TALL_GOLD_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_NETHERITE), TALL_NETHERITE_DOOR);
        
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_RUBBER), TALL_RUBBER_DOOR);
        
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_TRAVERSE_FIR), TALL_TRAVERSE_FIR_DOOR);

        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_STRIPPED_BAMBOO), TALL_STRIPPED_BAMBOO_DOOR);

        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CANOPY), TALL_CANOPY_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_DARKWOOD), TALL_DARKWOOD_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MINEWOOD), TALL_MINEWOOD_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_SORTINGWOOD), TALL_SORTINGWOOD_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_TIMEWOOD), TALL_TIMEWOOD_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_TRANSWOOD), TALL_TRANSWOOD_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_TWILIGHT_MANGROVE), TALL_TWILIGHT_MANGROVE_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_TWILIGHT_OAK), TALL_TWILIGHT_OAK_DOOR);
        
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_SOUL_COPPER), TALL_SOUL_COPPER_DOOR);
        
        //Register all those Macaw doors.
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JAIL), TALL_MACAW_JAIL_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL), TALL_MACAW_METAL_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_HOSPITAL), TALL_MACAW_METAL_HOSPITAL_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_REINFORCED), TALL_MACAW_METAL_REINFORCED_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_WARNING), TALL_MACAW_METAL_WARNING_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_WINDOWED), TALL_MACAW_METAL_WINDOWED_DOOR);

        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BARN), TALL_MACAW_OAK_BARN_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BARN), TALL_MACAW_SPRUCE_BARN_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BARN), TALL_MACAW_BIRCH_BARN_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_BARN), TALL_MACAW_JUNGLE_BARN_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BARN), TALL_MACAW_ACACIA_BARN_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BARN), TALL_MACAW_DARK_OAK_BARN_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BARN), TALL_MACAW_MANGROVE_BARN_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_BARN), TALL_MACAW_CRIMSON_BARN_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_BARN), TALL_MACAW_WARPED_BARN_DOOR);

        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BARN_GLASS), TALL_MACAW_OAK_BARN_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BARN_GLASS), TALL_MACAW_SPRUCE_BARN_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BARN_GLASS), TALL_MACAW_BIRCH_BARN_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_BARN_GLASS), TALL_MACAW_JUNGLE_BARN_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BARN_GLASS), TALL_MACAW_ACACIA_BARN_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BARN_GLASS), TALL_MACAW_DARK_OAK_BARN_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BARN_GLASS), TALL_MACAW_MANGROVE_BARN_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_BARN_GLASS), TALL_MACAW_CRIMSON_BARN_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_BARN_GLASS), TALL_MACAW_WARPED_BARN_GLASS_DOOR);

        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_STABLE), TALL_MACAW_OAK_STABLE_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_STABLE), TALL_MACAW_SPRUCE_STABLE_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_STABLE), TALL_MACAW_BIRCH_STABLE_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_STABLE), TALL_MACAW_JUNGLE_STABLE_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_STABLE), TALL_MACAW_ACACIA_STABLE_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_STABLE), TALL_MACAW_DARK_OAK_STABLE_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_STABLE), TALL_MACAW_MANGROVE_STABLE_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_STABLE), TALL_MACAW_CRIMSON_STABLE_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_STABLE), TALL_MACAW_WARPED_STABLE_DOOR);

        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_STABLE_HEAD), TALL_MACAW_OAK_STABLE_HEAD_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_STABLE_HEAD), TALL_MACAW_SPRUCE_STABLE_HEAD_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_STABLE_HEAD), TALL_MACAW_BIRCH_STABLE_HEAD_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_STABLE_HEAD), TALL_MACAW_JUNGLE_STABLE_HEAD_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_STABLE_HEAD), TALL_MACAW_ACACIA_STABLE_HEAD_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_STABLE_HEAD), TALL_MACAW_DARK_OAK_STABLE_HEAD_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_STABLE_HEAD), TALL_MACAW_MANGROVE_STABLE_HEAD_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_STABLE_HEAD), TALL_MACAW_CRIMSON_STABLE_HEAD_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_STABLE_HEAD), TALL_MACAW_WARPED_STABLE_HEAD_DOOR);

        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BARK_GLASS), TALL_MACAW_OAK_BARK_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BARK_GLASS), TALL_MACAW_SPRUCE_BARK_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BARK_GLASS), TALL_MACAW_BIRCH_BARK_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_BARK_GLASS), TALL_MACAW_JUNGLE_BARK_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BARK_GLASS), TALL_MACAW_ACACIA_BARK_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BARK_GLASS), TALL_MACAW_DARK_OAK_BARK_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BARK_GLASS), TALL_MACAW_MANGROVE_BARK_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_STEM_GLASS), TALL_MACAW_CRIMSON_STEM_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_STEM_GLASS), TALL_MACAW_WARPED_STEM_GLASS_DOOR);
        
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_GLASS), TALL_MACAW_OAK_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_GLASS), TALL_MACAW_SPRUCE_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_GLASS), TALL_MACAW_BIRCH_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_GLASS), TALL_MACAW_JUNGLE_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_GLASS), TALL_MACAW_ACACIA_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_GLASS), TALL_MACAW_DARK_OAK_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_GLASS), TALL_MACAW_MANGROVE_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_GLASS), TALL_MACAW_CRIMSON_GLASS_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_GLASS), TALL_MACAW_WARPED_GLASS_DOOR);

        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_MODERN), TALL_MACAW_OAK_MODERN_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_MODERN), TALL_MACAW_SPRUCE_MODERN_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_MODERN), TALL_MACAW_BIRCH_MODERN_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_MODERN), TALL_MACAW_JUNGLE_MODERN_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_MODERN), TALL_MACAW_ACACIA_MODERN_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_MODERN), TALL_MACAW_DARK_OAK_MODERN_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_MODERN), TALL_MACAW_MANGROVE_MODERN_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_MODERN), TALL_MACAW_CRIMSON_MODERN_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_MODERN), TALL_MACAW_WARPED_MODERN_DOOR);

        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_JAPANESE), TALL_MACAW_OAK_JAPANESE_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_JAPANESE), TALL_MACAW_SPRUCE_JAPANESE_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_JAPANESE), TALL_MACAW_BIRCH_JAPANESE_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_JAPANESE), TALL_MACAW_JUNGLE_JAPANESE_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_JAPANESE), TALL_MACAW_ACACIA_JAPANESE_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_JAPANESE), TALL_MACAW_DARK_OAK_JAPANESE_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_JAPANESE), TALL_MACAW_MANGROVE_JAPANESE_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_JAPANESE), TALL_MACAW_CRIMSON_JAPANESE_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_JAPANESE), TALL_MACAW_WARPED_JAPANESE_DOOR);

        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_JAPANESE2), TALL_MACAW_OAK_JAPANESE2_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_JAPANESE2), TALL_MACAW_SPRUCE_JAPANESE2_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_JAPANESE2), TALL_MACAW_BIRCH_JAPANESE2_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_JAPANESE2), TALL_MACAW_JUNGLE_JAPANESE2_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_JAPANESE2), TALL_MACAW_ACACIA_JAPANESE2_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_JAPANESE2), TALL_MACAW_DARK_OAK_JAPANESE2_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_JAPANESE2), TALL_MACAW_MANGROVE_JAPANESE2_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_JAPANESE2), TALL_MACAW_CRIMSON_JAPANESE2_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_JAPANESE2), TALL_MACAW_WARPED_JAPANESE2_DOOR);

        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_CLASSIC), TALL_MACAW_SPRUCE_CLASSIC_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_CLASSIC), TALL_MACAW_BIRCH_CLASSIC_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_CLASSIC), TALL_MACAW_JUNGLE_CLASSIC_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_CLASSIC), TALL_MACAW_ACACIA_CLASSIC_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_CLASSIC), TALL_MACAW_DARK_OAK_CLASSIC_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_CLASSIC), TALL_MACAW_MANGROVE_CLASSIC_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_CLASSIC), TALL_MACAW_CRIMSON_CLASSIC_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_CLASSIC), TALL_MACAW_WARPED_CLASSIC_DOOR);

        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_COTTAGE), TALL_MACAW_OAK_COTTAGE_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_COTTAGE), TALL_MACAW_BIRCH_COTTAGE_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_COTTAGE), TALL_MACAW_JUNGLE_COTTAGE_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_COTTAGE), TALL_MACAW_ACACIA_COTTAGE_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_COTTAGE), TALL_MACAW_DARK_OAK_COTTAGE_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_COTTAGE), TALL_MACAW_MANGROVE_COTTAGE_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_COTTAGE), TALL_MACAW_CRIMSON_COTTAGE_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_COTTAGE), TALL_MACAW_WARPED_COTTAGE_DOOR);

        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_PAPER), TALL_MACAW_OAK_PAPER_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_PAPER), TALL_MACAW_SPRUCE_PAPER_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_PAPER), TALL_MACAW_JUNGLE_PAPER_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_PAPER), TALL_MACAW_ACACIA_PAPER_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_PAPER), TALL_MACAW_DARK_OAK_PAPER_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_PAPER), TALL_MACAW_MANGROVE_PAPER_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_PAPER), TALL_MACAW_CRIMSON_PAPER_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_PAPER), TALL_MACAW_WARPED_PAPER_DOOR);

        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BEACH), TALL_MACAW_OAK_BEACH_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BEACH), TALL_MACAW_SPRUCE_BEACH_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BEACH), TALL_MACAW_BIRCH_BEACH_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BEACH), TALL_MACAW_ACACIA_BEACH_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BEACH), TALL_MACAW_DARK_OAK_BEACH_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BEACH), TALL_MACAW_MANGROVE_BEACH_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_BEACH), TALL_MACAW_CRIMSON_BEACH_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_BEACH), TALL_MACAW_WARPED_BEACH_DOOR);

        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_TROPICAL), TALL_MACAW_OAK_TROPICAL_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_TROPICAL), TALL_MACAW_SPRUCE_TROPICAL_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_TROPICAL), TALL_MACAW_BIRCH_TROPICAL_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_TROPICAL), TALL_MACAW_JUNGLE_TROPICAL_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_TROPICAL), TALL_MACAW_DARK_OAK_TROPICAL_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_TROPICAL), TALL_MACAW_MANGROVE_TROPICAL_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_TROPICAL), TALL_MACAW_CRIMSON_TROPICAL_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_TROPICAL), TALL_MACAW_WARPED_TROPICAL_DOOR);

        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_FOUR_PANEL), TALL_MACAW_OAK_FOUR_PANEL_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_FOUR_PANEL), TALL_MACAW_SPRUCE_FOUR_PANEL_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_FOUR_PANEL), TALL_MACAW_BIRCH_FOUR_PANEL_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_FOUR_PANEL), TALL_MACAW_JUNGLE_FOUR_PANEL_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_FOUR_PANEL), TALL_MACAW_ACACIA_FOUR_PANEL_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_FOUR_PANEL), TALL_MACAW_MANGROVE_FOUR_PANEL_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_FOUR_PANEL), TALL_MACAW_CRIMSON_FOUR_PANEL_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_FOUR_PANEL), TALL_MACAW_WARPED_FOUR_PANEL_DOOR);

        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_SWAMP), TALL_MACAW_OAK_SWAMP_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_SWAMP), TALL_MACAW_SPRUCE_SWAMP_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_SWAMP), TALL_MACAW_BIRCH_SWAMP_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_SWAMP), TALL_MACAW_JUNGLE_SWAMP_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_SWAMP), TALL_MACAW_ACACIA_SWAMP_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_SWAMP), TALL_MACAW_DARK_OAK_SWAMP_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_SWAMP), TALL_MACAW_CRIMSON_SWAMP_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_SWAMP), TALL_MACAW_WARPED_SWAMP_DOOR);

        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_NETHER), TALL_MACAW_OAK_NETHER_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_NETHER), TALL_MACAW_SPRUCE_NETHER_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_NETHER), TALL_MACAW_BIRCH_NETHER_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_NETHER), TALL_MACAW_JUNGLE_NETHER_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_NETHER), TALL_MACAW_ACACIA_NETHER_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_NETHER), TALL_MACAW_DARK_OAK_NETHER_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_NETHER), TALL_MACAW_MANGROVE_NETHER_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_NETHER), TALL_MACAW_WARPED_NETHER_DOOR);

        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_MYSTIC), TALL_MACAW_OAK_MYSTIC_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_MYSTIC), TALL_MACAW_SPRUCE_MYSTIC_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_MYSTIC), TALL_MACAW_BIRCH_MYSTIC_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_MYSTIC), TALL_MACAW_JUNGLE_MYSTIC_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_MYSTIC), TALL_MACAW_ACACIA_MYSTIC_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_MYSTIC), TALL_MACAW_DARK_OAK_MYSTIC_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_MYSTIC), TALL_MACAW_MANGROVE_MYSTIC_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_MYSTIC), TALL_MACAW_CRIMSON_MYSTIC_DOOR);
    }
    
    public static Block getBlockFromResourceLocation(Identifier resource) {
    	return getBlockFromResourceLocation(resource, Blocks.OAK_DOOR);
    }
    
    public static Block getBlockFromResourceLocation(Identifier resource, Block fallback) {
    	return Registry.BLOCK.getOrEmpty(resource).orElse(fallback);
    }
}