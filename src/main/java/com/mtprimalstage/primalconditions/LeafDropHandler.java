package com.mtprimalstage.primalconditions;

import com.mtprimalstage.DropConfig;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;

import java.util.Random;

public class LeafDropHandler {

    private final Random rand = new Random();

    @SubscribeEvent
    public void onLeafHarvest(BlockEvent.HarvestDropsEvent event) {
        Block block = event.block;

        if (block.isLeaves(event.world, event.x, event.y, event.z)) {

            if (rand.nextInt(100) < DropConfig.LEAF_STICK_CHANCE) {
                event.drops.add(new ItemStack(Items.stick, 1));
            }
        }
    }
}