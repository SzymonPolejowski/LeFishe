package lefishe.main.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FishingBobberEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.FishingRodItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(FishingBobberEntity.class)
public abstract class PrismaticFishingRodFixer extends ProjectileEntity {
	public PrismaticFishingRodFixer(EntityType<? extends ProjectileEntity> entityType, World world) {
		super(entityType, world);
	}

	//fix removeIfInvalid function working only for vanilla rods
	@Inject(at = @At("HEAD"), method = "removeIfInvalid", cancellable = true)
	private void fixBobber(PlayerEntity player, CallbackInfoReturnable<Boolean> cir) {
		ItemStack itemStack = player.getMainHandStack();
		ItemStack itemStack2 = player.getOffHandStack();
		if (itemStack.getItem() instanceof FishingRodItem || itemStack2.getItem() instanceof FishingRodItem){
			cir.setReturnValue(false);
		}
	}
}