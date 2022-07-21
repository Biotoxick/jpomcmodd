package jpomc.procedures;

import net.minecraft.world.entity.Entity;

import jpomc.network.JpomcModVariables;

public class ShowcodeconditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(JpomcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new JpomcModVariables.PlayerVariables())).shoudshowcode == true) {
			return true;
		}
		return false;
	}
}
