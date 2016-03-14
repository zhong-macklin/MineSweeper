package edu.balboa.apcs.MineSweeper;

/**
 * This class represents a Square checking to see if 
 * the <code>Square</code> has been revealed,
 * if it has been flagged, if it has a mine, 
 * or just to check for any mines near it. 
 * @author Vivian
 *
 */

public class Square {

	private boolean isRevealed = false;

	private boolean isFlagged = false;

	private boolean isMined = false;

	private int nearMines;

	// ACCESSOR & MUTATOR METHODS
	
	/**
	 * Sets whether or not the square has been revealed to the player. 
	 * No preconditions.
	 * 
	 * @param r isRevealed is set to equal whatever r is.
	 */
	public void setIsRevealed(boolean r) {
		isRevealed = r;
	}

	/**
	 * Returns a true or false statement if the <code>Square</code> has been revealed 
	 * @return  true or false statement.
	 */
	public boolean getIsRevealed() {
		return isRevealed;
	}

	/**
	 * Sets whethere the user flags this <code>Square</code>.
	 * @param f value is stored in isFlagged.
	 */
	public void setIsFlagged(boolean f) {
		isFlagged = f;
	}

	/**
	 * Returns a true of false statement, whether the user placed a flag 
	 * in this <code>Square</code> or not.
	 * @return true or false statement.
	 */
	public boolean getIsFlagged() {
		return isFlagged;
	}

	
	/**
	 * Sets whether there is a mine in this square.
	 * No precondition
	 * 
	 * @param p stored into isMined
	 */
	public void setIsMined(boolean p) {
		isMined = p;
	}

	
	/**
	 * Returns a true or false statement, whether this <code>Square</code> has a mine or not
	 * 
	 * @return true or false statement.
	 */
	public boolean getIsMined() {
		return isMined;
	}

	
	/**
	 * Sets the number of mines around this <code>Square</code> 
	 * @param n number of mines 
	 */
	public void setNearMines(int n) {
		nearMines = n;
	}

	
	/**
	 * Returns the number of mines around this <code>Square</code>.
	 * @return number of mines 
	 */
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
