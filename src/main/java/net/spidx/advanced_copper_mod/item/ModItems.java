package net.spidx.advanced_copper_mod.item;

import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.spidx.advanced_copper_mod.AdvancedCopperMod;
import net.spidx.advanced_copper_mod.block.ModBlocks;
import net.spidx.advanced_copper_mod.item.custom.ModToolMaterials;

import javax.xml.crypto.Data;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AdvancedCopperMod.MOD_ID);

    // INGOTS
    public static final DeferredItem<Item> EXPOSED_COPPER_INGOT = ITEMS.registerItem("exposed_copper_ingot", Item::new);
    public static final DeferredItem<Item> WEATHERED_COPPER_INGOT = ITEMS.registerItem("weathered_copper_ingot", Item::new);
    public static final DeferredItem<Item> OXIDIZED_COPPER_INGOT = ITEMS.registerItem("oxidized_copper_ingot", Item::new);

    // TOOLS:
    // COPPER
    public static final DeferredItem<Item> COPPER_SWORD = ITEMS.registerItem("copper_sword", (properties
            -> new Item(new Item.Properties()
                    .sword(ModToolMaterials.COPPER_MATERIAL, 3.0f, -2.4f).setId(ResourceKey.create(Registries.ITEM, properties.effectiveModel()))
    )));
    public static final DeferredItem<Item> COPPER_PICKAXE = ITEMS.registerItem("copper_pickaxe", properties
            -> new Item(new Item.Properties().pickaxe(ModToolMaterials.COPPER_MATERIAL,
            1.0f,
            -2.8f).setId(ResourceKey.create(Registries.ITEM, properties.effectiveModel())
    )));
    public static final DeferredItem<Item> COPPER_AXE = ITEMS.registerItem("copper_axe", properties -> new AxeItem(
            ModToolMaterials.COPPER_MATERIAL,
            6.5f,
            -3.2f,
            properties
    ));
    public static final DeferredItem<Item> COPPER_SHOVEL = ITEMS.registerItem("copper_shovel", properties -> new ShovelItem(
            ModToolMaterials.COPPER_MATERIAL,
            1.5f,
            -3.2f,
            properties
    ));
    public static final DeferredItem<Item> COPPER_HOE = ITEMS.registerItem("copper_hoe", properties -> new HoeItem(
            ModToolMaterials.COPPER_MATERIAL,
            0.0f,
            -3.0f,
            properties
    ));
    // EXPOSED COPPER
    public static final DeferredItem<Item> EXPOSED_COPPER_SWORD = ITEMS.registerItem("exposed_copper_sword", properties -> new Item(new Item.Properties().sword(
            ModToolMaterials.EXPOSED_COPPER_MATERIAL,
            3.0f,
            -2.4f)
            .setId(ResourceKey.create(Registries.ITEM, properties.effectiveModel())
    )));
    public static final DeferredItem<Item> EXPOSED_COPPER_PICKAXE = ITEMS.registerItem("exposed_copper_pickaxe", properties -> new Item(new Item.Properties().pickaxe(
            ModToolMaterials.EXPOSED_COPPER_MATERIAL,
            1.0f,
            -2.8f
    ).setId(ResourceKey.create(Registries.ITEM, properties.effectiveModel())
    )));
    public static final DeferredItem<Item> EXPOSED_COPPER_AXE = ITEMS.registerItem("exposed_copper_axe", properties -> new AxeItem(
            ModToolMaterials.EXPOSED_COPPER_MATERIAL,
            6.5f,
            -3.2f,
            properties
    ));
    public static final DeferredItem<Item> EXPOSED_COPPER_SHOVEL = ITEMS.registerItem("exposed_copper_shovel", properties -> new ShovelItem(
            ModToolMaterials.EXPOSED_COPPER_MATERIAL,
            1.5f,
            -3.2f,
            properties
    ));
    public static final DeferredItem<Item> EXPOSED_COPPER_HOE = ITEMS.registerItem("exposed_copper_hoe", properties -> new HoeItem(
            ModToolMaterials.EXPOSED_COPPER_MATERIAL,
            0.0f,
            -3.0f,
            properties
    ));
    // WEATHERED COPPER
    public static final DeferredItem<Item> WEATHERED_COPPER_SWORD = ITEMS.registerItem("weathered_copper_sword", properties -> new Item(new Item.Properties().sword(
                ModToolMaterials.WEATHERED_COPPER_MATERIAL,
                3.0f,
                -2.4f
    ).setId(ResourceKey.create(Registries.ITEM, properties.effectiveModel())
    )));
    public static final DeferredItem<Item> WEATHERED_COPPER_PICKAXE = ITEMS.registerItem("weathered_copper_pickaxe", properties -> new Item(new Item.Properties().pickaxe(
            ModToolMaterials.WEATHERED_COPPER_MATERIAL,
            1.0f,
            -2.8f).setId(ResourceKey.create(Registries.ITEM, properties.effectiveModel())
    )));
    public static final DeferredItem<Item> WEATHERED_COPPER_AXE = ITEMS.registerItem("weathered_copper_axe", properties -> new AxeItem(
            ModToolMaterials.WEATHERED_COPPER_MATERIAL,
            6.5f,
            -3.2f,
            properties
    ));
    public static final DeferredItem<Item> WEATHERED_COPPER_SHOVEL = ITEMS.registerItem("weathered_copper_shovel", properties -> new ShovelItem(
            ModToolMaterials.WEATHERED_COPPER_MATERIAL,
            1.5f,
            -3.2f,
            properties
    ));
    public static final DeferredItem<Item> WEATHERED_COPPER_HOE = ITEMS.registerItem("weathered_copper_hoe", properties -> new HoeItem(
            ModToolMaterials.WEATHERED_COPPER_MATERIAL,
            0.0f,
            -3.0f,
            properties
    ));
    // OXIDIZED COPPER
    public static final DeferredItem<Item> OXIDIZED_COPPER_SWORD = ITEMS.registerItem("oxidized_copper_sword", properties -> new Item( new Item.Properties().sword(
            ModToolMaterials.OXIDIZED_COPPER_MATERIAL,
            3.0f,
            -2.4f).setId(ResourceKey.create(Registries.ITEM, properties.effectiveModel())
    )));
    public static final DeferredItem<Item> OXIDIZED_COPPER_PICKAXE = ITEMS.registerItem("oxidized_copper_pickaxe", properties -> new Item( new Item.Properties().pickaxe(
            ModToolMaterials.OXIDIZED_COPPER_MATERIAL,
            1.0f,
            -2.8f).setId(ResourceKey.create(Registries.ITEM, properties.effectiveModel())
    )));
    public static final DeferredItem<Item> OXIDIZED_COPPER_AXE = ITEMS.registerItem("oxidized_copper_axe", properties -> new AxeItem(
            ModToolMaterials.OXIDIZED_COPPER_MATERIAL,
            6.5f,
            -3.2f,
            properties
    ));
    public static final DeferredItem<Item> OXIDIZED_COPPER_SHOVEL = ITEMS.registerItem("oxidized_copper_shovel", properties -> new ShovelItem(
            ModToolMaterials.OXIDIZED_COPPER_MATERIAL,
            1.5f,
            -3.2f,
            properties
    ));
    public static final DeferredItem<Item> OXIDIZED_COPPER_HOE = ITEMS.registerItem("oxidized_copper_hoe", properties -> new HoeItem(
            ModToolMaterials.OXIDIZED_COPPER_MATERIAL,
            0.0f,
            -3.0f,
            properties
    ));

    //BLOCKS ITEMS
    public static final DeferredItem<BlockItem> PRODUCTION_FURNACE = ITEMS.registerSimpleBlockItem("production_furnace",ModBlocks.PRODUCTION_FURNACE_BLOCK, new Item.Properties());
    public static final DeferredItem<BlockItem> EXPOSED_PRODUCTION_FURNACE = ITEMS.registerSimpleBlockItem("exposed_production_furnace",ModBlocks.EXPOSED_PRODUCTION_FURNACE_BLOCK, new Item.Properties());
    public static final DeferredItem<BlockItem> WEATHERED_PRODUCTION_FURNACE = ITEMS.registerSimpleBlockItem("weathered_production_furnace",ModBlocks.WEATHERED_PRODUCTION_FURNACE_BLOCK, new Item.Properties());
    public static final DeferredItem<BlockItem> OXIDIZED_PRODUCTION_FURNACE = ITEMS.registerSimpleBlockItem("oxidized_production_furnace",ModBlocks.OXIDIZED_PRODUCTION_FURNACE_BLOCK, new Item.Properties());


    public static final DeferredItem<BlockItem> COPPER_BARS = ITEMS.registerSimpleBlockItem("copper_bars",ModBlocks.COPPER_BARS_BLOCK, new Item.Properties());
    public static final DeferredItem<BlockItem> EXPOSED_COPPER_BARS = ITEMS.registerSimpleBlockItem("exposed_copper_bars",ModBlocks.EXPOSED_COPPER_BARS_BLOCK, new Item.Properties());
    public static final DeferredItem<BlockItem> WEATHERED_COPPER_BARS = ITEMS.registerSimpleBlockItem("weathered_copper_bars",ModBlocks.WEATHERED_COPPER_BARS_BLOCK, new Item.Properties());
    public static final DeferredItem<BlockItem> OXIDIZED_COPPER_BARS = ITEMS.registerSimpleBlockItem("oxidized_copper_bars",ModBlocks.OXIDIZED_COPPER_BARS_BLOCK, new Item.Properties());

    public static final DeferredItem<BlockItem> WAXED_COPPER_BARS = ITEMS.registerSimpleBlockItem("waxed_copper_bars",ModBlocks.WAXED_COPPER_BARS_BLOCK, new Item.Properties());
    public static final DeferredItem<BlockItem> WAXED_EXPOSED_COPPER_BARS = ITEMS.registerSimpleBlockItem("waxed_exposed_copper_bars",ModBlocks.WAXED_EXPOSED_COPPER_BARS_BLOCK, new Item.Properties());
    public static final DeferredItem<BlockItem> WAXED_WEATHERED_COPPER_BARS = ITEMS.registerSimpleBlockItem("waxed_weathered_copper_bars",ModBlocks.WAXED_WEATHERED_COPPER_BARS_BLOCK, new Item.Properties());
    public static final DeferredItem<BlockItem> WAXED_OXIDIZED_COPPER_BARS = ITEMS.registerSimpleBlockItem("waxed_oxidized_copper_bars",ModBlocks.WAXED_OXIDIZED_COPPER_BARS_BLOCK, new Item.Properties());


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}