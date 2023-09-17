package com.fizzware.dramaticdoors.compat;

import com.fizzware.dramaticdoors.compat.registries.*;

import net.fabricmc.loader.api.FabricLoader;

public class Compats
{
	public static final boolean COUPLINGS_INSTALLED;
	public static final boolean DOUBLE_DOORS_INSTALLED;
    public static final boolean AUTOMATIC_DOORS_INSTALLED;
	public static final boolean BLUEPRINT_INSTALLED;
	public static final boolean WOODWORKS_INSTALLED;
	public static final boolean SUPPLEMENTARIES_INSTALLED;
    public static final boolean QUARK_INSTALLED;
	
    static {
    	COUPLINGS_INSTALLED = FabricLoader.getInstance().isModLoaded("couplings");
    	DOUBLE_DOORS_INSTALLED = FabricLoader.getInstance().isModLoaded("doubledoors");
    	AUTOMATIC_DOORS_INSTALLED = FabricLoader.getInstance().isModLoaded("automaticdoors");
    	BLUEPRINT_INSTALLED = FabricLoader.getInstance().isModLoaded("blueprint");
    	WOODWORKS_INSTALLED = FabricLoader.getInstance().isModLoaded("woodworks");
    	SUPPLEMENTARIES_INSTALLED = FabricLoader.getInstance().isModLoaded("supplementaries");
    	QUARK_INSTALLED = FabricLoader.getInstance().isModLoaded("quark");
    }
    
    public static void registerCompats() {
    	if (FabricLoader.getInstance().isModLoaded("blueprint")) {
    		AbnormalsCompat.registerCompat();
    	}
    	if (FabricLoader.getInstance().isModLoaded("abundant_atmosphere")) {
    		AbundantAtmosphereCompat.registerCompat();
    	}
    	if (FabricLoader.getInstance().isModLoaded("ad_astra")) {
    		AdAstraCompat.registerCompat();
    	}
		if (FabricLoader.getInstance().isModLoaded("aether")) {
			AetherCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("architects_palette")) {
			ArchitectsPaletteCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("bambooeverything")) {
			BambooEverythingCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("betterend")) {
			BetterEndCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("betternether")) {
			BetterNetherCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("bewitchment")) {
			BewitchmentCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("biomancy")) {
			BiomancyCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("biomemakeover")) {
			BiomeMakeoverCompat.registerCompat();
		}
    	if (FabricLoader.getInstance().isModLoaded("biomesoplenty")) {
    		BiomesOPlentyCompat.registerCompat();
    	}
		if (FabricLoader.getInstance().isModLoaded("blockus")) {
			BlockusCompat.registerCompat();
		}
    	if (FabricLoader.getInstance().isModLoaded("byg")) {
    		BYGCompat.registerCompat();
    	}
		if (FabricLoader.getInstance().isModLoaded("caupona")) {
			CauponaCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("ceilands")) {
			CeilandsCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("charm")) {
			CharmCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("cinderscapes")) {
			CinderscapesCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("cobblemon")) {
			CobblemonCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("colorfulazaleas")) {
			ColorfulAzaleasCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("copperoverhaul")) {
			CopperOverhaulCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("alloyed")) {
			CreateAlloyedCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("createdeco")) {
			CreateDecoCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("create_things_and_misc")) {
			CreateMiscThingsCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("darkerdepths")) {
			DarkerDepthsCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("deeperdarker")) {
			DeeperDarkerCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("dustrial_decor")) {
			DustrialDecorCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("ecologics")) {
			EcologicsCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("endlessbiomes")) {
			EndlessBiomesCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("enhanced_mushrooms")) {
			EnhancedMushroomsCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("phantasm")) {
			EndPhantasmCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("enlightened_end")) {
			EnlightenedEndCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("everythingcopper")) {
			EverythingCopperCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("extendedmushrooms")) {
			ExtendedMushroomsCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("fruittrees")) {
			FruitTreesCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("forbidden_arcanus")) {
			ForbiddenArcanusCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("gardens_of_the_dead")) {
			GardensOfTheDeadCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("goodending")) {
			GoodEndingCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("graveyard")) {
			GraveyardCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("hexcasting")) {
			HexcastingCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("hexerei")) {
			HexereiCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("horizons")) {
			HorizonsCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("integrateddynamics")) {
			IntegratedDynamicsCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("malum")) {
			MalumCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("modern_glass_doors")) {
			ModernGlassDoorsCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("ms")) {
			MoShizCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("morecraft")) {
			MorecraftCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("mysticsbiomes")) {
			MysticsBiomesCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("nethers_exoticism")) {
			NethersExoticismCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("newworld")) {
			NewWorldCompat.registerCompat();
		}
    	if (FabricLoader.getInstance().isModLoaded("pokecube")) {
    		PokecubeCompat.registerCompat();
    	}
    	if (FabricLoader.getInstance().isModLoaded("prehistoricfauna")) {
    		PrehistoricFaunaCompat.registerCompat();
    	}
    	if (FabricLoader.getInstance().isModLoaded("premium_wood")) {
    		PremiumWoodCompat.registerCompat();
    	}
    	if (FabricLoader.getInstance().isModLoaded("promenade")) {
    		PromenadeCompat.registerCompat();
    	}
    	if (FabricLoader.getInstance().isModLoaded("pyromancer")) {
    		PyromancerCompat.registerCompat();
    	}
    	if (FabricLoader.getInstance().isModLoaded("quark")) {
    		QuarkCompat.registerCompat();
    	}
    	if (FabricLoader.getInstance().isModLoaded("regions_unexplored")) {
    		RegionsUnexploredCompat.registerCompat();
    	}
		if (FabricLoader.getInstance().isModLoaded("silentgear")) {
			SilentGearCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("snowyspirit")) {
			SnowySpiritCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("supplementaries")) {
			SupplementariesCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("tconstruct")) {
			TinkersConstructCompat.registerCompat();
		}
    	if (FabricLoader.getInstance().isModLoaded("techreborn")) {
    		TechRebornCompat.registerCompat();
    	}
    	if (FabricLoader.getInstance().isModLoaded("terraqueous")) {
    		TerraqueousCompat.registerCompat();
    	}
    	if (FabricLoader.getInstance().isModLoaded("terrestria")) {
    		TerrestriaCompat.registerCompat();
    	}
    	if (FabricLoader.getInstance().isModLoaded("traverse")) {
    		TraverseCompat.registerCompat();
    	}
		if (FabricLoader.getInstance().isModLoaded("twigs")) {
			TwigsCompat.registerCompat();
		}
    	if (FabricLoader.getInstance().isModLoaded("twilightforest")) {
    		TwilightForestCompat.registerCompat();
    	}
		if (FabricLoader.getInstance().isModLoaded("undergarden")) {
			UndergardenCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("wilderwild")) {
			WilderWildCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("windswept")) {
			WindsweptCompat.registerCompat();
		}
		if (FabricLoader.getInstance().isModLoaded("xps_additions")) {
			XPSAdditionsCompat.registerCompat();
		}
    	if (FabricLoader.getInstance().isModLoaded("yippee")) {
    		YippeeCompat.registerCompat();
    	}
    	// Mods that add many doors, conditionally register them too.
    	if (FabricLoader.getInstance().isModLoaded("chipped")) {
    		ChippedCompat.registerCompat();
    	}
    	if (FabricLoader.getInstance().isModLoaded("mcwdoors")) {
    		MacawCompat.registerCompat();
    	}
    	if (FabricLoader.getInstance().isModLoaded("manyideas_doors")) {
    		ManyIdeasCompat.registerCompat();
    	}
    }
}
