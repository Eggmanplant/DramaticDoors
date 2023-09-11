package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class ForbiddenArcanusCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_DEORUM, DDNames.SHORT_DEORUM, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("forbidden_arcanus", "deorum_door")), BlockSetType.IRON, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_ARCANE_EDELWOOD, DDNames.SHORT_ARCANE_EDELWOOD, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("forbidden_arcanus", "arcane_edelwood_door")), BlockSetType.DARK_OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_AURUM, DDNames.SHORT_AURUM, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("forbidden_arcanus", "aurum_door")), BlockSetType.DARK_OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_EDELWOOD, DDNames.SHORT_EDELWOOD, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("forbidden_arcanus", "edelwood_door")), BlockSetType.DARK_OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_FUNGYSS, DDNames.SHORT_FUNGYSS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("forbidden_arcanus", "fungyss_door")), BlockSetType.WARPED, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_DEORUM, new ResourceLocation("forbidden_arcanus", "deorum_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_ARCANE_EDELWOOD, new ResourceLocation("forbidden_arcanus", "arcane_edelwood_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_AURUM, new ResourceLocation("forbidden_arcanus", "aurum_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_EDELWOOD, new ResourceLocation("forbidden_arcanus", "edelwood_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_FUNGYSS, new ResourceLocation("forbidden_arcanus", "fungyss_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_DEORUM, new ResourceLocation("forbidden_arcanus", "deorum_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_ARCANE_EDELWOOD, new ResourceLocation("forbidden_arcanus", "arcane_edelwood_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_AURUM, new ResourceLocation("forbidden_arcanus", "aurum_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_EDELWOOD, new ResourceLocation("forbidden_arcanus", "edelwood_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_FUNGYSS, new ResourceLocation("forbidden_arcanus", "fungyss_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_DEORUM, new ResourceLocation("forbidden_arcanus", "deorum_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_ARCANE_EDELWOOD, new ResourceLocation("forbidden_arcanus", "arcane_edelwood_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_AURUM, new ResourceLocation("forbidden_arcanus", "aurum_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_EDELWOOD, new ResourceLocation("forbidden_arcanus", "edelwood_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_FUNGYSS, new ResourceLocation("forbidden_arcanus", "fungyss_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_DEORUM, new ResourceLocation("forbidden_arcanus", "deorum_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_ARCANE_EDELWOOD, new ResourceLocation("forbidden_arcanus", "arcane_edelwood_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_AURUM, new ResourceLocation("forbidden_arcanus", "aurum_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_EDELWOOD, new ResourceLocation("forbidden_arcanus", "edelwood_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_FUNGYSS, new ResourceLocation("forbidden_arcanus", "fungyss_door"), "tall_wooden_door");
	}
}
