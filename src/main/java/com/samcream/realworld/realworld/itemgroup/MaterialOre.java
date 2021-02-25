package com.samcream.realworld.realworld.itemgroup;

import com.samcream.realworld.realworld.items.ItemRegister;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class MaterialOre extends ItemGroup {
    public MaterialOre() {
        super("material_ore");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemRegister.Magnesite.get());
    }
}