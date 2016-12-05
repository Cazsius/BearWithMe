package com.mrtrollnugnug.bearwithme;
	import net.minecraft.client.model.ModelBase;
	import net.minecraft.client.model.ModelRenderer;
	import net.minecraft.entity.Entity;
	import org.lwjgl.opengl.GL11;

	/**
	 * bearPanda - wiiv
	 * Created using Tabula 4.1.1
	 */
	public class ModelPandaBear extends ModelBase {
	    public ModelRenderer body1;
	    public ModelRenderer leg1;
	    public ModelRenderer leg2;
	    public ModelRenderer leg3;
	    public ModelRenderer leg4;
	    public ModelRenderer head;
	    public ModelRenderer body2;
	    public ModelRenderer nose;
	    public ModelRenderer ear1;
	    public ModelRenderer ear2;
	    public ModelRenderer tail;

	    public ModelPandaBear() {
	        this.textureWidth = 64;
	        this.textureHeight = 128;
	        this.leg4 = new ModelRenderer(this, 0, 63);
	        this.leg4.mirror = true;
	        this.leg4.setRotationPoint(3.49F, 15.0F, -8.0F);
	        this.leg4.addBox(-2.0F, 0.0F, -2.0F, 4, 9, 4, 0.0F);
	        this.ear2 = new ModelRenderer(this, 0, 0);
	        this.ear2.mirror = true;
	        this.ear2.setRotationPoint(0.0F, 0.0F, 0.0F);
	        this.ear2.addBox(1.0F, -6.5F, -3.5F, 3, 3, 1, 0.0F);
	        this.setRotateAngle(ear2, 0.08726646259971647F, 0.08726646259971647F, 0.17453292519943295F);
	        this.leg2 = new ModelRenderer(this, 0, 76);
	        this.leg2.mirror = true;
	        this.leg2.setRotationPoint(4.01F, 13.0F, 8.0F);
	        this.leg2.addBox(-2.0F, 0.0F, -2.5F, 4, 11, 5, 0.0F);
	        this.body1 = new ModelRenderer(this, 0, 17);
	        this.body1.setRotationPoint(0.0F, 10.0F, -10.0F);
	        this.body1.addBox(-5.5F, -5.0F, -1.0F, 11, 11, 9, 0.0F);
	        this.ear1 = new ModelRenderer(this, 0, 0);
	        this.ear1.setRotationPoint(0.0F, 0.0F, 0.0F);
	        this.ear1.addBox(-4.0F, -6.5F, -3.5F, 3, 3, 1, 0.0F);
	        this.setRotateAngle(ear1, 0.08726646259971647F, -0.08726646259971647F, -0.17453292519943295F);
	        this.leg1 = new ModelRenderer(this, 0, 76);
	        this.leg1.setRotationPoint(-3.99F, 13.0F, 8.0F);
	        this.leg1.addBox(-2.0F, 0.0F, -2.5F, 4, 11, 5, 0.0F);
	        this.nose = new ModelRenderer(this, 36, 0);
	        this.nose.setRotationPoint(0.0F, 0.0F, -7.0F);
	        this.nose.addBox(-2.5F, 0.0F, -3.0F, 5, 4, 3, 0.0F);
	        this.setRotateAngle(nose, 0.08726646259971647F, 0.0F, 0.0F);
	        this.tail = new ModelRenderer(this, 0, 37);
	        this.tail.mirror = true;
	        this.tail.setRotationPoint(0.0F, 0.0F, 0.0F);
	        this.tail.addBox(-1.5F, -7.0F, 19.5F, 3, 3, 2, 0.0F);
	        this.setRotateAngle(tail, -0.08726646259971647F, 0.0F, 0.0F);
	        this.leg3 = new ModelRenderer(this, 0, 63);
	        this.leg3.setRotationPoint(-3.49F, 15.0F, -8.0F);
	        this.leg3.addBox(-2.0F, 0.0F, -2.0F, 4, 9, 4, 0.0F);
	        this.body2 = new ModelRenderer(this, 0, 37);
	        this.body2.mirror = true;
	        this.body2.setRotationPoint(0.0F, 0.0F, 0.0F);
	        this.body2.addBox(-6.4F, -6.5F, 6.5F, 13, 12, 14, 0.0F);
	        this.setRotateAngle(body2, -0.08726646259971647F, 0.0F, 0.0F);
	        this.head = new ModelRenderer(this, 0, 0);
	        this.head.setRotationPoint(0.0F, 0.0F, -1.0F);
	        this.head.addBox(-5.0F, -4.0F, -7.0F, 10, 9, 8, 0.0F);
	        this.setRotateAngle(head, 0.17453292519943295F, 0.0F, 0.0F);
	        this.head.addChild(this.ear2);
	        this.head.addChild(this.ear1);
	        this.head.addChild(this.nose);
	        this.body2.addChild(this.tail);
	        this.body1.addChild(this.body2);
	        this.body1.addChild(this.head);
	    }

	    @Override
	    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
	        this.leg4.render(f5);
	        this.leg2.render(f5);
	        this.body1.render(f5);
	        this.leg1.render(f5);
	        GL11.glPushMatrix();
	        GL11.glTranslatef(this.leg3.offsetX, this.leg3.offsetY, this.leg3.offsetZ);
	        GL11.glTranslatef(this.leg3.rotationPointX * f5, this.leg3.rotationPointY * f5, this.leg3.rotationPointZ * f5);
	        GL11.glScaled(1.0D, 0.98D, 1.0D);
	        GL11.glTranslatef(-this.leg3.offsetX, -this.leg3.offsetY, -this.leg3.offsetZ);
	        GL11.glTranslatef(-this.leg3.rotationPointX * f5, -this.leg3.rotationPointY * f5, -this.leg3.rotationPointZ * f5);
	        this.leg3.render(f5);
	        GL11.glPopMatrix();
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

