package com.github.technus.tectech.thing.metaTileEntity.hatch;

import static net.minecraft.util.StatCollector.translateToLocal;

import com.github.technus.tectech.util.CommonValues;
import com.github.technus.tectech.util.TT_Utility;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import gregtech.api.enums.Textures;
import gregtech.api.interfaces.ITexture;
import gregtech.api.interfaces.tileentity.IGregTechTileEntity;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.implementations.GT_MetaTileEntity_Hatch_Maintenance;
import gregtech.api.objects.GT_RenderedTexture;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class GT_MetaTileEntity_Hatch_CreativeMaintenance extends GT_MetaTileEntity_Hatch_Maintenance {
    private static Textures.BlockIcons.CustomIcon face;

    public GT_MetaTileEntity_Hatch_CreativeMaintenance(int aID, String aName, String aNameRegional, int aTier) {
        super(aID, aName, aNameRegional, aTier);
        TT_Utility.setTier(aTier, this);
    }

    public GT_MetaTileEntity_Hatch_CreativeMaintenance(
            String aName, int aTier, String[] aDescription, ITexture[][][] aTextures) {
        super(aName, aTier, aDescription, aTextures, false);
    }

    @Override
    public String[] getDescription() {
        return new String[] {
            CommonValues.BASS_MARK,
            translateToLocal(
                    "gt.blockmachines.debug.tt.maintenance.desc.0"), // For automatically maintaining Multiblocks
            translateToLocal("gt.blockmachines.debug.tt.maintenance.desc.1"), // Does fix everything but itself.
            EnumChatFormatting.AQUA
                    + translateToLocal("gt.blockmachines.debug.tt.maintenance.desc.2") // Fixing is for plebs!
        };
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister aBlockIconRegister) {
        super.registerIcons(aBlockIconRegister);
        face = new Textures.BlockIcons.CustomIcon("iconsets/OVERLAY_FULLAUTOMAINTENANCE");
    }

    @Override
    public ITexture[] getTexturesActive(ITexture aBaseTexture) {
        return new ITexture[] {aBaseTexture, new GT_RenderedTexture(face)};
    }

    @Override
    public ITexture[] getTexturesInactive(ITexture aBaseTexture) {
        return new ITexture[] {aBaseTexture, new GT_RenderedTexture(face)};
    }

    @Override
    public MetaTileEntity newMetaEntity(IGregTechTileEntity aTileEntity) {
        return new GT_MetaTileEntity_Hatch_CreativeMaintenance(
                this.mName, this.mTier, this.mDescriptionArray, this.mTextures);
    }

    @Override
    public void onPostTick(IGregTechTileEntity aBaseMetaTileEntity, long aTick) {
        this.mWrench =
                this.mScrewdriver = this.mSoftHammer = this.mHardHammer = this.mCrowbar = this.mSolderingTool = true;
    }

    @Override
    public Object getClientGUI(int aID, InventoryPlayer aPlayerInventory, IGregTechTileEntity aBaseMetaTileEntity) {
        return null;
    }

    @Override
    public Object getServerGUI(int aID, InventoryPlayer aPlayerInventory, IGregTechTileEntity aBaseMetaTileEntity) {
        return null;
    }

    @Override
    public boolean allowPullStack(IGregTechTileEntity aBaseMetaTileEntity, int aIndex, byte aSide, ItemStack aStack) {
        return false;
    }

    @Override
    public boolean allowPutStack(IGregTechTileEntity aBaseMetaTileEntity, int aIndex, byte aSide, ItemStack aStack) {
        return false;
    }
}
