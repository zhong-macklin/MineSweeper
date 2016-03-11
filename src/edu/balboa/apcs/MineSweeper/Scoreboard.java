package edu.balboa.apcs.MineSweeper;

public class Scoreboard {
	
	
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
