package net.lefishe.main;

import net.fabricmc.api.ModInitializer;
import net.lefishe.items.FisheItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class leFisheMain implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("lefishe");
	

	@Override
	public void onInitialize() {
		FisheItems.registerItemsAndModelPredicates();
	}
	
}
