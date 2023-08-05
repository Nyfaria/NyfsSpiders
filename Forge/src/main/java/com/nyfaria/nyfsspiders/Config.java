package com.nyfaria.nyfsspiders;

import net.minecraftforge.common.ForgeConfigSpec;

public class Config {
	public static final ForgeConfigSpec COMMON;

	public static final ForgeConfigSpec.BooleanValue PATH_FINDER_DEBUG_PREVIEW;
	public static final ForgeConfigSpec.BooleanValue PREVENT_CLIMBING_IN_RAIN;

	static {
		ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

		PATH_FINDER_DEBUG_PREVIEW = builder
				.worldRestart()
				.comment("Whether the path finder debug preview should be enabled.")
				.define("path_finder_debug_preview", false);
		PREVENT_CLIMBING_IN_RAIN = builder
				.worldRestart()
				.comment("Whether spiders should be prevented from climbing in rain.")
				.define("prevent_climbing_in_rain", false);
		COMMON = builder.build();
	}
}
