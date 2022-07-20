
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package jpomc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import jpomc.block.entity.PCfullBlockEntity;
import jpomc.block.entity.ChassisvideBlockEntity;

import jpomc.JpomcMod;

public class JpomcModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, JpomcMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> CHASSISVIDE = register("chassisvide", JpomcModBlocks.CHASSISVIDE,
			ChassisvideBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> P_CFULL = register("p_cfull", JpomcModBlocks.P_CFULL, PCfullBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
