/**
 * 
 */
package edu.westga.cs6241.babble.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6241.babble.model.Tile;

/**
 * Tests for lower case letter
 * 
 * @author christina.m.bill
 * @version Fall 2014
 */
public class TestCanNotMakeTileWithLetterh {
	
	private Tile tile;

	@Test
	public void testWithLetterh() {
		try{
			tile = new Tile('h', 4);
		}	
		catch (IllegalArgumentException e) {
			assertTrue(true);
		}
	}

}
