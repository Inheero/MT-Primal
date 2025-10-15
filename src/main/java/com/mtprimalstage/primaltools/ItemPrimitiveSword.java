package com.mtprimalstage.primaltools;

import com.mtprimalstage.MTPrimalCore;
import net.minecraft.item.ItemSword;

public class ItemPrimitiveSword  extends ItemSword {

    public ItemPrimitiveSword() {
        super(ToolMaterial.WOOD);
        this.setUnlocalizedName("primitive_sword");
        this.setTextureName(MTPrimalCore.MODID +":primitive_sword");
    }
}