
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package jpomc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import jpomc.entity.NPCEEntity;
import jpomc.entity.NPCDEntity;
import jpomc.entity.NPCCEntity;
import jpomc.entity.NPCBEntity;
import jpomc.entity.NPCAEntity;

import jpomc.JpomcMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class JpomcModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, JpomcMod.MODID);
	public static final RegistryObject<EntityType<NPCAEntity>> NPCA = register("npca",
			EntityType.Builder.<NPCAEntity>of(NPCAEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(NPCAEntity::new).fireImmune().sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<NPCBEntity>> NPCB = register("npcb",
			EntityType.Builder.<NPCBEntity>of(NPCBEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(NPCBEntity::new).fireImmune().sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<NPCCEntity>> NPCC = register("npcc",
			EntityType.Builder.<NPCCEntity>of(NPCCEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(NPCCEntity::new).fireImmune().sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<NPCDEntity>> NPCD = register("npcd",
			EntityType.Builder.<NPCDEntity>of(NPCDEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(NPCDEntity::new).fireImmune().sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<NPCEEntity>> NPCE = register("npce",
			EntityType.Builder.<NPCEEntity>of(NPCEEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(NPCEEntity::new).fireImmune().sized(0.6f, 1.95f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			NPCAEntity.init();
			NPCBEntity.init();
			NPCCEntity.init();
			NPCDEntity.init();
			NPCEEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(NPCA.get(), NPCAEntity.createAttributes().build());
		event.put(NPCB.get(), NPCBEntity.createAttributes().build());
		event.put(NPCC.get(), NPCCEntity.createAttributes().build());
		event.put(NPCD.get(), NPCDEntity.createAttributes().build());
		event.put(NPCE.get(), NPCEEntity.createAttributes().build());
	}
}
