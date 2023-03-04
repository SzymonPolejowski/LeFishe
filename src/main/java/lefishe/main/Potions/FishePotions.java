package lefishe.main.Potions;

import net.minecraft.entity.effect.StatusEffectInstance;
import lefishe.main.effects.FisheStatusEffects;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;


public class FishePotions extends Potions{
	public static final Potion ENLIGHTENING = Potions.register("enlightening", new Potion(new StatusEffectInstance(FisheStatusEffects.ENLIGHTENED_STATUS_EFFECT, 3600, 0)));
	public static final Potion LONG_ENLIGHTENING = Potions.register("enlightening_long", new Potion(new StatusEffectInstance(FisheStatusEffects.ENLIGHTENED_STATUS_EFFECT, 7200, 0)));
	public static final Potion STRONG_ENLIGHTENING = Potions.register("enlightening_strong", new Potion(new StatusEffectInstance(FisheStatusEffects.ENLIGHTENED_STATUS_EFFECT, 3600, 1)));
}
