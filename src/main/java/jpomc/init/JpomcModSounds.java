
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package jpomc.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class JpomcModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("jpomc", "pcrunningsound"), new SoundEvent(new ResourceLocation("jpomc", "pcrunningsound")));
		REGISTRY.put(new ResourceLocation("jpomc", "clicksound"), new SoundEvent(new ResourceLocation("jpomc", "clicksound")));
		REGISTRY.put(new ResourceLocation("jpomc", "keyboardsound"), new SoundEvent(new ResourceLocation("jpomc", "keyboardsound")));
		REGISTRY.put(new ResourceLocation("jpomc", "pcoffsound"), new SoundEvent(new ResourceLocation("jpomc", "pcoffsound")));
		REGISTRY.put(new ResourceLocation("jpomc", "pconsound"), new SoundEvent(new ResourceLocation("jpomc", "pconsound")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
