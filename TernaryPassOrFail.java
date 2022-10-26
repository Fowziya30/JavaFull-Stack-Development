package activity1;

import java.util.Scanner;

public class TernaryPassOrFail {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mark:");
		int mark=sc.nextInt();
		//ternary operation
		String result=(mark>40)?"Pass":"Fail";
		System.out.println("you are"+result+"in the Exam");


	}

}
