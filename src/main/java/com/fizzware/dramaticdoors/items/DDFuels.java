package com.fizzware.dramaticdoors.items;

import net.fabricmc.fabric.api.registry.FuelRegistry;

public class DDFuels
{
	public static void addFuels() {
		// Set up fuel. Only wooden doors can be used as fuel. Nether wood excluded.
		FuelRegistry.INSTANCE.add(DDItems.TALL_OAK_DOOR, 300);
		FuelRegistry.INSTANCE.add(DDItems.TALL_SPRUCE_DOOR, 300);
		FuelRegistry.INSTANCE.add(DDItems.TALL_BIRCH_DOOR, 300);
		FuelRegistry.INSTANCE.add(DDItems.TALL_JUNGLE_DOOR, 300);
		FuelRegistry.INSTANCE.add(DDItems.TALL_ACACIA_DOOR, 300);
		FuelRegistry.INSTANCE.add(DDItems.TALL_DARK_OAK_DOOR, 300);
		FuelRegistry.INSTANCE.add(DDItems.TALL_MANGROVE_DOOR, 300);

		FuelRegistry.INSTANCE.add(DDItems.TALL_CYPRESS_DOOR, 300);
		FuelRegistry.INSTANCE.add(DDItems.TALL_DRAGONS_BLOOD_DOOR, 300);
		FuelRegistry.INSTANCE.add(DDItems.TALL_ELDER_DOOR, 300);
		FuelRegistry.INSTANCE.add(DDItems.TALL_JUNIPER_DOOR, 300);

		FuelRegistry.INSTANCE.add(DDItems.TALL_ANCIENT_OAK_DOOR, 300);
		FuelRegistry.INSTANCE.add(DDItems.TALL_BLIGHTED_BALSA_DOOR, 300);
		FuelRegistry.INSTANCE.add(DDItems.TALL_SWAMP_CYPRESS_DOOR, 300);
		FuelRegistry.INSTANCE.add(DDItems.TALL_WILLOW_DOOR, 300);

		FuelRegistry.INSTANCE.add(DDItems.TALL_CEILTRUNK_DOOR, 300);
		FuelRegistry.INSTANCE.add(DDItems.TALL_LUZAWOOD_DOOR, 300);

		FuelRegistry.INSTANCE.add(DDItems.TALL_ECO_AZALEA_DOOR, 300);
		FuelRegistry.INSTANCE.add(DDItems.TALL_ECO_FLOWERING_AZALEA_DOOR, 300);
		FuelRegistry.INSTANCE.add(DDItems.TALL_ECO_COCONUT_DOOR, 300);
		FuelRegistry.INSTANCE.add(DDItems.TALL_ECO_WALNUT_DOOR, 300);

		FuelRegistry.INSTANCE.add(DDItems.TALL_CANOPY_DOOR, 300);
		FuelRegistry.INSTANCE.add(DDItems.TALL_DARKWOOD_DOOR, 300);
		FuelRegistry.INSTANCE.add(DDItems.TALL_MINEWOOD_DOOR, 300);
		FuelRegistry.INSTANCE.add(DDItems.TALL_SORTINGWOOD_DOOR, 300);
		FuelRegistry.INSTANCE.add(DDItems.TALL_TIMEWOOD_DOOR, 300);
		FuelRegistry.INSTANCE.add(DDItems.TALL_TRANSWOOD_DOOR, 300);
		FuelRegistry.INSTANCE.add(DDItems.TALL_TWILIGHT_OAK_DOOR, 300);
		FuelRegistry.INSTANCE.add(DDItems.TALL_TWILIGHT_MANGROVE_DOOR, 300);
	}
}
