package com.mtprimalstage;

import com.mtprimalstage.items.ItemIronChunk;
import com.mtprimalstage.items.ItemPlantFiber;
import com.mtprimalstage.items.ItemPlantTwine;
import com.mtprimalstage.primaltools.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ModItems {

    public static final Item PRIMITIVE_PICKAXE = new ItemPrimitivePickaxe();
    public static final Item PRIMITIVE_AXE = new ItemPrimitiveAxe();
    public static final Item PRIMITIVE_SWORD = new ItemPrimitiveSword();
    public static final Item PRIMITIVE_SHOVEL = new ItemPrimitiveShovel();
    public static final Item PRIMITIVE_HOE = new ItemPrimitiveHoe();
    public static final Item PLANT_FIBER = new ItemPlantFiber();
    public static final Item PLANT_TWINE = new ItemPlantTwine();
    public static final Item IRON_CHUNK = new ItemIronChunk();

    public static void registerItems() {

        registerItem(PRIMITIVE_PICKAXE);
        registerItem(PRIMITIVE_AXE);
        registerItem(PRIMITIVE_SWORD);
        registerItem(PRIMITIVE_SHOVEL);
        registerItem(PRIMITIVE_HOE);
        registerItem(PLANT_FIBER);
        registerItem(PLANT_TWINE);
        registerItem(IRON_CHUNK);

    }

    public static void registerItem(Item item) {
        item.setCreativeTab(MTPrimalCore.tab);
        GameRegistry.registerItem(item, item.getUnlocalizedName());
    }
}