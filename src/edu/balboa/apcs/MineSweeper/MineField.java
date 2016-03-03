package edu.balboa.apcs.MineSweeper;
import java.util.Random;
public class MineField {
	int[][] board;
	final static double PERCENT_METHOD = 0.16;
	
	int numRows = 0;
	int numCol = 0;
	
	Random genMine = new Random();
	
	//constructor that creates a board
	public void createBoard() {
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
	}
	
	public int getNumRows() {
		return numRows+ numCol;
	}
	
	public int getNumSquares() {
		return
	}
	
	public int getNumMinedSquares() {
		return
	}
	
	public int getSquareAt(int x, int y) {
		return
	}
}