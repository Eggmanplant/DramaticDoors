package com.fizzware.dramaticdoors.crafting;

import java.util.ArrayList;
import java.util.List;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DramaticDoors;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.Identifier;

public class DDAdvancementCompats
{
	// The list of recipe advancements that will be filled out.
	public static List<JsonObject> RECIPE_ADVANCEMENTS = new ArrayList<JsonObject>();

	public static void initializeAdvancements() {
		if (FabricLoader.getInstance().isModLoaded("ad_astra")) {
			createRecipeAdvancementJson(DDNames.TALL_AERONOS, new Identifier("ad_astra", "aeronos_door"));
			createRecipeAdvancementJson(DDNames.TALL_GLACIAN, new Identifier("ad_astra", "glacian_door"));
			createRecipeAdvancementJson(DDNames.TALL_STROPHAR, new Identifier("ad_astra", "strophar_door"));
			createRecipeAdvancementJson(DDNames.TALL_STEEL, new Identifier("ad_astra", "steel_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("architects_palette")) {
			createRecipeAdvancementJson(DDNames.TALL_TWISTED, new Identifier("architects_palette", "twisted_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("bewitchment")) {
			createRecipeAdvancementJson(DDNames.TALL_CYPRESS, new Identifier("bewitchment", "cypress_door"));
			createRecipeAdvancementJson(DDNames.TALL_DRAGONS_BLOOD, new Identifier("bewitchment", "dragons_blood_door"));
			createRecipeAdvancementJson(DDNames.TALL_ELDER, new Identifier("bewitchment", "elder_door"));
			createRecipeAdvancementJson(DDNames.TALL_JUNIPER, new Identifier("bewitchment", "juniper_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("biomemakeover")) {
			createRecipeAdvancementJson(DDNames.TALL_ANCIENT_OAK, new Identifier("biomemakeover", "ancient_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_BLIGHTED_BALSA, new Identifier("biomemakeover", "blighted_balsa_door"));
			createRecipeAdvancementJson(DDNames.TALL_SWAMP_CYPRESS, new Identifier("biomemakeover", "swamp_cypress_door"));
			createRecipeAdvancementJson(DDNames.TALL_WILLOW, new Identifier("biomemakeover", "willow_door"));			
		}
		if (FabricLoader.getInstance().isModLoaded("byg")) {
			createRecipeAdvancementJson(DDNames.TALL_BYG_ASPEN, new Identifier("byg", "aspen_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_BAOBAB, new Identifier("byg", "baobab_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_BLUE_ENCHANTED, new Identifier("byg", "blue_enchanted_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_BULBIS, new Identifier("byg", "bulbis_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_CHERRY, new Identifier("byg", "cherry_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_CIKA, new Identifier("byg", "cika_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_CYPRESS, new Identifier("byg", "cypress_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_EBONY, new Identifier("byg", "ebony_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_EMBUR, new Identifier("byg", "embur_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_ETHER, new Identifier("byg", "ether_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_FIR, new Identifier("byg", "fir_door"));
			//createRecipeAdvancementJson(DDNames.TALL_BYG_FLORUS, new Identifier("byg", "florus_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_GREEN_ENCHANTED, new Identifier("byg", "green_enchanted_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_HOLLY, new Identifier("byg", "holly_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_IMPARIUS, new Identifier("byg", "imparius_door"));
			//createRecipeAdvancementJson(DDNames.TALL_BYG_IRONWOOD, new Identifier("byg", "ironwood_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_JACARANDA, new Identifier("byg", "jacaranda_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_LAMENT, new Identifier("byg", "lament_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_MAHOGANY, new Identifier("byg", "mahogany_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_MAPLE, new Identifier("byg", "maple_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_NIGHTSHADE, new Identifier("byg", "nightshade_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_PALM, new Identifier("byg", "palm_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_PINE, new Identifier("byg", "pine_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_RAINBOW_EUCALYPTUS, new Identifier("byg", "rainbow_eucalyptus_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_REDWOOD, new Identifier("byg", "redwood_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_SKYRIS, new Identifier("byg", "skyris_door"));
			//createRecipeAdvancementJson(DDNames.TALL_BYG_SOUL_SHROOM, new Identifier("byg", "soul_shroom_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_SYTHIAN, new Identifier("byg", "sythian_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_WHITE_MANGROVE, new Identifier("byg", "white_mangrove_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_WILLOW, new Identifier("byg", "willow_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_WITCH_HAZEL, new Identifier("byg", "witch_hazel_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_ZELKOVA, new Identifier("byg", "zelkova_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("blockus")) {
			createRecipeAdvancementJson(DDNames.TALL_BLOCKUS_BAMBOO, new Identifier("blockus", "bamboo_door"));
			createRecipeAdvancementJson(DDNames.TALL_BLOCKUS_BLACKSTONE, new Identifier("blockus", "blackstone_door"));
			createRecipeAdvancementJson(DDNames.TALL_BLOCKUS_CHARRED, new Identifier("blockus", "charred_door"));
			createRecipeAdvancementJson(DDNames.TALL_BLOCKUS_OBSIDIAN_REINFORCED, new Identifier("blockus", "obsidian_reinforced_door"));
			createRecipeAdvancementJson(DDNames.TALL_BLOCKUS_PAPER, new Identifier("blockus", "paper_door"));
			createRecipeAdvancementJson(DDNames.TALL_BLOCKUS_STONE, new Identifier("blockus", "stone_door"));
			createRecipeAdvancementJson(DDNames.TALL_BLOCKUS_WHITE_OAK, new Identifier("blockus", "white_oak_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("ceilands")) {
			createRecipeAdvancementJson(DDNames.TALL_CEILTRUNK, new Identifier("ceilands", "ceiltrunk_door"));
			createRecipeAdvancementJson(DDNames.TALL_LUZAWOOD, new Identifier("ceilands", "luzawood_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("charm")) {
			createRecipeAdvancementJson(DDNames.TALL_CHARM_AZALEA, new Identifier("charm", "azalea_door"));
			createRecipeAdvancementJson(DDNames.TALL_CHARM_EBONY, new Identifier("charm", "ebony_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("ecologics")) {
			createRecipeAdvancementJson(DDNames.TALL_ECO_AZALEA, new Identifier("ecologics", "azalea_door"));
			createRecipeAdvancementJson(DDNames.TALL_ECO_FLOWERING_AZALEA, new Identifier("ecologics", "flowering_azalea_door"));
			createRecipeAdvancementJson(DDNames.TALL_ECO_COCONUT, new Identifier("ecologics", "coconut_door"));
			createRecipeAdvancementJson(DDNames.TALL_ECO_WALNUT, new Identifier("ecologics", "walnut_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("glassdoor")) {
			createRecipeAdvancementJson(DDNames.TALL_IRON_GLASS, new Identifier("glassdoor", "iron_glassdoor"));
			createRecipeAdvancementJson(DDNames.TALL_OAK_GLASS, new Identifier("glassdoor", "oak_glassdoor"));
			createRecipeAdvancementJson(DDNames.TALL_SPRUCE_GLASS, new Identifier("glassdoor", "spruce_glassdoor"));
			createRecipeAdvancementJson(DDNames.TALL_BIRCH_GLASS, new Identifier("glassdoor", "birch_glassdoor"));
			createRecipeAdvancementJson(DDNames.TALL_JUNGLE_GLASS, new Identifier("glassdoor", "jungle_glassdoor"));
			createRecipeAdvancementJson(DDNames.TALL_ACACIA_GLASS, new Identifier("glassdoor", "acacia_glassdoor"));
			createRecipeAdvancementJson(DDNames.TALL_DARK_OAK_GLASS, new Identifier("glassdoor", "dark_oak_glassdoor"));
			createRecipeAdvancementJson(DDNames.TALL_MANGROVE_GLASS, new Identifier("glassdoor", "mangrove_glassdoor"));
			createRecipeAdvancementJson(DDNames.TALL_CRIMSON_GLASS, new Identifier("glassdoor", "crimson_glassdoor"));
			createRecipeAdvancementJson(DDNames.TALL_WARPED_GLASS, new Identifier("glassdoor", "warped_glassdoor"));
		}
		if (FabricLoader.getInstance().isModLoaded("promenade")) {
			createRecipeAdvancementJson(DDNames.TALL_PROMENADE_CHERRY_OAK, new Identifier("promenade", "cherry_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_PROMENADE_DARK_AMARANTH, new Identifier("promenade", "dark_amaranth_door"));
			createRecipeAdvancementJson(DDNames.TALL_PROMENADE_PALM, new Identifier("promenade", "palm_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("snowyspirit")) {
			createRecipeAdvancementJson(DDNames.TALL_GINGERBREAD, new Identifier("snowyspirit", "gingerbread_door"));	
		}
		if (FabricLoader.getInstance().isModLoaded("supplementaries")) {
			createRecipeAdvancementJson(DDNames.TALL_GOLD, new Identifier("supplementaries", "gold_door"));
			createRecipeAdvancementJson(DDNames.TALL_NETHERITE, new Identifier("supplementaries", "netherite_door"));			
		}
		if (FabricLoader.getInstance().isModLoaded("tconstruct")) {
			createRecipeAdvancementJson(DDNames.TALL_BLOODSHROOM, new Identifier("tconstruct", "bloodshroom_door"));
			createRecipeAdvancementJson(DDNames.TALL_GREENHEART, new Identifier("tconstruct", "greenheart_door"));
			createRecipeAdvancementJson(DDNames.TALL_SKYROOT, new Identifier("tconstruct", "skyroot_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("techreborn")) {
			createRecipeAdvancementJson(DDNames.TALL_RUBBER, new Identifier("techreborn", "rubber_door"));			
		}
		if (FabricLoader.getInstance().isModLoaded("traverse")) {
			createRecipeAdvancementJson(DDNames.TALL_TRAVERSE_FIR, new Identifier("traverse", "fir_door"));	
		}
		if (FabricLoader.getInstance().isModLoaded("twigs")) {
			createRecipeAdvancementJson(DDNames.TALL_GOLD, new Identifier("twigs", "stripped_bamboo_door"));			
		}
		if (FabricLoader.getInstance().isModLoaded("twilightforest")) {
			createRecipeAdvancementJson(DDNames.TALL_CANOPY, new Identifier("twilightforest", "canopy_door"));
			createRecipeAdvancementJson(DDNames.TALL_DARKWOOD, new Identifier("twilightforest", "dark_door"));
			createRecipeAdvancementJson(DDNames.TALL_TWILIGHT_MANGROVE, new Identifier("twilightforest", "mangrove_door"));
			createRecipeAdvancementJson(DDNames.TALL_MINEWOOD, new Identifier("twilightforest", "mining_door"));
			createRecipeAdvancementJson(DDNames.TALL_SORTINGWOOD, new Identifier("twilightforest", "sorting_door"));
			createRecipeAdvancementJson(DDNames.TALL_TIMEWOOD, new Identifier("twilightforest", "time_door"));
			createRecipeAdvancementJson(DDNames.TALL_TRANSWOOD, new Identifier("twilightforest", "transformation_door"));
			createRecipeAdvancementJson(DDNames.TALL_TWILIGHT_OAK, new Identifier("twilightforest", "twilight_oak_door"));			
		}
		if (FabricLoader.getInstance().isModLoaded("xps_additions")) {
			createRecipeAdvancementJson(DDNames.TALL_SOUL_COPPER, new Identifier("xps_additions", "soul_copper_door"));			
		}
		if (FabricLoader.getInstance().isModLoaded("mcwdoors")) {
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JAIL, new Identifier("mcwdoors", "jail_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_METAL, new Identifier("mcwdoors", "metal_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_METAL_HOSPITAL, new Identifier("mcwdoors", "metal_hospital_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_METAL_REINFORCED, new Identifier("mcwdoors", "metal_reinforced_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_METAL_WARNING, new Identifier("mcwdoors", "metal_warning_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_METAL_WINDOWED, new Identifier("mcwdoors", "metal_windowed_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_BARN, new Identifier("mcwdoors", "oak_barn_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_BARN, new Identifier("mcwdoors", "spruce_barn_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_BARN, new Identifier("mcwdoors", "birch_barn_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_BARN, new Identifier("mcwdoors", "jungle_barn_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_BARN, new Identifier("mcwdoors", "acacia_barn_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_BARN, new Identifier("mcwdoors", "dark_oak_barn_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_BARN, new Identifier("mcwdoors", "mangrove_barn_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_BARN, new Identifier("mcwdoors", "crimson_barn_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_BARN, new Identifier("mcwdoors", "warped_barn_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_BARN_GLASS, new Identifier("mcwdoors", "oak_barn_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_BARN_GLASS, new Identifier("mcwdoors", "spruce_barn_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_BARN_GLASS, new Identifier("mcwdoors", "birch_barn_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_BARN_GLASS, new Identifier("mcwdoors", "jungle_barn_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_BARN_GLASS, new Identifier("mcwdoors", "acacia_barn_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_BARN_GLASS, new Identifier("mcwdoors", "dark_oak_barn_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_BARN_GLASS, new Identifier("mcwdoors", "mangrove_barn_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_BARN_GLASS, new Identifier("mcwdoors", "crimson_barn_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_BARN_GLASS, new Identifier("mcwdoors", "warped_barn_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_STABLE, new Identifier("mcwdoors", "oak_stable_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_STABLE, new Identifier("mcwdoors", "spruce_stable_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_STABLE, new Identifier("mcwdoors", "birch_stable_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_STABLE, new Identifier("mcwdoors", "jungle_stable_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_STABLE, new Identifier("mcwdoors", "acacia_stable_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_STABLE, new Identifier("mcwdoors", "dark_oak_stable_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_STABLE, new Identifier("mcwdoors", "mangrove_stable_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_STABLE, new Identifier("mcwdoors", "crimson_stable_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_STABLE, new Identifier("mcwdoors", "warped_stable_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_STABLE_HEAD, new Identifier("mcwdoors", "oak_stable_head_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_STABLE_HEAD, new Identifier("mcwdoors", "spruce_stable_head_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_STABLE_HEAD, new Identifier("mcwdoors", "birch_stable_head_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_STABLE_HEAD, new Identifier("mcwdoors", "jungle_stable_head_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_STABLE_HEAD, new Identifier("mcwdoors", "acacia_stable_head_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_STABLE_HEAD, new Identifier("mcwdoors", "dark_oak_stable_head_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_STABLE_HEAD, new Identifier("mcwdoors", "mangrove_stable_head_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_STABLE_HEAD, new Identifier("mcwdoors", "crimson_stable_head_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_STABLE_HEAD, new Identifier("mcwdoors", "warped_stable_head_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_BARK_GLASS, new Identifier("mcwdoors", "oak_bark_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_BARK_GLASS, new Identifier("mcwdoors", "spruce_bark_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_BARK_GLASS, new Identifier("mcwdoors", "birch_bark_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_BARK_GLASS, new Identifier("mcwdoors", "jungle_bark_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_BARK_GLASS, new Identifier("mcwdoors", "acacia_bark_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_BARK_GLASS, new Identifier("mcwdoors", "dark_oak_bark_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_BARK_GLASS, new Identifier("mcwdoors", "mangrove_bark_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_STEM_GLASS, new Identifier("mcwdoors", "crimson_stem_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_STEM_GLASS, new Identifier("mcwdoors", "warped_stem_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_GLASS, new Identifier("mcwdoors", "oak_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_GLASS, new Identifier("mcwdoors", "spruce_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_GLASS, new Identifier("mcwdoors", "birch_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_GLASS, new Identifier("mcwdoors", "jungle_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_GLASS, new Identifier("mcwdoors", "acacia_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_GLASS, new Identifier("mcwdoors", "dark_oak_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_GLASS, new Identifier("mcwdoors", "mangrove_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_GLASS, new Identifier("mcwdoors", "crimson_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_GLASS, new Identifier("mcwdoors", "warped_glass_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_MODERN, new Identifier("mcwdoors", "oak_modern_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_MODERN, new Identifier("mcwdoors", "spruce_modern_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_MODERN, new Identifier("mcwdoors", "birch_modern_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_MODERN, new Identifier("mcwdoors", "jungle_modern_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_MODERN, new Identifier("mcwdoors", "acacia_modern_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_MODERN, new Identifier("mcwdoors", "dark_oak_modern_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_MODERN, new Identifier("mcwdoors", "mangrove_modern_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_MODERN, new Identifier("mcwdoors", "crimson_modern_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_MODERN, new Identifier("mcwdoors", "warped_modern_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_JAPANESE, new Identifier("mcwdoors", "oak_japanese_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_JAPANESE, new Identifier("mcwdoors", "spruce_japanese_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_JAPANESE, new Identifier("mcwdoors", "birch_japanese_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_JAPANESE, new Identifier("mcwdoors", "jungle_japanese_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_JAPANESE, new Identifier("mcwdoors", "acacia_japanese_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_JAPANESE, new Identifier("mcwdoors", "dark_oak_japanese_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_JAPANESE, new Identifier("mcwdoors", "mangrove_japanese_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_JAPANESE, new Identifier("mcwdoors", "crimson_japanese_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_JAPANESE, new Identifier("mcwdoors", "warped_japanese_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_JAPANESE2, new Identifier("mcwdoors", "oak_japanese2_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_JAPANESE2, new Identifier("mcwdoors", "spruce_japanese2_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_JAPANESE2, new Identifier("mcwdoors", "birch_japanese2_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_JAPANESE2, new Identifier("mcwdoors", "jungle_japanese2_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_JAPANESE2, new Identifier("mcwdoors", "acacia_japanese2_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_JAPANESE2, new Identifier("mcwdoors", "dark_oak_japanese2_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_JAPANESE2, new Identifier("mcwdoors", "mangrove_japanese2_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_JAPANESE2, new Identifier("mcwdoors", "crimson_japanese2_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_JAPANESE2, new Identifier("mcwdoors", "warped_japanese2_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_CLASSIC, new Identifier("mcwdoors", "spruce_classic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_CLASSIC, new Identifier("mcwdoors", "birch_classic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_CLASSIC, new Identifier("mcwdoors", "jungle_classic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_CLASSIC, new Identifier("mcwdoors", "acacia_classic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_CLASSIC, new Identifier("mcwdoors", "dark_oak_classic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_CLASSIC, new Identifier("mcwdoors", "mangrove_classic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_CLASSIC, new Identifier("mcwdoors", "crimson_classic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_CLASSIC, new Identifier("mcwdoors", "warped_classic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_COTTAGE, new Identifier("mcwdoors", "oak_cottage_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_COTTAGE, new Identifier("mcwdoors", "birch_cottage_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_COTTAGE, new Identifier("mcwdoors", "jungle_cottage_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_COTTAGE, new Identifier("mcwdoors", "acacia_cottage_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_COTTAGE, new Identifier("mcwdoors", "dark_oak_cottage_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_COTTAGE, new Identifier("mcwdoors", "mangrove_cottage_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_COTTAGE, new Identifier("mcwdoors", "crimson_cottage_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_COTTAGE, new Identifier("mcwdoors", "warped_cottage_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_PAPER, new Identifier("mcwdoors", "oak_paper_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_PAPER, new Identifier("mcwdoors", "spruce_paper_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_PAPER, new Identifier("mcwdoors", "jungle_paper_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_PAPER, new Identifier("mcwdoors", "acacia_paper_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_PAPER, new Identifier("mcwdoors", "dark_oak_paper_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_PAPER, new Identifier("mcwdoors", "mangrove_paper_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_PAPER, new Identifier("mcwdoors", "crimson_paper_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_PAPER, new Identifier("mcwdoors", "warped_paper_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_BEACH, new Identifier("mcwdoors", "oak_beach_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_BEACH, new Identifier("mcwdoors", "spruce_beach_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_BEACH, new Identifier("mcwdoors", "birch_beach_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_BEACH, new Identifier("mcwdoors", "acacia_beach_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_BEACH, new Identifier("mcwdoors", "dark_oak_beach_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_BEACH, new Identifier("mcwdoors", "mangrove_beach_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_BEACH, new Identifier("mcwdoors", "crimson_beach_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_BEACH, new Identifier("mcwdoors", "warped_beach_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_TROPICAL, new Identifier("mcwdoors", "oak_tropical_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_TROPICAL, new Identifier("mcwdoors", "spruce_tropical_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_TROPICAL, new Identifier("mcwdoors", "birch_tropical_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_TROPICAL, new Identifier("mcwdoors", "jungle_tropical_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_TROPICAL, new Identifier("mcwdoors", "dark_oak_tropical_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_TROPICAL, new Identifier("mcwdoors", "mangrove_tropical_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_TROPICAL, new Identifier("mcwdoors", "crimson_tropical_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_TROPICAL, new Identifier("mcwdoors", "warped_tropical_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_FOUR_PANEL, new Identifier("mcwdoors", "oak_four_panel_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_FOUR_PANEL, new Identifier("mcwdoors", "spruce_four_panel_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_FOUR_PANEL, new Identifier("mcwdoors", "birch_four_panel_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_FOUR_PANEL, new Identifier("mcwdoors", "jungle_four_panel_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_FOUR_PANEL, new Identifier("mcwdoors", "acacia_four_panel_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_FOUR_PANEL, new Identifier("mcwdoors", "mangrove_four_panel_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_FOUR_PANEL, new Identifier("mcwdoors", "crimson_four_panel_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_FOUR_PANEL, new Identifier("mcwdoors", "warped_four_panel_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_SWAMP, new Identifier("mcwdoors", "oak_swamp_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_SWAMP, new Identifier("mcwdoors", "spruce_swamp_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_SWAMP, new Identifier("mcwdoors", "birch_swamp_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_SWAMP, new Identifier("mcwdoors", "jungle_swamp_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_SWAMP, new Identifier("mcwdoors", "acacia_swamp_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_SWAMP, new Identifier("mcwdoors", "dark_oak_swamp_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_SWAMP, new Identifier("mcwdoors", "crimson_swamp_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_SWAMP, new Identifier("mcwdoors", "warped_swamp_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_NETHER, new Identifier("mcwdoors", "oak_nether_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_NETHER, new Identifier("mcwdoors", "spruce_nether_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_NETHER, new Identifier("mcwdoors", "birch_nether_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_NETHER, new Identifier("mcwdoors", "jungle_nether_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_NETHER, new Identifier("mcwdoors", "acacia_nether_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_NETHER, new Identifier("mcwdoors", "dark_oak_nether_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_NETHER, new Identifier("mcwdoors", "mangrove_nether_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_NETHER, new Identifier("mcwdoors", "warped_nether_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_MYSTIC, new Identifier("mcwdoors", "oak_mystic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_MYSTIC, new Identifier("mcwdoors", "spruce_mystic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_MYSTIC, new Identifier("mcwdoors", "birch_mystic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_MYSTIC, new Identifier("mcwdoors", "jungle_mystic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_MYSTIC, new Identifier("mcwdoors", "acacia_mystic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_MYSTIC, new Identifier("mcwdoors", "dark_oak_mystic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_MYSTIC, new Identifier("mcwdoors", "mangrove_mystic_door"));
			createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_MYSTIC, new Identifier("mcwdoors", "crimson_mystic_door"));
		}
	}
	
    public static JsonObject createRecipeAdvancementJson(String recipeName, Identifier triggeringItem) {
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
