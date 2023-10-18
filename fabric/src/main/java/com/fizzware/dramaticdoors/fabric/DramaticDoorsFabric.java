package com.fizzware.dramaticdoors.fabric;

import com.fizzware.dramaticdoors.compat.Compats;

import net.fabricmc.api.ModInitializer;

public class DramaticDoorsFabric implements ModInitializer
{
	@Override
	public void onInitialize() {
		// Register stuff.
		Compats.modChecker = FabricUtils.INSTANCE;
		Compats.registerCompats(FabricUtils.INSTANCE);
		DDFabricRegistry.registerBlocksItems();
		DDFabricRegistry.registerBlockEntities();
		DDFabricRegistry.registerCreativeTabs();
		DDFabricRegistry.registerFuels();
		FabricUtils.assignItemsToTabs();
	}
}
