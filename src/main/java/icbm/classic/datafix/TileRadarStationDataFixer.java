package icbm.classic.datafix;

import icbm.classic.ICBMConstants;
import icbm.classic.lib.NBTConstants;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.datafix.IFixableData;

public class TileRadarStationDataFixer implements IFixableData {

	@Override
	public CompoundNBT fixTagCompound(CompoundNBT tag) {
		if (tag.hasKey(NBTConstants.ID) && tag.getString(NBTConstants.ID).equalsIgnoreCase(ICBMConstants.PREFIX + "radarstation")) {
			String firstOldKey = "alarmBanJing";
			String secondOldKey = "safetyBanJing";

			if (tag.hasKey(firstOldKey)) {
				int alarmRadius = tag.getInteger(firstOldKey);

				tag.removeTag(firstOldKey); //remove the old entry to not have legacy data. the method name may be misleading, but it actually just removes the key from the tag map
				tag.setInteger(NBTConstants.ALARM_RADIUS, alarmRadius);
			}

			if (tag.hasKey(secondOldKey)) {
				int safetyRadius = tag.getInteger(secondOldKey);

				tag.removeTag(secondOldKey); //remove the old entry to not have legacy data. the method name may be misleading, but it actually just removes the key from the tag map
				tag.setInteger(NBTConstants.SAFETY_RADIUS, safetyRadius);
			}
		}

		return tag;
	}

	@Override
	public int getFixVersion() {
		return 1;
	}

}
