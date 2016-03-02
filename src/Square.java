public class Square {
	
	private boolean isRevealed;
	
	private boolean isFlagged;
	
	private boolean isMined;
	
	private int nearMines;
	
	
	//ACCESSOR METHODS
	public boolean getIsRevealed() {
		return isRevealed;
	}
	
	public boolean getIsFlagged() {
		return isFlagged;
	}
	
	public boolean getIsMined() {
		return isMined;
	}
	
	public int getNearMines() {
		return nearMines;
	}
}