package net.dancodes.simplemoney.item;

import net.dancodes.simplemoney.SimpleMoney;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item COPPER_COIN = registerItem("copper_coin",
            new Item(new FabricItemSettings()));
    public static final Item SILVER_COIN = registerItem("silver_coin",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SimpleMoney.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ModItemGroup.SIMPLE_MONEY, COPPER_COIN);
        addToItemGroup(ModItemGroup.SIMPLE_MONEY, SILVER_COIN);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        SimpleMoney.LOGGER.info("Registering mod items for " + SimpleMoney.MOD_ID);

        addItemsToItemGroup();
    }
}
