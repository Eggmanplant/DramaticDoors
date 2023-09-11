package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class PrehistoricFaunaCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_AGATHOXYLON, DDNames.SHORT_AGATHOXYLON, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("prehistoricfauna", "agathoxylon_door")), BlockSetType.JUNGLE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_ARAUCARIA, DDNames.SHORT_ARAUCARIA, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("prehistoricfauna", "araucaria_door")), BlockSetType.JUNGLE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_BRACHYPHYLLUM, DDNames.SHORT_BRACHYPHYLLUM, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("prehistoricfauna", "brachyphyllum_door")), BlockSetType.JUNGLE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_GINKGO, DDNames.SHORT_GINKGO, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("prehistoricfauna", "ginkgo_door")), BlockSetType.JUNGLE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_HEIDIPHYLLUM, DDNames.SHORT_HEIDIPHYLLUM, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("prehistoricfauna", "heidiphyllum_door")), BlockSetType.JUNGLE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_LIRIODENDRITES, DDNames.SHORT_LIRIODENDRITES, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("prehistoricfauna", "liriodendrites_door")), BlockSetType.JUNGLE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_METASEQUOIA, DDNames.SHORT_METASEQUOIA, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("prehistoricfauna", "metasequoia_door")), BlockSetType.SPRUCE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_NEOCALAMITES, DDNames.SHORT_NEOCALAMITES, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("prehistoricfauna", "neocalamites_door")), BlockSetType.JUNGLE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_PROTOJUNIPEROXYLON, DDNames.SHORT_PROTOJUNIPEROXYLON, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("prehistoricfauna", "protojuniperoxylon_door")), BlockSetType.JUNGLE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_PROTOPICEOXYLON, DDNames.SHORT_PROTOPICEOXYLON, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("prehistoricfauna", "protopiceoxylon_door")), BlockSetType.JUNGLE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_SCHILDERIA, DDNames.SHORT_SCHILDERIA, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("prehistoricfauna", "schilderia_door")), BlockSetType.JUNGLE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_TROCHODENDROIDES, DDNames.SHORT_TROCHODENDROIDES, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("prehistoricfauna", "trochodendroides_door")), BlockSetType.JUNGLE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_WOODWORTHIA, DDNames.SHORT_WOODWORTHIA, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("prehistoricfauna", "woodworthia_door")), BlockSetType.JUNGLE, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_ZAMITES, DDNames.SHORT_ZAMITES, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("prehistoricfauna", "zamites_door")), BlockSetType.JUNGLE, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_AGATHOXYLON, new ResourceLocation("prehistoricfauna", "agathoxylon_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_ARAUCARIA, new ResourceLocation("prehistoricfauna", "araucaria_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_BRACHYPHYLLUM, new ResourceLocation("prehistoricfauna", "brachyphyllum_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_GINKGO, new ResourceLocation("prehistoricfauna", "ginkgo_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_HEIDIPHYLLUM, new ResourceLocation("prehistoricfauna", "heidiphyllum_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_LIRIODENDRITES, new ResourceLocation("prehistoricfauna", "liriodendrites_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_METASEQUOIA, new ResourceLocation("prehistoricfauna", "metasequoia_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_NEOCALAMITES, new ResourceLocation("prehistoricfauna", "neocalamites_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_PROTOJUNIPEROXYLON, new ResourceLocation("prehistoricfauna", "protojuniperoxylon_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_PROTOPICEOXYLON, new ResourceLocation("prehistoricfauna", "protopiceoxylon_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_SCHILDERIA, new ResourceLocation("prehistoricfauna", "schilderia_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_TROCHODENDROIDES, new ResourceLocation("prehistoricfauna", "trochodendroides_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_WOODWORTHIA, new ResourceLocation("prehistoricfauna", "woodworthia_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_ZAMITES, new ResourceLocation("prehistoricfauna", "zamites_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_AGATHOXYLON, new ResourceLocation("prehistoricfauna", "agathoxylon_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_ARAUCARIA, new ResourceLocation("prehistoricfauna", "araucaria_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_BRACHYPHYLLUM, new ResourceLocation("prehistoricfauna", "brachyphyllum_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_GINKGO, new ResourceLocation("prehistoricfauna", "ginkgo_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_HEIDIPHYLLUM, new ResourceLocation("prehistoricfauna", "heidiphyllum_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_LIRIODENDRITES, new ResourceLocation("prehistoricfauna", "liriodendrites_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_METASEQUOIA, new ResourceLocation("prehistoricfauna", "metasequoia_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_NEOCALAMITES, new ResourceLocation("prehistoricfauna", "neocalamites_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_PROTOJUNIPEROXYLON, new ResourceLocation("prehistoricfauna", "protojuniperoxylon_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_PROTOPICEOXYLON, new ResourceLocation("prehistoricfauna", "protopiceoxylon_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_SCHILDERIA, new ResourceLocation("prehistoricfauna", "schilderia_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_TROCHODENDROIDES, new ResourceLocation("prehistoricfauna", "trochodendroides_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_WOODWORTHIA, new ResourceLocation("prehistoricfauna", "woodworthia_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_ZAMITES, new ResourceLocation("prehistoricfauna", "zamites_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_AGATHOXYLON, new ResourceLocation("prehistoricfauna", "agathoxylon_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_ARAUCARIA, new ResourceLocation("prehistoricfauna", "araucaria_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_BRACHYPHYLLUM, new ResourceLocation("prehistoricfauna", "brachyphyllum_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_GINKGO, new ResourceLocation("prehistoricfauna", "ginkgo_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_HEIDIPHYLLUM, new ResourceLocation("prehistoricfauna", "heidiphyllum_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_LIRIODENDRITES, new ResourceLocation("prehistoricfauna", "liriodendrites_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_METASEQUOIA, new ResourceLocation("prehistoricfauna", "metasequoia_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_NEOCALAMITES, new ResourceLocation("prehistoricfauna", "neocalamites_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_PROTOJUNIPEROXYLON, new ResourceLocation("prehistoricfauna", "protojuniperoxylon_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_PROTOPICEOXYLON, new ResourceLocation("prehistoricfauna", "protopiceoxylon_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_SCHILDERIA, new ResourceLocation("prehistoricfauna", "schilderia_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_TROCHODENDROIDES, new ResourceLocation("prehistoricfauna", "trochodendroides_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_WOODWORTHIA, new ResourceLocation("prehistoricfauna", "woodworthia_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_ZAMITES, new ResourceLocation("prehistoricfauna", "zamites_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_AGATHOXYLON, new ResourceLocation("prehistoricfauna", "agathoxylon_door"), "tall_pf_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_ARAUCARIA, new ResourceLocation("prehistoricfauna", "araucaria_door"), "tall_pf_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_BRACHYPHYLLUM, new ResourceLocation("prehistoricfauna", "brachyphyllum_door"), "tall_pf_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_GINKGO, new ResourceLocation("prehistoricfauna", "ginkgo_door"), "tall_pf_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_HEIDIPHYLLUM, new ResourceLocation("prehistoricfauna", "heidiphyllum_door"), "tall_pf_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_LIRIODENDRITES, new ResourceLocation("prehistoricfauna", "liriodendrites_door"), "tall_pf_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_METASEQUOIA, new ResourceLocation("prehistoricfauna", "metasequoia_door"), "tall_pf_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_NEOCALAMITES, new ResourceLocation("prehistoricfauna", "neocalamites_door"), "tall_pf_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_PROTOJUNIPEROXYLON, new ResourceLocation("prehistoricfauna", "protojuniperoxylon_door"), "tall_pf_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_PROTOPICEOXYLON, new ResourceLocation("prehistoricfauna", "protopiceoxylon_door"), "tall_pf_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_SCHILDERIA, new ResourceLocation("prehistoricfauna", "schilderia_door"), "tall_pf_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_TROCHODENDROIDES, new ResourceLocation("prehistoricfauna", "trochodendroides_door"), "tall_pf_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_WOODWORTHIA, new ResourceLocation("prehistoricfauna", "woodworthia_door"), "tall_pf_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_ZAMITES, new ResourceLocation("prehistoricfauna", "zamites_door"), "tall_pf_wooden_door");
	}
}
