package edu.balboa.apcs.MineSweeper;



//import MineSweeper;

import java.util.Scanner;



/**
 * Tcounts class is the driver for the APCS MineSweeper app.
 * 
 * @author team X
 */
package edu.balboa.apcs.MineSweeper;

import java.util.Scanner;

public class MakeBoard {
	final static String alph = "abcdefghijklmnop";
	static char[][] count;
	final static double percent = 0.16;

	public MakeBoard(String s) {
		s = s.toLowerCase().trim();
		if (s.equals("easy")) {
			count = new char[8][8];
		} else if (s.equals("medium")) {
			count = new char[12][12];
		} else if (s.equals("hard")) {
			count = new char[15][15];
		} else {
			System.out.println("Please choose from + \n +"
					+ "Easy , Medium , Hard ");
		}
	}
	public static void grid() {

		for (int y = 0; y < count[0].length; y++) {
			if (y == 0) {
				System.out.print("     ");
			}
			System.out.print(alph.charAt(y) + "   ");
		}

		for (int r = 0; r < count.length; r++) {

			if (r == 0) {
			} else {
				System.out.print(" |   ");
			}
			if (r < 10) {
				System.out.print("\n" + "   +");
			} else {
				System.out.print("\n" + "   +");
			}

			for (int col = 0; col < count.length; col++) {
				System.out.print("---+");
			}

			System.out.println(" ");
			for (int col = 0; col < count.length; col++) {
				// Prints out the number column and the vertical dividers
				if (col == 0)
					System.out.printf("%2d", r + 1);
				if (col == count.length - 1 && r == count.length - 1) {
					// Takes care of the last H.divider on the last row
					System.out.print(" |  ");
				}
				System.out.print(" |  ");
			}
		}
		System.out.print("\n" + "   ");
		for (int row = 0; row < count.length; row++) {
			// The final row of dividers that seems to not cooperate is held
			// here.

			System.out.print("+---");
		}
		System.out.print("+");

	}


	public static void main(String[] args) {
		System.out.println("Welcome to APCS MineSweeper.");
		System.out.println("Please choose a difficulty: ");
		Scanner abc = new Scanner(System.in);
		String n = abc.nextLine();
		makeBoard hello = new makeBoard(n);
		hello.grid();
		// uncomment if your team decides to use the provided
		// console-like UI class instead of running MineSweeper
		// at the command line (in a terminal shell):
		//
		// MineSweeperConsole.main(null);

	}
}



