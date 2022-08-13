package com.fizzware.dramaticdoors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.crafting.DDAdvancementCompats;
import com.fizzware.dramaticdoors.crafting.DDRecipeCompats;
import com.fizzware.dramaticdoors.items.DDFuels;
import com.fizzware.dramaticdoors.items.DDItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class DramaticDoors implements ModInitializer
{
    public static final String MOD_ID = "dramaticdoors";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    
    public static final ItemGroup DD_TAB = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "talldoors"), () -> { return new ItemStack(DDItems.TALL_OAK_DOOR); } );
    
    @Override
	public void onInitialize() {
    	// Register stuff.
    	DDBlocks.registerBlocks();
    	DDItems.registerItems();
    	DDFuels.addFuels();
    	DDRecipeCompats.initializeRecipes();
    	DDAdvancementCompats.initializeAdvancements();
    }
}
