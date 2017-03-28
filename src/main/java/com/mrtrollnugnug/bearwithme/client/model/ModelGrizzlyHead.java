package com.mrtrollnugnug.bearwithme.client.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * Polar Bear - Unknown
 * Created using Tabula 5.1.0
 */
public class ModelGrizzlyHead extends ModelBiped {
    public ModelRenderer Head;
    public ModelRenderer field_78150_a;
    public ModelRenderer kdakf;
    public ModelRenderer kdakf2;
    public ModelRenderer kdakf22;
    public ModelRenderer kdakf222;
    public ModelRenderer kdakf223;
    public ModelRenderer kdakf23;
    public ModelRenderer CubeN;
    public ModelRenderer kdakf232;
    public ModelRenderer CubeName;
    public ModelRenderer kdakf2322;
    public ModelRenderer CubeN2;
    public ModelRenderer CubeN3;
    public ModelRenderer teeth;
    public ModelRenderer teeth3;
    public ModelRenderer field_78150_a_3;
    public ModelRenderer field_78150_a_2;
    public ModelRenderer field_78150_a_1;
    public ModelRenderer teeth2;
    public ModelRenderer teeth22;

    public ModelGrizzlyHead() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.kdakf23 = new ModelRenderer(this, 37, 5);
        this.kdakf23.setRotationPoint(-4.5F, -8.199999809265137F, 1.5F);
        this.kdakf23.addBox(0.0F, 0.0F, 0.0F, 1, 8, 2, 0.0F);
        this.CubeName = new ModelRenderer(this, 1, 21);
        this.CubeName.setRotationPoint(-3.5F, -8.0F, 4.400000095367432F);
        this.CubeName.addBox(0.0F, -3.0F, -2.0F, 7, 3, 2, 0.0F);
        this.setRotateAngle(CubeName, 0.9339256534473936F, 0.0F, 0.0F);
        this.kdakf222 = new ModelRenderer(this, 47, 10);
        this.kdakf222.setRotationPoint(-4.900000095367432F, -8.0F, -4.5F);
        this.kdakf222.addBox(0.0F, 0.0F, 0.0F, 1, 9, 6, 0.0F);
        this.kdakf223 = new ModelRenderer(this, 47, 1);
        this.kdakf223.setRotationPoint(-4.900000095367432F, -8.0F, -5.5F);
        this.kdakf223.addBox(0.0F, -2.0F, 1.0F, 1, 2, 6, 0.0F);
        this.setRotateAngle(kdakf223, 0.0F, 0.0F, 0.7853981633974483F);
        this.kdakf22 = new ModelRenderer(this, 47, 1);
        this.kdakf22.setRotationPoint(4.900000095367432F, -8.0F, -4.5F);
        this.kdakf22.addBox(-1.0F, -2.0F, 0.0F, 1, 2, 6, 0.0F);
        this.setRotateAngle(kdakf22, 0.0F, 0.0F, -0.7853981633974483F);
        this.kdakf232 = new ModelRenderer(this, 30, 30);
        this.kdakf232.setRotationPoint(2.299999952316284F, -8.100000381469727F, 3.4000000953674316F);
        this.kdakf232.addBox(0.0F, 0.0F, 0.0F, 2, 8, 1, 0.0F);
        this.field_78150_a = new ModelRenderer(this, 6, 33);
        this.field_78150_a.setRotationPoint(0.0F, -4.900000095367432F, 0.5F);
        this.field_78150_a.addBox(-3.5F, -5.0F, -7.0F, 7, 5, 7, 0.0F);
        this.setRotateAngle(field_78150_a, -0.3490658503988659F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 3, 48);
        this.Head.setRotationPoint(-4.0F, -8.0F, -4.0F);
        this.Head.addBox(0.0F, 0.0F, 0.0F, 8, 8, 8, 0.0F);
        this.teeth = new ModelRenderer(this, 8, 34);
        this.teeth.setRotationPoint(1.0F, 0.0F, -9.5F);
        this.teeth.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.CubeN = new ModelRenderer(this, 49, 31);
        this.CubeN.setRotationPoint(-3.0F, 0.0F, 3.5F);
        this.CubeN.addBox(0.0F, 0.0F, 0.0F, 6, 2, 1, 0.0F);
        this.field_78150_a_3 = new ModelRenderer(this, 19, 29);
        this.field_78150_a_3.mirror = true;
        this.field_78150_a_3.setRotationPoint(-1.0F, -5.0F, -5.0F);
        this.field_78150_a_3.addBox(2.5F, -2.0F, 0.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(field_78150_a_3, -0.3490658503988659F, 0.0F, 0.0F);
        this.CubeN3 = new ModelRenderer(this, 49, 35);
        this.CubeN3.setRotationPoint(-2.5F, 2.0F, 3.5F);
        this.CubeN3.addBox(0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F);
        this.field_78150_a_2 = new ModelRenderer(this, 19, 29);
        this.field_78150_a_2.setRotationPoint(1.0F, -5.0F, -5.0F);
        this.field_78150_a_2.addBox(-4.5F, -2.0F, 0.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(field_78150_a_2, -0.3490658503988659F, 0.0F, 0.0F);
        this.teeth2 = new ModelRenderer(this, 3, 34);
        this.teeth2.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.teeth2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(teeth2, 0.5235987755982988F, 0.0F, 0.0F);
        this.CubeN2 = new ModelRenderer(this, 21, 19);
        this.CubeN2.setRotationPoint(-4.0F, -8.0F, 3.5F);
        this.CubeN2.addBox(0.0F, 0.0F, 0.0F, 8, 8, 1, 0.0F);
        this.teeth3 = new ModelRenderer(this, 8, 34);
        this.teeth3.setRotationPoint(-2.0F, 0.0F, -9.5F);
        this.teeth3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.kdakf = new ModelRenderer(this, 47, 10);
        this.kdakf.setRotationPoint(3.9000000953674316F, -8.0F, -4.5F);
        this.kdakf.addBox(0.0F, 0.0F, 0.0F, 1, 9, 6, 0.0F);
        this.kdakf2322 = new ModelRenderer(this, 30, 30);
        this.kdakf2322.setRotationPoint(-4.300000190734863F, -8.100000381469727F, 3.4000000953674316F);
        this.kdakf2322.addBox(0.0F, 0.0F, 0.0F, 2, 8, 1, 0.0F);
        this.teeth22 = new ModelRenderer(this, 3, 34);
        this.teeth22.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.teeth22.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(teeth22, 0.5235987755982988F, 0.0F, 0.0F);
        this.field_78150_a_1 = new ModelRenderer(this, 1, 27);
        this.field_78150_a_1.setRotationPoint(0.0F, -3.0F, -4.0F);
        this.field_78150_a_1.addBox(-2.5F, 1.0F, -6.0F, 5, 2, 3, 0.0F);
        this.kdakf2 = new ModelRenderer(this, 37, 5);
        this.kdakf2.setRotationPoint(3.5F, -8.199999809265137F, 1.5F);
        this.kdakf2.addBox(0.0F, 0.0F, 0.0F, 1, 8, 2, 0.0F);
        this.field_78150_a.addChild(this.teeth);
        this.field_78150_a.addChild(this.field_78150_a_3);
        this.field_78150_a.addChild(this.field_78150_a_2);
        this.teeth.addChild(this.teeth2);
        this.field_78150_a.addChild(this.teeth3);
        this.teeth3.addChild(this.teeth22);
        this.field_78150_a.addChild(this.field_78150_a_1);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.0F);
        this.kdakf23.render(f5);
        GlStateManager.disableBlend();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.0F);
        this.CubeName.render(f5);
        GlStateManager.disableBlend();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.0F);
        this.kdakf222.render(f5);
        GlStateManager.disableBlend();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.0F);
        this.kdakf223.render(f5);
        GlStateManager.disableBlend();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.0F);
        this.kdakf22.render(f5);
        GlStateManager.disableBlend();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.0F);
        this.kdakf232.render(f5);
        GlStateManager.disableBlend();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.0F);
        this.field_78150_a.render(f5);
        GlStateManager.disableBlend();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.0F);
        this.Head.render(f5);
        GlStateManager.disableBlend();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.0F);
        this.CubeN.render(f5);
        GlStateManager.disableBlend();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.0F);
        this.CubeN3.render(f5);
        GlStateManager.disableBlend();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.0F);
        this.CubeN2.render(f5);
        GlStateManager.disableBlend();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.0F);
        this.kdakf.render(f5);
        GlStateManager.disableBlend();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.0F);
        this.kdakf2322.render(f5);
        GlStateManager.disableBlend();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.0F);
        this.kdakf2.render(f5);
        GlStateManager.disableBlend();
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
