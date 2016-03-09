package edu.balboa.apcs.MineSweeper;
public class Square {
	
	//keeps track of whether the Square has been revealed
	private boolean isRevealed = false;
	
	//keeps track of whether the Square has been flagged
	private boolean isFlagged = false;
	
	//keeps track of whether or not the Square has a mine
	private boolean isMined = false;
	
	//keeps track of the number of mines in the Squares around this Square
	private int nearMines;
	
	
	//ACCESSOR & MUTATOR METHODS
	public void setIsRevealed(boolean r) {
		isRevealed = r;
	}
	
	public boolean getIsRevealed() {
		return isRevealed;
	}
	
	public void setIsFlagged(boolean f) {
		isFlagged = f;
	}
	
	public boolean getIsFlagged() {
		return isFlagged;
	}
	
	public void setIsMined(boolean p) {
		isMined = p;
	}
	
	public boolean getIsMined() {
		return isMined;
	}
	
	public void setNearMines(int n) {
		nearMines = n;
	}
	
	public int getNearMines() {
		return nearMines;
	}
}