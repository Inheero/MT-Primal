package com.mtprimalstage.items;

import com.mtprimalstage.MTPrimalCore;
import net.minecraft.item.Item;

public class ItemIronChunk extends Item {

    public ItemIronChunk() {
        super();
        this.setUnlocalizedName("iron_chunk");
        this.setTextureName(MTPrimalCore.MODID +":iron_chunk");
        this.setCreativeTab(MTPrimalCore.tab);
        this.setMaxStackSize(64);
    }
}