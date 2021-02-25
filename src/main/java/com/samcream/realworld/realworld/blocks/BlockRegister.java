package com.samcream.realworld.realworld.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegister {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "realworld");
    public static final RegistryObject<Block> Magnesite = BLOCKS.register("magnesite",Magnesite::new);
    public static RegistryObject<Block> LatheCNC = BLOCKS.register("lathe_cnc", Lathe_CNC::new);
    public static RegistryObject<Block> AlcoholBurnerEmpty = BLOCKS.register("alcohol_burner_empty", AlcoholBurner_Empty::new);
    public static RegistryObject<Block> AlcoholBurnerFull = BLOCKS.register("alcohol_burner_full", AlcoholBurner_Full::new);
    public static RegistryObject<Block> Tripod = BLOCKS.register("tripod",Tripod::new);
    }

