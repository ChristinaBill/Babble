/**
 * 
 */
package edu.westga.cs6241.babble.testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.westga.cs6241.babble.model.TileBag;

/**
 * tests drawTile() method 100 times
 * 
 * @author christina.m.bill
 * @version Fall 2014
 */
public class TestCanNotDraw100TilesFromBag {

	private TileBag bag;
	  
	  @Before
	  public void setTileBag() {
	    this.bag = new TileBag();
	  }
	  
	  
	  @Test
	  public void canNotDraw100Tiles()
	  {
	    try
	    {
	      for (int i = 0; i < 100; i++) {
	        this.bag.drawTile();
	      }
	    }
	    catch (IllegalStateException e)
	    {
	      assertTrue(true);
	    }
	  }
	}
