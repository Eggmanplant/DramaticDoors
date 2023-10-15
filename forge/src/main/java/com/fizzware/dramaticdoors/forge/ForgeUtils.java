package com.fizzware.dramaticdoors.forge;

import java.util.function.Supplier;

import org.jetbrains.annotations.Nullable;

import com.fizzware.dramaticdoors.compat.CompatChecker;
import com.fizzware.dramaticdoors.compat.Compats;
import com.fizzware.dramaticdoors.forge.config.DDConfigForge;
import com.fizzware.dramaticdoors.items.ModdedTab;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.level.LevelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.loading.FMLEnvironment;
import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.fml.loading.LoadingModList;

public class ForgeUtils implements CompatChecker, ModdedTab
{
	public static final ForgeUtils INSTANCE = new ForgeUtils();
	
	protected static boolean hasQuarkDoubleDoor = DDConfigForge.getConfigBooleanValue(DDConfigForge.CONFIG, FMLPaths.CONFIGDIR.get().resolve("quark-common.toml"), "tweaks.Double Door Opening");
	
	@Override
	public boolean isModLoaded(String modid) {
		if (LoadingModList.get().getModFileById(modid) != null) {
			return true;
		}
		return ModList.get().isLoaded(modid);
	}
	
	@Override
	public boolean isDev() {
    	if (!FMLEnvironment.production) { // Stops the error when trying to data-gen.
    		return true;
    	}
		return DDConfigForge.devMode.get();
	}
	
	@Override
	public boolean isQuarkModuleEnabled() {
    	if (Compats.QUARK_INSTALLED && hasQuarkDoubleDoor) {
    		return true;
    	}
    	return false;
	}
	
	public boolean isDevEnvOnForge() {
		return !FMLEnvironment.production || DDConfigForge.devMode.get();
	}
	
	@Override
	public CreativeModeTab createTab(String tabname, Supplier<ItemStack> supplier, @Nullable String modid) {
		if (modid != null) {
			return isModLoaded(modid) ? new CreativeModeTab(tabname) { @Override public ItemStack makeIcon() { return supplier.get(); }} : null;
		}
		else {
			return new CreativeModeTab(tabname) { @Override public ItemStack makeIcon() { return supplier.get(); }};
		}
	}
	
    @SubscribeEvent
	public void onWorldLoad(LevelEvent.Load e) {
    	hasQuarkDoubleDoor = DDConfigForge.getConfigBooleanValue(DDConfigForge.CONFIG, FMLPaths.CONFIGDIR.get().resolve("quark-common.toml"), "tweaks.Double Door Opening");
    }
}
