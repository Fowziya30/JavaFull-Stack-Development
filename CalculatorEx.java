package Calculator;

import java.util.Scanner;

public class CalculatorEx {
	
	
	 int num1,num2;
	 CalculatorEx(int a,int b)//a and b local var
	 {
		num1=a;
		num2=b;
	 }
		public static void main(String[] args) {
			int a,b;
			Scanner sc=new Scanner(System.in);
			System.out.println("Number1");
			a=sc.nextInt();
			
			System.out.println("Number2");
			b=sc.nextInt();
			
			CalculatorEx obj=new CalculatorEx(a,b);
			
			System.out.println("Enter a choice[+,-,*,/,%]:");
			String ch;
			ch=sc.next();
			char array[]=ch.toCharArray();
			switch(array[0])
			{
			case '+':
				System.out.println("Addition:"+(obj.num1+obj.num2));
				break;
			case '-':
				System.out.println("Substraction:"+(obj.num1-obj.num2));
				break;
			case '*':
				System.out.println("Multiplication:"+(obj.num1*obj.num2));
				break;
			case '/':
				System.out.println("Divition:"+(obj.num1/obj.num2));
				break;
			case '%':
				System.out.println("Remainder:"+(obj.num1%obj.num2));
				break;
				default:
					System.out.println("Invalid choice");
					break;
					
			}

	}

}
