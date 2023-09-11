package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.blocks.ShortDoorBlock;
import com.fizzware.dramaticdoors.blocks.ShortLeadDoorBlock;
import com.fizzware.dramaticdoors.blocks.ShortNetheriteDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallLeadDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallNetheriteDoorBlock;
import com.fizzware.dramaticdoors.compat.Compats;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;
import com.fizzware.dramaticdoors.items.DDItems;
import com.fizzware.dramaticdoors.items.ShortDoorItem;
import com.fizzware.dramaticdoors.items.TallDoorItem;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import oshi.util.tuples.Pair;

public class SupplementariesCompat
{
	public static final Block SHORT_GOLD_DOOR = Compats.SUPPLEMENTARIES_INSTALLED ? new ShortDoorBlock(DDBlocks.getBlockFromResourceLocation(new ResourceLocation("supplementaries", "gold_door")), BlockSetType.IRON) : null;
	public static final Block SHORT_SILVER_DOOR = Compats.SUPPLEMENTARIES_INSTALLED ? new ShortDoorBlock(DDBlocks.getBlockFromResourceLocation(new ResourceLocation("supplementaries", "silver_door")), BlockSetType.IRON) : null;
	public static final Block SHORT_LEAD_DOOR = Compats.SUPPLEMENTARIES_INSTALLED ? new ShortLeadDoorBlock(DDBlocks.getBlockFromResourceLocation(new ResourceLocation("supplementaries", "lead_door")), BlockSetType.IRON) : null;
	public static final Block SHORT_NETHERITE_DOOR = Compats.SUPPLEMENTARIES_INSTALLED ? new ShortNetheriteDoorBlock(DDBlocks.getBlockFromResourceLocation(new ResourceLocation("supplementaries", "netherite_door")), BlockSetType.IRON) : null;
	public static final Block TALL_GOLD_DOOR = Compats.SUPPLEMENTARIES_INSTALLED ? new TallDoorBlock(DDBlocks.getBlockFromResourceLocation(new ResourceLocation("supplementaries", "gold_door")), BlockSetType.IRON) : null;
	public static final Block TALL_SILVER_DOOR = Compats.SUPPLEMENTARIES_INSTALLED ? new TallDoorBlock(DDBlocks.getBlockFromResourceLocation(new ResourceLocation("supplementaries", "silver_door")), BlockSetType.IRON) : null;
	public static final Block TALL_LEAD_DOOR = Compats.SUPPLEMENTARIES_INSTALLED ? new TallLeadDoorBlock(DDBlocks.getBlockFromResourceLocation(new ResourceLocation("supplementaries", "lead_door")), BlockSetType.IRON) : null;
	public static final Block TALL_NETHERITE_DOOR = Compats.SUPPLEMENTARIES_INSTALLED ? new TallNetheriteDoorBlock(DDBlocks.getBlockFromResourceLocation(new ResourceLocation("supplementaries", "netherite_door")), BlockSetType.IRON) : null;

	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
    	DDCompatRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_GOLD, SHORT_GOLD_DOOR));
    	DDCompatRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_SILVER, SHORT_SILVER_DOOR));
    	DDCompatRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_LEAD, SHORT_LEAD_DOOR));
    	DDCompatRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_NETHERITE, SHORT_NETHERITE_DOOR));
    	DDCompatRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_GOLD, TALL_GOLD_DOOR));
    	DDCompatRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_SILVER, TALL_SILVER_DOOR));
    	DDCompatRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_LEAD, TALL_LEAD_DOOR));
    	DDCompatRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_NETHERITE, TALL_NETHERITE_DOOR));
    	
    	DDCompatRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_GOLD, new ShortDoorItem(SHORT_GOLD_DOOR, DDItems.PROPERTIES)));
    	DDCompatRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_SILVER, new ShortDoorItem(SHORT_SILVER_DOOR, DDItems.PROPERTIES)));
    	DDCompatRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_LEAD, new ShortDoorItem(SHORT_LEAD_DOOR, DDItems.PROPERTIES)));
    	DDCompatRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_NETHERITE, new ShortDoorItem(SHORT_NETHERITE_DOOR, DDItems.PROPERTIES)));
    	DDCompatRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_GOLD, new TallDoorItem(TALL_GOLD_DOOR, DDItems.PROPERTIES)));
    	DDCompatRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_SILVER, new TallDoorItem(TALL_SILVER_DOOR, DDItems.PROPERTIES)));
    	DDCompatRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_LEAD, new TallDoorItem(TALL_LEAD_DOOR, DDItems.PROPERTIES)));
    	DDCompatRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_NETHERITE, new TallDoorItem(TALL_NETHERITE_DOOR, DDItems.PROPERTIES)));
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_GOLD, new ResourceLocation("supplementaries", "gold_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_NETHERITE, new ResourceLocation("supplementaries", "netherite_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_GOLD, new ResourceLocation("supplementaries", "gold_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_NETHERITE, new ResourceLocation("supplementaries", "netherite_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_GOLD, new ResourceLocation("supplementaries", "gold_door"));
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_NETHERITE, new ResourceLocation("supplementaries", "netherite_door"));
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_GOLD, new ResourceLocation("supplementaries", "gold_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_NETHERITE, new ResourceLocation("supplementaries", "netherite_door"), "tall_metal_door");
		
		if (FabricLoader.getInstance().isModLoaded("forge")) {
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_SILVER, new ResourceLocation("supplementaries", "silver_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_LEAD, new ResourceLocation("supplementaries", "lead_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_SILVER, new ResourceLocation("supplementaries", "silver_door"));
			DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_LEAD, new ResourceLocation("supplementaries", "lead_door"));
	
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_SILVER, new ResourceLocation("supplementaries", "silver_door"));
			DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_LEAD, new ResourceLocation("supplementaries", "lead_door"));
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_SILVER, new ResourceLocation("supplementaries", "silver_door"), "tall_metal_door");
			DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_LEAD, new ResourceLocation("supplementaries", "lead_door"), "tall_metal_door");
		}
	}
}
