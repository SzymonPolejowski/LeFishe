package lefishe.main;

import lefishe.main.Potions.FisheBrewingRecipeRegistry;
import lefishe.main.effects.FisheStatusEffects;
import net.fabricmc.api.ModInitializer;
import lefishe.main.items.FisheItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class leFisheMain implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("lefishe");
	
	

	@Override
	public void onInitialize() {
		LOGGER.info("Initialising mod.");
		FisheItems.registerItemsAndModelPredicates();
		FisheStatusEffects.initializeEffects();
		FisheBrewingRecipeRegistry.registerFishePotions();
	}
	
}
