package de.mari_023.forge.phoenixutilities.items;

import de.mari_023.forge.phoenixutilities.PhoenixUtilities;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ItemBase extends Item {
    public ItemBase(String name) {
        super();
        setTranslationKey(name);
        setRegistryName(PhoenixUtilities.MOD_ID, name);
        setCreativeTab(PhoenixUtilities.tabPhoenixUtilities);
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}