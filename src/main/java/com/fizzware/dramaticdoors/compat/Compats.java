package com.fizzware.dramaticdoors.compat;

import net.fabricmc.loader.api.FabricLoader;

public class Compats
{
	public static final boolean DOUBLE_DOORS_INSTALLED;
	
    static {
    	DOUBLE_DOORS_INSTALLED = FabricLoader.getInstance().isModLoaded("doubledoors-fabric");
    }
}
