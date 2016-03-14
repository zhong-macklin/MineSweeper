package edu.balboa.apcs.MineSweeper;
import java.util.Scanner;
/**
 * This class prints out the MineSweeper board according to the difficulty first, and later 
 * continues to print an updated version of the board according to the command from the user
 * 
 * The user needs to enter a valid command in order for the MakeBoard class to produce an updated version
 * 
 *
 */
public class MakeBoard {
	
	final static String alph = "abcdefghijklmnop";

	/**Based on the size of the MineField object created in the MineField class
	 * the grid() class prints out a grid-like board.
	 * @param A MineField object called m1
	 */
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
	}
}

