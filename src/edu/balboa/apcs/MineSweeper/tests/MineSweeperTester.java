package edu.balboa.apcs.MineSweeper.tests;

/**
 * This class is the test driver for MineSweeper.  When this class is run, 
 * all other classes' tests will be triggered. 
 *
 * @author mferraro
 */
public class MineSweeperTester {
	
	//keep track of test #
	private int testNum = 1;

	public void fail(String description) {
		System.out.println("(" + testNum + ")\tTEST FAILURE: " + description);
		testNum++;
	}

	public void pass(String description) {
		System.out.println("(" + testNum + ")\tTest Passed: " + description);
		testNum++;
	}

	public static void main(String[] args) {
		MineSweeperTester t = new MineSweeperTester();
		
		//SampleSquareTester included as an example -- modify as needed!
		SampleSquareTester.runTests(t);

	}


}
