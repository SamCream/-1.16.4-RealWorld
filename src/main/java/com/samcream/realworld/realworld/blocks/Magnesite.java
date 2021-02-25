package com.samcream.realworld.realworld.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Magnesite extends Block {
    public Magnesite() {
        super(Properties.create(Material.ROCK).hardnessAndResistance(5,6).sound(SoundType.STONE));
    }
}
