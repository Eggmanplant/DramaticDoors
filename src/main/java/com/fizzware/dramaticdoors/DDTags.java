package com.fizzware.dramaticdoors;

import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DDTags
{
	public static final TagKey<Block> TALL_DOORS = TagKey.of(Registry.BLOCK_KEY, new Identifier(DramaticDoors.MOD_ID, "tall_doors"));
	public static final TagKey<Block> TALL_WOODEN_DOORS = TagKey.of(Registry.BLOCK_KEY, new Identifier(DramaticDoors.MOD_ID, "tall_wooden_doors"));
}
