package com.mtprimalstage.primaltools;

import com.mtprimalstage.MTPrimalCore;
import net.minecraft.item.ItemAxe;

public class ItemPrimitiveAxe extends ItemAxe {

    public ItemPrimitiveAxe() {
        super(ToolMaterial.WOOD);
        this.setUnlocalizedName("primitive_axe");
        this.setTextureName(MTPrimalCore.MODID +":primitive_axe");
    }
}