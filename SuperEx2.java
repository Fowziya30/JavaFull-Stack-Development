package constructor;
class School
{
	School()
	{
		System.out.println("Kingston matriculation Higher Secondary School");
	}
}
class Student3 extends School
{
	Student3()
	{
		super();//parent variable or method
		System.out.println("The student name is Fowziya");
	}
}
public class SuperEx2 {

	public static void main(String[] args) {
		Student3 std=new Student3();

	}

}
