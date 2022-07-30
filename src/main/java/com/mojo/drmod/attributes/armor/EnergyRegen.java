package com.mojo.drmod.attributes.armor;

import com.mojo.drmod.attributes.Attribute;
import com.mojo.drmod.utils.ArmorUtils;
import net.minecraft.item.ItemStack;

public class EnergyRegen extends Attribute {

    private int energyRegen = 0;

    @Override
    public void updateInfo(ItemStack stack) {
        this.energyRegen = ArmorUtils.getIntListFromList(stack, getCompare()).get(0);
    }

    @Override
    public int getCompareValue() {
        return energyRegen;
    }

    @Override
    public String getCompare() {
        return "ENERGY_REGEN";
    }

    @Override
    public String getTooltipName() {
        return "ENERGY REGEN";
    }
}
