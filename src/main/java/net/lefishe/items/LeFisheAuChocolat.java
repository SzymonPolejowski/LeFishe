package net.lefishe.items;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class LeFisheAuChocolat extends Item {
	public LeFisheAuChocolat(Settings settings) {
		super(settings);
	}
	
	@Override
	public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context){
		tooltip.add(Text.translatable("lefishe.fishechoco").formatted(Formatting.ITALIC, Formatting.GRAY));
	}
	
	
}
