package net.spidx.advanced_copper_mod.block.custom;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractFurnaceMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.RecipeBookType;
import net.minecraft.world.item.crafting.RecipePropertySet;
import net.minecraft.world.item.crafting.RecipeType;
import net.spidx.advanced_copper_mod.block.ModBlockEntities;
import net.spidx.advanced_copper_mod.util.ModMenuType;

public class ProductionFurnaceMenu extends AbstractFurnaceMenu {
    public ProductionFurnaceMenu(int containerId, Inventory playerInventory) {
        super(ModMenuType.PRODUCTION_FURNACE_MENU, RecipeType.BLASTING, RecipePropertySet.FURNACE_INPUT, RecipeBookType.FURNACE, containerId, playerInventory);
    }


}
