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
		

		desc = "set 8 mines surrounding empty square. Inspect() should change the amount of near mines to 8";
		try {
			MineField test = new MineField(5);
			for (int row = 0; row < 5; row++) {
				for (int col = 0; col < 5; col++) {
					test.getBoard()[row][col] = new Square();
					test.getBoard()[0][0].setIsMined(true);
					test.getBoard()[0][1].setIsMined(true);
					test.getBoard()[0][2].setIsMined(true);
					test.getBoard()[1][0].setIsMined(true);
					test.getBoard()[1][2].setIsMined(true);
					test.getBoard()[2][0].setIsMined(true);
					test.getBoard()[2][1].setIsMined(true);
					test.getBoard()[2][2].setIsMined(true);
					test.inspect(1, 1);
				}
			}
			if (test.getBoard()[1][1].getNearMines() == 8) {
				t.pass(desc);
			} else {
				t.fail(desc);
			}
		} catch (Exception e) { // some failure occurred
			t.fail(desc + " -- " + e);
		}
		// END TEST 7
	
		desc = "set 2 mines surrounding empty square. Inspect() should change the amount of near mines to 2";
		try {
			MineField test = new MineField(2);
			for (int row = 0; row < 2; row++) {
				for (int col = 0; col < 2; col++) {
					test.getBoard()[row][col] = new Square();

					test.getBoard()[0][1].setIsMined(true);
					test.getBoard()[1][0].setIsMined(true);
					test.inspect(1, 1);
				}
			}
			if (test.getBoard()[1][1].getNearMines() == 2) {
				t.pass(desc);
			} else {
				t.fail(desc);
			}
		} catch (Exception e) { // some failure occurred
			t.fail(desc + " -- " + e);
		}
		//END TEST 8
	}
}
