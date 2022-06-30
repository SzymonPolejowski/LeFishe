package net.lefishe.main;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.minecraft.util.registry.*;
import net.lefishe.items.FisheItems;

public class leFisheMain implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("lefishe");
	

	@Override
	public void onInitialize() {
		FisheItems.registerItems();
	}
	
}
