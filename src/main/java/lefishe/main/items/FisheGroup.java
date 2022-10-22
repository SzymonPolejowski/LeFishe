package lefishe.main.items;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public abstract class FisheGroup {
	public static final ItemGroup FISHE_GROUP = FabricItemGroupBuilder
			.create(new Identifier("lefishe", "general"))
			.icon(() -> new ItemStack(FisheItems.FISHE_CHOCO))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(FisheItems.FISHE_CHOCO));
				stacks.add(new ItemStack(FisheItems.FISHE_PICKLE));
				stacks.add(new ItemStack(FisheItems.FISHE_PRISMATICROD));
				stacks.add(new ItemStack(FisheItems.FISHE_PHOTTOCUDA));
			})
			.build();
}
