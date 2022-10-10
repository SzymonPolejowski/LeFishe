package net.lefishe.main.mixin;

import net.lefishe.items.FisheItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import net.minecraft.entity.projectile.FishingBobberEntity;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(FishingBobberEntity.class)
public class PrismaticFishingRodFixer {
	@Inject(at = @At("HEAD"), method = "removeIfInvalid", cancellable = true)
	private void stopBobber(PlayerEntity player, CallbackInfoReturnable<Boolean> cir) {
		ItemStack itemStack = player.getMainHandStack();
		ItemStack itemStack2 = player.getOffHandStack();
		if (itemStack.getItem() == FisheItems.FISHE_PRISMATICROD || itemStack2.getItem() == FisheItems.FISHE_PRISMATICROD){
			cir.setReturnValue(false);
		}
	}
}