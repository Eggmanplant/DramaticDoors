package com.fizzware.dramaticdoors.fabric.client;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.fabric.FabricUtils;
import com.fizzware.dramaticdoors.fabric.addons.create.DDPartialModels;
import com.fizzware.dramaticdoors.fabric.addons.create.TallSlidingDoorBlockRenderer;
import com.fizzware.dramaticdoors.fabric.compat.CreateFabricCompat;
import com.google.common.collect.ImmutableList;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.world.level.block.Block;
import oshi.util.tuples.Pair;

public class RenderHandler implements ClientModInitializer
{
	public static final ImmutableList<String> TRANSLUCENT_DOORS = ImmutableList.of(DDNames.SHORT_BYG_EMBUR, DDNames.SHORT_BYG_ETHER, DDNames.SHORT_BYG_MAPLE, DDNames.SHORT_BYG_REDWOOD, DDNames.SHORT_BYG_SKYRIS, DDNames.SHORT_BYG_SOUL_SHROOM, DDNames.SHORT_MORECRAFT_GLASS, DDNames.SHORT_MORECRAFT_SOUL_GLASS,
			DDNames.SHORT_MS_GLASS, DDNames.SHORT_MS_SOUL_GLASS, DDNames.SHORT_MS_TINTED_GLASS, DDNames.SHORT_MS_BLACK_GLASS, DDNames.SHORT_MS_GREY_GLASS, DDNames.SHORT_MS_LIGHT_GREY_GLASS, DDNames.SHORT_MS_WHITE_GLASS, DDNames.SHORT_MS_RED_GLASS, DDNames.SHORT_MS_ORANGE_GLASS, DDNames.SHORT_MS_YELLOW_GLASS, DDNames.SHORT_MS_LIME_GLASS, DDNames.SHORT_MS_GREEN_GLASS, DDNames.SHORT_MS_CYAN_GLASS, DDNames.SHORT_MS_BLUE_GLASS, DDNames.SHORT_MS_PURPLE_GLASS, DDNames.SHORT_MS_MAGENTA_GLASS, DDNames.SHORT_MS_PINK_GLASS, DDNames.SHORT_MS_LIGHT_BLUE_GLASS, DDNames.SHORT_MS_BROWN_GLASS, 
			DDNames.TALL_BYG_EMBUR, DDNames.TALL_BYG_ETHER, DDNames.TALL_BYG_MAPLE, DDNames.TALL_BYG_REDWOOD, DDNames.TALL_BYG_SKYRIS, DDNames.TALL_BYG_SOUL_SHROOM, DDNames.TALL_MORECRAFT_GLASS, DDNames.TALL_MORECRAFT_SOUL_GLASS, 
			DDNames.TALL_MS_GLASS, DDNames.TALL_MS_SOUL_GLASS, DDNames.TALL_MS_TINTED_GLASS, DDNames.TALL_MS_BLACK_GLASS, DDNames.TALL_MS_GREY_GLASS, DDNames.TALL_MS_LIGHT_GREY_GLASS, DDNames.TALL_MS_WHITE_GLASS, DDNames.TALL_MS_RED_GLASS, DDNames.TALL_MS_ORANGE_GLASS, DDNames.TALL_MS_YELLOW_GLASS, DDNames.TALL_MS_LIME_GLASS, DDNames.TALL_MS_GREEN_GLASS, DDNames.TALL_MS_CYAN_GLASS, DDNames.TALL_MS_BLUE_GLASS, DDNames.TALL_MS_PURPLE_GLASS, DDNames.TALL_MS_MAGENTA_GLASS, DDNames.TALL_MS_PINK_GLASS, DDNames.TALL_MS_LIGHT_BLUE_GLASS, DDNames.TALL_MS_BROWN_GLASS);
	
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
		if (FabricUtils.INSTANCE.isModLoaded("create")) {
			DDPartialModels.putFoldingDoor(DDNames.TALL_CREATE_ANDESITE, "create/tall_andesite_door");
			DDPartialModels.putFoldingDoor(DDNames.TALL_CREATE_COPPER, "create/tall_copper_door");
			BlockEntityRenderers.register(CreateFabricCompat.TALL_SLIDING_DOOR_BLOCK_ENTITY, TallSlidingDoorBlockRenderer::new);
		}
	}
}
