package com.samcream.realworld.realworld.itemgroup;

import com.samcream.realworld.realworld.items.ItemRegister;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class MaterialMachine extends ItemGroup {
    public MaterialMachine() {
        super("material_machine");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemRegister.LatheCNC.get());
    }
}