package cn.cake.gengmod.gengmod.YeeEntity;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class RendererYee extends MobEntityRenderer <EntityYee, ModelYee>{
    public RendererYee(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new ModelYee(), 0.5f);
    }



    @Override
    public Identifier getTexture(EntityYee entity) {
        return new Identifier("gengmod", "textures/entity/cube/yeecube.png");
        //这是yee实体的渲染器，在client类中会被注册
}



}

