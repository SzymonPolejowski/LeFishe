package lefishe.main.Potions;

import lefishe.main.items.FisheItems;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.item.ItemColorProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.BrewingRecipeRegistry;

public class FisheBrewingRecipeRegistry extends net.minecraft.recipe.BrewingRecipeRegistry {
	public static void registerFishePotions(){
		BrewingRecipeRegistry.registerPotionRecipe(Potions.AWKWARD, FisheItems.FISHE_PHOTTOCUDAFISH, FishePotions.ENLIGHTENING);
		BrewingRecipeRegistry.registerPotionRecipe(FishePotions.ENLIGHTENING, Items.GLOWSTONE_DUST, FishePotions.STRONG_ENLIGHTENING);
		BrewingRecipeRegistry.registerPotionRecipe(FishePotions.ENLIGHTENING, Items.REDSTONE, FishePotions.LONG_ENLIGHTENING);

		ItemColorProvider temp = new ItemColorProvider() {
			@Override
			public int getColor(ItemStack stack, int tintIndex) {
				return 0x000000;
			}
		};
		ColorProviderRegistry.ITEM.register(temp, FishePotions.ENLIGHTENING);
	}
}
