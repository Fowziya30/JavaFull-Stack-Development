package activity2;

import java.util.Scanner; 

public class AreaAndPerimeterOfCircle {
	public static void main(String[] args) {
		

	int radius;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the radius");
			radius=sc.nextInt();
			
			
		double area=3.14*radius*radius;
		//area=sc.nextDouble();
		double perimeter=2*3.14*radius;
		//area=sc.nextDouble();
		System.out.println("radius="+radius);
		System.out.println("Area of circle:" +area);
		System.out.println("Perimeter of the circle:" +perimeter);
}
		
		
		
		
		
	}


