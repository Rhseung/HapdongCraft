package com.rhseung.hc.init;

import com.rhseung.hc.HapdongCraft;
import com.rhseung.hc.Registration;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;

import java.util.LinkedHashMap;
import java.util.Map;

@Mod.EventBusSubscriber(modid = HapdongCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(HapdongCraft.MOD_ID)
public class ModItems {
    static final Map<String, BlockItem> BLOCKS_TO_REGISTER = new LinkedHashMap<>();

    public static final Item test = null;

    @SubscribeEvent
    public static void registerAll(RegistryEvent.Register<Item> event) {
        //if (!event.getName().equals(ForgeRegistries.ITEMS.getRegistryName())) return;
        BLOCKS_TO_REGISTER.forEach(ModItems::register);

        for (Metal metal: Metal.values()) {
            register(metal.getName() + "_ingot", metal.getIngot());
        }
    }

    private static <T extends Item> T register(String name, T item) {
        ResourceLocation id = HapdongCraft.getId(name);
        item.setRegistryName(id);
        ForgeRegistries.ITEMS.register(item);
        return item;
    }

    //public static void register() {}
}
