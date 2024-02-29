package com.fizzware.dramaticdoors.forge.addons.extradetails.client;

import me.pandamods.pandalib.cache.MeshCache;
import me.pandamods.pandalib.client.render.block.ClientBlock;
import me.pandamods.pandalib.entity.MeshAnimatable;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class ShortDoorClientBlock extends ClientBlock implements MeshAnimatable
{
	private final MeshCache cache = new MeshCache();
	
	public ShortDoorClientBlock(BlockPos blockPos, BlockState blockState, ClientLevel level) {
		super(blockPos, blockState, level);
	}

	@Override
	public MeshCache getCache() {
		return this.cache;
	}
}
