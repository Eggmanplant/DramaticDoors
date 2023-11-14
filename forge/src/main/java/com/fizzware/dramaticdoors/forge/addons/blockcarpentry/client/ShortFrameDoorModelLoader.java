package com.fizzware.dramaticdoors.forge.addons.blockcarpentry.client;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;

import net.minecraftforge.client.model.geometry.IGeometryLoader;

public class ShortFrameDoorModelLoader implements IGeometryLoader<ShortFrameDoorModelGeometry>
{
    @Override
    public ShortFrameDoorModelGeometry read(JsonObject modelContents, JsonDeserializationContext deserializationContext) {
        return new ShortFrameDoorModelGeometry();
    }
}
