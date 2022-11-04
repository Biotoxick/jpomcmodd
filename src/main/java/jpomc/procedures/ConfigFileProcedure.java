package jpomc.procedures;

import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;

import jpomc.network.JpomcModVariables;

import javax.annotation.Nullable;

import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;

import com.google.gson.GsonBuilder;
import com.google.gson.Gson;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ConfigFileProcedure {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		execute();
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
		File file = new File("");
		double timerread = 0;
		com.google.gson.JsonObject timer = new com.google.gson.JsonObject();
		com.google.gson.JsonObject mainobj = new com.google.gson.JsonObject();
		file = new File((FMLPaths.GAMEDIR.get().toString() + "/config/JPOMC/"), File.separator + "config.json");
		if (!file.exists()) {
			try {
				file.getParentFile().mkdirs();
				file.createNewFile();
			} catch (IOException exception) {
				exception.printStackTrace();
			}
			mainobj.addProperty("Configurations JPOMC", "Modifier uniquement les valeurs");
			mainobj.addProperty("Ne pas supprimer les virgules", "A la moindre erreur supprimer le fichier config et relancer le jeu");
			mainobj.addProperty("Instance Timer", "(minutes)");
			mainobj.addProperty("InstanceTimer", 15);
			mainobj.addProperty("Hub X pos", 0);
			mainobj.addProperty("Hub Y pos", 0);
			mainobj.addProperty("Hub Z pos", 0);
			mainobj.addProperty("ZoneA X pos", 0);
			mainobj.addProperty("ZoneA Y pos", 0);
			mainobj.addProperty("ZoneA Z pos", 0);
			mainobj.addProperty("ZoneB X pos", 0);
			mainobj.addProperty("ZoneB Y pos", 0);
			mainobj.addProperty("ZoneB Z pos", 0);
			mainobj.addProperty("ZoneC X pos", 0);
			mainobj.addProperty("ZoneC Y pos", 0);
			mainobj.addProperty("ZoneC Z pos", 0);
			mainobj.addProperty("ZoneD X pos", 0);
			mainobj.addProperty("ZoneD Y pos", 0);
			mainobj.addProperty("ZoneD Z pos", 0);
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
			JpomcModVariables.instancetimer = mainobj.get("InstanceTimer").getAsDouble();
		} else {
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
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
