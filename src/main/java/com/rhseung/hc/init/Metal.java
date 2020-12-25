package com.rhseung.hc.init;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.LazyValue;

import java.util.Locale;

public enum Metal {
    COPPER,
    IRON;

    private final LazyValue<Block> storageBlock;
    private final LazyValue<Item> ingot;

    Metal() {
        storageBlock = new LazyValue<>(() -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)));
        ingot = new LazyValue<>(() -> new Item(new Item.Properties().group(ItemGroup.MISC)));
    }

    public String getName() {
        return name().toLowerCase(Locale.ROOT);
    }
    public Block getStorageBlock() {
        return storageBlock.getValue();
    }
    public Item getIngot() {
        return ingot.getValue();
    }
}
