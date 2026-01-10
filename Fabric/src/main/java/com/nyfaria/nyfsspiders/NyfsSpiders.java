package com.nyfaria.nyfsspiders;

import fuzs.forgeconfigapiport.fabric.api.neoforge.v4.NeoForgeConfigRegistry;
import net.fabricmc.api.ModInitializer;
import net.neoforged.fml.config.ModConfig;

/**
 * Fabric mod initializer.
 * Spider climbing is handled by AWCAPI.
 */
public class NyfsSpiders implements ModInitializer {

    @Override
    public void onInitialize() {
        Constants.LOG.info("Hello Fabric world!");
        CommonClass.init();
        NeoForgeConfigRegistry.INSTANCE.register(Constants.MODID, ModConfig.Type.COMMON, Config.COMMON);
    }
}

