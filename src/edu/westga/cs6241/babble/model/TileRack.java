/**

 * 
 */
package edu.westga.cs6241.babble.model;

import java.util.ArrayList;

/**
 * Build rack of 7 tiles to make a word
 * 
 * @author christina.m.bill
 * @version Fall 2014
 * 
 */
public class TileRack extends TileGroup {

	private int maxSize;

	/**
	 * 1 parameter constructor
	 * 
	 * @param maxSize
	 *            MaxSize
	 */
	public TileRack(int maxSize) {
		this.maxSize = maxSize;
	}

	/**
	 * Removes word from tiles
	 * 
	 * @param text
	 *            Text
	 * @return word Word
	 */
	public Word removeWord(String text) {		
		Word word = new Word();
		    for (int i = 0; i < text.length(); i++)
		    {
		      char letter = text.charAt(i);
		      for (Tile tile : super.getTiles()) {
		        if (letter == tile.getLetter())
		        {
		          word.append(tile);
		          super.remove(tile);
		          break;
		        }
		      }
		    }
		    return word;
		
		
	}

	/**
	 * returns number of tiles needed
	 * 
	 * @return tilesNeeded Tiles Needed
	 */
	public int getNumberOfTilesNeeded() {
		int tilesNeeded = maxSize - super.getTiles().size();
		return tilesNeeded;
	}

	/**
	 * Checks to see if word can be made from user choice of tiles
	 * 
	 * @param text
	 *            Text
	 * @return True if word can be made
	 */
	public boolean canMakeWordFrom(String text) {
		ArrayList<Tile> tileList = new ArrayList(super.getTiles());
		    String textFound = "";
		    for (int i = 0; i < text.length(); i++)
		    {
		      char letter = text.charAt(i);
		      for (Tile tile : tileList) {
		        if (letter == tile.getLetter())
		        {
		          textFound = textFound + letter;
		          tileList.remove(tile);
		          break;
		        }
		      }
		    }
		    return textFound.equals(text);
	}
}
