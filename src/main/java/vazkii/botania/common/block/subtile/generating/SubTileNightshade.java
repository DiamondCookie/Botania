/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 * 
 * Botania is Open Source and distributed under the
 * Botania License: http://botaniamod.net/license.php
 * 
 * File Created @ [Mar 16, 2014, 11:15:42 PM (GMT)]
 */
package vazkii.botania.common.block.subtile.generating;

import vazkii.botania.api.lexicon.LexiconEntry;
import vazkii.botania.common.lexicon.LexiconData;

public class SubTileNightshade extends SubTileDaybloom {

	@Override
	public int getDelayBetweenPassiveGeneration() {
		return super.getDelayBetweenPassiveGeneration() * 2;
	}

	@Override
	public boolean canGeneratePassively() {
		return !super.canGeneratePassively() && !supertile.getWorldObj().isDaytime();
	}

	@Override
	public int getColor() {
		return 0x3D2A90;
	}

	@Override
	public LexiconEntry getEntry() {
		return LexiconData.nightshade;
	}

}
