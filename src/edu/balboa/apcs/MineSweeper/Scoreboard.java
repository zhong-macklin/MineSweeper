package edu.balboa.apcs.MineSweeper;

public class Scoreboard {
	
	
	private int wins = 0;
	private int losses = 0;
	
<<<<<<< HEAD
	public void addWIns() {
			wins++;
			
		
=======
	public void addWins() {
			wins++;
			
>>>>>>> bb738509635c469dffdcdf7fa1b209db8b081de8
	}
	public int getWins() {
		return wins;
		
	}
	public void addLosses() {
			losses++;
<<<<<<< HEAD
		
	}	
	public int getLosses() {
		return losses;
			
	}
	
<<<<<<< HEAD
	public toString() {
=======
	public void toStiring() {
		
>>>>>>> 91bb44a25ed80a28df69c68f3b420d730c1a6143
		
=======
	}
	
	public int getLosses() {
		return losses;
	}
	
	public String toString() {
		return "Games won: " + wins + "\nGames lost: " + losses;
>>>>>>> bb738509635c469dffdcdf7fa1b209db8b081de8
	}
}
