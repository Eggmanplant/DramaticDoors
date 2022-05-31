package com.fizzware.dramaticdoors.client;

import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.blocks.DDBlocks.DoorSeries;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ClientRenderer
{
	public static void setRenderers() {
        // Setup Render Types (mainly for transparent doors like Acacia and Jungle)
        setRenderersForDoorSeries(DDBlocks.DoorSeries.VANILLA_TALL);
        //Conditionally add rendering on where mods are loaded.
        setRenderersForDoorSeries(DDBlocks.DoorSeries.BOP_TALL);
        setRenderersForDoorSeries(DDBlocks.DoorSeries.BYG_TALL);
        setRenderersForDoorSeries(DDBlocks.DoorSeries.POKECUBE_TALL);
        setRenderersForDoorSeries(DDBlocks.DoorSeries.PREHISTORIC_FAUNA_TALL);
        setRenderersForDoorSeries(DDBlocks.DoorSeries.TWILIGHT_FOREST_TALL);

        setRenderersForDoorSeries(DDBlocks.DoorSeries.ATMOSPHERIC_TALL);
        setRenderersForDoorSeries(DDBlocks.DoorSeries.AUTUMNITY_TALL);
        setRenderersForDoorSeries(DDBlocks.DoorSeries.BAMBOO_TALL);
        setRenderersForDoorSeries(DDBlocks.DoorSeries.BUZZIER_TALL);
        setRenderersForDoorSeries(DDBlocks.DoorSeries.ENDERGETIC_TALL);
        setRenderersForDoorSeries(DDBlocks.DoorSeries.ENVIRONMENTAL_TALL);
        setRenderersForDoorSeries(DDBlocks.DoorSeries.UPGRADE_AQUATIC_TALL);

        setRenderersForDoorSeries(DDBlocks.DoorSeries.ABUNDANCE_TALL);
        setRenderersForDoorSeries(DDBlocks.DoorSeries.BAYOU_BLUES_TALL);
        setRenderersForDoorSeries(DDBlocks.DoorSeries.ENH_MUSHROOMS_TALL);
        
        setRenderersForDoorSeries(DDBlocks.DoorSeries.ARCHITECTS_PALETTE_TALL);
        setRenderersForDoorSeries(DDBlocks.DoorSeries.BLOCKS_PLUS_TALL);
        setRenderersForDoorSeries(DDBlocks.DoorSeries.CREATE_ALLOYED_TALL);
        setRenderersForDoorSeries(DDBlocks.DoorSeries.CREATE_DECO_TALL);
        setRenderersForDoorSeries(DDBlocks.DoorSeries.DARKER_DEPTHS_TALL);
        setRenderersForDoorSeries(DDBlocks.DoorSeries.DUSTRIAL_DECOR_TALL);
        setRenderersForDoorSeries(DDBlocks.DoorSeries.ECOLOGICS_TALL);
        setRenderersForDoorSeries(DDBlocks.DoorSeries.HABITAT_TALL);
        setRenderersForDoorSeries(DDBlocks.DoorSeries.OUTER_END_TALL);
        setRenderersForDoorSeries(DDBlocks.DoorSeries.PREMIUM_WOOD_TALL);
        setRenderersForDoorSeries(DDBlocks.DoorSeries.QUARK_TALL);
        setRenderersForDoorSeries(DDBlocks.DoorSeries.SUPPLEMENTARIES_TALL);
        setRenderersForDoorSeries(DDBlocks.DoorSeries.UNDERGARDEN_TALL);
	}
	
	private static void setRenderersForDoorSeries(DoorSeries series) {
        for (Block doorBlock : DDBlocks.getBlockList(series)) {
        	if (doorBlock != null) {
        		ItemBlockRenderTypes.setRenderLayer(doorBlock, RenderType.translucent());
        	}
        }
	}

}
