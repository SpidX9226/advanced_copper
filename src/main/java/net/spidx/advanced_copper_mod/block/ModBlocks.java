package net.spidx.advanced_copper_mod.block;

import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.spidx.advanced_copper_mod.AdvancedCopperMod;
import net.spidx.advanced_copper_mod.block.custom.*;

public class ModBlocks extends BlockEntityRenderers {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(AdvancedCopperMod.MOD_ID);

    public static final DeferredBlock<WeatheredProductionFurnaceBlock> PRODUCTION_FURNACE_BLOCK = BLOCKS.register(
            "production_furnace", registryName -> new WeatheredProductionFurnaceBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.ofFullCopy(Blocks.BLAST_FURNACE)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName)))
    );
    public static final DeferredBlock<WeatheredProductionFurnaceBlock> EXPOSED_PRODUCTION_FURNACE_BLOCK = BLOCKS.register(
            "exposed_production_furnace", registryName -> new WeatheredProductionFurnaceBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.ofFullCopy(Blocks.BLAST_FURNACE)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName)))
    );
    public static final DeferredBlock<WeatheredProductionFurnaceBlock> WEATHERED_PRODUCTION_FURNACE_BLOCK = BLOCKS.register(
            "weathered_production_furnace", registryName -> new WeatheredProductionFurnaceBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.ofFullCopy(Blocks.BLAST_FURNACE)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName)))
    );
    public static final DeferredBlock<WeatheredProductionFurnaceBlock> OXIDIZED_PRODUCTION_FURNACE_BLOCK = BLOCKS.register(
            "oxidized_production_furnace", registryName -> new WeatheredProductionFurnaceBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.ofFullCopy(Blocks.BLAST_FURNACE)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName)))
    );

    public static final DeferredBlock<IronBarsBlock> WAXED_COPPER_BARS_BLOCK = BLOCKS.register(
            "waxed_copper_bars", resourceLocation -> new IronBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)
                    .setId(ResourceKey.create(Registries.BLOCK, resourceLocation)))
    );
    public static final DeferredBlock<IronBarsBlock> WAXED_EXPOSED_COPPER_BARS_BLOCK = BLOCKS.register(
            "waxed_exposed_copper_bars", resourceLocation -> new IronBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)
                    .setId(ResourceKey.create(Registries.BLOCK, resourceLocation)))
    );
    public static final DeferredBlock<IronBarsBlock> WAXED_WEATHERED_COPPER_BARS_BLOCK = BLOCKS.register(
            "waxed_weathered_copper_bars", resourceLocation -> new IronBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)
                    .setId(ResourceKey.create(Registries.BLOCK, resourceLocation)))
    );
    public static final DeferredBlock<IronBarsBlock> WAXED_OXIDIZED_COPPER_BARS_BLOCK = BLOCKS.register(
            "waxed_oxidized_copper_bars", resourceLocation -> new IronBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)
                    .setId(ResourceKey.create(Registries.BLOCK, resourceLocation)))
    );

    public static final DeferredBlock<CopperBarsBlock> COPPER_BARS_BLOCK = BLOCKS.register(
            "copper_bars", registryName -> new CopperBarsBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName)))
    );
    public static final DeferredBlock<CopperBarsBlock> EXPOSED_COPPER_BARS_BLOCK = BLOCKS.register(
            "exposed_copper_bars", registryName -> new CopperBarsBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName)))
    );
    public static final DeferredBlock<CopperBarsBlock> WEATHERED_COPPER_BARS_BLOCK = BLOCKS.register(
            "weathered_copper_bars", registryName -> new CopperBarsBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName)))
    );
    public static final DeferredBlock<CopperBarsBlock> OXIDIZED_COPPER_BARS_BLOCK = BLOCKS.register(
            "oxidized_copper_bars", registryName -> new CopperBarsBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName)))
    );

    public static final DeferredBlock<CopperChainBlock> WAXED_COPPER_CHAIN_BLOCK = BLOCKS.register(
            "waxed_copper_chain", registryName -> new CopperChainBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName)))
    );
    public static final DeferredBlock<CopperChainBlock> WAXED_EXPOSED_COPPER_CHAIN_BLOCK = BLOCKS.register(
            "waxed_exposed_copper_chain", registryName -> new CopperChainBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName)))
    );
    public static final DeferredBlock<CopperChainBlock> WAXED_WEATHERED_COPPER_CHAIN_BLOCK = BLOCKS.register(
            "waxed_weathered_copper_chain", registryName -> new CopperChainBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName)))
    );
    public static final DeferredBlock<CopperChainBlock> WAXED_OXIDIZED_COPPER_CHAIN_BLOCK = BLOCKS.register(
            "waxed_oxidized_copper_chain", registryName -> new CopperChainBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName)))
    );


    public static final DeferredBlock<WeatheredCopperChainBlock> COPPER_CHAIN_BLOCK = BLOCKS.register(
            "copper_chain", registryName -> new WeatheredCopperChainBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName)))
    );
    public static final DeferredBlock<WeatheredCopperChainBlock> EXPOSED_COPPER_CHAIN_BLOCK = BLOCKS.register(
            "exposed_copper_chain", registryName -> new WeatheredCopperChainBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName)))
    );
    public static final DeferredBlock<WeatheredCopperChainBlock> WEATHERED_COPPER_CHAIN_BLOCK = BLOCKS.register(
            "weathered_copper_chain", registryName -> new WeatheredCopperChainBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName)))
    );
    public static final DeferredBlock<WeatheredCopperChainBlock> OXIDIZED_COPPER_CHAIN_BLOCK = BLOCKS.register(
            "oxidized_copper_chain", registryName -> new WeatheredCopperChainBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName)))
    );

    public static final DeferredBlock<WeatheredCopperLanternBlock> WAXED_COPPER_LANTERN_BLOCK = BLOCKS.register(
            "waxed_copper_lantern", registryName -> new WeatheredCopperLanternBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN)
                    .lightLevel(light -> 5)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName)))
    );
    public static final DeferredBlock<WeatheredCopperLanternBlock> WAXED_EXPOSED_COPPER_LANTERN_BLOCK = BLOCKS.register(
            "waxed_exposed_copper_lantern", registryName -> new WeatheredCopperLanternBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN)
                    .lightLevel(light -> 5)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName)))
    );
    public static final DeferredBlock<WeatheredCopperLanternBlock> WAXED_WEATHERED_COPPER_LANTERN_BLOCK = BLOCKS.register(
            "waxed_weathered_copper_lantern", registryName -> new WeatheredCopperLanternBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN)
                    .lightLevel(light -> 5)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName)))
    );
    public static final DeferredBlock<WeatheredCopperLanternBlock> WAXED_OXIDIZED_COPPER_LANTERN_BLOCK = BLOCKS.register(
            "waxed_oxidized_copper_lantern", registryName -> new WeatheredCopperLanternBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN)
                    .lightLevel(light -> 5)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName)))
    );


    public static final DeferredBlock<WeatheredCopperLanternBlock> COPPER_LANTERN_BLOCK = BLOCKS.register(
            "copper_lantern", registryName -> new WeatheredCopperLanternBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN)
                    .lightLevel(light -> 5)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName)))
    );
    public static final DeferredBlock<WeatheredCopperLanternBlock> EXPOSED_COPPER_LANTERN_BLOCK = BLOCKS.register(
            "exposed_copper_lantern", registryName -> new WeatheredCopperLanternBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN)
                    .lightLevel(light -> 5)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName)))
    );
    public static final DeferredBlock<WeatheredCopperLanternBlock> WEATHERED_COPPER_LANTERN_BLOCK = BLOCKS.register(
            "weathered_copper_lantern", registryName -> new WeatheredCopperLanternBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN)
                    .lightLevel(light -> 5)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName)))
    );
    public static final DeferredBlock<WeatheredCopperLanternBlock> OXIDIZED_COPPER_LANTERN_BLOCK = BLOCKS.register(
            "oxidized_copper_lantern", registryName -> new WeatheredCopperLanternBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN)
                    .lightLevel(light -> 5)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName)))
    );


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
