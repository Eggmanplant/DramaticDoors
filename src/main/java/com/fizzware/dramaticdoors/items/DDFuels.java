package com.fizzware.dramaticdoors.items;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.core.Registry;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.Material;

public class DDFuels
{
	public static void addFuels() {
		// Set up fuel. Only wooden doors can be used as fuel. Nether wood excluded.
		for (Item item : Registry.ITEM.stream().toList()) {
			if (item instanceof TallDoorItem || item instanceof ShortDoorItem) {
				if (((BlockItem)item).getBlock().defaultBlockState().getMaterial() == Material.WOOD && !item.getDefaultInstance().is(ItemTags.NON_FLAMMABLE_WOOD)) {
					FuelRegistry.INSTANCE.add(item, 300);
				}
			}
		}
	}
}
