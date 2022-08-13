package com.fizzware.dramaticdoors.crafting;

import java.util.ArrayList;
import java.util.List;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DramaticDoors;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.Identifier;

public class DDAdvancementCompats
{
	// The list of recipe advancements that will be filled out.
	public static List<JsonObject> RECIPE_ADVANCEMENTS = new ArrayList<JsonObject>();
	
	public static void initializeAdvancements() {
		if (FabricLoader.getInstance().isModLoaded("bewitchment")) {
			createRecipeAdvancementJson(DDNames.TALL_CYPRESS, new Identifier("bewitchment", "cypress_door"));
			createRecipeAdvancementJson(DDNames.TALL_DRAGONS_BLOOD, new Identifier("bewitchment", "dragons_blood_door"));
			createRecipeAdvancementJson(DDNames.TALL_ELDER, new Identifier("bewitchment", "elder_door"));
			createRecipeAdvancementJson(DDNames.TALL_JUNIPER, new Identifier("bewitchment", "juniper_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("biomemakeover")) {
			createRecipeAdvancementJson(DDNames.TALL_ANCIENT_OAK, new Identifier("biomemakeover", "ancient_oak_door"));
			createRecipeAdvancementJson(DDNames.TALL_BLIGHTED_BALSA, new Identifier("biomemakeover", "blighted_balsa_door"));
			createRecipeAdvancementJson(DDNames.TALL_SWAMP_CYPRESS, new Identifier("biomemakeover", "swamp_cypress_door"));
			createRecipeAdvancementJson(DDNames.TALL_WILLOW, new Identifier("biomemakeover", "willow_door"));			
		}
		if (FabricLoader.getInstance().isModLoaded("byg")) {
			createRecipeAdvancementJson(DDNames.TALL_BYG_ASPEN, new Identifier("byg", "aspen_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_BAOBAB, new Identifier("byg", "baobab_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_BLUE_ENCHANTED, new Identifier("byg", "blue_enchanted_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_BULBIS, new Identifier("byg", "bulbis_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_CHERRY, new Identifier("byg", "cherry_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_CIKA, new Identifier("byg", "cika_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_CYPRESS, new Identifier("byg", "cypress_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_EBONY, new Identifier("byg", "ebony_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_EMBUR, new Identifier("byg", "embur_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_ETHER, new Identifier("byg", "ether_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_FIR, new Identifier("byg", "fir_door"));
			//createRecipeAdvancementJson(DDNames.TALL_BYG_FLORUS, new Identifier("byg", "florus_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_GREEN_ENCHANTED, new Identifier("byg", "green_enchanted_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_HOLLY, new Identifier("byg", "holly_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_IMPARIUS, new Identifier("byg", "imparius_door"));
			//createRecipeAdvancementJson(DDNames.TALL_BYG_IRONWOOD, new Identifier("byg", "ironwood_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_JACARANDA, new Identifier("byg", "jacaranda_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_LAMENT, new Identifier("byg", "lament_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_MAHOGANY, new Identifier("byg", "mahogany_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_MAPLE, new Identifier("byg", "maple_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_NIGHTSHADE, new Identifier("byg", "nightshade_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_PALM, new Identifier("byg", "palm_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_PINE, new Identifier("byg", "pine_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_RAINBOW_EUCALYPTUS, new Identifier("byg", "rainbow_eucalyptus_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_REDWOOD, new Identifier("byg", "redwood_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_SKYRIS, new Identifier("byg", "skyris_door"));
			//createRecipeAdvancementJson(DDNames.TALL_BYG_SOUL_SHROOM, new Identifier("byg", "soul_shroom_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_SYTHIAN, new Identifier("byg", "sythian_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_WHITE_MANGROVE, new Identifier("byg", "mangrove_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_WILLOW, new Identifier("byg", "willow_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_WITCH_HAZEL, new Identifier("byg", "witch_hazel_door"));
			createRecipeAdvancementJson(DDNames.TALL_BYG_ZELKOVA, new Identifier("byg", "zelkova_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("ceilands")) {
			createRecipeAdvancementJson(DDNames.TALL_CEILTRUNK, new Identifier("ceilands", "ceiltrunk_door"));
			createRecipeAdvancementJson(DDNames.TALL_LUZAWOOD, new Identifier("ceilands", "luzawood_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("ecologics")) {
			createRecipeAdvancementJson(DDNames.TALL_ECO_AZALEA, new Identifier("ecologics", "azalea_door"));
			createRecipeAdvancementJson(DDNames.TALL_ECO_FLOWERING_AZALEA, new Identifier("ecologics", "flowering_azalea_door"));
			createRecipeAdvancementJson(DDNames.TALL_ECO_COCONUT, new Identifier("ecologics", "coconut_door"));
			createRecipeAdvancementJson(DDNames.TALL_ECO_WALNUT, new Identifier("ecologics", "walnut_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("snowyspirit")) {
			createRecipeAdvancementJson(DDNames.TALL_GINGERBREAD, new Identifier("snowyspirit", "gingerbread_door"));	
		}
		if (FabricLoader.getInstance().isModLoaded("supplementaries")) {
			createRecipeAdvancementJson(DDNames.TALL_GOLD, new Identifier("supplementaries", "gold_door"));
			createRecipeAdvancementJson(DDNames.TALL_NETHERITE, new Identifier("supplementaries", "netherite_door"));			
		}
		if (FabricLoader.getInstance().isModLoaded("twigs")) {
			createRecipeAdvancementJson(DDNames.TALL_GOLD, new Identifier("twigs", "stripped_bamboo_door"));			
		}
		if (FabricLoader.getInstance().isModLoaded("twilightforest")) {
			createRecipeAdvancementJson(DDNames.TALL_CANOPY, new Identifier("twilightforest", "canopy_door"));
			createRecipeAdvancementJson(DDNames.TALL_DARKWOOD, new Identifier("twilightforest", "dark_door"));
			createRecipeAdvancementJson(DDNames.TALL_TWILIGHT_MANGROVE, new Identifier("twilightforest", "mangrove_door"));
			createRecipeAdvancementJson(DDNames.TALL_MINEWOOD, new Identifier("twilightforest", "mining_door"));
			createRecipeAdvancementJson(DDNames.TALL_SORTINGWOOD, new Identifier("twilightforest", "sorting_door"));
			createRecipeAdvancementJson(DDNames.TALL_TIMEWOOD, new Identifier("twilightforest", "time_door"));
			createRecipeAdvancementJson(DDNames.TALL_TRANSWOOD, new Identifier("twilightforest", "transformation_door"));
			createRecipeAdvancementJson(DDNames.TALL_TWILIGHT_OAK, new Identifier("twilightforest", "twilight_oak_door"));			
		}
		if (FabricLoader.getInstance().isModLoaded("wildbackport")) {
			createRecipeAdvancementJson(DDNames.TALL_MANGROVE, new Identifier("wildbackport", "mangrove_door"));			
		}
	}
	
    public static JsonObject createRecipeAdvancementJson(String recipeName, Identifier triggeringItem) {
        //Creating a new json object, where we will store our recipe advancements.
        JsonObject json = new JsonObject();
        json.addProperty("parent", "dramaticdoors:recipes/root");
        
        //Create the criteria.
        JsonObject jsonCriteria = new JsonObject();
        
        JsonObject jsonHasRecipe = new JsonObject();
        jsonHasRecipe.addProperty("trigger", "minecraft:recipe_unlocked");
        JsonObject jsonHasRecipeCondition = new JsonObject();
        jsonHasRecipeCondition.addProperty("recipe", DramaticDoors.MOD_ID + ":" + recipeName);
        jsonHasRecipe.add("conditions", jsonHasRecipeCondition);
        
        JsonObject jsonHasItems = new JsonObject();
        jsonHasItems.addProperty("trigger", "minecraft:inventory_changed");
        JsonObject jsonHasItemsCondition = new JsonObject();
        JsonArray jsonHasItemsList = new JsonArray();
        JsonObject jsonHasItemsListEntry = new JsonObject();
        JsonArray jsonHasItemsListEntryArray = new JsonArray();
        jsonHasItemsListEntryArray.add(triggeringItem.toString());
        jsonHasItemsListEntry.add("items", jsonHasItemsListEntryArray);
        jsonHasItemsList.add(jsonHasItemsListEntry);
        jsonHasItemsCondition.add("items", jsonHasItemsList);
        jsonHasItems.add("conditions", jsonHasItemsCondition);
        		
        jsonCriteria.add("has_the_recipe", jsonHasRecipe);
        jsonCriteria.add("has_items", jsonHasItems);
        json.add("criteria", jsonCriteria);
 
        //Create the requirements.
        JsonArray jsonRequirements = new JsonArray();
        JsonArray jsonRequirementsInside = new JsonArray();
        jsonRequirementsInside.add("has_the_recipe");
        jsonRequirementsInside.add("has_items");
        jsonRequirements.add(jsonRequirementsInside);
        json.add("requirements", jsonRequirements);
        
        //Create the rewards.
        JsonObject jsonRewards = new JsonObject();
        JsonArray jsonRewardArray = new JsonArray();
        jsonRewardArray.add(DramaticDoors.MOD_ID + ":" + recipeName);
        jsonRewards.add("recipes", jsonRewardArray);
        json.add("rewards", jsonRewards);
 
        RECIPE_ADVANCEMENTS.add(json);
        return json;
    }
}
