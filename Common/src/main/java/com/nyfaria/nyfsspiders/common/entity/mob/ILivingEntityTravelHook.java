package com.nyfaria.nyfsspiders.common.entity.mob;

import net.minecraft.world.phys.Vec3;

public interface ILivingEntityTravelHook {
	public boolean onTravel(Vec3 relative, boolean pre);
}
