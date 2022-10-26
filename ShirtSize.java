package Activity3;
import java.util.Scanner;

public class ShirtSize {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the shirt size");
		
		int shirtsize=sc.nextInt();
		if(shirtsize<38)
		{
			System.out.println("Small(s)");
		}
		else if(shirtsize>40)
		{
			System.out.println("Large(L)");

		}
		else if(shirtsize>43)
		{
			System.out.println("Medium(M)");

		}
		else if(shirtsize>46)
		{
			System.out.println("XL");

		}
		else if(shirtsize>=50)
		{
			System.out.println("XXL");

		}
	}

}
