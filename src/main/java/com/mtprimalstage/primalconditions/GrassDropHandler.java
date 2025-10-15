package com.mtprimalstage.primalconditions;

import com.mtprimalstage.DropConfig;
import com.mtprimalstage.ModItems;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;

import java.util.Random;

public class GrassDropHandler {

    private final Random rand = new Random();

    @SubscribeEvent
    public void onGrassHarvest(BlockEvent.HarvestDropsEvent event) {
        Block block = event.block;


        if (block == Blocks.tallgrass || block == Blocks.grass) {
            if (rand.nextInt(100) < DropConfig.GRASS_FIBER_CHANCE) {
                event.drops.add(new ItemStack(ModItems.PLANT_FIBER, 1));
            }
        }
    }
}