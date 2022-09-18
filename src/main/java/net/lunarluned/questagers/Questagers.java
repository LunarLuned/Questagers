package net.lunarluned.questagers;

import net.fabricmc.api.ModInitializer;
import net.lunarluned.questagers.block.ModBlocks;
import net.lunarluned.questagers.registry.item.ModItems;
import net.lunarluned.questagers.villager.ModVillagers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Questagers implements ModInitializer {

	public static final String MOD_ID = "questagers";
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModVillagers.registerVillagers();
		ModVillagers.registerTrades();
		ModItems.registerModItems();

		LOGGER.info("Quests! Villagers! Questagers!");
	}
}
