package com.fizzware.dramaticdoors.datagen;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.state.properties.TripleBlockPart;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.RegistryObject;

public class DDBlockLoot extends BlockLootSubProvider
{
	// Needed to stop data generator complaining about missing explosion resistant blocks.
	private static final Set<Item> EXPLOSION_RESISTANT = Stream.of(Blocks.AIR).map(ItemLike::asItem).collect(Collectors.toSet());
	
	protected DDBlockLoot() {
		super(EXPLOSION_RESISTANT, FeatureFlags.REGISTRY.allFlags());
	}

	@Override
	protected Iterable<Block> getKnownBlocks() {
		List<Block> blocks = DDBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).toList();
		return blocks;
	}

	protected void generate() {
		for (Block block : getKnownBlocks()) {
			this.add(block, createSinglePropConditionTable(block, TallDoorBlock.THIRD, TripleBlockPart.LOWER));
		}
	}
}
