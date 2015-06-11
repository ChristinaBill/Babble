/**
 * 
 */
package edu.westga.cs6241.babble.testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.westga.cs6241.babble.model.TileRack;

/**
 * Tests canMakeWordFrom method
 * 
 * @author christina.m.bill
 * @version Fall 2014
 */
public class TestEmptyTileRackShouldNotContainDWELL {
	
	private TileRack rack;
	
	@Before
	public void setTileRack(){
	this.rack = new TileRack(0);
	}
	
	@Test
	public void testEmptyTileRack() {
		assertFalse(this.rack.canMakeWordFrom("DWELL"));
	}

}
