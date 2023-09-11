package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class TinkersConstructCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_BLOODSHROOM, DDNames.SHORT_BLOODSHROOM, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("tconstruct", "bloodshroom_door")), BlockSetType.CRIMSON, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_GREENHEART, DDNames.SHORT_GREENHEART, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("tconstruct", "greenheart_door")), BlockSetType.MANGROVE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_SKYROOT, DDNames.SHORT_SKYROOT, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("tconstruct", "skyroot_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_BLOODSHROOM, new ResourceLocation("tconstruct", "bloodshroom_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_GREENHEART, new ResourceLocation("tconstruct", "greenheart_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_SKYROOT, new ResourceLocation("tconstruct", "skyroot_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_BLOODSHROOM, new ResourceLocation("tconstruct", "bloodshroom_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_GREENHEART, new ResourceLocation("tconstruct", "greenheart_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_SKYROOT, new ResourceLocation("tconstruct", "skyroot_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_BLOODSHROOM, new ResourceLocation("tconstruct", "bloodshroom_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_GREENHEART, new ResourceLocation("tconstruct", "greenheart_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_SKYROOT, new ResourceLocation("tconstruct", "skyroot_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_BLOODSHROOM, new ResourceLocation("tconstruct", "bloodshroom_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_GREENHEART, new ResourceLocation("tconstruct", "greenheart_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_SKYROOT, new ResourceLocation("tconstruct", "skyroot_door"), "tall_wooden_door");
	}
}
