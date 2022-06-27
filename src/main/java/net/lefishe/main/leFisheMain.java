package net.lefishe.main;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.lefishe.main.items.LeFisheAuChocolat;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.minecraft.util.registry.*;

public class leFisheMain implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("lefishe");
	public static final Item FISHE_CHOCO = new LeFisheAuChocolat(new FabricItemSettings().group(ItemGroup.MISC).
			food(new FoodComponent.Builder().hunger(6).saturationModifier(0.6f).build()));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("lefishe", "lefishe_au_chocolate"), FISHE_CHOCO);
	}
}
