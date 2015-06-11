/**
 * 
 */
package edu.westga.cs6241.babble.views;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

import edu.westga.cs6241.babble.Babble;


/**
 * Builds GUI
 * 
 * @author Christina Bill
 * @version Fall 2014
 */
public class BabbleGUI {

	private Babble babble;
	private JFrame theFrame;
	private JMenuBar menuBar;

	/**
	 * Creates a Gui object to provide the view for the specified Game model
	 * object.
	 * 
	 * @param theGame
	 *            the domain model object representing the Nim game
	 * 
	 * @requires theGame != null
	 * @ensures the GUI is displayed
	 */
	public BabbleGUI() {
	}

	/**
	 * creates gui
	 */
	public void run() {
		this.createGui();
	}

	private void createGui() {
		theFrame = new JFrame("Babble");
		theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theFrame.setLayout(new BorderLayout());
		theFrame.getContentPane().add(new BabblePanel(babble));
		theFrame.pack();
		theFrame.setVisible(true);
		this.buildMenuBar();
	}

	private void buildMenuBar() {
		this.menuBar = new JMenuBar();
		this.theFrame.setJMenuBar(this.menuBar);

		this.fileMenu();
		this.buildInstructionsMenu();

	}

	private void buildInstructionsMenu() {
		JMenu instructionsMenu = new JMenu("Instructions");
		instructionsMenu.getAccessibleContext().setAccessibleDescription(
				"Instructions");
		JMenuItem instructions = new JMenuItem("Instructions");
		instructions.setMnemonic(KeyEvent.VK_1);
		instructions.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I,
				ActionEvent.CTRL_MASK));
		instructionsMenu.add(instructions);
		instructions.addActionListener(new InstructionsAction());

		this.menuBar.add(instructionsMenu);
	}

	private String createInstructions() {
		return "The player tries to make words from a random set of seven letters. "
				+ "Each time the player makes a valid word, they score points based on the letters they used.";
	}
	
	
	

	private void fileMenu() {
		JMenu fileMenu = new JMenu("File");
		fileMenu.getAccessibleContext().setAccessibleDescription("File");
		
		JMenuItem exit = new JMenuItem("Exit");
		exit.setMnemonic(KeyEvent.VK_X);
		exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,
				ActionEvent.CTRL_MASK));
		fileMenu.add(exit);
		exit.addActionListener(new ExitAction());

		this.menuBar.add(fileMenu);
	}
	
	

	private class InstructionsAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			JOptionPane.showMessageDialog(null, BabbleGUI.this.createInstructions(), "Basic Directions",  JOptionPane.PLAIN_MESSAGE);

		}

	}
	
	private class ExitAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			System.exit(0);

		}

	}

}
