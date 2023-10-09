package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class YippeeCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MYSTICAL_OAK, DDNames.SHORT_MYSTICAL_OAK, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("yippee", "mystical_oak_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MYSTICAL_OAK, new ResourceLocation("yippee", "mystical_oak_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MYSTICAL_OAK, new ResourceLocation("yippee", "mystical_oak_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MYSTICAL_OAK, new ResourceLocation("yippee", "mystical_oak_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MYSTICAL_OAK, new ResourceLocation("yippee", "mystical_oak_door"), "tall_wooden_door");
	}
}