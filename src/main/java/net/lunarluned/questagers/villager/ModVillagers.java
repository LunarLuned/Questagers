package net.lunarluned.questagers.villager;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.lunarluned.questagers.Questagers;
import net.lunarluned.questagers.block.ModBlocks;
import net.lunarluned.questagers.registry.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;
import com.google.common.collect.ImmutableSet;

public class ModVillagers {

    public static final PointOfInterestType QUEST_STATION = registerPOI("quest_station", ModBlocks.QUESTING_TABLE);
    public static final VillagerProfession BEGINNER_QUESTAGER = registerProfession("beginner_questager",
            RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE_KEY, new Identifier(Questagers.MOD_ID, "quest_station")));

    public static final PointOfInterestType APPRENTICE_QUEST_STATION = registerPOI("apprentice_quest_station", ModBlocks.APPRENTICE_QUESTING_TABLE);
    public static final VillagerProfession APPRENTICE_QUESTAGER = registerProfession("apprentice_questager",
            RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE_KEY, new Identifier(Questagers.MOD_ID, "apprentice_quest_station")));

    public static final PointOfInterestType JOURNEYMAN_QUEST_STATION = registerPOI("journeyman_quest_station", ModBlocks.JOURNEYMAN_QUESTING_TABLE);
    public static final VillagerProfession JOURNEYMAN_QUESTAGER = registerProfession("journeyman_questager",
            RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE_KEY, new Identifier(Questagers.MOD_ID, "journeyman_quest_station")));

    public static final PointOfInterestType EXPERT_QUEST_STATION = registerPOI("expert_quest_station", ModBlocks.EXPERT_QUESTING_TABLE);
    public static final VillagerProfession EXPERT_QUESTAGER = registerProfession("expert_questager",
            RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE_KEY, new Identifier(Questagers.MOD_ID, "expert_quest_station")));

    public static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registry.VILLAGER_PROFESSION, new Identifier(Questagers.MOD_ID, name),
                VillagerProfessionBuilder.create().id(new Identifier(Questagers.MOD_ID, name)).workstation(type)
                        .workSound(SoundEvents.ENTITY_VILLAGER_WORK_ARMORER).build());
    }

    public static PointOfInterestType registerPOI(String name, Block block) {
        return PointOfInterestHelper.register(new Identifier(Questagers.MOD_ID, name),
                1, 1, ImmutableSet.copyOf(block.getStateManager().getStates()));
    }

    public static void registerVillagers() {
        Questagers.LOGGER.debug("Registering Villagers for " + Questagers.MOD_ID);
    }

    public static void registerTrades() {
        //beginner questager
        TradeOfferHelper.registerVillagerOffers(BEGINNER_QUESTAGER,1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(ModItems.TRAIL_MIX_QUEST_PIN, 1),
                            1, 1, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.TRAIL_MIX_QUEST_PIN_COMPLETED, 1),
                            new ItemStack(Items.EMERALD, 6),
                            1, 10, 0.00f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(BEGINNER_QUESTAGER,2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(ModItems.IRIS_RAINBOW_QUEST_PIN, 1),
                            1, 1, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.IRIS_RAINBOW_QUEST_PIN_COMPLETED, 1),
                            new ItemStack(Items.EMERALD, 12),
                            1, 75, 0.00f
                    )));
        });
                    TradeOfferHelper.registerVillagerOffers(BEGINNER_QUESTAGER,3,
                    factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(ModItems.SUSHIMI_SCHEME_QUEST_PIN, 1),
                            1, 1, 0.00f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.SUSHIMI_SCHEME_QUEST_PIN_COMPLETED, 1),
                            new ItemStack(Items.EMERALD, 28),
                            1, 160, 0.00f
                    )));
                    });

        TradeOfferHelper.registerVillagerOffers(BEGINNER_QUESTAGER,4,

                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(ModItems.WAY_DEEP_DOWN_QUEST_PIN, 1),
                            1, 1, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.WAY_DEEP_DOWN_QUEST_PIN_COMPLETED, 1),
                            new ItemStack(Items.EMERALD, 30),
                            1, 265, 0.02f
                    )));
                });

        TradeOfferHelper.registerVillagerOffers(BEGINNER_QUESTAGER,5,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 16),
                            new ItemStack(ModItems.APPRENTICE_QUEST_BADGE, 1),
                            1, 1, 0.02f
                    )));
                });

        //apprentice questager

        TradeOfferHelper.registerVillagerOffers(APPRENTICE_QUESTAGER,1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 20),
                            new ItemStack(ModItems.VERY_VERY_SCARY_QUEST_PIN, 1),
                            1, 1, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.VERY_VERY_SCARY_QUEST_PIN_COMPLETED, 1),
                            new ItemStack(Items.EMERALD, 40),
                            1, 15, 0.00f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(APPRENTICE_QUESTAGER,2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(ModItems.ENCHANTING_QUEST_PIN, 1),
                            1, 1, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.ENCHANTING_QUEST_PIN_COMPLETED, 1),
                            new ItemStack(Items.EMERALD, 30),
                            1, 75, 0.00f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(APPRENTICE_QUESTAGER,3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 24),
                            new ItemStack(ModItems.WAY_WAY_DEEPER_DOWN_QUEST_PIN, 1),
                            1, 1, 0.00f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.WAY_WAY_DEEPER_DOWN_QUEST_PIN_COMPLETED, 1),
                            new ItemStack(Items.EMERALD, 40),
                            1, 155, 0.00f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(APPRENTICE_QUESTAGER,4,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 24),
                            new ItemStack(ModItems.BASTION_BUSTING_QUEST_PIN, 1),
                            1, 1, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.BASTION_BUSTING_QUEST_PIN_COMPLETED, 1),
                            new ItemStack(Items.EMERALD, 50),
                            1, 250, 0.00f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(APPRENTICE_QUESTAGER,5,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 32),
                            new ItemStack(ModItems.JOURNEYMAN_QUEST_BADGE, 1),
                            1, 1, 0.02f
                    )));
                });


        //journeyman questager

        TradeOfferHelper.registerVillagerOffers(JOURNEYMAN_QUESTAGER,1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 25),
                            new ItemStack(ModItems.BLAZING_BAD_QUEST_PIN, 1),
                            1, 1, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.BLAZING_BAD_QUEST_PIN_COMPLETED, 1),
                            new ItemStack(Items.EMERALD, 40),
                            1, 15, 0.00f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(JOURNEYMAN_QUESTAGER,2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 30),
                            new ItemStack(ModItems.BREWING_BRILLIANCE_QUEST_PIN, 1),
                            1, 1, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.BREWING_BRILLIANCE_QUEST_PIN_COMPLETED, 1),
                            new ItemStack(Items.EMERALD, 50),
                            1, 75, 0.00f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(JOURNEYMAN_QUESTAGER,3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 24),
                            new ItemStack(ModItems.DEEP_DARK_DISCS_QUEST_PIN, 1),
                            1, 1, 0.00f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.DEEP_DARK_DISCS_QUEST_PIN_COMPLETED, 1),
                            new ItemStack(Blocks.EMERALD_BLOCK, 7),
                            1, 155, 0.00f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(JOURNEYMAN_QUESTAGER,4,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 30),
                            new ItemStack(ModItems.PILLAGING_PLIGHTS_QUEST_PIN, 1),
                            1, 1, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.PILLAGING_PLIGHTS_QUEST_PIN_COMPLETED, 1),
                            new ItemStack(Blocks.EMERALD_BLOCK, 9),
                            1, 250, 0.00f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(JOURNEYMAN_QUESTAGER,5,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 48),
                            new ItemStack(ModItems.EXPERT_QUEST_BADGE, 1),
                            1, 1, 0.02f
                    )));
                });

        //expert questager

        TradeOfferHelper.registerVillagerOffers(EXPERT_QUESTAGER,1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Blocks.EMERALD_BLOCK, 5),
                            new ItemStack(ModItems.SACK_OF_SCULK_QUEST_PIN, 1),
                            1, 1, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.SACK_OF_SCULK_QUEST_PIN_COMPLETED, 1),
                            new ItemStack(Blocks.EMERALD_BLOCK, 9),
                            1, 15, 0.00f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(EXPERT_QUESTAGER,2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Blocks.EMERALD_BLOCK, 7),
                            new ItemStack(ModItems.WIDDLE_AND_WITHER_QUEST_PIN, 1),
                            1, 1, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.WIDDLE_AND_WITHER_QUEST_PIN_COMPLETED, 1),
                            new ItemStack(Blocks.EMERALD_BLOCK, 14),
                            1, 75, 0.00f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(EXPERT_QUESTAGER,3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Blocks.EMERALD_BLOCK, 8),
                            new ItemStack(ModItems.THAT_FEELING_IS_FREEING_QUEST_PIN, 1),
                            1, 1, 0.00f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.THAT_FEELING_IS_FREEING_QUEST_PIN_COMPLETED, 1),
                            new ItemStack(Blocks.EMERALD_BLOCK, 18),
                            1, 155, 0.00f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(EXPERT_QUESTAGER,4,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 30),
                            new ItemStack(ModItems.BACK_TO_EARTH_PART_I_QUEST_PIN, 1),
                            1, 250, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(EXPERT_QUESTAGER,5,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Blocks.EMERALD_BLOCK, 2),
                            new ItemStack(ModItems.MASTER_QUEST_BADGE, 1),
                            1, 1, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.BACK_TO_EARTH_PART_I_QUEST_PIN_COMPLETED, 1),
                            new ItemStack(ModItems.BACK_TO_EARTH_PART_I_RECIEPT, 1),
                            1, 1, 0.00f
                    )));
                });

    }
}
