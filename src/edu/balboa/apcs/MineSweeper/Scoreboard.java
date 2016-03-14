package edu.balboa.apcs.MineSweeper;


/**
 * Represents a scoreboard that keeps track of the player's
 * wins and losses.
 * @author Vivian team P
 *
 */
public class Scoreboard {
	
	
	private int wins = 0;
	private int losses = 0;
	
	/**
	 * If the user wins then the amount of wins will increase by one.
	 */
	
	public void addWins() {
			wins++;
			
	}
	
	/**
	 * Returns the number of wins the player has won.
	 * @return number of wins
	 */
	public int getWins() {
		return wins;
		
	}
	
	/**
	 * If the user losses, then the amount of losses
	 * will increase by one.
	 */
	public void addLosses() {
		losses++;
	}
		
	
	/**
	 * Returns the number of losses the player has lost.
	 * @return number of losses
	 */
	public int getLosses() {
		return losses;
	}
	
	/**
	 * This toString method prints out the total number
	 * of games won and the total number of games lost. 
	 */
	public String toString() {
		return "Games won: " + wins + "\nGames lost: " + losses;
	 }
	
}
