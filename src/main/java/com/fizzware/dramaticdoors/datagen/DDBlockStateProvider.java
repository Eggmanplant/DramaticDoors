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