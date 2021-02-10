package com.samcream.realworld.realworld.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class BlockList {
    public static Block Magnesite;

    @SubscribeEvent
    public void Destroy(BlockEvent.BreakEvent event) {
        event.setCanceled(true);
        event.setExpToDrop(30);
    }
}
