package com.nyfaria.nyfsspiders.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
import com.nyfaria.awcapi.ClientClimberHelper;
import com.nyfaria.awcapi.client.IAdvancedClimberRenderState;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.renderer.entity.state.*;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntityRenderer.class)
public abstract class MixinLivingRenderer <T extends LivingEntity, S extends LivingEntityRenderState, M extends EntityModel<? super S>> extends EntityRenderer<T, S> implements RenderLayerParent<S, M> {

    protected MixinLivingRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    @Inject(method = "render(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;I)V", at = @At("HEAD"))
    private void livingRenderPre(S livingEntity, PoseStack poseStack, MultiBufferSource p_115312_, int p_115313_, CallbackInfo ci) {
        if (livingEntity instanceof IAdvancedClimberRenderState climberState) {
            ClientClimberHelper.preRenderClimber(climberState, poseStack);
        }
    }

    @Inject(method = "render(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;I)V", at = @At("RETURN"))
    private void livingRenderPost(S livingEntity, PoseStack poseStack, MultiBufferSource multiBufferSource, int p_115313_, CallbackInfo ci) {
        if (livingEntity instanceof IAdvancedClimberRenderState climberState) {
            ClientClimberHelper.postRenderClimber(climberState, poseStack, multiBufferSource);
        }
    }
}