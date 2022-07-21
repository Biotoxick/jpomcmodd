package jpomc.procedures;

import net.minecraft.world.entity.Entity;

import jpomc.network.JpomcModVariables;

public class ScreenguibuttonProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(JpomcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new JpomcModVariables.PlayerVariables())).shoudshowcode == false) {
			{
				boolean _setval = true;
				entity.getCapability(JpomcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.shoudshowcode = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			{
				boolean _setval = false;
				entity.getCapability(JpomcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.shoudshowcode = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
