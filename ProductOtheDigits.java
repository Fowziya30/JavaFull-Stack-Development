package Activity4;

import java.util.Scanner;

public class ProductOtheDigits {

	public static void main(String[] args) {
		int number, digit, prod = 1;  
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number: ");  
		number = sc.nextInt();  
		while(number >= 1)  
		{  
		//finds the last digit of the given number    
		digit = number % 10;  
		//adds last digit to the variable sum  
		prod = prod * digit;  
		//removes the last digit from the number  
		number = number / 10;  
		}  
		//prints the result  
		System.out.println("product of Digits: "+prod);

	}

}
