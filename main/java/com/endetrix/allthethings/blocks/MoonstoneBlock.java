package com.endetrix.allthethings.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class MoonstoneBlock extends Block {

    public MoonstoneBlock() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(6.0f, 7.0f)
                .harvestTool(ToolType.PICKAXE)
                .sound(SoundType.METAL)
                .harvestLevel(2)
                );


    }
}
