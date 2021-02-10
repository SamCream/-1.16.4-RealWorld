package com.samcream.realworld.realworld.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
public class ItemRegistry {
    public static final DeferredRegister<Item>ITEMS=DeferredRegister.create(ForgeRegistries.ITEMS,"realworld");
//    public static RegistryObject<Item> MagnesiumDust = ITEMS.register("magnesium_dust",()->{return new MagnesiumDust();});
    public static RegistryObject<Item> ProfessionalFiringDevice = ITEMS.register("professional_firing_device",()->{return new ProfessionalFiringDevice();});

}
