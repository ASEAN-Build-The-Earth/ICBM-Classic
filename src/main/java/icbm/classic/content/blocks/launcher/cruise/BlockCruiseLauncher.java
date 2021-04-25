package icbm.classic.content.blocks.launcher.cruise;

import icbm.classic.ICBMClassic;
import icbm.classic.api.data.IWorldPosition;
import icbm.classic.api.items.IWorldPosItem;
import icbm.classic.content.items.ItemLaserDetonator;
import icbm.classic.content.items.ItemRemoteDetonator;
import icbm.classic.lib.LanguageUtility;
import icbm.classic.lib.transform.vector.Pos;
import icbm.classic.prefab.tile.BlockICBM;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

import javax.annotation.Nullable;

/**
 * Created by Dark(DarkGuardsman, Robert) on 1/15/2018.
 */
public class BlockCruiseLauncher extends BlockICBM {

	public BlockCruiseLauncher() {
		super("cruiseLauncher");
		this.blockHardness = 10f;
		this.blockResistance = 10f;
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

	@Override
	public boolean canPlaceBlockOnSide(World worldIn, BlockPos pos, Direction side) {
		return super.canPlaceBlockOnSide(worldIn, pos, side);
	}

	@Override
	public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
		return super.canPlaceBlockAt(worldIn, pos);
	}

	@Nullable
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileCruiseLauncher();
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, BlockState state, PlayerEntity player, Hand hand, Direction facing, float hitX, float hitY, float hitZ) {
		if (!world.isRemote) {
			TileEntity tileEntity = world.getTileEntity(pos);
			if (tileEntity instanceof TileCruiseLauncher) {
				TileCruiseLauncher launcher = (TileCruiseLauncher) tileEntity;
				ItemStack stack = player.getHeldItem(hand);
				if (stack.getItem() == Items.REDSTONE) {
					if (!launcher.launch()) //canLaunch is called in launch and launch returns false if cannot launch
					{
						player.sendMessage(new TextComponentString(LanguageUtility.getLocal("chat.launcher.failedToFire")));
						String translation = LanguageUtility.getLocal("chat.launcher.status");
						translation = translation.replace("%s", launcher.getStatus());
						player.sendMessage(new TextComponentString(translation));
					}
				} else if (stack.getItem() instanceof ItemRemoteDetonator) {
					((ItemRemoteDetonator) stack.getItem()).setBroadCastHz(stack, launcher.getFrequency());
					player.sendMessage(new TextComponentString(LanguageUtility.getLocal("chat.launcher.toolFrequencySet").replace("%s", "" + launcher.getFrequency())));
				} else if (stack.getItem() instanceof ItemLaserDetonator) {
					((ItemLaserDetonator) stack.getItem()).setBroadCastHz(stack, launcher.getFrequency());
					player.sendMessage(new TextComponentString(LanguageUtility.getLocal("chat.launcher.toolFrequencySet").replace("%s", "" + launcher.getFrequency())));
				} else if (stack.getItem() instanceof IWorldPosItem) {
					IWorldPosition location = ((IWorldPosItem) stack.getItem()).getLocation(stack);
					if (location != null) {
						if (location.world() == world) {
							launcher.setTarget(new Pos(location.x(), location.y(), location.z()));
							player.sendMessage(new TextComponentString(LanguageUtility.getLocal("chat.launcher.toolTargetSet")));
						} else {
							player.sendMessage(new TextComponentString(LanguageUtility.getLocal("chat.launcher.toolWorldNotMatch")));
						}
					} else {
						player.sendMessage(new TextComponentString(LanguageUtility.getLocal("chat.launcher.noTargetInTool")));
					}
				} else {
					player.openGui(ICBMClassic.INSTANCE, 0, world, pos.getX(), pos.getY(), pos.getZ());
				}
			}
		}
		return true;
	}

	@Override
	public void neighborChanged(BlockState state, World world, BlockPos pos, Block block, BlockPos fromPos) {
		if (!world.isRemote) {
			TileEntity tileEntity = world.getTileEntity(pos);

			if (tileEntity instanceof TileCruiseLauncher && world.isBlockPowered(pos))
				((TileCruiseLauncher) tileEntity).launch(); //canLaunch gets called by launch
		}
	}

}
