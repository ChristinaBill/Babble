/**
 *
 */
package edu.westga.cs6241.babble.testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.westga.cs6241.babble.model.TileBag;

/**
 * tests drawTile() from tileBag
 * 
 * @author christina.m.bill
 * @version Fall 2014
 */
public class TestCanDrawAllTilesFromTileBag {

	private TileBag bag;

	@Before
	public void fillTileBag() {
		this.bag = new TileBag();
	}
	

	@Test
	public void testDrawAllTiles() {

		 for (int i = 0; i < 98; i++) {
			 this.bag.drawTile();
		 }

		 assertTrue(this.bag.isEmpty());
	}



}
