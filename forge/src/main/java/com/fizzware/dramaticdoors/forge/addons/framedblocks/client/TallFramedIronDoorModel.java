package com.fizzware.dramaticdoors.forge.addons.framedblocks.client;

import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.world.level.block.state.BlockState;

public class TallFramedIronDoorModel extends TallFramedDoorModel
{

	public TallFramedIronDoorModel(BlockState state, BakedModel baseModel) {
		super(state, baseModel);
	}

    @Override
    protected boolean useBaseModel() { return true; }
}
