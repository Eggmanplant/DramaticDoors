package com.fizzware.dramaticdoors.crafting;

import java.util.ArrayList;
import java.util.List;

import com.fizzware.dramaticdoors.DDNames;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.Identifier;

public class DDRecipeCompats
{
	// The list of recipes that will be filled out.
	public static List<JsonObject> RECIPES = new ArrayList<JsonObject>();
	
	// Bewitchment
	public static JsonObject TALL_CYPRESS_DOOR_RECIPE = null;
	public static JsonObject TALL_DRAGONS_BLOOD_DOOR_RECIPE = null;
	public static JsonObject TALL_ELDER_DOOR_RECIPE = null;
	public static JsonObject TALL_JUNIPER_DOOR_RECIPE = null;
	
	// Ceilands
	public static JsonObject TALL_CEILTRUNK_DOOR_RECIPE = null;
	public static JsonObject TALL_LUZAWOOD_DOOR_RECIPE = null;
	
	// Ecologics
	public static JsonObject TALL_ECO_AZALEA_DOOR_RECIPE = null;
	public static JsonObject TALL_ECO_FLOWERING_AZALEA_DOOR_RECIPE = null;
	public static JsonObject TALL_ECO_COCONUT_DOOR_RECIPE = null;
	public static JsonObject TALL_ECO_WALNUT_DOOR_RECIPE = null;
	
	// Twilight Forest
	public static JsonObject TALL_CANOPY_DOOR_RECIPE = null;
	public static JsonObject TALL_DARKWOOD_DOOR_RECIPE = null;
	public static JsonObject TALL_TWILIGHT_MANGROVE_DOOR_RECIPE = null;
	public static JsonObject TALL_MINEWOOD_DOOR_RECIPE = null;
	public static JsonObject TALL_SORTINGWOOD_DOOR_RECIPE = null;
	public static JsonObject TALL_TIMEWOOD_DOOR_RECIPE = null;
	public static JsonObject TALL_TRANSWOOD_DOOR_RECIPE = null;
	public static JsonObject TALL_TWILIGHT_OAK_DOOR_RECIPE = null;
	
	public static void initializeRecipes() {
		if (FabricLoader.getInstance().isModLoaded("bewitchment")) {
			TALL_CYPRESS_DOOR_RECIPE = createTallDoorRecipeJson(DDNames.TALL_CYPRESS, new Identifier("bewitchment", "cypress_door"));
			TALL_DRAGONS_BLOOD_DOOR_RECIPE = createTallDoorRecipeJson(DDNames.TALL_DRAGONS_BLOOD, new Identifier("bewitchment", "dragons_blood_door"));
			TALL_ELDER_DOOR_RECIPE = createTallDoorRecipeJson(DDNames.TALL_ELDER, new Identifier("bewitchment", "elder_door"));
			TALL_JUNIPER_DOOR_RECIPE = createTallDoorRecipeJson(DDNames.TALL_JUNIPER, new Identifier("bewitchment", "juniper_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("ceilands")) {
			TALL_CEILTRUNK_DOOR_RECIPE = createTallDoorRecipeJson(DDNames.TALL_CEILTRUNK, new Identifier("ceilands", "ceiltrunk_door"));
			TALL_LUZAWOOD_DOOR_RECIPE = createTallDoorRecipeJson(DDNames.TALL_LUZAWOOD, new Identifier("ceilands", "luzawood_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("ecologics")) {
			TALL_ECO_AZALEA_DOOR_RECIPE = createTallDoorRecipeJson(DDNames.TALL_ECO_AZALEA, new Identifier("ecologics", "azalea_door"));
			TALL_ECO_FLOWERING_AZALEA_DOOR_RECIPE = createTallDoorRecipeJson(DDNames.TALL_ECO_FLOWERING_AZALEA, new Identifier("ecologics", "flowering_azalea_door"));
			TALL_ECO_COCONUT_DOOR_RECIPE = createTallDoorRecipeJson(DDNames.TALL_ECO_COCONUT, new Identifier("ecologics", "coconut_door"));
			TALL_ECO_WALNUT_DOOR_RECIPE = createTallDoorRecipeJson(DDNames.TALL_ECO_WALNUT, new Identifier("ecologics", "walnut_door"));
		}
		if (FabricLoader.getInstance().isModLoaded("twilightforest")) {
			TALL_CANOPY_DOOR_RECIPE = createTallDoorRecipeJson(DDNames.TALL_CANOPY, new Identifier("twilightforest", "canopy_door"));
			TALL_DARKWOOD_DOOR_RECIPE = createTallDoorRecipeJson(DDNames.TALL_DARKWOOD, new Identifier("twilightforest", "dark_door"));
			TALL_TWILIGHT_MANGROVE_DOOR_RECIPE = createTallDoorRecipeJson(DDNames.TALL_TWILIGHT_MANGROVE, new Identifier("twilightforest", "mangrove_door"));
			TALL_MINEWOOD_DOOR_RECIPE = createTallDoorRecipeJson(DDNames.TALL_MINEWOOD, new Identifier("twilightforest", "mining_door"));
			TALL_SORTINGWOOD_DOOR_RECIPE = createTallDoorRecipeJson(DDNames.TALL_SORTINGWOOD, new Identifier("twilightforest", "sorting_door"));
			TALL_TIMEWOOD_DOOR_RECIPE = createTallDoorRecipeJson(DDNames.TALL_TIMEWOOD, new Identifier("twilightforest", "time_door"));
			TALL_TRANSWOOD_DOOR_RECIPE = createTallDoorRecipeJson(DDNames.TALL_TRANSWOOD, new Identifier("twilightforest", "transformation_door"));
			TALL_TWILIGHT_OAK_DOOR_RECIPE = createTallDoorRecipeJson(DDNames.TALL_TWILIGHT_OAK, new Identifier("twilightforest", "twilight_oak_door"));			
		}
	}
	
	private static JsonObject createTallDoorRecipeJson(String recipeID, Identifier baseDoor) {
		 JsonObject json = createShapedRecipeJson(
                    Lists.newArrayList(
                        '#'
                    ), //The keys we are using for the input items/tags.
                    Lists.newArrayList(new Identifier(baseDoor.getNamespace(), baseDoor.getPath())), //The items/tags we are using as input.
                    Lists.newArrayList("item"), //Whether the input we provided is a tag or an item.
                    Lists.newArrayList(
                        "#",
                        "#",
                        "#"
                    ), //The crafting pattern.
                    new Identifier("dramaticdoors:" + recipeID) //The crafting output
                );
		 RECIPES.add(json);
		 return json;
	}
	
    public static JsonObject createShapedRecipeJson(ArrayList<Character> keys, ArrayList<Identifier> items, ArrayList<String> type, ArrayList<String> pattern, Identifier output) {
        //Creating a new json object, where we will store our recipe.
        JsonObject json = new JsonObject();
        //The "type" of the recipe we are creating. In this case, a shaped recipe.
        json.addProperty("type", "minecraft:crafting_shaped");
        //This creates:
        //"type": "minecraft:crafting_shaped"
 
        //We create a new Json Element, and add our crafting pattern to it.
        JsonArray jsonArray = new JsonArray();
        jsonArray.add(pattern.get(0));
        jsonArray.add(pattern.get(1));
        jsonArray.add(pattern.get(2));
        //Then we add the pattern to our json object.
        json.add("pattern", jsonArray);
 
        //Next we need to define what the keys in the pattern are. For this we need different JsonObjects per key definition, and one main JsonObject that will contain all of the defined keys.
        JsonObject individualKey; //Individual key
        JsonObject keyList = new JsonObject(); //The main key object, containing all the keys
 
        for (int i = 0; i < keys.size(); ++i) {
            individualKey = new JsonObject();
            individualKey.addProperty(type.get(i), items.get(i).toString()); //This will create a key in the form "type": "input", where type is either "item" or "tag", and input is our input item.
            keyList.add(keys.get(i) + "", individualKey); //Then we add this key to the main key object.
        }
 
        json.add("key", keyList);
        //Finally, we define our result object
        JsonObject result = new JsonObject();
        result.addProperty("item", output.toString());
        result.addProperty("count", 1);
        json.add("result", result);
 
        return json;
    }
}
