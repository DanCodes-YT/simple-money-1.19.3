package net.dancodes.simplemoney.item;

import net.dancodes.simplemoney.SimpleMoney;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup SIMPLE_MONEY;

    public static void registerItemGroups() {
        SIMPLE_MONEY = FabricItemGroup.builder(new Identifier(SimpleMoney.MOD_ID, "simple_money"))
                .displayName(Text.translatable("itemgroup.simple_money"))
                .icon(() -> new ItemStack(ModItems.COPPER_COIN)).build();
    }


}
