package com.rhseung.hc.init;

import com.rhseung.hc.HapdongCraft;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;

public class ModBlocks {
    public static Block bluestone;

    public static void registerAll(RegistryEvent.Register<Block> event) {
        if (!event.getName().equals(ForgeRegistries.ITEMS.getRegistryName())) return;

        bluestone = register("blue_stone", new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)));
    }

    private static <T extends Block> T register(String name, T block) {
        BlockItem item = new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS));
        return register(name, block, item);
    }
    private static <T extends Block> T register(String name, T block, @Nullable BlockItem item) {
        ResourceLocation id = HapdongCraft.getId(name);
        block.setRegistryName(id);
        ForgeRegistries.BLOCKS.register(block);
        if (item != null) ModItems.BLOCKS_TO_REGISTER.put(name, item);

        return block;
    }
}
