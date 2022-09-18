package net.lunarluned.questagers.villager;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.lunarluned.questagers.Questagers;
import net.lunarluned.questagers.block.ModBlocks;
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

    public static final PointOfInterestType QUEST_STATION = registerPOI("quest_station", ModBlocks.QUEST_BLOCK);
    public static final VillagerProfession QUESTAGER = registerProfession("questager",
            RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE_KEY, new Identifier(Questagers.MOD_ID, "quest_station")));

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
        TradeOfferHelper.registerVillagerOffers(QUESTAGER,1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(Items.ECHO_SHARD, 1),
                            6, 2, 0.02f
                    )));
                });
    }
}
