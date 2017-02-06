package com.mrtrollnugnug.bearwithme.client.render;

import com.mrtrollnugnug.bearwithme.client.model.ModelPandaBear;
import com.mrtrollnugnug.bearwithme.common.entity.EntityPandaBear;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderPandaBear extends RenderLiving<EntityPandaBear> {
    private static final ResourceLocation texture = new ResourceLocation("bearwithme:textures/entity/panda_bear.png");

    public RenderPandaBear (RenderManager renderManager, ModelPandaBear model, float shadowSize) {
        super(renderManager, model, shadowSize);
    }

    @Override
    protected ResourceLocation getEntityTexture (EntityPandaBear entity) {

        return texture;
    }

    @Override
    protected void preRenderCallback (EntityPandaBear entity, float partialTickTime) {

        // GlStateManager.scale(1F, 1F, 1F);
        if (entity.isChild()) {
            GlStateManager.scale(0.5, 0.5, 0.5);
        }
        super.preRenderCallback(entity, partialTickTime);
    }
}
