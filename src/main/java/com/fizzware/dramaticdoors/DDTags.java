package com.fizzware.dramaticdoors;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

public class DDTags
{
	public static final ITag.INamedTag<Block> TALL_DOORS = BlockTags.createOptional(new ResourceLocation("dramaticdoors", "tall_doors"));
	public static final ITag.INamedTag<Block> TALL_WOODEN_DOORS = BlockTags.createOptional(new ResourceLocation("dramaticdoors", "tall_wooden_doors"));
	public static final ITag.INamedTag<Block> HAND_OPENABLE_TALL_METAL_DOORS = BlockTags.createOptional(new ResourceLocation("dramaticdoors", "hand_openable_tall_metal_doors"));
	
	public static final ITag.INamedTag<Item> KEY = ItemTags.createOptional(new ResourceLocation("supplementaries", "key"));
}
