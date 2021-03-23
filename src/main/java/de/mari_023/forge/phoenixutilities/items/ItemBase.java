package de.mari_023.forge.phoenixutilities.items;

import de.mari_023.forge.phoenixutilities.PhoenixUtilities;
import net.minecraft.item.Item;

public class ItemBase extends Item {
    public ItemBase(String name) {
        super();
        setTranslationKey(name);
        setRegistryName(PhoenixUtilities.MOD_ID, name);
        setCreativeTab(PhoenixUtilities.tabPhoenixUtilities);
    }
}