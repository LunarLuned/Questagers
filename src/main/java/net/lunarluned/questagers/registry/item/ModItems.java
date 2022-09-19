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
    new AbstractBadgeItem(new FabricItemSettings()
    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.COMMON)));

    // quest badges

    public static final Item APPRENTICE_QUEST_BADGE = registerItem("apprentice_quest_badge",
    new AbstractBadgeItem(new FabricItemSettings()
    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.UNCOMMON)));

    public static final Item JOURNEYMAN_QUEST_BADGE = registerItem("journeyman_quest_badge",
    new AbstractBadgeItem(new FabricItemSettings()
    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.UNCOMMON)));

    public static final Item EXPERT_QUEST_BADGE = registerItem("expert_quest_badge",
    new AbstractBadgeItem(new FabricItemSettings()
    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.UNCOMMON)));

    public static final Item MASTER_QUEST_BADGE = registerItem("master_quest_badge",
    new AbstractBadgeItem(new FabricItemSettings()
    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.UNCOMMON)));

    // novice quests

    public static final Item TRAIL_MIX_QUEST_PIN = registerItem("trail_mix_quest_pin",
    new AbstractQuestPinItem(new FabricItemSettings()
    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.COMMON)));

    public static final Item TRAIL_MIX_QUEST_PIN_COMPLETED = registerItem("trail_mix_quest_pin_completed",
    new AbstractQuestPinItem(new FabricItemSettings()
    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.COMMON)));

    public static final Item IRIS_RAINBOW_QUEST_PIN = registerItem("iris_rainbow_quest_pin",
    new AbstractQuestPinItem(new FabricItemSettings()
    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.COMMON)));

    public static final Item IRIS_RAINBOW_QUEST_PIN_COMPLETED = registerItem("iris_rainbow_quest_pin_completed",
    new AbstractQuestPinItem(new FabricItemSettings()
    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.COMMON)));

    public static final Item SUSHIMI_SCHEME_QUEST_PIN = registerItem("sushimi_scheme_quest_pin",
    new AbstractQuestPinItem(new FabricItemSettings()
    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.COMMON)));

    public static final Item SUSHIMI_SCHEME_QUEST_PIN_COMPLETED = registerItem("sushimi_scheme_quest_pin_completed",
    new AbstractQuestPinItem(new FabricItemSettings()
    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.COMMON)));

    public static final Item VERY_VERY_SCARY_QUEST_PIN = registerItem("very_very_scary_quest_pin",
    new AbstractQuestPinItem(new FabricItemSettings()
    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.COMMON)));

    public static final Item VERY_VERY_SCARY_QUEST_PIN_COMPLETED = registerItem("very_very_scary_quest_pin_completed",
    new AbstractQuestPinItem(new FabricItemSettings()
    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.COMMON)));

    // apprentice quests

    public static final Item WAY_DEEP_DOWN_QUEST_PIN = registerItem("way_deep_down_quest_pin",
    new AbstractQuestPinItem(new FabricItemSettings()
    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.COMMON)));

    public static final Item WAY_DEEP_DOWN_QUEST_PIN_COMPLETED = registerItem("way_deep_down_quest_pin_completed",
    new AbstractQuestPinItem(new FabricItemSettings()
    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.COMMON)));

    public static final Item ENCHANTING_QUEST_PIN = registerItem("enchanting_quest_pin",
    new AbstractQuestPinItem(new FabricItemSettings()
    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.COMMON)));

    public static final Item ENCHANTING_QUEST_PIN_COMPLETED = registerItem("enchanting_quest_pin_completed",
    new AbstractQuestPinItem(new FabricItemSettings()
    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.COMMON)));

    public static final Item WAY_WAY_DEEPER_DOWN_QUEST_PIN = registerItem("way_way_deeper_down_quest_pin",
    new AbstractQuestPinItem(new FabricItemSettings()
    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.COMMON)));

    public static final Item WAY_WAY_DEEPER_DOWN_QUEST_PIN_COMPLETED = registerItem("way_way_deeper_down_quest_pin_completed",
    new AbstractQuestPinItem(new FabricItemSettings()
    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.COMMON)));

    public static final Item BASTION_BUSTING_QUEST_PIN = registerItem("bastion_busting_quest_pin",
    new AbstractQuestPinItem(new FabricItemSettings()
    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.COMMON)));

    public static final Item BASTION_BUSTING_QUEST_PIN_COMPLETED = registerItem("bastion_busting_quest_pin_completed",
    new AbstractQuestPinItem(new FabricItemSettings()
    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.COMMON)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Questagers.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Questagers.LOGGER.info("Registering mod items for " + Questagers.MOD_ID);
    }
}
