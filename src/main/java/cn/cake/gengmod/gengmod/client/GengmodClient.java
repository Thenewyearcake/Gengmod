package cn.cake.gengmod.gengmod.client;


import cn.cake.gengmod.gengmod.Gengmod;
import cn.cake.gengmod.gengmod.YeeEntity.RendererYee;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;

@Environment(EnvType.CLIENT)
public class GengmodClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.INSTANCE.register(Gengmod.CUBE, (dispatcher, context) -> {
            return new RendererYee(dispatcher);
            //注册CubeYeeRenderer中的渲染器
        });
    }
}