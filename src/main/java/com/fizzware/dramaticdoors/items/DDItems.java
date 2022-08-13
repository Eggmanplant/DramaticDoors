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
    public static final Item TALL_IRON_DOOR = new TallDoorItem(DDBlocks.TALL_IRON_DOOR, new FabricItemSettings().group(DramaticDoors.DD_TAB));
    public static final Item TALL_OAK_DOOR = new TallDoorItem(DDBlocks.TALL_OAK_DOOR, new FabricItemSettings().group(DramaticDoors.DD_TAB));
    public static final Item TALL_SPRUCE_DOOR = new TallDoorItem(DDBlocks.TALL_SPRUCE_DOOR, new FabricItemSettings().group(DramaticDoors.DD_TAB));
    public static final Item TALL_BIRCH_DOOR = new TallDoorItem(DDBlocks.TALL_BIRCH_DOOR, new FabricItemSettings().group(DramaticDoors.DD_TAB));
    public static final Item TALL_JUNGLE_DOOR = new TallDoorItem(DDBlocks.TALL_JUNGLE_DOOR, new FabricItemSettings().group(DramaticDoors.DD_TAB));
    public static final Item TALL_ACACIA_DOOR = new TallDoorItem(DDBlocks.TALL_ACACIA_DOOR, new FabricItemSettings().group(DramaticDoors.DD_TAB));
    public static final Item TALL_DARK_OAK_DOOR = new TallDoorItem(DDBlocks.TALL_DARK_OAK_DOOR, new FabricItemSettings().group(DramaticDoors.DD_TAB));
    public static final Item TALL_MANGROVE_DOOR = new TallDoorItem(DDBlocks.TALL_MANGROVE_DOOR, new FabricItemSettings().group(DramaticDoors.DD_TAB));
    public static final Item TALL_CRIMSON_DOOR = new TallDoorItem(DDBlocks.TALL_CRIMSON_DOOR, new FabricItemSettings().group(DramaticDoors.DD_TAB));
    public static final Item TALL_WARPED_DOOR = new TallDoorItem(DDBlocks.TALL_WARPED_DOOR, new FabricItemSettings().group(DramaticDoors.DD_TAB));

    // Oh the Biomes You'll Go
    public static final Item TALL_BYG_ASPEN_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_ASPEN_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_TAB)));
    public static final Item TALL_BYG_BAOBAB_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_BAOBAB_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_TAB)));
    public static final Item TALL_BYG_BLUE_ENCHANTED_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_BLUE_ENCHANTED_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_TAB)));
    public static final Item TALL_BYG_BULBIS_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_BULBIS_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_TAB)));
    public static final Item TALL_BYG_CHERRY_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_CHERRY_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_TAB)));
    public static final Item TALL_BYG_CIKA_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_CIKA_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_TAB)));
    public static final Item TALL_BYG_CYPRESS_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_CYPRESS_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_TAB)));
    public static final Item TALL_BYG_EBONY_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_EBONY_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_TAB)));
    public static final Item TALL_BYG_EMBUR_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_EMBUR_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_TAB)));
    public static final Item TALL_BYG_ETHER_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_ETHER_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_TAB)));
    public static final Item TALL_BYG_FIR_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_FIR_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_TAB)));
    public static final Item TALL_BYG_FLORUS_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_FLORUS_DOOR, new FabricItemSettings().group(/*conditionalTabProperties("byg", DramaticDoors.DD_TAB)*/null));
    public static final Item TALL_BYG_GREEN_ENCHANTED_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_GREEN_ENCHANTED_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_TAB)));
    public static final Item TALL_BYG_HOLLY_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_HOLLY_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_TAB)));
    public static final Item TALL_BYG_IMPARIUS_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_IMPARIUS_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_TAB)));
    public static final Item TALL_BYG_IRONWOOD_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_IRONWOOD_DOOR, new FabricItemSettings().group(/*conditionalTabProperties("byg", DramaticDoors.DD_TAB)*/null));
    public static final Item TALL_BYG_JACARANDA_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_JACARANDA_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_TAB)));
    public static final Item TALL_BYG_LAMENT_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_LAMENT_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_TAB)));
    public static final Item TALL_BYG_MAHOGANY_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_MAHOGANY_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_TAB)));
    public static final Item TALL_BYG_MAPLE_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_MAPLE_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_TAB)));
    public static final Item TALL_BYG_NIGHTSHADE_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_NIGHTSHADE_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_TAB)));
    public static final Item TALL_BYG_PALM_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_PALM_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_TAB)));
    public static final Item TALL_BYG_PINE_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_PINE_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_TAB)));
    public static final Item TALL_BYG_RAINBOW_EUCALYPTUS_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_RAINBOW_EUCALYPTUS_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_TAB)));
    public static final Item TALL_BYG_REDWOOD_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_REDWOOD_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_TAB)));
    public static final Item TALL_BYG_SKYRIS_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_SKYRIS_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_TAB)));
    public static final Item TALL_BYG_SOUL_SHROOM_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_SOUL_SHROOM_DOOR, new FabricItemSettings().group(/*conditionalTabProperties("byg", DramaticDoors.DD_TAB)*/null));
    public static final Item TALL_BYG_SYTHIAN_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_SYTHIAN_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_TAB)));
    public static final Item TALL_BYG_WHITE_MANGROVE_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_WHITE_MANGROVE_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_TAB)));
    public static final Item TALL_BYG_WILLOW_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_WILLOW_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_TAB)));
    public static final Item TALL_BYG_WITCH_HAZEL_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_WITCH_HAZEL_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_TAB)));
    public static final Item TALL_BYG_ZELKOVA_DOOR = new TallDoorItem(DDBlocks.TALL_BYG_ZELKOVA_DOOR, new FabricItemSettings().group(conditionalTabProperties("byg", DramaticDoors.DD_TAB)));
    
    // Bewitchment
    public static final Item TALL_CYPRESS_DOOR = new TallDoorItem(DDBlocks.TALL_CYPRESS_DOOR, new FabricItemSettings().group(conditionalTabProperties("bewitchment", DramaticDoors.DD_TAB)));
    public static final Item TALL_DRAGONS_BLOOD_DOOR = new TallDoorItem(DDBlocks.TALL_DRAGONS_BLOOD_DOOR, new FabricItemSettings().group(conditionalTabProperties("bewitchment", DramaticDoors.DD_TAB)));
    public static final Item TALL_ELDER_DOOR = new TallDoorItem(DDBlocks.TALL_ELDER_DOOR, new FabricItemSettings().group(conditionalTabProperties("bewitchment", DramaticDoors.DD_TAB)));
    public static final Item TALL_JUNIPER_DOOR = new TallDoorItem(DDBlocks.TALL_JUNIPER_DOOR, new FabricItemSettings().group(conditionalTabProperties("bewitchment", DramaticDoors.DD_TAB)));
    
    // Biome Makeover
    public static final Item TALL_ANCIENT_OAK_DOOR = new TallDoorItem(DDBlocks.TALL_ANCIENT_OAK_DOOR, new FabricItemSettings().group(conditionalTabProperties("biomemakeover", DramaticDoors.DD_TAB)));
    public static final Item TALL_BLIGHTED_BALSA_DOOR = new TallDoorItem(DDBlocks.TALL_BLIGHTED_BALSA_DOOR, new FabricItemSettings().group(conditionalTabProperties("biomemakeover", DramaticDoors.DD_TAB)));
    public static final Item TALL_SWAMP_CYPRESS_DOOR = new TallDoorItem(DDBlocks.TALL_SWAMP_CYPRESS_DOOR, new FabricItemSettings().group(conditionalTabProperties("biomemakeover", DramaticDoors.DD_TAB)));
    public static final Item TALL_WILLOW_DOOR = new TallDoorItem(DDBlocks.TALL_WILLOW_DOOR, new FabricItemSettings().group(conditionalTabProperties("biomemakeover", DramaticDoors.DD_TAB)));
    
    // The Ceilands
    public static final Item TALL_CEILTRUNK_DOOR = new TallDoorItem(DDBlocks.TALL_CEILTRUNK_DOOR, new FabricItemSettings().group(conditionalTabProperties("ceilands", DramaticDoors.DD_TAB)));
    public static final Item TALL_LUZAWOOD_DOOR = new TallDoorItem(DDBlocks.TALL_LUZAWOOD_DOOR, new FabricItemSettings().group(conditionalTabProperties("ceilands", DramaticDoors.DD_TAB)));
    
    // Ecologics
    public static final Item TALL_ECO_AZALEA_DOOR = new TallDoorItem(DDBlocks.TALL_ECO_AZALEA_DOOR, new FabricItemSettings().group(conditionalTabProperties("ecologics", DramaticDoors.DD_TAB)));
    public static final Item TALL_ECO_FLOWERING_AZALEA_DOOR = new TallDoorItem(DDBlocks.TALL_ECO_FLOWERING_AZALEA_DOOR, new FabricItemSettings().group(conditionalTabProperties("ecologics", DramaticDoors.DD_TAB)));
    public static final Item TALL_ECO_COCONUT_DOOR = new TallDoorItem(DDBlocks.TALL_ECO_COCONUT_DOOR, new FabricItemSettings().group(conditionalTabProperties("ecologics", DramaticDoors.DD_TAB)));
    public static final Item TALL_ECO_WALNUT_DOOR = new TallDoorItem(DDBlocks.TALL_ECO_WALNUT_DOOR, new FabricItemSettings().group(conditionalTabProperties("ecologics", DramaticDoors.DD_TAB)));
    
    // Snowy Spirit
    public static final Item TALL_GINGERBREAD_DOOR = new TallDoorItem(DDBlocks.TALL_GINGERBREAD_DOOR, new FabricItemSettings().group(conditionalTabProperties("snowyspirit", DramaticDoors.DD_TAB)));
    
    // Supplementaries
    public static final Item TALL_GOLD_DOOR = new TallDoorItem(DDBlocks.TALL_GOLD_DOOR, new FabricItemSettings().group(conditionalTabProperties("supplementaries", DramaticDoors.DD_TAB)));
    public static final Item TALL_NETHERITE_DOOR = new TallDoorItem(DDBlocks.TALL_NETHERITE_DOOR, new FabricItemSettings().group(conditionalTabProperties("supplementaries", DramaticDoors.DD_TAB)));
    
    // Twigs
    public static final Item TALL_STRIPPED_BAMBOO_DOOR = new TallDoorItem(DDBlocks.TALL_STRIPPED_BAMBOO_DOOR, new FabricItemSettings().group(conditionalTabProperties("twigs", DramaticDoors.DD_TAB)));
    
    // Twilight Forest
    public static final Item TALL_CANOPY_DOOR = new TallDoorItem(DDBlocks.TALL_CANOPY_DOOR, new FabricItemSettings().group(conditionalTabProperties("twilightforest", DramaticDoors.DD_TAB)));
    public static final Item TALL_DARKWOOD_DOOR = new TallDoorItem(DDBlocks.TALL_DARKWOOD_DOOR, new FabricItemSettings().group(conditionalTabProperties("twilightforest", DramaticDoors.DD_TAB)));
    public static final Item TALL_MINEWOOD_DOOR = new TallDoorItem(DDBlocks.TALL_MINEWOOD_DOOR, new FabricItemSettings().group(conditionalTabProperties("twilightforest", DramaticDoors.DD_TAB)));
    public static final Item TALL_SORTINGWOOD_DOOR = new TallDoorItem(DDBlocks.TALL_SORTINGWOOD_DOOR, new FabricItemSettings().group(conditionalTabProperties("twilightforest", DramaticDoors.DD_TAB)));
    public static final Item TALL_TIMEWOOD_DOOR = new TallDoorItem(DDBlocks.TALL_TIMEWOOD_DOOR, new FabricItemSettings().group(conditionalTabProperties("twilightforest", DramaticDoors.DD_TAB)));
    public static final Item TALL_TRANSWOOD_DOOR = new TallDoorItem(DDBlocks.TALL_TRANSWOOD_DOOR, new FabricItemSettings().group(conditionalTabProperties("twilightforest", DramaticDoors.DD_TAB)));
    public static final Item TALL_TWILIGHT_MANGROVE_DOOR = new TallDoorItem(DDBlocks.TALL_TWILIGHT_MANGROVE_DOOR, new FabricItemSettings().group(conditionalTabProperties("twilightforest", DramaticDoors.DD_TAB)));
    public static final Item TALL_TWILIGHT_OAK_DOOR = new TallDoorItem(DDBlocks.TALL_TWILIGHT_OAK_DOOR, new FabricItemSettings().group(conditionalTabProperties("twilightforest", DramaticDoors.DD_TAB)));
    
    
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
		
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CYPRESS), TALL_CYPRESS_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_DRAGONS_BLOOD), TALL_DRAGONS_BLOOD_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_ELDER), TALL_ELDER_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_JUNIPER), TALL_JUNIPER_DOOR);
		
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_ANCIENT_OAK), TALL_ANCIENT_OAK_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_BLIGHTED_BALSA), TALL_BLIGHTED_BALSA_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_SWAMP_CYPRESS), TALL_SWAMP_CYPRESS_DOOR);
        Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_WILLOW), TALL_WILLOW_DOOR);

		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CEILTRUNK), TALL_CEILTRUNK_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_LUZAWOOD), TALL_LUZAWOOD_DOOR);

		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_ECO_AZALEA), TALL_ECO_AZALEA_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_ECO_FLOWERING_AZALEA), TALL_ECO_FLOWERING_AZALEA_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_ECO_COCONUT), TALL_ECO_COCONUT_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_ECO_WALNUT), TALL_ECO_WALNUT_DOOR);

		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_GINGERBREAD), TALL_GINGERBREAD_DOOR);

		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_GOLD), TALL_GOLD_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_NETHERITE), TALL_NETHERITE_DOOR);

		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_STRIPPED_BAMBOO), TALL_STRIPPED_BAMBOO_DOOR);

		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CANOPY), TALL_CANOPY_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_DARKWOOD), TALL_DARKWOOD_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_MINEWOOD), TALL_MINEWOOD_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_SORTINGWOOD), TALL_SORTINGWOOD_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_TIMEWOOD), TALL_TIMEWOOD_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_TRANSWOOD), TALL_TRANSWOOD_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_TWILIGHT_MANGROVE), TALL_TWILIGHT_MANGROVE_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_TWILIGHT_OAK), TALL_TWILIGHT_OAK_DOOR);
    }
	
    private static ItemGroup conditionalTabProperties(String modid, ItemGroup tab) {
    	return FabricLoader.getInstance().isModLoaded(modid) ? tab : null;
    }
}
