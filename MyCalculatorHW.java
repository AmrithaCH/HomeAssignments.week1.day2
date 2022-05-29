package week1.day2;

public class MyCalculatorHW {

	public static void main(String[] args) {
		System.out.println("Inside MyCalculatorHW class");	
		
	CalculatorHW obj = new CalculatorHW();
	System.out.println("Addition "+obj.add(1, 2, 4));
	System.out.println("Subtraction "+obj.sub(9, 11));
	System.out.println("Multiplication "+obj.mul(4.3, 6));
	System.out.println("Division "+obj.div(9, 3));

	}

}
