package edu.balboa.apcs.MineSweeper;

public class Square {

	private boolean isRevealed = false;

	private boolean isFlagged = false;

	private boolean isMined = false;

	private int nearMines;

	// ACCESSOR & MUTATOR METHODS
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

	public String toString() {
		if (getIsMined() == true && getIsRevealed()==true) {
			return "*";
		}
		else if (getIsFlagged() == true) {
			return "F";
		}
		else if (getIsRevealed() == true) {
			return "" + nearMines;
		}

		return " ";
	}
}
