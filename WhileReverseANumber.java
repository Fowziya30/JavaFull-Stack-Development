package LoopsEX;
import java.util.Scanner;

public class WhileReverseANumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer:");
		int num=sc.nextInt();
		
		while(num!=0)
		{
			int r =num%10;//567%10=7,56%10=6,5%10=5
			System.out.println(r);
			num=num/10;//567/10=56,56/10=5
		}
	}

}
