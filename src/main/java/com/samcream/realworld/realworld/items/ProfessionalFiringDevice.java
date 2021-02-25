package com.samcream.realworld.realworld.items;
import net.minecraft.item.FlintAndSteelItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.property.Properties;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ProfessionalFiringDevice extends FlintAndSteelItem {
    public ProfessionalFiringDevice() {
        super(new Properties().group(ItemGroup.MATERIALS).maxDamage(1500)/*.maxStackSize(1)*/);
    }
}
