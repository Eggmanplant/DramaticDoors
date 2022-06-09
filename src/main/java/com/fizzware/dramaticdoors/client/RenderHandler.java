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
	}
}
