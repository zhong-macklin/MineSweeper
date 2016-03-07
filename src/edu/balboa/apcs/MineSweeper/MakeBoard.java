package edu.balboa.apcs.MineSweeper;



//import MineSweeper;


public class MakeBoard {
	final static String alph = "abcdefghijklmnop";
	static char[][] count;
	final static double percent = 0.16;

	
	public static void grid() {

		for (int y = 0; y < count[0].length; y++) {
			if (y == 0) {
				System.out.print("     ");
			}
			System.out.print(alph.charAt(y) + "   ");
		}

		for (int r = 0; r < count.length; r++) {

			if (r == 0) {
			} else {
				System.out.print(" |   ");
			}
			if (r < 10) {
				System.out.print("\n" + "   +");
			} else {
				System.out.print("\n" + "   +");
			}

			for (int col = 0; col < count.length; col++) {
				System.out.print("---+");
			}

			System.out.println(" ");
			for (int col = 0; col < count.length; col++) {
				// Prints out the number column and the vertical dividers
				if (col == 0)
					System.out.printf("%2d", r + 1);
				if (col == count.length - 1 && r == count.length - 1) {
					// Takes care of the last H.divider on the last row
					System.out.print(" |  ");
				}
				System.out.print(" |  ");
			}
		}
		System.out.print("\n" + "   ");
		for (int row = 0; row < count.length; row++) {
			// The final row of dividers that seems to not cooperate is held
			// here.

			System.out.print("+---");
		}
		System.out.print("+");

	}


	
}



