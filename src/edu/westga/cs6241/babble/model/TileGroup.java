/**
 * 
 */
package edu.westga.cs6241.babble.model;

import java.util.ArrayList;

/**
 * Abstract class for collections of tiles
 * 
 * @author christina.m.bill
 * @version Fall 2014
 */
public abstract class TileGroup {

	private ArrayList<Tile> tiles;

	/**
	 * Constructor
	 */
	public TileGroup() {
		this.tiles = new ArrayList<Tile>();
	}

	/**
	 * Appends tile
	 * 
	 * @param tile
	 *            tile
	 */
	public void append(Tile tile) {
		tiles.add(tile);
	}

	/**
	 * Removes tile
	 * 
	 * @param tile
	 *            Tile
	 */
	public void remove(Tile tile) {
		tiles.remove(tile);
	}

	@Override
	public String toString() {
		String string = "";
		for (Tile tiles : this.tiles) {
			string = string + tiles.getLetter();
		}
		return string;

	}

	/**
	 * returns arraylist of tiles
	 * 
	 * @return ArrayList<Tile>
	 */
	public ArrayList<Tile> getTiles() {
		return this.tiles;
	}

}
