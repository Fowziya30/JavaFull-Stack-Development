package activity2;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		{
			int Breath;
			int length;
			
			System.out.println("Enter Breath of the rectangle:");
			Breath=sc.nextInt();
			System.out.println("Enter length of the rectangle:");
			
			length=sc.nextInt();
			int area=Breath*length;
			int perimeter=2*length+2*Breath;
			System.out.println("Area of Rectangle="+area);
			System.out.println("Perimeter of the Rectangle="+perimeter);
			
		}


	}

}
