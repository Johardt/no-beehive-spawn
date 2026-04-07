package me.johardt.mixin;

import net.minecraft.world.gen.treedecorator.BeehiveTreeDecorator;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BeehiveTreeDecorator.class)
public class BeehiveDecoratorMixin {
    @Inject(method = "generate", at = @At("HEAD"), cancellable = true)
    private void disableBeehives(CallbackInfo ci) {
        ci.cancel();
    }
}