package com.mtprimalstage.primalconditions;

import com.mtprimalstage.DropConfig;
import com.mtprimalstage.ModItems;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;

import java.util.Random;

public class GravelDropHandler {

    private final Random rand = new Random();

    @SubscribeEvent
    public void onGravelHarvest(BlockEvent.HarvestDropsEvent event) {
        Block block = event.block;

        if (block == Blocks.gravel) {
            if (rand.nextInt(100) < DropConfig.GRAVEL_IRON_CHUNK_CHANCE) {
                event.drops.add(new ItemStack(ModItems.IRON_CHUNK, 1));
            }
        }
    }
}