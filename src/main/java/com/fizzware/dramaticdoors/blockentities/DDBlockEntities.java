package com.fizzware.dramaticdoors.blockentities;

import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.compat.Compats;
import com.fizzware.dramaticdoors.compat.registries.SupplementariesCompat;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class DDBlockEntities
{
	public static final BlockEntityType<TallNetheriteDoorBlockEntity> TALL_NETHERITE_DOOR = Compats.SUPPLEMENTARIES_INSTALLED ? FabricBlockEntityTypeBuilder.create(TallNetheriteDoorBlockEntity::new, SupplementariesCompat.SHORT_NETHERITE_DOOR, SupplementariesCompat.TALL_NETHERITE_DOOR).build() : null;
	
	public static void registerBlockEntities() {
		if (Compats.SUPPLEMENTARIES_INSTALLED) {
			Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(DramaticDoors.MOD_ID, "tall_netherite_door"), TALL_NETHERITE_DOOR);
		}
	}
}