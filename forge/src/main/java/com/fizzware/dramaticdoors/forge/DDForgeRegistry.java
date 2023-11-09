package com.fizzware.dramaticdoors.forge;

import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.blockentities.DDBlockEntities;
import com.fizzware.dramaticdoors.blockentities.TallNetheriteDoorBlockEntity;
import com.fizzware.dramaticdoors.compat.Compats;
import com.fizzware.dramaticdoors.compat.registries.CreateCompat;
import com.fizzware.dramaticdoors.compat.registries.SupplementariesCompat;
import com.fizzware.dramaticdoors.forge.addons.create.TallForgeCreateSlidingDoorBlockEntity;
import com.fizzware.dramaticdoors.forge.compat.BlockCarpentryForgeCompat;
import com.fizzware.dramaticdoors.forge.compat.CreateForgeCompat;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import oshi.util.tuples.Pair;

public class DDForgeRegistry
{
	@SubscribeEvent
	public static void registerBlocksItems(RegisterEvent event) {
		Compats.registerCompats(ForgeUtils.INSTANCE);
		if (Compats.isModLoaded("create", ForgeUtils.INSTANCE)) {
			CreateForgeCompat.registerCompat();
		}
		if (Compats.isModLoaded("blockcarpentry", ForgeUtils.INSTANCE)) {
			BlockCarpentryForgeCompat.registerCompat();
		}
		event.register(ForgeRegistries.Keys.BLOCKS, helper -> {
	        for (Pair<String, Block> pair : DDRegistry.DOOR_BLOCKS_TO_REGISTER) {
	        	helper.register(new ResourceLocation(DramaticDoors.MOD_ID, pair.getA()), pair.getB());
	        }
		});
		event.register(ForgeRegistries.Keys.ITEMS, helper -> {
	        for (Pair<String, Item> pair : DDRegistry.DOOR_ITEMS_TO_REGISTER) {
	        	helper.register(new ResourceLocation(DramaticDoors.MOD_ID, pair.getA()), pair.getB());
	        }
		});
		event.register(ForgeRegistries.Keys.BLOCK_ENTITY_TYPES, helper -> {
			if (Compats.modChecker.isModLoaded("supplementaries")) {
				DDBlockEntities.TALL_NETHERITE_DOOR = Compats.modChecker.isModLoaded("supplementaries") ? BlockEntityType.Builder.of(TallNetheriteDoorBlockEntity::new, SupplementariesCompat.SHORT_NETHERITE_DOOR, SupplementariesCompat.TALL_NETHERITE_DOOR).build(null) : null;
				helper.register(new ResourceLocation(DramaticDoors.MOD_ID, "tall_netherite_door"), DDBlockEntities.TALL_NETHERITE_DOOR);
			}
			if (Compats.isModLoaded("create", ForgeUtils.INSTANCE)) {
				CreateForgeCompat.TALL_SLIDING_DOOR_BLOCK_ENTITY = BlockEntityType.Builder.of(TallForgeCreateSlidingDoorBlockEntity::new, CreateCompat.TALL_ANDESITE_DOOR, CreateCompat.TALL_BRASS_DOOR, CreateCompat.TALL_COPPER_DOOR, CreateCompat.TALL_FRAMED_GLASS_DOOR, CreateCompat.TALL_TRAIN_DOOR).build(null);
				helper.register(new ResourceLocation(DramaticDoors.MOD_ID, "tall_sliding_door"), CreateForgeCompat.TALL_SLIDING_DOOR_BLOCK_ENTITY);
			}
			if (Compats.isModLoaded("blockcarpentry", ForgeUtils.INSTANCE)) {
				BlockCarpentryForgeCompat.registerBlockEntities(helper);
			}
		});
	}
}
