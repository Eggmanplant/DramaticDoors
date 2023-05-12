package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.blocks.ShortDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.items.DDItems;
import com.fizzware.dramaticdoors.items.ShortDoorItem;
import com.fizzware.dramaticdoors.items.TallDoorItem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;

public class DDMagicPackRegistry
{
	@SubscribeEvent
	public static void register(RegisterEvent event) {
		event.register(ForgeRegistries.Keys.BLOCKS, helper -> {
		    // Ars Nouveau
		    helper.register(DDNames.SHORT_ARCHWOOD, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ars_nouveau", "archwood_door")), BlockSetType.OAK));
		
		    helper.register(DDNames.TALL_ARCHWOOD, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ars_nouveau", "archwood_door")), BlockSetType.OAK));
		    
		    // Forbidden & Arcanus
		    helper.register(DDNames.SHORT_DEORUM, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("forbidden_arcanus", "arcane_gold_door"), Blocks.IRON_DOOR), BlockSetType.IRON));
		    helper.register(DDNames.SHORT_ARCANE_EDELWOOD, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("forbidden_arcanus", "arcane_edelwood_door")), BlockSetType.OAK));
		    helper.register(DDNames.SHORT_CHERRYWOOD, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("forbidden_arcanus", "cherrywood_door")), BlockSetType.CHERRY));
		    helper.register(DDNames.SHORT_EDELWOOD, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("forbidden_arcanus", "edelwood_door")), BlockSetType.OAK));
		    helper.register(DDNames.SHORT_FUNGYSS, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("forbidden_arcanus", "fungyss_door")), BlockSetType.OAK));
		    helper.register(DDNames.SHORT_AURUM, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("forbidden_arcanus", "mysterywood_door")), BlockSetType.OAK));
		    
		    helper.register(DDNames.TALL_DEORUM, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("forbidden_arcanus", "arcane_gold_door"), Blocks.IRON_DOOR), BlockSetType.IRON));
		    helper.register(DDNames.TALL_ARCANE_EDELWOOD, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("forbidden_arcanus", "arcane_edelwood_door")), BlockSetType.OAK));
		    helper.register(DDNames.TALL_CHERRYWOOD, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("forbidden_arcanus", "cherrywood_door")), BlockSetType.CHERRY));
		    helper.register(DDNames.TALL_EDELWOOD, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("forbidden_arcanus", "edelwood_door")), BlockSetType.OAK));
		    helper.register(DDNames.TALL_FUNGYSS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("forbidden_arcanus", "fungyss_door")), BlockSetType.OAK));
		    helper.register(DDNames.TALL_AURUM, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("forbidden_arcanus", "mysterywood_door")), BlockSetType.OAK));
		    
		    // Hexcasting
		    helper.register(DDNames.SHORT_EDIFIED, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("hexcasting", "edified_door")), BlockSetType.SPRUCE));
		
		    helper.register(DDNames.TALL_EDIFIED, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("hexcasting", "edified_door")), BlockSetType.SPRUCE));
		    
		    // Hexerei
		    helper.register(DDNames.SHORT_HEXEREI_MAHOGANY, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("hexerei", "mahogany_door")), BlockSetType.OAK));
		    helper.register(DDNames.SHORT_HEXEREI_WILLOW, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("hexerei", "willow_door")), BlockSetType.OAK));
		    helper.register(DDNames.SHORT_HEXEREI_WITCH_HAZEL, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("hexerei", "witch_hazel_door")), BlockSetType.OAK));
		
		    helper.register(DDNames.TALL_HEXEREI_MAHOGANY, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("hexerei", "mahogany_door")), BlockSetType.OAK));
		    helper.register(DDNames.TALL_HEXEREI_WILLOW, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("hexerei", "willow_door")), BlockSetType.OAK));
		    helper.register(DDNames.TALL_HEXEREI_WITCH_HAZEL, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("hexerei", "witch_hazel_door")), BlockSetType.OAK));
		    
		    // Malum
		    helper.register(DDNames.SHORT_RUNEWOOD, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("malum", "runewood_door")), BlockSetType.OAK));
		    helper.register(DDNames.SHORT_SOULWOOD, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("malum", "soulwood_door")), BlockSetType.OAK));
		
		    helper.register(DDNames.TALL_RUNEWOOD, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("malum", "runewood_door")), BlockSetType.OAK));
		    helper.register(DDNames.TALL_SOULWOOD, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("malum", "soulwood_door")), BlockSetType.OAK));
		    
		    // Pyromancer
		    helper.register(DDNames.SHORT_PYROWOOD, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("pyromancer", "pyrowood_door")), BlockSetType.OAK));
		    helper.register(DDNames.SHORT_ROTTEN_PLANKS, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("pyromancer", "rotten_planks_door")), BlockSetType.OAK));
		
		    helper.register(DDNames.TALL_PYROWOOD, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("pyromancer", "pyrowood_door")), BlockSetType.OAK));
		    helper.register(DDNames.TALL_ROTTEN_PLANKS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("pyromancer", "rotten_planks_door")), BlockSetType.OAK));
		});
		event.register(ForgeRegistries.Keys.ITEMS, helper -> {
		    // Ars Nouveau
		    helper.register(DDNames.SHORT_ARCHWOOD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ARCHWOOD)), DDItems.PROPERTIES));
		    
		    helper.register(DDNames.TALL_ARCHWOOD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ARCHWOOD)), DDItems.PROPERTIES));
		    
		    // Forbidden & Arcanus
		    helper.register(DDNames.SHORT_DEORUM, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_DEORUM)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_ARCANE_EDELWOOD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ARCANE_EDELWOOD)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_CHERRYWOOD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CHERRYWOOD)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_EDELWOOD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EDELWOOD)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_FUNGYSS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FUNGYSS)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_AURUM, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_AURUM)), DDItems.PROPERTIES));
		    
		    helper.register(DDNames.TALL_DEORUM, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DEORUM)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_ARCANE_EDELWOOD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ARCANE_EDELWOOD)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_CHERRYWOOD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHERRYWOOD)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_EDELWOOD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EDELWOOD)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_FUNGYSS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FUNGYSS)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_AURUM, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AURUM)), DDItems.PROPERTIES));
		    
		    // Hexcasting
		    helper.register(DDNames.SHORT_EDIFIED, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EDIFIED)), DDItems.PROPERTIES));
		    
		    helper.register(DDNames.TALL_EDIFIED, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EDIFIED)), DDItems.PROPERTIES));
		    
		    // Hexeri
		    helper.register(DDNames.SHORT_HEXEREI_MAHOGANY, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_HEXEREI_MAHOGANY)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_HEXEREI_WILLOW, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_HEXEREI_WILLOW)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_HEXEREI_WITCH_HAZEL, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_HEXEREI_WITCH_HAZEL)), DDItems.PROPERTIES));
		    
		    helper.register(DDNames.TALL_HEXEREI_MAHOGANY, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_HEXEREI_MAHOGANY)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_HEXEREI_WILLOW, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_HEXEREI_WILLOW)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_HEXEREI_WITCH_HAZEL, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_HEXEREI_WITCH_HAZEL)), DDItems.PROPERTIES));
		    
		    // Malum
		    helper.register(DDNames.SHORT_RUNEWOOD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUNEWOOD)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_SOULWOOD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SOULWOOD)), DDItems.PROPERTIES));
		    
		    helper.register(DDNames.TALL_RUNEWOOD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUNEWOOD)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_SOULWOOD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SOULWOOD)), DDItems.PROPERTIES));
		    
		    // Pyromancer
		    helper.register(DDNames.SHORT_PYROWOOD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PYROWOOD)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_ROTTEN_PLANKS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ROTTEN_PLANKS)), DDItems.PROPERTIES));
		
		    helper.register(DDNames.TALL_PYROWOOD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PYROWOOD)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_ROTTEN_PLANKS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ROTTEN_PLANKS)), DDItems.PROPERTIES));
   
		});
	}
}
