package net.spidx.advanced_copper_mod.block.custom;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AbstractFurnaceBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.spidx.advanced_copper_mod.block.ModBlockEntities;

import javax.annotation.Nullable;

public class WeatheredProductionFurnaceBlock extends ProductionFurnaceBlock implements WeatheringCopper{
    public static final MapCodec<WeatheredProductionFurnaceBlock> CODEC = RecordCodecBuilder.mapCodec(
            instance -> instance.group(
                            WeatheringCopper.WeatherState.CODEC.fieldOf("weathering_state").forGetter(WeatheredProductionFurnaceBlock::getAge),
                            propertiesCodec()
                    )
                    .apply(instance, WeatheredProductionFurnaceBlock::new)
    );

    private final WeatheringCopper.WeatherState weatherState;

    @Override
    public MapCodec<WeatheredProductionFurnaceBlock> codec() {
        return CODEC;
    }

    public WeatheredProductionFurnaceBlock(WeatheringCopper.WeatherState weatherState, Properties p_49773_) {
        super(p_49773_);
        this.weatherState = weatherState;
    }

    @Override
    protected void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource randomSource) {
        this.changeOverTime(state, level, pos, randomSource);
    }

    @Override
    protected boolean isRandomlyTicking(BlockState state) {
        return true;
    }

    public WeatheringCopper.WeatherState getAge() {
        return this.weatherState;
    }
}
