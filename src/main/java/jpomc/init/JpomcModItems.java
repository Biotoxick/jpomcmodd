
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package jpomc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import jpomc.item.RAMItem;
import jpomc.item.ProcessorItem;
import jpomc.item.MotherboardItem;
import jpomc.item.GraphicCardItem;
import jpomc.item.DespoawnStickItem;
import jpomc.item.DdhItem;
import jpomc.item.AlimentationItem;
import jpomc.item.AircoolingItem;

import jpomc.JpomcMod;

public class JpomcModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, JpomcMod.MODID);
	public static final RegistryObject<Item> MOTHERBOARD = REGISTRY.register("motherboard", () -> new MotherboardItem());
	public static final RegistryObject<Item> GRAPHIC_CARD = REGISTRY.register("graphic_card", () -> new GraphicCardItem());
	public static final RegistryObject<Item> RAM = REGISTRY.register("ram", () -> new RAMItem());
	public static final RegistryObject<Item> ALIMENTATION = REGISTRY.register("alimentation", () -> new AlimentationItem());
	public static final RegistryObject<Item> AIRCOOLING = REGISTRY.register("aircooling", () -> new AircoolingItem());
	public static final RegistryObject<Item> PROCESSOR = REGISTRY.register("processor", () -> new ProcessorItem());
	public static final RegistryObject<Item> CHASSISVIDE = block(JpomcModBlocks.CHASSISVIDE, JpomcModTabs.TAB_JPOMC);
	public static final RegistryObject<Item> ECRAN_PC = block(JpomcModBlocks.ECRAN_PC, JpomcModTabs.TAB_JPOMC);
	public static final RegistryObject<Item> MOUSE_2 = block(JpomcModBlocks.MOUSE_2, JpomcModTabs.TAB_JPOMC);
	public static final RegistryObject<Item> CLAVIER_V_2 = block(JpomcModBlocks.CLAVIER_V_2, JpomcModTabs.TAB_JPOMC);
	public static final RegistryObject<Item> P_CFULL = block(JpomcModBlocks.P_CFULL, JpomcModTabs.TAB_JPOMC);
	public static final RegistryObject<Item> DDH = REGISTRY.register("ddh", () -> new DdhItem());
	public static final RegistryObject<Item> ECRANALLUME = block(JpomcModBlocks.ECRANALLUME, JpomcModTabs.TAB_JPOMC);
	public static final RegistryObject<Item> TPBLOCK_A = block(JpomcModBlocks.TPBLOCK_A, JpomcModTabs.TAB_JPOMC);
	public static final RegistryObject<Item> TPBLOCK_B = block(JpomcModBlocks.TPBLOCK_B, JpomcModTabs.TAB_JPOMC);
	public static final RegistryObject<Item> TPBLOCK_C = block(JpomcModBlocks.TPBLOCK_C, JpomcModTabs.TAB_JPOMC);
	public static final RegistryObject<Item> TPBLOCK_D = block(JpomcModBlocks.TPBLOCK_D, JpomcModTabs.TAB_JPOMC);
	public static final RegistryObject<Item> DESPAWN_STICK = REGISTRY.register("despawn_stick", () -> new DespoawnStickItem());
	public static final RegistryObject<Item> NPCA = REGISTRY.register("npca_spawn_egg",
			() -> new ForgeSpawnEggItem(JpomcModEntities.NPCA, -256, -13382656, new Item.Properties().tab(JpomcModTabs.TAB_JPOMC)));
	public static final RegistryObject<Item> NPCB = REGISTRY.register("npcb_spawn_egg",
			() -> new ForgeSpawnEggItem(JpomcModEntities.NPCB, -256, -13382656, new Item.Properties().tab(JpomcModTabs.TAB_JPOMC)));
	public static final RegistryObject<Item> NPCC = REGISTRY.register("npcc_spawn_egg",
			() -> new ForgeSpawnEggItem(JpomcModEntities.NPCC, -256, -13382656, new Item.Properties().tab(JpomcModTabs.TAB_JPOMC)));
	public static final RegistryObject<Item> NPCD = REGISTRY.register("npcd_spawn_egg",
			() -> new ForgeSpawnEggItem(JpomcModEntities.NPCD, -256, -13382656, new Item.Properties().tab(JpomcModTabs.TAB_JPOMC)));
	public static final RegistryObject<Item> NPCE = REGISTRY.register("npce_spawn_egg",
			() -> new ForgeSpawnEggItem(JpomcModEntities.NPCE, -256, -13382656, new Item.Properties().tab(JpomcModTabs.TAB_JPOMC)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
