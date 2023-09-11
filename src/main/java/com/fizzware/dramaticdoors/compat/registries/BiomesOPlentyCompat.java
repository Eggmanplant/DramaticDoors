package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class BiomesOPlentyCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_BOP_DEAD, DDNames.SHORT_BOP_DEAD, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("biomesoplenty", "dead_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_BOP_FIR, DDNames.SHORT_BOP_FIR, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("biomesoplenty", "fir_door")), BlockSetType.SPRUCE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_BOP_HELLBARK, DDNames.SHORT_BOP_HELLBARK, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("biomesoplenty", "hellbark_door")), BlockSetType.CRIMSON, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_BOP_JACARANDA, DDNames.SHORT_BOP_JACARANDA, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("biomesoplenty", "jacaranda_door")), BlockSetType.ACACIA, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_BOP_MAGIC, DDNames.SHORT_BOP_MAGIC, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("biomesoplenty", "magic_door")), BlockSetType.BIRCH, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_BOP_MAHOGANY, DDNames.SHORT_BOP_MAHOGANY, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("biomesoplenty", "mahogany_door")), BlockSetType.ACACIA, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_BOP_PALM, DDNames.SHORT_BOP_PALM, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("biomesoplenty", "palm_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_BOP_REDWOOD, DDNames.SHORT_BOP_REDWOOD, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("biomesoplenty", "redwood_door")), BlockSetType.JUNGLE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_BOP_UMBRAN, DDNames.SHORT_BOP_UMBRAN, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("biomesoplenty", "umbran_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_BOP_WILLOW, DDNames.SHORT_BOP_WILLOW, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("biomesoplenty", "willow_door")), BlockSetType.MANGROVE, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_BOP_DEAD, new ResourceLocation("biomesoplenty", "dead_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_BOP_FIR, new ResourceLocation("biomesoplenty", "fir_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_BOP_HELLBARK, new ResourceLocation("biomesoplenty", "hellbark_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_BOP_JACARANDA, new ResourceLocation("biomesoplenty", "jacaranda_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_BOP_MAGIC, new ResourceLocation("biomesoplenty", "magic_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_BOP_MAHOGANY, new ResourceLocation("biomesoplenty", "mahogany_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_BOP_PALM, new ResourceLocation("biomesoplenty", "palm_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_BOP_REDWOOD, new ResourceLocation("biomesoplenty", "redwood_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_BOP_UMBRAN, new ResourceLocation("biomesoplenty", "umbran_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_BOP_WILLOW, new ResourceLocation("biomesoplenty", "willow_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_BOP_DEAD, new ResourceLocation("biomesoplenty", "dead_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_BOP_FIR, new ResourceLocation("biomesoplenty", "fir_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_BOP_HELLBARK, new ResourceLocation("biomesoplenty", "hellbark_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_BOP_JACARANDA, new ResourceLocation("biomesoplenty", "jacaranda_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_BOP_MAGIC, new ResourceLocation("biomesoplenty", "magic_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_BOP_MAHOGANY, new ResourceLocation("biomesoplenty", "mahogany_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_BOP_PALM, new ResourceLocation("biomesoplenty", "palm_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_BOP_REDWOOD, new ResourceLocation("biomesoplenty", "redwood_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_BOP_UMBRAN, new ResourceLocation("biomesoplenty", "umbran_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_BOP_WILLOW, new ResourceLocation("biomesoplenty", "willow_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_BOP_DEAD, new ResourceLocation("biomesoplenty", "dead_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_BOP_FIR, new ResourceLocation("biomesoplenty", "fir_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_BOP_HELLBARK, new ResourceLocation("biomesoplenty", "hellbark_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_BOP_JACARANDA, new ResourceLocation("biomesoplenty", "jacaranda_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_BOP_MAGIC, new ResourceLocation("biomesoplenty", "magic_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_BOP_MAHOGANY, new ResourceLocation("biomesoplenty", "mahogany_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_BOP_PALM, new ResourceLocation("biomesoplenty", "palm_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_BOP_REDWOOD, new ResourceLocation("biomesoplenty", "redwood_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_BOP_UMBRAN, new ResourceLocation("biomesoplenty", "umbran_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_BOP_WILLOW, new ResourceLocation("biomesoplenty", "willow_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_BOP_DEAD, new ResourceLocation("biomesoplenty", "dead_door"), "tall_bop_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_BOP_FIR, new ResourceLocation("biomesoplenty", "fir_door"), "tall_bop_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_BOP_HELLBARK, new ResourceLocation("biomesoplenty", "hellbark_door"), "tall_bop_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_BOP_JACARANDA, new ResourceLocation("biomesoplenty", "jacaranda_door"), "tall_bop_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_BOP_MAGIC, new ResourceLocation("biomesoplenty", "magic_door"), "tall_bop_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_BOP_MAHOGANY, new ResourceLocation("biomesoplenty", "mahogany_door"), "tall_bop_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_BOP_PALM, new ResourceLocation("biomesoplenty", "palm_door"), "tall_bop_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_BOP_REDWOOD, new ResourceLocation("biomesoplenty", "redwood_door"), "tall_bop_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_BOP_UMBRAN, new ResourceLocation("biomesoplenty", "umbran_door"), "tall_bop_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_BOP_WILLOW, new ResourceLocation("biomesoplenty", "willow_door"), "tall_bop_wooden_door");
	}
}
