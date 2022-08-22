 package cn.cake.gengmod.gengmod;
import cn.cake.gengmod.gengmod.YeeEntity.EntityYee;
import cn.cake.gengmod.gengmod.YeeThings.yee_block;
import cn.cake.gengmod.gengmod.YeeThings.yee_grains;
import cn.cake.gengmod.gengmod.YeeThings.yee_ingots;
import cn.cake.gengmod.gengmod.gengtool.MaSaiKe;
import cn.cake.gengmod.gengmod.gengtool.Masaikesword;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.block.Material;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class Gengmod implements ModInitializer {
    public static final yee_block YEE_BLOCK = new yee_block(FabricBlockSettings.of(Material.METAL).hardness(4.0f));
              //创建一个方块,并使YEE_BLOCK传入物品栏中
    public static final ItemGroup YEE_GROUP = FabricItemGroupBuilder.create(
                    new Identifier("gengmod", "yee_group"))
              .icon(() -> new ItemStack(YEE_BLOCK))
                      .build();
              //创建一个物品栏
    public static final yee_grains YEE_GRAINS =new yee_grains(new FabricItemSettings().group(YEE_GROUP));
    public static final yee_ingots YEE_INGOTS =new yee_ingots(new FabricItemSettings().group(YEE_GROUP));
               //创建一个yee腚~
    public static final EntityType<EntityYee> CUBE = Registry.register(
                    Registry.ENTITY_TYPE,
                    new Identifier("gengmod", "entityyee"),
                    FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, EntityYee::new).dimensions(EntityDimensions.fixed(0.75f, 1.75f)).build()
            );
            //创建名为YEECUBE的实体
   public static final Item YEE_SPAWN_EGG = new SpawnEggItem(CUBE, 12895428, 11382189, new Item.Settings().group(YEE_GROUP));
            //创建YEECUBE的刷怪蛋
            public static Masaikesword MASAIKE_SWORD = new Masaikesword(MaSaiKe.INSTANCE, 3, -2.4F, new Item.Settings().group(YEE_GROUP));
            //马赛克剑
    @Override
    public void onInitialize() {
            Registry.register(Registry.ITEM,new Identifier("gengmod","yee_grains"),YEE_GRAINS);
            //注册yee的头皮屑~
            Registry.register(Registry.ITEM, new Identifier("gengmod", "yee_ingots"), YEE_INGOTS);
            //注册yee腚~
            Registry.register(Registry.BLOCK, new Identifier("gengmod", "yee_block"), YEE_BLOCK);
            Registry.register(Registry.ITEM, new Identifier("gengmod", "yee_block"), new BlockItem(YEE_BLOCK, new Item.Settings().group(Gengmod.YEE_GROUP)));
            //注册YEE_BLOCK方块，并将YEE_BLOCK所注册的物品传入YEE_GROUP组中
        FabricDefaultAttributeRegistry.register(CUBE, EntityYee.createMobAttributes());
            //注册实体yee
             Registry.register(Registry.ITEM, new Identifier("gengmod", "yee_spawn_egg"), YEE_SPAWN_EGG);
            //注册YEECUBE的刷怪蛋
            Registry.register(Registry.ITEM, new Identifier("gengmod","masaike_sword"),MASAIKE_SWORD);
            //注册yee剑
    }
}
