package net.dancodes.simplemoney;

import net.dancodes.simplemoney.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleMoney implements ModInitializer {
	public static final String MOD_ID = "simple-money";
	public static final Logger LOGGER = LoggerFactory.getLogger("simple-money");

	@Override
	public void onInitialize() {

		LOGGER.info("Simple Money starting!");
		ModItems.registerModItems();
	}
}