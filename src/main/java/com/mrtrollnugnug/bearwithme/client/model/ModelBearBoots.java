package com.mrtrollnugnug.bearwithme.client.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Zombie - Unknown
 * Created using Tabula 5.1.0
 */
public class ModelBearBoots extends ModelBiped {
    public ModelRenderer field_178721_j222;
    public ModelRenderer field_178721_j2222;
    public ModelRenderer field_178721_j62;
    public ModelRenderer field_178721_j542;
    public ModelRenderer field_178721_j4222;
    public ModelRenderer field_178721_j4322;
    public ModelRenderer field_178721_j5222;
    public ModelRenderer field_178721_j5322;
    public ModelRenderer field_178721_j442;
    public ModelRenderer field_178721_j42222;
    public ModelRenderer CubeName;
    public ModelRenderer CubeName3;
    public ModelRenderer CubeName2;
    public ModelRenderer CubeName22;
    public ModelRenderer field_178721_j622;
    public ModelRenderer field_178721_j5422;
    public ModelRenderer field_178721_j42223;
    public ModelRenderer field_178721_j43222;
    public ModelRenderer field_178721_j52222;
    public ModelRenderer field_178721_j53222;
    public ModelRenderer field_178721_j4422;
    public ModelRenderer field_178721_j422222;
    public ModelRenderer CubeName4;
    public ModelRenderer CubeName32;
    public ModelRenderer CubeName23;
    public ModelRenderer CubeName222;

    public ModelBearBoots() {
        this.textureWidth = 32;
        this.textureHeight = 32;
        this.CubeName23 = new ModelRenderer(this, 0, 12);
        this.CubeName23.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.CubeName23.addBox(-1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(CubeName23, 0.0F, 0.0F, -0.5235987755982988F);
        this.field_178721_j52222 = new ModelRenderer(this, 0, 6);
        this.field_178721_j52222.setRotationPoint(0.0F, 10.0F, -0.30000001192092896F);
        this.field_178721_j52222.addBox(-2.0F, 0.0F, -2.0F, 4, 2, 1, 0.0F);
        this.CubeName32 = new ModelRenderer(this, 0, 12);
        this.CubeName32.setRotationPoint(-4.199999809265137F, 10.899999618530273F, 0.5F);
        this.CubeName32.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.field_178721_j4222 = new ModelRenderer(this, 11, 6);
        this.field_178721_j4222.setRotationPoint(3.299999952316284F, 10.0F, 0.0F);
        this.field_178721_j4222.addBox(-2.0F, 0.0F, -2.0F, 1, 2, 4, 0.0F);
        this.field_178721_j4322 = new ModelRenderer(this, 22, 6);
        this.field_178721_j4322.setRotationPoint(3.5999999046325684F, 8.0F, 0.0F);
        this.field_178721_j4322.addBox(-2.0F, 0.0F, -2.0F, 1, 2, 4, 0.0F);
        this.field_178721_j42222 = new ModelRenderer(this, 11, 6);
        this.field_178721_j42222.setRotationPoint(-1.0F, 10.100000381469727F, 0.0F);
        this.field_178721_j42222.addBox(-2.0F, 0.0F, -2.0F, 1, 2, 4, 0.0F);
        this.CubeName4 = new ModelRenderer(this, 0, 12);
        this.CubeName4.setRotationPoint(-4.199999809265137F, 10.899999618530273F, -1.5F);
        this.CubeName4.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.field_178721_j42223 = new ModelRenderer(this, 11, 6);
        this.field_178721_j42223.setRotationPoint(3.299999952316284F, 10.0F, 0.0F);
        this.field_178721_j42223.addBox(-2.0F, 0.0F, -2.0F, 1, 2, 4, 0.0F);
        this.field_178721_j43222 = new ModelRenderer(this, 22, 6);
        this.field_178721_j43222.setRotationPoint(3.5999999046325684F, 8.0F, 0.0F);
        this.field_178721_j43222.addBox(-2.0F, 0.0F, -2.0F, 1, 2, 4, 0.0F);
        this.field_178721_j53222 = new ModelRenderer(this, 17, 0);
        this.field_178721_j53222.setRotationPoint(0.0F, 8.0F, -0.6000000238418579F);
        this.field_178721_j53222.addBox(-2.0F, 0.0F, -2.0F, 4, 2, 1, 0.0F);
        this.field_178721_j2222 = new ModelRenderer(this, 0, 0);
        this.field_178721_j2222.setRotationPoint(-2.0F, 12.0F, 0.0F);
        this.field_178721_j2222.addBox(-2.0F, 11.100000381469727F, -2.0F, 4, 1, 4, 0.0F);
        this.setRotateAngle(field_178721_j2222, 0.0F, -1.5707963267948966F, 0.0F);
        this.CubeName22 = new ModelRenderer(this, 0, 12);
        this.CubeName22.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.CubeName22.addBox(-1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(CubeName22, 0.0F, 0.0F, -0.5235987755982988F);
        this.field_178721_j4422 = new ModelRenderer(this, 22, 6);
        this.field_178721_j4422.setRotationPoint(-0.5999999046325684F, 8.100000381469727F, 0.0F);
        this.field_178721_j4422.addBox(-2.0F, 0.0F, -2.0F, 1, 2, 4, 0.0F);
        this.CubeName2 = new ModelRenderer(this, 0, 12);
        this.CubeName2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.CubeName2.addBox(-1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(CubeName2, 0.0F, 0.0F, -0.5235987755982988F);
        this.CubeName222 = new ModelRenderer(this, 0, 12);
        this.CubeName222.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.CubeName222.addBox(-1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(CubeName222, 0.0F, 0.0F, -0.5235987755982988F);
        this.field_178721_j5422 = new ModelRenderer(this, 17, 0);
        this.field_178721_j5422.setRotationPoint(0.0F, 8.0F, 3.5999999046325684F);
        this.field_178721_j5422.addBox(-2.0F, 0.0F, -2.0F, 4, 2, 1, 0.0F);
        this.field_178721_j542 = new ModelRenderer(this, 17, 0);
        this.field_178721_j542.setRotationPoint(0.0F, 8.0F, 3.5999999046325684F);
        this.field_178721_j542.addBox(-2.0F, 0.0F, -2.0F, 4, 2, 1, 0.0F);
        this.field_178721_j5322 = new ModelRenderer(this, 17, 0);
        this.field_178721_j5322.setRotationPoint(0.0F, 8.0F, -0.6000000238418579F);
        this.field_178721_j5322.addBox(-2.0F, 0.0F, -2.0F, 4, 2, 1, 0.0F);
        this.field_178721_j222 = new ModelRenderer(this, 0, 0);
        this.field_178721_j222.setRotationPoint(2.0F, 12.0F, 0.0F);
        this.field_178721_j222.addBox(-2.0F, 11.100000381469727F, -2.0F, 4, 1, 4, 0.0F);
        this.setRotateAngle(field_178721_j222, 0.0F, -1.5707963267948966F, 0.0F);
        this.field_178721_j442 = new ModelRenderer(this, 22, 6);
        this.field_178721_j442.setRotationPoint(-0.5999999046325684F, 8.100000381469727F, 0.0F);
        this.field_178721_j442.addBox(-2.0F, 0.0F, -2.0F, 1, 2, 4, 0.0F);
        this.field_178721_j5222 = new ModelRenderer(this, 0, 6);
        this.field_178721_j5222.setRotationPoint(0.0F, 10.0F, -0.30000001192092896F);
        this.field_178721_j5222.addBox(-2.0F, 0.0F, -2.0F, 4, 2, 1, 0.0F);
        this.field_178721_j622 = new ModelRenderer(this, 0, 6);
        this.field_178721_j622.setRotationPoint(0.0F, 10.0F, 3.299999952316284F);
        this.field_178721_j622.addBox(-2.0F, 0.0F, -2.0F, 4, 2, 1, 0.0F);
        this.CubeName = new ModelRenderer(this, 0, 12);
        this.CubeName.setRotationPoint(-4.199999809265137F, 10.899999618530273F, -1.5F);
        this.CubeName.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.field_178721_j422222 = new ModelRenderer(this, 11, 6);
        this.field_178721_j422222.setRotationPoint(-1.0F, 10.100000381469727F, 0.0F);
        this.field_178721_j422222.addBox(-2.0F, 0.0F, -2.0F, 1, 2, 4, 0.0F);
        this.field_178721_j62 = new ModelRenderer(this, 0, 6);
        this.field_178721_j62.setRotationPoint(0.0F, 10.0F, 3.299999952316284F);
        this.field_178721_j62.addBox(-2.0F, 0.0F, -2.0F, 4, 2, 1, 0.0F);
        this.CubeName3 = new ModelRenderer(this, 0, 12);
        this.CubeName3.setRotationPoint(-4.199999809265137F, 10.899999618530273F, 0.5F);
        this.CubeName3.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.CubeName4.addChild(this.CubeName23);
        this.field_178721_j2222.addChild(this.field_178721_j52222);
        this.field_178721_j2222.addChild(this.CubeName32);
        this.field_178721_j222.addChild(this.field_178721_j4222);
        this.field_178721_j222.addChild(this.field_178721_j4322);
        this.field_178721_j222.addChild(this.field_178721_j42222);
        this.field_178721_j2222.addChild(this.CubeName4);
        this.field_178721_j2222.addChild(this.field_178721_j42223);
        this.field_178721_j2222.addChild(this.field_178721_j43222);
        this.field_178721_j2222.addChild(this.field_178721_j53222);
        this.CubeName3.addChild(this.CubeName22);
        this.field_178721_j2222.addChild(this.field_178721_j4422);
        this.CubeName.addChild(this.CubeName2);
        this.CubeName32.addChild(this.CubeName222);
        this.field_178721_j2222.addChild(this.field_178721_j5422);
        this.field_178721_j222.addChild(this.field_178721_j542);
        this.field_178721_j222.addChild(this.field_178721_j5322);
        this.field_178721_j222.addChild(this.field_178721_j442);
        this.field_178721_j222.addChild(this.field_178721_j5222);
        this.field_178721_j2222.addChild(this.field_178721_j622);
        this.field_178721_j222.addChild(this.CubeName);
        this.field_178721_j2222.addChild(this.field_178721_j422222);
        this.field_178721_j222.addChild(this.field_178721_j62);
        this.field_178721_j222.addChild(this.CubeName3);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.field_178721_j2222.render(f5);
        this.field_178721_j222.render(f5);
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
