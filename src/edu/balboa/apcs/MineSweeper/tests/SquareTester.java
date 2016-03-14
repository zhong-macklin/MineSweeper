

package edu.balboa.apcs.MineSweeper.tests;
import edu.balboa.apcs.MineSweeper.*;
/**
 * This class tests the Square class' methods.
 * 1
 * @author mferraro
 */
public class SquareTester {

	public static void runTests(MineSweeperTester t) {

		String desc; //description of current test

		///////////////////////////////////////////////////////////////////////
		// TEST 1:  default square should not have a mine
		///////////////////////////////////////////////////////////////////////
		desc = "default square has no mine";
		try {
			Square s1 = new Square();
			if ( s1.getIsRevealed() == false ) {
				t.pass( desc );
			} else {	
				t.fail( desc );
			}
		} catch ( Exception e ) { //some failure occurred
			t.fail(desc + " -- " + e);
		}
		// END TEST 1 
		
		
		desc = "default square is not flagged";
		try {
			Square s1 = new Square();
			if ( s1.getIsFlagged() == false ) {
				t.pass( desc );
			} else {	
				t.fail( desc );
			}
		} catch ( Exception e ) { //some failure occurred
			t.fail(desc + " -- " + e);
		}
		// END TEST 2
		

		desc = "default square is not mined";
		try {
			Square s1 = new Square();
			if ( s1.getIsMined() == false ) {
				t.pass( desc );
			} else {	
				t.fail( desc );
			}
		} catch ( Exception e ) { //some failure occurred
			t.fail(desc + " -- " + e);
		}
		// END TEST 3 
		
		
		desc = "state changes if square is revealed";
		try {
			Square s1 = new Square();
			s1.setIsRevealed(true);
			if ( s1.getIsRevealed() ) {
				t.pass( desc );
			} else {	
				t.fail( desc );
			}
		} catch ( Exception e ) { //some failure occurred
			t.fail(desc + " -- " + e);
		}
		// END TEST 4
		

		desc = "state changes if square is flagged";
		try {
			Square s1 = new Square();
			s1.setIsFlagged(true);
			if ( s1.getIsFlagged() ) {
				t.pass( desc );
			} else {	
				t.fail( desc );
			}
		} catch ( Exception e ) { //some failure occurred
			t.fail(desc + " -- " + e);
		}
		// END TEST 5
		
		
		desc = "state changes if square is mined";
		try {
			Square s1 = new Square();
			s1.setIsMined(true);
			if ( s1.getIsMined() ) {
				t.pass( desc );
			} else {	
				t.fail( desc );
			}
		} catch ( Exception e ) { //some failure occurred
			t.fail(desc + " -- " + e);
		}
		// END TEST 6
		
				desc = "hidden square should return a space";
		try {
			Square s1 = new Square();
			s1.setIsRevealed(false);
			if ( s1.toString().equals(" ") ) {
				t.pass( desc );
			} else {	
				t.fail( desc );
			}
		} catch ( Exception e ) { //some failure occurred
			t.fail(desc + " -- " + e);
		}
		// END TEST 7
		
		
		desc = "flagged square should return F";
		try {
			Square s1 = new Square();
			s1.setIsFlagged(true);
			if ( s1.toString().equals("F") ) {
				t.pass( desc );
			} else {	
				t.fail( desc );
			}
		} catch ( Exception e ) { //some failure occurred
			t.fail(desc + " -- " + e);
		}
		// END TEST 8

		desc = "an unhidden square should return the number of surrounding mines";
		try {
			Square s1 = new Square();
			s1.setNearMines(5);
			s1.setIsRevealed(true);
			if ( s1.toString().equals("5") ) {
				t.pass( desc );
			} else {	
				t.fail( desc );
			}
		} catch ( Exception e ) { //some failure occurred
			t.fail(desc + " -- " + e);
		}
		//END TEST 9
		
		desc = "a revealed mined square should return *";
		try {
			Square s1 = new Square();
			s1.setIsMined(true);
			s1.setIsRevealed(true);
			if ( s1.toString().equals("*") ) {
				t.pass( desc );
			} else {	
				t.fail( desc );
			}
		} catch ( Exception e ) { //some failure occurred
			t.fail(desc + " -- " + e);
		}
		//END TEST 10
	}

}
