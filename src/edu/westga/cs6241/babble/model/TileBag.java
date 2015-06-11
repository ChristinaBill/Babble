/**
 * 
 */
package edu.westga.cs6241.babble.model;

import java.util.ArrayList;
import java.util.Random;

/**
 * Creates Tile Bag and Draws Tiles
 * 
 * @author christina.m.bill
 * @version Fall 2014
 */
public class TileBag {

	private ArrayList<Tile> tiles;
	private Random random;

	/**
	 * 0-parameter constructor
	 */
	public TileBag() {
		this.tiles = new ArrayList<Tile>();
		random = new Random();
		this.scrabbleTiles();

	}

	/**
	 * Draws Tiles
	 * 
	 * @return tile Tile
	 */
	public Tile drawTile() {
		if(isEmpty()){
			throw new IllegalStateException("Tiles are empty");
		}
		int pileSize = this.tiles.size();
		int pileIndex = this.random.nextInt(pileSize);
		Tile tile = this.tiles.remove(pileIndex);
		return tile;
	}

	/**
	 * check for empty tile bag
	 * 
	 * @return True if empty
	 */
	public boolean isEmpty() {
		if(this.tiles == null) {
			throw new IllegalStateException("Tiles are empty");
		}
		return this.tiles.isEmpty();
	}

	private void scrabbleTiles() {

		for (int i = 0; i < 9; i++) {
			this.tiles.add(new Tile('A', 1));
		}
		
		for (int i = 0; i < 12; i++) {
			this.tiles.add(new Tile('E', 1));
		}
		
		for (int i = 0; i < 9; i++) {
			this.tiles.add(new Tile('I', 1));
		}
		
		for (int i = 0; i < 8; i++) {
			this.tiles.add(new Tile('O', 1));
		}
		
		for (int i = 0; i < 4; i++) {
			this.tiles.add(new Tile('U', 1));
		}
		
		for (int i = 0; i < 6; i++) {
			this.tiles.add(new Tile('N', 1));
		}
		
		for (int i = 0; i < 6; i++) {
			this.tiles.add(new Tile('R', 1));
		}
		
		for (int i = 0; i < 6; i++) {
			this.tiles.add(new Tile('T', 1));
		}
		
		for (int i = 0; i < 4; i++) {
			this.tiles.add(new Tile('L', 1));
		}
		
		for (int i = 0; i < 4; i++) {
			this.tiles.add(new Tile('S', 1));
		}

		for (int i = 0; i < 4; i++) {
			this.tiles.add(new Tile('D', 2));
		}
		
		for (int i = 0; i < 3; i++) {
			this.tiles.add(new Tile('G', 2));
		}

		for (int i = 0; i < 2; i++) {
			this.tiles.add(new Tile('B', 3));
		}

		for (int i = 0; i < 2; i++) {
			this.tiles.add(new Tile('C', 3));
		}

		for (int i = 0; i < 2; i++) {
			this.tiles.add(new Tile('M', 3));
		}
		
		for (int i = 0; i < 2; i++) {
			this.tiles.add(new Tile('P', 3));
		}

		for (int i = 0; i < 2; i++) {
			this.tiles.add(new Tile('F', 4));
		}

		for (int i = 0; i < 2; i++) {
			this.tiles.add(new Tile('H', 4));
		}

		for (int i = 0; i < 2; i++) {
			this.tiles.add(new Tile('V', 4));
		}

		for (int i = 0; i < 2; i++) {
			this.tiles.add(new Tile('W', 4));
		}

		for (int i = 0; i < 2; i++) {
			this.tiles.add(new Tile('Y', 4));
		}

		this.tiles.add(new Tile('K', 5));

		this.tiles.add(new Tile('J', 8));
		this.tiles.add(new Tile('X', 8));

		this.tiles.add(new Tile('Q', 10));
		this.tiles.add(new Tile('Z', 10));

	}

}
