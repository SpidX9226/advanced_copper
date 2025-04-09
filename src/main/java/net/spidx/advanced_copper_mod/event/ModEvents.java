package net.spidx.advanced_copper_mod.event;

import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.spidx.advanced_copper_mod.block.ModBlockEntities;
import net.spidx.advanced_copper_mod.util.ModMaps;

import static net.spidx.advanced_copper_mod.util.ModMaps.OXIDATION_MAP;
import static net.spidx.advanced_copper_mod.util.ModMaps.getOxidized;

@EventBusSubscriber(modid = "advanced_copper")
public class ModEvents {
    @SubscribeEvent
    public static void onTickInventoryEvent(PlayerTickEvent.Pre event) {
        Player player = event.getEntity();
        Level level = player.level();
        Inventory inventory = player.getInventory();

        if (!level.isClientSide()) {
            for (int i = 0; i < inventory.getContainerSize(); ++i) {
                ItemStack itemStack = inventory.getItem(i);
                int count = itemStack.getCount();
                float chance = player.getRandom().nextFloat();
                int currentDamage = inventory.getItem(i).getDamageValue();;
                if (chance < 0.0004f) {
                    if (OXIDATION_MAP.containsKey(itemStack.getItem())) {
                        inventory.setItem(i, (new ItemStack(getOxidized(itemStack.getItem()), count)));
                        inventory.getItem(i).setDamageValue(currentDamage);
                    }
                }
            }
        }
    }
}