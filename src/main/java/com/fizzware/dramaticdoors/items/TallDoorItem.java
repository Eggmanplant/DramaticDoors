package com.fizzware.dramaticdoors.items;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.tags.ItemTags;

public class TallDoorItem extends BlockItem
{
	public TallDoorItem(Block block, Properties properties) {
		super(block, properties);
	}

	@Override
	public int getBurnTime(ItemStack stack, @Nullable IRecipeType<?> recipeType) {
		if (this.getBlock().defaultBlockState().getMaterial() == Material.WOOD && !stack.getItem().is(ItemTags.NON_FLAMMABLE_WOOD)) {
			return 300;
		}
		else {
			return -1; // Can't be used as furnace fuel.
		}
	}
}
