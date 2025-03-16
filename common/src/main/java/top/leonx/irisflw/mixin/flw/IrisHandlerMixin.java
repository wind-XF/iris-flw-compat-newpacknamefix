package top.leonx.irisflw.mixin.flw;

import dev.engine_room.flywheel.backend.ShadersModHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ShadersModHandler.class)
public class IrisHandlerMixin {
    @Inject(at = @At("HEAD"), method = "isShaderPackInUse()Z", cancellable = true,remap = false)
    private static void isShaderPackInUse(CallbackInfoReturnable<Boolean> cir){
        cir.setReturnValue(false);
    }}
