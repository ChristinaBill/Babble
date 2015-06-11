/**
 * 
 */
package edu.westga.cs6241.babble.testing;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

import edu.westga.cs6241.babble.model.Tile;
import edu.westga.cs6241.babble.model.TileRack;
import edu.westga.cs6241.babble.model.Word;

/**
 * tests getScore with word HEAVY
 * 
 * @author christina.m.bill
 * @version Fall 2014
 */
public class TestHeavyShouldHaveScoreOf14 {

	private TileRack rack;
	private Word word;



	@Before
	public void createWord() {
		this.word = new Word();
		this.rack = new TileRack(5);

		this.word.append(new Tile('H', 4));
		this.word.append(new Tile('E', 1));
		this.word.append(new Tile('A', 1));
		this.word.append(new Tile('V', 4));
		this.word.append(new Tile('Y', 4));

		this.rack.canMakeWordFrom("HEAVY");

	}

	@Test
	public void testHEAVYShouldHaveScore14() {
		
		assertEquals(14, this.word.getScore());
	}

}
