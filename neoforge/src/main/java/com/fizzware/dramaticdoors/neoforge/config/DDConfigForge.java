package com.fizzware.dramaticdoors.neoforge.config;

import java.nio.file.Path;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;

import net.neoforged.neoforge.common.ModConfigSpec;

public class DDConfigForge
{
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
	
	public static ModConfigSpec CONFIG;

	public static final String CATEGORY_EXPERIMENTAL = "Experimental";

	public static ModConfigSpec.BooleanValue devMode;

	public static final String CATEGORY_MIXINS = "Mixins";
	
	public static ModConfigSpec.BooleanValue waterloggableDoors;
	public static ModConfigSpec.BooleanValue waterloggableFenceGates;
	
	static {
		initializeConfig();
		
        CONFIG = BUILDER.build();
	}
	
	private static void initializeConfig()
	{
		BUILDER.comment("Dramatic Doors").push(CATEGORY_EXPERIMENTAL);
		
        devMode = BUILDER
                .comment("Development mode ensures that all compat doors are always registered regardless of whether mods are installed or not, for development purposes.  " + "Default: false")
                .define("dev_mode", false);
		
        BUILDER.pop();
        
		BUILDER.push(CATEGORY_MIXINS);
		
        waterloggableDoors = BUILDER
                .comment("Allow doors to be waterlogged. Enable to allow waterlogging. Disable for compatibility with certain mods. Requires restart after changing.  " + "Default: true")
                .define("waterloggable_doors", true);
        
        waterloggableFenceGates = BUILDER
                .comment("Allow fence gates to be waterlogged. Enable to allow waterlogging. Disable for compatibility with certain mods. Requires restart after changing.  " + "Default: true")
                .define("waterloggable_fence_gates", true);
		
		BUILDER.pop();
	}
	
    public static void loadConfig(ModConfigSpec spec, Path path) {
        final CommentedFileConfig configData = CommentedFileConfig.builder(path).sync().autosave().writingMode(WritingMode.REPLACE).build();
        configData.load();
        spec.setConfig(configData);
    }

    public static boolean getConfigBooleanValue(ModConfigSpec spec, Path path, String variable) {
    	final CommentedFileConfig configData = CommentedFileConfig.builder(path).sync().build();
    	configData.load();
    	if (configData.get(variable) != null) {
    		return configData.get(variable);
    	}
    	else {
    		return false;
    	}
    }
    
    public static int getConfigIntValue(ModConfigSpec spec, Path path, String variable) {
    	final CommentedFileConfig configData = CommentedFileConfig.builder(path).sync().build();
    	configData.load();
    	if (configData.get(variable) != null) {
    		return configData.get(variable);
    	}
    	else {
    		return 0;
    	}
    }
}
