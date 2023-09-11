package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class SilentGearCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_NETHERWOOD, DDNames.SHORT_NETHERWOOD, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("silentgear", "netherwood_door")), BlockSetType.CRIMSON, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_NETHERWOOD, new ResourceLocation("silentgear", "netherwood_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_NETHERWOOD, new ResourceLocation("silentgear", "netherwood_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MORECRAFT_NETHERWOOD, new ResourceLocation("morecraft", "netherwood_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MORECRAFT_NETHERWOOD, new ResourceLocation("morecraft", "netherwood_door"), "tall_wooden_door");
	}
}
