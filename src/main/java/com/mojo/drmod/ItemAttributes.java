package com.mojo.drmod;

import com.mojo.drmod.attributes.Attribute;
import com.mojo.drmod.attributes.armor.*;
import com.mojo.drmod.attributes.armor.health.Healing;
import com.mojo.drmod.attributes.armor.health.HealthPoints;
import com.mojo.drmod.attributes.armor.health.HealthRegen;
import com.mojo.drmod.attributes.armor.resistance.ElementalResistance;
import com.mojo.drmod.attributes.armor.resistance.FireResistance;
import com.mojo.drmod.attributes.armor.resistance.IceResistance;
import com.mojo.drmod.attributes.armor.resistance.PoisonResistance;
import com.mojo.drmod.attributes.armor.stats.Dexterity;
import com.mojo.drmod.attributes.armor.stats.Intellect;
import com.mojo.drmod.attributes.armor.stats.Strength;
import com.mojo.drmod.attributes.armor.stats.Vitality;
import net.minecraft.item.ItemStack;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Clutch
 * @since 6/24/2017
 */
public class ItemAttributes {

    private Map<String, Attribute> attributes = new HashMap<>();

    public ItemAttributes() {
        // Armor Main
        registerAttribute(new Armor());
        registerAttribute(new Block());
        registerAttribute(new Dodge());
        registerAttribute(new Dps());
        registerAttribute(new EnergyRegen());
        registerAttribute(new GemFind());
        registerAttribute(new ItemFind());
        registerAttribute(new Reflection());
        registerAttribute(new Thorns());
        // Armor Health
        registerAttribute(new Healing());
        registerAttribute(new HealthPoints());
        registerAttribute(new HealthRegen());
        // Armor Resistance
        registerAttribute(new ElementalResistance());
        registerAttribute(new FireResistance());
        registerAttribute(new IceResistance());
        registerAttribute(new PoisonResistance());
        // Armor Stats
        registerAttribute(new Dexterity());
        registerAttribute(new Intellect());
        registerAttribute(new Strength());
        registerAttribute(new Vitality());
    }

    public void updateItemInfo(ItemStack stack) {
        for (Attribute attribute : this.attributes.values()) {
            attribute.updateInfo(stack);
        }
    }

    public String getCompareName(String name) {
        return this.attributes.get(name).getTooltipName();
    }

    public int getCompareValue(String name) {
        return this.attributes.get(name).getCompareValue();
    }

    public Set<String> getAttributes() {
        return this.attributes.keySet();
    }

    private void registerAttribute(Attribute attribute) {
        this.attributes.put(attribute.getCompare(), attribute);
    }
}
