package week1.day1;

public class fibo {

	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
	 */

	public static void main(String[] args) {
		int range = 8;
		int firstNum = 0;
		int secNum = 1;
		int sum;

		System.out.println("The Fibonacci Series for Range = " + range + " is :");

		// Print First Number
		System.out.println(firstNum);

		// Print Fibonacci Series for the Range
		for (int i = 1; i < 8; i++) {
			sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
			System.out.println(firstNum);

		}
	}
}
