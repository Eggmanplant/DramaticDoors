package com.fizzware.dramaticdoors.neoforge.datagen;

import com.fizzware.dramaticdoors.DramaticDoors;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@Mod.EventBusSubscriber(modid = DramaticDoors.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DramaticDoorsDataGenerators {
    private DramaticDoorsDataGenerators() {}

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        PackOutput output = gen.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        gen.addProvider(true, new DDBlockStateProvider(output, existingFileHelper));
        gen.addProvider(true, new DDItemModelProvider(output, existingFileHelper));
        //gen.addProvider(true, new DDLootTableProvider(output, BuiltInLootTables.all(), List.of(new LootTableProvider.SubProviderEntry(DDBlockLoot::new, LootContextParamSets.BLOCK))));
    }
}