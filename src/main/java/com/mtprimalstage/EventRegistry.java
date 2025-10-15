package com.mtprimalstage;

import com.mtprimalstage.primalconditions.*;
import net.minecraftforge.common.MinecraftForge;

public class EventRegistry {

    public static void registerEvents() {

        MinecraftForge.EVENT_BUS.register(new NoHandWoodBreakHandler());
        MinecraftForge.EVENT_BUS.register(new EndPortalFrameDropHandler());
        MinecraftForge.EVENT_BUS.register(new LeafDropHandler());
        MinecraftForge.EVENT_BUS.register(new GrassDropHandler());
        MinecraftForge.EVENT_BUS.register(new GravelDropHandler());

    }
}