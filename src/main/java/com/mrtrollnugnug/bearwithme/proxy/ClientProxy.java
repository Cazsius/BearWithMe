package com.mrtrollnugnug.bearwithme.proxy;

import com.mrtrollnugnug.bearwithme.client.model.ModelPandaBear;
import com.mrtrollnugnug.bearwithme.client.render.RenderBlackBear;
import com.mrtrollnugnug.bearwithme.client.render.RenderGrizzlyBear;
import com.mrtrollnugnug.bearwithme.client.render.RenderPandaBear;
import com.mrtrollnugnug.bearwithme.common.entity.EntityBlackBear;
import com.mrtrollnugnug.bearwithme.common.entity.EntityGrizzlyBear;
import com.mrtrollnugnug.bearwithme.common.entity.EntityPandaBear;

import net.minecraft.client.model.ModelPolarBear;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy
{
	public void preInit()
	{
		super.preInit();
		RenderingRegistry.registerEntityRenderingHandler(
				EntityGrizzlyBear.class, new IRenderFactory<EntityGrizzlyBear>()
				{
					@Override
					public Render<? super EntityGrizzlyBear> createRenderFor(
							RenderManager manager)
					{
						return new RenderGrizzlyBear<>(manager,
								new ModelPolarBear(), 0.7F);

					}
				});

		RenderingRegistry.registerEntityRenderingHandler(EntityBlackBear.class,
				new IRenderFactory<EntityBlackBear>()
				{
					@Override
					public Render<? super EntityBlackBear> createRenderFor(
							RenderManager manager)
					{
						return new RenderBlackBear<>(manager,
								new ModelPolarBear(), 0.7F);
					}
				});

		RenderingRegistry.registerEntityRenderingHandler(EntityPandaBear.class,
				new IRenderFactory<EntityPandaBear>()
				{
					@Override
					public Render<EntityPandaBear> createRenderFor(
							RenderManager manager)
					{
						return new RenderPandaBear(manager,
								new ModelPandaBear(), 0.7F);
					}
				});
	}
}
