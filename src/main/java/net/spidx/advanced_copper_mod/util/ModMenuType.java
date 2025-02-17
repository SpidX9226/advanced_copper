package net.spidx.advanced_copper_mod.util;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.flag.FeatureElement;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.spidx.advanced_copper_mod.block.custom.ProductionFurnaceMenu;

public class ModMenuType<T extends AbstractContainerMenu> implements FeatureElement, net.neoforged.neoforge.common.extensions.IMenuTypeExtension<T>{
    public static final MenuType<ProductionFurnaceMenu> PRODUCTION_FURNACE_MENU = register("production_furnace", ProductionFurnaceMenu::new);
    private final FeatureFlagSet requiredFeatures;
    private final MenuType.MenuSupplier<T> constructor;

    public ModMenuType(FeatureFlagSet requiredFeatures, MenuType.MenuSupplier<T> constructor) {
        this.requiredFeatures = requiredFeatures;
        this.constructor = constructor;
    }

    private static <T extends AbstractContainerMenu> MenuType<T> register(String key, MenuType.MenuSupplier<T> factory) {
        return Registry.register(BuiltInRegistries.MENU, key, new MenuType<>(factory, FeatureFlags.VANILLA_SET));
    }

    @Override
    public FeatureFlagSet requiredFeatures() {
        return this.requiredFeatures;
    }

    public T create(int containerId, Inventory playerInventory) {
        return this.constructor.create(containerId, playerInventory);
    }

    @Override
    public T create(int containerId, Inventory playerInventory, net.minecraft.network.RegistryFriendlyByteBuf extraData) {
        if (this.constructor instanceof net.neoforged.neoforge.network.IContainerFactory) {
            return ((net.neoforged.neoforge.network.IContainerFactory<T>) this.constructor).create(containerId, playerInventory, extraData);
        }
        return create(containerId, playerInventory);
    }
}
