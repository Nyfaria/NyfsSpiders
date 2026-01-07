package com.nyfaria.nyfsspiders.mixin;

import com.mojang.blaze3d.vertex.*;
import com.nyfaria.nyfsspiders.client.*;
import com.nyfaria.nyfsspiders.common.entity.mob.*;
import lombok.*;
import net.minecraft.client.model.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.renderer.entity.state.*;
import net.minecraft.world.entity.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;

@Mixin(LivingEntityRenderer.class)
public abstract class MixinLivingRenderer <T extends LivingEntity, S extends LivingEntityRenderState, M extends EntityModel<S>> extends EntityRenderer<T,S> {

    @Getter @Setter
    private Orientation orientation;
    @Getter @Setter
    private Orientation renderOrientation;

    protected MixinLivingRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    @Inject(method = "render(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;I)V", at = @At("HEAD"))
    private void livingRenderPre(S renderState, PoseStack poseStack, MultiBufferSource bufferSource, int color, CallbackInfo ci) {
        ClientEventHandlers.onPreRenderLiving(renderState, 0, poseStack);
    }

    @Inject(method = "render(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;I)V", at = @At("RETURN"))
    private void livingRenderPost(S renderState, PoseStack poseStack, MultiBufferSource bufferSource, int color, CallbackInfo ci) {
        ClientEventHandlers.onPostRenderLiving(renderState,0, poseStack, bufferSource);
    }


    @Inject(method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", at = @At("TAIL"))
    private void extractRenderStateInject(T entity, S renderState, float partialTicks, CallbackInfo ci) {
        if(entity instanceof IClimberEntity) {
            IClimberEntity climber = (IClimberEntity) entity;

        }
    }
}