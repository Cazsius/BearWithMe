package com.mrtrollnugnug.bearwithme;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class CommonProxy {

	public void preInit() 
	{

	}
	public void init() {
		Collection<Biome> gList = new ArrayList<>();
		Collections.addAll(gList, BiomeDictionary.getBiomesForType(Type.PLAINS));
		Collections.addAll(gList, BiomeDictionary.getBiomesForType(Type.FOREST));
		Collections.addAll(gList, BiomeDictionary.getBiomesForType(Type.HILLS));
		EntityRegistry.registerModEntity(EntityGrizzlyBear.class, "grizzlybear", 1,
				BearWithMe.instance, 80, 3, true, new Color(255, 255, 255).getRGB(),
				new Color(119, 84, 57).getRGB());
		EntityRegistry.addSpawn(EntityGrizzlyBear.class, 7, 1, 1, EnumCreatureType.MONSTER,
				gList.toArray(new Biome[0]));
		
		
		Collection<Biome> bList = new ArrayList<>();
		Collections.addAll(bList, BiomeDictionary.getBiomesForType(Type.CONIFEROUS));
		Collections.addAll(bList, BiomeDictionary.getBiomesForType(Type.MESA));
		Collections.addAll(bList, BiomeDictionary.getBiomesForType(Type.SAVANNA));
		Collections.addAll(bList, BiomeDictionary.getBiomesForType(Type.SPOOKY));
		
		EntityRegistry.registerModEntity(EntityBlackBear.class, "blackbear", 1,
				BearWithMe.instance, 80, 3, true, new Color(255, 255, 255).getRGB(),
				new Color(0, 0, 0).getRGB());
		EntityRegistry.addSpawn(EntityBlackBear.class, 7, 1, 1, EnumCreatureType.MONSTER,
				bList.toArray(new Biome[0]));
		
		
	}

	public void postInit() 
	{

	}

}
