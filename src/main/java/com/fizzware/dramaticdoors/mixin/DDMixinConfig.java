package com.fizzware.dramaticdoors.mixin;

import java.util.List;
import java.util.Set;

import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

import com.fizzware.dramaticdoors.config.DDConfig;
import net.fabricmc.loader.api.FabricLoader;

public class DDMixinConfig implements IMixinConfigPlugin
{

	@Override
	public void onLoad(String mixinPackage) {
		DDConfig.initializeConfigs();
	}

	@Override
	public String getRefMapperConfig() {
		return null;
	}

	@Override
	public boolean shouldApplyMixin(String targetClassName, String mixinClassName) {
		if (mixinClassName.equals("com.fizzware.dramaticdoors.mixin.DoorBlockMixin")) {
			return DDConfig.waterloggableDoors;
		}
		if (mixinClassName.equals("com.fizzware.dramaticdoors.mixin.FenceGateBlockMixin")) {
			return DDConfig.waterloggableFenceGates;
		}
		if (mixinClassName.equals("com.fizzware.dramaticdoors.mixin.CPlusFenceGateBlockMixin")) {
			return DDConfig.waterloggableFenceGates && FabricLoader.getInstance().isModLoaded("consistency_plus");
		}
		return true;
	}

	@Override
	public void acceptTargets(Set<String> myTargets, Set<String> otherTargets) {}

	@Override
	public List<String> getMixins() {
		return null; 
	}

	@Override
	public void preApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {}

	@Override
	public void postApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {}

}
