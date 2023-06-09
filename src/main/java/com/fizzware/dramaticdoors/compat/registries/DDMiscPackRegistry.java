package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.blocks.ShortCopperDoorBlock;
import com.fizzware.dramaticdoors.blocks.ShortDoorBlock;
import com.fizzware.dramaticdoors.blocks.ShortFleshDoorBlock;
import com.fizzware.dramaticdoors.blocks.ShortFullFleshDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallCopperDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallFleshDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallFullFleshDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallStableDoorBlock;
import com.fizzware.dramaticdoors.items.DDItems;
import com.fizzware.dramaticdoors.items.ShortDoorItem;
import com.fizzware.dramaticdoors.items.TallDoorItem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.WeatheringCopper.WeatherState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;

public class DDMiscPackRegistry
{
	// Create referencable doors.
	public static final Block SHORT_COPPER_DOOR = new ShortCopperDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("everythingcopper", "copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.UNAFFECTED);
	public static final Block SHORT_EXPOSED_COPPER_DOOR = new ShortCopperDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("everythingcopper", "exposed_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.EXPOSED);
	public static final Block SHORT_WEATHERED_COPPER_DOOR = new ShortCopperDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("everythingcopper", "weathered_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.WEATHERED);
	public static final Block SHORT_OXIDIZED_COPPER_DOOR = new ShortCopperDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("everythingcopper", "oxidized_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.OXIDIZED);
	public static final Block SHORT_WAXED_COPPER_DOOR = new ShortCopperDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("everythingcopper", "waxed_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.UNAFFECTED);
	public static final Block SHORT_WAXED_EXPOSED_COPPER_DOOR = new ShortCopperDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("everythingcopper", "waxed_exposed_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.EXPOSED);
	public static final Block SHORT_WAXED_WEATHERED_COPPER_DOOR = new ShortCopperDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("everythingcopper", "waxed_weathered_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.WEATHERED);
	public static final Block SHORT_WAXED_OXIDIZED_COPPER_DOOR = new ShortCopperDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("everythingcopper", "waxed_oxidized_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.OXIDIZED);
	public static final Block TALL_COPPER_DOOR = new TallCopperDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("everythingcopper", "copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.UNAFFECTED);
	public static final Block TALL_EXPOSED_COPPER_DOOR = new TallCopperDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("everythingcopper", "exposed_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.EXPOSED);
	public static final Block TALL_WEATHERED_COPPER_DOOR = new TallCopperDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("everythingcopper", "weathered_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.WEATHERED);
	public static final Block TALL_OXIDIZED_COPPER_DOOR = new TallCopperDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("everythingcopper", "oxidized_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.OXIDIZED);
	public static final Block TALL_WAXED_COPPER_DOOR = new TallCopperDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("everythingcopper", "waxed_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.UNAFFECTED);
	public static final Block TALL_WAXED_EXPOSED_COPPER_DOOR = new TallCopperDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("everythingcopper", "waxed_exposed_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.EXPOSED);
	public static final Block TALL_WAXED_WEATHERED_COPPER_DOOR = new TallCopperDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("everythingcopper", "waxed_weathered_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.WEATHERED);
	public static final Block TALL_WAXED_OXIDIZED_COPPER_DOOR = new TallCopperDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("everythingcopper", "waxed_oxidized_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.OXIDIZED);
	
	// Register doors with special functionality here.
	@SubscribeEvent
	public static void register(RegisterEvent event) {
		event.register(ForgeRegistries.Keys.BLOCKS, helper -> {
			// Mo' Shiz
			helper.register(DDNames.SHORT_MS_IRON_BAR, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/iron_bar"), Blocks.IRON_DOOR), BlockSetType.IRON));
		    helper.register(DDNames.SHORT_MS_BAMBOO, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/bamboo")), BlockSetType.OAK));
		    helper.register(DDNames.SHORT_MS_CHERRY, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/cherry")), BlockSetType.OAK));
		    helper.register(DDNames.SHORT_MS_GLOWOOD, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/glowood")), BlockSetType.OAK));
		    helper.register(DDNames.SHORT_MS_HELLWOOD, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/hellwood")), BlockSetType.CRIMSON));
		    helper.register(DDNames.SHORT_MS_MAPLE, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/maple")), BlockSetType.OAK));
		    helper.register(DDNames.SHORT_MS_SILVERBELL, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/silverbell")), BlockSetType.OAK));
		    helper.register(DDNames.SHORT_MS_TIGERWOOD, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/tigerwood")), BlockSetType.OAK));
		    helper.register(DDNames.SHORT_MS_WILLOW, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/willow")), BlockSetType.OAK));
		    helper.register(DDNames.SHORT_MS_GLASS, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/glass")), BlockSetType.STONE));
		    helper.register(DDNames.SHORT_MS_SOUL_GLASS, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/soul_glass")), BlockSetType.STONE));
		    helper.register(DDNames.SHORT_MS_TINTED_GLASS, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/tinted_glass")), BlockSetType.STONE));
		    helper.register(DDNames.SHORT_MS_BLACK_GLASS, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/black_glass")), BlockSetType.STONE));
		    helper.register(DDNames.SHORT_MS_GREY_GLASS, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/grey_glass")), BlockSetType.STONE));
		    helper.register(DDNames.SHORT_MS_LIGHT_GREY_GLASS, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/light_grey_glass")), BlockSetType.STONE));
		    helper.register(DDNames.SHORT_MS_WHITE_GLASS, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/white_glass")), BlockSetType.STONE));
		    helper.register(DDNames.SHORT_MS_RED_GLASS, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/red_glass")), BlockSetType.STONE));
		    helper.register(DDNames.SHORT_MS_ORANGE_GLASS, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/orange_glass")), BlockSetType.STONE));
		    helper.register(DDNames.SHORT_MS_YELLOW_GLASS, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/yellow_glass")), BlockSetType.STONE));
		    helper.register(DDNames.SHORT_MS_LIME_GLASS, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/lime_glass")), BlockSetType.STONE));
		    helper.register(DDNames.SHORT_MS_GREEN_GLASS, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/green_glass")), BlockSetType.STONE));
		    helper.register(DDNames.SHORT_MS_CYAN_GLASS, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/cyan_glass")), BlockSetType.STONE));
		    helper.register(DDNames.SHORT_MS_BLUE_GLASS, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/blue_glass")), BlockSetType.STONE));
		    helper.register(DDNames.SHORT_MS_PURPLE_GLASS, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/purple_glass")), BlockSetType.STONE));
		    helper.register(DDNames.SHORT_MS_MAGENTA_GLASS, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/magenta_glass")), BlockSetType.STONE));
		    helper.register(DDNames.SHORT_MS_PINK_GLASS, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/pink_glassr")), BlockSetType.STONE));
		    helper.register(DDNames.SHORT_MS_LIGHT_BLUE_GLASS, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/light_blue_glass")), BlockSetType.STONE));
		    helper.register(DDNames.SHORT_MS_BROWN_GLASS, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/brown_glass")), BlockSetType.STONE));
		    
			helper.register(DDNames.TALL_MS_IRON_BAR, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/iron_bar"), Blocks.IRON_DOOR), BlockSetType.IRON));
		    helper.register(DDNames.TALL_MS_BAMBOO, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/bamboo")), BlockSetType.OAK));
		    helper.register(DDNames.TALL_MS_CHERRY, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/cherry")), BlockSetType.OAK));
		    helper.register(DDNames.TALL_MS_GLOWOOD, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/glowood")), BlockSetType.OAK));
		    helper.register(DDNames.TALL_MS_HELLWOOD, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/hellwood")), BlockSetType.CRIMSON));
		    helper.register(DDNames.TALL_MS_MAPLE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/maple")), BlockSetType.OAK));
		    helper.register(DDNames.TALL_MS_SILVERBELL, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/silverbell")), BlockSetType.OAK));
		    helper.register(DDNames.TALL_MS_TIGERWOOD, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/tigerwood")), BlockSetType.OAK));
		    helper.register(DDNames.TALL_MS_WILLOW, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/willow")), BlockSetType.OAK));
		    helper.register(DDNames.TALL_MS_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/glass")), BlockSetType.STONE));
		    helper.register(DDNames.TALL_MS_SOUL_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/soul_glass")), BlockSetType.STONE));
		    helper.register(DDNames.TALL_MS_TINTED_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/tinted_glass")), BlockSetType.STONE));
		    helper.register(DDNames.TALL_MS_BLACK_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/black_glass")), BlockSetType.STONE));
		    helper.register(DDNames.TALL_MS_GREY_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/grey_glass")), BlockSetType.STONE));
		    helper.register(DDNames.TALL_MS_LIGHT_GREY_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/light_grey_glass")), BlockSetType.STONE));
		    helper.register(DDNames.TALL_MS_WHITE_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/white_glass")), BlockSetType.STONE));
		    helper.register(DDNames.TALL_MS_RED_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/red_glass")), BlockSetType.STONE));
		    helper.register(DDNames.TALL_MS_ORANGE_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/orange_glass")), BlockSetType.STONE));
		    helper.register(DDNames.TALL_MS_YELLOW_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/yellow_glass")), BlockSetType.STONE));
		    helper.register(DDNames.TALL_MS_LIME_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/lime_glass")), BlockSetType.STONE));
		    helper.register(DDNames.TALL_MS_GREEN_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/green_glass")), BlockSetType.STONE));
		    helper.register(DDNames.TALL_MS_CYAN_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/cyan_glass")), BlockSetType.STONE));
		    helper.register(DDNames.TALL_MS_BLUE_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/blue_glass")), BlockSetType.STONE));
		    helper.register(DDNames.TALL_MS_PURPLE_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/purple_glass")), BlockSetType.STONE));
		    helper.register(DDNames.TALL_MS_MAGENTA_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/magenta_glass")), BlockSetType.STONE));
		    helper.register(DDNames.TALL_MS_PINK_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/pink_glassr")), BlockSetType.STONE));
		    helper.register(DDNames.TALL_MS_LIGHT_BLUE_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/light_blue_glass")), BlockSetType.STONE));
		    helper.register(DDNames.TALL_MS_BROWN_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("ms", "door/brown_glass")), BlockSetType.STONE));

		    // Architects Palette
		    helper.register(DDNames.SHORT_TWISTED, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("architects_palette", "twisted_door")), BlockSetType.WARPED));
		
		    helper.register(DDNames.TALL_TWISTED, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("architects_palette", "twisted_door")), BlockSetType.WARPED));
		
		    // Bamboo Everything
		    helper.register(DDNames.SHORT_BE_BAMBOO, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("bambooeverything", "bamboo_door")), BlockSetType.BAMBOO));
		    helper.register(DDNames.SHORT_BE_DRY_BAMBOO, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("bambooeverything", "dry_bamboo_door")), BlockSetType.BAMBOO));
		
		    helper.register(DDNames.TALL_BE_BAMBOO, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("bambooeverything", "bamboo_door")), BlockSetType.BAMBOO));
		    helper.register(DDNames.TALL_BE_DRY_BAMBOO, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("bambooeverything", "dry_bamboo_door")), BlockSetType.BAMBOO));
		    
		    // Biomancy
		    helper.register(DDNames.SHORT_FLESH, new ShortFleshDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("biomancy", "flesh_door")), BlockSetType.OAK));    
		    helper.register(DDNames.SHORT_FULL_FLESH, new ShortFullFleshDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("biomancy", "flesh_door")), BlockSetType.OAK));    
		    helper.register(DDNames.SHORT_FLESHKIN, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("biomancy", "flesh_door")), BlockSetType.OAK));    
		    
		    helper.register(DDNames.TALL_FLESH, new TallFleshDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("biomancy", "flesh_door")), BlockSetType.OAK));    
		    helper.register(DDNames.TALL_FULL_FLESH, new TallFullFleshDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("biomancy", "flesh_door")), BlockSetType.OAK));    
		    helper.register(DDNames.TALL_FLESHKIN, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("biomancy", "flesh_door")), BlockSetType.OAK));    
		    
		    //Blocks Plus
		    helper.register(DDNames.SHORT_BP_BAMBOO, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blocksplus", "bamboo_door")), BlockSetType.OAK));
		    helper.register(DDNames.SHORT_BP_MUSHROOM, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blocksplus", "mushroom_door")), BlockSetType.OAK));
		    helper.register(DDNames.SHORT_BP_COPPER, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blocksplus", "copper_door")), BlockSetType.IRON));
		    helper.register(DDNames.SHORT_BP_GOLDEN, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blocksplus", "golden_door")), BlockSetType.IRON));
		    helper.register(DDNames.SHORT_BP_DIAMOND, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blocksplus", "diamond_door")), BlockSetType.STONE));
		    helper.register(DDNames.SHORT_BP_EMERALD, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blocksplus", "emerald_door")), BlockSetType.STONE));
		    helper.register(DDNames.SHORT_BP_NETHERITE, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blocksplus", "netherite_door")), BlockSetType.IRON));
		    
		    helper.register(DDNames.TALL_BP_BAMBOO, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blocksplus", "bamboo_door")), BlockSetType.OAK));
		    helper.register(DDNames.TALL_BP_MUSHROOM, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blocksplus", "mushroom_door")), BlockSetType.OAK));
		    helper.register(DDNames.TALL_BP_COPPER, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blocksplus", "copper_door")), BlockSetType.IRON));
		    helper.register(DDNames.TALL_BP_GOLDEN, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blocksplus", "golden_door")), BlockSetType.IRON));
		    helper.register(DDNames.TALL_BP_DIAMOND, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blocksplus", "diamond_door")), BlockSetType.STONE));
		    helper.register(DDNames.TALL_BP_EMERALD, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blocksplus", "emerald_door")), BlockSetType.STONE));
		    helper.register(DDNames.TALL_BP_NETHERITE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("blocksplus", "netherite_door")), BlockSetType.IRON));
		    
		    // Caupona
		    helper.register(DDNames.SHORT_WALNUT, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("caupona", "walnut_door")), BlockSetType.OAK));    
		
		    helper.register(DDNames.TALL_WALNUT, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("caupona", "walnut_door")), BlockSetType.OAK));    
		    
		    // Cobblemon
			helper.register(DDNames.SHORT_APRICORN, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("cobblemon", "apricorn_door")), BlockSetType.OAK));
		
			helper.register(DDNames.TALL_APRICORN, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("cobblemon", "apricorn_door")), BlockSetType.OAK));

		    // Colourful Azaleas
		    helper.register(DDNames.SHORT_AZULE_AZALEA, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("colorfulazaleas", "azule_azalea_door")), BlockSetType.OAK));
		    helper.register(DDNames.SHORT_BRIGHT_AZALEA, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("colorfulazaleas", "bright_azalea_door")), BlockSetType.OAK));
		    helper.register(DDNames.SHORT_FISS_AZALEA, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("colorfulazaleas", "fiss_azalea_door")), BlockSetType.OAK));
		    helper.register(DDNames.SHORT_ROZE_AZALEA, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("colorfulazaleas", "roze_azalea_door")), BlockSetType.OAK));
		    helper.register(DDNames.SHORT_TECAL_AZALEA, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("colorfulazaleas", "tecal_azalea_door")), BlockSetType.OAK));
		    helper.register(DDNames.SHORT_TITANIUM_AZALEA, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("colorfulazaleas", "titanium_azalea_door")), BlockSetType.OAK));
		    helper.register(DDNames.SHORT_WALNUT_AZALEA, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("colorfulazaleas", "walnut_azalea_door")), BlockSetType.OAK));    
		    
		    helper.register(DDNames.TALL_AZULE_AZALEA, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("colorfulazaleas", "azule_azalea_door")), BlockSetType.OAK));
		    helper.register(DDNames.TALL_BRIGHT_AZALEA, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("colorfulazaleas", "bright_azalea_door")), BlockSetType.OAK));
		    helper.register(DDNames.TALL_FISS_AZALEA, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("colorfulazaleas", "fiss_azalea_door")), BlockSetType.OAK));
		    helper.register(DDNames.TALL_ROZE_AZALEA, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("colorfulazaleas", "roze_azalea_door")), BlockSetType.OAK));
		    helper.register(DDNames.TALL_TECAL_AZALEA, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("colorfulazaleas", "tecal_azalea_door")), BlockSetType.OAK));
		    helper.register(DDNames.TALL_TITANIUM_AZALEA, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("colorfulazaleas", "titanium_azalea_door")), BlockSetType.OAK));
		    helper.register(DDNames.TALL_WALNUT_AZALEA, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("colorfulazaleas", "walnut_azalea_door")), BlockSetType.OAK));    

		    // Copper Overhaul
		    helper.register(DDNames.SHORT_CO_COPPER, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("copperoverhaul", "copper_door")), BlockSetType.IRON));
		    helper.register(DDNames.SHORT_CO_EXPOSED_COPPER, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("copperoverhaul", "exposed_copper_door")), BlockSetType.IRON));
		    helper.register(DDNames.SHORT_CO_WEATHERED_COPPER, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("copperoverhaul", "weathered_copper_door")), BlockSetType.IRON));
		    helper.register(DDNames.SHORT_CO_OXIDIZED_COPPER, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("copperoverhaul", "oxidized_copper_door")), BlockSetType.IRON));
		    
		    helper.register(DDNames.TALL_CO_COPPER, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("copperoverhaul", "copper_door")), BlockSetType.IRON));
		    helper.register(DDNames.TALL_CO_EXPOSED_COPPER, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("copperoverhaul", "exposed_copper_door")), BlockSetType.IRON));
		    helper.register(DDNames.TALL_CO_WEATHERED_COPPER, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("copperoverhaul", "weathered_copper_door")), BlockSetType.IRON));
		    helper.register(DDNames.TALL_CO_OXIDIZED_COPPER, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("copperoverhaul", "oxidized_copper_door")), BlockSetType.IRON));
		    
		    // Everything is Copper
		    helper.register(DDNames.SHORT_EC_COPPER, SHORT_COPPER_DOOR);
		    helper.register(DDNames.SHORT_EC_EXPOSED_COPPER, SHORT_EXPOSED_COPPER_DOOR);
		    helper.register(DDNames.SHORT_EC_WEATHERED_COPPER, SHORT_WEATHERED_COPPER_DOOR);
		    helper.register(DDNames.SHORT_EC_OXIDIZED_COPPER, SHORT_OXIDIZED_COPPER_DOOR);
		    helper.register(DDNames.SHORT_EC_WAXED_COPPER, SHORT_WAXED_COPPER_DOOR);
		    helper.register(DDNames.SHORT_EC_WAXED_EXPOSED_COPPER, SHORT_WAXED_EXPOSED_COPPER_DOOR);
		    helper.register(DDNames.SHORT_EC_WAXED_WEATHERED_COPPER, SHORT_WAXED_WEATHERED_COPPER_DOOR);
		    helper.register(DDNames.SHORT_EC_WAXED_OXIDIZED_COPPER, SHORT_WAXED_OXIDIZED_COPPER_DOOR);
		    
		    helper.register(DDNames.TALL_EC_COPPER, TALL_COPPER_DOOR);
		    helper.register(DDNames.TALL_EC_EXPOSED_COPPER, TALL_EXPOSED_COPPER_DOOR);
		    helper.register(DDNames.TALL_EC_WEATHERED_COPPER, TALL_WEATHERED_COPPER_DOOR);
		    helper.register(DDNames.TALL_EC_OXIDIZED_COPPER, TALL_OXIDIZED_COPPER_DOOR);
		    helper.register(DDNames.TALL_EC_WAXED_COPPER, TALL_WAXED_COPPER_DOOR);
		    helper.register(DDNames.TALL_EC_WAXED_EXPOSED_COPPER, TALL_WAXED_EXPOSED_COPPER_DOOR);
		    helper.register(DDNames.TALL_EC_WAXED_WEATHERED_COPPER, TALL_WAXED_WEATHERED_COPPER_DOOR);
		    helper.register(DDNames.TALL_EC_WAXED_OXIDIZED_COPPER, TALL_WAXED_OXIDIZED_COPPER_DOOR);
		    
		    // Extended Mushrooms
		    helper.register(DDNames.SHORT_MUSHROOM, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("extendedmushrooms", "mushroom_door")), BlockSetType.OAK));
		    helper.register(DDNames.SHORT_GLOWSHROOM, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("extendedmushrooms", "glowshroom_door")), BlockSetType.OAK));
		    helper.register(DDNames.SHORT_POISONOUS_MUSHROOM, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("extendedmushrooms", "poisonous_mushroom_door")), BlockSetType.OAK));
		    helper.register(DDNames.SHORT_HONEY_FUNGUS, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("extendedmushrooms", "honey_fungus_door")), BlockSetType.OAK));
		    
		    helper.register(DDNames.TALL_MUSHROOM, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("extendedmushrooms", "mushroom_door")), BlockSetType.OAK));
		    helper.register(DDNames.TALL_GLOWSHROOM, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("extendedmushrooms", "glowshroom_door")), BlockSetType.OAK));
		    helper.register(DDNames.TALL_POISONOUS_MUSHROOM, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("extendedmushrooms", "poisonous_mushroom_door")), BlockSetType.OAK));
		    helper.register(DDNames.TALL_HONEY_FUNGUS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("extendedmushrooms", "honey_fungus_door")), BlockSetType.OAK));
		    
		    // Fruit Trees
		    helper.register(DDNames.SHORT_FT_CHERRY, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("fruittrees", "cherry_door")), BlockSetType.CHERRY));
		    //helper.register(DDNames.SHORT_FT_CHERRY_SLIDING, new ShortStableDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("fruittrees", "cherry_sliding_door")), BlockSetType.OAK));
		    helper.register(DDNames.SHORT_FT_CITRUS, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("fruittrees", "citrus_door")), BlockSetType.CHERRY));
		
		    helper.register(DDNames.TALL_FT_CHERRY, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("fruittrees", "cherry_door")), BlockSetType.CHERRY));
		    helper.register(DDNames.TALL_FT_CHERRY_SLIDING, new TallStableDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("fruittrees", "cherry_sliding_door")), BlockSetType.CHERRY));
		    helper.register(DDNames.TALL_FT_CITRUS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("fruittrees", "citrus_door")), BlockSetType.CHERRY));
		
		    // Graveyard
		    helper.register(DDNames.SHORT_DARK_IRON, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("graveyard", "dark_iron_door"), Blocks.IRON_DOOR), BlockSetType.IRON));
		
		    helper.register(DDNames.TALL_DARK_IRON, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("graveyard", "dark_iron_door"), Blocks.IRON_DOOR), BlockSetType.IRON));
		    
		    // Pokecube
		    helper.register(DDNames.SHORT_POKECUBE_ENIGMA, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("pokecube", "enigma_door")), BlockSetType.OAK));
		    helper.register(DDNames.SHORT_POKECUBE_LEPPA, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("pokecube", "leppa_door")), BlockSetType.OAK));
		    helper.register(DDNames.SHORT_POKECUBE_NANAB, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("pokecube", "nanab_door")), BlockSetType.OAK));
		    helper.register(DDNames.SHORT_POKECUBE_ORAN, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("pokecube", "oran_door")), BlockSetType.OAK));
		    helper.register(DDNames.SHORT_POKECUBE_PECHA, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("pokecube", "pecha_door")), BlockSetType.OAK));
		    helper.register(DDNames.SHORT_POKECUBE_SITRUS, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("pokecube", "sitrus_door")), BlockSetType.OAK));
		    helper.register(DDNames.SHORT_POKECUBE_AGED, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("pokecube", "aged_door")), BlockSetType.OAK));
		    helper.register(DDNames.SHORT_POKECUBE_CONCRETE, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("pokecube", "concrete_door")), BlockSetType.STONE));
		    helper.register(DDNames.SHORT_POKECUBE_CORRUPTED, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("pokecube", "corrupted_door")), BlockSetType.OAK));
		    helper.register(DDNames.SHORT_POKECUBE_DISTORTIC, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("pokecube", "distortic_door")), BlockSetType.OAK));
		    helper.register(DDNames.SHORT_POKECUBE_INVERTED, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("pokecube", "inverted_door")), BlockSetType.OAK));
		    helper.register(DDNames.SHORT_POKECUBE_MIRAGE, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("pokecube", "mirage_door")), BlockSetType.OAK));
		    helper.register(DDNames.SHORT_POKECUBE_TEMPORAL, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("pokecube", "temporal_door")), BlockSetType.OAK));
		    
		    helper.register(DDNames.TALL_POKECUBE_ENIGMA, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("pokecube", "enigma_door")), BlockSetType.OAK));
		    helper.register(DDNames.TALL_POKECUBE_LEPPA, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("pokecube", "leppa_door")), BlockSetType.OAK));
		    helper.register(DDNames.TALL_POKECUBE_NANAB, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("pokecube", "nanab_door")), BlockSetType.OAK));
		    helper.register(DDNames.TALL_POKECUBE_ORAN, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("pokecube", "oran_door")), BlockSetType.OAK));
		    helper.register(DDNames.TALL_POKECUBE_PECHA, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("pokecube", "pecha_door")), BlockSetType.OAK));
		    helper.register(DDNames.TALL_POKECUBE_SITRUS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("pokecube", "sitrus_door")), BlockSetType.OAK));
		    helper.register(DDNames.TALL_POKECUBE_AGED, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("pokecube", "aged_door")), BlockSetType.OAK));
		    helper.register(DDNames.TALL_POKECUBE_CONCRETE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("pokecube", "concrete_door")), BlockSetType.STONE));
		    helper.register(DDNames.TALL_POKECUBE_CORRUPTED, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("pokecube", "corrupted_door")), BlockSetType.OAK));
		    helper.register(DDNames.TALL_POKECUBE_DISTORTIC, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("pokecube", "distortic_door")), BlockSetType.OAK));
		    helper.register(DDNames.TALL_POKECUBE_INVERTED, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("pokecube", "inverted_door")), BlockSetType.OAK));
		    helper.register(DDNames.TALL_POKECUBE_MIRAGE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("pokecube", "mirage_door")), BlockSetType.OAK));
		    helper.register(DDNames.TALL_POKECUBE_TEMPORAL, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("pokecube", "temporal_door")), BlockSetType.OAK));

		    // Silent Gear
		    helper.register(DDNames.SHORT_NETHERWOOD, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("silentgear", "netherwood_door")), BlockSetType.CRIMSON));
		
		    helper.register(DDNames.TALL_NETHERWOOD, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("silentgear", "netherwood_door")), BlockSetType.CRIMSON));
		    
		    // Snowy Spirit
		    helper.register(DDNames.SHORT_GINGERBREAD, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("snowyspirit", "gingerbread_door")), BlockSetType.OAK));
		
		    helper.register(DDNames.TALL_GINGERBREAD, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("snowyspirit", "gingerbread_door")), BlockSetType.OAK));
		    
		    // Twigs
			helper.register(DDNames.SHORT_TWIGS_BAMBOO, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("twigs", "bamboo_door")), BlockSetType.BAMBOO));
		
			helper.register(DDNames.TALL_TWIGS_BAMBOO, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("twigs", "bamboo_door")), BlockSetType.BAMBOO));
		    
			// Yippee
			helper.register(DDNames.SHORT_MYSTICAL_OAK, new ShortDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("yippee", "mystical_oak_door")), BlockSetType.OAK));    
		
			helper.register(DDNames.TALL_MYSTICAL_OAK, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("yippee", "mystical_oak_door")), BlockSetType.OAK));    

		});
		event.register(ForgeRegistries.Keys.ITEMS, helper -> {
			// Mo' Shiz
		    helper.register(DDNames.SHORT_MS_IRON_BAR, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_IRON_BAR)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_MS_BAMBOO, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_BAMBOO)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_MS_CHERRY, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_CHERRY)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_MS_GLOWOOD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_GLOWOOD)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_MS_HELLWOOD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_HELLWOOD)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_MS_MAPLE, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_MAPLE)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_MS_SILVERBELL, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_SILVERBELL)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_MS_TIGERWOOD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_TIGERWOOD)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_MS_WILLOW, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_WILLOW)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_MS_GLASS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_GLASS)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_MS_SOUL_GLASS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_SOUL_GLASS)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_MS_TINTED_GLASS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_TINTED_GLASS)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_MS_BLACK_GLASS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_BLACK_GLASS)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_MS_GREY_GLASS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_GREY_GLASS)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_MS_LIGHT_GREY_GLASS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_LIGHT_GREY_GLASS)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_MS_WHITE_GLASS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_WHITE_GLASS)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_MS_RED_GLASS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_RED_GLASS)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_MS_ORANGE_GLASS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_ORANGE_GLASS)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_MS_YELLOW_GLASS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_YELLOW_GLASS)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_MS_LIME_GLASS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_LIME_GLASS)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_MS_GREEN_GLASS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_GREEN_GLASS)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_MS_CYAN_GLASS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_CYAN_GLASS)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_MS_BLUE_GLASS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_BLUE_GLASS)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_MS_PURPLE_GLASS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_PURPLE_GLASS)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_MS_MAGENTA_GLASS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_MAGENTA_GLASS)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_MS_PINK_GLASS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_PINK_GLASS)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_MS_LIGHT_BLUE_GLASS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_LIGHT_BLUE_GLASS)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_MS_BROWN_GLASS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MS_BROWN_GLASS)), DDItems.PROPERTIES));

		    helper.register(DDNames.TALL_MS_IRON_BAR, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_IRON_BAR)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_MS_BAMBOO, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_BAMBOO)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_MS_CHERRY, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_CHERRY)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_MS_GLOWOOD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_GLOWOOD)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_MS_HELLWOOD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_HELLWOOD)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_MS_MAPLE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_MAPLE)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_MS_SILVERBELL, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_SILVERBELL)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_MS_TIGERWOOD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_TIGERWOOD)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_MS_WILLOW, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_WILLOW)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_MS_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_GLASS)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_MS_SOUL_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_SOUL_GLASS)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_MS_TINTED_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_TINTED_GLASS)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_MS_BLACK_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_BLACK_GLASS)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_MS_GREY_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_GREY_GLASS)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_MS_LIGHT_GREY_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_LIGHT_GREY_GLASS)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_MS_WHITE_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_WHITE_GLASS)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_MS_RED_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_RED_GLASS)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_MS_ORANGE_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_ORANGE_GLASS)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_MS_YELLOW_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_YELLOW_GLASS)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_MS_LIME_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_LIME_GLASS)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_MS_GREEN_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_GREEN_GLASS)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_MS_CYAN_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_CYAN_GLASS)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_MS_BLUE_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_BLUE_GLASS)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_MS_PURPLE_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_PURPLE_GLASS)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_MS_MAGENTA_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_MAGENTA_GLASS)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_MS_PINK_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_PINK_GLASS)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_MS_LIGHT_BLUE_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_LIGHT_BLUE_GLASS)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_MS_BROWN_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MS_BROWN_GLASS)), DDItems.PROPERTIES));
		    
		    // Architects Palette
		    helper.register(DDNames.SHORT_TWISTED, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TWISTED)), DDItems.PROPERTIES));
		    
		    helper.register(DDNames.TALL_TWISTED, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TWISTED)), DDItems.PROPERTIES));
		
		    // Bamboo Everything
		    helper.register(DDNames.SHORT_BE_BAMBOO, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BE_BAMBOO)), DDItems.PROPERTIES));  
		    helper.register(DDNames.SHORT_BE_DRY_BAMBOO, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BE_DRY_BAMBOO)), DDItems.PROPERTIES));  
		    
		    helper.register(DDNames.TALL_BE_BAMBOO, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BE_BAMBOO)), DDItems.PROPERTIES));  
		    helper.register(DDNames.TALL_BE_DRY_BAMBOO, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BE_DRY_BAMBOO)), DDItems.PROPERTIES));  
		    
		    // Biomancy
		    helper.register(DDNames.SHORT_FLESH, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FLESH)), DDItems.PROPERTIES));  
		    helper.register(DDNames.SHORT_FULL_FLESH, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FULL_FLESH)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_FLESHKIN, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FLESHKIN)), DDItems.PROPERTIES));  
		
		    helper.register(DDNames.TALL_FLESH, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FLESH)), DDItems.PROPERTIES));  
		    helper.register(DDNames.TALL_FULL_FLESH, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FULL_FLESH)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_FLESHKIN, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FLESHKIN)), DDItems.PROPERTIES));  
		    
		    // Blocks+
		    helper.register(DDNames.SHORT_BP_BAMBOO, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BP_BAMBOO)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_BP_MUSHROOM, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BP_MUSHROOM)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_BP_COPPER, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BP_COPPER)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_BP_GOLDEN, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BP_GOLDEN)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_BP_DIAMOND, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BP_DIAMOND)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_BP_EMERALD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BP_EMERALD)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_BP_NETHERITE, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BP_NETHERITE)), DDItems.PROPERTIES.fireResistant()));
		    
		    helper.register(DDNames.TALL_BP_BAMBOO, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BP_BAMBOO)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_BP_MUSHROOM, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BP_MUSHROOM)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_BP_COPPER, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BP_COPPER)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_BP_GOLDEN, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BP_GOLDEN)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_BP_DIAMOND, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BP_DIAMOND)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_BP_EMERALD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BP_EMERALD)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_BP_NETHERITE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BP_NETHERITE)), DDItems.PROPERTIES.fireResistant()));
		    
		    // Caupona
		    helper.register(DDNames.SHORT_WALNUT, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WALNUT)), DDItems.PROPERTIES));
		
		    helper.register(DDNames.TALL_WALNUT, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WALNUT)), DDItems.PROPERTIES));
		    
		    // Cobblemon
		    helper.register(DDNames.SHORT_APRICORN, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_APRICORN)), DDItems.PROPERTIES));
		    
		    helper.register(DDNames.TALL_APRICORN, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_APRICORN)), DDItems.PROPERTIES));

		    // Colourful Azaleas
		    helper.register(DDNames.SHORT_AZULE_AZALEA, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_AZULE_AZALEA)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_BRIGHT_AZALEA, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_BRIGHT_AZALEA)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_FISS_AZALEA, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FISS_AZALEA)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_ROZE_AZALEA, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_ROZE_AZALEA)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_TECAL_AZALEA, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TECAL_AZALEA)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_TITANIUM_AZALEA, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TITANIUM_AZALEA)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_WALNUT_AZALEA, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_WALNUT_AZALEA)), DDItems.PROPERTIES));
		    
		    helper.register(DDNames.TALL_AZULE_AZALEA, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_AZULE_AZALEA)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_BRIGHT_AZALEA, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_BRIGHT_AZALEA)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_FISS_AZALEA, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FISS_AZALEA)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_ROZE_AZALEA, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_ROZE_AZALEA)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_TECAL_AZALEA, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TECAL_AZALEA)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_TITANIUM_AZALEA, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TITANIUM_AZALEA)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_WALNUT_AZALEA, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_WALNUT_AZALEA)), DDItems.PROPERTIES));
		    
		    // Copper Overhaul
		    helper.register(DDNames.SHORT_CO_COPPER, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CO_COPPER)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_CO_EXPOSED_COPPER, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CO_EXPOSED_COPPER)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_CO_WEATHERED_COPPER, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CO_WEATHERED_COPPER)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_CO_OXIDIZED_COPPER, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_CO_OXIDIZED_COPPER)), DDItems.PROPERTIES));
		    
		    helper.register(DDNames.TALL_CO_COPPER, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CO_COPPER)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_CO_EXPOSED_COPPER, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CO_EXPOSED_COPPER)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_CO_WEATHERED_COPPER, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CO_WEATHERED_COPPER)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_CO_OXIDIZED_COPPER, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CO_OXIDIZED_COPPER)), DDItems.PROPERTIES));
		    
		    // Everything Copper
		    helper.register(DDNames.SHORT_EC_COPPER, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_COPPER)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_EC_EXPOSED_COPPER, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_EXPOSED_COPPER)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_EC_WEATHERED_COPPER, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_WEATHERED_COPPER)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_EC_OXIDIZED_COPPER, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_OXIDIZED_COPPER)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_EC_WAXED_COPPER, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_WAXED_COPPER)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_EC_WAXED_EXPOSED_COPPER, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_WAXED_EXPOSED_COPPER)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_EC_WAXED_WEATHERED_COPPER, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_WAXED_WEATHERED_COPPER)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_EC_WAXED_OXIDIZED_COPPER, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_EC_WAXED_OXIDIZED_COPPER)), DDItems.PROPERTIES));
		    
		    helper.register(DDNames.TALL_EC_COPPER, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EC_COPPER)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_EC_EXPOSED_COPPER, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EC_EXPOSED_COPPER)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_EC_WEATHERED_COPPER, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EC_WEATHERED_COPPER)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_EC_OXIDIZED_COPPER, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EC_OXIDIZED_COPPER)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_EC_WAXED_COPPER, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EC_WAXED_COPPER)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_EC_WAXED_EXPOSED_COPPER, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EC_WAXED_EXPOSED_COPPER)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_EC_WAXED_WEATHERED_COPPER, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EC_WAXED_WEATHERED_COPPER)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_EC_WAXED_OXIDIZED_COPPER, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_EC_WAXED_OXIDIZED_COPPER)), DDItems.PROPERTIES));
		    
		    // Extended Mushrooms
		    helper.register(DDNames.SHORT_MUSHROOM, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MUSHROOM)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_GLOWSHROOM, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GLOWSHROOM)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_POISONOUS_MUSHROOM, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POISONOUS_MUSHROOM)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_HONEY_FUNGUS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_HONEY_FUNGUS)), DDItems.PROPERTIES));
		    
		    helper.register(DDNames.TALL_MUSHROOM, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MUSHROOM)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_GLOWSHROOM, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GLOWSHROOM)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_POISONOUS_MUSHROOM, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POISONOUS_MUSHROOM)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_HONEY_FUNGUS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_HONEY_FUNGUS)), DDItems.PROPERTIES));
		
		    // Fruit Trees
		    helper.register(DDNames.SHORT_FT_CHERRY, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FT_CHERRY)), DDItems.PROPERTIES));
		    //helper.register(DDNames.SHORT_FT_CHERRY_SLIDING, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FT_CHERRY_SLIDING)), addIfItemIsAvailable(new ResourceLocation("fruittrees", "cherry_sliding_door"), DDItems.PROPERTIES)));
		    helper.register(DDNames.SHORT_FT_CITRUS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_FT_CITRUS)), DDItems.PROPERTIES));
		    
		    helper.register(DDNames.TALL_FT_CHERRY, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FT_CHERRY)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_FT_CHERRY_SLIDING, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FT_CHERRY_SLIDING)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_FT_CITRUS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_FT_CITRUS)), DDItems.PROPERTIES));
		    
		    // Graveyard
		    helper.register(DDNames.SHORT_DARK_IRON, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_DARK_IRON)), DDItems.PROPERTIES));
		    
		    helper.register(DDNames.TALL_DARK_IRON, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_DARK_IRON)), DDItems.PROPERTIES));
		    
		    // Pokecube
		    helper.register(DDNames.SHORT_POKECUBE_ENIGMA, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POKECUBE_ENIGMA)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_POKECUBE_LEPPA, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POKECUBE_LEPPA)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_POKECUBE_NANAB, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POKECUBE_NANAB)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_POKECUBE_ORAN, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POKECUBE_ORAN)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_POKECUBE_PECHA, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POKECUBE_PECHA)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_POKECUBE_SITRUS, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POKECUBE_SITRUS)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_POKECUBE_AGED, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POKECUBE_AGED)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_POKECUBE_CONCRETE, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POKECUBE_CONCRETE)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_POKECUBE_CORRUPTED, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POKECUBE_CORRUPTED)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_POKECUBE_DISTORTIC, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POKECUBE_DISTORTIC)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_POKECUBE_INVERTED, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POKECUBE_INVERTED)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_POKECUBE_MIRAGE, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POKECUBE_MIRAGE)), DDItems.PROPERTIES));
		    helper.register(DDNames.SHORT_POKECUBE_TEMPORAL, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_POKECUBE_TEMPORAL)), DDItems.PROPERTIES));
		    
		    helper.register(DDNames.TALL_POKECUBE_ENIGMA, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POKECUBE_ENIGMA)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_POKECUBE_LEPPA, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POKECUBE_LEPPA)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_POKECUBE_NANAB, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POKECUBE_NANAB)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_POKECUBE_ORAN, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POKECUBE_ORAN)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_POKECUBE_PECHA, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POKECUBE_PECHA)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_POKECUBE_SITRUS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POKECUBE_SITRUS)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_POKECUBE_AGED, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POKECUBE_AGED)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_POKECUBE_CONCRETE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POKECUBE_CONCRETE)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_POKECUBE_CORRUPTED, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POKECUBE_CORRUPTED)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_POKECUBE_DISTORTIC, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POKECUBE_DISTORTIC)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_POKECUBE_INVERTED, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POKECUBE_INVERTED)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_POKECUBE_MIRAGE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POKECUBE_MIRAGE)), DDItems.PROPERTIES));
		    helper.register(DDNames.TALL_POKECUBE_TEMPORAL, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_POKECUBE_TEMPORAL)), DDItems.PROPERTIES));
		    
		    // Silent Gear
		    helper.register(DDNames.SHORT_NETHERWOOD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_NETHERWOOD)), DDItems.PROPERTIES));
		
		    helper.register(DDNames.TALL_NETHERWOOD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_NETHERWOOD)), DDItems.PROPERTIES));
		
		    // Snowy Spirit
		    helper.register(DDNames.SHORT_GINGERBREAD, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_GINGERBREAD)), DDItems.PROPERTIES));
		    
		    helper.register(DDNames.TALL_GINGERBREAD, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_GINGERBREAD)), DDItems.PROPERTIES));
		    
		    // Twigs
		    helper.register(DDNames.SHORT_TWIGS_BAMBOO, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_TWIGS_BAMBOO)), DDItems.PROPERTIES));
		
		    helper.register(DDNames.TALL_TWIGS_BAMBOO, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_TWIGS_BAMBOO)), DDItems.PROPERTIES));
		
		    // Yippee
		    helper.register(DDNames.SHORT_MYSTICAL_OAK, new ShortDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.SHORT_MYSTICAL_OAK)), DDItems.PROPERTIES));
		
		    helper.register(DDNames.TALL_MYSTICAL_OAK, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MYSTICAL_OAK)), DDItems.PROPERTIES));		    

		});
	}
}
