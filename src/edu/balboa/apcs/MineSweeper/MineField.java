package edu.balboa.apcs.MineSweeper;
import java.util.Random;

public class MineField {
	Square[][] board;
	final static double PERCENT_METHOD = 0.16;
	int numberOfRows;
	
	//constructor that creates a board
	/*public void createBoard() {
		for(int row =0;row<board.length; row++ ) {
			for(int col = 0; col<board.length-1; col++) {
				numRows += row;
				numCol += col;
				if(board[row][col]%4==0 ) {
					System.out.println("+");
				} else {
					System.out.println("-");
				}
						
			}
		}
		
		char mine = '*';		
		for(int mines = 0; mines<board.length; mines++) {
			
		}	
	}*/
	
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
	
	public int getNumRows() {
		return numberOfRows;
	}
	
	public int getNumSquares() {
		return numberOfRows * numberOfRows;
	}
	
	public int getNumMinedSquares() {
		return (int)(numberOfRows*numberOfRows*PERCENT_METHOD);
	}
	
	public Square getSquareAt(int x, int y) {
		return board[x][y];
	}
	
	//inspect method
	public void inspect(int x, int y) {
		if (board[x][y].getIsMined()) {
			
		}
	}
	
}