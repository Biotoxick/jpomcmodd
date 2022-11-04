
package jpomc.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import jpomc.entity.NPCBEntity;

import jpomc.client.model.Modelcustom_model;

public class NPCBRenderer extends MobRenderer<NPCBEntity, Modelcustom_model<NPCBEntity>> {
	public NPCBRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NPCBEntity entity) {
		return new ResourceLocation("jpomc:textures/entities/telecharge_3.png");
	}
}
