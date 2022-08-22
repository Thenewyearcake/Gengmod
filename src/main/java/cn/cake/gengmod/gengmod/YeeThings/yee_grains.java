package cn.cake.gengmod.gengmod.YeeThings;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

import static net.minecraft.util.Formatting.BLUE;

public class yee_grains extends Item {
    public yee_grains(Settings settings) {
        super(settings);
    }
     @Override
     public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
         tooltip.add( new TranslatableText("yee的头皮屑~").formatted(Formatting.RED,BLUE) );
     }
}
