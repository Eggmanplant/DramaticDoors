package com.fizzware.dramaticdoors.crafting;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nullable;

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
	
	public static void initializeRecipes() {
		if (FabricLoader.getInstance().isModLoaded("bewitchment")) {
			createTallDoorRecipeJson(DDNames.TALL_CYPRESS, new Identifier("bewitchment", "cypress_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_DRAGONS_BLOOD, new Identifier("bewitchment", "dragons_blood_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_ELDER, new Identifier("bewitchment", "elder_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_JUNIPER, new Identifier("bewitchment", "juniper_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("biomemakeover")) {
			createTallDoorRecipeJson(DDNames.TALL_ANCIENT_OAK, new Identifier("biomemakeover", "ancient_oak_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BLIGHTED_BALSA, new Identifier("biomemakeover", "blighted_balsa_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_SWAMP_CYPRESS, new Identifier("biomemakeover", "swamp_cypress_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_WILLOW, new Identifier("biomemakeover", "willow_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("byg")) {
			createTallDoorRecipeJson(DDNames.TALL_BYG_ASPEN, new Identifier("byg", "aspen_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_BAOBAB, new Identifier("byg", "baobab_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_BLUE_ENCHANTED, new Identifier("byg", "blue_enchanted_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_BULBIS, new Identifier("byg", "bulbis_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_CHERRY, new Identifier("byg", "cherry_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_CIKA, new Identifier("byg", "cika_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_CYPRESS, new Identifier("byg", "cypress_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_EBONY, new Identifier("byg", "ebony_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_EMBUR, new Identifier("byg", "embur_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_ETHER, new Identifier("byg", "ether_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_FIR, new Identifier("byg", "fir_door"), "tall_byg_wooden_door");
			//createTallDoorRecipeJson(DDNames.TALL_BYG_FLORUS, new Identifier("byg", "florus_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_GREEN_ENCHANTED, new Identifier("byg", "green_enchanted_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_HOLLY, new Identifier("byg", "holly_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_IMPARIUS, new Identifier("byg", "imparius_door"), "tall_byg_wooden_door");
			//createTallDoorRecipeJson(DDNames.TALL_BYG_IRONWOOD, new Identifier("byg", "ironwood_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_JACARANDA, new Identifier("byg", "jacaranda_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_LAMENT, new Identifier("byg", "lament_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_MAHOGANY, new Identifier("byg", "mahogany_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_MAPLE, new Identifier("byg", "maple_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_NIGHTSHADE, new Identifier("byg", "nightshade_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_PALM, new Identifier("byg", "palm_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_PINE, new Identifier("byg", "pine_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_RAINBOW_EUCALYPTUS, new Identifier("byg", "rainbow_eucalyptus_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_REDWOOD, new Identifier("byg", "redwood_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_SKYRIS, new Identifier("byg", "skyris_door"), "tall_byg_wooden_door");
			//createTallDoorRecipeJson(DDNames.TALL_BYG_SOUL_SHROOM, new Identifier("byg", "soul_shroom_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_SYTHIAN, new Identifier("byg", "sythian_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_WHITE_MANGROVE, new Identifier("byg", "white_mangrove_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_WILLOW, new Identifier("byg", "willow_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_WITCH_HAZEL, new Identifier("byg", "witch_hazel_door"), "tall_byg_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_BYG_ZELKOVA, new Identifier("byg", "zelkova_door"), "tall_byg_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("ceilands")) {
			createTallDoorRecipeJson(DDNames.TALL_CEILTRUNK, new Identifier("ceilands", "ceiltrunk_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_LUZAWOOD, new Identifier("ceilands", "luzawood_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("ecologics")) {
			createTallDoorRecipeJson(DDNames.TALL_ECO_AZALEA, new Identifier("ecologics", "azalea_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_ECO_FLOWERING_AZALEA, new Identifier("ecologics", "flowering_azalea_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_ECO_COCONUT, new Identifier("ecologics", "coconut_door"), "tall_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_ECO_WALNUT, new Identifier("ecologics", "walnut_door"), "tall_wooden_door");
		}
		if (FabricLoader.getInstance().isModLoaded("snowyspirit")) {
			createTallDoorRecipeJson(DDNames.TALL_GINGERBREAD, new Identifier("snowyspirit", "gingerbread_door"), "tall_wooden_door");	
		}
		if (FabricLoader.getInstance().isModLoaded("supplementaries")) {
			createTallDoorRecipeJson(DDNames.TALL_GOLD, new Identifier("supplementaries", "gold_door"), "tall_metal_door");
			createTallDoorRecipeJson(DDNames.TALL_NETHERITE, new Identifier("supplementaries", "netherite_door"), "tall_metal_door");			
		}
		if (FabricLoader.getInstance().isModLoaded("twigs")) {
			createTallDoorRecipeJson(DDNames.TALL_STRIPPED_BAMBOO, new Identifier("twigs", "stripped_bamboo_door"), "tall_wooden_door");			
		}
		if (FabricLoader.getInstance().isModLoaded("twilightforest")) {
			createTallDoorRecipeJson(DDNames.TALL_CANOPY, new Identifier("twilightforest", "canopy_door"), "tall_tf_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_DARKWOOD, new Identifier("twilightforest", "dark_door"), "tall_tf_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_TWILIGHT_MANGROVE, new Identifier("twilightforest", "mangrove_door"), "tall_tf_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_MINEWOOD, new Identifier("twilightforest", "mining_door"), "tall_tf_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_SORTINGWOOD, new Identifier("twilightforest", "sorting_door"), "tall_tf_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_TIMEWOOD, new Identifier("twilightforest", "time_door"), "tall_tf_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_TRANSWOOD, new Identifier("twilightforest", "transformation_door"), "tall_tf_wooden_door");
			createTallDoorRecipeJson(DDNames.TALL_TWILIGHT_OAK, new Identifier("twilightforest", "twilight_oak_door"), "tall_tf_wooden_door");			
		}
	}
	
	private static JsonObject createTallDoorRecipeJson(String recipeID, Identifier baseDoor, @Nullable String group) {
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
                    new Identifier("dramaticdoors:" + recipeID), group //The crafting output
                );
		 RECIPES.add(json);
		 return json;
	}
	
    public static JsonObject createShapedRecipeJson(ArrayList<Character> keys, ArrayList<Identifier> items, ArrayList<String> type, ArrayList<String> pattern, Identifier output, @Nullable String group) {
        //Creating a new json object, where we will store our recipe.
        JsonObject json = new JsonObject();
        //The "type" of the recipe we are creating. In this case, a shaped recipe.
        json.addProperty("type", "minecraft:crafting_shaped");
        //This creates:
        //"type": "minecraft:crafting_shaped"
         if (group != null) {
        	json.addProperty("group", group);
        }
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
