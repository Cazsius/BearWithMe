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
public class RenderPandaBear<P extends EntityLiving> extends RenderLiving<P> 
{
	    private static final ResourceLocation field_190090_a = new ResourceLocation("bearwithme:models/bearpanda");

	    public RenderPandaBear(RenderManager p_i47132_1_, ModelBase p_i47132_2_, float p_i47132_3_)
	    {
	        super(p_i47132_1_, p_i47132_2_, p_i47132_3_);
	    }

	    protected ResourceLocation getEntityTexture(P entity)
	    {
	        return field_190090_a;
	    }

	    public void doRender(P entity, double x, double y, double z, float entityYaw, float partialTicks)
	    {
	        super.doRender(entity, x, y, z, entityYaw, partialTicks);
	    }
	    protected void preRenderCallback(P entitylivingbaseIn, float partialTickTime)
	    {
	        GlStateManager.scale(1.2F, 1.2F, 1.2F);
	        super.preRenderCallback(entitylivingbaseIn, partialTickTime);
	    }
}
