

package edu.balboa.apcs.MineSweeper;

//import MineSweeper;

import java.util.Scanner;



/**
 * Tcounts class is the driver for the APCS MineSweeper app.
 * 
 * @author team X
 */


public class MineSweeper {
	
	
	static Square[][] count; //keep in mind that we have (2) 2D arrays - count & board. we need to fix this.
	static MineField m1;
	static int winCount;
	char type;
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
	
	
	public static void playGame(MineField m) {
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
					s.toString();
					return;
				} else if(lose) {
					System.out.println("You've lost.");
					s.addLosses();
					s.toString();
					return;
				}
				
			}
			
		}
	
	public String toString() {
		
	}
		//this will check whether we've won or not, based on the number we give to the win() method, and increment our Win or loss field    
	
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
		y--;
		if(type == 'u'){
			try {
				Square curSquare = m1.getSquare(y,x);
			
			} catch(Exception e) {
				
			}
		}
		
		}	
		}

	public static void main(String[] args) {
		System.out.println("Welcome to APCS MineSweeper.");
		beginGame();
		playGame(m1);
		
		for(int i = 0; i <1;) {
			System.out.println("Play again? Enter: Y for yes, Q for quit");
			Scanner keyboard3 = new Scanner(System.in);
			String userInput = keyboard3.nextLine();
			if(userInput.equalsIgnoreCase("Y")) {
				beginGame();
				playGame(m1);
			} else if(userInput.equalsIgnoreCase("Q")) {
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
