package com.rhseung.hc.data;

import com.rhseung.hc.HapdongCraft;
import com.rhseung.hc.data.client.ModItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = HapdongCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerator {
    private DataGenerator() {}

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        net.minecraft.data.DataGenerator gen = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        gen.addProvider(new ModItemModelProvider(gen, existingFileHelper));
    }
}
