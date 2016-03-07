

package edu.balboa.apcs.MineSweeper;

//import MineSweeper;

import java.util.Scanner;



/**
 * Tcounts class is the driver for the APCS MineSweeper app.
 * 
 * @author team X
 */



public class MineSweeper {
	
	final static String alph = "abcdefghijklmnop";
	static char[][] count;


	public MineSweeper(String s) {
		s = s.toLowerCase().trim();
		if (s.equals("easy")) {
			count = new Square[8][8];
		} else if (s.equals("medium")) {
			count = new Square[12][12];
		} else if (s.equals("hard")) {
			count = new Square[15][15];
		} else {
			System.out.println("Please choose from + \n +"
					+ "Easy , Medium , Hard ");
		}
	}
	

	public static void main(String[] args) {
		System.out.println("Welcome to APCS MineSweeper.");
		System.out.println("Please choose a difficulty: ");
		Scanner abc = new Scanner(System.in);
		String n = abc.nextLine();
		MineSweeper hello = new MineSweeper(n);
		// uncomment if your team decides to use the provided
		// console-like UI class instead of running MineSweeper
		// at the command line (in a terminal shell):
		//
		// MineSweeperConsole.main(null);

	}
}



