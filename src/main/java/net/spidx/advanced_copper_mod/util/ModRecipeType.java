package net.spidx.advanced_copper_mod.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.SmeltingRecipe;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.spidx.advanced_copper_mod.AdvancedCopperMod;

import java.util.function.Supplier;

public class ModRecipeType {
    public static final DeferredRegister<RecipeType<?>> RECIPE_TYPE = DeferredRegister.create(Registries.RECIPE_TYPE, AdvancedCopperMod.MOD_ID);
    public static final Supplier<RecipeType<FusionRecipe>> FUSION_RECIPE = RECIPE_TYPE.register(
            "fusion_recipe",
            registerName -> new RecipeType<FusionRecipe>() {
                @Override
                public String toString() {
                    return registerName.toString();
                }
            }
    );
}
