package com.endetrix.allthethings.util;

import com.endetrix.allthethings.AllTheThings;
import com.endetrix.allthethings.blocks.BlockItemBase;
import com.endetrix.allthethings.blocks.MoonstoneBlock;
import com.endetrix.allthethings.blocks.MoonstoneOre;
import com.endetrix.allthethings.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, AllTheThings.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, AllTheThings.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //New Items below

    public static final RegistryObject<Item> MOONSTONE = ITEMS.register("moonstone", ItemBase::new);
    public static final RegistryObject<Item> SUNSTONE = ITEMS.register("sunstone", ItemBase::new);
    public static final RegistryObject<Item> MYSTERIOUSFABRIC = ITEMS.register("mysterious_fabric", ItemBase::new);




    // New Blocks

    public static final RegistryObject<Block> MOONSTONE_BLOCK = BLOCKS.register("moonstone_block", MoonstoneBlock::new);
    public static final RegistryObject<Block> MOONSTONE_ORE = BLOCKS.register("moonstone_ore", MoonstoneOre::new);


    // New BlockItems

    public static final RegistryObject<Item> MOONSTONE_BLOCK_ITEM = ITEMS.register("moonstone_block", () -> new BlockItemBase(MOONSTONE_BLOCK.get()));
    public static final RegistryObject<Item> MOONSTONE_ORE_ITEM = ITEMS.register("moonstone_ore", () -> new BlockItemBase(MOONSTONE_ORE.get()));

}
