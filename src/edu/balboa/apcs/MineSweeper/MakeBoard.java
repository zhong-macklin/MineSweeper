package edu.balboa.apcs.MineSweeper;


public class MakeBoard {
	final static String alph = "abcdefghijklmnop";
	static char[][] count;
	final static double percent = 0.16;

	
	public static void grid(char i, char t, int q) {

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

	public String toString(char i, char t, int q) {
		String out = " ";
	for (int y = 0; y < count[0].length; y++) {
			if (y == 0) {
				out += ("     ");
			}
			out+=(alph.charAt(y) + "   ");
		}

		for (int r = 0; r < count.length; r++) {

			if (r == 0) {
				
			} else if (r == q && t == alph.charAt(r)){
				out+= (" | "+i+" ");
			} else {
				out+= (" |   ");
			}
			if (r < 10) {
				out+=("\n" + "   +");
			} else {
				out+=("\n" + "   +");
			}

			for (int col = 0; col < count.length; col++) {
				out+=("---+");
			}

			out+=(" ");
			for (int col = 0; col < count.length; col++) {
				// Prints out the number column and the vertical dividers
				if (col == 0)
					out+= System.out.printf("%2d", r + 1);
				if (col == count.length - 1 && r == count.length - 1) {
					// Takes care of the last H.divider on the last row
					out+=(" |  ");
				}
				out+=(" |  ");
			}
		}
		out+=("\n" + "   ");
		for (int row = 0; row < count.length; row++) {
			// The final row of dividers that seems to not cooperate is held
			// here.

			out+=("+---");
		}
		out+=("+");
		return out;
	}
	
}

