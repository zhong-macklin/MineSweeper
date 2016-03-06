package edu.balboa.apcs.MineSweeper;



//import MineSweeper;

import java.util.Scanner;



/**
 * Tcounts class is the driver for the APCS MineSweeper app.
 * 
 * @author team X
 */
public class MineSweeper {
	static char[][] count;
	final static double percent = 0.16;
	static char[] s3 = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
			'l', 'm', 'n', 'o' };

	public MineSweeper(String s) {
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

		String s1 = "";
		String s2 = "";
		System.out.print(" ");
		for (int i = 0; i < count.length; i++) {
			System.out.print("   " + s3[i]);
			s1 += "+---";
			if (i == count.length - 1) {
				s1 += "+";
			}
		}
		for (int i = 0; i < count.length; i++) {
			s2 += "|   ";
			if (i == count.length - 1) {
				s2 += "|";
			}
		}
		for (int i = 1; i < count.length + 1; i++) {
			if (i < 10) {
				System.out.println("\n " + " " + s1);
				System.out.print(i + " " + s2);
				if (i == count.length) {
					System.out.println("\n" + "  " + s1);
				}
			} else {
				System.out.println("\n " + " " + s1);
				System.out.print(i + s2);
				if (i == count.length) {
					System.out.println("\n" + "  " + s1);
				}
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to APCS MineSweeper.");
    		System.out.println("Please choose a difficulty: ");
		Scanner abc = new Scanner(System.in);
		String n = abc.nextLine();	
		MineSweeper m1 = new MineSweeper(n);

		grid();
		// uncomment if your team decides to use the provided
		// console-like UI class instead of running MineSweeper
		// at the command line (in a terminal shell):
		//
		// MineSweeperConsole.main(null);

	}

}
