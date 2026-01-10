package com.nyfaria.nyfsspiders.client;

import com.nyfaria.awcapi.client.*;
import net.minecraft.client.renderer.entity.state.*;
import net.minecraft.world.phys.*;

public class AdvancedSpiderRenderState extends LivingEntityRenderState implements IAdvancedClimberRenderState {

    // Backing fields for IAdvancedClimberRenderState
    private boolean climbing;
    private Vec3 normal = new Vec3(0, 1, 0);
    private Vec3 localX = new Vec3(1, 0, 0);
    private Vec3 localY = new Vec3(0, 1, 0);
    private Vec3 localZ = new Vec3(0, 0, 1);
    private float componentX;
    private float componentY;
    private float componentZ;
    private float yaw;
    private float pitch;
    private float attachmentOffsetX;
    private float attachmentOffsetY;
    private float attachmentOffsetZ;
    private float verticalOffset;
    private float partialTick;

    @Override
    public boolean awca$isClimbing() {
        return climbing;
    }

    @Override
    public void awca$setClimbing(boolean climbing) {
        this.climbing = climbing;
    }

    @Override
    public Vec3 awca$getNormal() {
        return normal;
    }

    @Override
    public void awca$setNormal(Vec3 normal) {
        this.normal = normal;
    }

    @Override
    public Vec3 awca$getLocalX() {
        return localX;
    }

    @Override
    public void awca$setLocalX(Vec3 localX) {
        this.localX = localX;
    }

    @Override
    public Vec3 awca$getLocalY() {
        return localY;
    }

    @Override
    public void awca$setLocalY(Vec3 localY) {
        this.localY = localY;
    }

    @Override
    public Vec3 awca$getLocalZ() {
        return localZ;
    }

    @Override
    public void awca$setLocalZ(Vec3 localZ) {
        this.localZ = localZ;
    }

    @Override
    public float awca$getComponentX() {
        return componentX;
    }

    @Override
    public void awca$setComponentX(float componentX) {
        this.componentX = componentX;
    }

    @Override
    public float awca$getComponentY() {
        return componentY;
    }

    @Override
    public void awca$setComponentY(float componentY) {
        this.componentY = componentY;
    }

    @Override
    public float awca$getComponentZ() {
        return componentZ;
    }

    @Override
    public void awca$setComponentZ(float componentZ) {
        this.componentZ = componentZ;
    }

    @Override
    public float awca$getYaw() {
        return yaw;
    }

    @Override
    public void awca$setYaw(float yaw) {
        this.yaw = yaw;
    }

    @Override
    public float awca$getPitch() {
        return pitch;
    }

    @Override
    public void awca$setPitch(float pitch) {
        this.pitch = pitch;
    }

    @Override
    public float awca$getAttachmentOffsetX() {
        return attachmentOffsetX;
    }

    @Override
    public void awca$setAttachmentOffsetX(float offset) {
        this.attachmentOffsetX = offset;
    }

    @Override
    public float awca$getAttachmentOffsetY() {
        return attachmentOffsetY;
    }

    @Override
    public void awca$setAttachmentOffsetY(float offset) {
        this.attachmentOffsetY = offset;
    }

    @Override
    public float awca$getAttachmentOffsetZ() {
        return attachmentOffsetZ;
    }

    @Override
    public void awca$setAttachmentOffsetZ(float offset) {
        this.attachmentOffsetZ = offset;
    }

    @Override
    public float awca$getVerticalOffset() {
        return verticalOffset;
    }

    @Override
    public void awca$setVerticalOffset(float offset) {
        this.verticalOffset = offset;
    }

    @Override
    public float awca$partialTick() {
        return partialTick;
    }

    @Override
    public void awca$setPartialTick(float partialTick) {
        this.partialTick = partialTick;
    }
}
