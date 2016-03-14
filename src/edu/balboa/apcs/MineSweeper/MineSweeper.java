package edu.balboa.apcs.MineSweeper;

//import MineSweeper;

import java.util.Scanner;

/**
 * This class is the controller for the APCS MineSweeper app.
 * 
 * @author vivian  team P
 * @author rassel  team P
 */

public class MineSweeper {
	
	private static MineField m1;
	private static int winCount;
	private char type;
	private int x;
	private int y;
	private static MakeBoard print;
	private static Scoreboard s = new Scoreboard();
	private static boolean win = false;
	private static boolean lose = false;

	
	/**
	 * This method starts the game. Prompts the user to choose a specific level.
	 * 
	 */
	public void beginGame() {

		for (int i = 0; i < 1;) {
			System.out.println("Please choose a difficulty:\n(b for beginner, i for intermediate, or a for advanced.)");
			Scanner abc = new Scanner(System.in);
			String n = abc.nextLine();
			n = n.toLowerCase().trim();
			if (n.equalsIgnoreCase("b")) {

				m1 = new MineField(8);
				i++;

			} else if (n.equalsIgnoreCase("i")) {

				m1 = new MineField(12);
				i++;

			} else if (n.equalsIgnoreCase("a")) {

				m1 = new MineField(15);
				i++;

			} else {
				System.out.println("Invalid command.");
			}
		}
	}

	
	/**
	 * This method prompts the user to start playing the game. Prompts the user to inspect,
	 * flag, unflag or quit the game. This method checks what the user inputs and sees
	 * if the player wins or loses.
	 * 
	 * @param m: MineField that we will call the commands on
	 */
	public void playGame(MineField m) {
		win = false;
		lose = false;
		MakeBoard.grid(m1);

		for (int o = 0; o < 1;) {
			System.out.println(
					"\nType in a command:\n(i to inspect, f to flag, u to unflag, or q to quit this game)\nand then coordinates.\nExample: i b3");
			Scanner keyboard2 = new Scanner(System.in);
			String command = keyboard2.nextLine();
			command.trim();
			if (command.equalsIgnoreCase("q")) {
				return;
			}
			parseCommand(command);

			if (win) {
				System.out.println("You have won the game!");
				s.addWins();
				System.out.println(s.toString());
				return;
			} else if (lose) {

				for (int i = 0; i < m1.getNumRows(); i++) {
					for (int a = 0; a < m1.getNumRows(); a++) {
						if (m1.getSquareAt(i, a).getIsMined()) {

							m1.getSquareAt(i, a).setIsMined(true);
							m1.getSquareAt(i, a).setIsRevealed(true);
							m1.getSquareAt(i, a).toString();
						}
					}
				}
				MakeBoard.grid(m1);
				System.out.println("You've lost.");
				s.addLosses();
				System.out.println(s.toString());
				return;
			}
			MakeBoard.grid(m1);
		}

	}

	/**
	 * This method takes in what the user inputs (its command) and deciphers it, 
	 * then carries it out. 
	 * 
	 * @param command: the String that the user inputs
	 */
	public void parseCommand(String command) {
		type = '0';
		x = -1;
		y = -1;

		for (int i = 0; i < command.length(); i++) {
			char ch = command.toLowerCase().charAt(i);
			if (ch == ' ') {

			} else if (type == '0') {
				type = ch;
			} else if (x == -1) {
				if (ch < 'a' || ch >= 'z') {
					System.out.println("Invalid, please try again.");
					return;
				} else {
					x = command.toLowerCase().charAt(i) - 'a';
				}
			} else if (y == -1) {
				if (ch <= '0' || ch > '9') {
					System.out.println("Invalid, please try again.");
					return;
				} else {
					y = Character.getNumericValue(ch);
				}
			} else if (y < 10 && y > -1) {
				if (ch < '0' || ch > '9') {
					System.out.println("Invalid, please try again.");
					return;
				} else {
					y = 10 * y + Character.getNumericValue(ch);
					 System.out.println("y = " + y);
				}
			} else {
				System.out.println("Invalid, please try again.");
				return;
			}

		}

		y--;

		if (type == 'f') {
			try {
				Square curSquare = m1.getSquareAt(y, x);
				curSquare.setIsFlagged(true);

			} catch (Exception e) {
				System.out.println("Invalid, please try again.");
				return;
			}
		} else if (type == 'u') {
			try {
				Square curSquare = m1.getSquareAt(y, x);
				curSquare.setIsFlagged(false);
			} catch (Exception e) {
				System.out.println("Invalid, please try again.");
				return;
			}
		} else if (type == 'i') {

			int cantWin = 0;
			
			try {	
				if (m1.getSquareAt(y, x).getIsMined()) {
					lose = true;
					return;
				}
				m1.inspect(y, x);
			
			} catch (Exception e) {
				System.out.println("Invalid, please try again.");
				return;
			}
			

			for (Square[] t : m1.getBoard()) {
				for (Square u : t) {
					if (!u.getIsRevealed() && !u.getIsMined()) {
						cantWin++;
					}
				}
			}

			if (cantWin == 0) {
				win = true;
				return;
			}
		}
	}

	
	/**
	 * This is where the game calls upon the beginGame method and playGame method.
	 * Asks the user if they would like to play again or quit.
	 * 
	 */
	public static void main(String[] args) {
		MineSweeper s1 = new MineSweeper();
		System.out.println("Welcome to APCS MineSweeper.\n");
		s1.beginGame();
		// System.out.println("begin game done");
		s1.playGame(m1);
		// System.out.println("play game done");

		for (int i = 0; i < 1;) {
			System.out.println("\nPlay again? Enter: Y for yes, Q to quit this program");
			Scanner keyboard3 = new Scanner(System.in);
			String userInput = keyboard3.nextLine();
			if (userInput.equalsIgnoreCase("Y")) {
				s1.beginGame();
				s1.playGame(m1);
			} else if (userInput.equalsIgnoreCase("Q")) {
				return;
			} else {
				System.out.println("Invalid command");
			}
			// uncomment if your team decides to ue the provided
			// console-like UI class instead of running MineSweeper
			// at the command line (in a terminal shell):
			//
			// MineSweeperConsole.main(null);

		}
	}
}
