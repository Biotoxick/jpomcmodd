
package jpomc.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import jpomc.procedures.DespoawnStickLivingEntityIsHitWithItemProcedure;

import jpomc.init.JpomcModTabs;

import java.util.List;

public class DespoawnStickItem extends Item {
	public DespoawnStickItem() {
		super(new Item.Properties().tab(JpomcModTabs.TAB_JPOMC).stacksTo(1).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("ADMIN TOOL"));
		list.add(new TextComponent("Despawn Entities"));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		DespoawnStickLivingEntityIsHitWithItemProcedure.execute(entity);
		return retval;
	}
}
