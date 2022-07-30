package com.mojo.drmod.attributes.armor;

import com.mojo.drmod.attributes.Attribute;
import com.mojo.drmod.utils.ArmorUtils;
import net.minecraft.item.ItemStack;

public class Block extends Attribute {

    private int block = 0;

    @Override
    public void updateInfo(ItemStack stack) {
        this.block = ArmorUtils.getIntListFromList(stack, getCompare()).get(0);
    }

    @Override
    public int getCompareValue() {
        return block;
    }

    @Override
    public String getCompare() {
        return "BLOCK";
    }

    @Override
    public String getTooltipName() {
        return "BLOCK";
    }
}
