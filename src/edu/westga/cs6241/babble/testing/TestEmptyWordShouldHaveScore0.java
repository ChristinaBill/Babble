/**
 * 
 */
package edu.westga.cs6241.babble.testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.westga.cs6241.babble.model.TileRack;
import edu.westga.cs6241.babble.model.Word;

/**
 * tests getScore with empty word
 * 
 * @author christina.m.bill
 * @version Fall 2014
 */
public class TestEmptyWordShouldHaveScore0 {

	private Word word;
	private TileRack rack;
	
	@Before
	public void createWord(){
		word = new Word();
		rack = new TileRack(0);
		
		rack.canMakeWordFrom("");
	}
	
	@Test
	public void testEmptyWordShouldHaveScore0() {
		assertEquals(0, this.word.getScore());
	}

}
