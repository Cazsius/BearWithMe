package com.mrtrollnugnug.bearwithme;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderGrizzlyBear<G extends EntityLiving> extends RenderLiving<G> {
    private static final ResourceLocation field_190090_a = new ResourceLocation("bearwithme:textures/entity/new_grizzly_bear.png");

    public RenderGrizzlyBear(RenderManager p_i47132_1_, ModelBase p_i47132_2_, float p_i47132_3_) {
        super(p_i47132_1_, p_i47132_2_, p_i47132_3_);
    }

    protected ResourceLocation getEntityTexture(G entity) {
        return field_190090_a;
    }

    public void doRender(G entity, double x, double y, double z, float entityYaw, float partialTicks) {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }
    
    protected void preRenderCallback(G entitylivingbaseIn, float partialTickTime) {
        GlStateManager.scale(1.2F, 1.2F, 1.2F);
        super.preRenderCallback(entitylivingbaseIn, partialTickTime);
    }
}


