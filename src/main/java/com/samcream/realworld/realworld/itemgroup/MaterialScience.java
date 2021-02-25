package com.samcream.realworld.realworld.itemgroup;

import com.samcream.realworld.realworld.items.ItemRegister;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class MaterialScience extends ItemGroup {
    public MaterialScience() {
        super("material_science");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemRegister.MagnesiumBicarbonate.get());
    }
}