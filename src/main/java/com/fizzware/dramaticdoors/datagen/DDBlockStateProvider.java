package com.fizzware.dramaticdoors.datagen;

import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.state.properties.TripleBlockPart;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.client.model.generators.ModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class DDBlockStateProvider extends BlockStateProvider {
	
    public DDBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, DramaticDoors.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
    	/*tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_OAK_DOOR_01.get(), "block/chipped/tall_oak_door_01", "block/chipped/tall_oak_door_1");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_OAK_DOOR_02.get(), "block/chipped/tall_oak_door_02", "block/chipped/tall_oak_door_2");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_OAK_DOOR_03.get(), "block/chipped/tall_oak_door_03", "block/chipped/tall_oak_door_3");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_OAK_DOOR_04.get(), "block/chipped/tall_oak_door_04", "block/chipped/tall_oak_door_4");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_OAK_DOOR_05.get(), "block/chipped/tall_oak_door_05", "block/chipped/tall_oak_door_5");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_OAK_DOOR_06.get(), "block/chipped/tall_oak_door_06", "block/chipped/tall_oak_door_6");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_OAK_DOOR_07.get(), "block/chipped/tall_oak_door_07", "block/chipped/tall_oak_door_7");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_OAK_DOOR_08.get(), "block/chipped/tall_oak_door_08", "block/chipped/tall_oak_door_8");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_OAK_DOOR_09.get(), "block/chipped/tall_oak_door_09", "block/chipped/tall_oak_door_9");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_OAK_DOOR_10.get(), "block/chipped/tall_oak_door_10", "block/chipped/tall_oak_door_10");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_OAK_DOOR_11.get(), "block/chipped/tall_oak_door_11", "block/chipped/tall_oak_door_11");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_OAK_DOOR_12.get(), "block/chipped/tall_oak_door_12", "block/chipped/tall_oak_door_12");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_OAK_DOOR_13.get(), "block/chipped/tall_oak_door_13", "block/chipped/tall_oak_door_13");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_OAK_DOOR_14.get(), "block/chipped/tall_oak_door_14", "block/chipped/tall_oak_door_14");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_OAK_DOOR_15.get(), "block/chipped/tall_oak_door_15", "block/chipped/tall_oak_door_15");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_OAK_DOOR_16.get(), "block/chipped/tall_oak_door_16", "block/chipped/tall_oak_door_16");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_OAK_DOOR_17.get(), "block/chipped/tall_oak_door_17", "block/chipped/tall_oak_door_17");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_OAK_DOOR_18.get(), "block/chipped/tall_oak_door_18", "block/chipped/tall_oak_door_18");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_OAK_DOOR_19.get(), "block/chipped/tall_oak_door_19", "block/chipped/tall_oak_door_19");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_OAK_DOOR_20.get(), "block/chipped/tall_oak_door_20", "block/chipped/tall_oak_door_20");
    	
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_01.get(), "block/chipped/tall_spruce_door_01", "block/chipped/tall_spruce_door_1");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_02.get(), "block/chipped/tall_spruce_door_02", "block/chipped/tall_spruce_door_2");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_03.get(), "block/chipped/tall_spruce_door_03", "block/chipped/tall_spruce_door_3");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_04.get(), "block/chipped/tall_spruce_door_04", "block/chipped/tall_spruce_door_4");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_05.get(), "block/chipped/tall_spruce_door_05", "block/chipped/tall_spruce_door_5");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_06.get(), "block/chipped/tall_spruce_door_06", "block/chipped/tall_spruce_door_6");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_07.get(), "block/chipped/tall_spruce_door_07", "block/chipped/tall_spruce_door_7");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_08.get(), "block/chipped/tall_spruce_door_08", "block/chipped/tall_spruce_door_8");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_09.get(), "block/chipped/tall_spruce_door_09", "block/chipped/tall_spruce_door_9");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_10.get(), "block/chipped/tall_spruce_door_10", "block/chipped/tall_spruce_door_10");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_11.get(), "block/chipped/tall_spruce_door_11", "block/chipped/tall_spruce_door_11");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_12.get(), "block/chipped/tall_spruce_door_12", "block/chipped/tall_spruce_door_12");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_13.get(), "block/chipped/tall_spruce_door_13", "block/chipped/tall_spruce_door_13");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_14.get(), "block/chipped/tall_spruce_door_14", "block/chipped/tall_spruce_door_14");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_15.get(), "block/chipped/tall_spruce_door_15", "block/chipped/tall_spruce_door_15");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_16.get(), "block/chipped/tall_spruce_door_16", "block/chipped/tall_spruce_door_16");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_17.get(), "block/chipped/tall_spruce_door_17", "block/chipped/tall_spruce_door_17");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_18.get(), "block/chipped/tall_spruce_door_18", "block/chipped/tall_spruce_door_18");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_19.get(), "block/chipped/tall_spruce_door_19", "block/chipped/tall_spruce_door_19");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_20.get(), "block/chipped/tall_spruce_door_20", "block/chipped/tall_spruce_door_20");
    	
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_01.get(), "block/chipped/tall_birch_door_01", "block/chipped/tall_birch_door_1");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_02.get(), "block/chipped/tall_birch_door_02", "block/chipped/tall_birch_door_2");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_03.get(), "block/chipped/tall_birch_door_03", "block/chipped/tall_birch_door_3");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_04.get(), "block/chipped/tall_birch_door_04", "block/chipped/tall_birch_door_4");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_05.get(), "block/chipped/tall_birch_door_05", "block/chipped/tall_birch_door_5");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_06.get(), "block/chipped/tall_birch_door_06", "block/chipped/tall_birch_door_6");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_07.get(), "block/chipped/tall_birch_door_07", "block/chipped/tall_birch_door_7");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_08.get(), "block/chipped/tall_birch_door_08", "block/chipped/tall_birch_door_8");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_09.get(), "block/chipped/tall_birch_door_09", "block/chipped/tall_birch_door_9");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_10.get(), "block/chipped/tall_birch_door_10", "block/chipped/tall_birch_door_10");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_11.get(), "block/chipped/tall_birch_door_11", "block/chipped/tall_birch_door_11");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_12.get(), "block/chipped/tall_birch_door_12", "block/chipped/tall_birch_door_12");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_13.get(), "block/chipped/tall_birch_door_13", "block/chipped/tall_birch_door_13");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_14.get(), "block/chipped/tall_birch_door_14", "block/chipped/tall_birch_door_14");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_15.get(), "block/chipped/tall_birch_door_15", "block/chipped/tall_birch_door_15");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_16.get(), "block/chipped/tall_birch_door_16", "block/chipped/tall_birch_door_16");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_17.get(), "block/chipped/tall_birch_door_17", "block/chipped/tall_birch_door_17");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_18.get(), "block/chipped/tall_birch_door_18", "block/chipped/tall_birch_door_18");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_19.get(), "block/chipped/tall_birch_door_19", "block/chipped/tall_birch_door_19");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_20.get(), "block/chipped/tall_birch_door_20", "block/chipped/tall_birch_door_20");
    	
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_01.get(), "block/chipped/tall_jungle_door_01", "block/chipped/tall_jungle_door_1");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_02.get(), "block/chipped/tall_jungle_door_02", "block/chipped/tall_jungle_door_2");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_03.get(), "block/chipped/tall_jungle_door_03", "block/chipped/tall_jungle_door_3");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_04.get(), "block/chipped/tall_jungle_door_04", "block/chipped/tall_jungle_door_4");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_05.get(), "block/chipped/tall_jungle_door_05", "block/chipped/tall_jungle_door_5");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_06.get(), "block/chipped/tall_jungle_door_06", "block/chipped/tall_jungle_door_6");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_07.get(), "block/chipped/tall_jungle_door_07", "block/chipped/tall_jungle_door_7");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_08.get(), "block/chipped/tall_jungle_door_08", "block/chipped/tall_jungle_door_8");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_09.get(), "block/chipped/tall_jungle_door_09", "block/chipped/tall_jungle_door_9");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_10.get(), "block/chipped/tall_jungle_door_10", "block/chipped/tall_jungle_door_10");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_11.get(), "block/chipped/tall_jungle_door_11", "block/chipped/tall_jungle_door_11");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_12.get(), "block/chipped/tall_jungle_door_12", "block/chipped/tall_jungle_door_12");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_13.get(), "block/chipped/tall_jungle_door_13", "block/chipped/tall_jungle_door_13");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_14.get(), "block/chipped/tall_jungle_door_14", "block/chipped/tall_jungle_door_14");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_15.get(), "block/chipped/tall_jungle_door_15", "block/chipped/tall_jungle_door_15");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_16.get(), "block/chipped/tall_jungle_door_16", "block/chipped/tall_jungle_door_16");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_17.get(), "block/chipped/tall_jungle_door_17", "block/chipped/tall_jungle_door_17");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_18.get(), "block/chipped/tall_jungle_door_18", "block/chipped/tall_jungle_door_18");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_19.get(), "block/chipped/tall_jungle_door_19", "block/chipped/tall_jungle_door_19");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_20.get(), "block/chipped/tall_jungle_door_20", "block/chipped/tall_jungle_door_20");
    	
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_01.get(), "block/chipped/tall_acacia_door_01", "block/chipped/tall_acacia_door_1");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_02.get(), "block/chipped/tall_acacia_door_02", "block/chipped/tall_acacia_door_2");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_03.get(), "block/chipped/tall_acacia_door_03", "block/chipped/tall_acacia_door_3");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_04.get(), "block/chipped/tall_acacia_door_04", "block/chipped/tall_acacia_door_4");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_05.get(), "block/chipped/tall_acacia_door_05", "block/chipped/tall_acacia_door_5");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_06.get(), "block/chipped/tall_acacia_door_06", "block/chipped/tall_acacia_door_6");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_07.get(), "block/chipped/tall_acacia_door_07", "block/chipped/tall_acacia_door_7");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_08.get(), "block/chipped/tall_acacia_door_08", "block/chipped/tall_acacia_door_8");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_09.get(), "block/chipped/tall_acacia_door_09", "block/chipped/tall_acacia_door_9");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_10.get(), "block/chipped/tall_acacia_door_10", "block/chipped/tall_acacia_door_10");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_11.get(), "block/chipped/tall_acacia_door_11", "block/chipped/tall_acacia_door_11");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_12.get(), "block/chipped/tall_acacia_door_12", "block/chipped/tall_acacia_door_12");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_13.get(), "block/chipped/tall_acacia_door_13", "block/chipped/tall_acacia_door_13");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_14.get(), "block/chipped/tall_acacia_door_14", "block/chipped/tall_acacia_door_14");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_15.get(), "block/chipped/tall_acacia_door_15", "block/chipped/tall_acacia_door_15");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_16.get(), "block/chipped/tall_acacia_door_16", "block/chipped/tall_acacia_door_16");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_17.get(), "block/chipped/tall_acacia_door_17", "block/chipped/tall_acacia_door_17");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_18.get(), "block/chipped/tall_acacia_door_18", "block/chipped/tall_acacia_door_18");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_19.get(), "block/chipped/tall_acacia_door_19", "block/chipped/tall_acacia_door_19");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_20.get(), "block/chipped/tall_acacia_door_20", "block/chipped/tall_acacia_door_20");
    	
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_01.get(), "block/chipped/tall_dark_oak_door_01", "block/chipped/tall_dark_oak_door_1");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_02.get(), "block/chipped/tall_dark_oak_door_02", "block/chipped/tall_dark_oak_door_2");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_03.get(), "block/chipped/tall_dark_oak_door_03", "block/chipped/tall_dark_oak_door_3");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_04.get(), "block/chipped/tall_dark_oak_door_04", "block/chipped/tall_dark_oak_door_4");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_05.get(), "block/chipped/tall_dark_oak_door_05", "block/chipped/tall_dark_oak_door_5");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_06.get(), "block/chipped/tall_dark_oak_door_06", "block/chipped/tall_dark_oak_door_6");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_07.get(), "block/chipped/tall_dark_oak_door_07", "block/chipped/tall_dark_oak_door_7");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_08.get(), "block/chipped/tall_dark_oak_door_08", "block/chipped/tall_dark_oak_door_8");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_09.get(), "block/chipped/tall_dark_oak_door_09", "block/chipped/tall_dark_oak_door_9");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_10.get(), "block/chipped/tall_dark_oak_door_10", "block/chipped/tall_dark_oak_door_10");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_11.get(), "block/chipped/tall_dark_oak_door_11", "block/chipped/tall_dark_oak_door_11");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_12.get(), "block/chipped/tall_dark_oak_door_12", "block/chipped/tall_dark_oak_door_12");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_13.get(), "block/chipped/tall_dark_oak_door_13", "block/chipped/tall_dark_oak_door_13");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_14.get(), "block/chipped/tall_dark_oak_door_14", "block/chipped/tall_dark_oak_door_14");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_15.get(), "block/chipped/tall_dark_oak_door_15", "block/chipped/tall_dark_oak_door_15");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_16.get(), "block/chipped/tall_dark_oak_door_16", "block/chipped/tall_dark_oak_door_16");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_17.get(), "block/chipped/tall_dark_oak_door_17", "block/chipped/tall_dark_oak_door_17");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_18.get(), "block/chipped/tall_dark_oak_door_18", "block/chipped/tall_dark_oak_door_18");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_19.get(), "block/chipped/tall_dark_oak_door_19", "block/chipped/tall_dark_oak_door_19");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_20.get(), "block/chipped/tall_dark_oak_door_20", "block/chipped/tall_dark_oak_door_20");
    	
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_01.get(), "block/chipped/tall_crimson_door_01", "block/chipped/tall_crimson_door_1");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_02.get(), "block/chipped/tall_crimson_door_02", "block/chipped/tall_crimson_door_2");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_03.get(), "block/chipped/tall_crimson_door_03", "block/chipped/tall_crimson_door_3");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_04.get(), "block/chipped/tall_crimson_door_04", "block/chipped/tall_crimson_door_4");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_05.get(), "block/chipped/tall_crimson_door_05", "block/chipped/tall_crimson_door_5");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_06.get(), "block/chipped/tall_crimson_door_06", "block/chipped/tall_crimson_door_6");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_07.get(), "block/chipped/tall_crimson_door_07", "block/chipped/tall_crimson_door_7");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_08.get(), "block/chipped/tall_crimson_door_08", "block/chipped/tall_crimson_door_8");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_09.get(), "block/chipped/tall_crimson_door_09", "block/chipped/tall_crimson_door_9");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_10.get(), "block/chipped/tall_crimson_door_10", "block/chipped/tall_crimson_door_10");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_11.get(), "block/chipped/tall_crimson_door_11", "block/chipped/tall_crimson_door_11");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_12.get(), "block/chipped/tall_crimson_door_12", "block/chipped/tall_crimson_door_12");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_13.get(), "block/chipped/tall_crimson_door_13", "block/chipped/tall_crimson_door_13");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_14.get(), "block/chipped/tall_crimson_door_14", "block/chipped/tall_crimson_door_14");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_15.get(), "block/chipped/tall_crimson_door_15", "block/chipped/tall_crimson_door_15");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_16.get(), "block/chipped/tall_crimson_door_16", "block/chipped/tall_crimson_door_16");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_17.get(), "block/chipped/tall_crimson_door_17", "block/chipped/tall_crimson_door_17");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_18.get(), "block/chipped/tall_crimson_door_18", "block/chipped/tall_crimson_door_18");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_19.get(), "block/chipped/tall_crimson_door_19", "block/chipped/tall_crimson_door_19");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_20.get(), "block/chipped/tall_crimson_door_20", "block/chipped/tall_crimson_door_20");
    	
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_WARPED_DOOR_01.get(), "block/chipped/tall_warped_door_01", "block/chipped/tall_warped_door_1");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_WARPED_DOOR_02.get(), "block/chipped/tall_warped_door_02", "block/chipped/tall_warped_door_2");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_WARPED_DOOR_03.get(), "block/chipped/tall_warped_door_03", "block/chipped/tall_warped_door_3");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_WARPED_DOOR_04.get(), "block/chipped/tall_warped_door_04", "block/chipped/tall_warped_door_4");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_WARPED_DOOR_05.get(), "block/chipped/tall_warped_door_05", "block/chipped/tall_warped_door_5");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_WARPED_DOOR_06.get(), "block/chipped/tall_warped_door_06", "block/chipped/tall_warped_door_6");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_WARPED_DOOR_07.get(), "block/chipped/tall_warped_door_07", "block/chipped/tall_warped_door_7");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_WARPED_DOOR_08.get(), "block/chipped/tall_warped_door_08", "block/chipped/tall_warped_door_8");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_WARPED_DOOR_09.get(), "block/chipped/tall_warped_door_09", "block/chipped/tall_warped_door_9");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_WARPED_DOOR_10.get(), "block/chipped/tall_warped_door_10", "block/chipped/tall_warped_door_10");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_WARPED_DOOR_11.get(), "block/chipped/tall_warped_door_11", "block/chipped/tall_warped_door_11");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_WARPED_DOOR_12.get(), "block/chipped/tall_warped_door_12", "block/chipped/tall_warped_door_12");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_WARPED_DOOR_13.get(), "block/chipped/tall_warped_door_13", "block/chipped/tall_warped_door_13");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_WARPED_DOOR_14.get(), "block/chipped/tall_warped_door_14", "block/chipped/tall_warped_door_14");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_WARPED_DOOR_15.get(), "block/chipped/tall_warped_door_15", "block/chipped/tall_warped_door_15");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_WARPED_DOOR_16.get(), "block/chipped/tall_warped_door_16", "block/chipped/tall_warped_door_16");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_WARPED_DOOR_17.get(), "block/chipped/tall_warped_door_17", "block/chipped/tall_warped_door_17");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_WARPED_DOOR_18.get(), "block/chipped/tall_warped_door_18", "block/chipped/tall_warped_door_18");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_WARPED_DOOR_19.get(), "block/chipped/tall_warped_door_19", "block/chipped/tall_warped_door_19");
    	tallDoorBlockAlt(DDBlocks.TALL_CHIPPED_WARPED_DOOR_20.get(), "block/chipped/tall_warped_door_20", "block/chipped/tall_warped_door_20");*/
    	// Insert any tall doors that needs to be data-generated. Example below:
    	tallDoorBlock(DDBlocks.TALL_OAK_DOOR.get(), "block/tall_oak");
    }
    
    /*private void tallDoorBlockAlt(Block block, String baseName, String texName) {
    	internalTallDoorBlockAlt((TallDoorBlock)block, baseName, new ResourceLocation(DramaticDoors.MOD_ID, "" + texName + "_bottom"), new ResourceLocation(DramaticDoors.MOD_ID, "" + texName + "_middle"), new ResourceLocation(DramaticDoors.MOD_ID, "" + texName + "_top"));
    }*/
    
    private void tallDoorBlock(Block block, String baseName) {
    	internalTallDoorBlock((TallDoorBlock)block, baseName, new ResourceLocation(DramaticDoors.MOD_ID, "" + baseName + "_door_bottom"), new ResourceLocation(DramaticDoors.MOD_ID, "" + baseName + "_door_middle"), new ResourceLocation(DramaticDoors.MOD_ID, "" + baseName + "_door_top"));
    }
    
    /*private void internalTallDoorBlockAlt(TallDoorBlock block, String baseName, ResourceLocation bottom, ResourceLocation middle, ResourceLocation top) {
        ModelFile bottomMdl = models().withExistingParent(baseName + "_bottom", "" + ModelProvider.BLOCK_FOLDER + "/door_bottom").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile bottomHinge = models().withExistingParent(baseName + "_bottom_hinge", "" + ModelProvider.BLOCK_FOLDER + "/door_bottom_rh").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile middleMdl = models().withExistingParent(baseName + "_middle", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_middle").texture("bottom", middle).texture("middle", middle).texture("top", middle); 
        ModelFile middleHinge = models().withExistingParent(baseName + "_middle_hinge", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_middle_rh").texture("bottom", middle).texture("middle", middle).texture("top", middle); 
        ModelFile doorTop = models().withExistingParent(baseName + "_top", "" + ModelProvider.BLOCK_FOLDER + "/door_top").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile doorTopHinge = models().withExistingParent(baseName + "_top_hinge", "" + ModelProvider.BLOCK_FOLDER + "/door_top_rh").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        tallDoorBlock(block, bottomMdl, bottomHinge, middleMdl, middleHinge, doorTop, doorTopHinge);
    }*/
    
    private void internalTallDoorBlock(TallDoorBlock block, String baseName, ResourceLocation bottom, ResourceLocation middle, ResourceLocation top) {
        ModelFile bottomMdl = models().withExistingParent(baseName + "_door_bottom", "" + ModelProvider.BLOCK_FOLDER + "/door_bottom").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile bottomHinge = models().withExistingParent(baseName + "_door_bottom_hinge", "" + ModelProvider.BLOCK_FOLDER + "/door_bottom_rh").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile middleMdl = models().withExistingParent(baseName + "_door_middle", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_middle").texture("bottom", middle).texture("middle", middle).texture("top", middle); 
        ModelFile middleHinge = models().withExistingParent(baseName + "_door_middle_hinge", "dramaticdoors:" + ModelProvider.BLOCK_FOLDER + "/door_middle_rh").texture("bottom", middle).texture("middle", middle).texture("top", middle); 
        ModelFile doorTop = models().withExistingParent(baseName + "_door_top", "" + ModelProvider.BLOCK_FOLDER + "/door_top").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        ModelFile doorTopHinge = models().withExistingParent(baseName + "_door_top_hinge", "" + ModelProvider.BLOCK_FOLDER + "/door_top_rh").texture("bottom", bottom).texture("middle", middle).texture("top", top);
        tallDoorBlock(block, bottomMdl, bottomHinge, middleMdl, middleHinge, doorTop, doorTopHinge);
    }

    public void tallDoorBlock(TallDoorBlock block, ModelFile bottomLeft, ModelFile bottomRight, ModelFile middleLeft, ModelFile middleRight, ModelFile topLeft, ModelFile topRight) {
        getVariantBuilder(block).forAllStatesExcept(state -> {
            int yRot = ((int) state.getValue(TallDoorBlock.FACING).toYRot()) + 90;
            TripleBlockPart third = state.getValue(TallDoorBlock.THIRD);
            boolean rh = state.getValue(TallDoorBlock.HINGE) == DoorHingeSide.RIGHT;
            boolean open = state.getValue(TallDoorBlock.OPEN);
            boolean right = rh ^ open;
            if (open) {
                yRot += 90;
            }
            if (rh && open) {
                yRot += 180;
            }
            yRot %= 360;
            return ConfiguredModel.builder().modelFile(third == TripleBlockPart.LOWER ? (right ? bottomRight : bottomLeft) : (third == TripleBlockPart.MIDDLE ? (right ? middleRight : middleLeft) : (right ? topRight : topLeft))).rotationY(yRot).build();
        }, TallDoorBlock.POWERED, TallDoorBlock.WATERLOGGED);
    }
}