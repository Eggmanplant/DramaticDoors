package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class MorecraftCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MORECRAFT_BONE, DDNames.SHORT_MORECRAFT_BONE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("morecraft", "bone_door")), BlockSetType.STONE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MORECRAFT_GLASS, DDNames.SHORT_MORECRAFT_GLASS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("morecraft", "glass_door")), BlockSetType.STONE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MORECRAFT_SOUL_GLASS, DDNames.SHORT_MORECRAFT_SOUL_GLASS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("morecraft", "soul_glass_door")), BlockSetType.STONE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MORECRAFT_NETHERWOOD, DDNames.SHORT_MORECRAFT_NETHERWOOD, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("morecraft", "netherwood_door")), BlockSetType.CRIMSON, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MORECRAFT_NETHERBRICK, DDNames.SHORT_MORECRAFT_NETHERBRICK, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("morecraft", "netherbrick_door")), BlockSetType.STONE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MORECRAFT_NETHERITE, DDNames.SHORT_MORECRAFT_NETHERITE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("morecraft", "netherite_door")), BlockSetType.IRON, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MORECRAFT_BONE, new ResourceLocation("morecraft", "bone_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MORECRAFT_GLASS, new ResourceLocation("morecraft", "glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MORECRAFT_SOUL_GLASS, new ResourceLocation("morecraft", "soul_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MORECRAFT_NETHERWOOD, new ResourceLocation("morecraft", "netherwood_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MORECRAFT_NETHERBRICK, new ResourceLocation("morecraft", "netherbrick_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MORECRAFT_NETHERITE, new ResourceLocation("morecraft", "netherite_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MORECRAFT_BONE, new ResourceLocation("morecraft", "bone_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MORECRAFT_GLASS, new ResourceLocation("morecraft", "glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MORECRAFT_SOUL_GLASS, new ResourceLocation("morecraft", "soul_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MORECRAFT_NETHERWOOD, new ResourceLocation("morecraft", "netherwood_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MORECRAFT_NETHERBRICK, new ResourceLocation("morecraft", "netherbrick_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MORECRAFT_NETHERITE, new ResourceLocation("morecraft", "netherite_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MORECRAFT_BONE, new ResourceLocation("morecraft", "bone_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MORECRAFT_GLASS, new ResourceLocation("morecraft", "glass_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MORECRAFT_SOUL_GLASS, new ResourceLocation("morecraft", "soul_glass_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MORECRAFT_NETHERWOOD, new ResourceLocation("morecraft", "netherwood_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MORECRAFT_NETHERBRICK, new ResourceLocation("morecraft", "netherbrick_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MORECRAFT_NETHERITE, new ResourceLocation("morecraft", "netherite_door"), false);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MORECRAFT_BONE, new ResourceLocation("morecraft", "bone_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MORECRAFT_GLASS, new ResourceLocation("morecraft", "glass_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MORECRAFT_SOUL_GLASS, new ResourceLocation("morecraft", "soul_glass_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MORECRAFT_NETHERWOOD, new ResourceLocation("morecraft", "netherwood_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MORECRAFT_NETHERBRICK, new ResourceLocation("morecraft", "netherbrick_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MORECRAFT_NETHERITE, new ResourceLocation("morecraft", "netherite_door"), "tall_metal_door");
	}
}
