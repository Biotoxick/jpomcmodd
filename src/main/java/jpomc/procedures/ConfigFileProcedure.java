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
			mainobj.addProperty("Ne pas supprimer les virgules ni les guillemets",
					"A la moindre erreur supprimer le fichier config et relancer le jeu");
			mainobj.addProperty("La commande /jpomcreload", "Permet de mettre \u00E0 jour les modifications du config file sans redemarrer le jeu.");
			mainobj.addProperty("Laisser un texte vide entre les guillemets d un dialogue", "Desactivera la ligne du NPC");
			mainobj.addProperty("Instance Timer", "(minutes)");
			mainobj.addProperty("InstanceTimer", 15);
			mainobj.addProperty("Commande set Hub", "/sethubpos");
			mainobj.addProperty("Hub X pos", 0);
			mainobj.addProperty("Hub Y pos", 0);
			mainobj.addProperty("Hub Z pos", 0);
			mainobj.addProperty("Commande set Zone A", "/setzoneapos");
			mainobj.addProperty("ZoneA X pos", 0);
			mainobj.addProperty("ZoneA Y pos", 0);
			mainobj.addProperty("ZoneA Z pos", 0);
			mainobj.addProperty("Commande set Zone B", "/setzonebpos");
			mainobj.addProperty("ZoneB X pos", 0);
			mainobj.addProperty("ZoneB Y pos", 0);
			mainobj.addProperty("ZoneB Z pos", 0);
			mainobj.addProperty("Commande set Zone C", "/setzonecpos");
			mainobj.addProperty("ZoneC X pos", 0);
			mainobj.addProperty("ZoneC Y pos", 0);
			mainobj.addProperty("ZoneC Z pos", 0);
			mainobj.addProperty("Commande set Zone D", "/setzonedpos");
			mainobj.addProperty("ZoneD X pos", 0);
			mainobj.addProperty("ZoneD Y pos", 0);
			mainobj.addProperty("ZoneD Z pos", 0);
			mainobj.addProperty("DialogueA1", "Texte de dialogue a changer");
			mainobj.addProperty("DialogueA2", "Texte de dialogue a changer");
			mainobj.addProperty("DialogueB1", "Texte de dialogue a changer");
			mainobj.addProperty("DialogueB2", "Texte de dialogue a changer");
			mainobj.addProperty("DialogueC1", "Texte de dialogue a changer");
			mainobj.addProperty("DialogueC2", "Texte de dialogue a changer");
			mainobj.addProperty("DialogueD1", "Texte de dialogue a changer");
			mainobj.addProperty("DialogueD2", "Texte de dialogue a changer");
			mainobj.addProperty("DialogueE1", "Texte de dialogue a changer");
			mainobj.addProperty("DialogueE2", "Texte de dialogue a changer");
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
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
