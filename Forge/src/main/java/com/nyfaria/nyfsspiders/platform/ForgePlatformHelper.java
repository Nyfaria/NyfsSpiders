package com.nyfaria.nyfsspiders.platform;

import com.nyfaria.nyfsspiders.Config;
import com.nyfaria.nyfsspiders.platform.services.IPlatformHelper;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.loading.FMLLoader;

import java.nio.file.Path;

public class ForgePlatformHelper implements IPlatformHelper {

    @Override
    public String getPlatformName() {

        return "Forge";
    }

    @Override
    public boolean isModLoaded(String modId) {

        return ModList.get().isLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {

        return !FMLLoader.isProduction();
    }

    @Override
    public boolean getPreventClimbingInRain() {
        return Config.PREVENT_CLIMBING_IN_RAIN.get();
    }

    @Override
    public boolean getPathFinderDebugPreview() {
        return Config.PATH_FINDER_DEBUG_PREVIEW.get();
    }


}