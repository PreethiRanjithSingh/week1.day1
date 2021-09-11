package week1.day1;

public class convertNegToPos {
	// To convert a Negative Number to a Positive Number and print it

		public static void main(String[] args) {
			int number = -27;
			int posNum;
			if (number < 0) // To check if the number is a Negative Number i.e. less than 0
			{
				posNum = -(number); // To convert Negative Number to Positive Number
				System.out.println("The Negative Number " + number + " is converted to Positive Number " + posNum);
			} else {
				System.out.println("The Number " + number + " is already Positive");
			}
		}

}
