package com.samcream.realworld.realworld.items;

import com.samcream.realworld.realworld.itemgroup.ModGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class MagnesiumChloride extends Item{
    public MagnesiumChloride() {
        super(new Properties().group(ModGroup.MATERIAL_SCIENCE).maxStackSize(64));
    }

}
