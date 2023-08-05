package com.nyfaria.nyfsspiders.common;

import com.nyfaria.nyfsspiders.Constants;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
	public static final TagKey<Block> NON_CLIMBABLE = TagKey.create(Registries.BLOCK,new ResourceLocation(Constants.MODID,"non_climbable"));
}
