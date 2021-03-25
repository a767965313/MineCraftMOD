package com.eric.exampleMod.event;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * @author Eric
 * @ProjectName MineCraftMOD
 * @description 事件處理器
 * @CreateTime 2021-03-23 17:21:44
 */
//事件总线发布器
@EventBusSubscriber
public class EventHandler {
    //发布事件
    @SubscribeEvent
    public static void onPlayerJoin(EntityJoinWorldEvent event)
    {
        Entity entity = event.getEntity();
        if(entity instanceof EntityPlayer)
        {
            String message = "Welcome to FMLTutor," + entity.getName() + "!";
            TextComponentString text = new TextComponentString(message);
            entity.sendMessage(text);
        }
    }

}
