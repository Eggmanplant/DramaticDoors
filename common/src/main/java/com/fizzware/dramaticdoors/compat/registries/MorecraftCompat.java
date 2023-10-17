package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.items.ShortDoorItem;
import com.fizzware.dramaticdoors.items.TallDoorItem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import oshi.util.tuples.Pair;


public class MorecraftCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MORECRAFT_BONE, DDNames.SHORT_MORECRAFT_BONE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("morecraft", "bone_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MORECRAFT_GLASS, DDNames.SHORT_MORECRAFT_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("morecraft", "glass_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MORECRAFT_SOUL_GLASS, DDNames.SHORT_MORECRAFT_SOUL_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("morecraft", "soul_glass_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MORECRAFT_NETHERWOOD, DDNames.SHORT_MORECRAFT_NETHERWOOD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("morecraft", "netherwood_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MORECRAFT_NETHERBRICK, DDNames.SHORT_MORECRAFT_NETHERBRICK, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("morecraft", "netherbrick_door")), true, DDRegistry.MAIN_TAB);
		
		Block shortNetheriteDoor = new TallDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("morecraft", "netherite_door"), Blocks.IRON_DOOR));
		Block tallNetheriteDoor = new TallDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("morecraft", "netherite_door"), Blocks.IRON_DOOR));
		
		DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_MORECRAFT_NETHERITE, shortNetheriteDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_MORECRAFT_NETHERITE, tallNetheriteDoor));

    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_MORECRAFT_NETHERITE, new ShortDoorItem(shortNetheriteDoor, DDRegistry.PROPERTIES.fireResistant().tab(DDRegistry.MAIN_TAB))));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_MORECRAFT_NETHERITE, new TallDoorItem(tallNetheriteDoor, DDRegistry.PROPERTIES.fireResistant().tab(DDRegistry.MAIN_TAB))));
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
