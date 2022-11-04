package jpomc.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import jpomc.network.JpomcModVariables;

public class ZoneAtpProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			_ent.teleportTo(JpomcModVariables.zoneAX, JpomcModVariables.zoneAY, JpomcModVariables.zoneAZ);
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport(JpomcModVariables.zoneAX, JpomcModVariables.zoneAY, JpomcModVariables.zoneAZ, _ent.getYRot(),
						_ent.getXRot());
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()),
						ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.NEUTRAL, 4, 1);
			} else {
				_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()),
						ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.NEUTRAL, 4, 1, false);
			}
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.PORTAL, (entity.getX()), (entity.getY()), (entity.getZ()), 15, 3, 3, 3, 0.5);
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(
					new TextComponent(("\u00A7aD\u00E9but de l'\u00E9preuve, dur\u00E9e :" + JpomcModVariables.instancetimer + " \u00A7aminutes")),
					(true));
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private LevelAccessor world;

			public void start(LevelAccessor world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("\u00A7cRetour au Hub dans 10 secondes !"), (true));
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.xylophone")), SoundSource.NEUTRAL, 4, 1);
					} else {
						_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.xylophone")), SoundSource.NEUTRAL, 4, 1,
								false);
					}
				}
				new Object() {
					private int ticks = 0;
					private float waitTicks;
					private LevelAccessor world;

					public void start(LevelAccessor world, int waitTicks) {
						this.waitTicks = waitTicks;
						MinecraftForge.EVENT_BUS.register(this);
						this.world = world;
					}

					@SubscribeEvent
					public void tick(TickEvent.ServerTickEvent event) {
						if (event.phase == TickEvent.Phase.END) {
							this.ticks += 1;
							if (this.ticks >= this.waitTicks)
								run();
						}
					}

					private void run() {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(new TextComponent("\u00A7cRetour au Hub dans 3 secondes !"), (true));
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()),
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.xylophone")),
										SoundSource.NEUTRAL, 4, 1);
							} else {
								_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()),
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.xylophone")),
										SoundSource.NEUTRAL, 4, 1, false);
							}
						}
						new Object() {
							private int ticks = 0;
							private float waitTicks;
							private LevelAccessor world;

							public void start(LevelAccessor world, int waitTicks) {
								this.waitTicks = waitTicks;
								MinecraftForge.EVENT_BUS.register(this);
								this.world = world;
							}

							@SubscribeEvent
							public void tick(TickEvent.ServerTickEvent event) {
								if (event.phase == TickEvent.Phase.END) {
									this.ticks += 1;
									if (this.ticks >= this.waitTicks)
										run();
								}
							}

							private void run() {
								if (entity instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(new TextComponent("\u00A7cRetour au Hub dans 2 secondes !"), (true));
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()),
												ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.xylophone")),
												SoundSource.NEUTRAL, 4, 1);
									} else {
										_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()),
												ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.xylophone")),
												SoundSource.NEUTRAL, 4, 1, false);
									}
								}
								new Object() {
									private int ticks = 0;
									private float waitTicks;
									private LevelAccessor world;

									public void start(LevelAccessor world, int waitTicks) {
										this.waitTicks = waitTicks;
										MinecraftForge.EVENT_BUS.register(this);
										this.world = world;
									}

									@SubscribeEvent
									public void tick(TickEvent.ServerTickEvent event) {
										if (event.phase == TickEvent.Phase.END) {
											this.ticks += 1;
											if (this.ticks >= this.waitTicks)
												run();
										}
									}

									private void run() {
										if (entity instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(new TextComponent("\u00A7cRetour au Hub dans 1 secondes !"), (true));
										if (world instanceof Level _level) {
											if (!_level.isClientSide()) {
												_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()),
														ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.xylophone")),
														SoundSource.NEUTRAL, 4, 5);
											} else {
												_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()),
														ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.xylophone")),
														SoundSource.NEUTRAL, 4, 5, false);
											}
										}
										new Object() {
											private int ticks = 0;
											private float waitTicks;
											private LevelAccessor world;

											public void start(LevelAccessor world, int waitTicks) {
												this.waitTicks = waitTicks;
												MinecraftForge.EVENT_BUS.register(this);
												this.world = world;
											}

											@SubscribeEvent
											public void tick(TickEvent.ServerTickEvent event) {
												if (event.phase == TickEvent.Phase.END) {
													this.ticks += 1;
													if (this.ticks >= this.waitTicks)
														run();
												}
											}

											private void run() {
												{
													Entity _ent = entity;
													_ent.teleportTo(JpomcModVariables.hubX, JpomcModVariables.hubY, JpomcModVariables.hubZ);
													if (_ent instanceof ServerPlayer _serverPlayer)
														_serverPlayer.connection.teleport(JpomcModVariables.hubX, JpomcModVariables.hubY,
																JpomcModVariables.hubZ, _ent.getYRot(), _ent.getXRot());
												}
												if (world instanceof Level _level) {
													if (!_level.isClientSide()) {
														_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()),
																ForgeRegistries.SOUND_EVENTS.getValue(
																		new ResourceLocation("entity.enderman.teleport")),
																SoundSource.NEUTRAL, 4, 1);
													} else {
														_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()),
																ForgeRegistries.SOUND_EVENTS
																		.getValue(new ResourceLocation("entity.enderman.teleport")),
																SoundSource.NEUTRAL, 4, 1, false);
													}
												}
												if (world instanceof ServerLevel _level)
													_level.sendParticles(ParticleTypes.PORTAL, (entity.getX()), (entity.getY()), (entity.getZ()), 15,
															3, 3, 3, 0.5);
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, 20);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, 20);
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, 20);
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 120);
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) (JpomcModVariables.instancetimer * 60 * 20 - 200));
	}
}
