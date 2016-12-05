package com.mrtrollnugnug.bearwithme;

import net.minecraft.client.model.ModelPolarBear;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{
	public void preInit()
	{
		super.preInit();
        RenderingRegistry.registerEntityRenderingHandler(EntityGrizzlyBear.class, new IRenderFactory<EntityGrizzlyBear>()
        {
            @Override
            public Render<? super EntityGrizzlyBear> createRenderFor(RenderManager manager)
            {
            	return new RenderGrizzlyBear<>(manager,new ModelPolarBear(), 0.7F);
            	
            }
        });
        
   	 RenderingRegistry.registerEntityRenderingHandler(EntityBlackBear.class, new IRenderFactory<EntityBlackBear>()
    	{
	    	@Override
	    	public Render<? super EntityBlackBear> createRenderFor(RenderManager manager)
	    	{
	    		return new RenderBlackBear<>(manager,new ModelPolarBear(), 0.7F);  
	        }
        });
	}
}


