package jpomc.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.loading.FMLPaths;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;

import jpomc.network.JpomcModVariables;

import java.io.IOException;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;

import com.google.gson.Gson;

public class ConfigReloadProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		File file = new File("");
		double timerread = 0;
		com.google.gson.JsonObject timer = new com.google.gson.JsonObject();
		com.google.gson.JsonObject mainobj = new com.google.gson.JsonObject();
		file = new File((FMLPaths.GAMEDIR.get().toString() + "/config/JPOMC/"), File.separator + "config.json");
		if (file.exists()) {
			{
				try {
					BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
					StringBuilder jsonstringbuilder = new StringBuilder();
					String line;
					while ((line = bufferedReader.readLine()) != null) {
						jsonstringbuilder.append(line);
					}
					bufferedReader.close();
					mainobj = new Gson().fromJson(jsonstringbuilder.toString(), com.google.gson.JsonObject.class);
					timerread = mainobj.get("InstanceTimer").getAsDouble();
					JpomcModVariables.instancetimer = timerread;
					JpomcModVariables.hubX = mainobj.get("Hub X pos").getAsDouble();
					JpomcModVariables.hubY = mainobj.get("Hub Y pos").getAsDouble();
					JpomcModVariables.hubZ = mainobj.get("Hub Z pos").getAsDouble();
					JpomcModVariables.zoneAX = mainobj.get("ZoneA X pos").getAsDouble();
					JpomcModVariables.zoneAY = mainobj.get("ZoneA Y pos").getAsDouble();
					JpomcModVariables.zoneAZ = mainobj.get("ZoneA Z pos").getAsDouble();
					JpomcModVariables.zoneBX = mainobj.get("ZoneB X pos").getAsDouble();
					JpomcModVariables.zoneBY = mainobj.get("ZoneB Y pos").getAsDouble();
					JpomcModVariables.zoneBZ = mainobj.get("ZoneB Z pos").getAsDouble();
					JpomcModVariables.zoneCX = mainobj.get("ZoneC X pos").getAsDouble();
					JpomcModVariables.zoneCY = mainobj.get("ZoneC Y pos").getAsDouble();
					JpomcModVariables.zoneCZ = mainobj.get("ZoneC Z pos").getAsDouble();
					JpomcModVariables.zoneDX = mainobj.get("ZoneD X pos").getAsDouble();
					JpomcModVariables.zoneDY = mainobj.get("ZoneD Y pos").getAsDouble();
					JpomcModVariables.zoneDZ = mainobj.get("ZoneD Z pos").getAsDouble();
					JpomcModVariables.DialogueA1 = mainobj.get("DialogueA1").getAsString();
					JpomcModVariables.DialogueA2 = mainobj.get("DialogueA2").getAsString();
					JpomcModVariables.DialogueB1 = mainobj.get("DialogueB1").getAsString();
					JpomcModVariables.DiaogueB2 = mainobj.get("DialogueB2").getAsString();
					JpomcModVariables.DialogueC1 = mainobj.get("DialogueC1").getAsString();
					JpomcModVariables.DialogueC2 = mainobj.get("DialogueC2").getAsString();
					JpomcModVariables.DialogueD1 = mainobj.get("DialogueD1").getAsString();
					JpomcModVariables.DialogueD2 = mainobj.get("DialogueD2").getAsString();
					JpomcModVariables.DialogueE1 = mainobj.get("DialogueE1").getAsString();
					JpomcModVariables.DialogueE2 = mainobj.get("DialogueE2").getAsString();
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("Reload Succeful"), (false));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.xylophone")), SoundSource.NEUTRAL, 5,
									7);
						} else {
							_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.xylophone")), SoundSource.NEUTRAL, 5,
									7, false);
						}
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
