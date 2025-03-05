package net.spidx.advanced_copper_mod.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.util.RandomSource;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AbstractFurnaceBlock;
import net.minecraft.world.level.block.BlastFurnaceBlock;
import net.minecraft.world.level.block.entity.BlastFurnaceBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.spidx.advanced_copper_mod.block.ModBlockEntities;
import net.spidx.advanced_copper_mod.block.ModBlocks;

import javax.annotation.Nullable;

public class ProductionFurnaceBlock extends AbstractFurnaceBlock {
    public static final MapCodec<ProductionFurnaceBlock> CODEC = simpleCodec(ProductionFurnaceBlock::new);

    @Override
    public MapCodec<? extends ProductionFurnaceBlock> codec() {
        return CODEC;
    }

    public ProductionFurnaceBlock(BlockBehaviour.Properties p_49773_) {
        super(p_49773_);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos p_152386_, BlockState p_152387_) {
        return new ProductionFurnaceBlockEntity(p_152386_, p_152387_);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level p_152382_, BlockState p_152383_, BlockEntityType<T> p_152384_) {
        return createFurnaceTicker(p_152382_, p_152384_, ModBlockEntities.PRODUCTION_FURNACE_BLOCK_ENTITY.get());
    }

    @Override
    protected void openContainer(Level level, BlockPos pos, Player player) {
        BlockEntity blockentity = level.getBlockEntity(pos);
        if (blockentity instanceof ProductionFurnaceBlockEntity) {
            player.openMenu((MenuProvider)blockentity);
        }
    }

    @Override
    public void animateTick(BlockState p_220818_, Level p_220819_, BlockPos p_220820_, RandomSource p_220821_) {
        if (p_220818_.getValue(LIT)) {
            double d0 = (double)p_220820_.getX() + 0.5;
            double d1 = (double)p_220820_.getY();
            double d2 = (double)p_220820_.getZ() + 0.5;
            if (p_220821_.nextDouble() < 0.1) {
                p_220819_.playLocalSound(d0, d1, d2, SoundEvents.BLASTFURNACE_FIRE_CRACKLE, SoundSource.BLOCKS, 1.0F, 1.0F, false);
            }

            Direction direction = p_220818_.getValue(FACING);
            Direction.Axis direction$axis = direction.getAxis();
            double d3 = 0.52;
            double d4 = p_220821_.nextDouble() * 0.6 - 0.3;
            double d5 = direction$axis == Direction.Axis.X ? (double)direction.getStepX() * 0.52 : d4;
            double d6 = p_220821_.nextDouble() * 9.0 / 16.0;
            double d7 = direction$axis == Direction.Axis.Z ? (double)direction.getStepZ() * 0.52 : d4;
            p_220819_.addParticle(ParticleTypes.SMOKE, d0 + d5, d1 + d6, d2 + d7, 0.0, 0.0, 0.0);
        }
    }
}
