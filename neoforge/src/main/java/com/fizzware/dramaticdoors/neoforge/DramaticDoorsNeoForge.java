package com.fizzware.dramaticdoors.neoforge;

import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.compat.Compats;
import com.fizzware.dramaticdoors.neoforge.client.RenderHandler;
import com.fizzware.dramaticdoors.neoforge.compat.AutomaticDoorCompat;
import com.fizzware.dramaticdoors.neoforge.compat.QuarkDoubleDoorCompat;
import com.fizzware.dramaticdoors.neoforge.config.DDConfigForge;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.javafmlmod.FMLJavaModLoadingContext;
import net.neoforged.fml.loading.FMLEnvironment;
import net.neoforged.neoforge.common.NeoForge;

@Mod(DramaticDoors.MOD_ID)
public class DramaticDoorsNeoForge
{
    public DramaticDoorsNeoForge() {
    	if (NeoforgeUtils.INSTANCE.isModLoaded("fastworkbench")) { // Let Fabric side take over if Sinytra Connector is installed.
    		throw new IllegalAccessError("Fast Workbench is not supported.");
    	}
    	if (NeoforgeUtils.INSTANCE.isModLoaded("connector")) { // Let Fabric side take over if Sinytra Connector is installed.
    		return;
    	}
    	// Please let this be a normal field trip.
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus(); 
    	
    	// With the Mr. Fizzware? No freakin' way! Register events for the Magic Forge Bus to take them on an extraordinary trip.
    	Compats.modChecker = NeoforgeUtils.INSTANCE;
    	ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, DDConfigForge.CONFIG);
    	bus.register(DDForgeRegistry.class);
    	bus.register(NeoforgeUtils.class);
    	
        bus.addListener(this::setupCommon);
        if (FMLEnvironment.dist == Dist.CLIENT) { bus.addListener(this::setupClient); }

        NeoForge.EVENT_BUS.register(this);
    }

    private void setupCommon(final FMLCommonSetupEvent event) {
    	if (Compats.AUTOMATIC_DOORS_INSTALLED) {
    		NeoForge.EVENT_BUS.register(new AutomaticDoorCompat());
    	}
    	if (Compats.QUARK_INSTALLED) {
    		NeoForge.EVENT_BUS.register(new QuarkDoubleDoorCompat());
    	}
    }
    
    private void setupClient(final FMLClientSetupEvent event) {
    	RenderHandler.onInitializeClient();
    }
}
