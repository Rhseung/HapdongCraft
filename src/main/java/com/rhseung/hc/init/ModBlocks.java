package com.rhseung.hc.init;

import com.rhseung.hc.Registration;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    /*//public static final RegistryObject<Block> TEST_BLOCK = register("test_block", new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3F, 10F).harvestLevel(2).sound(SoundType.CHAIN)));
    public static void registerAll(RegistryEvent.Register<Block> event) {
        //if (!event.getName().equals(ForgeRegistries.ITEMS.getRegistryName())) return;
        for (Metal metal : Metal.values()) {
            register(metal.getName() + "_block", metal.getStorageBlock());
        }
    }

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, T block) {
        return Registration.BLOCKS.register(name, () -> block);
    }

    private static <T extends Block> RegistryObject<T> register(String name, T block) {
        RegistryObject<T> ret = registerNoItem(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().group(ItemGroup.MISC)));
        return ret;
    }*/

    //public static void register() {}
}
