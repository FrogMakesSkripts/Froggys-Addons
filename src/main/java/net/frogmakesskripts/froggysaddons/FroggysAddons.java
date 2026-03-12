package net.frogmakesskripts.froggysaddons;

import net.fabricmc.api.ModInitializer;

import net.frogmakesskripts.froggysaddons.block.ModBlocks;
import net.frogmakesskripts.froggysaddons.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FroggysAddons implements ModInitializer {
	public static final String MOD_ID = "froggysaddons";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}