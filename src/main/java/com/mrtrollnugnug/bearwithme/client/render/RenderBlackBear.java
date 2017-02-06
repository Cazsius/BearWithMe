package com.mrtrollnugnug.bearwithme.client.render;

import com.mrtrollnugnug.bearwithme.common.entity.EntityBlackBear;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderBlackBear extends RenderLiving<EntityBlackBear> {

    private static final ResourceLocation TEXTURE = new ResourceLocation("bearwithme", "textures/entity/bear_black.png");

    public RenderBlackBear (RenderManager renderer, ModelBase model, float shadowSize) {

        super(renderer, model, shadowSize);
    }

    @Override
    protected ResourceLocation getEntityTexture (EntityBlackBear entity) {

        return TEXTURE;
    }

    @Override
    protected void preRenderCallback (EntityBlackBear entitylivingbaseIn, float partialTickTime) {

        GlStateManager.scale(1.2F, 1.2F, 1.2F);
        super.preRenderCallback(entitylivingbaseIn, partialTickTime);
    }
}
