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
 * Tests removeWord method if tiles are out of order
 * 
 * @author christina.m.bill
 * @version Fall 2014
 */
public class TestCanRemoveWordFromTileRackWhenTilesOutOfOrder {

	private TileRack rack;
	
	@Before
	public void setTileRack(){
		this.rack = new TileRack(7);
		this.rack.append(new Tile('T', 1));
		this.rack.append(new Tile('A', 1));
		this.rack.append(new Tile('A', 1));
		this.rack.append(new Tile('C', 3));
		this.rack.append(new Tile('A', 1));
		this.rack.append(new Tile('A', 1));
		this.rack.append(new Tile('A', 1));
		
		
	}
	
	@Test
	public void testRemoveWordCAT() {
		this.rack.removeWord("CAT");
		assertTrue(this.rack.canMakeWordFrom("AAAA"));
		assertEquals(3, this.rack.getNumberOfTilesNeeded());
	}

}
