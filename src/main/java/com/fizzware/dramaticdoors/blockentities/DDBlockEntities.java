package com.fizzware.dramaticdoors.blockentities;

import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.blocks.DDBlocks;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class DDBlockEntities
{
	public static final BlockEntityType<TallNetheriteDoorBlockEntity> TALL_NETHERITE_DOOR = FabricBlockEntityTypeBuilder.create(TallNetheriteDoorBlockEntity::new, DDBlocks.TALL_NETHERITE_DOOR).build();
	
	public static void registerBlockEntities() {
		Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(DramaticDoors.MOD_ID, "tall_netherite_door"), TALL_NETHERITE_DOOR);
	}
}