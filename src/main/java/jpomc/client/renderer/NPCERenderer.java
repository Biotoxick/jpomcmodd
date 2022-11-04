
package jpomc.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import jpomc.entity.NPCEEntity;

import jpomc.client.model.Modelcustom_model;

public class NPCERenderer extends MobRenderer<NPCEEntity, Modelcustom_model<NPCEEntity>> {
	public NPCERenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NPCEEntity entity) {
		return new ResourceLocation("jpomc:textures/entities/telecharge_3.png");
	}
}
