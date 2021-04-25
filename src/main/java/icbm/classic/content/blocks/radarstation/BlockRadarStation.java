package icbm.classic.content.blocks.radarstation;

import icbm.classic.ICBMClassic;
import icbm.classic.prefab.tile.BlockICBM;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.init.Items;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;

/**
 * Created by Dark(DarkGuardsman, Robert) on 1/16/2018.
 */
public class BlockRadarStation extends BlockICBM {

	public static final PropertyBool REDSTONE_PROPERTY = PropertyBool.create("redstone");

	public BlockRadarStation() {
		super("radarStation");
	}

	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, ROTATION_PROP, REDSTONE_PROPERTY);
	}

	@Override
	public boolean canConnectRedstone(BlockState state, IBlockReader world, BlockPos pos, @Nullable Direction side) {
		return true;
	}

	@Override
	public boolean canProvidePower(BlockState state) {
		return true;
	}

	@Override
	public int getWeakPower(BlockState blockState, IBlockReader blockAccess, BlockPos pos, Direction side) {
		return getStrongPower(blockState, blockAccess, pos, side);
	}

	@Override
	public int getStrongPower(BlockState blockState, IBlockReader blockAccess, BlockPos pos, Direction side) {
		TileEntity tile = blockAccess.getTileEntity(pos);
		if (tile instanceof TileRadarStation) {
			return ((TileRadarStation) tile).getStrongRedstonePower(side);
		}
		return 0;
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, BlockState state, PlayerEntity player, Hand hand, Direction facing, float hitX, float hitY, float hitZ) {
		if (!world.isRemote) {
			//if (WrenchUtility.isUsableWrench(player, player.getHeldItem(hand), pos.getX(), pos.getY(), pos.getZ()))
			if (player.getHeldItem(hand).getItem() == Items.REDSTONE) {
				final TileEntity tile = world.getTileEntity(pos);
				if (tile instanceof TileRadarStation) {
					((TileRadarStation) tile).emitAll = !((TileRadarStation) tile).emitAll;
					player.sendMessage(new TextComponentTranslation(((TileRadarStation) tile).emitAll ? "message.radar.redstone.on" : "message.radar.redstone.off"));
				} else {
					player.sendMessage(new TextComponentString("\u00a7cUnexpected error: Couldn't access radar station tile"));
				}
			} else {
				player.openGui(ICBMClassic.INSTANCE, 0, world, pos.getX(), pos.getY(), pos.getZ());
			}
		}
		return true;
	}

	@Override
	public boolean isOpaqueCube(BlockState state) {
		return false;
	}

	@Override
	public boolean isFullCube(BlockState state) {
		return false;
	}

	@Override
	public EnumBlockRenderType getRenderType(BlockState state) {
		return EnumBlockRenderType.ENTITYBLOCK_ANIMATED;
	}

	@Nullable
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileRadarStation();
	}

}
