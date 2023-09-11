package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class BiomeMakeoverCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_BM_ANCIENT_OAK, DDNames.SHORT_BM_ANCIENT_OAK, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("biomemakeover", "ancient_oak_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_BM_BLIGHTED_BALSA, DDNames.SHORT_BM_BLIGHTED_BALSA, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("biomemakeover", "blighted_balsa_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_BM_SWAMP_CYPRESS, DDNames.SHORT_BM_SWAMP_CYPRESS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("biomemakeover", "swamp_cypress_door")), BlockSetType.MANGROVE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_BM_WILLOW, DDNames.SHORT_BM_WILLOW, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("biomemakeover", "willow_door")), BlockSetType.MANGROVE, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_BM_ANCIENT_OAK, new ResourceLocation("biomemakeover", "ancient_oak_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_BM_BLIGHTED_BALSA, new ResourceLocation("biomemakeover", "blighted_balsa_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_BM_SWAMP_CYPRESS, new ResourceLocation("biomemakeover", "swamp_cypress_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_BM_WILLOW, new ResourceLocation("biomemakeover", "willow_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_BM_ANCIENT_OAK, new ResourceLocation("biomemakeover", "ancient_oak_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_BM_BLIGHTED_BALSA, new ResourceLocation("biomemakeover", "blighted_balsa_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_BM_SWAMP_CYPRESS, new ResourceLocation("biomemakeover", "swamp_cypress_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_BM_WILLOW, new ResourceLocation("biomemakeover", "willow_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_BM_ANCIENT_OAK, new ResourceLocation("biomemakeover", "ancient_oak_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_BM_BLIGHTED_BALSA, new ResourceLocation("biomemakeover", "blighted_balsa_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_BM_SWAMP_CYPRESS, new ResourceLocation("biomemakeover", "swamp_cypress_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_BM_WILLOW, new ResourceLocation("biomemakeover", "willow_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_BM_ANCIENT_OAK, new ResourceLocation("biomemakeover", "ancient_oak_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_BM_BLIGHTED_BALSA, new ResourceLocation("biomemakeover", "blighted_balsa_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_BM_SWAMP_CYPRESS, new ResourceLocation("biomemakeover", "swamp_cypress_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_BM_WILLOW, new ResourceLocation("biomemakeover", "willow_door"), "tall_wooden_door");
	}
}
