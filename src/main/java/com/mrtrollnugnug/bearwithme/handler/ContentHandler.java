package com.mrtrollnugnug.bearwithme.handler;

import com.mrtrollnugnug.bearwithme.item.ItemHide;
import com.mrtrollnugnug.bearwithme.lib.ModUtils;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootEntryItem;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.world.storage.loot.RandomValueRange;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraft.world.storage.loot.functions.LootFunction;
import net.minecraft.world.storage.loot.functions.SetCount;
import net.minecraft.world.storage.loot.functions.SetMetadata;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ContentHandler {

	//Generic Items
	public static Item itemHide;
	
	//Armor Items
	public static Item itemPolarBearBoots;
	public static Item itemPolarBearLegs;
	public static Item itemPolarBearChest;
	public static Item itemPolarBearHead;
	
	public static Item itemGrizzlyBearBoots;
	public static Item itemGrizzlyBearLegs;
	public static Item itemGrizzlyBearChest;
	public static Item itemGrizzlyBearHead;
	
	public static Item itemBlackBearBoots;
	public static Item itemBlackBearLegs;
	public static Item itemBlackBearChest;
	public static Item itemBlackBearHead;
	
	public static Item itemPandaBearBoots;
	public static Item itemPandaBearLegs;
	public static Item itemPandaBearChest;
	public static Item itemPandaBearHead;
	
	public static final ResourceLocation ENTITIES_GRIZZLY_BEAR = LootTableList.register(new ResourceLocation("bearwithme:entities/grizzly_bear"));
	public static final ResourceLocation ENTITIES_BLACK_BEAR = LootTableList.register(new ResourceLocation("bearwithme:entities/black_bear"));
	public static final ResourceLocation ENTITIES_PANDA_BEAR = LootTableList.register(new ResourceLocation("bearwithme:entities/panda_bear"));

	public static final CreativeTabs BearWithMe = new CreativeTabs("BearWithMeTab")
	{
	   		public Item getTabIconItem() {
	   			return ContentHandler.itemHide;
	   		}
	 };
	 
	 @SubscribeEvent
	 public void onLootTablesLoaded(LootTableLoadEvent event) {
	     if (event.getName().equals(LootTableList.ENTITIES_POLAR_BEAR)) {   
	    	 final LootPool main = event.getTable().getPool("main");
	    	 if (main != null) {
	    		 main.addEntry(new LootEntryItem(ContentHandler.itemHide, 4, 0, new LootFunction[] {new SetCount(new LootCondition[0], new RandomValueRange(1, 4)), 
	    				 new SetMetadata(new LootCondition[0], new RandomValueRange(3, 3))}, new LootCondition[0], "loottable:polar_bear_hide"));
	         }
	     }
	  }
	
	 public static void initBlocks () {	
	 }
	
	public static void initItems() {		
		//Armor Materials
		ArmorMaterial POLAR_BEAR = EnumHelper.addArmorMaterial("polar_bear", "bearwithme:polar_bear", 5, new int[]{3, 4, 5, 3}, 30, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
		ArmorMaterial GRIZZLY_BEAR = EnumHelper.addArmorMaterial("grizzly_bear", "bearwithme:grizzly_bear", 5, new int[]{3, 4, 6, 3}, 30, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
		ArmorMaterial BLACK_BEAR = EnumHelper.addArmorMaterial("black_bear", "bearwithme:black_bear", 5, new int[]{3, 4, 5, 2}, 30, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
		ArmorMaterial PANDA_BEAR = EnumHelper.addArmorMaterial("panda_bear", "bearwithme:panda_bear", 5, new int[]{2, 2, 3, 1}, 30, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
		
		//Generic Items
		itemHide = new ItemHide();
		ModUtils.registerItem(itemHide, "hide_bear");
		
		//Armor Items
		itemPolarBearBoots = new ItemArmor(POLAR_BEAR, 0, EntityEquipmentSlot.FEET);
		itemPolarBearLegs = new ItemArmor(POLAR_BEAR, 0, EntityEquipmentSlot.LEGS);
		itemPolarBearChest = new ItemArmor(POLAR_BEAR, 0, EntityEquipmentSlot.CHEST);
		itemPolarBearHead = new ItemArmor(POLAR_BEAR, 0, EntityEquipmentSlot.HEAD);

		ModUtils.registerItem(itemPolarBearBoots, "polar_bear_boots");
		ModUtils.registerItem(itemPolarBearLegs, "polar_bear_legs");
		ModUtils.registerItem(itemPolarBearChest, "polar_bear_chest");
		ModUtils.registerItem(itemPolarBearHead, "polar_bear_head");
		
		itemGrizzlyBearBoots = new ItemArmor(GRIZZLY_BEAR, 0, EntityEquipmentSlot.FEET);
		itemGrizzlyBearLegs = new ItemArmor(GRIZZLY_BEAR, 0, EntityEquipmentSlot.LEGS);	
		itemGrizzlyBearChest = new ItemArmor(GRIZZLY_BEAR, 0, EntityEquipmentSlot.CHEST);
		itemGrizzlyBearHead = new ItemArmor(GRIZZLY_BEAR, 0, EntityEquipmentSlot.HEAD);
		
		ModUtils.registerItem(itemGrizzlyBearBoots, "grizzly_bear_boots");
		ModUtils.registerItem(itemGrizzlyBearLegs, "grizzly_bear_legs");
		ModUtils.registerItem(itemGrizzlyBearChest, "grizzly_bear_chest");
		ModUtils.registerItem(itemGrizzlyBearHead, "grizzly_bear_head");		
		
		itemBlackBearBoots = new ItemArmor(BLACK_BEAR, 0, EntityEquipmentSlot.FEET);
		itemBlackBearLegs = new ItemArmor(BLACK_BEAR, 0, EntityEquipmentSlot.LEGS);
		itemBlackBearChest = new ItemArmor(BLACK_BEAR, 0, EntityEquipmentSlot.CHEST);
		itemBlackBearHead = new ItemArmor(BLACK_BEAR, 0, EntityEquipmentSlot.HEAD);
		
		ModUtils.registerItem(itemBlackBearBoots, "black_bear_boots");
		ModUtils.registerItem(itemBlackBearLegs, "black_bear_legs");
		ModUtils.registerItem(itemBlackBearChest, "black_bear_chest");
		ModUtils.registerItem(itemBlackBearHead, "black_bear_head");
		
		itemPandaBearBoots = new ItemArmor(PANDA_BEAR, 0, EntityEquipmentSlot.FEET);
		itemPandaBearLegs = new ItemArmor(PANDA_BEAR, 0, EntityEquipmentSlot.LEGS);
		itemPandaBearChest = new ItemArmor(PANDA_BEAR, 0, EntityEquipmentSlot.CHEST);
		itemPandaBearHead = new ItemArmor(PANDA_BEAR, 0, EntityEquipmentSlot.HEAD);
		
		ModUtils.registerItem(itemPandaBearBoots, "panda_bear_boots");
		ModUtils.registerItem(itemPandaBearLegs, "panda_bear_legs");
		ModUtils.registerItem(itemPandaBearChest, "panda_bear_chest");
		ModUtils.registerItem(itemPandaBearHead, "panda_bear_head");	
	}
	
	public static void initRecipes () {
		GameRegistry.addRecipe(new ItemStack(itemBlackBearBoots), new Object[] {"   ", "b b", "b b", 'b', new ItemStack(ContentHandler.itemHide, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(itemBlackBearBoots), new Object[] {"b b", "b b", "   ", 'b', new ItemStack(ContentHandler.itemHide, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(itemBlackBearLegs), new Object[] {"bbb", "b b", "b b", 'b', new ItemStack(ContentHandler.itemHide, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(itemBlackBearChest), new Object[] {"b b", "bbb", "bbb", 'b', new ItemStack(ContentHandler.itemHide, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(itemBlackBearHead), new Object[] {"bbb", "b b", "   ", 'b', new ItemStack(ContentHandler.itemHide, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(itemBlackBearHead), new Object[] {"   ", "bbb", "b b", 'b', new ItemStack(ContentHandler.itemHide, 1, 0)});
		
		GameRegistry.addRecipe(new ItemStack(itemGrizzlyBearBoots), new Object[] {"   ", "g g", "g g", 'g', new ItemStack(ContentHandler.itemHide, 1, 1)});
		GameRegistry.addRecipe(new ItemStack(itemGrizzlyBearBoots), new Object[] {"g g", "g g", "   ", 'g', new ItemStack(ContentHandler.itemHide, 1, 1)});
		GameRegistry.addRecipe(new ItemStack(itemGrizzlyBearLegs), new Object[] {"ggg", "g g", "g g", 'g', new ItemStack(ContentHandler.itemHide, 1, 1)});
		GameRegistry.addRecipe(new ItemStack(itemGrizzlyBearChest), new Object[] {"g g", "ggg", "ggg", 'g', new ItemStack(ContentHandler.itemHide, 1, 1)});
		GameRegistry.addRecipe(new ItemStack(itemGrizzlyBearHead), new Object[] {"ggg", "g g", "   ", 'g', new ItemStack(ContentHandler.itemHide, 1, 1)});
		GameRegistry.addRecipe(new ItemStack(itemGrizzlyBearHead), new Object[] {"   ", "ggg", "g g", 'g', new ItemStack(ContentHandler.itemHide, 1, 1)});
		
		GameRegistry.addRecipe(new ItemStack(itemPandaBearBoots), new Object[] {"   ", "p p", "p p", 'p', new ItemStack(ContentHandler.itemHide, 1, 2)});
		GameRegistry.addRecipe(new ItemStack(itemPandaBearBoots), new Object[] {"p p", "p p", "   ", 'p', new ItemStack(ContentHandler.itemHide, 1, 2)});
		GameRegistry.addRecipe(new ItemStack(itemPandaBearLegs), new Object[] {"ppp", "p p", "p p", 'p', new ItemStack(ContentHandler.itemHide, 1, 2)});
		GameRegistry.addRecipe(new ItemStack(itemPandaBearChest), new Object[] {"p p", "ppp", "ppp", 'p', new ItemStack(ContentHandler.itemHide, 1, 2)});
		GameRegistry.addRecipe(new ItemStack(itemPandaBearHead), new Object[] {"ppp", "p p", "   ", 'p', new ItemStack(ContentHandler.itemHide, 1, 2)});
		GameRegistry.addRecipe(new ItemStack(itemPandaBearHead), new Object[] {"   ", "ppp", "p p", 'p', new ItemStack(ContentHandler.itemHide, 1, 2)});
		
		GameRegistry.addRecipe(new ItemStack(itemPolarBearBoots), new Object[] {"   ", "p p", "p p", 'p', new ItemStack(ContentHandler.itemHide, 1, 3)});
		GameRegistry.addRecipe(new ItemStack(itemPolarBearBoots), new Object[] {"p p", "p p", "   ", 'p', new ItemStack(ContentHandler.itemHide, 1, 3)});
		GameRegistry.addRecipe(new ItemStack(itemPolarBearLegs), new Object[] {"ppp", "p p", "p p", 'p', new ItemStack(ContentHandler.itemHide, 1, 3)});
		GameRegistry.addRecipe(new ItemStack(itemPolarBearChest), new Object[] {"p p", "ppp", "ppp", 'p', new ItemStack(ContentHandler.itemHide, 1, 3)});
		GameRegistry.addRecipe(new ItemStack(itemPolarBearHead), new Object[] {"ppp", "p p", "   ", 'p', new ItemStack(ContentHandler.itemHide, 1, 3)});
		GameRegistry.addRecipe(new ItemStack(itemPolarBearHead), new Object[] {"   ", "ppp", "p p", 'p', new ItemStack(ContentHandler.itemHide, 1, 3)});
		
	}
	
	 @SideOnly(Side.CLIENT)
	    public static void onClientPreInit () {
	        ModUtils.registerItemInvModel(itemHide, "hide_bear", ItemHide.varients);
	        
	        ModUtils.registerItemInvModel(itemPolarBearBoots);
	        ModUtils.registerItemInvModel(itemPolarBearLegs);
	        ModUtils.registerItemInvModel(itemPolarBearChest);
	        ModUtils.registerItemInvModel(itemPolarBearHead);
	        
	        ModUtils.registerItemInvModel(itemGrizzlyBearBoots);
	        ModUtils.registerItemInvModel(itemGrizzlyBearLegs);
	        ModUtils.registerItemInvModel(itemGrizzlyBearChest);
	        ModUtils.registerItemInvModel(itemPolarBearBoots);
	        
	        ModUtils.registerItemInvModel(itemBlackBearBoots);
	        ModUtils.registerItemInvModel(itemBlackBearLegs);
	        ModUtils.registerItemInvModel(itemBlackBearChest);
	        ModUtils.registerItemInvModel(itemBlackBearHead);
	        
	        ModUtils.registerItemInvModel(itemPandaBearBoots);
	        ModUtils.registerItemInvModel(itemPandaBearLegs);
	        ModUtils.registerItemInvModel(itemPandaBearChest);
	        ModUtils.registerItemInvModel(itemPandaBearHead);       
	    }	 
}
