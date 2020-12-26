package com.rhseung.hc.init;

import com.rhseung.hc.HapdongCraft;
import com.rhseung.hc.Registration;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;

import javax.annotation.Nullable;

@ObjectHolder(HapdongCraft.MOD_ID)
@Mod.EventBusSubscriber(modid = HapdongCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks {
    public static Block bluestone = null;

    @SubscribeEvent
    public static void registerAll(RegistryEvent.Register<Block> event) {
        bluestone = register("blue_stone", new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6F).sound(SoundType.STONE)));

        for (Metal metal : Metal.values()) {
            register(metal.getName() + "_block", metal.getStorageBlock());
        }
    }

    private static <T extends Block> T register(String name, T block) {
        BlockItem item = new BlockItem(block, new Item.Properties().group(ItemGroup.MISC));
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
