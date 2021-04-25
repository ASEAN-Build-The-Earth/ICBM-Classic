package icbm.classic.prefab.item;

import icbm.classic.lib.LanguageUtility;
import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

/**
 * Implementation of a block with subtypes that extends the base ItemBlock class used by VoltzEngine
 * <p>
 * <p>
 * Created by Dark(DarkGuardsman, Robert) on 2/14/2017.
 */
public class ItemBlockSubTypes extends ItemBlockAbstract {

	public ItemBlockSubTypes(Block block) {
		super(block);
		setHasSubtypes(true);
		setRegistryName(block.getRegistryName());
	}

	@Override
	public int getMetadata(int damage) {
		return damage;
	}

	@Override
	public String getTranslationKey(ItemStack itemstack) {
		String localized = LanguageUtility.getLocal(getTranslationKey() + "." + itemstack.getDamage() + ".name");
		if (localized != null && !localized.isEmpty()) {
			return getTranslationKey() + "." + itemstack.getDamage();
		}
		return getTranslationKey();
	}

	@Override
	protected boolean hasShiftInfo(ItemStack stack, PlayerEntity player) {
		final String translationKey = getTranslationKey(stack) + ".info.detailed";
		final String translation = LanguageUtility.getLocal(translationKey);
		return !translation.trim().isEmpty() && !translation.equals(translationKey);
	}

}
