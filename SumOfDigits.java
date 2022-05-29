package week1.day2;

public class SumOfDigits {

	public static void main(String[] args) {

		int input = 178;

		int sum =0;
		int rem;

		while(input>0) {

			rem = input%10;
			sum = sum + rem;
			input = input/10;
		}

		System.out.println("Sum of digits is: "+sum);

	}

}
