package com.mojo.drmod.attributes.armor.stats;

import com.mojo.drmod.attributes.Attribute;
import com.mojo.drmod.utils.ArmorUtils;
import net.minecraft.item.ItemStack;

public class Strength extends Attribute {

    private int strength = 0;

    @Override
    public void updateInfo(ItemStack stack) {
        this.strength = ArmorUtils.getIntListFromList(stack, getCompare()).get(0);
    }

    @Override
    public int getCompareValue() {
        return strength;
    }

    @Override
    public String getCompare() {
        return "STRENGTH";
    }

    @Override
    public String getTooltipName() {
        return "STR";
    }
}
