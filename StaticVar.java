package variable;

class Student
{
	//static variable
	public static double fees;
	public static String name="Fowziya";
	public static int percentage;
}
public class StaticVar {

	public static void main(String[] args) {
		//in this without object is running
		Student.fees=2000;
		//Student.name="Ziya";
		Student.percentage=98;
		System.out.println("Name:"+Student.name);
		System.out.println(Student.name+"Fees:"+Student.fees);
		System.out.println("Percentage:"+Student.percentage);
		

	}

}
