package com.mojo.drmod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.common.Mod.EventHandler;

@Mod(
        modid = DrMod.MOD_ID,
        name = DrMod.MOD_NAME,
        version = DrMod.VERSION
)
public class DrMod {
    public static final String MOD_ID = "dr-mod";
    public static final String MOD_NAME = "DrMod";
    public static final String VERSION = "1.0";

    @SideOnly(Side.CLIENT)
    @EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new RenderOverlay());
        MinecraftForge.EVENT_BUS.register(new ArmorTooltipCompare());
    }
}
