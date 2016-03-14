package edu.balboa.apcs.MineSweeper;

import java.util.Random;

/**
 * Represents a "game board." This class contains a constructor which creates a <code>MineField</code>
 * with a 2D array of <code>Squares</code> and randomly mines a certain percent of them, and methods that
 * keep track of the size of the array, as well as accessor methods that return the 2D array 
 * and individual <code>Squares</code>.
 * 
 *
 */

public class MineField {

	private static Square[][] board;

	private final static double PERCENT_METHOD = 0.16;

	private int numberOfRows;

	/**
	 * Creates a <code>MineField</code> and randomly places mines in <code>Squares</code>.
	 * @param numRows number of rows we want the 2D array that will be created to have
	 */
	public MineField(int numRows) {

		numberOfRows = numRows;

		board = new Square[numRows][numRows];
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length; col++) {
				board[row][col] = new Square();
			}
		}

		for (int random = 0; random < (int) (numRows * numRows * PERCENT_METHOD);) {
			Square s = getSquareAt((int) (Math.random() * numRows),
					(int) (Math.random() * numRows));
			if (s.getIsMined() == false) {
				s.setIsMined(true);
				random++;
			}

		}
	}

	/**
	 * Returns the number of rows in the 2D array.
	 * @return number of rows 
	 */
	public int getNumRows() {
		return numberOfRows;
	}

	
	/**
	 * Returns the total number of <code>Square</code>s in the 2D array.
	 * @return the total number of <code>Square</code>s in the 2D array.
	 */
	public int getNumSquares() {
		return numberOfRows * numberOfRows;
	}

	/**
	 * Returns numberofRows multiplied by itself and multiplied by 16% 
	 * (which is equal to the number of mined <code>Square</code>s in the 2D array)
	 * @return total number of mined squares
	 */
	public int getNumMinedSquares() {
		return (int) (numberOfRows * numberOfRows * PERCENT_METHOD);
	}

	/**
	 * Returns the <code>Square</code> in the 2D array board at row y and column x
	 * @param y the row in the array
	 * @param x the column in the array
	 * @return the square at row y, column x in the 2D array
	 */
	public Square getSquareAt(int y, int x) {
		return board[y][x];
	}
	
	/**
	 * Returns the 2D array holding the <code>Square</code>s (our current "game board").
	 * @return the <code>Board</code>
	 */
	public Square[][] getBoard() {
		return board;
	}


	/**
	 * This inspect method "reveals" the <code>Square</code> it is called on to 
	 * show the number of mines in the squares adjacent to it, and if there
	 * aren't any, calls inspect on all of the adjacent squares
	 * 
	 * @param y the <code>Square</code>'s row
	 * @param x the <code>Square</code>'s column
	 */
	public void inspect(int y, int x) {
		int numMines = 0;

		if (board[y][x].getIsMined() || x < 0 || x > board.length - 1 || y < 0
				|| y > board.length - 1) {
			return;
		}

		if (!board[y][x].getIsRevealed() && !board[y][x].getIsFlagged()) {

			for (int row = y - 1; row <= y + 1; row++) {
				for (int col = x - 1; col <= x + 1; col++) {
					if (row < 0 || col < 0 || row > board.length - 1
							|| col > board.length - 1) {

					} else if (board[row][col].getIsMined()) {
						numMines++;
					}
				}
			}

			board[y][x].setNearMines(numMines);
			board[y][x].setIsRevealed(true);

			if (numMines == 0) {
				for (int row = y - 1; row <= y + 1; row++) {
					for (int col = x - 1; col <= x + 1; col++) {
						if (row < 0 || col < 0 || row > board.length - 1
								|| col > board.length - 1) {

						} else if (col == x && row == y) {

						} else {
							inspect(row, col);
						}
					}
				}
			}
		}
	}

}
