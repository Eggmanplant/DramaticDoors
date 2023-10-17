package com.fizzware.dramaticdoors.fabric.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DramaticDoorsDataGenerators implements DataGeneratorEntrypoint
{

	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		fabricDataGenerator.addProvider(DDModelProvider::new);
		fabricDataGenerator.addProvider(DDBlockLoot::new);
	}

}
