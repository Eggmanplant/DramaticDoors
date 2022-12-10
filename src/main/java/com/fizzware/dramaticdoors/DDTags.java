package com.fizzware.dramaticdoors;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class DDTags
{
	public static final TagKey<Block> TALL_DOORS = TagKey.of(RegistryKeys.BLOCK, new Identifier(DramaticDoors.MOD_ID, "tall_doors"));
	public static final TagKey<Block> TALL_WOODEN_DOORS = TagKey.of(RegistryKeys.BLOCK, new Identifier(DramaticDoors.MOD_ID, "tall_wooden_doors"));
	public static final TagKey<Block> HAND_OPENABLE_TALL_METAL_DOORS = TagKey.of(RegistryKeys.BLOCK, new Identifier(DramaticDoors.MOD_ID, "hand_openable_tall_metal_doors"));

	public static final TagKey<Item> KEY = TagKey.of(RegistryKeys.ITEM, new Identifier("supplementaries", "key"));
}
