package icbm.zhapin.baozha.ex;

import icbm.core.ZhuYaoICBM;
import icbm.core.di.MICBM;
import icbm.zhapin.muoxing.daodan.MMWan;
import icbm.zhapin.zhapin.TZhaDan;
import icbm.zhapin.zhapin.ZhaPin;
import icbm.zhapin.zhapin.daodan.DaoDan;
import icbm.zhapin.zhapin.daodan.EDaoDan;
import mffs.api.card.ICoordLink;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.oredict.ShapedOreRecipe;
import universalelectricity.core.vector.Vector3;
import universalelectricity.prefab.RecipeHelper;

public class ExWan extends DaoDan
{
	public ExWan(String mingZi, int tier)
	{
		super(mingZi, tier);
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer entityPlayer, int par6, float par7, float par8, float par9)
	{
		if (entityPlayer.inventory.getCurrentItem() != null)
		{
			if (entityPlayer.inventory.getCurrentItem().getItem() instanceof ICoordLink)
			{
				Vector3 link = ((ICoordLink) entityPlayer.inventory.getCurrentItem().getItem()).getLink(entityPlayer.inventory.getCurrentItem());

				if (link != null)
				{
					TileEntity tileEntity = world.getBlockTileEntity(x, y, z);

					if (tileEntity instanceof TZhaDan)
					{
						link.writeToNBT(((TZhaDan) tileEntity).nbtData);
						return true;
					}
				}
			}
		}

		return false;
	}

	public boolean onInteract(EDaoDan missileObj, EntityPlayer entityPlayer)
	{
		if (entityPlayer.inventory.getCurrentItem() != null)
		{
			if (entityPlayer.inventory.getCurrentItem().getItem() instanceof ICoordLink)
			{
				Vector3 link = ((ICoordLink) entityPlayer.inventory.getCurrentItem().getItem()).getLink(entityPlayer.inventory.getCurrentItem());

				if (link != null)
				{
					link.writeToNBT(missileObj.nbtData);
					return true;
				}
			}
		}

		return false;
	}

	@Override
	public void init()
	{
		RecipeHelper.addRecipe(new ShapedOreRecipe(this.getItemStack(), new Object[] { "EPE", "ETE", "EPE", 'P', Item.enderPearl, 'E', Block.whiteStone, 'T', ZhaPin.la.getItemStack() }), this.getUnlocalizedName(), ZhuYaoICBM.CONFIGURATION, true);
	}

	@Override
	public void createExplosion(World world, double x, double y, double z, Entity entity)
	{
		Vector3 teleportTarget = null;

		if (entity instanceof EDaoDan)
		{
			teleportTarget = Vector3.readFromNBT(((EDaoDan) entity).nbtData);
		}

		new BzWan(world, entity, x, y, z, 30, teleportTarget).explode();
	}

	@Override
	public MICBM getMuoXing()
	{
		return new MMWan();
	}

}