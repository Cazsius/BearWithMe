package com.mrtrollnugnug.bearwithme.common.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityPolarBear;
import net.minecraft.world.World;

public class EntityGrizzlyBear extends EntityPolarBear {
    public EntityGrizzlyBear (World worldIn) {
        super(worldIn);
        this.setSize(1.3F, 1.4F);
    }

    @Override
    public EntityAgeable createChild (EntityAgeable ageable) {

        return new EntityGrizzlyBear(this.getEntityWorld());
    }

    @Override
    protected void applyEntityAttributes () {

        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(40.0D);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(25.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.30D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(7.0D);
    }
}