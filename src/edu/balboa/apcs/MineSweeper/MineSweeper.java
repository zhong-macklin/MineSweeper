

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
	static Square[][] count;
	MineField m1;
	char type;
	int x;
	int y;
	
	static boolean lose = false;
	static boolean win = true;
	static int numberWin = 0;
	static int numberLose = 0;

	public MineSweeper(String s) {
		s = s.toLowerCase().trim();
		if (s.equals("beginner")) {
			count = new Square[8][8];
			m1 = new MineField(8);
		} else if (s.equals("intermediate")) {
			count = new Square[12][12];
			m1 = new MineField(12);
		} else if (s.equals("advanced")) {
			count = new Square[15][15];
			m1 = new MineField(15);
		} else {
			System.out.println("Please choose from + \n +" 
		+ "Beginner , Intermediate , Advanced ");
		}
	}
	
		public void playGame(String a) {
		a = a.trim();
		if(a.charAt(0) == 'i') {
			m1.inspect(x, y);
		} else if(a.charAt(0) == 'f') {
			Square curSquare = m1.getSquareAt(x, y);
			curSquare.setIsFlagged(true);
		} else if(a.charAt(0) == 'u') {
			Square curSquare = m1.getSquareAt(x, y);
			curSquare.setIsFlagged(false);
		} else if(a.charAt(0) == 'q') {
			System.out.println("You have quit the game.");
		}
	}
	
		
		public void parseCommand(String command) {
			type = '0';
			x = -1;
			y = -1;
			
			for(int i = 0; i < command.length();i++) {
				char ch = command.charAt(i);
				
				
			}
			
		}

	public static void main(String[] args) {
		System.out.println("Welcome to APCS MineSweeper.");
		System.out.println("Please choose a difficulty: ");
		Scanner abc = new Scanner(System.in);
		String n = abc.nextLine();
		MineSweeper hello = new MineSweeper(n);
		// uncomment if your team decides to ue the provided
		// console-like UI class instead of running MineSweeper
		// at the command line (in a terminal shell):
		//
		// MineSweeperConsole.main(null);

	}
}



