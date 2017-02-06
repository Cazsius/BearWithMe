package com.mrtrollnugnug.bearwithme.proxy;

import com.mrtrollnugnug.bearwithme.client.model.ModelPandaBear;
import com.mrtrollnugnug.bearwithme.client.render.RenderBlackBear;
import com.mrtrollnugnug.bearwithme.client.render.RenderGrizzlyBear;
import com.mrtrollnugnug.bearwithme.client.render.RenderPandaBear;
import com.mrtrollnugnug.bearwithme.common.entity.EntityBlackBear;
import com.mrtrollnugnug.bearwithme.common.entity.EntityGrizzlyBear;
import com.mrtrollnugnug.bearwithme.common.entity.EntityPandaBear;

import net.minecraft.client.model.ModelPolarBear;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {
    @Override
    public void preInit () {

        super.preInit();
        RenderingRegistry.registerEntityRenderingHandler(EntityGrizzlyBear.class, manager -> new RenderGrizzlyBear<>(manager, new ModelPolarBear(), 0.7F));

        RenderingRegistry.registerEntityRenderingHandler(EntityBlackBear.class, manager -> new RenderBlackBear<>(manager, new ModelPolarBear(), 0.7F));

        RenderingRegistry.registerEntityRenderingHandler(EntityPandaBear.class, manager -> new RenderPandaBear(manager, new ModelPandaBear(), 0.7F));
    }
}
