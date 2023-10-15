package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;


public class ColorfulAzaleasCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_AZULE_AZALEA, DDNames.SHORT_AZULE_AZALEA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("colorfulazaleas", "azule_azalea_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BRIGHT_AZALEA, DDNames.SHORT_BRIGHT_AZALEA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("colorfulazaleas", "bright_azalea_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_FISS_AZALEA, DDNames.SHORT_FISS_AZALEA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("colorfulazaleas", "fiss_azalea_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ROZE_AZALEA, DDNames.SHORT_ROZE_AZALEA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("colorfulazaleas", "roze_azalea_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TECAL_AZALEA, DDNames.SHORT_TECAL_AZALEA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("colorfulazaleas", "tecal_azalea_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TITANIUM_AZALEA, DDNames.SHORT_TITANIUM_AZALEA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("colorfulazaleas", "titanium_azalea_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_WALNUT_AZALEA, DDNames.SHORT_WALNUT_AZALEA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("colorfulazaleas", "walnut_azalea_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_AZULE_AZALEA, new ResourceLocation("colorfulazaleas", "azule_azalea_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_BRIGHT_AZALEA, new ResourceLocation("colorfulazaleas", "bright_azalea_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_FISS_AZALEA, new ResourceLocation("colorfulazaleas", "fiss_azalea_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_ROZE_AZALEA, new ResourceLocation("colorfulazaleas", "roze_azalea_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_TECAL_AZALEA, new ResourceLocation("colorfulazaleas", "tecal_azalea_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_TITANIUM_AZALEA, new ResourceLocation("colorfulazaleas", "titanium_azalea_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_WALNUT_AZALEA, new ResourceLocation("colorfulazaleas", "walnut_azalea_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_AZULE_AZALEA, new ResourceLocation("colorfulazaleas", "azule_azalea_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_BRIGHT_AZALEA, new ResourceLocation("colorfulazaleas", "bright_azalea_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_FISS_AZALEA, new ResourceLocation("colorfulazaleas", "fiss_azalea_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_ROZE_AZALEA, new ResourceLocation("colorfulazaleas", "roze_azalea_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_TECAL_AZALEA, new ResourceLocation("colorfulazaleas", "tecal_azalea_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_TITANIUM_AZALEA, new ResourceLocation("colorfulazaleas", "titanium_azalea_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_WALNUT_AZALEA, new ResourceLocation("colorfulazaleas", "walnut_azalea_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_AZULE_AZALEA, new ResourceLocation("colorfulazaleas", "azule_azalea_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_BRIGHT_AZALEA, new ResourceLocation("colorfulazaleas", "bright_azalea_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_FISS_AZALEA, new ResourceLocation("colorfulazaleas", "fiss_azalea_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_ROZE_AZALEA, new ResourceLocation("colorfulazaleas", "roze_azalea_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_TECAL_AZALEA, new ResourceLocation("colorfulazaleas", "tecal_azalea_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_TITANIUM_AZALEA, new ResourceLocation("colorfulazaleas", "titanium_azalea_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_WALNUT_AZALEA, new ResourceLocation("colorfulazaleas", "walnut_azalea_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_AZULE_AZALEA, new ResourceLocation("colorfulazaleas", "azule_azalea_door"), "tall_ca_azalea_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_BRIGHT_AZALEA, new ResourceLocation("colorfulazaleas", "bright_azalea_door"), "tall_ca_azalea_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_FISS_AZALEA, new ResourceLocation("colorfulazaleas", "fiss_azalea_door"), "tall_ca_azalea_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_ROZE_AZALEA, new ResourceLocation("colorfulazaleas", "roze_azalea_door"), "tall_ca_azalea_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_TECAL_AZALEA, new ResourceLocation("colorfulazaleas", "tecal_azalea_door"), "tall_ca_azalea_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_TITANIUM_AZALEA, new ResourceLocation("colorfulazaleas", "titanium_azalea_door"), "tall_ca_azalea_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_WALNUT_AZALEA, new ResourceLocation("colorfulazaleas", "walnut_azalea_door"), "tall_ca_azalea_door");
	}
}
