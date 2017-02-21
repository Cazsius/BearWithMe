package com.mrtrollnugnug.bearwithme.item;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemHide extends Item {

	public ItemHide() {
		super();
		setCreativeTab(CreativeTabs.MATERIALS);
		 setHasSubtypes(true);		
	}
	
	public static String[] varients = new String[] { "black", "grizzly", "panda", "polar" };
	
    @Override
    public int getMetadata (int damage) {

        return damage;
    }
	
	@Override
	 public void getSubItems (Item itemIn, CreativeTabs tab, List<ItemStack> subItems) {

        for (int meta = 0; meta < varients.length; meta++) {
            subItems.add(new ItemStack(this, 1, meta));
        }
    }
	
	  @Override
	    public String getUnlocalizedName (ItemStack stack) {

	        final int meta = stack.getMetadata();

	        if (!(meta >= 0 && meta < varients.length))
	            return super.getUnlocalizedName() + "." + varients[0];

	        return super.getUnlocalizedName() + "." + varients[meta];
	  }		
}
