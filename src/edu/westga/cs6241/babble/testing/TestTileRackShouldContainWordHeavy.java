/**
 * 
 */
package edu.westga.cs6241.babble.testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.westga.cs6241.babble.model.Tile;
import edu.westga.cs6241.babble.model.TileRack;


/**
 * tests canMakeWord method with word Heavy
 * 
 * @author christina.m.bill
 * @version Fall 2014
 */
public class TestTileRackShouldContainWordHeavy {

	private TileRack rack;

	@Before
	public void setTiles() {
		this.rack = new TileRack(7);
	    this.rack.append(new Tile('H', 4));
	    this.rack.append(new Tile('E', 1));
	    this.rack.append(new Tile('A', 1));
	    this.rack.append(new Tile('V', 4));
	    this.rack.append(new Tile('Y', 4));
	    this.rack.append(new Tile('H', 4));
	    this.rack.append(new Tile('X', 8));
	    
	}

	
	@Test
	public void testWordHeavy() {
		assertTrue(this.rack.canMakeWordFrom("HEAVY"));
	}

}
