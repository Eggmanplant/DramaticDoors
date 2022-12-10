package com.fizzware.dramaticdoors.crafting;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nullable;

import com.fizzware.dramaticdoors.DDNames;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.Identifier;

public class DDRecipeCompats
{
	// The list of recipes that will be filled out.
	public static List<JsonObject> RECIPES = new ArrayList<JsonObject>();
	
	public static void initializeRecipes() {
		if (FabricLoader.getInstance().isModLoaded("abundance")) {
			createTallDoorRecipeJson(DDNames.TALL_JACARANDA, new Identifier("abundance", "jacaranda_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_REDBUD, new Identifier("abundance", "redbud_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("bayou_blues")) {
			createTallDoorRecipeJson(DDNames.TALL_CYPRESS, new Identifier("bayou_blues", "cypress_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("enhanced_mushrooms")) {
			createTallDoorRecipeJson(DDNames.TALL_BROWN_MUSHROOM, new Identifier("enhanced_mushrooms", "brown_mushroom_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_RED_MUSHROOM, new Identifier("enhanced_mushrooms", "red_mushroom_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("ad_astra")) {
			createTallDoorRecipeJson(DDNames.TALL_AERONOS, new Identifier("ad_astra", "aeronos_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_GLACIAN, new Identifier("ad_astra", "glacian_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_STROPHAR, new Identifier("ad_astra", "strophar_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_STEEL, new Identifier("ad_astra", "steel_door"), "tall_metal_door");
		}
		if (FabricLoader.getInstance().isModLoaded("architects_palette")) {
			createTallDoorRecipeJson(DDNames.TALL_TWISTED, new Identifier("architects_palette", "twisted_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("betterend")) {
			createTallDoorRecipeJson(DDNames.TALL_TERMINITE, new Identifier("betterend", "terminite_door"), "tall_metal_door");
			createTallDoorRecipeJson(DDNames.TALL_THALLASIUM, new Identifier("betterend", "thallasium_door"), "tall_metal_door");
			createTallDoorRecipeJson(DDNames.TALL_DRAGON_TREE, new Identifier("betterend", "dragon_tree_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_END_LOTUS, new Identifier("betterend", "end_lotus_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_HELIX_TREE, new Identifier("betterend", "helix_tree_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_JELLYSHROOM, new Identifier("betterend", "jellyshroom_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_LACUGROVE, new Identifier("betterend", "lacugrove_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_LUCERNIA, new Identifier("betterend", "lucernia_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_MOSSY_GLOWSHROOM, new Identifier("betterend", "mossy_glowshroom_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_PYTHADENDRON, new Identifier("betterend", "pythadendron_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_TENANEA, new Identifier("betterend", "tenanea_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_UMBRELLA_TREE, new Identifier("betterend", "umbrella_tree_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("betternether")) {
			createTallDoorRecipeJson(DDNames.TALL_ANCHOR_TREE, new Identifier("betternether", "anchor_tree_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BONE_CIN, new Identifier("betternether", "bone_cincinnasite_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BONE_REED, new Identifier("betternether", "bone_reed_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_MUSHROOM_FIR, new Identifier("betternether", "mushroom_fir_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_NETHER_MUSHROOM, new Identifier("betternether", "nether_mushroom_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_NETHER_REED, new Identifier("betternether", "nether_reed_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_NETHER_SAKURA, new Identifier("betternether", "nether_sakura_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_RUBEUS, new Identifier("betternether", "rubeus_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_STALAGNATE, new Identifier("betternether", "stalagnate_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_WART, new Identifier("betternether", "wart_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BN_WILLOW, new Identifier("betternether", "willow_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("bewitchment")) {
			createTallDoorRecipeJson(DDNames.TALL_BW_CYPRESS, new Identifier("bewitchment", "cypress_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_DRAGONS_BLOOD, new Identifier("bewitchment", "dragons_blood_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_ELDER, new Identifier("bewitchment", "elder_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_JUNIPER, new Identifier("bewitchment", "juniper_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("biomemakeover")) {
			createTallDoorRecipeJson(DDNames.TALL_ANCIENT_OAK, new Identifier("biomemakeover", "ancient_oak_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BLIGHTED_BALSA, new Identifier("biomemakeover", "blighted_balsa_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_SWAMP_CYPRESS, new Identifier("biomemakeover", "swamp_cypress_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_WILLOW, new Identifier("biomemakeover", "willow_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("byg")) {
			createTallDoorRecipeJson(DDNames.TALL_BYG_ASPEN, new Identifier("byg", "aspen_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_BAOBAB, new Identifier("byg", "baobab_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_BLUE_ENCHANTED, new Identifier("byg", "blue_enchanted_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_BULBIS, new Identifier("byg", "bulbis_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_CHERRY, new Identifier("byg", "cherry_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_CIKA, new Identifier("byg", "cika_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_CYPRESS, new Identifier("byg", "cypress_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_EBONY, new Identifier("byg", "ebony_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_EMBUR, new Identifier("byg", "embur_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_ETHER, new Identifier("byg", "ether_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_FIR, new Identifier("byg", "fir_door"), "tall_byg_wooden_door");
			//createTallDoorRecipeJson(DDNames.TALL_BYG_FLORUS, new Identifier("byg", "florus_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_GREEN_ENCHANTED, new Identifier("byg", "green_enchanted_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_HOLLY, new Identifier("byg", "holly_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_IMPARIUS, new Identifier("byg", "imparius_door"), "tall_byg_wooden_door");
			//createTallDoorRecipeJson(DDNames.TALL_BYG_IRONWOOD, new Identifier("byg", "ironwood_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_JACARANDA, new Identifier("byg", "jacaranda_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_LAMENT, new Identifier("byg", "lament_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_MAHOGANY, new Identifier("byg", "mahogany_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_MAPLE, new Identifier("byg", "maple_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_NIGHTSHADE, new Identifier("byg", "nightshade_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_PALM, new Identifier("byg", "palm_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_PINE, new Identifier("byg", "pine_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_RAINBOW_EUCALYPTUS, new Identifier("byg", "rainbow_eucalyptus_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_REDWOOD, new Identifier("byg", "redwood_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_SKYRIS, new Identifier("byg", "skyris_door"), "tall_byg_wooden_door");
			//createTallDoorRecipeJson(DDNames.TALL_BYG_SOUL_SHROOM, new Identifier("byg", "soul_shroom_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_SYTHIAN, new Identifier("byg", "sythian_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_WHITE_MANGROVE, new Identifier("byg", "mangrove_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_WILLOW, new Identifier("byg", "willow_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_WITCH_HAZEL, new Identifier("byg", "witch_hazel_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_ZELKOVA, new Identifier("byg", "zelkova_door"), "tall_byg_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("blockus")) {
			createTallDoorRecipeJson(DDNames.TALL_BLOCKUS_BAMBOO, new Identifier("blockus", "bamboo_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BLOCKUS_BLACKSTONE, new Identifier("blockus", "blackstone_door"), "tall_stone_door");
			createTallDoorRecipeJson(DDNames.TALL_BLOCKUS_CHARRED, new Identifier("blockus", "charred_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BLOCKUS_OBSIDIAN_REINFORCED, new Identifier("blockus", "obsidian_reinforced_door"), "tall_misc_door");
			createTallDoorRecipeJson(DDNames.TALL_BLOCKUS_PAPER, new Identifier("blockus", "paper_door"), "tall_misc_door");
			createTallDoorRecipeJson(DDNames.TALL_BLOCKUS_STONE, new Identifier("blockus", "stone_door"), "tall_stone_door");
			createTallDoorRecipeJson(DDNames.TALL_BLOCKUS_WHITE_OAK, new Identifier("blockus", "white_oak_door"), "tall_wooden_door");
			
		}
		if (FabricLoader.getInstance().isModLoaded("ceilands")) {
			createTallDoorRecipeJson(DDNames.TALL_CEILTRUNK, new Identifier("ceilands", "ceiltrunk_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_LUZAWOOD, new Identifier("ceilands", "luzawood_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("charm")) {
			createTallDoorRecipeJson(DDNames.TALL_CHARM_AZALEA, new Identifier("charm", "azalea_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_CHARM_EBONY, new Identifier("charm", "ebony_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("createdeco")) {
			createTallDoorRecipeJson(DDNames.TALL_ANDESITE, new Identifier("createdeco", "andesite_door"), "tall_metal_door");
			createTallDoorRecipeJson(DDNames.TALL_BRASS, new Identifier("createdeco", "brass_door"), "tall_metal_door");
			createTallDoorRecipeJson(DDNames.TALL_COPPER, new Identifier("createdeco", "copper_door"), "tall_metal_door");
			createTallDoorRecipeJson(DDNames.TALL_ZINC, new Identifier("createdeco", "zinc_door"), "tall_metal_door");
			createTallDoorRecipeJson(DDNames.TALL_LOCKED_ANDESITE, new Identifier("createdeco", "locked_andesite_door"), "tall_metal_door");
			createTallDoorRecipeJson(DDNames.TALL_LOCKED_BRASS, new Identifier("createdeco", "locked_brass_door"), "tall_metal_door");
			createTallDoorRecipeJson(DDNames.TALL_LOCKED_COPPER, new Identifier("createdeco", "locked_copper_door"), "tall_metal_door");
			createTallDoorRecipeJson(DDNames.TALL_LOCKED_ZINC, new Identifier("createdeco", "locked_zinc_door"), "tall_metal_door");
		}
		if (FabricLoader.getInstance().isModLoaded("ecologics")) {
			createTallDoorRecipeJson(DDNames.TALL_ECO_AZALEA, new Identifier("ecologics", "azalea_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_ECO_FLOWERING_AZALEA, new Identifier("ecologics", "flowering_azalea_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_ECO_COCONUT, new Identifier("ecologics", "coconut_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_ECO_WALNUT, new Identifier("ecologics", "walnut_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("glassdoor")) {
			createTallDoorRecipeJson(DDNames.TALL_IRON_GLASS, new Identifier("glassdoor", "iron_glassdoor"), "tall_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_OAK_GLASS, new Identifier("glassdoor", "oak_glassdoor"), "tall_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_SPRUCE_GLASS, new Identifier("glassdoor", "spruce_glassdoor"), "tall_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_BIRCH_GLASS, new Identifier("glassdoor", "birch_glassdoor"), "tall_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_JUNGLE_GLASS, new Identifier("glassdoor", "jungle_glassdoor"), "tall_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_ACACIA_GLASS, new Identifier("glassdoor", "acacia_glassdoor"), "tall_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_DARK_OAK_GLASS, new Identifier("glassdoor", "dark_oak_glassdoor"), "tall_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_CRIMSON_GLASS, new Identifier("glassdoor", "crimson_glassdoor"), "tall_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_WARPED_GLASS, new Identifier("glassdoor", "warped_glassdoor"), "tall_glass_door");
		}
		if (FabricLoader.getInstance().isModLoaded("promenade")) {
			createTallDoorRecipeJson(DDNames.TALL_PROMENADE_CHERRY_OAK, new Identifier("promenade", "cherry_oak_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_PROMENADE_DARK_AMARANTH, new Identifier("promenade", "dark_amaranth_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_PROMENADE_PALM, new Identifier("promenade", "palm_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("snowyspirit")) {
			createTallDoorRecipeJson(DDNames.TALL_GINGERBREAD, new Identifier("snowyspirit", "gingerbread_door"), "tall_wooden_door");	
		}
		if (FabricLoader.getInstance().isModLoaded("supplementaries")) {
			createTallDoorRecipeJson(DDNames.TALL_GOLD, new Identifier("supplementaries", "gold_door"), "tall_metal_door");
			createTallDoorRecipeJson(DDNames.TALL_NETHERITE, new Identifier("supplementaries", "netherite_door"), "tall_metal_door");			
		}
		if (FabricLoader.getInstance().isModLoaded("tconstruct")) {
			createTallDoorRecipeJson(DDNames.TALL_BLOODSHROOM, new Identifier("tconstruct", "bloodshroom_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_GREENHEART, new Identifier("tconstruct", "greenheart_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_SKYROOT, new Identifier("tconstruct", "skyroot_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("techreborn")) {
			createTallDoorRecipeJson(DDNames.TALL_RUBBER, new Identifier("techreborn", "rubber_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("traverse")) {
			createTallDoorRecipeJson(DDNames.TALL_TRAVERSE_FIR, new Identifier("traverse", "fir_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("twigs")) {
			createTallDoorRecipeJson(DDNames.TALL_STRIPPED_BAMBOO, new Identifier("twigs", "stripped_bamboo_door"), "tall_wooden_door");			
		}
		if (FabricLoader.getInstance().isModLoaded("twilightforest")) {
			createTallDoorRecipeJson(DDNames.TALL_CANOPY, new Identifier("twilightforest", "canopy_door"), "tall_tf_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_DARKWOOD, new Identifier("twilightforest", "dark_door"), "tall_tf_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_TWILIGHT_MANGROVE, new Identifier("twilightforest", "mangrove_door"), "tall_tf_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_MINEWOOD, new Identifier("twilightforest", "mining_door"), "tall_tf_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_SORTINGWOOD, new Identifier("twilightforest", "sorting_door"), "tall_tf_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_TIMEWOOD, new Identifier("twilightforest", "time_door"), "tall_tf_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_TRANSWOOD, new Identifier("twilightforest", "transformation_door"), "tall_tf_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_TWILIGHT_OAK, new Identifier("twilightforest", "twilight_oak_door"), "tall_tf_wooden_door");			
		}
		if (FabricLoader.getInstance().isModLoaded("wildbackport")) {
			createTallDoorRecipeJson(DDNames.TALL_MANGROVE, new Identifier("wildbackport", "mangrove_door"), "tall_wooden_door");			
		}
		if (FabricLoader.getInstance().isModLoaded("xps_additions")) {
			createTallDoorRecipeJson(DDNames.TALL_SOUL_COPPER, new Identifier("xps_additions", "soul_copper_door"), "tall_metal_door");			
		}
		if (FabricLoader.getInstance().isModLoaded("chipped")) {
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_OAK_01, new Identifier("chipped", "oak_door_1"), "tall_chipped_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_OAK_02, new Identifier("chipped", "oak_door_2"), "tall_chipped_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_OAK_03, new Identifier("chipped", "oak_door_3"), "tall_chipped_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_OAK_04, new Identifier("chipped", "oak_door_4"), "tall_chipped_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_OAK_05, new Identifier("chipped", "oak_door_5"), "tall_chipped_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_OAK_06, new Identifier("chipped", "oak_door_6"), "tall_chipped_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_OAK_07, new Identifier("chipped", "oak_door_7"), "tall_chipped_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_OAK_08, new Identifier("chipped", "oak_door_8"), "tall_chipped_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_OAK_09, new Identifier("chipped", "oak_door_9"), "tall_chipped_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_OAK_10, new Identifier("chipped", "oak_door_10"), "tall_chipped_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_OAK_11, new Identifier("chipped", "oak_door_11"), "tall_chipped_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_OAK_12, new Identifier("chipped", "oak_door_12"), "tall_chipped_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_OAK_13, new Identifier("chipped", "oak_door_13"), "tall_chipped_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_OAK_14, new Identifier("chipped", "oak_door_14"), "tall_chipped_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_OAK_15, new Identifier("chipped", "oak_door_15"), "tall_chipped_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_OAK_16, new Identifier("chipped", "oak_door_16"), "tall_chipped_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_OAK_17, new Identifier("chipped", "oak_door_17"), "tall_chipped_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_OAK_18, new Identifier("chipped", "oak_door_18"), "tall_chipped_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_OAK_19, new Identifier("chipped", "oak_door_19"), "tall_chipped_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_OAK_20, new Identifier("chipped", "oak_door_20"), "tall_chipped_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_SPRUCE_01, new Identifier("chipped", "spruce_door_1"), "tall_chipped_spruce_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_SPRUCE_02, new Identifier("chipped", "spruce_door_2"), "tall_chipped_spruce_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_SPRUCE_03, new Identifier("chipped", "spruce_door_3"), "tall_chipped_spruce_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_SPRUCE_04, new Identifier("chipped", "spruce_door_4"), "tall_chipped_spruce_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_SPRUCE_05, new Identifier("chipped", "spruce_door_5"), "tall_chipped_spruce_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_SPRUCE_06, new Identifier("chipped", "spruce_door_6"), "tall_chipped_spruce_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_SPRUCE_07, new Identifier("chipped", "spruce_door_7"), "tall_chipped_spruce_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_SPRUCE_08, new Identifier("chipped", "spruce_door_8"), "tall_chipped_spruce_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_SPRUCE_09, new Identifier("chipped", "spruce_door_9"), "tall_chipped_spruce_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_SPRUCE_10, new Identifier("chipped", "spruce_door_10"), "tall_chipped_spruce_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_SPRUCE_11, new Identifier("chipped", "spruce_door_11"), "tall_chipped_spruce_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_SPRUCE_12, new Identifier("chipped", "spruce_door_12"), "tall_chipped_spruce_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_SPRUCE_13, new Identifier("chipped", "spruce_door_13"), "tall_chipped_spruce_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_SPRUCE_14, new Identifier("chipped", "spruce_door_14"), "tall_chipped_spruce_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_SPRUCE_15, new Identifier("chipped", "spruce_door_15"), "tall_chipped_spruce_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_SPRUCE_16, new Identifier("chipped", "spruce_door_16"), "tall_chipped_spruce_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_SPRUCE_17, new Identifier("chipped", "spruce_door_17"), "tall_chipped_spruce_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_SPRUCE_18, new Identifier("chipped", "spruce_door_18"), "tall_chipped_spruce_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_SPRUCE_19, new Identifier("chipped", "spruce_door_19"), "tall_chipped_spruce_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_SPRUCE_20, new Identifier("chipped", "spruce_door_20"), "tall_chipped_spruce_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_BIRCH_01, new Identifier("chipped", "birch_door_1"), "tall_chipped_birch_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_BIRCH_02, new Identifier("chipped", "birch_door_2"), "tall_chipped_birch_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_BIRCH_03, new Identifier("chipped", "birch_door_3"), "tall_chipped_birch_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_BIRCH_04, new Identifier("chipped", "birch_door_4"), "tall_chipped_birch_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_BIRCH_05, new Identifier("chipped", "birch_door_5"), "tall_chipped_birch_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_BIRCH_06, new Identifier("chipped", "birch_door_6"), "tall_chipped_birch_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_BIRCH_07, new Identifier("chipped", "birch_door_7"), "tall_chipped_birch_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_BIRCH_08, new Identifier("chipped", "birch_door_8"), "tall_chipped_birch_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_BIRCH_09, new Identifier("chipped", "birch_door_9"), "tall_chipped_birch_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_BIRCH_10, new Identifier("chipped", "birch_door_10"), "tall_chipped_birch_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_BIRCH_11, new Identifier("chipped", "birch_door_11"), "tall_chipped_birch_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_BIRCH_12, new Identifier("chipped", "birch_door_12"), "tall_chipped_birch_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_BIRCH_13, new Identifier("chipped", "birch_door_13"), "tall_chipped_birch_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_BIRCH_14, new Identifier("chipped", "birch_door_14"), "tall_chipped_birch_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_BIRCH_15, new Identifier("chipped", "birch_door_15"), "tall_chipped_birch_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_BIRCH_16, new Identifier("chipped", "birch_door_16"), "tall_chipped_birch_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_BIRCH_17, new Identifier("chipped", "birch_door_17"), "tall_chipped_birch_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_BIRCH_18, new Identifier("chipped", "birch_door_18"), "tall_chipped_birch_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_BIRCH_19, new Identifier("chipped", "birch_door_19"), "tall_chipped_birch_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_BIRCH_20, new Identifier("chipped", "birch_door_20"), "tall_chipped_birch_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_JUNGLE_01, new Identifier("chipped", "jungle_door_1"), "tall_chipped_jungle_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_JUNGLE_02, new Identifier("chipped", "jungle_door_2"), "tall_chipped_jungle_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_JUNGLE_03, new Identifier("chipped", "jungle_door_3"), "tall_chipped_jungle_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_JUNGLE_04, new Identifier("chipped", "jungle_door_4"), "tall_chipped_jungle_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_JUNGLE_05, new Identifier("chipped", "jungle_door_5"), "tall_chipped_jungle_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_JUNGLE_06, new Identifier("chipped", "jungle_door_6"), "tall_chipped_jungle_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_JUNGLE_07, new Identifier("chipped", "jungle_door_7"), "tall_chipped_jungle_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_JUNGLE_08, new Identifier("chipped", "jungle_door_8"), "tall_chipped_jungle_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_JUNGLE_09, new Identifier("chipped", "jungle_door_9"), "tall_chipped_jungle_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_JUNGLE_10, new Identifier("chipped", "jungle_door_10"), "tall_chipped_jungle_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_JUNGLE_11, new Identifier("chipped", "jungle_door_11"), "tall_chipped_jungle_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_JUNGLE_12, new Identifier("chipped", "jungle_door_12"), "tall_chipped_jungle_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_JUNGLE_13, new Identifier("chipped", "jungle_door_13"), "tall_chipped_jungle_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_JUNGLE_14, new Identifier("chipped", "jungle_door_14"), "tall_chipped_jungle_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_JUNGLE_15, new Identifier("chipped", "jungle_door_15"), "tall_chipped_jungle_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_JUNGLE_16, new Identifier("chipped", "jungle_door_16"), "tall_chipped_jungle_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_JUNGLE_17, new Identifier("chipped", "jungle_door_17"), "tall_chipped_jungle_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_JUNGLE_18, new Identifier("chipped", "jungle_door_18"), "tall_chipped_jungle_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_JUNGLE_19, new Identifier("chipped", "jungle_door_19"), "tall_chipped_jungle_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_JUNGLE_20, new Identifier("chipped", "jungle_door_20"), "tall_chipped_jungle_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_ACACIA_01, new Identifier("chipped", "acacia_door_1"), "tall_chipped_acacia_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_ACACIA_02, new Identifier("chipped", "acacia_door_2"), "tall_chipped_acacia_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_ACACIA_03, new Identifier("chipped", "acacia_door_3"), "tall_chipped_acacia_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_ACACIA_04, new Identifier("chipped", "acacia_door_4"), "tall_chipped_acacia_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_ACACIA_05, new Identifier("chipped", "acacia_door_5"), "tall_chipped_acacia_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_ACACIA_06, new Identifier("chipped", "acacia_door_6"), "tall_chipped_acacia_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_ACACIA_07, new Identifier("chipped", "acacia_door_7"), "tall_chipped_acacia_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_ACACIA_08, new Identifier("chipped", "acacia_door_8"), "tall_chipped_acacia_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_ACACIA_09, new Identifier("chipped", "acacia_door_9"), "tall_chipped_acacia_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_ACACIA_10, new Identifier("chipped", "acacia_door_10"), "tall_chipped_acacia_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_ACACIA_11, new Identifier("chipped", "acacia_door_11"), "tall_chipped_acacia_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_ACACIA_12, new Identifier("chipped", "acacia_door_12"), "tall_chipped_acacia_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_ACACIA_13, new Identifier("chipped", "acacia_door_13"), "tall_chipped_acacia_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_ACACIA_14, new Identifier("chipped", "acacia_door_14"), "tall_chipped_acacia_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_ACACIA_15, new Identifier("chipped", "acacia_door_15"), "tall_chipped_acacia_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_ACACIA_16, new Identifier("chipped", "acacia_door_16"), "tall_chipped_acacia_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_ACACIA_17, new Identifier("chipped", "acacia_door_17"), "tall_chipped_acacia_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_ACACIA_18, new Identifier("chipped", "acacia_door_18"), "tall_chipped_acacia_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_ACACIA_19, new Identifier("chipped", "acacia_door_19"), "tall_chipped_acacia_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_ACACIA_20, new Identifier("chipped", "acacia_door_20"), "tall_chipped_acacia_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_DARK_OAK_01, new Identifier("chipped", "dark_oak_door_1"), "tall_chipped_dark_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_DARK_OAK_02, new Identifier("chipped", "dark_oak_door_2"), "tall_chipped_dark_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_DARK_OAK_03, new Identifier("chipped", "dark_oak_door_3"), "tall_chipped_dark_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_DARK_OAK_04, new Identifier("chipped", "dark_oak_door_4"), "tall_chipped_dark_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_DARK_OAK_05, new Identifier("chipped", "dark_oak_door_5"), "tall_chipped_dark_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_DARK_OAK_06, new Identifier("chipped", "dark_oak_door_6"), "tall_chipped_dark_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_DARK_OAK_07, new Identifier("chipped", "dark_oak_door_7"), "tall_chipped_dark_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_DARK_OAK_08, new Identifier("chipped", "dark_oak_door_8"), "tall_chipped_dark_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_DARK_OAK_09, new Identifier("chipped", "dark_oak_door_9"), "tall_chipped_dark_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_DARK_OAK_10, new Identifier("chipped", "dark_oak_door_10"), "tall_chipped_dark_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_DARK_OAK_11, new Identifier("chipped", "dark_oak_door_11"), "tall_chipped_dark_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_DARK_OAK_12, new Identifier("chipped", "dark_oak_door_12"), "tall_chipped_dark_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_DARK_OAK_13, new Identifier("chipped", "dark_oak_door_13"), "tall_chipped_dark_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_DARK_OAK_14, new Identifier("chipped", "dark_oak_door_14"), "tall_chipped_dark_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_DARK_OAK_15, new Identifier("chipped", "dark_oak_door_15"), "tall_chipped_dark_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_DARK_OAK_16, new Identifier("chipped", "dark_oak_door_16"), "tall_chipped_dark_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_DARK_OAK_17, new Identifier("chipped", "dark_oak_door_17"), "tall_chipped_dark_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_DARK_OAK_18, new Identifier("chipped", "dark_oak_door_18"), "tall_chipped_dark_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_DARK_OAK_19, new Identifier("chipped", "dark_oak_door_19"), "tall_chipped_dark_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_DARK_OAK_20, new Identifier("chipped", "dark_oak_door_20"), "tall_chipped_dark_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_CRIMSON_01, new Identifier("chipped", "crimson_door_1"), "tall_chipped_crimson_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_CRIMSON_02, new Identifier("chipped", "crimson_door_2"), "tall_chipped_crimson_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_CRIMSON_03, new Identifier("chipped", "crimson_door_3"), "tall_chipped_crimson_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_CRIMSON_04, new Identifier("chipped", "crimson_door_4"), "tall_chipped_crimson_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_CRIMSON_05, new Identifier("chipped", "crimson_door_5"), "tall_chipped_crimson_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_CRIMSON_06, new Identifier("chipped", "crimson_door_6"), "tall_chipped_crimson_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_CRIMSON_07, new Identifier("chipped", "crimson_door_7"), "tall_chipped_crimson_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_CRIMSON_08, new Identifier("chipped", "crimson_door_8"), "tall_chipped_crimson_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_CRIMSON_09, new Identifier("chipped", "crimson_door_9"), "tall_chipped_crimson_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_CRIMSON_10, new Identifier("chipped", "crimson_door_10"), "tall_chipped_crimson_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_CRIMSON_11, new Identifier("chipped", "crimson_door_11"), "tall_chipped_crimson_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_CRIMSON_12, new Identifier("chipped", "crimson_door_12"), "tall_chipped_crimson_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_CRIMSON_13, new Identifier("chipped", "crimson_door_13"), "tall_chipped_crimson_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_CRIMSON_14, new Identifier("chipped", "crimson_door_14"), "tall_chipped_crimson_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_CRIMSON_15, new Identifier("chipped", "crimson_door_15"), "tall_chipped_crimson_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_CRIMSON_16, new Identifier("chipped", "crimson_door_16"), "tall_chipped_crimson_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_CRIMSON_17, new Identifier("chipped", "crimson_door_17"), "tall_chipped_crimson_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_CRIMSON_18, new Identifier("chipped", "crimson_door_18"), "tall_chipped_crimson_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_CRIMSON_19, new Identifier("chipped", "crimson_door_19"), "tall_chipped_crimson_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_CRIMSON_20, new Identifier("chipped", "crimson_door_20"), "tall_chipped_crimson_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_WARPED_01, new Identifier("chipped", "warped_door_1"), "tall_chipped_warped_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_WARPED_02, new Identifier("chipped", "warped_door_2"), "tall_chipped_warped_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_WARPED_03, new Identifier("chipped", "warped_door_3"), "tall_chipped_warped_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_WARPED_04, new Identifier("chipped", "warped_door_4"), "tall_chipped_warped_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_WARPED_05, new Identifier("chipped", "warped_door_5"), "tall_chipped_warped_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_WARPED_06, new Identifier("chipped", "warped_door_6"), "tall_chipped_warped_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_WARPED_07, new Identifier("chipped", "warped_door_7"), "tall_chipped_warped_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_WARPED_08, new Identifier("chipped", "warped_door_8"), "tall_chipped_warped_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_WARPED_09, new Identifier("chipped", "warped_door_9"), "tall_chipped_warped_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_WARPED_10, new Identifier("chipped", "warped_door_10"), "tall_chipped_warped_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_WARPED_11, new Identifier("chipped", "warped_door_11"), "tall_chipped_warped_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_WARPED_12, new Identifier("chipped", "warped_door_12"), "tall_chipped_warped_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_WARPED_13, new Identifier("chipped", "warped_door_13"), "tall_chipped_warped_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_WARPED_14, new Identifier("chipped", "warped_door_14"), "tall_chipped_warped_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_WARPED_15, new Identifier("chipped", "warped_door_15"), "tall_chipped_warped_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_WARPED_16, new Identifier("chipped", "warped_door_16"), "tall_chipped_warped_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_WARPED_17, new Identifier("chipped", "warped_door_17"), "tall_chipped_warped_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_WARPED_18, new Identifier("chipped", "warped_door_18"), "tall_chipped_warped_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_WARPED_19, new Identifier("chipped", "warped_door_19"), "tall_chipped_warped_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_WARPED_20, new Identifier("chipped", "warped_door_20"), "tall_chipped_warped_door");
		}
		if (FabricLoader.getInstance().isModLoaded("mcwdoors")) {
			createTallDoorRecipeJson(DDNames.TALL_MACAW_JAIL, new Identifier("mcwdoors", "jail_door"), "tall_macaw_metal_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_METAL, new Identifier("mcwdoors", "metal_door"), "tall_macaw_metal_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_METAL_HOSPITAL, new Identifier("mcwdoors", "metal_hospital_door"), "tall_macaw_metal_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_METAL_REINFORCED, new Identifier("mcwdoors", "metal_reinforced_door"), "tall_macaw_metal_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_METAL_WARNING, new Identifier("mcwdoors", "metal_warning_door"), "tall_macaw_metal_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_METAL_WINDOWED, new Identifier("mcwdoors", "metal_windowed_door"), "tall_macaw_metal_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_BARN, new Identifier("mcwdoors", "oak_barn_door"), "tall_macaw_barn_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_BARN, new Identifier("mcwdoors", "spruce_barn_door"), "tall_macaw_barn_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_BARN, new Identifier("mcwdoors", "birch_barn_door"), "tall_macaw_barn_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_BARN, new Identifier("mcwdoors", "jungle_barn_door"), "tall_macaw_barn_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_BARN, new Identifier("mcwdoors", "acacia_barn_door"), "tall_macaw_barn_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_BARN, new Identifier("mcwdoors", "dark_oak_barn_door"), "tall_macaw_barn_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_BARN, new Identifier("mcwdoors", "crimson_barn_door"), "tall_macaw_barn_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_BARN, new Identifier("mcwdoors", "warped_barn_door"), "tall_macaw_barn_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_BARN_GLASS, new Identifier("mcwdoors", "oak_barn_glass_door"), "tall_macaw_barn_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_BARN_GLASS, new Identifier("mcwdoors", "spruce_barn_glass_door"), "tall_macaw_barn_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_BARN_GLASS, new Identifier("mcwdoors", "birch_barn_glass_door"), "tall_macaw_barn_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_BARN_GLASS, new Identifier("mcwdoors", "jungle_barn_glass_door"), "tall_macaw_barn_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_BARN_GLASS, new Identifier("mcwdoors", "acacia_barn_glass_door"), "tall_macaw_barn_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_BARN_GLASS, new Identifier("mcwdoors", "dark_oak_barn_glass_door"), "tall_macaw_barn_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_BARN_GLASS, new Identifier("mcwdoors", "crimson_barn_glass_door"), "tall_macaw_barn_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_BARN_GLASS, new Identifier("mcwdoors", "warped_barn_glass_door"), "tall_macaw_barn_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_STABLE, new Identifier("mcwdoors", "oak_stable_door"), "tall_macaw_stable_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_STABLE, new Identifier("mcwdoors", "spruce_stable_door"), "tall_macaw_stable_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_STABLE, new Identifier("mcwdoors", "birch_stable_door"), "tall_macaw_stable_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_STABLE, new Identifier("mcwdoors", "jungle_stable_door"), "tall_macaw_stable_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_STABLE, new Identifier("mcwdoors", "acacia_stable_door"), "tall_macaw_stable_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_STABLE, new Identifier("mcwdoors", "dark_oak_stable_door"), "tall_macaw_stable_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_STABLE, new Identifier("mcwdoors", "crimson_stable_door"), "tall_macaw_stable_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_STABLE, new Identifier("mcwdoors", "warped_stable_door"), "tall_macaw_stable_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_STABLE_HEAD, new Identifier("mcwdoors", "oak_stable_head_door"), "tall_macaw_stable_head_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_STABLE_HEAD, new Identifier("mcwdoors", "spruce_stable_head_door"), "tall_macaw_stable_head_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_STABLE_HEAD, new Identifier("mcwdoors", "birch_stable_head_door"), "tall_macaw_stable_head_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_STABLE_HEAD, new Identifier("mcwdoors", "jungle_stable_head_door"), "tall_macaw_stable_head_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_STABLE_HEAD, new Identifier("mcwdoors", "acacia_stable_head_door"), "tall_macaw_stable_head_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_STABLE_HEAD, new Identifier("mcwdoors", "dark_oak_stable_head_door"), "tall_macaw_stable_head_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_STABLE_HEAD, new Identifier("mcwdoors", "crimson_stable_head_door"), "tall_macaw_stable_head_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_STABLE_HEAD, new Identifier("mcwdoors", "warped_stable_head_door"), "tall_macaw_stable_head_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_BARK_GLASS, new Identifier("mcwdoors", "oak_bark_glass_door"), "tall_macaw_bark_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_BARK_GLASS, new Identifier("mcwdoors", "spruce_bark_glass_door"), "tall_macaw_bark_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_BARK_GLASS, new Identifier("mcwdoors", "birch_bark_glass_door"), "tall_macaw_bark_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_BARK_GLASS, new Identifier("mcwdoors", "jungle_bark_glass_door"), "tall_macaw_bark_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_BARK_GLASS, new Identifier("mcwdoors", "acacia_bark_glass_door"), "tall_macaw_bark_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_BARK_GLASS, new Identifier("mcwdoors", "dark_oak_bark_glass_door"), "tall_macaw_bark_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_STEM_GLASS, new Identifier("mcwdoors", "crimson_stem_glass_door"), "tall_macaw_bark_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_STEM_GLASS, new Identifier("mcwdoors", "warped_stem_glass_door"), "tall_macaw_bark_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_GLASS, new Identifier("mcwdoors", "oak_glass_door"), "tall_macaw_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_GLASS, new Identifier("mcwdoors", "spruce_glass_door"), "tall_macaw_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_GLASS, new Identifier("mcwdoors", "birch_glass_door"), "tall_macaw_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_GLASS, new Identifier("mcwdoors", "jungle_glass_door"), "tall_macaw_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_GLASS, new Identifier("mcwdoors", "acacia_glass_door"), "tall_macaw_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_GLASS, new Identifier("mcwdoors", "dark_oak_glass_door"), "tall_macaw_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_GLASS, new Identifier("mcwdoors", "crimson_glass_door"), "tall_macaw_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_GLASS, new Identifier("mcwdoors", "warped_glass_door"), "tall_macaw_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_MODERN, new Identifier("mcwdoors", "oak_modern_door"), "tall_macaw_modern_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_MODERN, new Identifier("mcwdoors", "spruce_modern_door"), "tall_macaw_modern_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_MODERN, new Identifier("mcwdoors", "birch_modern_door"), "tall_macaw_modern_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_MODERN, new Identifier("mcwdoors", "jungle_modern_door"), "tall_macaw_modern_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_MODERN, new Identifier("mcwdoors", "acacia_modern_door"), "tall_macaw_modern_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_MODERN, new Identifier("mcwdoors", "dark_oak_modern_door"), "tall_macaw_modern_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_MODERN, new Identifier("mcwdoors", "crimson_modern_door"), "tall_macaw_modern_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_MODERN, new Identifier("mcwdoors", "warped_modern_door"), "tall_macaw_modern_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_JAPANESE, new Identifier("mcwdoors", "oak_japanese_door"), "tall_macaw_japanese_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_JAPANESE, new Identifier("mcwdoors", "spruce_japanese_door"), "tall_macaw_japanese_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_JAPANESE, new Identifier("mcwdoors", "birch_japanese_door"), "tall_macaw_japanese_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_JAPANESE, new Identifier("mcwdoors", "jungle_japanese_door"), "tall_macaw_japanese_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_JAPANESE, new Identifier("mcwdoors", "acacia_japanese_door"), "tall_macaw_japanese_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_JAPANESE, new Identifier("mcwdoors", "dark_oak_japanese_door"), "tall_macaw_japanese_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_JAPANESE, new Identifier("mcwdoors", "crimson_japanese_door"), "tall_macaw_japanese_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_JAPANESE, new Identifier("mcwdoors", "warped_japanese_door"), "tall_macaw_japanese_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_JAPANESE2, new Identifier("mcwdoors", "oak_japanese2_door"), "tall_macaw_japanese2_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_JAPANESE2, new Identifier("mcwdoors", "spruce_japanese2_door"), "tall_macaw_japanese2_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_JAPANESE2, new Identifier("mcwdoors", "birch_japanese2_door"), "tall_macaw_japanese2_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_JAPANESE2, new Identifier("mcwdoors", "jungle_japanese2_door"), "tall_macaw_japanese2_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_JAPANESE2, new Identifier("mcwdoors", "acacia_japanese2_door"), "tall_macaw_japanese2_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_JAPANESE2, new Identifier("mcwdoors", "dark_oak_japanese2_door"), "tall_macaw_japanese2_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_JAPANESE2, new Identifier("mcwdoors", "crimson_japanese2_door"), "tall_macaw_japanese2_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_JAPANESE2, new Identifier("mcwdoors", "warped_japanese2_door"), "tall_macaw_japanese2_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_CLASSIC, new Identifier("mcwdoors", "spruce_classic_door"), "tall_macaw_classic_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_CLASSIC, new Identifier("mcwdoors", "birch_classic_door"), "tall_macaw_classic_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_CLASSIC, new Identifier("mcwdoors", "jungle_classic_door"), "tall_macaw_classic_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_CLASSIC, new Identifier("mcwdoors", "acacia_classic_door"), "tall_macaw_classic_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_CLASSIC, new Identifier("mcwdoors", "dark_oak_classic_door"), "tall_macaw_classic_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_CLASSIC, new Identifier("mcwdoors", "crimson_classic_door"), "tall_macaw_classic_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_CLASSIC, new Identifier("mcwdoors", "warped_classic_door"), "tall_macaw_classic_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_COTTAGE, new Identifier("mcwdoors", "oak_cottage_door"), "tall_macaw_cottage_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_COTTAGE, new Identifier("mcwdoors", "birch_cottage_door"), "tall_macaw_cottage_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_COTTAGE, new Identifier("mcwdoors", "jungle_cottage_door"), "tall_macaw_cottage_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_COTTAGE, new Identifier("mcwdoors", "acacia_cottage_door"), "tall_macaw_cottage_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_COTTAGE, new Identifier("mcwdoors", "dark_oak_cottage_door"), "tall_macaw_cottage_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_COTTAGE, new Identifier("mcwdoors", "crimson_cottage_door"), "tall_macaw_cottage_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_COTTAGE, new Identifier("mcwdoors", "warped_cottage_door"), "tall_macaw_cottage_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_PAPER, new Identifier("mcwdoors", "oak_paper_door"), "tall_macaw_paper_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_PAPER, new Identifier("mcwdoors", "spruce_paper_door"), "tall_macaw_paper_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_PAPER, new Identifier("mcwdoors", "jungle_paper_door"), "tall_macaw_paper_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_PAPER, new Identifier("mcwdoors", "acacia_paper_door"), "tall_macaw_paper_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_PAPER, new Identifier("mcwdoors", "dark_oak_paper_door"), "tall_macaw_paper_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_PAPER, new Identifier("mcwdoors", "crimson_paper_door"), "tall_macaw_paper_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_PAPER, new Identifier("mcwdoors", "warped_paper_door"), "tall_macaw_paper_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_BEACH, new Identifier("mcwdoors", "oak_beach_door"), "tall_macaw_beach_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_BEACH, new Identifier("mcwdoors", "spruce_beach_door"), "tall_macaw_beach_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_BEACH, new Identifier("mcwdoors", "birch_beach_door"), "tall_macaw_beach_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_BEACH, new Identifier("mcwdoors", "acacia_beach_door"), "tall_macaw_beach_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_BEACH, new Identifier("mcwdoors", "dark_oak_beach_door"), "tall_macaw_beach_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_BEACH, new Identifier("mcwdoors", "crimson_beach_door"), "tall_macaw_beach_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_BEACH, new Identifier("mcwdoors", "warped_beach_door"), "tall_macaw_beach_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_TROPICAL, new Identifier("mcwdoors", "oak_tropical_door"), "tall_macaw_tropical_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_TROPICAL, new Identifier("mcwdoors", "spruce_tropical_door"), "tall_macaw_tropical_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_TROPICAL, new Identifier("mcwdoors", "birch_tropical_door"), "tall_macaw_tropical_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_TROPICAL, new Identifier("mcwdoors", "jungle_tropical_door"), "tall_macaw_tropical_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_TROPICAL, new Identifier("mcwdoors", "dark_oak_tropical_door"), "tall_macaw_tropical_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_TROPICAL, new Identifier("mcwdoors", "crimson_tropical_door"), "tall_macaw_tropical_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_TROPICAL, new Identifier("mcwdoors", "warped_tropical_door"), "tall_macaw_tropical_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_FOUR_PANEL, new Identifier("mcwdoors", "oak_four_panel_door"), "tall_macaw_four_panel_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_FOUR_PANEL, new Identifier("mcwdoors", "spruce_four_panel_door"), "tall_macaw_four_panel_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_FOUR_PANEL, new Identifier("mcwdoors", "birch_four_panel_door"), "tall_macaw_four_panel_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_FOUR_PANEL, new Identifier("mcwdoors", "jungle_four_panel_door"), "tall_macaw_four_panel_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_FOUR_PANEL, new Identifier("mcwdoors", "acacia_four_panel_door"), "tall_macaw_four_panel_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_FOUR_PANEL, new Identifier("mcwdoors", "crimson_four_panel_door"), "tall_macaw_four_panel_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_FOUR_PANEL, new Identifier("mcwdoors", "warped_four_panel_door"), "tall_macaw_four_panel_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_SWAMP, new Identifier("mcwdoors", "oak_swamp_door"), "tall_macaw_swamp_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_SWAMP, new Identifier("mcwdoors", "spruce_swamp_door"), "tall_macaw_swamp_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_SWAMP, new Identifier("mcwdoors", "birch_swamp_door"), "tall_macaw_swamp_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_SWAMP, new Identifier("mcwdoors", "jungle_swamp_door"), "tall_macaw_swamp_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_SWAMP, new Identifier("mcwdoors", "acacia_swamp_door"), "tall_macaw_swamp_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_SWAMP, new Identifier("mcwdoors", "dark_oak_swamp_door"), "tall_macaw_swamp_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_SWAMP, new Identifier("mcwdoors", "crimson_swamp_door"), "tall_macaw_swamp_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_SWAMP, new Identifier("mcwdoors", "warped_swamp_door"), "tall_macaw_swamp_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_NETHER, new Identifier("mcwdoors", "oak_nether_door"), "tall_macaw_nether_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_NETHER, new Identifier("mcwdoors", "spruce_nether_door"), "tall_macaw_nether_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_NETHER, new Identifier("mcwdoors", "birch_nether_door"), "tall_macaw_nether_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_NETHER, new Identifier("mcwdoors", "jungle_nether_door"), "tall_macaw_nether_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_NETHER, new Identifier("mcwdoors", "acacia_nether_door"), "tall_macaw_nether_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_NETHER, new Identifier("mcwdoors", "dark_oak_nether_door"), "tall_macaw_nether_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_NETHER, new Identifier("mcwdoors", "warped_nether_door"), "tall_macaw_nether_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_MYSTIC, new Identifier("mcwdoors", "oak_mystic_door"), "tall_macaw_mystic_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_MYSTIC, new Identifier("mcwdoors", "spruce_mystic_door"), "tall_macaw_mystic_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_MYSTIC, new Identifier("mcwdoors", "birch_mystic_door"), "tall_macaw_mystic_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_MYSTIC, new Identifier("mcwdoors", "jungle_mystic_door"), "tall_macaw_mystic_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_MYSTIC, new Identifier("mcwdoors", "acacia_mystic_door"), "tall_macaw_mystic_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_MYSTIC, new Identifier("mcwdoors", "dark_oak_mystic_door"), "tall_macaw_mystic_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_MYSTIC, new Identifier("mcwdoors", "crimson_mystic_door"), "tall_macaw_mystic_door");
		}
	}
	
	private static JsonObject createTallDoorRecipeJson(String recipeID, Identifier baseDoor, @Nullable String group) {
		 JsonObject json = createShapedRecipeJson(
                    Lists.newArrayList(
                        '#'
                    ), //The keys we are using for the input items/tags.
                    Lists.newArrayList(new Identifier(baseDoor.getNamespace(), baseDoor.getPath())), //The items/tags we are using as input.
                    Lists.newArrayList("item"), //Whether the input we provided is a tag or an item.
                    Lists.newArrayList(
                        "#",
                        "#",
                        "#"
                    ), //The crafting pattern.
                    new Identifier("dramaticdoors:" + recipeID), group //The crafting output
                );
		 RECIPES.add(json);
		 return json;
	}
	
    public static JsonObject createShapedRecipeJson(ArrayList<Character> keys, ArrayList<Identifier> items, ArrayList<String> type, ArrayList<String> pattern, Identifier output, @Nullable String group) {
        //Creating a new json object, where we will store our recipe.
        JsonObject json = new JsonObject();
        //The "type" of the recipe we are creating. In this case, a shaped recipe.
        json.addProperty("type", "minecraft:crafting_shaped");
        //This creates:
        //"type": "minecraft:crafting_shaped"
        if (group != null) {
        	json.addProperty("group", group);
        }
        //We create a new Json Element, and add our crafting pattern to it.
        JsonArray jsonArray = new JsonArray();
        jsonArray.add(pattern.get(0));
        jsonArray.add(pattern.get(1));
        jsonArray.add(pattern.get(2));
        //Then we add the pattern to our json object.
        json.add("pattern", jsonArray);
 
        //Next we need to define what the keys in the pattern are. For this we need different JsonObjects per key definition, and one main JsonObject that will contain all of the defined keys.
        JsonObject individualKey; //Individual key
        JsonObject keyList = new JsonObject(); //The main key object, containing all the keys
 
        for (int i = 0; i < keys.size(); ++i) {
            individualKey = new JsonObject();
            individualKey.addProperty(type.get(i), items.get(i).toString()); //This will create a key in the form "type": "input", where type is either "item" or "tag", and input is our input item.
            keyList.add(keys.get(i) + "", individualKey); //Then we add this key to the main key object.
        }
 
        json.add("key", keyList);
        //Finally, we define our result object
        JsonObject result = new JsonObject();
        result.addProperty("item", output.toString());
        result.addProperty("count", 2);
        json.add("result", result);
 
        return json;
    }
}
