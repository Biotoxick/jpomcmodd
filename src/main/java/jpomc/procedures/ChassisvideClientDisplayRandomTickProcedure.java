package jpomc.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import jpomc.network.JpomcModVariables;

public class ChassisvideClientDisplayRandomTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (JpomcModVariables.WorldVariables.get(world).shouldclosegui == true) {
			if (entity instanceof Player _player)
				_player.closeContainer();
			JpomcModVariables.WorldVariables.get(world).shouldclosegui = false;
			JpomcModVariables.WorldVariables.get(world).syncData(world);
		}
	}
}
