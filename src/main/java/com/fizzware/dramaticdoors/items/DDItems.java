package com.fizzware.dramaticdoors.items;

import java.util.ArrayList;
import java.util.List;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.Compats;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTab.TabVisibility;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import net.minecraftforge.common.util.MutableHashedLinkedMap;
import net.minecraft.world.item.Items;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DDItems {

	private static CreativeModeTab MAIN_TAB;
	private static CreativeModeTab CHIPPED_TAB;
	private static CreativeModeTab MACAW_TAB;
	private static CreativeModeTab MANYIDEAS_TAB;
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DramaticDoors.MOD_ID);

    public static final Item.Properties PROPERTIES = new Item.Properties();
    
    // Register all those items for short and tall version of vanilla regular-sized doors.
    public static final RegistryObject<Item> SHORT_IRON_DOOR = ITEMS.register(DDNames.SHORT_IRON, () -> new ShortDoorItem(DDBlocks.SHORT_IRON_DOOR.get(), PROPERTIES));
    public static final RegistryObject<Item> SHORT_OAK_DOOR = ITEMS.register(DDNames.SHORT_OAK, () -> new ShortDoorItem(DDBlocks.SHORT_OAK_DOOR.get(), PROPERTIES));
    public static final RegistryObject<Item> SHORT_SPRUCE_DOOR = ITEMS.register(DDNames.SHORT_SPRUCE, () -> new ShortDoorItem(DDBlocks.SHORT_SPRUCE_DOOR.get(), PROPERTIES));
    public static final RegistryObject<Item> SHORT_BIRCH_DOOR = ITEMS.register(DDNames.SHORT_BIRCH, () -> new ShortDoorItem(DDBlocks.SHORT_BIRCH_DOOR.get(), PROPERTIES));
    public static final RegistryObject<Item> SHORT_JUNGLE_DOOR = ITEMS.register(DDNames.SHORT_JUNGLE, () -> new ShortDoorItem(DDBlocks.SHORT_JUNGLE_DOOR.get(), PROPERTIES));
    public static final RegistryObject<Item> SHORT_ACACIA_DOOR = ITEMS.register(DDNames.SHORT_ACACIA, () -> new ShortDoorItem(DDBlocks.SHORT_ACACIA_DOOR.get(), PROPERTIES));
    public static final RegistryObject<Item> SHORT_DARK_OAK_DOOR = ITEMS.register(DDNames.SHORT_DARK_OAK, () -> new ShortDoorItem(DDBlocks.SHORT_DARK_OAK_DOOR.get(), PROPERTIES));
    public static final RegistryObject<Item> SHORT_MANGROVE_DOOR = ITEMS.register(DDNames.SHORT_MANGROVE, () -> new ShortDoorItem(DDBlocks.SHORT_MANGROVE_DOOR.get(), PROPERTIES));
    public static final RegistryObject<Item> SHORT_BAMBOO_DOOR = ITEMS.register(DDNames.SHORT_BAMBOO, () -> new ShortDoorItem(DDBlocks.SHORT_BAMBOO_DOOR.get(), PROPERTIES.requiredFeatures(FeatureFlags.UPDATE_1_20)));
    public static final RegistryObject<Item> SHORT_CHERRY_DOOR = ITEMS.register(DDNames.SHORT_CHERRY, () -> new ShortDoorItem(DDBlocks.SHORT_CHERRY_DOOR.get(), PROPERTIES.requiredFeatures(FeatureFlags.UPDATE_1_20)));
    public static final RegistryObject<Item> SHORT_CRIMSON_DOOR = ITEMS.register(DDNames.SHORT_CRIMSON, () -> new ShortDoorItem(DDBlocks.SHORT_CRIMSON_DOOR.get(), PROPERTIES));
    public static final RegistryObject<Item> SHORT_WARPED_DOOR = ITEMS.register(DDNames.SHORT_WARPED, () -> new ShortDoorItem(DDBlocks.SHORT_WARPED_DOOR.get(), PROPERTIES));
    
    public static final RegistryObject<Item> TALL_IRON_DOOR = ITEMS.register(DDNames.TALL_IRON, () -> new TallDoorItem(DDBlocks.TALL_IRON_DOOR.get(), PROPERTIES));
    public static final RegistryObject<Item> TALL_OAK_DOOR = ITEMS.register(DDNames.TALL_OAK, () -> new TallDoorItem(DDBlocks.TALL_OAK_DOOR.get(), PROPERTIES));
    public static final RegistryObject<Item> TALL_SPRUCE_DOOR = ITEMS.register(DDNames.TALL_SPRUCE, () -> new TallDoorItem(DDBlocks.TALL_SPRUCE_DOOR.get(), PROPERTIES));
    public static final RegistryObject<Item> TALL_BIRCH_DOOR = ITEMS.register(DDNames.TALL_BIRCH, () -> new TallDoorItem(DDBlocks.TALL_BIRCH_DOOR.get(), PROPERTIES));
    public static final RegistryObject<Item> TALL_JUNGLE_DOOR = ITEMS.register(DDNames.TALL_JUNGLE, () -> new TallDoorItem(DDBlocks.TALL_JUNGLE_DOOR.get(), PROPERTIES));
    public static final RegistryObject<Item> TALL_ACACIA_DOOR = ITEMS.register(DDNames.TALL_ACACIA, () -> new TallDoorItem(DDBlocks.TALL_ACACIA_DOOR.get(), PROPERTIES));
    public static final RegistryObject<Item> TALL_DARK_OAK_DOOR = ITEMS.register(DDNames.TALL_DARK_OAK, () -> new TallDoorItem(DDBlocks.TALL_DARK_OAK_DOOR.get(), PROPERTIES));
    public static final RegistryObject<Item> TALL_MANGROVE_DOOR = ITEMS.register(DDNames.TALL_MANGROVE, () -> new TallDoorItem(DDBlocks.TALL_MANGROVE_DOOR.get(), PROPERTIES));
    public static final RegistryObject<Item> TALL_BAMBOO_DOOR = ITEMS.register(DDNames.TALL_BAMBOO, () -> new TallDoorItem(DDBlocks.TALL_BAMBOO_DOOR.get(), PROPERTIES.requiredFeatures(FeatureFlags.UPDATE_1_20)));
    public static final RegistryObject<Item> TALL_CHERRY_DOOR = ITEMS.register(DDNames.TALL_CHERRY, () -> new TallDoorItem(DDBlocks.TALL_CHERRY_DOOR.get(), PROPERTIES.requiredFeatures(FeatureFlags.UPDATE_1_20)));
    public static final RegistryObject<Item> TALL_CRIMSON_DOOR = ITEMS.register(DDNames.TALL_CRIMSON, () -> new TallDoorItem(DDBlocks.TALL_CRIMSON_DOOR.get(), PROPERTIES));
    public static final RegistryObject<Item> TALL_WARPED_DOOR = ITEMS.register(DDNames.TALL_WARPED, () -> new TallDoorItem(DDBlocks.TALL_WARPED_DOOR.get(), PROPERTIES));
    
    @SubscribeEvent
    public static void registerCreativeTabs(CreativeModeTabEvent.Register event) {
    	List<Object> list = new ArrayList<Object>();
    	if (ModList.get().isLoaded("chipped")) {
    		CHIPPED_TAB = event.registerCreativeModeTab(new ResourceLocation(DramaticDoors.MOD_ID, "chipped_tab"), List.of(), List.of(CreativeModeTabs.SPAWN_EGGS), builder -> builder.title(Component.translatable("itemGroup.dramaticdoors_chipped")).icon(() -> { return new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_GATED))); } ).build());
    		list.add(CHIPPED_TAB);
    	}
    	if (ModList.get().isLoaded("mcwdoors")) {
    		MACAW_TAB = event.registerCreativeModeTab(new ResourceLocation(DramaticDoors.MOD_ID, "macaw_tab"), List.of(), List.of(CreativeModeTabs.SPAWN_EGGS), builder -> builder.title(Component.translatable("itemGroup.dramaticdoors_macaw")).icon(() -> { return new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BARN))); } ).build());
    		list.add(MACAW_TAB);
    	}
    	if (ModList.get().isLoaded("manyideas_doors")) {
    		MANYIDEAS_TAB = event.registerCreativeModeTab(new ResourceLocation(DramaticDoors.MOD_ID, "manyideas_tab"), List.of(), List.of(CreativeModeTabs.SPAWN_EGGS), builder -> builder.title(Component.translatable("itemGroup.dramaticdoors_manyideas")).icon(() -> { return new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_BLANK))); } ).build());
    		list.add(MANYIDEAS_TAB);
    	}
    	MAIN_TAB = event.registerCreativeModeTab(new ResourceLocation(DramaticDoors.MOD_ID, "main_tab"), list, List.of(CreativeModeTabs.SPAWN_EGGS), builder -> builder.title(Component.translatable("itemGroup.dramaticdoors")).icon(() -> { return new ItemStack(DDItems.TALL_OAK_DOOR.get()); } ).build());
    }
        
    @SubscribeEvent
    public static void assignItemsToTabs(CreativeModeTabEvent.BuildContents event) {
    	MutableHashedLinkedMap<ItemStack, TabVisibility> map = event.getEntries();
    	// Insert into vanilla tabs.
    	if (event.getTab() == CreativeModeTabs.BUILDING_BLOCKS) {
    		map.putBefore(Items.IRON_DOOR.getDefaultInstance(), SHORT_IRON_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.OAK_DOOR.getDefaultInstance(), SHORT_OAK_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.SPRUCE_DOOR.getDefaultInstance(), SHORT_SPRUCE_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.BIRCH_DOOR.getDefaultInstance(), SHORT_BIRCH_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.JUNGLE_DOOR.getDefaultInstance(), SHORT_JUNGLE_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.ACACIA_DOOR.getDefaultInstance(), SHORT_ACACIA_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.DARK_OAK_DOOR.getDefaultInstance(), SHORT_DARK_OAK_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.MANGROVE_DOOR.getDefaultInstance(), SHORT_MANGROVE_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.CRIMSON_DOOR.getDefaultInstance(), SHORT_CRIMSON_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.WARPED_DOOR.getDefaultInstance(), SHORT_WARPED_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.BAMBOO_DOOR.getDefaultInstance(), SHORT_BAMBOO_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.CHERRY_DOOR.getDefaultInstance(), SHORT_CHERRY_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.IRON_DOOR.getDefaultInstance(), TALL_IRON_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.OAK_DOOR.getDefaultInstance(), TALL_OAK_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.SPRUCE_DOOR.getDefaultInstance(), TALL_SPRUCE_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.BIRCH_DOOR.getDefaultInstance(), TALL_BIRCH_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.JUNGLE_DOOR.getDefaultInstance(), TALL_JUNGLE_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.ACACIA_DOOR.getDefaultInstance(), TALL_ACACIA_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.DARK_OAK_DOOR.getDefaultInstance(), TALL_DARK_OAK_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.MANGROVE_DOOR.getDefaultInstance(), TALL_MANGROVE_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.CRIMSON_DOOR.getDefaultInstance(), TALL_CRIMSON_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.WARPED_DOOR.getDefaultInstance(), TALL_WARPED_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.BAMBOO_DOOR.getDefaultInstance(), TALL_BAMBOO_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.CHERRY_DOOR.getDefaultInstance(), TALL_CHERRY_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    	}
    	if (event.getTab() == CreativeModeTabs.REDSTONE_BLOCKS) {
    		map.putBefore(Items.IRON_DOOR.getDefaultInstance(), SHORT_IRON_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putBefore(Items.OAK_DOOR.getDefaultInstance(), SHORT_OAK_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.IRON_DOOR.getDefaultInstance(), TALL_IRON_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		map.putAfter(Items.OAK_DOOR.getDefaultInstance(), TALL_OAK_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    	}
    	// Insert into Dramatic Doors tabs.
    	if (event.getTab() == MAIN_TAB) {
    		// Vanilla
    		map.put(SHORT_IRON_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.put(TALL_IRON_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.put(SHORT_OAK_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.put(TALL_OAK_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.put(SHORT_SPRUCE_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.put(TALL_SPRUCE_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.put(SHORT_BIRCH_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.put(TALL_BIRCH_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.put(SHORT_JUNGLE_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.put(TALL_JUNGLE_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.put(SHORT_ACACIA_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.put(TALL_ACACIA_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.put(SHORT_DARK_OAK_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.put(TALL_DARK_OAK_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.put(SHORT_MANGROVE_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.put(TALL_MANGROVE_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.put(SHORT_BAMBOO_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.put(TALL_BAMBOO_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.put(SHORT_CHERRY_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.put(TALL_CHERRY_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.put(SHORT_CRIMSON_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.put(TALL_CRIMSON_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.put(SHORT_WARPED_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.put(TALL_WARPED_DOOR.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		
    		// Modded
    		if (ModList.get().isLoaded("biomesoplenty")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_CHERRY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_CHERRY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_DEAD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_DEAD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_FIR)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_FIR)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_HELLBARK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_HELLBARK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_JACARANDA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_JACARANDA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_MAGIC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_MAGIC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_MAHOGANY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_MAHOGANY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_PALM)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_PALM)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_REDWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_REDWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_UMBRAN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_UMBRAN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BOP_WILLOW)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BOP_WILLOW)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("byg")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_ASPEN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_ASPEN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_BAOBAB)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_BAOBAB)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_BLUE_ENCHANTED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_BLUE_ENCHANTED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_BULBIS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_BULBIS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_CHERRY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_CHERRY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_CIKA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_CIKA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_CYPRESS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_CYPRESS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_EBONY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_EBONY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_EMBUR)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_EMBUR)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_ETHER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_ETHER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_FIR)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_FIR)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_FLORUS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_FLORUS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_GREEN_ENCHANTED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_GREEN_ENCHANTED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_HOLLY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_HOLLY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_IMPARIUS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_IMPARIUS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_IRONWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_IRONWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_JACARANDA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_JACARANDA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_LAMENT)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_LAMENT)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_MAHOGANY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_MAHOGANY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_MAPLE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_MAPLE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_NIGHTSHADE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_NIGHTSHADE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_PALM)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_PALM)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_PINE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_PINE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_RAINBOW_EUCALYPTUS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_RAINBOW_EUCALYPTUS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_REDWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_REDWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_SKYRIS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_SKYRIS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_SOUL_SHROOM)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_SOUL_SHROOM)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_SYTHIAN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_SYTHIAN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_WHITE_MANGROVE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_WHITE_MANGROVE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_WILLOW)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_WILLOW)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_WITCH_HAZEL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_WITCH_HAZEL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BYG_ZELKOVA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BYG_ZELKOVA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("prehistoricfauna")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_AGATHOXYLON)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AGATHOXYLON)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ARAUCARIA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ARAUCARIA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BRACHYPHYLLUM)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BRACHYPHYLLUM)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GINKGO)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GINKGO)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_HEIDIPHYLLUM)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_HEIDIPHYLLUM)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LIRIODENDRITES)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LIRIODENDRITES)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_METASEQUOIA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_METASEQUOIA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_NEOCALAMITES)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_NEOCALAMITES)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PROTOJUNIPEROXYLON)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PROTOJUNIPEROXYLON)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PROTOPICEOXYLON)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PROTOPICEOXYLON)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SCHILDERIA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SCHILDERIA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TROCHODENDROIDES)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TROCHODENDROIDES)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WOODWORTHIA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WOODWORTHIA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ZAMITES)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ZAMITES)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("regions_unexplored")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_BAOBAB)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_BAOBAB)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_BLACKWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_BLACKWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_BRIMWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_BRIMWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_CHERRY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_CHERRY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_CYPRESS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_CYPRESS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_DEAD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_DEAD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_EUCALYPTUS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_EUCALYPTUS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_JOSHUA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_JOSHUA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_LARCH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_LARCH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_MAPLE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_MAPLE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_MAUVE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_MAUVE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_PALM)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_PALM)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_PINE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_PINE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_REDWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_REDWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUE_WILLOW)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUE_WILLOW)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("twilightforest")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CANOPY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CANOPY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_DARKWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DARKWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TWILIGHT_MANGROVE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TWILIGHT_MANGROVE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MINEWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MINEWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SORTINGWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SORTINGWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TIMEWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TIMEWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TRANSWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TRANSWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TWILIGHT_OAK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TWILIGHT_OAK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("tflostblocks")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TOWERWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TOWERWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("blue_skies")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BS_BLUEBRIGHT)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BS_BLUEBRIGHT)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BS_CHERRY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BS_CHERRY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BS_CRYSTALLIZED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BS_CRYSTALLIZED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BS_DUSK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BS_DUSK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BS_FROSTBRIGHT)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BS_FROSTBRIGHT)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BS_LUNAR)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BS_LUNAR)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BS_MAPLE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BS_MAPLE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BS_STARLIT)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BS_STARLIT)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		// Abnormals Mods
    		if (ModList.get().isLoaded("atmospheric")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ASPEN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ASPEN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GRIMWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GRIMWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_KOUSA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_KOUSA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MORADO)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MORADO)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ROSEWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ROSEWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_YUCCA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_YUCCA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("autumnity")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MAPLE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MAPLE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("buzzier_bees")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_HONEYCOMB)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_HONEYCOMB)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("caverns_and_chasms")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_AZALEA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AZALEA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("endergetic")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POISE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POISE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("environmental")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_DARK_CHERRY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DARK_CHERRY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WILLOW)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WILLOW)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WISTERIA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WISTERIA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("upgrade_aquatic")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_DRIFTWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DRIFTWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RIVER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RIVER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TOOTH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TOOTH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		// Team Aurora Mods
    		if (ModList.get().isLoaded("horizons")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CYPRESS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CYPRESS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_JACARANDA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_JACARANDA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_REDBUD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_REDBUD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("enhanced_mushrooms")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BROWN_MUSHROOM)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BROWN_MUSHROOM)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RED_MUSHROOM)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RED_MUSHROOM)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		// Other Mods
    		if (ModList.get().isLoaded("abundant_atmosphere")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ASH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ASH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GOURDROT)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GOURDROT)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("ad_astra")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_AERONOS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AERONOS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GLACIAN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GLACIAN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_STROPHAR)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_STROPHAR)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_AA_STEEL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AA_STEEL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("aether")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_AETHER_SKYROOT)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AETHER_SKYROOT)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("architects_palette")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TWISTED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TWISTED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("ars_nouveau")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ARCHWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ARCHWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("bambooeverything")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BE_BAMBOO)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BE_BAMBOO)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BE_DRY_BAMBOO)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BE_DRY_BAMBOO)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("biomancy")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FLESH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FLESH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FULL_FLESH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FULL_FLESH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FLESHKIN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FLESHKIN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("biomemakeover")) { 
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BM_ANCIENT_OAK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BM_ANCIENT_OAK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BM_BLIGHTED_BALSA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BM_BLIGHTED_BALSA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BM_SWAMP_CYPRESS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BM_SWAMP_CYPRESS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BM_WILLOW)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BM_WILLOW)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("blocksplus")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BP_BAMBOO)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BP_BAMBOO)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BP_MUSHROOM)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BP_MUSHROOM)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BP_COPPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BP_COPPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BP_GOLDEN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BP_GOLDEN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BP_DIAMOND)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BP_DIAMOND)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BP_EMERALD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BP_EMERALD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BP_NETHERITE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BP_NETHERITE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("caupona")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WALNUT)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WALNUT)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("ceilands")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CEILTRUNK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CEILTRUNK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LUZAWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LUZAWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("cobblemon")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_APRICORN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_APRICORN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);    			
    		}
    		if (ModList.get().isLoaded("copperoverhaul")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CO_COPPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CO_COPPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CO_EXPOSED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CO_EXPOSED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CO_WEATHERED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CO_WEATHERED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CO_OXIDIZED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CO_OXIDIZED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("alloyed")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_STEEL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_STEEL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LOCKED_STEEL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LOCKED_STEEL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("createdeco")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ANDESITE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ANDESITE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BRASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BRASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_COPPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_COPPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ZINC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ZINC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LOCKED_ANDESITE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LOCKED_ANDESITE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LOCKED_BRASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LOCKED_BRASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LOCKED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LOCKED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LOCKED_ZINC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LOCKED_ZINC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("create_misc_and_things")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ANDESITE_CASING)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ANDESITE_CASING)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BRASS_CASING)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BRASS_CASING)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_COPPER_CASING)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_COPPER_CASING)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("caupona")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WALNUT)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WALNUT)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("colorfulazaleas")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_AZULE_AZALEA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AZULE_AZALEA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BRIGHT_AZALEA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BRIGHT_AZALEA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FISS_AZALEA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FISS_AZALEA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ROZE_AZALEA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ROZE_AZALEA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TECAL_AZALEA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TECAL_AZALEA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TITANIUM_AZALEA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TITANIUM_AZALEA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WALNUT_AZALEA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WALNUT_AZALEA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("darkerdepths")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PETRIFIED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PETRIFIED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("deeperdarker")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ECHO)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ECHO)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("dustrial_decor")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CARDBOARD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CARDBOARD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CHAIN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHAIN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_INDUSTRIAL_IRON)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_INDUSTRIAL_IRON)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_IRON_BAR)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_IRON_BAR)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PADDED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PADDED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUSTY_IRON)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUSTY_IRON)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUSTY_SHEET_METAL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUSTY_SHEET_METAL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SHEET_METAL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SHEET_METAL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("ecologics")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ECO_AZALEA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ECO_AZALEA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ECO_FLOWERING_AZALEA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ECO_FLOWERING_AZALEA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ECO_COCONUT)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ECO_COCONUT)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ECO_WALNUT)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ECO_WALNUT)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("phantasm")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EBONY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EBONY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PREAM)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PREAM)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("enlightened_end")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CONGEALED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CONGEALED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EE_EBONY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EE_EBONY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("everythingcopper")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_COPPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EC_COPPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_EXPOSED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EC_EXPOSED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_WEATHERED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EC_WEATHERED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_OXIDIZED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EC_OXIDIZED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_WAXED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EC_WAXED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_WAXED_EXPOSED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EC_WAXED_EXPOSED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_WAXED_WEATHERED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EC_WAXED_WEATHERED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_WAXED_OXIDIZED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EC_WAXED_OXIDIZED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("extendedmushrooms")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MUSHROOM)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MUSHROOM)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POISONOUS_MUSHROOM)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POISONOUS_MUSHROOM)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GLOWSHROOM)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GLOWSHROOM)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_HONEY_FUNGUS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_HONEY_FUNGUS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("forbidden_arcanus")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_DEORUM)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DEORUM)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_AURUM)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AURUM)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ARCANE_EDELWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ARCANE_EDELWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CHERRYWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHERRYWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EDELWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EDELWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FUNGYSS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FUNGYSS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("fruittrees")) {
    			//map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FT_CHERRY_SLIDING)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FT_CHERRY_SLIDING)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FT_CHERRY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FT_CHERRY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FT_CITRUS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);    			
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FT_CITRUS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);    			
    		}
    		if (ModList.get().isLoaded("gardens_of_the_dead")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SOULBLIGHT)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SOULBLIGHT)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WHISTLECANE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);    			
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WHISTLECANE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);    			
    		}
    		if (ModList.get().isLoaded("goodending")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GE_CYPRESS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GE_CYPRESS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GE_MUDDY_OAK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);    			
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GE_MUDDY_OAK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);    			
    		}
    		if (ModList.get().isLoaded("graveyard")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_DARK_IRON)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DARK_IRON)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("habitat")) {
    			if (ModList.get().isLoaded("enhanced_mushrooms")) { 
    				map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FAIRY_RING_MUSHROOM)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS); 
    				map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FAIRY_RING_MUSHROOM)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS); 
    			}
    		}
    		if (ModList.get().isLoaded("hexcasting")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EDIFIED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EDIFIED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("hexerei")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_HEXEREI_MAHOGANY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_HEXEREI_MAHOGANY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_HEXEREI_WILLOW)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_HEXEREI_WILLOW)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_HEXEREI_WITCH_HAZEL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_HEXEREI_WITCH_HAZEL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("integrateddynamics")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MENRIL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MENRIL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("malum")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUNEWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUNEWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SOULWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SOULWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("ms")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_IRON_BAR)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_IRON_BAR)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_BAMBOO)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_BAMBOO)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_CHERRY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_CHERRY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_GLOWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_GLOWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_HELLWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_HELLWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_MAPLE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_MAPLE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_SILVERBELL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_SILVERBELL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_TIGERWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_TIGERWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_WILLOW)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_WILLOW)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_SOUL_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_SOUL_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_TINTED_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_TINTED_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_BLACK_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_BLACK_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_GREY_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_GREY_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_LIGHT_GREY_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_LIGHT_GREY_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_WHITE_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_WHITE_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_RED_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_RED_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_ORANGE_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_ORANGE_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_YELLOW_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_YELLOW_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_LIME_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_LIME_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_GREEN_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_GREEN_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_CYAN_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_CYAN_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_BLUE_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_BLUE_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_PURPLE_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_PURPLE_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_MAGENTA_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_MAGENTA_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_PINK_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_PINK_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_LIGHT_BLUE_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_LIGHT_BLUE_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_BROWN_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_BROWN_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("morecraft")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MORECRAFT_BONE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MORECRAFT_BONE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MORECRAFT_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MORECRAFT_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MORECRAFT_SOUL_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MORECRAFT_SOUL_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MORECRAFT_NETHERBRICK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MORECRAFT_NETHERBRICK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MORECRAFT_NETHERITE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MORECRAFT_NETHERITE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MORECRAFT_NETHERWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MORECRAFT_NETHERWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("nethers_exoticism")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_JABOTICABA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_JABOTICABA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RAMBOUTAN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RAMBOUTAN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("newworld")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FIR)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FIR)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("outer_end")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_AZURE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AZURE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("pokecube")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POKECUBE_ENIGMA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POKECUBE_ENIGMA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POKECUBE_LEPPA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POKECUBE_LEPPA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POKECUBE_NANAB)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POKECUBE_NANAB)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POKECUBE_ORAN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POKECUBE_ORAN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POKECUBE_PECHA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POKECUBE_PECHA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POKECUBE_SITRUS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POKECUBE_SITRUS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POKECUBE_AGED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POKECUBE_AGED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POKECUBE_CONCRETE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POKECUBE_CONCRETE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POKECUBE_CORRUPTED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POKECUBE_CORRUPTED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POKECUBE_DISTORTIC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POKECUBE_DISTORTIC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POKECUBE_INVERTED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POKECUBE_INVERTED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POKECUBE_MIRAGE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POKECUBE_MIRAGE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POKECUBE_TEMPORAL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POKECUBE_TEMPORAL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("premium_wood")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PW_MAGIC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PW_MAGIC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PW_MAPLE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PW_MAPLE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PW_PURPLE_HEART)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PW_PURPLE_HEART)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PW_SILVERBELL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PW_SILVERBELL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PW_TIGER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PW_TIGER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PW_WILLOW)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);    			
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PW_WILLOW)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);    			
    		}
    		if (ModList.get().isLoaded("pyromancer")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PYROWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PYROWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ROTTEN_PLANKS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ROTTEN_PLANKS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("quark")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_QUARK_ANCIENT)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_QUARK_ANCIENT)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_QUARK_AZALEA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_QUARK_AZALEA)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_QUARK_BLOSSOM)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_QUARK_BLOSSOM)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("silentgear")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_NETHERWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_NETHERWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("snowyspirit")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GINGERBREAD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GINGERBREAD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("supplementaries")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GOLD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GOLD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SILVER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SILVER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LEAD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LEAD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_NETHERITE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_NETHERITE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("tconstruct")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BLOODSHROOM)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BLOODSHROOM)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GREENHEART)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GREENHEART)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SKYROOT)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SKYROOT)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("twigs")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TWIGS_BAMBOO)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TWIGS_BAMBOO)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("undergarden")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GRONGLE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GRONGLE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SMOGSTEM)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SMOGSTEM)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WIGGLEWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WIGGLEWOOD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("windswept")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CHESTNUT)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHESTNUT)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_HOLLY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_HOLLY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    	}
    	if (Compats.CHIPPED_INSTALLED && event.getTab() == CHIPPED_TAB) {
    		if (ModList.get().isLoaded("chipped")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_HEAVY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_DUAL_PANELED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_PRESSED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_SHACK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_FORTIFIED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_SLIDING)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_SCREEN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_GATED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_WINDOWED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_TILED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_TILE_WINDOWED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_SECRET)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_BOARDED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_PAPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_BEACH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_BARRED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_PANELED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_SUPPORTED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_OAK_OVERGROWN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_HEAVY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_DUAL_PANELED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_PRESSED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_SHACK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_FORTIFIED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_SLIDING)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_SCREEN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_GATED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_WINDOWED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_TILED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_TILE_WINDOWED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_SECRET)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_MODERN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_PAPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_BEACH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_BARRED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_PANELED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_SUPPORTED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_SPRUCE_OVERGROWN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_HEAVY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_DUAL_PANELED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_PRESSED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_SHACK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_FORTIFIED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_SLIDING)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_SCREEN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_GATED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_WINDOWED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_TILED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_TILE_WINDOWED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_SECRET)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_MODERN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_BOARDED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_BEACH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_BARRED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_PANELED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_SUPPORTED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_OVERGROWN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_HEAVY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_DUAL_PANELED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_PRESSED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_SHACK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_FORTIFIED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_SLIDING)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_SCREEN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_GATED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_WINDOWED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_TILED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_TILE_WINDOWED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_SECRET)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_MODERN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_BOARDED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_PAPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_BARRED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_PANELED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_SUPPORTED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_JUNGLE_OVERGROWN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_HEAVY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_DUAL_PANELED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_PRESSED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_SHACK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_FORTIFIED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_SLIDING)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_SCREEN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_GATED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_WINDOWED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_TILED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_TILE_WINDOWED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_SECRET)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_MODERN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_BOARDED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_PAPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_BEACH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_PANELED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_SUPPORTED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_ACACIA_OVERGROWN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_HEAVY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_DUAL_PANELED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_PRESSED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_SHACK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_FORTIFIED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_SLIDING)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_SCREEN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_GATED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_WINDOWED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_TILED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_TILE_WINDOWED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_SECRET)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_MODERN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_BOARDED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_PAPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_BEACH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_BARRED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_SUPPORTED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_DARK_OAK_OVERGROWN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_HEAVY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_DUAL_PANELED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_PRESSED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_SHACK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_FORTIFIED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_SLIDING)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_SCREEN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_GATED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_WINDOWED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_TILED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_TILE_WINDOWED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_SECRET)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_MODERN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_BOARDED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_PAPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_BEACH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_BARRED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_PANELED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_SUPPORTED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_MANGROVE_OVERGROWN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_HEAVY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_DUAL_PANELED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_PRESSED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_SHACK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_FORTIFIED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_SLIDING)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_SCREEN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_GATED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_WINDOWED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_TILED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_TILE_WINDOWED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_SECRET)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_MODERN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_BOARDED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_PAPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_BEACH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_BARRED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_PANELED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_CRIMSON_OVERGROWN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_HEAVY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_DUAL_PANELED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_PRESSED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_SHACK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_FORTIFIED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_SLIDING)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_SCREEN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_GATED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_WINDOWED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_TILED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_TILE_WINDOWED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_SECRET)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_MODERN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_BOARDED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_PAPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_BEACH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_BARRED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_PANELED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_WARPED_SUPPORTED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    	}
    	if (Compats.MACAWS_DOORS_INSTALLED && event.getTab() == MACAW_TAB) {
    		if (ModList.get().isLoaded("mcwdoors")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_STORE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SLIDING_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JAIL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_HOSPITAL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_REINFORCED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_WARNING)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_METAL_WINDOWED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BARN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BARN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BARN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_BARN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BARN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BARN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BARN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_BARN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_BARN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_BARN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BARN_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BARN_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BARN_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_BARN_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BARN_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BARN_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BARN_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_BARN_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_BARN_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_BARN_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_STABLE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_STABLE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_STABLE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_STABLE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_STABLE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_STABLE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_STABLE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_STABLE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_STABLE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_STABLE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_STABLE_HEAD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_STABLE_HEAD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_STABLE_HEAD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_STABLE_HEAD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_STABLE_HEAD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_STABLE_HEAD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_STABLE_HEAD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_STABLE_HEAD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_STABLE_HEAD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_STABLE_HEAD)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BARK_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BARK_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BARK_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_BARK_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BARK_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BARK_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BARK_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_BARK_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_STEM_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_STEM_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_MODERN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_MODERN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_MODERN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_MODERN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_MODERN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_MODERN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_MODERN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_MODERN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_MODERN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_MODERN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_JAPANESE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_JAPANESE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_JAPANESE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_JAPANESE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_JAPANESE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_JAPANESE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_JAPANESE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_JAPANESE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_JAPANESE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_JAPANESE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_JAPANESE2)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_JAPANESE2)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_JAPANESE2)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_JAPANESE2)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_JAPANESE2)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_JAPANESE2)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_JAPANESE2)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_JAPANESE2)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_JAPANESE2)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_JAPANESE2)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_CLASSIC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_CLASSIC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_CLASSIC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_CLASSIC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_CLASSIC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_CLASSIC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_CLASSIC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_CLASSIC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_CLASSIC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_COTTAGE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_COTTAGE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_COTTAGE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_COTTAGE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_COTTAGE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_COTTAGE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_COTTAGE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_COTTAGE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_COTTAGE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_PAPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_PAPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_PAPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_PAPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_PAPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_PAPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_PAPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_PAPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_PAPER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BEACH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BEACH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BEACH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BEACH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BEACH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BEACH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_BEACH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_BEACH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_BEACH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_TROPICAL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_TROPICAL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_TROPICAL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_TROPICAL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_TROPICAL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_TROPICAL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_TROPICAL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_TROPICAL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_TROPICAL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_FOUR_PANEL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_FOUR_PANEL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_FOUR_PANEL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_FOUR_PANEL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_FOUR_PANEL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_FOUR_PANEL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_FOUR_PANEL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_FOUR_PANEL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_FOUR_PANEL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_SWAMP)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_SWAMP)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_SWAMP)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_SWAMP)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_SWAMP)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_SWAMP)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_SWAMP)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_SWAMP)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_SWAMP)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_BAMBOO)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_BAMBOO)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_BAMBOO)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_BAMBOO)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_BAMBOO)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BAMBOO)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_BAMBOO)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_BAMBOO)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_BAMBOO)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_NETHER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_NETHER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_NETHER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_NETHER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_NETHER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_NETHER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_NETHER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_NETHER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_WARPED_NETHER)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_OAK_MYSTIC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_SPRUCE_MYSTIC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BIRCH_MYSTIC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_JUNGLE_MYSTIC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_ACACIA_MYSTIC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_MYSTIC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_MANGROVE_MYSTIC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_BAMBOO_MYSTIC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_CRIMSON_MYSTIC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    	}
    	if (Compats.MANYIDEAS_DOORS_INSTALLED && event.getTab() == MANYIDEAS_TAB) {
    		if (ModList.get().isLoaded("manyideas_doors")) {
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_BAR)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_BARREL)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_BRICK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_CORRUGATED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_FACTORY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_MODERN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_SHIP)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_SMOOTH_SANDSTONE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_STEAMPUNK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_BOOKSHELF)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_DWARF)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_FANTASY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_LABORATORY)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_RUSTED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_SAFE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_SHIP)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_SPACE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_STONE_BRICK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_BLANK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_BOOKSHELF)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_CASSETTE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_FRENCH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_FROSTED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_HEART)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_ORIGIN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_RUSTIC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_SHOJI)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_BLANK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_BOOKSHELF)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_CASSETTE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_FRENCH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_FROSTED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_HEART)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_ORIGIN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_RUSTIC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_SHOJI)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_BLANK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_BOOKSHELF)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_CASSETTE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_FRENCH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_FROSTED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_HEART)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_ORIGIN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_RUSTIC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_SHOJI)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_BLANK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_BOOKSHELF)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_CASSETTE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_FRENCH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_FROSTED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_HEART)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_ORIGIN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_RUSTIC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_SHOJI)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_BLANK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_BOOKSHELF)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_CASSETTE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_FRENCH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_FROSTED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_HEART)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_ORIGIN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_RUSTIC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_SHOJI)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_BLANK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_BOOKSHELF)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_CASSETTE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_FRENCH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_FROSTED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_HEART)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_ORIGIN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_RUSTIC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_SHOJI)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);

    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_BLANK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_BOOKSHELF)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_CASSETTE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_FRENCH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_FROSTED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_HEART)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_ORIGIN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_RUSTIC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_SHOJI)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_BLANK)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_BOOKSHELF)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_CASSETTE)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_FRENCH)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_FROSTED)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_GLASS)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_HEART)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_ORIGIN)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_RUSTIC)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.put(ForgeRegistries.ITEMS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_SHOJI)).getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    	}
    }
}
