package com.fizzware.dramaticdoors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.crafting.DDAdvancementCompats;
import com.fizzware.dramaticdoors.crafting.DDRecipeCompats;
import com.fizzware.dramaticdoors.items.DDItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.registry.FuelRegistry;
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
    	DDRecipeCompats.initializeRecipes();
    	DDAdvancementCompats.initializeAdvancements();
		
		// Set up fuel. Only wooden doors can be used as fuel. Nether wood excluded.
		FuelRegistry.INSTANCE.add(DDItems.TALL_OAK_DOOR, 300);
		FuelRegistry.INSTANCE.add(DDItems.TALL_SPRUCE_DOOR, 300);
		FuelRegistry.INSTANCE.add(DDItems.TALL_BIRCH_DOOR, 300);
		FuelRegistry.INSTANCE.add(DDItems.TALL_JUNGLE_DOOR, 300);
		FuelRegistry.INSTANCE.add(DDItems.TALL_ACACIA_DOOR, 300);
		FuelRegistry.INSTANCE.add(DDItems.TALL_DARK_OAK_DOOR, 300);

    	FuelRegistry.INSTANCE.add(DDItems.TALL_CEILTRUNK_DOOR, 300);
		FuelRegistry.INSTANCE.add(DDItems.TALL_LUZAWOOD_DOOR, 300);
		
		FuelRegistry.INSTANCE.add(DDItems.TALL_CANOPY_DOOR, 300);
		FuelRegistry.INSTANCE.add(DDItems.TALL_DARKWOOD_DOOR, 300);
		FuelRegistry.INSTANCE.add(DDItems.TALL_MINEWOOD_DOOR, 300);
		FuelRegistry.INSTANCE.add(DDItems.TALL_SORTINGWOOD_DOOR, 300);
		FuelRegistry.INSTANCE.add(DDItems.TALL_TIMEWOOD_DOOR, 300);
		FuelRegistry.INSTANCE.add(DDItems.TALL_TRANSWOOD_DOOR, 300);
		FuelRegistry.INSTANCE.add(DDItems.TALL_TWILIGHT_OAK_DOOR, 300);
		FuelRegistry.INSTANCE.add(DDItems.TALL_TWILIGHT_MANGROVE_DOOR, 300);
    }
}
