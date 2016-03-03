package edu.balboa.apcs.MineSweeper;

//import MineSweeper;

import java.util.Scanner;

import javax.imageio.IIOException;

/**
 * This class is the driver for the APCS MineSweeper app.
 * @author team X
 */
public class MineSweeper {
	static String[][] count;
	final static double percent = 0.16;
	
	public MineSweeper(String s) {
		s = s.toLowerCase().trim();
		if(s.equals("easy")) {
		count = new String[8][8];
		} else if (s.equals("medium")) {
			count = new String[12][12];
		} else  if (s == "hard") {
			count = new String[15][15];
		} else { 
			System.out.println("Please choose from + \n +"
					+ "Easy , Medium , Hard ") ;
				
			}
		}
	
	public static void grid() {
		
		for(int x = 0; x < count.length; x++) {
//			if(x % 2 == 0) {
//			System.out.print( "+ ");
//			} else {
//				System.out.println( " | ");
//
//			}
			for(int y = 1; y<count[0].length; y= y + 2) {
				if(x %2 == 0) {
				System.out.print("+ --- ");
				} else {
					System.out.print( "|   |");
				}
					
			}
		}
		//System.out.println(count);

	}
	public static void main(String[] args) {
		System.out.println("Welcome to APCS MineSweeper.");
		System.out.println("Please choose a difficulty: ");
		Scanner abc = new Scanner(System.in);
		String n = abc.nextLine();
		MineSweeper hello = new MineSweeper(n);
		
		
		System.out.println(count);
		grid();
		// uncomment if your team decides to use the provided 
		// console-like UI class instead of running MineSweeper 
		// at the command line (in a terminal shell):
		//
		//MineSweeperConsole.main(null);
		
	}

}
