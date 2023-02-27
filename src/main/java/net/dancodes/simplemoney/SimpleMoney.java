package net.dancodes.simplemoney;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleMoney implements ModInitializer {
	public static final String MOD_ID = "simple-money";
	public static final Logger LOGGER = LoggerFactory.getLogger("simple-money");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
	}
}