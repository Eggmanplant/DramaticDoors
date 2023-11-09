package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.CompatChecker;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;

public class TrailsTalesBackportCompat
{
	public static void registerCompat(CompatChecker checker) {
		registerBlocksItems();
		registerRecipes(checker);
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CHERRY, DDNames.SHORT_CHERRY, Blocks.OAK_DOOR, true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BAMBOO, DDNames.SHORT_BAMBOO, Blocks.OAK_DOOR, true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes(CompatChecker checker) {
		if (checker.isModLoaded("quark")) {
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BAMBOO, new ResourceLocation("quark", "bamboo_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BAMBOO, new ResourceLocation("quark", "bamboo_door"));
			
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BAMBOO, new ResourceLocation("quark", "bamboo_door"), true);
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BAMBOO, new ResourceLocation("quark", "bamboo_door"), "tall_wooden_door");
		}
		if (checker.isModLoaded("biomebackport")) {
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CHERRY, new ResourceLocation("biomebackport", "cherry_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BAMBOO, new ResourceLocation("biomebackport", "bamboo_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CHERRY, new ResourceLocation("biomebackport", "cherry_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BAMBOO, new ResourceLocation("biomebackport", "bamboo_door"));
			
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CHERRY, new ResourceLocation("biomebackport", "cherry_door"), true);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BAMBOO, new ResourceLocation("biomebackport", "bamboo_door"), true);
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CHERRY, new ResourceLocation("biomebackport", "cherry_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BAMBOO, new ResourceLocation("biomebackport", "bamboo_door"), "tall_wooden_door");
		}
		if (checker.isModLoaded("onetwenty")) {
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CHERRY, new ResourceLocation("onetwenty", "cherry_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BAMBOO, new ResourceLocation("onetwenty", "bamboo_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CHERRY, new ResourceLocation("onetwenty", "cherry_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BAMBOO, new ResourceLocation("onetwenty", "bamboo_door"));
			
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CHERRY, new ResourceLocation("onetwenty", "cherry_door"), true);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BAMBOO, new ResourceLocation("onetwenty", "bamboo_door"), true);
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CHERRY, new ResourceLocation("onetwenty", "cherry_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BAMBOO, new ResourceLocation("onetwenty", "bamboo_door"), "tall_wooden_door");
		}
		if (checker.isModLoaded("trails_and_tales")) {
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CHERRY, new ResourceLocation("trails_and_tales", "cherry_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BAMBOO, new ResourceLocation("trails_and_tales", "bamboo_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CHERRY, new ResourceLocation("trails_and_tales", "cherry_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BAMBOO, new ResourceLocation("trails_and_tales", "bamboo_door"));
			
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CHERRY, new ResourceLocation("trails_and_tales", "cherry_door"), true);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BAMBOO, new ResourceLocation("trails_and_tales", "bamboo_door"), true);
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CHERRY, new ResourceLocation("trails_and_tales", "cherry_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BAMBOO, new ResourceLocation("trails_and_tales", "bamboo_door"), "tall_wooden_door");
		}
		if (checker.isModLoaded("various_update")) {
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CHERRY, new ResourceLocation("various_update", "cherry_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BAMBOO, new ResourceLocation("various_update", "bamboo_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CHERRY, new ResourceLocation("various_update", "cherry_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BAMBOO, new ResourceLocation("various_update", "bamboo_door"));
			
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CHERRY, new ResourceLocation("various_update", "cherry_door"), true);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BAMBOO, new ResourceLocation("various_update", "bamboo_door"), true);
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CHERRY, new ResourceLocation("various_update", "cherry_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BAMBOO, new ResourceLocation("various_update", "bamboo_door"), "tall_wooden_door");
		}
	}
}
