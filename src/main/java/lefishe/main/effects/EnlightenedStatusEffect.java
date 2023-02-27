package lefishe.main.effects;

import lefishe.main.tools.blockHolder.LightBlockQueue;
import net.minecraft.block.*;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;

//TODO: handle amplifiers

public class EnlightenedStatusEffect extends StatusEffect {
	private LightBlockQueue lightBlocks;
	public EnlightenedStatusEffect() {
		super(StatusEffectCategory.BENEFICIAL, 0xfaf58e);
	}

	@Override
	public boolean canApplyUpdateEffect(int duration, int amplifier) {
		//if effect is about to end, delete all light blocks
		if (duration < 3){
			lightBlocks.deleteAll();
			return false;
		}
		//update every 3 ticks
		return duration % 40 == 0;
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
		//make sure if lightBlocks exist
		if (lightBlocks == null){
			lightBlocks = new LightBlockQueue(entity.getWorld());
		}
		//add lightBlock to queue
		lightBlocks.addBlock(entity.getBlockStateAtPos(), entity.getBlockPos());
		//delete old lightBlock
		lightBlocks.updateLightBlocks();
	}
}