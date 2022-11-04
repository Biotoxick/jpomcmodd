
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package jpomc.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import jpomc.client.renderer.NPCERenderer;
import jpomc.client.renderer.NPCDRenderer;
import jpomc.client.renderer.NPCCRenderer;
import jpomc.client.renderer.NPCBRenderer;
import jpomc.client.renderer.NPCARenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class JpomcModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(JpomcModEntities.NPCA.get(), NPCARenderer::new);
		event.registerEntityRenderer(JpomcModEntities.NPCB.get(), NPCBRenderer::new);
		event.registerEntityRenderer(JpomcModEntities.NPCC.get(), NPCCRenderer::new);
		event.registerEntityRenderer(JpomcModEntities.NPCD.get(), NPCDRenderer::new);
		event.registerEntityRenderer(JpomcModEntities.NPCE.get(), NPCERenderer::new);
	}
}
