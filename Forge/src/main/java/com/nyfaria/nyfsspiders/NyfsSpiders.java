package com.nyfaria.nyfsspiders;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

@Mod(Constants.MODID)
public class NyfsSpiders {
    
    public NyfsSpiders() {
        ModLoadingContext loadingContext = ModLoadingContext.get();
        loadingContext.registerConfig(ModConfig.Type.COMMON, Config.COMMON, "nyfsspiders.toml");
        CommonClass.init();
    }

}