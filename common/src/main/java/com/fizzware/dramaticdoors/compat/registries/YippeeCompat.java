package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;


public class YippeeCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MYSTICAL_OAK, DDNames.SHORT_MYSTICAL_OAK, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("yippee", "mystical_oak_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MYSTICAL_OAK, new ResourceLocation("yippee", "mystical_oak_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MYSTICAL_OAK, new ResourceLocation("yippee", "mystical_oak_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MYSTICAL_OAK, new ResourceLocation("yippee", "mystical_oak_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MYSTICAL_OAK, new ResourceLocation("yippee", "mystical_oak_door"), "tall_wooden_door");
	}
}
