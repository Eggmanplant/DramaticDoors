package com.fizzware.dramaticdoors.items;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.CreativeModeTab.TabVisibility;
import oshi.util.tuples.Pair;

public class DDItems {
	
    public static final ResourceKey<CreativeModeTab> MAIN_TAB = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(DramaticDoors.MOD_ID, "main_tab"));
    public static final ResourceKey<CreativeModeTab> CHIPPED_TAB = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(DramaticDoors.MOD_ID, "chipped_tab"));
    public static final ResourceKey<CreativeModeTab> MACAW_TAB = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(DramaticDoors.MOD_ID, "macaw_tab"));
    public static final ResourceKey<CreativeModeTab> MANYIDEAS_TAB = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(DramaticDoors.MOD_ID, "manyideas_tab"));
	
	public static final Item.Properties PROPERTIES = new FabricItemSettings();
	
	// Vanilla
    public static final Item SHORT_IRON_DOOR = new ShortDoorItem(DDBlocks.SHORT_IRON_DOOR, PROPERTIES);
    public static final Item SHORT_OAK_DOOR = new ShortDoorItem(DDBlocks.SHORT_OAK_DOOR, PROPERTIES);
    public static final Item SHORT_SPRUCE_DOOR = new ShortDoorItem(DDBlocks.SHORT_SPRUCE_DOOR, PROPERTIES);
    public static final Item SHORT_BIRCH_DOOR = new ShortDoorItem(DDBlocks.SHORT_BIRCH_DOOR, PROPERTIES);
    public static final Item SHORT_JUNGLE_DOOR = new ShortDoorItem(DDBlocks.SHORT_JUNGLE_DOOR, PROPERTIES);
    public static final Item SHORT_ACACIA_DOOR = new ShortDoorItem(DDBlocks.SHORT_ACACIA_DOOR, PROPERTIES);
    public static final Item SHORT_DARK_OAK_DOOR = new ShortDoorItem(DDBlocks.SHORT_DARK_OAK_DOOR, PROPERTIES);
    public static final Item SHORT_MANGROVE_DOOR = new ShortDoorItem(DDBlocks.SHORT_MANGROVE_DOOR, PROPERTIES);
    public static final Item SHORT_BAMBOO_DOOR = new ShortDoorItem(DDBlocks.SHORT_BAMBOO_DOOR, PROPERTIES);
    public static final Item SHORT_CHERRY_DOOR = new ShortDoorItem(DDBlocks.SHORT_CHERRY_DOOR, PROPERTIES);
    public static final Item SHORT_CRIMSON_DOOR = new ShortDoorItem(DDBlocks.SHORT_CRIMSON_DOOR, PROPERTIES);
    public static final Item SHORT_WARPED_DOOR = new ShortDoorItem(DDBlocks.SHORT_WARPED_DOOR, PROPERTIES);

    public static final Item TALL_IRON_DOOR = new TallDoorItem(DDBlocks.TALL_IRON_DOOR, PROPERTIES);
    public static final Item TALL_OAK_DOOR = new TallDoorItem(DDBlocks.TALL_OAK_DOOR, PROPERTIES);
    public static final Item TALL_SPRUCE_DOOR = new TallDoorItem(DDBlocks.TALL_SPRUCE_DOOR, PROPERTIES);
    public static final Item TALL_BIRCH_DOOR = new TallDoorItem(DDBlocks.TALL_BIRCH_DOOR, PROPERTIES);
    public static final Item TALL_JUNGLE_DOOR = new TallDoorItem(DDBlocks.TALL_JUNGLE_DOOR, PROPERTIES);
    public static final Item TALL_ACACIA_DOOR = new TallDoorItem(DDBlocks.TALL_ACACIA_DOOR, PROPERTIES);
    public static final Item TALL_DARK_OAK_DOOR = new TallDoorItem(DDBlocks.TALL_DARK_OAK_DOOR, PROPERTIES);
    public static final Item TALL_MANGROVE_DOOR = new TallDoorItem(DDBlocks.TALL_MANGROVE_DOOR, PROPERTIES);
    public static final Item TALL_BAMBOO_DOOR = new TallDoorItem(DDBlocks.TALL_BAMBOO_DOOR, PROPERTIES);
    public static final Item TALL_CHERRY_DOOR = new TallDoorItem(DDBlocks.TALL_CHERRY_DOOR, PROPERTIES);
    public static final Item TALL_CRIMSON_DOOR = new TallDoorItem(DDBlocks.TALL_CRIMSON_DOOR, PROPERTIES);
    public static final Item TALL_WARPED_DOOR = new TallDoorItem(DDBlocks.TALL_WARPED_DOOR, PROPERTIES);

	public static void registerItems() {
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_IRON), SHORT_IRON_DOOR);
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_OAK), SHORT_OAK_DOOR);
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SPRUCE), SHORT_SPRUCE_DOOR);
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BIRCH), SHORT_BIRCH_DOOR);
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_JUNGLE), SHORT_JUNGLE_DOOR);
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ACACIA), SHORT_ACACIA_DOOR);
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_DARK_OAK), SHORT_DARK_OAK_DOOR);
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MANGROVE), SHORT_MANGROVE_DOOR);
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BAMBOO), SHORT_BAMBOO_DOOR);
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CHERRY), SHORT_CHERRY_DOOR);
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CRIMSON), SHORT_CRIMSON_DOOR);
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WARPED), SHORT_WARPED_DOOR);
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_IRON), TALL_IRON_DOOR);
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_OAK), TALL_OAK_DOOR);
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SPRUCE), TALL_SPRUCE_DOOR);
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BIRCH), TALL_BIRCH_DOOR);
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_JUNGLE), TALL_JUNGLE_DOOR);
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ACACIA), TALL_ACACIA_DOOR);
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DARK_OAK), TALL_DARK_OAK_DOOR);
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANGROVE), TALL_MANGROVE_DOOR);
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BAMBOO), TALL_BAMBOO_DOOR);
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHERRY), TALL_CHERRY_DOOR);
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CRIMSON), TALL_CRIMSON_DOOR);
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WARPED), TALL_WARPED_DOOR);
		
        // Iterate through the items to register.
        for (Pair<String, Item> pair : DDCompatRegistry.DOOR_ITEMS_TO_REGISTER) {
        	Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, pair.getA()), pair.getB());
        }

    }
	
	public static void registerCreativeTabs() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, MAIN_TAB.location(), FabricItemGroup.builder().title(Component.translatable("itemGroup.dramaticdoors")).icon(() -> { return new ItemStack(DDItems.TALL_OAK_DOOR); } ).build());
		if (FabricLoader.getInstance().isModLoaded("chipped")) {
			Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, CHIPPED_TAB.location(), FabricItemGroup.builder().title(Component.translatable("itemGroup.dramaticdoors_chipped")).icon(() -> { return new ItemStack(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_GATED))); } ).build());
		}
		if (FabricLoader.getInstance().isModLoaded("mcwdoors")) {
			Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, MACAW_TAB.location(), FabricItemGroup.builder().title(Component.translatable("itemGroup.dramaticdoors_macaw")).icon(() -> { return new ItemStack(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BARN))); } ).build());
		}
		if (FabricLoader.getInstance().isModLoaded("manyideas_doors")) {
			Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, MANYIDEAS_TAB.location(), FabricItemGroup.builder().title(Component.translatable("itemGroup.dramaticdoors_manyideas")).icon(() -> { return new ItemStack(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_BLANK))); } ).build());
		}
	}
	
    public static void assignItemsToTabs() {
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(DDItems::addBuildingBlocks);
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.REDSTONE_BLOCKS).register(DDItems::addRedstoneBlocks);
    	ItemGroupEvents.modifyEntriesEvent(MAIN_TAB).register(DDItems::addMainTabEntries);
        if (FabricLoader.getInstance().isModLoaded("chipped")) {
            ItemGroupEvents.modifyEntriesEvent(CHIPPED_TAB).register(DDItems::addChippedTabEntries);
        }
        if (FabricLoader.getInstance().isModLoaded("mcwdoors")) {
            ItemGroupEvents.modifyEntriesEvent(MACAW_TAB).register(DDItems::addMacawTabEntries);
        }
        if (FabricLoader.getInstance().isModLoaded("manyideas_doors")) {
            ItemGroupEvents.modifyEntriesEvent(MANYIDEAS_TAB).register(DDItems::addManyIdeasTabEntries);
        }
    }

    private static void addMainTabEntries(FabricItemGroupEntries entries) {
        entries.accept(SHORT_IRON_DOOR);
        entries.accept(TALL_IRON_DOOR);
        entries.accept(SHORT_OAK_DOOR);
        entries.accept(TALL_OAK_DOOR);
        entries.accept(SHORT_SPRUCE_DOOR);
        entries.accept(TALL_SPRUCE_DOOR);
        entries.accept(SHORT_BIRCH_DOOR);
        entries.accept(TALL_BIRCH_DOOR);
        entries.accept(SHORT_JUNGLE_DOOR);
        entries.accept(TALL_JUNGLE_DOOR);
        entries.accept(SHORT_ACACIA_DOOR);
        entries.accept(TALL_ACACIA_DOOR);
        entries.accept(SHORT_DARK_OAK_DOOR);
        entries.accept(TALL_DARK_OAK_DOOR);
        entries.accept(SHORT_MANGROVE_DOOR);
        entries.accept(TALL_MANGROVE_DOOR);
        entries.accept(SHORT_BAMBOO_DOOR);
        entries.accept(TALL_BAMBOO_DOOR);
        entries.accept(SHORT_CHERRY_DOOR);
        entries.accept(TALL_CHERRY_DOOR);
        entries.accept(SHORT_CRIMSON_DOOR);
        entries.accept(TALL_CRIMSON_DOOR);
        entries.accept(SHORT_WARPED_DOOR);
        entries.accept(TALL_WARPED_DOOR);
		// Abnormals Mods
		if (FabricLoader.getInstance().isModLoaded("atmospheric")) {
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ASPEN)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ASPEN)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GRIMWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GRIMWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_KOUSA)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_KOUSA)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MORADO)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MORADO)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ROSEWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ROSEWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_YUCCA)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_YUCCA)), TabVisibility.PARENT_AND_SEARCH_TABS);
		}
		if (FabricLoader.getInstance().isModLoaded("autumnity")) {
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MAPLE)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MAPLE)), TabVisibility.PARENT_AND_SEARCH_TABS);
		}
		if (FabricLoader.getInstance().isModLoaded("buzzier_bees")) {
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_HONEYCOMB)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_HONEYCOMB)), TabVisibility.PARENT_AND_SEARCH_TABS);
		}
		if (FabricLoader.getInstance().isModLoaded("caverns_and_chasms")) {
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_AZALEA)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AZALEA)), TabVisibility.PARENT_AND_SEARCH_TABS);
		}
		if (FabricLoader.getInstance().isModLoaded("endergetic")) {
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POISE)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POISE)), TabVisibility.PARENT_AND_SEARCH_TABS);
		}
		if (FabricLoader.getInstance().isModLoaded("environmental")) {
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_DARK_CHERRY)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DARK_CHERRY)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WILLOW)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WILLOW)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WISTERIA)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WISTERIA)), TabVisibility.PARENT_AND_SEARCH_TABS);
		}
		if (FabricLoader.getInstance().isModLoaded("upgrade_aquatic")) {
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_DRIFTWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DRIFTWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RIVER)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RIVER)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TOOTH)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TOOTH)), TabVisibility.PARENT_AND_SEARCH_TABS);
		}
        if (FabricLoader.getInstance().isModLoaded("horizons")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_JACARANDA)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_JACARANDA)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_REDBUD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_REDBUD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CYPRESS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CYPRESS)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (FabricLoader.getInstance().isModLoaded("enhanced_mushrooms")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BROWN_MUSHROOM)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BROWN_MUSHROOM)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RED_MUSHROOM)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RED_MUSHROOM)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (FabricLoader.getInstance().isModLoaded("ad_astra")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_AERONOS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AERONOS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GLACIAN)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GLACIAN)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_STROPHAR)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_STROPHAR)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_AA_STEEL)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AA_STEEL)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (FabricLoader.getInstance().isModLoaded("aether")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_AETHER_SKYROOT)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AETHER_SKYROOT)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (FabricLoader.getInstance().isModLoaded("architects_palette")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TWISTED)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TWISTED)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (FabricLoader.getInstance().isModLoaded("atum")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_DEADWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DEADWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PALM)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PALM)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LIMESTONE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LIMESTONE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LIMESTONE_CRACKED)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LIMESTONE_CRACKED)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LIMESTONE_BRICK_SMALL)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LIMESTONE_BRICK_SMALL)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LIMESTONE_BRICK_LARGE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LIMESTONE_BRICK_LARGE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LIMESTONE_BRICK_CRACKED_BRICK)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LIMESTONE_BRICK_CRACKED_BRICK)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LIMESTONE_BRICK_CHISELED)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LIMESTONE_BRICK_CHISELED)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LIMESTONE_BRICK_CARVED)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LIMESTONE_BRICK_CARVED)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (FabricLoader.getInstance().isModLoaded("bambooeverything")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BE_BAMBOO)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BE_BAMBOO)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BE_DRY_BAMBOO)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BE_DRY_BAMBOO)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (FabricLoader.getInstance().isModLoaded("betterarcheology")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ROTTEN)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ROTTEN)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (FabricLoader.getInstance().isModLoaded("betterend")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TERMINITE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TERMINITE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_THALLASIUM)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_THALLASIUM)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_DRAGON_TREE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DRAGON_TREE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_END_LOTUS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_END_LOTUS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_HELIX_TREE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_HELIX_TREE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_JELLYSHROOM)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_JELLYSHROOM)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LACUGROVE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LACUGROVE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LUCERNIA)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LUCERNIA)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MOSSY_GLOWSHROOM)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MOSSY_GLOWSHROOM)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PYTHADENDRON)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PYTHADENDRON)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TENANEA)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TENANEA)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_UMBRELLA_TREE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_UMBRELLA_TREE)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (FabricLoader.getInstance().isModLoaded("betternether")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ANCHOR_TREE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ANCHOR_TREE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BONE_CIN)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BONE_CIN)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BONE_REED)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BONE_REED)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MUSHROOM_FIR)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MUSHROOM_FIR)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_NETHER_MUSHROOM)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_NETHER_MUSHROOM)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_NETHER_REED)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_NETHER_REED)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_NETHER_SAKURA)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_NETHER_SAKURA)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUBEUS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUBEUS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_STALAGNATE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_STALAGNATE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WART)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WART)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BN_WILLOW)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BN_WILLOW)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (FabricLoader.getInstance().isModLoaded("bewitchment")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BW_CYPRESS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BW_CYPRESS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_DRAGONS_BLOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DRAGONS_BLOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ELDER)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ELDER)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_JUNIPER)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_JUNIPER)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (FabricLoader.getInstance().isModLoaded("bwplus")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_YEW)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_YEW)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (FabricLoader.getInstance().isModLoaded("biomancy")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FLESH)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FLESH)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FULL_FLESH)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FULL_FLESH)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FLESHKIN)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FLESHKIN)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (FabricLoader.getInstance().isModLoaded("biomemakeover")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BM_ANCIENT_OAK)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BM_ANCIENT_OAK)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BM_BLIGHTED_BALSA)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BM_BLIGHTED_BALSA)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BM_SWAMP_CYPRESS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BM_SWAMP_CYPRESS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BM_WILLOW)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BM_WILLOW)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (FabricLoader.getInstance().isModLoaded("biomesoplenty")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_DEAD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_DEAD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_FIR)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_FIR)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_HELLBARK)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_HELLBARK)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_JACARANDA)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_JACARANDA)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_MAGIC)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_MAGIC)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_MAHOGANY)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_MAHOGANY)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_PALM)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_PALM)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_REDWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_REDWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_UMBRAN)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_UMBRAN)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_WILLOW)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_WILLOW)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
		if (FabricLoader.getInstance().isModLoaded("blocksplus")) {
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BP_BAMBOO)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BP_BAMBOO)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BP_MUSHROOM)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BP_MUSHROOM)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BP_COPPER)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BP_COPPER)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BP_GOLDEN)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BP_GOLDEN)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BP_DIAMOND)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BP_DIAMOND)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BP_EMERALD)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BP_EMERALD)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BP_NETHERITE)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BP_NETHERITE)), TabVisibility.PARENT_AND_SEARCH_TABS);
		}
        if (FabricLoader.getInstance().isModLoaded("blockus")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BLOCKUS_BAMBOO)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BLOCKUS_BAMBOO)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BLOCKUS_CHARRED)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BLOCKUS_CHARRED)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BLOCKUS_PAPER)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BLOCKUS_PAPER)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BLOCKUS_WHITE_OAK)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BLOCKUS_WHITE_OAK)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BLOCKUS_STONE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BLOCKUS_STONE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BLOCKUS_BLACKSTONE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BLOCKUS_BLACKSTONE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BLOCKUS_OBSIDIAN_REINFORCED)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BLOCKUS_OBSIDIAN_REINFORCED)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (FabricLoader.getInstance().isModLoaded("ceilands")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CEILTRUNK)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CEILTRUNK)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LUZAWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LUZAWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (FabricLoader.getInstance().isModLoaded("charm")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CHARM_AZALEA)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHARM_AZALEA)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CHARM_EBONY)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHARM_EBONY)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (FabricLoader.getInstance().isModLoaded("cinderscapes")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SCORCHED)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SCORCHED)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_UMBRAL)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_UMBRAL)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (FabricLoader.getInstance().isModLoaded("cobblemon")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_APRICORN)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_APRICORN)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (FabricLoader.getInstance().isModLoaded("colorfulazaleas")) {
        	entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_AZULE_AZALEA)), TabVisibility.PARENT_AND_SEARCH_TABS);
        	entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AZULE_AZALEA)), TabVisibility.PARENT_AND_SEARCH_TABS);
        	entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BRIGHT_AZALEA)), TabVisibility.PARENT_AND_SEARCH_TABS);
        	entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BRIGHT_AZALEA)), TabVisibility.PARENT_AND_SEARCH_TABS);
        	entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FISS_AZALEA)), TabVisibility.PARENT_AND_SEARCH_TABS);
        	entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FISS_AZALEA)), TabVisibility.PARENT_AND_SEARCH_TABS);
        	entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ROZE_AZALEA)), TabVisibility.PARENT_AND_SEARCH_TABS);
        	entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ROZE_AZALEA)), TabVisibility.PARENT_AND_SEARCH_TABS);
        	entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TECAL_AZALEA)), TabVisibility.PARENT_AND_SEARCH_TABS);
        	entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TECAL_AZALEA)), TabVisibility.PARENT_AND_SEARCH_TABS);
        	entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TITANIUM_AZALEA)), TabVisibility.PARENT_AND_SEARCH_TABS);
        	entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TITANIUM_AZALEA)), TabVisibility.PARENT_AND_SEARCH_TABS);
        	entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WALNUT_AZALEA)), TabVisibility.PARENT_AND_SEARCH_TABS);
        	entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WALNUT_AZALEA)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
		if (FabricLoader.getInstance().isModLoaded("copperoverhaul")) {
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CO_COPPER)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CO_COPPER)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CO_EXPOSED_COPPER)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CO_EXPOSED_COPPER)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CO_WEATHERED_COPPER)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CO_WEATHERED_COPPER)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CO_OXIDIZED_COPPER)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CO_OXIDIZED_COPPER)), TabVisibility.PARENT_AND_SEARCH_TABS);
		}
		if (FabricLoader.getInstance().isModLoaded("alloyed")) {
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_STEEL)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_STEEL)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LOCKED_STEEL)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LOCKED_STEEL)), TabVisibility.PARENT_AND_SEARCH_TABS);
		}
        if (FabricLoader.getInstance().isModLoaded("createdeco")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ANDESITE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BRASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_COPPER)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ZINC)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LOCKED_ANDESITE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LOCKED_BRASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LOCKED_COPPER)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LOCKED_ZINC)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
		if (FabricLoader.getInstance().isModLoaded("create_misc_and_things")) {
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ANDESITE_CASING)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ANDESITE_CASING)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BRASS_CASING)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BRASS_CASING)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_COPPER_CASING)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_COPPER_CASING)), TabVisibility.PARENT_AND_SEARCH_TABS);
		}
		if (FabricLoader.getInstance().isModLoaded("caupona")) {
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WALNUT)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WALNUT)), TabVisibility.PARENT_AND_SEARCH_TABS);
		}
		if (FabricLoader.getInstance().isModLoaded("darkerdepths")) {
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PETRIFIED)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PETRIFIED)), TabVisibility.PARENT_AND_SEARCH_TABS);
		}
        if (FabricLoader.getInstance().isModLoaded("deeperdarker")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ECHO)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ECHO)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
		if (FabricLoader.getInstance().isModLoaded("dustrial_decor")) {
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CARDBOARD)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CARDBOARD)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CHAIN)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHAIN)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_INDUSTRIAL_IRON)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_INDUSTRIAL_IRON)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_IRON_BAR)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_IRON_BAR)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PADDED)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PADDED)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUSTY_IRON)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUSTY_IRON)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUSTY_SHEET_METAL)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUSTY_SHEET_METAL)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SHEET_METAL)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SHEET_METAL)), TabVisibility.PARENT_AND_SEARCH_TABS);
		}
        if (FabricLoader.getInstance().isModLoaded("ecologics")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ECO_AZALEA)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ECO_AZALEA)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ECO_FLOWERING_AZALEA)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ECO_FLOWERING_AZALEA)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ECO_COCONUT)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ECO_COCONUT)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ECO_WALNUT)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ECO_WALNUT)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
		if (FabricLoader.getInstance().isModLoaded("endlessbiomes")) {
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EB_PENUMBRA)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EB_PENUMBRA)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EB_TWISTED)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EB_TWISTED)), TabVisibility.PARENT_AND_SEARCH_TABS);
		}
		if (FabricLoader.getInstance().isModLoaded("phantasm")) {
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EBONY)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EBONY)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PREAM)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PREAM)), TabVisibility.PARENT_AND_SEARCH_TABS);
		}
		if (FabricLoader.getInstance().isModLoaded("enlightened_end")) {
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CONGEALED)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CONGEALED)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EE_EBONY)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EE_EBONY)), TabVisibility.PARENT_AND_SEARCH_TABS);
		}
		if (FabricLoader.getInstance().isModLoaded("everythingcopper")) {
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_COPPER)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EC_COPPER)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_EXPOSED_COPPER)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EC_EXPOSED_COPPER)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_WEATHERED_COPPER)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EC_WEATHERED_COPPER)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_OXIDIZED_COPPER)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EC_OXIDIZED_COPPER)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_WAXED_COPPER)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EC_WAXED_COPPER)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_WAXED_EXPOSED_COPPER)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EC_WAXED_EXPOSED_COPPER)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_WAXED_WEATHERED_COPPER)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EC_WAXED_WEATHERED_COPPER)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_WAXED_OXIDIZED_COPPER)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EC_WAXED_OXIDIZED_COPPER)), TabVisibility.PARENT_AND_SEARCH_TABS);
		}
		if (FabricLoader.getInstance().isModLoaded("extendedmushrooms")) {
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MUSHROOM)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MUSHROOM)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POISONOUS_MUSHROOM)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POISONOUS_MUSHROOM)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GLOWSHROOM)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GLOWSHROOM)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_HONEY_FUNGUS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_HONEY_FUNGUS)), TabVisibility.PARENT_AND_SEARCH_TABS);
		}
		if (FabricLoader.getInstance().isModLoaded("forbidden_arcanus")) {
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_DEORUM)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DEORUM)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_AURUM)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AURUM)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ARCANE_EDELWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ARCANE_EDELWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EDELWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EDELWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FUNGYSS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FUNGYSS)), TabVisibility.PARENT_AND_SEARCH_TABS);
		}
		if (FabricLoader.getInstance().isModLoaded("fruittrees")) {
			//entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FT_CHERRY_SLIDING)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FT_CHERRY_SLIDING)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FT_CHERRY)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FT_CHERRY)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FT_CITRUS)), TabVisibility.PARENT_AND_SEARCH_TABS);    			
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FT_CITRUS)), TabVisibility.PARENT_AND_SEARCH_TABS);    			
		}
        if (FabricLoader.getInstance().isModLoaded("gardens_of_the_dead")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SOULBLIGHT)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SOULBLIGHT)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WHISTLECANE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WHISTLECANE)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (FabricLoader.getInstance().isModLoaded("goodending")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GE_CYPRESS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GE_CYPRESS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GE_MUDDY_OAK)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GE_MUDDY_OAK)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (FabricLoader.getInstance().isModLoaded("graveyard")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_DARK_IRON)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DARK_IRON)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (FabricLoader.getInstance().isModLoaded("hexcasting")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EDIFIED)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EDIFIED)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
		if (FabricLoader.getInstance().isModLoaded("hexerei")) {
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_HEXEREI_MAHOGANY)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_HEXEREI_MAHOGANY)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_HEXEREI_WILLOW)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_HEXEREI_WILLOW)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_HEXEREI_WITCH_HAZEL)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_HEXEREI_WITCH_HAZEL)), TabVisibility.PARENT_AND_SEARCH_TABS);
		}
		if (FabricLoader.getInstance().isModLoaded("integrateddynamics")) {
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MENRIL)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MENRIL)), TabVisibility.PARENT_AND_SEARCH_TABS);
		}
		if (FabricLoader.getInstance().isModLoaded("malum")) {
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUNEWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUNEWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SOULWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SOULWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
		}
        if (FabricLoader.getInstance().isModLoaded("modern_glass_doors")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_IRON_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_IRON_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_OAK_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_OAK_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SPRUCE_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SPRUCE_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BIRCH_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BIRCH_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_JUNGLE_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_JUNGLE_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ACACIA_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ACACIA_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_DARK_OAK_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DARK_OAK_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MANGROVE_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANGROVE_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BAMBOO_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BAMBOO_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CHERRY_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHERRY_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CRIMSON_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CRIMSON_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WARPED_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WARPED_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
		if (FabricLoader.getInstance().isModLoaded("ms")) {
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_IRON_BAR)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_IRON_BAR)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_BAMBOO)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_BAMBOO)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_CHERRY)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_CHERRY)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_GLOWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_GLOWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_HELLWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_HELLWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_MAPLE)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_MAPLE)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_SILVERBELL)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_SILVERBELL)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_TIGERWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_TIGERWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_WILLOW)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_WILLOW)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_SOUL_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_SOUL_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_TINTED_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_TINTED_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_BLACK_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_BLACK_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_GREY_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_GREY_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_LIGHT_GREY_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_LIGHT_GREY_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_WHITE_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_WHITE_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_RED_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_RED_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_ORANGE_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_ORANGE_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_YELLOW_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_YELLOW_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_LIME_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_LIME_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_GREEN_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_GREEN_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_CYAN_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_CYAN_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_BLUE_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_BLUE_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_PURPLE_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_PURPLE_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_MAGENTA_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_MAGENTA_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_PINK_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_PINK_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_LIGHT_BLUE_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_LIGHT_BLUE_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_BROWN_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_BROWN_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
		}
		if (FabricLoader.getInstance().isModLoaded("morecraft")) {
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MORECRAFT_BONE)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MORECRAFT_BONE)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MORECRAFT_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MORECRAFT_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MORECRAFT_SOUL_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MORECRAFT_SOUL_GLASS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MORECRAFT_NETHERBRICK)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MORECRAFT_NETHERBRICK)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MORECRAFT_NETHERITE)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MORECRAFT_NETHERITE)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MORECRAFT_NETHERWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MORECRAFT_NETHERWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
		}
		if (FabricLoader.getInstance().isModLoaded("mysticsbiomes")) {
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MB_CHERRY)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MB_CHERRY)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MB_JACARANDA)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MB_JACARANDA)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MB_STRAWBERRY)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MB_STRAWBERRY)), TabVisibility.PARENT_AND_SEARCH_TABS);
		}
		if (FabricLoader.getInstance().isModLoaded("nethers_exoticism")) {
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_JABOTICABA)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_JABOTICABA)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RAMBOUTAN)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RAMBOUTAN)), TabVisibility.PARENT_AND_SEARCH_TABS);
		}
		if (FabricLoader.getInstance().isModLoaded("newworld")) {
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FIR)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FIR)), TabVisibility.PARENT_AND_SEARCH_TABS);
		}
		if (FabricLoader.getInstance().isModLoaded("outer_end")) {
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_AZURE)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AZURE)), TabVisibility.PARENT_AND_SEARCH_TABS);
		}
        if (FabricLoader.getInstance().isModLoaded("byg")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_ASPEN)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_ASPEN)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_BAOBAB)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_BAOBAB)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_BLUE_ENCHANTED)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_BLUE_ENCHANTED)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_BULBIS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_BULBIS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_CHERRY)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_CHERRY)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_CIKA)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_CIKA)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_CYPRESS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_CYPRESS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_EBONY)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_EBONY)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_EMBUR)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_EMBUR)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_ETHER)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_ETHER)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_FIR)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_FIR)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_FLORUS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_FLORUS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_GREEN_ENCHANTED)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_GREEN_ENCHANTED)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_HOLLY)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_HOLLY)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_IMPARIUS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_IMPARIUS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_IRONWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_IRONWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_JACARANDA)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_JACARANDA)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_LAMENT)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_LAMENT)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_MAHOGANY)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_MAHOGANY)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_MAPLE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_MAPLE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_NIGHTSHADE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_NIGHTSHADE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_PALM)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_PALM)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_PINE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_PINE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_RAINBOW_EUCALYPTUS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_RAINBOW_EUCALYPTUS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_REDWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_REDWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_SKYRIS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_SKYRIS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_SOUL_SHROOM)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_SOUL_SHROOM)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_SYTHIAN)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_SYTHIAN)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_WHITE_MANGROVE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_WHITE_MANGROVE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_WILLOW)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_WILLOW)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_WITCH_HAZEL)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_WITCH_HAZEL)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_ZELKOVA)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_ZELKOVA)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
		if (FabricLoader.getInstance().isModLoaded("prehistoricfauna")) {
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_AGATHOXYLON)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AGATHOXYLON)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ARAUCARIA)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ARAUCARIA)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BRACHYPHYLLUM)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BRACHYPHYLLUM)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GINKGO)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GINKGO)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_HEIDIPHYLLUM)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_HEIDIPHYLLUM)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LIRIODENDRITES)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LIRIODENDRITES)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_METASEQUOIA)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_METASEQUOIA)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_NEOCALAMITES)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_NEOCALAMITES)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PROTOJUNIPEROXYLON)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PROTOJUNIPEROXYLON)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PROTOPICEOXYLON)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PROTOPICEOXYLON)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SCHILDERIA)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SCHILDERIA)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TROCHODENDROIDES)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TROCHODENDROIDES)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WOODWORTHIA)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WOODWORTHIA)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ZAMITES)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ZAMITES)), TabVisibility.PARENT_AND_SEARCH_TABS);
		}
		if (FabricLoader.getInstance().isModLoaded("premium_wood")) {
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PW_MAGIC)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PW_MAGIC)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PW_MAPLE)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PW_MAPLE)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PW_PURPLE_HEART)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PW_PURPLE_HEART)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PW_SILVERBELL)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PW_SILVERBELL)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PW_TIGER)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PW_TIGER)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PW_WILLOW)), TabVisibility.PARENT_AND_SEARCH_TABS);    			
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PW_WILLOW)), TabVisibility.PARENT_AND_SEARCH_TABS);    			
		}
		if (FabricLoader.getInstance().isModLoaded("pokecube")) {
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POKECUBE_ENIGMA)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POKECUBE_ENIGMA)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POKECUBE_LEPPA)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POKECUBE_LEPPA)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POKECUBE_NANAB)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POKECUBE_NANAB)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POKECUBE_ORAN)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POKECUBE_ORAN)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POKECUBE_PECHA)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POKECUBE_PECHA)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POKECUBE_SITRUS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POKECUBE_SITRUS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POKECUBE_AGED)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POKECUBE_AGED)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POKECUBE_CONCRETE)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POKECUBE_CONCRETE)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POKECUBE_CORRUPTED)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POKECUBE_CORRUPTED)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POKECUBE_DISTORTIC)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POKECUBE_DISTORTIC)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POKECUBE_INVERTED)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POKECUBE_INVERTED)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POKECUBE_MIRAGE)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POKECUBE_MIRAGE)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POKECUBE_TEMPORAL)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POKECUBE_TEMPORAL)), TabVisibility.PARENT_AND_SEARCH_TABS);
		}
        if (FabricLoader.getInstance().isModLoaded("promenade")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PROMENADE_CHERRY_OAK)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PROMENADE_CHERRY_OAK)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PROMENADE_DARK_AMARANTH)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PROMENADE_DARK_AMARANTH)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PROMENADE_PALM)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PROMENADE_PALM)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
		if (FabricLoader.getInstance().isModLoaded("pyromancer")) {
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PYROWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PYROWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ROTTEN_PLANKS)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ROTTEN_PLANKS)), TabVisibility.PARENT_AND_SEARCH_TABS);
		}
		if (FabricLoader.getInstance().isModLoaded("quark")) {
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_QUARK_ANCIENT)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_QUARK_ANCIENT)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_QUARK_AZALEA)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_QUARK_AZALEA)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_QUARK_BLOSSOM)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_QUARK_BLOSSOM)), TabVisibility.PARENT_AND_SEARCH_TABS);
		}
	    if (FabricLoader.getInstance().isModLoaded("regions_unexplored")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_BAOBAB)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_BAOBAB)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_BLACKWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_BLACKWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_BRIMWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_BRIMWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_CHERRY)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_CHERRY)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_CYPRESS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_CYPRESS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_DEAD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_DEAD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_EUCALYPTUS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_EUCALYPTUS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_JOSHUA)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_JOSHUA)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_LARCH)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_LARCH)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_MAPLE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_MAPLE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_MAUVE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_MAUVE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_PALM)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_PALM)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_PINE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_PINE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_REDWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_REDWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_WILLOW)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_WILLOW)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
		if (FabricLoader.getInstance().isModLoaded("silentgear")) {
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_NETHERWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_NETHERWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
		}
        if (FabricLoader.getInstance().isModLoaded("snowyspirit")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GINGERBREAD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GINGERBREAD)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (FabricLoader.getInstance().isModLoaded("supplementaries")) {
        	entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GOLD)), TabVisibility.PARENT_AND_SEARCH_TABS);
        	entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GOLD)), TabVisibility.PARENT_AND_SEARCH_TABS);
        	entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SILVER)), TabVisibility.PARENT_AND_SEARCH_TABS);
        	entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SILVER)), TabVisibility.PARENT_AND_SEARCH_TABS);
        	entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LEAD)), TabVisibility.PARENT_AND_SEARCH_TABS);
        	entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LEAD)), TabVisibility.PARENT_AND_SEARCH_TABS);
        	entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_NETHERITE)), TabVisibility.PARENT_AND_SEARCH_TABS);
        	entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_NETHERITE)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUBBER)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUBBER)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (FabricLoader.getInstance().isModLoaded("terraqueous")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TQ_LIGHT_CLOUD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TQ_LIGHT_CLOUD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TQ_DENSE_CLOUD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TQ_DENSE_CLOUD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TQ_STORM_CLOUD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TQ_STORM_CLOUD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TQ_APPLE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TQ_APPLE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TQ_BANANA)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TQ_BANANA)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TQ_CHERRY)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TQ_CHERRY)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TQ_COCONUT)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TQ_COCONUT)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TQ_LEMON)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TQ_LEMON)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TQ_MANGO)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TQ_MANGO)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TQ_MULBERRY)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TQ_MULBERRY)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TQ_ORANGE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TQ_ORANGE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TQ_PEACH)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TQ_PEACH)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TQ_PEAR)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TQ_PEAR)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TQ_PLUM)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TQ_PLUM)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (FabricLoader.getInstance().isModLoaded("terrestria")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TERRESTRIA_CYPRESS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TERRESTRIA_CYPRESS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TERRESTRIA_HEMLOCK)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TERRESTRIA_HEMLOCK)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TERRESTRIA_JAPANESE_MAPLE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TERRESTRIA_JAPANESE_MAPLE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TERRESTRIA_RAINBOW_EUCALYPTUS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TERRESTRIA_RAINBOW_EUCALYPTUS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TERRESTRIA_REDWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TERRESTRIA_REDWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TERRESTRIA_RUBBER)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TERRESTRIA_RUBBER)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TERRESTRIA_SAKURA)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TERRESTRIA_SAKURA)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TERRESTRIA_WILLOW)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TERRESTRIA_WILLOW)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TERRESTRIA_YUCCA_PALM)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TERRESTRIA_YUCCA_PALM)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (FabricLoader.getInstance().isModLoaded("tconstruct")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BLOODSHROOM)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BLOODSHROOM)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GREENHEART)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GREENHEART)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SKYROOT)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SKYROOT)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (FabricLoader.getInstance().isModLoaded("traverse")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TRAVERSE_FIR)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TRAVERSE_FIR)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (FabricLoader.getInstance().isModLoaded("twigs")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_STRIPPED_BAMBOO)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_STRIPPED_BAMBOO)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (FabricLoader.getInstance().isModLoaded("twilightforest")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CANOPY)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CANOPY)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_DARKWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DARKWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MINEWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MINEWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SORTINGWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SORTINGWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TIMEWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TIMEWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TRANSWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TRANSWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TWILIGHT_MANGROVE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TWILIGHT_MANGROVE)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TWILIGHT_OAK)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TWILIGHT_OAK)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (FabricLoader.getInstance().isModLoaded("tflostblocks")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TOWERWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TOWERWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
		if (FabricLoader.getInstance().isModLoaded("undergarden")) {
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GRONGLE)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GRONGLE)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SMOGSTEM)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SMOGSTEM)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WIGGLEWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WIGGLEWOOD)), TabVisibility.PARENT_AND_SEARCH_TABS);
		}
        if (FabricLoader.getInstance().isModLoaded("wilderwild")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WW_BAOBAB)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WW_BAOBAB)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WW_CYPRESS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WW_CYPRESS)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WW_PALM)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WW_PALM)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
		if (FabricLoader.getInstance().isModLoaded("windswept")) {
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CHESTNUT)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHESTNUT)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_HOLLY)), TabVisibility.PARENT_AND_SEARCH_TABS);
			entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_HOLLY)), TabVisibility.PARENT_AND_SEARCH_TABS);
		}
        if (FabricLoader.getInstance().isModLoaded("xps_additions")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SOUL_COPPER)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SOUL_COPPER)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (FabricLoader.getInstance().isModLoaded("yippee")) {
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MYSTICAL_OAK)), TabVisibility.PARENT_AND_SEARCH_TABS);
            entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MYSTICAL_OAK)), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
    }

    private static void addChippedTabEntries(FabricItemGroupEntries entries) {
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_HEAVY)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_DUAL_PANELED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_PRESSED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_SHACK)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_FORTIFIED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_SLIDING)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_SCREEN)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_GATED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_GLASS)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_WINDOWED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_TILED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_TILE_WINDOWED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_SECRET)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_BOARDED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_PAPER)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_BEACH)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_BARRED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_PANELED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_SUPPORTED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_OVERGROWN)));
	    
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_HEAVY)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_DUAL_PANELED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_PRESSED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_SHACK)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_FORTIFIED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_SLIDING)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_SCREEN)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_GATED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_GLASS)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_WINDOWED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_TILED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_TILE_WINDOWED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_SECRET)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_MODERN)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_PAPER)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_BEACH)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_BARRED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_PANELED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_SUPPORTED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_OVERGROWN)));

	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_HEAVY)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_DUAL_PANELED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_PRESSED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_SHACK)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_FORTIFIED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_SLIDING)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_SCREEN)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_GATED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_GLASS)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_WINDOWED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_TILED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_TILE_WINDOWED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_SECRET)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_MODERN)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_BOARDED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_BEACH)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_BARRED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_PANELED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_SUPPORTED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_OVERGROWN)));

	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_HEAVY)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_DUAL_PANELED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_PRESSED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_SHACK)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_FORTIFIED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_SLIDING)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_SCREEN)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_GATED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_GLASS)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_WINDOWED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_TILED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_TILE_WINDOWED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_SECRET)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_MODERN)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_BOARDED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_PAPER)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_BARRED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_PANELED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_SUPPORTED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_OVERGROWN)));

	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_HEAVY)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_DUAL_PANELED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_PRESSED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_SHACK)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_FORTIFIED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_SLIDING)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_SCREEN)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_GATED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_GLASS)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_WINDOWED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_TILED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_TILE_WINDOWED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_SECRET)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_MODERN)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_BOARDED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_PAPER)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_BEACH)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_PANELED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_SUPPORTED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_OVERGROWN)));

	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_HEAVY)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_DUAL_PANELED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_PRESSED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_SHACK)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_FORTIFIED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_SLIDING)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_SCREEN)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_GATED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_GLASS)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_WINDOWED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_TILED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_TILE_WINDOWED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_SECRET)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_MODERN)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_BOARDED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_PAPER)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_BEACH)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_BARRED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_SUPPORTED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_OVERGROWN)));

	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_HEAVY)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_DUAL_PANELED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_PRESSED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_SHACK)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_FORTIFIED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_SLIDING)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_SCREEN)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_GATED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_GLASS)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_WINDOWED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_TILED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_TILE_WINDOWED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_SECRET)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_MODERN)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_BOARDED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_PAPER)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_BEACH)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_BARRED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_PANELED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_SUPPORTED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_OVERGROWN)));

	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_HEAVY)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_DUAL_PANELED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_PRESSED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_SHACK)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_FORTIFIED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_SLIDING)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_SCREEN)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_GATED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_GLASS)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_WINDOWED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_TILED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_TILE_WINDOWED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_SECRET)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_MODERN)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_BOARDED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_PAPER)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_BEACH)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_BARRED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_PANELED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_OVERGROWN)));

	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_HEAVY)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_DUAL_PANELED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_PRESSED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_SHACK)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_FORTIFIED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_SLIDING)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_SCREEN)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_GATED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_GLASS)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_WINDOWED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_TILED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_TILE_WINDOWED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_SECRET)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_MODERN)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_BOARDED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_PAPER)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_BEACH)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_BARRED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_PANELED)));
	    entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_SUPPORTED)));
    }

    private static void addMacawTabEntries(FabricItemGroupEntries entries) {
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_STORE)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SLIDING_GLASS)));
        
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JAIL)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_HOSPITAL)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_REINFORCED)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_WARNING)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_WINDOWED)));

        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BARN)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BARN)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BARN)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_BARN)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BARN)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BARN)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BARN)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CHERRY_BARN)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_BARN)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_BARN)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_BARN)));

        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BARN_GLASS)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BARN_GLASS)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BARN_GLASS)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_BARN_GLASS)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BARN_GLASS)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BARN_GLASS)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BARN_GLASS)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CHERRY_BARN_GLASS)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_BARN_GLASS)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_BARN_GLASS)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_BARN_GLASS)));

        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_STABLE)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_STABLE)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_STABLE)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_STABLE)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_STABLE)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_STABLE)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_STABLE)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CHERRY_STABLE)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_STABLE)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_STABLE)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_STABLE)));

        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_STABLE_HEAD)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_STABLE_HEAD)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_STABLE_HEAD)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_STABLE_HEAD)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_STABLE_HEAD)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_STABLE_HEAD)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_STABLE_HEAD)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CHERRY_STABLE_HEAD)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_STABLE_HEAD)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_STABLE_HEAD)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_STABLE_HEAD)));

        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BARK_GLASS)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BARK_GLASS)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BARK_GLASS)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_BARK_GLASS)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BARK_GLASS)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BARK_GLASS)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BARK_GLASS)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CHERRY_BARK_GLASS)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_BARK_GLASS)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_STEM_GLASS)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_STEM_GLASS)));

        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_GLASS)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_GLASS)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_GLASS)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_GLASS)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_GLASS)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_GLASS)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_GLASS)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CHERRY_GLASS)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_GLASS)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_GLASS)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_GLASS)));

        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_MODERN)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_MODERN)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_MODERN)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_MODERN)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_MODERN)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_MODERN)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_MODERN)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CHERRY_MODERN)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_MODERN)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_MODERN)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_MODERN)));

        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_JAPANESE)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_JAPANESE)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_JAPANESE)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_JAPANESE)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_JAPANESE)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_JAPANESE)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_JAPANESE)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CHERRY_JAPANESE)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_JAPANESE)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_JAPANESE)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_JAPANESE)));

        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_JAPANESE2)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_JAPANESE2)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_JAPANESE2)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_JAPANESE2)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_JAPANESE2)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_JAPANESE2)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_JAPANESE2)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CHERRY_JAPANESE2)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_JAPANESE2)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_JAPANESE2)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_JAPANESE2)));

        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_CLASSIC)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_CLASSIC)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_CLASSIC)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_CLASSIC)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_CLASSIC)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_CLASSIC)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CHERRY_CLASSIC)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_CLASSIC)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_CLASSIC)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_CLASSIC)));

        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_COTTAGE)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_COTTAGE)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_COTTAGE)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_COTTAGE)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_COTTAGE)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_COTTAGE)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CHERRY_COTTAGE)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_COTTAGE)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_COTTAGE)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_COTTAGE)));

        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_PAPER)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_PAPER)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_PAPER)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_PAPER)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_PAPER)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_PAPER)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CHERRY_PAPER)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_PAPER)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_PAPER)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_PAPER)));

        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BEACH)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BEACH)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BEACH)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BEACH)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BEACH)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BEACH)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CHERRY_BEACH)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_BEACH)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_BEACH)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_BEACH)));

        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_TROPICAL)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_TROPICAL)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_TROPICAL)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_TROPICAL)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_TROPICAL)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_TROPICAL)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CHERRY_TROPICAL)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_TROPICAL)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_TROPICAL)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_TROPICAL)));

        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_FOUR_PANEL)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_FOUR_PANEL)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_FOUR_PANEL)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_FOUR_PANEL)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_FOUR_PANEL)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_FOUR_PANEL)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CHERRY_FOUR_PANEL)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_FOUR_PANEL)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_FOUR_PANEL)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_FOUR_PANEL)));

        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_SWAMP)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_SWAMP)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_SWAMP)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_SWAMP)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_SWAMP)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_SWAMP)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CHERRY_SWAMP)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_SWAMP)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_SWAMP)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_SWAMP)));

        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_WAFFLE)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_WAFFLE)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_WAFFLE)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_WAFFLE)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_WAFFLE)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_WAFFLE)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_WAFFLE)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_WAFFLE)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_WAFFLE)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_WAFFLE)));

        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BAMBOO)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BAMBOO)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BAMBOO)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_BAMBOO)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BAMBOO)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BAMBOO)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BAMBOO)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CHERRY_BAMBOO)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_BAMBOO)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_BAMBOO)));

        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_NETHER)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_NETHER)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_NETHER)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_NETHER)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_NETHER)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_NETHER)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_NETHER)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CHERRY_NETHER)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_NETHER)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_NETHER)));

        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_MYSTIC)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_MYSTIC)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_MYSTIC)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_MYSTIC)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_MYSTIC)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_MYSTIC)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_MYSTIC)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CHERRY_MYSTIC)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_MYSTIC)));
        entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_MYSTIC)));
    }
    
    private static void addManyIdeasTabEntries(FabricItemGroupEntries entries) {
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_BAR)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_BARREL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_BRICK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_CORRUGATED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_FACTORY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_MODERN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_SHIP)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_SMOOTH_SANDSTONE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_STEAMPUNK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_BOOKSHELF)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_DWARF)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_FANTASY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_LABORATORY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_RUSTED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_SAFE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_SHIP)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_SPACE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_STONE_BRICK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_OAK_BLANK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_OAK_BOOKSHELF)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_OAK_CASSETTE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_OAK_FRENCH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_OAK_FROSTED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_OAK_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_OAK_HEART)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_OAK_ORIGIN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_OAK_RUSTIC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_OAK_SHOJI)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_BLANK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_BOOKSHELF)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_CASSETTE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_FRENCH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_FROSTED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_HEART)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_ORIGIN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_RUSTIC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_SHOJI)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_BLANK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_BOOKSHELF)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_CASSETTE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_FRENCH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_FROSTED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_HEART)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_ORIGIN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_RUSTIC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_SHOJI)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_BLANK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_BOOKSHELF)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_CASSETTE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_FRENCH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_FROSTED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_HEART)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_ORIGIN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_RUSTIC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_SHOJI)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_BLANK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_BOOKSHELF)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_CASSETTE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_FRENCH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_FROSTED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_HEART)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_ORIGIN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_RUSTIC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_SHOJI)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_BLANK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_BOOKSHELF)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_CASSETTE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_FRENCH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_FROSTED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_HEART)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_ORIGIN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_RUSTIC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_SHOJI)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_BLANK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_BOOKSHELF)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_CASSETTE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_FRENCH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_FROSTED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_HEART)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_ORIGIN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_RUSTIC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_SHOJI)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_BLANK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_BOOKSHELF)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_CASSETTE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_FRENCH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_FROSTED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_HEART)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_ORIGIN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_RUSTIC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
		entries.accept(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_SHOJI)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    }
    
    private static void addBuildingBlocks(FabricItemGroupEntries entries) {
        entries.addBefore(Items.IRON_DOOR, SHORT_IRON_DOOR);
        entries.addBefore(Items.OAK_DOOR, SHORT_OAK_DOOR);
        entries.addBefore(Items.SPRUCE_DOOR, SHORT_SPRUCE_DOOR);
        entries.addBefore(Items.BIRCH_DOOR, SHORT_BIRCH_DOOR);
        entries.addBefore(Items.JUNGLE_DOOR, SHORT_JUNGLE_DOOR);
        entries.addBefore(Items.ACACIA_DOOR, SHORT_ACACIA_DOOR);
        entries.addBefore(Items.DARK_OAK_DOOR, SHORT_DARK_OAK_DOOR);
        entries.addBefore(Items.MANGROVE_DOOR, SHORT_MANGROVE_DOOR);
        entries.addBefore(Items.BAMBOO_DOOR, SHORT_BAMBOO_DOOR);
        entries.addBefore(Items.CHERRY_DOOR, SHORT_CHERRY_DOOR);
        entries.addBefore(Items.CRIMSON_DOOR, SHORT_CRIMSON_DOOR);
        entries.addBefore(Items.WARPED_DOOR, SHORT_WARPED_DOOR);
        entries.addAfter(Items.IRON_DOOR, TALL_IRON_DOOR);
        entries.addAfter(Items.OAK_DOOR, TALL_OAK_DOOR);
        entries.addAfter(Items.SPRUCE_DOOR, TALL_SPRUCE_DOOR);
        entries.addAfter(Items.BIRCH_DOOR, TALL_BIRCH_DOOR);
        entries.addAfter(Items.JUNGLE_DOOR, TALL_JUNGLE_DOOR);
        entries.addAfter(Items.ACACIA_DOOR, TALL_ACACIA_DOOR);
        entries.addAfter(Items.DARK_OAK_DOOR, TALL_DARK_OAK_DOOR);
        entries.addAfter(Items.MANGROVE_DOOR, TALL_MANGROVE_DOOR);
        entries.addAfter(Items.BAMBOO_DOOR, TALL_BAMBOO_DOOR);
        entries.addAfter(Items.CHERRY_DOOR, TALL_CHERRY_DOOR);
        entries.addAfter(Items.CRIMSON_DOOR, TALL_CRIMSON_DOOR);
        entries.addAfter(Items.WARPED_DOOR, TALL_WARPED_DOOR);
    }
    
    private static void addRedstoneBlocks(FabricItemGroupEntries entries) {
        entries.addBefore(Items.IRON_DOOR, SHORT_IRON_DOOR);
        entries.addBefore(Items.OAK_DOOR, SHORT_OAK_DOOR);
        entries.addAfter(Items.IRON_DOOR, TALL_IRON_DOOR);
        entries.addAfter(Items.OAK_DOOR, TALL_OAK_DOOR);
    }
}
