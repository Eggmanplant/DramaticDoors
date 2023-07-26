package com.fizzware.dramaticdoors.compat;

import net.fabricmc.loader.api.FabricLoader;

public class Compats
{
	public static final boolean COUPLINGS_INSTALLED;
	public static final boolean DOUBLE_DOORS_INSTALLED;
	
    static {
    	COUPLINGS_INSTALLED = FabricLoader.getInstance().isModLoaded("couplings");
    	DOUBLE_DOORS_INSTALLED = FabricLoader.getInstance().isModLoaded("doubledoors") || FabricLoader.getInstance().isModLoaded("doubledoors-fabric");
    }
}
