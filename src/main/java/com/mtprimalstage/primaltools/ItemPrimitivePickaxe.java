package com.mtprimalstage.primaltools;

import com.mtprimalstage.MTPrimalCore;
import net.minecraft.item.ItemPickaxe;

public class ItemPrimitivePickaxe extends ItemPickaxe {
    public ItemPrimitivePickaxe() {
        super(ToolMaterial.WOOD);
        this.setUnlocalizedName("primitive_pickaxe");
        this.setTextureName(MTPrimalCore.MODID +":primitive_pickaxe");
    }
}