package week1.day2;
public class Calculator {

	public int add(int add1, int add2)
	{int addition = add1+add2;
	return addition;}
	
	public double sub(double sub1, double sub2)
	{double subtraction = sub1 - sub2;
	return subtraction;}
	
	public double mul(double mul1, double mul2)
	{double multiplication = mul1*mul2;
	return multiplication;}
	
	public void div(int div1, int div2)
	{if(div2 > 0)
	{int division = div1/div2;
	System.out.println(division);
	}
	else 
	{System.out.println("Not eligible for division");}		
	}
	
	public static void main(String[] args) {
		Calculator calculatorObj = new Calculator();
		System.out.println(calculatorObj.add(5, 6));
		System.out.println(calculatorObj.sub(9.86, 7.23));
		System.out.println(calculatorObj.mul(3.454, 8.123));
		calculatorObj.div(9, 0);

	}

}
