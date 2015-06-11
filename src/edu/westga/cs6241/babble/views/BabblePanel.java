/**
 * 
 */
package edu.westga.cs6241.babble.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import edu.westga.cs6241.babble.Babble;
import edu.westga.cs6241.babble.controllers.BabbleController;

/**
 * Build Babble Panel
 * 
 * @author Christina Bill
 * 
 * @version Fall 2014
 * 
 */
public class BabblePanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static BabbleController game;
	private JTextField word;
	private JLabel message;
	private static JLabel currentScore;
	private static JLabel tiles;
	private Color lightBlue;

	/**
	 * Constructor
	 * @param babble Babble babble
	 */
	public BabblePanel(Babble babble) {
		message = new JLabel();

		game = new BabbleController();
		lightBlue = new Color(31, 190, 214);

		this.setPreferredSize(new Dimension(500, 200));
		this.setLayout(new BorderLayout());

		game.startGame();

		this.createNorthPanel();
		this.createWestPanel();
		this.createCenterPanel();

	}

	private void createNorthPanel() {
		JPanel northPanel = new JPanel();
		northPanel.setBackground(lightBlue);
		northPanel.setPreferredSize(new Dimension(200, 50));
		JLabel babbleLbl = new JLabel("Babble");
		northPanel.add(babbleLbl);
		this.add(northPanel, BorderLayout.NORTH);

	}

	private void createWestPanel() {

		JPanel westPanel = new JPanel();
		westPanel.setBackground(lightBlue);
		westPanel.setPreferredSize(new Dimension(300, 50));

		game.refreshTileRack();

		JLabel wordLbl = new JLabel("Word");
		westPanel.add(wordLbl);
		word = new JTextField(7);
		westPanel.add(word);

		JButton setWord = new JButton("Set Word");
		setWord.addActionListener(new TextBoxInputListener() {
		});

		westPanel.add(setWord);

		currentScore = new JLabel();
		currentScore.setText("Current Score: "
				+ Integer.toString(BabblePanel.game.getScore()));
		westPanel.add(currentScore);
		westPanel.add(message);

		this.add(westPanel, BorderLayout.WEST);

	}

	private void createCenterPanel() {
		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(lightBlue);
		centerPanel.setPreferredSize(new Dimension(100, 40));
		JLabel tilesLbl = new JLabel("Tiles");
		centerPanel.add(tilesLbl);
		tiles = new JLabel();
		tiles.setText(game.getTilesAsString());
		centerPanel.add(tiles);

		JButton reset = new JButton("   Reset Game   ");
		reset.addActionListener(new Reset());
		centerPanel.add(reset);

		this.add(centerPanel, BorderLayout.CENTER);

	}

	private class Reset implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			BabblePanel.game.startGame();
			BabbleGUI gui = new BabbleGUI();
			gui.run();
			JOptionPane.showMessageDialog(null, "Game is reset.");

		}

	}

	private class TextBoxInputListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String word2 = word.getText();
			int guessResult = game.checkCandidateWord(word2);

			String result = null;
			switch (guessResult) {
			case BabbleController.VALID_WORD:
				result = "Good job!";
				game.removeWord(word2);
				break;
			case BabbleController.NOT_ENOUGH_TILES:
				result = "Not enough tiles to make that word. Please try again.";
				break;
			case BabbleController.MISSPELLED_WORD:
				result = "Misspelled word.  Please try again.";
				break;
			}
			message.setText(result);

			BabblePanel.currentScore.setText("Current Score: "
					+ Integer.toString(BabblePanel.game.getScore()));

			BabblePanel.game.refreshTileRack();
			BabblePanel.tiles.setText(game.getTilesAsString());
			getClass();
			word.setText("");

		}

	}

}
