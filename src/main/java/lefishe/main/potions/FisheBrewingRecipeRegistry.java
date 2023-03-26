package lefishe.main.potions;

import lefishe.main.items.FisheItems;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.BrewingRecipeRegistry;

public class FisheBrewingRecipeRegistry extends net.minecraft.recipe.BrewingRecipeRegistry {
	public static void registerFishePotions(){
		BrewingRecipeRegistry.registerPotionRecipe(Potions.AWKWARD, FisheItems.FISHE_PHOTTOCUDAFISH, FishePotions.ENLIGHTENING);
		BrewingRecipeRegistry.registerPotionRecipe(FishePotions.ENLIGHTENING, Items.GLOWSTONE_DUST, FishePotions.STRONG_ENLIGHTENING);
		BrewingRecipeRegistry.registerPotionRecipe(FishePotions.ENLIGHTENING, Items.REDSTONE, FishePotions.LONG_ENLIGHTENING);
	}
}
