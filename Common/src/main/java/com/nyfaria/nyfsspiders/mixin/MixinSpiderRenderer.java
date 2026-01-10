package com.nyfaria.nyfsspiders.mixin;

import com.nyfaria.awcapi.*;
import com.nyfaria.nyfsspiders.client.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.renderer.entity.state.*;
import net.minecraft.world.entity.monster.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;

@Mixin(SpiderRenderer.class)
public class MixinSpiderRenderer {

    @Inject(method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;", at = @At("HEAD"), cancellable = true)
    private void nyfsspiders$onCreateRenderState(CallbackInfoReturnable<LivingEntityRenderState> cir) {
        cir.setReturnValue(new AdvancedSpiderRenderState());
    }
    @Inject(method ="extractRenderState(Lnet/minecraft/world/entity/monster/Spider;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", at = @At("TAIL"))
    private void nyfsspiders$onExtractRenderState(Spider spider, LivingEntityRenderState renderState, float partialTicks, CallbackInfo ci) {
        if( renderState instanceof AdvancedSpiderRenderState advancedRenderState) {
            ClientClimberHelper.extractClimbingRenderState(spider, advancedRenderState, partialTicks);
        }
    }
}
