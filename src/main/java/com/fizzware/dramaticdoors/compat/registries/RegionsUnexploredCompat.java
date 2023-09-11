package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class RegionsUnexploredCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_RUE_BAOBAB, DDNames.SHORT_RUE_BAOBAB, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "baobab_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_RUE_BLACKWOOD, DDNames.SHORT_RUE_BLACKWOOD, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "blackwood_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_RUE_BRIMWOOD, DDNames.SHORT_RUE_BRIMWOOD, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "brimwood_door")), BlockSetType.CRIMSON, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_RUE_CHERRY, DDNames.SHORT_RUE_CHERRY, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "cherry_door")), BlockSetType.CHERRY, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_RUE_CYPRESS, DDNames.SHORT_RUE_CYPRESS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "cypress_door")), BlockSetType.MANGROVE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_RUE_DEAD, DDNames.SHORT_RUE_DEAD, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "dead_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_RUE_EUCALYPTUS, DDNames.SHORT_RUE_EUCALYPTUS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "eucalyptus_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_RUE_JOSHUA, DDNames.SHORT_RUE_JOSHUA, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "joshua_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_RUE_LARCH, DDNames.SHORT_RUE_LARCH, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "larch_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_RUE_MAPLE, DDNames.SHORT_RUE_MAPLE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "maple_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_RUE_MAUVE, DDNames.SHORT_RUE_MAUVE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "mauve_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_RUE_PALM, DDNames.SHORT_RUE_PALM, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "palm_door")), BlockSetType.BAMBOO, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_RUE_PINE, DDNames.SHORT_RUE_PINE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "pine_door")), BlockSetType.SPRUCE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_RUE_REDWOOD, DDNames.SHORT_RUE_REDWOOD, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "redwood_door")), BlockSetType.JUNGLE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_RUE_WILLOW, DDNames.SHORT_RUE_WILLOW, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("regions_unexplored", "willow_door")), BlockSetType.MANGROVE, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_RUE_BAOBAB, new ResourceLocation("regions_unexplored", "baobab_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_RUE_BLACKWOOD, new ResourceLocation("regions_unexplored", "blackwood_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_RUE_BRIMWOOD, new ResourceLocation("regions_unexplored", "brimwood_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_RUE_CHERRY, new ResourceLocation("regions_unexplored", "cherry_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_RUE_CYPRESS, new ResourceLocation("regions_unexplored", "cypress_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_RUE_DEAD, new ResourceLocation("regions_unexplored", "dead_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_RUE_EUCALYPTUS, new ResourceLocation("regions_unexplored", "eucalyptus_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_RUE_JOSHUA, new ResourceLocation("regions_unexplored", "joshua_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_RUE_LARCH, new ResourceLocation("regions_unexplored", "larch_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_RUE_MAPLE, new ResourceLocation("regions_unexplored", "maple_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_RUE_MAUVE, new ResourceLocation("regions_unexplored", "mauve_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_RUE_PALM, new ResourceLocation("regions_unexplored", "palm_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_RUE_PINE, new ResourceLocation("regions_unexplored", "pine_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_RUE_REDWOOD, new ResourceLocation("regions_unexplored", "redwood_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_RUE_WILLOW, new ResourceLocation("regions_unexplored", "willow_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_RUE_BAOBAB, new ResourceLocation("regions_unexplored", "baobab_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_RUE_BLACKWOOD, new ResourceLocation("regions_unexplored", "blackwood_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_RUE_BRIMWOOD, new ResourceLocation("regions_unexplored", "brimwood_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_RUE_CHERRY, new ResourceLocation("regions_unexplored", "cherry_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_RUE_CYPRESS, new ResourceLocation("regions_unexplored", "cypress_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_RUE_DEAD, new ResourceLocation("regions_unexplored", "dead_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_RUE_EUCALYPTUS, new ResourceLocation("regions_unexplored", "eucalyptus_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_RUE_JOSHUA, new ResourceLocation("regions_unexplored", "joshua_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_RUE_LARCH, new ResourceLocation("regions_unexplored", "larch_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_RUE_MAPLE, new ResourceLocation("regions_unexplored", "maple_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_RUE_MAUVE, new ResourceLocation("regions_unexplored", "mauve_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_RUE_PALM, new ResourceLocation("regions_unexplored", "palm_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_RUE_PINE, new ResourceLocation("regions_unexplored", "pine_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_RUE_REDWOOD, new ResourceLocation("regions_unexplored", "redwood_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_RUE_WILLOW, new ResourceLocation("regions_unexplored", "willow_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_RUE_BAOBAB, new ResourceLocation("regions_unexplored", "baobab_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_RUE_BLACKWOOD, new ResourceLocation("regions_unexplored", "blackwood_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_RUE_BRIMWOOD, new ResourceLocation("regions_unexplored", "brimwood_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_RUE_CHERRY, new ResourceLocation("regions_unexplored", "cherry_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_RUE_CYPRESS, new ResourceLocation("regions_unexplored", "cypress_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_RUE_DEAD, new ResourceLocation("regions_unexplored", "dead_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_RUE_EUCALYPTUS, new ResourceLocation("regions_unexplored", "eucalyptus_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_RUE_JOSHUA, new ResourceLocation("regions_unexplored", "joshua_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_RUE_LARCH, new ResourceLocation("regions_unexplored", "larch_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_RUE_MAPLE, new ResourceLocation("regions_unexplored", "maple_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_RUE_MAUVE, new ResourceLocation("regions_unexplored", "mauve_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_RUE_PALM, new ResourceLocation("regions_unexplored", "palm_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_RUE_PINE, new ResourceLocation("regions_unexplored", "pine_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_RUE_REDWOOD, new ResourceLocation("regions_unexplored", "redwood_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_RUE_WILLOW, new ResourceLocation("regions_unexplored", "willow_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_RUE_BAOBAB, new ResourceLocation("regions_unexplored", "baobab_door"), "tall_rue_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_RUE_BLACKWOOD, new ResourceLocation("regions_unexplored", "blackwood_door"), "tall_rue_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_RUE_BRIMWOOD, new ResourceLocation("regions_unexplored", "brimwood_door"), "tall_rue_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_RUE_CHERRY, new ResourceLocation("regions_unexplored", "cherry_door"), "tall_rue_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_RUE_CYPRESS, new ResourceLocation("regions_unexplored", "cypress_door"), "tall_rue_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_RUE_DEAD, new ResourceLocation("regions_unexplored", "dead_door"), "tall_rue_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_RUE_EUCALYPTUS, new ResourceLocation("regions_unexplored", "eucalyptus_door"), "tall_rue_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_RUE_JOSHUA, new ResourceLocation("regions_unexplored", "joshua_door"), "tall_rue_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_RUE_LARCH, new ResourceLocation("regions_unexplored", "larch_door"), "tall_rue_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_RUE_MAPLE, new ResourceLocation("regions_unexplored", "maple_door"), "tall_rue_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_RUE_MAUVE, new ResourceLocation("regions_unexplored", "mauve_door"), "tall_rue_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_RUE_PALM, new ResourceLocation("regions_unexplored", "palm_door"), "tall_rue_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_RUE_PINE, new ResourceLocation("regions_unexplored", "pine_door"), "tall_rue_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_RUE_REDWOOD, new ResourceLocation("regions_unexplored", "redwood_door"), "tall_rue_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_RUE_WILLOW, new ResourceLocation("regions_unexplored", "willow_door"), "tall_rue_wooden_door");
	}
}
