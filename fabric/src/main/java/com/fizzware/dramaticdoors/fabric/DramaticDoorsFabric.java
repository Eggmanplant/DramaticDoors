package com.fizzware.dramaticdoors.fabric;

import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.Compats;
import net.fabricmc.api.ModInitializer;

public class DramaticDoorsFabric implements ModInitializer
{
	@Override
	public void onInitialize() {
		// Hook up systems.
		Compats.modChecker = FabricUtils.INSTANCE;
		
		// Register stuff.
		DDRegistry.registerTabs(FabricUtils.INSTANCE);
		Compats.registerCompats(FabricUtils.INSTANCE);
		DDFabricRegistry.registerBlocksItems();
		DDFabricRegistry.registerBlockEntities();
		DDFabricRegistry.registerFuels();
	}
}
