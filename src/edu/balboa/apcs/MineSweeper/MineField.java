package edu.balboa.apcs.MineSweeper;

import java.util.Random;

/**
 * Represents a MineField which counts the number of times a player has won or loss,
 * keeps track of the current game board, keeps track of the number of rows/columns
 * the current board has, and lastly holds a method with the percents of Squares
 * being mined. 
 * @author Vivian team P
 *
 */

public class MineField {
	// keeps track of times won, increment anytime this happens.
	private int Win;
	// keeps track of times lose, increment anytime this happens.
	private int Loss;

	// keeps track of the current game board
	private static Square[][] board;

	// represents the percent of Squares being mined (16%)
	private final static double PERCENT_METHOD = 0.16;

	// keeps track of the number of rows/columns that the current game board has
	private int numberOfRows;

	// constructor that sets board and randomly places mines in Squares
	/**
	 * Sets the board and randomly places mines in Squares.
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
	 * Returns the square the user points at in this <code>Board</code>
	 * @param y row
	 * @param x col
	 * @return the square at y,x
	 */
	public Square getSquareAt(int y, int x) {
		return board[y][x];
	}
	
	/**
	 * Returns the entire board.
	 * @return the <code>Board</code>
	 */
	public Square[][] getBoard() {
		return board;
	}

	
	/**
	 * This method is to check whether the player has won or not.
	 * @param board
	 * @return 1 if the player wins. 
	 */
	public int Win(Square[][] board) {
		int unMined = 0;
		for (int row = 0; row < board.length; row++)
			for (int col = 0; col < board[0].length; col++) {
				if (board[row][col].getIsMined()) {
					unMined++;
				}
			}
		if (unMined == (int) (numberOfRows * numberOfRows * PERCENT_METHOD)) {
			return 0;
		}
		return 1;

	}

	/**
	 * This inspect method recursively checks to see whether a mine is found,
	 * showing the number of adjaccent mines around the current square, and  
	 * recording a win if there are no more unmined squares left.
	 * @param y row
	 * @param x col
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
