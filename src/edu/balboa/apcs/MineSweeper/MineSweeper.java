

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
<<<<<<< HEAD
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
=======
	static MineField m1;
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
		
>>>>>>> bb738509635c469dffdcdf7fa1b209db8b081de8
			m1 = new MineField(8);
			i++;
		
		} else if (n.equalsIgnoreCase("intermediate")) {
		
			m1 = new MineField(12);
			i++;
		
		} else if (n.equalsIgnoreCase("advanced")) {
	
			m1 = new MineField(15);
			i++;
		
		} else {
<<<<<<< HEAD
			System.out.println("Please choose from + \n +" 
		+ "Beginner , Intermediate , Advanced ");
=======
			System.out.println("Invalid command.");
>>>>>>> bb738509635c469dffdcdf7fa1b209db8b081de8
		}
	}
	
	public void notUsing(String a) {
		a = a.trim();
		if(a.charAt(0) == 'i') {
			
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
	
<<<<<<< HEAD
		
		public void parseCommand(String command) {
			type = '0';
			x = -1;
			y = -1;
			
			for(int i = 0; i < command.length();i++) {
				char ch = command.charAt(i);
				
=======
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
>>>>>>> bb738509635c469dffdcdf7fa1b209db8b081de8
				
			}
			
		}
<<<<<<< HEAD

=======
	
>>>>>>> bb738509635c469dffdcdf7fa1b209db8b081de8
	public static void main(String[] args) {
		System.out.println("Welcome to APCS MineSweeper.");
		beginGame();
	//	MineSweeper hello = new MineSweeper(n);
		// uncomment if your team decides to ue the provided
		// console-like UI class instead of running MineSweeper
		// at the command line (in a terminal shell):
		//
		// MineSweeperConsole.main(null);

	}
}



