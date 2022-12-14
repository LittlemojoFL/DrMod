package com.mojo.drmod.attributes.armor;

import com.mojo.drmod.attributes.Attribute;
import com.mojo.drmod.utils.ArmorUtils;
import net.minecraft.item.ItemStack;

import java.util.List;

public class Armor extends Attribute {

    private int armorMax = 0;

    @Override
    public void updateInfo(ItemStack stack) {
        List<Integer> armorInfo = ArmorUtils.getIntListFromList(stack, getCompare());
        if (armorInfo.size() >= 2) this.armorMax = armorInfo.get(1);
    }

    @Override
    public int getCompareValue() {
        return armorMax;
    }

    @Override
    public String getCompare() {
        return "ARMOR";
    }

    @Override
    public String getTooltipName() {
        return "ARMOR";
    }
}
