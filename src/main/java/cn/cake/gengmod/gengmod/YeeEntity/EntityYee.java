package cn.cake.gengmod.gengmod.YeeEntity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class EntityYee extends PathAwareEntity {
    public EntityYee(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }
}
