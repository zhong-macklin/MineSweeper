package edu.balboa.apcs.MineSweeper;
public class Square {
	
	private boolean isRevealed;
	
	private boolean isFlagged;
	
	private boolean isMined;
	
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