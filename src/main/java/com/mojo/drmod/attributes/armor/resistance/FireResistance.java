package com.mojo.drmod.attributes.armor.resistance;

import com.mojo.drmod.attributes.Attribute;
import com.mojo.drmod.utils.ArmorUtils;
import net.minecraft.item.ItemStack;

public class FireResistance extends Attribute {

    private int fireResistance = 0;

    @Override
    public void updateInfo(ItemStack stack) {
        this.fireResistance = ArmorUtils.getIntListFromList(stack, getCompare()).get(0);
    }

    @Override
    public int getCompareValue() {
        return fireResistance;
    }

    @Override
    public String getCompare() {
        return "FIRE_RESISTANCE";
    }

    @Override
    public String getTooltipName() {
        return "FIRE RESISTANCE";
    }
}
