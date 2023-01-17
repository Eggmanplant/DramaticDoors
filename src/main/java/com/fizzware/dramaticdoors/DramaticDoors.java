package com.fizzware.dramaticdoors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fizzware.dramaticdoors.blockentities.DDBlockEntities;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.config.DDConfig;
import com.fizzware.dramaticdoors.crafting.DDAdvancementCompats;
import com.fizzware.dramaticdoors.crafting.DDRecipeCompats;
import com.fizzware.dramaticdoors.items.DDFuels;
import com.fizzware.dramaticdoors.items.DDItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class DramaticDoors implements ModInitializer
{
    public static final String MOD_ID = "dramaticdoors";
    
    public static final DDConfig CONFIG = new DDConfig();
    
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    
    public static final CreativeModeTab DD_MAIN_TAB = FabricItemGroupBuilder.build(new ResourceLocation(MOD_ID, "talldoors"), () -> { return new ItemStack(DDItems.TALL_OAK_DOOR); } );
    public static final CreativeModeTab DD_CHIPPED_TAB = FabricLoader.getInstance().isModLoaded("chipped") ? FabricItemGroupBuilder.build(new ResourceLocation(MOD_ID, "talldoors_chipped"), () -> { return new ItemStack(DDItems.TALL_CHIPPED_BIRCH_DOOR_07); } ) : null;
    public static final CreativeModeTab DD_MACAW_TAB = FabricLoader.getInstance().isModLoaded("mcwdoors") ? FabricItemGroupBuilder.build(new ResourceLocation(MOD_ID, "talldoors_macaw"), () -> { return new ItemStack(DDItems.TALL_MACAW_DARK_OAK_BARN_DOOR); } ) : null;
    
    @Override
	public void onInitialize() {
    	// Register stuff.
    	DDBlocks.registerBlocks();
    	DDItems.registerItems();
    	DDBlockEntities.registerBlockEntities();
    	DDFuels.addFuels();
    	DDRecipeCompats.initializeRecipes();
    	DDAdvancementCompats.initializeAdvancements();
	}
}
