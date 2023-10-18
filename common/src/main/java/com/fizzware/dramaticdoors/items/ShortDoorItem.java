package com.fizzware.dramaticdoors.items;

import org.jetbrains.annotations.Nullable;

import com.fizzware.dramaticdoors.tags.DDItemTags;

import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;

public class ShortDoorItem extends BlockItem
{
	public ShortDoorItem(Block block, Properties properties) {
		super(block, properties);
	}
		
	public int getBurnTime(ItemStack stack, @Nullable RecipeType<?> recipeType) {
		if (stack.is(DDItemTags.SHORT_WOODEN_DOORS) && !stack.is(ItemTags.NON_FLAMMABLE_WOOD)) {
			return 100;
		}
		else {
			return -1; // Can't be used as furnace fuel.
		}
	}
}

