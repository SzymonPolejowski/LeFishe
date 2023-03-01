package lefishe.main.utils.blockHolder;

import lefishe.main.leFisheMain;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

//This class manages light blocks placed by enlightened status effect: hold them, delete them on demand
public class LightBlockQueue extends BlockQueue {
	public LightBlockQueue(World world) {
		super(world);
	}
	public void addBlock(BlockState block, BlockPos pos){
		blocks.add(block);
		blocksPos.add(pos);
	}

	public void updateLightBlocks(){
		if (blocks.size() == 0){
			leFisheMain.LOGGER.error("Cannot update light blocks! There are not any!");
			return;
		}
		if (blocks.size() >= 3){
			Block.replace(blocks.poll(), Blocks.AIR.getDefaultState(), world, blocksPos.poll(), 0);
		}
	}

	public void deleteAll(){
		while (!blocks.isEmpty()){
			Block.replace(blocks.poll(), Blocks.AIR.getDefaultState(), world, blocksPos.poll(), 0);
		}
	}
}
