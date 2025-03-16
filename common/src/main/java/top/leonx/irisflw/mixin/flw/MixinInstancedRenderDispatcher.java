package top.leonx.irisflw.mixin.flw;


import dev.engine_room.flywheel.backend.instancing.InstancedRenderDispatcher;
import dev.engine_room.flywheel.event.RenderLayerEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import top.leonx.irisflw.flywheel.RenderLayerEventStateManager;

@Mixin(value = InstancedRenderDispatcher.class,remap = false)
public class MixinInstancedRenderDispatcher {
    @Inject(method = "renderLayer",at=@At("HEAD"),cancellable = true)
    private static void irisflw$renderLayer(RenderLayerEvent event, CallbackInfo ci){
        if(RenderLayerEventStateManager.isSkip())
            ci.cancel();
    }
}
