package net.sorskoot.pizzaplace;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BeetrootsBlock;
import net.minecraft.block.CakeBlock;
import net.minecraft.block.CropBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.sorskoot.blocks.PizzaMargharitaBlock;

public class PizzaPlace implements ModInitializer {

	public static final PizzaMargharitaBlock PIZZA_MARGHARITA_BLOCK = new PizzaMargharitaBlock(FabricBlockSettings.of(Material.CAKE));

	public static final String MOD_ID = "pizzaplace";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "pizza_margharita"), PIZZA_MARGHARITA_BLOCK);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pizza_margharita"), new BlockItem(PIZZA_MARGHARITA_BLOCK, new Item.Settings().group(ItemGroup.FOOD)));
	}
}
