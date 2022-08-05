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

    // Bewitchment
    public static final Item TALL_CYPRESS_DOOR = new TallDoorItem(DDBlocks.TALL_CYPRESS_DOOR, new FabricItemSettings().group(conditionalTabProperties("bewitchment", DramaticDoors.DD_TAB)));
    public static final Item TALL_DRAGONS_BLOOD_DOOR = new TallDoorItem(DDBlocks.TALL_DRAGONS_BLOOD_DOOR, new FabricItemSettings().group(conditionalTabProperties("bewitchment", DramaticDoors.DD_TAB)));
    public static final Item TALL_ELDER_DOOR = new TallDoorItem(DDBlocks.TALL_ELDER_DOOR, new FabricItemSettings().group(conditionalTabProperties("bewitchment", DramaticDoors.DD_TAB)));
    public static final Item TALL_JUNIPER_DOOR = new TallDoorItem(DDBlocks.TALL_JUNIPER_DOOR, new FabricItemSettings().group(conditionalTabProperties("bewitchment", DramaticDoors.DD_TAB)));
    
    // The Ceilands
    public static final Item TALL_CEILTRUNK_DOOR = new TallDoorItem(DDBlocks.TALL_CEILTRUNK_DOOR, new FabricItemSettings().group(conditionalTabProperties("ceilands", DramaticDoors.DD_TAB)));
    public static final Item TALL_LUZAWOOD_DOOR = new TallDoorItem(DDBlocks.TALL_LUZAWOOD_DOOR, new FabricItemSettings().group(conditionalTabProperties("ceilands", DramaticDoors.DD_TAB)));
    
    // Ecologics
    public static final Item TALL_ECO_AZALEA_DOOR = new TallDoorItem(DDBlocks.TALL_ECO_AZALEA_DOOR, new FabricItemSettings().group(conditionalTabProperties("ecologics", DramaticDoors.DD_TAB)));
    public static final Item TALL_ECO_FLOWERING_AZALEA_DOOR = new TallDoorItem(DDBlocks.TALL_ECO_FLOWERING_AZALEA_DOOR, new FabricItemSettings().group(conditionalTabProperties("ecologics", DramaticDoors.DD_TAB)));
    public static final Item TALL_ECO_COCONUT_DOOR = new TallDoorItem(DDBlocks.TALL_ECO_COCONUT_DOOR, new FabricItemSettings().group(conditionalTabProperties("ecologics", DramaticDoors.DD_TAB)));
    public static final Item TALL_ECO_WALNUT_DOOR = new TallDoorItem(DDBlocks.TALL_ECO_WALNUT_DOOR, new FabricItemSettings().group(conditionalTabProperties("ecologics", DramaticDoors.DD_TAB)));
    
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

		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CYPRESS), TALL_CYPRESS_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_DRAGONS_BLOOD), TALL_DRAGONS_BLOOD_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_ELDER), TALL_ELDER_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_JUNIPER), TALL_JUNIPER_DOOR);

		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_CEILTRUNK), TALL_CEILTRUNK_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_LUZAWOOD), TALL_LUZAWOOD_DOOR);

		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_ECO_AZALEA), TALL_ECO_AZALEA_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_ECO_FLOWERING_AZALEA), TALL_ECO_FLOWERING_AZALEA_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_ECO_COCONUT), TALL_ECO_COCONUT_DOOR);
		Registry.register(Registry.ITEM, new Identifier(DramaticDoors.MOD_ID, DDNames.TALL_ECO_WALNUT), TALL_ECO_WALNUT_DOOR);

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
