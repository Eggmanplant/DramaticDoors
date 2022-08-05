package com.fizzware.dramaticdoors.mixin;

import java.util.Map;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.crafting.DDAdvancementCompats;
import com.google.gson.JsonElement;

import net.minecraft.util.Identifier;
import net.minecraft.util.profiler.Profiler;
import net.minecraft.resource.ResourceManager;
import net.minecraft.server.ServerAdvancementLoader;

@Mixin(ServerAdvancementLoader.class)
public class AdvancementManagerMixin
{
	@Inject(method = "apply", at = @At("HEAD"))
    public void interceptApply(Map<Identifier, JsonElement> map, ResourceManager manager, Profiler profiler, CallbackInfo info) {
    	DDAdvancementCompats.RECIPE_ADVANCEMENTS.forEach((advancement) -> { map.put(new Identifier(DramaticDoors.MOD_ID, "recipes/redstone/" + advancement.getAsJsonObject("rewards").getAsJsonArray("recipes").get(0).getAsString().replace(DramaticDoors.MOD_ID + ":", "")), advancement); } );
    }
}
