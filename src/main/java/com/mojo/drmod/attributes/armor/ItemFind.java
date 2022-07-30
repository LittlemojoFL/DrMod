package com.mojo.drmod.attributes.armor;

import com.mojo.drmod.attributes.Attribute;
import com.mojo.drmod.utils.ArmorUtils;
import net.minecraft.item.ItemStack;

public class ItemFind extends Attribute {

    private int itemFind = 0;

    @Override
    public void updateInfo(ItemStack stack) {
        this.itemFind = ArmorUtils.getIntListFromList(stack, getCompare()).get(0);
    }

    @Override
    public int getCompareValue() {
        return itemFind;
    }

    @Override
    public String getCompare() {
        return "ITEM_FIND";
    }

    @Override
    public String getTooltipName() {
        return "ITEM FIND";
    }
}
