package icbm.classic.content.blast.thread;

import com.builtbroken.jlib.data.vector.IPos3D;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@Deprecated
public interface IThreadCallBack {

	float getResistance(World world, IPos3D blastCenter, BlockPos pos, Entity source, Block block);

}
