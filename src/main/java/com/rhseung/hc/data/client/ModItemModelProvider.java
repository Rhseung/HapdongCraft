package com.rhseung.hc.data.client;

import com.rhseung.hc.HapdongCraft;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, HapdongCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        builder(itemGenerated, "copper_ingot", null);
        builder(itemGenerated, "iron_ingot", null);
    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name, @Nullable String path) {
        return (path != null) ? getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + path) : getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}
