package com.nyfaria.nyfsspiders;

import net.minecraftforge.fml.*;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.config.*;

@Mod(Constants.MODID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NyfsSpiders {

    public NyfsSpiders() {
        ModLoadingContext loadingContext = ModLoadingContext.get();
        loadingContext.registerConfig(ModConfig.Type.COMMON, Config.COMMON, "nyfsspiders.toml");
        CommonClass.init();
    }


}