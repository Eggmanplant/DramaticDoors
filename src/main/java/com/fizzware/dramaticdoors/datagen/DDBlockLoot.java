package com.fizzware.dramaticdoors.datagen;

import java.util.function.BiConsumer;

import com.fizzware.dramaticdoors.blocks.ShortDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.state.properties.TripleBlockPart;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable.Builder;

public class DDBlockLoot extends FabricBlockLootTableProvider
{
	// Y U No work?
	protected DDBlockLoot(FabricDataOutput output) {
		super(output);
	}

	@Override
	public void accept(BiConsumer<ResourceLocation, Builder> consumer) {
		
	}
	
	@Override
	public void generate() {
		for (Block block : BuiltInRegistries.BLOCK.stream().filter(block -> block instanceof ShortDoorBlock || block instanceof TallDoorBlock).toList()) {
			if (block instanceof ShortDoorBlock) {
				this.dropSelf(block);
			}
			if (block instanceof TallDoorBlock) {
				this.add(block, (condition) -> { return createSinglePropConditionTable(condition, TallDoorBlock.THIRD, TripleBlockPart.LOWER); } );
			}
		}
	}


}
