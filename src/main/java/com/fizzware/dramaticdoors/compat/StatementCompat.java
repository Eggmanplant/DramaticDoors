package com.fizzware.dramaticdoors.compat;

import com.fizzware.dramaticdoors.config.DDConfig;

import net.minecraft.core.Registry;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import virtuoel.statement.api.StateRefresher;

public class StatementCompat
{
	public static void implementWaterlogging() {
		if (DDConfig.waterloggableDoors) {
			injectWaterloggedProperty(DoorBlock.class);
		}
		if (DDConfig.waterloggableFenceGates) {
			injectWaterloggedProperty(FenceGateBlock.class);
		}
	}
	
	private static void injectWaterloggedProperty(Class<? extends Block> blockClass) {
        for (Block block : Registry.BLOCK) {
            if (blockClass.isAssignableFrom(block.getClass())) {
                addWaterloggedProperty(block);
            }
        }
	}
	
	private static void addWaterloggedProperty(Block block) {
		StateRefresher.INSTANCE.addBlockProperty(block, BlockStateProperties.WATERLOGGED, false);
	}
}
