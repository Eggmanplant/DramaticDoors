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
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CRIMSON_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_WARPED_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CYPRESS_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_DRAGONS_BLOOD_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_ELDER_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_JUNIPER_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CEILTRUNK_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_LUZAWOOD_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_ECO_AZALEA_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_ECO_FLOWERING_AZALEA_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_ECO_COCONUT_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_ECO_WALNUT_DOOR, RenderLayer.getCutout());

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
