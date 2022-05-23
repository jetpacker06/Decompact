package com.jetpacker06.decompact;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("decompact")
public class Decompact {
    public Decompact() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
