package de.ellpeck.naturesaura.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public final class ModBlocks {

    public static final Block ANCIENT_LOG = new BlockAncientLog();
    public static final Block ANCIENT_BARK = new BlockImpl("ancient_bark", Material.WOOD).setSoundType(SoundType.WOOD).setHardness(2F);
    public static final Block ANCIENT_LEAVES = new BlockAncientLeaves();
    public static final Block ANCIENT_SAPLING = new BlockAncientSapling();
}
