package net.spidx.advanced_copper_mod.block.custom;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class WeatheredCopperLanternBlock extends CopperLanternBlock implements WeatheringCopper {
    public static final MapCodec<WeatheredCopperLanternBlock> CODEC = RecordCodecBuilder.mapCodec(
            instance -> instance.group(
                            WeatheringCopper.WeatherState.CODEC.fieldOf("weathering_state").forGetter(WeatheredCopperLanternBlock::getAge),
                            propertiesCodec()
                    )
                    .apply(instance, WeatheredCopperLanternBlock::new)
    );

    private final WeatheringCopper.WeatherState weatherState;

    @Override
    public MapCodec<WeatheredCopperLanternBlock> codec() {
        return CODEC;
    }

    public WeatheredCopperLanternBlock(WeatheringCopper.WeatherState weatherState, BlockBehaviour.Properties properties) {
        super(properties);
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
