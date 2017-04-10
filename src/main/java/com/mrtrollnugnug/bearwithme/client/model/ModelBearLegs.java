package com.mrtrollnugnug.bearwithme.client.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Zombie - Unknown
 * Created using Tabula 5.1.0
 */
public class ModelBearLegs extends ModelBiped {
    public ModelRenderer CubeName5;
    public ModelRenderer CubeName52;
    public ModelRenderer CubeName4;
    public ModelRenderer CubeName23;
    public ModelRenderer CubeName32;
    public ModelRenderer CubeName222;
    public ModelRenderer CubeName22;
    public ModelRenderer CubeName3;
    public ModelRenderer CubeName2;
    public ModelRenderer CubeName;
    public ModelRenderer CubeName42;
    public ModelRenderer CubeName232;
    public ModelRenderer CubeName322;
    public ModelRenderer CubeName2222;
    public ModelRenderer CubeName223;
    public ModelRenderer CubeName33;
    public ModelRenderer CubeName24;
    public ModelRenderer CubeName6;

    public ModelBearLegs() {
        this.textureWidth = 32;
        this.textureHeight = 32;
        this.CubeName3 = new ModelRenderer(this, 17, 0);
        this.CubeName3.setRotationPoint(0.0F, 4.199999809265137F, 3.5999999046325684F);
        this.CubeName3.addBox(0.0F, 0.0F, 0.0F, 4, 4, 1, 0.0F);
        this.CubeName322 = new ModelRenderer(this, 17, 0);
        this.CubeName322.setRotationPoint(0.0F, 4.199999809265137F, -0.5999999046325684F);
        this.CubeName322.addBox(0.0F, 0.0F, 0.0F, 4, 4, 1, 0.0F);
        this.CubeName2222 = new ModelRenderer(this, 22, 6);
        this.CubeName2222.setRotationPoint(3.5999999046325684F, 4.199999809265137F, 0.0F);
        this.CubeName2222.addBox(0.0F, 0.0F, 0.0F, 1, 4, 4, 0.0F);
        this.CubeName33 = new ModelRenderer(this, 17, 0);
        this.CubeName33.setRotationPoint(0.0F, 4.199999809265137F, 3.5999999046325684F);
        this.CubeName33.addBox(0.0F, 0.0F, 0.0F, 4, 4, 1, 0.0F);
        this.CubeName4 = new ModelRenderer(this, 0, 6);
        this.CubeName4.setRotationPoint(0.0F, 0.19999980926513672F, -0.2999999523162842F);
        this.CubeName4.addBox(0.0F, 0.0F, 0.0F, 4, 4, 1, 0.0F);
        this.CubeName232 = new ModelRenderer(this, 11, 6);
        this.CubeName232.setRotationPoint(-0.3000001907348633F, -11.800000190734863F, 0.0F);
        this.CubeName232.addBox(0.0F, 12.0F, 0.0F, 1, 4, 4, 0.0F);
        this.CubeName23 = new ModelRenderer(this, 11, 6);
        this.CubeName23.setRotationPoint(-0.3000001907348633F, -11.800000190734863F, 0.0F);
        this.CubeName23.addBox(0.0F, 12.0F, 0.0F, 1, 4, 4, 0.0F);
        this.CubeName32 = new ModelRenderer(this, 17, 0);
        this.CubeName32.setRotationPoint(0.0F, 4.199999809265137F, -0.5999999046325684F);
        this.CubeName32.addBox(0.0F, 0.0F, 0.0F, 4, 4, 1, 0.0F);
        this.CubeName52 = new ModelRenderer(this, 0, 0);
        this.CubeName52.setRotationPoint(-4.0F, 11.800000190734863F, -2.0F);
        this.CubeName52.addBox(0.0F, 0.0F, 0.0F, 4, 1, 4, 0.0F);
        this.CubeName222 = new ModelRenderer(this, 22, 6);
        this.CubeName222.setRotationPoint(3.5999999046325684F, 4.199999809265137F, 0.0F);
        this.CubeName222.addBox(0.0F, 0.0F, 0.0F, 1, 4, 4, 0.0F);
        this.CubeName6 = new ModelRenderer(this, 0, 6);
        this.CubeName6.setRotationPoint(0.0F, 0.19999980926513672F, 3.299999952316284F);
        this.CubeName6.addBox(0.0F, 0.0F, 0.0F, 4, 4, 1, 0.0F);
        this.CubeName24 = new ModelRenderer(this, 11, 6);
        this.CubeName24.setRotationPoint(3.299999952316284F, -11.800000190734863F, 0.0F);
        this.CubeName24.addBox(0.0F, 12.0F, 0.0F, 1, 4, 4, 0.0F);
        this.CubeName42 = new ModelRenderer(this, 0, 6);
        this.CubeName42.setRotationPoint(0.0F, 0.19999980926513672F, -0.2999999523162842F);
        this.CubeName42.addBox(0.0F, 0.0F, 0.0F, 4, 4, 1, 0.0F);
        this.CubeName5 = new ModelRenderer(this, 0, 0);
        this.CubeName5.setRotationPoint(0.0F, 11.800000190734863F, -2.0F);
        this.CubeName5.addBox(0.0F, 0.0F, 0.0F, 4, 1, 4, 0.0F);
        this.CubeName223 = new ModelRenderer(this, 22, 6);
        this.CubeName223.setRotationPoint(-0.5999999046325684F, 4.199999809265137F, 0.0F);
        this.CubeName223.addBox(0.0F, 0.0F, 0.0F, 1, 4, 4, 0.0F);
        this.CubeName22 = new ModelRenderer(this, 22, 6);
        this.CubeName22.setRotationPoint(-0.5999999046325684F, 4.199999809265137F, 0.0F);
        this.CubeName22.addBox(0.0F, 0.0F, 0.0F, 1, 4, 4, 0.0F);
        this.CubeName2 = new ModelRenderer(this, 11, 6);
        this.CubeName2.setRotationPoint(3.299999952316284F, -11.800000190734863F, 0.0F);
        this.CubeName2.addBox(0.0F, 12.0F, 0.0F, 1, 4, 4, 0.0F);
        this.CubeName = new ModelRenderer(this, 0, 6);
        this.CubeName.setRotationPoint(0.0F, 0.19999980926513672F, 3.299999952316284F);
        this.CubeName.addBox(0.0F, 0.0F, 0.0F, 4, 4, 1, 0.0F);
        this.CubeName5.addChild(this.CubeName3);
        this.CubeName52.addChild(this.CubeName322);
        this.CubeName52.addChild(this.CubeName2222);
        this.CubeName52.addChild(this.CubeName33);
        this.CubeName5.addChild(this.CubeName4);
        this.CubeName52.addChild(this.CubeName232);
        this.CubeName5.addChild(this.CubeName23);
        this.CubeName5.addChild(this.CubeName32);
        this.CubeName5.addChild(this.CubeName222);
        this.CubeName52.addChild(this.CubeName6);
        this.CubeName52.addChild(this.CubeName24);
        this.CubeName52.addChild(this.CubeName42);
        this.CubeName52.addChild(this.CubeName223);
        this.CubeName5.addChild(this.CubeName22);
        this.CubeName5.addChild(this.CubeName2);
        this.CubeName5.addChild(this.CubeName);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.CubeName52.render(f5);
        this.CubeName5.render(f5);
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
