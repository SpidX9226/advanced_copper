package net.spidx.advanced_copper_mod.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.BlastFurnaceMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.entity.FuelValues;
import net.minecraft.world.level.block.state.BlockState;
import net.spidx.advanced_copper_mod.AdvancedCopperMod;
import net.spidx.advanced_copper_mod.block.ModBlockEntities;
import net.spidx.advanced_copper_mod.util.ModRecipeType;

public class ProductionFurnaceBlockEntity extends AbstractFurnaceBlockEntity {
    public ProductionFurnaceBlockEntity(BlockPos pos, BlockState blockState) {
        super(ModBlockEntities.PRODUCTION_FURNACE_BLOCK_ENTITY.get(), pos, blockState, ModRecipeType.FUSION_RECIPE.get());
    }

    @Override
    protected Component getDefaultName() {
        return Component.translatable(AdvancedCopperMod.MOD_ID, "container.production_furnace");
    }

    @Override
    protected int getBurnDuration(FuelValues p_362551_, ItemStack p_58852_) {
        return super.getBurnDuration(p_362551_, p_58852_) / 2;
    }

    @Override
    protected AbstractContainerMenu createMenu(int id, Inventory player) {
        return new BlastFurnaceMenu(id, player, this, this.dataAccess);
    }
}
