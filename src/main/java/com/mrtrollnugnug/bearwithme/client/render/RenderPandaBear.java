package com.mrtrollnugnug.bearwithme.client.render;

import com.mrtrollnugnug.bearwithme.common.entity.EntityPandaBear;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderPandaBear extends RenderLiving<EntityPandaBear> {

    private static final ResourceLocation TEXTURE = new ResourceLocation("bearwithme", "textures/entity/bear_panda.png");

    public RenderPandaBear (RenderManager renderManager, ModelBase model, float shadowSize) {

        super(renderManager, model, shadowSize);
    }

    @Override
    protected ResourceLocation getEntityTexture (EntityPandaBear entity) {

        return TEXTURE;
    }

    @Override
    protected void preRenderCallback (EntityPandaBear entitylivingbaseIn, float partialTickTime) {

        GlStateManager.scale(1.2F, 1.2F, 1.2F);
        super.preRenderCallback(entitylivingbaseIn, partialTickTime);
    }
}
