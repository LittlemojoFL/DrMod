package com.mojo.drmod.attributes.armor.health;

import com.mojo.drmod.attributes.Attribute;
import com.mojo.drmod.utils.ArmorUtils;
import net.minecraft.item.ItemStack;

public class HealthPoints extends Attribute {

    private int healthPoints = 0;

    @Override
    public void updateInfo(ItemStack stack) {
        this.healthPoints = ArmorUtils.getIntListFromList(stack, getCompare()).get(0);
    }

    @Override
    public int getCompareValue() {
        return healthPoints;
    }

    @Override
    public String getCompare() {
        return "HEALTH_POINTS";
    }

    @Override
    public String getTooltipName() {
        return "HP";
    }
}