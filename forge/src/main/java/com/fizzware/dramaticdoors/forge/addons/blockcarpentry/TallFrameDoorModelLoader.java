package com.fizzware.dramaticdoors.forge.addons.blockcarpentry;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;

import net.minecraftforge.client.model.geometry.IGeometryLoader;

public class TallFrameDoorModelLoader implements IGeometryLoader<TallFrameDoorModelGeometry>
{
    @Override
    public TallFrameDoorModelGeometry read(JsonObject modelContents, JsonDeserializationContext deserializationContext) {
        return new TallFrameDoorModelGeometry();
    }
}
