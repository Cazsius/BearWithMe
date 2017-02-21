package com.mrtrollnugnug.bearwithme.handler;

import com.mrtrollnugnug.bearwithme.item.ItemHideBlackBear;
import com.mrtrollnugnug.bearwithme.item.ItemHideGrizzlyBear;
import com.mrtrollnugnug.bearwithme.item.ItemHidePandaBear;
import com.mrtrollnugnug.bearwithme.lib.ModUtils;

import net.minecraft.item.Item;

public class ContentHandler {

	public static Item itemHideBlackBear;
	public static Item itemHideGrizzlyBear;
	public static Item itemHidePandaBear;
	public static Item itemHidePolarBear;
	
	 public static void initBlocks () {
		 
	 }
	
	public static void initItems () {
		
		itemHideBlackBear = new ItemHideBlackBear();
		ModUtils.registerItem(itemHideBlackBear, "hide_black_bear");
		
		itemHideGrizzlyBear = new ItemHideGrizzlyBear();
		ModUtils.registerItem(itemHideGrizzlyBear, "hide_grizzly_bear");
		
		itemHidePandaBear = new ItemHidePandaBear();
		ModUtils.registerItem(itemHidePandaBear, "hide_panda_bear");
		
		itemHidePolarBear = new ItemHidePandaBear();
		ModUtils.registerItem(itemHidePolarBear, "hide_polar_bear");
	}
	
	public static void initRecipes () {
		
		
	}
}
