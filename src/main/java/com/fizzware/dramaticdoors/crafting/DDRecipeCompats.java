package com.fizzware.dramaticdoors.crafting;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nullable;

import com.fizzware.dramaticdoors.DDNames;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.ResourceLocation;

public class DDRecipeCompats
{
	// The list of recipes that will be filled out.
	public static List<JsonObject> SHORT_DOOR_RECIPES = new ArrayList<JsonObject>();
	public static List<JsonObject> TALL_DOOR_RECIPES = new ArrayList<JsonObject>();
	
	public static void initializeRecipes() {
		if (FabricLoader.getInstance().isModLoaded("horizons")) {
			createShortDoorRecipeJson(DDNames.SHORT_CYPRESS, new ResourceLocation("horizons", "cypress_door"));
			createShortDoorRecipeJson(DDNames.SHORT_JACARANDA, new ResourceLocation("horizons", "jacaranda_door"));
			createShortDoorRecipeJson(DDNames.SHORT_REDBUD, new ResourceLocation("horizons", "redbud_door"));
			createTallDoorRecipeJson(DDNames.TALL_CYPRESS, new ResourceLocation("horizons", "cypress_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_JACARANDA, new ResourceLocation("horizons", "jacaranda_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_REDBUD, new ResourceLocation("horizons", "redbud_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("enhanced_mushrooms")) {
			createShortDoorRecipeJson(DDNames.SHORT_BROWN_MUSHROOM, new ResourceLocation("enhanced_mushrooms", "brown_mushroom_door"));
			createShortDoorRecipeJson(DDNames.SHORT_RED_MUSHROOM, new ResourceLocation("enhanced_mushrooms", "red_mushroom_door"));
			createTallDoorRecipeJson(DDNames.TALL_BROWN_MUSHROOM, new ResourceLocation("enhanced_mushrooms", "brown_mushroom_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_RED_MUSHROOM, new ResourceLocation("enhanced_mushrooms", "red_mushroom_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("ad_astra")) {
			createShortDoorRecipeJson(DDNames.SHORT_AERONOS, new ResourceLocation("ad_astra", "aeronos_door"));
			createShortDoorRecipeJson(DDNames.SHORT_GLACIAN, new ResourceLocation("ad_astra", "glacian_door"));
			createShortDoorRecipeJson(DDNames.SHORT_STROPHAR, new ResourceLocation("ad_astra", "strophar_door"));
			createShortDoorRecipeJson(DDNames.SHORT_STEEL, new ResourceLocation("ad_astra", "steel_door"));
			createTallDoorRecipeJson(DDNames.TALL_AERONOS, new ResourceLocation("ad_astra", "aeronos_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_GLACIAN, new ResourceLocation("ad_astra", "glacian_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_STROPHAR, new ResourceLocation("ad_astra", "strophar_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_STEEL, new ResourceLocation("ad_astra", "steel_door"), "tall_metal_door");
		}
		if (FabricLoader.getInstance().isModLoaded("aether")) {
			createShortDoorRecipeJson(DDNames.SHORT_AETHER_SKYROOT, new ResourceLocation("aether", "skyroot_door"));
			createTallDoorRecipeJson(DDNames.TALL_AETHER_SKYROOT, new ResourceLocation("aether", "skyroot_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("architects_palette")) {
			createShortDoorRecipeJson(DDNames.SHORT_TWISTED, new ResourceLocation("architects_palette", "twisted_door"));
			createTallDoorRecipeJson(DDNames.TALL_TWISTED, new ResourceLocation("architects_palette", "twisted_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("bambooeverything")) {
			createShortDoorRecipeJson(DDNames.SHORT_BE_BAMBOO, new ResourceLocation("bambooeverything", "bamboo_door"));
			createShortDoorRecipeJson(DDNames.SHORT_BE_DRY_BAMBOO, new ResourceLocation("bambooeverything", "dry_bamboo_door"));
			createTallDoorRecipeJson(DDNames.TALL_BE_BAMBOO, new ResourceLocation("bambooeverything", "bamboo_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BE_DRY_BAMBOO, new ResourceLocation("bambooeverything", "dry_bamboo_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("betterend")) {
			createShortDoorRecipeJson(DDNames.TALL_TERMINITE, new ResourceLocation("betterend", "terminite_door"));
			createShortDoorRecipeJson(DDNames.TALL_THALLASIUM, new ResourceLocation("betterend", "thallasium_door"));
			createShortDoorRecipeJson(DDNames.TALL_DRAGON_TREE, new ResourceLocation("betterend", "dragon_tree_door"));
			createShortDoorRecipeJson(DDNames.TALL_END_LOTUS, new ResourceLocation("betterend", "end_lotus_door"));
			createShortDoorRecipeJson(DDNames.TALL_HELIX_TREE, new ResourceLocation("betterend", "helix_tree_door"));
			createShortDoorRecipeJson(DDNames.TALL_JELLYSHROOM, new ResourceLocation("betterend", "jellyshroom_door"));
			createShortDoorRecipeJson(DDNames.TALL_LACUGROVE, new ResourceLocation("betterend", "lacugrove_door"));
			createShortDoorRecipeJson(DDNames.TALL_LUCERNIA, new ResourceLocation("betterend", "lucernia_door"));
			createShortDoorRecipeJson(DDNames.TALL_MOSSY_GLOWSHROOM, new ResourceLocation("betterend", "mossy_glowshroom_door"));
			createShortDoorRecipeJson(DDNames.TALL_PYTHADENDRON, new ResourceLocation("betterend", "pythadendron_door"));
			createShortDoorRecipeJson(DDNames.TALL_TENANEA, new ResourceLocation("betterend", "tenanea_door"));
			createShortDoorRecipeJson(DDNames.TALL_UMBRELLA_TREE, new ResourceLocation("betterend", "umbrella_tree_door"));
			createTallDoorRecipeJson(DDNames.TALL_TERMINITE, new ResourceLocation("betterend", "terminite_door"), "tall_metal_door");
			createTallDoorRecipeJson(DDNames.TALL_THALLASIUM, new ResourceLocation("betterend", "thallasium_door"), "tall_metal_door");
			createTallDoorRecipeJson(DDNames.TALL_DRAGON_TREE, new ResourceLocation("betterend", "dragon_tree_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_END_LOTUS, new ResourceLocation("betterend", "end_lotus_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_HELIX_TREE, new ResourceLocation("betterend", "helix_tree_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_JELLYSHROOM, new ResourceLocation("betterend", "jellyshroom_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_LACUGROVE, new ResourceLocation("betterend", "lacugrove_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_LUCERNIA, new ResourceLocation("betterend", "lucernia_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_MOSSY_GLOWSHROOM, new ResourceLocation("betterend", "mossy_glowshroom_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_PYTHADENDRON, new ResourceLocation("betterend", "pythadendron_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_TENANEA, new ResourceLocation("betterend", "tenanea_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_UMBRELLA_TREE, new ResourceLocation("betterend", "umbrella_tree_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("betternether")) {
			createShortDoorRecipeJson(DDNames.TALL_ANCHOR_TREE, new ResourceLocation("betternether", "anchor_tree_door"));
			createShortDoorRecipeJson(DDNames.TALL_BONE_CIN, new ResourceLocation("betternether", "bone_cincinnasite_door"));
			createShortDoorRecipeJson(DDNames.TALL_BONE_REED, new ResourceLocation("betternether", "bone_reed_door"));
			createShortDoorRecipeJson(DDNames.TALL_MUSHROOM_FIR, new ResourceLocation("betternether", "mushroom_fir_door"));
			createShortDoorRecipeJson(DDNames.TALL_NETHER_MUSHROOM, new ResourceLocation("betternether", "nether_mushroom_door"));
			createShortDoorRecipeJson(DDNames.TALL_NETHER_REED, new ResourceLocation("betternether", "nether_reed_door"));
			createShortDoorRecipeJson(DDNames.TALL_NETHER_SAKURA, new ResourceLocation("betternether", "nether_sakura_door"));
			createShortDoorRecipeJson(DDNames.TALL_RUBEUS, new ResourceLocation("betternether", "rubeus_door"));
			createShortDoorRecipeJson(DDNames.TALL_STALAGNATE, new ResourceLocation("betternether", "stalagnate_door"));
			createShortDoorRecipeJson(DDNames.TALL_WART, new ResourceLocation("betternether", "wart_door"));
			createShortDoorRecipeJson(DDNames.TALL_BN_WILLOW, new ResourceLocation("betternether", "willow_door"));
			createTallDoorRecipeJson(DDNames.TALL_ANCHOR_TREE, new ResourceLocation("betternether", "anchor_tree_door"), "tall_bn_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BONE_CIN, new ResourceLocation("betternether", "bone_cincinnasite_door"), "tall_bn_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BONE_REED, new ResourceLocation("betternether", "bone_reed_door"), "tall_bn_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_MUSHROOM_FIR, new ResourceLocation("betternether", "mushroom_fir_door"), "tall_bn_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_NETHER_MUSHROOM, new ResourceLocation("betternether", "nether_mushroom_door"), "tall_bn_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_NETHER_REED, new ResourceLocation("betternether", "nether_reed_door"), "tall_bn_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_NETHER_SAKURA, new ResourceLocation("betternether", "nether_sakura_door"), "tall_bn_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_RUBEUS, new ResourceLocation("betternether", "rubeus_door"), "tall_bn_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_STALAGNATE, new ResourceLocation("betternether", "stalagnate_door"), "tall_bn_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_WART, new ResourceLocation("betternether", "wart_door"), "tall_bn_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BN_WILLOW, new ResourceLocation("betternether", "willow_door"), "tall_bn_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("bewitchment")) {
			createShortDoorRecipeJson(DDNames.SHORT_BW_CYPRESS, new ResourceLocation("bewitchment", "cypress_door"));
			createShortDoorRecipeJson(DDNames.SHORT_DRAGONS_BLOOD, new ResourceLocation("bewitchment", "dragons_blood_door"));
			createShortDoorRecipeJson(DDNames.SHORT_ELDER, new ResourceLocation("bewitchment", "elder_door"));
			createShortDoorRecipeJson(DDNames.SHORT_JUNIPER, new ResourceLocation("bewitchment", "juniper_door"));
			createTallDoorRecipeJson(DDNames.TALL_BW_CYPRESS, new ResourceLocation("bewitchment", "cypress_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_DRAGONS_BLOOD, new ResourceLocation("bewitchment", "dragons_blood_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_ELDER, new ResourceLocation("bewitchment", "elder_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_JUNIPER, new ResourceLocation("bewitchment", "juniper_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("bwplus")) {
			createShortDoorRecipeJson(DDNames.SHORT_YEW, new ResourceLocation("bwplus", "yew_door"));
			createTallDoorRecipeJson(DDNames.TALL_YEW, new ResourceLocation("bwplus", "yew_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("biomancy")) {
			createShortDoorRecipeJson(DDNames.SHORT_FLESH, new ResourceLocation("biomancy", "flesh_door"));
			createShortDoorRecipeJson(DDNames.SHORT_FULL_FLESH, new ResourceLocation("biomancy", "full_flesh_door"));
			createShortDoorRecipeJson(DDNames.SHORT_FLESHKIN, new ResourceLocation("biomancy", "fleshkin_door"));
			createTallDoorRecipeJson(DDNames.TALL_FLESH, new ResourceLocation("biomancy", "flesh_door"), "tall_misc_door");
			createTallDoorRecipeJson(DDNames.TALL_FULL_FLESH, new ResourceLocation("biomancy", "full_flesh_door"), "tall_misc_door");
			createTallDoorRecipeJson(DDNames.TALL_FLESHKIN, new ResourceLocation("biomancy", "fleshkin_door"), "tall_misc_door");
		}
		if (FabricLoader.getInstance().isModLoaded("biomemakeover")) {
			createShortDoorRecipeJson(DDNames.SHORT_BM_ANCIENT_OAK, new ResourceLocation("biomemakeover", "ancient_oak_door"));
			createShortDoorRecipeJson(DDNames.SHORT_BM_BLIGHTED_BALSA, new ResourceLocation("biomemakeover", "blighted_balsa_door"));
			createShortDoorRecipeJson(DDNames.SHORT_BM_SWAMP_CYPRESS, new ResourceLocation("biomemakeover", "swamp_cypress_door"));
			createShortDoorRecipeJson(DDNames.SHORT_BM_WILLOW, new ResourceLocation("biomemakeover", "willow_door"));
			createTallDoorRecipeJson(DDNames.TALL_BM_ANCIENT_OAK, new ResourceLocation("biomemakeover", "ancient_oak_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BM_BLIGHTED_BALSA, new ResourceLocation("biomemakeover", "blighted_balsa_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BM_SWAMP_CYPRESS, new ResourceLocation("biomemakeover", "swamp_cypress_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BM_WILLOW, new ResourceLocation("biomemakeover", "willow_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("byg")) {
			createShortDoorRecipeJson(DDNames.SHORT_BYG_ASPEN, new ResourceLocation("byg", "aspen_door"));
			createShortDoorRecipeJson(DDNames.SHORT_BYG_BAOBAB, new ResourceLocation("byg", "baobab_door"));
			createShortDoorRecipeJson(DDNames.SHORT_BYG_BLUE_ENCHANTED, new ResourceLocation("byg", "blue_enchanted_door"));
			createShortDoorRecipeJson(DDNames.SHORT_BYG_BULBIS, new ResourceLocation("byg", "bulbis_door"));
			createShortDoorRecipeJson(DDNames.SHORT_BYG_CHERRY, new ResourceLocation("byg", "cherry_door"));
			createShortDoorRecipeJson(DDNames.SHORT_BYG_CIKA, new ResourceLocation("byg", "cika_door"));
			createShortDoorRecipeJson(DDNames.SHORT_BYG_CYPRESS, new ResourceLocation("byg", "cypress_door"));
			createShortDoorRecipeJson(DDNames.SHORT_BYG_EBONY, new ResourceLocation("byg", "ebony_door"));
			createShortDoorRecipeJson(DDNames.SHORT_BYG_EMBUR, new ResourceLocation("byg", "embur_door"));
			createShortDoorRecipeJson(DDNames.SHORT_BYG_ETHER, new ResourceLocation("byg", "ether_door"));
			createShortDoorRecipeJson(DDNames.SHORT_BYG_FIR, new ResourceLocation("byg", "fir_door"));
			//createShortDoorRecipeJson(DDNames.SHORT_BYG_FLORUS, new ResourceLocation("byg", "florus_door"));
			createShortDoorRecipeJson(DDNames.SHORT_BYG_GREEN_ENCHANTED, new ResourceLocation("byg", "green_enchanted_door"));
			createShortDoorRecipeJson(DDNames.SHORT_BYG_HOLLY, new ResourceLocation("byg", "holly_door"));
			createShortDoorRecipeJson(DDNames.SHORT_BYG_IMPARIUS, new ResourceLocation("byg", "imparius_door"));
			//createShortDoorRecipeJson(DDNames.SHORT_BYG_IRONWOOD, new ResourceLocation("byg", "ironwood_door"));
			createShortDoorRecipeJson(DDNames.SHORT_BYG_JACARANDA, new ResourceLocation("byg", "jacaranda_door"));
			createShortDoorRecipeJson(DDNames.SHORT_BYG_LAMENT, new ResourceLocation("byg", "lament_door"));
			createShortDoorRecipeJson(DDNames.SHORT_BYG_MAHOGANY, new ResourceLocation("byg", "mahogany_door"));
			createShortDoorRecipeJson(DDNames.SHORT_BYG_MAPLE, new ResourceLocation("byg", "maple_door"));
			createShortDoorRecipeJson(DDNames.SHORT_BYG_NIGHTSHADE, new ResourceLocation("byg", "nightshade_door"));
			createShortDoorRecipeJson(DDNames.SHORT_BYG_PALM, new ResourceLocation("byg", "palm_door"));
			createShortDoorRecipeJson(DDNames.SHORT_BYG_PINE, new ResourceLocation("byg", "pine_door"));
			createShortDoorRecipeJson(DDNames.SHORT_BYG_RAINBOW_EUCALYPTUS, new ResourceLocation("byg", "rainbow_eucalyptus_door"));
			createShortDoorRecipeJson(DDNames.SHORT_BYG_REDWOOD, new ResourceLocation("byg", "redwood_door"));
			createShortDoorRecipeJson(DDNames.SHORT_BYG_SKYRIS, new ResourceLocation("byg", "skyris_door"));
			//createShortDoorRecipeJson(DDNames.SHORT_BYG_SOUL_SHROOM, new ResourceLocation("byg", "soul_shroom_door"));
			createShortDoorRecipeJson(DDNames.SHORT_BYG_SYTHIAN, new ResourceLocation("byg", "sythian_door"));
			createShortDoorRecipeJson(DDNames.SHORT_BYG_WHITE_MANGROVE, new ResourceLocation("byg", "white_mangrove_door"));
			createShortDoorRecipeJson(DDNames.SHORT_BYG_WILLOW, new ResourceLocation("byg", "willow_door"));
			createShortDoorRecipeJson(DDNames.SHORT_BYG_WITCH_HAZEL, new ResourceLocation("byg", "witch_hazel_door"));
			createShortDoorRecipeJson(DDNames.SHORT_BYG_ZELKOVA, new ResourceLocation("byg", "zelkova_door"));
			createTallDoorRecipeJson(DDNames.TALL_BYG_ASPEN, new ResourceLocation("byg", "aspen_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_BAOBAB, new ResourceLocation("byg", "baobab_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_BLUE_ENCHANTED, new ResourceLocation("byg", "blue_enchanted_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_BULBIS, new ResourceLocation("byg", "bulbis_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_CHERRY, new ResourceLocation("byg", "cherry_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_CIKA, new ResourceLocation("byg", "cika_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_CYPRESS, new ResourceLocation("byg", "cypress_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_EBONY, new ResourceLocation("byg", "ebony_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_EMBUR, new ResourceLocation("byg", "embur_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_ETHER, new ResourceLocation("byg", "ether_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_FIR, new ResourceLocation("byg", "fir_door"), "tall_byg_wooden_door");
			//createTallDoorRecipeJson(DDNames.TALL_BYG_FLORUS, new ResourceLocation("byg", "florus_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_GREEN_ENCHANTED, new ResourceLocation("byg", "green_enchanted_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_HOLLY, new ResourceLocation("byg", "holly_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_IMPARIUS, new ResourceLocation("byg", "imparius_door"), "tall_byg_wooden_door");
			//createTallDoorRecipeJson(DDNames.TALL_BYG_IRONWOOD, new ResourceLocation("byg", "ironwood_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_JACARANDA, new ResourceLocation("byg", "jacaranda_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_LAMENT, new ResourceLocation("byg", "lament_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_MAHOGANY, new ResourceLocation("byg", "mahogany_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_MAPLE, new ResourceLocation("byg", "maple_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_NIGHTSHADE, new ResourceLocation("byg", "nightshade_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_PALM, new ResourceLocation("byg", "palm_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_PINE, new ResourceLocation("byg", "pine_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_RAINBOW_EUCALYPTUS, new ResourceLocation("byg", "rainbow_eucalyptus_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_REDWOOD, new ResourceLocation("byg", "redwood_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_SKYRIS, new ResourceLocation("byg", "skyris_door"), "tall_byg_wooden_door");
			//createTallDoorRecipeJson(DDNames.TALL_BYG_SOUL_SHROOM, new ResourceLocation("byg", "soul_shroom_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_SYTHIAN, new ResourceLocation("byg", "sythian_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_WHITE_MANGROVE, new ResourceLocation("byg", "white_mangrove_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_WILLOW, new ResourceLocation("byg", "willow_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_WITCH_HAZEL, new ResourceLocation("byg", "witch_hazel_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_ZELKOVA, new ResourceLocation("byg", "zelkova_door"), "tall_byg_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("blockus")) {
			createShortDoorRecipeJson(DDNames.SHORT_BLOCKUS_BAMBOO, new ResourceLocation("blockus", "bamboo_door"));
			createShortDoorRecipeJson(DDNames.SHORT_BLOCKUS_BLACKSTONE, new ResourceLocation("blockus", "blackstone_door"));
			createShortDoorRecipeJson(DDNames.SHORT_BLOCKUS_CHARRED, new ResourceLocation("blockus", "charred_door"));
			createShortDoorRecipeJson(DDNames.SHORT_BLOCKUS_OBSIDIAN_REINFORCED, new ResourceLocation("blockus", "obsidian_reinforced_door"));
			createShortDoorRecipeJson(DDNames.SHORT_BLOCKUS_PAPER, new ResourceLocation("blockus", "paper_door"));
			createShortDoorRecipeJson(DDNames.SHORT_BLOCKUS_STONE, new ResourceLocation("blockus", "stone_door"));
			createShortDoorRecipeJson(DDNames.SHORT_BLOCKUS_WHITE_OAK, new ResourceLocation("blockus", "white_oak_door"));
			createTallDoorRecipeJson(DDNames.TALL_BLOCKUS_BAMBOO, new ResourceLocation("blockus", "bamboo_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BLOCKUS_BLACKSTONE, new ResourceLocation("blockus", "blackstone_door"), "tall_stone_door");
			createTallDoorRecipeJson(DDNames.TALL_BLOCKUS_CHARRED, new ResourceLocation("blockus", "charred_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BLOCKUS_OBSIDIAN_REINFORCED, new ResourceLocation("blockus", "obsidian_reinforced_door"), "tall_misc_door");
			createTallDoorRecipeJson(DDNames.TALL_BLOCKUS_PAPER, new ResourceLocation("blockus", "paper_door"), "tall_misc_door");
			createTallDoorRecipeJson(DDNames.TALL_BLOCKUS_STONE, new ResourceLocation("blockus", "stone_door"), "tall_stone_door");
			createTallDoorRecipeJson(DDNames.TALL_BLOCKUS_WHITE_OAK, new ResourceLocation("blockus", "white_oak_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("ceilands")) {
			createShortDoorRecipeJson(DDNames.SHORT_CEILTRUNK, new ResourceLocation("ceilands", "ceiltrunk_door"));
			createShortDoorRecipeJson(DDNames.SHORT_LUZAWOOD, new ResourceLocation("ceilands", "luzawood_door"));
			createTallDoorRecipeJson(DDNames.TALL_CEILTRUNK, new ResourceLocation("ceilands", "ceiltrunk_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_LUZAWOOD, new ResourceLocation("ceilands", "luzawood_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("charm")) {
			createShortDoorRecipeJson(DDNames.SHORT_CHARM_AZALEA, new ResourceLocation("charm", "azalea_door"));
			createShortDoorRecipeJson(DDNames.SHORT_CHARM_EBONY, new ResourceLocation("charm", "ebony_door"));
			createTallDoorRecipeJson(DDNames.TALL_CHARM_AZALEA, new ResourceLocation("charm", "azalea_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_CHARM_EBONY, new ResourceLocation("charm", "ebony_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("cinderscapes")) {
			createShortDoorRecipeJson(DDNames.SHORT_SCORCHED, new ResourceLocation("cinderscapes", "scorched_door"));
			createShortDoorRecipeJson(DDNames.SHORT_UMBRAL, new ResourceLocation("cinderscapes", "umbral_door"));
			createTallDoorRecipeJson(DDNames.TALL_SCORCHED, new ResourceLocation("cinderscapes", "scorched_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_UMBRAL, new ResourceLocation("cinderscapes", "umbral_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("cobblemon")) {
			createShortDoorRecipeJson(DDNames.SHORT_APRICORN, new ResourceLocation("cobblemon", "apricorn_door"));
			createTallDoorRecipeJson(DDNames.TALL_APRICORN, new ResourceLocation("cobblemon", "apricorn_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("colorfulazaleas")) {
			createShortDoorRecipeJson(DDNames.SHORT_AZULE_AZALEA, new ResourceLocation("colorfulazaleas", "azule_azalea_door"));
			createShortDoorRecipeJson(DDNames.SHORT_BRIGHT_AZALEA, new ResourceLocation("colorfulazaleas", "bright_azalea_door"));
			createShortDoorRecipeJson(DDNames.SHORT_FISS_AZALEA, new ResourceLocation("colorfulazaleas", "fiss_azalea_door"));
			createShortDoorRecipeJson(DDNames.SHORT_ROZE_AZALEA, new ResourceLocation("colorfulazaleas", "roze_azalea_door"));
			createShortDoorRecipeJson(DDNames.SHORT_TECAL_AZALEA, new ResourceLocation("colorfulazaleas", "tecal_azalea_door"));
			createShortDoorRecipeJson(DDNames.SHORT_TITANIUM_AZALEA, new ResourceLocation("colorfulazaleas", "titanium_azalea_door"));
			createShortDoorRecipeJson(DDNames.SHORT_WALNUT_AZALEA, new ResourceLocation("colorfulazaleas", "walnut_azalea_door"));
			createTallDoorRecipeJson(DDNames.TALL_AZULE_AZALEA, new ResourceLocation("colorfulazaleas", "azule_azalea_door"), "tall_ca_azalea_door");
			createTallDoorRecipeJson(DDNames.TALL_BRIGHT_AZALEA, new ResourceLocation("colorfulazaleas", "bright_azalea_door"), "tall_ca_azalea_door");
			createTallDoorRecipeJson(DDNames.TALL_FISS_AZALEA, new ResourceLocation("colorfulazaleas", "fiss_azalea_door"), "tall_ca_azalea_door");
			createTallDoorRecipeJson(DDNames.TALL_ROZE_AZALEA, new ResourceLocation("colorfulazaleas", "roze_azalea_door"), "tall_ca_azalea_door");
			createTallDoorRecipeJson(DDNames.TALL_TECAL_AZALEA, new ResourceLocation("colorfulazaleas", "tecal_azalea_door"), "tall_ca_azalea_door");
			createTallDoorRecipeJson(DDNames.TALL_TITANIUM_AZALEA, new ResourceLocation("colorfulazaleas", "titanium_azalea_door"), "tall_ca_azalea_door");
			createTallDoorRecipeJson(DDNames.TALL_WALNUT_AZALEA, new ResourceLocation("colorfulazaleas", "walnut_azalea_door"), "tall_ca_azalea_door");
		}
		if (FabricLoader.getInstance().isModLoaded("createdeco")) {
			createShortDoorRecipeJson(DDNames.SHORT_ANDESITE, new ResourceLocation("createdeco", "andesite_door"));
			createShortDoorRecipeJson(DDNames.SHORT_BRASS, new ResourceLocation("createdeco", "brass_door"));
			createShortDoorRecipeJson(DDNames.SHORT_COPPER, new ResourceLocation("createdeco", "copper_door"));
			createShortDoorRecipeJson(DDNames.SHORT_ZINC, new ResourceLocation("createdeco", "zinc_door"));
			createShortDoorRecipeJson(DDNames.SHORT_LOCKED_ANDESITE, new ResourceLocation("createdeco", "locked_andesite_door"));
			createShortDoorRecipeJson(DDNames.SHORT_LOCKED_BRASS, new ResourceLocation("createdeco", "locked_brass_door"));
			createShortDoorRecipeJson(DDNames.SHORT_LOCKED_COPPER, new ResourceLocation("createdeco", "locked_copper_door"));
			createShortDoorRecipeJson(DDNames.SHORT_LOCKED_ZINC, new ResourceLocation("createdeco", "locked_zinc_door"));
			createTallDoorRecipeJson(DDNames.TALL_ANDESITE, new ResourceLocation("createdeco", "andesite_door"), "tall_metal_door");
			createTallDoorRecipeJson(DDNames.TALL_BRASS, new ResourceLocation("createdeco", "brass_door"), "tall_metal_door");
			createTallDoorRecipeJson(DDNames.TALL_COPPER, new ResourceLocation("createdeco", "copper_door"), "tall_metal_door");
			createTallDoorRecipeJson(DDNames.TALL_ZINC, new ResourceLocation("createdeco", "zinc_door"), "tall_metal_door");
			createTallDoorRecipeJson(DDNames.TALL_LOCKED_ANDESITE, new ResourceLocation("createdeco", "locked_andesite_door"), "tall_metal_door");
			createTallDoorRecipeJson(DDNames.TALL_LOCKED_BRASS, new ResourceLocation("createdeco", "locked_brass_door"), "tall_metal_door");
			createTallDoorRecipeJson(DDNames.TALL_LOCKED_COPPER, new ResourceLocation("createdeco", "locked_copper_door"), "tall_metal_door");
			createTallDoorRecipeJson(DDNames.TALL_LOCKED_ZINC, new ResourceLocation("createdeco", "locked_zinc_door"), "tall_metal_door");
		}
		if (FabricLoader.getInstance().isModLoaded("deeperdarker")) {
			createShortDoorRecipeJson(DDNames.TALL_ECHO, new ResourceLocation("deeperdarker", "echo_door"));
			createTallDoorRecipeJson(DDNames.TALL_ECHO, new ResourceLocation("deeperdarker", "echo_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("ecologics")) {
			createShortDoorRecipeJson(DDNames.SHORT_ECO_AZALEA, new ResourceLocation("ecologics", "azalea_door"));
			createShortDoorRecipeJson(DDNames.SHORT_ECO_FLOWERING_AZALEA, new ResourceLocation("ecologics", "flowering_azalea_door"));
			createShortDoorRecipeJson(DDNames.SHORT_ECO_COCONUT, new ResourceLocation("ecologics", "coconut_door"));
			createShortDoorRecipeJson(DDNames.SHORT_ECO_WALNUT, new ResourceLocation("ecologics", "walnut_door"));
			createTallDoorRecipeJson(DDNames.TALL_ECO_AZALEA, new ResourceLocation("ecologics", "azalea_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_ECO_FLOWERING_AZALEA, new ResourceLocation("ecologics", "flowering_azalea_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_ECO_COCONUT, new ResourceLocation("ecologics", "coconut_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_ECO_WALNUT, new ResourceLocation("ecologics", "walnut_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("gardens_of_the_dead")) {
			createShortDoorRecipeJson(DDNames.SHORT_SOULBLIGHT, new ResourceLocation("gardens_of_the_dead", "soulblight_door"));
			createShortDoorRecipeJson(DDNames.SHORT_WHISTLECANE, new ResourceLocation("gardens_of_the_dead", "whistlecane_door"));
			createTallDoorRecipeJson(DDNames.TALL_SOULBLIGHT, new ResourceLocation("gardens_of_the_dead", "soulblight_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_WHISTLECANE, new ResourceLocation("gardens_of_the_dead", "whistlecane_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("glassdoor")) {
			createShortDoorRecipeJson(DDNames.SHORT_IRON_GLASS, new ResourceLocation("glassdoor", "iron_glassdoor"));
			createShortDoorRecipeJson(DDNames.SHORT_OAK_GLASS, new ResourceLocation("glassdoor", "oak_glassdoor"));
			createShortDoorRecipeJson(DDNames.SHORT_SPRUCE_GLASS, new ResourceLocation("glassdoor", "spruce_glassdoor"));
			createShortDoorRecipeJson(DDNames.SHORT_BIRCH_GLASS, new ResourceLocation("glassdoor", "birch_glassdoor"));
			createShortDoorRecipeJson(DDNames.SHORT_JUNGLE_GLASS, new ResourceLocation("glassdoor", "jungle_glassdoor"));
			createShortDoorRecipeJson(DDNames.SHORT_ACACIA_GLASS, new ResourceLocation("glassdoor", "acacia_glassdoor"));
			createShortDoorRecipeJson(DDNames.SHORT_DARK_OAK_GLASS, new ResourceLocation("glassdoor", "dark_oak_glassdoor"));
			createShortDoorRecipeJson(DDNames.SHORT_MANGROVE_GLASS, new ResourceLocation("glassdoor", "mangrove_glassdoor"));
			createShortDoorRecipeJson(DDNames.SHORT_CRIMSON_GLASS, new ResourceLocation("glassdoor", "crimson_glassdoor"));
			createShortDoorRecipeJson(DDNames.SHORT_WARPED_GLASS, new ResourceLocation("glassdoor", "warped_glassdoor"));
			createTallDoorRecipeJson(DDNames.TALL_IRON_GLASS, new ResourceLocation("glassdoor", "iron_glassdoor"), "tall_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_OAK_GLASS, new ResourceLocation("glassdoor", "oak_glassdoor"), "tall_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_SPRUCE_GLASS, new ResourceLocation("glassdoor", "spruce_glassdoor"), "tall_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_BIRCH_GLASS, new ResourceLocation("glassdoor", "birch_glassdoor"), "tall_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_JUNGLE_GLASS, new ResourceLocation("glassdoor", "jungle_glassdoor"), "tall_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_ACACIA_GLASS, new ResourceLocation("glassdoor", "acacia_glassdoor"), "tall_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_DARK_OAK_GLASS, new ResourceLocation("glassdoor", "dark_oak_glassdoor"), "tall_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MANGROVE_GLASS, new ResourceLocation("glassdoor", "mangrove_glassdoor"), "tall_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_CRIMSON_GLASS, new ResourceLocation("glassdoor", "crimson_glassdoor"), "tall_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_WARPED_GLASS, new ResourceLocation("glassdoor", "warped_glassdoor"), "tall_glass_door");
		}
		if (FabricLoader.getInstance().isModLoaded("goodending")) {
			createShortDoorRecipeJson(DDNames.SHORT_GE_CYPRESS, new ResourceLocation("goodending", "cypress_door"));
			createShortDoorRecipeJson(DDNames.SHORT_GE_MUDDY_OAK, new ResourceLocation("goodending", "muddy_oak_door"));
			createTallDoorRecipeJson(DDNames.TALL_GE_CYPRESS, new ResourceLocation("goodending", "cypress_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_GE_MUDDY_OAK, new ResourceLocation("goodending", "muddy_oak_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("graveyard")) {
			createShortDoorRecipeJson(DDNames.SHORT_DARK_IRON, new ResourceLocation("graveyard", "dark_iron_door"));
			createTallDoorRecipeJson(DDNames.TALL_DARK_IRON, new ResourceLocation("graveyard", "dark_iron_door"), "tall_metal_door");
		}
		if (FabricLoader.getInstance().isModLoaded("hexcasting")) {
			createShortDoorRecipeJson(DDNames.SHORT_EDIFIED, new ResourceLocation("hexcasting", "edified_door"));
			createTallDoorRecipeJson(DDNames.TALL_EDIFIED, new ResourceLocation("hexcasting", "edified_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("promenade")) {
			createShortDoorRecipeJson(DDNames.SHORT_PROMENADE_CHERRY_OAK, new ResourceLocation("promenade", "cherry_oak_door"));
			createShortDoorRecipeJson(DDNames.SHORT_PROMENADE_DARK_AMARANTH, new ResourceLocation("promenade", "dark_amaranth_door"));
			createShortDoorRecipeJson(DDNames.SHORT_PROMENADE_PALM, new ResourceLocation("promenade", "palm_door"));
			createTallDoorRecipeJson(DDNames.TALL_PROMENADE_CHERRY_OAK, new ResourceLocation("promenade", "cherry_oak_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_PROMENADE_DARK_AMARANTH, new ResourceLocation("promenade", "dark_amaranth_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_PROMENADE_PALM, new ResourceLocation("promenade", "palm_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("regions_unexplored")) {
			createShortDoorRecipeJson(DDNames.SHORT_RUE_BAOBAB, new ResourceLocation("regions_unexplored", "baobab_door"));
			createShortDoorRecipeJson(DDNames.SHORT_RUE_BLACKWOOD, new ResourceLocation("regions_unexplored", "blackwood_door"));
			createShortDoorRecipeJson(DDNames.SHORT_RUE_BRIMWOOD, new ResourceLocation("regions_unexplored", "brimwood_door"));
			createShortDoorRecipeJson(DDNames.SHORT_RUE_CHERRY, new ResourceLocation("regions_unexplored", "cherry_door"));
			createShortDoorRecipeJson(DDNames.SHORT_RUE_CYPRESS, new ResourceLocation("regions_unexplored", "cypress_door"));
			createShortDoorRecipeJson(DDNames.SHORT_RUE_DEAD, new ResourceLocation("regions_unexplored", "dead_door"));
			createShortDoorRecipeJson(DDNames.SHORT_RUE_EUCALYPTUS, new ResourceLocation("regions_unexplored", "eucalyptus_door"));
			createShortDoorRecipeJson(DDNames.SHORT_RUE_JOSHUA, new ResourceLocation("regions_unexplored", "joshua_door"));
			createShortDoorRecipeJson(DDNames.SHORT_RUE_LARCH, new ResourceLocation("regions_unexplored", "larch_door"));
			createShortDoorRecipeJson(DDNames.SHORT_RUE_MAPLE, new ResourceLocation("regions_unexplored", "maple_door"));
			createShortDoorRecipeJson(DDNames.SHORT_RUE_MAUVE, new ResourceLocation("regions_unexplored", "mauve_door"));
			createShortDoorRecipeJson(DDNames.SHORT_RUE_PALM, new ResourceLocation("regions_unexplored", "palm_door"));
			createShortDoorRecipeJson(DDNames.SHORT_RUE_PINE, new ResourceLocation("regions_unexplored", "pine_door"));
			createShortDoorRecipeJson(DDNames.SHORT_RUE_REDWOOD, new ResourceLocation("regions_unexplored", "redwood_door"));
			createShortDoorRecipeJson(DDNames.SHORT_RUE_WILLOW, new ResourceLocation("regions_unexplored", "willow_door"));
			createTallDoorRecipeJson(DDNames.TALL_RUE_BAOBAB, new ResourceLocation("regions_unexplored", "baobab_door"), "tall_rue_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_RUE_BLACKWOOD, new ResourceLocation("regions_unexplored", "blackwood_door"), "tall_rue_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_RUE_BRIMWOOD, new ResourceLocation("regions_unexplored", "brimwood_door"), "tall_rue_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_RUE_CHERRY, new ResourceLocation("regions_unexplored", "cherry_door"), "tall_rue_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_RUE_CYPRESS, new ResourceLocation("regions_unexplored", "cypress_door"), "tall_rue_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_RUE_DEAD, new ResourceLocation("regions_unexplored", "dead_door"), "tall_rue_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_RUE_EUCALYPTUS, new ResourceLocation("regions_unexplored", "eucalyptus_door"), "tall_rue_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_RUE_JOSHUA, new ResourceLocation("regions_unexplored", "joshua_door"), "tall_rue_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_RUE_LARCH, new ResourceLocation("regions_unexplored", "larch_door"), "tall_rue_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_RUE_MAPLE, new ResourceLocation("regions_unexplored", "maple_door"), "tall_rue_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_RUE_MAUVE, new ResourceLocation("regions_unexplored", "mauve_door"), "tall_rue_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_RUE_PALM, new ResourceLocation("regions_unexplored", "palm_door"), "tall_rue_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_RUE_PINE, new ResourceLocation("regions_unexplored", "pine_door"), "tall_rue_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_RUE_REDWOOD, new ResourceLocation("regions_unexplored", "redwood_door"), "tall_rue_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_RUE_WILLOW, new ResourceLocation("regions_unexplored", "willow_door"), "tall_rue_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("snowyspirit")) {
			createShortDoorRecipeJson(DDNames.SHORT_GINGERBREAD, new ResourceLocation("snowyspirit", "gingerbread_door"));
			createTallDoorRecipeJson(DDNames.TALL_GINGERBREAD, new ResourceLocation("snowyspirit", "gingerbread_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("supplementaries")) {
			createShortDoorRecipeJson(DDNames.SHORT_GOLD, new ResourceLocation("supplementaries", "gold_door"));
			createShortDoorRecipeJson(DDNames.SHORT_NETHERITE, new ResourceLocation("supplementaries", "netherite_door"));
			createTallDoorRecipeJson(DDNames.TALL_GOLD, new ResourceLocation("supplementaries", "gold_door"), "tall_metal_door");
			createTallDoorRecipeJson(DDNames.TALL_NETHERITE, new ResourceLocation("supplementaries", "netherite_door"), "tall_metal_door");			
		}
		if (FabricLoader.getInstance().isModLoaded("tconstruct")) {
			createShortDoorRecipeJson(DDNames.SHORT_BLOODSHROOM, new ResourceLocation("tconstruct", "bloodshroom_door"));
			createShortDoorRecipeJson(DDNames.SHORT_GREENHEART, new ResourceLocation("tconstruct", "greenheart_door"));
			createShortDoorRecipeJson(DDNames.SHORT_SKYROOT, new ResourceLocation("tconstruct", "skyroot_door"));
			createTallDoorRecipeJson(DDNames.TALL_BLOODSHROOM, new ResourceLocation("tconstruct", "bloodshroom_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_GREENHEART, new ResourceLocation("tconstruct", "greenheart_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_SKYROOT, new ResourceLocation("tconstruct", "skyroot_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("techreborn")) {
			createShortDoorRecipeJson(DDNames.SHORT_RUBBER, new ResourceLocation("techreborn", "rubber_door"));
			createTallDoorRecipeJson(DDNames.TALL_RUBBER, new ResourceLocation("techreborn", "rubber_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("terrestria")) {
			createShortDoorRecipeJson(DDNames.SHORT_TERRESTRIA_CYPRESS, new ResourceLocation("terrestria", "cypress_door"));
			createShortDoorRecipeJson(DDNames.SHORT_TERRESTRIA_HEMLOCK, new ResourceLocation("terrestria", "hemlock_door"));
			createShortDoorRecipeJson(DDNames.SHORT_TERRESTRIA_JAPANESE_MAPLE, new ResourceLocation("terrestria", "japanese_maple_door"));
			createShortDoorRecipeJson(DDNames.SHORT_TERRESTRIA_RAINBOW_EUCALYPTUS, new ResourceLocation("terrestria", "rainbow_eucalyptus_door"));
			createShortDoorRecipeJson(DDNames.SHORT_TERRESTRIA_REDWOOD, new ResourceLocation("terrestria", "redwood_door"));
			createShortDoorRecipeJson(DDNames.SHORT_TERRESTRIA_RUBBER, new ResourceLocation("terrestria", "rubber_door"));
			createShortDoorRecipeJson(DDNames.SHORT_TERRESTRIA_SAKURA, new ResourceLocation("terrestria", "sakura_door"));
			createShortDoorRecipeJson(DDNames.SHORT_TERRESTRIA_WILLOW, new ResourceLocation("terrestria", "willow_door"));
			createShortDoorRecipeJson(DDNames.SHORT_TERRESTRIA_YUCCA_PALM, new ResourceLocation("terrestria", "yucca_palm_door"));
			createTallDoorRecipeJson(DDNames.TALL_TERRESTRIA_CYPRESS, new ResourceLocation("terrestria", "cypress_door"), "tall_terrestria_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_TERRESTRIA_HEMLOCK, new ResourceLocation("terrestria", "hemlock_door"), "tall_terrestria_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_TERRESTRIA_JAPANESE_MAPLE, new ResourceLocation("terrestria", "japanese_maple_door"), "tall_terrestria_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_TERRESTRIA_RAINBOW_EUCALYPTUS, new ResourceLocation("terrestria", "rainbow_eucalyptus_door"), "tall_terrestria_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_TERRESTRIA_REDWOOD, new ResourceLocation("terrestria", "redwood_door"), "tall_terrestria_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_TERRESTRIA_RUBBER, new ResourceLocation("terrestria", "rubber_door"), "tall_terrestria_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_TERRESTRIA_SAKURA, new ResourceLocation("terrestria", "sakura_door"), "tall_terrestria_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_TERRESTRIA_WILLOW, new ResourceLocation("terrestria", "willow_door"), "tall_terrestria_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_TERRESTRIA_YUCCA_PALM, new ResourceLocation("terrestria", "yucca_palm_door"), "tall_terrestria_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("traverse")) {
			createShortDoorRecipeJson(DDNames.SHORT_TRAVERSE_FIR, new ResourceLocation("traverse", "fir_door"));
			createTallDoorRecipeJson(DDNames.TALL_TRAVERSE_FIR, new ResourceLocation("traverse", "fir_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("twigs")) {
			createShortDoorRecipeJson(DDNames.SHORT_STRIPPED_BAMBOO, new ResourceLocation("twigs", "stripped_bamboo_door"));
			createTallDoorRecipeJson(DDNames.TALL_STRIPPED_BAMBOO, new ResourceLocation("twigs", "stripped_bamboo_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("twilightforest")) {
			createShortDoorRecipeJson(DDNames.SHORT_CANOPY, new ResourceLocation("twilightforest", "canopy_door"));
			createShortDoorRecipeJson(DDNames.SHORT_DARKWOOD, new ResourceLocation("twilightforest", "dark_door"));
			createShortDoorRecipeJson(DDNames.SHORT_TWILIGHT_MANGROVE, new ResourceLocation("twilightforest", "mangrove_door"));
			createShortDoorRecipeJson(DDNames.SHORT_MINEWOOD, new ResourceLocation("twilightforest", "mining_door"));
			createShortDoorRecipeJson(DDNames.SHORT_SORTINGWOOD, new ResourceLocation("twilightforest", "sorting_door"));
			createShortDoorRecipeJson(DDNames.SHORT_TIMEWOOD, new ResourceLocation("twilightforest", "time_door"));
			createShortDoorRecipeJson(DDNames.SHORT_TRANSWOOD, new ResourceLocation("twilightforest", "transformation_door"));
			createShortDoorRecipeJson(DDNames.SHORT_TWILIGHT_OAK, new ResourceLocation("twilightforest", "twilight_oak_door"));
			createTallDoorRecipeJson(DDNames.TALL_CANOPY, new ResourceLocation("twilightforest", "canopy_door"), "tall_tf_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_DARKWOOD, new ResourceLocation("twilightforest", "dark_door"), "tall_tf_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_TWILIGHT_MANGROVE, new ResourceLocation("twilightforest", "mangrove_door"), "tall_tf_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_MINEWOOD, new ResourceLocation("twilightforest", "mining_door"), "tall_tf_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_SORTINGWOOD, new ResourceLocation("twilightforest", "sorting_door"), "tall_tf_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_TIMEWOOD, new ResourceLocation("twilightforest", "time_door"), "tall_tf_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_TRANSWOOD, new ResourceLocation("twilightforest", "transformation_door"), "tall_tf_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_TWILIGHT_OAK, new ResourceLocation("twilightforest", "twilight_oak_door"), "tall_tf_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("tflostblocks")) {
			createShortDoorRecipeJson(DDNames.SHORT_TOWERWOOD, new ResourceLocation("tflostblocks", "towerwood_door"));
			createTallDoorRecipeJson(DDNames.TALL_TOWERWOOD, new ResourceLocation("tflostblocks", "towerwood_door"), "tall_tf_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("wilderwild")) {
			createShortDoorRecipeJson(DDNames.SHORT_WW_BAOBAB, new ResourceLocation("wilderwild", "baobab_door"));
			createShortDoorRecipeJson(DDNames.SHORT_WW_CYPRESS, new ResourceLocation("wilderwild", "cypress_door"));
			createShortDoorRecipeJson(DDNames.SHORT_WW_PALM, new ResourceLocation("wilderwild", "palm_door"));
			createTallDoorRecipeJson(DDNames.TALL_WW_BAOBAB, new ResourceLocation("wilderwild", "baobab_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_WW_CYPRESS, new ResourceLocation("wilderwild", "cypress_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_WW_PALM, new ResourceLocation("wilderwild", "palm_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("xps_additions")) {
			createShortDoorRecipeJson(DDNames.SHORT_SOUL_COPPER, new ResourceLocation("xps_additions", "soul_copper_door"));
			createTallDoorRecipeJson(DDNames.TALL_SOUL_COPPER, new ResourceLocation("xps_additions", "soul_copper_door"), "tall_metal_door");
		}
		if (FabricLoader.getInstance().isModLoaded("yippee")) {
			createShortDoorRecipeJson(DDNames.SHORT_MYSTICAL_OAK, new ResourceLocation("yippee", "mystical_oak_door"));
			createTallDoorRecipeJson(DDNames.TALL_MYSTICAL_OAK, new ResourceLocation("yippee", "mystical_oak_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("chipped")) {
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_OAK_HEAVY, new ResourceLocation("chipped", "heavy_oak_door"), "tall_chipped_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_OAK_DUAL_PANELED, new ResourceLocation("chipped", "dual_paneled_oak_door"), "tall_chipped_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_OAK_PRESSED, new ResourceLocation("chipped", "pressed_oak_door"), "tall_chipped_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_OAK_SHACK, new ResourceLocation("chipped", "shack_oak_door"), "tall_chipped_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_OAK_FORTIFIED, new ResourceLocation("chipped", "fortified_oak_door"), "tall_chipped_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_OAK_SLIDING, new ResourceLocation("chipped", "sliding_oak_door"), "tall_chipped_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_OAK_SCREEN, new ResourceLocation("chipped", "screen_oak_door"), "tall_chipped_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_OAK_GATED, new ResourceLocation("chipped", "gated_oak_door"), "tall_chipped_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_OAK_GLASS, new ResourceLocation("chipped", "glass_oak_door"), "tall_chipped_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_OAK_WINDOWED, new ResourceLocation("chipped", "windowed_oak_door"), "tall_chipped_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_OAK_TILED, new ResourceLocation("chipped", "tiled_oak_door"), "tall_chipped_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_OAK_TILE_WINDOWED, new ResourceLocation("chipped", "tile_windowed_oak_door"), "tall_chipped_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_OAK_SECRET, new ResourceLocation("chipped", "secret_oak_door"), "tall_chipped_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_OAK_BOARDED, new ResourceLocation("chipped", "boarded_oak_door"), "tall_chipped_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_OAK_PAPER, new ResourceLocation("chipped", "paper_oak_door"), "tall_chipped_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_OAK_BEACH, new ResourceLocation("chipped", "beach_oak_door"), "tall_chipped_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_OAK_BARRED, new ResourceLocation("chipped", "barred_oak_door"), "tall_chipped_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_OAK_PANELED, new ResourceLocation("chipped", "paneled_oak_door"), "tall_chipped_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_OAK_SUPPORTED, new ResourceLocation("chipped", "supported_oak_door"), "tall_chipped_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_OAK_OVERGROWN, new ResourceLocation("chipped", "overgrown_oak_door"), "tall_chipped_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_SPRUCE_HEAVY, new ResourceLocation("chipped", "heavy_spruce_door"), "tall_chipped_spruce_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_SPRUCE_DUAL_PANELED, new ResourceLocation("chipped", "dual_paneled_spruce_door"), "tall_chipped_spruce_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_SPRUCE_PRESSED, new ResourceLocation("chipped", "pressed_spruce_door"), "tall_chipped_spruce_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_SPRUCE_SHACK, new ResourceLocation("chipped", "shack_spruce_door"), "tall_chipped_spruce_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_SPRUCE_FORTIFIED, new ResourceLocation("chipped", "fortified_spruce_door"), "tall_chipped_spruce_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_SPRUCE_SLIDING, new ResourceLocation("chipped", "sliding_spruce_door"), "tall_chipped_spruce_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_SPRUCE_SCREEN, new ResourceLocation("chipped", "screen_spruce_door"), "tall_chipped_spruce_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_SPRUCE_GATED, new ResourceLocation("chipped", "gated_spruce_door"), "tall_chipped_spruce_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_SPRUCE_GLASS, new ResourceLocation("chipped", "glass_spruce_door"), "tall_chipped_spruce_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_SPRUCE_WINDOWED, new ResourceLocation("chipped", "windowed_spruce_door"), "tall_chipped_spruce_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_SPRUCE_TILED, new ResourceLocation("chipped", "tiled_spruce_door"), "tall_chipped_spruce_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_SPRUCE_TILE_WINDOWED, new ResourceLocation("chipped", "tile_windowed_spruce_door"), "tall_chipped_spruce_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_SPRUCE_SECRET, new ResourceLocation("chipped", "secret_spruce_door"), "tall_chipped_spruce_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_SPRUCE_MODERN, new ResourceLocation("chipped", "modern_spruce_door"), "tall_chipped_spruce_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_SPRUCE_PAPER, new ResourceLocation("chipped", "paper_spruce_door"), "tall_chipped_spruce_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_SPRUCE_BEACH, new ResourceLocation("chipped", "beach_spruce_door"), "tall_chipped_spruce_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_SPRUCE_BARRED, new ResourceLocation("chipped", "barred_spruce_door"), "tall_chipped_spruce_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_SPRUCE_PANELED, new ResourceLocation("chipped", "paneled_spruce_door"), "tall_chipped_spruce_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_SPRUCE_SUPPORTED, new ResourceLocation("chipped", "supported_spruce_door"), "tall_chipped_spruce_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_SPRUCE_OVERGROWN, new ResourceLocation("chipped", "overgrown_spruce_door"), "tall_chipped_spruce_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_BIRCH_HEAVY, new ResourceLocation("chipped", "heavy_birch_door"), "tall_chipped_birch_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_BIRCH_DUAL_PANELED, new ResourceLocation("chipped", "dual_paneled_birch_door"), "tall_chipped_birch_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_BIRCH_PRESSED, new ResourceLocation("chipped", "pressed_birch_door"), "tall_chipped_birch_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_BIRCH_SHACK, new ResourceLocation("chipped", "shack_birch_door"), "tall_chipped_birch_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_BIRCH_FORTIFIED, new ResourceLocation("chipped", "fortified_birch_door"), "tall_chipped_birch_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_BIRCH_SLIDING, new ResourceLocation("chipped", "sliding_birch_door"), "tall_chipped_birch_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_BIRCH_SCREEN, new ResourceLocation("chipped", "screen_birch_door"), "tall_chipped_birch_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_BIRCH_GATED, new ResourceLocation("chipped", "gated_birch_door"), "tall_chipped_birch_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_BIRCH_GLASS, new ResourceLocation("chipped", "glass_birch_door"), "tall_chipped_birch_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_BIRCH_WINDOWED, new ResourceLocation("chipped", "windowed_birch_door"), "tall_chipped_birch_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_BIRCH_TILED, new ResourceLocation("chipped", "tiled_birch_door"), "tall_chipped_birch_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_BIRCH_TILE_WINDOWED, new ResourceLocation("chipped", "tile_windowed_birch_door"), "tall_chipped_birch_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_BIRCH_SECRET, new ResourceLocation("chipped", "secret_birch_door"), "tall_chipped_birch_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_BIRCH_MODERN, new ResourceLocation("chipped", "modern_birch_door"), "tall_chipped_birch_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_BIRCH_BOARDED, new ResourceLocation("chipped", "boarded_birch_door"), "tall_chipped_birch_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_BIRCH_BEACH, new ResourceLocation("chipped", "beach_birch_door"), "tall_chipped_birch_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_BIRCH_BARRED, new ResourceLocation("chipped", "barred_birch_door"), "tall_chipped_birch_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_BIRCH_PANELED, new ResourceLocation("chipped", "paneled_birch_door"), "tall_chipped_birch_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_BIRCH_SUPPORTED, new ResourceLocation("chipped", "supported_birch_door"), "tall_chipped_birch_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_BIRCH_OVERGROWN, new ResourceLocation("chipped", "overgrown_birch_door"), "tall_chipped_birch_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_JUNGLE_HEAVY, new ResourceLocation("chipped", "heavy_jungle_door"), "tall_chipped_jungle_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_JUNGLE_DUAL_PANELED, new ResourceLocation("chipped", "dual_paneled_jungle_door"), "tall_chipped_jungle_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_JUNGLE_PRESSED, new ResourceLocation("chipped", "pressed_jungle_door"), "tall_chipped_jungle_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_JUNGLE_SHACK, new ResourceLocation("chipped", "shack_jungle_door"), "tall_chipped_jungle_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_JUNGLE_FORTIFIED, new ResourceLocation("chipped", "fortified_jungle_door"), "tall_chipped_jungle_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_JUNGLE_SLIDING, new ResourceLocation("chipped", "sliding_jungle_door"), "tall_chipped_jungle_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_JUNGLE_SCREEN, new ResourceLocation("chipped", "screen_jungle_door"), "tall_chipped_jungle_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_JUNGLE_GATED, new ResourceLocation("chipped", "gated_jungle_door"), "tall_chipped_jungle_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_JUNGLE_GLASS, new ResourceLocation("chipped", "glass_jungle_door"), "tall_chipped_jungle_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_JUNGLE_WINDOWED, new ResourceLocation("chipped", "windowed_jungle_door"), "tall_chipped_jungle_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_JUNGLE_TILED, new ResourceLocation("chipped", "tiled_jungle_door"), "tall_chipped_jungle_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_JUNGLE_TILE_WINDOWED, new ResourceLocation("chipped", "tile_windowed_jungle_door"), "tall_chipped_jungle_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_JUNGLE_SECRET, new ResourceLocation("chipped", "secret_jungle_door"), "tall_chipped_jungle_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_JUNGLE_MODERN, new ResourceLocation("chipped", "modern_jungle_door"), "tall_chipped_jungle_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_JUNGLE_BOARDED, new ResourceLocation("chipped", "boarded_jungle_door"), "tall_chipped_jungle_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_JUNGLE_PAPER, new ResourceLocation("chipped", "paper_jungle_door"), "tall_chipped_jungle_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_JUNGLE_BARRED, new ResourceLocation("chipped", "barred_jungle_door"), "tall_chipped_jungle_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_JUNGLE_PANELED, new ResourceLocation("chipped", "paneled_jungle_door"), "tall_chipped_jungle_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_JUNGLE_SUPPORTED, new ResourceLocation("chipped", "supported_jungle_door"), "tall_chipped_jungle_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_JUNGLE_OVERGROWN, new ResourceLocation("chipped", "overgrown_jungle_door"), "tall_chipped_jungle_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_ACACIA_HEAVY, new ResourceLocation("chipped", "heavy_acacia_door"), "tall_chipped_acacia_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_ACACIA_DUAL_PANELED, new ResourceLocation("chipped", "dual_paneled_acacia_door"), "tall_chipped_acacia_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_ACACIA_PRESSED, new ResourceLocation("chipped", "pressed_acacia_door"), "tall_chipped_acacia_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_ACACIA_SHACK, new ResourceLocation("chipped", "shack_acacia_door"), "tall_chipped_acacia_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_ACACIA_FORTIFIED, new ResourceLocation("chipped", "fortified_acacia_door"), "tall_chipped_acacia_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_ACACIA_SLIDING, new ResourceLocation("chipped", "sliding_acacia_door"), "tall_chipped_acacia_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_ACACIA_SCREEN, new ResourceLocation("chipped", "screen_acacia_door"), "tall_chipped_acacia_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_ACACIA_GATED, new ResourceLocation("chipped", "gated_acacia_door"), "tall_chipped_acacia_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_ACACIA_GLASS, new ResourceLocation("chipped", "glass_acacia_door"), "tall_chipped_acacia_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_ACACIA_WINDOWED, new ResourceLocation("chipped", "windowed_acacia_door"), "tall_chipped_acacia_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_ACACIA_TILED, new ResourceLocation("chipped", "tiled_acacia_door"), "tall_chipped_acacia_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_ACACIA_TILE_WINDOWED, new ResourceLocation("chipped", "tile_windowed_acacia_door"), "tall_chipped_acacia_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_ACACIA_SECRET, new ResourceLocation("chipped", "secret_acacia_door"), "tall_chipped_acacia_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_ACACIA_MODERN, new ResourceLocation("chipped", "modern_acacia_door"), "tall_chipped_acacia_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_ACACIA_BOARDED, new ResourceLocation("chipped", "boarded_acacia_door"), "tall_chipped_acacia_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_ACACIA_PAPER, new ResourceLocation("chipped", "paper_acacia_door"), "tall_chipped_acacia_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_ACACIA_BEACH, new ResourceLocation("chipped", "beach_acacia_door"), "tall_chipped_acacia_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_ACACIA_PANELED, new ResourceLocation("chipped", "paneled_acacia_door"), "tall_chipped_acacia_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_ACACIA_SUPPORTED, new ResourceLocation("chipped", "supported_acacia_door"), "tall_chipped_acacia_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_ACACIA_OVERGROWN, new ResourceLocation("chipped", "overgrown_acacia_door"), "tall_chipped_acacia_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_DARK_OAK_HEAVY, new ResourceLocation("chipped", "heavy_dark_oak_door"), "tall_chipped_dark_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_DARK_OAK_DUAL_PANELED, new ResourceLocation("chipped", "dual_paneled_dark_oak_door"), "tall_chipped_dark_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_DARK_OAK_PRESSED, new ResourceLocation("chipped", "pressed_dark_oak_door"), "tall_chipped_dark_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_DARK_OAK_SHACK, new ResourceLocation("chipped", "shack_dark_oak_door"), "tall_chipped_dark_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_DARK_OAK_FORTIFIED, new ResourceLocation("chipped", "fortified_dark_oak_door"), "tall_chipped_dark_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_DARK_OAK_SLIDING, new ResourceLocation("chipped", "sliding_dark_oak_door"), "tall_chipped_dark_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_DARK_OAK_SCREEN, new ResourceLocation("chipped", "screen_dark_oak_door"), "tall_chipped_dark_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_DARK_OAK_GATED, new ResourceLocation("chipped", "gated_dark_oak_door"), "tall_chipped_dark_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_DARK_OAK_GLASS, new ResourceLocation("chipped", "glass_dark_oak_door"), "tall_chipped_dark_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_DARK_OAK_WINDOWED, new ResourceLocation("chipped", "windowed_dark_oak_door"), "tall_chipped_dark_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_DARK_OAK_TILED, new ResourceLocation("chipped", "tiled_dark_oak_door"), "tall_chipped_dark_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_DARK_OAK_TILE_WINDOWED, new ResourceLocation("chipped", "tile_windowed_dark_oak_door"), "tall_chipped_dark_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_DARK_OAK_SECRET, new ResourceLocation("chipped", "secret_dark_oak_door"), "tall_chipped_dark_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_DARK_OAK_MODERN, new ResourceLocation("chipped", "modern_dark_oak_door"), "tall_chipped_dark_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_DARK_OAK_BOARDED, new ResourceLocation("chipped", "boarded_dark_oak_door"), "tall_chipped_dark_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_DARK_OAK_PAPER, new ResourceLocation("chipped", "paper_dark_oak_door"), "tall_chipped_dark_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_DARK_OAK_BEACH, new ResourceLocation("chipped", "beach_dark_oak_door"), "tall_chipped_dark_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_DARK_OAK_BARRED, new ResourceLocation("chipped", "barred_dark_oak_door"), "tall_chipped_dark_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_DARK_OAK_SUPPORTED, new ResourceLocation("chipped", "supported_dark_oak_door"), "tall_chipped_dark_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_DARK_OAK_OVERGROWN, new ResourceLocation("chipped", "overgrown_dark_oak_door"), "tall_chipped_dark_oak_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_MANGROVE_HEAVY, new ResourceLocation("chipped", "heavy_mangrove_door"), "tall_chipped_mangrove_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_MANGROVE_DUAL_PANELED, new ResourceLocation("chipped", "dual_paneled_mangrove_door"), "tall_chipped_mangrove_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_MANGROVE_PRESSED, new ResourceLocation("chipped", "pressed_mangrove_door"), "tall_chipped_mangrove_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_MANGROVE_SHACK, new ResourceLocation("chipped", "shack_mangrove_door"), "tall_chipped_mangrove_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_MANGROVE_FORTIFIED, new ResourceLocation("chipped", "fortified_mangrove_door"), "tall_chipped_mangrove_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_MANGROVE_SLIDING, new ResourceLocation("chipped", "sliding_mangrove_door"), "tall_chipped_mangrove_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_MANGROVE_SCREEN, new ResourceLocation("chipped", "screen_mangrove_door"), "tall_chipped_mangrove_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_MANGROVE_GATED, new ResourceLocation("chipped", "gated_mangrove_door"), "tall_chipped_mangrove_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_MANGROVE_GLASS, new ResourceLocation("chipped", "glass_mangrove_door"), "tall_chipped_mangrove_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_MANGROVE_WINDOWED, new ResourceLocation("chipped", "windowed_mangrove_door"), "tall_chipped_mangrove_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_MANGROVE_TILED, new ResourceLocation("chipped", "tiled_mangrove_door"), "tall_chipped_mangrove_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_MANGROVE_TILE_WINDOWED, new ResourceLocation("chipped", "tile_windowed_mangrove_door"), "tall_chipped_mangrove_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_MANGROVE_SECRET, new ResourceLocation("chipped", "secret_mangrove_door"), "tall_chipped_mangrove_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_MANGROVE_MODERN, new ResourceLocation("chipped", "modern_mangrove_door"), "tall_chipped_mangrove_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_MANGROVE_BOARDED, new ResourceLocation("chipped", "boarded_mangrove_door"), "tall_chipped_mangrove_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_MANGROVE_PAPER, new ResourceLocation("chipped", "paper_mangrove_door"), "tall_chipped_mangrove_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_MANGROVE_BEACH, new ResourceLocation("chipped", "beach_mangrove_door"), "tall_chipped_mangrove_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_MANGROVE_BARRED, new ResourceLocation("chipped", "barred_mangrove_door"), "tall_chipped_mangrove_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_MANGROVE_PANELED, new ResourceLocation("chipped", "paneled_mangrove_door"), "tall_chipped_mangrove_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_MANGROVE_SUPPORTED, new ResourceLocation("chipped", "supported_mangrove_door"), "tall_chipped_mangrove_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_MANGROVE_OVERGROWN, new ResourceLocation("chipped", "overgrown_mangrove_door"), "tall_chipped_mangrove_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_CRIMSON_HEAVY, new ResourceLocation("chipped", "heavy_crimson_door"), "tall_chipped_crimson_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_CRIMSON_DUAL_PANELED, new ResourceLocation("chipped", "dual_paneled_crimson_door"), "tall_chipped_crimson_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_CRIMSON_PRESSED, new ResourceLocation("chipped", "pressed_crimson_door"), "tall_chipped_crimson_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_CRIMSON_SHACK, new ResourceLocation("chipped", "shack_crimson_door"), "tall_chipped_crimson_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_CRIMSON_FORTIFIED, new ResourceLocation("chipped", "fortified_crimson_door"), "tall_chipped_crimson_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_CRIMSON_SLIDING, new ResourceLocation("chipped", "sliding_crimson_door"), "tall_chipped_crimson_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_CRIMSON_SCREEN, new ResourceLocation("chipped", "screen_crimson_door"), "tall_chipped_crimson_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_CRIMSON_GATED, new ResourceLocation("chipped", "gated_crimson_door"), "tall_chipped_crimson_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_CRIMSON_GLASS, new ResourceLocation("chipped", "glass_crimson_door"), "tall_chipped_crimson_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_CRIMSON_WINDOWED, new ResourceLocation("chipped", "windowed_crimson_door"), "tall_chipped_crimson_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_CRIMSON_TILED, new ResourceLocation("chipped", "tiled_crimson_door"), "tall_chipped_crimson_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_CRIMSON_TILE_WINDOWED, new ResourceLocation("chipped", "tile_windowed_crimson_door"), "tall_chipped_crimson_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_CRIMSON_SECRET, new ResourceLocation("chipped", "secret_crimson_door"), "tall_chipped_crimson_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_CRIMSON_MODERN, new ResourceLocation("chipped", "modern_crimson_door"), "tall_chipped_crimson_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_CRIMSON_BOARDED, new ResourceLocation("chipped", "boarded_crimson_door"), "tall_chipped_crimson_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_CRIMSON_PAPER, new ResourceLocation("chipped", "paper_crimson_door"), "tall_chipped_crimson_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_CRIMSON_BEACH, new ResourceLocation("chipped", "beach_crimson_door"), "tall_chipped_crimson_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_CRIMSON_BARRED, new ResourceLocation("chipped", "barred_crimson_door"), "tall_chipped_crimson_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_CRIMSON_PANELED, new ResourceLocation("chipped", "paneled_crimson_door"), "tall_chipped_crimson_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_CRIMSON_OVERGROWN, new ResourceLocation("chipped", "overgrown_crimson_door"), "tall_chipped_crimson_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_WARPED_HEAVY, new ResourceLocation("chipped", "heavy_warped_door"), "tall_chipped_warped_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_WARPED_DUAL_PANELED, new ResourceLocation("chipped", "dual_paneled_warped_door"), "tall_chipped_warped_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_WARPED_PRESSED, new ResourceLocation("chipped", "pressed_warped_door"), "tall_chipped_warped_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_WARPED_SHACK, new ResourceLocation("chipped", "shack_warped_door"), "tall_chipped_warped_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_WARPED_FORTIFIED, new ResourceLocation("chipped", "fortified_warped_door"), "tall_chipped_warped_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_WARPED_SLIDING, new ResourceLocation("chipped", "sliding_warped_door"), "tall_chipped_warped_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_WARPED_SCREEN, new ResourceLocation("chipped", "screen_warped_door"), "tall_chipped_warped_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_WARPED_GATED, new ResourceLocation("chipped", "gated_warped_door"), "tall_chipped_warped_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_WARPED_GLASS, new ResourceLocation("chipped", "glass_warped_door"), "tall_chipped_warped_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_WARPED_WINDOWED, new ResourceLocation("chipped", "windowed_warped_door"), "tall_chipped_warped_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_WARPED_TILED, new ResourceLocation("chipped", "tiled_warped_door"), "tall_chipped_warped_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_WARPED_TILE_WINDOWED, new ResourceLocation("chipped", "tile_windowed_warped_door"), "tall_chipped_warped_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_WARPED_SECRET, new ResourceLocation("chipped", "secret_warped_door"), "tall_chipped_warped_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_WARPED_MODERN, new ResourceLocation("chipped", "modern_warped_door"), "tall_chipped_warped_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_WARPED_BOARDED, new ResourceLocation("chipped", "boarded_warped_door"), "tall_chipped_warped_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_WARPED_PAPER, new ResourceLocation("chipped", "paper_warped_door"), "tall_chipped_warped_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_WARPED_BEACH, new ResourceLocation("chipped", "beach_warped_door"), "tall_chipped_warped_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_WARPED_BARRED, new ResourceLocation("chipped", "barred_warped_door"), "tall_chipped_warped_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_WARPED_PANELED, new ResourceLocation("chipped", "paneled_warped_door"), "tall_chipped_warped_door");
			createTallDoorRecipeJson(DDNames.TALL_CHIPPED_WARPED_SUPPORTED, new ResourceLocation("chipped", "supported_warped_door"), "tall_chipped_warped_door");
		}
		if (FabricLoader.getInstance().isModLoaded("mcwdoors")) {
			createTallDoorRecipeJson(DDNames.TALL_MACAW_STORE, new ResourceLocation("mcwdoors", "store_door"), "tall_macaw_metal_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_SLIDING_GLASS, new ResourceLocation("mcwdoors", "sliding_glass_door"), "tall_macaw_metal_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_JAIL, new ResourceLocation("mcwdoors", "jail_door"), "tall_macaw_metal_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_METAL, new ResourceLocation("mcwdoors", "metal_door"), "tall_macaw_metal_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_METAL_HOSPITAL, new ResourceLocation("mcwdoors", "metal_hospital_door"), "tall_macaw_metal_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_METAL_REINFORCED, new ResourceLocation("mcwdoors", "metal_reinforced_door"), "tall_macaw_metal_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_METAL_WARNING, new ResourceLocation("mcwdoors", "metal_warning_door"), "tall_macaw_metal_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_METAL_WINDOWED, new ResourceLocation("mcwdoors", "metal_windowed_door"), "tall_macaw_metal_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_BARN, new ResourceLocation("mcwdoors", "oak_barn_door"), "tall_macaw_barn_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_BARN, new ResourceLocation("mcwdoors", "spruce_barn_door"), "tall_macaw_barn_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_BARN, new ResourceLocation("mcwdoors", "birch_barn_door"), "tall_macaw_barn_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_BARN, new ResourceLocation("mcwdoors", "jungle_barn_door"), "tall_macaw_barn_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_BARN, new ResourceLocation("mcwdoors", "acacia_barn_door"), "tall_macaw_barn_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_BARN, new ResourceLocation("mcwdoors", "dark_oak_barn_door"), "tall_macaw_barn_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_MANGROVE_BARN, new ResourceLocation("mcwdoors", "mangrove_barn_door"), "tall_macaw_barn_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BAMBOO_BARN, new ResourceLocation("mcwdoors", "bamboo_barn_door"), "tall_macaw_barn_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_BARN, new ResourceLocation("mcwdoors", "crimson_barn_door"), "tall_macaw_barn_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_BARN, new ResourceLocation("mcwdoors", "warped_barn_door"), "tall_macaw_barn_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_BARN_GLASS, new ResourceLocation("mcwdoors", "oak_barn_glass_door"), "tall_macaw_barn_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_BARN_GLASS, new ResourceLocation("mcwdoors", "spruce_barn_glass_door"), "tall_macaw_barn_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_BARN_GLASS, new ResourceLocation("mcwdoors", "birch_barn_glass_door"), "tall_macaw_barn_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_BARN_GLASS, new ResourceLocation("mcwdoors", "jungle_barn_glass_door"), "tall_macaw_barn_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_BARN_GLASS, new ResourceLocation("mcwdoors", "acacia_barn_glass_door"), "tall_macaw_barn_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_BARN_GLASS, new ResourceLocation("mcwdoors", "dark_oak_barn_glass_door"), "tall_macaw_barn_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_MANGROVE_BARN_GLASS, new ResourceLocation("mcwdoors", "mangrove_barn_glass_door"), "tall_macaw_barn_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BAMBOO_BARN_GLASS, new ResourceLocation("mcwdoors", "bamboo_barn_glass_door"), "tall_macaw_barn_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_BARN_GLASS, new ResourceLocation("mcwdoors", "crimson_barn_glass_door"), "tall_macaw_barn_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_BARN_GLASS, new ResourceLocation("mcwdoors", "warped_barn_glass_door"), "tall_macaw_barn_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_STABLE, new ResourceLocation("mcwdoors", "oak_stable_door"), "tall_macaw_stable_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_STABLE, new ResourceLocation("mcwdoors", "spruce_stable_door"), "tall_macaw_stable_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_STABLE, new ResourceLocation("mcwdoors", "birch_stable_door"), "tall_macaw_stable_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_STABLE, new ResourceLocation("mcwdoors", "jungle_stable_door"), "tall_macaw_stable_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_STABLE, new ResourceLocation("mcwdoors", "acacia_stable_door"), "tall_macaw_stable_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_STABLE, new ResourceLocation("mcwdoors", "dark_oak_stable_door"), "tall_macaw_stable_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_MANGROVE_STABLE, new ResourceLocation("mcwdoors", "mangrove_stable_door"), "tall_macaw_stable_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BAMBOO_STABLE, new ResourceLocation("mcwdoors", "bamboo_stable_door"), "tall_macaw_stable_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_STABLE, new ResourceLocation("mcwdoors", "crimson_stable_door"), "tall_macaw_stable_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_STABLE, new ResourceLocation("mcwdoors", "warped_stable_door"), "tall_macaw_stable_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_STABLE_HEAD, new ResourceLocation("mcwdoors", "oak_stable_head_door"), "tall_macaw_stable_head_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_STABLE_HEAD, new ResourceLocation("mcwdoors", "spruce_stable_head_door"), "tall_macaw_stable_head_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_STABLE_HEAD, new ResourceLocation("mcwdoors", "birch_stable_head_door"), "tall_macaw_stable_head_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_STABLE_HEAD, new ResourceLocation("mcwdoors", "jungle_stable_head_door"), "tall_macaw_stable_head_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_STABLE_HEAD, new ResourceLocation("mcwdoors", "acacia_stable_head_door"), "tall_macaw_stable_head_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_STABLE_HEAD, new ResourceLocation("mcwdoors", "dark_oak_stable_head_door"), "tall_macaw_stable_head_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_MANGROVE_STABLE_HEAD, new ResourceLocation("mcwdoors", "mangrove_stable_head_door"), "tall_macaw_stable_head_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BAMBOO_STABLE_HEAD, new ResourceLocation("mcwdoors", "bamboo_stable_head_door"), "tall_macaw_stable_head_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_STABLE_HEAD, new ResourceLocation("mcwdoors", "crimson_stable_head_door"), "tall_macaw_stable_head_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_STABLE_HEAD, new ResourceLocation("mcwdoors", "warped_stable_head_door"), "tall_macaw_stable_head_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_BARK_GLASS, new ResourceLocation("mcwdoors", "oak_bark_glass_door"), "tall_macaw_bark_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_BARK_GLASS, new ResourceLocation("mcwdoors", "spruce_bark_glass_door"), "tall_macaw_bark_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_BARK_GLASS, new ResourceLocation("mcwdoors", "birch_bark_glass_door"), "tall_macaw_bark_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_BARK_GLASS, new ResourceLocation("mcwdoors", "jungle_bark_glass_door"), "tall_macaw_bark_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_BARK_GLASS, new ResourceLocation("mcwdoors", "acacia_bark_glass_door"), "tall_macaw_bark_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_BARK_GLASS, new ResourceLocation("mcwdoors", "dark_oak_bark_glass_door"), "tall_macaw_bark_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_MANGROVE_BARK_GLASS, new ResourceLocation("mcwdoors", "mangrove_bark_glass_door"), "tall_macaw_bark_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BAMBOO_BARK_GLASS, new ResourceLocation("mcwdoors", "bamboo_bark_glass_door"), "tall_macaw_bark_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_STEM_GLASS, new ResourceLocation("mcwdoors", "crimson_stem_glass_door"), "tall_macaw_bark_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_STEM_GLASS, new ResourceLocation("mcwdoors", "warped_stem_glass_door"), "tall_macaw_bark_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_GLASS, new ResourceLocation("mcwdoors", "oak_glass_door"), "tall_macaw_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_GLASS, new ResourceLocation("mcwdoors", "spruce_glass_door"), "tall_macaw_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_GLASS, new ResourceLocation("mcwdoors", "birch_glass_door"), "tall_macaw_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_GLASS, new ResourceLocation("mcwdoors", "jungle_glass_door"), "tall_macaw_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_GLASS, new ResourceLocation("mcwdoors", "acacia_glass_door"), "tall_macaw_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_GLASS, new ResourceLocation("mcwdoors", "dark_oak_glass_door"), "tall_macaw_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_MANGROVE_GLASS, new ResourceLocation("mcwdoors", "mangrove_glass_door"), "tall_macaw_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BAMBOO_GLASS, new ResourceLocation("mcwdoors", "bamboo_glass_door"), "tall_macaw_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_GLASS, new ResourceLocation("mcwdoors", "crimson_glass_door"), "tall_macaw_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_GLASS, new ResourceLocation("mcwdoors", "warped_glass_door"), "tall_macaw_glass_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_MODERN, new ResourceLocation("mcwdoors", "oak_modern_door"), "tall_macaw_modern_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_MODERN, new ResourceLocation("mcwdoors", "spruce_modern_door"), "tall_macaw_modern_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_MODERN, new ResourceLocation("mcwdoors", "birch_modern_door"), "tall_macaw_modern_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_MODERN, new ResourceLocation("mcwdoors", "jungle_modern_door"), "tall_macaw_modern_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_MODERN, new ResourceLocation("mcwdoors", "acacia_modern_door"), "tall_macaw_modern_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_MODERN, new ResourceLocation("mcwdoors", "dark_oak_modern_door"), "tall_macaw_modern_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_MANGROVE_MODERN, new ResourceLocation("mcwdoors", "mangrove_modern_door"), "tall_macaw_modern_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BAMBOO_MODERN, new ResourceLocation("mcwdoors", "bamboo_modern_door"), "tall_macaw_modern_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_MODERN, new ResourceLocation("mcwdoors", "crimson_modern_door"), "tall_macaw_modern_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_MODERN, new ResourceLocation("mcwdoors", "warped_modern_door"), "tall_macaw_modern_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_JAPANESE, new ResourceLocation("mcwdoors", "oak_japanese_door"), "tall_macaw_japanese_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_JAPANESE, new ResourceLocation("mcwdoors", "spruce_japanese_door"), "tall_macaw_japanese_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_JAPANESE, new ResourceLocation("mcwdoors", "birch_japanese_door"), "tall_macaw_japanese_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_JAPANESE, new ResourceLocation("mcwdoors", "jungle_japanese_door"), "tall_macaw_japanese_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_JAPANESE, new ResourceLocation("mcwdoors", "acacia_japanese_door"), "tall_macaw_japanese_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_JAPANESE, new ResourceLocation("mcwdoors", "dark_oak_japanese_door"), "tall_macaw_japanese_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_MANGROVE_JAPANESE, new ResourceLocation("mcwdoors", "mangrove_japanese_door"), "tall_macaw_japanese_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BAMBOO_JAPANESE, new ResourceLocation("mcwdoors", "bamboo_japanese_door"), "tall_macaw_japanese_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_JAPANESE, new ResourceLocation("mcwdoors", "crimson_japanese_door"), "tall_macaw_japanese_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_JAPANESE, new ResourceLocation("mcwdoors", "warped_japanese_door"), "tall_macaw_japanese_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_JAPANESE2, new ResourceLocation("mcwdoors", "oak_japanese2_door"), "tall_macaw_japanese2_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_JAPANESE2, new ResourceLocation("mcwdoors", "spruce_japanese2_door"), "tall_macaw_japanese2_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_JAPANESE2, new ResourceLocation("mcwdoors", "birch_japanese2_door"), "tall_macaw_japanese2_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_JAPANESE2, new ResourceLocation("mcwdoors", "jungle_japanese2_door"), "tall_macaw_japanese2_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_JAPANESE2, new ResourceLocation("mcwdoors", "acacia_japanese2_door"), "tall_macaw_japanese2_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_JAPANESE2, new ResourceLocation("mcwdoors", "dark_oak_japanese2_door"), "tall_macaw_japanese2_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_MANGROVE_JAPANESE2, new ResourceLocation("mcwdoors", "mangrove_japanese2_door"), "tall_macaw_japanese2_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BAMBOO_JAPANESE2, new ResourceLocation("mcwdoors", "bamboo_japanese2_door"), "tall_macaw_japanese2_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_JAPANESE2, new ResourceLocation("mcwdoors", "crimson_japanese2_door"), "tall_macaw_japanese2_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_JAPANESE2, new ResourceLocation("mcwdoors", "warped_japanese2_door"), "tall_macaw_japanese2_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_CLASSIC, new ResourceLocation("mcwdoors", "spruce_classic_door"), "tall_macaw_classic_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_CLASSIC, new ResourceLocation("mcwdoors", "birch_classic_door"), "tall_macaw_classic_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_CLASSIC, new ResourceLocation("mcwdoors", "jungle_classic_door"), "tall_macaw_classic_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_CLASSIC, new ResourceLocation("mcwdoors", "acacia_classic_door"), "tall_macaw_classic_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_CLASSIC, new ResourceLocation("mcwdoors", "dark_oak_classic_door"), "tall_macaw_classic_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_MANGROVE_CLASSIC, new ResourceLocation("mcwdoors", "mangrove_classic_door"), "tall_macaw_classic_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BAMBOO_CLASSIC, new ResourceLocation("mcwdoors", "bamboo_classic_door"), "tall_macaw_classic_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_CLASSIC, new ResourceLocation("mcwdoors", "crimson_classic_door"), "tall_macaw_classic_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_CLASSIC, new ResourceLocation("mcwdoors", "warped_classic_door"), "tall_macaw_classic_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_COTTAGE, new ResourceLocation("mcwdoors", "oak_cottage_door"), "tall_macaw_cottage_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_COTTAGE, new ResourceLocation("mcwdoors", "birch_cottage_door"), "tall_macaw_cottage_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_COTTAGE, new ResourceLocation("mcwdoors", "jungle_cottage_door"), "tall_macaw_cottage_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_COTTAGE, new ResourceLocation("mcwdoors", "acacia_cottage_door"), "tall_macaw_cottage_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_COTTAGE, new ResourceLocation("mcwdoors", "dark_oak_cottage_door"), "tall_macaw_cottage_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_MANGROVE_COTTAGE, new ResourceLocation("mcwdoors", "mangrove_cottage_door"), "tall_macaw_cottage_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BAMBOO_COTTAGE, new ResourceLocation("mcwdoors", "bamboo_cottage_door"), "tall_macaw_cottage_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_COTTAGE, new ResourceLocation("mcwdoors", "crimson_cottage_door"), "tall_macaw_cottage_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_COTTAGE, new ResourceLocation("mcwdoors", "warped_cottage_door"), "tall_macaw_cottage_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_PAPER, new ResourceLocation("mcwdoors", "oak_paper_door"), "tall_macaw_paper_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_PAPER, new ResourceLocation("mcwdoors", "spruce_paper_door"), "tall_macaw_paper_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_PAPER, new ResourceLocation("mcwdoors", "jungle_paper_door"), "tall_macaw_paper_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_PAPER, new ResourceLocation("mcwdoors", "acacia_paper_door"), "tall_macaw_paper_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_PAPER, new ResourceLocation("mcwdoors", "dark_oak_paper_door"), "tall_macaw_paper_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_MANGROVE_PAPER, new ResourceLocation("mcwdoors", "mangrove_paper_door"), "tall_macaw_paper_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BAMBOO_PAPER, new ResourceLocation("mcwdoors", "bamboo_paper_door"), "tall_macaw_paper_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_PAPER, new ResourceLocation("mcwdoors", "crimson_paper_door"), "tall_macaw_paper_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_PAPER, new ResourceLocation("mcwdoors", "warped_paper_door"), "tall_macaw_paper_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_BEACH, new ResourceLocation("mcwdoors", "oak_beach_door"), "tall_macaw_beach_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_BEACH, new ResourceLocation("mcwdoors", "spruce_beach_door"), "tall_macaw_beach_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_BEACH, new ResourceLocation("mcwdoors", "birch_beach_door"), "tall_macaw_beach_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_BEACH, new ResourceLocation("mcwdoors", "acacia_beach_door"), "tall_macaw_beach_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_BEACH, new ResourceLocation("mcwdoors", "dark_oak_beach_door"), "tall_macaw_beach_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_MANGROVE_BEACH, new ResourceLocation("mcwdoors", "mangrove_beach_door"), "tall_macaw_beach_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BAMBOO_BEACH, new ResourceLocation("mcwdoors", "bamboo_beach_door"), "tall_macaw_beach_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_BEACH, new ResourceLocation("mcwdoors", "crimson_beach_door"), "tall_macaw_beach_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_BEACH, new ResourceLocation("mcwdoors", "warped_beach_door"), "tall_macaw_beach_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_TROPICAL, new ResourceLocation("mcwdoors", "oak_tropical_door"), "tall_macaw_tropical_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_TROPICAL, new ResourceLocation("mcwdoors", "spruce_tropical_door"), "tall_macaw_tropical_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_TROPICAL, new ResourceLocation("mcwdoors", "birch_tropical_door"), "tall_macaw_tropical_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_TROPICAL, new ResourceLocation("mcwdoors", "jungle_tropical_door"), "tall_macaw_tropical_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_TROPICAL, new ResourceLocation("mcwdoors", "dark_oak_tropical_door"), "tall_macaw_tropical_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_MANGROVE_TROPICAL, new ResourceLocation("mcwdoors", "mangrove_tropical_door"), "tall_macaw_tropical_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BAMBOO_TROPICAL, new ResourceLocation("mcwdoors", "bamboo_tropical_door"), "tall_macaw_tropical_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_TROPICAL, new ResourceLocation("mcwdoors", "crimson_tropical_door"), "tall_macaw_tropical_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_TROPICAL, new ResourceLocation("mcwdoors", "warped_tropical_door"), "tall_macaw_tropical_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_FOUR_PANEL, new ResourceLocation("mcwdoors", "oak_four_panel_door"), "tall_macaw_four_panel_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_FOUR_PANEL, new ResourceLocation("mcwdoors", "spruce_four_panel_door"), "tall_macaw_four_panel_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_FOUR_PANEL, new ResourceLocation("mcwdoors", "birch_four_panel_door"), "tall_macaw_four_panel_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_FOUR_PANEL, new ResourceLocation("mcwdoors", "jungle_four_panel_door"), "tall_macaw_four_panel_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_FOUR_PANEL, new ResourceLocation("mcwdoors", "acacia_four_panel_door"), "tall_macaw_four_panel_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_MANGROVE_FOUR_PANEL, new ResourceLocation("mcwdoors", "mangrove_four_panel_door"), "tall_macaw_four_panel_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BAMBOO_FOUR_PANEL, new ResourceLocation("mcwdoors", "bamboo_four_panel_door"), "tall_macaw_four_panel_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_FOUR_PANEL, new ResourceLocation("mcwdoors", "crimson_four_panel_door"), "tall_macaw_four_panel_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_FOUR_PANEL, new ResourceLocation("mcwdoors", "warped_four_panel_door"), "tall_macaw_four_panel_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_SWAMP, new ResourceLocation("mcwdoors", "oak_swamp_door"), "tall_macaw_swamp_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_SWAMP, new ResourceLocation("mcwdoors", "spruce_swamp_door"), "tall_macaw_swamp_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_SWAMP, new ResourceLocation("mcwdoors", "birch_swamp_door"), "tall_macaw_swamp_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_SWAMP, new ResourceLocation("mcwdoors", "jungle_swamp_door"), "tall_macaw_swamp_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_SWAMP, new ResourceLocation("mcwdoors", "acacia_swamp_door"), "tall_macaw_swamp_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_SWAMP, new ResourceLocation("mcwdoors", "dark_oak_swamp_door"), "tall_macaw_swamp_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BAMBOO_SWAMP, new ResourceLocation("mcwdoors", "bamboo_swamp_door"), "tall_macaw_swamp_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_SWAMP, new ResourceLocation("mcwdoors", "crimson_swamp_door"), "tall_macaw_swamp_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_SWAMP, new ResourceLocation("mcwdoors", "warped_swamp_door"), "tall_macaw_swamp_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_BAMBOO, new ResourceLocation("mcwdoors", "oak_bamboo_door"), "tall_macaw_bamboo_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_BAMBOO, new ResourceLocation("mcwdoors", "spruce_bamboo_door"), "tall_macaw_bamboo_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_BAMBOO, new ResourceLocation("mcwdoors", "birch_bamboo_door"), "tall_macaw_bamboo_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_BAMBOO, new ResourceLocation("mcwdoors", "jungle_bamboo_door"), "tall_macaw_bamboo_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_BAMBOO, new ResourceLocation("mcwdoors", "acacia_bamboo_door"), "tall_macaw_bamboo_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_BAMBOO, new ResourceLocation("mcwdoors", "dark_oak_bamboo_door"), "tall_macaw_bamboo_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_MANGROVE_BAMBOO, new ResourceLocation("mcwdoors", "mangrove_bamboo_door"), "tall_macaw_bamboo_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_BAMBOO, new ResourceLocation("mcwdoors", "crimson_bamboo_door"), "tall_macaw_bamboo_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_BAMBOO, new ResourceLocation("mcwdoors", "warped_bamboo_door"), "tall_macaw_bamboo_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_NETHER, new ResourceLocation("mcwdoors", "oak_nether_door"), "tall_macaw_nether_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_NETHER, new ResourceLocation("mcwdoors", "spruce_nether_door"), "tall_macaw_nether_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_NETHER, new ResourceLocation("mcwdoors", "birch_nether_door"), "tall_macaw_nether_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_NETHER, new ResourceLocation("mcwdoors", "jungle_nether_door"), "tall_macaw_nether_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_NETHER, new ResourceLocation("mcwdoors", "acacia_nether_door"), "tall_macaw_nether_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_NETHER, new ResourceLocation("mcwdoors", "dark_oak_nether_door"), "tall_macaw_nether_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_MANGROVE_NETHER, new ResourceLocation("mcwdoors", "mangrove_nether_door"), "tall_macaw_nether_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BAMBOO_NETHER, new ResourceLocation("mcwdoors", "bamboo_nether_door"), "tall_macaw_nether_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_NETHER, new ResourceLocation("mcwdoors", "warped_nether_door"), "tall_macaw_nether_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_MYSTIC, new ResourceLocation("mcwdoors", "oak_mystic_door"), "tall_macaw_mystic_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_MYSTIC, new ResourceLocation("mcwdoors", "spruce_mystic_door"), "tall_macaw_mystic_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_MYSTIC, new ResourceLocation("mcwdoors", "birch_mystic_door"), "tall_macaw_mystic_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_MYSTIC, new ResourceLocation("mcwdoors", "jungle_mystic_door"), "tall_macaw_mystic_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_MYSTIC, new ResourceLocation("mcwdoors", "acacia_mystic_door"), "tall_macaw_mystic_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_MYSTIC, new ResourceLocation("mcwdoors", "dark_oak_mystic_door"), "tall_macaw_mystic_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_MANGROVE_MYSTIC, new ResourceLocation("mcwdoors", "mangrove_mystic_door"), "tall_macaw_mystic_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_BAMBOO_MYSTIC, new ResourceLocation("mcwdoors", "bamboo_mystic_door"), "tall_macaw_mystic_door");
			createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_MYSTIC, new ResourceLocation("mcwdoors", "crimson_mystic_door"), "tall_macaw_mystic_door");
		}
	}
	
	private static JsonObject createShortDoorRecipeJson(String recipeID, ResourceLocation baseDoor) {
		 JsonObject json = createStonecutterRecipeJson(new ResourceLocation(baseDoor.getNamespace(), baseDoor.getPath()), new ResourceLocation("dramaticdoors:" + recipeID));
		 SHORT_DOOR_RECIPES.add(json);
		 return json;
	}
	
	private static JsonObject createTallDoorRecipeJson(String recipeID, ResourceLocation baseDoor, @Nullable String group) {
		 JsonObject json = createShapedRecipeJson(
                    Lists.newArrayList('#'), //The keys we are using for the input items/tags.
                    Lists.newArrayList(new ResourceLocation(baseDoor.getNamespace(), baseDoor.getPath())), //The items/tags we are using as input.
                    Lists.newArrayList("item"), //Whether the input we provided is a tag or an item.
                    Lists.newArrayList("#", "#", "#"), //The crafting pattern.
                    new ResourceLocation("dramaticdoors:" + recipeID), group //The crafting output
                );
		 TALL_DOOR_RECIPES.add(json);
		 return json;
	}
	
    public static JsonObject createShapedRecipeJson(ArrayList<Character> keys, ArrayList<ResourceLocation> items, ArrayList<String> type, ArrayList<String> pattern, ResourceLocation output, @Nullable String group) {
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
    
    public static JsonObject createStonecutterRecipeJson(ResourceLocation input, ResourceLocation output) {
        //Creating a new json object, where we will store our recipe.
        JsonObject json = new JsonObject();
        //The "type" of the recipe we are creating. In this case, a stonecutting recipe.
        json.addProperty("type", "minecraft:stonecutting");
        //Add ingredients that will be the input.
        JsonObject ingredient = new JsonObject();
        ingredient.addProperty("item", input.toString());
        json.add("ingredient", ingredient);
        //Add output.
        json.addProperty("result", output.toString());
        json.addProperty("count", 2);
        return json;
    }
}
