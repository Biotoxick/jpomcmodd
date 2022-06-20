
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package jpomc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import jpomc.block.ClavierBlock;
import jpomc.block.ChassisvideBlock;

import jpomc.JpomcMod;

public class JpomcModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, JpomcMod.MODID);
	public static final RegistryObject<Block> CLAVIER = REGISTRY.register("clavier", () -> new ClavierBlock());
	public static final RegistryObject<Block> CHASSISVIDE = REGISTRY.register("chassisvide", () -> new ChassisvideBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ClavierBlock.registerRenderLayer();
		}
	}
}
