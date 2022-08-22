package cn.cake.gengmod.gengmod.gengtool;

import cn.cake.gengmod.gengmod.Gengmod;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class MaSaiKe implements ToolMaterial {
    public static final MaSaiKe INSTANCE = new MaSaiKe();
    @Override
    public int getDurability() {
        return 500;
    }//耐久

    @Override
    public float getMiningSpeedMultiplier() {
        return 10;
    }//速度

    @Override
    public float getAttackDamage() {
        return 10000;
    }//伤害

    @Override
    public int getMiningLevel() {
        return 1;
    }//挖掘

    @Override
    public int getEnchantability() {
        return 1;
    }//附魔

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Gengmod.YEE_INGOTS);
    }//修复
}
