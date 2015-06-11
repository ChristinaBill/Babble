package edu.westga.cs6241.babble.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.westga.cs6241.babble.model.Tile;

/**
 * Tests Tile getLetter method and getPointValue method
 * 
 * @author christina.m.bill
 * @version Fall 2014
 */
public class TestCanMake4PointFTile {

	@Test
	public void test4PointFTile() {
		Tile tile = new Tile('F', 4);
		assertEquals('F', tile.getLetter());
		assertEquals(4, tile.getPointValue());
		
	}

}
