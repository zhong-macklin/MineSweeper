package edu.balboa.apcs.MineSweeper;

public class Scoreboard {
	/*booleans # of wins & losses
	 * methodsadd win, add loss
	 * -control class :need variable to know all squars that have 
	 * no mines(if all clicked = win)
	 * square has mine & clicked = loss
	 * until game ends/quit
	 */
	
	private int wins = 0;
	private int losses = 0;
	
	public void addWins() {
			wins++;
			
	}
	public int getWins() {
		return wins;
		
	}
	public void addLosses() {
			losses++;
	}
	
	public int getLosses() {
		return losses;
	}
	
	public String toString() {
		return "Games won: " + wins + "\nGames lost: " + losses;
	}
}
