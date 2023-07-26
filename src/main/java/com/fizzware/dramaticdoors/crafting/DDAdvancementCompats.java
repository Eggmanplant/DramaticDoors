package com.fizzware.dramaticdoors.crafting;

import java.util.ArrayList;
import java.util.List;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DramaticDoors;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.ResourceLocation;

public class DDAdvancementCompats
{
	// The list of recipe advancements that will be filled out.
	public static List<JsonObject> RECIPE_ADVANCEMENTS = new ArrayList<JsonObject>();

	public static void initializeAdvancements() {
		if (FabricLoader.getInstance().isModLoaded("horizons")) {
			createRecipeAdvancementJson(DDNames.SHORT_JACARANDA, new ResourceLocation("horizons", "jacaranda_door"));
			createRecipeAdvancementJson(DDNames.SHORT_REDBUD, new ResourceLocation("horizons", "redbud_door"));
			createRecipeAdvancementJson(DDNames.SHORT_CYPRESS, new ResourceLocation("horizons", "cypress_door"));
			createRecipeAdvancementJson(DDNames.TALL_JACARANDA, new ResourceLocation("horizons", "jacaranda_door"));
			createRecipeAdvancementJson(DDNames.TALL_REDBUD, new ResourceLocation("horizons", "redbud_door"));
			createRecipeAdvancementJson(DDNames.TALL_CYPRESS, new ResourceLocation("horizons", "cypress_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("enhanced_mushrooms")) {
			createRecipeAdvancementJson(DDNames.SHORT_BROWN_MUSHROOM, new ResourceLocation("enhanced_mushrooms", "brown_mushroom_door"));
			createRecipeAdvancementJson(DDNames.SHORT_RED_MUSHROOM, new ResourceLocation("enhanced_mushrooms", "red_mushroom_door"));
			createRecipeAdvancementJson(DDNames.TALL_BROWN_MUSHROOM, new ResourceLocation("enhanced_mushrooms", "brown_mushroom_door"));
			createRecipeAdvancementJson(DDNames.TALL_RED_MUSHROOM, new ResourceLocation("enhanced_mushrooms", "red_mushroom_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("ad_astra")) {
			createRecipeAdvancementJson(DDNames.SHORT_AERONOS, new ResourceLocation("ad_astra", "aeronos_door"));
			createRecipeAdvancementJson(DDNames.SHORT_GLACIAN, new ResourceLocation("ad_astra", "glacian_door"));
			createRecipeAdvancementJson(DDNames.SHORT_STROPHAR, new ResourceLocation("ad_astra", "strophar_door"));
			createRecipeAdvancementJson(DDNames.SHORT_STEEL, new ResourceLocation("ad_astra", "steel_door"));
			createRecipeAdvancementJson(DDNames.TALL_AERONOS, new ResourceLocation("ad_astra", "aeronos_door"));
			createRecipeAdvancementJson(DDNames.TALL_GLACIAN, new ResourceLocation("ad_astra", "glacian_door"));
			createRecipeAdvancementJson(DDNames.TALL_STROPHAR, new ResourceLocation("ad_astra", "strophar_door"));
			createRecipeAdvancementJson(DDNames.TALL_STEEL, new ResourceLocation("ad_astra", "steel_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("aether")) {
			createRecipeAdvancementJson(DDNames.SHORT_AETHER_SKYROOT, new ResourceLocation("aether", "skyroot_door"));
			createRecipeAdvancementJson(DDNames.TALL_AETHER_SKYROOT, new ResourceLocation("aether", "skyroot_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("architects_palette")) {
			createRecipeAdvancementJson(DDNames.SHORT_TWISTED, new ResourceLocation("architects_palette", "twisted_door"));
			createRecipeAdvancementJson(DDNames.TALL_TWISTED, new ResourceLocation("architects_palette", "twisted_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("bambooeverything")) {
			createRecipeAdvancementJson(DDNames.SHORT_BE_BAMBOO, new ResourceLocation("bambooeverything", "bamboo_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BE_DRY_BAMBOO, new ResourceLocation("bambooeverything", "dry_bamboo_door"));
			createRecipeAdvancementJson(DDNames.TALL_BE_BAMBOO, new ResourceLocation("bambooeverything", "bamboo_door"));
			createRecipeAdvancementJson(DDNames.TALL_BE_DRY_BAMBOO, new ResourceLocation("bambooeverything", "dry_bamboo_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("betterend")) {
			createRecipeAdvancementJson(DDNames.SHORT_TERMINITE, new ResourceLocation("betterend", "terminite_door"));
			createRecipeAdvancementJson(DDNames.SHORT_THALLASIUM, new ResourceLocation("betterend", "thallasium_door"));
			createRecipeAdvancementJson(DDNames.SHORT_DRAGON_TREE, new ResourceLocation("betterend", "dragon_tree_door"));
			createRecipeAdvancementJson(DDNames.SHORT_END_LOTUS, new ResourceLocation("betterend", "end_lotus_door"));
			createRecipeAdvancementJson(DDNames.SHORT_HELIX_TREE, new ResourceLocation("betterend", "helix_tree_door"));
			createRecipeAdvancementJson(DDNames.SHORT_JELLYSHROOM, new ResourceLocation("betterend", "jellyshroom_door"));
			createRecipeAdvancementJson(DDNames.SHORT_LACUGROVE, new ResourceLocation("betterend", "lacugrove_door"));
			createRecipeAdvancementJson(DDNames.SHORT_LUCERNIA, new ResourceLocation("betterend", "lucernia_door"));
			createRecipeAdvancementJson(DDNames.SHORT_MOSSY_GLOWSHROOM, new ResourceLocation("betterend", "mossy_glowshroom_door"));
			createRecipeAdvancementJson(DDNames.SHORT_PYTHADENDRON, new ResourceLocation("betterend", "pythadendron_door"));
			createRecipeAdvancementJson(DDNames.SHORT_TENANEA, new ResourceLocation("betterend", "tenanea_door"));
			createRecipeAdvancementJson(DDNames.SHORT_UMBRELLA_TREE, new ResourceLocation("betterend", "umbrella_tree_door"));
			createRecipeAdvancementJson(DDNames.TALL_TERMINITE, new ResourceLocation("betterend", "terminite_door"));
			createRecipeAdvancementJson(DDNames.TALL_THALLASIUM, new ResourceLocation("betterend", "thallasium_door"));
			createRecipeAdvancementJson(DDNames.TALL_DRAGON_TREE, new ResourceLocation("betterend", "dragon_tree_door"));
			createRecipeAdvancementJson(DDNames.TALL_END_LOTUS, new ResourceLocation("betterend", "end_lotus_door"));
			createRecipeAdvancementJson(DDNames.TALL_HELIX_TREE, new ResourceLocation("betterend", "helix_tree_door"));
			createRecipeAdvancementJson(DDNames.TALL_JELLYSHROOM, new ResourceLocation("betterend", "jellyshroom_door"));
			createRecipeAdvancementJson(DDNames.TALL_LACUGROVE, new ResourceLocation("betterend", "lacugrove_door"));
			createRecipeAdvancementJson(DDNames.TALL_LUCERNIA, new ResourceLocation("betterend", "lucernia_door"));
			createRecipeAdvancementJson(DDNames.TALL_MOSSY_GLOWSHROOM, new ResourceLocation("betterend", "mossy_glowshroom_door"));
			createRecipeAdvancementJson(DDNames.TALL_PYTHADENDRON, new ResourceLocation("betterend", "pythadendron_door"));
			createRecipeAdvancementJson(DDNames.TALL_TENANEA, new ResourceLocation("betterend", "tenanea_door"));
			createRecipeAdvancementJson(DDNames.TALL_UMBRELLA_TREE, new ResourceLocation("betterend", "umbrella_tree_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("betternether")) {
			createRecipeAdvancementJson(DDNames.SHORT_ANCHOR_TREE, new ResourceLocation("betternether", "anchor_tree_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BONE_CIN, new ResourceLocation("betternether", "bone_cincinnasite_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BONE_REED, new ResourceLocation("betternether", "bone_reed_door"));
			createRecipeAdvancementJson(DDNames.SHORT_MUSHROOM_FIR, new ResourceLocation("betternether", "mushroom_fir_door"));
			createRecipeAdvancementJson(DDNames.SHORT_NETHER_MUSHROOM, new ResourceLocation("betternether", "nether_mushroom_door"));
			createRecipeAdvancementJson(DDNames.SHORT_NETHER_REED, new ResourceLocation("betternether", "nether_reed_door"));
			createRecipeAdvancementJson(DDNames.SHORT_NETHER_SAKURA, new ResourceLocation("betternether", "nether_sakura_door"));
			createRecipeAdvancementJson(DDNames.SHORT_RUBEUS, new ResourceLocation("betternether", "rubeus_door"));
			createRecipeAdvancementJson(DDNames.SHORT_STALAGNATE, new ResourceLocation("betternether", "stalagnate_door"));
			createRecipeAdvancementJson(DDNames.SHORT_WART, new ResourceLocation("betternether", "wart_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BN_WILLOW, new ResourceLocation("betternether", "willow_door"));
			createRecipeAdvancementJson(DDNames.TALL_ANCHOR_TREE, new ResourceLocation("betternether", "anchor_tree_door"));
			createRecipeAdvancementJson(DDNames.TALL_BONE_CIN, new ResourceLocation("betternether", "bone_cincinnasite_door"));
			createRecipeAdvancementJson(DDNames.TALL_BONE_REED, new ResourceLocation("betternether", "bone_reed_door"));
			createRecipeAdvancementJson(DDNames.TALL_MUSHROOM_FIR, new ResourceLocation("betternether", "mushroom_fir_door"));
			createRecipeAdvancementJson(DDNames.TALL_NETHER_MUSHROOM, new ResourceLocation("betternether", "nether_mushroom_door"));
			createRecipeAdvancementJson(DDNames.TALL_NETHER_REED, new ResourceLocation("betternether", "nether_reed_door"));
			createRecipeAdvancementJson(DDNames.TALL_NETHER_SAKURA, new ResourceLocation("betternether", "nether_sakura_door"));
			createRecipeAdvancementJson(DDNames.TALL_RUBEUS, new ResourceLocation("betternether", "rubeus_door"));
			createRecipeAdvancementJson(DDNames.TALL_STALAGNATE, new ResourceLocation("betternether", "stalagnate_door"));
			createRecipeAdvancementJson(DDNames.TALL_WART, new ResourceLocation("betternether", "wart_door"));
			createRecipeAdvancementJson(DDNames.TALL_BN_WILLOW, new ResourceLocation("betternether", "willow_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("bewitchment")) {
			createRecipeAdvancementJson(DDNames.SHORT_CYPRESS, new ResourceLocation("bewitchment", "cypress_door"));
			createRecipeAdvancementJson(DDNames.SHORT_DRAGONS_BLOOD, new ResourceLocation("bewitchment", "dragons_blood_door"));
			createRecipeAdvancementJson(DDNames.SHORT_ELDER, new ResourceLocation("bewitchment", "elder_door"));
			createRecipeAdvancementJson(DDNames.SHORT_JUNIPER, new ResourceLocation("bewitchment", "juniper_door"));
			createRecipeAdvancementJson(DDNames.TALL_CYPRESS, new ResourceLocation("bewitchment", "cypress_door"));
			createRecipeAdvancementJson(DDNames.TALL_DRAGONS_BLOOD, new ResourceLocation("bewitchment", "dragons_blood_door"));
			createRecipeAdvancementJson(DDNames.TALL_ELDER, new ResourceLocation("bewitchment", "elder_door"));
			createRecipeAdvancementJson(DDNames.TALL_JUNIPER, new ResourceLocation("bewitchment", "juniper_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("bwplus")) {
			createRecipeAdvancementJson(DDNames.SHORT_YEW, new ResourceLocation("bwplus", "yew_door"));
			createRecipeAdvancementJson(DDNames.TALL_YEW, new ResourceLocation("bwplus", "yew_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("biomancy")) {
			createRecipeAdvancementJson(DDNames.SHORT_FLESH, new ResourceLocation("biomancy", "flesh_door"));
			createRecipeAdvancementJson(DDNames.SHORT_FULL_FLESH, new ResourceLocation("biomancy", "full_flesh_door"));
			createRecipeAdvancementJson(DDNames.SHORT_FLESHKIN, new ResourceLocation("biomancy", "fleshkin_door"));
			createRecipeAdvancementJson(DDNames.TALL_FLESH, new ResourceLocation("biomancy", "flesh_door"));
			createRecipeAdvancementJson(DDNames.TALL_FULL_FLESH, new ResourceLocation("biomancy", "full_flesh_door"));
			createRecipeAdvancementJson(DDNames.TALL_FLESHKIN, new ResourceLocation("biomancy", "fleshkin_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("biomemakeover")) {
			createRecipeAdvancementJson(DDNames.SHORT_BM_ANCIENT_OAK, new ResourceLocation("biomemakeover", "ancient_oak_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BM_BLIGHTED_BALSA, new ResourceLocation("biomemakeover", "blighted_balsa_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BM_SWAMP_CYPRESS, new ResourceLocation("biomemakeover", "swamp_cypress_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BM_WILLOW, new ResourceLocation("biomemakeover", "willow_door"));
			createRecipeAdvancementJson(DDNames.TALL_BM_ANCIENT_OAK, new ResourceLocation("biomemakeover", "ancient_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_BM_BLIGHTED_BALSA, new ResourceLocation("biomemakeover", "blighted_balsa_door"));
			createRecipeAdvancementJson(DDNames.TALL_BM_SWAMP_CYPRESS, new ResourceLocation("biomemakeover", "swamp_cypress_door"));
			createRecipeAdvancementJson(DDNames.TALL_BM_WILLOW, new ResourceLocation("biomemakeover", "willow_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("byg")) {
			createRecipeAdvancementJson(DDNames.SHORT_BYG_ASPEN, new ResourceLocation("byg", "aspen_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BYG_BAOBAB, new ResourceLocation("byg", "baobab_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BYG_BLUE_ENCHANTED, new ResourceLocation("byg", "blue_enchanted_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BYG_BULBIS, new ResourceLocation("byg", "bulbis_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BYG_CHERRY, new ResourceLocation("byg", "cherry_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BYG_CIKA, new ResourceLocation("byg", "cika_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BYG_CYPRESS, new ResourceLocation("byg", "cypress_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BYG_EBONY, new ResourceLocation("byg", "ebony_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BYG_EMBUR, new ResourceLocation("byg", "embur_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BYG_ETHER, new ResourceLocation("byg", "ether_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BYG_FIR, new ResourceLocation("byg", "fir_door"));
			//createRecipeAdvancementJson(DDNames.SHORT_BYG_FLORUS, new ResourceLocation("byg", "florus_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BYG_GREEN_ENCHANTED, new ResourceLocation("byg", "green_enchanted_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BYG_HOLLY, new ResourceLocation("byg", "holly_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BYG_IMPARIUS, new ResourceLocation("byg", "imparius_door"));
			//createRecipeAdvancementJson(DDNames.SHORT_BYG_IRONWOOD, new ResourceLocation("byg", "ironwood_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BYG_JACARANDA, new ResourceLocation("byg", "jacaranda_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BYG_LAMENT, new ResourceLocation("byg", "lament_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BYG_MAHOGANY, new ResourceLocation("byg", "mahogany_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BYG_MAPLE, new ResourceLocation("byg", "maple_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BYG_NIGHTSHADE, new ResourceLocation("byg", "nightshade_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BYG_PALM, new ResourceLocation("byg", "palm_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BYG_PINE, new ResourceLocation("byg", "pine_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BYG_RAINBOW_EUCALYPTUS, new ResourceLocation("byg", "rainbow_eucalyptus_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BYG_REDWOOD, new ResourceLocation("byg", "redwood_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BYG_SKYRIS, new ResourceLocation("byg", "skyris_door"));
			//createRecipeAdvancementJson(DDNames.SHORT_BYG_SOUL_SHROOM, new ResourceLocation("byg", "soul_shroom_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BYG_SYTHIAN, new ResourceLocation("byg", "sythian_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BYG_WHITE_MANGROVE, new ResourceLocation("byg", "white_mangrove_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BYG_WILLOW, new ResourceLocation("byg", "willow_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BYG_WITCH_HAZEL, new ResourceLocation("byg", "witch_hazel_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BYG_ZELKOVA, new ResourceLocation("byg", "zelkova_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_ASPEN, new ResourceLocation("byg", "aspen_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_BAOBAB, new ResourceLocation("byg", "baobab_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_BLUE_ENCHANTED, new ResourceLocation("byg", "blue_enchanted_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_BULBIS, new ResourceLocation("byg", "bulbis_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_CHERRY, new ResourceLocation("byg", "cherry_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_CIKA, new ResourceLocation("byg", "cika_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_CYPRESS, new ResourceLocation("byg", "cypress_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_EBONY, new ResourceLocation("byg", "ebony_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_EMBUR, new ResourceLocation("byg", "embur_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_ETHER, new ResourceLocation("byg", "ether_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_FIR, new ResourceLocation("byg", "fir_door"));
			//createRecipeAdvancementJson(DDNames.TALL_BYG_FLORUS, new ResourceLocation("byg", "florus_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_GREEN_ENCHANTED, new ResourceLocation("byg", "green_enchanted_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_HOLLY, new ResourceLocation("byg", "holly_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_IMPARIUS, new ResourceLocation("byg", "imparius_door"));
			//createRecipeAdvancementJson(DDNames.TALL_BYG_IRONWOOD, new ResourceLocation("byg", "ironwood_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_JACARANDA, new ResourceLocation("byg", "jacaranda_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_LAMENT, new ResourceLocation("byg", "lament_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_MAHOGANY, new ResourceLocation("byg", "mahogany_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_MAPLE, new ResourceLocation("byg", "maple_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_NIGHTSHADE, new ResourceLocation("byg", "nightshade_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_PALM, new ResourceLocation("byg", "palm_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_PINE, new ResourceLocation("byg", "pine_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_RAINBOW_EUCALYPTUS, new ResourceLocation("byg", "rainbow_eucalyptus_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_REDWOOD, new ResourceLocation("byg", "redwood_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_SKYRIS, new ResourceLocation("byg", "skyris_door"));
			//createRecipeAdvancementJson(DDNames.TALL_BYG_SOUL_SHROOM, new ResourceLocation("byg", "soul_shroom_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_SYTHIAN, new ResourceLocation("byg", "sythian_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_WHITE_MANGROVE, new ResourceLocation("byg", "white_mangrove_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_WILLOW, new ResourceLocation("byg", "willow_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_WITCH_HAZEL, new ResourceLocation("byg", "witch_hazel_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_ZELKOVA, new ResourceLocation("byg", "zelkova_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("blockus")) {
			createRecipeAdvancementJson(DDNames.SHORT_BLOCKUS_BAMBOO, new ResourceLocation("blockus", "bamboo_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BLOCKUS_BLACKSTONE, new ResourceLocation("blockus", "blackstone_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BLOCKUS_CHARRED, new ResourceLocation("blockus", "charred_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BLOCKUS_OBSIDIAN_REINFORCED, new ResourceLocation("blockus", "obsidian_reinforced_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BLOCKUS_PAPER, new ResourceLocation("blockus", "paper_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BLOCKUS_STONE, new ResourceLocation("blockus", "stone_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BLOCKUS_WHITE_OAK, new ResourceLocation("blockus", "white_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_BLOCKUS_BAMBOO, new ResourceLocation("blockus", "bamboo_door"));
			createRecipeAdvancementJson(DDNames.TALL_BLOCKUS_BLACKSTONE, new ResourceLocation("blockus", "blackstone_door"));
			createRecipeAdvancementJson(DDNames.TALL_BLOCKUS_CHARRED, new ResourceLocation("blockus", "charred_door"));
			createRecipeAdvancementJson(DDNames.TALL_BLOCKUS_OBSIDIAN_REINFORCED, new ResourceLocation("blockus", "obsidian_reinforced_door"));
			createRecipeAdvancementJson(DDNames.TALL_BLOCKUS_PAPER, new ResourceLocation("blockus", "paper_door"));
			createRecipeAdvancementJson(DDNames.TALL_BLOCKUS_STONE, new ResourceLocation("blockus", "stone_door"));
			createRecipeAdvancementJson(DDNames.TALL_BLOCKUS_WHITE_OAK, new ResourceLocation("blockus", "white_oak_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("ceilands")) {
			createRecipeAdvancementJson(DDNames.SHORT_CEILTRUNK, new ResourceLocation("ceilands", "ceiltrunk_door"));
			createRecipeAdvancementJson(DDNames.SHORT_LUZAWOOD, new ResourceLocation("ceilands", "luzawood_door"));
			createRecipeAdvancementJson(DDNames.TALL_CEILTRUNK, new ResourceLocation("ceilands", "ceiltrunk_door"));
			createRecipeAdvancementJson(DDNames.TALL_LUZAWOOD, new ResourceLocation("ceilands", "luzawood_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("charm")) {
			createRecipeAdvancementJson(DDNames.SHORT_CHARM_AZALEA, new ResourceLocation("charm", "azalea_door"));
			createRecipeAdvancementJson(DDNames.SHORT_CHARM_EBONY, new ResourceLocation("charm", "ebony_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHARM_AZALEA, new ResourceLocation("charm", "azalea_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHARM_EBONY, new ResourceLocation("charm", "ebony_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("cinderscapes")) {
			createRecipeAdvancementJson(DDNames.SHORT_SCORCHED, new ResourceLocation("cinderscapes", "scorched_door"));
			createRecipeAdvancementJson(DDNames.SHORT_UMBRAL, new ResourceLocation("cinderscapes", "umbral_door"));
			createRecipeAdvancementJson(DDNames.TALL_SCORCHED, new ResourceLocation("cinderscapes", "scorched_door"));
			createRecipeAdvancementJson(DDNames.TALL_UMBRAL, new ResourceLocation("cinderscapes", "umbral_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("cobblemon")) {
			createRecipeAdvancementJson(DDNames.SHORT_APRICORN, new ResourceLocation("cobblemon", "apricorn_door"));
			createRecipeAdvancementJson(DDNames.TALL_APRICORN, new ResourceLocation("cobblemon", "apricorn_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("colorfulazaleas")) {
			createRecipeAdvancementJson(DDNames.SHORT_AZULE_AZALEA, new ResourceLocation("colorfulazaleas", "azule_azalea_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BRIGHT_AZALEA, new ResourceLocation("colorfulazaleas", "bright_azalea_door"));
			createRecipeAdvancementJson(DDNames.SHORT_FISS_AZALEA, new ResourceLocation("colorfulazaleas", "fiss_azalea_door"));
			createRecipeAdvancementJson(DDNames.SHORT_ROZE_AZALEA, new ResourceLocation("colorfulazaleas", "roze_azalea_door"));
			createRecipeAdvancementJson(DDNames.SHORT_TECAL_AZALEA, new ResourceLocation("colorfulazaleas", "tecal_azalea_door"));
			createRecipeAdvancementJson(DDNames.SHORT_TITANIUM_AZALEA, new ResourceLocation("colorfulazaleas", "titanium_azalea_door"));
			createRecipeAdvancementJson(DDNames.SHORT_WALNUT_AZALEA, new ResourceLocation("colorfulazaleas", "walnut_azalea_door"));
			createRecipeAdvancementJson(DDNames.TALL_AZULE_AZALEA, new ResourceLocation("colorfulazaleas", "azule_azalea_door"));
			createRecipeAdvancementJson(DDNames.TALL_BRIGHT_AZALEA, new ResourceLocation("colorfulazaleas", "bright_azalea_door"));
			createRecipeAdvancementJson(DDNames.TALL_FISS_AZALEA, new ResourceLocation("colorfulazaleas", "fiss_azalea_door"));
			createRecipeAdvancementJson(DDNames.TALL_ROZE_AZALEA, new ResourceLocation("colorfulazaleas", "roze_azalea_door"));
			createRecipeAdvancementJson(DDNames.TALL_TECAL_AZALEA, new ResourceLocation("colorfulazaleas", "tecal_azalea_door"));
			createRecipeAdvancementJson(DDNames.TALL_TITANIUM_AZALEA, new ResourceLocation("colorfulazaleas", "titanium_azalea_door"));
			createRecipeAdvancementJson(DDNames.TALL_WALNUT_AZALEA, new ResourceLocation("colorfulazaleas", "walnut_azalea_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("createdeco")) {
			createRecipeAdvancementJson(DDNames.SHORT_ANDESITE, new ResourceLocation("createdeco", "andesite_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BRASS, new ResourceLocation("createdeco", "brass_door"));
			createRecipeAdvancementJson(DDNames.SHORT_COPPER, new ResourceLocation("createdeco", "copper_door"));
			createRecipeAdvancementJson(DDNames.SHORT_ZINC, new ResourceLocation("createdeco", "zinc_door"));
			createRecipeAdvancementJson(DDNames.SHORT_LOCKED_ANDESITE, new ResourceLocation("createdeco", "locked_andesite_door"));
			createRecipeAdvancementJson(DDNames.SHORT_LOCKED_BRASS, new ResourceLocation("createdeco", "locked_brass_door"));
			createRecipeAdvancementJson(DDNames.SHORT_LOCKED_COPPER, new ResourceLocation("createdeco", "locked_copper_door"));
			createRecipeAdvancementJson(DDNames.SHORT_LOCKED_ZINC, new ResourceLocation("createdeco", "locked_zinc_door"));
			createRecipeAdvancementJson(DDNames.TALL_ANDESITE, new ResourceLocation("createdeco", "andesite_door"));
			createRecipeAdvancementJson(DDNames.TALL_BRASS, new ResourceLocation("createdeco", "brass_door"));
			createRecipeAdvancementJson(DDNames.TALL_COPPER, new ResourceLocation("createdeco", "copper_door"));
			createRecipeAdvancementJson(DDNames.TALL_ZINC, new ResourceLocation("createdeco", "zinc_door"));
			createRecipeAdvancementJson(DDNames.TALL_LOCKED_ANDESITE, new ResourceLocation("createdeco", "locked_andesite_door"));
			createRecipeAdvancementJson(DDNames.TALL_LOCKED_BRASS, new ResourceLocation("createdeco", "locked_brass_door"));
			createRecipeAdvancementJson(DDNames.TALL_LOCKED_COPPER, new ResourceLocation("createdeco", "locked_copper_door"));
			createRecipeAdvancementJson(DDNames.TALL_LOCKED_ZINC, new ResourceLocation("createdeco", "locked_zinc_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("deeperdarker")) {
			createRecipeAdvancementJson(DDNames.SHORT_ECHO, new ResourceLocation("deeperdarker", "echo_door"));
			createRecipeAdvancementJson(DDNames.TALL_ECHO, new ResourceLocation("deeperdarker", "echo_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("ecologics")) {
			createRecipeAdvancementJson(DDNames.SHORT_ECO_AZALEA, new ResourceLocation("ecologics", "azalea_door"));
			createRecipeAdvancementJson(DDNames.SHORT_ECO_FLOWERING_AZALEA, new ResourceLocation("ecologics", "flowering_azalea_door"));
			createRecipeAdvancementJson(DDNames.SHORT_ECO_COCONUT, new ResourceLocation("ecologics", "coconut_door"));
			createRecipeAdvancementJson(DDNames.SHORT_ECO_WALNUT, new ResourceLocation("ecologics", "walnut_door"));
			createRecipeAdvancementJson(DDNames.TALL_ECO_AZALEA, new ResourceLocation("ecologics", "azalea_door"));
			createRecipeAdvancementJson(DDNames.TALL_ECO_FLOWERING_AZALEA, new ResourceLocation("ecologics", "flowering_azalea_door"));
			createRecipeAdvancementJson(DDNames.TALL_ECO_COCONUT, new ResourceLocation("ecologics", "coconut_door"));
			createRecipeAdvancementJson(DDNames.TALL_ECO_WALNUT, new ResourceLocation("ecologics", "walnut_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("gardens_of_the_dead")) {
			createRecipeAdvancementJson(DDNames.SHORT_SOULBLIGHT, new ResourceLocation("gardens_of_the_dead", "soulblight_door"));
			createRecipeAdvancementJson(DDNames.SHORT_WHISTLECANE, new ResourceLocation("gardens_of_the_dead", "whistlecane_door"));
			createRecipeAdvancementJson(DDNames.TALL_SOULBLIGHT, new ResourceLocation("gardens_of_the_dead", "soulblight_door"));
			createRecipeAdvancementJson(DDNames.TALL_WHISTLECANE, new ResourceLocation("gardens_of_the_dead", "whistlecane_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("modern_glass_doors")) {
			createRecipeAdvancementJson(DDNames.SHORT_IRON_GLASS, new ResourceLocation("modern_glass_doors", "iron_glass_door"));
			createRecipeAdvancementJson(DDNames.SHORT_OAK_GLASS, new ResourceLocation("modern_glass_doors", "oak_glass_door"));
			createRecipeAdvancementJson(DDNames.SHORT_SPRUCE_GLASS, new ResourceLocation("modern_glass_doors", "spruce_glass_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BIRCH_GLASS, new ResourceLocation("modern_glass_doors", "birch_glass_door"));
			createRecipeAdvancementJson(DDNames.SHORT_JUNGLE_GLASS, new ResourceLocation("modern_glass_doors", "jungle_glass_door"));
			createRecipeAdvancementJson(DDNames.SHORT_ACACIA_GLASS, new ResourceLocation("modern_glass_doors", "acacia_glass_door"));
			createRecipeAdvancementJson(DDNames.SHORT_DARK_OAK_GLASS, new ResourceLocation("modern_glass_doors", "dark_oak_glass_door"));
			createRecipeAdvancementJson(DDNames.SHORT_MANGROVE_GLASS, new ResourceLocation("modern_glass_doors", "mangrove_glass_door"));
			createRecipeAdvancementJson(DDNames.SHORT_BAMBOO_GLASS, new ResourceLocation("modern_glass_doors", "bamboo_glass_door"));
			createRecipeAdvancementJson(DDNames.SHORT_CHERRY_GLASS, new ResourceLocation("modern_glass_doors", "cherry_glass_door"));
			createRecipeAdvancementJson(DDNames.SHORT_CRIMSON_GLASS, new ResourceLocation("modern_glass_doors", "crimson_glass_door"));
			createRecipeAdvancementJson(DDNames.SHORT_WARPED_GLASS, new ResourceLocation("modern_glass_doors", "warped_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_IRON_GLASS, new ResourceLocation("modern_glass_doors", "iron_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_OAK_GLASS, new ResourceLocation("modern_glass_doors", "oak_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_SPRUCE_GLASS, new ResourceLocation("modern_glass_doors", "spruce_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_BIRCH_GLASS, new ResourceLocation("modern_glass_doors", "birch_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_JUNGLE_GLASS, new ResourceLocation("modern_glass_doors", "jungle_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_ACACIA_GLASS, new ResourceLocation("modern_glass_doors", "acacia_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_DARK_OAK_GLASS, new ResourceLocation("modern_glass_doors", "dark_oak_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MANGROVE_GLASS, new ResourceLocation("modern_glass_doors", "mangrove_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_BAMBOO_GLASS, new ResourceLocation("modern_glass_doors", "bamboo_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHERRY_GLASS, new ResourceLocation("modern_glass_doors", "cherry_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_CRIMSON_GLASS, new ResourceLocation("modern_glass_doors", "crimson_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_WARPED_GLASS, new ResourceLocation("modern_glass_doors", "warped_glass_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("goodending")) {
			createRecipeAdvancementJson(DDNames.SHORT_GE_CYPRESS, new ResourceLocation("goodending", "cypress_door"));
			createRecipeAdvancementJson(DDNames.SHORT_GE_MUDDY_OAK, new ResourceLocation("goodending", "muddy_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_GE_CYPRESS, new ResourceLocation("goodending", "cypress_door"));
			createRecipeAdvancementJson(DDNames.TALL_GE_MUDDY_OAK, new ResourceLocation("goodending", "muddy_oak_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("graveyard")) {
			createRecipeAdvancementJson(DDNames.SHORT_DARK_IRON, new ResourceLocation("graveyard", "dark_iron_door"));
			createRecipeAdvancementJson(DDNames.TALL_DARK_IRON, new ResourceLocation("graveyard", "dark_iron_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("hexcasting")) {
			createRecipeAdvancementJson(DDNames.SHORT_EDIFIED, new ResourceLocation("hexcasting", "edified_door"));
			createRecipeAdvancementJson(DDNames.TALL_EDIFIED, new ResourceLocation("hexcasting", "edified_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("promenade")) {
			createRecipeAdvancementJson(DDNames.SHORT_PROMENADE_CHERRY_OAK, new ResourceLocation("promenade", "cherry_oak_door"));
			createRecipeAdvancementJson(DDNames.SHORT_PROMENADE_DARK_AMARANTH, new ResourceLocation("promenade", "dark_amaranth_door"));
			createRecipeAdvancementJson(DDNames.SHORT_PROMENADE_PALM, new ResourceLocation("promenade", "palm_door"));
			createRecipeAdvancementJson(DDNames.TALL_PROMENADE_CHERRY_OAK, new ResourceLocation("promenade", "cherry_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_PROMENADE_DARK_AMARANTH, new ResourceLocation("promenade", "dark_amaranth_door"));
			createRecipeAdvancementJson(DDNames.TALL_PROMENADE_PALM, new ResourceLocation("promenade", "palm_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("regions_unexplored")) {
			createRecipeAdvancementJson(DDNames.SHORT_RUE_BAOBAB, new ResourceLocation("regions_unexplored", "baobab_door"));
			createRecipeAdvancementJson(DDNames.SHORT_RUE_BLACKWOOD, new ResourceLocation("regions_unexplored", "blackwood_door"));
			createRecipeAdvancementJson(DDNames.SHORT_RUE_BRIMWOOD, new ResourceLocation("regions_unexplored", "brimwood_door"));
			createRecipeAdvancementJson(DDNames.SHORT_RUE_CHERRY, new ResourceLocation("regions_unexplored", "cherry_door"));
			createRecipeAdvancementJson(DDNames.SHORT_RUE_CYPRESS, new ResourceLocation("regions_unexplored", "cypress_door"));
			createRecipeAdvancementJson(DDNames.SHORT_RUE_DEAD, new ResourceLocation("regions_unexplored", "dead_door"));
			createRecipeAdvancementJson(DDNames.SHORT_RUE_EUCALYPTUS, new ResourceLocation("regions_unexplored", "eucalyptus_door"));
			createRecipeAdvancementJson(DDNames.SHORT_RUE_JOSHUA, new ResourceLocation("regions_unexplored", "joshua_door"));
			createRecipeAdvancementJson(DDNames.SHORT_RUE_LARCH, new ResourceLocation("regions_unexplored", "larch_door"));
			createRecipeAdvancementJson(DDNames.SHORT_RUE_MAPLE, new ResourceLocation("regions_unexplored", "maple_door"));
			createRecipeAdvancementJson(DDNames.SHORT_RUE_MAUVE, new ResourceLocation("regions_unexplored", "mauve_door"));
			createRecipeAdvancementJson(DDNames.SHORT_RUE_PALM, new ResourceLocation("regions_unexplored", "palm_door"));
			createRecipeAdvancementJson(DDNames.SHORT_RUE_PINE, new ResourceLocation("regions_unexplored", "pine_door"));
			createRecipeAdvancementJson(DDNames.SHORT_RUE_REDWOOD, new ResourceLocation("regions_unexplored", "redwood_door"));
			createRecipeAdvancementJson(DDNames.SHORT_RUE_WILLOW, new ResourceLocation("regions_unexplored", "willow_door"));
			createRecipeAdvancementJson(DDNames.TALL_RUE_BAOBAB, new ResourceLocation("regions_unexplored", "baobab_door"));
			createRecipeAdvancementJson(DDNames.TALL_RUE_BLACKWOOD, new ResourceLocation("regions_unexplored", "blackwood_door"));
			createRecipeAdvancementJson(DDNames.TALL_RUE_BRIMWOOD, new ResourceLocation("regions_unexplored", "brimwood_door"));
			createRecipeAdvancementJson(DDNames.TALL_RUE_CHERRY, new ResourceLocation("regions_unexplored", "cherry_door"));
			createRecipeAdvancementJson(DDNames.TALL_RUE_CYPRESS, new ResourceLocation("regions_unexplored", "cypress_door"));
			createRecipeAdvancementJson(DDNames.TALL_RUE_DEAD, new ResourceLocation("regions_unexplored", "dead_door"));
			createRecipeAdvancementJson(DDNames.TALL_RUE_EUCALYPTUS, new ResourceLocation("regions_unexplored", "eucalyptus_door"));
			createRecipeAdvancementJson(DDNames.TALL_RUE_JOSHUA, new ResourceLocation("regions_unexplored", "joshua_door"));
			createRecipeAdvancementJson(DDNames.TALL_RUE_LARCH, new ResourceLocation("regions_unexplored", "larch_door"));
			createRecipeAdvancementJson(DDNames.TALL_RUE_MAPLE, new ResourceLocation("regions_unexplored", "maple_door"));
			createRecipeAdvancementJson(DDNames.TALL_RUE_MAUVE, new ResourceLocation("regions_unexplored", "mauve_door"));
			createRecipeAdvancementJson(DDNames.TALL_RUE_PALM, new ResourceLocation("regions_unexplored", "palm_door"));
			createRecipeAdvancementJson(DDNames.TALL_RUE_PINE, new ResourceLocation("regions_unexplored", "pine_door"));
			createRecipeAdvancementJson(DDNames.TALL_RUE_REDWOOD, new ResourceLocation("regions_unexplored", "redwood_door"));
			createRecipeAdvancementJson(DDNames.TALL_RUE_WILLOW, new ResourceLocation("regions_unexplored", "willow_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("snowyspirit")) {
			createRecipeAdvancementJson(DDNames.SHORT_GINGERBREAD, new ResourceLocation("snowyspirit", "gingerbread_door"));
			createRecipeAdvancementJson(DDNames.TALL_GINGERBREAD, new ResourceLocation("snowyspirit", "gingerbread_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("supplementaries")) {
			createRecipeAdvancementJson(DDNames.SHORT_GOLD, new ResourceLocation("supplementaries", "gold_door"));
			createRecipeAdvancementJson(DDNames.SHORT_NETHERITE, new ResourceLocation("supplementaries", "netherite_door"));
			createRecipeAdvancementJson(DDNames.TALL_GOLD, new ResourceLocation("supplementaries", "gold_door"));
			createRecipeAdvancementJson(DDNames.TALL_NETHERITE, new ResourceLocation("supplementaries", "netherite_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("tconstruct")) {
			createRecipeAdvancementJson(DDNames.SHORT_BLOODSHROOM, new ResourceLocation("tconstruct", "bloodshroom_door"));
			createRecipeAdvancementJson(DDNames.SHORT_GREENHEART, new ResourceLocation("tconstruct", "greenheart_door"));
			createRecipeAdvancementJson(DDNames.SHORT_SKYROOT, new ResourceLocation("tconstruct", "skyroot_door"));
			createRecipeAdvancementJson(DDNames.TALL_BLOODSHROOM, new ResourceLocation("tconstruct", "bloodshroom_door"));
			createRecipeAdvancementJson(DDNames.TALL_GREENHEART, new ResourceLocation("tconstruct", "greenheart_door"));
			createRecipeAdvancementJson(DDNames.TALL_SKYROOT, new ResourceLocation("tconstruct", "skyroot_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("techreborn")) {
			createRecipeAdvancementJson(DDNames.SHORT_RUBBER, new ResourceLocation("techreborn", "rubber_door"));
			createRecipeAdvancementJson(DDNames.TALL_RUBBER, new ResourceLocation("techreborn", "rubber_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("terrestria")) {
			createRecipeAdvancementJson(DDNames.SHORT_TERRESTRIA_CYPRESS, new ResourceLocation("terrestria", "cypress_door"));
			createRecipeAdvancementJson(DDNames.SHORT_TERRESTRIA_HEMLOCK, new ResourceLocation("terrestria", "hemlock_door"));
			createRecipeAdvancementJson(DDNames.SHORT_TERRESTRIA_JAPANESE_MAPLE, new ResourceLocation("terrestria", "japanese_maple_door"));
			createRecipeAdvancementJson(DDNames.SHORT_TERRESTRIA_RAINBOW_EUCALYPTUS, new ResourceLocation("terrestria", "rainbow_eucalyptus_door"));
			createRecipeAdvancementJson(DDNames.SHORT_TERRESTRIA_REDWOOD, new ResourceLocation("terrestria", "redwood_door"));
			createRecipeAdvancementJson(DDNames.SHORT_TERRESTRIA_RUBBER, new ResourceLocation("terrestria", "rubber_door"));
			createRecipeAdvancementJson(DDNames.SHORT_TERRESTRIA_SAKURA, new ResourceLocation("terrestria", "sakura_door"));
			createRecipeAdvancementJson(DDNames.SHORT_TERRESTRIA_WILLOW, new ResourceLocation("terrestria", "willow_door"));
			createRecipeAdvancementJson(DDNames.SHORT_TERRESTRIA_YUCCA_PALM, new ResourceLocation("terrestria", "yucca_palm_door"));
			createRecipeAdvancementJson(DDNames.TALL_TERRESTRIA_CYPRESS, new ResourceLocation("terrestria", "cypress_door"));
			createRecipeAdvancementJson(DDNames.TALL_TERRESTRIA_HEMLOCK, new ResourceLocation("terrestria", "hemlock_door"));
			createRecipeAdvancementJson(DDNames.TALL_TERRESTRIA_JAPANESE_MAPLE, new ResourceLocation("terrestria", "japanese_maple_door"));
			createRecipeAdvancementJson(DDNames.TALL_TERRESTRIA_RAINBOW_EUCALYPTUS, new ResourceLocation("terrestria", "rainbow_eucalyptus_door"));
			createRecipeAdvancementJson(DDNames.TALL_TERRESTRIA_REDWOOD, new ResourceLocation("terrestria", "redwood_door"));
			createRecipeAdvancementJson(DDNames.TALL_TERRESTRIA_RUBBER, new ResourceLocation("terrestria", "rubber_door"));
			createRecipeAdvancementJson(DDNames.TALL_TERRESTRIA_SAKURA, new ResourceLocation("terrestria", "sakura_door"));
			createRecipeAdvancementJson(DDNames.TALL_TERRESTRIA_WILLOW, new ResourceLocation("terrestria", "willow_door"));
			createRecipeAdvancementJson(DDNames.TALL_TERRESTRIA_YUCCA_PALM, new ResourceLocation("terrestria", "yucca_palm_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("traverse")) {
			createRecipeAdvancementJson(DDNames.SHORT_TRAVERSE_FIR, new ResourceLocation("traverse", "fir_door"));
			createRecipeAdvancementJson(DDNames.TALL_TRAVERSE_FIR, new ResourceLocation("traverse", "fir_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("twigs")) {
			createRecipeAdvancementJson(DDNames.SHORT_STRIPPED_BAMBOO, new ResourceLocation("twigs", "stripped_bamboo_door"));
			createRecipeAdvancementJson(DDNames.TALL_STRIPPED_BAMBOO, new ResourceLocation("twigs", "stripped_bamboo_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("twilightforest")) {
			createRecipeAdvancementJson(DDNames.SHORT_CANOPY, new ResourceLocation("twilightforest", "canopy_door"));
			createRecipeAdvancementJson(DDNames.SHORT_DARKWOOD, new ResourceLocation("twilightforest", "dark_door"));
			createRecipeAdvancementJson(DDNames.SHORT_TWILIGHT_MANGROVE, new ResourceLocation("twilightforest", "mangrove_door"));
			createRecipeAdvancementJson(DDNames.SHORT_MINEWOOD, new ResourceLocation("twilightforest", "mining_door"));
			createRecipeAdvancementJson(DDNames.SHORT_SORTINGWOOD, new ResourceLocation("twilightforest", "sorting_door"));
			createRecipeAdvancementJson(DDNames.SHORT_TIMEWOOD, new ResourceLocation("twilightforest", "time_door"));
			createRecipeAdvancementJson(DDNames.SHORT_TRANSWOOD, new ResourceLocation("twilightforest", "transformation_door"));
			createRecipeAdvancementJson(DDNames.SHORT_TWILIGHT_OAK, new ResourceLocation("twilightforest", "twilight_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_CANOPY, new ResourceLocation("twilightforest", "canopy_door"));
			createRecipeAdvancementJson(DDNames.TALL_DARKWOOD, new ResourceLocation("twilightforest", "dark_door"));
			createRecipeAdvancementJson(DDNames.TALL_TWILIGHT_MANGROVE, new ResourceLocation("twilightforest", "mangrove_door"));
			createRecipeAdvancementJson(DDNames.TALL_MINEWOOD, new ResourceLocation("twilightforest", "mining_door"));
			createRecipeAdvancementJson(DDNames.TALL_SORTINGWOOD, new ResourceLocation("twilightforest", "sorting_door"));
			createRecipeAdvancementJson(DDNames.TALL_TIMEWOOD, new ResourceLocation("twilightforest", "time_door"));
			createRecipeAdvancementJson(DDNames.TALL_TRANSWOOD, new ResourceLocation("twilightforest", "transformation_door"));
			createRecipeAdvancementJson(DDNames.TALL_TWILIGHT_OAK, new ResourceLocation("twilightforest", "twilight_oak_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("tflostblocks")) {
			createRecipeAdvancementJson(DDNames.SHORT_TOWERWOOD, new ResourceLocation("tflostblocks", "towerwood_door"));
			createRecipeAdvancementJson(DDNames.TALL_TOWERWOOD, new ResourceLocation("tflostblocks", "towerwood_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("wilderwild")) {
			createRecipeAdvancementJson(DDNames.SHORT_WW_BAOBAB, new ResourceLocation("wilderwild", "baobab_door"));
			createRecipeAdvancementJson(DDNames.SHORT_WW_CYPRESS, new ResourceLocation("wilderwild", "cypress_door"));
			createRecipeAdvancementJson(DDNames.SHORT_WW_PALM, new ResourceLocation("wilderwild", "palm_door"));
			createRecipeAdvancementJson(DDNames.TALL_WW_BAOBAB, new ResourceLocation("wilderwild", "baobab_door"));
			createRecipeAdvancementJson(DDNames.TALL_WW_CYPRESS, new ResourceLocation("wilderwild", "cypress_door"));
			createRecipeAdvancementJson(DDNames.TALL_WW_PALM, new ResourceLocation("wilderwild", "palm_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("xps_additions")) {
			createRecipeAdvancementJson(DDNames.SHORT_SOUL_COPPER, new ResourceLocation("xps_additions", "soul_copper_door"));
			createRecipeAdvancementJson(DDNames.TALL_SOUL_COPPER, new ResourceLocation("xps_additions", "soul_copper_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("yippee")) {
			createRecipeAdvancementJson(DDNames.SHORT_MYSTICAL_OAK, new ResourceLocation("yippee", "mystical_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_MYSTICAL_OAK, new ResourceLocation("yippee", "mystical_oak_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("chipped")) {
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_OAK_HEAVY, new ResourceLocation("chipped", "heavy_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_OAK_DUAL_PANELED, new ResourceLocation("chipped", "dual_paneled_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_OAK_PRESSED, new ResourceLocation("chipped", "pressed_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_OAK_SHACK, new ResourceLocation("chipped", "shack_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_OAK_FORTIFIED, new ResourceLocation("chipped", "fortified_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_OAK_SLIDING, new ResourceLocation("chipped", "sliding_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_OAK_SCREEN, new ResourceLocation("chipped", "screen_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_OAK_GATED, new ResourceLocation("chipped", "gated_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_OAK_GLASS, new ResourceLocation("chipped", "glass_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_OAK_WINDOWED, new ResourceLocation("chipped", "windowed_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_OAK_TILED, new ResourceLocation("chipped", "tiled_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_OAK_TILE_WINDOWED, new ResourceLocation("chipped", "tile_windowed_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_OAK_SECRET, new ResourceLocation("chipped", "secret_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_OAK_BOARDED, new ResourceLocation("chipped", "boarded_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_OAK_PAPER, new ResourceLocation("chipped", "paper_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_OAK_BEACH, new ResourceLocation("chipped", "beach_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_OAK_BARRED, new ResourceLocation("chipped", "barred_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_OAK_PANELED, new ResourceLocation("chipped", "paneled_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_OAK_SUPPORTED, new ResourceLocation("chipped", "supported_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_OAK_OVERGROWN, new ResourceLocation("chipped", "overgrown_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_SPRUCE_HEAVY, new ResourceLocation("chipped", "heavy_spruce_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_SPRUCE_DUAL_PANELED, new ResourceLocation("chipped", "dual_paneled_spruce_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_SPRUCE_PRESSED, new ResourceLocation("chipped", "pressed_spruce_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_SPRUCE_SHACK, new ResourceLocation("chipped", "shack_spruce_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_SPRUCE_FORTIFIED, new ResourceLocation("chipped", "fortified_spruce_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_SPRUCE_SLIDING, new ResourceLocation("chipped", "sliding_spruce_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_SPRUCE_SCREEN, new ResourceLocation("chipped", "screen_spruce_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_SPRUCE_GATED, new ResourceLocation("chipped", "gated_spruce_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_SPRUCE_GLASS, new ResourceLocation("chipped", "glass_spruce_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_SPRUCE_WINDOWED, new ResourceLocation("chipped", "windowed_spruce_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_SPRUCE_TILED, new ResourceLocation("chipped", "tiled_spruce_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_SPRUCE_TILE_WINDOWED, new ResourceLocation("chipped", "tile_windowed_spruce_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_SPRUCE_SECRET, new ResourceLocation("chipped", "secret_spruce_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_SPRUCE_MODERN, new ResourceLocation("chipped", "modern_spruce_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_SPRUCE_PAPER, new ResourceLocation("chipped", "paper_spruce_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_SPRUCE_BEACH, new ResourceLocation("chipped", "beach_spruce_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_SPRUCE_BARRED, new ResourceLocation("chipped", "barred_spruce_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_SPRUCE_PANELED, new ResourceLocation("chipped", "paneled_spruce_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_SPRUCE_SUPPORTED, new ResourceLocation("chipped", "supported_spruce_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_SPRUCE_OVERGROWN, new ResourceLocation("chipped", "overgrown_spruce_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_BIRCH_HEAVY, new ResourceLocation("chipped", "heavy_birch_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_BIRCH_DUAL_PANELED, new ResourceLocation("chipped", "dual_paneled_birch_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_BIRCH_PRESSED, new ResourceLocation("chipped", "pressed_birch_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_BIRCH_SHACK, new ResourceLocation("chipped", "shack_birch_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_BIRCH_FORTIFIED, new ResourceLocation("chipped", "fortified_birch_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_BIRCH_SLIDING, new ResourceLocation("chipped", "sliding_birch_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_BIRCH_SCREEN, new ResourceLocation("chipped", "screen_birch_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_BIRCH_GATED, new ResourceLocation("chipped", "gated_birch_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_BIRCH_GLASS, new ResourceLocation("chipped", "glass_birch_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_BIRCH_WINDOWED, new ResourceLocation("chipped", "windowed_birch_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_BIRCH_TILED, new ResourceLocation("chipped", "tiled_birch_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_BIRCH_TILE_WINDOWED, new ResourceLocation("chipped", "tile_windowed_birch_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_BIRCH_SECRET, new ResourceLocation("chipped", "secret_birch_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_BIRCH_MODERN, new ResourceLocation("chipped", "modern_birch_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_BIRCH_BOARDED, new ResourceLocation("chipped", "boarded_birch_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_BIRCH_BEACH, new ResourceLocation("chipped", "beach_birch_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_BIRCH_BARRED, new ResourceLocation("chipped", "barred_birch_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_BIRCH_PANELED, new ResourceLocation("chipped", "paneled_birch_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_BIRCH_SUPPORTED, new ResourceLocation("chipped", "supported_birch_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_BIRCH_OVERGROWN, new ResourceLocation("chipped", "overgrown_birch_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_JUNGLE_HEAVY, new ResourceLocation("chipped", "heavy_jungle_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_JUNGLE_DUAL_PANELED, new ResourceLocation("chipped", "dual_paneled_jungle_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_JUNGLE_PRESSED, new ResourceLocation("chipped", "pressed_jungle_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_JUNGLE_SHACK, new ResourceLocation("chipped", "shack_jungle_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_JUNGLE_FORTIFIED, new ResourceLocation("chipped", "fortified_jungle_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_JUNGLE_SLIDING, new ResourceLocation("chipped", "sliding_jungle_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_JUNGLE_SCREEN, new ResourceLocation("chipped", "screen_jungle_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_JUNGLE_GATED, new ResourceLocation("chipped", "gated_jungle_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_JUNGLE_GLASS, new ResourceLocation("chipped", "glass_jungle_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_JUNGLE_WINDOWED, new ResourceLocation("chipped", "windowed_jungle_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_JUNGLE_TILED, new ResourceLocation("chipped", "tiled_jungle_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_JUNGLE_TILE_WINDOWED, new ResourceLocation("chipped", "tile_windowed_jungle_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_JUNGLE_SECRET, new ResourceLocation("chipped", "secret_jungle_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_JUNGLE_MODERN, new ResourceLocation("chipped", "modern_jungle_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_JUNGLE_BOARDED, new ResourceLocation("chipped", "boarded_jungle_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_JUNGLE_PAPER, new ResourceLocation("chipped", "paper_jungle_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_JUNGLE_BARRED, new ResourceLocation("chipped", "barred_jungle_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_JUNGLE_PANELED, new ResourceLocation("chipped", "paneled_jungle_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_JUNGLE_SUPPORTED, new ResourceLocation("chipped", "supported_jungle_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_JUNGLE_OVERGROWN, new ResourceLocation("chipped", "overgrown_jungle_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_ACACIA_HEAVY, new ResourceLocation("chipped", "heavy_acacia_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_ACACIA_DUAL_PANELED, new ResourceLocation("chipped", "dual_paneled_acacia_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_ACACIA_PRESSED, new ResourceLocation("chipped", "pressed_acacia_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_ACACIA_SHACK, new ResourceLocation("chipped", "shack_acacia_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_ACACIA_FORTIFIED, new ResourceLocation("chipped", "fortified_acacia_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_ACACIA_SLIDING, new ResourceLocation("chipped", "sliding_acacia_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_ACACIA_SCREEN, new ResourceLocation("chipped", "screen_acacia_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_ACACIA_GATED, new ResourceLocation("chipped", "gated_acacia_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_ACACIA_GLASS, new ResourceLocation("chipped", "glass_acacia_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_ACACIA_WINDOWED, new ResourceLocation("chipped", "windowed_acacia_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_ACACIA_TILED, new ResourceLocation("chipped", "tiled_acacia_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_ACACIA_TILE_WINDOWED, new ResourceLocation("chipped", "tile_windowed_acacia_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_ACACIA_SECRET, new ResourceLocation("chipped", "secret_acacia_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_ACACIA_MODERN, new ResourceLocation("chipped", "modern_acacia_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_ACACIA_BOARDED, new ResourceLocation("chipped", "boarded_acacia_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_ACACIA_PAPER, new ResourceLocation("chipped", "paper_acacia_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_ACACIA_BEACH, new ResourceLocation("chipped", "beach_acacia_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_ACACIA_PANELED, new ResourceLocation("chipped", "paneled_acacia_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_ACACIA_SUPPORTED, new ResourceLocation("chipped", "supported_acacia_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_ACACIA_OVERGROWN, new ResourceLocation("chipped", "overgrown_acacia_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_DARK_OAK_HEAVY, new ResourceLocation("chipped", "heavy_dark_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_DARK_OAK_DUAL_PANELED, new ResourceLocation("chipped", "dual_paneled_dark_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_DARK_OAK_PRESSED, new ResourceLocation("chipped", "pressed_dark_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_DARK_OAK_SHACK, new ResourceLocation("chipped", "shack_dark_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_DARK_OAK_FORTIFIED, new ResourceLocation("chipped", "fortified_dark_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_DARK_OAK_SLIDING, new ResourceLocation("chipped", "sliding_dark_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_DARK_OAK_SCREEN, new ResourceLocation("chipped", "screen_dark_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_DARK_OAK_GATED, new ResourceLocation("chipped", "gated_dark_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_DARK_OAK_GLASS, new ResourceLocation("chipped", "glass_dark_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_DARK_OAK_WINDOWED, new ResourceLocation("chipped", "windowed_dark_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_DARK_OAK_TILED, new ResourceLocation("chipped", "tiled_dark_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_DARK_OAK_TILE_WINDOWED, new ResourceLocation("chipped", "tile_windowed_dark_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_DARK_OAK_SECRET, new ResourceLocation("chipped", "secret_dark_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_DARK_OAK_MODERN, new ResourceLocation("chipped", "modern_dark_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_DARK_OAK_BOARDED, new ResourceLocation("chipped", "boarded_dark_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_DARK_OAK_PAPER, new ResourceLocation("chipped", "paper_dark_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_DARK_OAK_BEACH, new ResourceLocation("chipped", "beach_dark_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_DARK_OAK_BARRED, new ResourceLocation("chipped", "barred_dark_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_DARK_OAK_SUPPORTED, new ResourceLocation("chipped", "supported_dark_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_DARK_OAK_OVERGROWN, new ResourceLocation("chipped", "overgrown_dark_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_MANGROVE_HEAVY, new ResourceLocation("chipped", "heavy_mangrove_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_MANGROVE_DUAL_PANELED, new ResourceLocation("chipped", "dual_paneled_mangrove_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_MANGROVE_PRESSED, new ResourceLocation("chipped", "pressed_mangrove_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_MANGROVE_SHACK, new ResourceLocation("chipped", "shack_mangrove_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_MANGROVE_FORTIFIED, new ResourceLocation("chipped", "fortified_mangrove_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_MANGROVE_SLIDING, new ResourceLocation("chipped", "sliding_mangrove_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_MANGROVE_SCREEN, new ResourceLocation("chipped", "screen_mangrove_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_MANGROVE_GATED, new ResourceLocation("chipped", "gated_mangrove_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_MANGROVE_GLASS, new ResourceLocation("chipped", "glass_mangrove_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_MANGROVE_WINDOWED, new ResourceLocation("chipped", "windowed_mangrove_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_MANGROVE_TILED, new ResourceLocation("chipped", "tiled_mangrove_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_MANGROVE_TILE_WINDOWED, new ResourceLocation("chipped", "tile_windowed_mangrove_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_MANGROVE_SECRET, new ResourceLocation("chipped", "secret_mangrove_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_MANGROVE_MODERN, new ResourceLocation("chipped", "modern_mangrove_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_MANGROVE_BOARDED, new ResourceLocation("chipped", "boarded_mangrove_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_MANGROVE_PAPER, new ResourceLocation("chipped", "paper_mangrove_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_MANGROVE_BEACH, new ResourceLocation("chipped", "beach_mangrove_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_MANGROVE_BARRED, new ResourceLocation("chipped", "barred_mangrove_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_MANGROVE_PANELED, new ResourceLocation("chipped", "paneled_mangrove_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_MANGROVE_SUPPORTED, new ResourceLocation("chipped", "supported_mangrove_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_MANGROVE_OVERGROWN, new ResourceLocation("chipped", "overgrown_mangrove_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_CRIMSON_HEAVY, new ResourceLocation("chipped", "heavy_crimson_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_CRIMSON_DUAL_PANELED, new ResourceLocation("chipped", "dual_paneled_crimson_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_CRIMSON_PRESSED, new ResourceLocation("chipped", "pressed_crimson_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_CRIMSON_SHACK, new ResourceLocation("chipped", "shack_crimson_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_CRIMSON_FORTIFIED, new ResourceLocation("chipped", "fortified_crimson_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_CRIMSON_SLIDING, new ResourceLocation("chipped", "sliding_crimson_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_CRIMSON_SCREEN, new ResourceLocation("chipped", "screen_crimson_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_CRIMSON_GATED, new ResourceLocation("chipped", "gated_crimson_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_CRIMSON_GLASS, new ResourceLocation("chipped", "glass_crimson_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_CRIMSON_WINDOWED, new ResourceLocation("chipped", "windowed_crimson_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_CRIMSON_TILED, new ResourceLocation("chipped", "tiled_crimson_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_CRIMSON_TILE_WINDOWED, new ResourceLocation("chipped", "tile_windowed_crimson_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_CRIMSON_SECRET, new ResourceLocation("chipped", "secret_crimson_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_CRIMSON_MODERN, new ResourceLocation("chipped", "modern_crimson_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_CRIMSON_BOARDED, new ResourceLocation("chipped", "boarded_crimson_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_CRIMSON_PAPER, new ResourceLocation("chipped", "paper_crimson_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_CRIMSON_BEACH, new ResourceLocation("chipped", "beach_crimson_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_CRIMSON_BARRED, new ResourceLocation("chipped", "barred_crimson_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_CRIMSON_PANELED, new ResourceLocation("chipped", "paneled_crimson_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_CRIMSON_OVERGROWN, new ResourceLocation("chipped", "overgrown_crimson_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_WARPED_HEAVY, new ResourceLocation("chipped", "heavy_warped_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_WARPED_DUAL_PANELED, new ResourceLocation("chipped", "dual_paneled_warped_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_WARPED_PRESSED, new ResourceLocation("chipped", "pressed_warped_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_WARPED_SHACK, new ResourceLocation("chipped", "shack_warped_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_WARPED_FORTIFIED, new ResourceLocation("chipped", "fortified_warped_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_WARPED_SLIDING, new ResourceLocation("chipped", "sliding_warped_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_WARPED_SCREEN, new ResourceLocation("chipped", "screen_warped_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_WARPED_GATED, new ResourceLocation("chipped", "gated_warped_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_WARPED_GLASS, new ResourceLocation("chipped", "glass_warped_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_WARPED_WINDOWED, new ResourceLocation("chipped", "windowed_warped_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_WARPED_TILED, new ResourceLocation("chipped", "tiled_warped_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_WARPED_TILE_WINDOWED, new ResourceLocation("chipped", "tile_windowed_warped_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_WARPED_SECRET, new ResourceLocation("chipped", "secret_warped_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_WARPED_MODERN, new ResourceLocation("chipped", "modern_warped_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_WARPED_BOARDED, new ResourceLocation("chipped", "boarded_warped_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_WARPED_PAPER, new ResourceLocation("chipped", "paper_warped_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_WARPED_BEACH, new ResourceLocation("chipped", "beach_warped_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_WARPED_BARRED, new ResourceLocation("chipped", "barred_warped_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_WARPED_PANELED, new ResourceLocation("chipped", "paneled_warped_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_WARPED_SUPPORTED, new ResourceLocation("chipped", "supported_warped_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("mcwdoors")) {
			createRecipeAdvancementJson(DDNames.TALL_MACAW_STORE, new ResourceLocation("mcwdoors", "store_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SLIDING_GLASS, new ResourceLocation("mcwdoors", "sliding_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JAIL, new ResourceLocation("mcwdoors", "jail_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_METAL, new ResourceLocation("mcwdoors", "metal_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_METAL_HOSPITAL, new ResourceLocation("mcwdoors", "metal_hospital_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_METAL_REINFORCED, new ResourceLocation("mcwdoors", "metal_reinforced_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_METAL_WARNING, new ResourceLocation("mcwdoors", "metal_warning_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_METAL_WINDOWED, new ResourceLocation("mcwdoors", "metal_windowed_door"));
			
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_BARN, new ResourceLocation("mcwdoors", "oak_barn_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_BARN, new ResourceLocation("mcwdoors", "spruce_barn_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_BARN, new ResourceLocation("mcwdoors", "birch_barn_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_BARN, new ResourceLocation("mcwdoors", "jungle_barn_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_BARN, new ResourceLocation("mcwdoors", "acacia_barn_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_BARN, new ResourceLocation("mcwdoors", "dark_oak_barn_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_BARN, new ResourceLocation("mcwdoors", "mangrove_barn_door"));
			//createRecipeAdvancementJson(DDNames.TALL_MACAW_CHERRY_BARN, new ResourceLocation("mcwdoors", "cherry_barn_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BAMBOO_BARN, new ResourceLocation("mcwdoors", "bamboo_barn_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_BARN, new ResourceLocation("mcwdoors", "crimson_barn_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_BARN, new ResourceLocation("mcwdoors", "warped_barn_door"));
			
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_BARN_GLASS, new ResourceLocation("mcwdoors", "oak_barn_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_BARN_GLASS, new ResourceLocation("mcwdoors", "spruce_barn_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_BARN_GLASS, new ResourceLocation("mcwdoors", "birch_barn_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_BARN_GLASS, new ResourceLocation("mcwdoors", "jungle_barn_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_BARN_GLASS, new ResourceLocation("mcwdoors", "acacia_barn_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_BARN_GLASS, new ResourceLocation("mcwdoors", "dark_oak_barn_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_BARN_GLASS, new ResourceLocation("mcwdoors", "mangrove_barn_glass_door"));
			//createRecipeAdvancementJson(DDNames.TALL_MACAW_CHERRY_BARN_GLASS, new ResourceLocation("mcwdoors", "cherry_barn_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BAMBOO_BARN_GLASS, new ResourceLocation("mcwdoors", "bamboo_barn_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_BARN_GLASS, new ResourceLocation("mcwdoors", "crimson_barn_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_BARN_GLASS, new ResourceLocation("mcwdoors", "warped_barn_glass_door"));
			
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_STABLE, new ResourceLocation("mcwdoors", "oak_stable_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_STABLE, new ResourceLocation("mcwdoors", "spruce_stable_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_STABLE, new ResourceLocation("mcwdoors", "birch_stable_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_STABLE, new ResourceLocation("mcwdoors", "jungle_stable_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_STABLE, new ResourceLocation("mcwdoors", "acacia_stable_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_STABLE, new ResourceLocation("mcwdoors", "dark_oak_stable_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_STABLE, new ResourceLocation("mcwdoors", "mangrove_stable_door"));
			//createRecipeAdvancementJson(DDNames.TALL_MACAW_CHERRY_STABLE, new ResourceLocation("mcwdoors", "cherry_stable_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BAMBOO_STABLE, new ResourceLocation("mcwdoors", "bamboo_stable_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_STABLE, new ResourceLocation("mcwdoors", "crimson_stable_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_STABLE, new ResourceLocation("mcwdoors", "warped_stable_door"));
			
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_STABLE_HEAD, new ResourceLocation("mcwdoors", "oak_stable_head_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_STABLE_HEAD, new ResourceLocation("mcwdoors", "spruce_stable_head_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_STABLE_HEAD, new ResourceLocation("mcwdoors", "birch_stable_head_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_STABLE_HEAD, new ResourceLocation("mcwdoors", "jungle_stable_head_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_STABLE_HEAD, new ResourceLocation("mcwdoors", "acacia_stable_head_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_STABLE_HEAD, new ResourceLocation("mcwdoors", "dark_oak_stable_head_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_STABLE_HEAD, new ResourceLocation("mcwdoors", "mangrove_stable_head_door"));
			//createRecipeAdvancementJson(DDNames.TALL_MACAW_CHERRY_STABLE_HEAD, new ResourceLocation("mcwdoors", "cherry_stable_head_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BAMBOO_STABLE_HEAD, new ResourceLocation("mcwdoors", "bamboo_stable_head_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_STABLE_HEAD, new ResourceLocation("mcwdoors", "crimson_stable_head_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_STABLE_HEAD, new ResourceLocation("mcwdoors", "warped_stable_head_door"));
			
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_BARK_GLASS, new ResourceLocation("mcwdoors", "oak_bark_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_BARK_GLASS, new ResourceLocation("mcwdoors", "spruce_bark_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_BARK_GLASS, new ResourceLocation("mcwdoors", "birch_bark_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_BARK_GLASS, new ResourceLocation("mcwdoors", "jungle_bark_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_BARK_GLASS, new ResourceLocation("mcwdoors", "acacia_bark_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_BARK_GLASS, new ResourceLocation("mcwdoors", "dark_oak_bark_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_BARK_GLASS, new ResourceLocation("mcwdoors", "mangrove_bark_glass_door"));
			//createRecipeAdvancementJson(DDNames.TALL_MACAW_CHERRY_BARK_GLASS, new ResourceLocation("mcwdoors", "cherry_bark_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BAMBOO_BARK_GLASS, new ResourceLocation("mcwdoors", "bamboo_bark_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_STEM_GLASS, new ResourceLocation("mcwdoors", "crimson_stem_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_STEM_GLASS, new ResourceLocation("mcwdoors", "warped_stem_glass_door"));
			
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_GLASS, new ResourceLocation("mcwdoors", "oak_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_GLASS, new ResourceLocation("mcwdoors", "spruce_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_GLASS, new ResourceLocation("mcwdoors", "birch_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_GLASS, new ResourceLocation("mcwdoors", "jungle_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_GLASS, new ResourceLocation("mcwdoors", "acacia_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_GLASS, new ResourceLocation("mcwdoors", "dark_oak_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_GLASS, new ResourceLocation("mcwdoors", "mangrove_glass_door"));
			//createRecipeAdvancementJson(DDNames.TALL_MACAW_CHERRY_GLASS, new ResourceLocation("mcwdoors", "cherry_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BAMBOO_GLASS, new ResourceLocation("mcwdoors", "bamboo_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_GLASS, new ResourceLocation("mcwdoors", "crimson_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_GLASS, new ResourceLocation("mcwdoors", "warped_glass_door"));
			
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_MODERN, new ResourceLocation("mcwdoors", "oak_modern_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_MODERN, new ResourceLocation("mcwdoors", "spruce_modern_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_MODERN, new ResourceLocation("mcwdoors", "birch_modern_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_MODERN, new ResourceLocation("mcwdoors", "jungle_modern_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_MODERN, new ResourceLocation("mcwdoors", "acacia_modern_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_MODERN, new ResourceLocation("mcwdoors", "dark_oak_modern_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_MODERN, new ResourceLocation("mcwdoors", "mangrove_modern_door"));
			//createRecipeAdvancementJson(DDNames.TALL_MACAW_CHERRY_MODERN, new ResourceLocation("mcwdoors", "cherry_modern_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BAMBOO_MODERN, new ResourceLocation("mcwdoors", "bamboo_modern_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_MODERN, new ResourceLocation("mcwdoors", "crimson_modern_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_MODERN, new ResourceLocation("mcwdoors", "warped_modern_door"));
			
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_JAPANESE, new ResourceLocation("mcwdoors", "oak_japanese_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_JAPANESE, new ResourceLocation("mcwdoors", "spruce_japanese_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_JAPANESE, new ResourceLocation("mcwdoors", "birch_japanese_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_JAPANESE, new ResourceLocation("mcwdoors", "jungle_japanese_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_JAPANESE, new ResourceLocation("mcwdoors", "acacia_japanese_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_JAPANESE, new ResourceLocation("mcwdoors", "dark_oak_japanese_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_JAPANESE, new ResourceLocation("mcwdoors", "mangrove_japanese_door"));
			//createRecipeAdvancementJson(DDNames.TALL_MACAW_CHERRY_JAPANESE, new ResourceLocation("mcwdoors", "cherry_japanese_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BAMBOO_JAPANESE, new ResourceLocation("mcwdoors", "bamboo_japanese_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_JAPANESE, new ResourceLocation("mcwdoors", "crimson_japanese_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_JAPANESE, new ResourceLocation("mcwdoors", "warped_japanese_door"));
			
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_JAPANESE2, new ResourceLocation("mcwdoors", "oak_japanese2_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_JAPANESE2, new ResourceLocation("mcwdoors", "spruce_japanese2_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_JAPANESE2, new ResourceLocation("mcwdoors", "birch_japanese2_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_JAPANESE2, new ResourceLocation("mcwdoors", "jungle_japanese2_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_JAPANESE2, new ResourceLocation("mcwdoors", "acacia_japanese2_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_JAPANESE2, new ResourceLocation("mcwdoors", "dark_oak_japanese2_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_JAPANESE2, new ResourceLocation("mcwdoors", "mangrove_japanese2_door"));
			//createRecipeAdvancementJson(DDNames.TALL_MACAW_CHERRY_JAPANESE2, new ResourceLocation("mcwdoors", "cherry_japanese2_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BAMBOO_JAPANESE2, new ResourceLocation("mcwdoors", "bamboo_japanese2_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_JAPANESE2, new ResourceLocation("mcwdoors", "crimson_japanese2_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_JAPANESE2, new ResourceLocation("mcwdoors", "warped_japanese2_door"));
			
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_CLASSIC, new ResourceLocation("mcwdoors", "spruce_classic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_CLASSIC, new ResourceLocation("mcwdoors", "birch_classic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_CLASSIC, new ResourceLocation("mcwdoors", "jungle_classic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_CLASSIC, new ResourceLocation("mcwdoors", "acacia_classic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_CLASSIC, new ResourceLocation("mcwdoors", "dark_oak_classic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_CLASSIC, new ResourceLocation("mcwdoors", "mangrove_classic_door"));
			//createRecipeAdvancementJson(DDNames.TALL_MACAW_CHERRY_CLASSIC, new ResourceLocation("mcwdoors", "cherry_classic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BAMBOO_CLASSIC, new ResourceLocation("mcwdoors", "bamboo_classic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_CLASSIC, new ResourceLocation("mcwdoors", "crimson_classic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_CLASSIC, new ResourceLocation("mcwdoors", "warped_classic_door"));
			
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_COTTAGE, new ResourceLocation("mcwdoors", "oak_cottage_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_COTTAGE, new ResourceLocation("mcwdoors", "birch_cottage_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_COTTAGE, new ResourceLocation("mcwdoors", "jungle_cottage_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_COTTAGE, new ResourceLocation("mcwdoors", "acacia_cottage_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_COTTAGE, new ResourceLocation("mcwdoors", "dark_oak_cottage_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_COTTAGE, new ResourceLocation("mcwdoors", "mangrove_cottage_door"));
			//createRecipeAdvancementJson(DDNames.TALL_MACAW_CHERRY_COTTAGE, new ResourceLocation("mcwdoors", "cherry_cottage_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BAMBOO_COTTAGE, new ResourceLocation("mcwdoors", "bamboo_cottage_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_COTTAGE, new ResourceLocation("mcwdoors", "crimson_cottage_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_COTTAGE, new ResourceLocation("mcwdoors", "warped_cottage_door"));
			
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_PAPER, new ResourceLocation("mcwdoors", "oak_paper_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_PAPER, new ResourceLocation("mcwdoors", "spruce_paper_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_PAPER, new ResourceLocation("mcwdoors", "jungle_paper_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_PAPER, new ResourceLocation("mcwdoors", "acacia_paper_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_PAPER, new ResourceLocation("mcwdoors", "dark_oak_paper_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_PAPER, new ResourceLocation("mcwdoors", "mangrove_paper_door"));
			//createRecipeAdvancementJson(DDNames.TALL_MACAW_CHERRY_PAPER, new ResourceLocation("mcwdoors", "cherry_paper_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BAMBOO_PAPER, new ResourceLocation("mcwdoors", "bamboo_paper_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_PAPER, new ResourceLocation("mcwdoors", "crimson_paper_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_PAPER, new ResourceLocation("mcwdoors", "warped_paper_door"));
			
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_BEACH, new ResourceLocation("mcwdoors", "oak_beach_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_BEACH, new ResourceLocation("mcwdoors", "spruce_beach_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_BEACH, new ResourceLocation("mcwdoors", "birch_beach_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_BEACH, new ResourceLocation("mcwdoors", "acacia_beach_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_BEACH, new ResourceLocation("mcwdoors", "dark_oak_beach_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_BEACH, new ResourceLocation("mcwdoors", "mangrove_beach_door"));
			//createRecipeAdvancementJson(DDNames.TALL_MACAW_CHERRY_BEACH, new ResourceLocation("mcwdoors", "cherry_beach_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BAMBOO_BEACH, new ResourceLocation("mcwdoors", "bamboo_beach_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_BEACH, new ResourceLocation("mcwdoors", "crimson_beach_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_BEACH, new ResourceLocation("mcwdoors", "warped_beach_door"));
			
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_TROPICAL, new ResourceLocation("mcwdoors", "oak_tropical_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_TROPICAL, new ResourceLocation("mcwdoors", "spruce_tropical_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_TROPICAL, new ResourceLocation("mcwdoors", "birch_tropical_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_TROPICAL, new ResourceLocation("mcwdoors", "jungle_tropical_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_TROPICAL, new ResourceLocation("mcwdoors", "dark_oak_tropical_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_TROPICAL, new ResourceLocation("mcwdoors", "mangrove_tropical_door"));
			//createRecipeAdvancementJson(DDNames.TALL_MACAW_CHERRY_TROPICAL, new ResourceLocation("mcwdoors", "cherry_tropical_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BAMBOO_TROPICAL, new ResourceLocation("mcwdoors", "bamboo_tropical_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_TROPICAL, new ResourceLocation("mcwdoors", "crimson_tropical_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_TROPICAL, new ResourceLocation("mcwdoors", "warped_tropical_door"));
			
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_FOUR_PANEL, new ResourceLocation("mcwdoors", "oak_four_panel_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_FOUR_PANEL, new ResourceLocation("mcwdoors", "spruce_four_panel_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_FOUR_PANEL, new ResourceLocation("mcwdoors", "birch_four_panel_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_FOUR_PANEL, new ResourceLocation("mcwdoors", "jungle_four_panel_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_FOUR_PANEL, new ResourceLocation("mcwdoors", "acacia_four_panel_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_FOUR_PANEL, new ResourceLocation("mcwdoors", "mangrove_four_panel_door"));
			//createRecipeAdvancementJson(DDNames.TALL_MACAW_CHERRY_FOUR_PANEL, new ResourceLocation("mcwdoors", "cherry_four_panel_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BAMBOO_FOUR_PANEL, new ResourceLocation("mcwdoors", "bamboo_four_panel_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_FOUR_PANEL, new ResourceLocation("mcwdoors", "crimson_four_panel_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_FOUR_PANEL, new ResourceLocation("mcwdoors", "warped_four_panel_door"));
			
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_SWAMP, new ResourceLocation("mcwdoors", "oak_swamp_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_SWAMP, new ResourceLocation("mcwdoors", "spruce_swamp_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_SWAMP, new ResourceLocation("mcwdoors", "birch_swamp_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_SWAMP, new ResourceLocation("mcwdoors", "jungle_swamp_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_SWAMP, new ResourceLocation("mcwdoors", "acacia_swamp_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_SWAMP, new ResourceLocation("mcwdoors", "dark_oak_swamp_door"));
			//createRecipeAdvancementJson(DDNames.TALL_MACAW_CHERRY_SWAMP, new ResourceLocation("mcwdoors", "cherry_swamp_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BAMBOO_SWAMP, new ResourceLocation("mcwdoors", "bamboo_swamp_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_SWAMP, new ResourceLocation("mcwdoors", "crimson_swamp_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_SWAMP, new ResourceLocation("mcwdoors", "warped_swamp_door"));

			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_WAFFLE, new ResourceLocation("mcwdoors", "oak_waffle_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_WAFFLE, new ResourceLocation("mcwdoors", "spruce_waffle_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_WAFFLE, new ResourceLocation("mcwdoors", "birch_waffle_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_WAFFLE, new ResourceLocation("mcwdoors", "jungle_waffle_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_WAFFLE, new ResourceLocation("mcwdoors", "acacia_waffle_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_WAFFLE, new ResourceLocation("mcwdoors", "dark_oak_waffle_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_WAFFLE, new ResourceLocation("mcwdoors", "mangrove_waffle_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BAMBOO_WAFFLE, new ResourceLocation("mcwdoors", "bamboo_waffle_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_WAFFLE, new ResourceLocation("mcwdoors", "crimson_waffle_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_WAFFLE, new ResourceLocation("mcwdoors", "warped_waffle_door"));

			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_BAMBOO, new ResourceLocation("mcwdoors", "oak_bamboo_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_BAMBOO, new ResourceLocation("mcwdoors", "spruce_bamboo_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_BAMBOO, new ResourceLocation("mcwdoors", "birch_bamboo_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_BAMBOO, new ResourceLocation("mcwdoors", "jungle_bamboo_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_BAMBOO, new ResourceLocation("mcwdoors", "acacia_bamboo_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_BAMBOO, new ResourceLocation("mcwdoors", "dark_oak_bamboo_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_BAMBOO, new ResourceLocation("mcwdoors", "mangrove_bamboo_door"));
			//createRecipeAdvancementJson(DDNames.TALL_MACAW_CHERRY_BAMBOO, new ResourceLocation("mcwdoors", "cherry_bamboo_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_BAMBOO, new ResourceLocation("mcwdoors", "crimson_bamboo_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_BAMBOO, new ResourceLocation("mcwdoors", "warped_bamboo_door"));
			
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_NETHER, new ResourceLocation("mcwdoors", "oak_nether_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_NETHER, new ResourceLocation("mcwdoors", "spruce_nether_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_NETHER, new ResourceLocation("mcwdoors", "birch_nether_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_NETHER, new ResourceLocation("mcwdoors", "jungle_nether_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_NETHER, new ResourceLocation("mcwdoors", "acacia_nether_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_NETHER, new ResourceLocation("mcwdoors", "dark_oak_nether_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_NETHER, new ResourceLocation("mcwdoors", "mangrove_nether_door"));
			//createRecipeAdvancementJson(DDNames.TALL_MACAW_CHERRY_NETHER, new ResourceLocation("mcwdoors", "cherry_nether_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BAMBOO_NETHER, new ResourceLocation("mcwdoors", "bamboo_nether_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_NETHER, new ResourceLocation("mcwdoors", "warped_nether_door"));
			
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_MYSTIC, new ResourceLocation("mcwdoors", "oak_mystic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_MYSTIC, new ResourceLocation("mcwdoors", "spruce_mystic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_MYSTIC, new ResourceLocation("mcwdoors", "birch_mystic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_MYSTIC, new ResourceLocation("mcwdoors", "jungle_mystic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_MYSTIC, new ResourceLocation("mcwdoors", "acacia_mystic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_MYSTIC, new ResourceLocation("mcwdoors", "dark_oak_mystic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_MYSTIC, new ResourceLocation("mcwdoors", "mangrove_mystic_door"));
			//createRecipeAdvancementJson(DDNames.TALL_MACAW_CHERRY_MYSTIC, new ResourceLocation("mcwdoors", "cherry_mystic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BAMBOO_MYSTIC, new ResourceLocation("mcwdoors", "bamboo_mystic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_MYSTIC, new ResourceLocation("mcwdoors", "crimson_mystic_door"));
		}
	}
	
    public static JsonObject createRecipeAdvancementJson(String recipeName, ResourceLocation triggeringItem) {
        //Creating a new json object, where we will store our recipe advancements.
        JsonObject json = new JsonObject();
        json.addProperty("parent", "dramaticdoors:recipes/root");
        
        //Create the criteria.
        JsonObject jsonCriteria = new JsonObject();
        
        JsonObject jsonHasRecipe = new JsonObject();
        jsonHasRecipe.addProperty("trigger", "minecraft:recipe_unlocked");
        JsonObject jsonHasRecipeCondition = new JsonObject();
        jsonHasRecipeCondition.addProperty("recipe", DramaticDoors.MOD_ID + ":" + recipeName);
        jsonHasRecipe.add("conditions", jsonHasRecipeCondition);
        
        JsonObject jsonHasItems = new JsonObject();
        jsonHasItems.addProperty("trigger", "minecraft:inventory_changed");
        JsonObject jsonHasItemsCondition = new JsonObject();
        JsonArray jsonHasItemsList = new JsonArray();
        JsonObject jsonHasItemsListEntry = new JsonObject();
        JsonArray jsonHasItemsListEntryArray = new JsonArray();
        jsonHasItemsListEntryArray.add(triggeringItem.toString());
        jsonHasItemsListEntry.add("items", jsonHasItemsListEntryArray);
        jsonHasItemsList.add(jsonHasItemsListEntry);
        jsonHasItemsCondition.add("items", jsonHasItemsList);
        jsonHasItems.add("conditions", jsonHasItemsCondition);
        		
        jsonCriteria.add("has_the_recipe", jsonHasRecipe);
        jsonCriteria.add("has_items", jsonHasItems);
        json.add("criteria", jsonCriteria);
 
        //Create the requirements.
        JsonArray jsonRequirements = new JsonArray();
        JsonArray jsonRequirementsInside = new JsonArray();
        jsonRequirementsInside.add("has_the_recipe");
        jsonRequirementsInside.add("has_items");
        jsonRequirements.add(jsonRequirementsInside);
        json.add("requirements", jsonRequirements);
        
        //Create the rewards.
        JsonObject jsonRewards = new JsonObject();
        JsonArray jsonRewardArray = new JsonArray();
        jsonRewardArray.add(DramaticDoors.MOD_ID + ":" + recipeName);
        jsonRewards.add("recipes", jsonRewardArray);
        json.add("rewards", jsonRewards);
 
        RECIPE_ADVANCEMENTS.add(json);
        return json;
    }
}
