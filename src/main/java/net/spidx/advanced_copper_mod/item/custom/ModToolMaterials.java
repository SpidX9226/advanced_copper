package net.spidx.advanced_copper_mod.item.custom;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ToolMaterial;
import net.neoforged.neoforge.common.Tags;

public class ModToolMaterials {
    public static final ToolMaterial COPPER_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_STONE_TOOL,
            200,
            5f,
            1.5f,
            20,
            Tags.Items.INGOTS_COPPER
    );
    public static final ToolMaterial EXPOSED_COPPER_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_STONE_TOOL,
            190,
            5f,
            1.5f,
            16,
            Tags.Items.INGOTS_COPPER
    );
    public static final ToolMaterial WEATHERED_COPPER_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_STONE_TOOL,
            180,
            5f,
            1.5f,
            16,
            Tags.Items.INGOTS_COPPER
    );
    public static final ToolMaterial OXIDIZED_COPPER_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_STONE_TOOL,
            170,
            4.8f,
            1.6f,
            24,
            Tags.Items.INGOTS_COPPER
    );
}