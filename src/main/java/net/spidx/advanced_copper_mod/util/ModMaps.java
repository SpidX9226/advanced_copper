package net.spidx.advanced_copper_mod.util;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.spidx.advanced_copper_mod.item.ModItems;

import java.util.HashMap;
import java.util.Map;

public class ModMaps {
    public static Map<Item, Item> map = new HashMap<>();

    public ModMaps() {
        map.put(Items.COPPER_INGOT, ModItems.EXPOSED_COPPER_INGOT.get());
        map.put(ModItems.EXPOSED_COPPER_INGOT.get(), ModItems.WEATHERED_COPPER_INGOT.get());
        map.put(ModItems.WEATHERED_COPPER_INGOT.get(), ModItems.OXIDIZED_COPPER_INGOT.get());

        map.put(ModItems.COPPER_SWORD.get(), ModItems.EXPOSED_COPPER_SWORD.get());
        map.put(ModItems.EXPOSED_COPPER_SWORD.get(), ModItems.WEATHERED_COPPER_SWORD.get());
        map.put(ModItems.WEATHERED_COPPER_SWORD.get(), ModItems.OXIDIZED_COPPER_SWORD.get());

        map.put(ModItems.COPPER_PICKAXE.get(), ModItems.EXPOSED_COPPER_PICKAXE.get());
        map.put(ModItems.EXPOSED_COPPER_PICKAXE.get(), ModItems.WEATHERED_COPPER_PICKAXE.get());
        map.put(ModItems.WEATHERED_COPPER_PICKAXE.get(), ModItems.OXIDIZED_COPPER_PICKAXE.get());

        map.put(ModItems.COPPER_AXE.get(), ModItems.EXPOSED_COPPER_AXE.get());
        map.put(ModItems.EXPOSED_COPPER_AXE.get(), ModItems.WEATHERED_COPPER_AXE.get());
        map.put(ModItems.WEATHERED_COPPER_AXE.get(), ModItems.OXIDIZED_COPPER_AXE.get());

        map.put(ModItems.COPPER_SHOVEL.get(), ModItems.EXPOSED_COPPER_SHOVEL.get());
        map.put(ModItems.EXPOSED_COPPER_SHOVEL.get(), ModItems.WEATHERED_COPPER_SHOVEL.get());
        map.put(ModItems.WEATHERED_COPPER_SHOVEL.get(), ModItems.OXIDIZED_COPPER_SHOVEL.get());

        map.put(ModItems.COPPER_HOE.get(), ModItems.EXPOSED_COPPER_HOE.get());
        map.put(ModItems.EXPOSED_COPPER_HOE.get(), ModItems.WEATHERED_COPPER_HOE.get());
        map.put(ModItems.WEATHERED_COPPER_HOE.get(), ModItems.OXIDIZED_COPPER_HOE.get());
    }

    public Item getOxidized(Item item) {
        return map.getOrDefault(item, item);
    }
}
