package com.fizzware.dramaticdoors.client;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;
import com.google.common.collect.ImmutableList;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import oshi.util.tuples.Pair;

public class RenderHandler implements ClientModInitializer
{
	public static final ImmutableList<String> TRANSLUCENT_DOORS = ImmutableList.of(DDNames.SHORT_BYG_EMBUR, DDNames.SHORT_BYG_ETHER, DDNames.SHORT_BYG_MAPLE, DDNames.SHORT_BYG_REDWOOD, DDNames.SHORT_BYG_SKYRIS, DDNames.SHORT_BYG_SOUL_SHROOM, DDNames.SHORT_BOP_MAGIC, DDNames.TALL_BYG_EMBUR, DDNames.TALL_BYG_ETHER, DDNames.TALL_BYG_MAPLE, DDNames.TALL_BYG_REDWOOD, DDNames.TALL_BYG_SKYRIS, DDNames.TALL_BYG_SOUL_SHROOM, DDNames.TALL_BOP_MAGIC);
	
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.SHORT_IRON_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.SHORT_OAK_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.SHORT_SPRUCE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.SHORT_BIRCH_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.SHORT_JUNGLE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.SHORT_ACACIA_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.SHORT_DARK_OAK_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.SHORT_MANGROVE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.SHORT_BAMBOO_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.SHORT_CHERRY_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.SHORT_CRIMSON_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.SHORT_WARPED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_IRON_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_OAK_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_SPRUCE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BIRCH_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_JUNGLE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_ACACIA_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_DARK_OAK_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MANGROVE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BAMBOO_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHERRY_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CRIMSON_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_WARPED_DOOR, RenderType.cutout());
		
		for (Pair<String, Block> pair : DDCompatRegistry.DOOR_BLOCKS_TO_REGISTER) {
			if (TRANSLUCENT_DOORS.contains(pair.getA())) {
				BlockRenderLayerMap.INSTANCE.putBlock(pair.getB(), RenderType.translucent());
			}
			else {
				BlockRenderLayerMap.INSTANCE.putBlock(pair.getB(), RenderType.cutout());
			}
		}
	}
}
