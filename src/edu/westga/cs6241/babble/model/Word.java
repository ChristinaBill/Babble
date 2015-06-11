/**
 * 
 */
package edu.westga.cs6241.babble.model;

/**
 * Gets score of word
 * 
 * @author christina.m.bill
 * @version Fall 2014
 */
public class Word extends TileGroup {

	public Word(){
		
	}

	/**
	 * Returns score
	 * 
	 * @return score Score
	 */
	public int getScore() {
		int score = 0;

		for (Tile tile : super.getTiles()) {
			score += tile.getPointValue();
		}
		return score;

	}

}
