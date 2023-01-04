package lefishe.main.effects;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;

public class FisheStatusEffects {
	public static final StatusEffect ENLIGHTENED_STATUS_EFFECT = new EnlightenedStatusEffect();
	
	public static void initializeEffects(){
		Registry.register(Registries.STATUS_EFFECT, new Identifier("lefishe", "enlightened"), ENLIGHTENED_STATUS_EFFECT);
	}
}