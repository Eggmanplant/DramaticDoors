package com.fizzware.dramaticdoors.items;

import com.fizzware.dramaticdoors.tags.DDItemTags;

import net.fabricmc.fabric.api.registry.FuelRegistry;

public class DDFuels
{
	public static void addFuels() {
		// Set up fuel. Only wooden doors can be used as fuel. Nether wood automatically excluded.
		FuelRegistry.INSTANCE.add(DDItemTags.TALL_WOODEN_DOORS, 300);
		FuelRegistry.INSTANCE.add(DDItemTags.SHORT_WOODEN_DOORS, 100);
	}
}
