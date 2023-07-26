package com.fizzware.dramaticdoors;

import com.fizzware.dramaticdoors.blockentities.DDBlockEntities;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.crafting.DDAdvancementCompats;
import com.fizzware.dramaticdoors.crafting.DDRecipeCompats;
import com.fizzware.dramaticdoors.items.DDFuels;
import com.fizzware.dramaticdoors.items.DDItems;
import net.fabricmc.api.ModInitializer;

public class DramaticDoors implements ModInitializer
{
    public static final String MOD_ID = "dramaticdoors";
    
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
