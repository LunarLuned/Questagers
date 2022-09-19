package net.lunarluned.questagers.registry.misc;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.lunarluned.questagers.Questagers;
import net.lunarluned.questagers.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup QUESTAGERS = FabricItemGroupBuilder.build(new Identifier(Questagers.MOD_ID, "questagers"),
            () -> new ItemStack(ModBlocks.QUESTING_TABLE));;
}
