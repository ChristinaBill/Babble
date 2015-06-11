package edu.westga.cs6241.babble.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6241.babble.model.Tile;

/**
 * Tests for Negative point value
 * 
 * @author christina.m.bill
 * @version Fall 2014
 */
public class TestCanNotMakeTileWithNeg4PointValue {
	
	private Tile tile;
	
	@Test
	public void testNeg4PointValue() {
		try{
		tile = new Tile('H', -4);
		}
		catch(IllegalArgumentException e){
			assertTrue(true);
		}
	}
}
