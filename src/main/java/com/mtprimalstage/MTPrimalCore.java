package com.mtprimalstage;

import com.mtprimalstage.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

@Mod(modid = MTPrimalCore.MODID, version = MTPrimalCore.VERSION, name = MTPrimalCore.MODNAME)
public class MTPrimalCore {
    public static final String MODID = "mtprimalstage";
    public static final String VERSION = "@VERSION@";
    public static final String MODNAME = "MT Primal";

    @Mod.Instance(MODID)
    public static MTPrimalCore instance;

    public static CreativeTabs tab = new CreativeTabs("mt_primal_tab") {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(Blocks.stonebrick);
        }
    };


    @SidedProxy(clientSide = "com.mtprimalstage.proxy.ClientProxy", serverSide = "com.mtprimalstage.proxy.CommonProxy")
    public static CommonProxy proxy;



    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModItems.registerItems();
        DropConfig.init(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {proxy.init(event);
        EventRegistry.registerEvents();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
}