
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

import jpomc.block.Mouse2Block;
import jpomc.block.EcranPcBlock;
import jpomc.block.ClavierV2Block;
import jpomc.block.ChassisvideBlock;

import jpomc.JpomcMod;

public class JpomcModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, JpomcMod.MODID);
	public static final RegistryObject<Block> CHASSISVIDE = REGISTRY.register("chassisvide", () -> new ChassisvideBlock());
	public static final RegistryObject<Block> ECRAN_PC = REGISTRY.register("ecran_pc", () -> new EcranPcBlock());
	public static final RegistryObject<Block> MOUSE_2 = REGISTRY.register("mouse_2", () -> new Mouse2Block());
	public static final RegistryObject<Block> CLAVIER_V_2 = REGISTRY.register("clavier_v_2", () -> new ClavierV2Block());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ChassisvideBlock.registerRenderLayer();
			EcranPcBlock.registerRenderLayer();
			Mouse2Block.registerRenderLayer();
			ClavierV2Block.registerRenderLayer();
		}
	}
}
