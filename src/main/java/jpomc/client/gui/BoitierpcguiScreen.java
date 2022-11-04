
package jpomc.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import jpomc.world.inventory.BoitierpcguiMenu;

import jpomc.procedures.SiprocesseuronProcedure;
import jpomc.procedures.SicartemereonProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class BoitierpcguiScreen extends AbstractContainerScreen<BoitierpcguiMenu> {
	private final static HashMap<String, Object> guistate = BoitierpcguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public BoitierpcguiScreen(BoitierpcguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 210;
	}

	private static final ResourceLocation texture = new ResourceLocation("jpomc:textures/screens/boitierpcgui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("jpomc:textures/screens/boitierpcgui8slotsv2.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 210, 176, 210);

		if (SicartemereonProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("jpomc:textures/screens/cadenaresize.png"));
			this.blit(ms, this.leftPos + 46, this.topPos + 63, 0, 0, 10, 13, 10, 13);
		}
		if (SicartemereonProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("jpomc:textures/screens/cadenaresize.png"));
			this.blit(ms, this.leftPos + 70, this.topPos + 63, 0, 0, 10, 13, 10, 13);
		}
		if (SiprocesseuronProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("jpomc:textures/screens/cadenaresize.png"));
			this.blit(ms, this.leftPos + 76, this.topPos + 94, 0, 0, 10, 13, 10, 13);
		}
		if (SicartemereonProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("jpomc:textures/screens/cadenaresize.png"));
			this.blit(ms, this.leftPos + 91, this.topPos + 36, 0, 0, 10, 13, 10, 13);
		}
		if (SicartemereonProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("jpomc:textures/screens/cadenaresize.png"));
			this.blit(ms, this.leftPos + 91, this.topPos + 15, 0, 0, 10, 13, 10, 13);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
	}
}
