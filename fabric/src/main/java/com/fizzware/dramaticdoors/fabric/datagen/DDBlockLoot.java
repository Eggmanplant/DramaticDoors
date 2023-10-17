package com.fizzware.dramaticdoors.fabric.datagen;

import com.fizzware.dramaticdoors.blocks.ShortDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.state.properties.TripleBlockPart;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.Block;

public class DDBlockLoot extends FabricBlockLootTableProvider
{

	protected DDBlockLoot(FabricDataGenerator dataGenerator) {
		super(dataGenerator);
	}

	@Override
	public void generateBlockLootTables() {
		for (Block block : Registry.BLOCK.stream().filter(block -> block instanceof ShortDoorBlock || block instanceof TallDoorBlock).toList()) {
			if (block instanceof ShortDoorBlock) {
				dropSelf(block);
			}
			if (block instanceof TallDoorBlock) {
				add(block, (condition) -> { return createSinglePropConditionTable(condition, TallDoorBlock.THIRD, TripleBlockPart.LOWER); } );
			}
		}
	}

}
