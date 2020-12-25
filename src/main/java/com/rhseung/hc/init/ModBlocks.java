package com.rhseung.hc.init;

import com.rhseung.hc.HapdongCraft;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;

public class ModBlocks {
    public static void registerAll(RegistryEvent.Register<Block> event) {

    }

    private static <T extends Block> T register(String name, T block, @Nullable BlockItem item) {
        ResourceLocation id = HapdongCraft.getId(name);
        block.setRegistryName(id);
        ForgeRegistries.BLOCKS.register(block);
        if (item != null) ModItems.BLOCKS_TO_REGISTER.put(name, item);

        return block;
    }
}
