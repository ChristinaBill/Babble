package edu.westga.cs6241.babble.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6241.babble.model.Tile;

/**
 * Tests for 0 point value
 * 
 * @author christina.m.bill
 * @version Fall 2014
 */
public class TestCanNotMakeTileWith0PointValue {

	private Tile tile;
	
	@Test
	public void test0PointValue() {
		
		try{
			tile = new Tile('H', 0);
		}	
		catch (IllegalArgumentException e) {
			assertTrue(true);
		}
		
	}

}
