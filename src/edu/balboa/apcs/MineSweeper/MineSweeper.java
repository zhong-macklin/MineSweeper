

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
	int x;
	int y;
	static MakeBoard print;
	static Scoreboard s;
	static boolean win = false;
	static boolean lose = false;

	
	public static void beginGame() {
		
		for(int i = 0; i < 1; ) {
			System.out.println("Please choose a difficulty: beginner, intermediate, advanced ");
			Scanner abc = new Scanner(System.in);
			String n = abc.nextLine();
			n = n.toLowerCase().trim();
			if (n.equalsIgnoreCase("beginner")) {
			
				m1 = new MineField(8);
				i++;
			
			} else if (n.equalsIgnoreCase("intermediate")) {
			
				m1 = new MineField(12);
				i++;
			
			} else if (n.equalsIgnoreCase("advanced")) {
		
				m1 = new MineField(15);
				i++;
			
			} else {
				System.out.println("Invalid command.");
			}
		}
		
	for(int i = 0; i < 1; ) {
		System.out.println("Please choose a difficulty: beginner, intermediate, advanced ");
		Scanner abc = new Scanner(System.in);
		String n = abc.nextLine();
		n = n.toLowerCase().trim();
		if (n.equalsIgnoreCase("beginner")) {
		
			m1 = new MineField(8);
			i++;
		
		} else if (n.equalsIgnoreCase("intermediate")) {
		
			m1 = new MineField(12);
			i++;
		
		} else if (n.equalsIgnoreCase("advanced")) {
	
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
			
			for(int o = 0; o < 1;) {
				MakeBoard.grid(m1);
				System.out.println("Type in a command: i = inspect, f = flag, u = unflag, q = quit");
				Scanner keyboard2 = new Scanner(System.in);
				String command = keyboard2.nextLine();
				parseCommand(command);
				
				if(win) {
					System.out.println("You have won the game!");
					s.addWins();
				} else if(lose) {
					System.out.println("You've lost.");
					s.addLosses();
				}
				
			}
			
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
	beginGame();
		// uncomment if your team decides to ue the provided
		// console-like UI class instead of running MineSweeper
		// at the command line (in a terminal shell):
		//
		// MineSweeperConsole.main(null);

	}
}



