package net.lefishe.items;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.FishingRodItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class PrismaticFishingRodItem extends FishingRodItem {
	public PrismaticFishingRodItem(Settings settings) {
		super(settings);
		settings.maxDamage(300);
	}
	
	@Override
	public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
		tooltip.add(Text.translatable("lefishe.prismatic_rod"));
	}
	
	
	@Override
	public int getEnchantability() {
		return 1;
	}
}
