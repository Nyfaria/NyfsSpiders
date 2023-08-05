package com.nyfaria.nyfsspiders;

import com.nyfaria.nyfsspiders.init.BlockInit;
import com.nyfaria.nyfsspiders.init.EntityInit;
import com.nyfaria.nyfsspiders.init.ItemInit;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.world.phys.Vec3;

// This class is part of the common project meaning it is shared between all supported loaders. Code written here can only
// import and access the vanilla codebase, libraries used by vanilla, and optionally third party libraries that provide
// common compatible binaries. This means common code can not directly use loader specific concepts such as Forge events
// however it will be compatible with all supported mod loaders.
public class CommonClass {

    // The loader specific projects are able to import and use any code from the common project. This allows you to
    // write the majority of your code here and load it from your loader specific projects. This example has some
    // code that gets invoked by the entry point of the loader specific projects.
    public static void init() {
        ItemInit.loadClass();
        BlockInit.loadClass();
        EntityInit.loadClass();
    }

    public static BlockPos blockPos(double pX, double pY, double pZ) {
        return new BlockPos(Mth.floor(pX), Mth.floor(pY), Mth.floor(pZ));
    }
    public static BlockPos blockPos(Vec3 pVec3) {
        return blockPos(pVec3.x, pVec3.y, pVec3.z);
    }
}