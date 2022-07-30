package com.mojo.drmod.attributes.armor.stats;

import com.mojo.drmod.attributes.Attribute;
import com.mojo.drmod.utils.ArmorUtils;
import net.minecraft.item.ItemStack;

public class Vitality extends Attribute {

    private int vitality = 0;

    @Override
    public void updateInfo(ItemStack stack) {
        this.vitality = ArmorUtils.getIntListFromList(stack, getCompare()).get(0);
    }

    @Override
    public int getCompareValue() {
        return vitality;
    }

    @Override
    public String getCompare() {
        return "VITALITY";
    }

    @Override
    public String getTooltipName() {
        return "VIT";
    }
}
