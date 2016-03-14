package edu.balboa.apcs.MineSweeper;

import java.util.Random;

/**
 * Represents a MineField which
 * keeps track of the current game board, keeps track of the number of rows/columns
 * the current board has, and lastly holds a method with the percents of Squares
 * being mined. 
 * @author Vivian team P
 *
 */

public class MineField {

	private static Square[][] board;

	private final static double PERCENT_METHOD = 0.16;

	private int numberOfRows;

	/**
	 * Creates a MineField and randomly places mines in Squares.
	 * @param numRows number of rows present in this <code>MineField</code>
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
	 * Returns the number of rows in game <code>Board</code>.
	 * @return number of rows 
	 */
	public int getNumRows() {
		return numberOfRows;
	}

	
	/**
	 * Returns the total number of Squares in game <code>Board</code>.
	 * @return the total number of Squares in game <code>Board</code>.
	 */
	public int getNumSquares() {
		return numberOfRows * numberOfRows;
	}

	/**
	 * Returns numberofRows multiplied by itself and multiplied by 16% in <code>Board</code>
	 * @return total number of mined squares
	 */
	public int getNumMinedSquares() {
		return (int) (numberOfRows * numberOfRows * PERCENT_METHOD);
	}

	/**
	 * Returns the Square in the 2D array board at row y and column x
	 * @param y the row in the array
	 * @param x the column in the array
	 * @return the square at y,x
	 */
	public Square getSquareAt(int y, int x) {
		return board[y][x];
	}
	
	/**
	 * Returns the 2D array holding the Squares (our current "game board").
	 * @return the <code>Board</code>
	 */
	public Square[][] getBoard() {
		return board;
	}


	/**
	 * This inspect method "reveals" the Square it is called on to 
	 * show the number of mines in the squares adjacent to it, and if there
	 * aren't any, calls inspect on all of the adjacent squares
	 * 
	 * @param y the Square's row
	 * @param x the Square's column
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
