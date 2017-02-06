package com.mrtrollnugnug.bearwithme.proxy;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import com.mrtrollnugnug.bearwithme.BearWithMe;
import com.mrtrollnugnug.bearwithme.common.entity.EntityBlackBear;
import com.mrtrollnugnug.bearwithme.common.entity.EntityGrizzlyBear;
import com.mrtrollnugnug.bearwithme.common.entity.EntityPandaBear;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class CommonProxy {

    public void preInit () {

    }

    public void init () {

        final Collection<Biome> gList = new ArrayList<>();
        Collections.addAll(gList, BiomeDictionary.getBiomesForType(Type.PLAINS));
        Collections.addAll(gList, BiomeDictionary.getBiomesForType(Type.FOREST));
        Collections.addAll(gList, BiomeDictionary.getBiomesForType(Type.HILLS));
        EntityRegistry.registerModEntity(EntityGrizzlyBear.class, "grizzlybear", 1, BearWithMe.instance, 80, 3, true, new Color(255, 255, 255).getRGB(), new Color(119, 84, 57).getRGB());
        EntityRegistry.addSpawn(EntityGrizzlyBear.class, 1, 1, 1, EnumCreatureType.MONSTER, gList.toArray(new Biome[0]));

        final Collection<Biome> bList = new ArrayList<>();
        Collections.addAll(bList, BiomeDictionary.getBiomesForType(Type.CONIFEROUS));
        Collections.addAll(bList, BiomeDictionary.getBiomesForType(Type.MESA));
        Collections.addAll(bList, BiomeDictionary.getBiomesForType(Type.SAVANNA));
        Collections.addAll(bList, BiomeDictionary.getBiomesForType(Type.SPOOKY));

        EntityRegistry.registerModEntity(EntityBlackBear.class, "blackbear", 2, BearWithMe.instance, 80, 3, true, new Color(255, 255, 255).getRGB(), new Color(0, 0, 0).getRGB());
        EntityRegistry.addSpawn(EntityBlackBear.class, 1, 1, 1, EnumCreatureType.MONSTER, bList.toArray(new Biome[0]));

        final Collection<Biome> pList = new ArrayList<>();
        Collections.addAll(pList, BiomeDictionary.getBiomesForType(Type.JUNGLE));
        EntityRegistry.registerModEntity(EntityPandaBear.class, "pandabear", 3, BearWithMe.instance, 80, 3, true, new Color(255, 255, 255).getRGB(), new Color(0, 0, 0).getRGB());
        EntityRegistry.addSpawn(EntityPandaBear.class, 1, 1, 1, EnumCreatureType.CREATURE, pList.toArray(new Biome[0]));

        // sounds

    }

    public void postInit () {

    }

}
