package com.fizzware.dramaticdoors.fabric;

import java.util.function.Supplier;

import org.jetbrains.annotations.Nullable;

import com.fizzware.dramaticdoors.compat.CompatChecker;
import com.fizzware.dramaticdoors.fabric.client.DDCreativeTab;
import com.fizzware.dramaticdoors.items.ModdedTab;

import net.fabricmc.fabric.impl.item.group.ItemGroupExtensions;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class FabricUtils implements CompatChecker, ModdedTab
{
	public static final FabricUtils INSTANCE = new FabricUtils();
	
	@Override
	public boolean isModLoaded(String modid) {
		return FabricLoader.getInstance().isModLoaded(modid);
	}
	
	@Override
	public CreativeModeTab createTab(String tabname, Supplier<ItemStack> supplier, @Nullable String modid) {
		if (modid != null) {
			if (!isModLoaded(modid)) {
				return null;
			}
			((ItemGroupExtensions) CreativeModeTab.TAB_BUILDING_BLOCKS).fabric_expandArray();
			return new DDCreativeTab(tabname, supplier);
		}
		else {
			((ItemGroupExtensions) CreativeModeTab.TAB_BUILDING_BLOCKS).fabric_expandArray();
			return new DDCreativeTab(tabname, supplier);
		}
	}
}
