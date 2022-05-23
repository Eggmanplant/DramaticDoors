package com.fizzware.dramaticdoors.state.properties;

import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;

public class DDProperties extends Properties {
   public static final EnumProperty<TripleBlockPart> TRIPLE_BLOCK_THIRD = EnumProperty.of("third", TripleBlockPart.class);
}