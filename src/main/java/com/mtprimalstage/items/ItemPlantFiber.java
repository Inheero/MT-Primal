package com.mtprimalstage.items;

import com.mtprimalstage.MTPrimalCore;
import net.minecraft.item.Item;

public class ItemPlantFiber  extends Item {

    public ItemPlantFiber() {
        super();
        this.setUnlocalizedName("plant_fiber");
        this.setTextureName(MTPrimalCore.MODID +":plant_fiber");
        this.setCreativeTab(MTPrimalCore.tab);
        this.setMaxStackSize(64);
    }
}