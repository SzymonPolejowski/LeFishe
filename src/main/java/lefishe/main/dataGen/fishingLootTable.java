package lefishe.main.dataGen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContextType;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;

public class fishingLootTable extends SimpleFabricLootTableProvider {
	public fishingLootTable(FabricDataOutput output, LootContextType lootContextType) {
		super(output, lootContextType);
	}

	@Override
	public void accept(BiConsumer<Identifier, LootTable.Builder> identifierBuilderBiConsumer) {

	}
}
