package net.spidx.advanced_copper_mod.util;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.spidx.advanced_copper_mod.item.ModItems;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ModMaps {
    public static final Map<Item, Item> OXIDATION_MAP = createOxidationMap();

    private static Map<Item, Item> createOxidationMap() {
        Map<Item, Item> map = new HashMap<>();

        // Ingots
        addOxidationChain(map,
                Items.COPPER_INGOT,
                ModItems.EXPOSED_COPPER_INGOT.get(),
                ModItems.WEATHERED_COPPER_INGOT.get(),
                ModItems.OXIDIZED_COPPER_INGOT.get());

        // Tools
        addOxidationChain(map,
                ModItems.COPPER_SWORD.get(),
                ModItems.EXPOSED_COPPER_SWORD.get(),
                ModItems.WEATHERED_COPPER_SWORD.get(),
                ModItems.OXIDIZED_COPPER_SWORD.get());

        addOxidationChain(map,
                ModItems.COPPER_PICKAXE.get(),
                ModItems.EXPOSED_COPPER_PICKAXE.get(),
                ModItems.WEATHERED_COPPER_PICKAXE.get(),
                ModItems.OXIDIZED_COPPER_PICKAXE.get());

        addOxidationChain(map,
                ModItems.COPPER_AXE.get(),
                ModItems.EXPOSED_COPPER_AXE.get(),
                ModItems.WEATHERED_COPPER_AXE.get(),
                ModItems.OXIDIZED_COPPER_AXE.get());

        addOxidationChain(map,
                ModItems.COPPER_SHOVEL.get(),
                ModItems.EXPOSED_COPPER_SHOVEL.get(),
                ModItems.WEATHERED_COPPER_SHOVEL.get(),
                ModItems.OXIDIZED_COPPER_SHOVEL.get());

        addOxidationChain(map,
                ModItems.COPPER_HOE.get(),
                ModItems.EXPOSED_COPPER_HOE.get(),
                ModItems.WEATHERED_COPPER_HOE.get(),
                ModItems.OXIDIZED_COPPER_HOE.get());

        return Collections.unmodifiableMap(map);
    }

    private static void addOxidationChain(Map<Item, Item> map, Item... items) {
        if (items.length < 2) return;

        for (int i = 0; i < items.length - 1; i++) {
            map.put(items[i], items[i + 1]);
        }
    }

    public static Item getOxidized(Item item) {
        return OXIDATION_MAP.get(item);
    }
}
