package com.mtprimalstage.items;

import com.mtprimalstage.MTPrimalCore;
import net.minecraft.item.Item;

public class ItemPlantTwine  extends Item {

    public ItemPlantTwine() {
        super();
        this.setUnlocalizedName("plant_twine");
        this.setTextureName(MTPrimalCore.MODID +":plant_twine");
        this.setCreativeTab(MTPrimalCore.tab);
        this.setMaxStackSize(64);
    }
}