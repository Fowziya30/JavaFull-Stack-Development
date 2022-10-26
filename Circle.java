package activity2;
import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		//get input
		
		Scanner sc=new Scanner(System.in);
		{
			int radius;
			System.out.println("Enter radius:");
			radius=sc.nextInt();
			
		//Area of the circle=pi*r*r
			double area=3.14*radius*radius;
			
			//perimeter of the circle=2*pi*r
			
			double perimeter=2*3.14*radius;
			System.out.println("Area of circle="+area);
			System.out.println("Perimeter of the circle="+perimeter);
			
		}

	}

}
