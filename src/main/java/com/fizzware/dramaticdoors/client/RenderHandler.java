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
		
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_ASPEN_DOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_BAOBAB_DOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_BLUE_ENCHANTED_DOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_BULBIS_DOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_CHERRY_DOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_CIKA_DOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_CYPRESS_DOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_EBONY_DOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_EMBUR_DOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_ETHER_DOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_FIR_DOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_FLORUS_DOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_GREEN_ENCHANTED_DOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_HOLLY_DOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_IMPARIUS_DOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_IRONWOOD_DOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_JACARANDA_DOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_LAMENT_DOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_MAHOGANY_DOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_MAPLE_DOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_NIGHTSHADE_DOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_PALM_DOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_PINE_DOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_RAINBOW_EUCALYPTUS_DOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_REDWOOD_DOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_SKYRIS_DOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_SOUL_SHROOM_DOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_SYTHIAN_DOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_WHITE_MANGROVE_DOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_WILLOW_DOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_WITCH_HAZEL_DOOR, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_ZELKOVA_DOOR, RenderLayer.getTranslucent());
		
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

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_ECO_AZALEA_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_ECO_FLOWERING_AZALEA_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_ECO_COCONUT_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_ECO_WALNUT_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_GINGERBREAD_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_GOLD_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_NETHERITE_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_STRIPPED_BAMBOO_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CANOPY_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_DARKWOOD_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MINEWOOD_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_SORTINGWOOD_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_TIMEWOOD_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_TRANSWOOD_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_TWILIGHT_OAK_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_TWILIGHT_MANGROVE_DOOR, RenderLayer.getCutout());
	}
}
