
package jpomc.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import jpomc.init.JpomcModTabs;

public class MotherboardItem extends Item {
	public MotherboardItem() {
		super(new Item.Properties().tab(JpomcModTabs.TAB_JPOMC).stacksTo(64).rarity(Rarity.EPIC));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
