package com.fizzware.dramaticdoors.items;

import javax.annotation.Nullable;

import com.fizzware.dramaticdoors.blocks.ShortDoorBlock;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class ShortDoorItem extends BlockItem
{
	public ShortDoorItem(Block block, Properties properties) {
		super(block, properties);
	}

	private boolean isWoodFuel(ShortDoorBlock block) {
		if (block.type().soundType() == SoundType.STONE || block.type().soundType() == SoundType.METAL) {
			return false;
		}
		if (block.type().soundType() == SoundType.NETHER_WOOD) {
			return false;
		}
		if (block.type().soundType() == SoundType.WOOD || block.type().soundType() == SoundType.BAMBOO_WOOD) {
			return true;
		}
		return true;
	}
		
	@Override
	public int getBurnTime(ItemStack stack, @Nullable RecipeType<?> recipeType) {
		if (isWoodFuel((ShortDoorBlock)this.getBlock()) && !stack.is(ItemTags.NON_FLAMMABLE_WOOD)) {
			return 100;
		}
		else {
			return -1; // Can't be used as furnace fuel.
		}
	}
}

