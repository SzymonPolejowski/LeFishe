package lefishe.main.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public abstract class FisheItems {
	//CREATE ITEM IDENTIFIERS
	public static final Item FISHE_LEFISHEAUCHOCOLAT = new LeFisheAuChocolatItem(new FabricItemSettings().
			food(new FoodComponent.Builder().hunger(6).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 120), 1f).build()));
	public static final Item FISHE_PICKLEFISH = new PickleFishItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.2f).build()));
	public static final Item FISHE_PRISMATICROD = new PrismaticFishingRodItem(new FabricItemSettings().maxCount(1));
	public static final Item FISHE_PHOTTOCUDAFISH = new PhottocudaItem(new FabricItemSettings());


	public static void registerItemsAndModelPredicates(){
		//REGISTER ITEMS
		Registry.register(Registries.ITEM, new Identifier("lefishe", "lefishe_au_chocolat"), FISHE_LEFISHEAUCHOCOLAT);
		Registry.register(Registries.ITEM, new Identifier("lefishe", "pickle_fish"), FISHE_PICKLEFISH);
		Registry.register(Registries.ITEM, new Identifier("lefishe", "prismatic_rod"), FISHE_PRISMATICROD);
		Registry.register(Registries.ITEM, new Identifier("lefishe", "phottocuda_fish"), FISHE_PHOTTOCUDAFISH);

		//ADD TO GROUP
		ItemGroupEvents.modifyEntriesEvent(FisheGroup.FISHE_GROUP).register(entries -> entries.add(FISHE_LEFISHEAUCHOCOLAT));
		ItemGroupEvents.modifyEntriesEvent(FisheGroup.FISHE_GROUP).register(entries -> entries.add(FISHE_PICKLEFISH));
		ItemGroupEvents.modifyEntriesEvent(FisheGroup.FISHE_GROUP).register(entries -> entries.add(FISHE_PRISMATICROD));
		ItemGroupEvents.modifyEntriesEvent(FisheGroup.FISHE_GROUP).register(entries -> entries.add(FISHE_PHOTTOCUDAFISH));


		//REGISTER MODEL PREDICATES
		ModelPredicateProviderRegistry.register(FISHE_PRISMATICROD, new Identifier("cast"), (stack, world, entity, seed) -> {
			if (entity == null) {
				return 0.0f;
			}
			return (entity.getMainHandStack() == stack || entity.getOffHandStack() == stack) && entity instanceof PlayerEntity && ((PlayerEntity)entity).fishHook != null ? 1.0f : 0.0f;
		});
	}
}
