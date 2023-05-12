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
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;

public class DDTechPackRegistry
{
	@SubscribeEvent
	public static void register(RegisterEvent event) {
		event.register(ForgeRegistries.Keys.BLOCKS, helper -> {
		    // Create: Alloyed
		    helper.register(DDNames.SHORT_STEEL, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("alloyed", "steel_door")), BlockSetType.IRON));
		    helper.register(DDNames.SHORT_LOCKED_STEEL, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("alloyed", "locked_steel_door")), BlockSetType.IRON));
		    
		    helper.register(DDNames.TALL_STEEL, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("alloyed", "steel_door")), BlockSetType.IRON));
		    helper.register(DDNames.TALL_LOCKED_STEEL, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("alloyed", "locked_steel_door")), BlockSetType.IRON));
		    
		    // Create: Deco
		    helper.register(DDNames.SHORT_ANDESITE, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("createdeco", "andesite_door")), BlockSetType.IRON));
		    helper.register(DDNames.SHORT_BRASS, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("createdeco", "brass_door")), BlockSetType.IRON));
		    helper.register(DDNames.SHORT_COPPER, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("createdeco", "copper_door")), BlockSetType.IRON));
		    helper.register(DDNames.SHORT_ZINC, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("createdeco", "zinc_door")), BlockSetType.IRON));
		    helper.register(DDNames.SHORT_LOCKED_ANDESITE, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("createdeco", "locked_andesite_door")), BlockSetType.IRON));
		    helper.register(DDNames.SHORT_LOCKED_BRASS, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("createdeco", "locked_brass_door")), BlockSetType.IRON));
		    helper.register(DDNames.SHORT_LOCKED_COPPER, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("createdeco", "locked_copper_door")), BlockSetType.IRON));
		    helper.register(DDNames.SHORT_LOCKED_ZINC, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("createdeco", "locked_zinc_door")), BlockSetType.IRON));
		
		    helper.register(DDNames.TALL_ANDESITE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("createdeco", "andesite_door")), BlockSetType.IRON));
		    helper.register(DDNames.TALL_BRASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("createdeco", "brass_door")), BlockSetType.IRON));
		    helper.register(DDNames.TALL_COPPER, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("createdeco", "copper_door")), BlockSetType.IRON));
		    helper.register(DDNames.TALL_ZINC, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("createdeco", "zinc_door")), BlockSetType.IRON));
		    helper.register(DDNames.TALL_LOCKED_ANDESITE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("createdeco", "locked_andesite_door")), BlockSetType.IRON));
		    helper.register(DDNames.TALL_LOCKED_BRASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("createdeco", "locked_brass_door")), BlockSetType.IRON));
		    helper.register(DDNames.TALL_LOCKED_COPPER, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("createdeco", "locked_copper_door")), BlockSetType.IRON));
		    helper.register(DDNames.TALL_LOCKED_ZINC, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("createdeco", "locked_zinc_door")), BlockSetType.IRON));
		    
		    // Create: Misc & Things
		    helper.register(DDNames.SHORT_ANDESITE_CASING, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("create_things_and_misc", "andesite_casing_door")), BlockSetType.OAK));
		    helper.register(DDNames.SHORT_BRASS_CASING, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("create_things_and_misc", "brass_casing_door")), BlockSetType.OAK));
		    helper.register(DDNames.SHORT_COPPER_CASING, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("create_things_and_misc", "copper_casing_door")), BlockSetType.OAK));    
		
		    helper.register(DDNames.TALL_ANDESITE_CASING, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("create_things_and_misc", "andesite_casing_door")), BlockSetType.OAK));
		    helper.register(DDNames.TALL_BRASS_CASING, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("create_things_and_misc", "brass_casing_door")), BlockSetType.OAK));
		    helper.register(DDNames.TALL_COPPER_CASING, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("create_things_and_misc", "copper_casing_door")), BlockSetType.OAK));    
		    
		    // Dustrial Decor
		    helper.register(DDNames.SHORT_CARDBOARD, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("dustrial_decor", "cardboard_door")), BlockSetType.OAK));
		    helper.register(DDNames.SHORT_CHAIN, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("dustrial_decor", "chain_door")), BlockSetType.IRON));
		    helper.register(DDNames.SHORT_INDUSTRIAL_IRON, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("dustrial_decor", "industrial_iron_door")), BlockSetType.IRON));
		    helper.register(DDNames.SHORT_IRON_BAR, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("dustrial_decor", "iron_bar_door")), BlockSetType.IRON));
		    helper.register(DDNames.SHORT_PADDED, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("dustrial_decor", "padded_door")), BlockSetType.IRON));
		    helper.register(DDNames.SHORT_RUSTY_IRON, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("dustrial_decor", "rusty_iron_door")), BlockSetType.IRON));
		    helper.register(DDNames.SHORT_RUSTY_SHEET_METAL, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("dustrial_decor", "rusty_sheet_metal_door")), BlockSetType.IRON));
		    helper.register(DDNames.SHORT_SHEET_METAL, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("dustrial_decor", "sheet_metal_door")), BlockSetType.IRON));
		
		    helper.register(DDNames.TALL_CARDBOARD, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("dustrial_decor", "cardboard_door")), BlockSetType.OAK));
		    helper.register(DDNames.TALL_CHAIN, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("dustrial_decor", "chain_door")), BlockSetType.IRON));
		    helper.register(DDNames.TALL_INDUSTRIAL_IRON, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("dustrial_decor", "industrial_iron_door")), BlockSetType.IRON));
		    helper.register(DDNames.TALL_IRON_BAR, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("dustrial_decor", "iron_bar_door")), BlockSetType.IRON));
		    helper.register(DDNames.TALL_PADDED, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("dustrial_decor", "padded_door")), BlockSetType.IRON));
		    helper.register(DDNames.TALL_RUSTY_IRON, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("dustrial_decor", "rusty_iron_door")), BlockSetType.IRON));
		    helper.register(DDNames.TALL_RUSTY_SHEET_METAL, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("dustrial_decor", "rusty_sheet_metal_door")), BlockSetType.IRON));
		    helper.register(DDNames.TALL_SHEET_METAL, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("dustrial_decor", "sheet_metal_door")), BlockSetType.IRON));

		    // Integrated Dynamics
		    helper.register(DDNames.SHORT_MENRIL, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("integrateddynamics", "menril_door")), BlockSetType.OAK));
		
		    helper.register(DDNames.TALL_MENRIL, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("integrateddynamics", "menril_door")), BlockSetType.OAK));
		    
		    // Tinkers Construct
			helper.register(DDNames.SHORT_BLOODSHROOM, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("tconstruct", "bloodshroom_door")), BlockSetType.CRIMSON));
			helper.register(DDNames.SHORT_GREENHEART, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("tconstruct", "greenheart_door")), BlockSetType.OAK));
			helper.register(DDNames.SHORT_SKYROOT, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("tconstruct", "skyroot_door")), BlockSetType.OAK));
		    
			helper.register(DDNames.TALL_BLOODSHROOM, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("tconstruct", "bloodshroom_door")), BlockSetType.CRIMSON));
			helper.register(DDNames.TALL_GREENHEART, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("tconstruct", "greenheart_door")), BlockSetType.OAK));
			helper.register(DDNames.TALL_SKYROOT, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("tconstruct", "skyroot_door")), BlockSetType.OAK));
		});
		event.register(ForgeRegistries.Keys.ITEMS, helper -> {
		    // Create: Alloyed
		    helper.register(DDNames.SHORT_STEEL, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_STEEL)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_LOCKED_STEEL, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LOCKED_STEEL)), DDItems.PROPERTIES));
		    
		    helper.register(DDNames.TALL_STEEL, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_STEEL)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_LOCKED_STEEL, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LOCKED_STEEL)), DDItems.PROPERTIES));
		    
		    // Create: Deco
		    helper.register(DDNames.SHORT_ANDESITE, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ANDESITE)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_BRASS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BRASS)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_COPPER, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_COPPER)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_ZINC, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ZINC)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_LOCKED_ANDESITE, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LOCKED_ANDESITE)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_LOCKED_BRASS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LOCKED_BRASS)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_LOCKED_COPPER, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LOCKED_COPPER)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_LOCKED_ZINC, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_LOCKED_ZINC)), DDItems.PROPERTIES));
		
		    helper.register(DDNames.TALL_ANDESITE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ANDESITE)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_BRASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BRASS)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_COPPER, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_COPPER)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_ZINC, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ZINC)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_LOCKED_ANDESITE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LOCKED_ANDESITE)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_LOCKED_BRASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LOCKED_BRASS)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_LOCKED_COPPER, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LOCKED_COPPER)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_LOCKED_ZINC, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_LOCKED_ZINC)), DDItems.PROPERTIES));
		
		    // Create: Misc & Things
		    helper.register(DDNames.SHORT_ANDESITE_CASING, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ANDESITE_CASING)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_BRASS_CASING, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BRASS_CASING)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_COPPER_CASING, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_COPPER_CASING)), DDItems.PROPERTIES));
		    
		    helper.register(DDNames.TALL_ANDESITE_CASING, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ANDESITE_CASING)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_BRASS_CASING, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BRASS_CASING)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_COPPER_CASING, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_COPPER_CASING)), DDItems.PROPERTIES));
		    
		    // Dustrial Decor
		    helper.register(DDNames.SHORT_CARDBOARD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CARDBOARD)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_CHAIN, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CHAIN)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_INDUSTRIAL_IRON, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_INDUSTRIAL_IRON)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_IRON_BAR, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_IRON_BAR)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_PADDED, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_PADDED)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_RUSTY_IRON, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUSTY_IRON)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_RUSTY_SHEET_METAL, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_RUSTY_SHEET_METAL)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_SHEET_METAL, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SHEET_METAL)), DDItems.PROPERTIES));
		    
		    helper.register(DDNames.TALL_CARDBOARD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CARDBOARD)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_CHAIN, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHAIN)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_INDUSTRIAL_IRON, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_INDUSTRIAL_IRON)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_IRON_BAR, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_IRON_BAR)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_PADDED, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_PADDED)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_RUSTY_IRON, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUSTY_IRON)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_RUSTY_SHEET_METAL, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_RUSTY_SHEET_METAL)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_SHEET_METAL, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SHEET_METAL)), DDItems.PROPERTIES));
		    
		    // Integrated Dynamics
		    helper.register(DDNames.SHORT_MENRIL, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MENRIL)), DDItems.PROPERTIES));
		    
		    helper.register(DDNames.TALL_MENRIL, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MENRIL)), DDItems.PROPERTIES));
		    
		    // Tinkers Construct
		    helper.register(DDNames.SHORT_BLOODSHROOM, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BLOODSHROOM)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_GREENHEART, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GREENHEART)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_SKYROOT, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_SKYROOT)), DDItems.PROPERTIES));
		
		    helper.register(DDNames.TALL_BLOODSHROOM, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BLOODSHROOM)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_GREENHEART, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GREENHEART)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_SKYROOT, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_SKYROOT)), DDItems.PROPERTIES));
		});
	}
}
