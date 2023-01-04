package lefishe.main.items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public abstract class FisheGroup {

	public static final ItemGroup FISHE_GROUP = FabricItemGroup.builder(new Identifier("lefishe", "general"))
			.displayName(Text.literal("LeFishe"))
			.icon(() -> new ItemStack(FisheItems.FISHE_CHOCO))
			.entries((enabledFeatures, entries, operatorEnabled) -> {
				entries.add(new ItemStack(FisheItems.FISHE_CHOCO));
				entries.add(new ItemStack(FisheItems.FISHE_PICKLE));
				entries.add(new ItemStack(FisheItems.FISHE_PRISMATICROD));
				entries.add(new ItemStack(FisheItems.FISHE_PHOTTOCUDA));
			})
			.build();
}
