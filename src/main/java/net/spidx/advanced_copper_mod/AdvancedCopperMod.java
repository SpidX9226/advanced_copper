package net.spidx.advanced_copper_mod;

import net.spidx.advanced_copper_mod.block.ModBlockEntities;
import net.spidx.advanced_copper_mod.block.ModBlocks;
import net.spidx.advanced_copper_mod.item.ModCreativeModTabs;
import net.spidx.advanced_copper_mod.item.ModItems;
import net.spidx.advanced_copper_mod.util.ModRecipeSerializer;
import net.spidx.advanced_copper_mod.util.ModRecipeType;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.neoforge.registries.datamaps.*;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(AdvancedCopperMod.MOD_ID)
public class AdvancedCopperMod {
    public static final String MOD_ID = "advanced_copper";
    private static final Logger LOGGER = LogUtils.getLogger();

    public AdvancedCopperMod(IEventBus modEventBus, ModContainer modContainer)
    {
        modEventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);
        ModCreativeModTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModBlockEntities.BLOCK_ENTITY_TYPES.register(modEventBus);
        ModRecipeType.RECIPE_TYPE.register(modEventBus);
        ModRecipeSerializer.RECIPE_SERIALIZER.register(modEventBus);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }


    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        //if (event.getTabKey() == CreativeModeTabs.INGREDIENTS)
        //    event.accept(ModItems.OXIDIZED_COPPER_INGOT);
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}