
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package jpomc.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class JpomcModTabs {
	public static CreativeModeTab TAB_JPOMC;

	public static void load() {
		TAB_JPOMC = new CreativeModeTab("tabjpomc") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(JpomcModItems.PROCESSOR.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
