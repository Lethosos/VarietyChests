/*******************************************************************************************************************
 * Authors:   SanAndreasP
 * Copyright: SanAndreasP
 * License:   Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International
 *                http://creativecommons.org/licenses/by-nc-sa/4.0/
 *******************************************************************************************************************/
package de.sanandrew.mods.varietychests.block;

public class BlockCustomGlowingChest
        extends BlockCustomChest
{
    @Override
    public int getLightValue() {
        return 15;
    }
}
