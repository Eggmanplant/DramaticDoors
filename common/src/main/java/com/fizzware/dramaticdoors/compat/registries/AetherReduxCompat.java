package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class AetherReduxCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BLIGHTWILLOW, DDNames.SHORT_BLIGHTWILLOW, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("aether_redux", "blightwillow_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CLOUDCAP, DDNames.SHORT_CLOUDCAP, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("aether_redux", "cloudcap_door")), BlockSetType.CRIMSON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CRYSTAL, DDNames.SHORT_CRYSTAL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("aether_redux", "crystal_door")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_GLACIA, DDNames.SHORT_GLACIA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("aether_redux", "glacia_door")), BlockSetType.CRIMSON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_PRISMATIC, DDNames.SHORT_PRISMATIC, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("aether_redux", "prismatic_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SPRINGSHROOM, DDNames.SHORT_SPRINGSHROOM, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("aether_redux", "springshroom_door")), BlockSetType.CRIMSON, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_BLIGHTWILLOW, new ResourceLocation("aether_redux", "skyroot_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_CLOUDCAP, new ResourceLocation("aether_redux", "cloudcap_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_CRYSTAL, new ResourceLocation("aether_redux", "crystal_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_GLACIA, new ResourceLocation("aether_redux", "glacia_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_PRISMATIC, new ResourceLocation("aether_redux", "prismatic_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_SPRINGSHROOM, new ResourceLocation("aether_redux", "springshroom_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_BLIGHTWILLOW, new ResourceLocation("aether_redux", "skyroot_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_CLOUDCAP, new ResourceLocation("aether_redux", "cloudcap_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_CRYSTAL, new ResourceLocation("aether_redux", "crystal_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_GLACIA, new ResourceLocation("aether_redux", "glacia_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_PRISMATIC, new ResourceLocation("aether_redux", "prismatic_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_SPRINGSHROOM, new ResourceLocation("aether_redux", "springshroom_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_BLIGHTWILLOW, new ResourceLocation("aether_redux", "skyroot_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_CLOUDCAP, new ResourceLocation("aether_redux", "cloudcap_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_CRYSTAL, new ResourceLocation("aether_redux", "crystal_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_GLACIA, new ResourceLocation("aether_redux", "glacia_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_PRISMATIC, new ResourceLocation("aether_redux", "prismatic_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_SPRINGSHROOM, new ResourceLocation("aether_redux", "springshroom_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_BLIGHTWILLOW, new ResourceLocation("aether_redux", "skyroot_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_CLOUDCAP, new ResourceLocation("aether_redux", "cloudcap_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_CRYSTAL, new ResourceLocation("aether_redux", "crystal_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_GLACIA, new ResourceLocation("aether_redux", "glacia_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_PRISMATIC, new ResourceLocation("aether_redux", "prismatic_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_SPRINGSHROOM, new ResourceLocation("aether_redux", "springshroom_door"), "tall_wooden_door");
	}
}
