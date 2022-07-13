package net.lefishe.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public abstract class FisheItems {
	public static final Item FISHE_CHOCO = new LeFisheAuChocolatItem(new FabricItemSettings().group(FisheGroup.FISHE_GROUP).
			food(new FoodComponent.Builder().hunger(6).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 120), 1f).build()));
	public static final Item FISHE_PICKLE = new PickleFishItem(new FabricItemSettings().group(FisheGroup.FISHE_GROUP).food(new FoodComponent.Builder().hunger(8).saturationModifier(0.2f).build()));

	public static void registerItems(){
		Registry.register(Registry.ITEM, new Identifier("lefishe", "lefishe_au_chocolat"), FISHE_CHOCO);
		Registry.register(Registry.ITEM, new Identifier("lefishe", "pickle_fish"), FISHE_PICKLE);

	}
}
