package net.frogmakesskripts.froggysaddons.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.frogmakesskripts.froggysaddons.FroggysAddons;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(FroggysAddons.MOD_ID, name), block);
    }
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(FroggysAddons.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }
    public static void registerModBlocks() {
        FroggysAddons.LOGGER.info("Registering Mod Blocks for " + FroggysAddons.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.POLISHED_SUNSTONE_BLOCK);
        });
    }

    public static final Block POLISHED_SUNSTONE_BLOCK = registerBlock(
            "polished_sunstone_block",
            new Block(
                    AbstractBlock.Settings.create()
                            .strength(4f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.HEAVY_CORE)
            )
    );
}