package com.rhseung.hc.init;

import com.rhseung.hc.HapdongCraft;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.LinkedHashMap;
import java.util.Map;

public class ModItems {
    static final Map<String, BlockItem> BLOCKS_TO_REGISTER = new LinkedHashMap<>();

    public static void registerAll(RegistryEvent.Register<Item> event) {
        // Blocks
        BLOCKS_TO_REGISTER.forEach(ModItems::register);

        // Items
    }

    private static <T extends Item> T register(String name, T item) {
        ResourceLocation id = HapdongCraft.getId(name);
        item.setRegistryName(id);
        ForgeRegistries.ITEMS.register(item);

        return item;
    }
}
