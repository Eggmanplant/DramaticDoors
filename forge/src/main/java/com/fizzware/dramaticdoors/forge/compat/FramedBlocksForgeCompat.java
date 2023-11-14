package com.fizzware.dramaticdoors.forge.compat;

import com.fizzware.dramaticdoors.compat.registries.FramedBlocksCompat;
import com.fizzware.dramaticdoors.forge.addons.framedblocks.DDBlockType;
import com.fizzware.dramaticdoors.forge.addons.framedblocks.TallForgeFramedDoorBlock;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.RegisterEvent.RegisterHelper;

public class FramedBlocksForgeCompat
{
	public static BlockEntityType<?> TALL_FRAMED_DOOR_BLOCKENTITY;
	
	public static void registerCompat() {
		if (!FramedBlocksCompat.initialized) {
			FramedBlocksCompat.TALL_FRAMED_DOOR = new TallForgeFramedDoorBlock(DDBlockType.FRAMED_TALL_DOOR, Blocks.OAK_DOOR);
			FramedBlocksCompat.TALL_FRAMED_IRON_DOOR = new TallForgeFramedDoorBlock(DDBlockType.FRAMED_TALL_IRON_DOOR, Blocks.IRON_DOOR);
		}
		FramedBlocksCompat.registerCompat();
	}
	
	public static void registerBlockEntities(RegisterHelper<BlockEntityType<?>> helper) {
		
	}
}
