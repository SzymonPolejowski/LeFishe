package lefishe.main.effects;

import net.minecraft.block.*;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;

import java.util.PriorityQueue;
import java.util.Queue;

public class EnlightenedStatusEffect extends StatusEffect {
	private Queue<BlockState> lightBlocks = new PriorityQueue();
	public EnlightenedStatusEffect() {
		super(StatusEffectCategory.BENEFICIAL, 0xfaf58e);
	}

	@Override
	public boolean canApplyUpdateEffect(int duration, int amplifier) {
		//update every 3 ticks
		if (duration % 3 == 0){
			return true;
		} else {
			return false;
		}
	}
	@Override
	public void applyUpdateEffect(LivingEntity entity, int amplifier){
		//enlightened entity must be a player
		if (!(entity instanceof PlayerEntity)){
			return;
		}
		//enlightened should not replace other blocks e.g. in spectator mode
		if (entity.getWorld().getBlockState(entity.getBlockPos()) != Blocks.AIR.getDefaultState()){
			return;
		}
		//place lightning block
		entity.getWorld().setBlockState(entity.getBlockPos(), Blocks.LIGHT.getDefaultState());
		//delete old light blocks
		lightBlocks.add(entity.getWorld().getBlockState(entity.getBlockPos()));

	}

}