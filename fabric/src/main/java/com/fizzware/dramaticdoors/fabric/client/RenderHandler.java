package com.fizzware.dramaticdoors.fabric.client;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
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
		for (Pair<String, Block> pair : DDRegistry.DOOR_BLOCKS_TO_REGISTER) {
			if (TRANSLUCENT_DOORS.contains(pair.getA())) {
				BlockRenderLayerMap.INSTANCE.putBlock(pair.getB(), RenderType.translucent());
			}
			else {
				BlockRenderLayerMap.INSTANCE.putBlock(pair.getB(), RenderType.cutout());
			}
		}
	}
}
