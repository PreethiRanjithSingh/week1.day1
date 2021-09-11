package week1.day1;

public class factorial {

	/*
	 * Goal: Find the Factorial of a given number
	 * 
	 * input: 5 output: 5*4*3*2*1 = 120
	 */

	public static void main(String[] args) {
		int input = 5;
		int fact = 1;

		for (int i = 1; i <= 5; i++) {
			fact = fact * i;
		}

		System.out.println("The Factorial of Number " + input + " is " + fact);

	}

}

