package de.mari_023.forge.phoenixutilities;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentBase;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DeathEventHandler {
    @SubscribeEvent(priority = EventPriority.NORMAL)
    public void Respawn(net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerRespawnEvent event) {
        event.player.addItemStackToInventory(new ItemStack(Item.getByNameOrId("minecraft:poisonous_potato")));
        event.player.sendMessage(new TextComponentBase() {
            @Override
            public String getUnformattedComponentText() {
                return "test";
            }

            @Override
            public ITextComponent createCopy() {
                return null;
            }
        });
    }
}