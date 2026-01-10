package com.nyfaria.nyfsspiders.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
import com.nyfaria.awcapi.ClientClimberHelper;
import com.nyfaria.awcapi.client.IAdvancedClimberRenderState;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.renderer.entity.state.*;
import net.minecraft.client.renderer.state.*;
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

    @Inject(method = "submit(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/CameraRenderState;)V", at = @At("HEAD"))
    private void livingRenderPre(S livingEntity, PoseStack poseStack, SubmitNodeCollector p_433768_, CameraRenderState p_450931_, CallbackInfo ci) {
        if (livingEntity instanceof IAdvancedClimberRenderState climberState) {
            ClientClimberHelper.preRenderClimber(climberState, poseStack);
        }
    }

    @Inject(method = "submit(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/CameraRenderState;)V", at = @At("RETURN"))
    private void livingRenderPost(S livingEntity, PoseStack poseStack, SubmitNodeCollector p_433768_, CameraRenderState p_450931_, CallbackInfo ci) {
        if (livingEntity instanceof IAdvancedClimberRenderState climberState) {
            ClientClimberHelper.postRenderClimber(climberState, poseStack);
        }
    }
}