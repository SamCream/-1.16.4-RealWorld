package com.samcream.realworld.realworld.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class Blade extends Item{
    public Blade() {
        super(new Item.Properties().group(ItemGroup.MATERIALS));
    }
    @SubscribeEvent
    public static void registerBlocks(PlayerInteractEvent.RightClickItem event) {
        float health = event.getPlayer().getHealth();
        if (health >= 3) {
            event.getPlayer().setHealth(health-3);
        }
    }

}
