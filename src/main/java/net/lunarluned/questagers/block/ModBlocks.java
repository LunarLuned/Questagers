package net.lunarluned.questagers.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.lunarluned.questagers.Questagers;
import net.lunarluned.questagers.registry.misc.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block QUESTING_TABLE = registerBlock("questing_table",
    new Block(FabricBlockSettings.of(Material.WOOD)
    .strength(1.5f).requiresTool().sounds(BlockSoundGroup.WOOD)), ModItemGroup.QUESTAGERS);

    public static final Block APPRENTICE_QUESTING_TABLE = registerBlock("apprentice_questing_table",
    new Block(FabricBlockSettings.of(Material.WOOD)
    .strength(1.5f).requiresTool().sounds(BlockSoundGroup.WOOD)), ModItemGroup.QUESTAGERS);

    public static final Block JOURNEYMAN_QUESTING_TABLE = registerBlock("journeyman_questing_table",
    new Block(FabricBlockSettings.of(Material.WOOD)
    .strength(1.5f).requiresTool().sounds(BlockSoundGroup.WOOD)), ModItemGroup.QUESTAGERS);

    public static final Block EXPERT_QUESTING_TABLE = registerBlock("expert_questing_table",
    new Block(FabricBlockSettings.of(Material.WOOD)
    .strength(1.5f).requiresTool().sounds(BlockSoundGroup.WOOD)), ModItemGroup.QUESTAGERS);

    public static final Block MASTER_QUESTING_TABLE = registerBlock("master_questing_table",
    new Block(FabricBlockSettings.of(Material.WOOD)
    .strength(1.5f).requiresTool().sounds(BlockSoundGroup.WOOD)), ModItemGroup.QUESTAGERS);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(Questagers.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(Questagers.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        Questagers.LOGGER.info("Registering mod blocks for " + Questagers.MOD_ID);
    }
}
