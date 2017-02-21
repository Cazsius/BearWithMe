package com.mrtrollnugnug.bearwithme.handler;

import com.mrtrollnugnug.bearwithme.item.ItemHide;
import com.mrtrollnugnug.bearwithme.lib.ModUtils;

import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ContentHandler {

	public static Item itemHide;
	
	 public static void initBlocks () {
		 
	 }
	
	public static void initItems () {
		
		itemHide = new ItemHide();
		ModUtils.registerItem(itemHide, "hide_bear");
	}
	
	public static void initRecipes () {
		
		
	}
	
	 @SideOnly(Side.CLIENT)
	    public static void onClientPreInit () {

	        ModUtils.registerItemInvModel(itemHide, "hide", ItemHide.varients);
	    }
}
