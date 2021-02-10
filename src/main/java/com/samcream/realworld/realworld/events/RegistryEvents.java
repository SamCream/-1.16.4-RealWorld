package com.samcream.realworld.realworld.events;
import com.samcream.realworld.realworld.blocks.BlockList;
//import com.samcream.realworld.realworld.lists.ItemList;
import com.samcream.realworld.realworld.lists.ItemList;
import com.samcream.realworld.realworld.realworld;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class RegistryEvents {
    public static final Logger LOGGER = realworld.LOGGER;
    public static final String MOD_ID = realworld.MOD_ID;
    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item>event)
    {
        event.getRegistry().registerAll(
                ItemList.MagnesiumDust=new Item(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64)).setRegistryName(location("magnesium_dust")),
                ItemList.MagnesiumCarbonate=new Item(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64)).setRegistryName(location("magnesium_carbonate")),
                ItemList.MagnesiumChloride=new Item(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64)).setRegistryName(location("magnesium_chloride")),
                ItemList.MagnesiumBicarbonate=new Item(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64)).setRegistryName(location("magnesium_bicarbonate")),
                ItemList.MagnesiumChlorideHexahydrate=new Item(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64)).setRegistryName(location("magnesium_chloride_hexahydrate")),
                ItemList.MagnesiteItem=new BlockItem(BlockList.Magnesite,new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(BlockList.Magnesite.getRegistryName())
        );
    }
    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block>event){
        event.getRegistry().registerAll(
                BlockList.Magnesite = new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(5,2).harvestLevel(3).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName(location("magnesite"))
        );
    }
    private static ResourceLocation location(String name){
        return new ResourceLocation(MOD_ID,name);
    }
}
