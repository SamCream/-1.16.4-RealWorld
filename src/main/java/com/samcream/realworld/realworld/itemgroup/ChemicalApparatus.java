package com.samcream.realworld.realworld.itemgroup;

import com.samcream.realworld.realworld.items.ItemRegister;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ChemicalApparatus extends ItemGroup {
    public ChemicalApparatus() {
        super("chemical_apparatus");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemRegister.Tripod.get());
    }
}