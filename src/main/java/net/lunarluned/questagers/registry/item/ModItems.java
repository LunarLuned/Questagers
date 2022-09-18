package net.lunarluned.questagers.registry.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.lunarluned.questagers.Questagers;
import net.lunarluned.questagers.registry.misc.ModItemGroup;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item BASE_QUEST_PIN = registerItem("base_quest_pin",
            new QuestPinItem(new FabricItemSettings().group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.COMMON)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Questagers.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Questagers.LOGGER.info("Registering mod items for " + Questagers.MOD_ID);
    }
}
