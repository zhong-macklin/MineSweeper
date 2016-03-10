

package edu.balboa.apcs.MineSweeper;

//import MineSweeper;

import java.util.Scanner;



/**
 * Tcounts class is the driver for the APCS MineSweeper app.
 * 
 * @author team X
 */


public class MineSweeper {
	private int win, loss;
	final static String alph = "abcdefghijklmnop";
	static Square[][] count; //keep in mind that we have (2) 2D arrays - count & board. we need to fix this.
	MineField m1;
	static int winCount;

	public MineSweeper(String s) {
		s = s.toLowerCase().trim();
		if (s.equals("beginner")) {
			board = new Square[8][8];
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
	
		public void doCommand() {
		
		
		
		
		}
	public void play(String user) {
//			// Loop until game over/quit
//			String user = i b3, f e1, u c8, q ;
//		
//		    // Dispatch on command
//		    switch (user) {
//		    	case "i b3":
//		    	doCommand();
//		        break;
//		        case "f el":
//		        doCommand();
//		        break;
//		        case "u c8":
//		        doCommand();
//		        break;
//		        case "q":
//		        doCommand();
//		        break;
//		        default:
//		        System.out.println("Unknown command, input a command again.");
//		    	}
		    		// Redraw the board and print out some messages
		    		//board.draw();
		    		if (winCount.equals(board.getNumSquares()- getNumMinedSquare())) {
		    			System.out.println("Congratulations your a winner! You found all the mines!");
		            	}
		            		else if (!q) {
		            			System.out.println("Bad luck, you stepped on a mine! :( ");
		            		}
	}
	public String toString() { //this will check whether we've won or not, based on the number we give to the win() method, and increment our Win or loss field    
		if()
	}
		public void parseCommand(String command) {
		type = '0';
		x = -1;
		y = -1;
		
		for(int i = 0; i < command.length(); i ++) {
			char ch = command.charAt(i);
			if (ch == ' ') {
				
			}else if( type == '0'){
				type = ch;
			System.out.println("type =" + ch);
			}else if( x == -1) {
				if(ch < 'a'|| ch >= 'z') {
					System.out.println("Invalid, please try again.");
					return;
				}else{ 
					x = command.charAt(i) - 'a';
					System.out.println("x =" + x);
				}
			}else if(y== -1) {
				if(ch <= '0' || ch >= '9'){
					System.out.println("Invalid, please try again.");
					return;
				}else{
					y = Character.getNumericValue(ch);
					System.out.println("y =" + y);
				}
			}else {
				System.out.println("Invalid, please try again.");
				return;
			}
		}
		y--;
	//	if(type == 'u'){
			//try {
			//not done yet
			
		
			
			}

	public static void main(String[] args) {
		System.out.println("Welcome to APCS MineSweeper.");
		System.out.println("Please choose a difficulty: ");
		Scanner abc = new Scanner(System.in);
		String s = abc.nextLine();
		MineSweeper hello = new MineSweeper(s);
		// uncomment if your team decides to ue the provided
		// console-like UI class instead of running MineSweeper
		// at the command line (in a terminal shell):
		//
		// MineSweeperConsole.main(null);

	}
}



