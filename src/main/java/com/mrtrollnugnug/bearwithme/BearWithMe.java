package com.mrtrollnugnug.bearwithme;

import com.mrtrollnugnug.bearwithme.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = BearWithMe.MOD_ID, name = BearWithMe.MOD_NAME)
public class BearWithMe
{

	public static final String MOD_ID = "bearwithme";
	public static final String MOD_NAME = "BearWithMe";

	@Mod.Instance("bearwithme")
	public static BearWithMe instance;

	@SidedProxy(clientSide = "com.mrtrollnugnug.bearwithme.proxy.ClientProxy",
			serverSide = "com.mrtrollnugnug.bearwithme.proxy.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		proxy.preInit();
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.init();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		proxy.postInit();
	}
}
