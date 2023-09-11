package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class PromenadeCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_PROMENADE_CHERRY_OAK, DDNames.SHORT_PROMENADE_CHERRY_OAK, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("promenade", "cherry_oak_door")), BlockSetType.CHERRY, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_PROMENADE_DARK_AMARANTH, DDNames.SHORT_PROMENADE_DARK_AMARANTH, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("promenade", "dark_amaranth_door")), BlockSetType.DARK_OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_PROMENADE_PALM, DDNames.SHORT_PROMENADE_PALM, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("promenade", "palm_door")), BlockSetType.JUNGLE, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_PROMENADE_CHERRY_OAK, new ResourceLocation("promenade", "cherry_oak_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_PROMENADE_DARK_AMARANTH, new ResourceLocation("promenade", "dark_amaranth_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_PROMENADE_PALM, new ResourceLocation("promenade", "palm_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_PROMENADE_CHERRY_OAK, new ResourceLocation("promenade", "cherry_oak_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_PROMENADE_DARK_AMARANTH, new ResourceLocation("promenade", "dark_amaranth_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_PROMENADE_PALM, new ResourceLocation("promenade", "palm_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_PROMENADE_CHERRY_OAK, new ResourceLocation("promenade", "cherry_oak_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_PROMENADE_DARK_AMARANTH, new ResourceLocation("promenade", "dark_amaranth_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_PROMENADE_PALM, new ResourceLocation("promenade", "palm_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_PROMENADE_CHERRY_OAK, new ResourceLocation("promenade", "cherry_oak_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_PROMENADE_DARK_AMARANTH, new ResourceLocation("promenade", "dark_amaranth_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_PROMENADE_PALM, new ResourceLocation("promenade", "palm_door"), "tall_wooden_door");
	}
}
