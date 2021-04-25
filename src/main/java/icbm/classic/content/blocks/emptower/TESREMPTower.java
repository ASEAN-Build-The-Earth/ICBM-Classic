package icbm.classic.content.blocks.emptower;

import icbm.classic.ICBMConstants;
import icbm.classic.client.models.ModelEmpTower;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

/**
 * Created by Dark(DarkGuardsman, Robert) on 1/10/2017.
 */
public class TESREMPTower extends TileEntitySpecialRenderer<TileEMPTower> {

	public static final ResourceLocation TEXTURE_FILE = new ResourceLocation(ICBMConstants.DOMAIN, "textures/models/" + "emp_tower.png");
	public static final ModelEmpTower MODEL = new ModelEmpTower();

	@Override
	@OnlyIn(Dist.CLIENT)
	public void render(TileEMPTower tower, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
		GlStateManager.pushMatrix();
		GlStateManager.translate(x + 0.5F, y + 1.5F, z + 0.5F);
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(TEXTURE_FILE);
		GlStateManager.rotate(180F, 0.0F, 0.0F, 1.0F);
		MODEL.render(tower.rotation, 0.0625F);
		GlStateManager.popMatrix();
	}

}
