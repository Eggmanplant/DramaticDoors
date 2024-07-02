package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class BloomingNatureCompat 
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BN_ASPEN, DDNames.SHORT_BN_ASPEN, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("bloomingnature", "aspen_door")), BlockSetType.BIRCH, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BN_BAOBAB, DDNames.SHORT_BN_BAOBAB, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("bloomingnature", "baobab_door")), BlockSetType.ACACIA, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BN_CHESTNUT, DDNames.SHORT_BN_CHESTNUT, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("bloomingnature", "chestnut_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BN_EBONY, DDNames.SHORT_BN_EBONY, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("bloomingnature", "ebony_door")), BlockSetType.DARK_OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BN_FAN_PALM, DDNames.SHORT_BN_FAN_PALM, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("bloomingnature", "fan_palm_door")), BlockSetType.JUNGLE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BN_FIR, DDNames.SHORT_BN_FIR, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("bloomingnature", "fir_door")), BlockSetType.SPRUCE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BN_LARCH, DDNames.SHORT_BN_LARCH, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("bloomingnature", "larch_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BN_SWAMP_CYPRESS, DDNames.SHORT_BN_SWAMP_CYPRESS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("bloomingnature", "swamp_cypress_door")), BlockSetType.MANGROVE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BN_SWAMP_OAK, DDNames.SHORT_BN_SWAMP_OAK, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("bloomingnature", "oak_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BN_ASPEN, new ResourceLocation("bloomingnature", "aspen_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BN_BAOBAB, new ResourceLocation("bloomingnature", "baobab_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BN_CHESTNUT, new ResourceLocation("bloomingnature", "chestnut_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BN_EBONY, new ResourceLocation("bloomingnature", "ebony_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BN_FAN_PALM, new ResourceLocation("bloomingnature", "fan_palm_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BN_FIR, new ResourceLocation("bloomingnature", "fir_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BN_LARCH, new ResourceLocation("bloomingnature", "larch_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BN_SWAMP_CYPRESS, new ResourceLocation("bloomingnature", "swamp_cypress_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BN_SWAMP_OAK, new ResourceLocation("bloomingnature", "swamp_oak_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BN_ASPEN, new ResourceLocation("bloomingnature", "aspen_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BN_BAOBAB, new ResourceLocation("bloomingnature", "baobab_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BN_CHESTNUT, new ResourceLocation("bloomingnature", "chestnut_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BN_EBONY, new ResourceLocation("bloomingnature", "ebony_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BN_FAN_PALM, new ResourceLocation("bloomingnature", "fan_palm_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BN_FIR, new ResourceLocation("bloomingnature", "fir_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BN_LARCH, new ResourceLocation("bloomingnature", "larch_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BN_SWAMP_CYPRESS, new ResourceLocation("bloomingnature", "swamp_cypress_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BN_SWAMP_OAK, new ResourceLocation("bloomingnature", "swamp_oak_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BN_ASPEN, new ResourceLocation("bloomingnature", "aspen_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BN_BAOBAB, new ResourceLocation("bloomingnature", "baobab_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BN_CHESTNUT, new ResourceLocation("bloomingnature", "chestnut_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BN_EBONY, new ResourceLocation("bloomingnature", "ebony_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BN_FAN_PALM, new ResourceLocation("bloomingnature", "fan_palm_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BN_FIR, new ResourceLocation("bloomingnature", "fir_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BN_LARCH, new ResourceLocation("bloomingnature", "larch_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BN_SWAMP_CYPRESS, new ResourceLocation("bloomingnature", "swamp_cypress_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BN_SWAMP_OAK, new ResourceLocation("bloomingnature", "swamp_oak_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BN_ASPEN, new ResourceLocation("bloomingnature", "aspen_door"), "tall_letsdo_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BN_BAOBAB, new ResourceLocation("bloomingnature", "baobab_door"), "tall_letsdo_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BN_CHESTNUT, new ResourceLocation("bloomingnature", "chestnut_door"), "tall_letsdo_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BN_EBONY, new ResourceLocation("bloomingnature", "ebony_door"), "tall_letsdo_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BN_FAN_PALM, new ResourceLocation("bloomingnature", "fan_palm_door"), "tall_letsdo_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BN_FIR, new ResourceLocation("bloomingnature", "fir_door"), "tall_letsdo_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BN_LARCH, new ResourceLocation("bloomingnature", "larch_door"), "tall_letsdo_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BN_SWAMP_CYPRESS, new ResourceLocation("bloomingnature", "swamp_cypress_door"), "tall_letsdo_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BN_SWAMP_OAK, new ResourceLocation("bloomingnature", "swamp_oak_door"), "tall_letsdo_wooden_door");
	}
}
