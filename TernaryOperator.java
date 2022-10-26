package activity1;
import java.util.Scanner;
public class TernaryOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		//ternary operation
		String result=(num%2==0)?"Even":"Odd";
		System.out.println("The number is"+result+"Number");
		
		

	}

}
