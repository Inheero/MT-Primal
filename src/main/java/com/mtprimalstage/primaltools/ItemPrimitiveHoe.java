package com.mtprimalstage.primaltools;

import com.mtprimalstage.MTPrimalCore;
import net.minecraft.item.ItemHoe;

public class ItemPrimitiveHoe extends ItemHoe {

    public ItemPrimitiveHoe() {
        super(ToolMaterial.WOOD);
        this.setUnlocalizedName("primitive_hoe");
        this.setTextureName(MTPrimalCore.MODID +":primitive_hoe");
    }
}