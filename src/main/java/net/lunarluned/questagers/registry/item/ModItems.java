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

    public static final Item DRAGON_MEDALLION = registerItem("dragon_medallion",
    new Item(new FabricItemSettings()
    .group(ModItemGroup.QUESTAGERS).maxCount(64).rarity(Rarity.UNCOMMON)));

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

    // journeyman quests

    public static final Item BLAZING_BAD_QUEST_PIN = registerItem("blazing_bad_quest_pin",
            new AbstractQuestPinItem(new FabricItemSettings()
                    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.UNCOMMON)));

    public static final Item BLAZING_BAD_QUEST_PIN_COMPLETED = registerItem("blazing_bad_quest_pin_completed",
            new AbstractQuestPinItem(new FabricItemSettings()
                    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.UNCOMMON)));

    public static final Item BREWING_BRILLIANCE_QUEST_PIN = registerItem("brewing_brilliance_quest_pin",
            new AbstractQuestPinItem(new FabricItemSettings()
                    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.UNCOMMON)));

    public static final Item BREWING_BRILLIANCE_QUEST_PIN_COMPLETED = registerItem("brewing_brilliance_quest_pin_completed",
            new AbstractQuestPinItem(new FabricItemSettings()
                    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.UNCOMMON)));

    public static final Item DEEP_DARK_DISCS_QUEST_PIN = registerItem("deep_dark_discs_quest_pin",
            new AbstractQuestPinItem(new FabricItemSettings()
                    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.UNCOMMON)));

    public static final Item DEEP_DARK_DISCS_QUEST_PIN_COMPLETED = registerItem("deep_dark_discs_quest_pin_completed",
            new AbstractQuestPinItem(new FabricItemSettings()
                    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.UNCOMMON)));

    public static final Item PILLAGING_PLIGHTS_QUEST_PIN = registerItem("pillaging_plights_quest_pin",
            new AbstractQuestPinItem(new FabricItemSettings()
                    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.UNCOMMON)));

    public static final Item PILLAGING_PLIGHTS_QUEST_PIN_COMPLETED = registerItem("pillaging_plights_quest_pin_completed",
            new AbstractQuestPinItem(new FabricItemSettings()
                    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.UNCOMMON)));

    // expert quests

    public static final Item SACK_OF_SCULK_QUEST_PIN = registerItem("sack_of_sculk_quest_pin",
            new AbstractQuestPinItem(new FabricItemSettings()
                    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.UNCOMMON)));

    public static final Item SACK_OF_SCULK_QUEST_PIN_COMPLETED = registerItem("sack_of_sculk_quest_pin_completed",
            new AbstractQuestPinItem(new FabricItemSettings()
                    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.UNCOMMON)));

    public static final Item WIDDLE_AND_WITHER_QUEST_PIN = registerItem("widdle_and_wither_quest_pin",
            new AbstractQuestPinItem(new FabricItemSettings()
                    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.UNCOMMON)));

    public static final Item WIDDLE_AND_WITHER_QUEST_PIN_COMPLETED = registerItem("widdle_and_wither_quest_pin_completed",
            new AbstractQuestPinItem(new FabricItemSettings()
                    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.UNCOMMON)));

    public static final Item THAT_FEELING_IS_FREEING_QUEST_PIN = registerItem("that_feeling_is_freeing_quest_pin",
            new AbstractQuestPinItem(new FabricItemSettings()
                    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.UNCOMMON)));

    public static final Item THAT_FEELING_IS_FREEING_QUEST_PIN_COMPLETED = registerItem("that_feeling_is_freeing_quest_pin_completed",
            new AbstractQuestPinItem(new FabricItemSettings()
                    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.UNCOMMON)));

    public static final Item BACK_TO_EARTH_PART_I_QUEST_PIN = registerItem("back_to_earth_part_i_quest_pin",
            new AbstractQuestPinItem(new FabricItemSettings()
                    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.UNCOMMON)));

    public static final Item BACK_TO_EARTH_PART_I_QUEST_PIN_COMPLETED = registerItem("back_to_earth_part_i_quest_pin_completed",
            new AbstractQuestPinItem(new FabricItemSettings()
                    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.UNCOMMON)));

    public static final Item BACK_TO_EARTH_PART_I_RECIEPT = registerItem("back_to_earth_part_i_reciept",
            new AbstractRecieptItem(new FabricItemSettings()
                    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.COMMON)));

    // master quests

    public static final Item BACK_TO_EARTH_PART_II_QUEST_PIN = registerItem("back_to_earth_part_ii_quest_pin",
            new AbstractQuestPinItem(new FabricItemSettings()
                    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.RARE)));

    public static final Item BACK_TO_EARTH_PART_II_QUEST_PIN_COMPLETED = registerItem("back_to_earth_part_ii_quest_pin_completed",
            new AbstractQuestPinItem(new FabricItemSettings()
                    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.RARE)));

    public static final Item RICH_IN_MINERALS_QUEST_PIN = registerItem("rich_in_minerals_quest_pin",
            new AbstractQuestPinItem(new FabricItemSettings()
                    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.RARE)));

    public static final Item RICH_IN_MINERALS_QUEST_PIN_COMPLETED = registerItem("rich_in_minerals_quest_pin_completed",
            new AbstractQuestPinItem(new FabricItemSettings()
                    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.RARE)));

    public static final Item ONE_MORE_TIME_QUEST_PIN = registerItem("one_more_time_quest_pin",
            new AbstractQuestPinItem(new FabricItemSettings()
                    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.RARE)));

    public static final Item ONE_MORE_TIME_QUEST_PIN_COMPLETED = registerItem("one_more_time_quest_pin_completed",
            new AbstractQuestPinItem(new FabricItemSettings()
                    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.RARE)));

    public static final Item THE_ULTIMATE_SACRIFICE_QUEST_PIN = registerItem("the_ultimate_sacrifice_quest_pin",
            new AbstractQuestPinItem(new FabricItemSettings()
                    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.RARE)));

    public static final Item THE_ULTIMATE_SACRIFICE_QUEST_PIN_COMPLETED = registerItem("the_ultimate_sacrifice_quest_pin_completed",
            new AbstractQuestPinItem(new FabricItemSettings()
                    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.RARE)));

    public static final Item THE_ULTIMATE_SACRIFICE_RECIEPT = registerItem("the_ultimate_sacrifice_reciept",
            new AbstractRecieptItem(new FabricItemSettings()
                    .group(ModItemGroup.QUESTAGERS).maxCount(1).rarity(Rarity.RARE)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Questagers.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Questagers.LOGGER.info("Registering mod items for " + Questagers.MOD_ID);
    }
}
