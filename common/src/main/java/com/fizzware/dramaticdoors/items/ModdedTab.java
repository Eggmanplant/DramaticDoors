package com.fizzware.dramaticdoors.items;

import java.util.function.Supplier;

import org.jetbrains.annotations.Nullable;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public interface ModdedTab
{
	default CreativeModeTab createTab(String tabname, Supplier<ItemStack> supplier, @Nullable String modid) {
		return null;
	}
}
