
package jpomc.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import jpomc.entity.NPCCEntity;

import jpomc.client.model.Modelcustom_model;

public class NPCCRenderer extends MobRenderer<NPCCEntity, Modelcustom_model<NPCCEntity>> {
	public NPCCRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NPCCEntity entity) {
		return new ResourceLocation("jpomc:textures/entities/telecharge_3.png");
	}
}
