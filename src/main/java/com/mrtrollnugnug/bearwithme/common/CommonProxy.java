package com.mrtrollnugnug.bearwithme.common;

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

        final int redbrown = 10507321;
        final int white = 16777215;
        final int black = 0;

        EntityRegistry.registerModEntity(EntityGrizzlyBear.class, "grizzlybear", 1, BearWithMe.instance, 80, 3, true, white, redbrown);
        EntityRegistry.addSpawn(EntityGrizzlyBear.class, 1, 1, 1, EnumCreatureType.MONSTER, this.getBiomesForTypes(Type.PLAINS, Type.FOREST, Type.HILLS));

        EntityRegistry.registerModEntity(EntityBlackBear.class, "blackbear", 2, BearWithMe.instance, 80, 3, true, redbrown, black);
        EntityRegistry.addSpawn(EntityBlackBear.class, 1, 1, 1, EnumCreatureType.MONSTER, this.getBiomesForTypes(Type.CONIFEROUS, Type.MESA, Type.SAVANNA, Type.SPOOKY));

        EntityRegistry.registerModEntity(EntityPandaBear.class, "pandabear", 3, BearWithMe.instance, 80, 3, true, white, black);
        EntityRegistry.addSpawn(EntityPandaBear.class, 1, 1, 1, EnumCreatureType.CREATURE, this.getBiomesForTypes(Type.JUNGLE));
    }

    public void init () {

    }

    public void postInit () {

    }

    private Biome[] getBiomesForTypes (Type... types) {

        final Collection<Biome> biomes = new ArrayList<>();

        for (final Type type : types) {

            Collections.addAll(biomes, BiomeDictionary.getBiomesForType(type));
        }

        return biomes.toArray(new Biome[0]);
    }
}
