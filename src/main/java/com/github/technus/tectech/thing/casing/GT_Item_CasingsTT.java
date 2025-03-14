package com.github.technus.tectech.thing.casing;

import static com.github.technus.tectech.util.CommonValues.COSMIC_MARK;
import static com.github.technus.tectech.util.CommonValues.TEC_MARK_EM;
import static net.minecraft.util.StatCollector.translateToLocal;

import gregtech.common.blocks.GT_Item_Casings_Abstract;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

/**
 * Created by danie_000 on 03.10.2016.
 */
public class GT_Item_CasingsTT extends GT_Item_Casings_Abstract {
    public GT_Item_CasingsTT(Block par1) {
        super(par1);
    }

    @Override
    public void addInformation(ItemStack aStack, EntityPlayer aPlayer, List aList, boolean aF3_H) {
        if (aStack.getItemDamage() < 15) {
            aList.add(TEC_MARK_EM);
        } else {
            aList.add(COSMIC_MARK);
        }
        switch (aStack.getItemDamage()) {
            case 0: // "High Power Casing"
                aList.add(translateToLocal("gt.blockcasingsTT.0.desc.0")); // Well suited for high power applications.
                aList.add(EnumChatFormatting.AQUA.toString()
                        + EnumChatFormatting.BOLD
                        + translateToLocal("gt.blockcasingsTT.0.desc.1")); // The power levels are rising!
                break;
            case 1: // "Computer Casing"
                aList.add(translateToLocal("gt.blockcasingsTT.1.desc.0")); // Nice and clean casing.
                aList.add(EnumChatFormatting.AQUA.toString()
                        + EnumChatFormatting.BOLD
                        + translateToLocal("gt.blockcasingsTT.1.desc.1")); // Dust can break it!?
                break;
            case 2: // "Computer Heat Vent"
                aList.add(translateToLocal("gt.blockcasingsTT.2.desc.0")); // Air vent with a filter.
                aList.add(EnumChatFormatting.AQUA.toString()
                        + EnumChatFormatting.BOLD
                        + translateToLocal("gt.blockcasingsTT.2.desc.1")); // Perfectly muffled sound!
                break;
            case 3: // "Advanced Computer Casing"
                aList.add(translateToLocal("gt.blockcasingsTT.3.desc.0")); // Contains high bandwidth bus
                aList.add(EnumChatFormatting.AQUA.toString()
                        + EnumChatFormatting.BOLD
                        + translateToLocal("gt.blockcasingsTT.3.desc.1")); // couple thousand qubits wide.
                break;
            case 4: // "Molecular Casing"
                aList.add(translateToLocal("gt.blockcasingsTT.4.desc.0")); // Stops elemental things.
                aList.add(EnumChatFormatting.AQUA.toString()
                        + EnumChatFormatting.BOLD
                        + translateToLocal("gt.blockcasingsTT.4.desc.1")); // Radiation and emotions too...
                break;
            case 5: // "Advanced Molecular Casing"
                aList.add(translateToLocal("gt.blockcasingsTT.5.desc.0")); // Cooling and stabilization.
                aList.add(EnumChatFormatting.AQUA.toString()
                        + EnumChatFormatting.BOLD
                        + translateToLocal("gt.blockcasingsTT.5.desc.1")); // A comfortable machine bed.
                break;
            case 6: // "Containment Field Generator"
                aList.add(translateToLocal("gt.blockcasingsTT.6.desc.0")); // Creates a field that...
                aList.add(EnumChatFormatting.AQUA.toString()
                        + EnumChatFormatting.BOLD
                        + translateToLocal("gt.blockcasingsTT.6.desc.1")); // can stop even force carriers.
                break;
            case 7: // "Molecular Coil"
                aList.add(translateToLocal("gt.blockcasingsTT.7.desc.0")); // Well it does things too...
                aList.add(EnumChatFormatting.AQUA.toString()
                        + EnumChatFormatting.BOLD
                        + translateToLocal("gt.blockcasingsTT.7.desc.1")); // [Use this coil!]
                break;
            case 8: // "Collider Hollow Casing"
                aList.add(translateToLocal("gt.blockcasingsTT.8.desc.0")); // Reinforced accelerator tunnel.
                aList.add(EnumChatFormatting.AQUA.toString()
                        + EnumChatFormatting.BOLD
                        + translateToLocal("gt.blockcasingsTT.8.desc.1")); // Most advanced pipe ever.
                break;
            case 9: // "Spacetime Altering Casing"
                aList.add(translateToLocal("gt.blockcasingsTT.9.desc.0")); // c is no longer the limit.
                aList.add(EnumChatFormatting.AQUA.toString()
                        + EnumChatFormatting.BOLD
                        + translateToLocal("gt.blockcasingsTT.9.desc.1")); // Wibbly wobbly timey wimey stuff.
                break;
            case 10: // "Teleportation Casing"
                aList.add(translateToLocal("gt.blockcasingsTT.10.desc.0")); // Remote connection.
                aList.add(EnumChatFormatting.AQUA.toString()
                        + EnumChatFormatting.BOLD
                        + translateToLocal("gt.blockcasingsTT.10.desc.1")); // Better touch with a stick.
                break;
            case 11: // "Dimensional Bridge Generator"
                aList.add(translateToLocal("gt.blockcasingsTT.11.desc.0")); // Interdimensional Operations.
                aList.add(EnumChatFormatting.AQUA.toString()
                        + EnumChatFormatting.BOLD
                        + translateToLocal("gt.blockcasingsTT.11.desc.1")); // Around the universe and other places too.
                break;
            case 12: // "Ultimate Molecular Casing"
                aList.add(translateToLocal("gt.blockcasingsTT.12.desc.0")); // Ultimate in every way.
                aList.add(EnumChatFormatting.AQUA.toString()
                        + EnumChatFormatting.BOLD
                        + translateToLocal("gt.blockcasingsTT.12.desc.1")); // I don't know what it can't do.
                break;
            case 13: // "Ultimate Advanced Molecular Casing"
                aList.add(translateToLocal("gt.blockcasingsTT.13.desc.0")); // More Ultimate in every way.
                aList.add(EnumChatFormatting.AQUA.toString()
                        + EnumChatFormatting.BOLD
                        + translateToLocal("gt.blockcasingsTT.13.desc.1")); // I don't know what I am doing!
                break;
            case 14: // "Ultimate Containment Field Generator"
                aList.add(translateToLocal("gt.blockcasingsTT.14.desc.0")); // Black Hole...
                aList.add(EnumChatFormatting.AQUA.toString()
                        + EnumChatFormatting.BOLD
                        + translateToLocal("gt.blockcasingsTT.14.desc.1")); // Meh...
                break;
            case 15: // "Debug Sides"
                aList.add(translateToLocal("gt.blockcasingsTT.15.desc.0")); // Lazy man way of determining sides.
                aList.add(EnumChatFormatting.BLUE.toString()
                        + translateToLocal("gt.blockcasingsTT.15.desc.1")); // 0, 1, 2, 3, 4, 5, 6?!
                break;
            default: // WTF?
                aList.add("Damn son where did you get that!?");
                aList.add(EnumChatFormatting.BLUE.toString() + "From outer space... I guess...");
        }
    }
}
