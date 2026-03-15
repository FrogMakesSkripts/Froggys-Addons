package net.frogmakesskripts.froggysaddons.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.frogmakesskripts.froggysaddons.FroggysAddons;
import net.frogmakesskripts.froggysaddons.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static void registerItemGroups() {
        FroggysAddons.LOGGER.info("Registering Item Groups for " + FroggysAddons.MOD_ID);}

    public static final ItemGroup FROGGYS_ADDONS_INGREDIENTS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(FroggysAddons.MOD_ID, "froggys_addons_ingredients"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.POLISHED_SAPPHIRE))
                    .displayName(Text.translatable("itemgroup.froggysaddons.froggys_addons_ingredients"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.SAPPHIRE);
                        entries.add(ModItems.POLISHED_SAPPHIRE);
                    }).build());
    public static final ItemGroup FROGGYS_ADDONS_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(FroggysAddons.MOD_ID, "froggys_addons_blocks"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModBlocks.POLISHED_SAPPHIRE_BLOCK))
                    .displayName(Text.translatable("itemgroup.froggysaddons.froggys_addons_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.POLISHED_SAPPHIRE_BLOCK);
                    }).build());
    public static final ItemGroup FROGGYS_ADDONS_NATURAL_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(FroggysAddons.MOD_ID, "froggys_addons_natural"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModBlocks.SAPPHIRE_ORE))
                    .displayName(Text.translatable("itemgroup.froggysaddons.froggys_addons_natural"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.SAPPHIRE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
                    }).build());
}