package net.spidx.advanced_copper_mod.block;

import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.spidx.advanced_copper_mod.AdvancedCopperMod;
import net.spidx.advanced_copper_mod.block.custom.ProductionFurnaceBlockEntity;

import java.util.function.Supplier;

public class ModBlockEntities extends BlockEntityRenderers {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES =
            DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, AdvancedCopperMod.MOD_ID);

    public static final Supplier<BlockEntityType<ProductionFurnaceBlockEntity>> PRODUCTION_FURNACE_BLOCK_ENTITY = BLOCK_ENTITY_TYPES.register("production_furnace_block_entity",
            () -> new BlockEntityType<>(
                    ProductionFurnaceBlockEntity::new,
                    ModBlocks.PRODUCTION_FURNACE_BLOCK.get(), ModBlocks.EXPOSED_PRODUCTION_FURNACE_BLOCK.get(), ModBlocks.WEATHERED_PRODUCTION_FURNACE_BLOCK.get(), ModBlocks.OXIDIZED_PRODUCTION_FURNACE_BLOCK.get()
            )
    );
}
