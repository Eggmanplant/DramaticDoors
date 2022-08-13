package com.fizzware.dramaticdoors.blockentities;

import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.blocks.DDBlocks;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DDBlockEntities
{
	public static final BlockEntityType<TallNetheriteDoorBlockEntity> TALL_NETHERITE_DOOR = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(DramaticDoors.MOD_ID, "tall_netherite_door"), FabricBlockEntityTypeBuilder.create(TallNetheriteDoorBlockEntity::new, DDBlocks.TALL_NETHERITE_DOOR).build());
}