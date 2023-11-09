package com.fizzware.dramaticdoors.forge.addons.blockcarpentry;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;

import net.minecraftforge.client.model.geometry.IGeometryLoader;

public class TallIllusionDoorModelLoader implements IGeometryLoader<TallIllusionDoorModelGeometry>
{
    @Override
    public TallIllusionDoorModelGeometry read(JsonObject modelContents, JsonDeserializationContext deserializationContext) {
        return new TallIllusionDoorModelGeometry();
    }
}
