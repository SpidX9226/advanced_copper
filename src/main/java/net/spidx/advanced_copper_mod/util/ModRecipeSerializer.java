package net.spidx.advanced_copper_mod.util;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.BlastingRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.spidx.advanced_copper_mod.AdvancedCopperMod;

import java.util.function.Supplier;

public class ModRecipeSerializer {
    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZER =
            DeferredRegister.create(Registries.RECIPE_SERIALIZER, AdvancedCopperMod.MOD_ID);

    public static final Supplier<RecipeSerializer<FusionRecipe>> FUSION_RECIPE = RECIPE_SERIALIZER.register(
            "fusion", registerName -> new AbstractCookingRecipe.Serializer<>(FusionRecipe::new, 100)
    );
}
