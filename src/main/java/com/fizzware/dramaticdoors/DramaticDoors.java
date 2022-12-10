package com.fizzware.dramaticdoors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fizzware.dramaticdoors.blockentities.DDBlockEntities;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.crafting.DDAdvancementCompats;
import com.fizzware.dramaticdoors.crafting.DDRecipeCompats;
import com.fizzware.dramaticdoors.items.DDFuels;
import com.fizzware.dramaticdoors.items.DDItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class DramaticDoors implements ModInitializer
{
    public static final String MOD_ID = "dramaticdoors";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    
    public static final ItemGroup DD_MAIN_TAB = FabricItemGroup.builder(new Identifier(MOD_ID, "talldoors")).displayName(Text.translatable("itemGroup.dramaticdoors.talldoors")).icon(() -> { return new ItemStack(DDItems.TALL_OAK_DOOR); }).build();
    public static final ItemGroup DD_CHIPPED_TAB = FabricLoader.getInstance().isModLoaded("chipped") ? FabricItemGroup.builder(new Identifier(MOD_ID, "talldoors_chipped")).displayName(Text.translatable("itemGroup.dramaticdoors.talldoors_chipped")).icon(() -> { return new ItemStack(DDItems.TALL_CHIPPED_BIRCH_DOOR_07); } ).build() : null;
    public static final ItemGroup DD_MACAW_TAB = FabricLoader.getInstance().isModLoaded("mcwdoors") ? FabricItemGroup.builder(new Identifier(MOD_ID, "talldoors_macaw")).displayName(Text.translatable("itemGroup.dramaticdoors.talldoors_macaw")).icon(() -> { return new ItemStack(DDItems.TALL_MACAW_DARK_OAK_BARN_DOOR); } ).build() : null;
    
    @Override
	public void onInitialize() {
    	// Register stuff.
    	DDBlocks.registerBlocks();
    	DDItems.registerItems();
    	DDBlockEntities.registerBlockEntities();
    	DDItems.assignItemsToTabs();
    	DDFuels.addFuels();
    	DDRecipeCompats.initializeRecipes();
    	DDAdvancementCompats.initializeAdvancements();
	}
}
