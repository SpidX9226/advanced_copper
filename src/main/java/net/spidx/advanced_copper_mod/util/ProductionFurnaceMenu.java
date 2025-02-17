package net.spidx.advanced_copper_mod.util;

import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractFurnaceMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.RecipeBookType;
import net.minecraft.world.item.crafting.RecipePropertySet;
import net.minecraft.world.item.crafting.RecipeType;

public class ProductionFurnaceMenu extends AbstractFurnaceMenu {
    public ProductionFurnaceMenu(int containerId, Inventory playerInventory) {
        super(ModMenuType.PRODUCTION_FURNACE_MENU, ModRecipeType.FUSION_RECIPE.get(), RecipePropertySet.FURNACE_INPUT, RecipeBookType.FURNACE, containerId, playerInventory);
    }

    public ProductionFurnaceMenu(int containerId, Inventory playerInventory, Container blastFurnaceContainer, ContainerData blastFurnaceData) {
        super(
                ModMenuType.PRODUCTION_FURNACE_MENU,
                ModRecipeType.FUSION_RECIPE.get(),
                RecipePropertySet.FURNACE_INPUT,
                RecipeBookType.FURNACE,
                containerId,
                playerInventory,
                blastFurnaceContainer,
                blastFurnaceData
        );
    }
}

