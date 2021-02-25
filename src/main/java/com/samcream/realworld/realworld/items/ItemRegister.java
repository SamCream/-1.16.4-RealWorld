package com.samcream.realworld.realworld.items;

import com.samcream.realworld.realworld.blocks.BlockRegister;
import com.samcream.realworld.realworld.itemgroup.ModGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
public class ItemRegister {
    public static final DeferredRegister<Item>ITEMS=DeferredRegister.create(ForgeRegistries.ITEMS,"realworld");
    //item
    public static RegistryObject<Item> ProfessionalFiringDevice = ITEMS.register("professional_firing_device",ProfessionalFiringDevice::new);
    public static RegistryObject<Item> Blade = ITEMS.register("blade",Blade::new);//,()->{return new Blade();});
    public static RegistryObject<Item> MagnesiumCarbonate= ITEMS.register("magnesium_carbonate",MagnesiumCarbonate::new);
    public static RegistryObject<Item> MagnesiumChloride= ITEMS.register("magnesium_chloride",MagnesiumChloride::new);
    public static RegistryObject<Item> MagnesiumBicarbonate= ITEMS.register("magnesium_bicarbonate",MagnesiumBicarbonate::new);
    public static RegistryObject<Item> MagnesiumChlorideHexahydrate= ITEMS.register("magnesium_chloride_hexahydrate",MagnesiumChlorideHexahydrate::new);
    //common block
    public static final RegistryObject<Item> Magnesite = ITEMS.register("magnesite", () -> new BlockItem(BlockRegister.Magnesite.get(), new Item.Properties().group(ModGroup.MATERIAL_ORE)));
    //special block
    public static final RegistryObject<Item> Tripod = ITEMS.register("tripod", () -> new BlockItem(BlockRegister.Tripod.get(), new Item.Properties().group(ModGroup.CHEMICAL_APPARATUS)));
    public static final RegistryObject<Item> LatheCNC = ITEMS.register("lathe_cnc", () -> new BlockItem(BlockRegister.LatheCNC.get(), new Item.Properties().group(ModGroup.MATERIAL_MACHINE)));
    public static final RegistryObject<Item> AlcoholBurnerEmpty = ITEMS.register("alcohol_burner_empty", () -> new BlockItem(BlockRegister.AlcoholBurnerEmpty.get(), new Item.Properties().group(ModGroup.CHEMICAL_APPARATUS)));
    public static final RegistryObject<Item> AlcoholBurnerFull = ITEMS.register("alcohol_burner_full", () -> new BlockItem(BlockRegister.AlcoholBurnerFull.get(), new Item.Properties().group(ModGroup.CHEMICAL_APPARATUS)));

}
