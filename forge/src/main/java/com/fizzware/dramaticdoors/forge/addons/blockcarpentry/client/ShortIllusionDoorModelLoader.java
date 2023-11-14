package com.fizzware.dramaticdoors.forge.addons.blockcarpentry.client;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;

import net.minecraftforge.client.model.geometry.IGeometryLoader;

public class ShortIllusionDoorModelLoader implements IGeometryLoader<ShortIllusionDoorModelGeometry>
{
    @Override
    public ShortIllusionDoorModelGeometry read(JsonObject modelContents, JsonDeserializationContext deserializationContext) {
        return new ShortIllusionDoorModelGeometry();
    }
}
