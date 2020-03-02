package com.lilithsthrone.game.character.body.valueEnums;

import java.util.List;

import com.lilithsthrone.utils.Colour;
import com.lilithsthrone.utils.Util;

/**
 * @since 0.2.?
 * @version 0.3.7
 * @author Pimgd
 */
public enum StartingSkinTone {
	
	VERY_LIGHT(Util.newArrayListOfValues(
			Colour.SKIN_PALE,
			Colour.SKIN_PINK,
			Colour.SKIN_BLUE,
			Colour.SKIN_IVORY,
			
			Colour.COVERING_BLEACH_BLONDE,
			Colour.COVERING_GINGER,
			Colour.COVERING_LILAC,
			Colour.COVERING_PINK,
			Colour.COVERING_WHITE,
			
			Colour.ORIFICE_INTERIOR,
			Colour.TONGUE,

			Colour.COVERING_BROWN,
			Colour.COVERING_BLONDE,
			Colour.COVERING_BLEACH_BLONDE,
			Colour.COVERING_GINGER,
			Colour.COVERING_WHITE,
			Colour.COVERING_PINK,
			
			Colour.COVERING_CLEAR,
			Colour.COVERING_NONE,

			Colour.EYE_BROWN,
			Colour.EYE_BLUE,
			Colour.EYE_GREEN,
			Colour.EYE_YELLOW,
			Colour.EYE_RED,
			Colour.EYE_PINK,
			Colour.EYE_ORANGE,
			Colour.EYE_BLACK)),
			
	LIGHT(Util.newArrayListOfValues(
			Colour.SKIN_LIGHT,
			Colour.SKIN_ROSY,
			Colour.SKIN_PINK,
			Colour.SKIN_BLUE,
			Colour.SKIN_IVORY,
			Colour.SKIN_LILAC,
			
			Colour.COVERING_WHITE,
			Colour.COVERING_BLUE,
			Colour.COVERING_LILAC,
			Colour.COVERING_PINK,
			Colour.COVERING_RED,
			Colour.COVERING_GREEN,
			Colour.COVERING_YELLOW,
			Colour.COVERING_ORANGE,
			Colour.COVERING_GINGER,
			Colour.COVERING_BLEACH_BLONDE,
			
			Colour.ORIFICE_INTERIOR,
			Colour.TONGUE,

			Colour.COVERING_BROWN,
			Colour.COVERING_BLONDE,
			Colour.COVERING_BLEACH_BLONDE,
			Colour.COVERING_GINGER,
			Colour.COVERING_RED,
			Colour.COVERING_WHITE,
			Colour.COVERING_BLUE,
			Colour.COVERING_PURPLE,
			Colour.COVERING_PINK,
			Colour.COVERING_GREEN,
			
			Colour.COVERING_CLEAR,
			Colour.COVERING_NONE,

			Colour.EYE_BROWN,
			Colour.EYE_BLUE,
			Colour.EYE_GREEN,
			Colour.EYE_YELLOW,
			Colour.EYE_RED,
			Colour.EYE_PINK,
			Colour.EYE_ORANGE,
			Colour.EYE_BLACK)),
			
	OLIVE(Util.newArrayListOfValues(
			Colour.SKIN_OLIVE,
			Colour.SKIN_TANNED,
			Colour.SKIN_RED,
			Colour.SKIN_BROWN,
			Colour.SKIN_PINK,
			Colour.SKIN_BLUE,
			Colour.SKIN_LILAC,
			Colour.SKIN_PURPLE,
			Colour.SKIN_IVORY,

			Colour.COVERING_BLACK,
			Colour.COVERING_WHITE,
			Colour.COVERING_BLUE,
			Colour.COVERING_LILAC,
			Colour.COVERING_PINK,
			Colour.COVERING_RED,
			Colour.COVERING_GREEN,
			Colour.COVERING_YELLOW,
			Colour.COVERING_ORANGE,
			Colour.COVERING_GINGER,
			Colour.COVERING_BLEACH_BLONDE,
			
			Colour.ORIFICE_INTERIOR,
			Colour.TONGUE,

			Colour.COVERING_BROWN,
			Colour.COVERING_BROWN_DARK,
			Colour.COVERING_BLACK,
			Colour.COVERING_BLONDE,
			Colour.COVERING_BLEACH_BLONDE,
			Colour.COVERING_RED,
			Colour.COVERING_WHITE,
			Colour.COVERING_BLUE,
			Colour.COVERING_PURPLE,
			Colour.COVERING_PINK,
			Colour.COVERING_GREEN,
			
			Colour.COVERING_CLEAR,
			Colour.COVERING_NONE,

			Colour.EYE_BROWN,
			Colour.EYE_BLUE,
			Colour.EYE_GREEN,
			Colour.EYE_YELLOW,
			Colour.EYE_RED,
			Colour.EYE_PINK,
			Colour.EYE_ORANGE,
			Colour.EYE_BLACK)),
			
	DARK(Util.newArrayListOfValues(
			Colour.SKIN_DARK,
			Colour.SKIN_RED,
			Colour.SKIN_BROWN,
			Colour.SKIN_LILAC,
			Colour.SKIN_PURPLE,

			Colour.COVERING_BLACK,
			Colour.COVERING_WHITE,
			Colour.COVERING_BLUE,
			Colour.COVERING_LILAC,
			Colour.COVERING_PINK,
			Colour.COVERING_RED,
			Colour.COVERING_GREEN,
			Colour.COVERING_YELLOW,
			Colour.COVERING_ORANGE,
			
			Colour.ORIFICE_INTERIOR,
			Colour.TONGUE,

			Colour.COVERING_BROWN,
			Colour.COVERING_BROWN_DARK,
			Colour.COVERING_BLACK,
			Colour.COVERING_RED,
			Colour.COVERING_WHITE,
			Colour.COVERING_BLUE,
			Colour.COVERING_PURPLE,
			Colour.COVERING_PINK,
			Colour.COVERING_GREEN,
			
			Colour.COVERING_CLEAR,
			Colour.COVERING_NONE,

			Colour.EYE_BROWN,
			Colour.EYE_YELLOW,
			Colour.EYE_RED,
			Colour.EYE_PINK,
			Colour.EYE_ORANGE,
			Colour.EYE_BLACK)),
			
	VERY_DARK(Util.newArrayListOfValues(
			Colour.SKIN_EBONY,
			Colour.SKIN_CHOCOLATE,
			Colour.SKIN_RED,
			Colour.SKIN_BROWN,
			Colour.SKIN_PURPLE,

			Colour.COVERING_BLACK,
			Colour.COVERING_WHITE,
			Colour.COVERING_BLUE,
			Colour.COVERING_RED,
			Colour.COVERING_GREEN,
			Colour.COVERING_YELLOW,
			Colour.COVERING_ORANGE,
			
			Colour.ORIFICE_INTERIOR,
			Colour.TONGUE,

			Colour.COVERING_BROWN,
			Colour.COVERING_BROWN_DARK,
			Colour.COVERING_BLACK,
			Colour.COVERING_RED,
			Colour.COVERING_WHITE,
			Colour.COVERING_BLUE,
			Colour.COVERING_PURPLE,
			Colour.COVERING_GREEN,
			
			Colour.COVERING_CLEAR,
			Colour.COVERING_NONE,

			Colour.EYE_BROWN,
			Colour.EYE_YELLOW,
			Colour.EYE_RED,
			Colour.EYE_PINK,
			Colour.EYE_ORANGE,
			Colour.EYE_BLACK));
	
	private List<Colour> associatedColours;
	
	private StartingSkinTone(List<Colour> associatedColours) {
		this.associatedColours = associatedColours;
	}

	public List<Colour> getAssociatedColours() {
		return associatedColours;
	}
	
}
