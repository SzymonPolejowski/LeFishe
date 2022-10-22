package net.lefishe.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public abstract class FisheItems {
	//MAKE ITEM IDENTIFIERS
	public static final Item FISHE_CHOCO = new LeFisheAuChocolatItem(new FabricItemSettings().group(FisheGroup.FISHE_GROUP).
			food(new FoodComponent.Builder().hunger(6).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 120), 1f).build()));
	public static final Item FISHE_PICKLE = new PickleFishItem(new FabricItemSettings().group(FisheGroup.FISHE_GROUP).food(new FoodComponent.Builder().hunger(8).saturationModifier(0.2f).build()));
	public static final Item FISHE_PRISMATICROD = new PrismaticFishingRodItem(new FabricItemSettings().group(FisheGroup.FISHE_GROUP).maxCount(1));
	public static final Item FISHE_PHOTTOCUDA = new PhottocudaItem(new FabricItemSettings().group(FisheGroup.FISHE_GROUP));

	public static void registerItemsAndModelPredicates(){
		//REGISTER ITEMS
		Registry.register(Registry.ITEM, new Identifier("lefishe", "lefishe_au_chocolat"), FISHE_CHOCO);
		Registry.register(Registry.ITEM, new Identifier("lefishe", "pickle_fish"), FISHE_PICKLE);
		Registry.register(Registry.ITEM, new Identifier("lefishe", "prismatic_rod"), FISHE_PRISMATICROD);
		Registry.register(Registry.ITEM, new Identifier("lefishe", "phottocuda_fish"), FISHE_PHOTTOCUDA);
		
		//REGISTER MODEL PREDICATES
		ModelPredicateProviderRegistry.register(FISHE_PRISMATICROD, new Identifier("cast"), (stack, world, entity, seed) -> {
			if (entity == null) {
				return 0.0f;
			}
			return (entity.getMainHandStack() == stack || entity.getOffHandStack() == stack) && entity instanceof PlayerEntity && ((PlayerEntity)entity).fishHook != null ? 1.0f : 0.0f;
		});
	}
}
