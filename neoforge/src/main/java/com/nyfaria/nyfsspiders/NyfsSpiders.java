package com.nyfaria.nyfsspiders;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;

/**
 * NeoForge mod initializer.
 * Spider climbing is handled by AWCAPI.
 */
@Mod(Constants.MODID)
public class NyfsSpiders {

    public NyfsSpiders(ModContainer container, IEventBus bus) {
        container.registerConfig(ModConfig.Type.COMMON, Config.COMMON, "nyfsspiders.toml");
        CommonClass.init();
    }
}

