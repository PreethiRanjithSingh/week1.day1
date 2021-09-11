package week1.day1;

public class primeNumber {
	/*
	 * Goal: To find whether a number is a Prime number or not
	 * 
	 * input: 13 output: 13 is a Prime Number
	 */

	public static void main(String[] args) {

		int input = 13;
		boolean prime = false;

		for (int i = 2; i < 13 / 2; i++) {
			int remainder = input % i;

			if (remainder == 0) {
				prime = true;
				break;
			}
		}

		if (prime == true) {
			System.out.println("The number " + input + " is Not Prime");
		} else {
			System.out.println("The number " + input + " is Prime");
		}
	}
}

