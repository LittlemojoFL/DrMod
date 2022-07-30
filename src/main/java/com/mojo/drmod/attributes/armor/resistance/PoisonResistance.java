package com.mojo.drmod.attributes.armor.resistance;

import com.mojo.drmod.attributes.Attribute;
import com.mojo.drmod.utils.ArmorUtils;
import net.minecraft.item.ItemStack;

public class PoisonResistance extends Attribute {

    private int poisonResistance = 0;

    @Override
    public void updateInfo(ItemStack stack) {
        this.poisonResistance = ArmorUtils.getIntListFromList(stack, getCompare()).get(0);
    }

    @Override
    public int getCompareValue() {
        return poisonResistance;
    }

    @Override
    public String getCompare() {
        return "POISON_RESISTANCE";
    }

    @Override
    public String getTooltipName() {
        return "POISON RESISTANCE";
    }
}
