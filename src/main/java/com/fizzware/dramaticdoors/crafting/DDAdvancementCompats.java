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

	// Bewitchment
	public static JsonObject TALL_CYPRESS_DOOR_ADVANCEMENT = null;
	public static JsonObject TALL_DRAGONS_BLOOD_DOOR_ADVANCEMENT = null;
	public static JsonObject TALL_ELDER_DOOR_ADVANCEMENT = null;
	public static JsonObject TALL_JUNIPER_DOOR_ADVANCEMENT = null;
	
	// Ceilands
	public static JsonObject TALL_CEILTRUNK_DOOR_ADVANCEMENT = null;
	public static JsonObject TALL_LUZAWOOD_DOOR_ADVANCEMENT = null;
	
	// Ecologics
	public static JsonObject TALL_ECO_AZALEA_DOOR_ADVANCEMENT = null;
	public static JsonObject TALL_ECO_FLOWERING_AZALEA_DOOR_ADVANCEMENT = null;
	public static JsonObject TALL_ECO_COCONUT_DOOR_ADVANCEMENT = null;
	public static JsonObject TALL_ECO_WALNUT_DOOR_ADVANCEMENT = null;	
	
	// Twilight Forest
	public static JsonObject TALL_CANOPY_DOOR_ADVANCEMENT = null;
	public static JsonObject TALL_DARKWOOD_DOOR_ADVANCEMENT = null;
	public static JsonObject TALL_TWILIGHT_MANGROVE_DOOR_ADVANCEMENT = null;
	public static JsonObject TALL_MINEWOOD_DOOR_ADVANCEMENT = null;
	public static JsonObject TALL_SORTINGWOOD_DOOR_ADVANCEMENT = null;
	public static JsonObject TALL_TIMEWOOD_DOOR_ADVANCEMENT = null;
	public static JsonObject TALL_TRANSWOOD_DOOR_ADVANCEMENT = null;
	public static JsonObject TALL_TWILIGHT_OAK_DOOR_ADVANCEMENT = null;
	
	public static void initializeAdvancements() {
		if (FabricLoader.getInstance().isModLoaded("bewitchment")) {
			TALL_CYPRESS_DOOR_ADVANCEMENT = createRecipeAdvancementJson(DDNames.TALL_CYPRESS, new Identifier("bewitchment", "cypress_door"));
			TALL_DRAGONS_BLOOD_DOOR_ADVANCEMENT = createRecipeAdvancementJson(DDNames.TALL_DRAGONS_BLOOD, new Identifier("bewitchment", "dragons_blood_door"));
			TALL_ELDER_DOOR_ADVANCEMENT = createRecipeAdvancementJson(DDNames.TALL_ELDER, new Identifier("bewitchment", "elder_door"));
			TALL_JUNIPER_DOOR_ADVANCEMENT = createRecipeAdvancementJson(DDNames.TALL_JUNIPER, new Identifier("bewitchment", "juniper_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("ceilands")) {
			TALL_CEILTRUNK_DOOR_ADVANCEMENT = createRecipeAdvancementJson(DDNames.TALL_CEILTRUNK, new Identifier("ceilands", "ceiltrunk_door"));
			TALL_LUZAWOOD_DOOR_ADVANCEMENT = createRecipeAdvancementJson(DDNames.TALL_LUZAWOOD, new Identifier("ceilands", "luzawood_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("ecologics")) {
			TALL_ECO_AZALEA_DOOR_ADVANCEMENT = createRecipeAdvancementJson(DDNames.TALL_ECO_AZALEA, new Identifier("ecologics", "azalea_door"));
			TALL_ECO_FLOWERING_AZALEA_DOOR_ADVANCEMENT = createRecipeAdvancementJson(DDNames.TALL_ECO_FLOWERING_AZALEA, new Identifier("ecologics", "flowering_azalea_door"));
			TALL_ECO_COCONUT_DOOR_ADVANCEMENT = createRecipeAdvancementJson(DDNames.TALL_ECO_COCONUT, new Identifier("ecologics", "coconut_door"));
			TALL_ECO_WALNUT_DOOR_ADVANCEMENT = createRecipeAdvancementJson(DDNames.TALL_ECO_WALNUT, new Identifier("ecologics", "walnut_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("twilightforest")) {
			TALL_CANOPY_DOOR_ADVANCEMENT = createRecipeAdvancementJson(DDNames.TALL_CANOPY, new Identifier("twilightforest", "canopy_door"));
			TALL_DARKWOOD_DOOR_ADVANCEMENT = createRecipeAdvancementJson(DDNames.TALL_DARKWOOD, new Identifier("twilightforest", "dark_door"));
			TALL_TWILIGHT_MANGROVE_DOOR_ADVANCEMENT = createRecipeAdvancementJson(DDNames.TALL_TWILIGHT_MANGROVE, new Identifier("twilightforest", "mangrove_door"));
			TALL_MINEWOOD_DOOR_ADVANCEMENT = createRecipeAdvancementJson(DDNames.TALL_MINEWOOD, new Identifier("twilightforest", "mining_door"));
			TALL_SORTINGWOOD_DOOR_ADVANCEMENT = createRecipeAdvancementJson(DDNames.TALL_SORTINGWOOD, new Identifier("twilightforest", "sorting_door"));
			TALL_TIMEWOOD_DOOR_ADVANCEMENT = createRecipeAdvancementJson(DDNames.TALL_TIMEWOOD, new Identifier("twilightforest", "time_door"));
			TALL_TRANSWOOD_DOOR_ADVANCEMENT = createRecipeAdvancementJson(DDNames.TALL_TRANSWOOD, new Identifier("twilightforest", "transformation_door"));
			TALL_TWILIGHT_OAK_DOOR_ADVANCEMENT = createRecipeAdvancementJson(DDNames.TALL_TWILIGHT_OAK, new Identifier("twilightforest", "twilight_oak_door"));
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
