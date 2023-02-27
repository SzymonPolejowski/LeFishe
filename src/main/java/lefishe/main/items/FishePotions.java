package lefishe.main.items;

import net.minecraft.entity.effect.StatusEffectInstance;
import lefishe.main.effects.FisheStatusEffects;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;

public class FishePotions{
	public static final Potion ENLIGHTENING = Potions.register("enlightening", new Potion(new StatusEffectInstance(FisheStatusEffects.ENLIGHTENED_STATUS_EFFECT, 3600)));
	public static final Potion LONG_ENLIGHTENING = Potions.register("enlightening", new Potion(new StatusEffectInstance(FisheStatusEffects.ENLIGHTENED_STATUS_EFFECT, 7200)));
	public static final Potion STRONG_ENLIGHTENING = Potions.register("enlightening", new Potion(new StatusEffectInstance(FisheStatusEffects.ENLIGHTENED_STATUS_EFFECT, 3600, 2)));
}
