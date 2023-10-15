package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;


public class PokecubeCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_POKECUBE_AGED, DDNames.SHORT_POKECUBE_AGED, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("pokecube", "aged_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_POKECUBE_CONCRETE, DDNames.SHORT_POKECUBE_CONCRETE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("pokecube", "concrete_door"), Blocks.IRON_DOOR), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_POKECUBE_CORRUPTED, DDNames.SHORT_POKECUBE_CORRUPTED, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("pokecube", "corrupted_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_POKECUBE_DISTORTIC, DDNames.SHORT_POKECUBE_DISTORTIC, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("pokecube", "distortic_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_POKECUBE_INVERTED, DDNames.SHORT_POKECUBE_INVERTED, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("pokecube", "inverted_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_POKECUBE_MIRAGE, DDNames.SHORT_POKECUBE_MIRAGE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("pokecube", "mirage_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_POKECUBE_TEMPORAL, DDNames.SHORT_POKECUBE_TEMPORAL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("pokecube", "temporal_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_POKECUBE_ENIGMA, DDNames.SHORT_POKECUBE_ENIGMA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("pokecube", "enigma_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_POKECUBE_LEPPA, DDNames.SHORT_POKECUBE_LEPPA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("pokecube", "leppa_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_POKECUBE_NANAB, DDNames.SHORT_POKECUBE_NANAB, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("pokecube", "nanab_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_POKECUBE_ORAN, DDNames.SHORT_POKECUBE_ORAN, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("pokecube", "oran_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_POKECUBE_PECHA, DDNames.SHORT_POKECUBE_PECHA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("pokecube", "pecha_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_POKECUBE_SITRUS, DDNames.SHORT_POKECUBE_SITRUS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("pokecube", "sitrus_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_POKECUBE_AGED, new ResourceLocation("pokecube", "aged_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_POKECUBE_CONCRETE, new ResourceLocation("pokecube", "concrete_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_POKECUBE_CORRUPTED, new ResourceLocation("pokecube", "corrupted_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_POKECUBE_DISTORTIC, new ResourceLocation("pokecube", "distortic_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_POKECUBE_INVERTED, new ResourceLocation("pokecube", "inverted_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_POKECUBE_MIRAGE, new ResourceLocation("pokecube", "mirage_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_POKECUBE_TEMPORAL, new ResourceLocation("pokecube", "temporal_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_POKECUBE_ENIGMA, new ResourceLocation("pokecube", "enigma_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_POKECUBE_LEPPA, new ResourceLocation("pokecube", "leppa_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_POKECUBE_NANAB, new ResourceLocation("pokecube", "nanab_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_POKECUBE_ORAN, new ResourceLocation("pokecube", "oran_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_POKECUBE_PECHA, new ResourceLocation("pokecube", "pecha_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_POKECUBE_SITRUS, new ResourceLocation("pokecube", "sitrus_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_POKECUBE_AGED, new ResourceLocation("pokecube", "aged_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_POKECUBE_CONCRETE, new ResourceLocation("pokecube", "concrete_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_POKECUBE_CORRUPTED, new ResourceLocation("pokecube", "corrupted_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_POKECUBE_DISTORTIC, new ResourceLocation("pokecube", "distortic_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_POKECUBE_INVERTED, new ResourceLocation("pokecube", "inverted_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_POKECUBE_MIRAGE, new ResourceLocation("pokecube", "mirage_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_POKECUBE_TEMPORAL, new ResourceLocation("pokecube", "temporal_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_POKECUBE_ENIGMA, new ResourceLocation("pokecube", "enigma_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_POKECUBE_LEPPA, new ResourceLocation("pokecube", "leppa_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_POKECUBE_NANAB, new ResourceLocation("pokecube", "nanab_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_POKECUBE_ORAN, new ResourceLocation("pokecube", "oran_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_POKECUBE_PECHA, new ResourceLocation("pokecube", "pecha_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_POKECUBE_SITRUS, new ResourceLocation("pokecube", "sitrus_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_POKECUBE_AGED, new ResourceLocation("pokecube", "aged_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_POKECUBE_CONCRETE, new ResourceLocation("pokecube", "concrete_door"), false);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_POKECUBE_CORRUPTED, new ResourceLocation("pokecube", "corrupted_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_POKECUBE_DISTORTIC, new ResourceLocation("pokecube", "distortic_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_POKECUBE_INVERTED, new ResourceLocation("pokecube", "inverted_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_POKECUBE_MIRAGE, new ResourceLocation("pokecube", "mirage_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_POKECUBE_TEMPORAL, new ResourceLocation("pokecube", "temporal_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_POKECUBE_ENIGMA, new ResourceLocation("pokecube", "enigma_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_POKECUBE_LEPPA, new ResourceLocation("pokecube", "leppa_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_POKECUBE_NANAB, new ResourceLocation("pokecube", "nanab_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_POKECUBE_ORAN, new ResourceLocation("pokecube", "oran_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_POKECUBE_PECHA, new ResourceLocation("pokecube", "pecha_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_POKECUBE_SITRUS, new ResourceLocation("pokecube", "sitrus_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_POKECUBE_AGED, new ResourceLocation("pokecube", "aged_door"), "tall_pokecube_legends_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_POKECUBE_CONCRETE, new ResourceLocation("pokecube", "concrete_door"), "tall_pokecube_legends_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_POKECUBE_CORRUPTED, new ResourceLocation("pokecube", "corrupted_door"), "tall_pokecube_legends_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_POKECUBE_DISTORTIC, new ResourceLocation("pokecube", "distortic_door"), "tall_pokecube_legends_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_POKECUBE_INVERTED, new ResourceLocation("pokecube", "inverted_door"), "tall_pokecube_legends_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_POKECUBE_MIRAGE, new ResourceLocation("pokecube", "mirage_door"), "tall_pokecube_legends_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_POKECUBE_TEMPORAL, new ResourceLocation("pokecube", "temporal_door"), "tall_pokecube_legends_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_POKECUBE_ENIGMA, new ResourceLocation("pokecube", "enigma_door"), "tall_pokecube_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_POKECUBE_LEPPA, new ResourceLocation("pokecube", "leppa_door"), "tall_pokecube_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_POKECUBE_NANAB, new ResourceLocation("pokecube", "nanab_door"), "tall_pokecube_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_POKECUBE_ORAN, new ResourceLocation("pokecube", "oran_door"), "tall_pokecube_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_POKECUBE_PECHA, new ResourceLocation("pokecube", "pecha_door"), "tall_pokecube_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_POKECUBE_SITRUS, new ResourceLocation("pokecube", "sitrus_door"), "tall_pokecube_wooden_door");
	}
}
