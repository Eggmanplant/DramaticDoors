package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.items.DDItems;
import com.fizzware.dramaticdoors.items.TallDoorItem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;

public class DDManyIdeasDoorsRegistry
{
	@SubscribeEvent
	public static void register(RegisterEvent event) {
		event.register(ForgeRegistries.Keys.BLOCKS, helper -> {
			helper.register(DDNames.TALL_MANYIDEAS_COPPER_BAR, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_copper_bar"), Blocks.IRON_DOOR), BlockSetType.IRON));
			helper.register(DDNames.TALL_MANYIDEAS_COPPER_BARREL, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_copper_barrel"), Blocks.IRON_DOOR), BlockSetType.IRON));
			helper.register(DDNames.TALL_MANYIDEAS_COPPER_BRICK, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_copper_brick"), Blocks.IRON_DOOR), BlockSetType.IRON));
			helper.register(DDNames.TALL_MANYIDEAS_COPPER_CORRUGATED, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_copper_corrugated"), Blocks.IRON_DOOR), BlockSetType.IRON));
			helper.register(DDNames.TALL_MANYIDEAS_COPPER_FACTORY, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_copper_factory"), Blocks.IRON_DOOR), BlockSetType.IRON));
			helper.register(DDNames.TALL_MANYIDEAS_COPPER_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_copper_glass"), Blocks.IRON_DOOR), BlockSetType.IRON));
			helper.register(DDNames.TALL_MANYIDEAS_COPPER_MODERN, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_copper_modern"), Blocks.IRON_DOOR), BlockSetType.IRON));
			helper.register(DDNames.TALL_MANYIDEAS_COPPER_SHIP, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_copper_ship"), Blocks.IRON_DOOR), BlockSetType.IRON));
			helper.register(DDNames.TALL_MANYIDEAS_COPPER_SMOOTH_SANDSTONE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_copper_smooth_sandstone"), Blocks.IRON_DOOR), BlockSetType.IRON));
			helper.register(DDNames.TALL_MANYIDEAS_COPPER_STEAMPUNK, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_copper_steampunk"), Blocks.IRON_DOOR), BlockSetType.IRON));

			helper.register(DDNames.TALL_MANYIDEAS_IRON_BOOKSHELF, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_iron_bookshelf"), Blocks.IRON_DOOR), BlockSetType.IRON));
			helper.register(DDNames.TALL_MANYIDEAS_IRON_DWARF, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_iron_dwarf"), Blocks.IRON_DOOR), BlockSetType.IRON));
			helper.register(DDNames.TALL_MANYIDEAS_IRON_FANTASY, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_iron_fantasy"), Blocks.IRON_DOOR), BlockSetType.IRON));
			helper.register(DDNames.TALL_MANYIDEAS_IRON_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_iron_glass"), Blocks.IRON_DOOR), BlockSetType.IRON));
			helper.register(DDNames.TALL_MANYIDEAS_IRON_LABORATORY, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_iron_laboratory"), Blocks.IRON_DOOR), BlockSetType.IRON));
			helper.register(DDNames.TALL_MANYIDEAS_IRON_RUSTED, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_iron_rusted"), Blocks.IRON_DOOR), BlockSetType.IRON));
			helper.register(DDNames.TALL_MANYIDEAS_IRON_SAFE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_iron_safe"), Blocks.IRON_DOOR), BlockSetType.IRON));
			helper.register(DDNames.TALL_MANYIDEAS_IRON_SHIP, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_iron_ship"), Blocks.IRON_DOOR), BlockSetType.IRON));
			helper.register(DDNames.TALL_MANYIDEAS_IRON_SPACE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_iron_space"), Blocks.IRON_DOOR), BlockSetType.IRON));
			helper.register(DDNames.TALL_MANYIDEAS_IRON_STONE_BRICK, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_iron_stone_brick"), Blocks.IRON_DOOR), BlockSetType.IRON));

			helper.register(DDNames.TALL_MANYIDEAS_OAK_BLANK, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_oak_blank")), BlockSetType.OAK));
			helper.register(DDNames.TALL_MANYIDEAS_OAK_BOOKSHELF, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_oak_bookshelf")), BlockSetType.OAK));
			helper.register(DDNames.TALL_MANYIDEAS_OAK_CASSETTE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_oak_cassette")), BlockSetType.OAK));
			helper.register(DDNames.TALL_MANYIDEAS_OAK_FRENCH, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_oak_french")), BlockSetType.OAK));
			helper.register(DDNames.TALL_MANYIDEAS_OAK_FROSTED, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_oak_frosted")), BlockSetType.OAK));
			helper.register(DDNames.TALL_MANYIDEAS_OAK_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_oak_glass")), BlockSetType.OAK));
			helper.register(DDNames.TALL_MANYIDEAS_OAK_HEART, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_oak_heart")), BlockSetType.OAK));
			helper.register(DDNames.TALL_MANYIDEAS_OAK_ORIGIN, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_oak_origin")), BlockSetType.OAK));
			helper.register(DDNames.TALL_MANYIDEAS_OAK_RUSTIC, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_oak_rustic")), BlockSetType.OAK));
			helper.register(DDNames.TALL_MANYIDEAS_OAK_SHOJI, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_oak_shoji")), BlockSetType.OAK));

			helper.register(DDNames.TALL_MANYIDEAS_SPRUCE_BLANK, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_spruce_blank")), BlockSetType.SPRUCE));
			helper.register(DDNames.TALL_MANYIDEAS_SPRUCE_BOOKSHELF, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_spruce_bookshelf")), BlockSetType.SPRUCE));
			helper.register(DDNames.TALL_MANYIDEAS_SPRUCE_CASSETTE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_spruce_cassette")), BlockSetType.SPRUCE));
			helper.register(DDNames.TALL_MANYIDEAS_SPRUCE_FRENCH, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_spruce_french")), BlockSetType.SPRUCE));
			helper.register(DDNames.TALL_MANYIDEAS_SPRUCE_FROSTED, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_spruce_frosted")), BlockSetType.SPRUCE));
			helper.register(DDNames.TALL_MANYIDEAS_SPRUCE_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_spruce_glass")), BlockSetType.SPRUCE));
			helper.register(DDNames.TALL_MANYIDEAS_SPRUCE_HEART, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_spruce_heart")), BlockSetType.SPRUCE));
			helper.register(DDNames.TALL_MANYIDEAS_SPRUCE_ORIGIN, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_spruce_origin")), BlockSetType.SPRUCE));
			helper.register(DDNames.TALL_MANYIDEAS_SPRUCE_RUSTIC, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_spruce_rustic")), BlockSetType.SPRUCE));
			helper.register(DDNames.TALL_MANYIDEAS_SPRUCE_SHOJI, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_spruce_shoji")), BlockSetType.SPRUCE));

			helper.register(DDNames.TALL_MANYIDEAS_BIRCH_BLANK, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_birch_blank")), BlockSetType.BIRCH));
			helper.register(DDNames.TALL_MANYIDEAS_BIRCH_BOOKSHELF, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_birch_bookshelf")), BlockSetType.BIRCH));
			helper.register(DDNames.TALL_MANYIDEAS_BIRCH_CASSETTE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_birch_cassette")), BlockSetType.BIRCH));
			helper.register(DDNames.TALL_MANYIDEAS_BIRCH_FRENCH, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_birch_french")), BlockSetType.BIRCH));
			helper.register(DDNames.TALL_MANYIDEAS_BIRCH_FROSTED, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_birch_frosted")), BlockSetType.BIRCH));
			helper.register(DDNames.TALL_MANYIDEAS_BIRCH_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_birch_glass")), BlockSetType.BIRCH));
			helper.register(DDNames.TALL_MANYIDEAS_BIRCH_HEART, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_birch_heart")), BlockSetType.BIRCH));
			helper.register(DDNames.TALL_MANYIDEAS_BIRCH_ORIGIN, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_birch_origin")), BlockSetType.BIRCH));
			helper.register(DDNames.TALL_MANYIDEAS_BIRCH_RUSTIC, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_birch_rustic")), BlockSetType.BIRCH));
			helper.register(DDNames.TALL_MANYIDEAS_BIRCH_SHOJI, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_birch_shoji")), BlockSetType.BIRCH));

			helper.register(DDNames.TALL_MANYIDEAS_JUNGLE_BLANK, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_jungle_blank")), BlockSetType.JUNGLE));
			helper.register(DDNames.TALL_MANYIDEAS_JUNGLE_BOOKSHELF, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_jungle_bookshelf")), BlockSetType.JUNGLE));
			helper.register(DDNames.TALL_MANYIDEAS_JUNGLE_CASSETTE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_jungle_cassette")), BlockSetType.JUNGLE));
			helper.register(DDNames.TALL_MANYIDEAS_JUNGLE_FRENCH, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_jungle_french")), BlockSetType.JUNGLE));
			helper.register(DDNames.TALL_MANYIDEAS_JUNGLE_FROSTED, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_jungle_frosted")), BlockSetType.JUNGLE));
			helper.register(DDNames.TALL_MANYIDEAS_JUNGLE_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_jungle_glass")), BlockSetType.JUNGLE));
			helper.register(DDNames.TALL_MANYIDEAS_JUNGLE_HEART, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_jungle_heart")), BlockSetType.JUNGLE));
			helper.register(DDNames.TALL_MANYIDEAS_JUNGLE_ORIGIN, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_jungle_origin")), BlockSetType.JUNGLE));
			helper.register(DDNames.TALL_MANYIDEAS_JUNGLE_RUSTIC, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_jungle_rustic")), BlockSetType.JUNGLE));
			helper.register(DDNames.TALL_MANYIDEAS_JUNGLE_SHOJI, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_jungle_shoji")), BlockSetType.JUNGLE));

			helper.register(DDNames.TALL_MANYIDEAS_ACACIA_BLANK, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_acacia_blank")), BlockSetType.ACACIA));
			helper.register(DDNames.TALL_MANYIDEAS_ACACIA_BOOKSHELF, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_acacia_bookshelf")), BlockSetType.ACACIA));
			helper.register(DDNames.TALL_MANYIDEAS_ACACIA_CASSETTE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_acacia_cassette")), BlockSetType.ACACIA));
			helper.register(DDNames.TALL_MANYIDEAS_ACACIA_FRENCH, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_acacia_french")), BlockSetType.ACACIA));
			helper.register(DDNames.TALL_MANYIDEAS_ACACIA_FROSTED, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_acacia_frosted")), BlockSetType.ACACIA));
			helper.register(DDNames.TALL_MANYIDEAS_ACACIA_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_acacia_glass")), BlockSetType.ACACIA));
			helper.register(DDNames.TALL_MANYIDEAS_ACACIA_HEART, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_acacia_heart")), BlockSetType.ACACIA));
			helper.register(DDNames.TALL_MANYIDEAS_ACACIA_ORIGIN, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_acacia_origin")), BlockSetType.ACACIA));
			helper.register(DDNames.TALL_MANYIDEAS_ACACIA_RUSTIC, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_acacia_rustic")), BlockSetType.ACACIA));
			helper.register(DDNames.TALL_MANYIDEAS_ACACIA_SHOJI, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_acacia_shoji")), BlockSetType.ACACIA));

			helper.register(DDNames.TALL_MANYIDEAS_DARK_OAK_BLANK, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_dark_oak_blank")), BlockSetType.DARK_OAK));
			helper.register(DDNames.TALL_MANYIDEAS_DARK_OAK_BOOKSHELF, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_dark_oak_bookshelf")), BlockSetType.DARK_OAK));
			helper.register(DDNames.TALL_MANYIDEAS_DARK_OAK_CASSETTE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_dark_oak_cassette")), BlockSetType.DARK_OAK));
			helper.register(DDNames.TALL_MANYIDEAS_DARK_OAK_FRENCH, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_dark_oak_french")), BlockSetType.DARK_OAK));
			helper.register(DDNames.TALL_MANYIDEAS_DARK_OAK_FROSTED, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_dark_oak_frosted")), BlockSetType.DARK_OAK));
			helper.register(DDNames.TALL_MANYIDEAS_DARK_OAK_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_dark_oak_glass")), BlockSetType.DARK_OAK));
			helper.register(DDNames.TALL_MANYIDEAS_DARK_OAK_HEART, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_dark_oak_heart")), BlockSetType.DARK_OAK));
			helper.register(DDNames.TALL_MANYIDEAS_DARK_OAK_ORIGIN, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_dark_oak_origin")), BlockSetType.DARK_OAK));
			helper.register(DDNames.TALL_MANYIDEAS_DARK_OAK_RUSTIC, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_dark_oak_rustic")), BlockSetType.DARK_OAK));
			helper.register(DDNames.TALL_MANYIDEAS_DARK_OAK_SHOJI, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_dark_oak_shoji")), BlockSetType.DARK_OAK));

			helper.register(DDNames.TALL_MANYIDEAS_MANGROVE_BLANK, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_mangrove_blank")), BlockSetType.MANGROVE));
			helper.register(DDNames.TALL_MANYIDEAS_MANGROVE_BOOKSHELF, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_mangrove_bookshelf")), BlockSetType.MANGROVE));
			helper.register(DDNames.TALL_MANYIDEAS_MANGROVE_CASSETTE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_mangrove_cassette")), BlockSetType.MANGROVE));
			helper.register(DDNames.TALL_MANYIDEAS_MANGROVE_FRENCH, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_mangrove_french")), BlockSetType.MANGROVE));
			helper.register(DDNames.TALL_MANYIDEAS_MANGROVE_FROSTED, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_mangrove_frosted")), BlockSetType.MANGROVE));
			helper.register(DDNames.TALL_MANYIDEAS_MANGROVE_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_mangrove_glass")), BlockSetType.MANGROVE));
			helper.register(DDNames.TALL_MANYIDEAS_MANGROVE_HEART, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_mangrove_heart")), BlockSetType.MANGROVE));
			helper.register(DDNames.TALL_MANYIDEAS_MANGROVE_ORIGIN, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_mangrove_origin")), BlockSetType.MANGROVE));
			helper.register(DDNames.TALL_MANYIDEAS_MANGROVE_RUSTIC, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_mangrove_rustic")), BlockSetType.MANGROVE));
			helper.register(DDNames.TALL_MANYIDEAS_MANGROVE_SHOJI, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_mangrove_shoji")), BlockSetType.MANGROVE));

			helper.register(DDNames.TALL_MANYIDEAS_CRIMSON_BLANK, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_crimson_blank")), BlockSetType.CRIMSON));
			helper.register(DDNames.TALL_MANYIDEAS_CRIMSON_BOOKSHELF, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_crimson_bookshelf")), BlockSetType.CRIMSON));
			helper.register(DDNames.TALL_MANYIDEAS_CRIMSON_CASSETTE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_crimson_cassette")), BlockSetType.CRIMSON));
			helper.register(DDNames.TALL_MANYIDEAS_CRIMSON_FRENCH, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_crimson_french")), BlockSetType.CRIMSON));
			helper.register(DDNames.TALL_MANYIDEAS_CRIMSON_FROSTED, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_crimson_frosted")), BlockSetType.CRIMSON));
			helper.register(DDNames.TALL_MANYIDEAS_CRIMSON_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_crimson_glass")), BlockSetType.CRIMSON));
			helper.register(DDNames.TALL_MANYIDEAS_CRIMSON_HEART, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_crimson_heart")), BlockSetType.CRIMSON));
			helper.register(DDNames.TALL_MANYIDEAS_CRIMSON_ORIGIN, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_crimson_origin")), BlockSetType.CRIMSON));
			helper.register(DDNames.TALL_MANYIDEAS_CRIMSON_RUSTIC, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_crimson_rustic")), BlockSetType.CRIMSON));
			helper.register(DDNames.TALL_MANYIDEAS_CRIMSON_SHOJI, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_crimson_shoji")), BlockSetType.CRIMSON));

			helper.register(DDNames.TALL_MANYIDEAS_WARPED_BLANK, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_warped_blank")), BlockSetType.WARPED));
			helper.register(DDNames.TALL_MANYIDEAS_WARPED_BOOKSHELF, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_warped_bookshelf")), BlockSetType.WARPED));
			helper.register(DDNames.TALL_MANYIDEAS_WARPED_CASSETTE, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_warped_cassette")), BlockSetType.WARPED));
			helper.register(DDNames.TALL_MANYIDEAS_WARPED_FRENCH, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_warped_french")), BlockSetType.WARPED));
			helper.register(DDNames.TALL_MANYIDEAS_WARPED_FROSTED, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_warped_frosted")), BlockSetType.WARPED));
			helper.register(DDNames.TALL_MANYIDEAS_WARPED_GLASS, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_warped_glass")), BlockSetType.WARPED));
			helper.register(DDNames.TALL_MANYIDEAS_WARPED_HEART, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_warped_heart")), BlockSetType.WARPED));
			helper.register(DDNames.TALL_MANYIDEAS_WARPED_ORIGIN, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_warped_origin")), BlockSetType.WARPED));
			helper.register(DDNames.TALL_MANYIDEAS_WARPED_RUSTIC, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_warped_rustic")), BlockSetType.WARPED));
			helper.register(DDNames.TALL_MANYIDEAS_WARPED_SHOJI, new TallDoorBlock(DDBlocks.getBlockByKey(new ResourceLocation("manyideas_doors", "door_warped_shoji")), BlockSetType.WARPED));
		});
		event.register(ForgeRegistries.Keys.ITEMS, helper -> {
			helper.register(DDNames.TALL_MANYIDEAS_COPPER_BAR, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_BAR)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_COPPER_BARREL, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_BARREL)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_COPPER_BRICK, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_BRICK)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_COPPER_CORRUGATED, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_CORRUGATED)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_COPPER_FACTORY, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_FACTORY)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_COPPER_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_GLASS)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_COPPER_MODERN, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_MODERN)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_COPPER_SHIP, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_SHIP)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_COPPER_SMOOTH_SANDSTONE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_SMOOTH_SANDSTONE)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_COPPER_STEAMPUNK, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_COPPER_STEAMPUNK)), DDItems.PROPERTIES));

			helper.register(DDNames.TALL_MANYIDEAS_IRON_BOOKSHELF, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_BOOKSHELF)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_IRON_DWARF, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_DWARF)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_IRON_FANTASY, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_FANTASY)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_IRON_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_GLASS)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_IRON_LABORATORY, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_LABORATORY)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_IRON_RUSTED, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_RUSTED)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_IRON_SAFE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_SAFE)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_IRON_SHIP, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_SHIP)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_IRON_SPACE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_SPACE)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_IRON_STONE_BRICK, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_IRON_STONE_BRICK)), DDItems.PROPERTIES));

			helper.register(DDNames.TALL_MANYIDEAS_OAK_BLANK, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_OAK_BLANK)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_OAK_BOOKSHELF, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_OAK_BOOKSHELF)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_OAK_CASSETTE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_OAK_CASSETTE)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_OAK_FRENCH, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_OAK_FRENCH)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_OAK_FROSTED, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_OAK_FROSTED)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_OAK_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_OAK_GLASS)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_OAK_HEART, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_OAK_HEART)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_OAK_ORIGIN, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_OAK_ORIGIN)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_OAK_RUSTIC, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_OAK_RUSTIC)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_OAK_SHOJI, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_OAK_SHOJI)), DDItems.PROPERTIES));

			helper.register(DDNames.TALL_MANYIDEAS_SPRUCE_BLANK, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_BLANK)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_SPRUCE_BOOKSHELF, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_BOOKSHELF)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_SPRUCE_CASSETTE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_CASSETTE)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_SPRUCE_FRENCH, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_FRENCH)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_SPRUCE_FROSTED, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_FROSTED)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_SPRUCE_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_GLASS)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_SPRUCE_HEART, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_HEART)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_SPRUCE_ORIGIN, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_ORIGIN)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_SPRUCE_RUSTIC, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_RUSTIC)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_SPRUCE_SHOJI, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_SPRUCE_SHOJI)), DDItems.PROPERTIES));

			helper.register(DDNames.TALL_MANYIDEAS_BIRCH_BLANK, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_BLANK)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_BIRCH_BOOKSHELF, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_BOOKSHELF)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_BIRCH_CASSETTE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_CASSETTE)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_BIRCH_FRENCH, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_FRENCH)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_BIRCH_FROSTED, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_FROSTED)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_BIRCH_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_GLASS)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_BIRCH_HEART, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_HEART)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_BIRCH_ORIGIN, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_ORIGIN)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_BIRCH_RUSTIC, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_RUSTIC)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_BIRCH_SHOJI, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_BIRCH_SHOJI)), DDItems.PROPERTIES));

			helper.register(DDNames.TALL_MANYIDEAS_JUNGLE_BLANK, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_BLANK)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_JUNGLE_BOOKSHELF, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_BOOKSHELF)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_JUNGLE_CASSETTE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_CASSETTE)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_JUNGLE_FRENCH, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_FRENCH)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_JUNGLE_FROSTED, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_FROSTED)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_JUNGLE_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_GLASS)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_JUNGLE_HEART, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_HEART)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_JUNGLE_ORIGIN, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_ORIGIN)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_JUNGLE_RUSTIC, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_RUSTIC)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_JUNGLE_SHOJI, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_JUNGLE_SHOJI)), DDItems.PROPERTIES));

			helper.register(DDNames.TALL_MANYIDEAS_ACACIA_BLANK, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_BLANK)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_ACACIA_BOOKSHELF, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_BOOKSHELF)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_ACACIA_CASSETTE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_CASSETTE)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_ACACIA_FRENCH, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_FRENCH)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_ACACIA_FROSTED, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_FROSTED)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_ACACIA_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_GLASS)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_ACACIA_HEART, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_HEART)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_ACACIA_ORIGIN, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_ORIGIN)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_ACACIA_RUSTIC, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_RUSTIC)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_ACACIA_SHOJI, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_ACACIA_SHOJI)), DDItems.PROPERTIES));

			helper.register(DDNames.TALL_MANYIDEAS_DARK_OAK_BLANK, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_BLANK)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_DARK_OAK_BOOKSHELF, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_BOOKSHELF)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_DARK_OAK_CASSETTE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_CASSETTE)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_DARK_OAK_FRENCH, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_FRENCH)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_DARK_OAK_FROSTED, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_FROSTED)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_DARK_OAK_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_GLASS)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_DARK_OAK_HEART, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_HEART)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_DARK_OAK_ORIGIN, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_ORIGIN)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_DARK_OAK_RUSTIC, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_RUSTIC)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_DARK_OAK_SHOJI, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_DARK_OAK_SHOJI)), DDItems.PROPERTIES));

			helper.register(DDNames.TALL_MANYIDEAS_MANGROVE_BLANK, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_MANGROVE_BLANK)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_MANGROVE_BOOKSHELF, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_MANGROVE_BOOKSHELF)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_MANGROVE_CASSETTE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_MANGROVE_CASSETTE)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_MANGROVE_FRENCH, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_MANGROVE_FRENCH)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_MANGROVE_FROSTED, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_MANGROVE_FROSTED)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_MANGROVE_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_MANGROVE_GLASS)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_MANGROVE_HEART, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_MANGROVE_HEART)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_MANGROVE_ORIGIN, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_MANGROVE_ORIGIN)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_MANGROVE_RUSTIC, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_MANGROVE_RUSTIC)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_MANGROVE_SHOJI, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_MANGROVE_SHOJI)), DDItems.PROPERTIES));

			helper.register(DDNames.TALL_MANYIDEAS_CRIMSON_BLANK, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_BLANK)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_CRIMSON_BOOKSHELF, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_BOOKSHELF)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_CRIMSON_CASSETTE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_CASSETTE)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_CRIMSON_FRENCH, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_FRENCH)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_CRIMSON_FROSTED, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_FROSTED)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_CRIMSON_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_GLASS)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_CRIMSON_HEART, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_HEART)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_CRIMSON_ORIGIN, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_ORIGIN)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_CRIMSON_RUSTIC, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_RUSTIC)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_CRIMSON_SHOJI, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_SHOJI)), DDItems.PROPERTIES));

			helper.register(DDNames.TALL_MANYIDEAS_WARPED_BLANK, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_BLANK)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_WARPED_BOOKSHELF, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_BOOKSHELF)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_WARPED_CASSETTE, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_CASSETTE)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_WARPED_FRENCH, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_FRENCH)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_WARPED_FROSTED, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_FROSTED)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_WARPED_GLASS, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_GLASS)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_WARPED_HEART, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_HEART)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_WARPED_ORIGIN, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_ORIGIN)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_WARPED_RUSTIC, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_RUSTIC)), DDItems.PROPERTIES));
			helper.register(DDNames.TALL_MANYIDEAS_WARPED_SHOJI, new TallDoorItem(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_WARPED_SHOJI)), DDItems.PROPERTIES));
		});
	}
}
