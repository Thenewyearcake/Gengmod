package cn.cake.gengmod.gengmod.YeeEntity;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class ModelYee extends EntityModel<EntityYee> {

    private final ModelPart leftleg;
    private final ModelPart rightleg;
    private final ModelPart body1;
    private final ModelPart body2;
    private final ModelPart head;
    private final ModelPart body3;
    private final ModelPart neck;
    private final ModelPart leftarm;
    private final ModelPart rightarm;
    public ModelYee() {
        textureHeight=128;
        textureWidth=128;
        leftleg = new ModelPart(this,0,0);
        leftleg.setPivot(0.0F, 24.0F, 2.0F);
        leftleg.setTextureOffset(54, 10).addCuboid(-8.0F, -1.0F, -4.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
        leftleg.setTextureOffset(10, 67).addCuboid(-7.0F, -6.0F, -1.0F, 2.0F, 5.0F, 1.0F, 0.0F, false);
        leftleg.setTextureOffset(43, 16).addCuboid(-7.0F, -6.0F, -4.0F, 2.0F, 5.0F, 1.0F, 0.0F, false);
        leftleg.setTextureOffset(42, 61).addCuboid(-5.0F, -6.0F, -3.0F, 1.0F, 5.0F, 2.0F, 0.0F, false);
        leftleg.setTextureOffset(0, 44).addCuboid(-8.0F, -6.0F, -3.0F, 1.0F, 5.0F, 2.0F, 0.0F, false);
        //yee左腿的模型

        rightleg = new ModelPart(this,0 ,0);
        rightleg.setPivot(6.0F, 24.0F, 2.0F);
        rightleg.setTextureOffset(54, 24).addCuboid(-2.0F, -1.0F, -4.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
        rightleg.setTextureOffset(31, 67).addCuboid(-1.0F, -6.0F, -1.0F, 2.0F, 5.0F, 1.0F, 0.0F, false);
        rightleg.setTextureOffset(16, 67).addCuboid(-1.0F, -6.0F, -4.0F, 2.0F, 5.0F, 1.0F, 0.0F, false);
        rightleg.setTextureOffset(54, 61).addCuboid(1.0F, -6.0F, -3.0F, 1.0F, 5.0F, 2.0F, 0.0F, false);
        rightleg.setTextureOffset(48, 61).addCuboid(-2.0F, -6.0F, -3.0F, 1.0F, 5.0F, 2.0F, 0.0F, false);
        //yee的右腿
        body1= new ModelPart(this,0,0);
        body1.setPivot(0.0F, 24.0F, 0.0F);
        body1.setTextureOffset(43, 16).addCuboid(-8.0F, -8.0F, -4.0F, 16.0F, 2.0F, 6.0F, 0.0F, false);
        body1.setTextureOffset(43, 0).addCuboid(-8.0F, -10.0F, -4.0F, 16.0F, 2.0F, 8.0F, 0.0F, false);
        body1.setTextureOffset(41, 35).addCuboid(-8.0F, -12.0F, -4.0F, 16.0F, 2.0F, 9.0F, 0.0F, false);
        body1.setTextureOffset(0, 16).addCuboid(-8.0F, -14.0F, -4.0F, 16.0F, 2.0F, 11.0F, 0.0F, false);
        body1.setTextureOffset(0, 0).addCuboid(-8.0F, -19.0F, -3.0F, 16.0F, 5.0F, 11.0F, 0.0F, false);
        body1.setTextureOffset(0, 29).addCuboid(-8.0F, -25.0F, -2.0F, 16.0F, 6.0F, 9.0F, 0.0F, false);

        body2 = new ModelPart(this,0,0);
        body2.setPivot(0.0F, 24.0F, 0.0F);
        body2.setTextureOffset(34, 46).addCuboid(-7.0F, -26.0F, -1.0F, 14.0F, 1.0F, 6.0F, 0.0F, false);
        body2.setTextureOffset(41, 29).addCuboid(-6.0F, -27.0F, 0.0F, 12.0F, 1.0F, 4.0F, 0.0F, false);

        head = new ModelPart(this,0,0);
        head.setPivot(0.0F, 24.0F, 0.0F);
        head.setTextureOffset(0, 44).addCuboid(-4.0F, -43.0F, -2.0F, 9.0F, 12.0F, 8.0F, 0.0F, false);

        body3 = new ModelPart(this);
        body3.setPivot(0.0F, 24.0F, 0.0F);
        body3.setTextureOffset(32, 61).addCuboid(-3.0F, -10.0F, -8.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);
        body3.setTextureOffset(60, 57).addCuboid(1.0F, -10.0F, -8.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);
        body3.setTextureOffset(50, 53).addCuboid(-2.0F, -10.0F, -12.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);
        body3.setTextureOffset(10, 61).addCuboid(-2.0F, -7.0F, -15.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
        body3.setTextureOffset(26, 44).addCuboid(-2.0F, -11.0F, -8.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);
        body3.setTextureOffset(7, 16).addCuboid(-1.0F, -12.0F, -8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        body3.setTextureOffset(4, 9).addCuboid(-1.0F, -11.0F, -11.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        body3.setTextureOffset(0, 25).addCuboid(-1.0F, -12.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        body3.setTextureOffset(60, 53).addCuboid(-2.0F, -5.0F, -17.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
        body3.setTextureOffset(0, 9).addCuboid(-1.0F, -3.0F, -18.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        //yee的身体
        neck = new ModelPart(this,0,0);
        neck.setPivot(.0F, 24.0F, 0.0F);
        neck.setTextureOffset(34, 53).addCuboid(-2.0F, -32.0F, 0.0F, 5.0F, 5.0F, 3.0F, 0.0F, false);
        //yee的脖子
        leftarm = new ModelPart(this,0,0);
        leftarm.setPivot(0.0F, 24.0F, 0.0F);
        leftarm.setTextureOffset(43, 0).addCuboid(-10.0F, -20.0F, 0.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
        leftarm.setTextureOffset(0, 61).addCuboid(-10.0F, -18.0F, 2.0F, 2.0F, 6.0F, 3.0F, 0.0F, false);
        leftarm.setTextureOffset(0, 16).addCuboid(-10.0F, -16.0F, 5.0F, 2.0F, 6.0F, 3.0F, 0.0F, false);
        leftarm.setTextureOffset(66, 10).addCuboid(-10.0F, -14.0F, 8.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        leftarm.setTextureOffset(60, 63).addCuboid(-10.0F, -12.0F, 8.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        leftarm.setTextureOffset(5, 0).addCuboid(-10.0F, -12.0F, 5.0F, 2.0F, 0.0F, 2.0F, 0.0F, false);

        rightarm = new ModelPart(this,0,0);
        rightarm.setPivot(18.0F, 24.0F, 0.0F);
        rightarm.setTextureOffset(0, 29).addCuboid(-10.0F, -20.0F, 0.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);
        rightarm.setTextureOffset(0, 0).addCuboid(-10.0F, -17.0F, 2.0F, 2.0F, 6.0F, 3.0F, 0.0F, false);
        rightarm.setTextureOffset(22, 61).addCuboid(-10.0F, -13.0F, 5.0F, 2.0F, 4.0F, 3.0F, 0.0F, false);
        rightarm.setTextureOffset(41, 34).addCuboid(-10.0F, -12.0F, 8.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        rightarm.setTextureOffset(43, 24).addCuboid(-10.0F, -12.0F, 5.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        //yee的手臂
    }
    @Override
    public void setAngles(EntityYee entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        leftleg.render(matrices, vertices, light, overlay,red,blue,green,alpha);
        rightleg.render(matrices,vertices,light,overlay,red,blue,green,alpha);
        head.render(matrices, vertices, light, overlay,red,blue,green,alpha);
        neck.render(matrices, vertices, light, overlay,red,blue,green,alpha);
        leftarm.render(matrices, vertices, light, overlay,red,blue,green,alpha);
        rightarm.render(matrices, vertices, light, overlay,red,blue,green,alpha);
        body1.render(matrices, vertices, light, overlay,red,blue,green,alpha);
        body2.render(matrices, vertices, light, overlay,red,blue,green,alpha);
        body3.render(matrices, vertices, light, overlay,red,blue,green,alpha);
        //渲染这个实体

    }

}