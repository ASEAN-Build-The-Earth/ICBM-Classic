package icbm.classic.client.models.mobs;

import icbm.classic.content.entity.mobs.EntityXmasSkeletonBoss;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelSkeleton - Mojang for skeleton and M1W3st for hat Created using Tabula 7.0.0
 */
public class ModelSkeletonXmas extends ModelBase {

	public ModelRenderer bipedRightArm;
	public ModelRenderer bipedRightLeg;
	public ModelRenderer bipedHead;
	public ModelRenderer bipedBody;
	public ModelRenderer bipedLeftArm;
	public ModelRenderer bipedLeftLeg;

	public ModelRenderer MagwelTopPiece;
	public ModelRenderer RightArmwichisholdingtheweaponbythetrigger;
	public ModelRenderer shape8;
	public ModelRenderer shape9;
	public ModelRenderer shape10;
	public ModelRenderer shape11;
	public ModelRenderer shape12;
	public ModelRenderer shape13;
	public ModelRenderer shape14;
	public ModelRenderer shape15;
	public ModelRenderer Body;
	public ModelRenderer TopTriggerGuard;
	public ModelRenderer BackSight;
	public ModelRenderer Stock;
	public ModelRenderer CharchingHandle;
	public ModelRenderer Grip;
	public ModelRenderer FrontMagwel;
	public ModelRenderer MagwellTriggerGuard;
	public ModelRenderer Backsightsupport;
	public ModelRenderer Stock_1;
	public ModelRenderer Stock_2;
	public ModelRenderer Stock_3;
	public ModelRenderer Stock_4;
	public ModelRenderer Stock_5;
	public ModelRenderer Stock_6;
	public ModelRenderer Stock_7;
	public ModelRenderer Stock_8;
	public ModelRenderer Stock_9;
	public ModelRenderer Stock_10;
	public ModelRenderer Stock_11;
	public ModelRenderer Stock_12;
	public ModelRenderer Stock_13;
	public ModelRenderer shape33;
	public ModelRenderer Stock_14;
	public ModelRenderer Stock_15;
	public ModelRenderer Stock_16;
	public ModelRenderer Stock_17;
	public ModelRenderer Stock_18;
	public ModelRenderer Stock_19;
	public ModelRenderer Stock_20;
	public ModelRenderer Stock_21;
	public ModelRenderer Stock_22;
	public ModelRenderer Stock_23;
	public ModelRenderer Stock_24;
	public ModelRenderer Stock_25;
	public ModelRenderer Stock_26;
	public ModelRenderer shape33_1;
	public ModelRenderer Stock_27;
	public ModelRenderer Grip_1;
	public ModelRenderer Grip_2;
	public ModelRenderer Grip_3;
	public ModelRenderer Barrel;
	public ModelRenderer Handguard;
	public ModelRenderer FrontSight;
	public ModelRenderer TriggerGuard;
	public ModelRenderer TriggerBack;
	public ModelRenderer GripAngle;
	public ModelRenderer Mag;
	public ModelRenderer DrumMag;
	public ModelRenderer DrumMag_1;
	public ModelRenderer DrumMag_2;
	public ModelRenderer DrumMag_3;
	public ModelRenderer DrumMag_4;
	public ModelRenderer DrumMag_5;
	public ModelRenderer DrumMag_6;
	public ModelRenderer DrumMag_7;
	public ModelRenderer DrumMag_8;
	public ModelRenderer DrumMag_9;
	public ModelRenderer DrumMag_10;
	public ModelRenderer DrumMag_11;
	public ModelRenderer DrumMag_12;

	public ModelSkeletonXmas() {
		this.textureWidth = 64;
		this.textureHeight = 100;
		this.shape15 = new ModelRenderer(this, 13, 58);
		this.shape15.setRotationPoint(0.7F, 0.6F, 0.0F);
		this.shape15.addBox(0.0F, -1.0F, -0.5F, 2, 2, 2, 0.0F);
		this.setRotateAngle(shape15, 0.0F, 0.0F, 0.5009094953223726F);
		this.Stock_12 = new ModelRenderer(this, 0, 90);
		this.Stock_12.setRotationPoint(0.0F, 1.0F, 1.0F);
		this.Stock_12.addBox(0.0F, 0.0F, -2.0F, 1, 6, 2, 0.0F);
		this.setRotateAngle(Stock_12, -1.3203415791337103F, 0.0F, 0.0F);
		this.Stock_15 = new ModelRenderer(this, 0, 90);
		this.Stock_15.setRotationPoint(0.0F, 1.0F, 0.0F);
		this.Stock_15.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		this.setRotateAngle(Stock_15, 0.7853981633974483F, 0.0F, 0.0F);
		this.DrumMag_9 = new ModelRenderer(this, 21, 80);
		this.DrumMag_9.setRotationPoint(3.0F, 0.0F, 0.0F);
		this.DrumMag_9.addBox(0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F);
		this.setRotateAngle(DrumMag_9, 0.0F, 0.0F, 0.7853981633974483F);
		this.DrumMag_7 = new ModelRenderer(this, 21, 80);
		this.DrumMag_7.setRotationPoint(3.0F, 0.0F, 0.0F);
		this.DrumMag_7.addBox(0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F);
		this.setRotateAngle(DrumMag_7, 0.0F, 0.0F, 0.7853981633974483F);
		this.shape33_1 = new ModelRenderer(this, 0, 90);
		this.shape33_1.setRotationPoint(0.0F, 0.0F, 1.33F);
		this.shape33_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		this.Stock_16 = new ModelRenderer(this, 0, 90);
		this.Stock_16.setRotationPoint(0.0F, 1.0F, 0.0F);
		this.Stock_16.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
		this.setRotateAngle(Stock_16, 0.6632251157578453F, 0.0F, 0.0F);
		this.Stock_10 = new ModelRenderer(this, 0, 90);
		this.Stock_10.setRotationPoint(0.0F, 0.5F, 0.0F);
		this.Stock_10.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		this.setRotateAngle(Stock_10, 0.40980330836826856F, 0.0F, 0.0F);
		this.Stock_24 = new ModelRenderer(this, 0, 90);
		this.Stock_24.setRotationPoint(0.0F, 0.6F, 0.0F);
		this.Stock_24.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		this.setRotateAngle(Stock_24, 0.36425021489121656F, 0.0F, 0.0F);
		this.Body = new ModelRenderer(this, 0, 68);
		this.Body.setRotationPoint(0.0F, -1.8F, -5.0F);
		this.Body.addBox(0.0F, 0.0F, 0.0F, 2, 2, 9, 0.0F);
		this.TriggerGuard = new ModelRenderer(this, 0, 68);
		this.TriggerGuard.setRotationPoint(0.0F, 2.0F, 0.0F);
		this.TriggerGuard.addBox(0.0F, 0.0F, 0.0F, 1, 0, 2, 0.0F);
		this.Stock_21 = new ModelRenderer(this, 0, 90);
		this.Stock_21.setRotationPoint(0.0F, 2.5F, -0.1F);
		this.Stock_21.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		this.setRotateAngle(Stock_21, 0.27314402793711257F, 0.0F, 0.0F);
		this.shape12 = new ModelRenderer(this, 0, 42);
		this.shape12.setRotationPoint(4.0F, 0.0F, 0.0F);
		this.shape12.addBox(0.0F, 0.0F, -2.0F, 3, 2, 4, 0.0F);
		this.setRotateAngle(shape12, 0.0F, 0.0F, 0.22759093446006054F);
		this.FrontMagwel = new ModelRenderer(this, 0, 68);
		this.FrontMagwel.setRotationPoint(0.0F, 0.0F, -4.0F);
		this.FrontMagwel.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
		this.DrumMag_2 = new ModelRenderer(this, 21, 80);
		this.DrumMag_2.setRotationPoint(2.0F, 0.0F, 0.0F);
		this.DrumMag_2.addBox(0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F);
		this.setRotateAngle(DrumMag_2, 0.0F, 0.0F, 0.7853981633974483F);
		this.Stock_18 = new ModelRenderer(this, 0, 90);
		this.Stock_18.setRotationPoint(0.0F, 0.0F, 0.49F);
		this.Stock_18.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
		this.DrumMag_4 = new ModelRenderer(this, 21, 80);
		this.DrumMag_4.setRotationPoint(3.0F, 0.0F, 0.0F);
		this.DrumMag_4.addBox(0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F);
		this.setRotateAngle(DrumMag_4, 0.0F, 0.0F, 0.7853981633974483F);
		this.DrumMag_11 = new ModelRenderer(this, 21, 80);
		this.DrumMag_11.setRotationPoint(3.5F, 3.7F, 0.0F);
		this.DrumMag_11.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
		this.MagwellTriggerGuard = new ModelRenderer(this, 0, 68);
		this.MagwellTriggerGuard.setRotationPoint(0.5F, 2.0F, -0.01F);
		this.MagwellTriggerGuard.addBox(0.0F, 0.0F, 0.0F, 1, 2, 0, 0.0F);
		this.shape33 = new ModelRenderer(this, 0, 90);
		this.shape33.setRotationPoint(0.0F, 0.0F, 1.33F);
		this.shape33.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		this.Grip_3 = new ModelRenderer(this, 0, 90);
		this.Grip_3.setRotationPoint(-0.4F, 0.0F, 0.0F);
		this.Grip_3.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
		this.DrumMag_6 = new ModelRenderer(this, 21, 80);
		this.DrumMag_6.setRotationPoint(3.0F, 0.0F, 0.0F);
		this.DrumMag_6.addBox(0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F);
		this.setRotateAngle(DrumMag_6, 0.0F, 0.0F, 0.7853981633974483F);
		this.Grip_2 = new ModelRenderer(this, 0, 90);
		this.Grip_2.setRotationPoint(0.0F, 2.0F, 0.0F);
		this.Grip_2.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
		this.setRotateAngle(Grip_2, 0.27314402793711257F, 0.0F, 0.0F);
		this.Stock_2 = new ModelRenderer(this, 0, 90);
		this.Stock_2.setRotationPoint(0.5F, 0.0F, 0.0F);
		this.Stock_2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
		this.Stock_13 = new ModelRenderer(this, 0, 91);
		this.Stock_13.setRotationPoint(0.0F, 6.0F, -2.0F);
		this.Stock_13.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(Stock_13, 2.86844862565268F, 0.0F, 0.0F);
		this.Stock_5 = new ModelRenderer(this, 0, 90);
		this.Stock_5.setRotationPoint(0.0F, 0.0F, 0.49F);
		this.Stock_5.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
		this.RightArmwichisholdingtheweaponbythetrigger = new ModelRenderer(this, 40, 22);
		this.RightArmwichisholdingtheweaponbythetrigger.setRotationPoint(0.1F, 3.9F, 0.1F);
		this.RightArmwichisholdingtheweaponbythetrigger.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
		this.setRotateAngle(RightArmwichisholdingtheweaponbythetrigger, -1.6046557142835864F, 0.2033308578573394F, 1.9662879352968115F);
		this.Stock_9 = new ModelRenderer(this, 0, 90);
		this.Stock_9.setRotationPoint(0.0F, 1.0F, 0.0F);
		this.Stock_9.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		this.setRotateAngle(Stock_9, 0.4553564018453205F, 0.0F, 0.0F);
		this.bipedHead = new ModelRenderer(this, 0, 0);
		this.bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
		this.shape14 = new ModelRenderer(this, 0, 44);
		this.shape14.setRotationPoint(2.0F, 0.5F, -0.5F);
		this.shape14.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		this.DrumMag_5 = new ModelRenderer(this, 21, 80);
		this.DrumMag_5.setRotationPoint(-0.8F, 1.2F, 0.0F);
		this.DrumMag_5.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
		this.Stock_17 = new ModelRenderer(this, 0, 90);
		this.Stock_17.setRotationPoint(0.0F, 0.3F, 0.0F);
		this.Stock_17.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
		this.setRotateAngle(Stock_17, -0.18203784098300857F, 0.0F, 0.0F);
		this.Stock_11 = new ModelRenderer(this, 0, 90);
		this.Stock_11.setRotationPoint(0.0F, 0.6F, 0.0F);
		this.Stock_11.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		this.setRotateAngle(Stock_11, 0.36425021489121656F, 0.0F, 0.0F);
		this.bipedRightArm = new ModelRenderer(this, 40, 16);
		this.bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.bipedRightArm.addBox(-1.0F, -2.0F, -1.0F, 2, 6, 2, 0.0F);
		this.setRotateAngle(bipedRightArm, -0.091106186954104F, 0.045553093477052F, 0.4553564018453205F);
		this.Stock_6 = new ModelRenderer(this, 0, 89);
		this.Stock_6.setRotationPoint(0.0F, 1.3F, 0.0F);
		this.Stock_6.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
		this.setRotateAngle(Stock_6, -0.18203784098300857F, 0.0F, 0.0F);
		this.Stock_8 = new ModelRenderer(this, 0, 90);
		this.Stock_8.setRotationPoint(0.0F, 2.5F, -0.1F);
		this.Stock_8.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		this.setRotateAngle(Stock_8, 0.27314402793711257F, 0.0F, 0.0F);
		this.Stock_20 = new ModelRenderer(this, 0, 90);
		this.Stock_20.setRotationPoint(0.0F, 5.4F, 0.5F);
		this.Stock_20.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		this.shape8 = new ModelRenderer(this, 0, 51);
		this.shape8.setRotationPoint(0.0F, -9.0F, 0.0F);
		this.shape8.addBox(-5.0F, 0.0F, -5.0F, 10, 3, 10, 0.0F);
		this.bipedRightLeg = new ModelRenderer(this, 0, 16);
		this.bipedRightLeg.setRotationPoint(-2.0F, 12.0F, 0.1F);
		this.bipedRightLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 12, 2, 0.0F);
		this.Stock_3 = new ModelRenderer(this, 0, 90);
		this.Stock_3.setRotationPoint(0.0F, 1.0F, 0.0F);
		this.Stock_3.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
		this.setRotateAngle(Stock_3, 0.6632251157578453F, 0.0F, 0.0F);
		this.DrumMag_10 = new ModelRenderer(this, 21, 80);
		this.DrumMag_10.setRotationPoint(-0.1F, 3.9F, 0.0F);
		this.DrumMag_10.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
		this.DrumMag = new ModelRenderer(this, 24, 80);
		this.DrumMag.setRotationPoint(-6.0F, 2.4F, -9.1F);
		this.DrumMag.addBox(0.0F, -0.4F, 0.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(DrumMag, 0.0F, -0.06771877497737998F, 0.0F);
		this.Stock_25 = new ModelRenderer(this, 0, 90);
		this.Stock_25.setRotationPoint(0.0F, 1.0F, 1.0F);
		this.Stock_25.addBox(0.0F, 0.0F, -2.0F, 1, 6, 2, 0.0F);
		this.setRotateAngle(Stock_25, -1.3203415791337103F, 0.0F, 0.0F);
		this.bipedBody = new ModelRenderer(this, 16, 16);
		this.bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedBody.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
		this.setRotateAngle(bipedBody, 0.0F, 0.22759093446006054F, 0.0F);
		this.DrumMag_1 = new ModelRenderer(this, 21, 80);
		this.DrumMag_1.setRotationPoint(0.0F, -0.1F, -0.2F);
		this.DrumMag_1.addBox(-1.0F, 0.0F, 0.0F, 3, 7, 2, 0.0F);
		this.shape13 = new ModelRenderer(this, 0, 43);
		this.shape13.setRotationPoint(3.0F, 0.0F, 0.0F);
		this.shape13.addBox(0.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
		this.setRotateAngle(shape13, 0.0F, 0.0F, 0.8196066167365371F);
		this.FrontSight = new ModelRenderer(this, 0, 68);
		this.FrontSight.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.FrontSight.addBox(0.0F, -0.8F, 0.0F, 1, 1, 1, 0.0F);
		this.bipedLeftLeg = new ModelRenderer(this, 0, 16);
		this.bipedLeftLeg.mirror = true;
		this.bipedLeftLeg.setRotationPoint(2.0F, 12.0F, 0.1F);
		this.bipedLeftLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 12, 2, 0.0F);
		this.Stock_22 = new ModelRenderer(this, 10, 26);
		this.Stock_22.setRotationPoint(0.0F, 1.0F, 0.0F);
		this.Stock_22.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		this.setRotateAngle(Stock_22, 0.4553564018453205F, 0.0F, 0.0F);
		this.shape9 = new ModelRenderer(this, 0, 40);
		this.shape9.setRotationPoint(0.0F, -1.5F, 0.0F);
		this.shape9.addBox(-4.0F, 0.0F, -4.0F, 8, 2, 8, 0.0F);
		this.shape11 = new ModelRenderer(this, 4, 42);
		this.shape11.setRotationPoint(4.0F, 0.0F, 0.0F);
		this.shape11.addBox(0.0F, 0.0F, -2.5F, 4, 3, 5, 0.0F);
		this.setRotateAngle(shape11, 0.0F, 0.0F, 0.7740535232594852F);
		this.Stock_19 = new ModelRenderer(this, 0, 90);
		this.Stock_19.setRotationPoint(0.0F, 1.3F, 0.0F);
		this.Stock_19.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
		this.setRotateAngle(Stock_19, -0.18203784098300857F, 0.0F, 0.0F);
		this.BackSight = new ModelRenderer(this, 0, 68);
		this.BackSight.setRotationPoint(0.5F, -0.1F, 6.0F);
		this.BackSight.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
		this.CharchingHandle = new ModelRenderer(this, 0, 68);
		this.CharchingHandle.setRotationPoint(0.3F, 0.4F, 0.5F);
		this.CharchingHandle.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		this.Stock_1 = new ModelRenderer(this, 0, 90);
		this.Stock_1.setRotationPoint(0.0F, 1.0F, 0.0F);
		this.Stock_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		this.setRotateAngle(Stock_1, 0.7853981633974483F, 0.0F, 0.0F);
		this.Stock_14 = new ModelRenderer(this, 0, 90);
		this.Stock_14.setRotationPoint(0.0F, 5.0F, 0.0F);
		this.Stock_14.addBox(0.0F, 0.0F, 0.0F, 1, 3, 3, 0.0F);
		this.setRotateAngle(Stock_14, 0.27314402793711257F, 0.0F, 0.0F);
		this.bipedLeftArm = new ModelRenderer(this, 40, 16);
		this.bipedLeftArm.mirror = true;
		this.bipedLeftArm.setRotationPoint(3.9F, 2.0F, -2.7F);
		this.bipedLeftArm.addBox(-1.0F, -2.0F, -1.0F, 2, 12, 2, 0.0F);
		this.setRotateAngle(bipedLeftArm, -0.7457791893771769F, 0.11292280260403312F, 1.4570008595648662F);
		this.TopTriggerGuard = new ModelRenderer(this, 0, 68);
		this.TopTriggerGuard.setRotationPoint(0.5F, 0.0F, -5.01F);
		this.TopTriggerGuard.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
		this.DrumMag_3 = new ModelRenderer(this, 21, 80);
		this.DrumMag_3.setRotationPoint(3.0F, 0.0F, 0.0F);
		this.DrumMag_3.addBox(0.0F, 0.0F, 0.0F, 3, 7, 2, 0.0F);
		this.setRotateAngle(DrumMag_3, 0.0F, 0.0F, 0.7853981633974483F);
		this.Stock_23 = new ModelRenderer(this, 0, 90);
		this.Stock_23.setRotationPoint(0.0F, 0.5F, 0.0F);
		this.Stock_23.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		this.setRotateAngle(Stock_23, 0.40980330836826856F, 0.0F, 0.0F);
		this.TriggerBack = new ModelRenderer(this, 0, 68);
		this.TriggerBack.setRotationPoint(0.0F, -2.0F, 2.0F);
		this.TriggerBack.addBox(0.0F, 0.0F, -0.01F, 1, 2, 2, 0.0F);
		this.Stock = new ModelRenderer(this, 0, 90);
		this.Stock.setRotationPoint(0.25F, 2.0F, 5.6F);
		this.Stock.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
		this.Grip = new ModelRenderer(this, 0, 90);
		this.Grip.setRotationPoint(0.8F, 2.0F, 2.0F);
		this.Grip.addBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F);
		this.shape10 = new ModelRenderer(this, 3, 40);
		this.shape10.setRotationPoint(-4.0F, 0.0F, 0.0F);
		this.shape10.addBox(0.0F, 0.0F, -3.0F, 4, 4, 6, 0.0F);
		this.setRotateAngle(shape10, 0.0F, 0.0F, -0.6373942428283291F);
		this.Stock_4 = new ModelRenderer(this, 0, 90);
		this.Stock_4.setRotationPoint(0.0F, 0.3F, 0.0F);
		this.Stock_4.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
		this.setRotateAngle(Stock_4, -0.18203784098300857F, 0.0F, 0.0F);
		this.DrumMag_12 = new ModelRenderer(this, 21, 80);
		this.DrumMag_12.setRotationPoint(3.5F, 0.0F, 0.0F);
		this.DrumMag_12.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
		this.Stock_27 = new ModelRenderer(this, 0, 90);
		this.Stock_27.setRotationPoint(0.0F, 5.0F, 0.0F);
		this.Stock_27.addBox(0.0F, 0.0F, 0.0F, 1, 3, 3, 0.0F);
		this.setRotateAngle(Stock_27, 0.27314402793711257F, 0.0F, 0.0F);
		this.Backsightsupport = new ModelRenderer(this, 0, 68);
		this.Backsightsupport.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Backsightsupport.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(Backsightsupport, 0.22759093446006054F, 0.0F, 0.0F);
		this.Stock_26 = new ModelRenderer(this, 0, 92);
		this.Stock_26.setRotationPoint(0.0F, 6.0F, -2.0F);
		this.Stock_26.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(Stock_26, 2.86844862565268F, 0.0F, 0.0F);
		this.GripAngle = new ModelRenderer(this, 0, 68);
		this.GripAngle.setRotationPoint(0.5F, 1.0F, 6.9F);
		this.GripAngle.addBox(0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F);
		this.setRotateAngle(GripAngle, -0.7740535232594852F, 0.0F, 0.0F);
		this.Stock_7 = new ModelRenderer(this, 0, 89);
		this.Stock_7.setRotationPoint(0.0F, 5.4F, 0.5F);
		this.Stock_7.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		this.Barrel = new ModelRenderer(this, 0, 68);
		this.Barrel.setRotationPoint(0.5F, 0.0F, -10.0F);
		this.Barrel.addBox(0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F);
		this.Mag = new ModelRenderer(this, 24, 80);
		this.Mag.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Mag.addBox(0.0F, 0.0F, 0.0F, 1, 7, 2, 0.0F);
		this.DrumMag_8 = new ModelRenderer(this, 21, 80);
		this.DrumMag_8.setRotationPoint(3.0F, 0.0F, 0.0F);
		this.DrumMag_8.addBox(0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F);
		this.setRotateAngle(DrumMag_8, 0.0F, 0.0F, 0.7853981633974483F);
		this.MagwelTopPiece = new ModelRenderer(this, 0, 70);
		this.MagwelTopPiece.setRotationPoint(-6.5F, 3.1F, -2.3F);
		this.MagwelTopPiece.addBox(0.0F, -1.8F, -7.0F, 2, 1, 2, 0.0F);
		this.setRotateAngle(MagwelTopPiece, 0.0F, -0.022514747350726852F, 0.0F);
		this.Grip_1 = new ModelRenderer(this, 0, 90);
		this.Grip_1.setRotationPoint(-0.4F, 0.0F, 0.0F);
		this.Grip_1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F);
		this.Handguard = new ModelRenderer(this, 0, 90);
		this.Handguard.setRotationPoint(-0.5F, 0.5F, 2.0F);
		this.Handguard.addBox(0.0F, 0.0F, 0.0F, 2, 2, 8, 0.0F);
		this.shape14.addChild(this.shape15);
		this.Stock_11.addChild(this.Stock_12);
		this.Stock_2.addChild(this.Stock_15);
		this.DrumMag_8.addChild(this.DrumMag_9);
		this.DrumMag_6.addChild(this.DrumMag_7);
		this.Stock_26.addChild(this.shape33_1);
		this.Stock_15.addChild(this.Stock_16);
		this.Stock_9.addChild(this.Stock_10);
		this.Stock_23.addChild(this.Stock_24);
		this.MagwelTopPiece.addChild(this.Body);
		this.MagwellTriggerGuard.addChild(this.TriggerGuard);
		this.Stock_18.addChild(this.Stock_21);
		this.shape11.addChild(this.shape12);
		this.Body.addChild(this.FrontMagwel);
		this.DrumMag_1.addChild(this.DrumMag_2);
		this.Stock_17.addChild(this.Stock_18);
		this.DrumMag_3.addChild(this.DrumMag_4);
		this.DrumMag_5.addChild(this.DrumMag_11);
		this.Body.addChild(this.MagwellTriggerGuard);
		this.Stock_13.addChild(this.shape33);
		this.Grip_2.addChild(this.Grip_3);
		this.DrumMag_4.addChild(this.DrumMag_6);
		this.Grip.addChild(this.Grip_2);
		this.Stock.addChild(this.Stock_2);
		this.Stock_12.addChild(this.Stock_13);
		this.Stock_4.addChild(this.Stock_5);
		this.bipedRightArm.addChild(this.RightArmwichisholdingtheweaponbythetrigger);
		this.Stock_8.addChild(this.Stock_9);
		this.shape13.addChild(this.shape14);
		this.DrumMag_3.addChild(this.DrumMag_5);
		this.Stock_16.addChild(this.Stock_17);
		this.Stock_10.addChild(this.Stock_11);
		this.Stock_4.addChild(this.Stock_6);
		this.Stock_5.addChild(this.Stock_8);
		this.Stock_17.addChild(this.Stock_20);
		this.bipedHead.addChild(this.shape8);
		this.Stock_1.addChild(this.Stock_3);
		this.DrumMag_5.addChild(this.DrumMag_10);
		this.Stock_24.addChild(this.Stock_25);
		this.DrumMag.addChild(this.DrumMag_1);
		this.shape12.addChild(this.shape13);
		this.Barrel.addChild(this.FrontSight);
		this.Stock_21.addChild(this.Stock_22);
		this.shape8.addChild(this.shape9);
		this.shape10.addChild(this.shape11);
		this.Stock_17.addChild(this.Stock_19);
		this.Body.addChild(this.BackSight);
		this.Body.addChild(this.CharchingHandle);
		this.Stock.addChild(this.Stock_1);
		this.Stock_6.addChild(this.Stock_14);
		this.MagwelTopPiece.addChild(this.TopTriggerGuard);
		this.DrumMag_2.addChild(this.DrumMag_3);
		this.Stock_22.addChild(this.Stock_23);
		this.TriggerGuard.addChild(this.TriggerBack);
		this.Body.addChild(this.Stock);
		this.Body.addChild(this.Grip);
		this.shape9.addChild(this.shape10);
		this.Stock_3.addChild(this.Stock_4);
		this.DrumMag_5.addChild(this.DrumMag_12);
		this.Stock_19.addChild(this.Stock_27);
		this.BackSight.addChild(this.Backsightsupport);
		this.Stock_25.addChild(this.Stock_26);
		this.TopTriggerGuard.addChild(this.GripAngle);
		this.Stock_4.addChild(this.Stock_7);
		this.FrontMagwel.addChild(this.Barrel);
		this.DrumMag_7.addChild(this.DrumMag_8);
		this.Grip.addChild(this.Grip_1);
		this.Barrel.addChild(this.Handguard);
	}

	@Override
	public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entity);
		GlStateManager.pushMatrix();
		if (entity instanceof EntityXmasSkeletonBoss) {
			GlStateManager.scale(1.9F, 1.9F, 1.9F);
			GlStateManager.translate(0.0F, -12.0F * scale, 0.0F);
			render(scale);
		} else {
			GlStateManager.scale(0.7F, 0.7F, 0.7F);
			GlStateManager.translate(0.0F, 10.0F * scale, 0.0F);
			render(scale);
		}

		GlStateManager.popMatrix();
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
		this.bipedRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.bipedLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
		this.bipedRightLeg.rotateAngleY = 0.0F;
		this.bipedLeftLeg.rotateAngleY = 0.0F;
		this.bipedRightLeg.rotateAngleZ = 0.0F;
		this.bipedLeftLeg.rotateAngleZ = 0.0F;

		if (this.isRiding) {
			this.bipedRightArm.rotateAngleX += -((float) Math.PI / 5F);
			this.bipedLeftArm.rotateAngleX += -((float) Math.PI / 5F);
			this.bipedRightLeg.rotateAngleX = -1.4137167F;
			this.bipedRightLeg.rotateAngleY = ((float) Math.PI / 10F);
			this.bipedRightLeg.rotateAngleZ = 0.07853982F;
			this.bipedLeftLeg.rotateAngleX = -1.4137167F;
			this.bipedLeftLeg.rotateAngleY = -((float) Math.PI / 10F);
			this.bipedLeftLeg.rotateAngleZ = -0.07853982F;
		}
	}

	public void render(float scale) {
		this.bipedHead.render(scale);
		this.bipedRightArm.render(scale);
		this.bipedRightLeg.render(scale);
		this.DrumMag.render(scale);
		this.bipedBody.render(scale);
		this.bipedLeftLeg.render(scale);
		this.bipedLeftArm.render(scale);
		this.Mag.render(scale);
		this.MagwelTopPiece.render(scale);
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

}
