package com.mojo.drmod.attributes.armor;

import com.mojo.drmod.attributes.Attribute;
import com.mojo.drmod.utils.ArmorUtils;
import net.minecraft.item.ItemStack;

public class Reflection extends Attribute {

    private int reflection = 0;

    @Override
    public void updateInfo(ItemStack stack) {
        this.reflection = ArmorUtils.getIntListFromList(stack, getCompare()).get(0);
    }

    @Override
    public int getCompareValue() {
        return reflection;
    }

    @Override
    public String getCompare() {
        return "REFLECTION";
    }

    @Override
    public String getTooltipName() {
        return "REFLECT";
    }
}
