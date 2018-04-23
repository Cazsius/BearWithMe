package com.mrtrollnugnug.bearwithme.handler;

import java.util.ArrayList;
import java.util.Collection;

import com.mrtrollnugnug.bearwithme.BearWithMe;
import com.mrtrollnugnug.bearwithme.item.ItemHide;
import com.mrtrollnugnug.bearwithme.lib.ModUtils;
import com.mrtrollnugnug.bearwithme.common.entity.*;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.storage.loot.LootEntryItem;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.world.storage.loot.RandomValueRange;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraft.world.storage.loot.functions.LootFunction;
import net.minecraft.world.storage.loot.functions.SetCount;
import net.minecraft.world.storage.loot.functions.SetMetadata;

import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ContentHandler {

	//Generic Items
	public static Item itemHide;
	
	public static final ResourceLocation ENTITIES_GRIZZLY_BEAR = LootTableList.register(new ResourceLocation("bearwithme:entities/grizzly_bear"));
	public static final ResourceLocation ENTITIES_BLACK_BEAR = LootTableList.register(new ResourceLocation("bearwithme:entities/black_bear"));
	public static final ResourceLocation ENTITIES_PANDA_BEAR = LootTableList.register(new ResourceLocation("bearwithme:entities/panda_bear"));

	public static final CreativeTabs CREATIVE_TAB = new CreativeTabs("BearWithMe")
	{
		@SideOnly(Side.CLIENT)	
		public ItemStack getTabIconItem() {
	   		return new ItemStack(itemHide);
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
		
		//Generic Items
		itemHide = new ItemHide();
		ModUtils.registerItem(itemHide, "hide_bear");
	}
	 
	public static void initRecipes() {			
	}
	 
	public static void initEntities() {
			
		final int brown = 6442291;
		final int white = 16777215;
		final int black = 0;

		EntityRegistry.registerModEntity(ContentHandler.ENTITIES_GRIZZLY_BEAR, EntityGrizzlyBear.class, "grizzlybear", 1,
				BearWithMe.instance, 80, 3, true, brown, black);
		
		EntityRegistry.registerModEntity(ContentHandler.ENTITIES_BLACK_BEAR, EntityBlackBear.class, "blackbear", 2,
				BearWithMe.instance, 80, 3, true, black, brown);

		EntityRegistry.registerModEntity(ContentHandler.ENTITIES_PANDA_BEAR, EntityPandaBear.class, "pandabear", 3,
				BearWithMe.instance, 80, 3, true, white, black);
			
	}
		
	public static void initEntitySpawns() {

		// Second param in addSpawn controls entity spawn rate
		// EnumCreatureType MONSTER spawns at a much higher rate than CREATURE, causing bear overspawning
		
		EntityRegistry.addSpawn(EntityGrizzlyBear.class, ConfigurationHandler.getSpawnRateGrizzly(), 1, 3,
				EnumCreatureType.CREATURE, getBiomesForTypes(Type.PLAINS, Type.HILLS));
			
		EntityRegistry.addSpawn(EntityBlackBear.class, ConfigurationHandler.getSpawnRateBlack(), 1, 3,
				EnumCreatureType.CREATURE, getBiomesForTypes(Type.FOREST, Type.SPOOKY));
		
		EntityRegistry.addSpawn(EntityPandaBear.class, ConfigurationHandler.getSpawnRatePanda(), 1, 3,
				EnumCreatureType.CREATURE, getBiomesForTypes(Type.JUNGLE, Type.MAGICAL));
	}
		
	private static Biome[] getBiomesForTypes(Type... types) {

		final Collection<Biome> biomes = new ArrayList<>();

		for (final Type type : types) {

			biomes.addAll(BiomeDictionary.getBiomes(type));
		}

		return biomes.toArray(new Biome[0]);
	}
	
	@SideOnly(Side.CLIENT)
	public static void onClientPreInit () {
		ModUtils.registerItemInvModel(itemHide, "hide_bear", ItemHide.varients);
	}	 
}
