
package jpomc.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import jpomc.init.JpomcModTabs;

public class RAMItem extends Item {
	public RAMItem() {
		super(new Item.Properties().tab(JpomcModTabs.TAB_JPOMC).stacksTo(2).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}
}
