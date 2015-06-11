/**
 * 
 */
package edu.westga.cs6241.babble.model;

/**
 * Creates Tiles
 * @author christina.m.bill
 * @version Fall 2015
 */
public class Tile {

	private char letter;
	private int pointValue;

	/**
	 * 2-Parameter Constructor
	 * @param letter Letter
	 * @param pointValue Point Value
	 */
	public Tile(char letter, int pointValue) {
		if (Character.isLowerCase(letter)) {
			throw new IllegalArgumentException("Letter must be capitalized");
		}
		
		if (pointValue <= 0) {
			throw new IllegalArgumentException("Point Value must be a postive number");
		}
		this.letter = letter;
		this.pointValue = pointValue;

	}

	/**
	 * Returns letter
	 * @return letter Letter
	 */
	public char getLetter() {
		return this.letter;
	}

	/**
	 * Returns point value
	 * @return pointValue Point Value
	 */
	public int getPointValue() {
		return this.pointValue;
	}
}
