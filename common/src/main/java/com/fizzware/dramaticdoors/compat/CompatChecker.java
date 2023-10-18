package com.fizzware.dramaticdoors.compat;

public interface CompatChecker
{
	default boolean isModLoaded(String modid) {
		return false;
	}
	
	default boolean isDev() {
		return false;
	}
	
	default boolean isQuarkModuleEnabled() {
		return false;
	}
}
