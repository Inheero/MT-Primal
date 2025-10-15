package com.mtprimalstage.primaltools;

import com.mtprimalstage.MTPrimalCore;
import net.minecraft.item.ItemSpade;

public class ItemPrimitiveShovel  extends ItemSpade {

    public ItemPrimitiveShovel() {
        super(ToolMaterial.WOOD);
        this.setUnlocalizedName("primitive_shovel");
        this.setTextureName(MTPrimalCore.MODID +":primitive_shovel");
    }
}