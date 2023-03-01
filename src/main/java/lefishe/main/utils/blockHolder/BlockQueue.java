package lefishe.main.utils.blockHolder;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.LinkedList;
import java.util.Queue;

public abstract class BlockQueue {
	protected Queue<BlockState> blocks;
	protected Queue<BlockPos> blocksPos;
	protected World world;

	public BlockQueue(World world) {
		this.blocks = new LinkedList<>();
		this.blocksPos = new LinkedList<>();
		this.world = world;
	}
}
