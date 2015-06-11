package edu.westga.cs6241.babble;

import edu.westga.cs6241.babble.views.*;

/**
 * Main class for starting a Babble game. 
 * @author lewisb
 *
 */
public class Babble {

	public static void main(String[] args) throws Exception {
		//BabbleTUI tui = new BabbleTUI();
		//tui.run();
		
		BabbleGUI gui = new BabbleGUI();
		gui.run();
	}

}
