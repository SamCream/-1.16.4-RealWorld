package com.samcream.realworld.realworld.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class AlcoholBurner_Full extends Block {
    public AlcoholBurner_Full() {
        super(Properties.create(Material.ROCK).hardnessAndResistance(3,3).sound(SoundType.GLASS).notSolid());
    }
}
