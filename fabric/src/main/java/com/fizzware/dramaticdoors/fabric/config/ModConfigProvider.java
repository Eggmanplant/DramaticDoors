package com.fizzware.dramaticdoors.fabric.config;

import java.util.ArrayList;
import java.util.List;

import com.mojang.datafixers.util.Pair;

public class ModConfigProvider implements SimpleConfig.DefaultConfig
{

	private String configContents = "";

	public List<Pair<?, ?>> getConfigsList() {
		return configsList;
	}

	private final List<Pair<?, ?>> configsList = new ArrayList<>();

	public void addKeyValuePair(Pair<String, ?> keyValuePair, String comment) {
		configContents += "#" + comment + " | default: " + keyValuePair.getSecond() + "\n";
		configContents += keyValuePair.getFirst() + "=" + keyValuePair.getSecond() + "\n";
		configsList.add(keyValuePair);
	}

	@Override
	public String get(String namespace) {
		return configContents;
	}
}
