package com.fizzware.dramaticdoors.blockentities;

import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.blocks.DDBlocks;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DDBlockEntities
{
	public static final DeferredRegister<TileEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, DramaticDoors.MOD_ID);
	
	public static final RegistryObject<TileEntityType<TallNetheriteDoorBlockEntity>> TALL_NETHERITE_DOOR = BLOCK_ENTITIES.register("tall_netherite_door", () -> TileEntityType.Builder.of(TallNetheriteDoorBlockEntity::new, DDBlocks.TALL_NETHERITE_DOOR.get()).build(null));
}
