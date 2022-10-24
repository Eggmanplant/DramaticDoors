package com.fizzware.dramaticdoors.client;

import com.fizzware.dramaticdoors.blocks.DDBlocks;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class RenderHandler implements ClientModInitializer
{
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_IRON_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_OAK_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_SPRUCE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BIRCH_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_JUNGLE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_ACACIA_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_DARK_OAK_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MANGROVE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CRIMSON_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_WARPED_DOOR, RenderLayer.getCutout());
		
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_ASPEN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_BAOBAB_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_BLUE_ENCHANTED_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_BULBIS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_CHERRY_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_CIKA_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_CYPRESS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_EBONY_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_EMBUR_DOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_ETHER_DOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_FIR_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_FLORUS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_GREEN_ENCHANTED_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_HOLLY_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_IMPARIUS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_IRONWOOD_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_JACARANDA_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_LAMENT_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_MAHOGANY_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_MAPLE_DOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_NIGHTSHADE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_PALM_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_PINE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_RAINBOW_EUCALYPTUS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_REDWOOD_DOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_SKYRIS_DOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_SOUL_SHROOM_DOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_SYTHIAN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_WHITE_MANGROVE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_WILLOW_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_WITCH_HAZEL_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_ZELKOVA_DOOR, RenderLayer.getCutout());
		
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_AERONOS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_GLACIAN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_STROPHAR_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_STEEL_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_TWISTED_DOOR, RenderLayer.getCutout());
		
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BLOCKUS_BAMBOO_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BLOCKUS_BLACKSTONE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BLOCKUS_CHARRED_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BLOCKUS_OBSIDIAN_REINFORCED_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BLOCKUS_PAPER_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BLOCKUS_STONE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BLOCKUS_WHITE_OAK_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CYPRESS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_DRAGONS_BLOOD_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_ELDER_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_JUNIPER_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_ANCIENT_OAK_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BLIGHTED_BALSA_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_SWAMP_CYPRESS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_WILLOW_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CEILTRUNK_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_LUZAWOOD_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHARM_AZALEA_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHARM_EBONY_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_ECO_AZALEA_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_ECO_FLOWERING_AZALEA_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_ECO_COCONUT_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_ECO_WALNUT_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_IRON_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_OAK_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_SPRUCE_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BIRCH_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_JUNGLE_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_ACACIA_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_DARK_OAK_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MANGROVE_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CRIMSON_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_WARPED_GLASS_DOOR, RenderLayer.getCutout());
		
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BLOODSHROOM_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_GREENHEART_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_SKYROOT_DOOR, RenderLayer.getCutout());
		
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_PROMENADE_CHERRY_OAK_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_PROMENADE_DARK_AMARANTH_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_PROMENADE_PALM_DOOR, RenderLayer.getCutout());
		
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_GINGERBREAD_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_GOLD_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_NETHERITE_DOOR, RenderLayer.getCutout());
		
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_RUBBER_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_TRAVERSE_FIR_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_STRIPPED_BAMBOO_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CANOPY_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_DARKWOOD_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MINEWOOD_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_SORTINGWOOD_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_TIMEWOOD_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_TRANSWOOD_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_TWILIGHT_OAK_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_TWILIGHT_MANGROVE_DOOR, RenderLayer.getCutout());
		
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_SOUL_COPPER_DOOR, RenderLayer.getCutout());
		
		// Set up rendering for all the Macaw doors.
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_JAIL_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_METAL_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_METAL_HOSPITAL_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_METAL_REINFORCED_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_METAL_WARNING_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_METAL_WINDOWED_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_ACACIA_BARN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BIRCH_BARN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_CRIMSON_BARN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_DARK_OAK_BARN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_JUNGLE_BARN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_MANGROVE_BARN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_OAK_BARN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_SPRUCE_BARN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_WARPED_BARN_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_ACACIA_BARN_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BIRCH_BARN_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_CRIMSON_BARN_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_DARK_OAK_BARN_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_JUNGLE_BARN_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_MANGROVE_BARN_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_OAK_BARN_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_SPRUCE_BARN_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_WARPED_BARN_GLASS_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_ACACIA_STABLE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BIRCH_STABLE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_CRIMSON_STABLE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_DARK_OAK_STABLE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_JUNGLE_STABLE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_MANGROVE_STABLE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_OAK_STABLE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_SPRUCE_STABLE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_WARPED_STABLE_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_ACACIA_STABLE_HEAD_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BIRCH_STABLE_HEAD_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_CRIMSON_STABLE_HEAD_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_DARK_OAK_STABLE_HEAD_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_JUNGLE_STABLE_HEAD_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_MANGROVE_STABLE_HEAD_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_OAK_STABLE_HEAD_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_SPRUCE_STABLE_HEAD_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_WARPED_STABLE_HEAD_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_ACACIA_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BIRCH_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_CRIMSON_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_DARK_OAK_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_JUNGLE_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_MANGROVE_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_OAK_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_SPRUCE_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_WARPED_GLASS_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_ACACIA_BARK_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BIRCH_BARK_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_CRIMSON_STEM_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_DARK_OAK_BARK_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_JUNGLE_BARK_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_MANGROVE_BARK_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_OAK_BARK_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_SPRUCE_BARK_GLASS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_WARPED_STEM_GLASS_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_ACACIA_MODERN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BIRCH_MODERN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_CRIMSON_MODERN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_DARK_OAK_MODERN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_JUNGLE_MODERN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_MANGROVE_MODERN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_OAK_MODERN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_SPRUCE_MODERN_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_WARPED_MODERN_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_ACACIA_CLASSIC_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BIRCH_CLASSIC_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_CRIMSON_CLASSIC_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_DARK_OAK_CLASSIC_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_JUNGLE_CLASSIC_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_MANGROVE_CLASSIC_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_SPRUCE_CLASSIC_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_WARPED_CLASSIC_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_ACACIA_COTTAGE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BIRCH_COTTAGE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_CRIMSON_COTTAGE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_DARK_OAK_COTTAGE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_MANGROVE_COTTAGE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_JUNGLE_COTTAGE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_OAK_COTTAGE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_WARPED_COTTAGE_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_ACACIA_PAPER_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_CRIMSON_PAPER_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_DARK_OAK_PAPER_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_JUNGLE_PAPER_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_MANGROVE_PAPER_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_OAK_PAPER_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_SPRUCE_PAPER_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_WARPED_PAPER_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_ACACIA_BEACH_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BIRCH_BEACH_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_CRIMSON_BEACH_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_DARK_OAK_BEACH_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_MANGROVE_BEACH_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_OAK_BEACH_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_SPRUCE_BEACH_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_WARPED_BEACH_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BIRCH_TROPICAL_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_CRIMSON_TROPICAL_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_DARK_OAK_TROPICAL_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_JUNGLE_TROPICAL_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_MANGROVE_TROPICAL_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_OAK_TROPICAL_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_SPRUCE_TROPICAL_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_WARPED_TROPICAL_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_ACACIA_FOUR_PANEL_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BIRCH_FOUR_PANEL_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_CRIMSON_FOUR_PANEL_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_JUNGLE_FOUR_PANEL_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_MANGROVE_FOUR_PANEL_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_OAK_FOUR_PANEL_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_SPRUCE_FOUR_PANEL_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_WARPED_FOUR_PANEL_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_ACACIA_SWAMP_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BIRCH_SWAMP_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_CRIMSON_SWAMP_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_DARK_OAK_SWAMP_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_JUNGLE_SWAMP_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_OAK_SWAMP_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_SPRUCE_SWAMP_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_WARPED_SWAMP_DOOR, RenderLayer.getCutout());
		
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_ACACIA_NETHER_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BIRCH_NETHER_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_DARK_OAK_NETHER_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_JUNGLE_NETHER_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_MANGROVE_NETHER_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_OAK_NETHER_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_SPRUCE_NETHER_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_WARPED_NETHER_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_ACACIA_MYSTIC_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BIRCH_MYSTIC_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_CRIMSON_MYSTIC_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_DARK_OAK_MYSTIC_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_JUNGLE_MYSTIC_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_MANGROVE_MYSTIC_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_OAK_MYSTIC_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_SPRUCE_MYSTIC_DOOR, RenderLayer.getCutout());
	}
}
