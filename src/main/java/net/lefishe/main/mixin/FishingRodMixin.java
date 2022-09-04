package net.lefishe.main.mixin;

import net.lefishe.main.leFisheMain;
import net.minecraft.entity.projectile.FishingBobberEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(FishingBobberEntity.class)
public class FishingRodMixin {
	
	@Inject(at = @At("HEAD"), method = "removeIfInvalid(PlayerEntity player)")
	private void removeIfInvalid() {
		leFisheMain.LOGGER.info("This line is printed by an example mod mixin!");
	}
	
}
