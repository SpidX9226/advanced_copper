package net.spidx.advanced_copper_mod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.spidx.advanced_copper_mod.AdvancedCopperMod;

import java.util.function.Supplier;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AdvancedCopperMod.MOD_ID);

    public static final Supplier<CreativeModeTab> ADVANCED_COPPER_TAB = CREATIVE_MODE_TAB.register("advanced_copper_tab",
            ()-> CreativeModeTab.builder()
                    .icon(()-> new ItemStack(ModItems.OXIDIZED_COPPER_INGOT.get()))
                    .title(Component.translatable("creative_tab.advanced_copper.advanced_copper_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Items.COPPER_INGOT);
                        output.accept(ModItems.EXPOSED_COPPER_INGOT.get());
                        output.accept(ModItems.WEATHERED_COPPER_INGOT.get());
                        output.accept(ModItems.OXIDIZED_COPPER_INGOT.get());

                        output.accept(ModItems.COPPER_SWORD.get());
                        output.accept(ModItems.COPPER_PICKAXE.get());
                        output.accept(ModItems.COPPER_AXE.get());
                        output.accept(ModItems.COPPER_SHOVEL.get());
                        output.accept(ModItems.COPPER_HOE.get());

                        output.accept(ModItems.EXPOSED_COPPER_SWORD.get());
                        output.accept(ModItems.EXPOSED_COPPER_PICKAXE.get());
                        output.accept(ModItems.EXPOSED_COPPER_AXE.get());
                        output.accept(ModItems.EXPOSED_COPPER_SHOVEL.get());
                        output.accept(ModItems.EXPOSED_COPPER_HOE.get());

                        output.accept(ModItems.WEATHERED_COPPER_SWORD.get());
                        output.accept(ModItems.WEATHERED_COPPER_PICKAXE.get());
                        output.accept(ModItems.WEATHERED_COPPER_AXE.get());
                        output.accept(ModItems.WEATHERED_COPPER_SHOVEL.get());
                        output.accept(ModItems.WEATHERED_COPPER_HOE.get());

                        output.accept(ModItems.OXIDIZED_COPPER_SWORD.get());
                        output.accept(ModItems.OXIDIZED_COPPER_PICKAXE.get());
                        output.accept(ModItems.OXIDIZED_COPPER_AXE.get());
                        output.accept(ModItems.OXIDIZED_COPPER_SHOVEL.get());
                        output.accept(ModItems.OXIDIZED_COPPER_HOE.get());

                        output.accept(ModItems.PRODUCTION_FURNACE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}