package week1.day2;

public class ArmstrongNumber {

	public static void main (String[] Args)
	{
		int input = 1634;
		int rem;
		int sum =0;
		//		int loop = 0;
		int input1 = input;

		//	while(input1>0) {
		//
		//		input1 = input1/10;
		//		loop = loop+1;
		//	}

		while(input>0) {

			rem = input%10;
			sum = sum + rem*rem*rem*rem;
			input = input/10;
		}

		System.out.println(sum);
		if (sum == input1)
		{System.out.println(sum+" is an Armstrong number");}
		else
		{System.out.println(sum+" is not an Armstrong number");}
	}

}
