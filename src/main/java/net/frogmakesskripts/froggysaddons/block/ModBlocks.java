package net.frogmakesskripts.froggysaddons.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.frogmakesskripts.froggysaddons.FroggysAddons;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(FroggysAddons.MOD_ID, name), block);}

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(FroggysAddons.MOD_ID, name), new BlockItem(block, new Item.Settings()));}

    public static void registerModBlocks() {
        FroggysAddons.LOGGER.info("Registering Mod Blocks for " + FroggysAddons.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.SAPPHIRE_ORE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.POLISHED_SAPPHIRE_BLOCK);
        });
    }

    public static final Block SAPPHIRE_ORE = registerBlock(
            "sapphire_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create()
                            .strength(3f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.STONE)
            ));
    public static final Block DEEPSLATE_SAPPHIRE_ORE = registerBlock(
            "deepslate_sapphire_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create()
                            .strength(3.5f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.STONE)
            ));
    public static final Block POLISHED_SAPPHIRE_BLOCK = registerBlock(
            "polished_sapphire_block",
            new Block(
                    AbstractBlock.Settings.create()
                            .strength(3f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.POLISHED_TUFF)
            ));
}