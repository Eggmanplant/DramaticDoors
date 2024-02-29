package com.fizzware.dramaticdoors.fabric;

import com.fizzware.dramaticdoors.compat.Compats;
import com.fizzware.dramaticdoors.fabric.compat.CreateFabricCompat;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;

public class DramaticDoorsFabric implements ModInitializer
{
	@Override
	public void onInitialize() {
		// Register stuff.
		Compats.modChecker = FabricUtils.INSTANCE;
		Compats.registerCompats(FabricUtils.INSTANCE);
		if (FabricLoader.getInstance().isModLoaded("create")) {
			CreateFabricCompat.registerCompat();
		}
		DDFabricRegistry.registerBlocksItems();
		DDFabricRegistry.registerBlockEntities();
		DDFabricRegistry.registerCreativeTabs();
		DDFabricRegistry.registerFuels();
		FabricUtils.assignItemsToTabs();
	}
}
