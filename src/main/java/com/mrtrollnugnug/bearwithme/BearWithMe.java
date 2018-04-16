package com.mrtrollnugnug.bearwithme;

import com.mrtrollnugnug.bearwithme.common.CommonProxy;
import com.mrtrollnugnug.bearwithme.handler.ConfigurationHandler;
import com.mrtrollnugnug.bearwithme.handler.ContentHandler;
import com.mrtrollnugnug.bearwithme.lib.Constants;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Constants.MOD_ID, name = Constants.MOD_NAME, version = Constants.VERSION_NUMBER)
public class BearWithMe {

    @Mod.Instance(Constants.MOD_ID)
    public static BearWithMe instance;

    @SidedProxy(clientSide = Constants.CLIENT_PROXY_CLASS, serverSide = Constants.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    
    @EventHandler
    public void preInit (FMLPreInitializationEvent event) {
    	
        ConfigurationHandler.initConfig(event.getSuggestedConfigurationFile()); 	
    	MinecraftForge.EVENT_BUS.register(new ContentHandler());
        proxy.preInit();
    }

    @EventHandler
    public void init (FMLInitializationEvent event) {

        proxy.init();
    }

    @EventHandler
    public void postInit (FMLPostInitializationEvent event) {

        proxy.postInit();
    }
}
