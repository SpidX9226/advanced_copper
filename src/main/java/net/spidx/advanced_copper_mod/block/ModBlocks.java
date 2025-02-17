package net.spidx.advanced_copper_mod.block;

import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FurnaceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.spidx.advanced_copper_mod.AdvancedCopperMod;
import net.spidx.advanced_copper_mod.block.custom.ProductionFurnaceBlock;

public class ModBlocks extends BlockEntityRenderers {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(AdvancedCopperMod.MOD_ID);

    public static final DeferredBlock<ProductionFurnaceBlock> PRODUCTION_FURNACE_BLOCK = BLOCKS.register(
            "production_furnace", registryName -> new ProductionFurnaceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLAST_FURNACE).setId(ResourceKey.create(Registries.BLOCK, registryName)))
    );

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
