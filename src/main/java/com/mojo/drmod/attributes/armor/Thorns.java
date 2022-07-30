package com.mojo.drmod.attributes.armor;

import com.mojo.drmod.attributes.Attribute;
import com.mojo.drmod.utils.ArmorUtils;
import net.minecraft.item.ItemStack;

public class Thorns extends Attribute {

    private int thorns = 0;

    @Override
    public void updateInfo(ItemStack stack) {
        this.thorns = ArmorUtils.getIntListFromList(stack, getCompare()).get(0);
    }

    @Override
    public int getCompareValue() {
        return thorns;
    }

    @Override
    public String getCompare() {
        return "THORNS";
    }

    @Override
    public String getTooltipName() {
        return "THORNS";
    }
}
