package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class CopperOverhaulCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_CO_COPPER, DDNames.SHORT_CO_COPPER, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("copperoverhaul", "copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_CO_EXPOSED_COPPER, DDNames.SHORT_CO_EXPOSED_COPPER, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("copperoverhaul", "exposed_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_CO_WEATHERED_COPPER, DDNames.SHORT_CO_WEATHERED_COPPER, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("copperoverhaul", "weathered_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_CO_OXIDIZED_COPPER, DDNames.SHORT_CO_OXIDIZED_COPPER, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("copperoverhaul", "oxidized_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_CO_COPPER, new ResourceLocation("copperoverhaul", "copper_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_CO_EXPOSED_COPPER, new ResourceLocation("copperoverhaul", "exposed_copper_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_CO_WEATHERED_COPPER, new ResourceLocation("copperoverhaul", "weathered_copper_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_CO_OXIDIZED_COPPER, new ResourceLocation("copperoverhaul", "oxidized_copper_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_CO_COPPER, new ResourceLocation("copperoverhaul", "copper_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_CO_EXPOSED_COPPER, new ResourceLocation("copperoverhaul", "exposed_copper_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_CO_WEATHERED_COPPER, new ResourceLocation("copperoverhaul", "weathered_copper_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_CO_OXIDIZED_COPPER, new ResourceLocation("copperoverhaul", "oxidized_copper_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_CO_COPPER, new ResourceLocation("copperoverhaul", "copper_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_CO_EXPOSED_COPPER, new ResourceLocation("copperoverhaul", "exposed_copper_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_CO_WEATHERED_COPPER, new ResourceLocation("copperoverhaul", "weathered_copper_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_CO_OXIDIZED_COPPER, new ResourceLocation("copperoverhaul", "oxidized_copper_door"), false);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_CO_COPPER, new ResourceLocation("copperoverhaul", "copper_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_CO_EXPOSED_COPPER, new ResourceLocation("copperoverhaul", "exposed_copper_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_CO_WEATHERED_COPPER, new ResourceLocation("copperoverhaul", "weathered_copper_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_CO_OXIDIZED_COPPER, new ResourceLocation("copperoverhaul", "oxidized_copper_door"), "tall_metal_door");
	}
}
