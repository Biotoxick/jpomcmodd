
package jpomc.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import jpomc.entity.NPCAEntity;

import jpomc.client.model.Modelcustom_model;

public class NPCARenderer extends MobRenderer<NPCAEntity, Modelcustom_model<NPCAEntity>> {
	public NPCARenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NPCAEntity entity) {
		return new ResourceLocation("jpomc:textures/entities/telecharge_3.png");
	}
}
