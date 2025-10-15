package com.mtprimalstage.primalconditions;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent;

public class NoHandWoodBreakHandler {

    @SubscribeEvent
    public void onBlockBreak(BlockEvent.BreakEvent event) {
        EntityPlayer player = event.getPlayer();
        World world = event.world;
        Block block = event.block;

        if (block.isWood(world, event.x, event.y, event.z)) {
            ItemStack heldItem = player.getHeldItem();


            if (heldItem == null) {
                if (!world.isRemote) {

                    world.setBlockToAir(event.x, event.y, event.z);
                    event.setCanceled(true);

                    // Локализуемое сообщение
                    player.addChatMessage(new ChatComponentTranslation("message.infinityitems.break_wood_hand"));
                }
            }
        }
    }
}