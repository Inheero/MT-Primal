package com.mtprimalstage.proxy;


import com.mtprimalstage.ModItems;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        ModItems.registerItems();
    }

    public void init(FMLInitializationEvent event) {
    }

    public void postInit(FMLPostInitializationEvent event) {
    }

    public void registerRenderers() {
        // Пустая реализация для серверной стороны
    }

}