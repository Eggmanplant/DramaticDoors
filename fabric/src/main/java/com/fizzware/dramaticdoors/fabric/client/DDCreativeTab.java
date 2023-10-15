package com.fizzware.dramaticdoors.fabric.client;

import java.util.function.Supplier;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class DDCreativeTab extends CreativeModeTab
{
	private Supplier<ItemStack> iconSupplier;
	
	public DDCreativeTab(String string, Supplier<ItemStack> supplier) {
		super(CreativeModeTab.TABS.length - 1, string);
		this.iconSupplier = supplier;
	}

	@Override
	public ItemStack makeIcon() {
		return iconSupplier.get();
	}

}
