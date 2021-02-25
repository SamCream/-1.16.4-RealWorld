package com.samcream.realworld.realworld.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class Tripod extends Block {
    public Tripod() {
        super(Properties.create(Material.ROCK).hardnessAndResistance(10,6).sound(SoundType.STONE).notSolid());
    }
}
