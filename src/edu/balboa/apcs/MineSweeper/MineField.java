package edu.balboa.apcs.MineSweeper;
import java.util.Random;

public class MineField {
	
	//keeps track of the current game board
	private Square[][] board;
	
	//represents the percent of Squares being mined (16%)
	private final static double PERCENT_METHOD = 0.16;
	
	//keeps track of the number of rows/columns that the current game board has
	private int numberOfRows;
	
	//constructor that sets board and randomly places mines in Squares
	public MineField(int numRows) {
		
		numberOfRows = numRows;
		
		board = new Square[numRows][numRows];
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length; col++) {
				board[row][col] = new Square();
			}
		}
		
		for(int random = 0; random <= (int)(numRows*numRows*PERCENT_METHOD);) {
			Square s = getSquareAt((int)(Math.random() * numRows) , (int)(Math.random() * numRows)); 
			if(s.getIsMined() == false) {
				s.setIsMined(true);
				random++;
			}
		
		}
	}
	
	//accessor method for numberOfRows
	public int getNumRows() {
		return numberOfRows;
	}
	
	//returns the total number of Squares in game board
	public int getNumSquares() {
		return numberOfRows * numberOfRows;
	}
	
	public int getNumMinedSquares() {
		return (int)(numberOfRows*numberOfRows*PERCENT_METHOD);
	}
	
	public Square getSquareAt(int y, int x) {
		return board[y][x];
	}
	
	
	//inspect method
	public void inspect(int y, int x) {
		int numMines = 0;
		
		if (board[y][x].getIsMined() || x < 0 || x > board.length - 1 || y < 0 || y > board.length - 1) {
			return;
		}
		
		if (!board[y][x].getIsRevealed() && !board[y][x].getIsFlagged()) {
		
			for (int row = y-1; row <= y+1; row++) {
				for(int col = x-1; col <= x+1; col++) {
					if (row < 0 || col < 0 || row > board.length - 1 || col > board.length - 1) {
					
					} else if (board[row][col].getIsMined()) {
						numMines++;
					}
				}
			}
			
		
			board[y][x].setNearMines(numMines);
			board[y][x].setIsRevealed(true);
		
		
			if (numMines == 0) {
				for (int row = y-1; row <= y+1; row++) {
					for(int col = x-1; col <= x+1; col++) {
						if (row < 0 || col < 0 || row > board.length - 1 || col > board.length - 1 ) {
							
						}  else if (col == x && row == y) {
						
						} else {
							inspect(row, col);
						}
					}
				}
			}
		}
	}
	
}