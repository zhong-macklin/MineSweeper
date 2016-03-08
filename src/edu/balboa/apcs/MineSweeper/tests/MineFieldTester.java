
package edu.balboa.apcs.MineSweeper.tests;

import edu.balboa.apcs.MineSweeper.*;

/**
 * This class tests the Square class' methods. 1
 * 
 * @author mferraro
 */
public class MineFieldTester {

	public static void runTests(MineSweeperTester t) {

		String desc; // description of current test

		desc = "total squares in 8x8 should be 64";
		try {
			MineField b1 = new MineField(8);
		
			if (b1.getNumSquares() == 64) {
				t.pass(desc);
			} else {
				t.fail(desc);
			}
		} catch (Exception e) { // some failure occurred
			t.fail(desc + " -- " + e);
		}
		// END TEST 1

		desc = "total squares in 12x12 should be 144";
		try {
			MineField b1 = new MineField(12);
			if (b1.getNumSquares() == 144) {
				t.pass(desc);
			} else {
				t.fail(desc);
			}
		} catch (Exception e) { // some failure occurred
			t.fail(desc + " -- " + e);
		}
		// END TEST 2
		
		desc = "total squares in 15x15 should be 225";
		try {
			MineField b1 = new MineField(15);
			if (b1.getNumSquares() == 225) {
				t.pass(desc);
			} else {
				t.fail(desc);
			}
		} catch (Exception e) { // some failure occurred
			t.fail(desc + " -- " + e);
		}
		// END TEST 3
		
		desc = "total mines in 8x8 should be 10";
		try {
			MineField b1 = new MineField(8);
		
			if (b1.getNumMinedSquares() == 10) {
				t.pass(desc);
			} else {
				t.fail(desc);
			}
		} catch (Exception e) { // some failure occurred
			t.fail(desc + " -- " + e);
		}
		// END TEST 4

		desc = "total mines in 12x12 should be 23";
		try {
			MineField b1 = new MineField(12);
			if (b1.getNumMinedSquares() == 23) {
				t.pass(desc);
			} else {
				t.fail(desc);
			}
		} catch (Exception e) { // some failure occurred
			t.fail(desc + " -- " + e);
		}
		// END TEST 5
		
		desc = "total mines in 15x15 should be 36";
		try {
			MineField b1 = new MineField(15);
			if (b1.getNumMinedSquares() == 36) {
				t.pass(desc);
			} else {
				t.fail(desc);
			}
		} catch (Exception e) { // some failure occurred
			t.fail(desc + " -- " + e);
		}
		// END TEST 6
		

	
	}

}
