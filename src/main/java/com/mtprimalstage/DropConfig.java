package com.mtprimalstage;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class DropConfig {

    public static int LEAF_STICK_CHANCE = 10;
    public static int GRASS_FIBER_CHANCE = 5;
    public static int GRAVEL_IRON_CHUNK_CHANCE = 5;

    public static void init(FMLPreInitializationEvent event) {
        File configFile = new File(event.getModConfigurationDirectory(), MTPrimalCore.MODID + ".cfg");
        Configuration config = new Configuration(configFile);
        config.load();

        LEAF_STICK_CHANCE = config.getInt(
                "leafStickChance",
                "drops",
                LEAF_STICK_CHANCE,
                0, 100,
                "Шанс выпадения палки из листвы (%)"
        );

        GRASS_FIBER_CHANCE = config.getInt(
                "grassFiberChance",
                "drops",
                GRASS_FIBER_CHANCE,
                0, 100,
                "Шанс выпадения растительного волокна (Plant Fiber) из травы (%)"
        );

        GRAVEL_IRON_CHUNK_CHANCE = config.getInt(
                "gravelIronChunkChance",
                "drops",
                GRAVEL_IRON_CHUNK_CHANCE,
                0, 100,
                "Шанс выпадения кусочка железа (Iron Chunk) из гравия (%)"
        );

        if (config.hasChanged()) {
            config.save();
        }
    }
}