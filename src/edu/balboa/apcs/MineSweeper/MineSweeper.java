

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

	public MineSweeper(String s) {
		s = s.toLowerCase().trim();
		if (s.equals("easy")) {
			count = new Square[8][8];
			m1 = new MineField(8);
		} else if (s.equals("medium")) {
			count = new Square[12][12];
			m1 = new MineField(12);
		} else if (s.equals("hard")) {
			count = new Square[15][15];
			m1 = new MineField(15);
		} else {
			System.out.println("Please choose from + \n +"
					+ "Easy , Medium , Hard ");
		}
	}
	
	public void playGame(String a) {
		a = a.trim();
		if(a.charAt(0) == 'i') {
			m1.inspect(a.indexOf(1)+1, a.charAt(a.length()-1));
			
		} else if(a.charAt(0) == 'f') {
			
			m1.getSquareAt(a.indexOf(1)+1, a.charAt(a.length()-1));
			
			m1.isFlagged = true;
		} else if(a.charAt(0) == 'u') {
			
			
			m1.setIsFlagged(false);
			
		} else if(a.charAt(0) == 'q') {
			
			System.out.println("You have quit the game.");
		}
	}
	
		public void doCommand() {
		
		
		
		
		}
	public void play(String user) {
			// Loop until game over/quit
			String user = i b3, f e1, u c8, q ;
		
		    // Dispatch on command
		    switch (user) {
		    	case "i b3":
		    	doCommand();
		        break;
		        case "f el":
		        doCommand();
		        break;
		        case "u c8":
		        doCommand();
		        break;
		        case "q":
		        doCommand();
		        break;
		        default:
		        System.out.println("Unknown command, input a command again.");
		    	}
		    		// Redraw the board and print out some messages
		    		//board.draw();
		    		if (win) {
		    			System.out.println("Congratulations your a winner! You found all the mines!");
		            	}
		            		else if (!q) {
		            			System.out.println("Bad luck, you stepped on a mine! :( ");
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



