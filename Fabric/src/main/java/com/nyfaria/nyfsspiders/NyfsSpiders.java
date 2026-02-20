package com.nyfaria.nyfsspiders;

import fuzs.forgeconfigapiport.impl.config.*;
import net.fabricmc.api.ModInitializer;
import net.minecraftforge.fml.config.*;

public class NyfsSpiders implements ModInitializer {
    
    @Override
    public void onInitialize() {
        CommonClass.init();
        ForgeConfigRegistryImpl.INSTANCE.register(Constants.MODID, ModConfig.Type.COMMON, Config.COMMON);
    }
}
