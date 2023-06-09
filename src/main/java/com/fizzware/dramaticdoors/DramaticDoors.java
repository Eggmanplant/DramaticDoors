package com.fizzware.dramaticdoors;

import com.fizzware.dramaticdoors.blockentities.DDBlockEntities;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.client.ClientRenderer;
import com.fizzware.dramaticdoors.compat.AutomaticDoorCompat;
import com.fizzware.dramaticdoors.compat.Compats;
import com.fizzware.dramaticdoors.compat.QuarkCompat;
import com.fizzware.dramaticdoors.compat.registries.DDBiomePackRegistry;
import com.fizzware.dramaticdoors.compat.registries.DDChippedRegistry;
import com.fizzware.dramaticdoors.compat.registries.DDDimensionalPackRegistry;
import com.fizzware.dramaticdoors.compat.registries.DDMacawsDoorsRegistry;
import com.fizzware.dramaticdoors.compat.registries.DDMagicPackRegistry;
import com.fizzware.dramaticdoors.compat.registries.DDManyIdeasDoorsRegistry;
import com.fizzware.dramaticdoors.compat.registries.DDMiscPackRegistry;
import com.fizzware.dramaticdoors.compat.registries.DDTechPackRegistry;
import com.fizzware.dramaticdoors.compat.registries.DDVanillaesquePackRegistry;
import com.fizzware.dramaticdoors.items.DDItems;
import com.google.common.collect.ImmutableList;

import net.minecraft.SharedConstants;
import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.AddPackFindersEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;
import net.minecraftforge.resource.PathPackResources;
import oshi.util.tuples.Quartet;

@Mod("dramaticdoors")
public class DramaticDoors
{
    public static final String MOD_ID = "dramaticdoors";

    public DramaticDoors() {
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus(); // Please let this be a normal field trip.
    	
    	// With the Mr. Fizzware? No freakin' way! Register events for the Magic Forge Bus to take them on an extraordinary trip.
    	DDBlocks.BLOCKS.register(bus);
    	DDItems.ITEMS.register(bus);
    	bus.register(DDItems.class);
    	ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, DDConfig.CONFIG);
    	
        bus.addListener(this::setupCommon);
        if (FMLEnvironment.dist == Dist.CLIENT) { bus.addListener(this::setupClient); }

        MinecraftForge.EVENT_BUS.register(this);
        
        // Hook in the compats.
        if (Compats.VANILLAESQUE_PACK_ENABLED.getValue()) {
        	bus.register(DDVanillaesquePackRegistry.class);
        	DDBlockEntities.BLOCK_ENTITIES.register(bus);
        }
        if (Compats.BIOME_PACK_ENABLED.getValue()) {
        	bus.register(DDBiomePackRegistry.class);
        }
        if (Compats.DIMENSIONAL_PACK_ENABLED.getValue()) {
        	bus.register(DDDimensionalPackRegistry.class);
        }
        if (Compats.MAGIC_PACK_ENABLED.getValue()) {
        	bus.register(DDMagicPackRegistry.class);
        }
        if (Compats.TECH_PACK_ENABLED.getValue()) {
        	bus.register(DDTechPackRegistry.class);
        }
        if (Compats.MISC_PACK_ENABLED.getValue()) {
        	bus.register(DDMiscPackRegistry.class);
        }
        if (Compats.CHIPPED_INSTALLED) {
        	bus.register(DDChippedRegistry.class);
        }
        if (Compats.MACAWS_DOORS_INSTALLED) {
        	bus.register(DDMacawsDoorsRegistry.class);
        }
        if (Compats.MANYIDEAS_DOORS_INSTALLED) {
        	bus.register(DDManyIdeasDoorsRegistry.class);
        }
    	/*if (Compats.STATEMENT_INSTALLED) { 
    		StatementCompat.implementWaterlogging(false);
    	}*/
    	bus.addListener(this::setupBuiltInDataPack);
    }

    private void setupCommon(final FMLCommonSetupEvent event) {
    	if (Compats.AUTOMATIC_DOORS_INSTALLED) {
    		MinecraftForge.EVENT_BUS.register(new AutomaticDoorCompat());
    	}
    	if (Compats.QUARK_INSTALLED) {
    		MinecraftForge.EVENT_BUS.register(new QuarkCompat());
    	}
    }
    
    private void setupClient(final FMLClientSetupEvent event) {
    	ClientRenderer.setRenderers();
    }

    /*public static final CreativeModeTab MAIN_TAB = CreativeModeTab.builder(Row.TOP "dramaticdoors") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(DDItems.TALL_OAK_DOOR.get());
		}
    };
    
    public static final CreativeModeTab CHIPPED_TAB = Compats.CHIPPED_INSTALLED ? CreativeModeTab.builder("dramaticdoors_chipped") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(DDItems.TALL_CHIPPED_BIRCH_DOOR_07.get());
		}
    } : null;
    
    public static final CreativeModeTab MACAW_TAB = Compats.MACAWS_DOORS_INSTALLED ? CreativeModeTab.builder("dramaticdoors_macaw") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(DDItems.TALL_MACAW_DARK_OAK_BARN_DOOR.get());
		}
    } : null;*/

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {}
    
    private void setupBuiltInDataPack(final AddPackFindersEvent event) {
    	// Declare variables and bundle them in an immutable list.
    	var packVanilla = new Quartet<>("vanillaesque", Compats.VANILLAESQUE_PACK_ENABLED.getValue(), "datapacks/dd_vanillaesque_compatpack", "DD - Vanillaesque Pack");
    	var packBiome = new Quartet<>("biome", Compats.BIOME_PACK_ENABLED.getValue(), "datapacks/dd_biomes_compatpack", "DD - Biome Pack");
    	var packDim = new Quartet<>("dimensional", Compats.DIMENSIONAL_PACK_ENABLED.getValue(), "datapacks/dd_dimensions_compatpack", "DD - Dimensional Pack");
    	var packMagic = new Quartet<>("magic", Compats.MAGIC_PACK_ENABLED.getValue(), "datapacks/dd_magic_compatpack", "DD - Magic Pack");
    	var packTech = new Quartet<>("tech", Compats.TECH_PACK_ENABLED.getValue(), "datapacks/dd_tech_compatpack", "DD - Tech Pack");
    	var packMisc = new Quartet<>("misc", Compats.MISC_PACK_ENABLED.getValue(), "datapacks/dd_misc_compatpack", "DD - Misc Pack");
    	var pack1 = new Quartet<>("chipped", Compats.CHIPPED_INSTALLED, "datapacks/dd_chipped_compat", "DD - Chipped Compat");
    	var pack2 = new Quartet<>("macaw", Compats.MACAWS_DOORS_INSTALLED, "datapacks/dd_macaws_compat", "DD - Macaw's Doors Compat");
    	var pack3 = new Quartet<>("manyideas", Compats.MANYIDEAS_DOORS_INSTALLED, "datapacks/dd_manyideas_compat", "DD - ManyIdeas Doors Compat");
    	var packs = ImmutableList.of(packVanilla, packBiome, packDim, packMagic, packTech, packMisc, pack1, pack2, pack3);
    	// Iterate through the pack list and accordingly add packs.

    	if (event.getPackType() == PackType.SERVER_DATA) {
	    	for (Quartet<String, Boolean, String, String> packToCheck : packs) {
    			if (!packToCheck.getB()) {
    				continue;
    			}
        		var resourcePath = ModList.get().getModFileById(MOD_ID).getFile().findResource(packToCheck.getC());
        		var packInfo = new Pack.Info(Component.literal(packToCheck.getD()), SharedConstants.getCurrentVersion().getPackVersion(PackType.SERVER_DATA), SharedConstants.getCurrentVersion().getPackVersion(PackType.CLIENT_RESOURCES), FeatureFlagSet.of(), false);
        		var pack = Pack.create("builtin/dramaticdoors-" + packToCheck.getA(), Component.literal(packToCheck.getD()), true, (path) -> new PathPackResources(path, true, resourcePath), packInfo, PackType.SERVER_DATA, Pack.Position.BOTTOM, false, PackSource.BUILT_IN);
        		event.addRepositorySource((packConsumer) -> packConsumer.accept((Pack)pack));
	    	}
        }
    }
}
