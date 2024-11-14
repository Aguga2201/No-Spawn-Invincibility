package com.aguga.mixin;

import net.minecraft.server.network.ServerPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ServerPlayerEntity.class)
public class ServerPlayerEntityMixin
{
    @Shadow private int joinInvulnerabilityTicks;

    @Inject(at = @At("HEAD"), method = "onSpawn")
    private void onSpawn(CallbackInfo ci)
    {
        this.joinInvulnerabilityTicks = 10;
    }
}
