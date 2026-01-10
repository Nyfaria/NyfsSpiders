package com.nyfaria.nyfsspiders.common;

import com.nyfaria.nyfsspiders.*;
import net.minecraft.core.registries.*;
import net.minecraft.resources.*;
import net.minecraft.tags.*;
import net.minecraft.world.level.block.*;

public class ModTags {
	public static final TagKey<Block> NON_CLIMBABLE = TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MODID,"non_climbable"));
}
