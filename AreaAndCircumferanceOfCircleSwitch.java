package conttrolstatement;
import java.util.Scanner;
public class AreaAndCircumferanceOfCircleSwitch {

	public static void main(String[] args) {
	 float pie=3.14f;
	 float rad,Area,Circumferance;
	 int choice;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Main Menu:");
	 System.out.println("1.Area of the circle:");
	 System.out.println("2.Circumferance of the circle:");
	 System.out.println("3.Exit:");
	 System.out.println("Enter your choice[1-3]:");
		choice=sc.nextInt();
		System.out.println("Enter radius:");
		rad=sc.nextFloat();
		switch(choice)
		{
		case 1:
			Area=pie*rad*rad;
			System.out.println("Area of acircle:"+Area);
			break;
		case 2:
			Circumferance=2*pie*rad;
			System.out.println("Circumference of acircle:"+Circumferance);
			break;
		case 3:
			
			System.out.println("Exit:");
			break;
			default:
				System.out.println("Invalid choice:");
				break;
		}
		
		


	}

}
