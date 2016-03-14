package edu.balboa.apcs.MineSweeper;
import java.util.Scanner;

public class MakeBoard {
	
	private final static String alph = "abcdefghijklmnop";

	
	public static void grid(MineField m1) {

		for (int y = 0; y < m1.getNumRows(); y++) {
			if (y == 0) {
				System.out.print("     ");
			}
			System.out.print(alph.charAt(y) + "   ");
		}
		
		System.out.println();
		
		System.out.print("   +");
		for (int col3 = 0; col3 < m1.getNumRows(); col3++) {
			System.out.print("---+");
		}
		System.out.println();
		for (int row = 0; row < m1.getNumRows(); row++) {
			if (row < 9) {
				System.out.print((row + 1) + "  |" );
			} else {
				System.out.print((row + 1) + " |" );
			}
			
			for(int col = 0; col < m1.getNumRows(); col++) {
				/*if (b.getTile(col, row).getIsMined()) {
					System.out.print(" * ");
				}*/
				System.out.print(" " + m1.getSquareAt(row, col).toString() + " ");
				System.out.print("|");
			} 
			System.out.println();
			System.out.print("   +");
			for (int col2 = 0; col2 < m1.getNumRows(); col2++) {
				System.out.print("---+");
			}
			System.out.println();
		}
	
		/*for (int r = 0; r < m1.getNumRows(); r++) {

			if (r == 0) {
			} else {
				System.out.print(" |   ");
			}
			if (r < 10) {
				System.out.print("\n" + "   +");
			} else {
				System.out.print("\n" + "   +");
			}

			for (int col = 0; col < m1.getBoard().length; col++) {
				System.out.print("---+");
			}

			System.out.println(" ");
			for (int col = 0; col < m1.getBoard().length; col++) {
				// Prints out the number column and the vertical dividers
				if (col == 0)
					System.out.printf("%2d", r + 1);
				if (col == m1.getBoard().length - 1 && r == m1.getBoard().length - 1) {
					// Takes care of the last H.divider on the last row
					System.out.print(" |  ");
				}
				System.out.print(" |  ");
			}
		}
		System.out.print("\n" + "   ");
		for (int row = 0; row < m1.getBoard().length; row++) {
			// The final row of dividers that seems to not cooperate is held
			// here.

			System.out.print("+---");
		}
		System.out.print("+");

	}

	public String toString(char i, char t, int q, MineField m1) {
		String out = " ";
		//String 
	for (int y = 0; y < m1.getBoard().length; y++) {
			if (y == 0) {
				out += ("     ");
			}
			out+=(alph.charAt(y) + "   ");
		}

		for (int r = 0; r < m1.getBoard().length; r++) {

			if (r == 0) {
				
			} 
			if (!(m1.getBoard()[t][q].getIsRevealed())){
				out+= (" | "+ m1.getSquareAt(t, q).getNearMines() +" ");
			}
			if (!(m1.getSquareAt(t, q).getIsFlagged())&& !(m1.getSquareAt(t, q).getIsRevealed())) { 
				m1.getBoard()[t][q].getIsFlagged();
				out+= (" | f ");
			} 
			if (m1.getBoard()[t][q].getIsMined()) { 
				out+= (" | m ");
			}
			else {
				out+= (" |   ");
			}
			if (r < 10) {
				out+=("\n" + "   +");
			} else {
				out+=("\n" + "   +");
			}

			for (int col = 0; col < m1.getBoard().length; col++) {
				out+=("---+");
			}

			out+=(" ");
			for (int col = 0; col < m1.getBoard().length; col++) {
				// Prints out the number column and the vertical dividers
				if (col == 0)
					out+= System.out.printf("%2d", r + 1);
				if (col == m1.getBoard().length - 1 && r == m1.getBoard().length - 1) {
					// Takes care of the last H.divider on the last row
					out+=(" |  ");
				}
				out+=(" |  ");
			}
		}
		out+=("\n" + "   ");
		for (int row = 0; row < m1.getBoard().length; row++) {
			// The final row of dividers that seems to not cooperate is held
			// here.

			out+=("+---");
		}
		out+=("+");
		return out;
	}
	public static void main(String[] args) {
		Scanner b = new Scanner(System.in);
		MakeBoard booard = new MakeBoard();
		board.grid(m1.getBoard());
		String command = b.nextLine();
		
		
	}*/
	}
}



