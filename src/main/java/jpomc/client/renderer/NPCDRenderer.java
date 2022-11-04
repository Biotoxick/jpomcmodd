
package jpomc.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import jpomc.entity.NPCDEntity;

import jpomc.client.model.Modelcustom_model;

public class NPCDRenderer extends MobRenderer<NPCDEntity, Modelcustom_model<NPCDEntity>> {
	public NPCDRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NPCDEntity entity) {
		return new ResourceLocation("jpomc:textures/entities/telecharge_3.png");
	}
}
