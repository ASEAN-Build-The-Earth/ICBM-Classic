package icbm.classic.content.items;

import icbm.classic.config.ConfigBattery;
import icbm.classic.lib.energy.storage.EnergyBufferLimited;
import icbm.classic.prefab.item.ItemICBMBase;
import icbm.classic.prefab.item.ItemStackCapProvider;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.IEnergyStorage;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Simple battery to move energy around between devices
 * <p>
 * <p>
 * Created by Dark(DarkGuardsman, Robert) on 3/21/2018.
 */
public class ItemBattery extends ItemICBMBase {

	public ItemBattery() {
		super("battery");
		setHasSubtypes(true);
		setMaxStackSize(1);
		//TODO add subtypes (Single Use battery, EMP resistant battery)
	}

	@Override
	public ICapabilityProvider initCapabilities(ItemStack stack, @Nullable CompoundNBT nbt) {
		ItemStackCapProvider provider = new ItemStackCapProvider(stack);
		provider.add("battery", CapabilityEnergy.ENERGY, new EnergyBufferLimited(ConfigBattery.BATTERY_CAPACITY, ConfigBattery.BATTERY_INPUT_LIMIT, ConfigBattery.BATTERY_OUTPUT_LIMIT));
		return provider;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, World world, List<String> list, ITooltipFlag flag) {
		if (stack.hasCapability(CapabilityEnergy.ENERGY, null)) {
			IEnergyStorage energyStorage = stack.getCapability(CapabilityEnergy.ENERGY, null);
			if (energyStorage != null) {
				double p = getDurabilityForDisplay(stack) * 100;
				list.add("L: " + (int) p + "%");
				list.add("E: " + energyStorage.getEnergyStored() + "/" + energyStorage.getMaxEnergyStored() + " FE");
			}
		}
		//TODO add info
		//TODO add shift info (input & output limits)
	}

	@Override
	public double getDurabilityForDisplay(ItemStack stack) {
		if (stack.hasCapability(CapabilityEnergy.ENERGY, null)) {
			IEnergyStorage energyStorage = stack.getCapability(CapabilityEnergy.ENERGY, null);
			if (energyStorage != null) {
				return energyStorage.getEnergyStored() / (double) energyStorage.getMaxEnergyStored();
			}
		}
		return 1;
	}

}
