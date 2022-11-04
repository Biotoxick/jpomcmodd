package jpomc.procedures;

import net.minecraftforge.fml.loading.FMLPaths;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

import jpomc.network.JpomcModVariables;

import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;

import com.google.gson.GsonBuilder;
import com.google.gson.Gson;

public class SetHubPosPrcProcedure {
	public static void execute(Entity entity) {
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
					mainobj.addProperty("Hub X pos", (entity.getX()));
					mainobj.addProperty("Hub Y pos", (entity.getY()));
					mainobj.addProperty("Hub Z pos", (entity.getZ()));
					{
						Gson mainGSONBuilderVariable = new GsonBuilder().setPrettyPrinting().create();
						try {
							FileWriter fileWriter = new FileWriter(file);
							fileWriter.write(mainGSONBuilderVariable.toJson(mainobj));
							fileWriter.close();
						} catch (IOException exception) {
							exception.printStackTrace();
						}
					}
					JpomcModVariables.hubX = mainobj.get("Hub X pos").getAsDouble();
					JpomcModVariables.hubY = mainobj.get("Hub Y pos").getAsDouble();
					JpomcModVariables.hubZ = mainobj.get("Hub Z pos").getAsDouble();
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("Position du Hub chang\u00E9e /jpomcreload pour valider les changements"),
								(false));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
