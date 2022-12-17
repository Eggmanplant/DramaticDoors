package com.fizzware.dramaticdoors.client;

import com.fizzware.dramaticdoors.blocks.DDBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ClientRenderer
{
	public static void setRenderers() {
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_IRON_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_OAK_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_SPRUCE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BIRCH_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_JUNGLE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_ACACIA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_DARK_OAK_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CRIMSON_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_WARPED_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MANGROVE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BAMBOO_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BOP_CHERRY_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BOP_DEAD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BOP_FIR_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BOP_HELLBARK_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BOP_JACARANDA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BOP_MAGIC_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BOP_MAHOGANY_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BOP_PALM_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BOP_REDWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BOP_UMBRAN_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BOP_WILLOW_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_ASPEN_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_BAOBAB_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_BLUE_ENCHANTED_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_BULBIS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_CHERRY_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_CIKA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_CYPRESS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_EBONY_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_EMBUR_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_ETHER_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_FIR_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_FLORUS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_GREEN_ENCHANTED_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_HOLLY_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_IMPARIUS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_IRONWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_JACARANDA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_LAMENT_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_MAHOGANY_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_MAPLE_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_NIGHTSHADE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_PALM_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_PINE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_RAINBOW_EUCALYPTUS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_REDWOOD_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_SKYRIS_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_SOUL_SHROOM_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_SYTHIAN_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_WHITE_MANGROVE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_WILLOW_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_WITCH_HAZEL_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BYG_ZELKOVA_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BS_BLUEBRIGHT_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BS_CHERRY_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BS_CRYSTALLIZED_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BS_DUSK_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BS_FROSTBRIGHT_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BS_LUNAR_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BS_MAPLE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BS_STARLIT_DOOR.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_ARAUCARIA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_HEIDIPHYLLUM_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_LIRIODENDRITES_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_METASEQUOIA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_PROTOJUNIPEROXYLON_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_PROTOPICEOXYLON_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_ZAMITES_DOOR.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CANOPY_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_DARKWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_TWILIGHT_MANGROVE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MINEWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_SORTINGWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_TIMEWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_TRANSWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_TWILIGHT_OAK_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_TOWERWOOD_DOOR.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_ASPEN_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_GRIMWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_KOUSA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MORADO_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_ROSEWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_YUCCA_DOOR.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MAPLE_DOOR.get(), RenderType.cutout());
				
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_HONEYCOMB_DOOR.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_AZALEA_DOOR.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_POISE_DOOR.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHERRY_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_WILLOW_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_WISTERIA_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_DRIFTWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_RIVER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_GLASS_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_TOOTH_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_JACARANDA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_REDBUD_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CYPRESS_DOOR.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BROWN_MUSHROOM_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_RED_MUSHROOM_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_GLOWSHROOM_DOOR.get(), RenderType.translucent());
		
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_TWISTED_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_ARCHWOOD_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_FLESH_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BM_ANCIENT_OAK_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BM_BLIGHTED_BALSA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BM_SWAMP_CYPRESS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BM_WILLOW_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BP_BAMBOO_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BP_MUSHROOM_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BP_COPPER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BP_GOLDEN_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BP_DIAMOND_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BP_EMERALD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BP_NETHERITE_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_WALNUT_DOOR.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CEILTRUNK_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_LUZAWOOD_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_STEEL_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_LOCKED_STEEL_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_ANDESITE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BRASS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_COPPER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_ZINC_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_LOCKED_ANDESITE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_LOCKED_BRASS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_LOCKED_COPPER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_LOCKED_ZINC_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CO_COPPER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CO_EXPOSED_COPPER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CO_WEATHERED_COPPER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CO_OXIDIZED_COPPER_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_PETRIFIED_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CARDBOARD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHAIN_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_INDUSTRIAL_IRON_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_IRON_BAR_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_PADDED_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_RUSTY_IRON_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_RUSTY_SHEET_METAL_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_SHEET_METAL_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_ECO_AZALEA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_ECO_FLOWERING_AZALEA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_ECO_COCONUT_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_ECO_WALNUT_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_ARCANE_GOLD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHERRYWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_EDELWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_FUNGYSS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MYSTERYWOOD_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_EBONY_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_PREAM_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CERULEAN_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_SELDGE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_STALK_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_VERDANT_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_FAIRY_RING_MUSHROOM_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_HEXEREI_MAHOGANY_DOOR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_HEXEREI_WILLOW_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MENRIL_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_RUNEWOOD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_SOULWOOD_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_JABOTICABA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_RAMBOUTAN_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_FIR_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_AZURE_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_POKECUBE_AGED_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_POKECUBE_CONCRETE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_POKECUBE_CORRUPTED_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_POKECUBE_DISTORTIC_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_POKECUBE_ENIGMA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_POKECUBE_INVERTED_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_POKECUBE_LEPPA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_POKECUBE_MIRAGE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_POKECUBE_NANAB_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_POKECUBE_ORAN_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_POKECUBE_PECHA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_POKECUBE_SITRUS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_POKECUBE_TEMPORAL_DOOR.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_PW_MAGIC_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_PW_MAPLE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_PW_PURPLE_HEART_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_PW_SILVERBELL_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_PW_TIGER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_PW_WILLOW_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_QUARK_AZALEA_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_QUARK_BLOSSOM_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_GINGERBREAD_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_GOLD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_SILVER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_LEAD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_NETHERITE_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_BLOODSHROOM_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_GREENHEART_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_SKYROOT_DOOR.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_TWIGS_BAMBOO_DOOR.get(), RenderType.cutout());
				
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_GRONGLE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_SMOGSTEM_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_WIGGLEWOOD_DOOR.get(), RenderType.cutout());

		// Set up rendering for all the Chipped doors.
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_OAK_DOOR_01.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_OAK_DOOR_02.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_OAK_DOOR_03.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_OAK_DOOR_04.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_OAK_DOOR_05.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_OAK_DOOR_06.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_OAK_DOOR_07.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_OAK_DOOR_08.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_OAK_DOOR_09.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_OAK_DOOR_10.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_OAK_DOOR_11.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_OAK_DOOR_12.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_OAK_DOOR_13.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_OAK_DOOR_14.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_OAK_DOOR_15.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_OAK_DOOR_16.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_OAK_DOOR_17.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_OAK_DOOR_18.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_OAK_DOOR_19.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_OAK_DOOR_20.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_01.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_02.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_03.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_04.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_05.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_06.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_07.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_08.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_09.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_10.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_11.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_12.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_13.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_14.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_15.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_16.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_17.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_18.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_19.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_20.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_01.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_02.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_03.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_04.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_05.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_06.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_07.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_08.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_09.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_10.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_11.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_12.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_13.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_14.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_15.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_16.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_17.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_18.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_19.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_20.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_01.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_02.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_03.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_04.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_05.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_06.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_07.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_08.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_09.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_10.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_11.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_12.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_13.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_14.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_15.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_16.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_17.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_18.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_19.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_20.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_01.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_02.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_03.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_04.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_05.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_06.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_07.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_08.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_09.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_10.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_11.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_12.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_13.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_14.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_15.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_16.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_17.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_18.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_19.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_20.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_01.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_02.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_03.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_04.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_05.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_06.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_07.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_08.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_09.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_10.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_11.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_12.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_13.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_14.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_15.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_16.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_17.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_18.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_19.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_20.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_01.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_02.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_03.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_04.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_05.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_06.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_07.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_08.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_09.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_10.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_11.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_12.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_13.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_14.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_15.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_16.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_17.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_18.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_19.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_20.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_WARPED_DOOR_01.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_WARPED_DOOR_02.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_WARPED_DOOR_03.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_WARPED_DOOR_04.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_WARPED_DOOR_05.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_WARPED_DOOR_06.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_WARPED_DOOR_07.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_WARPED_DOOR_08.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_WARPED_DOOR_09.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_WARPED_DOOR_10.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_WARPED_DOOR_11.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_WARPED_DOOR_12.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_WARPED_DOOR_13.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_WARPED_DOOR_14.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_WARPED_DOOR_15.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_WARPED_DOOR_16.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_WARPED_DOOR_17.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_WARPED_DOOR_18.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_WARPED_DOOR_19.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_CHIPPED_WARPED_DOOR_20.get(), RenderType.cutout());
		
		// Set up rendering for all the Macaw doors.
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_JAIL_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_METAL_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_METAL_HOSPITAL_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_METAL_REINFORCED_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_METAL_WARNING_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_METAL_WINDOWED_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_ACACIA_BARN_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_BIRCH_BARN_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_CRIMSON_BARN_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_DARK_OAK_BARN_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_JUNGLE_BARN_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_OAK_BARN_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_SPRUCE_BARN_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_WARPED_BARN_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_ACACIA_BARN_GLASS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_BIRCH_BARN_GLASS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_CRIMSON_BARN_GLASS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_DARK_OAK_BARN_GLASS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_JUNGLE_BARN_GLASS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_OAK_BARN_GLASS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_SPRUCE_BARN_GLASS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_WARPED_BARN_GLASS_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_ACACIA_STABLE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_BIRCH_STABLE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_CRIMSON_STABLE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_DARK_OAK_STABLE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_JUNGLE_STABLE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_OAK_STABLE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_SPRUCE_STABLE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_WARPED_STABLE_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_ACACIA_STABLE_HEAD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_BIRCH_STABLE_HEAD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_CRIMSON_STABLE_HEAD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_DARK_OAK_STABLE_HEAD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_JUNGLE_STABLE_HEAD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_OAK_STABLE_HEAD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_SPRUCE_STABLE_HEAD_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_WARPED_STABLE_HEAD_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_ACACIA_GLASS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_BIRCH_GLASS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_CRIMSON_GLASS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_DARK_OAK_GLASS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_JUNGLE_GLASS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_OAK_GLASS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_SPRUCE_GLASS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_WARPED_GLASS_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_ACACIA_BARK_GLASS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_BIRCH_BARK_GLASS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_CRIMSON_STEM_GLASS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_DARK_OAK_BARK_GLASS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_JUNGLE_BARK_GLASS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_OAK_BARK_GLASS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_SPRUCE_BARK_GLASS_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_WARPED_STEM_GLASS_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_ACACIA_MODERN_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_BIRCH_MODERN_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_CRIMSON_MODERN_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_DARK_OAK_MODERN_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_JUNGLE_MODERN_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_OAK_MODERN_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_SPRUCE_MODERN_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_WARPED_MODERN_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_ACACIA_CLASSIC_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_BIRCH_CLASSIC_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_CRIMSON_CLASSIC_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_DARK_OAK_CLASSIC_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_JUNGLE_CLASSIC_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_SPRUCE_CLASSIC_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_WARPED_CLASSIC_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_ACACIA_COTTAGE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_BIRCH_COTTAGE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_CRIMSON_COTTAGE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_DARK_OAK_COTTAGE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_JUNGLE_COTTAGE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_OAK_COTTAGE_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_WARPED_COTTAGE_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_ACACIA_PAPER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_CRIMSON_PAPER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_DARK_OAK_PAPER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_JUNGLE_PAPER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_OAK_PAPER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_SPRUCE_PAPER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_WARPED_PAPER_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_ACACIA_BEACH_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_BIRCH_BEACH_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_CRIMSON_BEACH_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_DARK_OAK_BEACH_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_OAK_BEACH_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_SPRUCE_BEACH_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_WARPED_BEACH_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_BIRCH_TROPICAL_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_CRIMSON_TROPICAL_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_DARK_OAK_TROPICAL_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_JUNGLE_TROPICAL_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_OAK_TROPICAL_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_SPRUCE_TROPICAL_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_WARPED_TROPICAL_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_ACACIA_FOUR_PANEL_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_BIRCH_FOUR_PANEL_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_CRIMSON_FOUR_PANEL_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_JUNGLE_FOUR_PANEL_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_OAK_FOUR_PANEL_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_SPRUCE_FOUR_PANEL_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_WARPED_FOUR_PANEL_DOOR.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_ACACIA_SWAMP_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_BIRCH_SWAMP_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_CRIMSON_SWAMP_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_DARK_OAK_SWAMP_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_JUNGLE_SWAMP_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_OAK_SWAMP_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_SPRUCE_SWAMP_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_WARPED_SWAMP_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_ACACIA_NETHER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_BIRCH_NETHER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_DARK_OAK_NETHER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_JUNGLE_NETHER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_OAK_NETHER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_SPRUCE_NETHER_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_WARPED_NETHER_DOOR.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_ACACIA_MYSTIC_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_BIRCH_MYSTIC_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_CRIMSON_MYSTIC_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_DARK_OAK_MYSTIC_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_JUNGLE_MYSTIC_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_OAK_MYSTIC_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DDBlocks.TALL_MACAW_SPRUCE_MYSTIC_DOOR.get(), RenderType.cutout());
	}
}