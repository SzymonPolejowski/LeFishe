package lefishe.main.effects;

import net.minecraft.block.LightBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class EnlightenedStatusEffect extends StatusEffect {
	
	public EnlightenedStatusEffect() {
		super(StatusEffectCategory.BENEFICIAL, 0xfaf58e);
	}
	@Override
	public void applyUpdateEffect(LivingEntity entity, int amplifier){
		entity.getWorld().setBlockState(entity.getBlockPos(), LightBlock.);
	}
	
}
//LightBlock.getStateFromRawId(amplifier == 1 ? 8 : 15)