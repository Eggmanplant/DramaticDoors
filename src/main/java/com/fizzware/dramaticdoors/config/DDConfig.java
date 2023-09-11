package com.fizzware.dramaticdoors.config;

import com.mojang.datafixers.util.Pair;

public class DDConfig
{
	private static ModConfigProvider configProvider;
	public static SimpleConfig CONFIG;
  
	public static void initializeConfigs() {
		configProvider = new ModConfigProvider();
		createConfigs();
		
		CONFIG = SimpleConfig.of("dramaticdoors-fabric").provider(configProvider).request();
		assignConfigs();
	}
	
	private static void createConfigs() {
		configProvider.addKeyValuePair(new Pair<>("dramaticdoors.waterloggable_doors", true), "Allows doors to be waterlogged. Enable to allow waterlogging, disable for compatibility with certain mods.");
		configProvider.addKeyValuePair(new Pair<>("dramaticdoors.waterloggable_fence_gates", true), "Allows fence gates to be waterlogged. Enable to allow waterlogging, disable for compatibility with certain mods.");
	}
	
	private static void assignConfigs() {
		CONFIG.getOrDefault("dramaticdoors.waterloggable_doors", true);
		CONFIG.getOrDefault("dramaticdoors.waterloggable_fence_gates", true);
	}
}
