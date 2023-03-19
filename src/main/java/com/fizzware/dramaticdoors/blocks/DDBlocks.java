package com.fizzware.dramaticdoors.blocks;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DramaticDoors;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.WeatheringCopper.WeatherState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DDBlocks {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DramaticDoors.MOD_ID);
	
	// Vanilla
    public static final RegistryObject<Block> TALL_IRON_DOOR = BLOCKS.register(DDNames.TALL_IRON, () -> new TallDoorBlock(Blocks.IRON_DOOR, BlockSetType.IRON));
    public static final RegistryObject<Block> TALL_OAK_DOOR = BLOCKS.register(DDNames.TALL_OAK, () -> new TallDoorBlock(Blocks.OAK_DOOR, BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_SPRUCE_DOOR = BLOCKS.register(DDNames.TALL_SPRUCE, () -> new TallDoorBlock(Blocks.SPRUCE_DOOR, BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BIRCH_DOOR = BLOCKS.register(DDNames.TALL_BIRCH, () -> new TallDoorBlock(Blocks.BIRCH_DOOR, BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_JUNGLE_DOOR = BLOCKS.register(DDNames.TALL_JUNGLE, () -> new TallDoorBlock(Blocks.JUNGLE_DOOR, BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_ACACIA_DOOR = BLOCKS.register(DDNames.TALL_ACACIA, () -> new TallDoorBlock(Blocks.ACACIA_DOOR, BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_DARK_OAK_DOOR = BLOCKS.register(DDNames.TALL_DARK_OAK, () -> new TallDoorBlock(Blocks.DARK_OAK_DOOR, BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_MANGROVE_DOOR = BLOCKS.register(DDNames.TALL_MANGROVE, () -> new TallDoorBlock(Blocks.MANGROVE_DOOR, BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BAMBOO_DOOR = BLOCKS.register(DDNames.TALL_BAMBOO, () -> new TallDoorBlock(Blocks.BAMBOO_DOOR, BlockSetType.BAMBOO, FeatureFlags.UPDATE_1_20));
    public static final RegistryObject<Block> TALL_CHERRY_DOOR = BLOCKS.register(DDNames.TALL_CHERRY, () -> new TallDoorBlock(Blocks.CHERRY_DOOR, BlockSetType.CHERRY, FeatureFlags.UPDATE_1_20));
    public static final RegistryObject<Block> TALL_CRIMSON_DOOR = BLOCKS.register(DDNames.TALL_CRIMSON, () -> new TallDoorBlock(Blocks.CRIMSON_DOOR, BlockSetType.CRIMSON));
    public static final RegistryObject<Block> TALL_WARPED_DOOR = BLOCKS.register(DDNames.TALL_WARPED, () -> new TallDoorBlock(Blocks.WARPED_DOOR, BlockSetType.WARPED));
    
    // Biomes O' Plenty
    public static final RegistryObject<Block> TALL_BOP_CHERRY_DOOR = BLOCKS.register(DDNames.TALL_BOP_CHERRY, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "cherry_door")), BlockSetType.CHERRY));
    public static final RegistryObject<Block> TALL_BOP_DEAD_DOOR = BLOCKS.register(DDNames.TALL_BOP_DEAD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "dead_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BOP_FIR_DOOR = BLOCKS.register(DDNames.TALL_BOP_FIR, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "fir_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BOP_HELLBARK_DOOR = BLOCKS.register(DDNames.TALL_BOP_HELLBARK, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "hellbark_door")), BlockSetType.CRIMSON));
    public static final RegistryObject<Block> TALL_BOP_JACARANDA_DOOR = BLOCKS.register(DDNames.TALL_BOP_JACARANDA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "jacaranda_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BOP_MAGIC_DOOR = BLOCKS.register(DDNames.TALL_BOP_MAGIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "magic_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BOP_MAHOGANY_DOOR = BLOCKS.register(DDNames.TALL_BOP_MAHOGANY, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "mahogany_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BOP_PALM_DOOR = BLOCKS.register(DDNames.TALL_BOP_PALM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "palm_door")), BlockSetType.BAMBOO));
    public static final RegistryObject<Block> TALL_BOP_REDWOOD_DOOR = BLOCKS.register(DDNames.TALL_BOP_REDWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "redwood_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BOP_UMBRAN_DOOR = BLOCKS.register(DDNames.TALL_BOP_UMBRAN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "umbran_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BOP_WILLOW_DOOR = BLOCKS.register(DDNames.TALL_BOP_WILLOW, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomesoplenty", "willow_door")), BlockSetType.OAK));
    
    // Oh the Biomes You'll Go
    public static final RegistryObject<Block> TALL_BYG_ASPEN_DOOR = BLOCKS.register(DDNames.TALL_BYG_ASPEN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "aspen_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BYG_BAOBAB_DOOR = BLOCKS.register(DDNames.TALL_BYG_BAOBAB, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "baobab_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BYG_BLUE_ENCHANTED_DOOR = BLOCKS.register(DDNames.TALL_BYG_BLUE_ENCHANTED, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "blue_enchanted_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BYG_BULBIS_DOOR = BLOCKS.register(DDNames.TALL_BYG_BULBIS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "bulbis_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BYG_CHERRY_DOOR = BLOCKS.register(DDNames.TALL_BYG_CHERRY, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "cherry_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BYG_CIKA_DOOR = BLOCKS.register(DDNames.TALL_BYG_CIKA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "cika_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BYG_CYPRESS_DOOR = BLOCKS.register(DDNames.TALL_BYG_CYPRESS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "cypress_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BYG_EBONY_DOOR = BLOCKS.register(DDNames.TALL_BYG_EBONY, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "ebony_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BYG_EMBUR_DOOR = BLOCKS.register(DDNames.TALL_BYG_EMBUR, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "embur_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BYG_ETHER_DOOR = BLOCKS.register(DDNames.TALL_BYG_ETHER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "ether_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BYG_FIR_DOOR = BLOCKS.register(DDNames.TALL_BYG_FIR, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "fir_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BYG_FLORUS_DOOR = BLOCKS.register(DDNames.TALL_BYG_FLORUS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "florus_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BYG_GREEN_ENCHANTED_DOOR = BLOCKS.register(DDNames.TALL_BYG_GREEN_ENCHANTED, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "green_enchanted_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BYG_HOLLY_DOOR = BLOCKS.register(DDNames.TALL_BYG_HOLLY, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "holly_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BYG_IMPARIUS_DOOR = BLOCKS.register(DDNames.TALL_BYG_IMPARIUS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "imparius_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BYG_IRONWOOD_DOOR = BLOCKS.register(DDNames.TALL_BYG_IRONWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "ironwood_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BYG_JACARANDA_DOOR = BLOCKS.register(DDNames.TALL_BYG_JACARANDA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "jacaranda_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BYG_LAMENT_DOOR = BLOCKS.register(DDNames.TALL_BYG_LAMENT, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "lament_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BYG_MAHOGANY_DOOR = BLOCKS.register(DDNames.TALL_BYG_MAHOGANY, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "mahogany_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BYG_MAPLE_DOOR = BLOCKS.register(DDNames.TALL_BYG_MAPLE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "maple_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BYG_NIGHTSHADE_DOOR = BLOCKS.register(DDNames.TALL_BYG_NIGHTSHADE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "nightshade_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BYG_PALM_DOOR = BLOCKS.register(DDNames.TALL_BYG_PALM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "palm_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BYG_PINE_DOOR = BLOCKS.register(DDNames.TALL_BYG_PINE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "pine_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BYG_RAINBOW_EUCALYPTUS_DOOR = BLOCKS.register(DDNames.TALL_BYG_RAINBOW_EUCALYPTUS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "rainbow_eucalyptus_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BYG_REDWOOD_DOOR = BLOCKS.register(DDNames.TALL_BYG_REDWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "redwood_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BYG_SKYRIS_DOOR = BLOCKS.register(DDNames.TALL_BYG_SKYRIS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "skyris_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BYG_SOUL_SHROOM_DOOR = BLOCKS.register(DDNames.TALL_BYG_SOUL_SHROOM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "soul_shroom_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BYG_SYTHIAN_DOOR = BLOCKS.register(DDNames.TALL_BYG_SYTHIAN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "sythian_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BYG_WHITE_MANGROVE_DOOR = BLOCKS.register(DDNames.TALL_BYG_WHITE_MANGROVE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "mangrove_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BYG_WILLOW_DOOR = BLOCKS.register(DDNames.TALL_BYG_WILLOW, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "willow_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BYG_WITCH_HAZEL_DOOR = BLOCKS.register(DDNames.TALL_BYG_WITCH_HAZEL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "witch_hazel_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BYG_ZELKOVA_DOOR = BLOCKS.register(DDNames.TALL_BYG_ZELKOVA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("byg", "zelkova_door")), BlockSetType.OAK));
    
    // Prehistoric Fauna
    public static final RegistryObject<Block> TALL_ARAUCARIA_DOOR = BLOCKS.register(DDNames.TALL_ARAUCARIA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("prehistoricfauna", "araucaria_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_HEIDIPHYLLUM_DOOR = BLOCKS.register(DDNames.TALL_HEIDIPHYLLUM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("prehistoricfauna", "heidiphyllum_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_LIRIODENDRITES_DOOR = BLOCKS.register(DDNames.TALL_LIRIODENDRITES, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("prehistoricfauna", "liriodendrites_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_METASEQUOIA_DOOR = BLOCKS.register(DDNames.TALL_METASEQUOIA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("prehistoricfauna", "metasequoia_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_PROTOJUNIPEROXYLON_DOOR = BLOCKS.register(DDNames.TALL_PROTOJUNIPEROXYLON, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("prehistoricfauna", "protojuniperoxylon_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_PROTOPICEOXYLON_DOOR = BLOCKS.register(DDNames.TALL_PROTOPICEOXYLON, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("prehistoricfauna", "protopiceoxylon_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_ZAMITES_DOOR = BLOCKS.register(DDNames.TALL_ZAMITES, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("prehistoricfauna", "zamites_door")), BlockSetType.OAK));
    
    // Regions Unexplored
    public static final RegistryObject<Block> TALL_RUE_BAOBAB_DOOR = BLOCKS.register(DDNames.TALL_RUE_BAOBAB, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("regions_unexplored", "baobab_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_RUE_BLACKWOOD_DOOR = BLOCKS.register(DDNames.TALL_RUE_BLACKWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("regions_unexplored", "blackwood_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_RUE_CHERRY_DOOR = BLOCKS.register(DDNames.TALL_RUE_CHERRY, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("regions_unexplored", "cherry_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_RUE_CYPRESS_DOOR = BLOCKS.register(DDNames.TALL_RUE_CYPRESS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("regions_unexplored", "cypress_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_RUE_DEAD_DOOR = BLOCKS.register(DDNames.TALL_RUE_DEAD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("regions_unexplored", "dead_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_RUE_EUCALYPTUS_DOOR = BLOCKS.register(DDNames.TALL_RUE_EUCALYPTUS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("regions_unexplored", "eucalyptus_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_RUE_JOSHUA_DOOR = BLOCKS.register(DDNames.TALL_RUE_JOSHUA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("regions_unexplored", "joshua_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_RUE_LARCH_DOOR = BLOCKS.register(DDNames.TALL_RUE_LARCH, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("regions_unexplored", "larch_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_RUE_MAPLE_DOOR = BLOCKS.register(DDNames.TALL_RUE_MAPLE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("regions_unexplored", "maple_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_RUE_MAUVE_DOOR = BLOCKS.register(DDNames.TALL_RUE_MAUVE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("regions_unexplored", "mauve_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_RUE_PALM_DOOR = BLOCKS.register(DDNames.TALL_RUE_PALM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("regions_unexplored", "palm_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_RUE_PINE_DOOR = BLOCKS.register(DDNames.TALL_RUE_PINE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("regions_unexplored", "pine_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_RUE_REDWOOD_DOOR = BLOCKS.register(DDNames.TALL_RUE_REDWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("regions_unexplored", "redwood_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_RUE_WILLOW_DOOR = BLOCKS.register(DDNames.TALL_RUE_WILLOW, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("regions_unexplored", "willow_door")), BlockSetType.OAK));
    
    // Twilight Forest
    public static final RegistryObject<Block> TALL_CANOPY_DOOR = BLOCKS.register(DDNames.TALL_CANOPY, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("twilightforest", "canopy_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_DARKWOOD_DOOR = BLOCKS.register(DDNames.TALL_DARKWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("twilightforest", "dark_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_TWILIGHT_MANGROVE_DOOR = BLOCKS.register(DDNames.TALL_TWILIGHT_MANGROVE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("twilightforest", "mangrove_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_MINEWOOD_DOOR = BLOCKS.register(DDNames.TALL_MINEWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("twilightforest", "mining_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_SORTINGWOOD_DOOR = BLOCKS.register(DDNames.TALL_SORTINGWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("twilightforest", "sorting_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_TIMEWOOD_DOOR = BLOCKS.register(DDNames.TALL_TIMEWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("twilightforest", "time_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_TRANSWOOD_DOOR = BLOCKS.register(DDNames.TALL_TRANSWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("twilightforest", "transformation_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_TWILIGHT_OAK_DOOR = BLOCKS.register(DDNames.TALL_TWILIGHT_OAK, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("twilightforest", "twilight_oak_door")), BlockSetType.OAK));
    
    public static final RegistryObject<Block> TALL_TOWERWOOD_DOOR = BLOCKS.register(DDNames.TALL_TOWERWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("tflostblocks", "towerwood_door")), BlockSetType.OAK));
    
    // Atmospheric
    public static final RegistryObject<Block> TALL_ASPEN_DOOR = BLOCKS.register(DDNames.TALL_ASPEN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("atmospheric", "aspen_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_GRIMWOOD_DOOR = BLOCKS.register(DDNames.TALL_GRIMWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("atmospheric", "grimwood_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_KOUSA_DOOR = BLOCKS.register(DDNames.TALL_KOUSA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("atmospheric", "kousa_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_MORADO_DOOR = BLOCKS.register(DDNames.TALL_MORADO, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("atmospheric", "morado_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_ROSEWOOD_DOOR = BLOCKS.register(DDNames.TALL_ROSEWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("atmospheric", "rosewood_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_YUCCA_DOOR = BLOCKS.register(DDNames.TALL_YUCCA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("atmospheric", "yucca_door")), BlockSetType.OAK));
    
    // Autumnity
    public static final RegistryObject<Block> TALL_MAPLE_DOOR = BLOCKS.register(DDNames.TALL_MAPLE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("autumnity", "maple_door")), BlockSetType.OAK));
    
    // Buzzier Bees
    public static final RegistryObject<Block> TALL_HONEYCOMB_DOOR = BLOCKS.register(DDNames.TALL_HONEYCOMB, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("buzzier_bees", "honeycomb_door")), BlockSetType.OAK));
    
    // Caverns & Chasms
    public static final RegistryObject<Block> TALL_AZALEA_DOOR = BLOCKS.register(DDNames.TALL_AZALEA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("caverns_and_chasms", "azalea_door")), BlockSetType.OAK));
    
    // Endergetic Expansion
    public static final RegistryObject<Block> TALL_POISE_DOOR = BLOCKS.register(DDNames.TALL_POISE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("endergetic", "poise_door")), BlockSetType.OAK));
    
    // Environmental
    public static final RegistryObject<Block> TALL_DARK_CHERRY_DOOR = BLOCKS.register(DDNames.TALL_DARK_CHERRY, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("environmental", "cherry_door")), BlockSetType.CHERRY));
    public static final RegistryObject<Block> TALL_WILLOW_DOOR = BLOCKS.register(DDNames.TALL_WILLOW, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("environmental", "willow_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_WISTERIA_DOOR = BLOCKS.register(DDNames.TALL_WISTERIA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("environmental", "wisteria_door")), BlockSetType.OAK));
    
    // Upgrade Aquatic
    public static final RegistryObject<Block> TALL_DRIFTWOOD_DOOR = BLOCKS.register(DDNames.TALL_DRIFTWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("upgrade_aquatic", "driftwood_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_RIVER_DOOR = BLOCKS.register(DDNames.TALL_RIVER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("upgrade_aquatic", "river_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_GLASS_DOOR = BLOCKS.register(DDNames.TALL_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("upgrade_aquatic", "glass_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_TOOTH_DOOR = BLOCKS.register(DDNames.TALL_TOOTH, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("upgrade_aquatic", "tooth_door")), BlockSetType.OAK));
    
    // Abundance
    public static final RegistryObject<Block> TALL_JACARANDA_DOOR = BLOCKS.register(DDNames.TALL_JACARANDA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("abundance", "jacaranda_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_REDBUD_DOOR = BLOCKS.register(DDNames.TALL_REDBUD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("abundance", "redbud_door")), BlockSetType.OAK));
    
    // Bayou Blues
    public static final RegistryObject<Block> TALL_CYPRESS_DOOR = BLOCKS.register(DDNames.TALL_CYPRESS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("cypress", "cypress_door")), BlockSetType.OAK));
    
    // Enhanced Mushrooms
    public static final RegistryObject<Block> TALL_BROWN_MUSHROOM_DOOR = BLOCKS.register(DDNames.TALL_BROWN_MUSHROOM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("enhanced_mushrooms", "brown_mushroom_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_RED_MUSHROOM_DOOR = BLOCKS.register(DDNames.TALL_RED_MUSHROOM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("enhanced_mushrooms", "red_mushroom_door")), BlockSetType.OAK));
    
    // Ad Astra
    public static final RegistryObject<Block> TALL_AERONOS_DOOR = BLOCKS.register(DDNames.TALL_AERONOS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ad_astra", "aeronos")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_GLACIAN_DOOR = BLOCKS.register(DDNames.TALL_GLACIAN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ad_astra", "glacian_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_STROPHAR_DOOR = BLOCKS.register(DDNames.TALL_STROPHAR, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ad_astra", "strophar_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_AA_STEEL_DOOR = BLOCKS.register(DDNames.TALL_AA_STEEL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ad_astra", "steel_door")), BlockSetType.IRON));
    
    // Abundant Atmosphere
    public static final RegistryObject<Block> TALL_ASH_DOOR = BLOCKS.register(DDNames.TALL_ASH, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("abundant_atmosphere", "ash_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_GOURDROT_DOOR = BLOCKS.register(DDNames.TALL_GOURDROT, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("abundant_atmosphere", "gourdrot_door")), BlockSetType.OAK));
    
    // Architects Palette
    public static final RegistryObject<Block> TALL_TWISTED_DOOR = BLOCKS.register(DDNames.TALL_TWISTED, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("architects_palette", "twisted_door")), BlockSetType.OAK));
    
    // Ars Nouveau
    public static final RegistryObject<Block> TALL_ARCHWOOD_DOOR = BLOCKS.register(DDNames.TALL_ARCHWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ars_nouveau", "archwood_door")), BlockSetType.OAK));
    
    // Bamboo Everything (Legacy)
    public static final RegistryObject<Block> TALL_BE_BAMBOO_DOOR = BLOCKS.register(DDNames.TALL_BE_BAMBOO, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("bambooeverything", "bamboo_door")), BlockSetType.BAMBOO));
    public static final RegistryObject<Block> TALL_BE_DRY_BAMBOO_DOOR = BLOCKS.register(DDNames.TALL_BE_DRY_BAMBOO, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("bambooeverything", "dry_bamboo_door")), BlockSetType.BAMBOO));
    
    // Biomancy
    public static final RegistryObject<Block> TALL_FLESH_DOOR = BLOCKS.register(DDNames.TALL_FLESH, () -> new TallFleshDoorBlock(getBlockByKey(new ResourceLocation("biomancy", "flesh_door")), BlockSetType.OAK));    
    public static final RegistryObject<Block> TALL_FULL_FLESH_DOOR = BLOCKS.register(DDNames.TALL_FULL_FLESH, () -> new TallFullFleshDoorBlock(getBlockByKey(new ResourceLocation("biomancy", "flesh_door")), BlockSetType.OAK));    
    public static final RegistryObject<Block> TALL_FLESHKIN_DOOR = BLOCKS.register(DDNames.TALL_FLESHKIN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomancy", "flesh_door")), BlockSetType.OAK));    
    
    // Biome Makeover
    public static final RegistryObject<Block> TALL_BM_ANCIENT_OAK_DOOR = BLOCKS.register(DDNames.TALL_BM_ANCIENT_OAK, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomemakeover", "ancient_oak_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BM_BLIGHTED_BALSA_DOOR = BLOCKS.register(DDNames.TALL_BM_BLIGHTED_BALSA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomemakeover", "blighted_balsa_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BM_SWAMP_CYPRESS_DOOR = BLOCKS.register(DDNames.TALL_BM_SWAMP_CYPRESS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomemakeover", "swamp_cypress_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BM_WILLOW_DOOR = BLOCKS.register(DDNames.TALL_BM_WILLOW, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("biomemakeover", "willow_door")), BlockSetType.OAK));
    
    // Blocks Plus
    public static final RegistryObject<Block> TALL_BP_BAMBOO_DOOR = BLOCKS.register(DDNames.TALL_BP_BAMBOO, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("blocksplus", "bamboo_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BP_MUSHROOM_DOOR = BLOCKS.register(DDNames.TALL_BP_MUSHROOM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("blocksplus", "mushroom_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BP_COPPER_DOOR = BLOCKS.register(DDNames.TALL_BP_COPPER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("blocksplus", "copper_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BP_GOLDEN_DOOR = BLOCKS.register(DDNames.TALL_BP_GOLDEN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("blocksplus", "golden_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BP_DIAMOND_DOOR = BLOCKS.register(DDNames.TALL_BP_DIAMOND, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("blocksplus", "diamond_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BP_EMERALD_DOOR = BLOCKS.register(DDNames.TALL_BP_EMERALD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("blocksplus", "emerald_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BP_NETHERITE_DOOR = BLOCKS.register(DDNames.TALL_BP_NETHERITE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("blocksplus", "netherite_door")), BlockSetType.OAK));
    
    // Blue Skies
    public static final RegistryObject<Block> TALL_BS_BLUEBRIGHT_DOOR = BLOCKS.register(DDNames.TALL_BS_BLUEBRIGHT, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("blue_skies", "bluebright_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BS_CHERRY_DOOR = BLOCKS.register(DDNames.TALL_BS_CHERRY, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("blue_skies", "cherry_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BS_CRYSTALLIZED_DOOR = BLOCKS.register(DDNames.TALL_BS_CRYSTALLIZED, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("blue_skies", "crystallized_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BS_DUSK_DOOR = BLOCKS.register(DDNames.TALL_BS_DUSK, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("blue_skies", "dusk_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BS_FROSTBRIGHT_DOOR = BLOCKS.register(DDNames.TALL_BS_FROSTBRIGHT, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("blue_skies", "frostbright_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BS_LUNAR_DOOR = BLOCKS.register(DDNames.TALL_BS_LUNAR, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("blue_skies", "lunar_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BS_MAPLE_DOOR = BLOCKS.register(DDNames.TALL_BS_MAPLE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("blue_skies", "maple_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BS_STARLIT_DOOR = BLOCKS.register(DDNames.TALL_BS_STARLIT, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("blue_skies", "starlit_door")), BlockSetType.OAK));
    
    // Caupona
    public static final RegistryObject<Block> TALL_WALNUT_DOOR = BLOCKS.register(DDNames.TALL_WALNUT, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("caupona", "walnut_door")), BlockSetType.OAK));    
    
    // The Ceilands
    public static final RegistryObject<Block> TALL_CEILTRUNK_DOOR = BLOCKS.register(DDNames.TALL_CEILTRUNK, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ceilands", "ceiltrunk_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_LUZAWOOD_DOOR = BLOCKS.register(DDNames.TALL_LUZAWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ceilands", "luzawood_door")), BlockSetType.OAK));

    // Colourful Azaleas
    public static final RegistryObject<Block> TALL_AZULE_AZALEA_DOOR = BLOCKS.register(DDNames.TALL_AZULE_AZALEA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("colorfulazaleas", "azule_azalea_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_BRIGHT_AZALEA_DOOR = BLOCKS.register(DDNames.TALL_BRIGHT_AZALEA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("colorfulazaleas", "bright_azalea_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_FISS_AZALEA_DOOR = BLOCKS.register(DDNames.TALL_FISS_AZALEA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("colorfulazaleas", "fiss_azalea_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_ROZE_AZALEA_DOOR = BLOCKS.register(DDNames.TALL_ROZE_AZALEA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("colorfulazaleas", "roze_azalea_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_TECAL_AZALEA_DOOR = BLOCKS.register(DDNames.TALL_TECAL_AZALEA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("colorfulazaleas", "tecal_azalea_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_TITANIUM_AZALEA_DOOR = BLOCKS.register(DDNames.TALL_TITANIUM_AZALEA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("colorfulazaleas", "titanium_azalea_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_WALNUT_AZALEA_DOOR = BLOCKS.register(DDNames.TALL_WALNUT_AZALEA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("colorfulazaleas", "walnut_azalea_door")), BlockSetType.OAK));    

    // Copper Overhaul
    public static final RegistryObject<Block> TALL_CO_COPPER_DOOR = BLOCKS.register(DDNames.TALL_CO_COPPER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("copperoverhaul", "copper_door")), BlockSetType.IRON));
    public static final RegistryObject<Block> TALL_CO_EXPOSED_COPPER_DOOR = BLOCKS.register(DDNames.TALL_CO_EXPOSED_COPPER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("copperoverhaul", "exposed_copper_door")), BlockSetType.IRON));
    public static final RegistryObject<Block> TALL_CO_WEATHERED_COPPER_DOOR = BLOCKS.register(DDNames.TALL_CO_WEATHERED_COPPER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("copperoverhaul", "weathered_copper_door")), BlockSetType.IRON));
    public static final RegistryObject<Block> TALL_CO_OXIDIZED_COPPER_DOOR = BLOCKS.register(DDNames.TALL_CO_OXIDIZED_COPPER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("copperoverhaul", "oxidized_copper_door")), BlockSetType.IRON));
    
    // Create: Alloyed
    public static final RegistryObject<Block> TALL_STEEL_DOOR = BLOCKS.register(DDNames.TALL_STEEL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("alloyed", "steel_door")), BlockSetType.IRON));
    public static final RegistryObject<Block> TALL_LOCKED_STEEL_DOOR = BLOCKS.register(DDNames.TALL_LOCKED_STEEL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("alloyed", "locked_steel_door")), BlockSetType.IRON));
    
    // Create: Deco
    public static final RegistryObject<Block> TALL_ANDESITE_DOOR = BLOCKS.register(DDNames.TALL_ANDESITE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("createdeco", "andesite_door")), BlockSetType.IRON));
    public static final RegistryObject<Block> TALL_BRASS_DOOR = BLOCKS.register(DDNames.TALL_BRASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("createdeco", "brass_door")), BlockSetType.IRON));
    public static final RegistryObject<Block> TALL_COPPER_DOOR = BLOCKS.register(DDNames.TALL_COPPER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("createdeco", "copper_door")), BlockSetType.IRON));
    public static final RegistryObject<Block> TALL_ZINC_DOOR = BLOCKS.register(DDNames.TALL_ZINC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("createdeco", "zinc_door")), BlockSetType.IRON));
    public static final RegistryObject<Block> TALL_LOCKED_ANDESITE_DOOR = BLOCKS.register(DDNames.TALL_LOCKED_ANDESITE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("createdeco", "locked_andesite_door")), BlockSetType.IRON));
    public static final RegistryObject<Block> TALL_LOCKED_BRASS_DOOR = BLOCKS.register(DDNames.TALL_LOCKED_BRASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("createdeco", "locked_brass_door")), BlockSetType.IRON));
    public static final RegistryObject<Block> TALL_LOCKED_COPPER_DOOR = BLOCKS.register(DDNames.TALL_LOCKED_COPPER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("createdeco", "locked_copper_door")), BlockSetType.IRON));
    public static final RegistryObject<Block> TALL_LOCKED_ZINC_DOOR = BLOCKS.register(DDNames.TALL_LOCKED_ZINC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("createdeco", "locked_zinc_door")), BlockSetType.IRON));
    
    // Create: Misc & Things
    public static final RegistryObject<Block> TALL_ANDESITE_CASING_DOOR = BLOCKS.register(DDNames.TALL_ANDESITE_CASING, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("create_things_and_misc", "andesite_casing_door")), BlockSetType.SPRUCE));
    public static final RegistryObject<Block> TALL_BRASS_CASING_DOOR = BLOCKS.register(DDNames.TALL_BRASS_CASING, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("create_things_and_misc", "brass_casing_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_COPPER_CASING_DOOR = BLOCKS.register(DDNames.TALL_COPPER_CASING, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("create_things_and_misc", "copper_casing_door")), BlockSetType.ACACIA));
    
    // Darker Depths
    public static final RegistryObject<Block> TALL_PETRIFIED_DOOR = BLOCKS.register(DDNames.TALL_PETRIFIED, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("darkerdepths", "petrified_door")), BlockSetType.OAK));
    
    // Deeper Darker
    public static final RegistryObject<Block> TALL_ECHO_DOOR = BLOCKS.register(DDNames.TALL_ECHO, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("deeperdarker", "echo_door")), BlockSetType.OAK));
    
    // Dustrial Decor
    public static final RegistryObject<Block> TALL_CARDBOARD_DOOR = BLOCKS.register(DDNames.TALL_CARDBOARD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("dustrial_decor", "cardboard_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_CHAIN_DOOR = BLOCKS.register(DDNames.TALL_CHAIN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("dustrial_decor", "chain_door")), BlockSetType.IRON));
    public static final RegistryObject<Block> TALL_INDUSTRIAL_IRON_DOOR = BLOCKS.register(DDNames.TALL_INDUSTRIAL_IRON, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("dustrial_decor", "industrial_iron_door")), BlockSetType.IRON));
    public static final RegistryObject<Block> TALL_IRON_BAR_DOOR = BLOCKS.register(DDNames.TALL_IRON_BAR, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("dustrial_decor", "iron_bar_door")), BlockSetType.IRON));
    public static final RegistryObject<Block> TALL_PADDED_DOOR = BLOCKS.register(DDNames.TALL_PADDED, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("dustrial_decor", "padded_door")), BlockSetType.IRON));
    public static final RegistryObject<Block> TALL_RUSTY_IRON_DOOR = BLOCKS.register(DDNames.TALL_RUSTY_IRON, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("dustrial_decor", "rusty_iron_door")), BlockSetType.IRON));
    public static final RegistryObject<Block> TALL_RUSTY_SHEET_METAL_DOOR = BLOCKS.register(DDNames.TALL_RUSTY_SHEET_METAL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("dustrial_decor", "rusty_sheet_metal_door")), BlockSetType.IRON));
    public static final RegistryObject<Block> TALL_SHEET_METAL_DOOR = BLOCKS.register(DDNames.TALL_SHEET_METAL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("dustrial_decor", "sheet_metal_door")), BlockSetType.IRON));

    // Ecologics
    public static final RegistryObject<Block> TALL_ECO_AZALEA_DOOR = BLOCKS.register(DDNames.TALL_ECO_AZALEA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ecologics", "azalea_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_ECO_FLOWERING_AZALEA_DOOR = BLOCKS.register(DDNames.TALL_ECO_FLOWERING_AZALEA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ecologics", "flowering_azalea_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_ECO_COCONUT_DOOR = BLOCKS.register(DDNames.TALL_ECO_COCONUT, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ecologics", "coconut_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_ECO_WALNUT_DOOR = BLOCKS.register(DDNames.TALL_ECO_WALNUT, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ecologics", "walnut_door")), BlockSetType.OAK));
    
    // End's Phantasm
    public static final RegistryObject<Block> TALL_EBONY_DOOR = BLOCKS.register(DDNames.TALL_EBONY, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("phantasm", "ebony_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_PREAM_DOOR = BLOCKS.register(DDNames.TALL_PREAM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("phantasm", "pream_door")), BlockSetType.OAK));
    
    // Enlightened End
    public static final RegistryObject<Block> TALL_CERULEAN_DOOR = BLOCKS.register(DDNames.TALL_CERULEAN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("nourished_end", "cerulean_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_COSMIC_DOOR = BLOCKS.register(DDNames.TALL_COSMIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("nourished_end", "cosmic_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_SELDGE_DOOR = BLOCKS.register(DDNames.TALL_SELDGE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("enlightened_end", "seldge_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_STALK_DOOR = BLOCKS.register(DDNames.TALL_STALK, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("enlightened_end", "stalk_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_VERDANT_DOOR = BLOCKS.register(DDNames.TALL_VERDANT, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("nourished_end", "verdant_door")), BlockSetType.OAK));
    
    // Everything is Copper
    public static final RegistryObject<Block> TALL_EC_COPPER_DOOR = BLOCKS.register(DDNames.TALL_EC_COPPER, () -> new TallCopperDoorBlock(getBlockByKey(new ResourceLocation("everythingcopper", "copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> TALL_EC_EXPOSED_COPPER_DOOR = BLOCKS.register(DDNames.TALL_EC_EXPOSED_COPPER, () -> new TallCopperDoorBlock(getBlockByKey(new ResourceLocation("everythingcopper", "exposed_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.EXPOSED));
    public static final RegistryObject<Block> TALL_EC_WEATHERED_COPPER_DOOR = BLOCKS.register(DDNames.TALL_EC_WEATHERED_COPPER, () -> new TallCopperDoorBlock(getBlockByKey(new ResourceLocation("everythingcopper", "weathered_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.WEATHERED));
    public static final RegistryObject<Block> TALL_EC_OXIDIZED_COPPER_DOOR = BLOCKS.register(DDNames.TALL_EC_OXIDIZED_COPPER, () -> new TallCopperDoorBlock(getBlockByKey(new ResourceLocation("everythingcopper", "oxidized_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.OXIDIZED));
    public static final RegistryObject<Block> TALL_EC_WAXED_COPPER_DOOR = BLOCKS.register(DDNames.TALL_EC_WAXED_COPPER, () -> new TallCopperDoorBlock(getBlockByKey(new ResourceLocation("everythingcopper", "waxed_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> TALL_EC_WAXED_EXPOSED_COPPER_DOOR = BLOCKS.register(DDNames.TALL_EC_WAXED_EXPOSED_COPPER, () -> new TallCopperDoorBlock(getBlockByKey(new ResourceLocation("everythingcopper", "waxed_exposed_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.EXPOSED));
    public static final RegistryObject<Block> TALL_EC_WAXED_WEATHERED_COPPER_DOOR = BLOCKS.register(DDNames.TALL_EC_WAXED_WEATHERED_COPPER, () -> new TallCopperDoorBlock(getBlockByKey(new ResourceLocation("everythingcopper", "waxed_weathered_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.WEATHERED));
    public static final RegistryObject<Block> TALL_EC_WAXED_OXIDIZED_COPPER_DOOR = BLOCKS.register(DDNames.TALL_EC_WAXED_OXIDIZED_COPPER, () -> new TallCopperDoorBlock(getBlockByKey(new ResourceLocation("everythingcopper", "waxed_oxidized_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.OXIDIZED));
    
    // Extended Mushrooms
    public static final RegistryObject<Block> TALL_MUSHROOM_DOOR = BLOCKS.register(DDNames.TALL_MUSHROOM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("extendedmushrooms", "mushroom_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_GLOWSHROOM_DOOR = BLOCKS.register(DDNames.TALL_GLOWSHROOM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("extendedmushrooms", "glowshroom_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_POISONOUS_MUSHROOM_DOOR = BLOCKS.register(DDNames.TALL_POISONOUS_MUSHROOM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("extendedmushrooms", "poisonous_mushroom_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_HONEY_FUNGUS_DOOR = BLOCKS.register(DDNames.TALL_HONEY_FUNGUS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("extendedmushrooms", "honey_fungus_door")), BlockSetType.OAK));
    
    // Forbidden & Arcanus
    public static final RegistryObject<Block> TALL_ARCANE_GOLD_DOOR = BLOCKS.register(DDNames.TALL_ARCANE_GOLD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("forbidden_arcanus", "arcane_gold_door"), Blocks.IRON_DOOR), BlockSetType.IRON));
    public static final RegistryObject<Block> TALL_ARCANE_EDELWOOD_DOOR = BLOCKS.register(DDNames.TALL_ARCANE_EDELWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("forbidden_arcanus", "arcane_edelwood_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_CHERRYWOOD_DOOR = BLOCKS.register(DDNames.TALL_CHERRYWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("forbidden_arcanus", "cherrywood_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_EDELWOOD_DOOR = BLOCKS.register(DDNames.TALL_EDELWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("forbidden_arcanus", "edelwood_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_FUNGYSS_DOOR = BLOCKS.register(DDNames.TALL_FUNGYSS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("forbidden_arcanus", "fungyss_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_MYSTERYWOOD_DOOR = BLOCKS.register(DDNames.TALL_MYSTERYWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("forbidden_arcanus", "mysterywood_door")), BlockSetType.OAK));
    
    // Fruit Trees
    public static final RegistryObject<Block> TALL_FT_CHERRY_DOOR = BLOCKS.register(DDNames.TALL_FT_CHERRY, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("fruittrees", "cherry_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_FT_CHERRY_SLIDING_DOOR = BLOCKS.register(DDNames.TALL_FT_CHERRY_SLIDING, () -> new TallStableDoorBlock(getBlockByKey(new ResourceLocation("fruittrees", "cherry_sliding_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_FT_CITRUS_DOOR = BLOCKS.register(DDNames.TALL_FT_CITRUS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("fruittrees", "citrus_door")), BlockSetType.OAK));
    
    // Gardens of the Dead
    public static final RegistryObject<Block> TALL_SOULBLIGHT_DOOR = BLOCKS.register(DDNames.TALL_SOULBLIGHT, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("fruittrees", "soulblight_door")), BlockSetType.CRIMSON));
    public static final RegistryObject<Block> TALL_WHISTLECANE_DOOR = BLOCKS.register(DDNames.TALL_WHISTLECANE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("fruittrees", "whistlecane_door")), BlockSetType.CRIMSON));
    
    // Good Ending
    public static final RegistryObject<Block> TALL_GE_CYPRESS_DOOR = BLOCKS.register(DDNames.TALL_GE_CYPRESS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("goodending", "cypress_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_GE_MUDDY_OAK_DOOR = BLOCKS.register(DDNames.TALL_GE_MUDDY_OAK, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("goodending", "muddy_oak_door")), BlockSetType.OAK));
    
    // Graveyard
    public static final RegistryObject<Block> TALL_DARK_IRON_DOOR = BLOCKS.register(DDNames.TALL_DARK_IRON, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("graveyard", "dark_iron_door"), Blocks.IRON_DOOR), BlockSetType.IRON));
    
    // Habitat
    public static final RegistryObject<Block> TALL_FAIRY_RING_MUSHROOM_DOOR = BLOCKS.register(DDNames.TALL_FAIRY_RING_MUSHROOM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("habitat", "fairy_ring_mushroom_door")), BlockSetType.OAK));
    
    // Hexcasting
    public static final RegistryObject<Block> TALL_AKASHIC_DOOR = BLOCKS.register(DDNames.TALL_AKASHIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("hexcasting", "akashic_door")), BlockSetType.OAK));
    
    // Hexerei
    public static final RegistryObject<Block> TALL_HEXEREI_MAHOGANY_DOOR = BLOCKS.register(DDNames.TALL_HEXEREI_MAHOGANY, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("hexerei", "mahogany_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_HEXEREI_WILLOW_DOOR = BLOCKS.register(DDNames.TALL_HEXEREI_WILLOW, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("hexerei", "willow_door")), BlockSetType.OAK));
    
    // Integrated Dynamics
    public static final RegistryObject<Block> TALL_MENRIL_DOOR = BLOCKS.register(DDNames.TALL_MENRIL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("integrateddynamics", "menril_door")), BlockSetType.OAK));
    
    // Malum
    public static final RegistryObject<Block> TALL_RUNEWOOD_DOOR = BLOCKS.register(DDNames.TALL_RUNEWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("malum", "runewood_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_SOULWOOD_DOOR = BLOCKS.register(DDNames.TALL_SOULWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("malum", "soulwood_door")), BlockSetType.OAK));
    
    // Mo' Shiz
    public static final RegistryObject<Block> TALL_MS_IRON_BAR_DOOR = BLOCKS.register(DDNames.TALL_MS_IRON_BAR, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ms", "door/iron_bar"), Blocks.IRON_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_MS_BAMBOO_DOOR = BLOCKS.register(DDNames.TALL_MS_BAMBOO, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ms", "door/bamboo")), BlockSetType.BAMBOO));
    public static final RegistryObject<Block> TALL_MS_CHERRY_DOOR = BLOCKS.register(DDNames.TALL_MS_CHERRY, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ms", "door/cherry")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_MS_GLOWOOD_DOOR = BLOCKS.register(DDNames.TALL_MS_GLOWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ms", "door/glowood")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_MS_HELLWOOD_DOOR = BLOCKS.register(DDNames.TALL_MS_HELLWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ms", "door/hellwood")), BlockSetType.CRIMSON));
    public static final RegistryObject<Block> TALL_MS_MAPLE_DOOR = BLOCKS.register(DDNames.TALL_MS_MAPLE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ms", "door/maple")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_MS_SILVERBELL_DOOR = BLOCKS.register(DDNames.TALL_MS_SILVERBELL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ms", "door/silverbell")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_MS_TIGERWOOD_DOOR = BLOCKS.register(DDNames.TALL_MS_TIGERWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ms", "door/tigerwood")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_MS_WILLOW_DOOR = BLOCKS.register(DDNames.TALL_MS_WILLOW, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ms", "door/willow")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_MS_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MS_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ms", "door/glass")), BlockSetType.IRON));
    public static final RegistryObject<Block> TALL_MS_SOUL_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MS_SOUL_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ms", "door/soul_glass")), BlockSetType.IRON));
    public static final RegistryObject<Block> TALL_MS_TINTED_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MS_TINTED_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ms", "door/tinted_glass")), BlockSetType.IRON));
    public static final RegistryObject<Block> TALL_MS_BLACK_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MS_BLACK_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ms", "door/black_glass")), BlockSetType.IRON));
    public static final RegistryObject<Block> TALL_MS_GREY_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MS_GREY_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ms", "door/grey_glass")), BlockSetType.IRON));
    public static final RegistryObject<Block> TALL_MS_LIGHT_GREY_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MS_LIGHT_GREY_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ms", "door/light_grey_glass")), BlockSetType.IRON));
    public static final RegistryObject<Block> TALL_MS_WHITE_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MS_WHITE_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ms", "door/white_glass")), BlockSetType.IRON));
    public static final RegistryObject<Block> TALL_MS_RED_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MS_RED_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ms", "door/red_glass")), BlockSetType.IRON));
    public static final RegistryObject<Block> TALL_MS_ORANGE_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MS_ORANGE_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ms", "door/orange_glass")), BlockSetType.IRON));
    public static final RegistryObject<Block> TALL_MS_YELLOW_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MS_YELLOW_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ms", "door/yellow_glass")), BlockSetType.IRON));
    public static final RegistryObject<Block> TALL_MS_LIME_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MS_LIME_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ms", "door/lime_glass")), BlockSetType.IRON));
    public static final RegistryObject<Block> TALL_MS_GREEN_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MS_GREEN_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ms", "door/green_glass")), BlockSetType.IRON));
    public static final RegistryObject<Block> TALL_MS_CYAN_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MS_CYAN_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ms", "door/cyan_glass")), BlockSetType.IRON));
    public static final RegistryObject<Block> TALL_MS_BLUE_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MS_BLUE_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ms", "door/blue_glass")), BlockSetType.IRON));
    public static final RegistryObject<Block> TALL_MS_PURPLE_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MS_PURPLE_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ms", "door/purple_glass")), BlockSetType.IRON));
    public static final RegistryObject<Block> TALL_MS_MAGENTA_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MS_MAGENTA_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ms", "door/magenta_glass")), BlockSetType.IRON));
    public static final RegistryObject<Block> TALL_MS_PINK_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MS_PINK_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ms", "door/pink_glassr")), BlockSetType.IRON));
    public static final RegistryObject<Block> TALL_MS_LIGHT_BLUE_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MS_LIGHT_BLUE_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ms", "door/light_blue_glass")), BlockSetType.IRON));
    public static final RegistryObject<Block> TALL_MS_BROWN_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MS_BROWN_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("ms", "door/brown_glass")), BlockSetType.IRON));
    
    
    // Morecraft
    public static final RegistryObject<Block> TALL_MORECRAFT_NETHERBRICK_DOOR = BLOCKS.register(DDNames.TALL_MORECRAFT_NETHERBRICK, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("morecraft", "netherbrick_door")), BlockSetType.IRON)); 
	public static final RegistryObject<Block> TALL_MORECRAFT_NETHERWOOD_DOOR = BLOCKS.register(DDNames.TALL_MORECRAFT_NETHERWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("morecraft", "netherwood_door")), BlockSetType.WARPED));
	public static final RegistryObject<Block> TALL_MORECRAFT_NETHERITE_DOOR = BLOCKS.register(DDNames.TALL_MORECRAFT_NETHERITE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("morecraft", "netherite_door")), BlockSetType.IRON));
	public static final RegistryObject<Block> TALL_MORECRAFT_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MORECRAFT_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("morecraft", "glass_door")), BlockSetType.IRON));
	public static final RegistryObject<Block> TALL_MORECRAFT_SOUL_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MORECRAFT_SOUL_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("morecraft", "soul_glass_door")), BlockSetType.IRON));
	public static final RegistryObject<Block> TALL_MORECRAFT_BONE_DOOR = BLOCKS.register(DDNames.TALL_MORECRAFT_BONE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("morecraft", "bone_door")), BlockSetType.IRON));
	
    // Nether's Exoticism
    public static final RegistryObject<Block> TALL_JABOTICABA_DOOR = BLOCKS.register(DDNames.TALL_JABOTICABA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("nethers_exoticism", "jaboticaba_door")), BlockSetType.CRIMSON));
    public static final RegistryObject<Block> TALL_RAMBOUTAN_DOOR = BLOCKS.register(DDNames.TALL_RAMBOUTAN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("nethers_exoticism", "ramboutan_door")), BlockSetType.CRIMSON));
    
    // New World
    public static final RegistryObject<Block> TALL_FIR_DOOR = BLOCKS.register(DDNames.TALL_FIR, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("newworld", "fir_door")), BlockSetType.OAK));
    
    // Outer End
    public static final RegistryObject<Block> TALL_AZURE_DOOR = BLOCKS.register(DDNames.TALL_AZURE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("outer_end", "azure_door")), BlockSetType.OAK));
    
    // Pokecube
    public static final RegistryObject<Block> TALL_POKECUBE_ENIGMA_DOOR = BLOCKS.register(DDNames.TALL_POKECUBE_ENIGMA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "enigma_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_POKECUBE_LEPPA_DOOR = BLOCKS.register(DDNames.TALL_POKECUBE_LEPPA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "leppa_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_POKECUBE_NANAB_DOOR = BLOCKS.register(DDNames.TALL_POKECUBE_NANAB, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "nanab_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_POKECUBE_ORAN_DOOR = BLOCKS.register(DDNames.TALL_POKECUBE_ORAN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "oran_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_POKECUBE_PECHA_DOOR = BLOCKS.register(DDNames.TALL_POKECUBE_PECHA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "pecha_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_POKECUBE_SITRUS_DOOR = BLOCKS.register(DDNames.TALL_POKECUBE_SITRUS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "sitrus_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_POKECUBE_AGED_DOOR = BLOCKS.register(DDNames.TALL_POKECUBE_AGED, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "aged_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_POKECUBE_CONCRETE_DOOR = BLOCKS.register(DDNames.TALL_POKECUBE_CONCRETE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "concrete_door")), BlockSetType.IRON));
    public static final RegistryObject<Block> TALL_POKECUBE_CORRUPTED_DOOR = BLOCKS.register(DDNames.TALL_POKECUBE_CORRUPTED, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "corrupted_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_POKECUBE_DISTORTIC_DOOR = BLOCKS.register(DDNames.TALL_POKECUBE_DISTORTIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "distortic_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_POKECUBE_INVERTED_DOOR = BLOCKS.register(DDNames.TALL_POKECUBE_INVERTED, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "inverted_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_POKECUBE_MIRAGE_DOOR = BLOCKS.register(DDNames.TALL_POKECUBE_MIRAGE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "mirage_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_POKECUBE_TEMPORAL_DOOR = BLOCKS.register(DDNames.TALL_POKECUBE_TEMPORAL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pokecube", "temporal_door")), BlockSetType.OAK));
    
    // Premium Wood
    public static final RegistryObject<Block> TALL_PW_MAGIC_DOOR = BLOCKS.register(DDNames.TALL_PW_MAGIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("premium_wood", "magic_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_PW_MAPLE_DOOR = BLOCKS.register(DDNames.TALL_PW_MAPLE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("premium_wood", "maple_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_PW_PURPLE_HEART_DOOR = BLOCKS.register(DDNames.TALL_PW_PURPLE_HEART, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("premium_wood", "purple_heart_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_PW_SILVERBELL_DOOR = BLOCKS.register(DDNames.TALL_PW_SILVERBELL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("premium_wood", "silverbell_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_PW_TIGER_DOOR = BLOCKS.register(DDNames.TALL_PW_TIGER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("premium_wood", "tiger_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_PW_WILLOW_DOOR = BLOCKS.register(DDNames.TALL_PW_WILLOW, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("premium_wood", "willow_door")), BlockSetType.OAK));
    
    // Pyromancer
    public static final RegistryObject<Block> TALL_PYROWOOD_DOOR = BLOCKS.register(DDNames.TALL_PYROWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pyromancer", "pyrowood_door")), BlockSetType.CRIMSON));
    public static final RegistryObject<Block> TALL_ROTTEN_PLANKS_DOOR = BLOCKS.register(DDNames.TALL_ROTTEN_PLANKS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("pyromancer", "rotten_planks_door")), BlockSetType.OAK));
    
    // Quark
    public static final RegistryObject<Block> TALL_QUARK_ANCIENT_DOOR = BLOCKS.register(DDNames.TALL_QUARK_ANCIENT, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("quark", "ancient_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_QUARK_AZALEA_DOOR = BLOCKS.register(DDNames.TALL_QUARK_AZALEA, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("quark", "azalea_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_QUARK_BLOSSOM_DOOR = BLOCKS.register(DDNames.TALL_QUARK_BLOSSOM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("quark", "blossom_door")), BlockSetType.OAK));

    // Silent Gear
    public static final RegistryObject<Block> TALL_NETHERWOOD_DOOR = BLOCKS.register(DDNames.TALL_NETHERWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("silentgear", "netherwood_door")), BlockSetType.CRIMSON));
    
    // Snowy Spirit
    public static final RegistryObject<Block> TALL_GINGERBREAD_DOOR = BLOCKS.register(DDNames.TALL_GINGERBREAD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("snowyspirit", "gingerbread_door")), BlockSetType.OAK));
    
    // Supplementaries
    public static final RegistryObject<Block> TALL_GOLD_DOOR = BLOCKS.register(DDNames.TALL_GOLD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("supplementaries", "gold_door")), BlockSetType.IRON));
    public static final RegistryObject<Block> TALL_SILVER_DOOR = BLOCKS.register(DDNames.TALL_SILVER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("supplementaries", "silver_door")), BlockSetType.IRON));
    public static final RegistryObject<Block> TALL_LEAD_DOOR = BLOCKS.register(DDNames.TALL_LEAD, () -> new TallLeadDoorBlock(getBlockByKey(new ResourceLocation("supplementaries", "lead_door")), BlockSetType.IRON));
    public static final RegistryObject<Block> TALL_NETHERITE_DOOR = BLOCKS.register(DDNames.TALL_NETHERITE, () -> new TallNetheriteDoorBlock(getBlockByKey(new ResourceLocation("supplementaries", "netherite_door")), BlockSetType.IRON));

    // Tinkers Construct
	public static final RegistryObject<Block> TALL_BLOODSHROOM_DOOR = BLOCKS.register(DDNames.TALL_BLOODSHROOM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("tconstruct", "bloodshroom_door")), BlockSetType.CRIMSON));    
	public static final RegistryObject<Block> TALL_GREENHEART_DOOR = BLOCKS.register(DDNames.TALL_GREENHEART, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("tconstruct", "greenheart_door")), BlockSetType.OAK));    
	public static final RegistryObject<Block> TALL_SKYROOT_DOOR = BLOCKS.register(DDNames.TALL_SKYROOT, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("tconstruct", "skyroot_door")), BlockSetType.OAK));
    
    // Twigs
	public static final RegistryObject<Block> TALL_TWIGS_BAMBOO_DOOR = BLOCKS.register(DDNames.TALL_TWIGS_BAMBOO, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("twigs", "bamboo_door")), BlockSetType.BAMBOO));    
    
    // Undergarden
	public static final RegistryObject<Block> TALL_GRONGLE_DOOR = BLOCKS.register(DDNames.TALL_GRONGLE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("undergarden", "grongle_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_SMOGSTEM_DOOR = BLOCKS.register(DDNames.TALL_SMOGSTEM, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("undergarden", "smogstem_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_WIGGLEWOOD_DOOR = BLOCKS.register(DDNames.TALL_WIGGLEWOOD, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("undergarden", "wigglewood_door")), BlockSetType.OAK));

    // Windswept
    public static final RegistryObject<Block> TALL_GOLDEN_DOOR = BLOCKS.register(DDNames.TALL_GOLDEN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("windswept", "golden_door"), Blocks.IRON_DOOR), BlockSetType.IRON));
    public static final RegistryObject<Block> TALL_CHESTNUT_DOOR = BLOCKS.register(DDNames.TALL_CHESTNUT, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("windswept", "chestnut_door")), BlockSetType.OAK));
    public static final RegistryObject<Block> TALL_HOLLY_DOOR = BLOCKS.register(DDNames.TALL_HOLLY, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("windswept", "holly_door")), BlockSetType.OAK));

    // Chipped
	public static final RegistryObject<Block> TALL_CHIPPED_OAK_DOOR_01 = BLOCKS.register(DDNames.TALL_CHIPPED_OAK_01, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "oak_door_1")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_OAK_DOOR_02 = BLOCKS.register(DDNames.TALL_CHIPPED_OAK_02, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "oak_door_2")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_OAK_DOOR_03 = BLOCKS.register(DDNames.TALL_CHIPPED_OAK_03, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "oak_door_3")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_OAK_DOOR_04 = BLOCKS.register(DDNames.TALL_CHIPPED_OAK_04, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "oak_door_4")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_OAK_DOOR_05 = BLOCKS.register(DDNames.TALL_CHIPPED_OAK_05, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "oak_door_5")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_OAK_DOOR_06 = BLOCKS.register(DDNames.TALL_CHIPPED_OAK_06, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "oak_door_6")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_OAK_DOOR_07 = BLOCKS.register(DDNames.TALL_CHIPPED_OAK_07, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "oak_door_7")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_OAK_DOOR_08 = BLOCKS.register(DDNames.TALL_CHIPPED_OAK_08, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "oak_door_8")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_OAK_DOOR_09 = BLOCKS.register(DDNames.TALL_CHIPPED_OAK_09, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "oak_door_9")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_OAK_DOOR_10 = BLOCKS.register(DDNames.TALL_CHIPPED_OAK_10, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "oak_door_10")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_OAK_DOOR_11 = BLOCKS.register(DDNames.TALL_CHIPPED_OAK_11, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "oak_door_11")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_OAK_DOOR_12 = BLOCKS.register(DDNames.TALL_CHIPPED_OAK_12, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "oak_door_12")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_OAK_DOOR_13 = BLOCKS.register(DDNames.TALL_CHIPPED_OAK_13, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "oak_door_13")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_OAK_DOOR_14 = BLOCKS.register(DDNames.TALL_CHIPPED_OAK_14, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "oak_door_14")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_OAK_DOOR_15 = BLOCKS.register(DDNames.TALL_CHIPPED_OAK_15, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "oak_door_15")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_OAK_DOOR_16 = BLOCKS.register(DDNames.TALL_CHIPPED_OAK_16, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "oak_door_16")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_OAK_DOOR_17 = BLOCKS.register(DDNames.TALL_CHIPPED_OAK_17, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "oak_door_17")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_OAK_DOOR_18 = BLOCKS.register(DDNames.TALL_CHIPPED_OAK_18, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "oak_door_18")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_OAK_DOOR_19 = BLOCKS.register(DDNames.TALL_CHIPPED_OAK_19, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "oak_door_19")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_OAK_DOOR_20 = BLOCKS.register(DDNames.TALL_CHIPPED_OAK_20, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "oak_door_20")), BlockSetType.OAK));

	public static final RegistryObject<Block> TALL_CHIPPED_SPRUCE_DOOR_01 = BLOCKS.register(DDNames.TALL_CHIPPED_SPRUCE_01, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "spruce_door_1")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_SPRUCE_DOOR_02 = BLOCKS.register(DDNames.TALL_CHIPPED_SPRUCE_02, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "spruce_door_2")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_SPRUCE_DOOR_03 = BLOCKS.register(DDNames.TALL_CHIPPED_SPRUCE_03, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "spruce_door_3")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_SPRUCE_DOOR_04 = BLOCKS.register(DDNames.TALL_CHIPPED_SPRUCE_04, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "spruce_door_4")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_SPRUCE_DOOR_05 = BLOCKS.register(DDNames.TALL_CHIPPED_SPRUCE_05, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "spruce_door_5")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_SPRUCE_DOOR_06 = BLOCKS.register(DDNames.TALL_CHIPPED_SPRUCE_06, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "spruce_door_6")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_SPRUCE_DOOR_07 = BLOCKS.register(DDNames.TALL_CHIPPED_SPRUCE_07, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "spruce_door_7")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_SPRUCE_DOOR_08 = BLOCKS.register(DDNames.TALL_CHIPPED_SPRUCE_08, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "spruce_door_8")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_SPRUCE_DOOR_09 = BLOCKS.register(DDNames.TALL_CHIPPED_SPRUCE_09, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "spruce_door_9")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_SPRUCE_DOOR_10 = BLOCKS.register(DDNames.TALL_CHIPPED_SPRUCE_10, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "spruce_door_10")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_SPRUCE_DOOR_11 = BLOCKS.register(DDNames.TALL_CHIPPED_SPRUCE_11, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "spruce_door_11")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_SPRUCE_DOOR_12 = BLOCKS.register(DDNames.TALL_CHIPPED_SPRUCE_12, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "spruce_door_12")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_SPRUCE_DOOR_13 = BLOCKS.register(DDNames.TALL_CHIPPED_SPRUCE_13, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "spruce_door_13")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_SPRUCE_DOOR_14 = BLOCKS.register(DDNames.TALL_CHIPPED_SPRUCE_14, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "spruce_door_14")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_SPRUCE_DOOR_15 = BLOCKS.register(DDNames.TALL_CHIPPED_SPRUCE_15, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "spruce_door_15")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_SPRUCE_DOOR_16 = BLOCKS.register(DDNames.TALL_CHIPPED_SPRUCE_16, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "spruce_door_16")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_SPRUCE_DOOR_17 = BLOCKS.register(DDNames.TALL_CHIPPED_SPRUCE_17, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "spruce_door_17")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_SPRUCE_DOOR_18 = BLOCKS.register(DDNames.TALL_CHIPPED_SPRUCE_18, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "spruce_door_18")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_SPRUCE_DOOR_19 = BLOCKS.register(DDNames.TALL_CHIPPED_SPRUCE_19, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "spruce_door_19")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_SPRUCE_DOOR_20 = BLOCKS.register(DDNames.TALL_CHIPPED_SPRUCE_20, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "spruce_door_20")), BlockSetType.OAK));

	public static final RegistryObject<Block> TALL_CHIPPED_BIRCH_DOOR_01 = BLOCKS.register(DDNames.TALL_CHIPPED_BIRCH_01, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "birch_door_1")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_BIRCH_DOOR_02 = BLOCKS.register(DDNames.TALL_CHIPPED_BIRCH_02, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "birch_door_2")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_BIRCH_DOOR_03 = BLOCKS.register(DDNames.TALL_CHIPPED_BIRCH_03, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "birch_door_3")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_BIRCH_DOOR_04 = BLOCKS.register(DDNames.TALL_CHIPPED_BIRCH_04, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "birch_door_4")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_BIRCH_DOOR_05 = BLOCKS.register(DDNames.TALL_CHIPPED_BIRCH_05, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "birch_door_5")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_BIRCH_DOOR_06 = BLOCKS.register(DDNames.TALL_CHIPPED_BIRCH_06, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "birch_door_6")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_BIRCH_DOOR_07 = BLOCKS.register(DDNames.TALL_CHIPPED_BIRCH_07, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "birch_door_7")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_BIRCH_DOOR_08 = BLOCKS.register(DDNames.TALL_CHIPPED_BIRCH_08, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "birch_door_8")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_BIRCH_DOOR_09 = BLOCKS.register(DDNames.TALL_CHIPPED_BIRCH_09, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "birch_door_9")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_BIRCH_DOOR_10 = BLOCKS.register(DDNames.TALL_CHIPPED_BIRCH_10, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "birch_door_10")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_BIRCH_DOOR_11 = BLOCKS.register(DDNames.TALL_CHIPPED_BIRCH_11, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "birch_door_11")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_BIRCH_DOOR_12 = BLOCKS.register(DDNames.TALL_CHIPPED_BIRCH_12, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "birch_door_12")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_BIRCH_DOOR_13 = BLOCKS.register(DDNames.TALL_CHIPPED_BIRCH_13, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "birch_door_13")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_BIRCH_DOOR_14 = BLOCKS.register(DDNames.TALL_CHIPPED_BIRCH_14, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "birch_door_14")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_BIRCH_DOOR_15 = BLOCKS.register(DDNames.TALL_CHIPPED_BIRCH_15, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "birch_door_15")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_BIRCH_DOOR_16 = BLOCKS.register(DDNames.TALL_CHIPPED_BIRCH_16, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "birch_door_16")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_BIRCH_DOOR_17 = BLOCKS.register(DDNames.TALL_CHIPPED_BIRCH_17, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "birch_door_17")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_BIRCH_DOOR_18 = BLOCKS.register(DDNames.TALL_CHIPPED_BIRCH_18, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "birch_door_18")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_BIRCH_DOOR_19 = BLOCKS.register(DDNames.TALL_CHIPPED_BIRCH_19, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "birch_door_19")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_BIRCH_DOOR_20 = BLOCKS.register(DDNames.TALL_CHIPPED_BIRCH_20, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "birch_door_20")), BlockSetType.OAK));

	public static final RegistryObject<Block> TALL_CHIPPED_JUNGLE_DOOR_01 = BLOCKS.register(DDNames.TALL_CHIPPED_JUNGLE_01, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "jungle_door_1")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_JUNGLE_DOOR_02 = BLOCKS.register(DDNames.TALL_CHIPPED_JUNGLE_02, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "jungle_door_2")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_JUNGLE_DOOR_03 = BLOCKS.register(DDNames.TALL_CHIPPED_JUNGLE_03, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "jungle_door_3")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_JUNGLE_DOOR_04 = BLOCKS.register(DDNames.TALL_CHIPPED_JUNGLE_04, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "jungle_door_4")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_JUNGLE_DOOR_05 = BLOCKS.register(DDNames.TALL_CHIPPED_JUNGLE_05, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "jungle_door_5")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_JUNGLE_DOOR_06 = BLOCKS.register(DDNames.TALL_CHIPPED_JUNGLE_06, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "jungle_door_6")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_JUNGLE_DOOR_07 = BLOCKS.register(DDNames.TALL_CHIPPED_JUNGLE_07, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "jungle_door_7")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_JUNGLE_DOOR_08 = BLOCKS.register(DDNames.TALL_CHIPPED_JUNGLE_08, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "jungle_door_8")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_JUNGLE_DOOR_09 = BLOCKS.register(DDNames.TALL_CHIPPED_JUNGLE_09, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "jungle_door_9")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_JUNGLE_DOOR_10 = BLOCKS.register(DDNames.TALL_CHIPPED_JUNGLE_10, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "jungle_door_10")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_JUNGLE_DOOR_11 = BLOCKS.register(DDNames.TALL_CHIPPED_JUNGLE_11, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "jungle_door_11")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_JUNGLE_DOOR_12 = BLOCKS.register(DDNames.TALL_CHIPPED_JUNGLE_12, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "jungle_door_12")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_JUNGLE_DOOR_13 = BLOCKS.register(DDNames.TALL_CHIPPED_JUNGLE_13, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "jungle_door_13")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_JUNGLE_DOOR_14 = BLOCKS.register(DDNames.TALL_CHIPPED_JUNGLE_14, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "jungle_door_14")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_JUNGLE_DOOR_15 = BLOCKS.register(DDNames.TALL_CHIPPED_JUNGLE_15, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "jungle_door_15")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_JUNGLE_DOOR_16 = BLOCKS.register(DDNames.TALL_CHIPPED_JUNGLE_16, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "jungle_door_16")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_JUNGLE_DOOR_17 = BLOCKS.register(DDNames.TALL_CHIPPED_JUNGLE_17, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "jungle_door_17")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_JUNGLE_DOOR_18 = BLOCKS.register(DDNames.TALL_CHIPPED_JUNGLE_18, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "jungle_door_18")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_JUNGLE_DOOR_19 = BLOCKS.register(DDNames.TALL_CHIPPED_JUNGLE_19, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "jungle_door_19")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_JUNGLE_DOOR_20 = BLOCKS.register(DDNames.TALL_CHIPPED_JUNGLE_20, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "jungle_door_20")), BlockSetType.OAK));

	public static final RegistryObject<Block> TALL_CHIPPED_ACACIA_DOOR_01 = BLOCKS.register(DDNames.TALL_CHIPPED_ACACIA_01, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "acacia_door_1")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_ACACIA_DOOR_02 = BLOCKS.register(DDNames.TALL_CHIPPED_ACACIA_02, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "acacia_door_2")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_ACACIA_DOOR_03 = BLOCKS.register(DDNames.TALL_CHIPPED_ACACIA_03, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "acacia_door_3")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_ACACIA_DOOR_04 = BLOCKS.register(DDNames.TALL_CHIPPED_ACACIA_04, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "acacia_door_4")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_ACACIA_DOOR_05 = BLOCKS.register(DDNames.TALL_CHIPPED_ACACIA_05, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "acacia_door_5")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_ACACIA_DOOR_06 = BLOCKS.register(DDNames.TALL_CHIPPED_ACACIA_06, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "acacia_door_6")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_ACACIA_DOOR_07 = BLOCKS.register(DDNames.TALL_CHIPPED_ACACIA_07, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "acacia_door_7")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_ACACIA_DOOR_08 = BLOCKS.register(DDNames.TALL_CHIPPED_ACACIA_08, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "acacia_door_8")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_ACACIA_DOOR_09 = BLOCKS.register(DDNames.TALL_CHIPPED_ACACIA_09, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "acacia_door_9")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_ACACIA_DOOR_10 = BLOCKS.register(DDNames.TALL_CHIPPED_ACACIA_10, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "acacia_door_10")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_ACACIA_DOOR_11 = BLOCKS.register(DDNames.TALL_CHIPPED_ACACIA_11, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "acacia_door_11")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_ACACIA_DOOR_12 = BLOCKS.register(DDNames.TALL_CHIPPED_ACACIA_12, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "acacia_door_12")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_ACACIA_DOOR_13 = BLOCKS.register(DDNames.TALL_CHIPPED_ACACIA_13, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "acacia_door_13")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_ACACIA_DOOR_14 = BLOCKS.register(DDNames.TALL_CHIPPED_ACACIA_14, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "acacia_door_14")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_ACACIA_DOOR_15 = BLOCKS.register(DDNames.TALL_CHIPPED_ACACIA_15, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "acacia_door_15")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_ACACIA_DOOR_16 = BLOCKS.register(DDNames.TALL_CHIPPED_ACACIA_16, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "acacia_door_16")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_ACACIA_DOOR_17 = BLOCKS.register(DDNames.TALL_CHIPPED_ACACIA_17, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "acacia_door_17")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_ACACIA_DOOR_18 = BLOCKS.register(DDNames.TALL_CHIPPED_ACACIA_18, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "acacia_door_18")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_ACACIA_DOOR_19 = BLOCKS.register(DDNames.TALL_CHIPPED_ACACIA_19, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "acacia_door_19")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_ACACIA_DOOR_20 = BLOCKS.register(DDNames.TALL_CHIPPED_ACACIA_20, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "acacia_door_20")), BlockSetType.OAK));

	public static final RegistryObject<Block> TALL_CHIPPED_DARK_OAK_DOOR_01 = BLOCKS.register(DDNames.TALL_CHIPPED_DARK_OAK_01, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "dark_oak_door_1")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_DARK_OAK_DOOR_02 = BLOCKS.register(DDNames.TALL_CHIPPED_DARK_OAK_02, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "dark_oak_door_2")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_DARK_OAK_DOOR_03 = BLOCKS.register(DDNames.TALL_CHIPPED_DARK_OAK_03, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "dark_oak_door_3")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_DARK_OAK_DOOR_04 = BLOCKS.register(DDNames.TALL_CHIPPED_DARK_OAK_04, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "dark_oak_door_4")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_DARK_OAK_DOOR_05 = BLOCKS.register(DDNames.TALL_CHIPPED_DARK_OAK_05, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "dark_oak_door_5")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_DARK_OAK_DOOR_06 = BLOCKS.register(DDNames.TALL_CHIPPED_DARK_OAK_06, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "dark_oak_door_6")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_DARK_OAK_DOOR_07 = BLOCKS.register(DDNames.TALL_CHIPPED_DARK_OAK_07, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "dark_oak_door_7")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_DARK_OAK_DOOR_08 = BLOCKS.register(DDNames.TALL_CHIPPED_DARK_OAK_08, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "dark_oak_door_8")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_DARK_OAK_DOOR_09 = BLOCKS.register(DDNames.TALL_CHIPPED_DARK_OAK_09, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "dark_oak_door_9")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_DARK_OAK_DOOR_10 = BLOCKS.register(DDNames.TALL_CHIPPED_DARK_OAK_10, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "dark_oak_door_10")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_DARK_OAK_DOOR_11 = BLOCKS.register(DDNames.TALL_CHIPPED_DARK_OAK_11, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "dark_oak_door_11")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_DARK_OAK_DOOR_12 = BLOCKS.register(DDNames.TALL_CHIPPED_DARK_OAK_12, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "dark_oak_door_12")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_DARK_OAK_DOOR_13 = BLOCKS.register(DDNames.TALL_CHIPPED_DARK_OAK_13, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "dark_oak_door_13")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_DARK_OAK_DOOR_14 = BLOCKS.register(DDNames.TALL_CHIPPED_DARK_OAK_14, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "dark_oak_door_14")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_DARK_OAK_DOOR_15 = BLOCKS.register(DDNames.TALL_CHIPPED_DARK_OAK_15, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "dark_oak_door_15")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_DARK_OAK_DOOR_16 = BLOCKS.register(DDNames.TALL_CHIPPED_DARK_OAK_16, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "dark_oak_door_16")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_DARK_OAK_DOOR_17 = BLOCKS.register(DDNames.TALL_CHIPPED_DARK_OAK_17, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "dark_oak_door_17")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_DARK_OAK_DOOR_18 = BLOCKS.register(DDNames.TALL_CHIPPED_DARK_OAK_18, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "dark_oak_door_18")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_DARK_OAK_DOOR_19 = BLOCKS.register(DDNames.TALL_CHIPPED_DARK_OAK_19, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "dark_oak_door_19")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_DARK_OAK_DOOR_20 = BLOCKS.register(DDNames.TALL_CHIPPED_DARK_OAK_20, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "dark_oak_door_20")), BlockSetType.OAK));
	// Not yet added
	/*public static final RegistryObject<Block> TALL_CHIPPED_MANGROVE_DOOR_01 = BLOCKS.register(DDNames.TALL_CHIPPED_MANGROVE_01, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "mangrove_door_1")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_MANGROVE_DOOR_02 = BLOCKS.register(DDNames.TALL_CHIPPED_MANGROVE_02, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "mangrove_door_2")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_MANGROVE_DOOR_03 = BLOCKS.register(DDNames.TALL_CHIPPED_MANGROVE_03, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "mangrove_door_3")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_MANGROVE_DOOR_04 = BLOCKS.register(DDNames.TALL_CHIPPED_MANGROVE_04, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "mangrove_door_4")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_MANGROVE_DOOR_05 = BLOCKS.register(DDNames.TALL_CHIPPED_MANGROVE_05, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "mangrove_door_5")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_MANGROVE_DOOR_06 = BLOCKS.register(DDNames.TALL_CHIPPED_MANGROVE_06, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "mangrove_door_6")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_MANGROVE_DOOR_07 = BLOCKS.register(DDNames.TALL_CHIPPED_MANGROVE_07, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "mangrove_door_7")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_MANGROVE_DOOR_08 = BLOCKS.register(DDNames.TALL_CHIPPED_MANGROVE_08, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "mangrove_door_8")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_MANGROVE_DOOR_09 = BLOCKS.register(DDNames.TALL_CHIPPED_MANGROVE_09, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "mangrove_door_9")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_MANGROVE_DOOR_10 = BLOCKS.register(DDNames.TALL_CHIPPED_MANGROVE_10, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "mangrove_door_10")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_MANGROVE_DOOR_11 = BLOCKS.register(DDNames.TALL_CHIPPED_MANGROVE_11, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "mangrove_door_11")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_MANGROVE_DOOR_12 = BLOCKS.register(DDNames.TALL_CHIPPED_MANGROVE_12, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "mangrove_door_12")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_MANGROVE_DOOR_13 = BLOCKS.register(DDNames.TALL_CHIPPED_MANGROVE_13, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "mangrove_door_13")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_MANGROVE_DOOR_14 = BLOCKS.register(DDNames.TALL_CHIPPED_MANGROVE_14, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "mangrove_door_14")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_MANGROVE_DOOR_15 = BLOCKS.register(DDNames.TALL_CHIPPED_MANGROVE_15, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "mangrove_door_15")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_MANGROVE_DOOR_16 = BLOCKS.register(DDNames.TALL_CHIPPED_MANGROVE_16, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "mangrove_door_16")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_MANGROVE_DOOR_17 = BLOCKS.register(DDNames.TALL_CHIPPED_MANGROVE_17, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "mangrove_door_17")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_MANGROVE_DOOR_18 = BLOCKS.register(DDNames.TALL_CHIPPED_MANGROVE_18, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "mangrove_door_18")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_MANGROVE_DOOR_19 = BLOCKS.register(DDNames.TALL_CHIPPED_MANGROVE_19, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "mangrove_door_19")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_CHIPPED_MANGROVE_DOOR_20 = BLOCKS.register(DDNames.TALL_CHIPPED_MANGROVE_20, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "mangrove_door_20")), BlockSetType.OAK));*/
	
	public static final RegistryObject<Block> TALL_CHIPPED_CRIMSON_DOOR_01 = BLOCKS.register(DDNames.TALL_CHIPPED_CRIMSON_01, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "crimson_door_1")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_CHIPPED_CRIMSON_DOOR_02 = BLOCKS.register(DDNames.TALL_CHIPPED_CRIMSON_02, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "crimson_door_2")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_CHIPPED_CRIMSON_DOOR_03 = BLOCKS.register(DDNames.TALL_CHIPPED_CRIMSON_03, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "crimson_door_3")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_CHIPPED_CRIMSON_DOOR_04 = BLOCKS.register(DDNames.TALL_CHIPPED_CRIMSON_04, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "crimson_door_4")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_CHIPPED_CRIMSON_DOOR_05 = BLOCKS.register(DDNames.TALL_CHIPPED_CRIMSON_05, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "crimson_door_5")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_CHIPPED_CRIMSON_DOOR_06 = BLOCKS.register(DDNames.TALL_CHIPPED_CRIMSON_06, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "crimson_door_6")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_CHIPPED_CRIMSON_DOOR_07 = BLOCKS.register(DDNames.TALL_CHIPPED_CRIMSON_07, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "crimson_door_7")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_CHIPPED_CRIMSON_DOOR_08 = BLOCKS.register(DDNames.TALL_CHIPPED_CRIMSON_08, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "crimson_door_8")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_CHIPPED_CRIMSON_DOOR_09 = BLOCKS.register(DDNames.TALL_CHIPPED_CRIMSON_09, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "crimson_door_9")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_CHIPPED_CRIMSON_DOOR_10 = BLOCKS.register(DDNames.TALL_CHIPPED_CRIMSON_10, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "crimson_door_10")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_CHIPPED_CRIMSON_DOOR_11 = BLOCKS.register(DDNames.TALL_CHIPPED_CRIMSON_11, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "crimson_door_11")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_CHIPPED_CRIMSON_DOOR_12 = BLOCKS.register(DDNames.TALL_CHIPPED_CRIMSON_12, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "crimson_door_12")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_CHIPPED_CRIMSON_DOOR_13 = BLOCKS.register(DDNames.TALL_CHIPPED_CRIMSON_13, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "crimson_door_13")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_CHIPPED_CRIMSON_DOOR_14 = BLOCKS.register(DDNames.TALL_CHIPPED_CRIMSON_14, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "crimson_door_14")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_CHIPPED_CRIMSON_DOOR_15 = BLOCKS.register(DDNames.TALL_CHIPPED_CRIMSON_15, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "crimson_door_15")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_CHIPPED_CRIMSON_DOOR_16 = BLOCKS.register(DDNames.TALL_CHIPPED_CRIMSON_16, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "crimson_door_16")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_CHIPPED_CRIMSON_DOOR_17 = BLOCKS.register(DDNames.TALL_CHIPPED_CRIMSON_17, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "crimson_door_17")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_CHIPPED_CRIMSON_DOOR_18 = BLOCKS.register(DDNames.TALL_CHIPPED_CRIMSON_18, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "crimson_door_18")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_CHIPPED_CRIMSON_DOOR_19 = BLOCKS.register(DDNames.TALL_CHIPPED_CRIMSON_19, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "crimson_door_19")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_CHIPPED_CRIMSON_DOOR_20 = BLOCKS.register(DDNames.TALL_CHIPPED_CRIMSON_20, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "crimson_door_20")), BlockSetType.CRIMSON));

	public static final RegistryObject<Block> TALL_CHIPPED_WARPED_DOOR_01 = BLOCKS.register(DDNames.TALL_CHIPPED_WARPED_01, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "warped_door_1")), BlockSetType.WARPED));
	public static final RegistryObject<Block> TALL_CHIPPED_WARPED_DOOR_02 = BLOCKS.register(DDNames.TALL_CHIPPED_WARPED_02, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "warped_door_2")), BlockSetType.WARPED));
	public static final RegistryObject<Block> TALL_CHIPPED_WARPED_DOOR_03 = BLOCKS.register(DDNames.TALL_CHIPPED_WARPED_03, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "warped_door_3")), BlockSetType.WARPED));
	public static final RegistryObject<Block> TALL_CHIPPED_WARPED_DOOR_04 = BLOCKS.register(DDNames.TALL_CHIPPED_WARPED_04, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "warped_door_4")), BlockSetType.WARPED));
	public static final RegistryObject<Block> TALL_CHIPPED_WARPED_DOOR_05 = BLOCKS.register(DDNames.TALL_CHIPPED_WARPED_05, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "warped_door_5")), BlockSetType.WARPED));
	public static final RegistryObject<Block> TALL_CHIPPED_WARPED_DOOR_06 = BLOCKS.register(DDNames.TALL_CHIPPED_WARPED_06, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "warped_door_6")), BlockSetType.WARPED));
	public static final RegistryObject<Block> TALL_CHIPPED_WARPED_DOOR_07 = BLOCKS.register(DDNames.TALL_CHIPPED_WARPED_07, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "warped_door_7")), BlockSetType.WARPED));
	public static final RegistryObject<Block> TALL_CHIPPED_WARPED_DOOR_08 = BLOCKS.register(DDNames.TALL_CHIPPED_WARPED_08, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "warped_door_8")), BlockSetType.WARPED));
	public static final RegistryObject<Block> TALL_CHIPPED_WARPED_DOOR_09 = BLOCKS.register(DDNames.TALL_CHIPPED_WARPED_09, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "warped_door_9")), BlockSetType.WARPED));
	public static final RegistryObject<Block> TALL_CHIPPED_WARPED_DOOR_10 = BLOCKS.register(DDNames.TALL_CHIPPED_WARPED_10, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "warped_door_10")), BlockSetType.WARPED));
	public static final RegistryObject<Block> TALL_CHIPPED_WARPED_DOOR_11 = BLOCKS.register(DDNames.TALL_CHIPPED_WARPED_11, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "warped_door_11")), BlockSetType.WARPED));
	public static final RegistryObject<Block> TALL_CHIPPED_WARPED_DOOR_12 = BLOCKS.register(DDNames.TALL_CHIPPED_WARPED_12, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "warped_door_12")), BlockSetType.WARPED));
	public static final RegistryObject<Block> TALL_CHIPPED_WARPED_DOOR_13 = BLOCKS.register(DDNames.TALL_CHIPPED_WARPED_13, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "warped_door_13")), BlockSetType.WARPED));
	public static final RegistryObject<Block> TALL_CHIPPED_WARPED_DOOR_14 = BLOCKS.register(DDNames.TALL_CHIPPED_WARPED_14, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "warped_door_14")), BlockSetType.WARPED));
	public static final RegistryObject<Block> TALL_CHIPPED_WARPED_DOOR_15 = BLOCKS.register(DDNames.TALL_CHIPPED_WARPED_15, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "warped_door_15")), BlockSetType.WARPED));
	public static final RegistryObject<Block> TALL_CHIPPED_WARPED_DOOR_16 = BLOCKS.register(DDNames.TALL_CHIPPED_WARPED_16, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "warped_door_16")), BlockSetType.WARPED));
	public static final RegistryObject<Block> TALL_CHIPPED_WARPED_DOOR_17 = BLOCKS.register(DDNames.TALL_CHIPPED_WARPED_17, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "warped_door_17")), BlockSetType.WARPED));
	public static final RegistryObject<Block> TALL_CHIPPED_WARPED_DOOR_18 = BLOCKS.register(DDNames.TALL_CHIPPED_WARPED_18, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "warped_door_18")), BlockSetType.WARPED));
	public static final RegistryObject<Block> TALL_CHIPPED_WARPED_DOOR_19 = BLOCKS.register(DDNames.TALL_CHIPPED_WARPED_19, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "warped_door_19")), BlockSetType.WARPED));
	public static final RegistryObject<Block> TALL_CHIPPED_WARPED_DOOR_20 = BLOCKS.register(DDNames.TALL_CHIPPED_WARPED_20, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("chipped", "warped_door_20")), BlockSetType.WARPED));
    
    // Macaw
	public static final RegistryObject<Block> TALL_MACAW_STORE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_STORE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "store_door")), BlockSetType.IRON));
	public static final RegistryObject<Block> TALL_MACAW_SLIDING_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_SLIDING_GLASS, () -> new TallSlidingDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "sliding_glass_door")), BlockSetType.IRON));

	public static final RegistryObject<Block> TALL_MACAW_JAIL_DOOR = BLOCKS.register(DDNames.TALL_MACAW_JAIL, () -> new TallSlidingDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "jail_door")), BlockSetType.IRON));
	public static final RegistryObject<Block> TALL_MACAW_METAL_DOOR = BLOCKS.register(DDNames.TALL_MACAW_METAL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "metal_door")), BlockSetType.IRON));
	public static final RegistryObject<Block> TALL_MACAW_METAL_HOSPITAL_DOOR = BLOCKS.register(DDNames.TALL_MACAW_METAL_HOSPITAL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "metal_hospital_door")), BlockSetType.IRON));
	public static final RegistryObject<Block> TALL_MACAW_METAL_REINFORCED_DOOR = BLOCKS.register(DDNames.TALL_MACAW_METAL_REINFORCED, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "metal_reinforced_door")), BlockSetType.IRON));
	public static final RegistryObject<Block> TALL_MACAW_METAL_WARNING_DOOR = BLOCKS.register(DDNames.TALL_MACAW_METAL_WARNING, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "metal_warning_door")), BlockSetType.IRON));
	public static final RegistryObject<Block> TALL_MACAW_METAL_WINDOWED_DOOR = BLOCKS.register(DDNames.TALL_MACAW_METAL_WINDOWED, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "metal_windowed_door")), BlockSetType.IRON));

	public static final RegistryObject<Block> TALL_MACAW_OAK_BARN_DOOR = BLOCKS.register(DDNames.TALL_MACAW_OAK_BARN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "oak_barn_door")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MACAW_SPRUCE_BARN_DOOR = BLOCKS.register(DDNames.TALL_MACAW_SPRUCE_BARN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "spruce_barn_door")), BlockSetType.SPRUCE));
	public static final RegistryObject<Block> TALL_MACAW_BIRCH_BARN_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BIRCH_BARN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "birch_barn_door")), BlockSetType.BIRCH));
	public static final RegistryObject<Block> TALL_MACAW_JUNGLE_BARN_DOOR = BLOCKS.register(DDNames.TALL_MACAW_JUNGLE_BARN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "jungle_barn_door")), BlockSetType.JUNGLE));
	public static final RegistryObject<Block> TALL_MACAW_ACACIA_BARN_DOOR = BLOCKS.register(DDNames.TALL_MACAW_ACACIA_BARN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "acacia_barn_door")), BlockSetType.ACACIA));
	public static final RegistryObject<Block> TALL_MACAW_DARK_OAK_BARN_DOOR = BLOCKS.register(DDNames.TALL_MACAW_DARK_OAK_BARN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_barn_door")), BlockSetType.DARK_OAK));
	public static final RegistryObject<Block> TALL_MACAW_MANGROVE_BARN_DOOR = BLOCKS.register(DDNames.TALL_MACAW_MANGROVE_BARN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_barn_door")), BlockSetType.MANGROVE));
	public static final RegistryObject<Block> TALL_MACAW_BAMBOO_BARN_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BAMBOO_BARN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_barn_door")), BlockSetType.BAMBOO));
	public static final RegistryObject<Block> TALL_MACAW_CRIMSON_BARN_DOOR = BLOCKS.register(DDNames.TALL_MACAW_CRIMSON_BARN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "crimson_barn_door")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_MACAW_WARPED_BARN_DOOR = BLOCKS.register(DDNames.TALL_MACAW_WARPED_BARN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "warped_barn_door")), BlockSetType.WARPED));

	public static final RegistryObject<Block> TALL_MACAW_OAK_BARN_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_OAK_BARN_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "oak_barn_glass_door")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MACAW_SPRUCE_BARN_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_SPRUCE_BARN_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "spruce_barn_glass_door")), BlockSetType.SPRUCE));
	public static final RegistryObject<Block> TALL_MACAW_BIRCH_BARN_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BIRCH_BARN_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "birch_barn_glass_door")), BlockSetType.BIRCH));
	public static final RegistryObject<Block> TALL_MACAW_JUNGLE_BARN_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_JUNGLE_BARN_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "jungle_barn_glass_door")), BlockSetType.JUNGLE));
	public static final RegistryObject<Block> TALL_MACAW_ACACIA_BARN_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_ACACIA_BARN_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "acacia_barn_glass_door")), BlockSetType.ACACIA));
	public static final RegistryObject<Block> TALL_MACAW_DARK_OAK_BARN_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_DARK_OAK_BARN_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_barn_glass_door")), BlockSetType.DARK_OAK));
	public static final RegistryObject<Block> TALL_MACAW_MANGROVE_BARN_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_MANGROVE_BARN_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_barn_glass_door")), BlockSetType.MANGROVE));
	public static final RegistryObject<Block> TALL_MACAW_BAMBOO_BARN_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BAMBOO_BARN_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_barn_glass_door")), BlockSetType.BAMBOO));
	public static final RegistryObject<Block> TALL_MACAW_CRIMSON_BARN_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_CRIMSON_BARN_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "crimson_barn_glass_door")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_MACAW_WARPED_BARN_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_WARPED_BARN_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "warped_barn_glass_door")), BlockSetType.WARPED));

	public static final RegistryObject<Block> TALL_MACAW_OAK_STABLE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_OAK_STABLE, () -> new TallStableDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "oak_stable_door")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MACAW_SPRUCE_STABLE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_SPRUCE_STABLE, () -> new TallStableDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "spruce_stable_door")), BlockSetType.SPRUCE));
	public static final RegistryObject<Block> TALL_MACAW_BIRCH_STABLE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BIRCH_STABLE, () -> new TallStableDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "birch_stable_door")), BlockSetType.BIRCH));
	public static final RegistryObject<Block> TALL_MACAW_JUNGLE_STABLE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_JUNGLE_STABLE, () -> new TallStableDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "jungle_stable_door")), BlockSetType.JUNGLE));
	public static final RegistryObject<Block> TALL_MACAW_ACACIA_STABLE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_ACACIA_STABLE, () -> new TallStableDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "acacia_stable_door")), BlockSetType.ACACIA));
	public static final RegistryObject<Block> TALL_MACAW_DARK_OAK_STABLE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_DARK_OAK_STABLE, () -> new TallStableDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_stable_door")), BlockSetType.DARK_OAK));
	public static final RegistryObject<Block> TALL_MACAW_MANGROVE_STABLE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_MANGROVE_STABLE, () -> new TallStableDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_stable_door")), BlockSetType.MANGROVE));
	public static final RegistryObject<Block> TALL_MACAW_BAMBOO_STABLE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BAMBOO_STABLE, () -> new TallStableDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_stable_door")), BlockSetType.BAMBOO));
	public static final RegistryObject<Block> TALL_MACAW_CRIMSON_STABLE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_CRIMSON_STABLE, () -> new TallStableDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "crimson_stable_door")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_MACAW_WARPED_STABLE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_WARPED_STABLE, () -> new TallStableDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "warped_stable_door")), BlockSetType.WARPED));

	public static final RegistryObject<Block> TALL_MACAW_OAK_STABLE_HEAD_DOOR = BLOCKS.register(DDNames.TALL_MACAW_OAK_STABLE_HEAD, () -> new TallStableDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "oak_stable_head_door")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MACAW_SPRUCE_STABLE_HEAD_DOOR = BLOCKS.register(DDNames.TALL_MACAW_SPRUCE_STABLE_HEAD, () -> new TallStableDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "spruce_stable_head_door")), BlockSetType.SPRUCE));
	public static final RegistryObject<Block> TALL_MACAW_BIRCH_STABLE_HEAD_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BIRCH_STABLE_HEAD, () -> new TallStableDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "birch_stable_head_door")), BlockSetType.BIRCH));
	public static final RegistryObject<Block> TALL_MACAW_JUNGLE_STABLE_HEAD_DOOR = BLOCKS.register(DDNames.TALL_MACAW_JUNGLE_STABLE_HEAD, () -> new TallStableDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "jungle_stable_head_door")), BlockSetType.JUNGLE));
	public static final RegistryObject<Block> TALL_MACAW_ACACIA_STABLE_HEAD_DOOR = BLOCKS.register(DDNames.TALL_MACAW_ACACIA_STABLE_HEAD, () -> new TallStableDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "acacia_stable_head_door")), BlockSetType.ACACIA));
	public static final RegistryObject<Block> TALL_MACAW_DARK_OAK_STABLE_HEAD_DOOR = BLOCKS.register(DDNames.TALL_MACAW_DARK_OAK_STABLE_HEAD, () -> new TallStableDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_stable_head_door")), BlockSetType.DARK_OAK));
	public static final RegistryObject<Block> TALL_MACAW_MANGROVE_STABLE_HEAD_DOOR = BLOCKS.register(DDNames.TALL_MACAW_MANGROVE_STABLE_HEAD, () -> new TallStableDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_stable_head_door")), BlockSetType.MANGROVE));
	public static final RegistryObject<Block> TALL_MACAW_BAMBOO_STABLE_HEAD_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BAMBOO_STABLE_HEAD, () -> new TallStableDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_stable_head_door")), BlockSetType.BAMBOO));
	public static final RegistryObject<Block> TALL_MACAW_CRIMSON_STABLE_HEAD_DOOR = BLOCKS.register(DDNames.TALL_MACAW_CRIMSON_STABLE_HEAD, () -> new TallStableDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "crimson_stable_head_door")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_MACAW_WARPED_STABLE_HEAD_DOOR = BLOCKS.register(DDNames.TALL_MACAW_WARPED_STABLE_HEAD, () -> new TallStableDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "warped_stable_head_door")), BlockSetType.WARPED));

	public static final RegistryObject<Block> TALL_MACAW_OAK_BARK_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_OAK_BARK_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "oak_bark_glass_door")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MACAW_SPRUCE_BARK_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_SPRUCE_BARK_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "spruce_bark_glass_door")), BlockSetType.SPRUCE));
	public static final RegistryObject<Block> TALL_MACAW_BIRCH_BARK_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BIRCH_BARK_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "birch_bark_glass_door")), BlockSetType.BIRCH));
	public static final RegistryObject<Block> TALL_MACAW_JUNGLE_BARK_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_JUNGLE_BARK_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "jungle_bark_glass_door")), BlockSetType.JUNGLE));
	public static final RegistryObject<Block> TALL_MACAW_ACACIA_BARK_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_ACACIA_BARK_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "acacia_bark_glass_door")), BlockSetType.ACACIA));
	public static final RegistryObject<Block> TALL_MACAW_DARK_OAK_BARK_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_DARK_OAK_BARK_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_bark_glass_door")), BlockSetType.DARK_OAK));
	public static final RegistryObject<Block> TALL_MACAW_MANGROVE_BARK_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_MANGROVE_BARK_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_bark_glass_door")), BlockSetType.MANGROVE));
	public static final RegistryObject<Block> TALL_MACAW_BAMBOO_BARK_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BAMBOO_BARK_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_bark_glass_door")), BlockSetType.BAMBOO));
	public static final RegistryObject<Block> TALL_MACAW_CRIMSON_STEM_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_CRIMSON_STEM_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "crimson_stem_glass_door")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_MACAW_WARPED_STEM_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_WARPED_STEM_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "warped_stem_glass_door")), BlockSetType.WARPED));
	
	public static final RegistryObject<Block> TALL_MACAW_OAK_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_OAK_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "oak_glass_door")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MACAW_SPRUCE_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_SPRUCE_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "spruce_glass_door")), BlockSetType.SPRUCE));
	public static final RegistryObject<Block> TALL_MACAW_BIRCH_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BIRCH_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "birch_glass_door")), BlockSetType.BIRCH));
	public static final RegistryObject<Block> TALL_MACAW_JUNGLE_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_JUNGLE_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "jungle_glass_door")), BlockSetType.JUNGLE));
	public static final RegistryObject<Block> TALL_MACAW_ACACIA_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_ACACIA_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "acacia_glass_door")), BlockSetType.ACACIA));
	public static final RegistryObject<Block> TALL_MACAW_DARK_OAK_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_DARK_OAK_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_glass_door")), BlockSetType.DARK_OAK));
	public static final RegistryObject<Block> TALL_MACAW_MANGROVE_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_MANGROVE_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_glass_door")), BlockSetType.MANGROVE));
	public static final RegistryObject<Block> TALL_MACAW_BAMBOO_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BAMBOO_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_glass_door")), BlockSetType.BAMBOO));
	public static final RegistryObject<Block> TALL_MACAW_CRIMSON_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_CRIMSON_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "crimson_glass_door")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_MACAW_WARPED_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MACAW_WARPED_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "warped_glass_door")), BlockSetType.WARPED));

	public static final RegistryObject<Block> TALL_MACAW_OAK_MODERN_DOOR = BLOCKS.register(DDNames.TALL_MACAW_OAK_MODERN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "oak_modern_door")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MACAW_SPRUCE_MODERN_DOOR = BLOCKS.register(DDNames.TALL_MACAW_SPRUCE_MODERN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "spruce_modern_door")), BlockSetType.SPRUCE));
	public static final RegistryObject<Block> TALL_MACAW_BIRCH_MODERN_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BIRCH_MODERN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "birch_modern_door")), BlockSetType.BIRCH));
	public static final RegistryObject<Block> TALL_MACAW_JUNGLE_MODERN_DOOR = BLOCKS.register(DDNames.TALL_MACAW_JUNGLE_MODERN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "jungle_modern_door")), BlockSetType.JUNGLE));
	public static final RegistryObject<Block> TALL_MACAW_ACACIA_MODERN_DOOR = BLOCKS.register(DDNames.TALL_MACAW_ACACIA_MODERN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "acacia_modern_door")), BlockSetType.ACACIA));
	public static final RegistryObject<Block> TALL_MACAW_DARK_OAK_MODERN_DOOR = BLOCKS.register(DDNames.TALL_MACAW_DARK_OAK_MODERN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_modern_door")), BlockSetType.DARK_OAK));
	public static final RegistryObject<Block> TALL_MACAW_MANGROVE_MODERN_DOOR = BLOCKS.register(DDNames.TALL_MACAW_MANGROVE_MODERN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_modern_door")), BlockSetType.MANGROVE));
	public static final RegistryObject<Block> TALL_MACAW_BAMBOO_MODERN_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BAMBOO_MODERN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_modern_door")), BlockSetType.BAMBOO));
	public static final RegistryObject<Block> TALL_MACAW_CRIMSON_MODERN_DOOR = BLOCKS.register(DDNames.TALL_MACAW_CRIMSON_MODERN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "crimson_modern_door")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_MACAW_WARPED_MODERN_DOOR = BLOCKS.register(DDNames.TALL_MACAW_WARPED_MODERN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "warped_modern_door")), BlockSetType.WARPED));

	public static final RegistryObject<Block> TALL_MACAW_OAK_JAPANESE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_OAK_JAPANESE, () -> new TallSlidingDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "oak_japanese_door")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MACAW_SPRUCE_JAPANESE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_SPRUCE_JAPANESE, () -> new TallSlidingDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "spruce_japanese_door")), BlockSetType.SPRUCE));
	public static final RegistryObject<Block> TALL_MACAW_BIRCH_JAPANESE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BIRCH_JAPANESE, () -> new TallSlidingDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "birch_japanese_door")), BlockSetType.BIRCH));
	public static final RegistryObject<Block> TALL_MACAW_JUNGLE_JAPANESE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_JUNGLE_JAPANESE, () -> new TallSlidingDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "jungle_japanese_door")), BlockSetType.JUNGLE));
	public static final RegistryObject<Block> TALL_MACAW_ACACIA_JAPANESE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_ACACIA_JAPANESE, () -> new TallSlidingDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "acacia_japanese_door")), BlockSetType.ACACIA));
	public static final RegistryObject<Block> TALL_MACAW_DARK_OAK_JAPANESE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_DARK_OAK_JAPANESE, () -> new TallSlidingDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_japanese_door")), BlockSetType.DARK_OAK));
	public static final RegistryObject<Block> TALL_MACAW_MANGROVE_JAPANESE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_MANGROVE_JAPANESE, () -> new TallSlidingDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_japanese_door")), BlockSetType.MANGROVE));
	public static final RegistryObject<Block> TALL_MACAW_BAMBOO_JAPANESE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BAMBOO_JAPANESE, () -> new TallSlidingDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_japanese_door")), BlockSetType.BAMBOO));
	public static final RegistryObject<Block> TALL_MACAW_CRIMSON_JAPANESE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_CRIMSON_JAPANESE, () -> new TallSlidingDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "crimson_japanese_door")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_MACAW_WARPED_JAPANESE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_WARPED_JAPANESE, () -> new TallSlidingDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "warped_japanese_door")), BlockSetType.WARPED));

	public static final RegistryObject<Block> TALL_MACAW_OAK_JAPANESE2_DOOR = BLOCKS.register(DDNames.TALL_MACAW_OAK_JAPANESE2, () -> new TallSlidingDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "oak_japanese2_door")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MACAW_SPRUCE_JAPANESE2_DOOR = BLOCKS.register(DDNames.TALL_MACAW_SPRUCE_JAPANESE2, () -> new TallSlidingDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "spruce_japanese2_door")), BlockSetType.SPRUCE));
	public static final RegistryObject<Block> TALL_MACAW_BIRCH_JAPANESE2_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BIRCH_JAPANESE2, () -> new TallSlidingDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "birch_japanese2_door")), BlockSetType.BIRCH));
	public static final RegistryObject<Block> TALL_MACAW_JUNGLE_JAPANESE2_DOOR = BLOCKS.register(DDNames.TALL_MACAW_JUNGLE_JAPANESE2, () -> new TallSlidingDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "jungle_japanese2_door")), BlockSetType.JUNGLE));
	public static final RegistryObject<Block> TALL_MACAW_ACACIA_JAPANESE2_DOOR = BLOCKS.register(DDNames.TALL_MACAW_ACACIA_JAPANESE2, () -> new TallSlidingDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "acacia_japanese2_door")), BlockSetType.ACACIA));
	public static final RegistryObject<Block> TALL_MACAW_DARK_OAK_JAPANESE2_DOOR = BLOCKS.register(DDNames.TALL_MACAW_DARK_OAK_JAPANESE2, () -> new TallSlidingDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_japanese2_door")), BlockSetType.DARK_OAK));
	public static final RegistryObject<Block> TALL_MACAW_MANGROVE_JAPANESE2_DOOR = BLOCKS.register(DDNames.TALL_MACAW_MANGROVE_JAPANESE2, () -> new TallSlidingDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_japanese2_door")), BlockSetType.MANGROVE));
	public static final RegistryObject<Block> TALL_MACAW_BAMBOO_JAPANESE2_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BAMBOO_JAPANESE2, () -> new TallSlidingDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_japanese2_door")), BlockSetType.BAMBOO));
	public static final RegistryObject<Block> TALL_MACAW_CRIMSON_JAPANESE2_DOOR = BLOCKS.register(DDNames.TALL_MACAW_CRIMSON_JAPANESE2, () -> new TallSlidingDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "crimson_japanese2_door")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_MACAW_WARPED_JAPANESE2_DOOR = BLOCKS.register(DDNames.TALL_MACAW_WARPED_JAPANESE2, () -> new TallSlidingDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "warped_japanese2_door")), BlockSetType.WARPED));

	public static final RegistryObject<Block> TALL_MACAW_SPRUCE_CLASSIC_DOOR = BLOCKS.register(DDNames.TALL_MACAW_SPRUCE_CLASSIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "spruce_classic_door")), BlockSetType.SPRUCE));
	public static final RegistryObject<Block> TALL_MACAW_BIRCH_CLASSIC_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BIRCH_CLASSIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "birch_classic_door")), BlockSetType.BIRCH));
	public static final RegistryObject<Block> TALL_MACAW_JUNGLE_CLASSIC_DOOR = BLOCKS.register(DDNames.TALL_MACAW_JUNGLE_CLASSIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "jungle_classic_door")), BlockSetType.JUNGLE));
	public static final RegistryObject<Block> TALL_MACAW_ACACIA_CLASSIC_DOOR = BLOCKS.register(DDNames.TALL_MACAW_ACACIA_CLASSIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "acacia_classic_door")), BlockSetType.ACACIA));
	public static final RegistryObject<Block> TALL_MACAW_DARK_OAK_CLASSIC_DOOR = BLOCKS.register(DDNames.TALL_MACAW_DARK_OAK_CLASSIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_classic_door")), BlockSetType.DARK_OAK));
	public static final RegistryObject<Block> TALL_MACAW_MANGROVE_CLASSIC_DOOR = BLOCKS.register(DDNames.TALL_MACAW_MANGROVE_CLASSIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_classic_door")), BlockSetType.MANGROVE));
	public static final RegistryObject<Block> TALL_MACAW_BAMBOO_CLASSIC_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BAMBOO_CLASSIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_classic_door")), BlockSetType.BAMBOO));
	public static final RegistryObject<Block> TALL_MACAW_CRIMSON_CLASSIC_DOOR = BLOCKS.register(DDNames.TALL_MACAW_CRIMSON_CLASSIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "crimson_classic_door")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_MACAW_WARPED_CLASSIC_DOOR = BLOCKS.register(DDNames.TALL_MACAW_WARPED_CLASSIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "warped_classic_door")), BlockSetType.WARPED));

	public static final RegistryObject<Block> TALL_MACAW_OAK_COTTAGE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_OAK_COTTAGE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "oak_cottage_door")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MACAW_BIRCH_COTTAGE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BIRCH_COTTAGE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "birch_cottage_door")), BlockSetType.BIRCH));
	public static final RegistryObject<Block> TALL_MACAW_JUNGLE_COTTAGE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_JUNGLE_COTTAGE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "jungle_cottage_door")), BlockSetType.JUNGLE));
	public static final RegistryObject<Block> TALL_MACAW_ACACIA_COTTAGE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_ACACIA_COTTAGE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "acacia_cottage_door")), BlockSetType.ACACIA));
	public static final RegistryObject<Block> TALL_MACAW_DARK_OAK_COTTAGE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_DARK_OAK_COTTAGE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_cottage_door")), BlockSetType.DARK_OAK));
	public static final RegistryObject<Block> TALL_MACAW_MANGROVE_COTTAGE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_MANGROVE_COTTAGE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_cottage_door")), BlockSetType.MANGROVE));
	public static final RegistryObject<Block> TALL_MACAW_BAMBOO_COTTAGE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BAMBOO_COTTAGE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_cottage_door")), BlockSetType.BAMBOO));
	public static final RegistryObject<Block> TALL_MACAW_CRIMSON_COTTAGE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_CRIMSON_COTTAGE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "crimson_cottage_door")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_MACAW_WARPED_COTTAGE_DOOR = BLOCKS.register(DDNames.TALL_MACAW_WARPED_COTTAGE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "warped_cottage_door")), BlockSetType.WARPED));

	public static final RegistryObject<Block> TALL_MACAW_OAK_PAPER_DOOR = BLOCKS.register(DDNames.TALL_MACAW_OAK_PAPER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "oak_paper_door")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MACAW_SPRUCE_PAPER_DOOR = BLOCKS.register(DDNames.TALL_MACAW_SPRUCE_PAPER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "spruce_paper_door")), BlockSetType.SPRUCE));
	public static final RegistryObject<Block> TALL_MACAW_JUNGLE_PAPER_DOOR = BLOCKS.register(DDNames.TALL_MACAW_JUNGLE_PAPER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "jungle_paper_door")), BlockSetType.JUNGLE));
	public static final RegistryObject<Block> TALL_MACAW_ACACIA_PAPER_DOOR = BLOCKS.register(DDNames.TALL_MACAW_ACACIA_PAPER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "acacia_paper_door")), BlockSetType.ACACIA));
	public static final RegistryObject<Block> TALL_MACAW_DARK_OAK_PAPER_DOOR = BLOCKS.register(DDNames.TALL_MACAW_DARK_OAK_PAPER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_paper_door")), BlockSetType.DARK_OAK));
	public static final RegistryObject<Block> TALL_MACAW_MANGROVE_PAPER_DOOR = BLOCKS.register(DDNames.TALL_MACAW_MANGROVE_PAPER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_paper_door")), BlockSetType.MANGROVE));
	public static final RegistryObject<Block> TALL_MACAW_BAMBOO_PAPER_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BAMBOO_PAPER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_paper_door")), BlockSetType.BAMBOO));
	public static final RegistryObject<Block> TALL_MACAW_CRIMSON_PAPER_DOOR = BLOCKS.register(DDNames.TALL_MACAW_CRIMSON_PAPER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "crimson_paper_door")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_MACAW_WARPED_PAPER_DOOR = BLOCKS.register(DDNames.TALL_MACAW_WARPED_PAPER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "warped_paper_door")), BlockSetType.WARPED));

	public static final RegistryObject<Block> TALL_MACAW_OAK_BEACH_DOOR = BLOCKS.register(DDNames.TALL_MACAW_OAK_BEACH, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "oak_beach_door")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MACAW_SPRUCE_BEACH_DOOR = BLOCKS.register(DDNames.TALL_MACAW_SPRUCE_BEACH, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "spruce_beach_door")), BlockSetType.SPRUCE));
	public static final RegistryObject<Block> TALL_MACAW_BIRCH_BEACH_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BIRCH_BEACH, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "birch_beach_door")), BlockSetType.BIRCH));
	public static final RegistryObject<Block> TALL_MACAW_ACACIA_BEACH_DOOR = BLOCKS.register(DDNames.TALL_MACAW_ACACIA_BEACH, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "acacia_beach_door")), BlockSetType.ACACIA));
	public static final RegistryObject<Block> TALL_MACAW_DARK_OAK_BEACH_DOOR = BLOCKS.register(DDNames.TALL_MACAW_DARK_OAK_BEACH, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_beach_door")), BlockSetType.DARK_OAK));
	public static final RegistryObject<Block> TALL_MACAW_MANGROVE_BEACH_DOOR = BLOCKS.register(DDNames.TALL_MACAW_MANGROVE_BEACH, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_beach_door")), BlockSetType.MANGROVE));
	public static final RegistryObject<Block> TALL_MACAW_BAMBOO_BEACH_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BAMBOO_BEACH, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_beach_door")), BlockSetType.BAMBOO));
	public static final RegistryObject<Block> TALL_MACAW_CRIMSON_BEACH_DOOR = BLOCKS.register(DDNames.TALL_MACAW_CRIMSON_BEACH, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "crimson_beach_door")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_MACAW_WARPED_BEACH_DOOR = BLOCKS.register(DDNames.TALL_MACAW_WARPED_BEACH, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "warped_beach_door")), BlockSetType.WARPED));

	public static final RegistryObject<Block> TALL_MACAW_OAK_TROPICAL_DOOR = BLOCKS.register(DDNames.TALL_MACAW_OAK_TROPICAL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "oak_tropical_door")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MACAW_SPRUCE_TROPICAL_DOOR = BLOCKS.register(DDNames.TALL_MACAW_SPRUCE_TROPICAL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "spruce_tropical_door")), BlockSetType.SPRUCE));
	public static final RegistryObject<Block> TALL_MACAW_BIRCH_TROPICAL_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BIRCH_TROPICAL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "birch_tropical_door")), BlockSetType.BIRCH));
	public static final RegistryObject<Block> TALL_MACAW_JUNGLE_TROPICAL_DOOR = BLOCKS.register(DDNames.TALL_MACAW_JUNGLE_TROPICAL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "jungle_tropical_door")), BlockSetType.JUNGLE));
	public static final RegistryObject<Block> TALL_MACAW_DARK_OAK_TROPICAL_DOOR = BLOCKS.register(DDNames.TALL_MACAW_DARK_OAK_TROPICAL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_tropical_door")), BlockSetType.DARK_OAK));
	public static final RegistryObject<Block> TALL_MACAW_MANGROVE_TROPICAL_DOOR = BLOCKS.register(DDNames.TALL_MACAW_MANGROVE_TROPICAL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_tropical_door")), BlockSetType.MANGROVE));
	public static final RegistryObject<Block> TALL_MACAW_BAMBOO_TROPICAL_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BAMBOO_TROPICAL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_tropical_door")), BlockSetType.BAMBOO));
	public static final RegistryObject<Block> TALL_MACAW_CRIMSON_TROPICAL_DOOR = BLOCKS.register(DDNames.TALL_MACAW_CRIMSON_TROPICAL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "crimson_tropical_door")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_MACAW_WARPED_TROPICAL_DOOR = BLOCKS.register(DDNames.TALL_MACAW_WARPED_TROPICAL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "warped_tropical_door")), BlockSetType.WARPED));

	public static final RegistryObject<Block> TALL_MACAW_OAK_FOUR_PANEL_DOOR = BLOCKS.register(DDNames.TALL_MACAW_OAK_FOUR_PANEL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "oak_four_panel_door")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MACAW_SPRUCE_FOUR_PANEL_DOOR = BLOCKS.register(DDNames.TALL_MACAW_SPRUCE_FOUR_PANEL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "spruce_four_panel_door")), BlockSetType.SPRUCE));
	public static final RegistryObject<Block> TALL_MACAW_BIRCH_FOUR_PANEL_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BIRCH_FOUR_PANEL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "birch_four_panel_door")), BlockSetType.BIRCH));
	public static final RegistryObject<Block> TALL_MACAW_JUNGLE_FOUR_PANEL_DOOR = BLOCKS.register(DDNames.TALL_MACAW_JUNGLE_FOUR_PANEL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "jungle_four_panel_door")), BlockSetType.JUNGLE));
	public static final RegistryObject<Block> TALL_MACAW_ACACIA_FOUR_PANEL_DOOR = BLOCKS.register(DDNames.TALL_MACAW_ACACIA_FOUR_PANEL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "acacia_four_panel_door")), BlockSetType.ACACIA));
	public static final RegistryObject<Block> TALL_MACAW_MANGROVE_FOUR_PANEL_DOOR = BLOCKS.register(DDNames.TALL_MACAW_MANGROVE_FOUR_PANEL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_four_panel_door")), BlockSetType.MANGROVE));
	public static final RegistryObject<Block> TALL_MACAW_BAMBOO_FOUR_PANEL_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BAMBOO_FOUR_PANEL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_four_panel_door")), BlockSetType.BAMBOO));
	public static final RegistryObject<Block> TALL_MACAW_CRIMSON_FOUR_PANEL_DOOR = BLOCKS.register(DDNames.TALL_MACAW_CRIMSON_FOUR_PANEL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "crimson_four_panel_door")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_MACAW_WARPED_FOUR_PANEL_DOOR = BLOCKS.register(DDNames.TALL_MACAW_WARPED_FOUR_PANEL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "warped_four_panel_door")), BlockSetType.WARPED));

	public static final RegistryObject<Block> TALL_MACAW_OAK_SWAMP_DOOR = BLOCKS.register(DDNames.TALL_MACAW_OAK_SWAMP, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "oak_swamp_door")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MACAW_SPRUCE_SWAMP_DOOR = BLOCKS.register(DDNames.TALL_MACAW_SPRUCE_SWAMP, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "spruce_swamp_door")), BlockSetType.SPRUCE));
	public static final RegistryObject<Block> TALL_MACAW_BIRCH_SWAMP_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BIRCH_SWAMP, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "birch_swamp_door")), BlockSetType.BIRCH));
	public static final RegistryObject<Block> TALL_MACAW_JUNGLE_SWAMP_DOOR = BLOCKS.register(DDNames.TALL_MACAW_JUNGLE_SWAMP, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "jungle_swamp_door")), BlockSetType.JUNGLE));
	public static final RegistryObject<Block> TALL_MACAW_ACACIA_SWAMP_DOOR = BLOCKS.register(DDNames.TALL_MACAW_ACACIA_SWAMP, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "acacia_swamp_door")), BlockSetType.ACACIA));
	public static final RegistryObject<Block> TALL_MACAW_DARK_OAK_SWAMP_DOOR = BLOCKS.register(DDNames.TALL_MACAW_DARK_OAK_SWAMP, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_swamp_door")), BlockSetType.DARK_OAK));
	public static final RegistryObject<Block> TALL_MACAW_BAMBOO_SWAMP_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BAMBOO_SWAMP, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_swamp_door")), BlockSetType.BAMBOO));
	public static final RegistryObject<Block> TALL_MACAW_CRIMSON_SWAMP_DOOR = BLOCKS.register(DDNames.TALL_MACAW_CRIMSON_SWAMP, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "crimson_swamp_door")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_MACAW_WARPED_SWAMP_DOOR = BLOCKS.register(DDNames.TALL_MACAW_WARPED_SWAMP, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "warped_swamp_door")), BlockSetType.WARPED));
	
	public static final RegistryObject<Block> TALL_MACAW_OAK_BAMBOO_DOOR = BLOCKS.register(DDNames.TALL_MACAW_OAK_BAMBOO, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "oak_bamboo_door")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MACAW_SPRUCE_BAMBOO_DOOR = BLOCKS.register(DDNames.TALL_MACAW_SPRUCE_BAMBOO, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "spruce_bamboo_door")), BlockSetType.SPRUCE));
	public static final RegistryObject<Block> TALL_MACAW_BIRCH_BAMBOO_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BIRCH_BAMBOO, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "birch_bamboo_door")), BlockSetType.BIRCH));
	public static final RegistryObject<Block> TALL_MACAW_JUNGLE_BAMBOO_DOOR = BLOCKS.register(DDNames.TALL_MACAW_JUNGLE_BAMBOO, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "jungle_bamboo_door")), BlockSetType.JUNGLE));
	public static final RegistryObject<Block> TALL_MACAW_ACACIA_BAMBOO_DOOR = BLOCKS.register(DDNames.TALL_MACAW_ACACIA_BAMBOO, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "acacia_bamboo_door")), BlockSetType.ACACIA));
	public static final RegistryObject<Block> TALL_MACAW_DARK_OAK_BAMBOO_DOOR = BLOCKS.register(DDNames.TALL_MACAW_DARK_OAK_BAMBOO, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_bamboo_door")), BlockSetType.DARK_OAK));
	public static final RegistryObject<Block> TALL_MACAW_MANGROVE_BAMBOO_DOOR = BLOCKS.register(DDNames.TALL_MACAW_MANGROVE_BAMBOO, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_bamboo_door")), BlockSetType.MANGROVE));
	public static final RegistryObject<Block> TALL_MACAW_CRIMSON_BAMBOO_DOOR = BLOCKS.register(DDNames.TALL_MACAW_CRIMSON_BAMBOO, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "crimson_bamboo_door")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_MACAW_WARPED_BAMBOO_DOOR = BLOCKS.register(DDNames.TALL_MACAW_WARPED_BAMBOO, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "warped_bamboo_door")), BlockSetType.WARPED));
	
	public static final RegistryObject<Block> TALL_MACAW_OAK_NETHER_DOOR = BLOCKS.register(DDNames.TALL_MACAW_OAK_NETHER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "oak_nether_door")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MACAW_SPRUCE_NETHER_DOOR = BLOCKS.register(DDNames.TALL_MACAW_SPRUCE_NETHER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "spruce_nether_door")), BlockSetType.SPRUCE));
	public static final RegistryObject<Block> TALL_MACAW_BIRCH_NETHER_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BIRCH_NETHER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "birch_nether_door")), BlockSetType.BIRCH));
	public static final RegistryObject<Block> TALL_MACAW_JUNGLE_NETHER_DOOR = BLOCKS.register(DDNames.TALL_MACAW_JUNGLE_NETHER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "jungle_nether_door")), BlockSetType.JUNGLE));
	public static final RegistryObject<Block> TALL_MACAW_ACACIA_NETHER_DOOR = BLOCKS.register(DDNames.TALL_MACAW_ACACIA_NETHER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "acacia_nether_door")), BlockSetType.ACACIA));
	public static final RegistryObject<Block> TALL_MACAW_DARK_OAK_NETHER_DOOR = BLOCKS.register(DDNames.TALL_MACAW_DARK_OAK_NETHER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_nether_door")), BlockSetType.DARK_OAK));
	public static final RegistryObject<Block> TALL_MACAW_MANGROVE_NETHER_DOOR = BLOCKS.register(DDNames.TALL_MACAW_MANGROVE_NETHER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_nether_door")), BlockSetType.MANGROVE));
	public static final RegistryObject<Block> TALL_MACAW_BAMBOO_NETHER_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BAMBOO_NETHER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_nether_door")), BlockSetType.BAMBOO));
	public static final RegistryObject<Block> TALL_MACAW_WARPED_NETHER_DOOR = BLOCKS.register(DDNames.TALL_MACAW_WARPED_NETHER, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "warped_nether_door")), BlockSetType.WARPED));

	public static final RegistryObject<Block> TALL_MACAW_OAK_MYSTIC_DOOR = BLOCKS.register(DDNames.TALL_MACAW_OAK_MYSTIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "oak_mystic_door")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MACAW_SPRUCE_MYSTIC_DOOR = BLOCKS.register(DDNames.TALL_MACAW_SPRUCE_MYSTIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "spruce_mystic_door")), BlockSetType.SPRUCE));
	public static final RegistryObject<Block> TALL_MACAW_BIRCH_MYSTIC_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BIRCH_MYSTIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "birch_mystic_door")), BlockSetType.BIRCH));
	public static final RegistryObject<Block> TALL_MACAW_JUNGLE_MYSTIC_DOOR = BLOCKS.register(DDNames.TALL_MACAW_JUNGLE_MYSTIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "jungle_mystic_door")), BlockSetType.JUNGLE));
	public static final RegistryObject<Block> TALL_MACAW_ACACIA_MYSTIC_DOOR = BLOCKS.register(DDNames.TALL_MACAW_ACACIA_MYSTIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "acacia_mystic_door")), BlockSetType.ACACIA));
	public static final RegistryObject<Block> TALL_MACAW_DARK_OAK_MYSTIC_DOOR = BLOCKS.register(DDNames.TALL_MACAW_DARK_OAK_MYSTIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "dark_oak_mystic_door")), BlockSetType.DARK_OAK));
	public static final RegistryObject<Block> TALL_MACAW_MANGROVE_MYSTIC_DOOR = BLOCKS.register(DDNames.TALL_MACAW_MANGROVE_MYSTIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "mangrove_mystic_door")), BlockSetType.MANGROVE));
	public static final RegistryObject<Block> TALL_MACAW_BAMBOO_MYSTIC_DOOR = BLOCKS.register(DDNames.TALL_MACAW_BAMBOO_MYSTIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "bamboo_mystic_door")), BlockSetType.BAMBOO));
	public static final RegistryObject<Block> TALL_MACAW_CRIMSON_MYSTIC_DOOR = BLOCKS.register(DDNames.TALL_MACAW_CRIMSON_MYSTIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("mcwdoors", "crimson_mystic_door")), BlockSetType.CRIMSON));
 
	// ManyIdeas Doors
	public static final RegistryObject<Block> TALL_MANYIDEAS_COPPER_BAR_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_COPPER_BAR, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_copper_bar"), Blocks.IRON_DOOR), BlockSetType.IRON));
	public static final RegistryObject<Block> TALL_MANYIDEAS_COPPER_BARREL_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_COPPER_BARREL, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_copper_barrel"), Blocks.IRON_DOOR), BlockSetType.IRON));
	public static final RegistryObject<Block> TALL_MANYIDEAS_COPPER_BRICK_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_COPPER_BRICK, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_copper_brick"), Blocks.IRON_DOOR), BlockSetType.IRON));
	public static final RegistryObject<Block> TALL_MANYIDEAS_COPPER_CORRUGATED_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_COPPER_CORRUGATED, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_copper_corrugated"), Blocks.IRON_DOOR), BlockSetType.IRON));
	public static final RegistryObject<Block> TALL_MANYIDEAS_COPPER_FACTORY_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_COPPER_FACTORY, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_copper_factory"), Blocks.IRON_DOOR), BlockSetType.IRON));
	public static final RegistryObject<Block> TALL_MANYIDEAS_COPPER_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_COPPER_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_copper_glass"), Blocks.IRON_DOOR), BlockSetType.IRON));
	public static final RegistryObject<Block> TALL_MANYIDEAS_COPPER_MODERN_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_COPPER_MODERN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_copper_modern"), Blocks.IRON_DOOR), BlockSetType.IRON));
	public static final RegistryObject<Block> TALL_MANYIDEAS_COPPER_SHIP_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_COPPER_SHIP, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_copper_ship"), Blocks.IRON_DOOR), BlockSetType.IRON));
	public static final RegistryObject<Block> TALL_MANYIDEAS_COPPER_SMOOTH_SANDSTONE_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_COPPER_SMOOTH_SANDSTONE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_copper_smooth_sandstone"), Blocks.IRON_DOOR), BlockSetType.IRON));
	public static final RegistryObject<Block> TALL_MANYIDEAS_COPPER_STEAMPUNK_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_COPPER_STEAMPUNK, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_copper_steampunk"), Blocks.IRON_DOOR), BlockSetType.IRON));

	public static final RegistryObject<Block> TALL_MANYIDEAS_IRON_BOOKSHELF_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_IRON_BOOKSHELF, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_iron_bookshelf"), Blocks.IRON_DOOR), BlockSetType.IRON));
	public static final RegistryObject<Block> TALL_MANYIDEAS_IRON_DWARF_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_IRON_DWARF, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_iron_dwarf"), Blocks.IRON_DOOR), BlockSetType.IRON));
	public static final RegistryObject<Block> TALL_MANYIDEAS_IRON_FANTASY_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_IRON_FANTASY, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_iron_fantasy"), Blocks.IRON_DOOR), BlockSetType.IRON));
	public static final RegistryObject<Block> TALL_MANYIDEAS_IRON_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_IRON_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_iron_glass"), Blocks.IRON_DOOR), BlockSetType.IRON));
	public static final RegistryObject<Block> TALL_MANYIDEAS_IRON_LABORATORY_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_IRON_LABORATORY, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_iron_laboratory"), Blocks.IRON_DOOR), BlockSetType.IRON));
	public static final RegistryObject<Block> TALL_MANYIDEAS_IRON_RUSTED_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_IRON_RUSTED, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_iron_rusted"), Blocks.IRON_DOOR), BlockSetType.IRON));
	public static final RegistryObject<Block> TALL_MANYIDEAS_IRON_SAFE_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_IRON_SAFE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_iron_safe"), Blocks.IRON_DOOR), BlockSetType.IRON));
	public static final RegistryObject<Block> TALL_MANYIDEAS_IRON_SHIP_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_IRON_SHIP, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_iron_ship"), Blocks.IRON_DOOR), BlockSetType.IRON));
	public static final RegistryObject<Block> TALL_MANYIDEAS_IRON_SPACE_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_IRON_SPACE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_iron_space"), Blocks.IRON_DOOR), BlockSetType.IRON));
	public static final RegistryObject<Block> TALL_MANYIDEAS_IRON_STONE_BRICK_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_IRON_STONE_BRICK, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_iron_stone_brick"), Blocks.IRON_DOOR), BlockSetType.IRON));

	public static final RegistryObject<Block> TALL_MANYIDEAS_OAK_BLANK_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_OAK_BLANK, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_oak_blank")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_OAK_BOOKSHELF_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_OAK_BOOKSHELF, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_oak_bookshelf")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_OAK_CASSETTE_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_OAK_CASSETTE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_oak_cassette")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_OAK_FRENCH_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_OAK_FRENCH, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_oak_french")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_OAK_FROSTED_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_OAK_FROSTED, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_oak_frosted")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_OAK_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_OAK_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_oak_glass")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_OAK_HEART_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_OAK_HEART, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_oak_heart")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_OAK_ORIGIN_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_OAK_ORIGIN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_oak_origin")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_OAK_RUSTIC_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_OAK_RUSTIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_oak_rustic")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_OAK_SHOJI_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_OAK_SHOJI, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_oak_shoji")), BlockSetType.OAK));

	public static final RegistryObject<Block> TALL_MANYIDEAS_SPRUCE_BLANK_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_SPRUCE_BLANK, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_spruce_blank")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_SPRUCE_BOOKSHELF_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_SPRUCE_BOOKSHELF, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_spruce_bookshelf")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_SPRUCE_CASSETTE_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_SPRUCE_CASSETTE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_spruce_cassette")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_SPRUCE_FRENCH_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_SPRUCE_FRENCH, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_spruce_french")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_SPRUCE_FROSTED_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_SPRUCE_FROSTED, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_spruce_frosted")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_SPRUCE_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_SPRUCE_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_spruce_glass")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_SPRUCE_HEART_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_SPRUCE_HEART, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_spruce_heart")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_SPRUCE_ORIGIN_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_SPRUCE_ORIGIN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_spruce_origin")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_SPRUCE_RUSTIC_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_SPRUCE_RUSTIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_spruce_rustic")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_SPRUCE_SHOJI_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_SPRUCE_SHOJI, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_spruce_shoji")), BlockSetType.OAK));

	public static final RegistryObject<Block> TALL_MANYIDEAS_BIRCH_BLANK_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_BIRCH_BLANK, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_birch_blank")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_BIRCH_BOOKSHELF_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_BIRCH_BOOKSHELF, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_birch_bookshelf")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_BIRCH_CASSETTE_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_BIRCH_CASSETTE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_birch_cassette")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_BIRCH_FRENCH_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_BIRCH_FRENCH, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_birch_french")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_BIRCH_FROSTED_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_BIRCH_FROSTED, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_birch_frosted")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_BIRCH_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_BIRCH_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_birch_glass")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_BIRCH_HEART_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_BIRCH_HEART, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_birch_heart")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_BIRCH_ORIGIN_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_BIRCH_ORIGIN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_birch_origin")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_BIRCH_RUSTIC_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_BIRCH_RUSTIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_birch_rustic")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_BIRCH_SHOJI_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_BIRCH_SHOJI, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_birch_shoji")), BlockSetType.OAK));

	public static final RegistryObject<Block> TALL_MANYIDEAS_JUNGLE_BLANK_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_JUNGLE_BLANK, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_jungle_blank")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_JUNGLE_BOOKSHELF_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_JUNGLE_BOOKSHELF, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_jungle_bookshelf")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_JUNGLE_CASSETTE_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_JUNGLE_CASSETTE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_jungle_cassette")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_JUNGLE_FRENCH_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_JUNGLE_FRENCH, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_jungle_french")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_JUNGLE_FROSTED_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_JUNGLE_FROSTED, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_jungle_frosted")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_JUNGLE_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_JUNGLE_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_jungle_glass")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_JUNGLE_HEART_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_JUNGLE_HEART, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_jungle_heart")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_JUNGLE_ORIGIN_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_JUNGLE_ORIGIN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_jungle_origin")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_JUNGLE_RUSTIC_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_JUNGLE_RUSTIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_jungle_rustic")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_JUNGLE_SHOJI_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_JUNGLE_SHOJI, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_jungle_shoji")), BlockSetType.OAK));

	public static final RegistryObject<Block> TALL_MANYIDEAS_ACACIA_BLANK_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_ACACIA_BLANK, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_acacia_blank")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_ACACIA_BOOKSHELF_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_ACACIA_BOOKSHELF, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_acacia_bookshelf")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_ACACIA_CASSETTE_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_ACACIA_CASSETTE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_acacia_cassette")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_ACACIA_FRENCH_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_ACACIA_FRENCH, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_acacia_french")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_ACACIA_FROSTED_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_ACACIA_FROSTED, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_acacia_frosted")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_ACACIA_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_ACACIA_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_acacia_glass")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_ACACIA_HEART_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_ACACIA_HEART, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_acacia_heart")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_ACACIA_ORIGIN_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_ACACIA_ORIGIN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_acacia_origin")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_ACACIA_RUSTIC_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_ACACIA_RUSTIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_acacia_rustic")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_ACACIA_SHOJI_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_ACACIA_SHOJI, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_acacia_shoji")), BlockSetType.OAK));

	public static final RegistryObject<Block> TALL_MANYIDEAS_DARK_OAK_BLANK_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_DARK_OAK_BLANK, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_dark_oak_blank")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_DARK_OAK_BOOKSHELF_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_DARK_OAK_BOOKSHELF, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_dark_oak_bookshelf")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_DARK_OAK_CASSETTE_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_DARK_OAK_CASSETTE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_dark_oak_cassette")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_DARK_OAK_FRENCH_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_DARK_OAK_FRENCH, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_dark_oak_french")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_DARK_OAK_FROSTED_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_DARK_OAK_FROSTED, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_dark_oak_frosted")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_DARK_OAK_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_DARK_OAK_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_dark_oak_glass")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_DARK_OAK_HEART_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_DARK_OAK_HEART, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_dark_oak_heart")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_DARK_OAK_ORIGIN_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_DARK_OAK_ORIGIN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_dark_oak_origin")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_DARK_OAK_RUSTIC_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_DARK_OAK_RUSTIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_dark_oak_rustic")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_DARK_OAK_SHOJI_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_DARK_OAK_SHOJI, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_dark_oak_shoji")), BlockSetType.OAK));

	public static final RegistryObject<Block> TALL_MANYIDEAS_MANGROVE_BLANK_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_MANGROVE_BLANK, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_mangrove_blank")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_MANGROVE_BOOKSHELF_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_MANGROVE_BOOKSHELF, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_mangrove_bookshelf")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_MANGROVE_CASSETTE_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_MANGROVE_CASSETTE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_mangrove_cassette")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_MANGROVE_FRENCH_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_MANGROVE_FRENCH, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_mangrove_french")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_MANGROVE_FROSTED_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_MANGROVE_FROSTED, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_mangrove_frosted")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_MANGROVE_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_MANGROVE_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_mangrove_glass")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_MANGROVE_HEART_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_MANGROVE_HEART, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_mangrove_heart")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_MANGROVE_ORIGIN_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_MANGROVE_ORIGIN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_mangrove_origin")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_MANGROVE_RUSTIC_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_MANGROVE_RUSTIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_mangrove_rustic")), BlockSetType.OAK));
	public static final RegistryObject<Block> TALL_MANYIDEAS_MANGROVE_SHOJI_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_MANGROVE_SHOJI, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_mangrove_shoji")), BlockSetType.OAK));

	public static final RegistryObject<Block> TALL_MANYIDEAS_CRIMSON_BLANK_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_CRIMSON_BLANK, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_crimson_blank")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_MANYIDEAS_CRIMSON_BOOKSHELF_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_CRIMSON_BOOKSHELF, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_crimson_bookshelf")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_MANYIDEAS_CRIMSON_CASSETTE_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_CRIMSON_CASSETTE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_crimson_cassette")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_MANYIDEAS_CRIMSON_FRENCH_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_CRIMSON_FRENCH, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_crimson_french")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_MANYIDEAS_CRIMSON_FROSTED_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_CRIMSON_FROSTED, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_crimson_frosted")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_MANYIDEAS_CRIMSON_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_CRIMSON_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_crimson_glass")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_MANYIDEAS_CRIMSON_HEART_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_CRIMSON_HEART, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_crimson_heart")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_MANYIDEAS_CRIMSON_ORIGIN_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_CRIMSON_ORIGIN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_crimson_origin")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_MANYIDEAS_CRIMSON_RUSTIC_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_CRIMSON_RUSTIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_crimson_rustic")), BlockSetType.CRIMSON));
	public static final RegistryObject<Block> TALL_MANYIDEAS_CRIMSON_SHOJI_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_CRIMSON_SHOJI, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_crimson_shoji")), BlockSetType.CRIMSON));

	public static final RegistryObject<Block> TALL_MANYIDEAS_WARPED_BLANK_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_WARPED_BLANK, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_warped_blank")), BlockSetType.WARPED));
	public static final RegistryObject<Block> TALL_MANYIDEAS_WARPED_BOOKSHELF_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_WARPED_BOOKSHELF, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_warped_bookshelf")), BlockSetType.WARPED));
	public static final RegistryObject<Block> TALL_MANYIDEAS_WARPED_CASSETTE_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_WARPED_CASSETTE, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_warped_cassette")), BlockSetType.WARPED));
	public static final RegistryObject<Block> TALL_MANYIDEAS_WARPED_FRENCH_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_WARPED_FRENCH, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_warped_french")), BlockSetType.WARPED));
	public static final RegistryObject<Block> TALL_MANYIDEAS_WARPED_FROSTED_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_WARPED_FROSTED, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_warped_frosted")), BlockSetType.WARPED));
	public static final RegistryObject<Block> TALL_MANYIDEAS_WARPED_GLASS_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_WARPED_GLASS, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_warped_glass")), BlockSetType.WARPED));
	public static final RegistryObject<Block> TALL_MANYIDEAS_WARPED_HEART_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_WARPED_HEART, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_warped_heart")), BlockSetType.WARPED));
	public static final RegistryObject<Block> TALL_MANYIDEAS_WARPED_ORIGIN_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_WARPED_ORIGIN, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_warped_origin")), BlockSetType.WARPED));
	public static final RegistryObject<Block> TALL_MANYIDEAS_WARPED_RUSTIC_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_WARPED_RUSTIC, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_warped_rustic")), BlockSetType.WARPED));
	public static final RegistryObject<Block> TALL_MANYIDEAS_WARPED_SHOJI_DOOR = BLOCKS.register(DDNames.TALL_MANYIDEAS_WARPED_SHOJI, () -> new TallDoorBlock(getBlockByKey(new ResourceLocation("manyideas_doors", "door_warped_shoji")), BlockSetType.WARPED));
	
    public static Block getBlockByKey(ResourceLocation loc) {
    	return getBlockByKey(loc, Blocks.OAK_DOOR);
    }
	
    public static Block getBlockByKey(ResourceLocation loc, Block fallback) {
    	if (ForgeRegistries.BLOCKS.containsKey(loc)) {
    		return ForgeRegistries.BLOCKS.getValue(loc);
    	}
    	else {
    		return fallback; // Fallback
    	}
    }
}
