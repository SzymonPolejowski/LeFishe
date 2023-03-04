package lefishe.main.Potions;

import lefishe.main.items.FisheItems;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.BrewingRecipeRegistry;

public class FisheBrewingRecipeRegistry extends net.minecraft.recipe.BrewingRecipeRegistry {
	public static void registerFishePotions(){
		BrewingRecipeRegistry.registerPotionRecipe(Potions.AWKWARD, FisheItems.FISHE_PHOTTOCUDAFISH, FishePotions.ENLIGHTENING);
	}
}
