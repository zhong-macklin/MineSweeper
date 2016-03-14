package edu.balboa.apcs.MineSweeper;

//import MineSweeper;

import java.util.Scanner;

/**
 * Tcounts class is the driver for the APCS MineSweeper app.
 * 
 * @author team X
 */

public class MineSweeper {

	static Square[][] count; // keep in mind that we have (2) 2D arrays - count
								// & board. we need to fix this.
	static MineField m1;
	static int winCount;
	char type;
	int x;
	int y;
	static MakeBoard print;
	static Scoreboard s = new Scoreboard();
	static boolean win = false;
	static boolean lose = false;

	public void beginGame() {

		for (int i = 0; i < 1;) {
			System.out.println("Please choose a difficulty: b for beginner, i for intermediate, or a for advanced ");
			Scanner abc = new Scanner(System.in);
			String n = abc.nextLine();
			n = n.toLowerCase().trim();
			if (n.equalsIgnoreCase("b")) {

				m1 = new MineField(8);
				// System.out.println("beginner minefield");

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

	public void playGame(MineField m) {
		win = false;
		lose = false;
		MakeBoard.grid(m1);
	
		for (int o = 0; o < 1;) {
			System.out.println(
					"\nType in a command: i to inspect, f to flag, u to unflag, or q to quit this game, and then coordinates.\nExample: i b3");
			Scanner keyboard2 = new Scanner(System.in);
			String command = keyboard2.nextLine();
			command.trim();
			if (command.equals("q") || command.equals("Q")) {
				return;
			}
			parseCommand(command);
			MakeBoard.grid(m1);

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

		}

	}

	public void parseCommand(String command) {
		type = '0';
		x = -1;
		y = -1;

		for (int i = 0; i < command.length(); i++) {
			char ch = command.toLowerCase().charAt(i);
			if (ch == ' ') {

			} else if (type == '0') {
				type = ch;
				// System.out.println("type =" + ch);
			} else if (x == -1) {
				if (ch < 'a' || ch >= 'z') {
					System.out.println("Invalid, please try again. 1");
					return;
				} else {
					x = command.toLowerCase().charAt(i) - 'a';
					// System.out.println("x =" + x);
				}
			} else if (y == -1) {
				if (ch <= '0' || ch > '9') {
					System.out.println("Invalid, please try again. 2");
					return;
				} else {
					y = Character.getNumericValue(ch);
					// System.out.println("y =" + y);
				}
			} else if (y < 10 && y > -1) {
				if (ch < '0' || ch > '9') {
					System.out.println("Invalid, please try again. 3");
					return;
				} else {
					y = 10 * y + Character.getNumericValue(ch);
					 System.out.println("y = " + y);
				}
			} else {
				System.out.println("Invalid, please try again. 4");
				return;
			}

		}

		y--;

		if (type == 'f') {
			try {
				Square curSquare = m1.getSquareAt(y, x);
				curSquare.setIsFlagged(true);

			} catch (Exception e) {
				System.out.println("Invalid, please try again. 5");
				return;
			}
		} else if (type == 'u') {
			try {
				Square curSquare = m1.getSquareAt(y, x);
				curSquare.setIsFlagged(false);
			} catch (Exception e) {
				System.out.println("Invalid, please try again. 6");
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

	public static void main(String[] args) {
		MineSweeper s1 = new MineSweeper();
		System.out.println("Welcome to APCS MineSweeper.");
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
