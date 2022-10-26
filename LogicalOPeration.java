package activity1;

public class LogicalOPeration {

	public static void main(String[] args) {
		// Logical Operators
		int number1=10;
		int number2=20;
		int number3=30;
		boolean result;
		// Logical OR Operator
		result = (number1 > number2) || (number3 > number1);
		         //(10>20)||(30>10)
		         //false||true
		// result will be true because number3 greater than number1
		System.out.println(result);
		// Logical AND Operator
		result = (number1 > number2) && (number3 > number1);
		         //(10>20)&&(30>10)
		         //false&&True
		// result will be false because number1 is equal to number2
		System.out.println(result);

	}

}
