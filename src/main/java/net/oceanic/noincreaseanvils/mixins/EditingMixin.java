package net.oceanic.noincreaseanvils.mixins;

import net.minecraft.world.inventory.AnvilMenu;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;


@Mixin(AnvilMenu.class)
public class EditingMixin {
	@Inject(method = "calculateIncreasedRepairCost", at = @At(value = "RETURN"), cancellable = true)
	private static void injectedRepairCost(int uselessVariable, CallbackInfoReturnable<Integer> ci) {
		ci.setReturnValue(0);
	}
}

