package com.rhseung.hc.init;

import com.rhseung.hc.HapdongCraft;
import com.rhseung.hc.Registration;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.LinkedHashMap;
import java.util.Map;

public class ModItems {
    public static final RegistryObject<Item> TEST = Registration.ITEMS.register("test", () ->
            new Item(new Item.Properties().group(ItemGroup.MISC)));

    public static void register() {}
}
