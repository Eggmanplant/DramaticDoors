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
		if (FabricLoader.getInstance().isModLoaded("abundance")) {
			createRecipeAdvancementJson(DDNames.TALL_JACARANDA, new ResourceLocation("abundance", "jacaranda_door"));
			createRecipeAdvancementJson(DDNames.TALL_REDBUD, new ResourceLocation("abundance", "redbud_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("bayou_blues")) {
			createRecipeAdvancementJson(DDNames.TALL_CYPRESS, new ResourceLocation("bayou_blues", "cypress_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("enhanced_mushrooms")) {
			createRecipeAdvancementJson(DDNames.TALL_BROWN_MUSHROOM, new ResourceLocation("enhanced_mushrooms", "brown_mushroom_door"));
			createRecipeAdvancementJson(DDNames.TALL_RED_MUSHROOM, new ResourceLocation("enhanced_mushrooms", "red_mushroom_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("ad_astra")) {
			createRecipeAdvancementJson(DDNames.TALL_AERONOS, new ResourceLocation("ad_astra", "aeronos_door"));
			createRecipeAdvancementJson(DDNames.TALL_GLACIAN, new ResourceLocation("ad_astra", "glacian_door"));
			createRecipeAdvancementJson(DDNames.TALL_STROPHAR, new ResourceLocation("ad_astra", "strophar_door"));
			createRecipeAdvancementJson(DDNames.TALL_STEEL, new ResourceLocation("ad_astra", "steel_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("architects_palette")) {
			createRecipeAdvancementJson(DDNames.TALL_TWISTED, new ResourceLocation("architects_palette", "twisted_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("bambooeverything")) {
			createRecipeAdvancementJson(DDNames.TALL_BE_BAMBOO, new ResourceLocation("bambooeverything", "bamboo_door"));
			createRecipeAdvancementJson(DDNames.TALL_BE_DRY_BAMBOO, new ResourceLocation("bambooeverything", "dry_bamboo_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("betterend")) {
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
			createRecipeAdvancementJson(DDNames.TALL_CYPRESS, new ResourceLocation("bewitchment", "cypress_door"));
			createRecipeAdvancementJson(DDNames.TALL_DRAGONS_BLOOD, new ResourceLocation("bewitchment", "dragons_blood_door"));
			createRecipeAdvancementJson(DDNames.TALL_ELDER, new ResourceLocation("bewitchment", "elder_door"));
			createRecipeAdvancementJson(DDNames.TALL_JUNIPER, new ResourceLocation("bewitchment", "juniper_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("biomancy")) {
			createRecipeAdvancementJson(DDNames.TALL_FLESH, new ResourceLocation("biomancy", "flesh_door"));
			createRecipeAdvancementJson(DDNames.TALL_FULL_FLESH, new ResourceLocation("biomancy", "full_flesh_door"));
			createRecipeAdvancementJson(DDNames.TALL_FLESHKIN, new ResourceLocation("biomancy", "fleshkin_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("biomemakeover")) {
			createRecipeAdvancementJson(DDNames.TALL_ANCIENT_OAK, new ResourceLocation("biomemakeover", "ancient_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_BLIGHTED_BALSA, new ResourceLocation("biomemakeover", "blighted_balsa_door"));
			createRecipeAdvancementJson(DDNames.TALL_SWAMP_CYPRESS, new ResourceLocation("biomemakeover", "swamp_cypress_door"));
			createRecipeAdvancementJson(DDNames.TALL_WILLOW, new ResourceLocation("biomemakeover", "willow_door"));			
		}
		if (FabricLoader.getInstance().isModLoaded("byg")) {
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
			createRecipeAdvancementJson(DDNames.TALL_BYG_WHITE_MANGROVE, new ResourceLocation("byg", "mangrove_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_WILLOW, new ResourceLocation("byg", "willow_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_WITCH_HAZEL, new ResourceLocation("byg", "witch_hazel_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_ZELKOVA, new ResourceLocation("byg", "zelkova_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("blockus")) {
			createRecipeAdvancementJson(DDNames.TALL_BLOCKUS_BAMBOO, new ResourceLocation("blockus", "bamboo_door"));
			createRecipeAdvancementJson(DDNames.TALL_BLOCKUS_BLACKSTONE, new ResourceLocation("blockus", "blackstone_door"));
			createRecipeAdvancementJson(DDNames.TALL_BLOCKUS_CHARRED, new ResourceLocation("blockus", "charred_door"));
			createRecipeAdvancementJson(DDNames.TALL_BLOCKUS_OBSIDIAN_REINFORCED, new ResourceLocation("blockus", "obsidian_reinforced_door"));
			createRecipeAdvancementJson(DDNames.TALL_BLOCKUS_PAPER, new ResourceLocation("blockus", "paper_door"));
			createRecipeAdvancementJson(DDNames.TALL_BLOCKUS_STONE, new ResourceLocation("blockus", "stone_door"));
			createRecipeAdvancementJson(DDNames.TALL_BLOCKUS_WHITE_OAK, new ResourceLocation("blockus", "white_oak_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("ceilands")) {
			createRecipeAdvancementJson(DDNames.TALL_CEILTRUNK, new ResourceLocation("ceilands", "ceiltrunk_door"));
			createRecipeAdvancementJson(DDNames.TALL_LUZAWOOD, new ResourceLocation("ceilands", "luzawood_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("charm")) {
			createRecipeAdvancementJson(DDNames.TALL_CHARM_AZALEA, new ResourceLocation("charm", "azalea_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHARM_EBONY, new ResourceLocation("charm", "ebony_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("colorful-azaleas")) {
			createRecipeAdvancementJson(DDNames.TALL_AZULE_AZALEA, new ResourceLocation("colorful-azaleas", "azule_azalea_door"));
			createRecipeAdvancementJson(DDNames.TALL_BRIGHT_AZALEA, new ResourceLocation("colorful-azaleas", "bright_azalea_door"));
			createRecipeAdvancementJson(DDNames.TALL_FISS_AZALEA, new ResourceLocation("colorful-azaleas", "fiss_azalea_door"));
			createRecipeAdvancementJson(DDNames.TALL_ROZE_AZALEA, new ResourceLocation("colorful-azaleas", "roze_azalea_door"));
			createRecipeAdvancementJson(DDNames.TALL_TECAL_AZALEA, new ResourceLocation("colorful-azaleas", "tecal_azalea_door"));
			createRecipeAdvancementJson(DDNames.TALL_TITANIUM_AZALEA, new ResourceLocation("colorful-azaleas", "titanium_azalea_door"));
			createRecipeAdvancementJson(DDNames.TALL_WALNUT_AZALEA, new ResourceLocation("colorful-azaleas", "walnut_azalea_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("createdeco")) {
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
			createRecipeAdvancementJson(DDNames.TALL_ECHO, new ResourceLocation("deeperdarker", "echo_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("ecologics")) {
			createRecipeAdvancementJson(DDNames.TALL_ECO_AZALEA, new ResourceLocation("ecologics", "azalea_door"));
			createRecipeAdvancementJson(DDNames.TALL_ECO_FLOWERING_AZALEA, new ResourceLocation("ecologics", "flowering_azalea_door"));
			createRecipeAdvancementJson(DDNames.TALL_ECO_COCONUT, new ResourceLocation("ecologics", "coconut_door"));
			createRecipeAdvancementJson(DDNames.TALL_ECO_WALNUT, new ResourceLocation("ecologics", "walnut_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("glassdoor")) {
			createRecipeAdvancementJson(DDNames.TALL_IRON_GLASS, new ResourceLocation("glassdoor", "iron_glassdoor"));
			createRecipeAdvancementJson(DDNames.TALL_OAK_GLASS, new ResourceLocation("glassdoor", "oak_glassdoor"));
			createRecipeAdvancementJson(DDNames.TALL_SPRUCE_GLASS, new ResourceLocation("glassdoor", "spruce_glassdoor"));
			createRecipeAdvancementJson(DDNames.TALL_BIRCH_GLASS, new ResourceLocation("glassdoor", "birch_glassdoor"));
			createRecipeAdvancementJson(DDNames.TALL_JUNGLE_GLASS, new ResourceLocation("glassdoor", "jungle_glassdoor"));
			createRecipeAdvancementJson(DDNames.TALL_ACACIA_GLASS, new ResourceLocation("glassdoor", "acacia_glassdoor"));
			createRecipeAdvancementJson(DDNames.TALL_DARK_OAK_GLASS, new ResourceLocation("glassdoor", "dark_oak_glassdoor"));
			createRecipeAdvancementJson(DDNames.TALL_CRIMSON_GLASS, new ResourceLocation("glassdoor", "crimson_glassdoor"));
			createRecipeAdvancementJson(DDNames.TALL_WARPED_GLASS, new ResourceLocation("glassdoor", "warped_glassdoor"));
		}
		if (FabricLoader.getInstance().isModLoaded("goodending")) {
			createRecipeAdvancementJson(DDNames.TALL_GE_CYPRESS, new ResourceLocation("goodending", "cypress_door"));
			createRecipeAdvancementJson(DDNames.TALL_GE_MUDDY_OAK, new ResourceLocation("goodending", "muddy_oak_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("graveyard")) {
			createRecipeAdvancementJson(DDNames.TALL_DARK_IRON, new ResourceLocation("graveyard", "dark_iron_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("hexcasting")) {
			createRecipeAdvancementJson(DDNames.TALL_AKASHIC, new ResourceLocation("hexcasting", "akashic_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("promenade")) {
			createRecipeAdvancementJson(DDNames.TALL_PROMENADE_CHERRY_OAK, new ResourceLocation("promenade", "cherry_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_PROMENADE_DARK_AMARANTH, new ResourceLocation("promenade", "dark_amaranth_door"));
			createRecipeAdvancementJson(DDNames.TALL_PROMENADE_PALM, new ResourceLocation("promenade", "palm_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("snowyspirit")) {
			createRecipeAdvancementJson(DDNames.TALL_GINGERBREAD, new ResourceLocation("snowyspirit", "gingerbread_door"));	
		}
		if (FabricLoader.getInstance().isModLoaded("supplementaries")) {
			createRecipeAdvancementJson(DDNames.TALL_GOLD, new ResourceLocation("supplementaries", "gold_door"));
			createRecipeAdvancementJson(DDNames.TALL_NETHERITE, new ResourceLocation("supplementaries", "netherite_door"));			
		}
		if (FabricLoader.getInstance().isModLoaded("tconstruct")) {
			createRecipeAdvancementJson(DDNames.TALL_BLOODSHROOM, new ResourceLocation("tconstruct", "bloodshroom_door"));
			createRecipeAdvancementJson(DDNames.TALL_GREENHEART, new ResourceLocation("tconstruct", "greenheart_door"));
			createRecipeAdvancementJson(DDNames.TALL_SKYROOT, new ResourceLocation("tconstruct", "skyroot_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("techreborn")) {
			createRecipeAdvancementJson(DDNames.TALL_RUBBER, new ResourceLocation("techreborn", "rubber_door"));			
		}
		if (FabricLoader.getInstance().isModLoaded("traverse")) {
			createRecipeAdvancementJson(DDNames.TALL_TRAVERSE_FIR, new ResourceLocation("traverse", "fir_door"));	
		}
		if (FabricLoader.getInstance().isModLoaded("twigs")) {
			createRecipeAdvancementJson(DDNames.TALL_GOLD, new ResourceLocation("twigs", "stripped_bamboo_door"));			
		}
		if (FabricLoader.getInstance().isModLoaded("twilightforest")) {
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
			createRecipeAdvancementJson(DDNames.TALL_TOWERWOOD, new ResourceLocation("tflostblocks", "towerwood_door"));			
		}
		if (FabricLoader.getInstance().isModLoaded("wildbackport")) {
			createRecipeAdvancementJson(DDNames.TALL_MANGROVE, new ResourceLocation("wildbackport", "mangrove_door"));			
		}
		if (FabricLoader.getInstance().isModLoaded("xps_additions")) {
			createRecipeAdvancementJson(DDNames.TALL_SOUL_COPPER, new ResourceLocation("xps_additions", "soul_copper_door"));			
		}
		if (FabricLoader.getInstance().isModLoaded("chipped")) {
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_OAK_01, new ResourceLocation("chipped", "oak_door_1"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_OAK_02, new ResourceLocation("chipped", "oak_door_2"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_OAK_03, new ResourceLocation("chipped", "oak_door_3"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_OAK_04, new ResourceLocation("chipped", "oak_door_4"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_OAK_05, new ResourceLocation("chipped", "oak_door_5"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_OAK_06, new ResourceLocation("chipped", "oak_door_6"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_OAK_07, new ResourceLocation("chipped", "oak_door_7"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_OAK_08, new ResourceLocation("chipped", "oak_door_8"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_OAK_09, new ResourceLocation("chipped", "oak_door_9"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_OAK_10, new ResourceLocation("chipped", "oak_door_10"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_OAK_11, new ResourceLocation("chipped", "oak_door_11"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_OAK_12, new ResourceLocation("chipped", "oak_door_12"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_OAK_13, new ResourceLocation("chipped", "oak_door_13"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_OAK_14, new ResourceLocation("chipped", "oak_door_14"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_OAK_15, new ResourceLocation("chipped", "oak_door_15"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_OAK_16, new ResourceLocation("chipped", "oak_door_16"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_OAK_17, new ResourceLocation("chipped", "oak_door_17"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_OAK_18, new ResourceLocation("chipped", "oak_door_18"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_OAK_19, new ResourceLocation("chipped", "oak_door_19"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_OAK_20, new ResourceLocation("chipped", "oak_door_20"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_SPRUCE_01, new ResourceLocation("chipped", "spruce_door_1"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_SPRUCE_02, new ResourceLocation("chipped", "spruce_door_2"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_SPRUCE_03, new ResourceLocation("chipped", "spruce_door_3"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_SPRUCE_04, new ResourceLocation("chipped", "spruce_door_4"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_SPRUCE_05, new ResourceLocation("chipped", "spruce_door_5"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_SPRUCE_06, new ResourceLocation("chipped", "spruce_door_6"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_SPRUCE_07, new ResourceLocation("chipped", "spruce_door_7"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_SPRUCE_08, new ResourceLocation("chipped", "spruce_door_8"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_SPRUCE_09, new ResourceLocation("chipped", "spruce_door_9"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_SPRUCE_10, new ResourceLocation("chipped", "spruce_door_10"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_SPRUCE_11, new ResourceLocation("chipped", "spruce_door_11"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_SPRUCE_12, new ResourceLocation("chipped", "spruce_door_12"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_SPRUCE_13, new ResourceLocation("chipped", "spruce_door_13"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_SPRUCE_14, new ResourceLocation("chipped", "spruce_door_14"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_SPRUCE_15, new ResourceLocation("chipped", "spruce_door_15"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_SPRUCE_16, new ResourceLocation("chipped", "spruce_door_16"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_SPRUCE_17, new ResourceLocation("chipped", "spruce_door_17"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_SPRUCE_18, new ResourceLocation("chipped", "spruce_door_18"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_SPRUCE_19, new ResourceLocation("chipped", "spruce_door_19"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_SPRUCE_20, new ResourceLocation("chipped", "spruce_door_20"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_BIRCH_01, new ResourceLocation("chipped", "birch_door_1"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_BIRCH_02, new ResourceLocation("chipped", "birch_door_2"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_BIRCH_03, new ResourceLocation("chipped", "birch_door_3"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_BIRCH_04, new ResourceLocation("chipped", "birch_door_4"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_BIRCH_05, new ResourceLocation("chipped", "birch_door_5"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_BIRCH_06, new ResourceLocation("chipped", "birch_door_6"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_BIRCH_07, new ResourceLocation("chipped", "birch_door_7"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_BIRCH_08, new ResourceLocation("chipped", "birch_door_8"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_BIRCH_09, new ResourceLocation("chipped", "birch_door_9"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_BIRCH_10, new ResourceLocation("chipped", "birch_door_10"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_BIRCH_11, new ResourceLocation("chipped", "birch_door_11"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_BIRCH_12, new ResourceLocation("chipped", "birch_door_12"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_BIRCH_13, new ResourceLocation("chipped", "birch_door_13"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_BIRCH_14, new ResourceLocation("chipped", "birch_door_14"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_BIRCH_15, new ResourceLocation("chipped", "birch_door_15"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_BIRCH_16, new ResourceLocation("chipped", "birch_door_16"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_BIRCH_17, new ResourceLocation("chipped", "birch_door_17"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_BIRCH_18, new ResourceLocation("chipped", "birch_door_18"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_BIRCH_19, new ResourceLocation("chipped", "birch_door_19"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_BIRCH_20, new ResourceLocation("chipped", "birch_door_20"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_JUNGLE_01, new ResourceLocation("chipped", "jungle_door_1"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_JUNGLE_02, new ResourceLocation("chipped", "jungle_door_2"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_JUNGLE_03, new ResourceLocation("chipped", "jungle_door_3"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_JUNGLE_04, new ResourceLocation("chipped", "jungle_door_4"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_JUNGLE_05, new ResourceLocation("chipped", "jungle_door_5"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_JUNGLE_06, new ResourceLocation("chipped", "jungle_door_6"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_JUNGLE_07, new ResourceLocation("chipped", "jungle_door_7"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_JUNGLE_08, new ResourceLocation("chipped", "jungle_door_8"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_JUNGLE_09, new ResourceLocation("chipped", "jungle_door_9"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_JUNGLE_10, new ResourceLocation("chipped", "jungle_door_10"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_JUNGLE_11, new ResourceLocation("chipped", "jungle_door_11"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_JUNGLE_12, new ResourceLocation("chipped", "jungle_door_12"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_JUNGLE_13, new ResourceLocation("chipped", "jungle_door_13"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_JUNGLE_14, new ResourceLocation("chipped", "jungle_door_14"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_JUNGLE_15, new ResourceLocation("chipped", "jungle_door_15"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_JUNGLE_16, new ResourceLocation("chipped", "jungle_door_16"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_JUNGLE_17, new ResourceLocation("chipped", "jungle_door_17"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_JUNGLE_18, new ResourceLocation("chipped", "jungle_door_18"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_JUNGLE_19, new ResourceLocation("chipped", "jungle_door_19"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_JUNGLE_20, new ResourceLocation("chipped", "jungle_door_20"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_ACACIA_01, new ResourceLocation("chipped", "acacia_door_1"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_ACACIA_02, new ResourceLocation("chipped", "acacia_door_2"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_ACACIA_03, new ResourceLocation("chipped", "acacia_door_3"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_ACACIA_04, new ResourceLocation("chipped", "acacia_door_4"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_ACACIA_05, new ResourceLocation("chipped", "acacia_door_5"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_ACACIA_06, new ResourceLocation("chipped", "acacia_door_6"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_ACACIA_07, new ResourceLocation("chipped", "acacia_door_7"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_ACACIA_08, new ResourceLocation("chipped", "acacia_door_8"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_ACACIA_09, new ResourceLocation("chipped", "acacia_door_9"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_ACACIA_10, new ResourceLocation("chipped", "acacia_door_10"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_ACACIA_11, new ResourceLocation("chipped", "acacia_door_11"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_ACACIA_12, new ResourceLocation("chipped", "acacia_door_12"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_ACACIA_13, new ResourceLocation("chipped", "acacia_door_13"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_ACACIA_14, new ResourceLocation("chipped", "acacia_door_14"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_ACACIA_15, new ResourceLocation("chipped", "acacia_door_15"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_ACACIA_16, new ResourceLocation("chipped", "acacia_door_16"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_ACACIA_17, new ResourceLocation("chipped", "acacia_door_17"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_ACACIA_18, new ResourceLocation("chipped", "acacia_door_18"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_ACACIA_19, new ResourceLocation("chipped", "acacia_door_19"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_ACACIA_20, new ResourceLocation("chipped", "acacia_door_20"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_DARK_OAK_01, new ResourceLocation("chipped", "dark_oak_door_1"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_DARK_OAK_02, new ResourceLocation("chipped", "dark_oak_door_2"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_DARK_OAK_03, new ResourceLocation("chipped", "dark_oak_door_3"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_DARK_OAK_04, new ResourceLocation("chipped", "dark_oak_door_4"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_DARK_OAK_05, new ResourceLocation("chipped", "dark_oak_door_5"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_DARK_OAK_06, new ResourceLocation("chipped", "dark_oak_door_6"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_DARK_OAK_07, new ResourceLocation("chipped", "dark_oak_door_7"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_DARK_OAK_08, new ResourceLocation("chipped", "dark_oak_door_8"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_DARK_OAK_09, new ResourceLocation("chipped", "dark_oak_door_9"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_DARK_OAK_10, new ResourceLocation("chipped", "dark_oak_door_10"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_DARK_OAK_11, new ResourceLocation("chipped", "dark_oak_door_11"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_DARK_OAK_12, new ResourceLocation("chipped", "dark_oak_door_12"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_DARK_OAK_13, new ResourceLocation("chipped", "dark_oak_door_13"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_DARK_OAK_14, new ResourceLocation("chipped", "dark_oak_door_14"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_DARK_OAK_15, new ResourceLocation("chipped", "dark_oak_door_15"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_DARK_OAK_16, new ResourceLocation("chipped", "dark_oak_door_16"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_DARK_OAK_17, new ResourceLocation("chipped", "dark_oak_door_17"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_DARK_OAK_18, new ResourceLocation("chipped", "dark_oak_door_18"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_DARK_OAK_19, new ResourceLocation("chipped", "dark_oak_door_19"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_DARK_OAK_20, new ResourceLocation("chipped", "dark_oak_door_20"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_CRIMSON_01, new ResourceLocation("chipped", "crimson_door_1"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_CRIMSON_02, new ResourceLocation("chipped", "crimson_door_2"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_CRIMSON_03, new ResourceLocation("chipped", "crimson_door_3"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_CRIMSON_04, new ResourceLocation("chipped", "crimson_door_4"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_CRIMSON_05, new ResourceLocation("chipped", "crimson_door_5"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_CRIMSON_06, new ResourceLocation("chipped", "crimson_door_6"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_CRIMSON_07, new ResourceLocation("chipped", "crimson_door_7"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_CRIMSON_08, new ResourceLocation("chipped", "crimson_door_8"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_CRIMSON_09, new ResourceLocation("chipped", "crimson_door_9"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_CRIMSON_10, new ResourceLocation("chipped", "crimson_door_10"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_CRIMSON_11, new ResourceLocation("chipped", "crimson_door_11"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_CRIMSON_12, new ResourceLocation("chipped", "crimson_door_12"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_CRIMSON_13, new ResourceLocation("chipped", "crimson_door_13"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_CRIMSON_14, new ResourceLocation("chipped", "crimson_door_14"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_CRIMSON_15, new ResourceLocation("chipped", "crimson_door_15"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_CRIMSON_16, new ResourceLocation("chipped", "crimson_door_16"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_CRIMSON_17, new ResourceLocation("chipped", "crimson_door_17"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_CRIMSON_18, new ResourceLocation("chipped", "crimson_door_18"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_CRIMSON_19, new ResourceLocation("chipped", "crimson_door_19"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_CRIMSON_20, new ResourceLocation("chipped", "crimson_door_20"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_WARPED_01, new ResourceLocation("chipped", "warped_door_1"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_WARPED_02, new ResourceLocation("chipped", "warped_door_2"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_WARPED_03, new ResourceLocation("chipped", "warped_door_3"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_WARPED_04, new ResourceLocation("chipped", "warped_door_4"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_WARPED_05, new ResourceLocation("chipped", "warped_door_5"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_WARPED_06, new ResourceLocation("chipped", "warped_door_6"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_WARPED_07, new ResourceLocation("chipped", "warped_door_7"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_WARPED_08, new ResourceLocation("chipped", "warped_door_8"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_WARPED_09, new ResourceLocation("chipped", "warped_door_9"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_WARPED_10, new ResourceLocation("chipped", "warped_door_10"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_WARPED_11, new ResourceLocation("chipped", "warped_door_11"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_WARPED_12, new ResourceLocation("chipped", "warped_door_12"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_WARPED_13, new ResourceLocation("chipped", "warped_door_13"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_WARPED_14, new ResourceLocation("chipped", "warped_door_14"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_WARPED_15, new ResourceLocation("chipped", "warped_door_15"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_WARPED_16, new ResourceLocation("chipped", "warped_door_16"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_WARPED_17, new ResourceLocation("chipped", "warped_door_17"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_WARPED_18, new ResourceLocation("chipped", "warped_door_18"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_WARPED_19, new ResourceLocation("chipped", "warped_door_19"));
			createRecipeAdvancementJson(DDNames.TALL_CHIPPED_WARPED_20, new ResourceLocation("chipped", "warped_door_20"));
		}
		if (FabricLoader.getInstance().isModLoaded("mcwdoors")) {
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
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_BARN, new ResourceLocation("mcwdoors", "crimson_barn_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_BARN, new ResourceLocation("mcwdoors", "warped_barn_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_BARN_GLASS, new ResourceLocation("mcwdoors", "oak_barn_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_BARN_GLASS, new ResourceLocation("mcwdoors", "spruce_barn_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_BARN_GLASS, new ResourceLocation("mcwdoors", "birch_barn_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_BARN_GLASS, new ResourceLocation("mcwdoors", "jungle_barn_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_BARN_GLASS, new ResourceLocation("mcwdoors", "acacia_barn_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_BARN_GLASS, new ResourceLocation("mcwdoors", "dark_oak_barn_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_BARN_GLASS, new ResourceLocation("mcwdoors", "crimson_barn_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_BARN_GLASS, new ResourceLocation("mcwdoors", "warped_barn_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_STABLE, new ResourceLocation("mcwdoors", "oak_stable_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_STABLE, new ResourceLocation("mcwdoors", "spruce_stable_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_STABLE, new ResourceLocation("mcwdoors", "birch_stable_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_STABLE, new ResourceLocation("mcwdoors", "jungle_stable_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_STABLE, new ResourceLocation("mcwdoors", "acacia_stable_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_STABLE, new ResourceLocation("mcwdoors", "dark_oak_stable_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_STABLE, new ResourceLocation("mcwdoors", "crimson_stable_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_STABLE, new ResourceLocation("mcwdoors", "warped_stable_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_STABLE_HEAD, new ResourceLocation("mcwdoors", "oak_stable_head_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_STABLE_HEAD, new ResourceLocation("mcwdoors", "spruce_stable_head_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_STABLE_HEAD, new ResourceLocation("mcwdoors", "birch_stable_head_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_STABLE_HEAD, new ResourceLocation("mcwdoors", "jungle_stable_head_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_STABLE_HEAD, new ResourceLocation("mcwdoors", "acacia_stable_head_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_STABLE_HEAD, new ResourceLocation("mcwdoors", "dark_oak_stable_head_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_STABLE_HEAD, new ResourceLocation("mcwdoors", "crimson_stable_head_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_STABLE_HEAD, new ResourceLocation("mcwdoors", "warped_stable_head_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_BARK_GLASS, new ResourceLocation("mcwdoors", "oak_bark_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_BARK_GLASS, new ResourceLocation("mcwdoors", "spruce_bark_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_BARK_GLASS, new ResourceLocation("mcwdoors", "birch_bark_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_BARK_GLASS, new ResourceLocation("mcwdoors", "jungle_bark_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_BARK_GLASS, new ResourceLocation("mcwdoors", "acacia_bark_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_BARK_GLASS, new ResourceLocation("mcwdoors", "dark_oak_bark_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_STEM_GLASS, new ResourceLocation("mcwdoors", "crimson_stem_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_STEM_GLASS, new ResourceLocation("mcwdoors", "warped_stem_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_GLASS, new ResourceLocation("mcwdoors", "oak_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_GLASS, new ResourceLocation("mcwdoors", "spruce_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_GLASS, new ResourceLocation("mcwdoors", "birch_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_GLASS, new ResourceLocation("mcwdoors", "jungle_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_GLASS, new ResourceLocation("mcwdoors", "acacia_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_GLASS, new ResourceLocation("mcwdoors", "dark_oak_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_GLASS, new ResourceLocation("mcwdoors", "crimson_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_GLASS, new ResourceLocation("mcwdoors", "warped_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_MODERN, new ResourceLocation("mcwdoors", "oak_modern_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_MODERN, new ResourceLocation("mcwdoors", "spruce_modern_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_MODERN, new ResourceLocation("mcwdoors", "birch_modern_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_MODERN, new ResourceLocation("mcwdoors", "jungle_modern_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_MODERN, new ResourceLocation("mcwdoors", "acacia_modern_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_MODERN, new ResourceLocation("mcwdoors", "dark_oak_modern_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_MODERN, new ResourceLocation("mcwdoors", "crimson_modern_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_MODERN, new ResourceLocation("mcwdoors", "warped_modern_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_JAPANESE, new ResourceLocation("mcwdoors", "oak_japanese_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_JAPANESE, new ResourceLocation("mcwdoors", "spruce_japanese_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_JAPANESE, new ResourceLocation("mcwdoors", "birch_japanese_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_JAPANESE, new ResourceLocation("mcwdoors", "jungle_japanese_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_JAPANESE, new ResourceLocation("mcwdoors", "acacia_japanese_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_JAPANESE, new ResourceLocation("mcwdoors", "dark_oak_japanese_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_JAPANESE, new ResourceLocation("mcwdoors", "crimson_japanese_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_JAPANESE, new ResourceLocation("mcwdoors", "warped_japanese_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_JAPANESE2, new ResourceLocation("mcwdoors", "oak_japanese2_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_JAPANESE2, new ResourceLocation("mcwdoors", "spruce_japanese2_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_JAPANESE2, new ResourceLocation("mcwdoors", "birch_japanese2_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_JAPANESE2, new ResourceLocation("mcwdoors", "jungle_japanese2_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_JAPANESE2, new ResourceLocation("mcwdoors", "acacia_japanese2_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_JAPANESE2, new ResourceLocation("mcwdoors", "dark_oak_japanese2_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_JAPANESE2, new ResourceLocation("mcwdoors", "crimson_japanese2_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_JAPANESE2, new ResourceLocation("mcwdoors", "warped_japanese2_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_CLASSIC, new ResourceLocation("mcwdoors", "spruce_classic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_CLASSIC, new ResourceLocation("mcwdoors", "birch_classic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_CLASSIC, new ResourceLocation("mcwdoors", "jungle_classic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_CLASSIC, new ResourceLocation("mcwdoors", "acacia_classic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_CLASSIC, new ResourceLocation("mcwdoors", "dark_oak_classic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_CLASSIC, new ResourceLocation("mcwdoors", "crimson_classic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_CLASSIC, new ResourceLocation("mcwdoors", "warped_classic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_COTTAGE, new ResourceLocation("mcwdoors", "oak_cottage_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_COTTAGE, new ResourceLocation("mcwdoors", "birch_cottage_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_COTTAGE, new ResourceLocation("mcwdoors", "jungle_cottage_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_COTTAGE, new ResourceLocation("mcwdoors", "acacia_cottage_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_COTTAGE, new ResourceLocation("mcwdoors", "dark_oak_cottage_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_COTTAGE, new ResourceLocation("mcwdoors", "crimson_cottage_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_COTTAGE, new ResourceLocation("mcwdoors", "warped_cottage_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_PAPER, new ResourceLocation("mcwdoors", "oak_paper_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_PAPER, new ResourceLocation("mcwdoors", "spruce_paper_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_PAPER, new ResourceLocation("mcwdoors", "jungle_paper_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_PAPER, new ResourceLocation("mcwdoors", "acacia_paper_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_PAPER, new ResourceLocation("mcwdoors", "dark_oak_paper_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_PAPER, new ResourceLocation("mcwdoors", "crimson_paper_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_PAPER, new ResourceLocation("mcwdoors", "warped_paper_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_BEACH, new ResourceLocation("mcwdoors", "oak_beach_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_BEACH, new ResourceLocation("mcwdoors", "spruce_beach_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_BEACH, new ResourceLocation("mcwdoors", "birch_beach_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_BEACH, new ResourceLocation("mcwdoors", "acacia_beach_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_BEACH, new ResourceLocation("mcwdoors", "dark_oak_beach_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_BEACH, new ResourceLocation("mcwdoors", "crimson_beach_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_BEACH, new ResourceLocation("mcwdoors", "warped_beach_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_TROPICAL, new ResourceLocation("mcwdoors", "oak_tropical_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_TROPICAL, new ResourceLocation("mcwdoors", "spruce_tropical_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_TROPICAL, new ResourceLocation("mcwdoors", "birch_tropical_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_TROPICAL, new ResourceLocation("mcwdoors", "jungle_tropical_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_TROPICAL, new ResourceLocation("mcwdoors", "dark_oak_tropical_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_TROPICAL, new ResourceLocation("mcwdoors", "crimson_tropical_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_TROPICAL, new ResourceLocation("mcwdoors", "warped_tropical_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_FOUR_PANEL, new ResourceLocation("mcwdoors", "oak_four_panel_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_FOUR_PANEL, new ResourceLocation("mcwdoors", "spruce_four_panel_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_FOUR_PANEL, new ResourceLocation("mcwdoors", "birch_four_panel_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_FOUR_PANEL, new ResourceLocation("mcwdoors", "jungle_four_panel_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_FOUR_PANEL, new ResourceLocation("mcwdoors", "acacia_four_panel_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_FOUR_PANEL, new ResourceLocation("mcwdoors", "crimson_four_panel_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_FOUR_PANEL, new ResourceLocation("mcwdoors", "warped_four_panel_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_SWAMP, new ResourceLocation("mcwdoors", "oak_swamp_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_SWAMP, new ResourceLocation("mcwdoors", "spruce_swamp_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_SWAMP, new ResourceLocation("mcwdoors", "birch_swamp_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_SWAMP, new ResourceLocation("mcwdoors", "jungle_swamp_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_SWAMP, new ResourceLocation("mcwdoors", "acacia_swamp_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_SWAMP, new ResourceLocation("mcwdoors", "dark_oak_swamp_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_SWAMP, new ResourceLocation("mcwdoors", "crimson_swamp_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_SWAMP, new ResourceLocation("mcwdoors", "warped_swamp_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_NETHER, new ResourceLocation("mcwdoors", "oak_nether_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_NETHER, new ResourceLocation("mcwdoors", "spruce_nether_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_NETHER, new ResourceLocation("mcwdoors", "birch_nether_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_NETHER, new ResourceLocation("mcwdoors", "jungle_nether_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_NETHER, new ResourceLocation("mcwdoors", "acacia_nether_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_NETHER, new ResourceLocation("mcwdoors", "dark_oak_nether_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_NETHER, new ResourceLocation("mcwdoors", "warped_nether_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_MYSTIC, new ResourceLocation("mcwdoors", "oak_mystic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_MYSTIC, new ResourceLocation("mcwdoors", "spruce_mystic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_MYSTIC, new ResourceLocation("mcwdoors", "birch_mystic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_MYSTIC, new ResourceLocation("mcwdoors", "jungle_mystic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_MYSTIC, new ResourceLocation("mcwdoors", "acacia_mystic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_MYSTIC, new ResourceLocation("mcwdoors", "dark_oak_mystic_door"));
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
